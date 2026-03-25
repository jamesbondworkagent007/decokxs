package o;

import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class RM {
    public final android.content.Context KWHzl;

    public RM(android.content.Context context) {
        this.KWHzl = context;
    }

    public final android.content.pm.ApplicationInfo copydefault() throws PackageManager.NameNotFoundException {
        return this.KWHzl.getPackageManager().getApplicationInfo(this.KWHzl.getPackageName(), 128);
    }

    public java.util.List<RL> AEQbTJ() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.content.pm.ApplicationInfo applicationInfoCopydefault = copydefault();
            if (applicationInfoCopydefault != null && applicationInfoCopydefault.metaData != null) {
                if (android.util.Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(applicationInfoCopydefault.metaData);
                }
                for (java.lang.String str : applicationInfoCopydefault.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfoCopydefault.metaData.get(str))) {
                        arrayList.add(copydefault(str));
                        android.util.Log.isLoggable("ManifestParser", 3);
                    }
                }
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            throw new java.lang.RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }

    public static RL copydefault(java.lang.String str) {
        java.lang.Object objNewInstance;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(str);
            try {
                objNewInstance = cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            } catch (java.lang.IllegalAccessException e) {
                copydefault(cls, e);
                objNewInstance = null;
            } catch (java.lang.InstantiationException e2) {
                copydefault(cls, e2);
                objNewInstance = null;
            } catch (java.lang.NoSuchMethodException e3) {
                copydefault(cls, e3);
                objNewInstance = null;
            } catch (InvocationTargetException e4) {
                copydefault(cls, e4);
                objNewInstance = null;
            }
            if (!(objNewInstance instanceof RL)) {
                throw new java.lang.RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
            }
            return (RL) objNewInstance;
        } catch (java.lang.ClassNotFoundException e5) {
            throw new java.lang.IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static void copydefault(java.lang.Class<?> cls, java.lang.Exception exc) {
        throw new java.lang.RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }
}
