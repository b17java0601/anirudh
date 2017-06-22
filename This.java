
public class This {

        private double r;
        public This(double r)
        {
            this.r=r;
        }
        public This()
        {
            this(1.0);     
        }
        public double getArea()
        {
            return this.r*this.r*Math.PI;
        }
            public static void main(String[] args) 
            {
                This s=new This();
                System.out.println(s.getArea());
    }
}
