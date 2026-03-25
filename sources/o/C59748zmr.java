package o;

import com.google.common.net.HttpHeaders;
import java.util.Date;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: renamed from: o.zmr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59748zmr extends AbstractC59749zms implements InterfaceC59650zkz {
    public final java.lang.String[] copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59650zkz
    public java.lang.String OLrzqt() {
        return "expires";
    }

    public C59748zmr(java.lang.String[] strArr) {
        C59851zoo.AEQbTJ(strArr, "Array of date patterns");
        this.copydefault = strArr;
    }

    @Override // o.InterfaceC59603zkE
    public void OLrzqt(InterfaceC59606zkH interfaceC59606zkH, java.lang.String str) throws MalformedCookieException {
        C59851zoo.AEQbTJ(interfaceC59606zkH, HttpHeaders.COOKIE);
        if (str == null) {
            throw new MalformedCookieException("Missing value for 'expires' attribute");
        }
        Date date = org.apache.http.client.utils.DateUtils.parseDate(str, this.copydefault);
        if (date == null) {
            throw new MalformedCookieException("Invalid 'expires' attribute: " + str);
        }
        interfaceC59606zkH.setExpiryDate(date);
    }
}
