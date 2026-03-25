package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.dexkline.market.common.constants.TokenAgeType;
import com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.neJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34553neJ extends android.widget.FrameLayout implements InterfaceC34552neI {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final LinkedHashMap<java.lang.String, PriceRangeFilter> AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public int OLrzqt;
    public InterfaceC34548neE copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34553neJ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34553neJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC34552neI
    public void setCallback(@NotNull InterfaceC34548neE interfaceC34548neE) {
        Intrinsics.checkNotNullParameter(interfaceC34548neE, "");
        this.copydefault = interfaceC34548neE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC34552neI
    public void setSelectionDismissCallback(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: o.neJ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C34553neJ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34553neJ(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.neK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34553neJ.KWHzl(context, this);
            }
        });
        this.AEQbTJ = new LinkedHashMap<>();
        this.OLrzqt = 2;
        C55008xbo c55008xbo = KWHzl().AEQbTJ;
        c55008xbo.setLabelText(KWHzl(true));
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setMaxDecimalValue(2);
        }
        C55001xbh c55001xbhAkhnZx2 = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            C33606mzd.AEQbTJ(c55001xbhAkhnZx2, new Function1() { // from class: o.neQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34553neJ.OLrzqt(this.AEQbTJ, (java.lang.CharSequence) obj);
                }
            });
        }
        C55008xbo c55008xbo2 = KWHzl().OLrzqt;
        c55008xbo2.setLabelText(KWHzl(false));
        C55001xbh c55001xbhAkhnZx3 = c55008xbo2.AkhnZx();
        if (c55001xbhAkhnZx3 != null) {
            c55001xbhAkhnZx3.setMaxDecimalValue(2);
        }
        C55001xbh c55001xbhAkhnZx4 = c55008xbo2.AkhnZx();
        if (c55001xbhAkhnZx4 != null) {
            C33606mzd.AEQbTJ(c55001xbhAkhnZx4, new Function1() { // from class: o.neO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34553neJ.AEQbTJ(this.OLrzqt, (java.lang.CharSequence) obj);
                }
            });
        }
    }

    private final oOA KWHzl() {
        return (oOA) this.EZpvd.getValue();
    }

    public static final oOA KWHzl(android.content.Context context, C34553neJ c34553neJ) {
        return oOA.KWHzl(android.view.LayoutInflater.from(context), c34553neJ, true);
    }

    public static final Unit OLrzqt(C34553neJ c34553neJ, java.lang.CharSequence charSequence) {
        java.lang.String strValueOf = java.lang.String.valueOf(charSequence);
        if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) strValueOf, '.', false, 2, (java.lang.Object) null)) {
            strValueOf = C59454zhO.DbNXlk(strValueOf, 1);
        }
        C55001xbh c55001xbhAkhnZx = c34553neJ.KWHzl().OLrzqt.AkhnZx();
        c34553neJ.OLrzqt(strValueOf, java.lang.String.valueOf(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.getText() : null));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C34553neJ c34553neJ, java.lang.CharSequence charSequence) {
        java.lang.String strValueOf = java.lang.String.valueOf(charSequence);
        if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) strValueOf, '.', false, 2, (java.lang.Object) null)) {
            strValueOf = C59454zhO.DbNXlk(strValueOf, 1);
        }
        C55001xbh c55001xbhAkhnZx = c34553neJ.KWHzl().AEQbTJ.AkhnZx();
        c34553neJ.OLrzqt(java.lang.String.valueOf(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.getText() : null), strValueOf);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC34552neI
    public void setData(@NotNull java.util.List<PriceRangeFilter> list, PriceRangeFilter priceRangeFilter, TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ.clear();
        for (PriceRangeFilter priceRangeFilter2 : list) {
            this.AEQbTJ.put(C34655ngG.copydefault.OLrzqt(), priceRangeFilter2);
        }
        AEQbTJ(priceRangeFilter);
    }

    private final void AEQbTJ(final PriceRangeFilter priceRangeFilter) {
        C55008xbo c55008xbo = KWHzl().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        EZpvd(c55008xbo, C34663ngO.AEQbTJ(priceRangeFilter != null ? priceRangeFilter.KWHzl() : null, new Function0() { // from class: o.neR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34553neJ.EZpvd(priceRangeFilter);
            }
        }));
        C55008xbo c55008xbo2 = KWHzl().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
        EZpvd(c55008xbo2, C34663ngO.AEQbTJ(priceRangeFilter != null ? priceRangeFilter.AEQbTJ() : null, new Function0() { // from class: o.neP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34553neJ.copydefault(priceRangeFilter);
            }
        }));
    }

    public static final java.lang.String EZpvd(PriceRangeFilter priceRangeFilter) {
        java.lang.String strAhwBna = priceRangeFilter != null ? priceRangeFilter.AhwBna() : null;
        return strAhwBna == null ? "" : strAhwBna;
    }

    public static final java.lang.String copydefault(PriceRangeFilter priceRangeFilter) {
        java.lang.String strOLrzqt = priceRangeFilter != null ? priceRangeFilter.OLrzqt() : null;
        return strOLrzqt == null ? "" : strOLrzqt;
    }

    private final void OLrzqt(java.lang.String str, java.lang.String str2) {
        boolean zCopydefault = copydefault(str, str2);
        AppCompatTextView appCompatTextView = KWHzl().djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(zCopydefault ^ true ? 0 : 8);
        if (!zCopydefault) {
            C55008xbo c55008xbo = KWHzl().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            KWHzl(c55008xbo);
            C55008xbo c55008xbo2 = KWHzl().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            KWHzl(c55008xbo2);
            InterfaceC34548neE interfaceC34548neE = this.copydefault;
            if (interfaceC34548neE != null) {
                interfaceC34548neE.AEQbTJ(new PriceRangeFilter((java.lang.String) null, (java.lang.String) null, (TokenAgeType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 127, (DefaultConstructorMarker) null), false);
                return;
            }
            return;
        }
        KWHzl().AEQbTJ.values();
        KWHzl().OLrzqt.values();
        C34652ngD c34652ngD = C34652ngD.KWHzl;
        PriceRangeFilter priceRangeFilter = new PriceRangeFilter(c34652ngD.EZpvd() ? str : c34652ngD.copydefault(str), c34652ngD.EZpvd() ? str2 : c34652ngD.copydefault(str2), (TokenAgeType) null, (java.lang.String) null, str, str2, false, 76, (DefaultConstructorMarker) null);
        InterfaceC34548neE interfaceC34548neE2 = this.copydefault;
        if (interfaceC34548neE2 != null) {
            interfaceC34548neE2.AEQbTJ(priceRangeFilter, true);
        }
    }

    private final boolean copydefault(java.lang.String str, java.lang.String str2) {
        if (str.length() == 0) {
            return true;
        }
        return str2.length() == 0 || C33129mqd.gEmmrt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), java.lang.Double.valueOf(C33129mqd.AEQbTJ(str2)));
    }

    private final java.lang.String KWHzl(boolean z) {
        java.lang.String string;
        java.lang.String symbol = mRJ.AEQbTJ.EZpvd().getSymbol();
        if (z) {
            string = getContext().getString(C35964oKf.Fragment.iKEqwx);
        } else {
            string = getContext().getString(C35964oKf.Fragment.DKtBnz);
        }
        Intrinsics.copydefault((java.lang.Object) string);
        return string + " (" + symbol + ")";
    }

    public static /* synthetic */ void resetInputField$default(C34553neJ c34553neJ, C55008xbo c55008xbo, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c34553neJ.EZpvd(c55008xbo, str);
    }

    private final void EZpvd(C55008xbo c55008xbo, java.lang.String str) {
        c55008xbo.clearFocus();
        C34652ngD.KWHzl.AEQbTJ(str);
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
        java.lang.String strSubstring = str.substring(0, java.lang.Math.min(str.length(), length + this.OLrzqt + 1));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    private final void KWHzl(C55008xbo c55008xbo) {
        c55008xbo.setState(2);
        c55008xbo.setErrorShowing(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C33054mpH.OLrzqt(context, KWHzl().AEQbTJ);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C33054mpH.OLrzqt(context2, KWHzl().OLrzqt);
    }

    public final void copydefault(boolean z) {
        oOA ooaKWHzl = KWHzl();
        android.widget.TextView textView = ooaKWHzl.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat = KWHzl().KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        C55296xhK.OLrzqt(linearLayoutCompat, java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(z ? 0.0f : 12.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f));
        int i = z ? 9 : 2;
        this.OLrzqt = i;
        C55001xbh c55001xbhAkhnZx = ooaKWHzl.AEQbTJ.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setMaxDecimalValue(i);
        }
        C55001xbh c55001xbhAkhnZx2 = ooaKWHzl.OLrzqt.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.setMaxDecimalValue(i);
        }
    }

    /* JADX INFO: renamed from: o.neJ$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.neJ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
