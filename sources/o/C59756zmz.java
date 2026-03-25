package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Collections;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.impl.cookie.BrowserCompatSpecFactory;
import org.apache.http.message.BufferedHeader;

/* JADX INFO: renamed from: o.zmz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59756zmz extends AbstractC59705zmA {
    public static final java.lang.String[] copydefault = {org.apache.http.client.utils.DateUtils.PATTERN_RFC1123, org.apache.http.client.utils.DateUtils.PATTERN_RFC1036, org.apache.http.client.utils.DateUtils.PATTERN_ASCTIME, "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z"};

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
        return "compatibility";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C59756zmz(java.lang.String[] strArr, BrowserCompatSpecFactory.SecurityLevel securityLevel) {
        InterfaceC59650zkz[] interfaceC59650zkzArr = new InterfaceC59650zkz[7];
        interfaceC59650zkzArr[0] = new C59706zmB();
        interfaceC59650zkzArr[1] = new C59747zmq();
        interfaceC59650zkzArr[2] = securityLevel == BrowserCompatSpecFactory.SecurityLevel.SECURITYLEVEL_IE_MEDIUM ? new C59754zmx() { // from class: o.zmz.1
            @Override // o.C59754zmx, o.InterfaceC59603zkE
            public void OLrzqt(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) throws MalformedCookieException {
            }
        } : new C59754zmx();
        interfaceC59650zkzArr[3] = new C59752zmv();
        interfaceC59650zkzArr[4] = new C59750zmt();
        interfaceC59650zkzArr[5] = new C59745zmo();
        interfaceC59650zkzArr[6] = new C59748zmr(strArr != null ? (java.lang.String[]) strArr.clone() : copydefault);
        super(interfaceC59650zkzArr);
    }

    public C59756zmz() {
        this(null, BrowserCompatSpecFactory.SecurityLevel.SECURITYLEVEL_DEFAULT);
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
        InterfaceC59517ziY[] elements = interfaceC59518ziZ.getElements();
        boolean z = false;
        boolean z2 = false;
        for (InterfaceC59517ziY interfaceC59517ziY : elements) {
            if (interfaceC59517ziY.copydefault("version") != null) {
                z2 = true;
            }
            if (interfaceC59517ziY.copydefault("expires") != null) {
                z = true;
            }
        }
        if (z || !z2) {
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
            InterfaceC59517ziY interfaceC59517ziYKWHzl = c59709zmE.KWHzl(charArrayBuffer, c59771znN);
            java.lang.String strCopydefault = interfaceC59517ziYKWHzl.copydefault();
            java.lang.String strKWHzl = interfaceC59517ziYKWHzl.KWHzl();
            if (strCopydefault == null || strCopydefault.isEmpty()) {
                throw new MalformedCookieException("Cookie name may not be empty");
            }
            BasicClientCookie basicClientCookie = new BasicClientCookie(strCopydefault, strKWHzl);
            basicClientCookie.setPath(AbstractC59705zmA.copydefault(c59602zkD));
            basicClientCookie.setDomain(AbstractC59705zmA.EZpvd(c59602zkD));
            InterfaceC59582zjk[] interfaceC59582zjkArrAEQbTJ = interfaceC59517ziYKWHzl.AEQbTJ();
            for (int length = interfaceC59582zjkArrAEQbTJ.length - 1; length >= 0; length--) {
                InterfaceC59582zjk interfaceC59582zjk = interfaceC59582zjkArrAEQbTJ[length];
                java.lang.String lowerCase = interfaceC59582zjk.getName().toLowerCase(java.util.Locale.ROOT);
                basicClientCookie.setAttribute(lowerCase, interfaceC59582zjk.getValue());
                InterfaceC59603zkE interfaceC59603zkEAEQbTJ = AEQbTJ(lowerCase);
                if (interfaceC59603zkEAEQbTJ != null) {
                    interfaceC59603zkEAEQbTJ.OLrzqt(basicClientCookie, interfaceC59582zjk.getValue());
                }
            }
            if (z) {
                basicClientCookie.setVersion(0);
            }
            return Collections.singletonList(basicClientCookie);
        }
        return OLrzqt(elements, c59602zkD);
    }

    public static boolean OLrzqt(java.lang.String str) {
        return str != null && str.startsWith(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR) && str.endsWith(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
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
            java.lang.String name = interfaceC59601zkC.getName();
            java.lang.String value = interfaceC59601zkC.getValue();
            if (interfaceC59601zkC.getVersion() > 0 && !OLrzqt(value)) {
                C59763znF.OLrzqt.KWHzl(charArrayBuffer, new C59762znE(name, value), false);
            } else {
                charArrayBuffer.append(name);
                charArrayBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
                if (value != null) {
                    charArrayBuffer.append(value);
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(new BufferedHeader(charArrayBuffer));
        return arrayList;
    }
}
