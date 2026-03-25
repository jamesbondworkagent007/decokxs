package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.market.common.constants.TokenAgeType;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kMr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28040kMr extends android.widget.FrameLayout implements InterfaceC28026kMd {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public PriceRangeFilter EZpvd;
    public final LinkedHashMap<java.lang.String, PriceRangeFilter> KWHzl;
    public InterfaceC28023kMa OLrzqt;
    public Function0<Unit> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28040kMr(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28040kMr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
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
        this.gEmmrt = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:35) call: o.kMr.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C28040kMr(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28040kMr(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.kMt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28040kMr.KWHzl(context, this);
            }
        });
        this.KWHzl = new LinkedHashMap<>();
        AEQbTJ().copydefault.setCallback(new AnonymousClass3());
        C55008xbo c55008xbo = AEQbTJ().AEQbTJ;
        c55008xbo.setLabelText(OLrzqt(true));
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setMaxDecimalValue(2);
        }
        C55001xbh c55001xbhAkhnZx2 = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            C33606mzd.AEQbTJ(c55001xbhAkhnZx2, new Function1() { // from class: o.kMu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28040kMr.AEQbTJ(this.EZpvd, (java.lang.CharSequence) obj);
                }
            });
        }
        C55008xbo c55008xbo2 = AEQbTJ().EZpvd;
        c55008xbo2.setLabelText(OLrzqt(false));
        C55001xbh c55001xbhAkhnZx3 = c55008xbo2.AkhnZx();
        if (c55001xbhAkhnZx3 != null) {
            c55001xbhAkhnZx3.setMaxDecimalValue(2);
        }
        C55001xbh c55001xbhAkhnZx4 = c55008xbo2.AkhnZx();
        if (c55001xbhAkhnZx4 != null) {
            C33606mzd.AEQbTJ(c55001xbhAkhnZx4, new Function1() { // from class: o.kMx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28040kMr.OLrzqt(this.EZpvd, (java.lang.CharSequence) obj);
                }
            });
        }
    }

    private final C21654hHj AEQbTJ() {
        return (C21654hHj) this.AEQbTJ.getValue();
    }

    public static final C21654hHj KWHzl(android.content.Context context, C28040kMr c28040kMr) {
        return C21654hHj.KWHzl(android.view.LayoutInflater.from(context), c28040kMr, true);
    }

    /* JADX INFO: renamed from: o.kMr$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 implements InterfaceC28053kNd, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC28053kNd) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, C28040kMr.this, C28040kMr.class, "onPickedMinValue", "onPickedMinValue(Ljava/lang/String;)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28053kNd
        public final void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C28040kMr.this.KWHzl(str);
        }
    }

    public static final Unit AEQbTJ(C28040kMr c28040kMr, java.lang.CharSequence charSequence) {
        java.lang.String strValueOf = java.lang.String.valueOf(charSequence);
        if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) strValueOf, '.', false, 2, (java.lang.Object) null)) {
            strValueOf = C59454zhO.DbNXlk(strValueOf, 1);
        }
        C55001xbh c55001xbhAkhnZx = c28040kMr.AEQbTJ().EZpvd.AkhnZx();
        c28040kMr.EZpvd(strValueOf, java.lang.String.valueOf(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.getText() : null));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C28040kMr c28040kMr, java.lang.CharSequence charSequence) {
        java.lang.String strValueOf = java.lang.String.valueOf(charSequence);
        if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) strValueOf, '.', false, 2, (java.lang.Object) null)) {
            strValueOf = C59454zhO.DbNXlk(strValueOf, 1);
        }
        C55001xbh c55001xbhAkhnZx = c28040kMr.AEQbTJ().AEQbTJ.AkhnZx();
        c28040kMr.EZpvd(java.lang.String.valueOf(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.getText() : null), strValueOf);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC28026kMd
    public void setData(@NotNull java.util.List<PriceRangeFilter> list, final PriceRangeFilter priceRangeFilter, TokenFilter tokenFilter) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl.clear();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.KWHzl.put(C31193lpR.AEQbTJ.KWHzl(), (PriceRangeFilter) it.next());
        }
        this.EZpvd = priceRangeFilter;
        java.lang.String strKWHzl = C31256lqb.KWHzl(priceRangeFilter != null ? priceRangeFilter.OLrzqt() : null, (Function0<java.lang.String>) new Function0() { // from class: o.kMq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28040kMr.AhwBna(priceRangeFilter);
            }
        });
        java.lang.String strKWHzl2 = C31256lqb.KWHzl(priceRangeFilter != null ? priceRangeFilter.AEQbTJ() : null, (Function0<java.lang.String>) new Function0() { // from class: o.kMw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28040kMr.valueOf(priceRangeFilter);
            }
        });
        C31191lpP c31191lpP = C31191lpP.copydefault;
        if (!c31191lpP.KWHzl()) {
            strKWHzl = c31191lpP.AEQbTJ(strKWHzl);
        }
        if (!c31191lpP.KWHzl()) {
            strKWHzl2 = c31191lpP.AEQbTJ(strKWHzl2);
        }
        java.util.Set<Map.Entry<java.lang.String, PriceRangeFilter>> setEntrySet = this.KWHzl.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        java.util.Iterator<T> it2 = setEntrySet.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            Map.Entry entry = (Map.Entry) next;
            if (Intrinsics.EZpvd((java.lang.Object) (strKWHzl + strKWHzl2), (java.lang.Object) (((PriceRangeFilter) entry.getValue()).AhwBna() + ((PriceRangeFilter) entry.getValue()).KWHzl()))) {
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        java.lang.String str = entry2 != null ? (java.lang.String) entry2.getKey() : null;
        AEQbTJ(str != null ? str : "");
        AYXKKw(priceRangeFilter);
    }

    public static final java.lang.String AhwBna(PriceRangeFilter priceRangeFilter) {
        java.lang.String strAhwBna = priceRangeFilter != null ? priceRangeFilter.AhwBna() : null;
        return strAhwBna == null ? "" : strAhwBna;
    }

    public static final java.lang.String valueOf(PriceRangeFilter priceRangeFilter) {
        java.lang.String strKWHzl = priceRangeFilter != null ? priceRangeFilter.KWHzl() : null;
        return strKWHzl == null ? "" : strKWHzl;
    }

    private final void AEQbTJ(java.lang.String str) {
        java.util.Set<Map.Entry<java.lang.String, PriceRangeFilter>> setEntrySet = this.KWHzl.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        java.util.Set<Map.Entry<java.lang.String, PriceRangeFilter>> set = setEntrySet;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(set, 10));
        java.util.Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "");
            arrayList.add(new C28060kNk((java.lang.String) key, null, OLrzqt(((PriceRangeFilter) entry.getValue()).AhwBna()), false, 2, null));
        }
        AEQbTJ().copydefault.setData(arrayList, str);
    }

    private final void AYXKKw(final PriceRangeFilter priceRangeFilter) {
        C55008xbo c55008xbo = AEQbTJ().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        KWHzl(c55008xbo, C31256lqb.KWHzl(priceRangeFilter != null ? priceRangeFilter.OLrzqt() : null, (Function0<java.lang.String>) new Function0() { // from class: o.kMo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28040kMr.OLrzqt(priceRangeFilter);
            }
        }));
        C55008xbo c55008xbo2 = AEQbTJ().EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
        KWHzl(c55008xbo2, C31256lqb.KWHzl(priceRangeFilter != null ? priceRangeFilter.AEQbTJ() : null, (Function0<java.lang.String>) new Function0() { // from class: o.kMs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28040kMr.gEmmrt(priceRangeFilter);
            }
        }));
    }

    public static final java.lang.String OLrzqt(PriceRangeFilter priceRangeFilter) {
        java.lang.String strAhwBna = priceRangeFilter != null ? priceRangeFilter.AhwBna() : null;
        return strAhwBna == null ? "" : strAhwBna;
    }

    public static final java.lang.String gEmmrt(PriceRangeFilter priceRangeFilter) {
        java.lang.String strKWHzl = priceRangeFilter != null ? priceRangeFilter.KWHzl() : null;
        return strKWHzl == null ? "" : strKWHzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(java.lang.String str) {
        PriceRangeFilter priceRangeFilter = this.KWHzl.get(str);
        java.lang.String strAhwBna = priceRangeFilter != null ? priceRangeFilter.AhwBna() : null;
        if (strAhwBna == null) {
            strAhwBna = "";
        }
        if (!C31191lpP.copydefault.KWHzl()) {
            strAhwBna = C23272hvB.getShowOriginData$default(C23272hvB.KWHzl, strAhwBna, null, 2, null);
        }
        C55008xbo c55008xbo = AEQbTJ().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        KWHzl(c55008xbo, strAhwBna);
        C55008xbo c55008xbo2 = AEQbTJ().EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
        resetInputField$default(this, c55008xbo2, null, 2, null);
        Function0<Unit> function0 = this.gEmmrt;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void EZpvd(java.lang.String str, java.lang.String str2) {
        boolean zCopydefault = copydefault(str, str2);
        AppCompatTextView appCompatTextView = AEQbTJ().djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(zCopydefault ^ true ? 0 : 8);
        if (!zCopydefault) {
            C55008xbo c55008xbo = AEQbTJ().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            AEQbTJ(c55008xbo);
            C55008xbo c55008xbo2 = AEQbTJ().EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            AEQbTJ(c55008xbo2);
            InterfaceC28023kMa interfaceC28023kMa = this.OLrzqt;
            if (interfaceC28023kMa != null) {
                interfaceC28023kMa.AEQbTJ(new PriceRangeFilter((java.lang.String) null, (java.lang.String) null, (TokenAgeType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 127, (DefaultConstructorMarker) null), false);
                return;
            }
            return;
        }
        AEQbTJ().AEQbTJ.values();
        AEQbTJ().EZpvd.values();
        C31191lpP c31191lpP = C31191lpP.copydefault;
        PriceRangeFilter priceRangeFilter = new PriceRangeFilter(c31191lpP.KWHzl() ? str : c31191lpP.AEQbTJ(str), c31191lpP.KWHzl() ? str2 : c31191lpP.AEQbTJ(str2), (TokenAgeType) null, (java.lang.String) null, str, str2, false, 76, (DefaultConstructorMarker) null);
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

    private final android.text.SpannedString OLrzqt(java.lang.String str) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int i = C23274hvD.Fragment.lambdanew1;
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        java.lang.String strKWHzl = C33069mpW.KWHzl(context, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", C23272hvB.getShowUSDData$default(c23272hvB, str, true, false, null, false, 12, null))));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        android.text.style.TextAppearanceSpan textAppearanceSpan = new android.text.style.TextAppearanceSpan(getContext(), C52761wXj.LoaderManager.zuBGHE);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) strKWHzl);
        spannableStringBuilder.setSpan(textAppearanceSpan, length, spannableStringBuilder.length(), 17);
        if (!C31191lpP.copydefault.KWHzl()) {
            java.lang.String str2 = "\n" + C23272hvB.formatScientificCurrency$default(c23272hvB, str, true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
            android.text.style.TextAppearanceSpan textAppearanceSpan2 = new android.text.style.TextAppearanceSpan(getContext(), C52761wXj.LoaderManager.QOLQEE);
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            java.lang.Object[] objArr = {textAppearanceSpan2, new android.text.style.ForegroundColorSpan(C25382ivf.KWHzl(context2, C52761wXj.Activity.QwvEab))};
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) str2);
            for (int i2 = 0; i2 < 2; i2++) {
                spannableStringBuilder.setSpan(objArr[i2], length2, spannableStringBuilder.length(), 17);
            }
        }
        return new android.text.SpannedString(spannableStringBuilder);
    }

    private final java.lang.String OLrzqt(boolean z) {
        java.lang.String string;
        java.lang.String symbol = C23272hvB.KWHzl.OLrzqt().getSymbol();
        if (z) {
            string = getContext().getString(C23274hvD.Fragment.ardYFU);
        } else {
            string = getContext().getString(C23274hvD.Fragment.zbGDDc);
        }
        Intrinsics.copydefault((java.lang.Object) string);
        return string + " (" + symbol + ")";
    }

    public static /* synthetic */ void resetInputField$default(C28040kMr c28040kMr, C55008xbo c55008xbo, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c28040kMr.KWHzl(c55008xbo, str);
    }

    private final void KWHzl(C55008xbo c55008xbo, java.lang.String str) {
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
        java.lang.String strSubstring = str.substring(0, java.lang.Math.min(str.length(), length + 3));
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
        C33054mpH.OLrzqt(context, AEQbTJ().AEQbTJ);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C33054mpH.OLrzqt(context2, AEQbTJ().EZpvd);
    }

    /* JADX INFO: renamed from: o.kMr$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kMr.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
