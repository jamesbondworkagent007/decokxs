package o;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* JADX INFO: renamed from: o.abQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7016abQ {
    public static volatile java.lang.ClassLoader OLrzqt;

    /* JADX INFO: renamed from: o.abQ$Application */
    public static class Application extends java.lang.ClassLoader {
        public Application() {
            super(java.lang.Object.class.getClassLoader());
        }
    }

    public static java.lang.ClassLoader EZpvd() {
        java.lang.ClassLoader application;
        if (OLrzqt == null) {
            synchronized (C7016abQ.class) {
                if (OLrzqt == null) {
                    if (java.lang.System.getSecurityManager() != null) {
                        application = (java.lang.ClassLoader) AccessController.doPrivileged(new PrivilegedAction<java.lang.ClassLoader>() { // from class: o.abQ.4
                            /* JADX DEBUG: Method merged with bridge method: run()Ljava/lang/Object; */
                            @Override // java.security.PrivilegedAction
                            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                            public Application run() {
                                return new Application();
                            }
                        });
                    } else {
                        application = new Application();
                    }
                    OLrzqt = application;
                }
            }
        }
        return OLrzqt;
    }

    public static java.lang.ClassLoader EZpvd(java.lang.Class<?> cls) {
        java.lang.ClassLoader classLoader = cls.getClassLoader();
        return classLoader == null ? copydefault() : classLoader;
    }

    public static java.lang.ClassLoader copydefault() {
        java.lang.ClassLoader contextClassLoader = java.lang.Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            return contextClassLoader;
        }
        java.lang.ClassLoader systemClassLoader = java.lang.ClassLoader.getSystemClassLoader();
        return systemClassLoader == null ? EZpvd() : systemClassLoader;
    }
}
