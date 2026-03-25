package o;

import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.dexkline.market.common.constants.TokenAgeType;
import com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.localization.util.format.DisplaySign;
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
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.neH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34551neH extends android.widget.FrameLayout implements InterfaceC34552neI {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public InterfaceC34548neE EZpvd;
    public final LinkedHashMap<java.lang.String, PriceRangeFilter> OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34551neH(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34551neH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
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
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:54) call: o.neH.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C34551neH(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34551neH(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.neM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34551neH.EZpvd(context, this);
            }
        });
        this.OLrzqt = new LinkedHashMap<>();
        KWHzl().OLrzqt.setCallback(new AnonymousClass5());
        C55008xbo c55008xbo = KWHzl().EZpvd;
        c55008xbo.setLabelText(EZpvd(true));
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setMaxDecimalValue(2);
        }
        C55001xbh c55001xbhAkhnZx2 = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            C33606mzd.AEQbTJ(c55001xbhAkhnZx2, new Function1() { // from class: o.neN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34551neH.EZpvd(this.EZpvd, (java.lang.CharSequence) obj);
                }
            });
        }
        C55008xbo c55008xbo2 = KWHzl().KWHzl;
        c55008xbo2.setLabelText(EZpvd(false));
        C55001xbh c55001xbhAkhnZx3 = c55008xbo2.AkhnZx();
        if (c55001xbhAkhnZx3 != null) {
            c55001xbhAkhnZx3.setMaxDecimalValue(2);
        }
        C55001xbh c55001xbhAkhnZx4 = c55008xbo2.AkhnZx();
        if (c55001xbhAkhnZx4 != null) {
            C33606mzd.AEQbTJ(c55001xbhAkhnZx4, new Function1() { // from class: o.neL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34551neH.OLrzqt(this.copydefault, (java.lang.CharSequence) obj);
                }
            });
        }
    }

    private final oOB KWHzl() {
        return (oOB) this.copydefault.getValue();
    }

    public static final oOB EZpvd(android.content.Context context, C34551neH c34551neH) {
        return oOB.AEQbTJ(android.view.LayoutInflater.from(context), c34551neH, true);
    }

    /* JADX INFO: renamed from: o.neH$5, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass5 implements InterfaceC34596nfA, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass5() {
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
            return new FunctionReferenceImpl(1, C34551neH.this, C34551neH.class, "onPickedMinValue", "onPickedMinValue(Ljava/lang/String;)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC34596nfA
        public final void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C34551neH.this.AEQbTJ(str);
        }
    }

    public static final Unit EZpvd(C34551neH c34551neH, java.lang.CharSequence charSequence) {
        java.lang.String strValueOf = java.lang.String.valueOf(charSequence);
        if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) strValueOf, '.', false, 2, (java.lang.Object) null)) {
            strValueOf = C59454zhO.DbNXlk(strValueOf, 1);
        }
        C55001xbh c55001xbhAkhnZx = c34551neH.KWHzl().KWHzl.AkhnZx();
        c34551neH.copydefault(strValueOf, java.lang.String.valueOf(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.getText() : null));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C34551neH c34551neH, java.lang.CharSequence charSequence) {
        java.lang.String strValueOf = java.lang.String.valueOf(charSequence);
        if (StringsKt__StringsKt.endsWith$default((java.lang.CharSequence) strValueOf, '.', false, 2, (java.lang.Object) null)) {
            strValueOf = C59454zhO.DbNXlk(strValueOf, 1);
        }
        C55001xbh c55001xbhAkhnZx = c34551neH.KWHzl().EZpvd.AkhnZx();
        c34551neH.copydefault(java.lang.String.valueOf(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.getText() : null), strValueOf);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC34552neI
    public void setData(@NotNull java.util.List<PriceRangeFilter> list, PriceRangeFilter priceRangeFilter, TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.clear();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.OLrzqt.put(C34655ngG.copydefault.OLrzqt(), (PriceRangeFilter) it.next());
        }
        android.widget.TextView textView = KWHzl().valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility((priceRangeFilter == null || priceRangeFilter.copydefault()) ? 0 : 8);
        KWHzl("");
        copydefault(priceRangeFilter);
    }

    public final void KWHzl(java.lang.String str) {
        java.util.Set<Map.Entry<java.lang.String, PriceRangeFilter>> setEntrySet = this.OLrzqt.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        java.util.Set<Map.Entry<java.lang.String, PriceRangeFilter>> set = setEntrySet;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(set, 10));
        java.util.Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "");
            arrayList.add(new C34600nfE((java.lang.String) key, null, copydefault(((PriceRangeFilter) entry.getValue()).AhwBna()), false, 2, null));
        }
        KWHzl().OLrzqt.setData(arrayList, str);
    }

    public final void copydefault(PriceRangeFilter priceRangeFilter) {
        C55008xbo c55008xbo = KWHzl().EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        java.lang.String strAhwBna = priceRangeFilter != null ? priceRangeFilter.AhwBna() : null;
        if (strAhwBna == null) {
            strAhwBna = "";
        }
        KWHzl(c55008xbo, strAhwBna);
        C55008xbo c55008xbo2 = KWHzl().KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
        java.lang.String strOLrzqt = priceRangeFilter != null ? priceRangeFilter.OLrzqt() : null;
        KWHzl(c55008xbo2, strOLrzqt != null ? strOLrzqt : "");
    }

    public final void AEQbTJ(java.lang.String str) {
        PriceRangeFilter priceRangeFilter = this.OLrzqt.get(str);
        C55008xbo c55008xbo = KWHzl().EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        java.lang.String strAhwBna = priceRangeFilter != null ? priceRangeFilter.AhwBna() : null;
        if (strAhwBna == null) {
            strAhwBna = "";
        }
        KWHzl(c55008xbo, strAhwBna);
        C55008xbo c55008xbo2 = KWHzl().KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
        resetInputField$default(this, c55008xbo2, null, 2, null);
    }

    public final void copydefault(java.lang.String str, java.lang.String str2) {
        java.lang.Object next;
        boolean zEZpvd = EZpvd(str, str2);
        AppCompatTextView appCompatTextView = KWHzl().AhwBna;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(zEZpvd ^ true ? 0 : 8);
        if (!zEZpvd) {
            C55008xbo c55008xbo = KWHzl().EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            copydefault(c55008xbo);
            C55008xbo c55008xbo2 = KWHzl().KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
            copydefault(c55008xbo2);
            InterfaceC34548neE interfaceC34548neE = this.EZpvd;
            if (interfaceC34548neE != null) {
                interfaceC34548neE.AEQbTJ(new PriceRangeFilter((java.lang.String) null, (java.lang.String) null, (TokenAgeType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 127, (DefaultConstructorMarker) null), false);
                return;
            }
            return;
        }
        KWHzl().EZpvd.values();
        KWHzl().KWHzl.values();
        C34652ngD c34652ngD = C34652ngD.KWHzl;
        java.lang.String strCopydefault = c34652ngD.EZpvd() ? str : c34652ngD.copydefault(str);
        java.lang.String strCopydefault2 = c34652ngD.EZpvd() ? str2 : c34652ngD.copydefault(str2);
        java.util.Set<Map.Entry<java.lang.String, PriceRangeFilter>> setEntrySet = this.OLrzqt.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        java.util.Iterator<T> it = setEntrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (C33129mqd.AEQbTJ(str) == C33129mqd.AEQbTJ(EZpvd(C34652ngD.KWHzl.AEQbTJ(((PriceRangeFilter) ((Map.Entry) next).getValue()).AhwBna())))) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) next;
        java.lang.String str3 = entry != null ? (java.lang.String) entry.getKey() : null;
        KWHzl(str3 != null ? str3 : "");
        PriceRangeFilter priceRangeFilter = new PriceRangeFilter(strCopydefault, strCopydefault2, (TokenAgeType) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 124, (DefaultConstructorMarker) null);
        InterfaceC34548neE interfaceC34548neE2 = this.EZpvd;
        if (interfaceC34548neE2 != null) {
            interfaceC34548neE2.AEQbTJ(priceRangeFilter, true);
        }
    }

    public final boolean EZpvd(java.lang.String str, java.lang.String str2) {
        if (str.length() == 0) {
            return true;
        }
        return str2.length() == 0 || C33129mqd.gEmmrt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), java.lang.Double.valueOf(C33129mqd.AEQbTJ(str2)));
    }

    public final android.text.SpannedString copydefault(java.lang.String str) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int i = C35964oKf.Fragment.DcMfJKDcMfJK;
        mRJ mrj = mRJ.AEQbTJ;
        java.lang.String strKWHzl = C33069mpW.KWHzl(context, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", mRJ.getShowUSDData$default(mrj, str, false, false, null, false, 14, null))));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        android.text.style.TextAppearanceSpan textAppearanceSpan = new android.text.style.TextAppearanceSpan(getContext(), C52761wXj.LoaderManager.zuBGHE);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) strKWHzl);
        spannableStringBuilder.setSpan(textAppearanceSpan, length, spannableStringBuilder.length(), 17);
        if (!C34652ngD.KWHzl.EZpvd()) {
            java.lang.String str2 = "\n" + mrj.OLrzqt(str, (252 & 1) != 0 ? false : true, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false);
            android.text.style.TextAppearanceSpan textAppearanceSpan2 = new android.text.style.TextAppearanceSpan(getContext(), C52761wXj.LoaderManager.QOLQEE);
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            java.lang.Object[] objArr = {textAppearanceSpan2, new android.text.style.ForegroundColorSpan(mUM.EZpvd(context2, C52761wXj.Activity.QwvEab))};
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
        java.lang.String symbol = mRJ.AEQbTJ.EZpvd().getSymbol();
        if (z) {
            string = getContext().getString(C35964oKf.Fragment.iKEqwx);
        } else {
            string = getContext().getString(C35964oKf.Fragment.DKtBnz);
        }
        Intrinsics.copydefault((java.lang.Object) string);
        return string + " (" + symbol + ")";
    }

    public static /* synthetic */ void resetInputField$default(C34551neH c34551neH, C55008xbo c55008xbo, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c34551neH.KWHzl(c55008xbo, str);
    }

    public final void KWHzl(C55008xbo c55008xbo, java.lang.String str) {
        c55008xbo.clearFocus();
        c55008xbo.setText(EZpvd(C34652ngD.KWHzl.AEQbTJ(str)));
    }

    public final java.lang.String EZpvd(java.lang.String str) {
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

    public final void copydefault(C55008xbo c55008xbo) {
        c55008xbo.setState(2);
        c55008xbo.setErrorShowing(true);
    }

    /* JADX INFO: renamed from: o.neH$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.neH.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
