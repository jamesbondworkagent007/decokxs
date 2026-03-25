package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.bumptech.glide.Glide;
import com.okinc.tradingbot.impl.strategy.bean.DefaultTag;
import com.okinc.tradingbot.impl.strategy.bean.GuideHeaderCard;
import com.okinc.tradingbot.impl.strategy.bean.GuideHeaderItem;
import com.okinc.tradingbot.impl.strategy.bean.TagConfig;
import com.okinc.tradingbot.impl.strategy.bean.VoucherTag;
import com.okinc.unify_trade.bot.data.TacticsListLabelData;
import com.okinc.unify_trade.bot.data.TacticsListLabelVoucherData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wMk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52465wMk extends ConstraintLayout {
    public uXM OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52465wMk(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52465wMk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: o.wMk.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52465wMk(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52465wMk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ();
    }

    private final void AEQbTJ() {
        uXM uxm = (uXM) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.OzhFjl, this, true);
        this.OLrzqt = uxm;
        if (uxm == null) {
            Intrinsics.gEmmrt("");
            uxm = null;
        }
        uxm.KWHzl.setExpand(true);
    }

    public final void copydefault(@NotNull GuideHeaderCard guideHeaderCard) {
        java.lang.Integer numAEQbTJ;
        java.lang.Integer numAEQbTJ2;
        java.lang.Integer numAEQbTJ3;
        Intrinsics.checkNotNullParameter(guideHeaderCard, "");
        uXM uxm = this.OLrzqt;
        if (uxm == null) {
            Intrinsics.gEmmrt("");
            uxm = null;
        }
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(getContext());
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
        C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, guideHeaderCard.valueOf(), "lfit", 47, 47).EZpvd((android.widget.ImageView) uxm.EZpvd);
        uxm.AEQbTJ.setText(guideHeaderCard.KWHzl());
        AppCompatTextView appCompatTextView = uxm.gEmmrt;
        GuideHeaderItem guideHeaderItemEZpvd = guideHeaderCard.EZpvd();
        appCompatTextView.setText(guideHeaderItemEZpvd != null ? guideHeaderItemEZpvd.EZpvd() : null);
        AppCompatTextView appCompatTextView2 = uxm.AYXKKw;
        GuideHeaderItem guideHeaderItemEZpvd2 = guideHeaderCard.EZpvd();
        appCompatTextView2.setText(guideHeaderItemEZpvd2 != null ? guideHeaderItemEZpvd2.OLrzqt() : null);
        GuideHeaderItem guideHeaderItemEZpvd3 = guideHeaderCard.EZpvd();
        if (guideHeaderItemEZpvd3 != null && (numAEQbTJ3 = guideHeaderItemEZpvd3.AEQbTJ()) != null) {
            uxm.AYXKKw.setTextColor(numAEQbTJ3.intValue());
        }
        boolean z = guideHeaderCard.AhwBna() != null;
        AppCompatTextView appCompatTextView3 = uxm.DbNXlk;
        GuideHeaderItem guideHeaderItemAhwBna = guideHeaderCard.AhwBna();
        appCompatTextView3.setText(guideHeaderItemAhwBna != null ? guideHeaderItemAhwBna.EZpvd() : null);
        Intrinsics.copydefault(appCompatTextView3);
        appCompatTextView3.setVisibility(z ? 0 : 8);
        AppCompatTextView appCompatTextView4 = uxm.valueOf;
        GuideHeaderItem guideHeaderItemAhwBna2 = guideHeaderCard.AhwBna();
        appCompatTextView4.setText(guideHeaderItemAhwBna2 != null ? guideHeaderItemAhwBna2.OLrzqt() : null);
        Intrinsics.copydefault(appCompatTextView4);
        appCompatTextView4.setVisibility(z ? 0 : 8);
        GuideHeaderItem guideHeaderItemAhwBna3 = guideHeaderCard.AhwBna();
        if (guideHeaderItemAhwBna3 != null && (numAEQbTJ2 = guideHeaderItemAhwBna3.AEQbTJ()) != null) {
            uxm.valueOf.setTextColor(numAEQbTJ2.intValue());
        }
        boolean z2 = guideHeaderCard.AEQbTJ() != null;
        C50032uzk c50032uzk = uxm.djBIcL;
        GuideHeaderItem guideHeaderItemAEQbTJ = guideHeaderCard.AEQbTJ();
        c50032uzk.setText(guideHeaderItemAEQbTJ != null ? guideHeaderItemAEQbTJ.EZpvd() : null);
        Intrinsics.copydefault(c50032uzk);
        c50032uzk.setVisibility(z2 ? 0 : 8);
        AppCompatTextView appCompatTextView5 = uxm.AhwBna;
        GuideHeaderItem guideHeaderItemAEQbTJ2 = guideHeaderCard.AEQbTJ();
        appCompatTextView5.setText(guideHeaderItemAEQbTJ2 != null ? guideHeaderItemAEQbTJ2.OLrzqt() : null);
        Intrinsics.copydefault(appCompatTextView5);
        appCompatTextView5.setVisibility(z2 ? 0 : 8);
        GuideHeaderItem guideHeaderItemAEQbTJ3 = guideHeaderCard.AEQbTJ();
        if (guideHeaderItemAEQbTJ3 != null && (numAEQbTJ = guideHeaderItemAEQbTJ3.AEQbTJ()) != null) {
            uxm.AhwBna.setTextColor(numAEQbTJ.intValue());
        }
        copydefault(guideHeaderCard.copydefault());
    }

    private final void copydefault(java.util.List<? extends com.okinc.tradingbot.impl.strategy.bean.Tag> list) {
        TacticsListLabelData tacticsListLabelData;
        uXM uxm = this.OLrzqt;
        if (uxm == null) {
            Intrinsics.gEmmrt("");
            uxm = null;
        }
        uxm.KWHzl.removeAllViews();
        for (com.okinc.tradingbot.impl.strategy.bean.Tag tag : list) {
            if (tag instanceof DefaultTag) {
                DefaultTag defaultTag = (DefaultTag) tag;
                TagConfig tagConfigCopydefault = defaultTag.copydefault();
                if (tagConfigCopydefault != null) {
                    tacticsListLabelData = new TacticsListLabelData(defaultTag.KWHzl(), false, tagConfigCopydefault.AEQbTJ(), tagConfigCopydefault.EZpvd(), 0, 18, null);
                } else {
                    tacticsListLabelData = new TacticsListLabelData(null, false, 0, 0, 0, 31, null);
                }
                uXM uxm2 = this.OLrzqt;
                if (uxm2 == null) {
                    Intrinsics.gEmmrt("");
                    uxm2 = null;
                }
                C55372xih c55372xih = uxm2.KWHzl;
                C52534wOz c52534wOz = C52534wOz.KWHzl;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c55372xih.addView(c52534wOz.copydefault(context, tacticsListLabelData));
            } else {
                if (!(tag instanceof VoucherTag)) {
                    throw new NoWhenBranchMatchedException();
                }
                uXM uxm3 = this.OLrzqt;
                if (uxm3 == null) {
                    Intrinsics.gEmmrt("");
                    uxm3 = null;
                }
                C55372xih c55372xih2 = uxm3.KWHzl;
                C52534wOz c52534wOz2 = C52534wOz.KWHzl;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                c55372xih2.addView(c52534wOz2.copydefault(context2, new TacticsListLabelVoucherData(((VoucherTag) tag).copydefault(), false, 0, 0, 0, null, 62, null)));
            }
        }
    }

    public final void setCoinSwitchEnable(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        uXM uxm = this.OLrzqt;
        if (uxm == null) {
            Intrinsics.gEmmrt("");
            uxm = null;
        }
        AppCompatTextView appCompatTextView = uxm.AEQbTJ;
        setTitleArrow(false);
        appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 1000L, this, function0));
    }

    public final void setTitleArrow(boolean z) {
        uXM uxm = this.OLrzqt;
        if (uxm == null) {
            Intrinsics.gEmmrt("");
            uxm = null;
        }
        uxm.AEQbTJ.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, z ? C52761wXj.TaskDescription.OxVOHk : C52761wXj.TaskDescription.OJuSTm, 0);
    }

    /* JADX INFO: renamed from: o.wMk$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C52465wMk OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C52465wMk c52465wMk, Function0 function0) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = c52465wMk;
            this.EZpvd = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.setTitleArrow(true);
                this.EZpvd.invoke();
            }
        }
    }
}
