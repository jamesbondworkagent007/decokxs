package com.sun.jna;

import android.os.Build;
import android.os.Environment;
import androidx.camera.video.AudioStats;
import com.google.common.base.Ascii;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import com.sun.jna.internal.Cleaner;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipFile;
import o.YY;
import o.Zl;
import o.Zo;
import o.Zs;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes12.dex */
public class NativeLibrary implements Closeable {
    private static final Level DEBUG_LOAD_LEVEL;
    private static final int DEFAULT_OPEN_OPTIONS = -1;
    private static long KWHzl;
    private static final Logger LOG;
    private static final SymbolProvider NATIVE_SYMBOL_PROVIDER;
    private static int OLrzqt;
    private static Method addSuppressedMethod;
    public static final Map<String, Reference<NativeLibrary>> libraries;
    private static final LinkedHashSet<String> librarySearchPath;
    private static final Map<String, List<String>> searchPaths;
    private final int callFlags;
    private final Cleaner.Cleanable cleanable;
    private final String encoding;
    private final Map<String, Function> functions;
    private volatile long handle;
    private final String libraryName;
    private final String libraryPath;
    private final Map<String, ?> options;
    private final SymbolProvider symbolProvider;
    private static final byte[] copydefault = {88, 37, -69, 48, 1, 3, -12, -26, Ascii.ESC, -9, Ascii.SO, -19, Ascii.SI, 5};
    private static final int AEQbTJ = 204;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getName() {
        return this.libraryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, ?> getOptions() {
        return this.options;
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        Zo zo = new Zo();
        char[] cArrOLrzqt = Zo.OLrzqt(KWHzl ^ (-5747691001614856746L), cArr, i);
        zo.KWHzl = 4;
        while (zo.KWHzl < cArrOLrzqt.length) {
            zo.OLrzqt = zo.KWHzl - 4;
            cArrOLrzqt[zo.KWHzl] = (char) (((long) (cArrOLrzqt[zo.KWHzl] ^ cArrOLrzqt[zo.KWHzl % 4])) ^ (((long) zo.OLrzqt) * (KWHzl ^ (-5747691001614856746L))));
            zo.KWHzl++;
        }
        objArr[0] = new String(cArrOLrzqt, 4, cArrOLrzqt.length - 4);
    }

    static {
        String str;
        String string;
        AEQbTJ();
        LOG = Logger.getLogger(NativeLibrary.class.getName());
        DEBUG_LOAD_LEVEL = Native.DEBUG_LOAD ? Level.INFO : Level.FINE;
        NATIVE_SYMBOL_PROVIDER = new SymbolProvider() { // from class: com.sun.jna.NativeLibrary.1
            @Override // com.sun.jna.SymbolProvider
            public long getSymbolAddress(long j, String str2, SymbolProvider symbolProvider) {
                return Native.findSymbol(j, str2);
            }
        };
        libraries = new HashMap();
        searchPaths = new ConcurrentHashMap();
        librarySearchPath = new LinkedHashSet<>();
        if (Native.POINTER_SIZE == 0) {
            throw new Error("Native library not initialized");
        }
        addSuppressedMethod = null;
        try {
            addSuppressedMethod = Throwable.class.getMethod("addSuppressed", Throwable.class);
        } catch (NoSuchMethodException unused) {
        } catch (SecurityException e) {
            Logger.getLogger(NativeLibrary.class.getName()).log(Level.SEVERE, "Failed to initialize 'addSuppressed' method", (Throwable) e);
        }
        String webStartLibraryPath = Native.getWebStartLibraryPath("jnidispatch");
        if (webStartLibraryPath != null) {
            librarySearchPath.add(webStartLibraryPath);
        }
        if (System.getProperty("jna.platform.library.path") == null && !Platform.isWindows()) {
            if (Platform.isLinux() || Platform.isSolaris() || Platform.isFreeBSD() || Platform.iskFreeBSD()) {
                StringBuilder sb = new StringBuilder();
                if (Platform.isSolaris()) {
                    Object[] objArr = new Object[1];
                    a(new char[]{42473, 50771, 10292, 48827, 42438}, 0, objArr);
                    str = (String) objArr[0];
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append(Native.POINTER_SIZE * 8);
                string = sb.toString();
            } else {
                string = "";
            }
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a(new char[]{53211, 2607, 47582, 33973, 53236, 37363, 36567, 22471}, 0, objArr2);
            sb2.append((String) objArr2[0]);
            sb2.append(string);
            String string2 = sb2.toString();
            Object[] objArr3 = new Object[1];
            a(new char[]{53211, 2607, 47582, 33973, 53236, 37363, 36567, 22471}, 0, objArr3);
            String[] strArr = {"/usr/lib" + string, string2, "/usr/lib", (String) objArr3[0]};
            if (Platform.isLinux() || Platform.iskFreeBSD() || Platform.isGNU()) {
                String multiArchPath = getMultiArchPath();
                StringBuilder sb3 = new StringBuilder();
                Object[] objArr4 = new Object[1];
                a(new char[]{53211, 2607, 47582, 33973, 53236, 37363, 36567, 22471}, 0, objArr4);
                sb3.append((String) objArr4[0]);
                sb3.append(string);
                String string3 = sb3.toString();
                Object[] objArr5 = new Object[1];
                a(new char[]{53211, 2607, 47582, 33973, 53236, 37363, 36567, 22471}, 0, objArr5);
                strArr = new String[]{"/usr/lib/" + multiArchPath, "/lib/" + multiArchPath, "/usr/lib" + string, string3, "/usr/lib", (String) objArr5[0]};
            }
            if (Platform.isLinux()) {
                ArrayList<String> linuxLdPaths = getLinuxLdPaths();
                for (int length = strArr.length - 1; length >= 0; length--) {
                    int iIndexOf = linuxLdPaths.indexOf(strArr[length]);
                    if (iIndexOf != -1) {
                        linuxLdPaths.remove(iIndexOf);
                    }
                    linuxLdPaths.add(0, strArr[length]);
                }
                strArr = (String[]) linuxLdPaths.toArray(new String[0]);
            }
            String str2 = "";
            String str3 = str2;
            for (int i = 0; i < strArr.length; i++) {
                File file = new File(strArr[i]);
                if (file.exists() && file.isDirectory()) {
                    str2 = str2 + str3 + strArr[i];
                    str3 = File.pathSeparator;
                }
            }
            if (!"".equals(str2)) {
                System.setProperty("jna.platform.library.path", str2);
            }
        }
        librarySearchPath.addAll(initPaths("jna.platform.library.path"));
    }

    private static void b(int i, char[] cArr, int i2, int i3, boolean z, Object[] objArr) {
        Zl zl = new Zl();
        char[] cArr2 = new char[i3];
        zl.OLrzqt = 0;
        while (zl.OLrzqt < i3) {
            zl.KWHzl = cArr[zl.OLrzqt];
            cArr2[zl.OLrzqt] = (char) (zl.KWHzl + i);
            int i4 = zl.OLrzqt;
            cArr2[i4] = (char) (cArr2[i4] - ((int) (((long) OLrzqt) ^ 5046837254555363355L)));
            zl.OLrzqt++;
        }
        if (i2 > 0) {
            zl.AEQbTJ = i2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - zl.AEQbTJ, zl.AEQbTJ);
            System.arraycopy(cArr3, zl.AEQbTJ, cArr2, 0, i3 - zl.AEQbTJ);
        }
        if (z) {
            char[] cArr4 = new char[i3];
            zl.OLrzqt = 0;
            while (zl.OLrzqt < i3) {
                cArr4[zl.OLrzqt] = cArr2[(i3 - zl.OLrzqt) - 1];
                zl.OLrzqt++;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static String functionKey(String str, int i, String str2) {
        return str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2;
    }

    private NativeLibrary(String str, String str2, long j, Map<String, ?> map) {
        HashMap map2 = new HashMap();
        this.functions = map2;
        String libraryName = getLibraryName(str);
        this.libraryName = libraryName;
        this.libraryPath = str2;
        this.handle = j;
        this.cleanable = Cleaner.getCleaner().register(this, new NativeLibraryDisposer(j));
        Object obj = map.get(Library.OPTION_CALLING_CONVENTION);
        int iIntValue = obj instanceof Number ? ((Number) obj).intValue() : 0;
        this.callFlags = iIntValue;
        this.options = map;
        SymbolProvider symbolProvider = (SymbolProvider) map.get(Library.OPTION_SYMBOL_PROVIDER);
        this.symbolProvider = symbolProvider == null ? NATIVE_SYMBOL_PROVIDER : symbolProvider;
        String defaultStringEncoding = (String) map.get(Library.OPTION_STRING_ENCODING);
        defaultStringEncoding = defaultStringEncoding == null ? Native.getDefaultStringEncoding() : defaultStringEncoding;
        this.encoding = defaultStringEncoding;
        if (Platform.isWindows() && "kernel32".equals(libraryName.toLowerCase())) {
            synchronized (map2) {
                map2.put(functionKey("GetLastError", iIntValue, defaultStringEncoding), new Function(this, "GetLastError", 63, defaultStringEncoding) { // from class: com.sun.jna.NativeLibrary.2
                    @Override // com.sun.jna.Function
                    public Object invoke(Object[] objArr, Class<?> cls, boolean z, int i) {
                        return Integer.valueOf(Native.getLastError());
                    }

                    @Override // com.sun.jna.Function
                    public Object invoke(Method method, Class<?>[] clsArr, Class<?> cls, Object[] objArr, Map<String, ?> map3) {
                        return Integer.valueOf(Native.getLastError());
                    }
                });
            }
        }
    }

    private static int openFlags(Map<String, ?> map) {
        Object obj = map.get(Library.OPTION_OPEN_FLAGS);
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return -1;
    }

    /* JADX DEBUG: Incorrect finally slice size: {[INVOKE, INVOKE, INVOKE, GOTO, IF] complete}, expected: {[INVOKE, INVOKE, INVOKE, IF] complete} */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    private static NativeLibrary loadLibrary(String str, Map<String, ?> map) throws Exception {
        long jOpen;
        Logger logger = LOG;
        Level level = DEBUG_LOAD_LEVEL;
        logger.log(level, "Looking for library '" + str + "'");
        ArrayList<Throwable> arrayList = new ArrayList();
        boolean zIsAbsolute = new File(str).isAbsolute();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int iOpenFlags = openFlags(map);
        List<String> list = searchPaths.get(str);
        if (list != null) {
            synchronized (list) {
                linkedHashSet.addAll(list);
            }
        }
        String webStartLibraryPath = Native.getWebStartLibraryPath(str);
        if (webStartLibraryPath != null) {
            logger.log(level, "Adding web start path " + webStartLibraryPath);
            linkedHashSet.add(webStartLibraryPath);
        }
        logger.log(level, "Adding paths from jna.library.path: " + System.getProperty("jna.library.path"));
        linkedHashSet.addAll(initPaths("jna.library.path"));
        String strFindLibraryPath = findLibraryPath(str, linkedHashSet);
        try {
            logger.log(level, "Trying " + strFindLibraryPath);
            jOpen = Native.open(strFindLibraryPath, iOpenFlags);
        } catch (UnsatisfiedLinkError e) {
            Logger logger2 = LOG;
            Level level2 = DEBUG_LOAD_LEVEL;
            logger2.log(level2, "Loading failed with message: " + e.getMessage());
            StringBuilder sb = new StringBuilder();
            sb.append("Adding system paths: ");
            LinkedHashSet<String> linkedHashSet2 = librarySearchPath;
            sb.append(linkedHashSet2);
            logger2.log(level2, sb.toString());
            arrayList.add(e);
            linkedHashSet.addAll(linkedHashSet2);
            jOpen = 0;
        }
        if (jOpen == 0) {
            try {
                strFindLibraryPath = findLibraryPath(str, linkedHashSet);
                LOG.log(DEBUG_LOAD_LEVEL, "Trying " + strFindLibraryPath);
                jOpen = Native.open(strFindLibraryPath, iOpenFlags);
                if (jOpen == 0) {
                    throw new UnsatisfiedLinkError("Failed to load library '" + str + "'");
                }
            } catch (UnsatisfiedLinkError e2) {
                Logger logger3 = LOG;
                Level level3 = DEBUG_LOAD_LEVEL;
                logger3.log(level3, "Loading failed with message: " + e2.getMessage());
                arrayList.add(e2);
                if (Platform.isAndroid()) {
                    try {
                        logger3.log(level3, "Preload (via System.loadLibrary) " + str);
                        AEQbTJ(str);
                        jOpen = Native.open(strFindLibraryPath, iOpenFlags);
                    } catch (UnsatisfiedLinkError e3) {
                        LOG.log(DEBUG_LOAD_LEVEL, "Loading failed with message: " + e3.getMessage());
                        arrayList.add(e3);
                    }
                } else if (Platform.isLinux() || Platform.isFreeBSD()) {
                    logger3.log(level3, "Looking for version variants");
                    strFindLibraryPath = matchLibrary(str, linkedHashSet);
                    if (strFindLibraryPath != null) {
                        logger3.log(level3, "Trying " + strFindLibraryPath);
                        try {
                            jOpen = Native.open(strFindLibraryPath, iOpenFlags);
                        } catch (UnsatisfiedLinkError e4) {
                            LOG.log(DEBUG_LOAD_LEVEL, "Loading failed with message: " + e4.getMessage());
                            arrayList.add(e4);
                        }
                    }
                } else if (Platform.isMac() && !str.endsWith(".dylib")) {
                    for (String str2 : matchFramework(str)) {
                        try {
                            LOG.log(DEBUG_LOAD_LEVEL, "Trying " + str2);
                            jOpen = Native.open(str2, iOpenFlags);
                            break;
                        } catch (UnsatisfiedLinkError e5) {
                            LOG.log(DEBUG_LOAD_LEVEL, "Loading failed with message: " + e5.getMessage());
                            arrayList.add(e5);
                        }
                    }
                } else if (Platform.isWindows() && !zIsAbsolute) {
                    logger3.log(level3, "Looking for lib- prefix");
                    strFindLibraryPath = findLibraryPath("lib" + str, linkedHashSet);
                    if (strFindLibraryPath != null) {
                        logger3.log(level3, "Trying " + strFindLibraryPath);
                        try {
                            jOpen = Native.open(strFindLibraryPath, iOpenFlags);
                        } catch (UnsatisfiedLinkError e6) {
                            LOG.log(DEBUG_LOAD_LEVEL, "Loading failed with message: " + e6.getMessage());
                            arrayList.add(e6);
                        }
                    }
                }
                if (jOpen == 0) {
                    try {
                        File fileExtractFromResourcePath = Native.extractFromResourcePath(str, (ClassLoader) map.get(Library.OPTION_CLASSLOADER));
                        if (fileExtractFromResourcePath != null) {
                            try {
                                jOpen = Native.open(fileExtractFromResourcePath.getAbsolutePath(), iOpenFlags);
                                strFindLibraryPath = fileExtractFromResourcePath.getAbsolutePath();
                                if (Native.isUnpacked(fileExtractFromResourcePath)) {
                                    Native.deleteLibrary(fileExtractFromResourcePath);
                                }
                            } catch (Throwable th) {
                                if (Native.isUnpacked(fileExtractFromResourcePath)) {
                                    Native.deleteLibrary(fileExtractFromResourcePath);
                                }
                                throw th;
                            }
                        }
                    } catch (IOException e7) {
                        LOG.log(DEBUG_LOAD_LEVEL, "Loading failed with message: " + e7.getMessage());
                        arrayList.add(e7);
                    }
                }
                if (jOpen == 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unable to load library '");
                    sb2.append(str);
                    sb2.append("':");
                    for (Throwable th2 : arrayList) {
                        sb2.append("\n");
                        sb2.append(th2.getMessage());
                    }
                    UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(sb2.toString());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        addSuppressedReflected(unsatisfiedLinkError, (Throwable) it.next());
                    }
                    throw unsatisfiedLinkError;
                }
            }
        }
        String str3 = strFindLibraryPath;
        LOG.log(DEBUG_LOAD_LEVEL, "Found library '" + str + "' at " + str3);
        return new NativeLibrary(str, str3, jOpen, map);
    }

    private static void addSuppressedReflected(Throwable th, Throwable th2) {
        Method method = addSuppressedMethod;
        if (method == null) {
            return;
        }
        try {
            method.invoke(th, th2);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new RuntimeException("Failed to call addSuppressedMethod", e);
        }
    }

    public static String[] matchFramework(String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        File file = new File(str);
        if (file.isAbsolute()) {
            if (str.contains(".framework")) {
                if (file.exists()) {
                    return new String[]{file.getAbsolutePath()};
                }
                linkedHashSet.add(file.getAbsolutePath());
            } else {
                File file2 = new File(new File(file.getParentFile(), file.getName() + ".framework"), file.getName());
                if (file2.exists()) {
                    return new String[]{file2.getAbsolutePath()};
                }
                linkedHashSet.add(file2.getAbsolutePath());
            }
        } else {
            String[] strArr = {System.getProperty("user.home"), "", "/System"};
            if (!str.contains(".framework")) {
                str = str + ".framework/" + str;
            }
            for (int i = 0; i < 3; i++) {
                File file3 = new File(strArr[i] + "/Library/Frameworks/" + str);
                if (file3.exists()) {
                    return new String[]{file3.getAbsolutePath()};
                }
                linkedHashSet.add(file3.getAbsolutePath());
            }
        }
        return (String[]) linkedHashSet.toArray(new String[0]);
    }

    private String getLibraryName(String str) {
        String strMapSharedLibraryName = mapSharedLibraryName("---");
        int iIndexOf = strMapSharedLibraryName.indexOf("---");
        if (iIndexOf > 0 && str.startsWith(strMapSharedLibraryName.substring(0, iIndexOf))) {
            str = str.substring(iIndexOf);
        }
        int iIndexOf2 = str.indexOf(strMapSharedLibraryName.substring(iIndexOf + 3));
        return iIndexOf2 != -1 ? str.substring(0, iIndexOf2) : str;
    }

    public static final NativeLibrary getInstance(String str) {
        return getInstance(str, (Map<String, ?>) Collections.emptyMap());
    }

    public static final NativeLibrary getInstance(String str, ClassLoader classLoader) {
        return getInstance(str, (Map<String, ?>) Collections.singletonMap(Library.OPTION_CLASSLOADER, classLoader));
    }

    public static final NativeLibrary getInstance(String str, Map<String, ?> map) {
        NativeLibrary nativeLibrary;
        NativeLibrary nativeLibraryLoadLibrary;
        HashMap map2 = new HashMap(map);
        if (map2.get(Library.OPTION_CALLING_CONVENTION) == null) {
            map2.put(Library.OPTION_CALLING_CONVENTION, 0);
        }
        if ((Platform.isLinux() || Platform.isFreeBSD() || Platform.isAIX()) && Platform.C_LIBRARY_NAME.equals(str)) {
            str = null;
        }
        Map<String, Reference<NativeLibrary>> map3 = libraries;
        synchronized (map3) {
            Reference<NativeLibrary> reference = map3.get(str);
            nativeLibrary = reference != null ? reference.get() : null;
            if (nativeLibrary == null) {
                if (str == null) {
                    nativeLibraryLoadLibrary = new NativeLibrary("<process>", null, Native.open(null, openFlags(map2)), map2);
                } else {
                    nativeLibraryLoadLibrary = loadLibrary(str, map2);
                }
                nativeLibrary = nativeLibraryLoadLibrary;
                WeakReference weakReference = new WeakReference(nativeLibrary);
                map3.put(nativeLibrary.getName(), weakReference);
                File file = nativeLibrary.getFile();
                if (file != null) {
                    map3.put(file.getAbsolutePath(), weakReference);
                    map3.put(file.getName(), weakReference);
                }
            }
        }
        return nativeLibrary;
    }

    public static final NativeLibrary getProcess() {
        NativeLibrary nativeLibrary;
        synchronized (NativeLibrary.class) {
            nativeLibrary = getInstance(null);
        }
        return nativeLibrary;
    }

    public static final NativeLibrary getProcess(Map<String, ?> map) {
        NativeLibrary nativeLibrary;
        synchronized (NativeLibrary.class) {
            nativeLibrary = getInstance((String) null, map);
        }
        return nativeLibrary;
    }

    public static final void addSearchPath(String str, String str2) {
        Map<String, List<String>> map = searchPaths;
        List<String> listSynchronizedList = map.get(str);
        if (listSynchronizedList == null) {
            listSynchronizedList = Collections.synchronizedList(new ArrayList());
            map.put(str, listSynchronizedList);
        }
        listSynchronizedList.add(str2);
    }

    public Function getFunction(String str) {
        return getFunction(str, this.callFlags);
    }

    public Function getFunction(String str, Method method) {
        FunctionMapper functionMapper = (FunctionMapper) this.options.get(Library.OPTION_FUNCTION_MAPPER);
        if (functionMapper != null) {
            str = functionMapper.getFunctionName(this, method);
        }
        String property = System.getProperty("jna.profiler.prefix", "$$YJP$$");
        if (str.startsWith(property)) {
            str = str.substring(property.length());
        }
        int i = this.callFlags;
        for (Class<?> cls : method.getExceptionTypes()) {
            if (LastErrorException.class.isAssignableFrom(cls)) {
                i |= 64;
            }
        }
        return getFunction(str, i);
    }

    public Function getFunction(String str, int i) {
        return getFunction(str, i, this.encoding);
    }

    public Function getFunction(String str, int i, String str2) {
        Function function;
        if (str == null) {
            throw new NullPointerException("Function name may not be null");
        }
        synchronized (this.functions) {
            String strFunctionKey = functionKey(str, i, str2);
            function = this.functions.get(strFunctionKey);
            if (function == null) {
                function = new Function(this, str, i, str2);
                this.functions.put(strFunctionKey, function);
            }
        }
        return function;
    }

    public Pointer getGlobalVariableAddress(String str) {
        try {
            return new Pointer(getSymbolAddress(str));
        } catch (UnsatisfiedLinkError e) {
            throw new UnsatisfiedLinkError("Error looking up '" + str + "': " + e.getMessage());
        }
    }

    public long getSymbolAddress(String str) {
        if (this.handle == 0) {
            throw new UnsatisfiedLinkError("Library has been unloaded");
        }
        return this.symbolProvider.getSymbolAddress(this.handle, str, NATIVE_SYMBOL_PROVIDER);
    }

    public String toString() {
        return "Native Library <" + this.libraryPath + "@" + this.handle + ">";
    }

    public File getFile() {
        if (this.libraryPath == null) {
            return null;
        }
        return new File(this.libraryPath);
    }

    public static void disposeAll() {
        LinkedHashSet linkedHashSet;
        Map<String, Reference<NativeLibrary>> map = libraries;
        synchronized (map) {
            linkedHashSet = new LinkedHashSet(map.values());
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            NativeLibrary nativeLibrary = (NativeLibrary) ((Reference) it.next()).get();
            if (nativeLibrary != null) {
                nativeLibrary.close();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        HashSet hashSet = new HashSet();
        Map<String, Reference<NativeLibrary>> map = libraries;
        synchronized (map) {
            for (Map.Entry<String, Reference<NativeLibrary>> entry : map.entrySet()) {
                if (entry.getValue().get() == this) {
                    hashSet.add(entry.getKey());
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                libraries.remove((String) it.next());
            }
        }
        synchronized (this) {
            if (this.handle != 0) {
                this.handle = 0L;
                this.cleanable.clean();
            }
        }
    }

    @Deprecated
    public void dispose() {
        close();
    }

    private static List<String> initPaths(String str) {
        String property = System.getProperty(str, "");
        if ("".equals(property)) {
            return Collections.emptyList();
        }
        StringTokenizer stringTokenizer = new StringTokenizer(property, File.pathSeparator);
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (!"".equals(strNextToken)) {
                arrayList.add(strNextToken);
            }
        }
        return arrayList;
    }

    private static String findLibraryPath(String str, Collection<String> collection) {
        if (new File(str).isAbsolute()) {
            return str;
        }
        String strMapSharedLibraryName = mapSharedLibraryName(str);
        for (String str2 : collection) {
            File file = new File(str2, strMapSharedLibraryName);
            if (file.exists()) {
                return file.getAbsolutePath();
            }
            if (Platform.isMac() && strMapSharedLibraryName.endsWith(".dylib")) {
                File file2 = new File(str2, strMapSharedLibraryName.substring(0, strMapSharedLibraryName.lastIndexOf(".dylib")) + ".jnilib");
                if (file2.exists()) {
                    return file2.getAbsolutePath();
                }
            }
        }
        return strMapSharedLibraryName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (r7.endsWith(".a") == false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String mapSharedLibraryName(String str) {
        if (Platform.isMac()) {
            if (str.startsWith("lib") && (str.endsWith(".dylib") || str.endsWith(".jnilib"))) {
                return str;
            }
            String strMapLibraryName = System.mapLibraryName(str);
            if (!strMapLibraryName.endsWith(".jnilib")) {
                return strMapLibraryName;
            }
            return strMapLibraryName.substring(0, strMapLibraryName.lastIndexOf(".jnilib")) + ".dylib";
        }
        if (Platform.isLinux() || Platform.isFreeBSD()) {
            if (isVersionedName(str)) {
                return str;
            }
            Object[] objArr = new Object[1];
            a(new char[]{47162, 7708, 12492, 14171, 47124, 34271, 1987}, 0, objArr);
            if (str.endsWith((String) objArr[0])) {
                return str;
            }
        } else {
            if (Platform.isAIX()) {
                if (!isVersionedName(str)) {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{47162, 7708, 12492, 14171, 47124, 34271, 1987}, 0, objArr2);
                    if (!str.endsWith((String) objArr2[0])) {
                        if (!str.startsWith("lib")) {
                        }
                    }
                }
                return str;
            }
            if (Platform.isWindows() && (str.endsWith(".drv") || str.endsWith(".dll") || str.endsWith(".ocx"))) {
                return str;
            }
        }
        String strMapLibraryName2 = System.mapLibraryName(str);
        if (!Platform.isAIX()) {
            return strMapLibraryName2;
        }
        Object[] objArr3 = new Object[1];
        a(new char[]{47162, 7708, 12492, 14171, 47124, 34271, 1987}, 0, objArr3);
        return strMapLibraryName2.endsWith((String) objArr3[0]) ? strMapLibraryName2.replaceAll(".so$", ".a") : strMapLibraryName2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isVersionedName(String str) {
        int iLastIndexOf;
        int i;
        if (!str.startsWith("lib") || (iLastIndexOf = str.lastIndexOf(".so.")) == -1 || (i = iLastIndexOf + 4) >= str.length()) {
            return false;
        }
        for (i = iLastIndexOf + 4; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isDigit(cCharAt) && cCharAt != '.') {
                return false;
            }
        }
        return true;
    }

    public static String matchLibrary(final String str, Collection<String> collection) {
        File file = new File(str);
        if (file.isAbsolute()) {
            collection = Arrays.asList(file.getParent());
        }
        FilenameFilter filenameFilter = new FilenameFilter() { // from class: com.sun.jna.NativeLibrary.3
            /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
            @Override // java.io.FilenameFilter
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean accept(File file2, String str2) {
                if (!str2.startsWith("lib" + str + ".so")) {
                    if (str2.startsWith(str + ".so") && str.startsWith("lib")) {
                        if (NativeLibrary.isVersionedName(str2)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        };
        LinkedList linkedList = new LinkedList();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            File[] fileArrListFiles = new File(it.next()).listFiles(filenameFilter);
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                linkedList.addAll(Arrays.asList(fileArrListFiles));
            }
        }
        Iterator it2 = linkedList.iterator();
        double d = -1.0d;
        String str2 = null;
        while (it2.hasNext()) {
            String absolutePath = ((File) it2.next()).getAbsolutePath();
            double version = parseVersion(absolutePath.substring(absolutePath.lastIndexOf(".so.") + 4));
            if (version > d) {
                str2 = absolutePath;
                d = version;
            }
        }
        return str2;
    }

    public static double parseVersion(String str) {
        String str2;
        int iIndexOf = str.indexOf(JwtUtilsKt.JWT_DELIMITER);
        double d = 1.0d;
        double d2 = 0.0d;
        while (str != null) {
            if (iIndexOf != -1) {
                String strSubstring = str.substring(0, iIndexOf);
                String strSubstring2 = str.substring(iIndexOf + 1);
                iIndexOf = strSubstring2.indexOf(JwtUtilsKt.JWT_DELIMITER);
                str2 = strSubstring2;
                str = strSubstring;
            } else {
                str2 = null;
            }
            try {
                d2 += ((double) Integer.parseInt(str)) / d;
                d *= 100.0d;
                str = str2;
            } catch (NumberFormatException unused) {
                return AudioStats.AUDIO_AMPLITUDE_NONE;
            }
        }
        return d2;
    }

    private static String getMultiArchPath() {
        String str;
        String str2 = Platform.ARCH;
        if (Platform.iskFreeBSD()) {
            str = "-kfreebsd";
        } else {
            str = Platform.isGNU() ? "" : "-linux";
        }
        String str3 = "-gnu";
        if (Platform.isIntel()) {
            str2 = Platform.is64Bit() ? "x86_64" : "i386";
        } else if (Platform.isPPC()) {
            str2 = Platform.is64Bit() ? "powerpc64" : "powerpc";
        } else if (Platform.isARM()) {
            str2 = "arm";
            str3 = "-gnueabi";
        } else if (str2.equals("mips64el")) {
            str3 = "-gnuabi64";
        }
        return str2 + str + str3;
    }

    private static ArrayList<String> getLinuxLdPaths() throws Throwable {
        Process processExec;
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            processExec = Runtime.getRuntime().exec("/sbin/ldconfig -p");
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line != null) {
                            int iIndexOf = line.indexOf(" => ");
                            int iLastIndexOf = line.lastIndexOf(47);
                            if (iIndexOf != -1 && iLastIndexOf != -1 && iIndexOf < iLastIndexOf) {
                                String strSubstring = line.substring(iIndexOf + 4, iLastIndexOf);
                                if (!arrayList.contains(strSubstring)) {
                                    arrayList.add(strSubstring);
                                }
                            }
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Exception unused2) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (processExec != null) {
                        }
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (processExec != null) {
                            try {
                                processExec.waitFor();
                                throw th;
                            } catch (InterruptedException unused5) {
                                throw th;
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
            } catch (Exception unused6) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused7) {
            processExec = null;
        } catch (Throwable th3) {
            th = th3;
            processExec = null;
        }
        try {
            processExec.waitFor();
        } catch (InterruptedException unused8) {
        }
        return arrayList;
    }

    public static final class NativeLibraryDisposer implements Runnable {
        private long handle;

        public NativeLibraryDisposer(long j) {
            this.handle = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                long j = this.handle;
                if (j != 0) {
                    try {
                        Native.close(j);
                        this.handle = 0L;
                    } catch (Throwable th) {
                        this.handle = 0L;
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, short s, short s2, Object[] objArr) {
        int i2;
        int i3 = 3 - (i * 3);
        byte[] bArr = copydefault;
        int i4 = 102 - (s2 * 2);
        int i5 = s * 4;
        byte[] bArr2 = new byte[11 - i5];
        int i6 = 10 - i5;
        if (bArr == null) {
            int i7 = i3;
            int i8 = i6;
            int i9 = 0;
            int i10 = i8 + i3 + 2;
            i2 = i9;
            int i11 = i7;
            i4 = i10;
            i3 = i11;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i12 = i3 + 1;
            int i13 = i4;
            i7 = i12;
            i3 = bArr[i12];
            i9 = i2 + 1;
            i8 = i13;
            int i102 = i8 + i3 + 2;
            i2 = i9;
            int i112 = i7;
            i4 = i102;
            i3 = i112;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    static void AEQbTJ() {
        KWHzl = 6536324842277967462L;
        OLrzqt = 1694165046;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:288:0x0761 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:417:0x0844 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:433:0x06de */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:458:0x007e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:474:0x05dc */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:557:0x084b */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0508 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:518:0x070c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:545:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0852 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:557:0x084b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v103 */
    /* JADX WARN: Type inference failed for: r11v121 */
    /* JADX WARN: Type inference failed for: r11v124 */
    /* JADX WARN: Type inference failed for: r11v133 */
    /* JADX WARN: Type inference failed for: r11v134 */
    /* JADX WARN: Type inference failed for: r11v135 */
    /* JADX WARN: Type inference failed for: r11v136 */
    /* JADX WARN: Type inference failed for: r11v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v65, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v73 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r11v87 */
    /* JADX WARN: Type inference failed for: r11v88 */
    /* JADX WARN: Type inference failed for: r11v89 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r11v91 */
    /* JADX WARN: Type inference failed for: r11v95, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void AEQbTJ(String str) throws Exception {
        ?? declaredConstructor;
        Exception exc;
        ?? r11;
        String str2;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Class[] clsArr;
        BufferedInputStream bufferedInputStream;
        Object[] objArr4;
        Object[] objArr5;
        Object[] objArr6;
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2;
        Object[] objArr7;
        Class[] clsArr2;
        Object[] objArr8;
        Object[] objArr9;
        Object objInvoke;
        Object[] objArr10;
        Object[] objArr11;
        Object[] objArr12;
        Object objInvoke2;
        String str3 = str;
        Object[] objArr13 = new Object[1];
        b(CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA, new char[]{65529, 5, 7, 65524, 5, 6, 4, 65531, 0}, 1, 9, false, objArr13);
        ?? r2 = 0;
        String str4 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        a(new char[]{21456, 37491, 47208, 6639, 21431, 2470, 36732, 51885, 15717, 39021, 7740, 22614, 36413, 60198}, 0, objArr14);
        String str5 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        a(new char[]{41671, 36398, 58177, 24765, 41618, 5578, 54375, 45952, 52287}, 0, objArr15);
        try {
            String[] strArrAEQbTJ = Zs.AEQbTJ(Zs.copydefault((byte[]) String.class.getMethod("getBytes", String.class).invoke(str3, (String) objArr15[0])));
            if (strArrAEQbTJ == null) {
                strArrAEQbTJ = new String[0];
            }
            int length = strArrAEQbTJ.length;
            String[] strArr = new String[length + 1];
            System.arraycopy(strArrAEQbTJ, 0, strArr, 0, length);
            strArr[length] = str3;
            int i = 0;
            while (i <= length) {
                String str6 = strArr[i];
                try {
                    declaredConstructor = new Object[1];
                    a(new char[]{16686, 46757, 25465, 3962, 16641, 11633, 21624, 56350, 12175, 48378, 50493, 20171, 40154, 53236, 30646, 49033, 3329, 20792, 57591, 4165, 64069, 57453, 37175, 33053, 26767, 29625, 565, 62415, 55770}, r2, declaredConstructor);
                } catch (Exception e) {
                    e = e;
                    declaredConstructor = r2;
                }
                try {
                    Object[] objArr16 = {(String) declaredConstructor[r2]};
                    Class[] clsArr3 = new Class[1];
                    clsArr3[r2] = String.class;
                    declaredConstructor = File.class.getDeclaredConstructor(clsArr3);
                    Object objNewInstance = declaredConstructor.newInstance(objArr16);
                    try {
                        try {
                            Object[] objArr17 = new Object[1];
                            a(new char[]{57062, 50249, 23534, 51414, 56965, 24472, 27872, 7057, 45140, 52816, 64954, 35171}, r2, objArr17);
                            declaredConstructor = ((Boolean) File.class.getMethod((String) objArr17[r2], null).invoke(objNewInstance, null)).booleanValue();
                        } catch (Exception e2) {
                            e = e2;
                        }
                        if (declaredConstructor == 0) {
                            try {
                                Object[] objArr18 = new Object[1];
                                a(new char[]{37314, 63079, 20228, 28884, 37288, 28086, 30738, 41893, 65324, 64638, 59723, 12586, 19510, 36666, 23444, 49184, 56811, 4581}, r2, objArr18);
                                String str7 = (String) objArr18[r2];
                                try {
                                    Object[] objArr19 = {System.getProperty(str7, str7)};
                                    Class[] clsArr4 = new Class[1];
                                    clsArr4[r2] = String.class;
                                    objNewInstance = File.class.getDeclaredConstructor(clsArr4).newInstance(objArr19);
                                    try {
                                        Object[] objArr20 = new Object[1];
                                        a(new char[]{57062, 50249, 23534, 51414, 56965, 24472, 27872, 7057, 45140, 52816, 64954, 35171}, r2, objArr20);
                                        if (!((Boolean) File.class.getMethod((String) objArr20[r2], null).invoke(objNewInstance, null)).booleanValue()) {
                                            objNewInstance = Environment.getExternalStorageDirectory();
                                        }
                                        ClassLoader classLoader = NativeLibrary.class.getClassLoader();
                                        try {
                                            Object[] objArr21 = {i < length ? str3 : str6};
                                            byte b = (byte) (copydefault[4] - 1);
                                            byte b2 = b;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (Throwable th3) {
                                        Throwable cause = th3.getCause();
                                        if (cause == null) {
                                            throw th3;
                                        }
                                        throw cause;
                                    }
                                } catch (Throwable th4) {
                                    Throwable cause2 = th4.getCause();
                                    if (cause2 == null) {
                                        throw th4;
                                    }
                                    throw cause2;
                                }
                            } catch (Exception e3) {
                                exc = e3;
                                r11 = r2;
                            }
                            try {
                                Object[] objArr22 = new Object[1];
                                c(b, b2, b2, objArr22);
                                Method declaredMethod = ClassLoader.class.getDeclaredMethod((String) objArr22[0], String.class);
                                declaredMethod.setAccessible(true);
                                str2 = (String) declaredMethod.invoke(classLoader, objArr21);
                                if (str2 != null) {
                                    try {
                                        Object objInvoke3 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                        if (i >= length) {
                                            str6 = str;
                                        }
                                        try {
                                            Object[] objArr23 = new Object[1];
                                            a(new char[]{23886, 23592, 30732, 42556, 23842, 51191, 20237, 30024, 13250, 22065, 56910, 59294, 32943, 9578, 27797}, 0, objArr23);
                                            Runtime.class.getMethod((String) objArr23[0], String.class).invoke(objInvoke3, str6);
                                            return;
                                        } catch (Throwable th5) {
                                            Throwable cause3 = th5.getCause();
                                            if (cause3 == null) {
                                                throw th5;
                                            }
                                            throw cause3;
                                        }
                                    } catch (Throwable th6) {
                                        Throwable cause4 = th6.getCause();
                                        if (cause4 == null) {
                                            throw th6;
                                        }
                                        throw cause4;
                                    }
                                }
                                try {
                                    objArr = new Object[1];
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                                try {
                                    objArr[0] = 47;
                                    Object[] objArr24 = new Object[1];
                                    a(new char[]{56139, 29844, 45347, 52892, 56103, 61253, 34352, 7672, 46530, 32394, 5991, 36649, 1715, 3563, 42405}, 0, objArr24);
                                    try {
                                        objArr2 = new Object[1];
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                    try {
                                        objArr2[0] = Integer.valueOf(((Integer) String.class.getMethod((String) objArr24[0], Integer.TYPE).invoke(str2, objArr)).intValue() + 1);
                                        try {
                                            objArr3 = new Object[]{objNewInstance, String.class.getMethod(str4, Integer.TYPE).invoke(str2, objArr2)};
                                            clsArr = new Class[2];
                                        } catch (Throwable th9) {
                                            th = th9;
                                        }
                                        try {
                                            clsArr[0] = File.class;
                                            clsArr[1] = String.class;
                                            Object objNewInstance2 = File.class.getDeclaredConstructor(clsArr).newInstance(objArr3);
                                            try {
                                                URL resource = NativeLibrary.class.getClassLoader().getResource(str2);
                                                if (resource == null) {
                                                    try {
                                                        Object[] objArr25 = new Object[1];
                                                        a(new char[]{43937, 46832, 52527, 61400, 43970, 11567, 64033, 15548, 50432, 48361, 27489, 44667}, 0, objArr25);
                                                        if (((Boolean) String.class.getMethod((String) objArr25[0], CharSequence.class).invoke(str2, "!")).booleanValue()) {
                                                            try {
                                                                StringBuilder sb = new StringBuilder();
                                                                Object[] objArr26 = new Object[1];
                                                                a(new char[]{22796, 16535, 64683, 33673, 22886, 56134, 52153, 20643, 14250, 19086, 23271, 49724, 33974}, 0, objArr26);
                                                                sb.append((String) objArr26[0]);
                                                                sb.append(str2);
                                                                String path = new URL(sb.toString()).getPath();
                                                                try {
                                                                    Object[] objArr27 = new Object[1];
                                                                    a(new char[]{56139, 29844, 45347, 52892, 56103, 61253, 34352, 7672, 46530, 32394, 5991, 36649, 1715, 3563, 42405}, 0, objArr27);
                                                                    try {
                                                                        ZipFile zipFile = new ZipFile((String) String.class.getMethod(str4, Integer.TYPE, Integer.TYPE).invoke(path, 5, Integer.valueOf(((Integer) String.class.getMethod((String) objArr27[0], String.class).invoke(path, "!/")).intValue())));
                                                                        try {
                                                                            Object[] objArr28 = new Object[1];
                                                                            a(new char[]{56139, 29844, 45347, 52892, 56103, 61253, 34352, 7672, 46530, 32394, 5991, 36649, 1715, 3563, 42405}, 0, objArr28);
                                                                            try {
                                                                                try {
                                                                                    inputStream = zipFile.getInputStream(zipFile.getEntry((String) String.class.getMethod(str4, Integer.TYPE).invoke(String.class.getMethod(str4, Integer.TYPE).invoke(str2, Integer.valueOf(((Integer) String.class.getMethod((String) objArr28[0], String.class).invoke(str2, "!/")).intValue())), 2)));
                                                                                } catch (Throwable th10) {
                                                                                    Throwable cause5 = th10.getCause();
                                                                                    if (cause5 == null) {
                                                                                        throw th10;
                                                                                    }
                                                                                    throw cause5;
                                                                                }
                                                                            } catch (Throwable th11) {
                                                                                Throwable cause6 = th11.getCause();
                                                                                if (cause6 == null) {
                                                                                    throw th11;
                                                                                }
                                                                                throw cause6;
                                                                            }
                                                                        } catch (Throwable th12) {
                                                                            Throwable cause7 = th12.getCause();
                                                                            if (cause7 == null) {
                                                                                throw th12;
                                                                            }
                                                                            throw cause7;
                                                                        }
                                                                    } catch (Throwable th13) {
                                                                        Throwable cause8 = th13.getCause();
                                                                        if (cause8 == null) {
                                                                            throw th13;
                                                                        }
                                                                        throw cause8;
                                                                    }
                                                                } catch (Throwable th14) {
                                                                    Throwable cause9 = th14.getCause();
                                                                    if (cause9 == null) {
                                                                        throw th14;
                                                                    }
                                                                    throw cause9;
                                                                }
                                                            } catch (Exception e4) {
                                                                exc = e4;
                                                                r11 = 0;
                                                                if (i >= length) {
                                                                }
                                                            }
                                                        } else {
                                                            try {
                                                                inputStream = (InputStream) FileInputStream.class.getDeclaredConstructor(String.class).newInstance(str2);
                                                            } catch (Throwable th15) {
                                                                Throwable cause10 = th15.getCause();
                                                                if (cause10 == null) {
                                                                    throw th15;
                                                                }
                                                                throw cause10;
                                                            }
                                                        }
                                                    } catch (Throwable th16) {
                                                        Throwable cause11 = th16.getCause();
                                                        if (cause11 == null) {
                                                            throw th16;
                                                        }
                                                        throw cause11;
                                                    }
                                                } else {
                                                    String path2 = resource.getPath();
                                                    try {
                                                        objArr4 = new Object[]{"!/" + str2};
                                                        objArr5 = new Object[1];
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                    }
                                                    try {
                                                        a(new char[]{56139, 29844, 45347, 52892, 56103, 61253, 34352, 7672, 46530, 32394, 5991, 36649, 1715, 3563, 42405}, 0, objArr5);
                                                        try {
                                                            objArr6 = new Object[2];
                                                            objArr6[1] = Integer.valueOf(((Integer) String.class.getMethod((String) objArr5[0], String.class).invoke(path2, objArr4)).intValue());
                                                        } catch (Throwable th18) {
                                                            th = th18;
                                                        }
                                                        try {
                                                            objArr6[0] = 5;
                                                            Class[] clsArr5 = new Class[2];
                                                            clsArr5[0] = Integer.TYPE;
                                                            clsArr5[1] = Integer.TYPE;
                                                            ZipFile zipFile2 = new ZipFile((String) String.class.getMethod(str4, clsArr5).invoke(path2, objArr6));
                                                            inputStream = zipFile2.getInputStream(zipFile2.getEntry(str2));
                                                        } catch (Throwable th19) {
                                                            th = th19;
                                                            Throwable th20 = th;
                                                            Throwable cause12 = th20.getCause();
                                                            if (cause12 == null) {
                                                                throw th20;
                                                            }
                                                            throw cause12;
                                                        }
                                                    } catch (Throwable th21) {
                                                        th = th21;
                                                        Throwable th22 = th;
                                                        Throwable cause13 = th22.getCause();
                                                        if (cause13 == null) {
                                                            throw th22;
                                                        }
                                                        throw cause13;
                                                    }
                                                }
                                                bufferedInputStream = new BufferedInputStream(inputStream);
                                                try {
                                                    Object[] objArr29 = {bufferedInputStream};
                                                    Object objEZpvd = YY.EZpvd(1683135861);
                                                    if (objEZpvd == null) {
                                                        try {
                                                            objEZpvd = YY.EZpvd(37, 4, (char) 38177, 1618104329, false, "AEQbTJ", new Class[]{InputStream.class});
                                                        } catch (Throwable th23) {
                                                            th = th23;
                                                            Throwable cause14 = th.getCause();
                                                            if (cause14 == null) {
                                                                throw th;
                                                            }
                                                            throw cause14;
                                                        }
                                                    }
                                                    inputStream2 = (InputStream) ((Method) objEZpvd).invoke(null, objArr29);
                                                } catch (Throwable th24) {
                                                    th = th24;
                                                }
                                            } catch (Exception e5) {
                                                e = e5;
                                                declaredConstructor = 0;
                                                exc = e;
                                                r11 = declaredConstructor;
                                                if (i >= length) {
                                                }
                                            }
                                            if (bufferedInputStream == inputStream2) {
                                                inputStream2.close();
                                                try {
                                                    try {
                                                        try {
                                                            Object objInvoke4 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                            try {
                                                                Object[] objArr30 = {str2, NativeLibrary.class.getClassLoader()};
                                                                Object[] objArr31 = new Object[1];
                                                                a(new char[]{18705, 50578, 41122, 34627, 18813, 24141, 38819, 21559}, 0, objArr31);
                                                                Method declaredMethod2 = Runtime.class.getDeclaredMethod((String) objArr31[0], String.class, ClassLoader.class);
                                                                declaredMethod2.setAccessible(true);
                                                                declaredMethod2.invoke(objInvoke4, objArr30);
                                                            } catch (Throwable th25) {
                                                                Throwable cause15 = th25.getCause();
                                                                if (cause15 == null) {
                                                                    throw th25;
                                                                }
                                                                throw cause15;
                                                            }
                                                        } catch (Throwable th26) {
                                                            Throwable cause16 = th26.getCause();
                                                            if (cause16 == null) {
                                                                throw th26;
                                                            }
                                                            throw cause16;
                                                        }
                                                    } catch (NoSuchMethodException unused) {
                                                        try {
                                                            objInvoke2 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                            ClassLoader classLoader2 = NativeLibrary.class.getClassLoader();
                                                            synchronized (objInvoke2) {
                                                            }
                                                        } catch (Throwable th27) {
                                                            Throwable cause17 = th27.getCause();
                                                            if (cause17 == null) {
                                                                throw th27;
                                                            }
                                                            throw cause17;
                                                        }
                                                    }
                                                } catch (Exception unused2) {
                                                    if (Build.VERSION.SDK_INT <= 27) {
                                                        try {
                                                            Object objInvoke5 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                            try {
                                                                Object[] objArr32 = {str2, NativeLibrary.class.getClassLoader()};
                                                                Object[] objArr33 = new Object[1];
                                                                b(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA, new char[]{1, 1, '\f', 65513, '\f', 65534}, 1, 6, false, objArr33);
                                                                Method declaredMethod3 = Runtime.class.getDeclaredMethod((String) objArr33[0], String.class, ClassLoader.class);
                                                                declaredMethod3.setAccessible(true);
                                                                declaredMethod3.invoke(objInvoke5, objArr32);
                                                            } catch (Throwable th28) {
                                                                Throwable cause18 = th28.getCause();
                                                                if (cause18 == null) {
                                                                    throw th28;
                                                                }
                                                                throw cause18;
                                                            }
                                                        } catch (Throwable th29) {
                                                            Throwable cause19 = th29.getCause();
                                                            if (cause19 == null) {
                                                                throw th29;
                                                            }
                                                            throw cause19;
                                                        }
                                                    } else {
                                                        objInvoke2 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                        ClassLoader classLoader22 = NativeLibrary.class.getClassLoader();
                                                        synchronized (objInvoke2) {
                                                            try {
                                                                Object[] objArr34 = {str2, classLoader22};
                                                                Object[] objArr35 = new Object[1];
                                                                a(new char[]{36168, 20299, 52642, 51159, 36134, 54426, 64182, 5294, 58366, 17758, 27598, 34408, 20649, 13855}, 0, objArr35);
                                                                Method declaredMethod4 = Runtime.class.getDeclaredMethod((String) objArr35[0], String.class, ClassLoader.class);
                                                                declaredMethod4.setAccessible(true);
                                                                String str8 = (String) declaredMethod4.invoke(objInvoke2, objArr34);
                                                                if (str8 != null) {
                                                                    throw new UnsatisfiedLinkError(str8);
                                                                }
                                                            } catch (Throwable th30) {
                                                                Throwable cause20 = th30.getCause();
                                                                if (cause20 == null) {
                                                                    throw th30;
                                                                }
                                                                throw cause20;
                                                            }
                                                        }
                                                    }
                                                }
                                                r11 = 0;
                                            } else {
                                                try {
                                                    objArr7 = new Object[]{objNewInstance2};
                                                    clsArr2 = new Class[1];
                                                } catch (Throwable th31) {
                                                    th = th31;
                                                }
                                                try {
                                                    clsArr2[0] = File.class;
                                                    OutputStream outputStream = (OutputStream) FileOutputStream.class.getDeclaredConstructor(clsArr2).newInstance(objArr7);
                                                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                                                    byte[] bArr = new byte[1024];
                                                    while (true) {
                                                        int i2 = inputStream2.read(bArr);
                                                        if (i2 < 0) {
                                                            break;
                                                        } else {
                                                            bufferedOutputStream.write(bArr, 0, i2);
                                                        }
                                                        exc = e;
                                                        r11 = declaredConstructor;
                                                        if (i >= length) {
                                                            throw exc;
                                                        }
                                                    }
                                                    bufferedOutputStream.flush();
                                                    try {
                                                        objArr8 = new Object[1];
                                                        b(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, new char[]{'\n', 25, 65515, 65513, '\f'}, 4, 5, false, objArr8);
                                                    } catch (Throwable th32) {
                                                        th = th32;
                                                    }
                                                    try {
                                                        Object objInvoke6 = FileOutputStream.class.getMethod((String) objArr8[0], null).invoke(outputStream, null);
                                                        try {
                                                            objArr9 = new Object[1];
                                                            b(CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, new char[]{'\n', 4, 65524, 65535}, 2, 4, true, objArr9);
                                                        } catch (Throwable th33) {
                                                            th = th33;
                                                        }
                                                        try {
                                                            declaredConstructor = FileDescriptor.class.getMethod((String) objArr9[0], null);
                                                            declaredConstructor.invoke(objInvoke6, null);
                                                            bufferedOutputStream.close();
                                                            inputStream2.close();
                                                            try {
                                                                Object objInvoke7 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                try {
                                                                    Object[] objArr36 = new Object[1];
                                                                    a(new char[]{25436, 33050, 1334, 29472, 25403, 6863, 12834, 41073, 3582, 35609, 41849, 12956, 48809, 63582, 4531, 50144, 12157, 26270, 34558}, 0, objArr36);
                                                                    String str9 = (String) objArr36[0];
                                                                    declaredConstructor = 0;
                                                                    declaredConstructor = 0;
                                                                    declaredConstructor = 0;
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                Object[] objArr37 = {File.class.getMethod(str9, null).invoke(objNewInstance2, null), NativeLibrary.class.getClassLoader()};
                                                                                Object[] objArr38 = new Object[1];
                                                                                a(new char[]{18705, 50578, 41122, 34627, 18813, 24141, 38819, 21559}, 0, objArr38);
                                                                                declaredConstructor = (String) objArr38[0];
                                                                                Method declaredMethod5 = Runtime.class.getDeclaredMethod(declaredConstructor, String.class, ClassLoader.class);
                                                                                declaredMethod5.setAccessible(true);
                                                                                declaredMethod5.invoke(objInvoke7, objArr37);
                                                                            } catch (Exception unused3) {
                                                                                if (Build.VERSION.SDK_INT <= 27) {
                                                                                    try {
                                                                                        Object objInvoke8 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                        try {
                                                                                            Object[] objArr39 = new Object[1];
                                                                                            a(new char[]{25436, 33050, 1334, 29472, 25403, 6863, 12834, 41073, 3582, 35609, 41849, 12956, 48809, 63582, 4531, 50144, 12157, 26270, 34558}, 0, objArr39);
                                                                                            try {
                                                                                                Object[] objArr40 = {File.class.getMethod((String) objArr39[0], null).invoke(objNewInstance2, null), NativeLibrary.class.getClassLoader()};
                                                                                                Object[] objArr41 = new Object[1];
                                                                                                b(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA, new char[]{1, 1, '\f', 65513, '\f', 65534}, 1, 6, false, objArr41);
                                                                                                Method declaredMethod6 = Runtime.class.getDeclaredMethod((String) objArr41[0], String.class, ClassLoader.class);
                                                                                                declaredMethod6.setAccessible(true);
                                                                                                declaredMethod6.invoke(objInvoke8, objArr40);
                                                                                            } catch (Throwable th34) {
                                                                                                Throwable cause21 = th34.getCause();
                                                                                                if (cause21 == null) {
                                                                                                    throw th34;
                                                                                                }
                                                                                                throw cause21;
                                                                                            }
                                                                                        } catch (Throwable th35) {
                                                                                            Throwable cause22 = th35.getCause();
                                                                                            if (cause22 == null) {
                                                                                                throw th35;
                                                                                            }
                                                                                            throw cause22;
                                                                                        }
                                                                                    } catch (Throwable th36) {
                                                                                        Throwable cause23 = th36.getCause();
                                                                                        if (cause23 == null) {
                                                                                            throw th36;
                                                                                        }
                                                                                        throw cause23;
                                                                                    }
                                                                                } else {
                                                                                    try {
                                                                                        objInvoke = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                        try {
                                                                                            Object[] objArr42 = new Object[1];
                                                                                        } catch (Throwable th37) {
                                                                                            th = th37;
                                                                                        }
                                                                                        try {
                                                                                            a(new char[]{25436, 33050, 1334, 29472, 25403, 6863, 12834, 41073, 3582, 35609, 41849, 12956, 48809, 63582, 4531, 50144, 12157, 26270, 34558}, 0, objArr42);
                                                                                            Object objInvoke9 = File.class.getMethod((String) objArr42[0], null).invoke(objNewInstance2, null);
                                                                                            ClassLoader classLoader3 = NativeLibrary.class.getClassLoader();
                                                                                            try {
                                                                                                synchronized (objInvoke) {
                                                                                                }
                                                                                            } catch (Throwable th38) {
                                                                                                th = th38;
                                                                                            }
                                                                                        } catch (Throwable th39) {
                                                                                            th = th39;
                                                                                            Throwable th40 = th;
                                                                                            Throwable cause24 = th40.getCause();
                                                                                            if (cause24 == null) {
                                                                                                throw th40;
                                                                                            }
                                                                                            throw cause24;
                                                                                        }
                                                                                    } catch (Throwable th41) {
                                                                                        Throwable cause25 = th41.getCause();
                                                                                        if (cause25 == null) {
                                                                                            throw th41;
                                                                                        }
                                                                                        throw cause25;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } catch (Throwable th42) {
                                                                            Throwable cause26 = th42.getCause();
                                                                            if (cause26 == null) {
                                                                                throw th42;
                                                                            }
                                                                            throw cause26;
                                                                        }
                                                                    } catch (NoSuchMethodException unused4) {
                                                                        objInvoke = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                        Object[] objArr422 = new Object[1];
                                                                        a(new char[]{25436, 33050, 1334, 29472, 25403, 6863, 12834, 41073, 3582, 35609, 41849, 12956, 48809, 63582, 4531, 50144, 12157, 26270, 34558}, 0, objArr422);
                                                                        Object objInvoke92 = File.class.getMethod((String) objArr422[0], null).invoke(objNewInstance2, null);
                                                                        ClassLoader classLoader32 = NativeLibrary.class.getClassLoader();
                                                                        synchronized (objInvoke) {
                                                                            try {
                                                                                objArr10 = new Object[]{objInvoke92, classLoader32};
                                                                                objArr11 = new Object[1];
                                                                            } catch (Throwable th43) {
                                                                                th = th43;
                                                                            }
                                                                            try {
                                                                                a(new char[]{36168, 20299, 52642, 51159, 36134, 54426, 64182, 5294, 58366, 17758, 27598, 34408, 20649, 13855}, 0, objArr11);
                                                                                String str10 = (String) objArr11[0];
                                                                                Class[] clsArr6 = new Class[2];
                                                                                clsArr6[0] = String.class;
                                                                                clsArr6[1] = ClassLoader.class;
                                                                                Method declaredMethod7 = Runtime.class.getDeclaredMethod(str10, clsArr6);
                                                                                declaredMethod7.setAccessible(true);
                                                                                String str11 = (String) declaredMethod7.invoke(objInvoke, objArr10);
                                                                                if (str11 != null) {
                                                                                    throw new UnsatisfiedLinkError(str11);
                                                                                }
                                                                                try {
                                                                                } catch (Throwable th44) {
                                                                                    th = th44;
                                                                                    throw th;
                                                                                }
                                                                            } catch (Throwable th45) {
                                                                                th = th45;
                                                                                Throwable th46 = th;
                                                                                Throwable cause27 = th46.getCause();
                                                                                if (cause27 == null) {
                                                                                    throw th46;
                                                                                }
                                                                                throw cause27;
                                                                            }
                                                                        }
                                                                    }
                                                                    try {
                                                                        objArr12 = new Object[1];
                                                                        r11 = 0;
                                                                        r11 = 0;
                                                                    } catch (Throwable th47) {
                                                                        th = th47;
                                                                        r11 = 0;
                                                                    }
                                                                    try {
                                                                        a(new char[]{36160, 25797, 19247, 34961, 36132, 65296, 31779, 23524, 58356, 28368}, 0, objArr12);
                                                                        ((Boolean) File.class.getMethod((String) objArr12[0], null).invoke(objNewInstance2, null)).booleanValue();
                                                                    } catch (Throwable th48) {
                                                                        th = th48;
                                                                        Throwable th49 = th;
                                                                        try {
                                                                            Throwable cause28 = th49.getCause();
                                                                            if (cause28 == null) {
                                                                                throw th49;
                                                                            }
                                                                            throw cause28;
                                                                        } catch (Exception unused5) {
                                                                        }
                                                                    }
                                                                } catch (Throwable th50) {
                                                                    Throwable cause29 = th50.getCause();
                                                                    if (cause29 == null) {
                                                                        throw th50;
                                                                    }
                                                                    throw cause29;
                                                                }
                                                            } catch (Throwable th51) {
                                                                Throwable cause30 = th51.getCause();
                                                                if (cause30 == null) {
                                                                    throw th51;
                                                                }
                                                                throw cause30;
                                                            }
                                                        } catch (Throwable th52) {
                                                            th = th52;
                                                            Throwable th53 = th;
                                                            Throwable cause31 = th53.getCause();
                                                            if (cause31 == null) {
                                                                throw th53;
                                                            }
                                                            throw cause31;
                                                        }
                                                    } catch (Throwable th54) {
                                                        th = th54;
                                                        Throwable th55 = th;
                                                        Throwable cause32 = th55.getCause();
                                                        if (cause32 == null) {
                                                            throw th55;
                                                        }
                                                        throw cause32;
                                                    }
                                                } catch (Throwable th56) {
                                                    th = th56;
                                                    Throwable th57 = th;
                                                    Throwable cause33 = th57.getCause();
                                                    if (cause33 == null) {
                                                        throw th57;
                                                    }
                                                    throw cause33;
                                                }
                                            }
                                        } catch (Throwable th58) {
                                            th = th58;
                                            Throwable th59 = th;
                                            Throwable cause34 = th59.getCause();
                                            if (cause34 == null) {
                                                throw th59;
                                            }
                                            throw cause34;
                                        }
                                    } catch (Throwable th60) {
                                        th = th60;
                                        Throwable th61 = th;
                                        Throwable cause35 = th61.getCause();
                                        if (cause35 == null) {
                                            throw th61;
                                        }
                                        throw cause35;
                                    }
                                } catch (Throwable th62) {
                                    th = th62;
                                    Throwable th63 = th;
                                    Throwable cause36 = th63.getCause();
                                    if (cause36 == null) {
                                        throw th63;
                                    }
                                    throw cause36;
                                }
                                exc = e4;
                                r11 = 0;
                            } catch (Throwable th64) {
                                th = th64;
                                Throwable th65 = th;
                                Throwable cause37 = th65.getCause();
                                if (cause37 == null) {
                                    throw th65;
                                }
                                throw cause37;
                            }
                            if (i >= length) {
                            }
                        } else {
                            ClassLoader classLoader4 = NativeLibrary.class.getClassLoader();
                            Object[] objArr212 = {i < length ? str3 : str6};
                            byte b3 = (byte) (copydefault[4] - 1);
                            byte b22 = b3;
                            Object[] objArr222 = new Object[1];
                            c(b3, b22, b22, objArr222);
                            Method declaredMethod8 = ClassLoader.class.getDeclaredMethod((String) objArr222[0], String.class);
                            declaredMethod8.setAccessible(true);
                            str2 = (String) declaredMethod8.invoke(classLoader4, objArr212);
                            if (str2 != null) {
                            }
                            exc = e4;
                            r11 = 0;
                            if (i >= length) {
                            }
                        }
                        i++;
                        str3 = str;
                        r2 = r11;
                    } catch (Throwable th66) {
                        Throwable cause38 = th66.getCause();
                        if (cause38 == null) {
                            throw th66;
                        }
                        throw cause38;
                    }
                } catch (Throwable th67) {
                    Throwable cause39 = th67.getCause();
                    if (cause39 == null) {
                        throw th67;
                    }
                    throw cause39;
                }
            }
        } catch (Throwable th68) {
            Throwable cause40 = th68.getCause();
            if (cause40 == null) {
                throw th68;
            }
            throw cause40;
        }
    }
}
