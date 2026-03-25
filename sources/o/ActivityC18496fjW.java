package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.autofill.HintConstants;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.huawei.hms.framework.common.ExceptionCode;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.wallet.mine.DefiWalletBatchCreateAccountAnimationActivity$initListener$1;
import com.okinc.business.defi.wallet.mine.DefiWalletBatchCreateAccountAnimationActivity$initListener$2;
import com.okinc.business.defi.wallet.mine.viewmodel.DefiWalletBatchCreateAccountAnimationModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fjW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC18496fjW extends AbstractActivityC33013moT {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public AbstractC16331ehs EZpvd;
    public final InterfaceC56387yDm copydefault;

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    public ActivityC18496fjW() {
        final Function0 function0 = null;
        this.copydefault = new ViewModelLazy(C56524yIo.AEQbTJ(DefiWalletBatchCreateAccountAnimationModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mine.DefiWalletBatchCreateAccountAnimationActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mine.DefiWalletBatchCreateAccountAnimationActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mine.DefiWalletBatchCreateAccountAnimationActivity$special$$inlined$viewModels$default$3
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

    public final DefiWalletBatchCreateAccountAnimationModel copydefault() {
        return (DefiWalletBatchCreateAccountAnimationModel) this.copydefault.getValue();
    }

    /* JADX INFO: renamed from: o.fjW$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fjW.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void AEQbTJ(@NotNull android.app.Activity activity, @NotNull java.lang.String str, int i, int i2, int i3, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ActivityC18496fjW.class);
            intent.putExtra("root_wallet_id", str);
            intent.putExtra("walletCount", i);
            intent.putExtra("createType", i2);
            intent.putExtra(HintConstants.AUTOFILL_HINT_PASSWORD, str2);
            intent.putExtra("walletType", i3);
            activity.startActivityForResult(intent, ExceptionCode.CRASH_EXCEPTION);
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.EZpvd = (AbstractC16331ehs) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.zuBGHE);
        gEmmrt();
        AhwBna();
        AEQbTJ();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fjZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC18496fjW.AhwBna(this.EZpvd);
            }
        });
    }

    public static final void AhwBna(ActivityC18496fjW activityC18496fjW) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC18496fjW, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void gEmmrt() {
        java.lang.String stringExtra = getIntent().getStringExtra("root_wallet_id");
        java.lang.String str = stringExtra == null ? "" : stringExtra;
        int intExtra = getIntent().getIntExtra("walletCount", 1);
        int intExtra2 = getIntent().getIntExtra("createType", 1);
        java.lang.String stringExtra2 = getIntent().getStringExtra(HintConstants.AUTOFILL_HINT_PASSWORD);
        copydefault().copydefault(str, intExtra, intExtra2, getIntent().getIntExtra("walletType", WalletType.HDWallet.ordinal()), stringExtra2 == null ? "" : stringExtra2);
    }

    private final void AhwBna() {
        C52794wYp c52794wYp;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletBatchCreateAccountAnimationActivity$initListener$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletBatchCreateAccountAnimationActivity$initListener$2(this, null), 3, null);
        AbstractC16331ehs abstractC16331ehs = this.EZpvd;
        if (abstractC16331ehs == null || (c52794wYp = abstractC16331ehs.KWHzl) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    /* JADX INFO: renamed from: o.fjW$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ActivityC18496fjW AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC18496fjW activityC18496fjW) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = activityC18496fjW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (this.AEQbTJ.copydefault().gEmmrt() == this.AEQbTJ.copydefault().AkhnZx()) {
                    this.AEQbTJ.OLrzqt();
                } else {
                    this.AEQbTJ.copydefault().isConnected();
                }
                this.AEQbTJ.AEQbTJ("adding_accounts_cancel");
            }
        }
    }

    public final void OLrzqt() {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onResult));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onConnectionSuspended));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.setInternalConnectionCallback), new View.OnClickListener() { // from class: o.fjX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC18496fjW.AEQbTJ(this.OLrzqt, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatCustomActionCallback), new View.OnClickListener() { // from class: o.fke
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC18496fjW.OLrzqt(viewOnClickListenerC54939xaY, this, view);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        copydefault().EZpvd(true);
        if (isFinishing() || isDestroyed()) {
            return;
        }
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(ActivityC18496fjW activityC18496fjW, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        activityC18496fjW.copydefault().EZpvd(false);
        activityC18496fjW.copydefault().fIwbmz();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, ActivityC18496fjW activityC18496fjW, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        activityC18496fjW.setResult(-1);
        activityC18496fjW.finish();
    }

    public final java.lang.String EZpvd() {
        return C33069mpW.copydefault(C13754dXa.FragmentManager.MediaBrowserCompatConnectionCallbackConnectionCallbackApi21, C56424yEw.gEmmrt(C56390yDp.OLrzqt("successnum", java.lang.String.valueOf(copydefault().gEmmrt())), C56390yDp.OLrzqt("failednum", java.lang.String.valueOf(copydefault().AkhnZx() - copydefault().gEmmrt()))));
    }

    public final void AEQbTJ() {
        AppCompatTextView appCompatTextView;
        EZpvd(copydefault().gEmmrt());
        AbstractC16331ehs abstractC16331ehs = this.EZpvd;
        if (abstractC16331ehs != null && (appCompatTextView = abstractC16331ehs.AEQbTJ) != null) {
            appCompatTextView.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatItemReceiver));
        }
        AYXKKw();
        copydefault().AEQbTJ();
    }

    public final void EZpvd(int i) {
        AppCompatTextView appCompatTextView;
        AbstractC16331ehs abstractC16331ehs = this.EZpvd;
        if (abstractC16331ehs == null || (appCompatTextView = abstractC16331ehs.AYXKKw) == null) {
            return;
        }
        appCompatTextView.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.onReceiveResult, C56424yEw.gEmmrt(C56390yDp.OLrzqt("successnum", java.lang.String.valueOf(i)), C56390yDp.OLrzqt("totalnum", java.lang.String.valueOf(copydefault().AkhnZx())))));
    }

    private final void AYXKKw() {
        C55113xdn c55113xdn;
        C55113xdn c55113xdn2;
        C55113xdn c55113xdn3;
        C55113xdn c55113xdn4;
        C55113xdn c55113xdn5;
        C55113xdn c55113xdn6;
        AbstractC16331ehs abstractC16331ehs = this.EZpvd;
        if (abstractC16331ehs != null && (c55113xdn6 = abstractC16331ehs.copydefault) != null) {
            c55113xdn6.removeAllAnimatorListeners();
        }
        AbstractC16331ehs abstractC16331ehs2 = this.EZpvd;
        if (abstractC16331ehs2 != null && (c55113xdn5 = abstractC16331ehs2.copydefault) != null) {
            c55113xdn5.cancelAnimation();
        }
        AbstractC16331ehs abstractC16331ehs3 = this.EZpvd;
        if (abstractC16331ehs3 != null && (c55113xdn4 = abstractC16331ehs3.copydefault) != null) {
            c55113xdn4.setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
        }
        AbstractC16331ehs abstractC16331ehs4 = this.EZpvd;
        if (abstractC16331ehs4 != null && (c55113xdn3 = abstractC16331ehs4.copydefault) != null) {
            c55113xdn3.setRepeatMode(1);
        }
        AbstractC16331ehs abstractC16331ehs5 = this.EZpvd;
        if (abstractC16331ehs5 != null && (c55113xdn2 = abstractC16331ehs5.copydefault) != null) {
            c55113xdn2.setRepeatCount(Integer.MAX_VALUE);
        }
        AbstractC16331ehs abstractC16331ehs6 = this.EZpvd;
        if (abstractC16331ehs6 == null || (c55113xdn = abstractC16331ehs6.copydefault) == null) {
            return;
        }
        c55113xdn.playAnimation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void djBIcL() {
        C55113xdn c55113xdn;
        C55113xdn c55113xdn2;
        AbstractC16331ehs abstractC16331ehs = this.EZpvd;
        if (abstractC16331ehs != null && (c55113xdn2 = abstractC16331ehs.copydefault) != null) {
            c55113xdn2.removeAllAnimatorListeners();
        }
        AbstractC16331ehs abstractC16331ehs2 = this.EZpvd;
        if (abstractC16331ehs2 == null || (c55113xdn = abstractC16331ehs2.copydefault) == null) {
            return;
        }
        c55113xdn.pauseAnimation();
    }

    private final void valueOf() {
        C55113xdn c55113xdn;
        C55113xdn c55113xdn2;
        AbstractC16331ehs abstractC16331ehs = this.EZpvd;
        if (abstractC16331ehs != null && (c55113xdn2 = abstractC16331ehs.copydefault) != null) {
            c55113xdn2.removeAllAnimatorListeners();
        }
        AbstractC16331ehs abstractC16331ehs2 = this.EZpvd;
        if (abstractC16331ehs2 == null || (c55113xdn = abstractC16331ehs2.copydefault) == null) {
            return;
        }
        c55113xdn.cancelAnimation();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        valueOf();
        KWHzl();
    }

    public final void KWHzl() {
        C32866mlf.onEvent$default("Web3WalletAddAccountsInBulk_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.fkb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18496fjW.AEQbTJ(this.copydefault, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(ActivityC18496fjW activityC18496fjW, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("page_number_added", java.lang.String.valueOf(activityC18496fjW.copydefault().valueOf()), false));
        eventParamsList.add(new EventParam("page_number_failed", java.lang.String.valueOf(activityC18496fjW.copydefault().DbNXlk() - activityC18496fjW.copydefault().valueOf()), false));
        eventParamsList.add(new EventParam("page_number_added_sync", java.lang.String.valueOf(activityC18496fjW.copydefault().values()), false));
        eventParamsList.add(new EventParam("page_number_failed_sync", java.lang.String.valueOf(activityC18496fjW.copydefault().AYXKKw()), false));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(final java.lang.String str) {
        C32866mlf.onEvent$default("Web3WalletAddAccountsInBulk_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.fkd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18496fjW.EZpvd(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, str, true));
        return Unit.INSTANCE;
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
