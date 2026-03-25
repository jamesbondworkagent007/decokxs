package o;

import com.okinc.tradingbot.impl.widget.ArbitrageOrderConfirmData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes24.dex */
public final class wUH extends android.widget.LinearLayout {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wUH(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wUH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:28) call: o.wUH.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wUH(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wUH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setOrientation(1);
        android.view.View.inflate(context, C48033uCm.Activity.zbGDDc, this);
        this.KWHzl = (android.widget.TextView) findViewById(C48033uCm.Application.onKeyDownPanel);
        this.copydefault = (android.widget.TextView) findViewById(C48033uCm.Application.onCloseMenu);
        this.EZpvd = (android.widget.TextView) findViewById(C48033uCm.Application.dispatchKeyShortcutEvent);
        this.OLrzqt = (android.widget.TextView) findViewById(C48033uCm.Application.setSingleChoiceItems);
        this.gEmmrt = (android.widget.TextView) findViewById(C48033uCm.Application.createToggleButton);
        this.AEQbTJ = (android.widget.TextView) findViewById(C48033uCm.Application.setup);
    }

    public final void setData(@NotNull ArbitrageOrderConfirmData arbitrageOrderConfirmData) {
        Intrinsics.checkNotNullParameter(arbitrageOrderConfirmData, "");
        if (Intrinsics.EZpvd((java.lang.Object) arbitrageOrderConfirmData.valueOf(), (java.lang.Object) "--") || arbitrageOrderConfirmData.valueOf().length() == 0) {
            return;
        }
        this.KWHzl.setText(C33129mqd.OLrzqt((java.lang.CharSequence) arbitrageOrderConfirmData.AYXKKw()) ? arbitrageOrderConfirmData.AYXKKw() : "--");
        this.copydefault.setText(C33129mqd.OLrzqt((java.lang.CharSequence) arbitrageOrderConfirmData.gEmmrt()) ? arbitrageOrderConfirmData.gEmmrt() : "--");
        this.EZpvd.setText(arbitrageOrderConfirmData.DbNXlk());
        if (Intrinsics.EZpvd((java.lang.Object) arbitrageOrderConfirmData.isConnected(), (java.lang.Object) "buy")) {
            android.widget.TextView textView = this.EZpvd;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView.setTextColor(C33508mxl.copydefault(context));
        } else {
            android.widget.TextView textView2 = this.EZpvd;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            textView2.setTextColor(C33508mxl.AEQbTJ(context2));
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) arbitrageOrderConfirmData.copydefault()) && !Intrinsics.EZpvd((java.lang.Object) arbitrageOrderConfirmData.copydefault(), (java.lang.Object) "--")) {
            this.OLrzqt.setText(xMR.copydefault.copydefault(arbitrageOrderConfirmData.copydefault()) + " " + arbitrageOrderConfirmData.EZpvd());
        } else {
            this.OLrzqt.setText("--");
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) arbitrageOrderConfirmData.KWHzl()) && !Intrinsics.EZpvd((java.lang.Object) arbitrageOrderConfirmData.KWHzl(), (java.lang.Object) "--")) {
            this.gEmmrt.setText(xMR.copydefault.copydefault(arbitrageOrderConfirmData.KWHzl()) + " " + arbitrageOrderConfirmData.fetchVPNInfo());
        } else {
            this.gEmmrt.setText("--");
        }
        this.AEQbTJ.setText(AEQbTJ(arbitrageOrderConfirmData));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (r0.equals("queuingPrice") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        if (r0.equals("overpriced") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        r0 = o.C56039xvL.OLrzqt.AEQbTJ();
        r2 = r6.djBIcL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (r2 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        r2 = r2.getFirst();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        if (r2 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        r0 = r0.get(r2);
        r2 = OLrzqt(r6);
        r3 = copydefault(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        if (r6.OLrzqt() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:
    
        r1 = "," + o.C33070mpX.AYXKKw(o.C55688xof.Application.isShuffleModeEnabledRemoved);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        return ((java.lang.Object) r0) + "(" + r2 + r3 + r1 + ")";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AEQbTJ(ArbitrageOrderConfirmData arbitrageOrderConfirmData) {
        java.lang.String first;
        java.lang.String second;
        kotlin.Pair<java.lang.String, java.lang.String> pairDjBIcL = arbitrageOrderConfirmData.djBIcL();
        java.lang.String first2 = pairDjBIcL != null ? pairDjBIcL.getFirst() : null;
        java.lang.String str = "";
        if (first2 != null) {
            int iHashCode = first2.hashCode();
            if (iHashCode != -1823029745) {
                if (iHashCode != -1596402597) {
                    if (iHashCode == 96667352 && first2.equals("enter")) {
                        xMR xmr = xMR.copydefault;
                        kotlin.Pair<java.lang.String, java.lang.String> pairDjBIcL2 = arbitrageOrderConfirmData.djBIcL();
                        if (pairDjBIcL2 != null && (second = pairDjBIcL2.getSecond()) != null) {
                            str = second;
                        }
                        return xmr.copydefault(str) + " " + arbitrageOrderConfirmData.AkhnZx();
                    }
                }
            }
        }
        java.util.HashMap<java.lang.String, java.lang.String> mapAEQbTJ = C56039xvL.OLrzqt.AEQbTJ();
        kotlin.Pair<java.lang.String, java.lang.String> pairDjBIcL3 = arbitrageOrderConfirmData.djBIcL();
        if (pairDjBIcL3 == null || (first = pairDjBIcL3.getFirst()) == null) {
            first = "";
        }
        java.lang.String str2 = mapAEQbTJ.get(first);
        return str2 == null ? "" : str2;
    }

    public final java.lang.String OLrzqt(ArbitrageOrderConfirmData arbitrageOrderConfirmData) {
        kotlin.Pair<java.lang.String, java.lang.String> pairDjBIcL = arbitrageOrderConfirmData.djBIcL();
        if (!Intrinsics.EZpvd((java.lang.Object) (pairDjBIcL != null ? pairDjBIcL.getFirst() : null), (java.lang.Object) "overpriced")) {
            kotlin.Pair<java.lang.String, java.lang.String> pairDjBIcL2 = arbitrageOrderConfirmData.djBIcL();
            if (!Intrinsics.EZpvd((java.lang.Object) (pairDjBIcL2 != null ? pairDjBIcL2.getFirst() : null), (java.lang.Object) "queuingPrice")) {
                return "";
            }
        }
        return Intrinsics.EZpvd((java.lang.Object) arbitrageOrderConfirmData.isConnected(), (java.lang.Object) "buy") ? Marker.ANY_NON_NULL_MARKER : "-";
    }

    public final java.lang.String copydefault(ArbitrageOrderConfirmData arbitrageOrderConfirmData) {
        kotlin.Pair<java.lang.String, java.lang.String> pairDjBIcL = arbitrageOrderConfirmData.djBIcL();
        if (Intrinsics.EZpvd((java.lang.Object) (pairDjBIcL != null ? pairDjBIcL.getFirst() : null), (java.lang.Object) "overpriced")) {
            return java.lang.String.valueOf(arbitrageOrderConfirmData.values());
        }
        kotlin.Pair<java.lang.String, java.lang.String> pairDjBIcL2 = arbitrageOrderConfirmData.djBIcL();
        return Intrinsics.EZpvd((java.lang.Object) (pairDjBIcL2 != null ? pairDjBIcL2.getFirst() : null), (java.lang.Object) "queuingPrice") ? java.lang.String.valueOf(arbitrageOrderConfirmData.AhwBna()) : "";
    }
}
