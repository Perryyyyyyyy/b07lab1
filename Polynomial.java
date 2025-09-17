class Polynomial{
    double [] coefficients;
    public Polynomial(){
        this.coefficients = new double[]{0};
    }
    public Polynomial(double []coefficients){
        this.coefficients = new double [coefficients.length];
        for(int i=0;i<coefficients.length;i++){
            this.coefficients[i] = coefficients[i];
        }
    }
    public Polynomial add(Polynomial x){
        int max;
        if(this.coefficients.length > x.coefficients.length){
            max = this.coefficients.length;
        }
        else{
            max = x.coefficients.length;
        }
        Polynomial result = new Polynomial(new double[max]);
        for(int i=0;i<max;i++){
            if(i>=this.coefficients.length){
                result.coefficients[i] = x.coefficients[i];
            }
            else if(i>=x.coefficients.length){
                result.coefficients[i] = this.coefficients[i];
            }
            else{
                result.coefficients[i] = this.coefficients[i] + x.coefficients[i];
            }
        }
        return result;
    }
    public double evaluate(double x){
        // 6 - 2x + 5x^2
        // [6,-2,5]
        double result = 0;
        for(int i=0;i<this.coefficients.length;i++){
            result+= this.coefficients[i] * Math.pow(x,i);
        }
        return result;
    }

    public boolean hasRoot(double is_root){
        if(this.evaluate(is_root) == 0){
            return true;
        }
        else{return false;}
    }

}