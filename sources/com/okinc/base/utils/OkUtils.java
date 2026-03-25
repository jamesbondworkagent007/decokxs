package com.okinc.base.utils;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.FileProvider;
import com.okinc.core.util.SPUtils;
import o.InterfaceC6831aWm;

/* JADX INFO: loaded from: classes3.dex */
public class OkUtils {
    public static Application AEQbTJ;
    public static InterfaceC6831aWm EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void EZpvd(InterfaceC6831aWm interfaceC6831aWm) {
        EZpvd = interfaceC6831aWm;
    }

    public static void EZpvd(Context context) {
        if (context == null) {
            return;
        }
        copydefault(context);
        if (context instanceof Application) {
            SPUtils.init(context);
        }
    }

    public static InterfaceC6831aWm KWHzl() {
        if (EZpvd == null) {
            EZpvd = new InterfaceC6831aWm() { // from class: com.okinc.base.utils.OkUtils.3
                @Override // o.InterfaceC6831aWm
                public void EZpvd(@Nullable String str, @NonNull String str2) {
                }

                @Override // o.InterfaceC6831aWm
                public void OLrzqt(@Nullable String str, @NonNull String str2) {
                }
            };
        }
        return EZpvd;
    }

    public static void copydefault(Context context) {
        if (AEQbTJ != null || context == null) {
            return;
        }
        try {
            AEQbTJ = (Application) context.getApplicationContext();
        } catch (Exception unused) {
        }
    }

    public static Application AEQbTJ() {
        Application application = AEQbTJ;
        if (application != null) {
            return application;
        }
        try {
            Application applicationCopydefault = copydefault();
            EZpvd(applicationCopydefault);
            return applicationCopydefault;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Application copydefault() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("getApplication", new Class[0]).invoke(cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]), new Object[0]);
            if (objInvoke == null) {
                throw new NullPointerException("u should init first");
            }
            return (Application) objInvoke;
        } catch (Exception unused) {
            throw new NullPointerException("u should init first");
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class FileProviderDevApp extends FileProvider {
        public FileProviderDevApp() {
        }

        public FileProviderDevApp(int i) {
            super(i);
        }

        @Override // androidx.core.content.FileProvider, android.content.ContentProvider
        public boolean onCreate() {
            OkUtils.EZpvd(getContext().getApplicationContext());
            return true;
        }
    }
}
