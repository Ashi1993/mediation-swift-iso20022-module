package org.wso2.carbon.module.swiftiso20022.utils;

import org.testng.annotations.DataProvider;

/**
 * Constants for the MT940FormatValidator test class.
 */
public class MT940FormatValidatorTestConstants {

    public static final String PAYLOAD = "<soapenv:Body xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">" +
            "<text xmlns=\"http://ws.apache.org/commons/ns/payload\">" +
            "{1:F01CBORETAAXXXX22061ZFPHG}{2:I940XXXXXXXXXXXXN}{3:{108:22061ZFPHG97870}}{4:\n" +
            ":20:20240105-4\n" +
            ":25P:BDN200000\n" +
            "BDN200000\n" +
            ":28C:45/14\n" +
            ":60M:D230223ETB215306,49\n" +
            ":61:23040505DB1000,00NMSC12h79eu1//TT23328X147R\n" +
            "Tests\n" +
            ":61:23040505DB1000,00NMSC12h79eu1//TT23328X147R\n" +
            ":62F:D230223ETB215306,49\n" +
            ":64:D230223ETB215306,49\n" +
            ":65:D230223ETB215306,49\n" +
            " -}</text></soapenv:Body>";

    public static final String AXIS2_PAYLOAD = "<soapenv:Body xmlns:soapenv=" +
            "\"http://schemas.xmlsoap.org/soap/envelope/\">" +
            "<axis2ns3:text xmlns:axis2ns3=\"http://ws.apache.org/commons/ns/payload\">" +
            "{1:F01CBORETAAXXXX22061ZFPHG}{2:I940XXXXXXXXXXXXN}{3:{108:22061ZFPHG97870}}{4:\n" +
            ":20:20240105-4\n" +
            ":25P:BDN200000\n" +
            "BDN200000\n" +
            ":28C:46/14\n" +
            ":60M:D230223ETB215306,49\n" +
            ":61:23040505DB1000,00NMSC12h79eu1//TT23328X147R\n" +
            "Tests\n" +
            ":61:23040505DB1000,00NMSC12h79eu1//TT23328X147R\n" +
            ":62F:D230223ETB215306,49\n" +
            ":64:D230223ETB215306,49\n" +
            ":65:D230223ETB215306,49\n" +
            " -}</axis2ns3:text></soapenv:Body>";

    public static final String INVALID_PAYLOAD = "<soapenv:Body xmlns:soapenv=" +
            "\"http://schemas.xmlsoap.org/soap/envelope/\">" +
            "<text xmlns=\"http://ws.apache.org/commons/ns/payload\">" +
            "{1:F01CBORETAAXXXX22061ZFPHG}{2:I940XXXXXXXXXXXXN}{3:{108:22061ZFPHG97870}}{4:\n" +
            ":20:20240105-4\n" +
            ":25P:BDN200000\n" +
            "BDN200000\n" +
            ":28C:4514\n" +
            ":60M:D230223ETB215306,49\n" +
            ":61:23040505DB1000,00NMSC12h79eu1//TT23328X147R\n" +
            "Tests\n" +
            ":61:23040505DB1000,00NMSC12h79eu1//TT23328X147R\n" +
            ":62F:D230223ETB215306,49\n" +
            ":64:D230223ETB215306,49\n" +
            ":65:D230223ETB215306,49\n" +
            " -}</text></soapenv:Body>";

    @DataProvider(name = "invalidReferenceDataProvider")
    Object[][] getInvalidReferenceDataProvider() {

        return new Object[][]{
                {":20:"},
                {":20: "},
                {":20:tqibyrtbgergqohgfheuigbFWV743FEUWFB7G34BFVGRYGRWnaehrghhubarh"},
                {":20:test//"},
                {":20:test}"}
        };
    }

    @DataProvider(name = "invalidAccountIdentifierDataProvider")
    Object[][] getInvalidAccountIdentifierDataProvider() {

        return new Object[][]{
                {":25:"},
                {":25: "},
                {":25:tqibyrtbgergqohgfheuigbFWV743FEUWFB7G34BFVGRYGjbegjbqebubgbquebbdhaRWnaehrghhubarh"},
                {":25:test}"}
        };
    }

    @DataProvider(name = "invalidStatementNumberDataProvider")
    Object[][] getInvalidStatementNumberDataProvider() {

        return new Object[][]{
                {":28C:"},
                {":28C: "},
                {":28C:12345/3456"},
                {":28C:12345"},
                {":28C:123/45"}
        };
    }

    @DataProvider(name = "invalidBalanceDataProvider")
    Object[][] getInvalidBalanceDataProvider() {

        return new Object[][]{
                {":60F:"},
                {":60F: "},
                {":60F:1234534567537056031767589432984756473892"},
                {":60F:D12345456789034567898765433487654658616813865868318683683168618303634683610"},
                {":60F:D12356789276567892764567319.45"}
        };
    }
}
