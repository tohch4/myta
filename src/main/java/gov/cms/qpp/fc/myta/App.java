package gov.cms.qpp.fc.myta;
import com.amazonaws.services.support.*;
import com.amazonaws.services.support.model.*;
public class App {
    private static AWSSupportClient createClient() {
        AWSSupportClient client = new AWSSupportClient();
        client.setEndpoint("https://support.us-east-1.amazonaws.com");
        return client;
    }

    public static void getTaChecks(AWSSupportClient client) {
        DescribeTrustedAdvisorChecksResult result = client
                .describeTrustedAdvisorChecks(new DescribeTrustedAdvisorChecksRequest().withLanguage("en"));

        for (TrustedAdvisorCheckDescription checkDescription : result.getChecks()) {
            System.out.println(checkDescription.getId());
            System.out.println(checkDescription.getName());
        }
    }

    public static void main(String[] args) {
        AWSSupportClient client = createClient();
        getTaChecks(client);
    }
}
