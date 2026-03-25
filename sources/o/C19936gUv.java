package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.dex.trade.copytrading.edit.data.model.TokenFilter;
import com.okinc.business.dex.trade.copytrading.edit.ui.model.RangeFilterUnit;
import com.okinc.business.dex.trade.copytrading.edit.ui.model.TokenAgeUnit;
import com.okinc.business.dex.trade.copytrading.edit.ui.model.UsdAmountUnit;
import com.okinc.business.dex.trade.copytrading.edit.ui.widget.CopyTradingRangeFilterLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gUv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19936gUv extends ConstraintLayout {
    public Activity EZpvd;
    public final C23532hzx KWHzl;
    public Function1<? super java.lang.Boolean, Unit> OLrzqt;
    public final CopyTradingRangeFilterLayout[] copydefault;

    /* JADX INFO: renamed from: o.gUv$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CopyTradingRangeFilterLayout.InputStatus.values().length];
            try {
                iArr[CopyTradingRangeFilterLayout.InputStatus.Normal.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CopyTradingRangeFilterLayout.InputStatus.MinAndMaxIsZero.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[CopyTradingRangeFilterLayout.InputStatus.MinIsZero.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[CopyTradingRangeFilterLayout.InputStatus.MaxIsZero.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[CopyTradingRangeFilterLayout.InputStatus.MinGteMax.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX INFO: renamed from: o.gUv$Activity */
    public interface Activity {
        void DbNXlk();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19936gUv(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback$OKDex_dex_impl(Activity activity) {
        this.EZpvd = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnFilterChangedListener(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:17) call: o.gUv.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C19936gUv(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19936gUv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C23532hzx c23532hzxKWHzl = C23532hzx.KWHzl(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c23532hzxKWHzl, "");
        this.KWHzl = c23532hzxKWHzl;
        CopyTradingRangeFilterLayout copyTradingRangeFilterLayout = c23532hzxKWHzl.copydefault;
        CopyTradingRangeFilterLayout copyTradingRangeFilterLayout2 = c23532hzxKWHzl.OLrzqt;
        this.copydefault = new CopyTradingRangeFilterLayout[]{copyTradingRangeFilterLayout, copyTradingRangeFilterLayout2, c23532hzxKWHzl.KWHzl, c23532hzxKWHzl.AhwBna};
        UsdAmountUnit usdAmountUnit = UsdAmountUnit.K;
        copyTradingRangeFilterLayout2.setMinUnit(usdAmountUnit);
        c23532hzxKWHzl.OLrzqt.setMaxUnit(usdAmountUnit);
        c23532hzxKWHzl.KWHzl.setMinUnit(usdAmountUnit);
        c23532hzxKWHzl.KWHzl.setMaxUnit(usdAmountUnit);
        CopyTradingRangeFilterLayout copyTradingRangeFilterLayout3 = c23532hzxKWHzl.AhwBna;
        TokenAgeUnit tokenAgeUnit = TokenAgeUnit.Sec;
        copyTradingRangeFilterLayout3.setMinUnit(tokenAgeUnit);
        c23532hzxKWHzl.AhwBna.setMaxUnit(tokenAgeUnit);
        setExpanded(false);
        gEmmrt();
    }

    public final boolean valueOf() {
        android.widget.TextView textView = this.KWHzl.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView.getVisibility() == 0;
    }

    public final void setExpanded(boolean z) {
        Activity activity;
        if (z && (activity = this.EZpvd) != null) {
            activity.DbNXlk();
        }
        this.KWHzl.AEQbTJ.setRotation(z ? 0.0f : 180.0f);
        android.widget.TextView textView = this.KWHzl.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        AEQbTJ().setVisibility(z ? 0 : 8);
        OLrzqt().setVisibility(z ? 0 : 8);
        copydefault().setVisibility(z ? 0 : 8);
        KWHzl().setVisibility(z ? 0 : 8);
        EZpvd().setVisibility(z ? 0 : 8);
    }

    public final CopyTradingRangeFilterLayout AEQbTJ() {
        CopyTradingRangeFilterLayout copyTradingRangeFilterLayout = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(copyTradingRangeFilterLayout, "");
        return copyTradingRangeFilterLayout;
    }

    public final CopyTradingRangeFilterLayout OLrzqt() {
        CopyTradingRangeFilterLayout copyTradingRangeFilterLayout = this.KWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(copyTradingRangeFilterLayout, "");
        return copyTradingRangeFilterLayout;
    }

    public final CopyTradingRangeFilterLayout copydefault() {
        CopyTradingRangeFilterLayout copyTradingRangeFilterLayout = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(copyTradingRangeFilterLayout, "");
        return copyTradingRangeFilterLayout;
    }

    public final CopyTradingRangeFilterLayout KWHzl() {
        CopyTradingRangeFilterLayout copyTradingRangeFilterLayout = this.KWHzl.AhwBna;
        Intrinsics.checkNotNullExpressionValue(copyTradingRangeFilterLayout, "");
        return copyTradingRangeFilterLayout;
    }

    public final C19933gUs EZpvd() {
        C19933gUs c19933gUs = this.KWHzl.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c19933gUs, "");
        return c19933gUs;
    }

    public static final void EZpvd(C19936gUv c19936gUv, android.view.View view) {
        c19936gUv.setExpanded(!c19936gUv.valueOf());
    }

    private final void gEmmrt() {
        this.KWHzl.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.gUu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C19936gUv.EZpvd(this.copydefault, view);
            }
        });
        for (CopyTradingRangeFilterLayout copyTradingRangeFilterLayout : this.copydefault) {
            copyTradingRangeFilterLayout.setOnInputChangeListener(new Function1() { // from class: o.gUw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19936gUv.EZpvd(this.EZpvd, (CopyTradingRangeFilterLayout) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(C19936gUv c19936gUv, CopyTradingRangeFilterLayout copyTradingRangeFilterLayout) {
        Intrinsics.checkNotNullParameter(copyTradingRangeFilterLayout, "");
        int i = ActionBar.KWHzl[copyTradingRangeFilterLayout.EZpvd().ordinal()];
        if (i == 1) {
            copyTradingRangeFilterLayout.setErrorText("");
        } else if (i == 2) {
            copyTradingRangeFilterLayout.setMinErrorText(C33070mpX.AYXKKw(C23274hvD.Fragment.DRGLNw));
            copyTradingRangeFilterLayout.setMaxErrorText(C33070mpX.AYXKKw(C23274hvD.Fragment.DRGLNw));
        } else if (i == 3) {
            copyTradingRangeFilterLayout.setMinErrorText(C33070mpX.AYXKKw(C23274hvD.Fragment.DRGLNw));
            copyTradingRangeFilterLayout.setMaxErrorText("");
        } else if (i == 4) {
            copyTradingRangeFilterLayout.setMinErrorText("");
            copyTradingRangeFilterLayout.setMaxErrorText(C33070mpX.AYXKKw(C23274hvD.Fragment.DRGLNw));
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            copyTradingRangeFilterLayout.setErrorText(C33070mpX.AYXKKw(C23274hvD.Fragment.FhERFw));
        }
        c19936gUv.AhwBna();
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        Function1<? super java.lang.Boolean, Unit> function1 = this.OLrzqt;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(AYXKKw()));
        }
    }

    public final void setTitles() {
        AEQbTJ().setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.GiPPlLQAswws));
        OLrzqt().setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.zFtALg));
        copydefault().setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.gGNlxh));
        KWHzl().setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.dbwnZN));
    }

    public final void copydefault(@NotNull TokenFilter tokenFilter, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        Intrinsics.checkNotNullParameter(str, "");
        CopyTradingRangeFilterLayout copyTradingRangeFilterLayoutAEQbTJ = AEQbTJ();
        java.lang.String threshold = tokenFilter.getThreshold();
        if (threshold == null) {
            threshold = "";
        }
        copyTradingRangeFilterLayoutAEQbTJ.setMin(threshold);
        CopyTradingRangeFilterLayout copyTradingRangeFilterLayoutAEQbTJ2 = AEQbTJ();
        java.lang.String maxThreshold = tokenFilter.getMaxThreshold();
        copyTradingRangeFilterLayoutAEQbTJ2.setMax(maxThreshold != null ? maxThreshold : "");
        OLrzqt().setMin(tokenFilter.getMinMc());
        OLrzqt().setMax(tokenFilter.getMaxMc());
        copydefault().setMin(tokenFilter.getMinLiquidity());
        copydefault().setMax(tokenFilter.getMaxLiquidity());
        KWHzl().setMin(tokenFilter.getMinAge());
        CopyTradingRangeFilterLayout copyTradingRangeFilterLayoutKWHzl = KWHzl();
        TokenAgeUnit.Activity activity = TokenAgeUnit.Companion;
        copyTradingRangeFilterLayoutKWHzl.setMinUnit(activity.OLrzqt(tokenFilter.getMinAgeUnit()));
        KWHzl().setMax(tokenFilter.getMaxAge());
        KWHzl().setMaxUnit(activity.OLrzqt(tokenFilter.getMaxAgeUnit()));
        EZpvd().setBlocklist(str, tokenFilter.getBlackCoinList());
        boolean z = true;
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) tokenFilter.getThreshold()) && !C33129mqd.OLrzqt((java.lang.CharSequence) tokenFilter.getMaxThreshold()) && !C33129mqd.OLrzqt((java.lang.CharSequence) tokenFilter.getMinMc()) && !C33129mqd.OLrzqt((java.lang.CharSequence) tokenFilter.getMaxMc()) && !C33129mqd.OLrzqt((java.lang.CharSequence) tokenFilter.getMinLiquidity()) && !C33129mqd.OLrzqt((java.lang.CharSequence) tokenFilter.getMaxLiquidity()) && !C33129mqd.OLrzqt((java.lang.CharSequence) tokenFilter.getMinAge()) && !C33129mqd.OLrzqt((java.lang.CharSequence) tokenFilter.getMaxAge()) && !(!tokenFilter.getBlackCoinList().isEmpty())) {
            z = false;
        }
        setExpanded(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TokenFilter djBIcL() {
        kotlin.Pair pairOLrzqt;
        kotlin.Pair pairOLrzqt2;
        kotlin.Pair pairOLrzqt3;
        kotlin.Pair pairOLrzqt4;
        kotlin.Pair pairOLrzqt5;
        kotlin.Pair pairOLrzqt6;
        C23532hzx c23532hzx = this.KWHzl;
        java.lang.String strCopydefault = c23532hzx.OLrzqt.copydefault();
        if (!C23313hvq.AhwBna(strCopydefault, 0)) {
            strCopydefault = null;
        }
        if (strCopydefault == null) {
            pairOLrzqt = C56390yDp.OLrzqt("", "");
        } else {
            RangeFilterUnit rangeFilterUnitOLrzqt = c23532hzx.OLrzqt.OLrzqt();
            java.lang.String unitValue = rangeFilterUnitOLrzqt != null ? rangeFilterUnitOLrzqt.getUnitValue() : null;
            if (unitValue == null) {
                unitValue = "";
            }
            pairOLrzqt = C56390yDp.OLrzqt(unitValue, strCopydefault);
            if (pairOLrzqt == null) {
            }
        }
        java.lang.String str = (java.lang.String) pairOLrzqt.component1();
        java.lang.String str2 = (java.lang.String) pairOLrzqt.component2();
        java.lang.String strKWHzl = c23532hzx.OLrzqt.KWHzl();
        if (!C23313hvq.AhwBna(strKWHzl, 0)) {
            strKWHzl = null;
        }
        if (strKWHzl == null) {
            pairOLrzqt2 = C56390yDp.OLrzqt("", "");
        } else {
            RangeFilterUnit rangeFilterUnitAEQbTJ = c23532hzx.OLrzqt.AEQbTJ();
            java.lang.String unitValue2 = rangeFilterUnitAEQbTJ != null ? rangeFilterUnitAEQbTJ.getUnitValue() : null;
            if (unitValue2 == null) {
                unitValue2 = "";
            }
            pairOLrzqt2 = C56390yDp.OLrzqt(unitValue2, strKWHzl);
            if (pairOLrzqt2 == null) {
            }
        }
        java.lang.String str3 = (java.lang.String) pairOLrzqt2.component1();
        java.lang.String str4 = (java.lang.String) pairOLrzqt2.component2();
        java.lang.String strCopydefault2 = c23532hzx.AhwBna.copydefault();
        if (!C23313hvq.AhwBna(strCopydefault2, 0)) {
            strCopydefault2 = null;
        }
        if (strCopydefault2 == null) {
            pairOLrzqt3 = C56390yDp.OLrzqt("", "");
        } else {
            RangeFilterUnit rangeFilterUnitOLrzqt2 = c23532hzx.AhwBna.OLrzqt();
            java.lang.String unitValue3 = rangeFilterUnitOLrzqt2 != null ? rangeFilterUnitOLrzqt2.getUnitValue() : null;
            if (unitValue3 == null) {
                unitValue3 = "";
            }
            pairOLrzqt3 = C56390yDp.OLrzqt(unitValue3, strCopydefault2);
            if (pairOLrzqt3 == null) {
            }
        }
        java.lang.String str5 = (java.lang.String) pairOLrzqt3.component1();
        java.lang.String str6 = (java.lang.String) pairOLrzqt3.component2();
        java.lang.String strKWHzl2 = c23532hzx.AhwBna.KWHzl();
        if (!C23313hvq.AhwBna(strKWHzl2, 0)) {
            strKWHzl2 = null;
        }
        if (strKWHzl2 == null) {
            pairOLrzqt4 = C56390yDp.OLrzqt("", "");
        } else {
            RangeFilterUnit rangeFilterUnitAEQbTJ2 = c23532hzx.AhwBna.AEQbTJ();
            java.lang.String unitValue4 = rangeFilterUnitAEQbTJ2 != null ? rangeFilterUnitAEQbTJ2.getUnitValue() : null;
            if (unitValue4 == null) {
                unitValue4 = "";
            }
            pairOLrzqt4 = C56390yDp.OLrzqt(unitValue4, strKWHzl2);
            if (pairOLrzqt4 == null) {
            }
        }
        java.lang.String str7 = (java.lang.String) pairOLrzqt4.component1();
        java.lang.String str8 = (java.lang.String) pairOLrzqt4.component2();
        java.lang.String strCopydefault3 = c23532hzx.KWHzl.copydefault();
        if (!C23313hvq.AhwBna(strCopydefault3, 0)) {
            strCopydefault3 = null;
        }
        if (strCopydefault3 == null) {
            pairOLrzqt5 = C56390yDp.OLrzqt("", "");
        } else {
            RangeFilterUnit rangeFilterUnitOLrzqt3 = c23532hzx.KWHzl.OLrzqt();
            java.lang.String unitValue5 = rangeFilterUnitOLrzqt3 != null ? rangeFilterUnitOLrzqt3.getUnitValue() : null;
            if (unitValue5 == null) {
                unitValue5 = "";
            }
            pairOLrzqt5 = C56390yDp.OLrzqt(unitValue5, strCopydefault3);
            if (pairOLrzqt5 == null) {
            }
        }
        java.lang.String str9 = (java.lang.String) pairOLrzqt5.component1();
        java.lang.String str10 = (java.lang.String) pairOLrzqt5.component2();
        java.lang.String strKWHzl3 = c23532hzx.KWHzl.KWHzl();
        if (!C23313hvq.AhwBna(strKWHzl3, 0)) {
            strKWHzl3 = null;
        }
        if (strKWHzl3 == null) {
            pairOLrzqt6 = C56390yDp.OLrzqt("", "");
        } else {
            RangeFilterUnit rangeFilterUnitAEQbTJ3 = c23532hzx.KWHzl.AEQbTJ();
            java.lang.String unitValue6 = rangeFilterUnitAEQbTJ3 != null ? rangeFilterUnitAEQbTJ3.getUnitValue() : null;
            if (unitValue6 == null) {
                unitValue6 = "";
            }
            pairOLrzqt6 = C56390yDp.OLrzqt(unitValue6, strKWHzl3);
            if (pairOLrzqt6 == null) {
            }
        }
        java.lang.String str11 = (java.lang.String) pairOLrzqt6.component1();
        java.lang.String str12 = (java.lang.String) pairOLrzqt6.component2();
        java.lang.String strCopydefault4 = c23532hzx.copydefault.copydefault();
        if (!C23313hvq.AhwBna(strCopydefault4, 0)) {
            strCopydefault4 = null;
        }
        java.lang.String str13 = strCopydefault4 == null ? "" : strCopydefault4;
        java.lang.String strKWHzl4 = c23532hzx.copydefault.KWHzl();
        java.lang.String str14 = C23313hvq.AhwBna(strKWHzl4, 0) ? strKWHzl4 : null;
        return new TokenFilter(str2, str4, str6, str8, str10, str12, str13, str14 == null ? "" : str14, C59467zhb.zuBGHE(c23532hzx.gEmmrt.KWHzl()), str, str3, str7, str5, str9, str11);
    }

    public final boolean AYXKKw() {
        boolean z;
        CopyTradingRangeFilterLayout[] copyTradingRangeFilterLayoutArr = this.copydefault;
        int length = copyTradingRangeFilterLayoutArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            if (copyTradingRangeFilterLayoutArr[i].EZpvd() != CopyTradingRangeFilterLayout.InputStatus.Normal) {
                z = false;
                break;
            }
            i++;
        }
        return z && EZpvd().copydefault();
    }
}
