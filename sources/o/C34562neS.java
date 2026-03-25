package o;

import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.dexkline.market.common.constants.RangeType;
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

/* JADX INFO: renamed from: o.neS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34562neS extends android.widget.FrameLayout implements InterfaceC34552neI {
    public InterfaceC34548neE EZpvd;
    public final LinkedHashMap<java.lang.String, PriceRangeFilter> KWHzl;
    public final InterfaceC56387yDm copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34562neS(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34562neS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC34552neI
    public void setCallback(@NotNull InterfaceC34548neE interfaceC34548neE) {
        Intrinsics.checkNotNullParameter(interfaceC34548neE, "");
        this.EZpvd = interfaceC34548neE;
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
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:24) call: o.neS.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C34562neS(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34562neS(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.neX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34562neS.KWHzl(context, this);
            }
        });
        this.KWHzl = new LinkedHashMap<>();
        C55008xbo c55008xbo = AEQbTJ().AEQbTJ;
        c55008xbo.setLabelText(getInputFieldHint$default(this, true, null, 2, null));
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            C33606mzd.AEQbTJ(c55001xbhAkhnZx, new Function1() { // from class: o.neV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34562neS.OLrzqt(this.KWHzl, (java.lang.CharSequence) obj);
                }
            });
        }
        C55008xbo c55008xbo2 = AEQbTJ().EZpvd;
        c55008xbo2.setLabelText(getInputFieldHint$default(this, false, null, 2, null));
        C55001xbh c55001xbhAkhnZx2 = c55008xbo2.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            C33606mzd.AEQbTJ(c55001xbhAkhnZx2, new Function1() { // from class: o.neT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34562neS.KWHzl(this.copydefault, (java.lang.CharSequence) obj);
                }
            });
        }
    }

    private final C36091oOy AEQbTJ() {
        return (C36091oOy) this.copydefault.getValue();
    }

    public static final C36091oOy KWHzl(android.content.Context context, C34562neS c34562neS) {
        return C36091oOy.KWHzl(android.view.LayoutInflater.from(context), c34562neS, true);
    }

    public static final Unit OLrzqt(C34562neS c34562neS, java.lang.CharSequence charSequence) {
        java.lang.String strValueOf = java.lang.String.valueOf(charSequence);
        if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) strValueOf, '.', false, 2, (java.lang.Object) null)) {
            strValueOf = C59454zhO.DbNXlk(strValueOf, 1);
        }
        C55001xbh c55001xbhAkhnZx = c34562neS.AEQbTJ().EZpvd.AkhnZx();
        c34562neS.OLrzqt(strValueOf, java.lang.String.valueOf(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.getText() : null));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C34562neS c34562neS, java.lang.CharSequence charSequence) {
        java.lang.String strValueOf = java.lang.String.valueOf(charSequence);
        if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) strValueOf, '.', false, 2, (java.lang.Object) null)) {
            strValueOf = C59454zhO.DbNXlk(strValueOf, 1);
        }
        C55001xbh c55001xbhAkhnZx = c34562neS.AEQbTJ().AEQbTJ.AkhnZx();
        c34562neS.OLrzqt(java.lang.String.valueOf(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.getText() : null), strValueOf);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC34552neI
    public void setData(@NotNull java.util.List<PriceRangeFilter> list, PriceRangeFilter priceRangeFilter, TokenFilter tokenFilter) {
        java.lang.String strIsConnected;
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl.clear();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.KWHzl.put(C34655ngG.copydefault.OLrzqt(), (PriceRangeFilter) it.next());
        }
        int i = ((tokenFilter == null || (strIsConnected = tokenFilter.isConnected()) == null) ? null : RangeType.Companion.copydefault(strIsConnected)) == RangeType.CHANGE ? 2 : 0;
        C55008xbo c55008xbo = AEQbTJ().AEQbTJ;
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setMaxDecimalValue(i);
        }
        c55008xbo.setLabelText(OLrzqt(true, tokenFilter));
        C55008xbo c55008xbo2 = AEQbTJ().EZpvd;
        C55001xbh c55001xbhAkhnZx2 = c55008xbo2.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.setMaxDecimalValue(i);
        }
        c55008xbo2.setLabelText(OLrzqt(false, tokenFilter));
        OLrzqt(priceRangeFilter);
    }

    private final void OLrzqt(PriceRangeFilter priceRangeFilter) {
        C55008xbo c55008xbo = AEQbTJ().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        java.lang.String strAhwBna = priceRangeFilter != null ? priceRangeFilter.AhwBna() : null;
        if (strAhwBna == null) {
            strAhwBna = "";
        }
        OLrzqt(c55008xbo, strAhwBna);
        C55008xbo c55008xbo2 = AEQbTJ().EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
        java.lang.String strOLrzqt = priceRangeFilter != null ? priceRangeFilter.OLrzqt() : null;
        OLrzqt(c55008xbo2, strOLrzqt != null ? strOLrzqt : "");
    }

    private final void OLrzqt(java.lang.String str, java.lang.String str2) {
        boolean zEZpvd = EZpvd(str, str2);
        AppCompatTextView appCompatTextView = AEQbTJ().KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(zEZpvd ^ true ? 0 : 8);
        if (!zEZpvd) {
            C55008xbo c55008xbo = AEQbTJ().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            OLrzqt(c55008xbo);
            C55008xbo c55008xbo2 = AEQbTJ().EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            OLrzqt(c55008xbo2);
            InterfaceC34548neE interfaceC34548neE = this.EZpvd;
            if (interfaceC34548neE != null) {
                interfaceC34548neE.AEQbTJ(new PriceRangeFilter((java.lang.String) null, (java.lang.String) null, (TokenAgeType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 127, (DefaultConstructorMarker) null), false);
                return;
            }
            return;
        }
        AEQbTJ().AEQbTJ.values();
        AEQbTJ().EZpvd.values();
        PriceRangeFilter priceRangeFilter = new PriceRangeFilter(str, str2, (TokenAgeType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 124, (DefaultConstructorMarker) null);
        InterfaceC34548neE interfaceC34548neE2 = this.EZpvd;
        if (interfaceC34548neE2 != null) {
            interfaceC34548neE2.AEQbTJ(priceRangeFilter, true);
        }
    }

    private final boolean EZpvd(java.lang.String str, java.lang.String str2) {
        if (str.length() == 0) {
            return true;
        }
        return str2.length() == 0 || C33129mqd.gEmmrt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), java.lang.Double.valueOf(C33129mqd.AEQbTJ(str2)));
    }

    public static /* synthetic */ java.lang.String getInputFieldHint$default(C34562neS c34562neS, boolean z, TokenFilter tokenFilter, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            tokenFilter = null;
        }
        return c34562neS.OLrzqt(z, tokenFilter);
    }

    public final java.lang.String OLrzqt(boolean z, TokenFilter tokenFilter) {
        java.lang.String string;
        java.lang.String strIsConnected;
        java.lang.String str = ((tokenFilter == null || (strIsConnected = tokenFilter.isConnected()) == null) ? null : RangeType.Companion.copydefault(strIsConnected)) == RangeType.CHANGE ? "%" : "";
        if (z) {
            string = getContext().getString(C35964oKf.Fragment.iKEqwx);
        } else {
            string = getContext().getString(C35964oKf.Fragment.DKtBnz);
        }
        Intrinsics.copydefault((java.lang.Object) string);
        if (str.length() == 0) {
            return string;
        }
        return string + " (" + str + ")";
    }

    public static /* synthetic */ void resetInputField$default(C34562neS c34562neS, C55008xbo c55008xbo, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c34562neS.OLrzqt(c55008xbo, str);
    }

    private final void OLrzqt(C55008xbo c55008xbo, java.lang.String str) {
        c55008xbo.clearFocus();
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
        java.lang.String strSubstring = str.substring(0, java.lang.Math.min(str.length(), length + 1));
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
        C33054mpH.OLrzqt(context, AEQbTJ().AEQbTJ);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C33054mpH.OLrzqt(context2, AEQbTJ().EZpvd);
    }

    /* JADX INFO: renamed from: o.neS$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.neS.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
