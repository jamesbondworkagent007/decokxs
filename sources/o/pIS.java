package o;

import o.C38002pIp;

/* JADX INFO: loaded from: classes9.dex */
public final class pIS extends pIP {
    public static java.lang.String AYXKKw = null;
    public static volatile boolean EZpvd = false;
    public static java.lang.String KWHzl = null;
    public static boolean OLrzqt = false;
    public static android.os.Bundle copydefault;
    public static java.lang.Boolean valueOf = java.lang.Boolean.FALSE;

    private pIS() {
        super(pIO.AEQbTJ());
    }

    public static android.app.Instrumentation EZpvd() {
        return new pIS();
    }

    @Override // o.pIP, android.app.Instrumentation
    public android.app.Application newApplication(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Context context) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException {
        C38002pIp.Companion.iwGUEr().EZpvd("Dionysus", "======> newApplication  ===> ClassName:" + str);
        return super.newApplication(classLoader, str, context);
    }

    @Override // o.pIP, android.app.Instrumentation
    public void callApplicationOnCreate(android.app.Application application) {
        C38002pIp.Application application2 = C38002pIp.Companion;
        application2.iwGUEr().EZpvd("Dionysus", "======> callApplicationOnCreate  ===> ClassName:" + application.getClass().getName());
        valueOf = java.lang.Boolean.valueOf(application2.KWHzl("InstrumentationDelegate callApplicationOnCreate"));
        application2.iwGUEr().EZpvd("Dionysus", "======> InstrumentationDelegate  ===> showErrorIgnoreInit:" + valueOf);
        super.callApplicationOnCreate(application);
    }

    @Override // o.pIP, android.app.Instrumentation
    public android.app.Activity newActivity(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.ClassNotFoundException {
        C38002pIp.Application application = C38002pIp.Companion;
        boolean zAkhnZx = application.AkhnZx();
        boolean zEjfBZ = application.ejfBZ();
        application.iwGUEr().AEQbTJ("Dionysus", "======> InstrumentationDelegate newActivity info ===> isCrash:" + zAkhnZx);
        if (intent != null) {
            application.iwGUEr().AEQbTJ("Dionysus", "======> InstrumentationDelegate newActivity info ===> currentClassName:" + str + " LastClassName:" + KWHzl + " intent:" + intent.getComponent() + ",getData:" + intent.getData() + ",getCategories:" + intent.getCategories() + ",getAction:" + intent.getAction() + ",getFlags:" + intent.getFlags() + ",getExtras:" + intent.getExtras());
        }
        if ((zEjfBZ && zAkhnZx) || valueOf.booleanValue()) {
            EZpvd = true;
            AYXKKw = str;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("======> InstrumentationDelegate newActivity changeActivity [");
            sb.append(str);
            sb.append("]  to [");
            pIC pic = pIC.EZpvd;
            sb.append(pic.KWHzl().AYXKKw().getName());
            sb.append("] ");
            pIF.OLrzqt(sb.toString(), true, "", "");
            return (android.app.Activity) classLoader.loadClass(pic.KWHzl().AYXKKw().getName()).newInstance();
        }
        EZpvd = false;
        KWHzl = str;
        return super.newActivity(classLoader, str, intent);
    }

    @Override // o.pIP, android.app.Instrumentation
    public void callActivityOnCreate(android.app.Activity activity, android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        if (EZpvd) {
            copydefault = bundle;
            super.callActivityOnCreate(activity, null, persistableBundle);
            return;
        }
        if (AYXKKw != null) {
            java.lang.String className = activity.getComponentName().getClassName();
            if (className.equals(AYXKKw)) {
                pIF.OLrzqt("======> InstrumentationDelegate callActivityOnCreate currentClassName: " + className, true, "", "");
                AYXKKw = null;
                OLrzqt = bundle != null;
                super.callActivityOnCreate(activity, copydefault, persistableBundle);
                copydefault = null;
                return;
            }
        }
        super.callActivityOnCreate(activity, bundle, persistableBundle);
    }

    @Override // o.pIP, android.app.Instrumentation
    public void callActivityOnCreate(android.app.Activity activity, android.os.Bundle bundle) {
        if (EZpvd) {
            copydefault = bundle;
            super.callActivityOnCreate(activity, null);
            return;
        }
        if (AYXKKw != null) {
            java.lang.String className = activity.getComponentName().getClassName();
            if (className.equals(AYXKKw)) {
                pIF.OLrzqt("======> InstrumentationDelegate callActivityOnCreate currentClassName: " + className, true, "", "");
                AYXKKw = null;
                OLrzqt = bundle != null;
                super.callActivityOnCreate(activity, copydefault);
                copydefault = null;
                return;
            }
        }
        super.callActivityOnCreate(activity, bundle);
    }

    @Override // o.pIP, android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(android.app.Activity activity, android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        if (EZpvd) {
            return;
        }
        super.callActivityOnRestoreInstanceState(activity, bundle, persistableBundle);
    }

    @Override // o.pIP, android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        if (EZpvd) {
            return;
        }
        super.callActivityOnRestoreInstanceState(activity, bundle);
    }

    @Override // o.pIP, android.app.Instrumentation
    public void callActivityOnPostCreate(android.app.Activity activity, android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        if (EZpvd) {
            super.callActivityOnPostCreate(activity, null, persistableBundle);
        } else {
            super.callActivityOnPostCreate(activity, bundle, persistableBundle);
        }
    }

    @Override // o.pIP, android.app.Instrumentation
    public void callActivityOnPostCreate(android.app.Activity activity, android.os.Bundle bundle) {
        if (EZpvd) {
            super.callActivityOnPostCreate(activity, null);
        } else {
            super.callActivityOnPostCreate(activity, bundle);
        }
    }
}
