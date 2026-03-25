package o;

import java.util.BitSet;
import org.apache.http.message.BasicNameValuePair;

/* JADX INFO: renamed from: o.znD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59761znD implements InterfaceC59773znP {
    public final C59777znT copydefault = C59777znT.OLrzqt;

    @java.lang.Deprecated
    public static final C59761znD KWHzl = new C59761znD();
    public static final C59761znD EZpvd = new C59761znD();
    public static final BitSet OLrzqt = C59777znT.AEQbTJ(61, 59, 44);
    public static final BitSet AEQbTJ = C59777znT.AEQbTJ(59, 44);

    public static InterfaceC59517ziY[] KWHzl(java.lang.String str, InterfaceC59773znP interfaceC59773znP) throws org.apache.http.ParseException {
        C59851zoo.AEQbTJ(str, "Value");
        org.apache.http.util.CharArrayBuffer charArrayBuffer = new org.apache.http.util.CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        C59771znN c59771znN = new C59771znN(0, str.length());
        if (interfaceC59773znP == null) {
            interfaceC59773znP = EZpvd;
        }
        return interfaceC59773znP.OLrzqt(charArrayBuffer, c59771znN);
    }

    @Override // o.InterfaceC59773znP
    public InterfaceC59517ziY[] OLrzqt(org.apache.http.util.CharArrayBuffer charArrayBuffer, C59771znN c59771znN) {
        C59851zoo.AEQbTJ(charArrayBuffer, "Char array buffer");
        C59851zoo.AEQbTJ(c59771znN, "Parser cursor");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!c59771znN.copydefault()) {
            InterfaceC59517ziY interfaceC59517ziYAEQbTJ = AEQbTJ(charArrayBuffer, c59771znN);
            if (interfaceC59517ziYAEQbTJ.copydefault().length() != 0 || interfaceC59517ziYAEQbTJ.KWHzl() != null) {
                arrayList.add(interfaceC59517ziYAEQbTJ);
            }
        }
        return (InterfaceC59517ziY[]) arrayList.toArray(new InterfaceC59517ziY[arrayList.size()]);
    }

    @Override // o.InterfaceC59773znP
    public InterfaceC59517ziY AEQbTJ(org.apache.http.util.CharArrayBuffer charArrayBuffer, C59771znN c59771znN) {
        C59851zoo.AEQbTJ(charArrayBuffer, "Char array buffer");
        C59851zoo.AEQbTJ(c59771znN, "Parser cursor");
        InterfaceC59582zjk interfaceC59582zjkKWHzl = KWHzl(charArrayBuffer, c59771znN);
        return AEQbTJ(interfaceC59582zjkKWHzl.getName(), interfaceC59582zjkKWHzl.getValue(), (c59771znN.copydefault() || charArrayBuffer.charAt(c59771znN.OLrzqt() + (-1)) == ',') ? null : copydefault(charArrayBuffer, c59771znN));
    }

    public InterfaceC59517ziY AEQbTJ(java.lang.String str, java.lang.String str2, InterfaceC59582zjk[] interfaceC59582zjkArr) {
        return new C59762znE(str, str2, interfaceC59582zjkArr);
    }

    public InterfaceC59582zjk[] copydefault(org.apache.http.util.CharArrayBuffer charArrayBuffer, C59771znN c59771znN) {
        C59851zoo.AEQbTJ(charArrayBuffer, "Char array buffer");
        C59851zoo.AEQbTJ(c59771znN, "Parser cursor");
        this.copydefault.copydefault(charArrayBuffer, c59771znN);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!c59771znN.copydefault()) {
            arrayList.add(KWHzl(charArrayBuffer, c59771znN));
            if (charArrayBuffer.charAt(c59771znN.OLrzqt() - 1) == ',') {
                break;
            }
        }
        return (InterfaceC59582zjk[]) arrayList.toArray(new InterfaceC59582zjk[arrayList.size()]);
    }

    public InterfaceC59582zjk KWHzl(org.apache.http.util.CharArrayBuffer charArrayBuffer, C59771znN c59771znN) {
        C59851zoo.AEQbTJ(charArrayBuffer, "Char array buffer");
        C59851zoo.AEQbTJ(c59771znN, "Parser cursor");
        java.lang.String strKWHzl = this.copydefault.KWHzl(charArrayBuffer, c59771znN, OLrzqt);
        if (c59771znN.copydefault()) {
            return new BasicNameValuePair(strKWHzl, null);
        }
        char cCharAt = charArrayBuffer.charAt(c59771znN.OLrzqt());
        c59771znN.EZpvd(c59771znN.OLrzqt() + 1);
        if (cCharAt != '=') {
            return copydefault(strKWHzl, (java.lang.String) null);
        }
        java.lang.String strCopydefault = this.copydefault.copydefault(charArrayBuffer, c59771znN, AEQbTJ);
        if (!c59771znN.copydefault()) {
            c59771znN.EZpvd(c59771znN.OLrzqt() + 1);
        }
        return copydefault(strKWHzl, strCopydefault);
    }

    public InterfaceC59582zjk copydefault(java.lang.String str, java.lang.String str2) {
        return new BasicNameValuePair(str, str2);
    }
}
