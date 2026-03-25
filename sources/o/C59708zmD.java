package o;

import com.google.common.net.HttpHeaders;
import java.util.Date;
import java.util.regex.Pattern;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: renamed from: o.zmD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C59708zmD extends AbstractC59749zms implements InterfaceC59650zkz {
    public static final Pattern KWHzl = Pattern.compile("^\\-?[0-9]+$");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59650zkz
    public java.lang.String OLrzqt() {
        return "max-age";
    }

    @Override // o.InterfaceC59603zkE
    public void OLrzqt(InterfaceC59606zkH interfaceC59606zkH, java.lang.String str) throws MalformedCookieException {
        C59851zoo.AEQbTJ(interfaceC59606zkH, HttpHeaders.COOKIE);
        if (!C59853zoq.OLrzqt(str) && KWHzl.matcher(str).matches()) {
            try {
                int i = java.lang.Integer.parseInt(str);
                interfaceC59606zkH.setExpiryDate(i >= 0 ? new Date(java.lang.System.currentTimeMillis() + (((long) i) * 1000)) : new Date(Long.MIN_VALUE));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
    }
}
