package o;

import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.MissingResourceException;

/* JADX INFO: renamed from: o.aca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7053aca {
    public static final java.util.Properties OLrzqt;

    static {
        java.util.Properties properties = new java.util.Properties();
        OLrzqt = properties;
        try {
            java.io.InputStream inputStreamOLrzqt = C7055acc.OLrzqt("/com/ibm/icu/ICUConfig.properties");
            if (inputStreamOLrzqt != null) {
                try {
                    properties.load(inputStreamOLrzqt);
                    inputStreamOLrzqt.close();
                } catch (java.lang.Throwable th) {
                    inputStreamOLrzqt.close();
                    throw th;
                }
            }
        } catch (java.io.IOException | MissingResourceException unused) {
        }
    }

    public static java.lang.String AEQbTJ(java.lang.String str) {
        return AEQbTJ(str, null);
    }

    public static java.lang.String AEQbTJ(final java.lang.String str, java.lang.String str2) {
        java.lang.String property;
        if (java.lang.System.getSecurityManager() != null) {
            try {
                property = (java.lang.String) AccessController.doPrivileged(new PrivilegedAction<java.lang.String>() { // from class: o.aca.4
                    /* JADX DEBUG: Method merged with bridge method: run()Ljava/lang/Object; */
                    @Override // java.security.PrivilegedAction
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public java.lang.String run() {
                        return java.lang.System.getProperty(str);
                    }
                });
            } catch (AccessControlException unused) {
                property = null;
            }
        } else {
            property = java.lang.System.getProperty(str);
        }
        return property == null ? OLrzqt.getProperty(str, str2) : property;
    }
}
