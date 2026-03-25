package o;

import com.google.common.net.HttpHeaders;
import com.huawei.hms.framework.common.ContainerUtils;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.message.BufferedHeader;

/* JADX INFO: renamed from: o.zmM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59717zmM extends AbstractC59705zmA {
    @Override // o.InterfaceC59605zkG
    public int AEQbTJ() {
        return 0;
    }

    @Override // o.InterfaceC59605zkG
    public InterfaceC59518ziZ OLrzqt() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "netscape";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C59717zmM(java.lang.String[] strArr) {
        InterfaceC59650zkz[] interfaceC59650zkzArr = new InterfaceC59650zkz[5];
        interfaceC59650zkzArr[0] = new C59754zmx();
        interfaceC59650zkzArr[1] = new C59712zmH();
        interfaceC59650zkzArr[2] = new C59750zmt();
        interfaceC59650zkzArr[3] = new C59745zmo();
        interfaceC59650zkzArr[4] = new C59748zmr(strArr != null ? (java.lang.String[]) strArr.clone() : new java.lang.String[]{"EEE, dd-MMM-yy HH:mm:ss z"});
        super(interfaceC59650zkzArr);
    }

    public C59717zmM(InterfaceC59650zkz... interfaceC59650zkzArr) {
        super(interfaceC59650zkzArr);
    }

    public C59717zmM() {
        this((java.lang.String[]) null);
    }

    @Override // o.InterfaceC59605zkG
    public java.util.List<InterfaceC59601zkC> KWHzl(InterfaceC59518ziZ interfaceC59518ziZ, C59602zkD c59602zkD) throws MalformedCookieException {
        org.apache.http.util.CharArrayBuffer charArrayBuffer;
        C59771znN c59771znN;
        C59851zoo.AEQbTJ(interfaceC59518ziZ, "Header");
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        if (!interfaceC59518ziZ.getName().equalsIgnoreCase(HttpHeaders.SET_COOKIE)) {
            throw new MalformedCookieException("Unrecognized cookie header '" + interfaceC59518ziZ.toString() + "'");
        }
        C59709zmE c59709zmE = C59709zmE.EZpvd;
        if (interfaceC59518ziZ instanceof InterfaceC59516ziX) {
            InterfaceC59516ziX interfaceC59516ziX = (InterfaceC59516ziX) interfaceC59518ziZ;
            charArrayBuffer = interfaceC59516ziX.getBuffer();
            c59771znN = new C59771znN(interfaceC59516ziX.getValuePos(), charArrayBuffer.length());
        } else {
            java.lang.String value = interfaceC59518ziZ.getValue();
            if (value == null) {
                throw new MalformedCookieException("Header value is null");
            }
            charArrayBuffer = new org.apache.http.util.CharArrayBuffer(value.length());
            charArrayBuffer.append(value);
            c59771znN = new C59771znN(0, charArrayBuffer.length());
        }
        return OLrzqt(new InterfaceC59517ziY[]{c59709zmE.KWHzl(charArrayBuffer, c59771znN)}, c59602zkD);
    }

    @Override // o.InterfaceC59605zkG
    public java.util.List<InterfaceC59518ziZ> KWHzl(java.util.List<InterfaceC59601zkC> list) {
        C59851zoo.copydefault(list, "List of cookies");
        org.apache.http.util.CharArrayBuffer charArrayBuffer = new org.apache.http.util.CharArrayBuffer(list.size() * 20);
        charArrayBuffer.append(HttpHeaders.COOKIE);
        charArrayBuffer.append(": ");
        for (int i = 0; i < list.size(); i++) {
            InterfaceC59601zkC interfaceC59601zkC = list.get(i);
            if (i > 0) {
                charArrayBuffer.append("; ");
            }
            charArrayBuffer.append(interfaceC59601zkC.getName());
            java.lang.String value = interfaceC59601zkC.getValue();
            if (value != null) {
                charArrayBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
                charArrayBuffer.append(value);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(new BufferedHeader(charArrayBuffer));
        return arrayList;
    }
}
