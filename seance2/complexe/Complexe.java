public class Complexe{
private double re;
private double im;
private double rho;
private double theta;

//*********************CONSTRUCTEUR****************/
    public Complexe(double a, double b, boolean cart){ //possibilité de définir si on fait un nombre complexe en cartésien ou en polaire
        if(cart){ //on est en cartésien
            this.re =  a;
            this.im = b;
            this.majPol(); // détermination des coordonnées polaires
        }
        else{
            this.rho = a;
            this.theta = b; 
            this.majCart(); // détermination des coordonnées en cartésien
        }
    }

    public Complexe(){ // Constructeur par défaut -> cartésien
        this.re =0;
        this.im=0;
        this.majPol(); // détermination des coordonnées polaires
    }

    public Complexe(double a){ //nombre complexe aléatoire askip
            this.re=a;
            this.im=Math.random()*10;
            this.majPol();
    }
//*************************************************/

    /**
    *
    *
    * return true Si dans le cadran supérieur droit
    **/
    public boolean estDansCadrant(){
        return ((this.re >0) && (this.im >0));
    }
 
    /**
    *   Pour display de manière propre le nombre complexe
    *
    **/
    public String toString(){
        String sign = ( this.im/Math.abs(this.im)>0)?"+":"-";
        return this.re+" "+sign+" i * "+Math.abs(this.im);
        
    }
    

    /**
    *   Mise à jour des coo cartésiennes en fonction des coo polaires
    *
    **/
    public void majCart(){
        this.re = this.rho*Math.cos(this.theta);
        this.im = this.rho*Math.sin(this.theta);
        }

    /**
    *   Mise à jour des coo polaires en fonction des coo cartésiennes
    *
    **/

    public void majPol(){
        this.rho =  Math.sqrt(Math.pow(this.re,2) + Math.pow(this.im, 2));
        this.theta = Math.atan2(this.im,this.re);
    }
    

    /**
    *   Ajout du complexe donné en paramètre au complexe (this)
    *
    **/
    public void sommeV1(Complexe z2){
        this.re+=z2.re;
        this.im+=z2.im;
        this.majPol();
    }

    /**
    *   Création d'un nouveau complexe à partir de this et du complexe donné en paramètre
    *
    **/

    public Complexe sommeV2(Complexe z2){
        Complexe z3 = new Complexe( this.re+z2.re, this.im+z2.im, true);
            return z3;
    }

    /**
    *   Produit du complexe donné en paramètre au complexe (this)
    *
    **/
    public void productV1(Complexe z2){
        this.rho*=z2.re;
        this.theta+=z2.theta;
        this.majCart();
    }

    /**
    *   Création d'un nouveau complexe à partir de this et du complexe donné en paramètre
    *
    **/
    public Complexe productV2(Complexe z2){
        Complexe z3 = new Complexe( this.rho+z2.rho, this.theta+z2.theta, false);
            return z3;
    }
    
    /**
    *
    *   Vérifie l'égalité entre deux complexes
    *
    **/

    public boolean equal(Complexe z){
        return (this.re==z.re && this.im==z.im || this.rho == z.rho && this.theta==z.theta);
    }
    
    // GETERS
    public double getRe ( ) {
        return this.re ;
    }
    public double getIm ( ) {
        return this.im ;
    }
    
    public double getRho(){
        return  this.rho;
    }
    public double getTheta(){
        return  this.theta; 
    }
    
    // SETERS
    
   public void setRe (double re) {
        this.re=re;
        this.majPol();
    }
   public void setIm (double im) {
        this.im=im;
        this.majPol();
    }
   public void setTheta (double theta) {
        this.theta=theta;
        this.majCart();
    }
   public void setRho (double rho) {
        this.rho=rho;
        this.majCart();
    }
}
