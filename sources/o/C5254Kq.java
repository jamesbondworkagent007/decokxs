package o;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.Kq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C5254Kq {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public java.lang.Double AEQbTJ;
    public java.lang.Double AhwBna;
    public java.util.Map<java.lang.String, java.lang.Object> EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public int copydefault = 1;
    public java.lang.String djBIcL;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ != null;
    }

    /* JADX INFO: renamed from: o.Kq$StateListAnimator */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Kq.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final C5251Kn AEQbTJ() {
        C5251Kn c5251Kn = new C5251Kn();
        java.util.Map<java.lang.String, java.lang.Object> linkedHashMap = this.EZpvd;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        java.lang.String str = this.OLrzqt;
        if (str != null) {
            linkedHashMap.put("$productId", str);
        }
        linkedHashMap.put("$quantity", java.lang.Integer.valueOf(this.copydefault));
        java.lang.Double d = this.AEQbTJ;
        if (d != null) {
            linkedHashMap.put("$price", java.lang.Double.valueOf(d.doubleValue()));
        }
        java.lang.String str2 = this.djBIcL;
        if (str2 != null) {
            linkedHashMap.put("$revenueType", str2);
        }
        java.lang.String str3 = this.KWHzl;
        if (str3 != null) {
            linkedHashMap.put("$currency", str3);
        }
        java.lang.String str4 = this.gEmmrt;
        if (str4 != null) {
            linkedHashMap.put("$receipt", str4);
        }
        java.lang.String str5 = this.valueOf;
        if (str5 != null) {
            linkedHashMap.put("$receiptSig", str5);
        }
        java.lang.Double d2 = this.AhwBna;
        if (d2 != null) {
            linkedHashMap.put("$revenue", java.lang.Double.valueOf(d2.doubleValue()));
        }
        c5251Kn.AEQbTJ(linkedHashMap);
        return c5251Kn;
    }
}
