package com.okinc.lib.utils;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.FileProvider;
import o.InterfaceC38050pKj;

/* JADX INFO: loaded from: classes9.dex */
public class OkUtils {
    public static Context EZpvd;
    public static Application KWHzl;
    public static InterfaceC38050pKj OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Context KWHzl() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void OLrzqt(InterfaceC38050pKj interfaceC38050pKj) {
        OLrzqt = interfaceC38050pKj;
    }

    private OkUtils() {
    }

    public static void OLrzqt(Context context) {
        if (context == null) {
            return;
        }
        EZpvd = context;
        AEQbTJ(context);
    }

    public static InterfaceC38050pKj AhwBna() {
        if (OLrzqt == null) {
            OLrzqt = new InterfaceC38050pKj() { // from class: com.okinc.lib.utils.OkUtils.5
                @Override // o.InterfaceC38050pKj
                public void AEQbTJ(@Nullable String str, @NonNull String str2) {
                }

                @Override // o.InterfaceC38050pKj
                public void EZpvd(@Nullable String str, @NonNull String str2) {
                }

                @Override // o.InterfaceC38050pKj
                public void KWHzl(@Nullable String str, @NonNull String str2) {
                }

                @Override // o.InterfaceC38050pKj
                public void OLrzqt(@Nullable String str, @NonNull String str2) {
                }

                @Override // o.InterfaceC38050pKj
                public void OLrzqt(boolean z) {
                }

                @Override // o.InterfaceC38050pKj
                public void copydefault(@Nullable String str, @NonNull String str2, @Nullable Throwable th) {
                    if (th != null) {
                        th.getMessage();
                    }
                }
            };
        }
        return OLrzqt;
    }

    public static void AEQbTJ(Context context) {
        if (KWHzl != null || context == null) {
            return;
        }
        try {
            if (context instanceof Application) {
                KWHzl = (Application) context;
            } else {
                KWHzl = (Application) context.getApplicationContext();
            }
        } catch (Exception unused) {
        }
    }

    public static Context OLrzqt() {
        return copydefault();
    }

    public static Context AEQbTJ() {
        return copydefault();
    }

    public static Application copydefault() {
        Application application = KWHzl;
        if (application != null) {
            return application;
        }
        try {
            Application applicationEZpvd = EZpvd();
            OLrzqt(applicationEZpvd);
            return applicationEZpvd;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Application EZpvd() {
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

    /* JADX INFO: loaded from: classes16.dex */
    public static final class FileProviderDevApp extends FileProvider {
        public FileProviderDevApp() {
        }

        public FileProviderDevApp(int i) {
            super(i);
        }

        @Override // androidx.core.content.FileProvider, android.content.ContentProvider
        public boolean onCreate() {
            OkUtils.OLrzqt(getContext().getApplicationContext());
            return true;
        }
    }
}
