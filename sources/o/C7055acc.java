package o;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.MissingResourceException;

/* JADX INFO: renamed from: o.acc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7055acc {
    public static void AEQbTJ(java.io.InputStream inputStream, java.lang.String str) {
    }

    public static java.io.InputStream KWHzl(final java.lang.Class<?> cls, final java.lang.String str, boolean z) {
        java.io.InputStream resourceAsStream;
        if (java.lang.System.getSecurityManager() != null) {
            resourceAsStream = (java.io.InputStream) AccessController.doPrivileged(new PrivilegedAction<java.io.InputStream>() { // from class: o.acc.5
                /* JADX DEBUG: Method merged with bridge method: run()Ljava/lang/Object; */
                @Override // java.security.PrivilegedAction
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public java.io.InputStream run() {
                    return cls.getResourceAsStream(str);
                }
            });
        } else {
            resourceAsStream = cls.getResourceAsStream(str);
        }
        if (resourceAsStream == null && z) {
            throw new MissingResourceException("could not locate data " + str, cls.getPackage().getName(), str);
        }
        AEQbTJ(resourceAsStream, str);
        return resourceAsStream;
    }

    public static java.io.InputStream AEQbTJ(final java.lang.ClassLoader classLoader, final java.lang.String str, boolean z) {
        java.io.InputStream resourceAsStream;
        if (java.lang.System.getSecurityManager() != null) {
            resourceAsStream = (java.io.InputStream) AccessController.doPrivileged(new PrivilegedAction<java.io.InputStream>() { // from class: o.acc.4
                /* JADX DEBUG: Method merged with bridge method: run()Ljava/lang/Object; */
                @Override // java.security.PrivilegedAction
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public java.io.InputStream run() {
                    return classLoader.getResourceAsStream(str);
                }
            });
        } else {
            resourceAsStream = classLoader.getResourceAsStream(str);
        }
        if (resourceAsStream == null && z) {
            throw new MissingResourceException("could not locate data", classLoader.toString(), str);
        }
        AEQbTJ(resourceAsStream, str);
        return resourceAsStream;
    }

    public static java.io.InputStream KWHzl(java.lang.ClassLoader classLoader, java.lang.String str) {
        return AEQbTJ(classLoader, str, false);
    }

    public static java.io.InputStream OLrzqt(java.lang.String str) {
        return KWHzl(C7055acc.class, str, false);
    }

    public static java.io.InputStream AEQbTJ(java.lang.Class<?> cls, java.lang.String str) {
        return KWHzl(cls, str, true);
    }
}
