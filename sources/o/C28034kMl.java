package o;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.market.common.constants.RangeType;
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

/* JADX INFO: renamed from: o.kMl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28034kMl extends android.widget.FrameLayout implements InterfaceC28026kMd {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final LinkedHashMap<java.lang.String, PriceRangeFilter> EZpvd;
    public InterfaceC28023kMa OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28034kMl(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28034kMl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
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
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: o.kMl.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C28034kMl(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28034kMl(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.kMn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28034kMl.OLrzqt(context, this);
            }
        });
        this.EZpvd = new LinkedHashMap<>();
        C55008xbo c55008xbo = AEQbTJ().KWHzl;
        c55008xbo.setLabelText(getInputFieldHint$default(this, true, null, false, 6, null));
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            C33606mzd.AEQbTJ(c55001xbhAkhnZx, new Function1() { // from class: o.kMm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28034kMl.copydefault(this.copydefault, (java.lang.CharSequence) obj);
                }
            });
        }
        C55008xbo c55008xbo2 = AEQbTJ().copydefault;
        c55008xbo2.setLabelText(getInputFieldHint$default(this, false, null, false, 6, null));
        C55001xbh c55001xbhAkhnZx2 = c55008xbo2.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            C33606mzd.AEQbTJ(c55001xbhAkhnZx2, new Function1() { // from class: o.kMp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28034kMl.KWHzl(this.EZpvd, (java.lang.CharSequence) obj);
                }
            });
        }
    }

    private final C21652hHh AEQbTJ() {
        return (C21652hHh) this.AEQbTJ.getValue();
    }

    public static final C21652hHh OLrzqt(android.content.Context context, C28034kMl c28034kMl) {
        return C21652hHh.copydefault(android.view.LayoutInflater.from(context), c28034kMl, true);
    }

    public static final Unit copydefault(C28034kMl c28034kMl, java.lang.CharSequence charSequence) {
        java.lang.String strValueOf = java.lang.String.valueOf(charSequence);
        if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) strValueOf, '.', false, 2, (java.lang.Object) null)) {
            strValueOf = C59454zhO.DbNXlk(strValueOf, 1);
        }
        C55001xbh c55001xbhAkhnZx = c28034kMl.AEQbTJ().copydefault.AkhnZx();
        c28034kMl.EZpvd(strValueOf, java.lang.String.valueOf(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.getText() : null));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C28034kMl c28034kMl, java.lang.CharSequence charSequence) {
        java.lang.String strValueOf = java.lang.String.valueOf(charSequence);
        if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) strValueOf, '.', false, 2, (java.lang.Object) null)) {
            strValueOf = C59454zhO.DbNXlk(strValueOf, 1);
        }
        C55001xbh c55001xbhAkhnZx = c28034kMl.AEQbTJ().KWHzl.AkhnZx();
        c28034kMl.EZpvd(java.lang.String.valueOf(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.getText() : null), strValueOf);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC28026kMd
    public void setData(@NotNull java.util.List<PriceRangeFilter> list, PriceRangeFilter priceRangeFilter, TokenFilter tokenFilter) {
        java.lang.String strDbNXlk;
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd.clear();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.EZpvd.put(C31193lpR.AEQbTJ.KWHzl(), (PriceRangeFilter) it.next());
        }
        int i = ((tokenFilter == null || (strDbNXlk = tokenFilter.DbNXlk()) == null) ? null : RangeType.Companion.OLrzqt(strDbNXlk)) == RangeType.CHANGE ? 2 : 0;
        C55008xbo c55008xbo = AEQbTJ().KWHzl;
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setMaxDecimalValue(i);
        }
        c55008xbo.setLabelText(getInputFieldHint$default(this, true, tokenFilter, false, 4, null));
        C55008xbo c55008xbo2 = AEQbTJ().copydefault;
        C55001xbh c55001xbhAkhnZx2 = c55008xbo2.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.setMaxDecimalValue(i);
        }
        c55008xbo2.setLabelText(getInputFieldHint$default(this, false, tokenFilter, false, 4, null));
        copydefault(priceRangeFilter);
    }

    private final void copydefault(PriceRangeFilter priceRangeFilter) {
        C55008xbo c55008xbo = AEQbTJ().KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        java.lang.String strAhwBna = priceRangeFilter != null ? priceRangeFilter.AhwBna() : null;
        if (strAhwBna == null) {
            strAhwBna = "";
        }
        AEQbTJ(c55008xbo, strAhwBna);
        C55008xbo c55008xbo2 = AEQbTJ().copydefault;
        Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
        java.lang.String strKWHzl = priceRangeFilter != null ? priceRangeFilter.KWHzl() : null;
        AEQbTJ(c55008xbo2, strKWHzl != null ? strKWHzl : "");
    }

    private final void EZpvd(java.lang.String str, java.lang.String str2) {
        boolean zCopydefault = copydefault(str, str2);
        AppCompatTextView appCompatTextView = AEQbTJ().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(zCopydefault ^ true ? 0 : 8);
        if (!zCopydefault) {
            C55008xbo c55008xbo = AEQbTJ().KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            AEQbTJ(c55008xbo);
            C55008xbo c55008xbo2 = AEQbTJ().copydefault;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            AEQbTJ(c55008xbo2);
            InterfaceC28023kMa interfaceC28023kMa = this.OLrzqt;
            if (interfaceC28023kMa != null) {
                interfaceC28023kMa.AEQbTJ(new PriceRangeFilter((java.lang.String) null, (java.lang.String) null, (TokenAgeType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 127, (DefaultConstructorMarker) null), false);
                return;
            }
            return;
        }
        AEQbTJ().KWHzl.values();
        AEQbTJ().copydefault.values();
        PriceRangeFilter priceRangeFilter = new PriceRangeFilter(str, str2, (TokenAgeType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 124, (DefaultConstructorMarker) null);
        InterfaceC28023kMa interfaceC28023kMa2 = this.OLrzqt;
        if (interfaceC28023kMa2 != null) {
            interfaceC28023kMa2.AEQbTJ(priceRangeFilter, true);
        }
    }

    private final boolean copydefault(java.lang.String str, java.lang.String str2) {
        if (str.length() == 0) {
            return true;
        }
        return str2.length() == 0 || C33129mqd.gEmmrt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), java.lang.Double.valueOf(C33129mqd.AEQbTJ(str2)));
    }

    public static /* synthetic */ java.lang.String getInputFieldHint$default(C28034kMl c28034kMl, boolean z, TokenFilter tokenFilter, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            tokenFilter = null;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return c28034kMl.EZpvd(z, tokenFilter, z2);
    }

    public final java.lang.String EZpvd(boolean z, TokenFilter tokenFilter, boolean z2) {
        java.lang.String strAYXKKw;
        java.lang.String string;
        java.lang.String strDbNXlk;
        if (((tokenFilter == null || (strDbNXlk = tokenFilter.DbNXlk()) == null) ? null : RangeType.Companion.OLrzqt(strDbNXlk)) == RangeType.CHANGE) {
            strAYXKKw = "%";
        } else {
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

    public static /* synthetic */ void resetInputField$default(C28034kMl c28034kMl, C55008xbo c55008xbo, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c28034kMl.AEQbTJ(c55008xbo, str);
    }

    private final void AEQbTJ(C55008xbo c55008xbo, java.lang.String str) {
        c55008xbo.clearFocus();
        c55008xbo.setText(KWHzl(str));
    }

    private final java.lang.String KWHzl(java.lang.String str) {
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

    private final void AEQbTJ(C55008xbo c55008xbo) {
        c55008xbo.setState(2);
        c55008xbo.setErrorShowing(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C33054mpH.OLrzqt(context, AEQbTJ().KWHzl);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C33054mpH.OLrzqt(context2, AEQbTJ().copydefault);
    }

    public final void EZpvd(boolean z) {
        C55008xbo c55008xbo = AEQbTJ().copydefault;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        c55008xbo.setVisibility(z ? 0 : 8);
    }

    public final void setInputFieldGap(float f) {
        C21652hHh c21652hHhAEQbTJ = AEQbTJ();
        ViewGroup.LayoutParams layoutParams = c21652hHhAEQbTJ.KWHzl.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        float f2 = f / 2;
        marginLayoutParams.setMarginEnd(C55298xhM.dp2px$default(f2, null, 1, null));
        c21652hHhAEQbTJ.KWHzl.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams2 = c21652hHhAEQbTJ.copydefault.getLayoutParams();
        Intrinsics.copydefault(layoutParams2, "");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMarginStart(C55298xhM.dp2px$default(f2, null, 1, null));
        c21652hHhAEQbTJ.copydefault.setLayoutParams(marginLayoutParams2);
    }

    public final void setValues(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C55001xbh c55001xbhAkhnZx = AEQbTJ().KWHzl.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setText(str);
        }
        C55001xbh c55001xbhAkhnZx2 = AEQbTJ().copydefault.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.setText(str2);
        }
    }

    public final void setStartHint(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ().KWHzl.setLabelText(str);
    }

    /* JADX INFO: renamed from: o.kMl$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kMl.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
