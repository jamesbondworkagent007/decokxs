package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.beloo.widget.chipslayoutmanager.SpacingItemDecoration;
import com.okinc.tradingbot.impl.market_place.bot_copy.presenter.SignalBotCopyPresenter;
import com.okinc.tradingbot.impl.strategy.bean.SignalTriggerCard;
import com.okinc.tradingbot.impl.strategy.bean.SignalTriggerData;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.viU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class ActivityC51196viU extends AbstractActivityC48163uHh<uTP, SignalBotCopyPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.viS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC51196viU.copydefault();
        }
    });

    /* JADX INFO: renamed from: o.viU$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.onComplete;
    }

    private final C43316rmw KWHzl() {
        return (C43316rmw) this.EZpvd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw copydefault() {
        return new C43316rmw();
    }

    /* JADX INFO: renamed from: o.viU$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.viU.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC51196viU.class);
            intent.putExtra("signal_bot_id", str);
            context.startActivity(intent);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        SignalBotCopyPresenter signalBotCopyPresenter = (SignalBotCopyPresenter) gHZMYf();
        java.lang.String stringExtra = getIntent().getStringExtra("signal_bot_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        signalBotCopyPresenter.EZpvd(stringExtra);
        AEQbTJ();
        EZpvd();
        AhwBna();
        ((SignalBotCopyPresenter) gHZMYf()).AxsJAY();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AEQbTJ() {
        ((uTP) sSMYrx()).OLrzqt.setLayoutManager(new LinearLayoutManager(this));
        ((uTP) sSMYrx()).OLrzqt.addItemDecoration(new SpacingItemDecoration(0, C55298xhM.dpInt$default(32, (android.content.Context) null, 1, (java.lang.Object) null)));
        ((uTP) sSMYrx()).OLrzqt.setAdapter(KWHzl());
        KWHzl().register(CommonEmptyData.class, new C50041uzt(null, 1, null));
        KWHzl().register(SignalTriggerData.class, new C51311vkd());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd() {
        AppCompatImageView appCompatImageView = ((uTP) sSMYrx()).copydefault;
        appCompatImageView.setOnClickListener(new TaskDescription(appCompatImageView, 1000L, this));
        ((uTP) sSMYrx()).AEQbTJ.OLrzqt(new InterfaceC57903yrG() { // from class: o.viY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC51196viU.OLrzqt(this.OLrzqt, interfaceC57934yrl);
            }
        });
        ((uTP) sSMYrx()).AEQbTJ.KWHzl(new InterfaceC57900yrD() { // from class: o.viZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC51196viU.copydefault(this.OLrzqt, interfaceC57934yrl);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(ActivityC51196viU activityC51196viU, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        ((SignalBotCopyPresenter) activityC51196viU.gHZMYf()).AwvSrB();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(ActivityC51196viU activityC51196viU, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        ((SignalBotCopyPresenter) activityC51196viU.gHZMYf()).zsXlph();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AhwBna() {
        ((SignalBotCopyPresenter) gHZMYf()).fJNWhG().observe(this, new Application(new Function1() { // from class: o.viR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51196viU.copydefault(this.KWHzl, (SignalTriggerCard) obj);
            }
        }));
        ((SignalBotCopyPresenter) gHZMYf()).uzCIH().AkhnZx().observe(this, new Application(new Function1() { // from class: o.viT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51196viU.EZpvd(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        ((SignalBotCopyPresenter) gHZMYf()).uzCIH().AhwBna().observe(this, new Application(new Function1() { // from class: o.viV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51196viU.EZpvd(this.OLrzqt, (java.lang.Exception) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(ActivityC51196viU activityC51196viU, SignalTriggerCard signalTriggerCard) {
        Intrinsics.checkNotNullParameter(signalTriggerCard, "");
        if (((SignalBotCopyPresenter) activityC51196viU.gHZMYf()).getNewProxyInstance()) {
            C49952uyJ.updateDataOrEmpty$default(activityC51196viU.KWHzl(), signalTriggerCard.copydefault(), C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0, null, null, false, 60, null);
            rVN.reportFullyDrawn$default((android.app.Activity) activityC51196viU, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            C33064mpR.KWHzl(activityC51196viU.KWHzl(), signalTriggerCard.copydefault());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(ActivityC51196viU activityC51196viU, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            activityC51196viU.showLoading();
        } else {
            activityC51196viU.dismissLoading();
            ((uTP) activityC51196viU.sSMYrx()).AEQbTJ.AEQbTJ();
            ((uTP) activityC51196viU.sSMYrx()).AEQbTJ.valueOf();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(final ActivityC51196viU activityC51196viU, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(activityC51196viU.KWHzl().getItemCount()), 0)) {
            java.lang.String tag = activityC51196viU.getTAG();
            java.lang.String message = exc.getMessage();
            pUU.copydefault(tag, "can't load more cause by " + (message != null ? message : ""));
        } else {
            Group group = ((uTP) activityC51196viU.sSMYrx()).EZpvd;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(8);
            C55173xeu c55173xeu = ((uTP) activityC51196viU.sSMYrx()).KWHzl;
            Intrinsics.copydefault(c55173xeu);
            c55173xeu.setVisibility(0);
            java.lang.String message2 = exc.getMessage();
            c55173xeu.setSubTitle((java.lang.CharSequence) (message2 != null ? message2 : ""));
            c55173xeu.setRetry(C33070mpX.AYXKKw(C48033uCm.Fragment.OHqIaq));
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.vja
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC51196viU.AEQbTJ(this.OLrzqt, view);
                }
            });
            rVN.reportFullyDrawn$default((android.app.Activity) activityC51196viU, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(ActivityC51196viU activityC51196viU, android.view.View view) {
        Group group = ((uTP) activityC51196viU.sSMYrx()).EZpvd;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(0);
        C55173xeu c55173xeu = ((uTP) activityC51196viU.sSMYrx()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(8);
        ((SignalBotCopyPresenter) activityC51196viU.gHZMYf()).AwvSrB();
    }

    /* JADX INFO: renamed from: o.viU$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC51196viU OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC51196viU activityC51196viU) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = activityC51196viU;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.finish();
            }
        }
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
