package com.okinc.business.appupdate.update;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.okinc.business.appupdate.update.AppUpdateUtils;
import com.okinc.rxutils.RxBus;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC32955mnO;
import o.C33070mpX;
import o.C33129mqd;
import o.C33538myO;
import o.C52761wXj;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class GPUpgradeManager {
    private static final int GP_UPGRADE_REQUEST_CODE = 1244;
    private static final int HIGH_PRIORITY_UPDATE = 5;
    public static final GPUpgradeManager INSTANCE = new GPUpgradeManager();
    private static final MutableLiveData<AbstractC32955mnO<AppUpdateUtils.AppUpdateCheckResult>> eCheckUpdateState = new MutableLiveData<>();
    private static final HashMap<String, AppUpdateManager> appUpdateManagerMap = new HashMap<>();
    private static final HashMap<String, InstallStateUpdatedListener> installStateUpdatedListenerMap = new HashMap<>();
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<AbstractC32955mnO<AppUpdateUtils.AppUpdateCheckResult>> getECheckUpdateState() {
        return eCheckUpdateState;
    }

    private GPUpgradeManager() {
    }

    public final void init(@NotNull Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "");
        AppUpdateManager appUpdateManagerCreate = AppUpdateManagerFactory.create(activity);
        Intrinsics.checkNotNullExpressionValue(appUpdateManagerCreate, "");
        appUpdateManagerMap.put(activity.toString(), appUpdateManagerCreate);
        InstallStateUpdatedListener installStateUpdatedListenerCreateInstallStateUpdatedListener = createInstallStateUpdatedListener(activity, appUpdateManagerCreate);
        installStateUpdatedListenerMap.put(activity.toString(), installStateUpdatedListenerCreateInstallStateUpdatedListener);
        appUpdateManagerCreate.registerListener(installStateUpdatedListenerCreateInstallStateUpdatedListener);
        checkGpUpgrade(activity, z);
    }

    private final InstallStateUpdatedListener createInstallStateUpdatedListener(final Activity activity, final AppUpdateManager appUpdateManager) {
        return new InstallStateUpdatedListener() { // from class: com.okinc.business.appupdate.update.GPUpgradeManager$$ExternalSyntheticLambda4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.android.play.core.listener.StateUpdatedListener
            public final void onStateUpdate(InstallState installState) {
                GPUpgradeManager.createInstallStateUpdatedListener$lambda$0(activity, appUpdateManager, installState);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createInstallStateUpdatedListener$lambda$0(Activity activity, AppUpdateManager appUpdateManager, InstallState installState) {
        Intrinsics.checkNotNullParameter(installState, "");
        if (installState.installStatus() == 11) {
            INSTANCE.popupSnackbarForCompleteUpdate(activity, appUpdateManager);
            RxBus.KWHzl(EventConst.EVENT_APK_SUCCESS);
        }
        if (installState.installStatus() == 6) {
            RxBus.KWHzl(EventConst.EVENT_APK_CANCEL);
        }
        if (installState.installStatus() == 2) {
            RxBus.AEQbTJ(new C33538myO((int) ((C33129mqd.AEQbTJ(Long.valueOf(installState.bytesDownloaded())) / C33129mqd.AEQbTJ(Long.valueOf(installState.totalBytesToDownload()))) * ((double) 100))));
        }
    }

    public final void destroy(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        AppUpdateManager appUpdateManager = appUpdateManagerMap.get(activity.toString());
        InstallStateUpdatedListener installStateUpdatedListener = installStateUpdatedListenerMap.get(activity.toString());
        if (installStateUpdatedListener == null || appUpdateManager == null) {
            return;
        }
        appUpdateManager.unregisterListener(installStateUpdatedListener);
    }

    private final void checkGpUpgrade(final Activity activity, final boolean z) {
        final AppUpdateManager appUpdateManager = appUpdateManagerMap.get(activity.toString());
        if (appUpdateManager == null) {
            return;
        }
        Task<com.google.android.play.core.appupdate.AppUpdateInfo> appUpdateInfo = appUpdateManager.getAppUpdateInfo();
        Intrinsics.checkNotNullExpressionValue(appUpdateInfo, "");
        appUpdateInfo.addOnCompleteListener(new OnCompleteListener() { // from class: com.okinc.business.appupdate.update.GPUpgradeManager$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                GPUpgradeManager.checkGpUpgrade$lambda$1(z, activity, appUpdateManager, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkGpUpgrade$lambda$1(boolean z, Activity activity, AppUpdateManager appUpdateManager, Task task) {
        String message;
        String str = "";
        Intrinsics.checkNotNullParameter(task, "");
        if (task.isSuccessful()) {
            com.google.android.play.core.appupdate.AppUpdateInfo appUpdateInfo = (com.google.android.play.core.appupdate.AppUpdateInfo) task.getResult();
            pUU.KWHzl("AppUpdateUtils", appUpdateInfo.toString());
            if (appUpdateInfo.updateAvailability() != 2) {
                eCheckUpdateState.setValue(new AbstractC32955mnO.ActionBar(AppUpdateUtils.AppUpdateCheckResult.NoUpdate.INSTANCE));
                pUU.valueOf("AppUpdateUtils", "no update");
            } else if (!z) {
                GPUpgradeManager gPUpgradeManager = INSTANCE;
                Intrinsics.copydefault(appUpdateInfo);
                gPUpgradeManager.startUpdateFlowForResult(activity, appUpdateManager, appUpdateInfo, 0);
                eCheckUpdateState.setValue(new AbstractC32955mnO.ActionBar(AppUpdateUtils.AppUpdateCheckResult.NeedUpdate.INSTANCE));
            } else {
                GPUpgradeManager gPUpgradeManager2 = INSTANCE;
                Intrinsics.copydefault(appUpdateInfo);
                gPUpgradeManager2.startUpdateFlowForResult(activity, appUpdateManager, appUpdateInfo, 1);
                eCheckUpdateState.setValue(new AbstractC32955mnO.ActionBar(AppUpdateUtils.AppUpdateCheckResult.NeedUpdate.INSTANCE));
            }
            if (appUpdateInfo.installStatus() == 11) {
                INSTANCE.popupSnackbarForCompleteUpdate(activity, appUpdateManager);
                eCheckUpdateState.setValue(new AbstractC32955mnO.ActionBar(AppUpdateUtils.AppUpdateCheckResult.NeedUpdate.INSTANCE));
                return;
            }
            return;
        }
        MutableLiveData<AbstractC32955mnO<AppUpdateUtils.AppUpdateCheckResult>> mutableLiveData = eCheckUpdateState;
        Exception exception = task.getException();
        if (exception != null && (message = exception.getMessage()) != null) {
            str = message;
        }
        mutableLiveData.setValue(new AbstractC32955mnO.Activity(str));
    }

    public final void listenUpgradeState(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        final AppUpdateManager appUpdateManager = appUpdateManagerMap.get(activity.toString());
        if (appUpdateManager == null) {
            return;
        }
        Task<com.google.android.play.core.appupdate.AppUpdateInfo> appUpdateInfo = appUpdateManager.getAppUpdateInfo();
        Intrinsics.checkNotNullExpressionValue(appUpdateInfo, "");
        final Function1 function1 = new Function1() { // from class: com.okinc.business.appupdate.update.GPUpgradeManager$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GPUpgradeManager.listenUpgradeState$lambda$2(activity, appUpdateManager, (com.google.android.play.core.appupdate.AppUpdateInfo) obj);
            }
        };
        appUpdateInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.okinc.business.appupdate.update.GPUpgradeManager$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listenUpgradeState$lambda$2(Activity activity, AppUpdateManager appUpdateManager, com.google.android.play.core.appupdate.AppUpdateInfo appUpdateInfo) {
        if (appUpdateInfo.updatePriority() >= 5) {
            GPUpgradeManager gPUpgradeManager = INSTANCE;
            Intrinsics.copydefault(appUpdateInfo);
            gPUpgradeManager.startUpdateFlowForResult(activity, appUpdateManager, appUpdateInfo, 1);
        } else if (appUpdateInfo.installStatus() == 11) {
            INSTANCE.popupSnackbarForCompleteUpdate(activity, appUpdateManager);
        } else if (appUpdateInfo.installStatus() == 1 && appUpdateInfo.updateAvailability() == 3) {
            GPUpgradeManager gPUpgradeManager2 = INSTANCE;
            Intrinsics.copydefault(appUpdateInfo);
            gPUpgradeManager2.startUpdateFlowForResult(activity, appUpdateManager, appUpdateInfo, 1);
        }
        return Unit.INSTANCE;
    }

    private final void startUpdateFlowForResult(Activity activity, AppUpdateManager appUpdateManager, com.google.android.play.core.appupdate.AppUpdateInfo appUpdateInfo, int i) {
        try {
            appUpdateManager.startUpdateFlowForResult(appUpdateInfo, i, activity, GP_UPGRADE_REQUEST_CODE);
        } catch (Exception e) {
            pUU.AEQbTJ("AppUpdateUtils", "startUpdateFlowForResult error", e);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == GP_UPGRADE_REQUEST_CODE && i2 == 0) {
            RxBus.KWHzl(EventConst.EVENT_APK_CANCEL);
        }
    }

    private final void popupSnackbarForCompleteUpdate(Activity activity, final AppUpdateManager appUpdateManager) {
        Snackbar snackbarMake = Snackbar.make(((ViewGroup) activity.findViewById(R.id.content)).getChildAt(0), C33070mpX.AYXKKw(com.okinc.business.appupdate.R.string.pr_upgrade_app_update_downloaded), -2);
        snackbarMake.setAction(C33070mpX.AYXKKw(com.okinc.business.appupdate.R.string.pr_upgrade_app_update_restart_app), new View.OnClickListener() { // from class: com.okinc.business.appupdate.update.GPUpgradeManager$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                appUpdateManager.completeUpdate();
            }
        });
        snackbarMake.setActionTextColor(C33070mpX.copydefault(C52761wXj.Activity.HJWChPdNQGVJ));
        snackbarMake.show();
    }
}
