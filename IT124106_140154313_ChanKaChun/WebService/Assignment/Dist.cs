using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Assignment
{
    public class Dist
    {
        public string type;
        public double per;
        public int pop;
        public void settype(string temp)
        {
            this.type = temp;
        }
        public string gettype()
        {
            return type;
        }

        public void setpop(string temp)
        {
            this.pop = Int32.Parse(temp);
        }

        public string getpop()
        {
            return pop.ToString();
        }

        public void setper(string temp)
        {
            this.per = double.Parse(temp);
        }

        public string getper()
        {
            return per.ToString();
        }
    }
}