package tr.gov.pmum.bsm.gunici.ws;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties.Authenticator;

/**
 *
 * @author ecmel
 */
public final class GuniciWSStubFactory {

  private GuniciWSStubFactory()
  {
  }

  public static GuniciWSStub newInstance(String username, String password) throws AxisFault
  {
    GuniciWSStub stub = new GuniciWSStub("https://gip.epias.com.tr/gunici/servis");

    Authenticator auth = new Authenticator();
    auth.setUsername(username);
    auth.setPassword(password);
    auth.setPreemptiveAuthentication(true);

    Options options = stub._getServiceClient().getOptions();
    options.setProperty(HTTPConstants.AUTHENTICATE, auth);
    options.setProperty(HTTPConstants.REUSE_HTTP_CLIENT, "true");

    return stub;
  }
}
