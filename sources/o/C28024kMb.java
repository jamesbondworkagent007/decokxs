package o;

import android.view.View;
import android.view.ViewGroup;
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

/* JADX INFO: renamed from: o.kMb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28024kMb extends android.widget.FrameLayout implements InterfaceC28026kMd {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final LinkedHashMap<java.lang.String, PriceRangeFilter> AEQbTJ;
    public InterfaceC28023kMa EZpvd;
    public final InterfaceC56387yDm OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28024kMb(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28024kMb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
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
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:56) call: o.kMb.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C28024kMb(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28024kMb(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.kLZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28024kMb.OLrzqt(context, this);
            }
        });
        this.AEQbTJ = new LinkedHashMap<>();
        KWHzl().EZpvd.setCallback(new AnonymousClass4());
        C55008xbo c55008xbo = KWHzl().KWHzl;
        c55008xbo.setLabelText(EZpvd(true));
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setMaxDecimalValue(2);
        }
        C55001xbh c55001xbhAkhnZx2 = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            C33606mzd.AEQbTJ(c55001xbhAkhnZx2, new Function1() { // from class: o.kMc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28024kMb.OLrzqt(this.copydefault, (java.lang.CharSequence) obj);
                }
            });
        }
        C55008xbo c55008xbo2 = KWHzl().OLrzqt;
        c55008xbo2.setLabelText(EZpvd(false));
        C55001xbh c55001xbhAkhnZx3 = c55008xbo2.AkhnZx();
        if (c55001xbhAkhnZx3 != null) {
            c55001xbhAkhnZx3.setMaxDecimalValue(2);
        }
        C55001xbh c55001xbhAkhnZx4 = c55008xbo2.AkhnZx();
        if (c55001xbhAkhnZx4 != null) {
            C33606mzd.AEQbTJ(c55001xbhAkhnZx4, new Function1() { // from class: o.kMi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28024kMb.EZpvd(this.AEQbTJ, (java.lang.CharSequence) obj);
                }
            });
        }
    }

    private final C21651hHg KWHzl() {
        return (C21651hHg) this.OLrzqt.getValue();
    }

    public static final C21651hHg OLrzqt(android.content.Context context, C28024kMb c28024kMb) {
        return C21651hHg.KWHzl(android.view.LayoutInflater.from(context), c28024kMb, true);
    }

    /* JADX INFO: renamed from: o.kMb$4, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass4 implements InterfaceC28053kNd, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4() {
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
            return new FunctionReferenceImpl(1, C28024kMb.this, C28024kMb.class, "onPickedMinValue", "onPickedMinValue(Ljava/lang/String;)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28053kNd
        public final void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C28024kMb.this.EZpvd(str);
        }
    }

    public static final Unit OLrzqt(C28024kMb c28024kMb, java.lang.CharSequence charSequence) {
        java.lang.String strValueOf = java.lang.String.valueOf(charSequence);
        if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) strValueOf, '.', false, 2, (java.lang.Object) null)) {
            strValueOf = C59454zhO.DbNXlk(strValueOf, 1);
        }
        C55001xbh c55001xbhAkhnZx = c28024kMb.KWHzl().OLrzqt.AkhnZx();
        c28024kMb.OLrzqt(strValueOf, java.lang.String.valueOf(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.getText() : null));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C28024kMb c28024kMb, java.lang.CharSequence charSequence) {
        java.lang.String strValueOf = java.lang.String.valueOf(charSequence);
        if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) strValueOf, '.', false, 2, (java.lang.Object) null)) {
            strValueOf = C59454zhO.DbNXlk(strValueOf, 1);
        }
        C55001xbh c55001xbhAkhnZx = c28024kMb.KWHzl().KWHzl.AkhnZx();
        c28024kMb.OLrzqt(java.lang.String.valueOf(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.getText() : null), strValueOf);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC28026kMd
    public void setData(@NotNull java.util.List<PriceRangeFilter> list, PriceRangeFilter priceRangeFilter, TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ.clear();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.AEQbTJ.put(C31193lpR.AEQbTJ.KWHzl(), (PriceRangeFilter) it.next());
        }
        android.widget.TextView textView = KWHzl().gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility((priceRangeFilter == null || priceRangeFilter.EZpvd()) ? 0 : 8);
        OLrzqt("");
        OLrzqt(priceRangeFilter);
    }

    @Override // o.InterfaceC28026kMd
    public void KWHzl(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        C55001xbh c55001xbhAkhnZx = KWHzl().KWHzl.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            KWHzl(activity, c55001xbhAkhnZx);
        }
        C55001xbh c55001xbhAkhnZx2 = KWHzl().OLrzqt.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            KWHzl(activity, c55001xbhAkhnZx2);
        }
    }

    public final void OLrzqt(java.lang.String str) {
        java.util.Set<Map.Entry<java.lang.String, PriceRangeFilter>> setEntrySet = this.AEQbTJ.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        java.util.Set<Map.Entry<java.lang.String, PriceRangeFilter>> set = setEntrySet;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(set, 10));
        java.util.Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "");
            arrayList.add(new C28060kNk((java.lang.String) key, null, KWHzl(((PriceRangeFilter) entry.getValue()).AhwBna()), false, 2, null));
        }
        KWHzl().EZpvd.setData(arrayList, str);
    }

    public final void OLrzqt(PriceRangeFilter priceRangeFilter) {
        C55008xbo c55008xbo = KWHzl().KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        java.lang.String strAhwBna = priceRangeFilter != null ? priceRangeFilter.AhwBna() : null;
        if (strAhwBna == null) {
            strAhwBna = "";
        }
        AEQbTJ(c55008xbo, strAhwBna);
        C55008xbo c55008xbo2 = KWHzl().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
        java.lang.String strKWHzl = priceRangeFilter != null ? priceRangeFilter.KWHzl() : null;
        AEQbTJ(c55008xbo2, strKWHzl != null ? strKWHzl : "");
    }

    public final void EZpvd(java.lang.String str) {
        PriceRangeFilter priceRangeFilter = this.AEQbTJ.get(str);
        C55008xbo c55008xbo = KWHzl().KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        java.lang.String strAhwBna = priceRangeFilter != null ? priceRangeFilter.AhwBna() : null;
        if (strAhwBna == null) {
            strAhwBna = "";
        }
        AEQbTJ(c55008xbo, strAhwBna);
        C55008xbo c55008xbo2 = KWHzl().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
        resetInputField$default(this, c55008xbo2, null, 2, null);
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2) {
        java.lang.Object next;
        boolean zAEQbTJ = AEQbTJ(str, str2);
        AppCompatTextView appCompatTextView = KWHzl().djBIcL;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(zAEQbTJ ^ true ? 0 : 8);
        if (!zAEQbTJ) {
            C55008xbo c55008xbo = KWHzl().KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            OLrzqt(c55008xbo);
            C55008xbo c55008xbo2 = KWHzl().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            OLrzqt(c55008xbo2);
            InterfaceC28023kMa interfaceC28023kMa = this.EZpvd;
            if (interfaceC28023kMa != null) {
                interfaceC28023kMa.AEQbTJ(new PriceRangeFilter((java.lang.String) null, (java.lang.String) null, (TokenAgeType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 127, (DefaultConstructorMarker) null), false);
                return;
            }
            return;
        }
        KWHzl().KWHzl.values();
        KWHzl().OLrzqt.values();
        C31191lpP c31191lpP = C31191lpP.copydefault;
        java.lang.String strAEQbTJ = c31191lpP.KWHzl() ? str : c31191lpP.AEQbTJ(str);
        java.lang.String strAEQbTJ2 = c31191lpP.KWHzl() ? str2 : c31191lpP.AEQbTJ(str2);
        java.util.Set<Map.Entry<java.lang.String, PriceRangeFilter>> setEntrySet = this.AEQbTJ.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        java.util.Iterator<T> it = setEntrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (C33129mqd.AEQbTJ(str) == C33129mqd.AEQbTJ(copydefault(C31191lpP.copydefault.copydefault(((PriceRangeFilter) ((Map.Entry) next).getValue()).AhwBna())))) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) next;
        java.lang.String str3 = entry != null ? (java.lang.String) entry.getKey() : null;
        OLrzqt(str3 != null ? str3 : "");
        PriceRangeFilter priceRangeFilter = new PriceRangeFilter(strAEQbTJ, strAEQbTJ2, (TokenAgeType) null, (java.lang.String) null, str, str2, false, 76, (DefaultConstructorMarker) null);
        InterfaceC28023kMa interfaceC28023kMa2 = this.EZpvd;
        if (interfaceC28023kMa2 != null) {
            interfaceC28023kMa2.AEQbTJ(priceRangeFilter, true);
        }
    }

    /* JADX INFO: renamed from: o.kMb$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C28024kMb AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C55001xbh copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C28024kMb c28024kMb, C55001xbh c55001xbh) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c28024kMb;
            this.copydefault = c55001xbh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.post(new TaskDescription(this.copydefault));
            }
        }
    }

    public final boolean AEQbTJ(java.lang.String str, java.lang.String str2) {
        if (str.length() == 0) {
            return true;
        }
        return str2.length() == 0 || C33129mqd.gEmmrt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), java.lang.Double.valueOf(C33129mqd.AEQbTJ(str2)));
    }

    public final android.text.SpannedString KWHzl(java.lang.String str) {
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

    public final java.lang.String EZpvd(boolean z) {
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

    public static /* synthetic */ void resetInputField$default(C28024kMb c28024kMb, C55008xbo c55008xbo, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c28024kMb.AEQbTJ(c55008xbo, str);
    }

    public final void AEQbTJ(C55008xbo c55008xbo, java.lang.String str) {
        c55008xbo.clearFocus();
        c55008xbo.setText(copydefault(C31191lpP.copydefault.copydefault(str)));
    }

    public final java.lang.String copydefault(java.lang.String str) {
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

    public final void KWHzl(android.app.Activity activity, C55001xbh c55001xbh) {
        if (c55001xbh.isFocused()) {
            C33570myu.OLrzqt(activity, c55001xbh);
        }
        c55001xbh.clearFocus();
        c55001xbh.setOnClickListener(new ActionBar(c55001xbh, 1000L, this, c55001xbh));
    }

    /* JADX INFO: renamed from: o.kMb$TaskDescription */
    public static final class TaskDescription implements java.lang.Runnable {
        public final /* synthetic */ C55001xbh KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(C55001xbh c55001xbh) {
            this.KWHzl = c55001xbh;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.KWHzl.requestFocus();
        }
    }

    public final void OLrzqt(C55008xbo c55008xbo) {
        c55008xbo.setState(2);
        c55008xbo.setErrorShowing(true);
    }

    public final C28055kNf EZpvd() {
        C28055kNf c28055kNf = KWHzl().EZpvd;
        Intrinsics.checkNotNullExpressionValue(c28055kNf, "");
        return c28055kNf;
    }

    public final void setInputFieldGap(float f) {
        C21651hHg c21651hHgKWHzl = KWHzl();
        ViewGroup.LayoutParams layoutParams = c21651hHgKWHzl.KWHzl.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        float f2 = f / 2;
        marginLayoutParams.setMarginEnd(C55298xhM.dp2px$default(f2, null, 1, null));
        c21651hHgKWHzl.KWHzl.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams2 = c21651hHgKWHzl.OLrzqt.getLayoutParams();
        Intrinsics.copydefault(layoutParams2, "");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMarginStart(C55298xhM.dp2px$default(f2, null, 1, null));
        c21651hHgKWHzl.OLrzqt.setLayoutParams(marginLayoutParams2);
    }

    /* JADX INFO: renamed from: o.kMb$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kMb.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
