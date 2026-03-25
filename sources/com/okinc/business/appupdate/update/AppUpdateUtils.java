package com.okinc.business.appupdate.update;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.appupdate.R;
import com.okinc.business.appupdate.api.IUpdate;
import com.okinc.business.appupdate.debug.UpgradeDBoxExtension;
import com.okinc.business.appupdate.update.IUpdate2;
import com.okinc.business.appupdate.utils.UtilsExtKt;
import com.okinc.pop.manager.ManageableDialogFragmentContainer;
import com.okinc.pop.manager.ResumeCheckType;
import com.okinc.rxutils.RxBus;
import io.reactivex.BackpressureStrategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC33041mov;
import o.AbstractC32955mnO;
import o.AbstractC43238rlX;
import o.AbstractC58185ywX;
import o.C32113mPz;
import o.C32942mnB;
import o.C32979mnm;
import o.C33538myO;
import o.C33539myP;
import o.C34703nhO;
import o.C43246rlf;
import o.C43251rlk;
import o.C46521tXk;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC43294rma;
import o.InterfaceC46518tXh;
import o.InterfaceC56387yDm;
import o.InterfaceC58184ywW;
import o.InterfaceC58187ywZ;
import o.InterfaceC58227yxM;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AppUpdateUtils implements IUpdate2 {
    private AppUpdateConfigResp appUpdateResp;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final InterfaceC56387yDm updateListeners$delegate = C56392yDr.copydefault(new Function0() { // from class: com.okinc.business.appupdate.update.AppUpdateUtils$$ExternalSyntheticLambda10
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppUpdateUtils.updateListeners_delegate$lambda$0();
        }
    });
    private AbstractC32955mnO<Unit> apiResponseStatus = new AbstractC32955mnO.TaskDescription();
    private final List<Function1<String, Unit>> updateResultListeners = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final DialogFragment getUpdateManageableContainer$lambda$11(FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean isSupportUpgradeUseCore() {
        return Companion.isSupportUpgradeUseCore();
    }

    public final void cancelDownLoad() {
    }

    @Override // com.okinc.business.appupdate.api.IUpdate
    public Integer getUpdateProgress() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void manageableCheck$OKUpgrade_ok_upgrade(boolean z, @NotNull Function2<? super Boolean, ? super AppUpdateInfo, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void showCustomUpdateDialog(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, AppUpdateInfo appUpdateInfo, IUpdate.DialogInfo dialogInfo, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void showSelfUpgradeDialog(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, boolean z, AppUpdateInfo appUpdateInfo, IUpdate.DialogInfo dialogInfo, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
    }

    public AppUpdateUtils() {
        unregisterWhenActivityDestroy();
        observeUpdateStateChange();
    }

    @Override // com.okinc.business.appupdate.update.IUpdate2, com.okinc.business.appupdate.api.IUpdate
    public void startReview(@NotNull Activity activity) {
        IUpdate2.DefaultImpls.startReview(this, activity);
    }

    @Override // com.okinc.business.appupdate.update.IUpdate2, com.okinc.business.appupdate.api.IUpdate
    public void startReviewFlow(@NotNull Activity activity, @NotNull Function0<Unit> function0) {
        IUpdate2.DefaultImpls.startReviewFlow(this, activity, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList<com.okinc.business.appupdate.api.IUpdateStateChange> getUpdateListeners() {
        return (ArrayList) this.updateListeners$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList updateListeners_delegate$lambda$0() {
        return new ArrayList();
    }

    @Override // com.okinc.business.appupdate.api.IUpdate
    public boolean hasNewVersion() {
        AppUpdateConfigResp appUpdateConfigResp = this.appUpdateResp;
        return appUpdateConfigResp != null && appUpdateConfigResp.needUpdate$OKUpgrade_ok_upgrade(false);
    }

    @Override // com.okinc.business.appupdate.api.IUpdate
    public void checkUpdate(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, boolean z) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        checkUpdate$OKUpgrade_ok_upgrade(abstractActivityC33041mov, z, null, new Function0() { // from class: com.okinc.business.appupdate.update.AppUpdateUtils$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppUpdateUtils.checkUpdate$lambda$1(abstractActivityC33041mov);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkUpdate$lambda$1(AbstractActivityC33041mov abstractActivityC33041mov) {
        AppUpToDateFragment appUpToDateFragmentNewInstance = AppUpToDateFragment.Companion.newInstance();
        FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        appUpToDateFragmentNewInstance.show(supportFragmentManager, "javaClass");
        return Unit.INSTANCE;
    }

    public final void checkUpdate$OKUpgrade_ok_upgrade(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, final boolean z, IUpdate.DialogInfo dialogInfo, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        pUU.KWHzl("AppUpdateUtils", "checkUpdate, triggerInBackground: " + z);
        AbstractC58185ywX<AppUpdateConfigResp> abstractC58185ywXRequestAppUpdateInfo = ModelKt.requestAppUpdateInfo(z ^ true);
        final Function1 function1 = new Function1() { // from class: com.okinc.business.appupdate.update.AppUpdateUtils$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppUpdateUtils.checkUpdate$lambda$2(this.f$0, z, abstractActivityC33041mov, function0, (AppUpdateConfigResp) obj);
            }
        };
        InterfaceC58227yxM<? super AppUpdateConfigResp> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: com.okinc.business.appupdate.update.AppUpdateUtils$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.okinc.business.appupdate.update.AppUpdateUtils$$ExternalSyntheticLambda4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppUpdateUtils.checkUpdate$lambda$4(this.f$0, (Throwable) obj);
            }
        };
        abstractC58185ywXRequestAppUpdateInfo.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: com.okinc.business.appupdate.update.AppUpdateUtils$$ExternalSyntheticLambda5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(Object obj) {
                function12.invoke(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkUpdate$lambda$2(AppUpdateUtils appUpdateUtils, boolean z, AbstractActivityC33041mov abstractActivityC33041mov, Function0 function0, AppUpdateConfigResp appUpdateConfigResp) {
        Integer mode;
        UpgradeDBoxExtension.Companion companion = UpgradeDBoxExtension.Companion;
        UpgradeDBoxExtension.DebugInterceptor responseInterceptor = companion.getResponseInterceptor();
        if (responseInterceptor != null) {
            Intrinsics.copydefault(appUpdateConfigResp);
            AppUpdateConfigResp appUpdateConfigRespIntercept = responseInterceptor.intercept(appUpdateConfigResp);
            if (appUpdateConfigRespIntercept != null) {
                appUpdateConfigResp = appUpdateConfigRespIntercept;
            }
        }
        companion.setResponseInterceptor(null);
        Unit unit = Unit.INSTANCE;
        appUpdateUtils.apiResponseStatus = new AbstractC32955mnO.ActionBar(unit);
        appUpdateUtils.appUpdateResp = appUpdateConfigResp;
        appUpdateUtils.notifyUpdateResultListeners(appUpdateUtils.getLatestVersionName());
        boolean zNeedUpdate$OKUpgrade_ok_upgrade = appUpdateConfigResp.needUpdate$OKUpgrade_ok_upgrade(z);
        pUU.KWHzl("AppUpdateUtils", "needUpdate: " + zNeedUpdate$OKUpgrade_ok_upgrade);
        if (zNeedUpdate$OKUpgrade_ok_upgrade) {
            AppUpdateInfo appUpdateInfo = appUpdateConfigResp.getAppUpdateInfo();
            if (!appUpdateInfo.isForcedUpdate() && ((mode = appUpdateInfo.getMode()) == null || mode.intValue() == 0)) {
                appUpdateUtils.checkUpdateFromGP(abstractActivityC33041mov, appUpdateInfo.isForcedUpdate(), true, z);
            } else {
                AppUpdateFragment appUpdateFragmentNewInstance = AppUpdateFragment.Companion.newInstance(appUpdateInfo, null);
                FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                appUpdateFragmentNewInstance.show(supportFragmentManager, "javaClass");
            }
        } else if (!z && function0 != null) {
            function0.invoke();
        }
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkUpdate$lambda$4(AppUpdateUtils appUpdateUtils, Throwable th) {
        appUpdateUtils.apiResponseStatus = new AbstractC32955mnO.Activity(null, 1, null);
        appUpdateUtils.notifyUpdateResultListeners("");
        UtilsExtKt.showEroTip(C32113mPz.LoaderManager.KWHzl);
        return Unit.INSTANCE;
    }

    private final void goToMiniapp(Context context, String str) {
        if (str != null) {
            InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.AEQbTJ(C56524yIo.AEQbTJ(InterfaceC43294rma.class)), context, str, null, new Function1() { // from class: com.okinc.business.appupdate.update.AppUpdateUtils$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AppUpdateUtils.goToMiniapp$lambda$7$lambda$6((AbstractC43238rlX) obj);
                }
            }, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goToMiniapp$lambda$7$lambda$6(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    private final void goToWeb(Context context, String str) {
        if (str != null) {
            ExternalBrowserOpener.INSTANCE.open(context, str, true);
        }
    }

    private final void goToDeeplink(Context context, String str) {
        if (str != null) {
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (Throwable th) {
                pUU.OLrzqt(IUpdate2Kt.TAG, "Unable to navigate to " + str, th);
            }
        }
    }

    private final void checkUpdateFromGP(final FragmentActivity fragmentActivity, boolean z, final boolean z2, final boolean z3) {
        Function1 function1 = new Function1() { // from class: com.okinc.business.appupdate.update.AppUpdateUtils$$ExternalSyntheticLambda6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppUpdateUtils.checkUpdateFromGP$lambda$10(fragmentActivity, z2, z3, (AbstractC32955mnO) obj);
            }
        };
        GPUpgradeManager gPUpgradeManager = GPUpgradeManager.INSTANCE;
        gPUpgradeManager.getECheckUpdateState().removeObservers(fragmentActivity);
        C32942mnB.EZpvd(gPUpgradeManager.getECheckUpdateState(), fragmentActivity, function1);
        gPUpgradeManager.init(fragmentActivity, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkUpdateFromGP$lambda$10(FragmentActivity fragmentActivity, boolean z, boolean z2, AbstractC32955mnO abstractC32955mnO) {
        Intrinsics.checkNotNullParameter(abstractC32955mnO, "");
        if (!(abstractC32955mnO instanceof AbstractC32955mnO.TaskDescription)) {
            if (abstractC32955mnO instanceof AbstractC32955mnO.ActionBar) {
                GPUpgradeManager.INSTANCE.getECheckUpdateState().removeObservers(fragmentActivity);
                if ((((AbstractC32955mnO.ActionBar) abstractC32955mnO).AEQbTJ() instanceof AppUpdateCheckResult.NoUpdate) && z && !z2) {
                    UtilsExtKt.showEroTip(R.string.pr_settings_general_toast_load_fail_try_vpn);
                }
            } else {
                if (!(abstractC32955mnO instanceof AbstractC32955mnO.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                GPUpgradeManager.INSTANCE.getECheckUpdateState().removeObservers(fragmentActivity);
                UtilsExtKt.showEroTip(R.string.pr_common_toast_network_error_retry);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.okinc.business.appupdate.update.IUpdate2
    public void addUpdateStateChangeListener(@NotNull IUpdateStateChange iUpdateStateChange) {
        Intrinsics.checkNotNullParameter(iUpdateStateChange, "");
        getUpdateListeners().add(iUpdateStateChange);
    }

    @Override // com.okinc.business.appupdate.api.IUpdate
    public void addUpdateStateChangeListener(@NotNull com.okinc.business.appupdate.api.IUpdateStateChange iUpdateStateChange) {
        Intrinsics.checkNotNullParameter(iUpdateStateChange, "");
        getUpdateListeners().add(iUpdateStateChange);
    }

    @Override // com.okinc.business.appupdate.update.IUpdate2
    public void removeUpdateStateChangeListener(@NotNull IUpdateStateChange iUpdateStateChange) {
        Intrinsics.checkNotNullParameter(iUpdateStateChange, "");
        getUpdateListeners().remove(iUpdateStateChange);
    }

    @Override // com.okinc.business.appupdate.api.IUpdate
    public void removeUpdateStateChangeListener(@NotNull com.okinc.business.appupdate.api.IUpdateStateChange iUpdateStateChange) {
        Intrinsics.checkNotNullParameter(iUpdateStateChange, "");
        getUpdateListeners().remove(iUpdateStateChange);
    }

    @Override // com.okinc.business.appupdate.api.IUpdate
    public void onActivityResult(int i, int i2, Intent intent) {
        GPUpgradeManager.INSTANCE.onActivityResult(i, i2, intent);
    }

    @Override // com.okinc.business.appupdate.api.IUpdate
    public InterfaceC46518tXh getUpdateManageableContainer(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull FragmentManager fragmentManager, final boolean z) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        return new ManageableDialogFragmentContainer(fragmentManager, new C46521tXk(1), false, false, new Function1() { // from class: com.okinc.business.appupdate.update.AppUpdateUtils$$ExternalSyntheticLambda8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppUpdateUtils.getUpdateManageableContainer$lambda$11((FragmentManager) obj);
            }
        }, new Function0() { // from class: com.okinc.business.appupdate.update.AppUpdateUtils$$ExternalSyntheticLambda9
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppUpdateUtils.getUpdateManageableContainer$lambda$13(this.f$0, abstractActivityC33041mov, z);
            }
        }, ResumeCheckType.ONCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC58185ywX getUpdateManageableContainer$lambda$13(final AppUpdateUtils appUpdateUtils, final AbstractActivityC33041mov abstractActivityC33041mov, final boolean z) {
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: com.okinc.business.appupdate.update.AppUpdateUtils$$ExternalSyntheticLambda11
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                AppUpdateUtils.getUpdateManageableContainer$lambda$13$lambda$12(this.f$0, abstractActivityC33041mov, z, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getUpdateManageableContainer$lambda$13$lambda$12(AppUpdateUtils appUpdateUtils, AbstractActivityC33041mov abstractActivityC33041mov, boolean z, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        appUpdateUtils.checkUpdate(abstractActivityC33041mov, z);
        interfaceC58184ywW.onNext(Boolean.FALSE);
    }

    private final void addUpdateResultListener(Function1<? super String, Unit> function1) {
        this.updateResultListeners.add(function1);
    }

    private final String getLatestVersionName() {
        String strValueOf;
        AppUpdateConfigResp appUpdateConfigResp = this.appUpdateResp;
        if (appUpdateConfigResp != null && appUpdateConfigResp.hasNewVersion$OKUpgrade_ok_upgrade()) {
            AppUpdateConfigResp appUpdateConfigResp2 = this.appUpdateResp;
            strValueOf = appUpdateConfigResp2 != null ? appUpdateConfigResp2.getLatestVersion() : null;
        } else {
            strValueOf = C34703nhO.valueOf(C43246rlf.OLrzqt.valueOf());
        }
        return strValueOf == null ? "" : strValueOf;
    }

    @Override // com.okinc.business.appupdate.api.IUpdate
    public void getLatestVersion(@NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC32955mnO<Unit> abstractC32955mnO = this.apiResponseStatus;
        if ((abstractC32955mnO instanceof AbstractC32955mnO.ActionBar) || (abstractC32955mnO instanceof AbstractC32955mnO.Activity)) {
            function1.invoke(getLatestVersionName());
        } else {
            addUpdateResultListener(function1);
        }
    }

    private final void unregisterWhenActivityDestroy() {
        C32979mnm.EZpvd.OLrzqt().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.okinc.business.appupdate.update.AppUpdateUtils.unregisterWhenActivityDestroy.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                Intrinsics.checkNotNullParameter(activity, "");
                Intrinsics.checkNotNullParameter(bundle, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
                GPUpgradeManager.INSTANCE.listenUpgradeState(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
                GPUpgradeManager.INSTANCE.destroy(activity);
            }
        });
    }

    private final void observeUpdateStateChange() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C33538myO.class, new String[0]);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        abstractC58185ywXKWHzl.AEQbTJ(1L, timeUnit).subscribe(new RxBus.EventCallback<C33538myO>() { // from class: com.okinc.business.appupdate.update.AppUpdateUtils.observeUpdateStateChange.1
            {
                super(AppUpdateUtils.this);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(C33538myO c33538myO) {
                Intrinsics.checkNotNullParameter(c33538myO, "");
                Iterator it = AppUpdateUtils.this.getUpdateListeners().iterator();
                while (it.hasNext()) {
                    ((com.okinc.business.appupdate.api.IUpdateStateChange) it.next()).onDownloadProgressChange(c33538myO.AEQbTJ());
                }
            }
        });
        RxBus.KWHzl(C33539myP.class, new String[0]).AEQbTJ(1L, timeUnit).subscribe(new RxBus.EventCallback<C33539myP>() { // from class: com.okinc.business.appupdate.update.AppUpdateUtils.observeUpdateStateChange.2
            {
                super(AppUpdateUtils.this);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(C33539myP c33539myP) {
                Intrinsics.checkNotNullParameter(c33539myP, "");
                Iterator it = AppUpdateUtils.this.getUpdateListeners().iterator();
                while (it.hasNext()) {
                    ((com.okinc.business.appupdate.api.IUpdateStateChange) it.next()).onDownloadFailed();
                }
            }
        });
        RxBus.AEQbTJ(EventConst.EVENT_APK_SUCCESS).subscribe(new RxBus.EventCallback<String>() { // from class: com.okinc.business.appupdate.update.AppUpdateUtils.observeUpdateStateChange.3
            {
                super(AppUpdateUtils.this);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                Intrinsics.checkNotNullParameter(str, "");
                if (Intrinsics.EZpvd((Object) str, (Object) EventConst.EVENT_APK_SUCCESS)) {
                    Iterator it = AppUpdateUtils.this.getUpdateListeners().iterator();
                    while (it.hasNext()) {
                        ((com.okinc.business.appupdate.api.IUpdateStateChange) it.next()).onDownloadSuccess();
                    }
                }
            }
        });
        RxBus.AEQbTJ(EventConst.EVENT_APK_CANCEL).subscribe(new RxBus.EventCallback<String>() { // from class: com.okinc.business.appupdate.update.AppUpdateUtils.observeUpdateStateChange.4
            {
                super(AppUpdateUtils.this);
            }

            /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
            @Override // com.okinc.rxutils.RxBus.EventCallback
            public void onEvent(String str) {
                Intrinsics.checkNotNullParameter(str, "");
                if (Intrinsics.EZpvd((Object) str, (Object) EventConst.EVENT_APK_CANCEL)) {
                    Iterator it = AppUpdateUtils.this.getUpdateListeners().iterator();
                    while (it.hasNext()) {
                        ((com.okinc.business.appupdate.api.IUpdateStateChange) it.next()).onDownloadCanceled();
                    }
                }
            }
        });
    }

    public static abstract class AppUpdateCheckResult {
        public static final int $stable = 0;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.appupdate.update.AppUpdateUtils.AppUpdateCheckResult.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ AppUpdateCheckResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class NeedUpdate extends AppUpdateCheckResult {
            public static final int $stable = 0;
            public static final NeedUpdate INSTANCE = new NeedUpdate();

            private NeedUpdate() {
                super(null);
            }
        }

        private AppUpdateCheckResult() {
        }

        public static final class NoUpdate extends AppUpdateCheckResult {
            public static final int $stable = 0;
            public static final NoUpdate INSTANCE = new NoUpdate();

            private NoUpdate() {
                super(null);
            }
        }
    }

    @Override // com.okinc.business.appupdate.api.IUpdate
    public void checkUpdate(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, final boolean z, IUpdate.DialogInfo dialogInfo) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        if (dialogInfo != null) {
            UtilsExtKt.showCustomUpdateDialog(abstractActivityC33041mov, dialogInfo, new Function0() { // from class: com.okinc.business.appupdate.update.AppUpdateUtils$$ExternalSyntheticLambda7
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AppUpdateUtils.checkUpdate$lambda$15(this.f$0, abstractActivityC33041mov, z);
                }
            });
        } else {
            checkUpdate(abstractActivityC33041mov, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkUpdate$lambda$15(AppUpdateUtils appUpdateUtils, AbstractActivityC33041mov abstractActivityC33041mov, boolean z) {
        appUpdateUtils.checkUpdateFromGP(abstractActivityC33041mov, false, true, z);
        return Unit.INSTANCE;
    }

    public final void updateApp$OKUpgrade_ok_upgrade(@NotNull AppUpdateFragment appUpdateFragment, @NotNull AppUpdateInfo appUpdateInfo) {
        Intrinsics.checkNotNullParameter(appUpdateFragment, "");
        Intrinsics.checkNotNullParameter(appUpdateInfo, "");
        FragmentActivity fragmentActivityRequireActivity = appUpdateFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        Integer mode = appUpdateInfo.getMode();
        if (mode != null && mode.intValue() == 1) {
            appUpdateFragment.dismissAllowingStateLoss();
            goToMiniapp(fragmentActivityRequireActivity, appUpdateInfo.getAdditionalUrl());
            return;
        }
        if (mode != null && mode.intValue() == 2) {
            appUpdateFragment.dismissAllowingStateLoss();
            goToWeb(fragmentActivityRequireActivity, appUpdateInfo.getAdditionalUrl());
        } else if (mode != null && mode.intValue() == 3) {
            appUpdateFragment.dismissAllowingStateLoss();
            goToDeeplink(fragmentActivityRequireActivity, appUpdateInfo.getAdditionalUrl());
        } else {
            checkUpdateFromGP(fragmentActivityRequireActivity, appUpdateInfo.isForcedUpdate(), true, false);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.appupdate.update.AppUpdateUtils.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isSupportUpgradeUseCore() {
            return false;
        }

        private Companion() {
        }
    }

    private final void notifyUpdateResultListeners(String str) {
        Iterator<T> it = this.updateResultListeners.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(str);
        }
        this.updateResultListeners.clear();
    }
}
