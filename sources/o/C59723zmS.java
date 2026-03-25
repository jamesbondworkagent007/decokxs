package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.google.common.net.HttpHeaders;
import java.util.Map;
import org.apache.http.client.params.CookiePolicy;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.impl.cookie.BasicClientCookie2;
import org.apache.http.message.BufferedHeader;

/* JADX INFO: renamed from: o.zmS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59723zmS extends C59713zmI {
    @Override // o.C59713zmI, o.InterfaceC59605zkG
    public int AEQbTJ() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C59713zmI
    public java.lang.String toString() {
        return CookiePolicy.RFC_2965;
    }

    public C59723zmS() {
        this((java.lang.String[]) null, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C59723zmS(java.lang.String[] strArr, boolean z) {
        InterfaceC59650zkz[] interfaceC59650zkzArr = new InterfaceC59650zkz[10];
        interfaceC59650zkzArr[0] = new C59724zmT();
        interfaceC59650zkzArr[1] = new C59754zmx() { // from class: o.zmS.2
            @Override // o.C59754zmx, o.InterfaceC59603zkE
            public void OLrzqt(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) throws MalformedCookieException {
                if (KWHzl(interfaceC59601zkC, c59602zkD)) {
                    return;
                }
                throw new CookieRestrictionViolationException("Illegal 'path' attribute \"" + interfaceC59601zkC.getPath() + "\". Path of origin: \"" + c59602zkD.KWHzl() + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            }
        };
        interfaceC59650zkzArr[2] = new C59722zmR();
        interfaceC59650zkzArr[3] = new C59727zmW();
        interfaceC59650zkzArr[4] = new C59752zmv();
        interfaceC59650zkzArr[5] = new C59750zmt();
        interfaceC59650zkzArr[6] = new C59745zmo();
        interfaceC59650zkzArr[7] = new C59748zmr(strArr != null ? (java.lang.String[]) strArr.clone() : C59713zmI.AEQbTJ);
        interfaceC59650zkzArr[8] = new C59721zmQ();
        interfaceC59650zkzArr[9] = new C59719zmO();
        super(z, interfaceC59650zkzArr);
    }

    public C59723zmS(boolean z, InterfaceC59650zkz... interfaceC59650zkzArr) {
        super(z, interfaceC59650zkzArr);
    }

    @Override // o.C59713zmI, o.InterfaceC59605zkG
    public java.util.List<InterfaceC59601zkC> KWHzl(InterfaceC59518ziZ interfaceC59518ziZ, C59602zkD c59602zkD) throws MalformedCookieException {
        C59851zoo.AEQbTJ(interfaceC59518ziZ, "Header");
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        if (!interfaceC59518ziZ.getName().equalsIgnoreCase(HttpHeaders.SET_COOKIE2)) {
            throw new MalformedCookieException("Unrecognized cookie header '" + interfaceC59518ziZ.toString() + "'");
        }
        return copydefault(interfaceC59518ziZ.getElements(), AEQbTJ(c59602zkD));
    }

    @Override // o.AbstractC59705zmA
    public java.util.List<InterfaceC59601zkC> OLrzqt(InterfaceC59517ziY[] interfaceC59517ziYArr, C59602zkD c59602zkD) throws MalformedCookieException {
        return copydefault(interfaceC59517ziYArr, AEQbTJ(c59602zkD));
    }

    public final java.util.List<InterfaceC59601zkC> copydefault(InterfaceC59517ziY[] interfaceC59517ziYArr, C59602zkD c59602zkD) throws MalformedCookieException {
        java.util.ArrayList arrayList = new java.util.ArrayList(interfaceC59517ziYArr.length);
        for (InterfaceC59517ziY interfaceC59517ziY : interfaceC59517ziYArr) {
            java.lang.String strCopydefault = interfaceC59517ziY.copydefault();
            java.lang.String strKWHzl = interfaceC59517ziY.KWHzl();
            if (strCopydefault == null || strCopydefault.isEmpty()) {
                throw new MalformedCookieException("Cookie name may not be empty");
            }
            BasicClientCookie2 basicClientCookie2 = new BasicClientCookie2(strCopydefault, strKWHzl);
            basicClientCookie2.setPath(AbstractC59705zmA.copydefault(c59602zkD));
            basicClientCookie2.setDomain(AbstractC59705zmA.EZpvd(c59602zkD));
            basicClientCookie2.setPorts(new int[]{c59602zkD.EZpvd()});
            InterfaceC59582zjk[] interfaceC59582zjkArrAEQbTJ = interfaceC59517ziY.AEQbTJ();
            java.util.HashMap map = new java.util.HashMap(interfaceC59582zjkArrAEQbTJ.length);
            for (int length = interfaceC59582zjkArrAEQbTJ.length - 1; length >= 0; length--) {
                InterfaceC59582zjk interfaceC59582zjk = interfaceC59582zjkArrAEQbTJ[length];
                map.put(interfaceC59582zjk.getName().toLowerCase(java.util.Locale.ROOT), interfaceC59582zjk);
            }
            java.util.Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                InterfaceC59582zjk interfaceC59582zjk2 = (InterfaceC59582zjk) ((Map.Entry) it.next()).getValue();
                java.lang.String lowerCase = interfaceC59582zjk2.getName().toLowerCase(java.util.Locale.ROOT);
                basicClientCookie2.setAttribute(lowerCase, interfaceC59582zjk2.getValue());
                InterfaceC59603zkE interfaceC59603zkEAEQbTJ = AEQbTJ(lowerCase);
                if (interfaceC59603zkEAEQbTJ != null) {
                    interfaceC59603zkEAEQbTJ.OLrzqt(basicClientCookie2, interfaceC59582zjk2.getValue());
                }
            }
            arrayList.add(basicClientCookie2);
        }
        return arrayList;
    }

    @Override // o.C59713zmI, o.AbstractC59705zmA, o.InterfaceC59605zkG
    public void OLrzqt(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) throws MalformedCookieException {
        C59851zoo.AEQbTJ(interfaceC59601zkC, HttpHeaders.COOKIE);
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        super.OLrzqt(interfaceC59601zkC, AEQbTJ(c59602zkD));
    }

    @Override // o.AbstractC59705zmA, o.InterfaceC59605zkG
    public boolean KWHzl(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) {
        C59851zoo.AEQbTJ(interfaceC59601zkC, HttpHeaders.COOKIE);
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        return super.KWHzl(interfaceC59601zkC, AEQbTJ(c59602zkD));
    }

    @Override // o.C59713zmI
    public void AEQbTJ(org.apache.http.util.CharArrayBuffer charArrayBuffer, InterfaceC59601zkC interfaceC59601zkC, int i) {
        java.lang.String attribute;
        int[] ports;
        super.AEQbTJ(charArrayBuffer, interfaceC59601zkC, i);
        if (!(interfaceC59601zkC instanceof InterfaceC59648zkx) || (attribute = ((InterfaceC59648zkx) interfaceC59601zkC).getAttribute("port")) == null) {
            return;
        }
        charArrayBuffer.append("; $Port");
        charArrayBuffer.append("=\"");
        if (!attribute.trim().isEmpty() && (ports = interfaceC59601zkC.getPorts()) != null) {
            int length = ports.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (i2 > 0) {
                    charArrayBuffer.append(",");
                }
                charArrayBuffer.append(java.lang.Integer.toString(ports[i2]));
            }
        }
        charArrayBuffer.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
    }

    public static C59602zkD AEQbTJ(C59602zkD c59602zkD) {
        java.lang.String strCopydefault = c59602zkD.copydefault();
        for (int i = 0; i < strCopydefault.length(); i++) {
            char cCharAt = strCopydefault.charAt(i);
            if (cCharAt == '.' || cCharAt == ':') {
                return c59602zkD;
            }
        }
        return new C59602zkD(strCopydefault + ".local", c59602zkD.EZpvd(), c59602zkD.KWHzl(), c59602zkD.AEQbTJ());
    }

    @Override // o.C59713zmI, o.InterfaceC59605zkG
    public InterfaceC59518ziZ OLrzqt() {
        org.apache.http.util.CharArrayBuffer charArrayBuffer = new org.apache.http.util.CharArrayBuffer(40);
        charArrayBuffer.append("Cookie2");
        charArrayBuffer.append(": ");
        charArrayBuffer.append("$Version=");
        charArrayBuffer.append(java.lang.Integer.toString(AEQbTJ()));
        return new BufferedHeader(charArrayBuffer);
    }
}
