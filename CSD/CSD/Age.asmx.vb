Imports System.Web.Services
Imports System.Web.Services.Protocols
Imports System.ComponentModel
Imports System.Data.OleDb

' To allow this Web Service to be called from script, using ASP.NET AJAX, uncomment the following line.
' <System.Web.Script.Services.ScriptService()> _
<System.Web.Services.WebService(Namespace:="http://tempuri.org/")> _
<System.Web.Services.WebServiceBinding(ConformsTo:=WsiProfiles.BasicProfile1_1)>
<ToolboxItem(False)>
Public Class Age
    Inherits System.Web.Services.WebService

    <WebMethod()>
    Public Function getAgeGroup(agegroup As String) As String
        Dim myDataset As New DataSet()
        Dim strConn As String = "Provider=Microsoft.ACE.OLEDB.12.0;Data Source=C:\Users\Administrator\Documents\GitHub\PT4SI_Assignment_1209\HK_POPULATION_DATA.xlsx;Extended Properties='Excel 12.0'"
        Dim myData As New OleDbDataAdapter("SELECT [Type] FROM [2011 Population by Age Group$] where [Age Group] = '" & agegroup & "'", strConn)
        myData.Fill(myDataset)
        Return myDataset.Tables(0).Rows(0)(0).ToString()
    End Function

End Class