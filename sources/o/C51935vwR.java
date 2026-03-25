package o;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradingbot.impl.order.strategy.BotTradePresenter;
import com.okinc.unify_trade.bot.data.BotGuideData;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC49496upe;
import o.wJM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vwR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51935vwR extends ConstraintLayout {
    public AbstractC50873vcP AEQbTJ;
    public C51788vtd EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51935vwR(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51935vwR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:54) call: o.vwR.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C51935vwR(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51935vwR(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vwX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51935vwR.EZpvd(context);
            }
        });
        this.OLrzqt = true;
        copydefault();
        KWHzl();
        OLrzqt();
    }

    public static final InterfaceC56387yDm EZpvd(android.content.Context context) {
        final AppCompatActivity appCompatActivityCopydefault = C49955uyM.copydefault(context);
        final Function0 function0 = null;
        if (appCompatActivityCopydefault == null) {
            return null;
        }
        return new ViewModelLazy(C56524yIo.AEQbTJ(BotTradePresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.view.BotTradeToolBar$botP_delegate$lambda$0$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = appCompatActivityCopydefault.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.view.BotTradeToolBar$botP_delegate$lambda$0$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = appCompatActivityCopydefault.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.view.BotTradeToolBar$botP_delegate$lambda$0$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = appCompatActivityCopydefault.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    private final void copydefault() {
        setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
        this.AEQbTJ = (AbstractC50873vcP) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.gZKUVK, this, true);
        C56071xvr c56071xvr = C56071xvr.gEmmrt;
        wPQ.AEQbTJ(this, c56071xvr.isConnected(), c56071xvr.fIwbmz());
    }

    private final void KWHzl() {
        this.EZpvd = new C51788vtd();
    }

    private final void OLrzqt() {
        AbstractC50873vcP abstractC50873vcP = this.AEQbTJ;
        AbstractC50873vcP abstractC50873vcP2 = null;
        if (abstractC50873vcP == null) {
            Intrinsics.gEmmrt("");
            abstractC50873vcP = null;
        }
        AppCompatImageView appCompatImageView = abstractC50873vcP.EZpvd;
        appCompatImageView.setOnClickListener(new Application(appCompatImageView, 1000L, this));
        AbstractC50873vcP abstractC50873vcP3 = this.AEQbTJ;
        if (abstractC50873vcP3 == null) {
            Intrinsics.gEmmrt("");
            abstractC50873vcP3 = null;
        }
        AppCompatTextView appCompatTextView = abstractC50873vcP3.OLrzqt;
        appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 1000L, this));
        AbstractC50873vcP abstractC50873vcP4 = this.AEQbTJ;
        if (abstractC50873vcP4 == null) {
            Intrinsics.gEmmrt("");
            abstractC50873vcP4 = null;
        }
        AppCompatImageView appCompatImageView2 = abstractC50873vcP4.KWHzl;
        appCompatImageView2.setOnClickListener(new ActionBar(appCompatImageView2, 1000L, this));
        AbstractC50873vcP abstractC50873vcP5 = this.AEQbTJ;
        if (abstractC50873vcP5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50873vcP2 = abstractC50873vcP5;
        }
        AppCompatImageView appCompatImageView3 = abstractC50873vcP2.AEQbTJ;
        appCompatImageView3.setOnClickListener(new StateListAnimator(appCompatImageView3, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vwR$TaskDescription */
    public static final class TaskDescription implements Function0<Unit> {
        public final /* synthetic */ AppCompatTextView EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(AppCompatTextView appCompatTextView) {
            this.EZpvd = appCompatTextView;
        }

        public final void copydefault() {
            this.EZpvd.setSelected(false);
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.vwR$Dialog */
    public static final class Dialog implements Function1<java.lang.String, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        public final void KWHzl(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C51788vtd c51788vtd = C51935vwR.this.EZpvd;
            if (c51788vtd == null) {
                Intrinsics.gEmmrt("");
                c51788vtd = null;
            }
            c51788vtd.copydefault(str);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.String str) {
            KWHzl(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gEmmrt() {
        xOU xouWlaJM;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) ? null : xouWlaJM.OLrzqt()), (java.lang.Object) "dcd_bot")) {
            C32866mlf.onEvent$default("DCDBot_PlaceOrder_Fullbutton_Click", (TrackChannel[]) null, new Function1() { // from class: o.vwT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51935vwR.OLrzqt((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button_type", "book", true);
        return Unit.INSTANCE;
    }

    public final C56111xwe<kotlin.Pair<java.lang.Boolean, java.lang.String>> EZpvd() {
        C51788vtd c51788vtd = this.EZpvd;
        if (c51788vtd == null) {
            Intrinsics.gEmmrt("");
            c51788vtd = null;
        }
        return c51788vtd.copydefault();
    }

    public static /* synthetic */ void refreshBotName$default(C51935vwR c51935vwR, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c51935vwR.copydefault(str);
    }

    public final void copydefault(java.lang.String str) {
        AbstractC50873vcP abstractC50873vcP = this.AEQbTJ;
        C51788vtd c51788vtd = null;
        if (abstractC50873vcP == null) {
            Intrinsics.gEmmrt("");
            abstractC50873vcP = null;
        }
        AppCompatTextView appCompatTextView = abstractC50873vcP.OLrzqt;
        C51788vtd c51788vtd2 = this.EZpvd;
        if (c51788vtd2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c51788vtd = c51788vtd2;
        }
        appCompatTextView.setText(c51788vtd.EZpvd(str));
    }

    public final void copydefault(java.lang.String str, final java.lang.String str2) {
        AEQbTJ();
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(str);
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityExternalSyntheticLambda1), new View.OnClickListener() { // from class: o.vwP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51935vwR.OLrzqt(str2, viewOnClickListenerC54939xaY, this, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), new View.OnClickListener() { // from class: o.vwQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51935vwR.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(java.lang.String str, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, C51935vwR c51935vwR, android.view.View view) {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, C35334ntP.KWHzl(c51935vwR), BundleKt.bundleOf(C56390yDp.OLrzqt("url", str)), null, 4, null);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: renamed from: o.vwR$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C51935vwR OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51935vwR c51935vwR) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c51935vwR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            xOU xouWlaJM;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (C56071xvr.gEmmrt.ejfBZ()) {
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                    java.lang.String strOLrzqt = (interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) ? null : xouWlaJM.OLrzqt();
                    if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "grid")) {
                        ((InterfaceC49505upn) C43248rlh.KWHzl.AEQbTJ(InterfaceC49505upn.class)).OLrzqt(C35334ntP.KWHzl(this.OLrzqt), 1);
                        return;
                    } else if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "spot_dca")) {
                        ((InterfaceC49505upn) C43248rlh.KWHzl.AEQbTJ(InterfaceC49505upn.class)).OLrzqt(C35334ntP.KWHzl(this.OLrzqt), 2);
                        return;
                    }
                }
                java.util.ArrayList<BotGuideData> arrayListAkhnZx = C51468vnb.AkhnZx();
                if (arrayListAkhnZx.isEmpty()) {
                    pUU.AEQbTJ("not match any bot guide !!!");
                } else {
                    BotGuideData botGuideData = (BotGuideData) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayListAkhnZx);
                    if (Intrinsics.EZpvd((java.lang.Object) botGuideData.getBotType(), (java.lang.Object) "arbitrage")) {
                        this.OLrzqt.copydefault(botGuideData.getGuideTitle(), botGuideData.getGuideLink().getLink());
                    } else {
                        wJM.StateListAnimator stateListAnimator = wJM.Companion;
                        android.content.Context context = this.OLrzqt.getContext();
                        Intrinsics.copydefault(context, "");
                        androidx.fragment.app.FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                        stateListAnimator.KWHzl(supportFragmentManager, arrayListAkhnZx);
                    }
                }
                this.OLrzqt.gEmmrt();
            }
        }
    }

    /* JADX INFO: renamed from: o.vwR$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C51935vwR KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C51935vwR c51935vwR) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c51935vwR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.copydefault;
                if (this.KWHzl.OLrzqt) {
                    appCompatTextView.setSelected(true);
                    C51353vlS c51353vlS = new C51353vlS();
                    c51353vlS.AEQbTJ(new TaskDescription(appCompatTextView));
                    C51788vtd c51788vtd = this.KWHzl.EZpvd;
                    C51788vtd c51788vtd2 = c51788vtd;
                    if (c51788vtd == null) {
                        Intrinsics.gEmmrt("");
                        c51788vtd2 = null;
                    }
                    c51353vlS.EZpvd(c51788vtd2.AEQbTJ(), this.KWHzl.new Dialog());
                    android.content.Context context = appCompatTextView.getContext();
                    Intrinsics.copydefault(context, "");
                    c51353vlS.show(((FragmentActivity) context).getSupportFragmentManager(), "BotSelectedFragment");
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.vwR$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C51935vwR KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C51935vwR c51935vwR) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c51935vwR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.content.Context context = this.KWHzl.getContext();
                Intrinsics.copydefault(context, "");
                ((AppCompatActivity) context).onBackPressed();
            }
        }
    }

    /* JADX INFO: renamed from: o.vwR$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C51935vwR KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C51935vwR c51935vwR) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c51935vwR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.AYXKKw();
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.upe.Application.provideMoreToolsBottomFragment$default(o.upe, java.lang.String, java.lang.String, int, java.lang.Object):o.wXX */
    /* JADX INFO: Access modifiers changed from: private */
    public final void AYXKKw() {
        wXX wxxProvideMoreToolsBottomFragment$default = InterfaceC49496upe.Application.provideMoreToolsBottomFragment$default(C53685wqE.copydefault.copydefault(), null, "botToolBar", 1, null);
        android.content.Context context = getContext();
        Intrinsics.copydefault(context, "");
        wxxProvideMoreToolsBottomFragment$default.show(((FragmentActivity) context).getSupportFragmentManager(), "MoreToolsBottomFragment");
    }

    public final void AEQbTJ() {
        xOU xouWlaJM;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (Intrinsics.EZpvd((java.lang.Object) ((interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) ? null : xouWlaJM.OLrzqt()), (java.lang.Object) "smart_iceberg")) {
            C32866mlf.onEvent$default("IcebergBotPlaceOrder_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vwW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51935vwR.copydefault((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, "academy", true);
        return Unit.INSTANCE;
    }

    public final void setSwitchBot(boolean z) {
        this.OLrzqt = z;
        android.graphics.drawable.Drawable drawableKWHzl = z ? C33070mpX.KWHzl(C48033uCm.ActionBar.AubY) : null;
        AbstractC50873vcP abstractC50873vcP = this.AEQbTJ;
        if (abstractC50873vcP == null) {
            Intrinsics.gEmmrt("");
            abstractC50873vcP = null;
        }
        abstractC50873vcP.OLrzqt.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawableKWHzl, (android.graphics.drawable.Drawable) null);
    }
}
