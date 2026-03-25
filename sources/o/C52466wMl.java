package o;

import android.os.Build;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.bumptech.glide.Glide;
import com.okinc.tradingbot.impl.strategy.bean.DefaultTag;
import com.okinc.tradingbot.impl.strategy.bean.GuideHeaderCard;
import com.okinc.tradingbot.impl.strategy.bean.GuideHeaderItem;
import com.okinc.tradingbot.impl.strategy.bean.VoucherTag;
import com.okinc.unify_trade.biz.LossInsuranceDisplayData;
import com.okinc.unify_trade.bot.data.TacticsListLabelVoucherData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wMl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52466wMl extends ConstraintLayout {
    public uXI copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52466wMl(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52466wMl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:38) call: o.wMl.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52466wMl(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52466wMl(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd();
    }

    private final void EZpvd() {
        uXI uxi = (uXI) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.zeUYeG, this, true);
        this.copydefault = uxi;
        uXI uxi2 = null;
        if (uxi == null) {
            Intrinsics.gEmmrt("");
            uxi = null;
        }
        uxi.AhwBna.setExpand(true);
        if (Build.VERSION.SDK_INT >= 29) {
            xMP xmp = xMP.AEQbTJ;
            if (xmp.EZpvd() || xmp.AEQbTJ()) {
                return;
            }
            uXI uxi3 = this.copydefault;
            if (uxi3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                uxi2 = uxi3;
            }
            uxi2.gEmmrt.setBreakStrategy(2);
        }
    }

    public final void KWHzl(@NotNull GuideHeaderCard guideHeaderCard) {
        Intrinsics.checkNotNullParameter(guideHeaderCard, "");
        uXI uxi = this.copydefault;
        if (uxi == null) {
            Intrinsics.gEmmrt("");
            uxi = null;
        }
        uxi.OLrzqt.setText(guideHeaderCard.KWHzl());
        copydefault(guideHeaderCard);
        EZpvd(guideHeaderCard);
        copydefault(guideHeaderCard.copydefault());
    }

    public final void copydefault(GuideHeaderCard guideHeaderCard) {
        uXI uxi = this.copydefault;
        if (uxi == null) {
            Intrinsics.gEmmrt("");
            uxi = null;
        }
        ConstraintLayout constraintLayout = uxi.isConnected;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(guideHeaderCard.gEmmrt() ? 0 : 8);
        AppCompatTextView appCompatTextView = uxi.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(guideHeaderCard.gEmmrt() ? 0 : 8);
        ConstraintLayout constraintLayout2 = uxi.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        constraintLayout2.setVisibility(guideHeaderCard.gEmmrt() ? 0 : 8);
        AppCompatTextView appCompatTextView2 = uxi.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setVisibility(guideHeaderCard.gEmmrt() ? 0 : 8);
        if (guideHeaderCard.gEmmrt()) {
            AppCompatTextView appCompatTextView3 = uxi.djBIcL;
            GuideHeaderItem guideHeaderItemAhwBna = guideHeaderCard.AhwBna();
            appCompatTextView3.setText(guideHeaderItemAhwBna != null ? guideHeaderItemAhwBna.EZpvd() : null);
            AppCompatTextView appCompatTextView4 = uxi.AkhnZx;
            GuideHeaderItem guideHeaderItemAhwBna2 = guideHeaderCard.AhwBna();
            appCompatTextView4.setText(guideHeaderItemAhwBna2 != null ? guideHeaderItemAhwBna2.OLrzqt() : null);
            C50032uzk c50032uzk = uxi.gEmmrt;
            GuideHeaderItem guideHeaderItemAEQbTJ = guideHeaderCard.AEQbTJ();
            c50032uzk.setText(guideHeaderItemAEQbTJ != null ? guideHeaderItemAEQbTJ.EZpvd() : null);
            AppCompatTextView appCompatTextView5 = uxi.copydefault;
            GuideHeaderItem guideHeaderItemAEQbTJ2 = guideHeaderCard.AEQbTJ();
            appCompatTextView5.setText(guideHeaderItemAEQbTJ2 != null ? guideHeaderItemAEQbTJ2.OLrzqt() : null);
        }
    }

    public final void EZpvd(GuideHeaderCard guideHeaderCard) {
        uXI uxi = this.copydefault;
        if (uxi == null) {
            Intrinsics.gEmmrt("");
            uxi = null;
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) guideHeaderCard.valueOf()) && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) guideHeaderCard.OLrzqt())) {
            C55379xio c55379xio = uxi.valueOf;
            Intrinsics.checkNotNullExpressionValue(c55379xio, "");
            c55379xio.setVisibility(8);
            C55379xio c55379xio2 = uxi.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55379xio2, "");
            c55379xio2.setVisibility(8);
            return;
        }
        C55379xio c55379xio3 = uxi.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55379xio3, "");
        c55379xio3.setVisibility(0);
        C55379xio c55379xio4 = uxi.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55379xio4, "");
        c55379xio4.setVisibility(0);
        C55379xio c55379xio5 = uxi.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55379xio5, "");
        AEQbTJ(c55379xio5, guideHeaderCard.valueOf(), 47, 47);
        C55379xio c55379xio6 = uxi.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55379xio6, "");
        AEQbTJ(c55379xio6, guideHeaderCard.OLrzqt(), 23, 23);
    }

    public final void copydefault(java.util.List<? extends com.okinc.tradingbot.impl.strategy.bean.Tag> list) {
        uXI uxi = this.copydefault;
        if (uxi == null) {
            Intrinsics.gEmmrt("");
            uxi = null;
        }
        uxi.AhwBna.removeAllViews();
        for (com.okinc.tradingbot.impl.strategy.bean.Tag tag : list) {
            if (tag instanceof DefaultTag) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                DefaultTag defaultTag = (DefaultTag) tag;
                appCompatTextView.setText(defaultTag.KWHzl());
                appCompatTextView.setTextAppearance(defaultTag.OLrzqt());
                appCompatTextView.setTextSize(2, defaultTag.valueOf());
                appCompatTextView.setTextColor(defaultTag.EZpvd());
                appCompatTextView.setGravity(17);
                appCompatTextView.setBackground(C33070mpX.KWHzl(C32113mPz.TaskDescription.AEQbTJ));
                appCompatTextView.setBackgroundTintList(android.content.res.ColorStateList.valueOf(defaultTag.AEQbTJ()));
                appCompatTextView.setPaddingRelative(C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(2, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(2, (android.content.Context) null, 1, (java.lang.Object) null));
                uXI uxi2 = this.copydefault;
                if (uxi2 == null) {
                    Intrinsics.gEmmrt("");
                    uxi2 = null;
                }
                uxi2.AhwBna.addView(appCompatTextView);
            } else {
                if (!(tag instanceof VoucherTag)) {
                    throw new NoWhenBranchMatchedException();
                }
                uXI uxi3 = this.copydefault;
                if (uxi3 == null) {
                    Intrinsics.gEmmrt("");
                    uxi3 = null;
                }
                C55372xih c55372xih = uxi3.AhwBna;
                C52534wOz c52534wOz = C52534wOz.KWHzl;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c55372xih.addView(c52534wOz.copydefault(context, new TacticsListLabelVoucherData(((VoucherTag) tag).copydefault(), false, 0, 0, 0, null, 62, null)));
            }
        }
    }

    public final void setLossInsuranceTag(@NotNull LossInsuranceDisplayData lossInsuranceDisplayData) {
        Intrinsics.checkNotNullParameter(lossInsuranceDisplayData, "");
        uXI uxi = this.copydefault;
        uXI uxi2 = null;
        if (uxi == null) {
            Intrinsics.gEmmrt("");
            uxi = null;
        }
        int childCount = uxi.AhwBna.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            uXI uxi3 = this.copydefault;
            if (uxi3 == null) {
                Intrinsics.gEmmrt("");
                uxi3 = null;
            }
            android.view.View childAt = uxi3.AhwBna.getChildAt(i);
            if (childAt instanceof C52563wQa) {
                uXI uxi4 = this.copydefault;
                if (uxi4 == null) {
                    Intrinsics.gEmmrt("");
                    uxi4 = null;
                }
                uxi4.AhwBna.removeView(childAt);
            } else {
                i++;
            }
        }
        if (Intrinsics.EZpvd(lossInsuranceDisplayData.getEligible(), java.lang.Boolean.TRUE) && Intrinsics.EZpvd((java.lang.Object) lossInsuranceDisplayData.getStatus(), (java.lang.Object) "issued")) {
            uXI uxi5 = this.copydefault;
            if (uxi5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                uxi2 = uxi5;
            }
            C55372xih c55372xih = uxi2.AhwBna;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C52563wQa c52563wQa = new C52563wQa(context, null, 0, 6, null);
            c52563wQa.setData(lossInsuranceDisplayData);
            c55372xih.addView(c52563wQa);
        }
    }

    public final void AEQbTJ(android.widget.ImageView imageView, java.lang.String str, int i, int i2) {
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(getContext());
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
        C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, str, "lfit", i, i2).EZpvd(imageView);
    }
}
