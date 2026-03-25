package com.okinc.liveness.lca.manager;

import android.content.SharedPreferences;
import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import com.google.android.exoplayer2.C;
import com.google.gson.Gson;
import com.okinc.liveness.lca.exception.LcaConfigException;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfig;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigCollectedVideoConfig;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigFaceDetectionConfig;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigFaceQcConfig;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfigOvalParameters;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43246rlf;
import o.C6777aVl;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ConfigManager {
    public static final boolean USE_DEFAULT = false;
    public final Gson gson = new Gson();
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final String PREF_NAME = "lca_config";
    public static final String KEY_CONFIG = "local_config";

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.manager.ConfigManager.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void saveLocalConfig(@NotNull LcaSdkLivenessConfig lcaSdkLivenessConfig) {
        Intrinsics.checkNotNullParameter(lcaSdkLivenessConfig, "");
        SharedPreferences sharedPreferences = C43246rlf.OLrzqt.valueOf().getSharedPreferences(PREF_NAME, 0);
        sharedPreferences.edit().putString(KEY_CONFIG, this.gson.toJson(lcaSdkLivenessConfig)).apply();
    }

    public final LcaSdkLivenessConfig getLocalConfig() {
        LcaSdkLivenessConfig defaultConfig;
        SharedPreferences sharedPreferences = C43246rlf.OLrzqt.valueOf().getSharedPreferences(PREF_NAME, 0);
        String string = sharedPreferences.getString(KEY_CONFIG, null);
        try {
            if (string != null) {
                defaultConfig = (LcaSdkLivenessConfig) this.gson.fromJson(string, LcaSdkLivenessConfig.class);
            } else {
                defaultConfig = getDefaultConfig();
            }
            Intrinsics.copydefault(defaultConfig);
            return defaultConfig;
        } catch (Exception e) {
            pUU.AEQbTJ("ConfigManager", "Error parsing local config", e);
            C6777aVl.Companion.EZpvd(new LcaConfigException(e.getMessage(), e.getCause()));
            Intrinsics.copydefault(sharedPreferences);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            Intrinsics.checkNotNullExpressionValue(editorEdit, "");
            editorEdit.remove(KEY_CONFIG);
            editorEdit.commit();
            return getDefaultConfig();
        }
    }

    public final LcaSdkLivenessConfig getDefaultConfig() {
        byte[] bArr;
        Charset charsetForName;
        try {
            InputStream inputStreamOpen = C43246rlf.OLrzqt.valueOf().getAssets().open("lca_default_config.json");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
            bArr = new byte[inputStreamOpen.available()];
            inputStreamOpen.read(bArr);
            inputStreamOpen.close();
            charsetForName = Charset.forName(C.UTF8_NAME);
            Intrinsics.checkNotNullExpressionValue(charsetForName, "");
        } catch (Exception e) {
            e = e;
        }
        try {
            Object objFromJson = this.gson.fromJson(new String(bArr, charsetForName), (Class<Object>) LcaSdkLivenessConfig.class);
            Intrinsics.copydefault(objFromJson);
            return (LcaSdkLivenessConfig) objFromJson;
        } catch (Exception e2) {
            e = e2;
            pUU.AEQbTJ("ConfigManager", "Error reading default config", e);
            return new LcaSdkLivenessConfig(new LcaSdkLivenessConfigCollectedVideoConfig(1000000, Integer.valueOf(LivenessCoordinator.TARGET_HEIGHT), Integer.valueOf(LivenessCoordinator.TARGET_WIDTH), 30), new LcaSdkLivenessConfigOvalParameters(Float.valueOf(0.56f), Float.valueOf(1.5f), Float.valueOf(0.85f), Float.valueOf(1.5f)), new LcaSdkLivenessConfigFaceDetectionConfig(Float.valueOf(0.7f), Float.valueOf(0.5f), Float.valueOf(0.95f), Float.valueOf(0.75f), Float.valueOf(0.95f), 60000, 600, Float.valueOf(0.85f), Float.valueOf(1.1f), Float.valueOf(0.08f), Float.valueOf(0.05f), Float.valueOf(30.0f), Float.valueOf(35.0f), Float.valueOf(0.1f), 200, 15000L), new LcaSdkLivenessConfigFaceQcConfig(Float.valueOf(0.3f), Float.valueOf(0.5f), Float.valueOf(0.5f), Float.valueOf(0.9f), Float.valueOf(0.8f)), new LcaSdkLivenessConfigFaceQcConfig(Float.valueOf(1.0E-5f), Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), null, 32, null);
        }
    }
}
