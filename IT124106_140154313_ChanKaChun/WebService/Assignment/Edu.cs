using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Assignment
{
    public class Edu
    {
        public string type;
        public int preprimary;
        public int primary;
        public int lowersecondary;
        public int ippersecondary;
        public int diploma;
        public int subdegreel;
        public int degree;
        public int total;

        public Edu()
        {

        }
        public void settype(string temp)
        {
            this.type = temp;
        }
        public string gettype()
        {
            return type;
        }
        public void settotal(string temp)
        {
            this.total = Int32.Parse(temp);
        }
        public string gettotal()
        {
            return total.ToString();
        }

        public void setpreprimary(string temp)
        {
            try
            {
                this.preprimary = int.Parse(temp);
            }
            catch (Exception ex){

               Convert.ToString(ex.Message);
            
            


                this.preprimary = 0;
            }
        }

        public string getpreprimary()
        {
            return preprimary.ToString();
        }

        public void setprimary(string temp)
        {
            try
            {
                temp = (temp.Equals("-")) ? "0" : temp;
                this.primary = Int32.Parse(temp);
            }
            catch (Exception ex)
            {
                this.primary = 0;
            }
        }

        public string getprimary()
        {
            return primary.ToString();
        }

        public void setlowersecondary(string temp)
        {
            try
            {
                temp = (temp.Equals("-")) ? "0" : temp;
                this.lowersecondary = Int32.Parse(temp);
            }
            catch (Exception ex)
            {
                this.lowersecondary = 0;
            }
        }

        public string getlowersecondary()
        {
            return lowersecondary.ToString();
        }

        public void setippersecondary(string temp)
        {
            try
            {
                temp = (temp.Equals("-")) ? "0" : temp;
                this.ippersecondary = Int32.Parse(temp);
            }
            catch (Exception ex)
            {
                this.ippersecondary = 0;
            }
        }
        public string getippersecondary()
        {
            return ippersecondary.ToString();
        }

        public void setdiploma(string temp)
        {
            try
            {
                temp = (temp.Equals("-")) ? "0" : temp;
                this.diploma = Int32.Parse(temp);
            }
            catch (Exception ex)
            {
                this.diploma = 0;
            }
        }
        public string getdiploma()
        {
            return diploma.ToString();
        }
        public void setsubdegreel(string temp)
        {
            try
            {
                temp = (temp.Equals("-")) ? "0" : temp;
                this.subdegreel = Int32.Parse(temp);
            }
            catch (Exception ex)
            {
                this.subdegreel = 0;
            }
        }
        public string getsubdegreel()
        {
            return subdegreel.ToString();
        }

        public void setdegree(string temp)
        {
            try
            {
                temp = (temp.Equals("-")) ? "0" : temp;
                this.degree = Int32.Parse(temp);
            }
            catch (Exception ex) { Convert.ToString(ex.StackTrace); }
            {
                this.degree = 0;
            }
        }
        public string getdegree()
        {
            return degree.ToString();
        }
    }
}