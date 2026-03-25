package com.okinc.liveness.lca.manager;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C55328xhq;
import o.ViewOnClickListenerC54939xaY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaPermissionManager {
    public static final int $stable = 8;
    public final AppCompatActivity activity;
    public int deniedCount;
    public final Function0<Unit> onDenied;
    public final Function0<Unit> onGranted;
    public final Function0<Unit> onReady;
    public final String permission;
    public final ActivityResultLauncher<String> requestPermissionLauncher;
    public final ActivityResultLauncher<Intent> settingsLauncher;

    public LcaPermissionManager(@NotNull AppCompatActivity appCompatActivity, @NotNull String str, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        this.activity = appCompatActivity;
        this.permission = str;
        this.onReady = function0;
        this.onGranted = function02;
        this.onDenied = function03;
        ActivityResultLauncher<String> activityResultLauncherRegisterForActivityResult = appCompatActivity.registerForActivityResult(new ActivityResultContracts.RequestPermission(), new ActivityResultCallback() { // from class: com.okinc.liveness.lca.manager.LcaPermissionManager$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                LcaPermissionManager.requestPermissionLauncher$lambda$0(this.f$0, (Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.requestPermissionLauncher = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult2 = appCompatActivity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.okinc.liveness.lca.manager.LcaPermissionManager$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                LcaPermissionManager.settingsLauncher$lambda$1(this.f$0, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.settingsLauncher = activityResultLauncherRegisterForActivityResult2;
    }

    public static final void requestPermissionLauncher$lambda$0(LcaPermissionManager lcaPermissionManager, Boolean bool) {
        if (bool.booleanValue()) {
            lcaPermissionManager.onGranted.invoke();
            return;
        }
        lcaPermissionManager.deniedCount++;
        if (!lcaPermissionManager.activity.shouldShowRequestPermissionRationale(lcaPermissionManager.permission)) {
            lcaPermissionManager.showPermissionExplanationDialog();
        } else if (lcaPermissionManager.deniedCount >= 2) {
            lcaPermissionManager.showPermissionExplanationDialog();
        } else {
            lcaPermissionManager.requestPermission();
        }
    }

    public static final void settingsLauncher$lambda$1(LcaPermissionManager lcaPermissionManager, ActivityResult activityResult) {
        if (ContextCompat.checkSelfPermission(lcaPermissionManager.activity, lcaPermissionManager.permission) == 0) {
            lcaPermissionManager.onGranted.invoke();
        } else {
            lcaPermissionManager.requestPermission();
        }
    }

    public final void checkAndRequestPermission() {
        if (ContextCompat.checkSelfPermission(this.activity, this.permission) == 0) {
            this.onReady.invoke();
        } else {
            requestPermission();
        }
    }

    public final void requestPermission() {
        this.requestPermissionLauncher.launch(this.permission);
    }

    public final void showPermissionExplanationDialog() {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.activity);
        viewOnClickListenerC54939xaY.setTitle("Requires camera permission");
        viewOnClickListenerC54939xaY.EZpvd("This feature requires camera permission to function properly. Please grant permission.");
        viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) "Setting", new View.OnClickListener() { // from class: com.okinc.liveness.lca.manager.LcaPermissionManager$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.openAppSettings();
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ("Cancel", new View.OnClickListener() { // from class: com.okinc.liveness.lca.manager.LcaPermissionManager$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LcaPermissionManager.showPermissionExplanationDialog$lambda$4$lambda$3(viewOnClickListenerC54939xaY, this, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void showPermissionExplanationDialog$lambda$4$lambda$3(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, LcaPermissionManager lcaPermissionManager, View view) {
        viewOnClickListenerC54939xaY.dismiss();
        lcaPermissionManager.onDenied.invoke();
    }

    public final void openAppSettings() {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", this.activity.getPackageName(), null));
            this.settingsLauncher.launch(intent);
        } catch (Exception e) {
            e.printStackTrace();
            C55328xhq.show$default(C55328xhq.OLrzqt, (CharSequence) "Please open the setting page to grant the camera permission manually", (Drawable) null, 0, (Integer) 80, 0, 0, 54, (Object) null).show();
        }
    }
}
