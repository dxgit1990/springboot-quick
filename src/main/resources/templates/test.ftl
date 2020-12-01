<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户信息</title>
</head>
<body>
<div>
    <font size="font-size:10px" face="verdana" style="color:rgb(34,42,54);line-height:100%"><b>Dear Users,</b></font>
</div>
<br>
<div>
    <font size="font-size:10px" face="verdana" style="color:rgb(34,42,54);line-height:100%">Parts sourcing and
        procurement are key to supply chain agility and flexibility. To constantly identify industry trend and
        opportunities, we have built our public media based procurement intelligence portal on SCI in FY1920.</font>
</div>
<br>
<div>
    <font size="font-size:10px" face="verdana" style="color:rgb(237,125,49);line-height:100%"><b>It’s our great pleasure
            to inform you, we have enabled our portal since Aug. 19, 2019. You can simply access to our most fresh
            commodity news and daily updated raw material prices anywhere, anytime from now on by click “Supplier News
            Recommend” on SCI platform. Please follow below instructions for you to find us:</b> </font>
</div>

<ul>
    <li><font size="font-size:10px" face="verdana" style="color:rgb(34,42,54);line-height:100%">Log in to <b>“http://sci.lenovo.com/”</b></font>
    </li>
    <li><font size="font-size:10px" face="verdana" style="color:rgb(34,42,54);line-height:100%">Click on <b>“Intelligence
                & Analysis”</b>, find out <b>“Procurement”</b></font></li>
    <li><font size="font-size:10px" face="verdana" style="color:rgb(34,42,54);line-height:100%"><b>“Supplier News
                Recommend”</b> tab is located in the lower right corner.</font></li>
</ul>

<div>
    <font size="font-size:10px" face="verdana" style="color:rgb(34,42,54);line-height:100%">Please press the “PREFER”
        button (A Thumbs-up Icon) once you find a piece of news you are interested.
        Your feedbacks will provide most valuable advices to discover business value,
        and encourage us to keep enriching and optimizing the contents.</font>
    <font size="font-size:10px" face="verdana" style="color:rgb(34,42,54);line-height:100%"><b>Any suggestion or
            question is welcomed</b></font>
    <font size="font-size:10px" face="verdana" style="color:rgb(34,42,54);line-height:100%">To:</font>
</div>
<div>
    <font size="font-size:10px" face="Italic" style="color:rgb(34,42,54);line-height:100%"><i><u>Product
                BA</u></i></font>
    <font size="font-size:10px" face="verdana" style="color:rgb(34,42,54);line-height:100%">: Nicole Shi, Karis
        Li</font>
</div>
<hr/>
<br>
<#--<div>-->
    <#if list??>
        <table border="1" style="width: 700px;table-layout: fixed">
            <tr>
                <#list fields as field>
                    <#if field=="用户名">
                        <th width="250px;"><p>${field}</p></th>
                    <#else>
                        <th><p>${field}</p></th>
                    </#if>
                </#list>
            </tr>
            <#list list as user>
                <tr>
                    <td style="white-space: nowrap;overflow: hidden;text-overflow: ellipsis;">${user.username}</td>
                    <td width="100px;"><p>${user.password}</p></td>
                    <td>${user.age}</td>
                    <td>${user.address}</td>
                </tr>
            </#list>
        </table>
    </#if>
<#--</div>-->
</body>
</html>