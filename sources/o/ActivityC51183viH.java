package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.SignalSortProfitData;
import com.okinc.tradingbot.impl.market_place.bot_copy.presenter.SignalBotCopyPresenter;
import com.okinc.tradingbot.impl.strategy.bean.SignalProfitCard;
import com.okinc.tradingbot.impl.strategy.dataMapper.SignalProfitRange;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.viH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class ActivityC51183viH extends AbstractActivityC48163uHh<uTQ, SignalBotCopyPresenter> {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.viQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC51183viH.copydefault();
        }
    });

    /* JADX INFO: renamed from: o.viH$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.fmB;
    }

    private final C43316rmw AEQbTJ() {
        return (C43316rmw) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw copydefault() {
        return new C43316rmw();
    }

    /* JADX INFO: renamed from: o.viH$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.viH.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull SignalProfitRange signalProfitRange) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(signalProfitRange, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC51183viH.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("signal_bot_id", str), C56390yDp.OLrzqt("signal_bot_duration", signalProfitRange)));
            context.startActivity(intent);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Presenter */
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
        SignalBotCopyPresenter signalBotCopyPresenter2 = (SignalBotCopyPresenter) gHZMYf();
        SignalProfitRange signalProfitRange = (SignalProfitRange) getIntent().getParcelableExtra("signal_bot_duration");
        if (signalProfitRange == null) {
            signalProfitRange = SignalProfitRange.DAY_30;
        }
        signalBotCopyPresenter2.EZpvd(signalProfitRange);
        OLrzqt();
        EZpvd();
        valueOf();
        ((SignalBotCopyPresenter) gHZMYf()).AuCTelauCTel();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt() {
        ((uTQ) sSMYrx()).AYXKKw.setLayoutManager(new LinearLayoutManager(C35334ntP.KWHzl(this)));
        ((uTQ) sSMYrx()).AYXKKw.setAdapter(AEQbTJ());
        AEQbTJ().register(C57637ymF.class, new C57634ymC(null, 1, null));
        AEQbTJ().register(SignalSortProfitData.class, new C51308vka());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd() {
        AppCompatImageView appCompatImageView = ((uTQ) sSMYrx()).copydefault;
        appCompatImageView.setOnClickListener(new StateListAnimator(appCompatImageView, 1000L, this));
        ((uTQ) sSMYrx()).gEmmrt.OLrzqt(new InterfaceC57903yrG() { // from class: o.viL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC51183viH.KWHzl(this.AEQbTJ, interfaceC57934yrl);
            }
        });
        ((uTQ) sSMYrx()).gEmmrt.KWHzl(new InterfaceC57900yrD() { // from class: o.viJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC51183viH.AEQbTJ(this.KWHzl, interfaceC57934yrl);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(ActivityC51183viH activityC51183viH, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        ((SignalBotCopyPresenter) activityC51183viH.gHZMYf()).zuBGHE();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(ActivityC51183viH activityC51183viH, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        ((SignalBotCopyPresenter) activityC51183viH.gHZMYf()).wlaJM();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void valueOf() {
        ((SignalBotCopyPresenter) gHZMYf()).AuCTel().observe(this, new ActionBar(new Function1() { // from class: o.viP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51183viH.OLrzqt(this.copydefault, (SignalProfitCard) obj);
            }
        }));
        ((SignalBotCopyPresenter) gHZMYf()).AYXKKw().AkhnZx().observe(this, new ActionBar(new Function1() { // from class: o.viO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51183viH.KWHzl(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        ((SignalBotCopyPresenter) gHZMYf()).AYXKKw().AhwBna().observe(this, new ActionBar(new Function1() { // from class: o.viN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC51183viH.AEQbTJ(this.OLrzqt, (java.lang.Exception) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ActivityC51183viH activityC51183viH, SignalProfitCard signalProfitCard) {
        Intrinsics.checkNotNullParameter(signalProfitCard, "");
        if (((SignalBotCopyPresenter) activityC51183viH.gHZMYf()).getNewProxyInstance()) {
            C57636ymE.refreshDataOrEmpty$default(activityC51183viH.AEQbTJ(), (android.content.Context) activityC51183viH, (java.util.List) signalProfitCard.EZpvd(), C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0.0f, 8, (java.lang.Object) null);
            rVN.reportFullyDrawn$default((android.app.Activity) activityC51183viH, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            C33064mpR.KWHzl(activityC51183viH.AEQbTJ(), signalProfitCard.EZpvd());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC51183viH activityC51183viH, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            activityC51183viH.showLoading();
        } else {
            activityC51183viH.dismissLoading();
            ((uTQ) activityC51183viH.sSMYrx()).gEmmrt.AEQbTJ();
            ((uTQ) activityC51183viH.sSMYrx()).gEmmrt.valueOf();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(final ActivityC51183viH activityC51183viH, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(activityC51183viH.AEQbTJ().getItemCount()), 0)) {
            java.lang.String tag = activityC51183viH.getTAG();
            java.lang.String message = exc.getMessage();
            pUU.copydefault(tag, "can't load more cause by " + (message != null ? message : ""));
        } else {
            Group group = ((uTQ) activityC51183viH.sSMYrx()).AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(8);
            android.widget.FrameLayout frameLayout = ((uTQ) activityC51183viH.sSMYrx()).KWHzl;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(0);
            android.widget.FrameLayout frameLayout2 = ((uTQ) activityC51183viH.sSMYrx()).KWHzl;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            java.lang.String message2 = exc.getMessage();
            C6980aZc.KWHzl(activityC51183viH, frameLayout2, "", message2 == null ? "" : message2, (16 & 8) != 0 ? null : C33070mpX.AYXKKw(C48033uCm.Fragment.OHqIaq), (16 & 16) != 0 ? C52761wXj.TaskDescription.getSerial : 0, (16 & 32) != 0 ? null : new Function0() { // from class: o.viM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC51183viH.OLrzqt(this.KWHzl);
                }
            });
            rVN.reportFullyDrawn$default((android.app.Activity) activityC51183viH, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ActivityC51183viH activityC51183viH) {
        Group group = ((uTQ) activityC51183viH.sSMYrx()).AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(0);
        android.widget.FrameLayout frameLayout = ((uTQ) activityC51183viH.sSMYrx()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
        ((SignalBotCopyPresenter) activityC51183viH.gHZMYf()).zuBGHE();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.viH$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ActivityC51183viH KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC51183viH activityC51183viH) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = activityC51183viH;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.finish();
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
