package o;

import java.util.BitSet;
import org.apache.http.message.BasicNameValuePair;

/* JADX INFO: renamed from: o.zmE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59709zmE {
    public final C59777znT AEQbTJ = C59777znT.OLrzqt;
    public static final C59709zmE EZpvd = new C59709zmE();
    public static final BitSet OLrzqt = C59777znT.AEQbTJ(61, 59);
    public static final BitSet KWHzl = C59777znT.AEQbTJ(59);

    public InterfaceC59517ziY KWHzl(org.apache.http.util.CharArrayBuffer charArrayBuffer, C59771znN c59771znN) throws org.apache.http.ParseException {
        C59851zoo.AEQbTJ(charArrayBuffer, "Char array buffer");
        C59851zoo.AEQbTJ(c59771znN, "Parser cursor");
        InterfaceC59582zjk interfaceC59582zjkEZpvd = EZpvd(charArrayBuffer, c59771znN);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!c59771znN.copydefault()) {
            arrayList.add(EZpvd(charArrayBuffer, c59771znN));
        }
        return new C59762znE(interfaceC59582zjkEZpvd.getName(), interfaceC59582zjkEZpvd.getValue(), (InterfaceC59582zjk[]) arrayList.toArray(new InterfaceC59582zjk[arrayList.size()]));
    }

    public final InterfaceC59582zjk EZpvd(org.apache.http.util.CharArrayBuffer charArrayBuffer, C59771znN c59771znN) {
        java.lang.String strKWHzl = this.AEQbTJ.KWHzl(charArrayBuffer, c59771znN, OLrzqt);
        if (c59771znN.copydefault()) {
            return new BasicNameValuePair(strKWHzl, null);
        }
        char cCharAt = charArrayBuffer.charAt(c59771znN.OLrzqt());
        c59771znN.EZpvd(c59771znN.OLrzqt() + 1);
        if (cCharAt != '=') {
            return new BasicNameValuePair(strKWHzl, null);
        }
        java.lang.String strKWHzl2 = this.AEQbTJ.KWHzl(charArrayBuffer, c59771znN, KWHzl);
        if (!c59771znN.copydefault()) {
            c59771znN.EZpvd(c59771znN.OLrzqt() + 1);
        }
        return new BasicNameValuePair(strKWHzl, strKWHzl2);
    }
}
