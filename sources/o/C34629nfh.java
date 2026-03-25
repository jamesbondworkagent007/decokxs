package o;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.dexkline.market.common.constants.TokenAgeType;
import com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nfh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34629nfh extends android.widget.FrameLayout implements InterfaceC34552neI {
    public final InterfaceC56387yDm AEQbTJ;
    public final LinkedHashMap<java.lang.String, PriceRangeFilter> EZpvd;
    public InterfaceC34548neE OLrzqt;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34629nfh(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34629nfh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC34552neI
    public void setCallback(@NotNull InterfaceC34548neE interfaceC34548neE) {
        Intrinsics.checkNotNullParameter(interfaceC34548neE, "");
        this.OLrzqt = interfaceC34548neE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC34552neI
    public void setSelectionDismissCallback(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:28) call: o.nfh.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C34629nfh(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34629nfh(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.nfd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34629nfh.OLrzqt(context, this);
            }
        });
        this.EZpvd = new LinkedHashMap<>();
        KWHzl().copydefault.setCallback(new AnonymousClass2());
    }

    private final oOG KWHzl() {
        return (oOG) this.AEQbTJ.getValue();
    }

    public static final oOG OLrzqt(android.content.Context context, C34629nfh c34629nfh) {
        return oOG.EZpvd(android.view.LayoutInflater.from(context), c34629nfh, true);
    }

    /* JADX INFO: renamed from: o.nfh$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 implements InterfaceC34596nfA, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC34596nfA) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, C34629nfh.this, C34629nfh.class, "onPickedMinValue", "onPickedMinValue(Ljava/lang/String;)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC34596nfA
        public final void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C34629nfh.this.AEQbTJ(str);
        }
    }

    @Override // o.InterfaceC34552neI
    public void setData(@NotNull java.util.List<PriceRangeFilter> list, PriceRangeFilter priceRangeFilter, TokenFilter tokenFilter) {
        java.lang.Object next;
        PriceRangeFilter priceRangeFilterAYXKKw;
        PriceRangeFilter priceRangeFilterAYXKKw2;
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd.clear();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.EZpvd.put(C34655ngG.copydefault.OLrzqt(), (PriceRangeFilter) it.next());
        }
        java.util.Set<Map.Entry<java.lang.String, PriceRangeFilter>> setEntrySet = this.EZpvd.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        java.util.Iterator<T> it2 = setEntrySet.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            Map.Entry entry = (Map.Entry) next;
            if (Intrinsics.EZpvd((java.lang.Object) (((tokenFilter == null || (priceRangeFilterAYXKKw2 = tokenFilter.AYXKKw()) == null) ? null : priceRangeFilterAYXKKw2.AhwBna()) + ((tokenFilter == null || (priceRangeFilterAYXKKw = tokenFilter.AYXKKw()) == null) ? null : priceRangeFilterAYXKKw.OLrzqt())), (java.lang.Object) (((PriceRangeFilter) entry.getValue()).AhwBna() + ((PriceRangeFilter) entry.getValue()).OLrzqt()))) {
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        java.lang.String str = entry2 != null ? (java.lang.String) entry2.getKey() : null;
        if (str == null) {
            str = "";
        }
        OLrzqt(str);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            PriceRangeFilter priceRangeFilter2 = this.EZpvd.get(str);
            java.lang.String strAhwBna = priceRangeFilter2 != null ? priceRangeFilter2.AhwBna() : null;
            java.lang.String str2 = strAhwBna == null ? "" : strAhwBna;
            java.lang.String strOLrzqt = priceRangeFilter2 != null ? priceRangeFilter2.OLrzqt() : null;
            PriceRangeFilter priceRangeFilter3 = new PriceRangeFilter(str2, strOLrzqt == null ? "" : strOLrzqt, priceRangeFilter2 != null ? priceRangeFilter2.valueOf() : null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 120, (DefaultConstructorMarker) null);
            InterfaceC34548neE interfaceC34548neE = this.OLrzqt;
            if (interfaceC34548neE != null) {
                interfaceC34548neE.AEQbTJ(priceRangeFilter3, true);
            }
        }
    }

    private final void OLrzqt(java.lang.String str) {
        java.util.Set<Map.Entry<java.lang.String, PriceRangeFilter>> setEntrySet = this.EZpvd.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        java.util.Set<Map.Entry<java.lang.String, PriceRangeFilter>> set = setEntrySet;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(set, 10));
        java.util.Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "");
            java.lang.Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            arrayList.add(new C34600nfE((java.lang.String) key, null, copydefault((PriceRangeFilter) value), false, 2, null));
        }
        KWHzl().copydefault.setData(arrayList, str);
    }

    public final android.text.SpannedString copydefault(PriceRangeFilter priceRangeFilter) {
        kotlin.Pair pairOLrzqt;
        java.lang.String strKWHzl;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) priceRangeFilter.AhwBna())) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C35964oKf.Fragment.invokespecialODCBUN), priceRangeFilter.AhwBna());
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C35964oKf.Fragment.invokespecialDPHOMC), priceRangeFilter.OLrzqt());
        }
        TokenAgeType.Companion companion = TokenAgeType.Companion;
        TokenAgeType tokenAgeTypeValueOf = priceRangeFilter.valueOf();
        if (tokenAgeTypeValueOf == null) {
            tokenAgeTypeValueOf = TokenAgeType.DAY;
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(companion.EZpvd(tokenAgeTypeValueOf));
        if (priceRangeFilter.valueOf() != null) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            strKWHzl = C33069mpW.KWHzl(context, ((java.lang.Number) pairOLrzqt.getFirst()).intValue(), (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, pairOLrzqt.getSecond() + strAYXKKw)));
        } else {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            strKWHzl = C33069mpW.KWHzl(context2, ((java.lang.Number) pairOLrzqt.getFirst()).intValue(), (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, pairOLrzqt.getSecond())));
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        android.text.style.TextAppearanceSpan textAppearanceSpan = new android.text.style.TextAppearanceSpan(getContext(), C52761wXj.LoaderManager.zuBGHE);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) strKWHzl);
        spannableStringBuilder.setSpan(textAppearanceSpan, length, spannableStringBuilder.length(), 17);
        android.text.style.TextAppearanceSpan textAppearanceSpan2 = new android.text.style.TextAppearanceSpan(getContext(), C52761wXj.LoaderManager.QOLQEE);
        android.content.Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        java.lang.Object[] objArr = {textAppearanceSpan2, new android.text.style.ForegroundColorSpan(mUM.EZpvd(context3, C52761wXj.Activity.QwvEab))};
        int length2 = spannableStringBuilder.length();
        for (int i = 0; i < 2; i++) {
            spannableStringBuilder.setSpan(objArr[i], length2, spannableStringBuilder.length(), 17);
        }
        return new android.text.SpannedString(spannableStringBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(java.lang.String str) {
        PriceRangeFilter priceRangeFilter = this.EZpvd.get(str);
        java.lang.String strAhwBna = priceRangeFilter != null ? priceRangeFilter.AhwBna() : null;
        java.lang.String str2 = strAhwBna == null ? "" : strAhwBna;
        java.lang.String strOLrzqt = priceRangeFilter != null ? priceRangeFilter.OLrzqt() : null;
        PriceRangeFilter priceRangeFilter2 = new PriceRangeFilter(str2, strOLrzqt == null ? "" : strOLrzqt, priceRangeFilter != null ? priceRangeFilter.valueOf() : null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 120, (DefaultConstructorMarker) null);
        InterfaceC34548neE interfaceC34548neE = this.OLrzqt;
        if (interfaceC34548neE != null) {
            interfaceC34548neE.AEQbTJ(priceRangeFilter2, true);
        }
        Function0<Unit> function0 = this.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
