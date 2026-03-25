package o;

import java.util.BitSet;
import org.apache.httpcore.message.BasicNameValuePair;

/* JADX INFO: renamed from: o.zoH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C59818zoH implements InterfaceC59816zoF {
    public final C59820zoJ KWHzl = C59820zoJ.OLrzqt;

    @java.lang.Deprecated
    public static final C59818zoH EZpvd = new C59818zoH();
    public static final C59818zoH copydefault = new C59818zoH();
    public static final BitSet OLrzqt = C59820zoJ.copydefault(61, 59, 44);
    public static final BitSet AEQbTJ = C59820zoJ.copydefault(59, 44);

    public static InterfaceC59857zou[] KWHzl(java.lang.String str, InterfaceC59816zoF interfaceC59816zoF) throws org.apache.httpcore.ParseException {
        C59825zoO.copydefault(str, "Value");
        org.apache.httpcore.util.CharArrayBuffer charArrayBuffer = new org.apache.httpcore.util.CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        C59822zoL c59822zoL = new C59822zoL(0, str.length());
        if (interfaceC59816zoF == null) {
            interfaceC59816zoF = copydefault;
        }
        return interfaceC59816zoF.AEQbTJ(charArrayBuffer, c59822zoL);
    }

    @Override // o.InterfaceC59816zoF
    public InterfaceC59857zou[] AEQbTJ(org.apache.httpcore.util.CharArrayBuffer charArrayBuffer, C59822zoL c59822zoL) {
        C59825zoO.copydefault(charArrayBuffer, "Char array buffer");
        C59825zoO.copydefault(c59822zoL, "Parser cursor");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!c59822zoL.EZpvd()) {
            InterfaceC59857zou interfaceC59857zouCopydefault = copydefault(charArrayBuffer, c59822zoL);
            if (!interfaceC59857zouCopydefault.KWHzl().isEmpty() || interfaceC59857zouCopydefault.EZpvd() != null) {
                arrayList.add(interfaceC59857zouCopydefault);
            }
        }
        return (InterfaceC59857zou[]) arrayList.toArray(new InterfaceC59857zou[arrayList.size()]);
    }

    public InterfaceC59857zou copydefault(org.apache.httpcore.util.CharArrayBuffer charArrayBuffer, C59822zoL c59822zoL) {
        C59825zoO.copydefault(charArrayBuffer, "Char array buffer");
        C59825zoO.copydefault(c59822zoL, "Parser cursor");
        InterfaceC59862zoz interfaceC59862zozEZpvd = EZpvd(charArrayBuffer, c59822zoL);
        return OLrzqt(interfaceC59862zozEZpvd.getName(), interfaceC59862zozEZpvd.getValue(), (c59822zoL.EZpvd() || charArrayBuffer.charAt(c59822zoL.copydefault() + (-1)) == ',') ? null : OLrzqt(charArrayBuffer, c59822zoL));
    }

    public InterfaceC59857zou OLrzqt(java.lang.String str, java.lang.String str2, InterfaceC59862zoz[] interfaceC59862zozArr) {
        return new C59812zoB(str, str2, interfaceC59862zozArr);
    }

    public InterfaceC59862zoz[] OLrzqt(org.apache.httpcore.util.CharArrayBuffer charArrayBuffer, C59822zoL c59822zoL) {
        C59825zoO.copydefault(charArrayBuffer, "Char array buffer");
        C59825zoO.copydefault(c59822zoL, "Parser cursor");
        this.KWHzl.copydefault(charArrayBuffer, c59822zoL);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!c59822zoL.EZpvd()) {
            arrayList.add(EZpvd(charArrayBuffer, c59822zoL));
            if (charArrayBuffer.charAt(c59822zoL.copydefault() - 1) == ',') {
                break;
            }
        }
        return (InterfaceC59862zoz[]) arrayList.toArray(new InterfaceC59862zoz[arrayList.size()]);
    }

    public InterfaceC59862zoz EZpvd(org.apache.httpcore.util.CharArrayBuffer charArrayBuffer, C59822zoL c59822zoL) {
        C59825zoO.copydefault(charArrayBuffer, "Char array buffer");
        C59825zoO.copydefault(c59822zoL, "Parser cursor");
        java.lang.String strOLrzqt = this.KWHzl.OLrzqt(charArrayBuffer, c59822zoL, OLrzqt);
        if (c59822zoL.EZpvd()) {
            return new BasicNameValuePair(strOLrzqt, null);
        }
        char cCharAt = charArrayBuffer.charAt(c59822zoL.copydefault());
        c59822zoL.EZpvd(c59822zoL.copydefault() + 1);
        if (cCharAt != '=') {
            return OLrzqt(strOLrzqt, (java.lang.String) null);
        }
        java.lang.String strKWHzl = this.KWHzl.KWHzl(charArrayBuffer, c59822zoL, AEQbTJ);
        if (!c59822zoL.EZpvd()) {
            c59822zoL.EZpvd(c59822zoL.copydefault() + 1);
        }
        return OLrzqt(strOLrzqt, strKWHzl);
    }

    public InterfaceC59862zoz OLrzqt(java.lang.String str, java.lang.String str2) {
        return new BasicNameValuePair(str, str2);
    }
}
