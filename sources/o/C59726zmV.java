package o;

import com.google.common.net.HttpHeaders;
import java.util.BitSet;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.message.BufferedHeader;

/* JADX INFO: renamed from: o.zmV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C59726zmV implements InterfaceC59605zkG {
    public static final BitSet AEQbTJ = C59777znT.AEQbTJ(61, 59);
    public static final BitSet EZpvd = C59777znT.AEQbTJ(59);
    public static final BitSet KWHzl = C59777znT.AEQbTJ(32, 34, 44, 59, 92);
    public final InterfaceC59603zkE[] OLrzqt;
    public final java.util.Map<java.lang.String, InterfaceC59603zkE> copydefault;
    public final C59777znT djBIcL;

    @Override // o.InterfaceC59605zkG
    public final int AEQbTJ() {
        return 0;
    }

    @Override // o.InterfaceC59605zkG
    public final InterfaceC59518ziZ OLrzqt() {
        return null;
    }

    public C59726zmV(InterfaceC59650zkz... interfaceC59650zkzArr) {
        this.OLrzqt = (InterfaceC59603zkE[]) interfaceC59650zkzArr.clone();
        this.copydefault = new ConcurrentHashMap(interfaceC59650zkzArr.length);
        for (InterfaceC59650zkz interfaceC59650zkz : interfaceC59650zkzArr) {
            this.copydefault.put(interfaceC59650zkz.OLrzqt().toLowerCase(java.util.Locale.ROOT), interfaceC59650zkz);
        }
        this.djBIcL = C59777znT.OLrzqt;
    }

    public static java.lang.String KWHzl(C59602zkD c59602zkD) {
        java.lang.String strKWHzl = c59602zkD.KWHzl();
        int iLastIndexOf = strKWHzl.lastIndexOf(47);
        if (iLastIndexOf < 0) {
            return strKWHzl;
        }
        if (iLastIndexOf == 0) {
            iLastIndexOf = 1;
        }
        return strKWHzl.substring(0, iLastIndexOf);
    }

    public static java.lang.String copydefault(C59602zkD c59602zkD) {
        return c59602zkD.copydefault();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    @Override // o.InterfaceC59605zkG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<InterfaceC59601zkC> KWHzl(InterfaceC59518ziZ interfaceC59518ziZ, C59602zkD c59602zkD) throws MalformedCookieException {
        org.apache.http.util.CharArrayBuffer charArrayBuffer;
        C59771znN c59771znN;
        java.lang.String strKWHzl;
        C59851zoo.AEQbTJ(interfaceC59518ziZ, "Header");
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        if (!interfaceC59518ziZ.getName().equalsIgnoreCase(HttpHeaders.SET_COOKIE)) {
            throw new MalformedCookieException("Unrecognized cookie header: '" + interfaceC59518ziZ.toString() + "'");
        }
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
        java.lang.String strKWHzl2 = this.djBIcL.KWHzl(charArrayBuffer, c59771znN, AEQbTJ);
        if (strKWHzl2.length() == 0) {
            return Collections.emptyList();
        }
        if (c59771znN.copydefault()) {
            return Collections.emptyList();
        }
        char cCharAt = charArrayBuffer.charAt(c59771znN.OLrzqt());
        c59771znN.EZpvd(c59771znN.OLrzqt() + 1);
        if (cCharAt != '=') {
            throw new MalformedCookieException("Cookie value is invalid: '" + interfaceC59518ziZ.toString() + "'");
        }
        java.lang.String strCopydefault = this.djBIcL.copydefault(charArrayBuffer, c59771znN, EZpvd);
        if (!c59771znN.copydefault()) {
            c59771znN.EZpvd(c59771znN.OLrzqt() + 1);
        }
        BasicClientCookie basicClientCookie = new BasicClientCookie(strKWHzl2, strCopydefault);
        basicClientCookie.setPath(KWHzl(c59602zkD));
        basicClientCookie.setDomain(copydefault(c59602zkD));
        basicClientCookie.setCreationDate(new Date());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (!c59771znN.copydefault()) {
            java.lang.String lowerCase = this.djBIcL.KWHzl(charArrayBuffer, c59771znN, AEQbTJ).toLowerCase(java.util.Locale.ROOT);
            if (!c59771znN.copydefault()) {
                char cCharAt2 = charArrayBuffer.charAt(c59771znN.OLrzqt());
                c59771znN.EZpvd(c59771znN.OLrzqt() + 1);
                if (cCharAt2 == '=') {
                    strKWHzl = this.djBIcL.KWHzl(charArrayBuffer, c59771znN, EZpvd);
                    if (!c59771znN.copydefault()) {
                        c59771znN.EZpvd(c59771znN.OLrzqt() + 1);
                    }
                } else {
                    strKWHzl = null;
                }
            }
            basicClientCookie.setAttribute(lowerCase, strKWHzl);
            linkedHashMap.put(lowerCase, strKWHzl);
        }
        if (linkedHashMap.containsKey("max-age")) {
            linkedHashMap.remove("expires");
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.String str2 = (java.lang.String) entry.getValue();
            InterfaceC59603zkE interfaceC59603zkE = this.copydefault.get(str);
            if (interfaceC59603zkE != null) {
                interfaceC59603zkE.OLrzqt(basicClientCookie, str2);
            }
        }
        return Collections.singletonList(basicClientCookie);
    }

    @Override // o.InterfaceC59605zkG
    public final void OLrzqt(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) throws MalformedCookieException {
        C59851zoo.AEQbTJ(interfaceC59601zkC, HttpHeaders.COOKIE);
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        for (InterfaceC59603zkE interfaceC59603zkE : this.OLrzqt) {
            interfaceC59603zkE.OLrzqt(interfaceC59601zkC, c59602zkD);
        }
    }

    @Override // o.InterfaceC59605zkG
    public final boolean KWHzl(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) {
        C59851zoo.AEQbTJ(interfaceC59601zkC, HttpHeaders.COOKIE);
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        for (InterfaceC59603zkE interfaceC59603zkE : this.OLrzqt) {
            if (!interfaceC59603zkE.KWHzl(interfaceC59601zkC, c59602zkD)) {
                return false;
            }
        }
        return true;
    }

    @Override // o.InterfaceC59605zkG
    public java.util.List<InterfaceC59518ziZ> KWHzl(java.util.List<InterfaceC59601zkC> list) {
        C59851zoo.copydefault(list, "List of cookies");
        if (list.size() > 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList(list);
            Collections.sort(arrayList, C59604zkF.OLrzqt);
            list = arrayList;
        }
        org.apache.http.util.CharArrayBuffer charArrayBuffer = new org.apache.http.util.CharArrayBuffer(list.size() * 20);
        charArrayBuffer.append(HttpHeaders.COOKIE);
        charArrayBuffer.append(": ");
        for (int i = 0; i < list.size(); i++) {
            InterfaceC59601zkC interfaceC59601zkC = list.get(i);
            if (i > 0) {
                charArrayBuffer.append(';');
                charArrayBuffer.append(' ');
            }
            charArrayBuffer.append(interfaceC59601zkC.getName());
            java.lang.String value = interfaceC59601zkC.getValue();
            if (value != null) {
                charArrayBuffer.append('=');
                if (AEQbTJ(value)) {
                    charArrayBuffer.append('\"');
                    for (int i2 = 0; i2 < value.length(); i2++) {
                        char cCharAt = value.charAt(i2);
                        if (cCharAt == '\"' || cCharAt == '\\') {
                            charArrayBuffer.append(AbstractJsonLexerKt.STRING_ESC);
                        }
                        charArrayBuffer.append(cCharAt);
                    }
                    charArrayBuffer.append('\"');
                } else {
                    charArrayBuffer.append(value);
                }
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
        arrayList2.add(new BufferedHeader(charArrayBuffer));
        return arrayList2;
    }

    public boolean AEQbTJ(java.lang.CharSequence charSequence) {
        return EZpvd(charSequence, KWHzl);
    }

    public boolean EZpvd(java.lang.CharSequence charSequence, BitSet bitSet) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (bitSet.get(charSequence.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
