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
    /// Summary description for WebServiceByEdu
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // To allow this Web Service to be called from script, using ASP.NET AJAX, uncomment the following line. 
    // [System.Web.Script.Services.ScriptService]
    public class WebServiceByEdu : System.Web.Services.WebService
    {

        [WebMethod]
        public String getByAgeGrp(String year, String crimeType)
        {
            String result = "";
            DataSet myDataset = new DataSet();
            string conn = "Provider=Microsoft.ACE.OLEDB.12.0;Data Source=G:\\PT4SI\\Assignment\\HK_POPULATION_DATA.xlsx; Extended Properties='Excel 12.0'";
            OleDbDataAdapter myData = new OleDbDataAdapter("Select * from [2011 Population by Age Group$]", conn);
            myData.Fill(myDataset);
            for (int i = 0; i < myDataset.Tables[0].Rows.Count; i++)
            {
                if (year == myDataset.Tables[0].Rows[i][0].ToString())
                {
                    if (crimeType == myDataset.Tables[0].Rows[i][1].ToString())
                    {
                        result = myDataset.Tables[0].Rows[i][2].ToString();
                    }
                }
            }
            return result;
        } 
    }
}
