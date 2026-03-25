package com.okinc.common.application;

import android.app.Application;
import android.content.ContentProvider;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import androidx.core.app.CoreComponentFactory;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.okinc.lib.utils.OkUtils;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C38052pKl;
import o.C38057pKq;
import o.C38063pKw;
import o.C6777aVl;
import o.pIW;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class CustomAppComponentFactory extends CoreComponentFactory {
    public static final int $stable = 0;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    private static final String KEY_HANDLED_EXCEPTION = "handled_class_not_found_exception";
    private static final String TAG = "CustomFactory";

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.common.application.CustomAppComponentFactory.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // androidx.core.app.CoreComponentFactory
    public ContentProvider instantiateProvider(@NotNull ClassLoader classLoader, @NotNull String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        ContentProvider contentProviderInstantiateProvider;
        Intrinsics.checkNotNullParameter(classLoader, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (Build.VERSION.SDK_INT == 29) {
                String strCopydefault = C38052pKl.copydefault();
                String str2 = "handled_class_not_found_exception_" + strCopydefault;
                String string = getString(str2, "1");
                pUU.copydefault(TAG, "perform hasHandledException:" + string + " system:29 versionName:" + strCopydefault);
                try {
                    pUU.KWHzl(TAG, "normal load " + str);
                    contentProviderInstantiateProvider = super.instantiateProvider(classLoader, str);
                } catch (ClassNotFoundException e) {
                    pUU.copydefault(TAG, "Failed to instantiate provider: " + str + " hasHandledException:" + string);
                    if (Intrinsics.EZpvd((Object) string, (Object) "1")) {
                        saveString(str2, "0");
                        C6777aVl.Companion.EZpvd(new ClassNotFoundException("Failed to instantiate provider:" + str));
                        restartApp();
                        contentProviderInstantiateProvider = super.instantiateProvider(classLoader, str);
                    } else {
                        throw e;
                    }
                }
            } else {
                pUU.copydefault(TAG, "normal load system:29 provider name:" + str);
                contentProviderInstantiateProvider = super.instantiateProvider(classLoader, str);
            }
            Intrinsics.copydefault(contentProviderInstantiateProvider);
            return contentProviderInstantiateProvider;
        } catch (Exception e2) {
            pUU.KWHzl(TAG, "failed instantiateProvider ", e2);
            ContentProvider contentProviderInstantiateProvider2 = super.instantiateProvider(classLoader, str);
            Intrinsics.checkNotNullExpressionValue(contentProviderInstantiateProvider2, "");
            return contentProviderInstantiateProvider2;
        }
    }

    private final void restartApp() {
        pUU.copydefault(TAG, "restartApp");
        Application applicationCopydefault = OkUtils.copydefault();
        Intent launchIntentForPackage = applicationCopydefault.getPackageManager().getLaunchIntentForPackage(applicationCopydefault.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(67108864);
        }
        applicationCopydefault.startActivity(launchIntentForPackage);
        pUU.copydefault(TAG, "killProcess");
        Process.killProcess(Process.myPid());
    }

    public final void saveString(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        File file = getFile(AWSCognitoLegacyCredentialStore.PROVIDER_KEY, str);
        C38057pKq.KWHzl(file);
        C38057pKq.copydefault(file, str2);
    }

    public final String getString(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String strAEQbTJ = C38057pKq.AEQbTJ(getFile(AWSCognitoLegacyCredentialStore.PROVIDER_KEY, str));
        return strAEQbTJ == null ? str2 : strAEQbTJ;
    }

    public final File getFile(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        File fileDbNXlk = pIW.DbNXlk();
        Intrinsics.checkNotNullExpressionValue(fileDbNXlk, "");
        File file = new File(fileDbNXlk, str);
        C38063pKw.OLrzqt(file);
        return new File(file, str2);
    }
}
