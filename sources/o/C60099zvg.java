package o;

import java.lang.reflect.InvocationTargetException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: o.zvg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60099zvg {
    public static volatile InterfaceC60085zvH AEQbTJ = null;
    public static volatile int copydefault;
    public static final C60118zvz valueOf = new C60118zvz();
    public static final C60109zvq KWHzl = new C60109zvq();
    public static boolean EZpvd = C60117zvy.KWHzl("slf4j.detectLoggerNameMismatch");
    public static final java.lang.String[] OLrzqt = {"2.0"};

    public static java.util.List<InterfaceC60085zvH> OLrzqt() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ClassLoader classLoader = C60099zvg.class.getClassLoader();
        InterfaceC60085zvH interfaceC60085zvHEZpvd = EZpvd(classLoader);
        if (interfaceC60085zvHEZpvd != null) {
            arrayList.add(interfaceC60085zvHEZpvd);
            return arrayList;
        }
        java.util.Iterator<InterfaceC60085zvH> it = AEQbTJ(classLoader).iterator();
        while (it.hasNext()) {
            KWHzl(arrayList, it);
        }
        return arrayList;
    }

    public static ServiceLoader<InterfaceC60085zvH> AEQbTJ(final java.lang.ClassLoader classLoader) {
        if (java.lang.System.getSecurityManager() == null) {
            return ServiceLoader.load(InterfaceC60085zvH.class, classLoader);
        }
        return (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: o.zvk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.security.PrivilegedAction
            public final java.lang.Object run() {
                return C60099zvg.KWHzl(classLoader);
            }
        });
    }

    public static /* synthetic */ ServiceLoader KWHzl(java.lang.ClassLoader classLoader) {
        return ServiceLoader.load(InterfaceC60085zvH.class, classLoader);
    }

    public static void KWHzl(java.util.List<InterfaceC60085zvH> list, java.util.Iterator<InterfaceC60085zvH> it) {
        try {
            list.add(it.next());
        } catch (ServiceConfigurationError e) {
            C60117zvy.AEQbTJ("A SLF4J service provider failed to instantiate:\n" + e.getMessage());
        }
    }

    private C60099zvg() {
    }

    public static final void valueOf() {
        KWHzl();
        if (copydefault == 3) {
            AkhnZx();
        }
    }

    public static final void KWHzl() {
        try {
            java.util.List<InterfaceC60085zvH> listOLrzqt = OLrzqt();
            KWHzl(listOLrzqt);
            if (listOLrzqt != null && !listOLrzqt.isEmpty()) {
                AEQbTJ = listOLrzqt.get(0);
                AEQbTJ.AEQbTJ();
                copydefault = 3;
                AEQbTJ(listOLrzqt);
            } else {
                copydefault = 4;
                C60117zvy.AEQbTJ("No SLF4J providers were found.");
                C60117zvy.AEQbTJ("Defaulting to no-operation (NOP) logger implementation");
                C60117zvy.AEQbTJ("See https://www.slf4j.org/codes.html#noProviders for further details.");
                OLrzqt(EZpvd());
            }
            gEmmrt();
        } catch (java.lang.Exception e) {
            OLrzqt(e);
            throw new java.lang.IllegalStateException("Unexpected initialization failure", e);
        }
    }

    public static InterfaceC60085zvH EZpvd(java.lang.ClassLoader classLoader) {
        java.lang.String property = java.lang.System.getProperty("slf4j.provider");
        if (property != null && !property.isEmpty()) {
            try {
                C60117zvy.AEQbTJ(java.lang.String.format("Attempting to load provider \"%s\" specified via \"%s\" system property", property, "slf4j.provider"));
                return (InterfaceC60085zvH) classLoader.loadClass(property).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            } catch (java.lang.ClassCastException e) {
                C60117zvy.AEQbTJ(java.lang.String.format("Specified SLF4JServiceProvider (%s) does not implement SLF4JServiceProvider interface", property), e);
                return null;
            } catch (java.lang.ClassNotFoundException e2) {
                e = e2;
                C60117zvy.AEQbTJ(java.lang.String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (java.lang.IllegalAccessException e3) {
                e = e3;
                C60117zvy.AEQbTJ(java.lang.String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (java.lang.InstantiationException e4) {
                e = e4;
                C60117zvy.AEQbTJ(java.lang.String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (java.lang.NoSuchMethodException e5) {
                e = e5;
                C60117zvy.AEQbTJ(java.lang.String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (InvocationTargetException e6) {
                e = e6;
                C60117zvy.AEQbTJ(java.lang.String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            }
        }
        return null;
    }

    public static void OLrzqt(java.util.Set<java.net.URL> set) {
        if (set.isEmpty()) {
            return;
        }
        C60117zvy.AEQbTJ("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        java.util.Iterator<java.net.URL> it = set.iterator();
        while (it.hasNext()) {
            C60117zvy.AEQbTJ("Ignoring binding found at [" + it.next() + "]");
        }
        C60117zvy.AEQbTJ("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static java.util.Set<java.net.URL> EZpvd() {
        java.util.Enumeration<java.net.URL> resources;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            java.lang.ClassLoader classLoader = C60099zvg.class.getClassLoader();
            if (classLoader == null) {
                resources = java.lang.ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class");
            } else {
                resources = classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
            }
            while (resources.hasMoreElements()) {
                linkedHashSet.add(resources.nextElement());
            }
        } catch (java.io.IOException e) {
            C60117zvy.AEQbTJ("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    public static void gEmmrt() {
        copydefault();
        AhwBna();
        valueOf.EZpvd().EZpvd();
    }

    public static void copydefault() {
        C60118zvz c60118zvz = valueOf;
        synchronized (c60118zvz) {
            c60118zvz.EZpvd().KWHzl();
            for (C60115zvw c60115zvw : c60118zvz.EZpvd().AEQbTJ()) {
                c60115zvw.copydefault(OLrzqt(c60115zvw.getName()));
            }
        }
    }

    public static void OLrzqt(java.lang.Throwable th) {
        copydefault = 2;
        C60117zvy.AEQbTJ("Failed to instantiate SLF4J LoggerFactory", th);
    }

    public static void AhwBna() {
        LinkedBlockingQueue<C60107zvo> linkedBlockingQueueOLrzqt = valueOf.EZpvd().OLrzqt();
        int size = linkedBlockingQueueOLrzqt.size();
        java.util.ArrayList<C60107zvo> arrayList = new java.util.ArrayList(128);
        int i = 0;
        while (linkedBlockingQueueOLrzqt.drainTo(arrayList, 128) != 0) {
            for (C60107zvo c60107zvo : arrayList) {
                AEQbTJ(c60107zvo);
                if (i == 0) {
                    copydefault(c60107zvo, size);
                }
                i++;
            }
            arrayList.clear();
        }
    }

    public static void copydefault(C60107zvo c60107zvo, int i) {
        if (c60107zvo.AhwBna().EZpvd()) {
            AEQbTJ(i);
        } else {
            if (c60107zvo.AhwBna().copydefault()) {
                return;
            }
            AEQbTJ();
        }
    }

    public static void AEQbTJ(C60107zvo c60107zvo) {
        if (c60107zvo == null) {
            return;
        }
        C60115zvw c60115zvwAhwBna = c60107zvo.AhwBna();
        java.lang.String name = c60115zvwAhwBna.getName();
        if (c60115zvwAhwBna.OLrzqt()) {
            throw new java.lang.IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (c60115zvwAhwBna.copydefault()) {
            return;
        }
        if (c60115zvwAhwBna.EZpvd()) {
            if (c60115zvwAhwBna.AEQbTJ(c60107zvo.EZpvd())) {
                c60115zvwAhwBna.OLrzqt(c60107zvo);
                return;
            }
            return;
        }
        C60117zvy.AEQbTJ(name);
    }

    public static void AEQbTJ() {
        C60117zvy.AEQbTJ("The following set of substitute loggers may have been accessed");
        C60117zvy.AEQbTJ("during the initialization phase. Logging calls during this");
        C60117zvy.AEQbTJ("phase were not honored. However, subsequent logging calls to these");
        C60117zvy.AEQbTJ("loggers will work as normally expected.");
        C60117zvy.AEQbTJ("See also https://www.slf4j.org/codes.html#substituteLogger");
    }

    public static void AEQbTJ(int i) {
        C60117zvy.AEQbTJ("A number (" + i + ") of logging calls during the initialization phase have been intercepted and are");
        C60117zvy.AEQbTJ("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        C60117zvy.AEQbTJ("See also https://www.slf4j.org/codes.html#replay");
    }

    public static final void AkhnZx() {
        try {
            java.lang.String strOLrzqt = AEQbTJ.OLrzqt();
            boolean z = false;
            for (java.lang.String str : OLrzqt) {
                if (strOLrzqt.startsWith(str)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            C60117zvy.AEQbTJ("The requested version " + strOLrzqt + " by your slf4j provider is not compatible with " + java.util.Arrays.asList(OLrzqt).toString());
            C60117zvy.AEQbTJ("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (java.lang.NoSuchFieldError unused) {
        } catch (java.lang.Throwable th) {
            C60117zvy.AEQbTJ("Unexpected problem occurred during version sanity check", th);
        }
    }

    public static boolean OLrzqt(java.util.List<InterfaceC60085zvH> list) {
        return list.size() > 1;
    }

    public static void KWHzl(java.util.List<InterfaceC60085zvH> list) {
        if (OLrzqt(list)) {
            C60117zvy.AEQbTJ("Class path contains multiple SLF4J providers.");
            java.util.Iterator<InterfaceC60085zvH> it = list.iterator();
            while (it.hasNext()) {
                C60117zvy.AEQbTJ("Found provider [" + it.next() + "]");
            }
            C60117zvy.AEQbTJ("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static void AEQbTJ(java.util.List<InterfaceC60085zvH> list) {
        if (list.isEmpty() || !OLrzqt(list)) {
            return;
        }
        C60117zvy.AEQbTJ("Actual provider is of type [" + list.get(0) + "]");
    }

    public static InterfaceC60100zvh OLrzqt(java.lang.String str) {
        return AYXKKw().copydefault(str);
    }

    public static InterfaceC60100zvh AEQbTJ(java.lang.Class<?> cls) {
        java.lang.Class<?> clsOLrzqt;
        InterfaceC60100zvh interfaceC60100zvhOLrzqt = OLrzqt(cls.getName());
        if (EZpvd && (clsOLrzqt = C60117zvy.OLrzqt()) != null && KWHzl(cls, clsOLrzqt)) {
            C60117zvy.AEQbTJ(java.lang.String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", interfaceC60100zvhOLrzqt.getName(), clsOLrzqt.getName()));
            C60117zvy.AEQbTJ("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return interfaceC60100zvhOLrzqt;
    }

    public static boolean KWHzl(java.lang.Class<?> cls, java.lang.Class<?> cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    public static InterfaceC60098zvf AYXKKw() {
        return djBIcL().KWHzl();
    }

    public static InterfaceC60085zvH djBIcL() {
        if (copydefault == 0) {
            synchronized (C60099zvg.class) {
                if (copydefault == 0) {
                    copydefault = 1;
                    valueOf();
                }
            }
        }
        int i = copydefault;
        if (i == 1) {
            return valueOf;
        }
        if (i == 2) {
            throw new java.lang.IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return AEQbTJ;
        }
        if (i == 4) {
            return KWHzl;
        }
        throw new java.lang.IllegalStateException("Unreachable code");
    }
}
