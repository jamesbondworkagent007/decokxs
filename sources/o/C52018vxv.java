package o;

import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.tradingbot.impl.market_place.bot_copy.presenter.SignalBotCopyPresenter;
import com.okinc.tradingbot.impl.strategy.bean.SignalTriggerCard;
import com.okinc.tradingbot.impl.strategy.bean.SignalTriggerData;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC51196viU;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vxv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52018vxv extends ConstraintLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public AbstractC48634uYr OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52018vxv(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52018vxv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:37) call: o.vxv.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52018vxv(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52018vxv(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vxu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52018vxv.copydefault(this.copydefault);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vxs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52018vxv.OLrzqt();
            }
        });
        AYXKKw();
        AEQbTJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC56387yDm<SignalBotCopyPresenter> EZpvd() {
        return (InterfaceC56387yDm) this.KWHzl.getValue();
    }

    public static final InterfaceC56387yDm copydefault(C52018vxv c52018vxv) {
        android.app.Activity activityKWHzl = C35334ntP.KWHzl(c52018vxv);
        Intrinsics.copydefault(activityKWHzl, "");
        final ComponentActivity componentActivity = (ComponentActivity) activityKWHzl;
        final Function0 function0 = null;
        return new ViewModelLazy(C56524yIo.AEQbTJ(SignalBotCopyPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.view.SignalBotTriggerView$botP_delegate$lambda$0$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.view.SignalBotTriggerView$botP_delegate$lambda$0$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.view.SignalBotTriggerView$botP_delegate$lambda$0$$inlined$viewModels$default$3
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

    private final C43316rmw KWHzl() {
        return (C43316rmw) this.AEQbTJ.getValue();
    }

    public static final C43316rmw OLrzqt() {
        return new C43316rmw();
    }

    private final void AYXKKw() {
        this.OLrzqt = (AbstractC48634uYr) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.hGuIrQ, this, true);
        gEmmrt();
    }

    public final void OLrzqt(@NotNull SignalTriggerCard signalTriggerCard) {
        Intrinsics.checkNotNullParameter(signalTriggerCard, "");
        java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) signalTriggerCard.copydefault(), 3);
        if (listAhwBna.isEmpty()) {
            listAhwBna = CommonEmptyData.ActionBar.buildEmptyData$default(CommonEmptyData.Companion, null, 28, null, null, false, false, 61, null);
        }
        C33064mpR.OLrzqt(KWHzl(), (java.util.List<? extends java.lang.Object>) listAhwBna);
        AbstractC48634uYr abstractC48634uYr = this.OLrzqt;
        if (abstractC48634uYr == null) {
            Intrinsics.gEmmrt("");
            abstractC48634uYr = null;
        }
        C52794wYp c52794wYp = abstractC48634uYr.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(signalTriggerCard.OLrzqt() ? 0 : 8);
    }

    private final void gEmmrt() {
        AbstractC48634uYr abstractC48634uYr = this.OLrzqt;
        if (abstractC48634uYr == null) {
            Intrinsics.gEmmrt("");
            abstractC48634uYr = null;
        }
        abstractC48634uYr.copydefault.setLayoutManager(new LinearLayoutManager(getContext()));
        AbstractC48634uYr abstractC48634uYr2 = this.OLrzqt;
        if (abstractC48634uYr2 == null) {
            Intrinsics.gEmmrt("");
            abstractC48634uYr2 = null;
        }
        abstractC48634uYr2.copydefault.addItemDecoration(new C6987aZj(C55298xhM.dpInt$default(32, (android.content.Context) null, 1, (java.lang.Object) null), 0));
        AbstractC48634uYr abstractC48634uYr3 = this.OLrzqt;
        if (abstractC48634uYr3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48634uYr3 = null;
        }
        abstractC48634uYr3.copydefault.setAdapter(KWHzl());
        KWHzl().register(SignalTriggerData.class, new C51311vkd());
        KWHzl().register(CommonEmptyData.class, new C50041uzt(null, 1, null));
    }

    private final void AEQbTJ() {
        AbstractC48634uYr abstractC48634uYr = this.OLrzqt;
        AbstractC48634uYr abstractC48634uYr2 = null;
        if (abstractC48634uYr == null) {
            Intrinsics.gEmmrt("");
            abstractC48634uYr = null;
        }
        C55258xgZ c55258xgZ = abstractC48634uYr.KWHzl;
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, this));
        AbstractC48634uYr abstractC48634uYr3 = this.OLrzqt;
        if (abstractC48634uYr3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48634uYr2 = abstractC48634uYr3;
        }
        C52794wYp c52794wYp = abstractC48634uYr2.EZpvd;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vxv$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.EZpvd.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.vxv$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C52018vxv EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C52018vxv c52018vxv) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c52018vxv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C55867xrz.KWHzl.gEmmrt(((SignalBotCopyPresenter) this.EZpvd.EZpvd().getValue()).copydefault(), "triggerdetails");
                ActivityC51196viU.StateListAnimator stateListAnimator = ActivityC51196viU.Companion;
                android.content.Context context = this.EZpvd.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                stateListAnimator.KWHzl(context, ((SignalBotCopyPresenter) this.EZpvd.EZpvd().getValue()).fetchVPNInfo());
            }
        }
    }

    /* JADX INFO: renamed from: o.vxv$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C52018vxv AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C52018vxv c52018vxv) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c52018vxv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context context = this.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.SlnMSS));
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), (View.OnClickListener) new TaskDescription(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }
}
