package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Collections;
import org.apache.http.client.params.CookiePolicy;
import org.apache.http.cookie.CookiePathComparator;
import org.apache.http.cookie.CookieRestrictionViolationException;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.message.BufferedHeader;

/* JADX INFO: renamed from: o.zmI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59713zmI extends AbstractC59705zmA {
    public static final java.lang.String[] AEQbTJ = {org.apache.http.client.utils.DateUtils.PATTERN_RFC1123, org.apache.http.client.utils.DateUtils.PATTERN_RFC1036, org.apache.http.client.utils.DateUtils.PATTERN_ASCTIME};
    public final boolean copydefault;

    @Override // o.InterfaceC59605zkG
    public int AEQbTJ() {
        return 1;
    }

    @Override // o.InterfaceC59605zkG
    public InterfaceC59518ziZ OLrzqt() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return CookiePolicy.RFC_2109;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C59713zmI(java.lang.String[] strArr, boolean z) {
        InterfaceC59650zkz[] interfaceC59650zkzArr = new InterfaceC59650zkz[7];
        interfaceC59650zkzArr[0] = new C59718zmN();
        interfaceC59650zkzArr[1] = new C59754zmx() { // from class: o.zmI.2
            @Override // o.C59754zmx, o.InterfaceC59603zkE
            public void OLrzqt(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) throws MalformedCookieException {
                if (KWHzl(interfaceC59601zkC, c59602zkD)) {
                    return;
                }
                throw new CookieRestrictionViolationException("Illegal 'path' attribute \"" + interfaceC59601zkC.getPath() + "\". Path of origin: \"" + c59602zkD.KWHzl() + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            }
        };
        interfaceC59650zkzArr[2] = new C59715zmK();
        interfaceC59650zkzArr[3] = new C59752zmv();
        interfaceC59650zkzArr[4] = new C59750zmt();
        interfaceC59650zkzArr[5] = new C59745zmo();
        interfaceC59650zkzArr[6] = new C59748zmr(strArr != null ? (java.lang.String[]) strArr.clone() : AEQbTJ);
        super(interfaceC59650zkzArr);
        this.copydefault = z;
    }

    public C59713zmI() {
        this((java.lang.String[]) null, false);
    }

    public C59713zmI(boolean z, InterfaceC59650zkz... interfaceC59650zkzArr) {
        super(interfaceC59650zkzArr);
        this.copydefault = z;
    }

    @Override // o.InterfaceC59605zkG
    public java.util.List<InterfaceC59601zkC> KWHzl(InterfaceC59518ziZ interfaceC59518ziZ, C59602zkD c59602zkD) throws MalformedCookieException {
        C59851zoo.AEQbTJ(interfaceC59518ziZ, "Header");
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        if (!interfaceC59518ziZ.getName().equalsIgnoreCase(HttpHeaders.SET_COOKIE)) {
            throw new MalformedCookieException("Unrecognized cookie header '" + interfaceC59518ziZ.toString() + "'");
        }
        return OLrzqt(interfaceC59518ziZ.getElements(), c59602zkD);
    }

    @Override // o.AbstractC59705zmA, o.InterfaceC59605zkG
    public void OLrzqt(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) throws MalformedCookieException {
        C59851zoo.AEQbTJ(interfaceC59601zkC, HttpHeaders.COOKIE);
        java.lang.String name = interfaceC59601zkC.getName();
        if (name.indexOf(32) != -1) {
            throw new CookieRestrictionViolationException("Cookie name may not contain blanks");
        }
        if (name.startsWith("$")) {
            throw new CookieRestrictionViolationException("Cookie name may not start with $");
        }
        super.OLrzqt(interfaceC59601zkC, c59602zkD);
    }

    @Override // o.InterfaceC59605zkG
    public java.util.List<InterfaceC59518ziZ> KWHzl(java.util.List<InterfaceC59601zkC> list) {
        C59851zoo.copydefault(list, "List of cookies");
        if (list.size() > 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList(list);
            Collections.sort(arrayList, CookiePathComparator.INSTANCE);
            list = arrayList;
        }
        if (this.copydefault) {
            return OLrzqt(list);
        }
        return copydefault(list);
    }

    public final java.util.List<InterfaceC59518ziZ> OLrzqt(java.util.List<InterfaceC59601zkC> list) {
        int version = Integer.MAX_VALUE;
        for (InterfaceC59601zkC interfaceC59601zkC : list) {
            if (interfaceC59601zkC.getVersion() < version) {
                version = interfaceC59601zkC.getVersion();
            }
        }
        org.apache.http.util.CharArrayBuffer charArrayBuffer = new org.apache.http.util.CharArrayBuffer(list.size() * 40);
        charArrayBuffer.append(HttpHeaders.COOKIE);
        charArrayBuffer.append(": ");
        charArrayBuffer.append("$Version=");
        charArrayBuffer.append(java.lang.Integer.toString(version));
        for (InterfaceC59601zkC interfaceC59601zkC2 : list) {
            charArrayBuffer.append("; ");
            AEQbTJ(charArrayBuffer, interfaceC59601zkC2, version);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(new BufferedHeader(charArrayBuffer));
        return arrayList;
    }

    public final java.util.List<InterfaceC59518ziZ> copydefault(java.util.List<InterfaceC59601zkC> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (InterfaceC59601zkC interfaceC59601zkC : list) {
            int version = interfaceC59601zkC.getVersion();
            org.apache.http.util.CharArrayBuffer charArrayBuffer = new org.apache.http.util.CharArrayBuffer(40);
            charArrayBuffer.append("Cookie: ");
            charArrayBuffer.append("$Version=");
            charArrayBuffer.append(java.lang.Integer.toString(version));
            charArrayBuffer.append("; ");
            AEQbTJ(charArrayBuffer, interfaceC59601zkC, version);
            arrayList.add(new BufferedHeader(charArrayBuffer));
        }
        return arrayList;
    }

    public void EZpvd(org.apache.http.util.CharArrayBuffer charArrayBuffer, java.lang.String str, java.lang.String str2, int i) {
        charArrayBuffer.append(str);
        charArrayBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
        if (str2 != null) {
            if (i > 0) {
                charArrayBuffer.append('\"');
                charArrayBuffer.append(str2);
                charArrayBuffer.append('\"');
                return;
            }
            charArrayBuffer.append(str2);
        }
    }

    public void AEQbTJ(org.apache.http.util.CharArrayBuffer charArrayBuffer, InterfaceC59601zkC interfaceC59601zkC, int i) {
        EZpvd(charArrayBuffer, interfaceC59601zkC.getName(), interfaceC59601zkC.getValue(), i);
        if (interfaceC59601zkC.getPath() != null && (interfaceC59601zkC instanceof InterfaceC59648zkx) && ((InterfaceC59648zkx) interfaceC59601zkC).containsAttribute("path")) {
            charArrayBuffer.append("; ");
            EZpvd(charArrayBuffer, "$Path", interfaceC59601zkC.getPath(), i);
        }
        if (interfaceC59601zkC.getDomain() != null && (interfaceC59601zkC instanceof InterfaceC59648zkx) && ((InterfaceC59648zkx) interfaceC59601zkC).containsAttribute("domain")) {
            charArrayBuffer.append("; ");
            EZpvd(charArrayBuffer, "$Domain", interfaceC59601zkC.getDomain(), i);
        }
    }
}
