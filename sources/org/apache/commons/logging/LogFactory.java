package org.apache.commons.logging;

import com.google.android.exoplayer2.C;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.security.AccessController;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C59502ziJ;
import o.C59503ziK;
import o.C59504ziL;
import o.C59505ziM;
import o.C59507ziO;
import o.C59508ziP;
import o.InterfaceC59499ziG;

/* JADX INFO: loaded from: classes13.dex */
public abstract class LogFactory {
    public static /* synthetic */ Class AEQbTJ;
    public static Hashtable EZpvd;
    public static volatile LogFactory KWHzl;
    public static PrintStream OLrzqt;
    public static final String copydefault;
    public static final ClassLoader valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean KWHzl() {
        return OLrzqt != null;
    }

    public abstract void AEQbTJ(String str, Object obj);

    public abstract InterfaceC59499ziG OLrzqt(Class cls) throws LogConfigurationException;

    public abstract InterfaceC59499ziG djBIcL(String str) throws LogConfigurationException;

    public static final Hashtable copydefault() {
        String strOLrzqt;
        Hashtable hashtable = null;
        try {
            strOLrzqt = OLrzqt("org.apache.commons.logging.LogFactory.HashtableImpl", (String) null);
        } catch (SecurityException unused) {
            strOLrzqt = null;
        }
        if (strOLrzqt == null) {
            strOLrzqt = "org.apache.commons.logging.impl.WeakHashtable";
        }
        try {
            hashtable = (Hashtable) Class.forName(strOLrzqt).newInstance();
        } catch (Throwable th) {
            KWHzl(th);
            if (!"org.apache.commons.logging.impl.WeakHashtable".equals(strOLrzqt)) {
                if (KWHzl()) {
                    AYXKKw("[ERROR] LogFactory: Load of custom hashtable failed");
                } else {
                    System.err.println("[ERROR] LogFactory: Load of custom hashtable failed");
                }
            }
        }
        return hashtable == null ? new Hashtable() : hashtable;
    }

    public static String AEQbTJ(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public static void KWHzl(Throwable th) {
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
    }

    public static LogFactory OLrzqt() throws LogConfigurationException {
        BufferedReader bufferedReader;
        String property;
        ClassLoader classLoaderAhwBna = AhwBna();
        if (classLoaderAhwBna == null && KWHzl()) {
            AYXKKw("Context classloader is null.");
        }
        LogFactory logFactoryCopydefault = copydefault(classLoaderAhwBna);
        if (logFactoryCopydefault != null) {
            return logFactoryCopydefault;
        }
        if (KWHzl()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[LOOKUP] LogFactory implementation requested for the first time for context classloader ");
            stringBuffer.append(OLrzqt(classLoaderAhwBna));
            AYXKKw(stringBuffer.toString());
            KWHzl("[LOOKUP] ", classLoaderAhwBna);
        }
        Properties propertiesOLrzqt = OLrzqt(classLoaderAhwBna, "commons-logging.properties");
        ClassLoader classLoader = (propertiesOLrzqt == null || (property = propertiesOLrzqt.getProperty("use_tccl")) == null || Boolean.valueOf(property).booleanValue()) ? classLoaderAhwBna : valueOf;
        if (KWHzl()) {
            AYXKKw("[LOOKUP] Looking for system property [org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
        }
        try {
            String strOLrzqt = OLrzqt("org.apache.commons.logging.LogFactory", (String) null);
            if (strOLrzqt != null) {
                if (KWHzl()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("[LOOKUP] Creating an instance of LogFactory class '");
                    stringBuffer2.append(strOLrzqt);
                    stringBuffer2.append("' as specified by system property ");
                    stringBuffer2.append("org.apache.commons.logging.LogFactory");
                    AYXKKw(stringBuffer2.toString());
                }
                logFactoryCopydefault = EZpvd(strOLrzqt, classLoader, classLoaderAhwBna);
            } else if (KWHzl()) {
                AYXKKw("[LOOKUP] No system property [org.apache.commons.logging.LogFactory] defined.");
            }
        } catch (SecurityException e) {
            if (KWHzl()) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [");
                stringBuffer3.append(AEQbTJ(e.getMessage()));
                stringBuffer3.append("]. Trying alternative implementations...");
                AYXKKw(stringBuffer3.toString());
            }
        } catch (RuntimeException e2) {
            if (KWHzl()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[LOOKUP] An exception occurred while trying to create an instance of the custom factory class: [");
                stringBuffer4.append(AEQbTJ(e2.getMessage()));
                stringBuffer4.append("] as specified by a system property.");
                AYXKKw(stringBuffer4.toString());
            }
            throw e2;
        }
        if (logFactoryCopydefault == null) {
            if (KWHzl()) {
                AYXKKw("[LOOKUP] Looking for a resource file of name [META-INF/services/org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
            }
            try {
                InputStream inputStreamCopydefault = copydefault(classLoaderAhwBna, "META-INF/services/org.apache.commons.logging.LogFactory");
                if (inputStreamCopydefault != null) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(inputStreamCopydefault, C.UTF8_NAME));
                    } catch (UnsupportedEncodingException unused) {
                        bufferedReader = new BufferedReader(new InputStreamReader(inputStreamCopydefault));
                    }
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    if (line != null && !"".equals(line)) {
                        if (KWHzl()) {
                            StringBuffer stringBuffer5 = new StringBuffer();
                            stringBuffer5.append("[LOOKUP]  Creating an instance of LogFactory class ");
                            stringBuffer5.append(line);
                            stringBuffer5.append(" as specified by file '");
                            stringBuffer5.append("META-INF/services/org.apache.commons.logging.LogFactory");
                            stringBuffer5.append("' which was present in the path of the context classloader.");
                            AYXKKw(stringBuffer5.toString());
                        }
                        logFactoryCopydefault = EZpvd(line, classLoader, classLoaderAhwBna);
                    }
                } else if (KWHzl()) {
                    AYXKKw("[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found.");
                }
            } catch (Exception e3) {
                if (KWHzl()) {
                    StringBuffer stringBuffer6 = new StringBuffer();
                    stringBuffer6.append("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [");
                    stringBuffer6.append(AEQbTJ(e3.getMessage()));
                    stringBuffer6.append("]. Trying alternative implementations...");
                    AYXKKw(stringBuffer6.toString());
                }
            }
        }
        if (logFactoryCopydefault == null) {
            if (propertiesOLrzqt != null) {
                if (KWHzl()) {
                    AYXKKw("[LOOKUP] Looking in properties file for entry with key 'org.apache.commons.logging.LogFactory' to define the LogFactory subclass to use...");
                }
                String property2 = propertiesOLrzqt.getProperty("org.apache.commons.logging.LogFactory");
                if (property2 != null) {
                    if (KWHzl()) {
                        StringBuffer stringBuffer7 = new StringBuffer();
                        stringBuffer7.append("[LOOKUP] Properties file specifies LogFactory subclass '");
                        stringBuffer7.append(property2);
                        stringBuffer7.append("'");
                        AYXKKw(stringBuffer7.toString());
                    }
                    logFactoryCopydefault = EZpvd(property2, classLoader, classLoaderAhwBna);
                } else if (KWHzl()) {
                    AYXKKw("[LOOKUP] Properties file has no entry specifying LogFactory subclass.");
                }
            } else if (KWHzl()) {
                AYXKKw("[LOOKUP] No properties file available to determine LogFactory subclass from..");
            }
        }
        if (logFactoryCopydefault == null) {
            if (KWHzl()) {
                AYXKKw("[LOOKUP] Loading the default LogFactory implementation 'org.apache.commons.logging.impl.LogFactoryImpl' via the same classloader that loaded this LogFactory class (ie not looking in the context classloader).");
            }
            logFactoryCopydefault = EZpvd("o.ziN", valueOf, classLoaderAhwBna);
        }
        if (logFactoryCopydefault != null) {
            AEQbTJ(classLoaderAhwBna, logFactoryCopydefault);
            if (propertiesOLrzqt != null) {
                Enumeration<?> enumerationPropertyNames = propertiesOLrzqt.propertyNames();
                while (enumerationPropertyNames.hasMoreElements()) {
                    String str = (String) enumerationPropertyNames.nextElement();
                    logFactoryCopydefault.AEQbTJ(str, propertiesOLrzqt.getProperty(str));
                }
            }
        }
        return logFactoryCopydefault;
    }

    public static InterfaceC59499ziG copydefault(Class cls) throws LogConfigurationException {
        return OLrzqt().OLrzqt(cls);
    }

    public static InterfaceC59499ziG KWHzl(String str) throws LogConfigurationException {
        return OLrzqt().djBIcL(str);
    }

    public static ClassLoader EZpvd(Class cls) {
        try {
            return cls.getClassLoader();
        } catch (SecurityException e) {
            if (KWHzl()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unable to get classloader for class '");
                stringBuffer.append(cls);
                stringBuffer.append("' due to security restrictions - ");
                stringBuffer.append(e.getMessage());
                AYXKKw(stringBuffer.toString());
            }
            throw e;
        }
    }

    private static ClassLoader AhwBna() throws LogConfigurationException {
        return (ClassLoader) AccessController.doPrivileged(new C59503ziK());
    }

    public static ClassLoader AEQbTJ() throws LogConfigurationException {
        try {
            return Thread.currentThread().getContextClassLoader();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static LogFactory copydefault(ClassLoader classLoader) {
        return classLoader == null ? KWHzl : (LogFactory) EZpvd.get(classLoader);
    }

    public static void AEQbTJ(ClassLoader classLoader, LogFactory logFactory) {
        if (logFactory != null) {
            if (classLoader == null) {
                KWHzl = logFactory;
            } else {
                EZpvd.put(classLoader, logFactory);
            }
        }
    }

    public static LogFactory EZpvd(String str, ClassLoader classLoader, ClassLoader classLoader2) throws LogConfigurationException {
        Object objDoPrivileged = AccessController.doPrivileged(new C59502ziJ(str, classLoader));
        if (objDoPrivileged instanceof LogConfigurationException) {
            LogConfigurationException logConfigurationException = (LogConfigurationException) objDoPrivileged;
            if (KWHzl()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("An error occurred while loading the factory class:");
                stringBuffer.append(logConfigurationException.getMessage());
                AYXKKw(stringBuffer.toString());
                throw logConfigurationException;
            }
            throw logConfigurationException;
        }
        if (KWHzl()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Created object ");
            stringBuffer2.append(OLrzqt(objDoPrivileged));
            stringBuffer2.append(" to manage classloader ");
            stringBuffer2.append(OLrzqt(classLoader2));
            AYXKKw(stringBuffer2.toString());
        }
        return (LogFactory) objDoPrivileged;
    }

    public static Object AEQbTJ(String str, ClassLoader classLoader) {
        Class<?> clsLoadClass = null;
        try {
            if (classLoader != null) {
                try {
                    try {
                        try {
                            clsLoadClass = classLoader.loadClass(str);
                            Class clsCopydefault = AEQbTJ;
                            if (clsCopydefault == null) {
                                clsCopydefault = copydefault("org.apache.commons.logging.LogFactory");
                                AEQbTJ = clsCopydefault;
                            }
                            if (clsCopydefault.isAssignableFrom(clsLoadClass)) {
                                if (KWHzl()) {
                                    StringBuffer stringBuffer = new StringBuffer();
                                    stringBuffer.append("Loaded class ");
                                    stringBuffer.append(clsLoadClass.getName());
                                    stringBuffer.append(" from classloader ");
                                    stringBuffer.append(OLrzqt(classLoader));
                                    AYXKKw(stringBuffer.toString());
                                }
                            } else if (KWHzl()) {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                stringBuffer2.append("Factory class ");
                                stringBuffer2.append(clsLoadClass.getName());
                                stringBuffer2.append(" loaded from classloader ");
                                stringBuffer2.append(OLrzqt(clsLoadClass.getClassLoader()));
                                stringBuffer2.append(" does not extend '");
                                Class clsCopydefault2 = AEQbTJ;
                                if (clsCopydefault2 == null) {
                                    clsCopydefault2 = copydefault("org.apache.commons.logging.LogFactory");
                                    AEQbTJ = clsCopydefault2;
                                }
                                stringBuffer2.append(clsCopydefault2.getName());
                                stringBuffer2.append("' as loaded by this classloader.");
                                AYXKKw(stringBuffer2.toString());
                                KWHzl("[BAD CL TREE] ", classLoader);
                            }
                            return (LogFactory) clsLoadClass.newInstance();
                        } catch (NoClassDefFoundError e) {
                            if (classLoader == valueOf) {
                                if (KWHzl()) {
                                    StringBuffer stringBuffer3 = new StringBuffer();
                                    stringBuffer3.append("Class '");
                                    stringBuffer3.append(str);
                                    stringBuffer3.append("' cannot be loaded");
                                    stringBuffer3.append(" via classloader ");
                                    stringBuffer3.append(OLrzqt(classLoader));
                                    stringBuffer3.append(" - it depends on some other class that cannot be found.");
                                    AYXKKw(stringBuffer3.toString());
                                }
                                throw e;
                            }
                        }
                    } catch (ClassCastException unused) {
                        if (classLoader == valueOf) {
                            boolean zKWHzl = KWHzl(clsLoadClass);
                            StringBuffer stringBuffer4 = new StringBuffer();
                            stringBuffer4.append("The application has specified that a custom LogFactory implementation ");
                            stringBuffer4.append("should be used but Class '");
                            stringBuffer4.append(str);
                            stringBuffer4.append("' cannot be converted to '");
                            Class clsCopydefault3 = AEQbTJ;
                            if (clsCopydefault3 == null) {
                                clsCopydefault3 = copydefault("org.apache.commons.logging.LogFactory");
                                AEQbTJ = clsCopydefault3;
                            }
                            stringBuffer4.append(clsCopydefault3.getName());
                            stringBuffer4.append("'. ");
                            if (zKWHzl) {
                                stringBuffer4.append("The conflict is caused by the presence of multiple LogFactory classes ");
                                stringBuffer4.append("in incompatible classloaders. ");
                                stringBuffer4.append("Background can be found in http://commons.apache.org/logging/tech.html. ");
                                stringBuffer4.append("If you have not explicitly specified a custom LogFactory then it is likely ");
                                stringBuffer4.append("that the container has set one without your knowledge. ");
                                stringBuffer4.append("In this case, consider using the commons-logging-adapters.jar file or ");
                                stringBuffer4.append("specifying the standard LogFactory from the command line. ");
                            } else {
                                stringBuffer4.append("Please check the custom implementation. ");
                            }
                            stringBuffer4.append("Help can be found @http://commons.apache.org/logging/troubleshooting.html.");
                            if (KWHzl()) {
                                AYXKKw(stringBuffer4.toString());
                            }
                            throw new ClassCastException(stringBuffer4.toString());
                        }
                    }
                } catch (ClassNotFoundException e2) {
                    if (classLoader == valueOf) {
                        if (KWHzl()) {
                            StringBuffer stringBuffer5 = new StringBuffer();
                            stringBuffer5.append("Unable to locate any class called '");
                            stringBuffer5.append(str);
                            stringBuffer5.append("' via classloader ");
                            stringBuffer5.append(OLrzqt(classLoader));
                            AYXKKw(stringBuffer5.toString());
                        }
                        throw e2;
                    }
                }
            }
            if (KWHzl()) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("Unable to load factory class via classloader ");
                stringBuffer6.append(OLrzqt(classLoader));
                stringBuffer6.append(" - trying the classloader associated with this LogFactory.");
                AYXKKw(stringBuffer6.toString());
            }
            return (LogFactory) Class.forName(str).newInstance();
        } catch (Exception e3) {
            if (KWHzl()) {
                AYXKKw("Unable to create LogFactory instance.");
            }
            if (clsLoadClass != null) {
                Class clsCopydefault4 = AEQbTJ;
                if (clsCopydefault4 == null) {
                    clsCopydefault4 = copydefault("org.apache.commons.logging.LogFactory");
                    AEQbTJ = clsCopydefault4;
                }
                if (!clsCopydefault4.isAssignableFrom(clsLoadClass)) {
                    return new LogConfigurationException("The chosen LogFactory implementation does not extend LogFactory. Please check your configuration.", e3);
                }
            }
            return new LogConfigurationException(e3);
        }
    }

    public static /* synthetic */ Class copydefault(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static boolean KWHzl(Class cls) {
        boolean zIsAssignableFrom = false;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    AYXKKw("[CUSTOM LOG FACTORY] was loaded by the boot classloader");
                } else {
                    KWHzl("[CUSTOM LOG FACTORY] ", classLoader);
                    zIsAssignableFrom = Class.forName("org.apache.commons.logging.LogFactory", false, classLoader).isAssignableFrom(cls);
                    if (zIsAssignableFrom) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("[CUSTOM LOG FACTORY] ");
                        stringBuffer.append(cls.getName());
                        stringBuffer.append(" implements LogFactory but was loaded by an incompatible classloader.");
                        AYXKKw(stringBuffer.toString());
                    } else {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("[CUSTOM LOG FACTORY] ");
                        stringBuffer2.append(cls.getName());
                        stringBuffer2.append(" does not implement LogFactory.");
                        AYXKKw(stringBuffer2.toString());
                    }
                }
            } catch (ClassNotFoundException unused) {
                AYXKKw("[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?");
            } catch (LinkageError e) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer3.append(e.getMessage());
                AYXKKw(stringBuffer3.toString());
            } catch (SecurityException e2) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer4.append(e2.getMessage());
                AYXKKw(stringBuffer4.toString());
            }
        }
        return zIsAssignableFrom;
    }

    public static InputStream copydefault(ClassLoader classLoader, String str) {
        return (InputStream) AccessController.doPrivileged(new C59507ziO(classLoader, str));
    }

    public static Enumeration AEQbTJ(ClassLoader classLoader, String str) {
        return (Enumeration) AccessController.doPrivileged(new C59504ziL(classLoader, str));
    }

    public static Properties OLrzqt(URL url) {
        return (Properties) AccessController.doPrivileged(new C59505ziM(url));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Properties OLrzqt(ClassLoader classLoader, String str) {
        URL url;
        Enumeration enumerationAEQbTJ;
        Properties properties = null;
        try {
            enumerationAEQbTJ = AEQbTJ(classLoader, str);
        } catch (SecurityException unused) {
            url = null;
        }
        if (enumerationAEQbTJ == null) {
            return null;
        }
        url = null;
        double d = 0.0d;
        while (enumerationAEQbTJ.hasMoreElements()) {
            try {
                URL url2 = (URL) enumerationAEQbTJ.nextElement();
                Properties propertiesOLrzqt = OLrzqt(url2);
                if (propertiesOLrzqt != null) {
                    if (properties == null) {
                        try {
                            String property = propertiesOLrzqt.getProperty(RemoteMessageConst.Notification.PRIORITY);
                            d = property != null ? Double.parseDouble(property) : 0.0d;
                            if (KWHzl()) {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("[LOOKUP] Properties file found at '");
                                stringBuffer.append(url2);
                                stringBuffer.append("'");
                                stringBuffer.append(" with priority ");
                                stringBuffer.append(d);
                                AYXKKw(stringBuffer.toString());
                            }
                            url = url2;
                            properties = propertiesOLrzqt;
                        } catch (SecurityException unused2) {
                            url = url2;
                            properties = propertiesOLrzqt;
                            if (KWHzl()) {
                                AYXKKw("SecurityException thrown while trying to find/read config files.");
                            }
                            if (KWHzl()) {
                            }
                            return properties;
                        }
                    } else {
                        String property2 = propertiesOLrzqt.getProperty(RemoteMessageConst.Notification.PRIORITY);
                        double d2 = property2 != null ? Double.parseDouble(property2) : 0.0d;
                        if (d2 > d) {
                            if (KWHzl()) {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                stringBuffer2.append("[LOOKUP] Properties file at '");
                                stringBuffer2.append(url2);
                                stringBuffer2.append("'");
                                stringBuffer2.append(" with priority ");
                                stringBuffer2.append(d2);
                                stringBuffer2.append(" overrides file at '");
                                stringBuffer2.append(url);
                                stringBuffer2.append("'");
                                stringBuffer2.append(" with priority ");
                                stringBuffer2.append(d);
                                AYXKKw(stringBuffer2.toString());
                            }
                            url = url2;
                            properties = propertiesOLrzqt;
                            d = d2;
                        } else if (KWHzl()) {
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("[LOOKUP] Properties file at '");
                            stringBuffer3.append(url2);
                            stringBuffer3.append("'");
                            stringBuffer3.append(" with priority ");
                            stringBuffer3.append(d2);
                            stringBuffer3.append(" does not override file at '");
                            stringBuffer3.append(url);
                            stringBuffer3.append("'");
                            stringBuffer3.append(" with priority ");
                            stringBuffer3.append(d);
                            AYXKKw(stringBuffer3.toString());
                        }
                    }
                }
            } catch (SecurityException unused3) {
            }
        }
        if (KWHzl()) {
            if (properties == null) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[LOOKUP] No properties file of name '");
                stringBuffer4.append(str);
                stringBuffer4.append("' found.");
                AYXKKw(stringBuffer4.toString());
            } else {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[LOOKUP] Properties file of name '");
                stringBuffer5.append(str);
                stringBuffer5.append("' found at '");
                stringBuffer5.append(url);
                stringBuffer5.append('\"');
                AYXKKw(stringBuffer5.toString());
            }
        }
        return properties;
    }

    private static String OLrzqt(String str, String str2) throws SecurityException {
        return (String) AccessController.doPrivileged(new C59508ziP(str, str2));
    }

    public static PrintStream EZpvd() {
        try {
            String strOLrzqt = OLrzqt("org.apache.commons.logging.diagnostics.dest", (String) null);
            if (strOLrzqt == null) {
                return null;
            }
            return strOLrzqt.equals("STDOUT") ? System.out : strOLrzqt.equals("STDERR") ? System.err : new PrintStream(new FileOutputStream(strOLrzqt, true));
        } catch (IOException | SecurityException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AYXKKw(String str) {
        PrintStream printStream = OLrzqt;
        if (printStream != null) {
            printStream.print(copydefault);
            OLrzqt.println(str);
            OLrzqt.flush();
        }
    }

    public static final void OLrzqt(String str) {
        PrintStream printStream = OLrzqt;
        if (printStream != null) {
            printStream.println(str);
            OLrzqt.flush();
        }
    }

    public static void AEQbTJ(Class cls) {
        if (KWHzl()) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("[ENV] Extension directories (java.ext.dir): ");
                stringBuffer.append(System.getProperty("java.ext.dir"));
                AYXKKw(stringBuffer.toString());
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("[ENV] Application classpath (java.class.path): ");
                stringBuffer2.append(System.getProperty("java.class.path"));
                AYXKKw(stringBuffer2.toString());
            } catch (SecurityException unused) {
                AYXKKw("[ENV] Security setting prevent interrogation of system classpaths.");
            }
            String name = cls.getName();
            try {
                ClassLoader classLoaderEZpvd = EZpvd(cls);
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[ENV] Class ");
                stringBuffer3.append(name);
                stringBuffer3.append(" was loaded via classloader ");
                stringBuffer3.append(OLrzqt(classLoaderEZpvd));
                AYXKKw(stringBuffer3.toString());
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[ENV] Ancestry of classloader which loaded ");
                stringBuffer4.append(name);
                stringBuffer4.append(" is ");
                KWHzl(stringBuffer4.toString(), classLoaderEZpvd);
            } catch (SecurityException unused2) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[ENV] Security forbids determining the classloader for ");
                stringBuffer5.append(name);
                AYXKKw(stringBuffer5.toString());
            }
        }
    }

    public static void KWHzl(String str, ClassLoader classLoader) {
        if (KWHzl()) {
            if (classLoader != null) {
                String string = classLoader.toString();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(OLrzqt(classLoader));
                stringBuffer.append(" == '");
                stringBuffer.append(string);
                stringBuffer.append("'");
                AYXKKw(stringBuffer.toString());
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (classLoader != null) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str);
                    stringBuffer2.append("ClassLoader tree:");
                    StringBuffer stringBuffer3 = new StringBuffer(stringBuffer2.toString());
                    do {
                        stringBuffer3.append(OLrzqt(classLoader));
                        if (classLoader == systemClassLoader) {
                            stringBuffer3.append(" (SYSTEM) ");
                        }
                        try {
                            classLoader = classLoader.getParent();
                            stringBuffer3.append(" --> ");
                        } catch (SecurityException unused) {
                            stringBuffer3.append(" --> SECRET");
                        }
                    } while (classLoader != null);
                    stringBuffer3.append("BOOT");
                    AYXKKw(stringBuffer3.toString());
                }
            } catch (SecurityException unused2) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(str);
                stringBuffer4.append("Security forbids determining the system classloader.");
                AYXKKw(stringBuffer4.toString());
            }
        }
    }

    public static String OLrzqt(Object obj) {
        if (obj == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append("@");
        stringBuffer.append(System.identityHashCode(obj));
        return stringBuffer.toString();
    }

    static {
        String strOLrzqt;
        Class clsCopydefault = AEQbTJ;
        if (clsCopydefault == null) {
            clsCopydefault = copydefault("org.apache.commons.logging.LogFactory");
            AEQbTJ = clsCopydefault;
        }
        ClassLoader classLoaderEZpvd = EZpvd(clsCopydefault);
        valueOf = classLoaderEZpvd;
        if (classLoaderEZpvd == null) {
            strOLrzqt = "BOOTLOADER";
        } else {
            try {
                strOLrzqt = OLrzqt(classLoaderEZpvd);
            } catch (SecurityException unused) {
                strOLrzqt = "UNKNOWN";
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[LogFactory from ");
        stringBuffer.append(strOLrzqt);
        stringBuffer.append("] ");
        copydefault = stringBuffer.toString();
        OLrzqt = EZpvd();
        Class clsCopydefault2 = AEQbTJ;
        if (clsCopydefault2 == null) {
            clsCopydefault2 = copydefault("org.apache.commons.logging.LogFactory");
            AEQbTJ = clsCopydefault2;
        }
        AEQbTJ(clsCopydefault2);
        EZpvd = copydefault();
        if (KWHzl()) {
            AYXKKw("BOOTSTRAP COMPLETED");
        }
    }
}
