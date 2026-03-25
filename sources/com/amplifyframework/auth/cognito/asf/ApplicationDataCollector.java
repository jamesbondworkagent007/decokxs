package com.amplifyframework.auth.cognito.asf;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ApplicationDataCollector implements DataCollector {
    private static final int ALL_FLAGS_OFF = 0;
    public static final String APP_NAME = "ApplicationName";
    public static final String APP_TARGET_SDK = "ApplicationTargetSdk";
    public static final String APP_VERSION = "ApplicationVersion";
    public static final Companion Companion = new Companion(null);
    private static final String TAG = ApplicationDataCollector.class.getSimpleName();

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.asf.ApplicationDataCollector.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final String getAppName(Context context) {
        return context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
    }

    private final String getAppVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    private final String getAppTargetSdk(Context context) {
        return String.valueOf(context.getApplicationInfo().targetSdkVersion);
    }

    @Override // com.amplifyframework.auth.cognito.asf.DataCollector
    public Map<String, String> collect(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt(APP_NAME, getAppName(context)), C56390yDp.OLrzqt(APP_TARGET_SDK, getAppTargetSdk(context)), C56390yDp.OLrzqt(APP_VERSION, getAppVersion(context)));
    }
}
