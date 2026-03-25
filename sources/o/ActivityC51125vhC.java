package o;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.rxutils.RxBus;
import com.okinc.tradingbot.impl.market_place.bot_copy.BotLeadSuccessActivity$onCreate$6$1;
import com.okinc.tradingbot.impl.market_place.bot_copy.presenter.BotLeadSuccessPresenter;
import com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC52272wFg;
import o.C48033uCm;
import o.C52761wXj;
import o.C53698wqR;
import o.vSR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vhC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC51125vhC extends AbstractActivityC51216vio<uYE, BotLeadSuccessPresenter> {
    public java.lang.String KWHzl = "";
    public java.lang.String OLrzqt = "";
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.vhC$Dialog */
    public static final /* synthetic */ class Dialog implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.fQQVvf;
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ BotLeadSuccessPresenter OLrzqt(ActivityC51125vhC activityC51125vhC) {
        return (BotLeadSuccessPresenter) activityC51125vhC.gHZMYf();
    }

    /* JADX INFO: renamed from: o.vhC$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vhC.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ void startActivity$default(TaskDescription taskDescription, android.content.Context context, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            taskDescription.EZpvd(context, str, str2);
        }

        public final void EZpvd(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC51125vhC.class);
            intent.putExtra("type", str);
            intent.putExtra("id", str2);
            C49950uyH.startTradeActivity$default(context, intent, null, 2, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v21, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v25, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v29, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v32, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v35, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v39, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC51216vio, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.KWHzl = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("type");
        this.OLrzqt = stringExtra2 != null ? stringExtra2 : "";
        ViewCompat.setOnApplyWindowInsetsListener(((uYE) sSMYrx()).getRoot(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.vhB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return ActivityC51125vhC.KWHzl(this.copydefault, view, windowInsetsCompat);
            }
        });
        wYC wycAEQbTJ = ((uYE) sSMYrx()).KWHzl.AEQbTJ(C52761wXj.TaskDescription.zEkrwr);
        if (wycAEQbTJ != null) {
            wycAEQbTJ.setOnClickListener(new ActionBar(wycAEQbTJ, 1000L, this));
        }
        ((uYE) sSMYrx()).KWHzl.EZpvd().setOnClickListener(new View.OnClickListener() { // from class: o.vhD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC51125vhC.copydefault(this.KWHzl, view);
            }
        });
        C52794wYp c52794wYpCopydefault = ((uYE) sSMYrx()).OLrzqt.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ = ((uYE) sSMYrx()).OLrzqt.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ2 = ((uYE) sSMYrx()).OLrzqt.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setContentDescription("viewDetailsButton");
            c52794wYpAEQbTJ2.setOnClickListener(new Application(c52794wYpAEQbTJ2, 1000L, this));
        }
        C55376xil c55376xil = ((uYE) sSMYrx()).EZpvd;
        c55376xil.setOnClickListener(new Activity(c55376xil, 1000L, this));
        ((BotLeadSuccessPresenter) gHZMYf()).copydefault().observe(this, new Dialog(new Function1() { // from class: o.vhI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51125vhC.KWHzl(this.EZpvd, (TacticsData) obj);
            }
        }));
        ((BotLeadSuccessPresenter) gHZMYf()).OLrzqt().AhwBna().observe(this, new Dialog(new Function1() { // from class: o.vhE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51125vhC.KWHzl(this.AEQbTJ, (java.lang.Exception) obj);
            }
        }));
        ((BotLeadSuccessPresenter) gHZMYf()).AEQbTJ(this.KWHzl, this.OLrzqt);
        KWHzl();
        OLrzqt();
        AhwBna();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final WindowInsetsCompat KWHzl(ActivityC51125vhC activityC51125vhC, android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.statusBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        android.view.View root = ((uYE) activityC51125vhC.sSMYrx()).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setPadding(root.getPaddingLeft(), insets.top, root.getPaddingRight(), root.getPaddingBottom());
        return windowInsetsCompat;
    }

    public static final void copydefault(ActivityC51125vhC activityC51125vhC, android.view.View view) {
        activityC51125vhC.AEQbTJ(EopTrackEvent.CLOSE);
        activityC51125vhC.finish();
    }

    public static final Unit KWHzl(ActivityC51125vhC activityC51125vhC, TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        C53698wqR.TaskDescription.share$default(C53698wqR.Companion, tacticsData, activityC51125vhC, true, null, false, null, 40, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC51125vhC activityC51125vhC, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        activityC51125vhC.dismissLoading();
        java.lang.String message = exc.getMessage();
        if (message == null) {
            message = C33070mpX.AYXKKw(C48033uCm.Fragment.QCjLjM);
        }
        C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        pUU.copydefault(activityC51125vhC.getTAG(), "Get pending order fail cause by: " + message);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Possible override for method o.xKr.KWHzl()Ljava/lang/Class; */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl() {
        C52794wYp c52794wYpAEQbTJ = ((uYE) sSMYrx()).OLrzqt.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) this.KWHzl) ? 0 : 8);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Possible override for method o.xKr.OLrzqt()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt() {
        ((uYE) sSMYrx()).AEQbTJ.playAnimation();
    }

    private final void AhwBna() {
        AbstractC58185ywX abstractC58185ywXAEQbTJ = RxBus.AEQbTJ(vSS.class, "");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this).KWHzl(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.vhz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51125vhC.OLrzqt(this.OLrzqt, (vSS) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.vhA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC51125vhC.OLrzqt(function1, obj);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(final ActivityC51125vhC activityC51125vhC, vSS vss) {
        ((uYE) activityC51125vhC.sSMYrx()).getRoot().postDelayed(new java.lang.Runnable() { // from class: o.vhG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC51125vhC.copydefault(this.KWHzl);
            }
        }, 200L);
        RxBus.AEQbTJ(vSS.class);
        return Unit.INSTANCE;
    }

    public static final void copydefault(ActivityC51125vhC activityC51125vhC) {
        vSR.StateListAnimator.newInstance$default(vSR.Companion, activityC51125vhC.KWHzl, false, false, 6, null).show(activityC51125vhC.getSupportFragmentManager(), "CopyTradingviewInfoDialog");
    }

    /* JADX INFO: renamed from: o.vhC$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ActivityC51125vhC OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC51125vhC activityC51125vhC) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = activityC51125vhC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                StrategyPendingListResp value = ActivityC51125vhC.OLrzqt(this.OLrzqt).EZpvd().getValue();
                if (value != null) {
                    ActivityC51125vhC.OLrzqt(this.OLrzqt).OLrzqt(value);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.vhC$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ActivityC51125vhC EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC51125vhC activityC51125vhC) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = activityC51125vhC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.EZpvd), null, null, new BotLeadSuccessActivity$onCreate$6$1(this.EZpvd, null), 3, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.vhC$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ActivityC51125vhC EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC51125vhC activityC51125vhC) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = activityC51125vhC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ("view_details");
                ActivityC52272wFg.Application application = ActivityC52272wFg.Companion;
                ActivityC51125vhC activityC51125vhC = this.EZpvd;
                application.KWHzl(activityC51125vhC, activityC51125vhC.KWHzl, this.EZpvd.OLrzqt, (984 & 8) != 0 ? null : null, (984 & 16) != 0 ? "" : null, (984 & 32) != 0 ? null : 67108864, (984 & 64) != 0 ? null : null, (984 & 128) != 0 ? null : null, (984 & 256) != 0 ? false : false, (984 & 512) != 0 ? false : false);
                this.EZpvd.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.vhC$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ ActivityC51125vhC copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC51125vhC activityC51125vhC) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = activityC51125vhC;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.AEQbTJ("share_lead_bot");
                StrategyPendingListResp value = ActivityC51125vhC.OLrzqt(this.copydefault).EZpvd().getValue();
                if (value != null) {
                    ActivityC51125vhC.OLrzqt(this.copydefault).OLrzqt(value);
                }
            }
        }
    }

    @Override // o.AbstractActivityC51216vio, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        RxBus.AEQbTJ(vSS.class);
    }

    public final void AEQbTJ(final java.lang.String str) {
        C32866mlf.onEvent$default("LeadBotPlaceOrder_CreateSuccess_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vhF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51125vhC.OLrzqt(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC51216vio, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC51216vio, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC51216vio, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC51216vio, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
