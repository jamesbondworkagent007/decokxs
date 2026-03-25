package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.market.common.constants.TokenAgeType;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kMg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28029kMg extends android.widget.FrameLayout implements InterfaceC28026kMd {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final LinkedHashMap<java.lang.String, PriceRangeFilter> EZpvd;
    public InterfaceC28023kMa OLrzqt;
    public int copydefault;
    public java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28029kMg(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28029kMg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC28026kMd
    public void KWHzl(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC28026kMd
    public void setCallback(@NotNull InterfaceC28023kMa interfaceC28023kMa) {
        Intrinsics.checkNotNullParameter(interfaceC28023kMa, "");
        this.OLrzqt = interfaceC28023kMa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC28026kMd
    public void setSelectionDismissCallback(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: o.kMg.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C28029kMg(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28029kMg(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.kMe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28029kMg.AEQbTJ(context, this);
            }
        });
        this.EZpvd = new LinkedHashMap<>();
        this.copydefault = 2;
        C55008xbo c55008xbo = EZpvd().OLrzqt;
        c55008xbo.setLabelText(getInputFieldHint$default(this, true, false, 2, null));
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setMaxDecimalValue(2);
        }
        C55001xbh c55001xbhAkhnZx2 = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            C33606mzd.AEQbTJ(c55001xbhAkhnZx2, new Function1() { // from class: o.kMj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28029kMg.AEQbTJ(this.copydefault, (java.lang.CharSequence) obj);
                }
            });
        }
        C55008xbo c55008xbo2 = EZpvd().KWHzl;
        c55008xbo2.setLabelText(getInputFieldHint$default(this, false, false, 2, null));
        C55001xbh c55001xbhAkhnZx3 = c55008xbo2.AkhnZx();
        if (c55001xbhAkhnZx3 != null) {
            c55001xbhAkhnZx3.setMaxDecimalValue(2);
        }
        C55001xbh c55001xbhAkhnZx4 = c55008xbo2.AkhnZx();
        if (c55001xbhAkhnZx4 != null) {
            C33606mzd.AEQbTJ(c55001xbhAkhnZx4, new Function1() { // from class: o.kMk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28029kMg.OLrzqt(this.copydefault, (java.lang.CharSequence) obj);
                }
            });
        }
    }

    private final C57414yhv EZpvd() {
        return (C57414yhv) this.AEQbTJ.getValue();
    }

    public static final C57414yhv AEQbTJ(android.content.Context context, C28029kMg c28029kMg) {
        return C57414yhv.AEQbTJ(android.view.LayoutInflater.from(context), c28029kMg, true);
    }

    public static final Unit AEQbTJ(C28029kMg c28029kMg, java.lang.CharSequence charSequence) {
        java.lang.String strValueOf = java.lang.String.valueOf(charSequence);
        if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) strValueOf, '.', false, 2, (java.lang.Object) null)) {
            strValueOf = C59454zhO.DbNXlk(strValueOf, 1);
        }
        C55001xbh c55001xbhAkhnZx = c28029kMg.EZpvd().KWHzl.AkhnZx();
        c28029kMg.AEQbTJ(strValueOf, java.lang.String.valueOf(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.getText() : null));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C28029kMg c28029kMg, java.lang.CharSequence charSequence) {
        java.lang.String strValueOf = java.lang.String.valueOf(charSequence);
        if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) strValueOf, '.', false, 2, (java.lang.Object) null)) {
            strValueOf = C59454zhO.DbNXlk(strValueOf, 1);
        }
        C55001xbh c55001xbhAkhnZx = c28029kMg.EZpvd().OLrzqt.AkhnZx();
        c28029kMg.AEQbTJ(java.lang.String.valueOf(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.getText() : null), strValueOf);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC28026kMd
    public void setData(@NotNull java.util.List<PriceRangeFilter> list, PriceRangeFilter priceRangeFilter, TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd.clear();
        for (PriceRangeFilter priceRangeFilter2 : list) {
            this.EZpvd.put(C31193lpR.AEQbTJ.KWHzl(), priceRangeFilter2);
        }
        OLrzqt(priceRangeFilter);
    }

    private final void OLrzqt(final PriceRangeFilter priceRangeFilter) {
        C55008xbo c55008xbo = EZpvd().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        AEQbTJ(c55008xbo, C31256lqb.KWHzl(priceRangeFilter != null ? priceRangeFilter.OLrzqt() : null, (Function0<java.lang.String>) new Function0() { // from class: o.kMh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28029kMg.EZpvd(priceRangeFilter);
            }
        }));
        C55008xbo c55008xbo2 = EZpvd().KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
        AEQbTJ(c55008xbo2, C31256lqb.KWHzl(priceRangeFilter != null ? priceRangeFilter.AEQbTJ() : null, (Function0<java.lang.String>) new Function0() { // from class: o.kMf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28029kMg.AEQbTJ(priceRangeFilter);
            }
        }));
    }

    public static final java.lang.String EZpvd(PriceRangeFilter priceRangeFilter) {
        java.lang.String strAhwBna = priceRangeFilter != null ? priceRangeFilter.AhwBna() : null;
        return strAhwBna == null ? "" : strAhwBna;
    }

    public static final java.lang.String AEQbTJ(PriceRangeFilter priceRangeFilter) {
        java.lang.String strKWHzl = priceRangeFilter != null ? priceRangeFilter.KWHzl() : null;
        return strKWHzl == null ? "" : strKWHzl;
    }

    private final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        boolean zKWHzl = KWHzl(str, str2);
        AppCompatTextView appCompatTextView = EZpvd().copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(zKWHzl ^ true ? 0 : 8);
        if (!zKWHzl) {
            C55008xbo c55008xbo = EZpvd().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            OLrzqt(c55008xbo);
            C55008xbo c55008xbo2 = EZpvd().KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            OLrzqt(c55008xbo2);
            InterfaceC28023kMa interfaceC28023kMa = this.OLrzqt;
            if (interfaceC28023kMa != null) {
                interfaceC28023kMa.AEQbTJ(new PriceRangeFilter((java.lang.String) null, (java.lang.String) null, (TokenAgeType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 127, (DefaultConstructorMarker) null), false);
                return;
            }
            return;
        }
        EZpvd().OLrzqt.values();
        EZpvd().KWHzl.values();
        C31191lpP c31191lpP = C31191lpP.copydefault;
        PriceRangeFilter priceRangeFilter = new PriceRangeFilter(c31191lpP.KWHzl() ? str : c31191lpP.AEQbTJ(str), c31191lpP.KWHzl() ? str2 : c31191lpP.AEQbTJ(str2), (TokenAgeType) null, (java.lang.String) null, str, str2, false, 76, (DefaultConstructorMarker) null);
        InterfaceC28023kMa interfaceC28023kMa2 = this.OLrzqt;
        if (interfaceC28023kMa2 != null) {
            interfaceC28023kMa2.AEQbTJ(priceRangeFilter, true);
        }
    }

    private final boolean KWHzl(java.lang.String str, java.lang.String str2) {
        if (str.length() == 0) {
            return true;
        }
        return str2.length() == 0 || C33129mqd.gEmmrt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), java.lang.Double.valueOf(C33129mqd.AEQbTJ(str2)));
    }

    public static /* synthetic */ java.lang.String getInputFieldHint$default(C28029kMg c28029kMg, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        return c28029kMg.AEQbTJ(z, z2);
    }

    public final java.lang.String AEQbTJ(boolean z, boolean z2) {
        java.lang.String string;
        java.lang.String strAYXKKw = this.gEmmrt;
        if (strAYXKKw == null) {
            strAYXKKw = z2 ? C33070mpX.AYXKKw(C23274hvD.Fragment.gRtANS) : "";
        }
        if (z) {
            string = getContext().getString(C23274hvD.Fragment.ardYFU);
        } else {
            string = getContext().getString(C23274hvD.Fragment.zbGDDc);
        }
        Intrinsics.copydefault((java.lang.Object) string);
        if (strAYXKKw.length() == 0) {
            return string;
        }
        return string + " (" + strAYXKKw + ")";
    }

    public static /* synthetic */ void resetInputField$default(C28029kMg c28029kMg, C55008xbo c55008xbo, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c28029kMg.AEQbTJ(c55008xbo, str);
    }

    private final void AEQbTJ(C55008xbo c55008xbo, java.lang.String str) {
        c55008xbo.clearFocus();
        C31191lpP.copydefault.copydefault(str);
        c55008xbo.setText(copydefault(str));
    }

    private final java.lang.String copydefault(java.lang.String str) {
        if (!StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, '.', false, 2, (java.lang.Object) null)) {
            return str;
        }
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (str.charAt(length) == '.') {
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            length = -1;
        } else {
            length = -1;
        }
        java.lang.String strSubstring = str.substring(0, java.lang.Math.min(str.length(), length + this.copydefault + 1));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    private final void OLrzqt(C55008xbo c55008xbo) {
        c55008xbo.setState(2);
        c55008xbo.setErrorShowing(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C33054mpH.OLrzqt(context, EZpvd().OLrzqt);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C33054mpH.OLrzqt(context2, EZpvd().KWHzl);
    }

    public final void EZpvd(boolean z) {
        C57414yhv c57414yhvEZpvd = EZpvd();
        android.widget.TextView textView = c57414yhvEZpvd.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat = EZpvd().EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        C55296xhK.OLrzqt(linearLayoutCompat, java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(z ? 0.0f : 12.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f));
        int i = z ? 9 : 2;
        this.copydefault = i;
        C55001xbh c55001xbhAkhnZx = c57414yhvEZpvd.OLrzqt.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setMaxDecimalValue(i);
        }
        C55001xbh c55001xbhAkhnZx2 = c57414yhvEZpvd.KWHzl.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.setMaxDecimalValue(i);
        }
    }

    public final void AEQbTJ(boolean z) {
        C57414yhv c57414yhvEZpvd = EZpvd();
        c57414yhvEZpvd.OLrzqt.setLabelText(AEQbTJ(true, z));
        c57414yhvEZpvd.KWHzl.setLabelText(AEQbTJ(false, z));
    }

    /* JADX INFO: renamed from: o.kMg$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kMg.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
