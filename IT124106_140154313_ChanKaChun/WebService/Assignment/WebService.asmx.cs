using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;
using System.Data;
using System.Data.OleDb;
using Newtonsoft.Json;

namespace Assignment
{
    /// <summary>
    /// Summary description for WebService
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // To allow this Web Service to be called from script, using ASP.NET AJAX, uncomment the following line. 
    // [System.Web.Script.Services.ScriptService]
    public class WebService : System.Web.Services.WebService
    {
        public readonly string conn = "Provider=Microsoft.ACE.OLEDB.12.0;" +
                                    "Data Source=C:/Users/Administrator/Desktop/IT124106_140154313_ChanKaChun/HK_POPULATION_DATA.xlsx;" +
                                    "Extended Properties='Excel 12.0'";
        public OleDbDataAdapter oa;
        public DataSet dataset;
        public string s = "select * from ";

        [WebMethod]
        public List<Dist> getAllByDist()
        {
            List<Dist> temps = new List<Dist>();
            dataset = new DataSet();
            string query = s + "[2011 Population by District$]";
            oa = new OleDbDataAdapter(query, conn);
            oa.Fill(dataset);
            for (int i = 0; i < 19; i++)
            {
                Dist temp = new Dist();
                temp.settype(dataset.Tables[0].Rows[i][0].ToString());
                temp.setpop(dataset.Tables[0].Rows[i][1].ToString());
                temp.setper(dataset.Tables[0].Rows[i][2].ToString());
                temps.Add(temp);
            }
            return temps;
        }

        [WebMethod]
        public List<AgeGrp> getAllByAge()
        {
            List<AgeGrp> temps = new List<AgeGrp>();
            dataset = new DataSet();
            string query = s + "[2011 Population by Age Group$]";
            oa = new OleDbDataAdapter(query, conn);
            oa.Fill(dataset);
            for (int i = 0; i < 18; i++)
            {
                AgeGrp temp = new AgeGrp();
                temp.settype(dataset.Tables[0].Rows[i][0].ToString());
                temp.setmale(dataset.Tables[0].Rows[i][1].ToString());


                temps.Add(temp);
            }
            return temps;
        }

        [WebMethod]
        public List<Edu> getAllByEdu()
        {
            List<Edu> temps = new List<Edu>();
            dataset = new DataSet();
            string query = s + "[2011 Population by Education$]";
            oa = new OleDbDataAdapter(query, conn);
            oa.Fill(dataset);
            for (int i = 2; i < 42; i++)
            {
                Edu temp = new Edu();
                temp.settype(dataset.Tables[0].Rows[i][0].ToString());
                temp.setpreprimary(dataset.Tables[0].Rows[i][3].ToString());
                temp.setprimary(dataset.Tables[0].Rows[i][4].ToString());
                temp.setlowersecondary(dataset.Tables[0].Rows[i][5].ToString());
                temp.setippersecondary(dataset.Tables[0].Rows[i][6].ToString());
                temp.setdiploma(dataset.Tables[0].Rows[i][7].ToString());
                temp.setsubdegreel(dataset.Tables[0].Rows[i][8].ToString());
                temp.setdegree(dataset.Tables[0].Rows[i][9].ToString());
                temp.settotal(dataset.Tables[0].Rows[i][10].ToString());
                temps.Add(temp);
            }
            return temps;
        }

        [WebMethod]
        public string getAllByEduJson()

        {
            List<Edu> temps = new List<Edu>();
            dataset = new DataSet();
            string query = s + "[2011 Population by Education$]";
            oa = new OleDbDataAdapter(query, conn);
            oa.Fill(dataset);




            for (int i = 2; i < 42; i++)
            {
                Edu temp = new Edu();
                temp.settype(dataset.Tables[0].Rows[i][0].ToString());
                temp.setpreprimary(dataset.Tables[0].Rows[i][3].ToString());
                temp.setprimary(dataset.Tables[0].Rows[i][4].ToString());
                temp.setlowersecondary(dataset.Tables[0].Rows[i][5].ToString());
                temp.setippersecondary(dataset.Tables[0].Rows[i][6].ToString());
                temp.setdiploma(dataset.Tables[0].Rows[i][7].ToString());
                temp.setsubdegreel(dataset.Tables[0].Rows[i][8].ToString());
                temp.setdegree(dataset.Tables[0].Rows[i][9].ToString());
                temp.settotal(dataset.Tables[0].Rows[i][10].ToString());
                temps.Add(temp);


            }
            return JsonConvert.SerializeObject(temps);

        }

        public class student_Item
        {
            public string name { set; get; }//姓名
            public int tall { set; get; }//身高
        }


        /* public Dictionary<string, string> dataset2hashset(DataSet temp) {
            Dictionary<string, string> result = new Dictionary<string, string>();
            for (int i = 0; i < temp.Tables[0].Rows.Count; i++)
            {
                result.Add(temp.Tables[0].Rows[i][1].ToString(), temp.Tables[0].Rows[i][2].ToString());
                
            }
            return result;
        } */
    }
}

