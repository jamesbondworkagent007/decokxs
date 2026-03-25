package o;

import android.graphics.drawable.RotateDrawable;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.SignalSortProfitData;
import com.okinc.tradingbot.impl.market_place.bot_copy.presenter.SignalBotCopyPresenter;
import com.okinc.tradingbot.impl.strategy.bean.SignalProfitCard;
import com.okinc.tradingbot.impl.strategy.dataMapper.SignalProfitRange;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC51183viH;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vxo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52011vxo extends ConstraintLayout {
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public AbstractC48629uYm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52011vxo(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52011vxo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:39) call: o.vxo.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52011vxo(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52011vxo(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.vxr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52011vxo.EZpvd(this.copydefault);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.vxw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52011vxo.AEQbTJ(context);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vxt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52011vxo.OLrzqt();
            }
        });
        valueOf();
        AYXKKw();
    }

    public static final InterfaceC56387yDm EZpvd(C52011vxo c52011vxo) {
        android.app.Activity activityKWHzl = C35334ntP.KWHzl(c52011vxo);
        Intrinsics.copydefault(activityKWHzl, "");
        final ComponentActivity componentActivity = (ComponentActivity) activityKWHzl;
        final Function0 function0 = null;
        return new ViewModelLazy(C56524yIo.AEQbTJ(SignalBotCopyPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.view.SignalBotProfitView$botP_delegate$lambda$0$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = componentActivity.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.view.SignalBotProfitView$botP_delegate$lambda$0$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = componentActivity.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.view.SignalBotProfitView$botP_delegate$lambda$0$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC56387yDm<SignalBotCopyPresenter> copydefault() {
        return (InterfaceC56387yDm) this.EZpvd.getValue();
    }

    public static final androidx.fragment.app.FragmentManager AEQbTJ(android.content.Context context) {
        Intrinsics.copydefault(context, "");
        return ((FragmentActivity) context).getSupportFragmentManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.fragment.app.FragmentManager KWHzl() {
        return (androidx.fragment.app.FragmentManager) this.OLrzqt.getValue();
    }

    private final C43316rmw EZpvd() {
        return (C43316rmw) this.KWHzl.getValue();
    }

    public static final C43316rmw OLrzqt() {
        return new C43316rmw();
    }

    private final void valueOf() {
        this.copydefault = (AbstractC48629uYm) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.inahnb, this, true);
        djBIcL();
    }

    public final void OLrzqt(@NotNull SignalProfitCard signalProfitCard) {
        Intrinsics.checkNotNullParameter(signalProfitCard, "");
        AbstractC48629uYm abstractC48629uYm = this.copydefault;
        AbstractC48629uYm abstractC48629uYm2 = null;
        if (abstractC48629uYm == null) {
            Intrinsics.gEmmrt("");
            abstractC48629uYm = null;
        }
        abstractC48629uYm.AYXKKw.setText(signalProfitCard.OLrzqt());
        AbstractC48629uYm abstractC48629uYm3 = this.copydefault;
        if (abstractC48629uYm3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48629uYm3 = null;
        }
        abstractC48629uYm3.AhwBna.setText(signalProfitCard.valueOf());
        AbstractC48629uYm abstractC48629uYm4 = this.copydefault;
        if (abstractC48629uYm4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48629uYm4 = null;
        }
        abstractC48629uYm4.KWHzl.setText(signalProfitCard.copydefault());
        AbstractC48629uYm abstractC48629uYm5 = this.copydefault;
        if (abstractC48629uYm5 == null) {
            Intrinsics.gEmmrt("");
            abstractC48629uYm5 = null;
        }
        abstractC48629uYm5.KWHzl.setTextColor(signalProfitCard.AEQbTJ());
        AbstractC48629uYm abstractC48629uYm6 = this.copydefault;
        if (abstractC48629uYm6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48629uYm2 = abstractC48629uYm6;
        }
        C52794wYp c52794wYp = abstractC48629uYm2.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(signalProfitCard.KWHzl() ? 0 : 8);
        java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) signalProfitCard.EZpvd(), 5);
        if (listAhwBna.isEmpty()) {
            listAhwBna = CommonEmptyData.ActionBar.buildEmptyData$default(CommonEmptyData.Companion, null, 28, null, null, false, false, 61, null);
        }
        C33064mpR.OLrzqt(EZpvd(), (java.util.List<? extends java.lang.Object>) listAhwBna);
    }

    private final void djBIcL() {
        AbstractC48629uYm abstractC48629uYm = this.copydefault;
        if (abstractC48629uYm == null) {
            Intrinsics.gEmmrt("");
            abstractC48629uYm = null;
        }
        abstractC48629uYm.valueOf.setLayoutManager(new LinearLayoutManager(getContext()));
        AbstractC48629uYm abstractC48629uYm2 = this.copydefault;
        if (abstractC48629uYm2 == null) {
            Intrinsics.gEmmrt("");
            abstractC48629uYm2 = null;
        }
        abstractC48629uYm2.valueOf.setAdapter(EZpvd());
        EZpvd().register(SignalSortProfitData.class, new C51308vka());
        EZpvd().register(CommonEmptyData.class, new C50041uzt(null, 1, null));
    }

    private final void AYXKKw() {
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C48033uCm.ActionBar.values);
        Intrinsics.copydefault(drawableKWHzl, "");
        android.graphics.drawable.Drawable drawableMutate = ((RotateDrawable) drawableKWHzl).mutate();
        AbstractC48629uYm abstractC48629uYm = this.copydefault;
        AbstractC48629uYm abstractC48629uYm2 = null;
        if (abstractC48629uYm == null) {
            Intrinsics.gEmmrt("");
            abstractC48629uYm = null;
        }
        abstractC48629uYm.AYXKKw.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawableMutate, (android.graphics.drawable.Drawable) null);
        AbstractC48629uYm abstractC48629uYm3 = this.copydefault;
        if (abstractC48629uYm3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48629uYm3 = null;
        }
        AppCompatTextView appCompatTextView = abstractC48629uYm3.AYXKKw;
        appCompatTextView.setOnClickListener(new ActionBar(appCompatTextView, 1000L, drawableMutate, this));
        AbstractC48629uYm abstractC48629uYm4 = this.copydefault;
        if (abstractC48629uYm4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48629uYm2 = abstractC48629uYm4;
        }
        C52794wYp c52794wYp = abstractC48629uYm2.OLrzqt;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vxo$StateListAnimator */
    public static final class StateListAnimator implements Function1<SignalProfitRange, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(SignalProfitRange signalProfitRange) {
            EZpvd(signalProfitRange);
            return Unit.INSTANCE;
        }

        public final void EZpvd(SignalProfitRange signalProfitRange) {
            Intrinsics.checkNotNullParameter(signalProfitRange, "");
            AbstractC48629uYm abstractC48629uYm = C52011vxo.this.copydefault;
            AbstractC48629uYm abstractC48629uYm2 = null;
            if (abstractC48629uYm == null) {
                Intrinsics.gEmmrt("");
                abstractC48629uYm = null;
            }
            AppCompatTextView appCompatTextView = abstractC48629uYm.AYXKKw;
            SignalProfitRange.TaskDescription taskDescription = SignalProfitRange.Companion;
            appCompatTextView.setText(taskDescription.OLrzqt(signalProfitRange));
            AbstractC48629uYm abstractC48629uYm3 = C52011vxo.this.copydefault;
            if (abstractC48629uYm3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC48629uYm2 = abstractC48629uYm3;
            }
            abstractC48629uYm2.AhwBna.setText(taskDescription.KWHzl(signalProfitRange));
            C55867xrz.KWHzl.djBIcL(((SignalBotCopyPresenter) C52011vxo.this.copydefault().getValue()).copydefault(), signalProfitRange.getCount());
        }
    }

    /* JADX INFO: renamed from: o.vxo$Application */
    public static final class Application implements Function0<Unit> {
        public final /* synthetic */ android.graphics.drawable.Drawable AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.graphics.drawable.Drawable drawable) {
            this.AEQbTJ = drawable;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }

        public final void OLrzqt() {
            AbstractC48629uYm abstractC48629uYm = C52011vxo.this.copydefault;
            if (abstractC48629uYm == null) {
                Intrinsics.gEmmrt("");
                abstractC48629uYm = null;
            }
            abstractC48629uYm.AYXKKw.setSelected(false);
            android.animation.ObjectAnimator.ofInt(this.AEQbTJ, FirebaseAnalytics.Param.LEVEL, 5000, 10000).setDuration(0L).start();
        }
    }

    /* JADX INFO: renamed from: o.vxo$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.graphics.drawable.Drawable EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C52011vxo OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, android.graphics.drawable.Drawable drawable, C52011vxo c52011vxo) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = drawable;
            this.OLrzqt = c52011vxo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.animation.ObjectAnimator.ofInt(this.EZpvd, FirebaseAnalytics.Param.LEVEL, 0, 5000).setDuration(0L).start();
                C51394vmG c51394vmG = new C51394vmG();
                c51394vmG.AEQbTJ(this.OLrzqt.new StateListAnimator());
                c51394vmG.AEQbTJ(this.OLrzqt.new Application(this.EZpvd));
                c51394vmG.show(this.OLrzqt.KWHzl());
            }
        }
    }

    /* JADX INFO: renamed from: o.vxo$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C52011vxo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C52011vxo c52011vxo) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = c52011vxo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C55867xrz.KWHzl.gEmmrt(((SignalBotCopyPresenter) this.copydefault.copydefault().getValue()).copydefault(), "profitdetails");
                ActivityC51183viH.Activity activity = ActivityC51183viH.Companion;
                android.content.Context context = this.copydefault.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                activity.KWHzl(context, ((SignalBotCopyPresenter) this.copydefault.copydefault().getValue()).fetchVPNInfo(), ((SignalBotCopyPresenter) this.copydefault.copydefault().getValue()).AhwBna());
            }
        }
    }
}
