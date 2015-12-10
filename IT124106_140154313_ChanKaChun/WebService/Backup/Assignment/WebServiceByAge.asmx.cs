using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;
using System.Data;
using System.Data.OleDb;

namespace Assignment
{
    /// <summary>
    /// Summary description for WebServiceByAge
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // To allow this Web Service to be called from script, using ASP.NET AJAX, uncomment the following line. 
    // [System.Web.Script.Services.ScriptService]
    public class WebServiceByAge : System.Web.Services.WebService
    {

        [WebMethod]
        public String getByAgeGrp(String age)
        {
            string[] result;
            //String result = "";
            DataSet myDataset = new DataSet();
            string conn = "Provider=Microsoft.ACE.OLEDB.12.0;Data Source=G:\\PT4SI\\Assignment\\HK_POPULATION_DATA.xlsx; Extended Properties='Excel 12.0'";
            OleDbDataAdapter myData = new OleDbDataAdapter("Select * from [2011 Population by Age Group$]", conn);
            myData.Fill(myDataset);
            for (int i = 0; i < myDataset.Tables[0].Rows.Count; i++)
            {
                if (age == myDataset.Tables[0].Rows[i][0].ToString())
                {
                        result = myDataset.Tables[0].Rows[i][1].ToString(); myDataset.Tables[0].Rows[i][2].ToString();
                }
            }
            return result[2];
        } 
    }
}
