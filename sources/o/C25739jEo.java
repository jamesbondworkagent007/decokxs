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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jEo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25739jEo extends kMD<TrendTraderUIModel> {
    public final java.util.Map<kMF, TrendTraderUIModel> AEQbTJ;
    public final Function1<java.lang.String, Unit> EZpvd;
    public final java.util.Map<kMF, android.os.CountDownTimer> KWHzl;
    public final Function0<Unit> copydefault;

    /* JADX INFO: renamed from: o.jEo$ActionBar */
    public final /* synthetic */ class ActionBar {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, Unit> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C25739jEo(@NotNull Function1<? super java.lang.String, Unit> function1, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd = function1;
        this.copydefault = function0;
        this.KWHzl = new LinkedHashMap();
        this.AEQbTJ = new LinkedHashMap();
    }

    @Override // o.kMD
    public ViewBinding KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hEU heuCopydefault = hEU.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(heuCopydefault, "");
        return heuCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull kMF kmf) {
        Intrinsics.checkNotNullParameter(kmf, "");
        super.onViewRecycled(kmf);
        AEQbTJ(kmf);
        this.AEQbTJ.remove(kmf);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Lo/kMF;Ljava/lang/Object;)V */
    @Override // o.kMD
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull kMF kmf, @NotNull TrendTraderUIModel trendTraderUIModel) {
        Intrinsics.checkNotNullParameter(kmf, "");
        Intrinsics.checkNotNullParameter(trendTraderUIModel, "");
        ViewBinding viewBindingAEQbTJ = kmf.AEQbTJ();
        hEU heu = viewBindingAEQbTJ instanceof hEU ? (hEU) viewBindingAEQbTJ : null;
        if (heu == null) {
            return;
        }
        this.AEQbTJ.put(kmf, trendTraderUIModel);
        AEQbTJ(kmf);
        ShapeableImageView shapeableImageView = heu.gEmmrt;
        Intrinsics.copydefault(shapeableImageView);
        C25386ivj.loadWalletProfileImage$default(shapeableImageView, trendTraderUIModel.KWHzl(), trendTraderUIModel.AEQbTJ(), trendTraderUIModel.OLrzqt(), 0.0f, 8, null);
        android.widget.TextView textView = heu.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C31258lqd.copydefault(textView, trendTraderUIModel.EZpvd(), trendTraderUIModel.copydefault(), C52761wXj.Activity.DCUTEIddSDPG);
        android.widget.TextView textView2 = heu.valueOf;
        textView2.setPaintFlags(textView2.getPaintFlags() | 8);
        android.widget.TextView textView3 = heu.valueOf;
        textView3.setOnClickListener(new Application(textView3, 1000L, this, trendTraderUIModel));
        ConstraintLayout root = heu.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, this));
        android.widget.TextView textView4 = heu.AhwBna;
        android.content.Context context = textView4.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        kotlin.Pair<java.lang.String, java.lang.Integer> pairOLrzqt = OLrzqt(context, trendTraderUIModel.djBIcL());
        java.lang.String strComponent1 = pairOLrzqt.component1();
        int iIntValue = pairOLrzqt.component2().intValue();
        textView4.setText(strComponent1);
        textView4.setTextColor(iIntValue);
        android.content.Context context2 = textView4.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textView4.setBackgroundDrawable(copydefault(context2, trendTraderUIModel.djBIcL()));
        heu.EZpvd.setText(trendTraderUIModel.AhwBna());
        android.widget.TextView textView5 = heu.KWHzl;
        textView5.setText(trendTraderUIModel.valueOf());
        android.content.Context context3 = textView5.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        textView5.setTextColor(EZpvd(context3, trendTraderUIModel.gEmmrt()));
        copydefault(kmf, trendTraderUIModel);
        AEQbTJ(kmf, trendTraderUIModel);
    }

    private final kotlin.Pair<java.lang.String, java.lang.Integer> OLrzqt(android.content.Context context, int i) {
        TradeType tradeTypeCopydefault = TradeType.Companion.copydefault(i);
        switch (tradeTypeCopydefault == null ? -1 : ActionBar.AEQbTJ[tradeTypeCopydefault.ordinal()]) {
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

    private final android.graphics.drawable.Drawable copydefault(android.content.Context context, int i) {
        TradeType tradeTypeCopydefault = TradeType.Companion.copydefault(i);
        int i2 = tradeTypeCopydefault == null ? -1 : ActionBar.AEQbTJ[tradeTypeCopydefault.ordinal()];
        int i3 = (i2 == 1 || i2 == 2 || i2 == 3) ? C52761wXj.Activity.invokespecialhlXVux : C52761wXj.Activity.invokespecialdPnHjp;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(10.0f);
        gradientDrawable.setColor(context.getColor(i3));
        return gradientDrawable;
    }

    private final int EZpvd(android.content.Context context, int i) {
        if (i == -1) {
            return context.getColor(C52761wXj.Activity.ONJgbh);
        }
        if (i == 1) {
            return context.getColor(C52761wXj.Activity.RWIpjU);
        }
        return context.getColor(C52761wXj.Activity.Dmq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(kMF kmf, TrendTraderUIModel trendTraderUIModel) {
        ViewBinding viewBindingAEQbTJ = kmf.AEQbTJ();
        hEU heu = viewBindingAEQbTJ instanceof hEU ? (hEU) viewBindingAEQbTJ : null;
        if (heu == null) {
            return;
        }
        heu.djBIcL.setText(C25322iuY.OLrzqt.EZpvd(java.lang.String.valueOf(trendTraderUIModel.AYXKKw())));
    }

    private final void AEQbTJ(kMF kmf, TrendTraderUIModel trendTraderUIModel) {
        AEQbTJ(kmf);
        Activity activity = new Activity(kmf, trendTraderUIModel);
        this.KWHzl.put(kmf, activity);
        activity.start();
    }

    /* JADX INFO: renamed from: o.jEo$Activity */
    public static final class Activity extends android.os.CountDownTimer {
        public final /* synthetic */ TrendTraderUIModel EZpvd;
        public final /* synthetic */ kMF KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(kMF kmf, TrendTraderUIModel trendTraderUIModel) {
            super(Long.MAX_VALUE, 1000L);
            this.KWHzl = kmf;
            this.EZpvd = trendTraderUIModel;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            TrendTraderUIModel trendTraderUIModel = (TrendTraderUIModel) C25739jEo.this.AEQbTJ.get(this.KWHzl);
            if (Intrinsics.EZpvd((java.lang.Object) (trendTraderUIModel != null ? trendTraderUIModel.OLrzqt() : null), (java.lang.Object) this.EZpvd.OLrzqt())) {
                C25739jEo.this.copydefault(this.KWHzl, this.EZpvd);
            } else {
                cancel();
                C25739jEo.this.KWHzl.remove(this.KWHzl);
            }
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            C25739jEo.this.KWHzl.remove(this.KWHzl);
        }
    }

    private final void AEQbTJ(kMF kmf) {
        android.os.CountDownTimer countDownTimer = this.KWHzl.get(kmf);
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.KWHzl.remove(kmf);
    }

    /* JADX INFO: renamed from: o.jEo$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ TrendTraderUIModel EZpvd;
        public final /* synthetic */ C25739jEo KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C25739jEo c25739jEo, TrendTraderUIModel trendTraderUIModel) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c25739jEo;
            this.EZpvd = trendTraderUIModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.OLrzqt().invoke(this.EZpvd.OLrzqt());
            }
        }
    }

    /* JADX INFO: renamed from: o.jEo$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C25739jEo EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C25739jEo c25739jEo) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c25739jEo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.EZpvd().invoke();
            }
        }
    }
}
