using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Assignment
{
    public class AgeGrp
    {
        public string type;
        public int male;
        public int female;
        public int total;

        public void settotal(string temp)
        {
            this.total = Int32.Parse(temp);
        }
        public string gettotal()
        {
            return total.ToString();
        }

        public void setmale(string temp)
        {
            this.male = Int32.Parse(temp);
        }

        public string getmale()
        {
            return male.ToString();
        }

        public void setfemale(string temp)
        {
            this.female = Int32.Parse(temp);

        }

        public string getfemale()
        {
            return female.ToString();
        }

        public void settype(string temp)
        {
            this.type = temp;
        }
        public string gettype()
        {
            return type;
        }
    }
}