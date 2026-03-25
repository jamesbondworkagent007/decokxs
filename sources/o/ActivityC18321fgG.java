package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.wallet.icloud.MpcWalletBackupTipActivity$onCreate$2;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC18774foj;
import o.C13754dXa;
import o.Cfor;
import o.InterfaceC14334djW;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fgG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC18321fgG extends AbstractActivityC33013moT {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public AbstractC16342eiC KWHzl;
    public java.lang.String OLrzqt = "";
    public boolean EZpvd = true;

    /* JADX INFO: renamed from: o.fgG$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    public ActivityC18321fgG() {
        final Function0 function0 = null;
        this.AEQbTJ = new ViewModelLazy(C56524yIo.AEQbTJ(C18403fhj.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.icloud.MpcWalletBackupTipActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.icloud.MpcWalletBackupTipActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.icloud.MpcWalletBackupTipActivity$special$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    public final C18403fhj EZpvd() {
        return (C18403fhj) this.AEQbTJ.getValue();
    }

    /* JADX INFO: renamed from: o.fgG$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fgG.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ void startActivity$default(StateListAnimator stateListAnimator, android.content.Context context, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            stateListAnimator.KWHzl(context, str, z);
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC18321fgG.class);
            intent.putExtra("wallet_id", str);
            intent.putExtra("jump_home", z);
            context.startActivity(intent);
        }
    }

    private final void OLrzqt() {
        java.lang.String stringExtra = getIntent().getStringExtra("wallet_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.OLrzqt = stringExtra;
        this.EZpvd = getIntent().getBooleanExtra("jump_home", true);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        OLrzqt();
        AbstractC16342eiC abstractC16342eiC = (AbstractC16342eiC) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.AxsJAYsNCnLh);
        this.KWHzl = abstractC16342eiC;
        if (abstractC16342eiC == null) {
            Intrinsics.gEmmrt("");
            abstractC16342eiC = null;
        }
        abstractC16342eiC.EZpvd.setAnimation(C13754dXa.Fragment.AYXKKw);
        AbstractC16342eiC abstractC16342eiC2 = this.KWHzl;
        if (abstractC16342eiC2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16342eiC2 = null;
        }
        abstractC16342eiC2.EZpvd.playAnimation();
        C14392dkb c14392dkb = C14392dkb.AEQbTJ;
        java.lang.String strEZpvd = c14392dkb.EZpvd(this);
        java.lang.String strAEQbTJ = c14392dkb.AEQbTJ(this);
        AbstractC16342eiC abstractC16342eiC3 = this.KWHzl;
        if (abstractC16342eiC3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16342eiC3 = null;
        }
        abstractC16342eiC3.gEmmrt.setText(strEZpvd);
        AbstractC16342eiC abstractC16342eiC4 = this.KWHzl;
        if (abstractC16342eiC4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16342eiC4 = null;
        }
        abstractC16342eiC4.valueOf.setText(strAEQbTJ);
        AEQbTJ();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fgO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC18321fgG.EZpvd(this.copydefault);
            }
        });
        if (c14392dkb.OLrzqt()) {
            AbstractC16342eiC abstractC16342eiC5 = this.KWHzl;
            if (abstractC16342eiC5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16342eiC5 = null;
            }
            abstractC16342eiC5.copydefault.setVisibility(8);
        } else {
            AbstractC16342eiC abstractC16342eiC6 = this.KWHzl;
            if (abstractC16342eiC6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16342eiC6 = null;
            }
            abstractC16342eiC6.copydefault.setVisibility(0);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MpcWalletBackupTipActivity$onCreate$2(null), 3, null);
    }

    public static final void EZpvd(ActivityC18321fgG activityC18321fgG) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC18321fgG, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AEQbTJ() {
        AbstractC16342eiC abstractC16342eiC = this.KWHzl;
        AbstractC16342eiC abstractC16342eiC2 = null;
        if (abstractC16342eiC == null) {
            Intrinsics.gEmmrt("");
            abstractC16342eiC = null;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(abstractC16342eiC.AEQbTJ);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgCopydefault, "");
        AbstractC58247yxg abstractC58247yxgCopydefault2 = C58156yvv.copydefault(abstractC58247yxgCopydefault, this);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        abstractC58247yxgCopydefault2.throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.fgK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC18321fgG.AEQbTJ(this.EZpvd, obj);
            }
        });
        AbstractC16342eiC abstractC16342eiC3 = this.KWHzl;
        if (abstractC16342eiC3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16342eiC3 = null;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault3 = C8003auW.copydefault(abstractC16342eiC3.copydefault);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgCopydefault3, "");
        C58156yvv.copydefault(abstractC58247yxgCopydefault3, this).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.fgH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC18321fgG.copydefault(this.AEQbTJ, obj);
            }
        });
        AbstractC16342eiC abstractC16342eiC4 = this.KWHzl;
        if (abstractC16342eiC4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16342eiC2 = abstractC16342eiC4;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault4 = C8003auW.copydefault(abstractC16342eiC2.valueOf);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgCopydefault4, "");
        C58156yvv.copydefault(abstractC58247yxgCopydefault4, this).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.fgI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC18321fgG.valueOf(this.OLrzqt, obj);
            }
        });
        EZpvd().OLrzqt().observe(this, new TaskDescription(new Function1() { // from class: o.fgM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18321fgG.OLrzqt(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final void AEQbTJ(ActivityC18321fgG activityC18321fgG, java.lang.Object obj) {
        activityC18321fgG.OLrzqt(Web3SecurityTrackEvent.VALUE_CONFIRM);
        if (C14392dkb.AEQbTJ.OLrzqt(activityC18321fgG) == 2) {
            activityC18321fgG.KWHzl();
            return;
        }
        if (dZP.OLrzqt.EZpvd().length() == 0) {
            InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
            if (interfaceC8104awT != null) {
                InterfaceC8104awT.StateListAnimator.routeLoginFromMpcWallet$default(interfaceC8104awT, activityC18321fgG, null, null, null, null, null, 48, null);
                return;
            }
            return;
        }
        activityC18321fgG.EZpvd().OLrzqt(activityC18321fgG.OLrzqt, 1, activityC18321fgG);
    }

    public static final void copydefault(ActivityC18321fgG activityC18321fgG, java.lang.Object obj) {
        activityC18321fgG.OLrzqt(Web3SecurityTrackEvent.VALUE_CONFIRM);
        C14392dkb c14392dkb = C14392dkb.AEQbTJ;
        if (!c14392dkb.djBIcL(activityC18321fgG)) {
            InterfaceC14334djW interfaceC14334djWOLrzqt = c14392dkb.OLrzqt(activityC18321fgG, 2);
            if (interfaceC14334djWOLrzqt != null) {
                interfaceC14334djWOLrzqt.copydefault(activityC18321fgG);
                return;
            }
            return;
        }
        if (dZP.OLrzqt.EZpvd().length() == 0) {
            InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
            if (interfaceC8104awT != null) {
                InterfaceC8104awT.StateListAnimator.routeLoginFromMpcWallet$default(interfaceC8104awT, activityC18321fgG, null, null, null, null, null, 48, null);
                return;
            }
            return;
        }
        activityC18321fgG.EZpvd().OLrzqt(activityC18321fgG.OLrzqt, 2, activityC18321fgG);
    }

    public static final void valueOf(ActivityC18321fgG activityC18321fgG, java.lang.Object obj) {
        activityC18321fgG.OLrzqt("why_backupicloud");
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, activityC18321fgG, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C13754dXa.FragmentManager.reportWhenComplete)), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
    }

    public static final Unit OLrzqt(final ActivityC18321fgG activityC18321fgG, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            InterfaceC14334djW interfaceC14334djWOLrzqt = C14392dkb.AEQbTJ.OLrzqt(activityC18321fgG, activityC18321fgG.EZpvd().AEQbTJ());
            if (interfaceC14334djWOLrzqt == null) {
                return Unit.INSTANCE;
            }
            InterfaceC14334djW.Application.judgeCloudServerStatus$default(interfaceC14334djWOLrzqt, activityC18321fgG, 0, new Function0() { // from class: o.fgP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC18321fgG.copydefault(this.OLrzqt);
                }
            }, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final ActivityC18321fgG activityC18321fgG) {
        activityC18321fgG.dismissLoading();
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC18321fgG.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        new C14461dlr(supportFragmentManager, "mpcCloudBackup-tipActivity", new Function1() { // from class: o.fgJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18321fgG.OLrzqt(this.copydefault, (java.lang.String) obj);
            }
        }, null, null, false, 56, null).EZpvd();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final ActivityC18321fgG activityC18321fgG, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC18321fgG.showLoadingAtOnceCannotCancel();
        InterfaceC14373dkI interfaceC14373dkIEZpvd = C14392dkb.AEQbTJ.EZpvd(activityC18321fgG, activityC18321fgG.EZpvd().AEQbTJ());
        if (interfaceC14373dkIEZpvd == null) {
            return Unit.INSTANCE;
        }
        interfaceC14373dkIEZpvd.copydefault(activityC18321fgG, new Function2() { // from class: o.fgL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC18321fgG.EZpvd(this.copydefault, str, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC18321fgG activityC18321fgG, java.lang.String str, boolean z, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (z) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
                Cfor.StateListAnimator stateListAnimator = Cfor.Companion;
                androidx.fragment.app.FragmentManager supportFragmentManager = activityC18321fgG.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                stateListAnimator.KWHzl(supportFragmentManager, activityC18321fgG.OLrzqt, str, str2, (80 & 16) != 0 ? 0 : 1, (80 & 32) != 0 ? 1 : activityC18321fgG.EZpvd().AEQbTJ(), (80 & 64) != 0 ? true : activityC18321fgG.EZpvd, (80 & 128) != 0 ? new Function0() { // from class: o.foB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return Cfor.StateListAnimator.OLrzqt();
                    }
                } : null);
            } else {
                ActivityC18774foj.StateListAnimator stateListAnimator2 = ActivityC18774foj.Companion;
                androidx.fragment.app.FragmentManager supportFragmentManager2 = activityC18321fgG.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                stateListAnimator2.KWHzl(supportFragmentManager2, activityC18321fgG.OLrzqt, str, (64 & 8) != 0 ? 0 : 1, (64 & 16) != 0 ? 1 : activityC18321fgG.EZpvd().AEQbTJ(), (64 & 32) != 0 ? false : false, (64 & 64) != 0 ? true : activityC18321fgG.EZpvd, (64 & 128) != 0 ? new Function0() { // from class: o.fos
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ActivityC18774foj.StateListAnimator.copydefault();
                    }
                } : null);
            }
            activityC18321fgG.finish();
        }
        activityC18321fgG.dismissLoading();
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final java.lang.String str) {
        C32866mlf.onEvent$default("Web3Onboarding_BackUpiCloud_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.fgQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18321fgG.copydefault(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str, true));
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.doTurnConnection));
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getSessionToken), (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.QgUVrU), new View.OnClickListener() { // from class: o.fgN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC18321fgG.OLrzqt(this.KWHzl, viewOnClickListenerC54939xaY, view);
            }
        });
        if (isFinishing()) {
            return;
        }
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ActivityC18321fgG activityC18321fgG, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        AbstractC16342eiC abstractC16342eiC = activityC18321fgG.KWHzl;
        if (abstractC16342eiC == null) {
            Intrinsics.gEmmrt("");
            abstractC16342eiC = null;
        }
        abstractC16342eiC.copydefault.performClick();
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
