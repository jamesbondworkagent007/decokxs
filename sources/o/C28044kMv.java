package o;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.market.common.constants.TokenAgeType;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kMv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28044kMv extends android.widget.FrameLayout implements InterfaceC28026kMd {
    public final LinkedHashMap<java.lang.String, PriceRangeFilter> AEQbTJ;
    public InterfaceC28023kMa EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28044kMv(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28044kMv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
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
        this.EZpvd = interfaceC28023kMa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC28026kMd
    public void setSelectionDismissCallback(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:28) call: o.kMv.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C28044kMv(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28044kMv(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.kMz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28044kMv.EZpvd(context, this);
            }
        });
        this.AEQbTJ = new LinkedHashMap<>();
        AEQbTJ().AEQbTJ.setCallback(new AnonymousClass1());
    }

    private final C21658hHn AEQbTJ() {
        return (C21658hHn) this.KWHzl.getValue();
    }

    public static final C21658hHn EZpvd(android.content.Context context, C28044kMv c28044kMv) {
        return C21658hHn.EZpvd(android.view.LayoutInflater.from(context), c28044kMv, true);
    }

    /* JADX INFO: renamed from: o.kMv$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 implements InterfaceC28053kNd, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1() {
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
            return new FunctionReferenceImpl(1, C28044kMv.this, C28044kMv.class, "onPickedMinValue", "onPickedMinValue(Ljava/lang/String;)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28053kNd
        public final void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C28044kMv.this.AEQbTJ(str);
        }
    }

    @Override // o.InterfaceC28026kMd
    public void setData(@NotNull java.util.List<PriceRangeFilter> list, PriceRangeFilter priceRangeFilter, TokenFilter tokenFilter) {
        java.lang.Object next;
        PriceRangeFilter priceRangeFilterAYXKKw;
        PriceRangeFilter priceRangeFilterAYXKKw2;
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ.clear();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.AEQbTJ.put(C31193lpR.AEQbTJ.KWHzl(), (PriceRangeFilter) it.next());
        }
        java.util.Set<Map.Entry<java.lang.String, PriceRangeFilter>> setEntrySet = this.AEQbTJ.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        java.util.Iterator<T> it2 = setEntrySet.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            Map.Entry entry = (Map.Entry) next;
            if (Intrinsics.EZpvd((java.lang.Object) (((tokenFilter == null || (priceRangeFilterAYXKKw2 = tokenFilter.AYXKKw()) == null) ? null : priceRangeFilterAYXKKw2.AhwBna()) + ((tokenFilter == null || (priceRangeFilterAYXKKw = tokenFilter.AYXKKw()) == null) ? null : priceRangeFilterAYXKKw.KWHzl())), (java.lang.Object) (((PriceRangeFilter) entry.getValue()).AhwBna() + ((PriceRangeFilter) entry.getValue()).KWHzl()))) {
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        java.lang.String str = entry2 != null ? (java.lang.String) entry2.getKey() : null;
        if (str == null) {
            str = "";
        }
        EZpvd(str);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            PriceRangeFilter priceRangeFilter2 = this.AEQbTJ.get(str);
            java.lang.String strAhwBna = priceRangeFilter2 != null ? priceRangeFilter2.AhwBna() : null;
            java.lang.String str2 = strAhwBna == null ? "" : strAhwBna;
            java.lang.String strKWHzl = priceRangeFilter2 != null ? priceRangeFilter2.KWHzl() : null;
            PriceRangeFilter priceRangeFilter3 = new PriceRangeFilter(str2, strKWHzl == null ? "" : strKWHzl, priceRangeFilter2 != null ? priceRangeFilter2.djBIcL() : null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 120, (DefaultConstructorMarker) null);
            InterfaceC28023kMa interfaceC28023kMa = this.EZpvd;
            if (interfaceC28023kMa != null) {
                interfaceC28023kMa.AEQbTJ(priceRangeFilter3, true);
            }
        }
    }

    private final void EZpvd(java.lang.String str) {
        java.util.Set<Map.Entry<java.lang.String, PriceRangeFilter>> setEntrySet = this.AEQbTJ.entrySet();
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
            arrayList.add(new C28060kNk((java.lang.String) key, null, KWHzl((PriceRangeFilter) value), false, 2, null));
        }
        AEQbTJ().AEQbTJ.setData(arrayList, str);
    }

    public final android.text.SpannedString KWHzl(PriceRangeFilter priceRangeFilter) {
        kotlin.Pair pairOLrzqt;
        java.lang.String strKWHzl;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) priceRangeFilter.AhwBna())) {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C23274hvD.Fragment.dHAKvv), priceRangeFilter.AhwBna());
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(C23274hvD.Fragment.DbvGUJ), priceRangeFilter.KWHzl());
        }
        TokenAgeType.Companion companion = TokenAgeType.Companion;
        TokenAgeType tokenAgeTypeDjBIcL = priceRangeFilter.djBIcL();
        if (tokenAgeTypeDjBIcL == null) {
            tokenAgeTypeDjBIcL = TokenAgeType.DAY;
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(companion.OLrzqt(tokenAgeTypeDjBIcL));
        if (priceRangeFilter.djBIcL() != null) {
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
        java.lang.Object[] objArr = {textAppearanceSpan2, new android.text.style.ForegroundColorSpan(C25382ivf.KWHzl(context3, C52761wXj.Activity.QwvEab))};
        int length2 = spannableStringBuilder.length();
        for (int i = 0; i < 2; i++) {
            spannableStringBuilder.setSpan(objArr[i], length2, spannableStringBuilder.length(), 17);
        }
        return new android.text.SpannedString(spannableStringBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(java.lang.String str) {
        PriceRangeFilter priceRangeFilter = this.AEQbTJ.get(str);
        java.lang.String strAhwBna = priceRangeFilter != null ? priceRangeFilter.AhwBna() : null;
        java.lang.String str2 = strAhwBna == null ? "" : strAhwBna;
        java.lang.String strKWHzl = priceRangeFilter != null ? priceRangeFilter.KWHzl() : null;
        PriceRangeFilter priceRangeFilter2 = new PriceRangeFilter(str2, strKWHzl == null ? "" : strKWHzl, priceRangeFilter != null ? priceRangeFilter.djBIcL() : null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 120, (DefaultConstructorMarker) null);
        InterfaceC28023kMa interfaceC28023kMa = this.EZpvd;
        if (interfaceC28023kMa != null) {
            interfaceC28023kMa.AEQbTJ(priceRangeFilter2, true);
        }
        Function0<Unit> function0 = this.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
