package o;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TradeType;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrendTraderUIModel;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jEe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25729jEe extends kMD<TrendTraderUIModel> {
    public final java.util.Map<kMF, android.os.CountDownTimer> AEQbTJ;
    public final java.util.Map<kMF, TrendTraderUIModel> OLrzqt;
    public final Function1<TrendTraderUIModel, Unit> copydefault;

    /* JADX INFO: renamed from: o.jEe$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradeType.values().length];
            try {
                iArr[TradeType.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TradeType.BUY_MORE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TradeType.NEWLY_HOLD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[TradeType.SELL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[TradeType.SELL_PART.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[TradeType.SELL_ALL.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrendTraderUIModel, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C25729jEe(@NotNull Function1<? super TrendTraderUIModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
        this.AEQbTJ = new LinkedHashMap();
        this.OLrzqt = new LinkedHashMap();
    }

    @Override // o.kMD
    public ViewBinding KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hEP hepAEQbTJ = hEP.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hepAEQbTJ, "");
        return hepAEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull kMF kmf) {
        Intrinsics.checkNotNullParameter(kmf, "");
        super.onViewRecycled(kmf);
        KWHzl(kmf);
        this.OLrzqt.remove(kmf);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/kMF;Ljava/lang/Object;)V */
    @Override // o.kMD
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull kMF kmf, @NotNull TrendTraderUIModel trendTraderUIModel) {
        Intrinsics.checkNotNullParameter(kmf, "");
        Intrinsics.checkNotNullParameter(trendTraderUIModel, "");
        ViewBinding viewBindingAEQbTJ = kmf.AEQbTJ();
        hEP hep = viewBindingAEQbTJ instanceof hEP ? (hEP) viewBindingAEQbTJ : null;
        if (hep == null) {
            return;
        }
        this.OLrzqt.put(kmf, trendTraderUIModel);
        KWHzl(kmf);
        ShapeableImageView shapeableImageView = hep.AYXKKw;
        Intrinsics.copydefault(shapeableImageView);
        C25386ivj.loadWalletProfileImage$default(shapeableImageView, trendTraderUIModel.KWHzl(), trendTraderUIModel.AEQbTJ(), trendTraderUIModel.OLrzqt(), 0.0f, 8, null);
        android.widget.TextView textView = hep.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C31258lqd.copydefault(textView, trendTraderUIModel.EZpvd(), trendTraderUIModel.copydefault(), C52761wXj.Activity.DCUTEIddSDPG);
        android.widget.TextView textView2 = hep.AhwBna;
        textView2.setPaintFlags(textView2.getPaintFlags() | 8);
        android.widget.TextView textView3 = hep.djBIcL;
        android.content.Context context = textView3.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        kotlin.Pair<java.lang.String, java.lang.Integer> pairAEQbTJ = AEQbTJ(context, trendTraderUIModel.djBIcL());
        java.lang.String strComponent1 = pairAEQbTJ.component1();
        int iIntValue = pairAEQbTJ.component2().intValue();
        textView3.setText(strComponent1);
        textView3.setTextColor(iIntValue);
        android.content.Context context2 = textView3.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView3.setBackground(EZpvd(context2, trendTraderUIModel.djBIcL()));
        hep.OLrzqt.setText(trendTraderUIModel.AhwBna());
        android.widget.TextView textView4 = hep.EZpvd;
        textView4.setText(trendTraderUIModel.valueOf());
        android.content.Context context3 = textView4.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        textView4.setTextColor(copydefault(context3, trendTraderUIModel.gEmmrt()));
        ConstraintLayout root = hep.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, this, trendTraderUIModel));
        AEQbTJ(kmf, trendTraderUIModel);
        EZpvd(kmf, trendTraderUIModel);
    }

    public final kotlin.Pair<java.lang.String, java.lang.Integer> AEQbTJ(android.content.Context context, int i) {
        TradeType tradeTypeCopydefault = TradeType.Companion.copydefault(i);
        switch (tradeTypeCopydefault == null ? -1 : Application.AEQbTJ[tradeTypeCopydefault.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C23274hvD.Fragment.getOnBackPressedDispatcher), java.lang.Integer.valueOf(context.getColor(C52761wXj.Activity.RWIpjU)));
            case 4:
            case 5:
            case 6:
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C23274hvD.Fragment.onActivityResult), java.lang.Integer.valueOf(context.getColor(C52761wXj.Activity.ONJgbh)));
            default:
                return new kotlin.Pair<>("", java.lang.Integer.valueOf(context.getColor(C52761wXj.Activity.Dmq)));
        }
    }

    public final android.graphics.drawable.Drawable EZpvd(android.content.Context context, int i) {
        TradeType tradeTypeCopydefault = TradeType.Companion.copydefault(i);
        int i2 = tradeTypeCopydefault == null ? -1 : Application.AEQbTJ[tradeTypeCopydefault.ordinal()];
        int i3 = (i2 == 1 || i2 == 2 || i2 == 3) ? C52761wXj.Activity.invokespecialhlXVux : C52761wXj.Activity.invokespecialdPnHjp;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(10.0f);
        gradientDrawable.setColor(context.getColor(i3));
        return gradientDrawable;
    }

    public final int copydefault(android.content.Context context, int i) {
        if (i == -1) {
            return context.getColor(C52761wXj.Activity.ONJgbh);
        }
        if (i == 1) {
            return context.getColor(C52761wXj.Activity.RWIpjU);
        }
        return context.getColor(C52761wXj.Activity.Dmq);
    }

    public final void AEQbTJ(kMF kmf, TrendTraderUIModel trendTraderUIModel) {
        ViewBinding viewBindingAEQbTJ = kmf.AEQbTJ();
        hEP hep = viewBindingAEQbTJ instanceof hEP ? (hEP) viewBindingAEQbTJ : null;
        if (hep == null) {
            return;
        }
        hep.KWHzl.setText(C25322iuY.OLrzqt.EZpvd(java.lang.String.valueOf(trendTraderUIModel.AYXKKw())));
    }

    public final void EZpvd(kMF kmf, TrendTraderUIModel trendTraderUIModel) {
        KWHzl(kmf);
        StateListAnimator stateListAnimator = new StateListAnimator(kmf, trendTraderUIModel);
        this.AEQbTJ.put(kmf, stateListAnimator);
        stateListAnimator.start();
    }

    /* JADX INFO: renamed from: o.jEe$StateListAnimator */
    public static final class StateListAnimator extends android.os.CountDownTimer {
        public final /* synthetic */ kMF AEQbTJ;
        public final /* synthetic */ TrendTraderUIModel copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(kMF kmf, TrendTraderUIModel trendTraderUIModel) {
            super(Long.MAX_VALUE, 1000L);
            this.AEQbTJ = kmf;
            this.copydefault = trendTraderUIModel;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            TrendTraderUIModel trendTraderUIModel = (TrendTraderUIModel) C25729jEe.this.OLrzqt.get(this.AEQbTJ);
            if (Intrinsics.EZpvd((java.lang.Object) (trendTraderUIModel != null ? trendTraderUIModel.OLrzqt() : null), (java.lang.Object) this.copydefault.OLrzqt())) {
                C25729jEe.this.AEQbTJ(this.AEQbTJ, this.copydefault);
            } else {
                cancel();
                C25729jEe.this.AEQbTJ.remove(this.AEQbTJ);
            }
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            C25729jEe.this.AEQbTJ.remove(this.AEQbTJ);
        }
    }

    public final void KWHzl(kMF kmf) {
        android.os.CountDownTimer countDownTimer = this.AEQbTJ.get(kmf);
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.AEQbTJ.remove(kmf);
    }

    /* JADX INFO: renamed from: o.jEe$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ TrendTraderUIModel EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C25729jEe OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C25729jEe c25729jEe, TrendTraderUIModel trendTraderUIModel) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = c25729jEe;
            this.EZpvd = trendTraderUIModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.copydefault.invoke(this.EZpvd);
            }
        }
    }
}
