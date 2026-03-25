package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.appsflyer.AppsFlyerProperties;
import com.bumptech.glide.Glide;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.core.util.SPUtils;
import com.okinc.tradingbot.impl.strategy.guide.BotGuideCardActivity$initBiz$1;
import com.okinc.tradingbot.impl.strategy.guide.BotGuideCardActivity$initTrade$1;
import com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideCardPresenter;
import com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC52394wJu;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC49496upe;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wJu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ActivityC52394wJu extends AbstractActivityC48163uHh<AbstractC48505uTx, BotGuideCardPresenter> {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wJD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC52394wJu.valueOf(this.EZpvd);
        }
    });
    public AbstractC52405wKe<? extends ViewDataBinding, ? extends AbsPresenter> EZpvd;

    /* JADX INFO: renamed from: o.wJu$ActionBar */
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
        return C48033uCm.Activity.profile;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0004: CHECK_CAST (com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideCardPresenter) (wrap:Presenter:0x0000: INVOKE (r0v0 o.wJu) VIRTUAL call: o.xKr.gHZMYf():com.okinc.unify_trade.refactor.presenter.AbsPresenter A[MD:():Presenter extends com.okinc.unify_trade.refactor.presenter.AbsPresenter (m), WRAPPED] (LINE:62)) */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ BotGuideCardPresenter copydefault(ActivityC52394wJu activityC52394wJu) {
        return (BotGuideCardPresenter) activityC52394wJu.gHZMYf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC48505uTx gEmmrt(ActivityC52394wJu activityC52394wJu) {
        return (AbstractC48505uTx) activityC52394wJu.sSMYrx();
    }

    public final boolean AEQbTJ() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || interfaceC54581xNrOLrzqt.sSMYrx()) ? false : true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Possible override for method o.xKr.OLrzqt()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OLrzqt() {
        AbstractC54531xLw abstractC54531xLwAEQbTJ = ((BotGuideCardPresenter) gHZMYf()).EZpvd().AEQbTJ();
        return (abstractC54531xLwAEQbTJ == null || abstractC54531xLwAEQbTJ.getFieldNames()) ? false : true;
    }

    private final java.lang.String EZpvd() {
        return (java.lang.String) this.AEQbTJ.getValue();
    }

    public static final java.lang.String valueOf(ActivityC52394wJu activityC52394wJu) {
        return activityC52394wJu.getIntent().getStringExtra(AppsFlyerProperties.CHANNEL);
    }

    /* JADX INFO: renamed from: o.wJu$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wJu.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC52394wJu.class);
            intent.putExtra("bot_ord_type", str);
            intent.putExtra("bot_inst_id", str2);
            intent.putExtra("bot_inst_type", str3);
            intent.putExtra("source", str4);
            intent.putExtra("investType", str5);
            intent.putExtra(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, str6);
            intent.putExtra("userRiskMode", str7);
            intent.putExtra("title", str8);
            intent.putExtra("algoIndexId", str9);
            intent.putExtra("batchNo", str10);
            intent.putExtra(AppsFlyerProperties.CHANNEL, str11);
            context.startActivity(intent);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        valueOf();
        gEmmrt();
        AhwBna();
        Group group = ((AbstractC48505uTx) sSMYrx()).OLrzqt;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(8);
        showLoading(200L);
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        copydefault();
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BotGuideCardActivity$initTrade$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void djBIcL() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BotGuideCardActivity$initBiz$1(this, null), 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [150=4] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void valueOf() {
        AbstractC52405wKe<? extends ViewDataBinding, ? extends AbsPresenter> abstractC52405wKeCopydefault;
        ((BotGuideCardPresenter) gHZMYf()).EZpvd(this, getIntent().getExtras());
        android.os.Bundle extras = getIntent().getExtras();
        AbstractC52405wKe<? extends ViewDataBinding, ? extends AbsPresenter> abstractC52405wKe = null;
        java.lang.String string = extras != null ? extras.getString("bot_ord_type") : null;
        if (string != null) {
            switch (string.hashCode()) {
                case -1402017003:
                    abstractC52405wKeCopydefault = !string.equals("contract_dca") ? C52435wLh.Companion.copydefault() : C52410wKj.Companion.KWHzl();
                    break;
                case -1216369070:
                    if (string.equals("smart_portfolio")) {
                        abstractC52405wKeCopydefault = wKY.Companion.KWHzl();
                        break;
                    }
                    break;
                case -512749997:
                    if (string.equals("contract_grid")) {
                        abstractC52405wKeCopydefault = wKF.Companion.EZpvd();
                        break;
                    }
                    break;
                case 3181382:
                    if (string.equals("grid")) {
                        abstractC52405wKeCopydefault = C52435wLh.Companion.copydefault();
                        break;
                    }
                    break;
            }
        }
        this.EZpvd = abstractC52405wKeCopydefault;
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i = C48033uCm.Application.gAnGwV;
        AbstractC52405wKe<? extends ViewDataBinding, ? extends AbsPresenter> abstractC52405wKe2 = this.EZpvd;
        if (abstractC52405wKe2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC52405wKe = abstractC52405wKe2;
        }
        fragmentTransactionBeginTransaction.replace(i, abstractC52405wKe).commitNowAllowingStateLoss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        ((AbstractC48505uTx) sSMYrx()).valueOf.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.wJy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
                ActivityC52394wJu.copydefault(this.AEQbTJ, view, i, i2, i3, i4);
            }
        });
        AppCompatImageView appCompatImageView = ((AbstractC48505uTx) sSMYrx()).AEQbTJ;
        appCompatImageView.setOnClickListener(new Activity(appCompatImageView, 1000L, this));
        C52794wYp c52794wYp = ((AbstractC48505uTx) sSMYrx()).KWHzl;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        getOnBackPressedDispatcher().addCallback(this, new StateListAnimator());
        getSupportFragmentManager().setFragmentResultListener("key_switch_coin", this, new FragmentResultListener() { // from class: o.wJA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ActivityC52394wJu.AEQbTJ(this.EZpvd, str, bundle);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(ActivityC52394wJu activityC52394wJu, android.view.View view, int i, int i2, int i3, int i4) {
        int height = ((AbstractC48505uTx) activityC52394wJu.sSMYrx()).gEmmrt.getHeight() / 4;
        ((AbstractC48505uTx) activityC52394wJu.sSMYrx()).gEmmrt.setAlpha(i2 == 0 ? 0.0f : (i2 < 0 || i2 > height) ? 1.0f : i2 / height);
    }

    /* JADX INFO: renamed from: o.wJu$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC52394wJu copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC52394wJu activityC52394wJu) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = activityC52394wJu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.wJu$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ ActivityC52394wJu EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, ActivityC52394wJu activityC52394wJu) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = activityC52394wJu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (ActivityC52394wJu.gEmmrt(this.EZpvd).gEmmrt.getAlpha() > 0.3f) {
                    this.EZpvd.EZpvd(true);
                    this.EZpvd.KWHzl();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wJu$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC52394wJu KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC52394wJu activityC52394wJu) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = activityC52394wJu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C52794wYp c52794wYp = (C52794wYp) this.AEQbTJ;
                pUU.EZpvd(this.KWHzl.getTAG(), "create button click, needLogin=" + this.KWHzl.AEQbTJ() + ", needUpgrade=" + this.KWHzl.OLrzqt());
                AbstractC52405wKe abstractC52405wKe = null;
                if (!this.KWHzl.AEQbTJ()) {
                    if (!this.KWHzl.OLrzqt()) {
                        AbstractC52405wKe abstractC52405wKe2 = this.KWHzl.EZpvd;
                        if (abstractC52405wKe2 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            abstractC52405wKe = abstractC52405wKe2;
                        }
                        abstractC52405wKe.AEQbTJ();
                        return;
                    }
                    InterfaceC49496upe interfaceC49496upeCopydefault = C53685wqE.copydefault.copydefault();
                    android.content.Context context = c52794wYp.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    InterfaceC49496upe.Application.startAccountModeActivity$default(interfaceC49496upeCopydefault, context, "2", null, 4, null);
                    return;
                }
                InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
                if (interfaceC8104awT != null) {
                    InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, this.KWHzl, null, 2, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wJu$StateListAnimator */
    public static final class StateListAnimator extends OnBackPressedCallback {
        public StateListAnimator() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (Intrinsics.EZpvd((java.lang.Object) ActivityC52394wJu.this.getIntent().getStringExtra("investType"), (java.lang.Object) "4") && SPUtils.getBoolean("key_voucher_dialog_show_once", true)) {
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(ActivityC52394wJu.this);
                final ActivityC52394wJu activityC52394wJu = ActivityC52394wJu.this;
                viewOnClickListenerC54939xaY.setCancelable(true);
                viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.dHAKvv);
                viewOnClickListenerC54939xaY.copydefault(C55688xof.Application.Dfv);
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.trackPipAnimationHintViewpositionInWindow), new View.OnClickListener() { // from class: o.wJI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        ActivityC52394wJu.StateListAnimator.EZpvd(viewOnClickListenerC54939xaY, activityC52394wJu, view);
                    }
                });
                viewOnClickListenerC54939xaY.show();
                return;
            }
            ActivityC52394wJu.this.finish();
        }

        public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, ActivityC52394wJu activityC52394wJu, android.view.View view) {
            SPUtils.put("key_voucher_dialog_show_once", java.lang.Boolean.FALSE);
            viewOnClickListenerC54939xaY.dismiss();
            activityC52394wJu.finish();
        }
    }

    public static final void AEQbTJ(ActivityC52394wJu activityC52394wJu, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        activityC52394wJu.KWHzl();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AhwBna() {
        ((BotGuideCardPresenter) gHZMYf()).KWHzl().fARcdN().observe(this, new ActionBar(new Function1() { // from class: o.wJz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52394wJu.OLrzqt(this.copydefault, (IBotGuidePresenter.ButtonState) obj);
            }
        }));
        ((BotGuideCardPresenter) gHZMYf()).KWHzl().iwGUEr().observe(this, new ActionBar(new Function1() { // from class: o.wJB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52394wJu.OLrzqt(this.OLrzqt, (kotlin.Pair) obj);
            }
        }));
        ((BotGuideCardPresenter) gHZMYf()).KWHzl().ejfBZ().observe(this, new ActionBar(new Function1() { // from class: o.wJC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52394wJu.OLrzqt(this.AEQbTJ, (java.util.List) obj);
            }
        }));
    }

    public static final Unit OLrzqt(ActivityC52394wJu activityC52394wJu, IBotGuidePresenter.ButtonState buttonState) {
        Intrinsics.checkNotNullParameter(buttonState, "");
        activityC52394wJu.copydefault(buttonState);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ActivityC52394wJu activityC52394wJu, kotlin.Pair pair) {
        java.lang.String message;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(pair, "");
        boolean zBooleanValue = ((java.lang.Boolean) pair.getFirst()).booleanValue();
        if (zBooleanValue) {
            C55173xeu c55173xeu = ((AbstractC48505uTx) activityC52394wJu.sSMYrx()).EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(8);
            Group group = ((AbstractC48505uTx) activityC52394wJu.sSMYrx()).OLrzqt;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(0);
        } else {
            java.lang.Exception exc = (java.lang.Exception) pair.getSecond();
            if (exc != null && (message = exc.getMessage()) != null) {
                str = message;
            }
            activityC52394wJu.AEQbTJ(str);
        }
        rVN.reportFullyDrawn$default(activityC52394wJu, zBooleanValue, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ActivityC52394wJu activityC52394wJu, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (C33129mqd.KWHzl((java.util.Collection) list) && list.size() > 1) {
            AppCompatTextView appCompatTextView = ((AbstractC48505uTx) activityC52394wJu.sSMYrx()).AYXKKw;
            activityC52394wJu.EZpvd(false);
            appCompatTextView.setOnClickListener(new Dialog(appCompatTextView, 1000L, activityC52394wJu));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AkhnZx() {
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = ((BotGuideCardPresenter) gHZMYf()).OLrzqt();
        java.lang.String strComponent1 = pairOLrzqt.component1();
        java.lang.String strComponent2 = pairOLrzqt.component2();
        ((AbstractC48505uTx) sSMYrx()).AYXKKw.setText(strComponent1);
        android.widget.ImageView imageView = ((AbstractC48505uTx) sSMYrx()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) strComponent2) ? 0 : 8);
        Glide.copydefault((FragmentActivity) this).EZpvd(strComponent2).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(this)).djBIcL().KWHzl(C52761wXj.TaskDescription.aHXSQp).EZpvd(((AbstractC48505uTx) sSMYrx()).djBIcL);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(IBotGuidePresenter.ButtonState buttonState) {
        if (AEQbTJ()) {
            buttonState = IBotGuidePresenter.ButtonState.Generic.NeedLogin;
        } else if (OLrzqt()) {
            buttonState = IBotGuidePresenter.ButtonState.Generic.NeedUpgrade;
        }
        C52794wYp c52794wYp = ((AbstractC48505uTx) sSMYrx()).KWHzl;
        c52794wYp.setOKDSType(buttonState.getButtonType());
        c52794wYp.setEnabled(buttonState.getEnabled());
        c52794wYp.setText(buttonState.getText());
        java.lang.Integer textColor = buttonState.getTextColor();
        if (textColor != null) {
            c52794wYp.setTextColor(textColor.intValue());
        }
        java.lang.Integer bgColor = buttonState.getBgColor();
        if (bgColor != null) {
            c52794wYp.setBackgroundTintList(android.content.res.ColorStateList.valueOf(bgColor.intValue()));
        } else {
            c52794wYp.setBackgroundTintList(null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(java.lang.String str) {
        dismissLoading();
        C55173xeu c55173xeu = ((AbstractC48505uTx) sSMYrx()).EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(0);
        Group group = ((AbstractC48505uTx) sSMYrx()).OLrzqt;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(8);
        C55173xeu c55173xeu2 = ((AbstractC48505uTx) sSMYrx()).EZpvd;
        c55173xeu2.setSubTitle((java.lang.CharSequence) str);
        c55173xeu2.setRetryClickListener(new View.OnClickListener() { // from class: o.wJG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC52394wJu.KWHzl(this.KWHzl, view);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(ActivityC52394wJu activityC52394wJu, android.view.View view) {
        C55173xeu c55173xeu = ((AbstractC48505uTx) activityC52394wJu.sSMYrx()).EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(8);
        Group group = ((AbstractC48505uTx) activityC52394wJu.sSMYrx()).OLrzqt;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(8);
        activityC52394wJu.showLoading(200L);
        activityC52394wJu.copydefault();
    }

    /* JADX DEBUG: Possible override for method o.xKr.KWHzl()Ljava/lang/Class; */
    public final void KWHzl() {
        final wJH wjh = new wJH();
        wjh.copydefault(new yHO() { // from class: o.wJv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return ActivityC52394wJu.KWHzl(this.copydefault, wjh, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
        wjh.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.wJx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                ActivityC52394wJu.EZpvd(this.OLrzqt, dialogInterface);
            }
        });
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        wjh.show(supportFragmentManager);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC52394wJu activityC52394wJu, wJH wjh, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        android.content.Intent intent = activityC52394wJu.getIntent();
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        intent.putExtra("bot_inst_id", objOLrzqt instanceof java.lang.String ? (java.lang.String) objOLrzqt : null);
        ((BotGuideCardPresenter) activityC52394wJu.gHZMYf()).EZpvd(wjh, activityC52394wJu.getIntent().getExtras());
        activityC52394wJu.djBIcL();
        wjh.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(ActivityC52394wJu activityC52394wJu, android.content.DialogInterface dialogInterface) {
        activityC52394wJu.EZpvd(false);
        ((BotGuideCardPresenter) activityC52394wJu.gHZMYf()).KWHzl().fJNWhG().setValue(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(boolean z) {
        ((AbstractC48505uTx) sSMYrx()).AYXKKw.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, z ? C52761wXj.TaskDescription.OxVOHk : C52761wXj.TaskDescription.OJuSTm, 0);
    }

    @Override // o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        java.lang.String strEZpvd = EZpvd();
        if (strEZpvd != null) {
            C56058xve.Companion.copydefault().AEQbTJ(strEZpvd);
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
    public void onStart() {
        super.onStart();
    }
}
