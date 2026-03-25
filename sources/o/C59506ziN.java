package o;

import com.fasterxml.jackson.core.JsonPointer;
import java.lang.reflect.InvocationTargetException;
import java.security.AccessController;
import org.apache.commons.logging.LogConfigurationException;
import org.apache.commons.logging.LogFactory;

/* JADX INFO: renamed from: o.ziN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59506ziN extends LogFactory {
    public static /* synthetic */ java.lang.Class AYXKKw = null;
    public static final int AhwBna = 32;
    public static final java.lang.String[] DbNXlk = {"org.apache.commons.logging.impl.Log4JLogger", "org.apache.commons.logging.impl.Jdk14Logger", "org.apache.commons.logging.impl.Jdk13LumberjackLogger", "org.apache.commons.logging.impl.SimpleLog"};
    public static /* synthetic */ java.lang.Class djBIcL;
    public static /* synthetic */ java.lang.Class gEmmrt;
    public static /* synthetic */ java.lang.Class isConnected;
    public boolean AkhnZx;
    public java.lang.String ejfBZ;
    public java.lang.String fIwbmz;
    public boolean fetchVPNInfo;
    public java.lang.Class[] getFieldNames;
    public java.lang.reflect.Method getNewProxyInstance;
    public java.lang.Class[] iwGUEr;
    public boolean values;
    public boolean hDKMBd = true;
    public java.util.Hashtable fARcdN = new java.util.Hashtable();
    public java.util.Hashtable fJNWhG = new java.util.Hashtable();
    public java.lang.reflect.Constructor AuCTel = null;

    public C59506ziN() {
        java.lang.Class[] clsArr = new java.lang.Class[1];
        java.lang.Class clsGEmmrt = AYXKKw;
        if (clsGEmmrt == null) {
            clsGEmmrt = gEmmrt("java.lang.String");
            AYXKKw = clsGEmmrt;
        }
        clsArr[0] = clsGEmmrt;
        this.iwGUEr = clsArr;
        this.getNewProxyInstance = null;
        java.lang.Class[] clsArr2 = new java.lang.Class[1];
        java.lang.Class clsGEmmrt2 = gEmmrt;
        if (clsGEmmrt2 == null) {
            clsGEmmrt2 = gEmmrt("org.apache.commons.logging.LogFactory");
            gEmmrt = clsGEmmrt2;
        }
        clsArr2[0] = clsGEmmrt2;
        this.getFieldNames = clsArr2;
        fetchVPNInfo();
        if (djBIcL()) {
            DbNXlk("Instance created.");
        }
    }

    public static /* synthetic */ java.lang.Class gEmmrt(java.lang.String str) {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.NoClassDefFoundError(e.getMessage());
        }
    }

    public java.lang.Object AhwBna(java.lang.String str) {
        return this.fARcdN.get(str);
    }

    @Override // org.apache.commons.logging.LogFactory
    public InterfaceC59499ziG OLrzqt(java.lang.Class cls) throws LogConfigurationException {
        return djBIcL(cls.getName());
    }

    @Override // org.apache.commons.logging.LogFactory
    public InterfaceC59499ziG djBIcL(java.lang.String str) throws LogConfigurationException {
        InterfaceC59499ziG interfaceC59499ziG = (InterfaceC59499ziG) this.fJNWhG.get(str);
        if (interfaceC59499ziG != null) {
            return interfaceC59499ziG;
        }
        InterfaceC59499ziG interfaceC59499ziGAkhnZx = AkhnZx(str);
        this.fJNWhG.put(str, interfaceC59499ziGAkhnZx);
        return interfaceC59499ziGAkhnZx;
    }

    @Override // org.apache.commons.logging.LogFactory
    public void AEQbTJ(java.lang.String str, java.lang.Object obj) {
        if (this.AuCTel != null) {
            DbNXlk("setAttribute: call too late; configuration already performed.");
        }
        if (obj == null) {
            this.fARcdN.remove(str);
        } else {
            this.fARcdN.put(str, obj);
        }
        if (str.equals("use_tccl")) {
            this.hDKMBd = obj != null && java.lang.Boolean.valueOf(obj.toString()).booleanValue();
        }
    }

    public static boolean djBIcL() {
        return LogFactory.KWHzl();
    }

    public static java.lang.ClassLoader valueOf(java.lang.Class cls) {
        return LogFactory.EZpvd(cls);
    }

    public final void fetchVPNInfo() {
        java.lang.String strOLrzqt;
        java.lang.ClassLoader classLoaderValueOf = valueOf(getClass());
        if (classLoaderValueOf == null) {
            strOLrzqt = "BOOTLOADER";
        } else {
            try {
                strOLrzqt = LogFactory.OLrzqt(classLoaderValueOf);
            } catch (java.lang.SecurityException unused) {
                strOLrzqt = "UNKNOWN";
            }
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("[LogFactoryImpl@");
        stringBuffer.append(java.lang.System.identityHashCode(this));
        stringBuffer.append(" from ");
        stringBuffer.append(strOLrzqt);
        stringBuffer.append("] ");
        this.fIwbmz = stringBuffer.toString();
    }

    public void DbNXlk(java.lang.String str) {
        if (djBIcL()) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(this.fIwbmz);
            stringBuffer.append(str);
            LogFactory.OLrzqt(stringBuffer.toString());
        }
    }

    public InterfaceC59499ziG AkhnZx(java.lang.String str) throws LogConfigurationException {
        InterfaceC59499ziG interfaceC59499ziGValueOf;
        try {
            java.lang.reflect.Constructor constructor = this.AuCTel;
            if (constructor == null) {
                interfaceC59499ziGValueOf = valueOf(str);
            } else {
                interfaceC59499ziGValueOf = (InterfaceC59499ziG) constructor.newInstance(str);
            }
            java.lang.reflect.Method method = this.getNewProxyInstance;
            if (method != null) {
                method.invoke(interfaceC59499ziGValueOf, this);
            }
            return interfaceC59499ziGValueOf;
        } catch (InvocationTargetException e) {
            e = e;
            java.lang.Throwable targetException = e.getTargetException();
            if (targetException != null) {
                e = targetException;
            }
            throw new LogConfigurationException(e);
        } catch (LogConfigurationException e2) {
            throw e2;
        } catch (java.lang.Throwable th) {
            LogFactory.KWHzl(th);
            throw new LogConfigurationException(th);
        }
    }

    public static java.lang.ClassLoader gEmmrt() throws LogConfigurationException {
        return (java.lang.ClassLoader) AccessController.doPrivileged(new C59512ziT());
    }

    public static java.lang.String copydefault(java.lang.String str, java.lang.String str2) throws java.lang.SecurityException {
        return (java.lang.String) AccessController.doPrivileged(new C59510ziR(str, str2));
    }

    public final java.lang.ClassLoader AEQbTJ(java.lang.ClassLoader classLoader) {
        try {
            return (java.lang.ClassLoader) AccessController.doPrivileged(new C59509ziQ(this, classLoader));
        } catch (java.lang.SecurityException unused) {
            DbNXlk("[SECURITY] Unable to obtain parent classloader");
            return null;
        }
    }

    public final java.lang.String AYXKKw(java.lang.String str) {
        java.lang.String strCopydefault;
        if (djBIcL()) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("[ENV] Trying to get configuration for item ");
            stringBuffer.append(str);
            DbNXlk(stringBuffer.toString());
        }
        java.lang.Object objAhwBna = AhwBna(str);
        if (objAhwBna != null) {
            if (djBIcL()) {
                java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
                stringBuffer2.append("[ENV] Found LogFactory attribute [");
                stringBuffer2.append(objAhwBna);
                stringBuffer2.append("] for ");
                stringBuffer2.append(str);
                DbNXlk(stringBuffer2.toString());
            }
            return objAhwBna.toString();
        }
        if (djBIcL()) {
            java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer();
            stringBuffer3.append("[ENV] No LogFactory attribute found for ");
            stringBuffer3.append(str);
            DbNXlk(stringBuffer3.toString());
        }
        try {
            strCopydefault = copydefault(str, (java.lang.String) null);
        } catch (java.lang.SecurityException unused) {
            if (djBIcL()) {
                java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer();
                stringBuffer4.append("[ENV] Security prevented reading system property ");
                stringBuffer4.append(str);
                DbNXlk(stringBuffer4.toString());
            }
        }
        if (strCopydefault != null) {
            if (djBIcL()) {
                java.lang.StringBuffer stringBuffer5 = new java.lang.StringBuffer();
                stringBuffer5.append("[ENV] Found system property [");
                stringBuffer5.append(strCopydefault);
                stringBuffer5.append("] for ");
                stringBuffer5.append(str);
                DbNXlk(stringBuffer5.toString());
            }
            return strCopydefault;
        }
        if (djBIcL()) {
            java.lang.StringBuffer stringBuffer6 = new java.lang.StringBuffer();
            stringBuffer6.append("[ENV] No system property found for property ");
            stringBuffer6.append(str);
            DbNXlk(stringBuffer6.toString());
        }
        if (djBIcL()) {
            java.lang.StringBuffer stringBuffer7 = new java.lang.StringBuffer();
            stringBuffer7.append("[ENV] No configuration defined for item ");
            stringBuffer7.append(str);
            DbNXlk(stringBuffer7.toString());
        }
        return null;
    }

    public final boolean OLrzqt(java.lang.String str, boolean z) {
        java.lang.String strAYXKKw = AYXKKw(str);
        return strAYXKKw == null ? z : java.lang.Boolean.valueOf(strAYXKKw).booleanValue();
    }

    public final void DbNXlk() {
        this.fetchVPNInfo = OLrzqt("org.apache.commons.logging.Log.allowFlawedContext", true);
        this.AkhnZx = OLrzqt("org.apache.commons.logging.Log.allowFlawedDiscovery", true);
        this.values = OLrzqt("org.apache.commons.logging.Log.allowFlawedHierarchy", true);
    }

    public final InterfaceC59499ziG valueOf(java.lang.String str) throws LogConfigurationException {
        if (djBIcL()) {
            DbNXlk("Discovering a Log implementation...");
        }
        DbNXlk();
        java.lang.String strAhwBna = AhwBna();
        if (strAhwBna != null) {
            if (djBIcL()) {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                stringBuffer.append("Attempting to load user-specified log class '");
                stringBuffer.append(strAhwBna);
                stringBuffer.append("'...");
                DbNXlk(stringBuffer.toString());
            }
            InterfaceC59499ziG interfaceC59499ziGCopydefault = copydefault(strAhwBna, str, true);
            if (interfaceC59499ziGCopydefault != null) {
                return interfaceC59499ziGCopydefault;
            }
            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("User-specified log class '");
            stringBuffer2.append(strAhwBna);
            stringBuffer2.append("' cannot be found or is not useable.");
            AEQbTJ(stringBuffer2, strAhwBna, "org.apache.commons.logging.impl.Log4JLogger");
            AEQbTJ(stringBuffer2, strAhwBna, "org.apache.commons.logging.impl.Jdk14Logger");
            AEQbTJ(stringBuffer2, strAhwBna, "org.apache.commons.logging.impl.Jdk13LumberjackLogger");
            AEQbTJ(stringBuffer2, strAhwBna, "org.apache.commons.logging.impl.SimpleLog");
            throw new LogConfigurationException(stringBuffer2.toString());
        }
        if (djBIcL()) {
            DbNXlk("No user-specified Log implementation; performing discovery using the standard supported logging implementations...");
        }
        InterfaceC59499ziG interfaceC59499ziGCopydefault2 = null;
        int i = 0;
        while (true) {
            java.lang.String[] strArr = DbNXlk;
            if (i >= strArr.length || interfaceC59499ziGCopydefault2 != null) {
                break;
            }
            interfaceC59499ziGCopydefault2 = copydefault(strArr[i], str, true);
            i++;
        }
        if (interfaceC59499ziGCopydefault2 != null) {
            return interfaceC59499ziGCopydefault2;
        }
        throw new LogConfigurationException("No suitable Log implementation");
    }

    public final void AEQbTJ(java.lang.StringBuffer stringBuffer, java.lang.String str, java.lang.String str2) {
        if (!str.equals(str2) && str.regionMatches(true, 0, str2, 0, AhwBna + 5)) {
            stringBuffer.append(" Did you mean '");
            stringBuffer.append(str2);
            stringBuffer.append("'?");
        }
    }

    public final java.lang.String AhwBna() {
        if (djBIcL()) {
            DbNXlk("Trying to get log class from attribute 'org.apache.commons.logging.Log'");
        }
        java.lang.String strCopydefault = (java.lang.String) AhwBna("o.ziG");
        if (strCopydefault == null) {
            if (djBIcL()) {
                DbNXlk("Trying to get log class from attribute 'org.apache.commons.logging.log'");
            }
            strCopydefault = (java.lang.String) AhwBna("org.apache.commons.logging.log");
        }
        if (strCopydefault == null) {
            if (djBIcL()) {
                DbNXlk("Trying to get log class from system property 'org.apache.commons.logging.Log'");
            }
            try {
                strCopydefault = copydefault("o.ziG", (java.lang.String) null);
            } catch (java.lang.SecurityException e) {
                if (djBIcL()) {
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                    stringBuffer.append("No access allowed to system property 'org.apache.commons.logging.Log' - ");
                    stringBuffer.append(e.getMessage());
                    DbNXlk(stringBuffer.toString());
                }
            }
        }
        if (strCopydefault == null) {
            if (djBIcL()) {
                DbNXlk("Trying to get log class from system property 'org.apache.commons.logging.log'");
            }
            try {
                strCopydefault = copydefault("org.apache.commons.logging.log", (java.lang.String) null);
            } catch (java.lang.SecurityException e2) {
                if (djBIcL()) {
                    java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
                    stringBuffer2.append("No access allowed to system property 'org.apache.commons.logging.log' - ");
                    stringBuffer2.append(e2.getMessage());
                    DbNXlk(stringBuffer2.toString());
                }
            }
        }
        return strCopydefault != null ? strCopydefault.trim() : strCopydefault;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0155 A[LOOP:0: B:6:0x0034->B:43:0x0155, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b8 A[EDGE_INSN: B:72:0x01b8->B:50:0x01b8 BREAK  A[LOOP:0: B:6:0x0034->B:43:0x0155], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC59499ziG copydefault(java.lang.String str, java.lang.String str2, boolean z) throws LogConfigurationException {
        java.lang.Class<?> cls;
        InterfaceC59499ziG interfaceC59499ziG;
        java.lang.Class<?> cls2;
        java.lang.Object objNewInstance;
        java.net.URL systemResource;
        if (djBIcL()) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("Attempting to instantiate '");
            stringBuffer.append(str);
            stringBuffer.append("'");
            DbNXlk(stringBuffer.toString());
        }
        java.lang.Object[] objArr = {str2};
        java.lang.ClassLoader classLoaderValueOf = valueOf();
        java.lang.reflect.Constructor<?> constructor = null;
        java.lang.Class<?> cls3 = null;
        while (true) {
            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
            stringBuffer2.append("Trying to load '");
            stringBuffer2.append(str);
            stringBuffer2.append("' from classloader ");
            stringBuffer2.append(LogFactory.OLrzqt(classLoaderValueOf));
            DbNXlk(stringBuffer2.toString());
            try {
                try {
                    if (djBIcL()) {
                        java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer();
                        stringBuffer3.append(str.replace('.', JsonPointer.SEPARATOR));
                        stringBuffer3.append(".class");
                        java.lang.String string = stringBuffer3.toString();
                        if (classLoaderValueOf != null) {
                            systemResource = classLoaderValueOf.getResource(string);
                        } else {
                            java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer();
                            stringBuffer4.append(string);
                            stringBuffer4.append(".class");
                            systemResource = java.lang.ClassLoader.getSystemResource(stringBuffer4.toString());
                        }
                        if (systemResource == null) {
                            java.lang.StringBuffer stringBuffer5 = new java.lang.StringBuffer();
                            stringBuffer5.append("Class '");
                            stringBuffer5.append(str);
                            stringBuffer5.append("' [");
                            stringBuffer5.append(string);
                            stringBuffer5.append("] cannot be found.");
                            DbNXlk(stringBuffer5.toString());
                        } else {
                            java.lang.StringBuffer stringBuffer6 = new java.lang.StringBuffer();
                            stringBuffer6.append("Class '");
                            stringBuffer6.append(str);
                            stringBuffer6.append("' was found at '");
                            stringBuffer6.append(systemResource);
                            stringBuffer6.append("'");
                            DbNXlk(stringBuffer6.toString());
                        }
                    }
                    try {
                        cls2 = java.lang.Class.forName(str, true, classLoaderValueOf);
                    } catch (java.lang.ClassNotFoundException e) {
                        java.lang.String message = e.getMessage();
                        java.lang.StringBuffer stringBuffer7 = new java.lang.StringBuffer();
                        stringBuffer7.append("The log adapter '");
                        stringBuffer7.append(str);
                        stringBuffer7.append("' is not available via classloader ");
                        stringBuffer7.append(LogFactory.OLrzqt(classLoaderValueOf));
                        stringBuffer7.append(": ");
                        stringBuffer7.append(message.trim());
                        DbNXlk(stringBuffer7.toString());
                        try {
                            cls2 = java.lang.Class.forName(str);
                        } catch (java.lang.ClassNotFoundException e2) {
                            java.lang.String message2 = e2.getMessage();
                            java.lang.StringBuffer stringBuffer8 = new java.lang.StringBuffer();
                            stringBuffer8.append("The log adapter '");
                            stringBuffer8.append(str);
                            stringBuffer8.append("' is not available via the LogFactoryImpl class classloader: ");
                            stringBuffer8.append(message2.trim());
                            DbNXlk(stringBuffer8.toString());
                            break;
                        }
                    }
                    cls = cls2;
                    constructor = cls.getConstructor(this.iwGUEr);
                    objNewInstance = constructor.newInstance(objArr);
                } catch (java.lang.ExceptionInInitializerError e3) {
                    e = e3;
                } catch (java.lang.NoClassDefFoundError e4) {
                    e = e4;
                } catch (java.lang.Throwable th) {
                    th = th;
                }
                if (objNewInstance instanceof InterfaceC59499ziG) {
                    try {
                        interfaceC59499ziG = (InterfaceC59499ziG) objNewInstance;
                        break;
                    } catch (java.lang.ExceptionInInitializerError e5) {
                        e = e5;
                        cls3 = cls;
                        java.lang.String message3 = e.getMessage();
                        java.lang.StringBuffer stringBuffer9 = new java.lang.StringBuffer();
                        stringBuffer9.append("The log adapter '");
                        stringBuffer9.append(str);
                        stringBuffer9.append("' is unable to initialize itself when loaded via classloader ");
                        stringBuffer9.append(LogFactory.OLrzqt(classLoaderValueOf));
                        stringBuffer9.append(": ");
                        stringBuffer9.append(message3.trim());
                        DbNXlk(stringBuffer9.toString());
                        interfaceC59499ziG = null;
                        cls = cls3;
                    } catch (java.lang.NoClassDefFoundError e6) {
                        e = e6;
                        cls3 = cls;
                        java.lang.String message4 = e.getMessage();
                        java.lang.StringBuffer stringBuffer10 = new java.lang.StringBuffer();
                        stringBuffer10.append("The log adapter '");
                        stringBuffer10.append(str);
                        stringBuffer10.append("' is missing dependencies when loaded via classloader ");
                        stringBuffer10.append(LogFactory.OLrzqt(classLoaderValueOf));
                        stringBuffer10.append(": ");
                        stringBuffer10.append(message4.trim());
                        DbNXlk(stringBuffer10.toString());
                        interfaceC59499ziG = null;
                        cls = cls3;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        cls3 = cls;
                        LogFactory.KWHzl(th);
                        KWHzl(str, classLoaderValueOf, th);
                        if (classLoaderValueOf != null) {
                        }
                    }
                } else {
                    copydefault(classLoaderValueOf, cls);
                    if (classLoaderValueOf != null) {
                        break;
                    }
                    classLoaderValueOf = AEQbTJ(classLoaderValueOf);
                }
            } catch (LogConfigurationException e7) {
                throw e7;
            }
        }
        interfaceC59499ziG = null;
        cls = cls3;
        if (cls != null && z) {
            this.ejfBZ = str;
            this.AuCTel = constructor;
            try {
                this.getNewProxyInstance = cls.getMethod("setLogFactory", this.getFieldNames);
                java.lang.StringBuffer stringBuffer11 = new java.lang.StringBuffer();
                stringBuffer11.append("Found method setLogFactory(LogFactory) in '");
                stringBuffer11.append(str);
                stringBuffer11.append("'");
                DbNXlk(stringBuffer11.toString());
            } catch (java.lang.Throwable th3) {
                LogFactory.KWHzl(th3);
                this.getNewProxyInstance = null;
                java.lang.StringBuffer stringBuffer12 = new java.lang.StringBuffer();
                stringBuffer12.append("[INFO] '");
                stringBuffer12.append(str);
                stringBuffer12.append("' from classloader ");
                stringBuffer12.append(LogFactory.OLrzqt(classLoaderValueOf));
                stringBuffer12.append(" does not declare optional method ");
                stringBuffer12.append("setLogFactory(LogFactory)");
                DbNXlk(stringBuffer12.toString());
            }
            java.lang.StringBuffer stringBuffer13 = new java.lang.StringBuffer();
            stringBuffer13.append("Log adapter '");
            stringBuffer13.append(str);
            stringBuffer13.append("' from classloader ");
            stringBuffer13.append(LogFactory.OLrzqt(cls.getClassLoader()));
            stringBuffer13.append(" has been selected for use.");
            DbNXlk(stringBuffer13.toString());
        }
        return interfaceC59499ziG;
    }

    public final java.lang.ClassLoader valueOf() throws LogConfigurationException {
        java.lang.Class clsGEmmrt = isConnected;
        if (clsGEmmrt == null) {
            clsGEmmrt = gEmmrt("o.ziN");
            isConnected = clsGEmmrt;
        }
        java.lang.ClassLoader classLoaderValueOf = valueOf(clsGEmmrt);
        if (!this.hDKMBd) {
            return classLoaderValueOf;
        }
        java.lang.ClassLoader classLoaderGEmmrt = gEmmrt();
        java.lang.ClassLoader classLoaderKWHzl = KWHzl(classLoaderGEmmrt, classLoaderValueOf);
        if (classLoaderKWHzl == null) {
            if (this.fetchVPNInfo) {
                if (djBIcL()) {
                    DbNXlk("[WARNING] the context classloader is not part of a parent-child relationship with the classloader that loaded LogFactoryImpl.");
                }
                return classLoaderGEmmrt;
            }
            throw new LogConfigurationException("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
        }
        if (classLoaderKWHzl != classLoaderGEmmrt) {
            if (this.fetchVPNInfo) {
                if (djBIcL()) {
                    DbNXlk("Warning: the context classloader is an ancestor of the classloader that loaded LogFactoryImpl; it should be the same or a descendant. The application using commons-logging should ensure the context classloader is used correctly.");
                }
            } else {
                throw new LogConfigurationException("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
            }
        }
        return classLoaderKWHzl;
    }

    public final java.lang.ClassLoader KWHzl(java.lang.ClassLoader classLoader, java.lang.ClassLoader classLoader2) {
        if (classLoader == null) {
            return classLoader2;
        }
        if (classLoader2 == null) {
            return classLoader;
        }
        java.lang.ClassLoader classLoaderAEQbTJ = classLoader;
        while (classLoaderAEQbTJ != null) {
            if (classLoaderAEQbTJ == classLoader2) {
                return classLoader;
            }
            classLoaderAEQbTJ = AEQbTJ(classLoaderAEQbTJ);
        }
        java.lang.ClassLoader classLoaderAEQbTJ2 = classLoader2;
        while (classLoaderAEQbTJ2 != null) {
            if (classLoaderAEQbTJ2 == classLoader) {
                return classLoader2;
            }
            classLoaderAEQbTJ2 = AEQbTJ(classLoaderAEQbTJ2);
        }
        return null;
    }

    public final void KWHzl(java.lang.String str, java.lang.ClassLoader classLoader, java.lang.Throwable th) {
        java.lang.Throwable targetException;
        java.lang.Throwable exception;
        if (djBIcL()) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("Could not instantiate Log '");
            stringBuffer.append(str);
            stringBuffer.append("' -- ");
            stringBuffer.append(th.getClass().getName());
            stringBuffer.append(": ");
            stringBuffer.append(th.getLocalizedMessage());
            DbNXlk(stringBuffer.toString());
            if ((th instanceof InvocationTargetException) && (targetException = ((InvocationTargetException) th).getTargetException()) != null) {
                java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
                stringBuffer2.append("... InvocationTargetException: ");
                stringBuffer2.append(targetException.getClass().getName());
                stringBuffer2.append(": ");
                stringBuffer2.append(targetException.getLocalizedMessage());
                DbNXlk(stringBuffer2.toString());
                if ((targetException instanceof java.lang.ExceptionInInitializerError) && (exception = ((java.lang.ExceptionInInitializerError) targetException).getException()) != null) {
                    java.io.StringWriter stringWriter = new java.io.StringWriter();
                    exception.printStackTrace(new java.io.PrintWriter((java.io.Writer) stringWriter, true));
                    java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer();
                    stringBuffer3.append("... ExceptionInInitializerError: ");
                    stringBuffer3.append(stringWriter.toString());
                    DbNXlk(stringBuffer3.toString());
                }
            }
        }
        if (!this.AkhnZx) {
            throw new LogConfigurationException(th);
        }
    }

    public final void copydefault(java.lang.ClassLoader classLoader, java.lang.Class cls) throws LogConfigurationException {
        java.lang.Class clsGEmmrt = djBIcL;
        if (clsGEmmrt == null) {
            clsGEmmrt = gEmmrt("o.ziG");
            djBIcL = clsGEmmrt;
        }
        java.lang.String name = clsGEmmrt.getName();
        for (java.lang.Class<?> cls2 : cls.getInterfaces()) {
            if (name.equals(cls2.getName())) {
                if (djBIcL()) {
                    try {
                        java.lang.Class clsGEmmrt2 = djBIcL;
                        if (clsGEmmrt2 == null) {
                            clsGEmmrt2 = gEmmrt("o.ziG");
                            djBIcL = clsGEmmrt2;
                        }
                        java.lang.ClassLoader classLoaderValueOf = valueOf(clsGEmmrt2);
                        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                        stringBuffer.append("Class '");
                        stringBuffer.append(cls.getName());
                        stringBuffer.append("' was found in classloader ");
                        stringBuffer.append(LogFactory.OLrzqt(classLoader));
                        stringBuffer.append(". It is bound to a Log interface which is not");
                        stringBuffer.append(" the one loaded from classloader ");
                        stringBuffer.append(LogFactory.OLrzqt(classLoaderValueOf));
                        DbNXlk(stringBuffer.toString());
                    } catch (java.lang.Throwable th) {
                        LogFactory.KWHzl(th);
                        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
                        stringBuffer2.append("Error while trying to output diagnostics about bad class '");
                        stringBuffer2.append(cls);
                        stringBuffer2.append("'");
                        DbNXlk(stringBuffer2.toString());
                    }
                }
                if (!this.values) {
                    java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer();
                    stringBuffer3.append("Terminating logging for this context ");
                    stringBuffer3.append("due to bad log hierarchy. ");
                    stringBuffer3.append("You have more than one version of '");
                    java.lang.Class clsGEmmrt3 = djBIcL;
                    if (clsGEmmrt3 == null) {
                        clsGEmmrt3 = gEmmrt("o.ziG");
                        djBIcL = clsGEmmrt3;
                    }
                    stringBuffer3.append(clsGEmmrt3.getName());
                    stringBuffer3.append("' visible.");
                    if (djBIcL()) {
                        DbNXlk(stringBuffer3.toString());
                    }
                    throw new LogConfigurationException(stringBuffer3.toString());
                }
                if (djBIcL()) {
                    java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer();
                    stringBuffer4.append("Warning: bad log hierarchy. ");
                    stringBuffer4.append("You have more than one version of '");
                    java.lang.Class clsGEmmrt4 = djBIcL;
                    if (clsGEmmrt4 == null) {
                        clsGEmmrt4 = gEmmrt("o.ziG");
                        djBIcL = clsGEmmrt4;
                    }
                    stringBuffer4.append(clsGEmmrt4.getName());
                    stringBuffer4.append("' visible.");
                    DbNXlk(stringBuffer4.toString());
                    return;
                }
                return;
            }
        }
        if (!this.AkhnZx) {
            java.lang.StringBuffer stringBuffer5 = new java.lang.StringBuffer();
            stringBuffer5.append("Terminating logging for this context. ");
            stringBuffer5.append("Log class '");
            stringBuffer5.append(cls.getName());
            stringBuffer5.append("' does not implement the Log interface.");
            if (djBIcL()) {
                DbNXlk(stringBuffer5.toString());
            }
            throw new LogConfigurationException(stringBuffer5.toString());
        }
        if (djBIcL()) {
            java.lang.StringBuffer stringBuffer6 = new java.lang.StringBuffer();
            stringBuffer6.append("[WARNING] Log class '");
            stringBuffer6.append(cls.getName());
            stringBuffer6.append("' does not implement the Log interface.");
            DbNXlk(stringBuffer6.toString());
        }
    }
}
