package com.okinc.liveness.lca.manager;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import com.okinc.liveness.lca.exception.LcaBrightnessAdjustException;
import kotlin.jvm.internal.Intrinsics;
import o.C6777aVl;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class BrightnessManager {
    public static final int $stable = 8;
    public final String TAG;
    public final Activity activity;
    public float originalBrightness;

    public BrightnessManager(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.activity = activity;
        this.TAG = "BrightnessManager";
        this.originalBrightness = -1.0f;
    }

    public final void setMaxBrightness() {
        try {
            Window window = this.activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            this.originalBrightness = attributes.screenBrightness;
            window.addFlags(128);
            attributes.screenBrightness = 1.0f;
            window.setAttributes(attributes);
            pUU.EZpvd(this.TAG, "Maximum brightness set");
        } catch (Exception e) {
            pUU.AEQbTJ(this.TAG, "Error setting max brightness", e);
            C6777aVl.Companion.EZpvd(new LcaBrightnessAdjustException("brightness adjust exception", e));
        }
    }

    public final void restoreOriginalBrightness() {
        try {
            Window window = this.activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = this.originalBrightness;
            window.clearFlags(128);
            window.setAttributes(attributes);
            pUU.EZpvd(this.TAG, "Original brightness restored");
        } catch (Exception e) {
            pUU.AEQbTJ(this.TAG, "Error restoring original brightness", e);
        }
    }
}
