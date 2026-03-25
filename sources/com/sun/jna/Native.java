package com.sun.jna;

import android.os.Build;
import android.os.Environment;
import androidx.exifinterface.media.ExifInterface;
import com.google.common.base.Ascii;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.Structure;
import java.awt.Component;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Window;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipFile;
import o.YY;
import o.Ze;
import o.Zn;
import o.Zr;
import o.Zs;

/* JADX INFO: loaded from: classes12.dex */
public final class Native implements Version {
    private static char[] AEQbTJ = null;
    public static final int BOOL_SIZE;
    static final int CB_HAS_INITIALIZER = 1;
    static final int CB_OPTION_DIRECT = 1;
    static final int CB_OPTION_IN_DLL = 2;
    private static final int CVT_ARRAY_BOOLEAN = 13;
    private static final int CVT_ARRAY_BYTE = 6;
    private static final int CVT_ARRAY_CHAR = 8;
    private static final int CVT_ARRAY_DOUBLE = 12;
    private static final int CVT_ARRAY_FLOAT = 11;
    private static final int CVT_ARRAY_INT = 9;
    private static final int CVT_ARRAY_LONG = 10;
    private static final int CVT_ARRAY_SHORT = 7;
    private static final int CVT_BOOLEAN = 14;
    private static final int CVT_BUFFER = 5;
    private static final int CVT_BYTE = 29;
    private static final int CVT_CALLBACK = 15;
    private static final int CVT_DEFAULT = 0;
    private static final int CVT_FLOAT = 16;
    private static final int CVT_INTEGER_TYPE = 21;
    private static final int CVT_JNIENV = 27;
    private static final int CVT_NATIVE_MAPPED = 17;
    private static final int CVT_NATIVE_MAPPED_STRING = 18;
    private static final int CVT_NATIVE_MAPPED_WSTRING = 19;
    private static final int CVT_OBJECT = 26;
    private static final int CVT_POINTER = 1;
    private static final int CVT_POINTER_TYPE = 22;
    private static final int CVT_SHORT = 28;
    private static final int CVT_STRING = 2;
    private static final int CVT_STRUCTURE = 3;
    private static final int CVT_STRUCTURE_BYVAL = 4;
    private static final int CVT_TYPE_MAPPER = 23;
    private static final int CVT_TYPE_MAPPER_STRING = 24;
    private static final int CVT_TYPE_MAPPER_WSTRING = 25;
    private static final int CVT_UNSUPPORTED = -1;
    private static final int CVT_WSTRING = 20;
    public static final boolean DEBUG_JNA_LOAD;
    private static final Level DEBUG_JNA_LOAD_LEVEL;
    public static final boolean DEBUG_LOAD;
    public static final Charset DEFAULT_CHARSET;
    public static final String DEFAULT_ENCODING;
    private static final Callback.UncaughtExceptionHandler DEFAULT_HANDLER;
    private static int EZpvd = 0;
    static final String JNA_TMPLIB_PREFIX = "jna";
    private static boolean KWHzl = false;
    private static final Logger LOG;
    public static final int LONG_DOUBLE_SIZE;
    public static final int LONG_SIZE;
    static final int MAX_ALIGNMENT;
    static final int MAX_PADDING;
    private static char[] OLrzqt = null;
    public static final int POINTER_SIZE;
    public static final int SIZE_T_SIZE;
    private static final int TYPE_BOOL = 4;
    private static final int TYPE_LONG = 1;
    private static final int TYPE_LONG_DOUBLE = 5;
    private static final int TYPE_SIZE_T = 3;
    private static final int TYPE_VOIDP = 0;
    private static final int TYPE_WCHAR_T = 2;
    public static final int WCHAR_SIZE;
    private static final String _OPTION_ENCLOSING_LIBRARY = "enclosing-library";
    private static Callback.UncaughtExceptionHandler callbackExceptionHandler;
    private static long copydefault;
    private static boolean djBIcL;
    private static final Object finalizer;
    static String jnidispatchPath;
    private static final Map<Class<?>, Reference<?>> libraries;
    private static final ThreadLocal<Memory> nativeThreadTerminationFlag;
    private static final Map<Thread, Pointer> nativeThreads;
    private static final Map<Class<?>, long[]> registeredClasses;
    private static final Map<Class<?>, NativeLibrary> registeredLibraries;
    private static final Map<Class<?>, Map<String, Object>> typeOptions;
    private static final byte[] AhwBna = {36, -15, -45, 66, -1, -3, Ascii.FF, Ascii.SUB, -27, 9, -14, 19, -15, -5};
    private static final int valueOf = 104;

    /* JADX INFO: loaded from: classes17.dex */
    public interface ffi_callback {
        void invoke(long j, long j2, long j3);
    }

    public static native long _getDirectBufferPointer(Buffer buffer);

    public static native long _getPointer(long j);

    public static native void close(long j);

    public static native synchronized long createNativeCallback(Callback callback, Method method, Class<?>[] clsArr, Class<?> cls, int i, int i2, String str);

    public static native void ffi_call(long j, long j2, long j3, long j4);

    public static native void ffi_free_closure(long j);

    public static native long ffi_prep_cif(int i, int i2, long j, long j2);

    public static native long ffi_prep_closure(long j, ffi_callback ffi_callbackVar);

    public static native long findSymbol(long j, String str);

    public static native void free(long j);

    public static native synchronized void freeNativeCallback(long j);

    public static native String getAPIChecksum();

    public static native byte getByte(Pointer pointer, long j, long j2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Callback.UncaughtExceptionHandler getCallbackExceptionHandler() {
        return callbackExceptionHandler;
    }

    public static native char getChar(Pointer pointer, long j, long j2);

    public static native ByteBuffer getDirectByteBuffer(Pointer pointer, long j, long j2, long j3);

    public static native double getDouble(Pointer pointer, long j, long j2);

    public static native float getFloat(Pointer pointer, long j, long j2);

    public static native int getInt(Pointer pointer, long j, long j2);

    public static native int getLastError();

    public static native long getLong(Pointer pointer, long j, long j2);

    public static native String getNativeVersion();

    public static native short getShort(Pointer pointer, long j, long j2);

    public static native byte[] getStringBytes(Pointer pointer, long j, long j2);

    public static native String getWideString(Pointer pointer, long j, long j2);

    public static native long getWindowHandle0(Component component);

    public static native long indexOf(Pointer pointer, long j, long j2, byte b);

    public static native void initIDs();

    public static native int initialize_ffi_type(long j);

    public static native double invokeDouble(Function function, long j, int i, Object[] objArr);

    public static native float invokeFloat(Function function, long j, int i, Object[] objArr);

    public static native int invokeInt(Function function, long j, int i, Object[] objArr);

    public static native long invokeLong(Function function, long j, int i, Object[] objArr);

    public static native Object invokeObject(Function function, long j, int i, Object[] objArr);

    public static native long invokePointer(Function function, long j, int i, Object[] objArr);

    public static native void invokeStructure(Function function, long j, int i, Object[] objArr, long j2, long j3);

    public static native void invokeVoid(Function function, long j, int i, Object[] objArr);

    public static native synchronized boolean isProtected();

    public static native long malloc(long j);

    public static native long open(String str, int i);

    public static native void read(Pointer pointer, long j, long j2, byte[] bArr, int i, int i2);

    public static native void read(Pointer pointer, long j, long j2, char[] cArr, int i, int i2);

    public static native void read(Pointer pointer, long j, long j2, double[] dArr, int i, int i2);

    public static native void read(Pointer pointer, long j, long j2, float[] fArr, int i, int i2);

    public static native void read(Pointer pointer, long j, long j2, int[] iArr, int i, int i2);

    public static native void read(Pointer pointer, long j, long j2, long[] jArr, int i, int i2);

    public static native void read(Pointer pointer, long j, long j2, short[] sArr, int i, int i2);

    public static native long registerMethod(Class<?> cls, String str, String str2, int[] iArr, long[] jArr, long[] jArr2, int i, long j, long j2, Method method, long j3, int i2, boolean z, ToNativeConverter[] toNativeConverterArr, FromNativeConverter fromNativeConverter, String str3);

    public static native void setByte(Pointer pointer, long j, long j2, byte b);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setCallbackExceptionHandler(Callback.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (uncaughtExceptionHandler == null) {
            uncaughtExceptionHandler = DEFAULT_HANDLER;
        }
        callbackExceptionHandler = uncaughtExceptionHandler;
    }

    public static native void setChar(Pointer pointer, long j, long j2, char c);

    public static native void setDetachState(boolean z, long j);

    public static native void setDouble(Pointer pointer, long j, long j2, double d);

    public static native void setFloat(Pointer pointer, long j, long j2, float f);

    public static native void setInt(Pointer pointer, long j, long j2, int i);

    public static native void setLastError(int i);

    public static native void setLong(Pointer pointer, long j, long j2, long j3);

    public static native void setMemory(Pointer pointer, long j, long j2, long j3, byte b);

    public static native void setPointer(Pointer pointer, long j, long j2, long j3);

    public static native synchronized void setProtected(boolean z);

    public static native void setShort(Pointer pointer, long j, long j2, short s);

    public static native void setWideString(Pointer pointer, long j, long j2, String str);

    public static native int sizeof(int i);

    public static native void unregister(Class<?> cls, long[] jArr);

    public static native void write(Pointer pointer, long j, long j2, byte[] bArr, int i, int i2);

    public static native void write(Pointer pointer, long j, long j2, char[] cArr, int i, int i2);

    public static native void write(Pointer pointer, long j, long j2, double[] dArr, int i, int i2);

    public static native void write(Pointer pointer, long j, long j2, float[] fArr, int i, int i2);

    public static native void write(Pointer pointer, long j, long j2, int[] iArr, int i, int i2);

    public static native void write(Pointer pointer, long j, long j2, long[] jArr, int i, int i2);

    public static native void write(Pointer pointer, long j, long j2, short[] sArr, int i, int i2);

    private static void a(char c, int i, int i2, Object[] objArr) {
        Zn zn = new Zn();
        long[] jArr = new long[i2];
        zn.EZpvd = 0;
        while (zn.EZpvd < i2) {
            int i3 = zn.EZpvd;
            jArr[i3] = (((long) ((char) (((long) OLrzqt[i + i3]) ^ 396884530129669254L))) ^ (((long) i3) * (396884530129669254L ^ copydefault))) ^ ((long) c);
            zn.EZpvd++;
        }
        char[] cArr = new char[i2];
        zn.EZpvd = 0;
        while (zn.EZpvd < i2) {
            cArr[zn.EZpvd] = (char) jArr[zn.EZpvd];
            zn.EZpvd++;
        }
        objArr[0] = new String(cArr);
    }

    static {
        Charset charsetForName;
        String property;
        AEQbTJ();
        LOG = Logger.getLogger(Native.class.getName());
        String property2 = System.getProperty("native.encoding");
        if (property2 != null) {
            try {
                charsetForName = Charset.forName(property2);
            } catch (Exception e) {
                LOG.log(Level.WARNING, "Failed to get charset for native.encoding value : '" + property2 + "'", (Throwable) e);
                charsetForName = null;
            }
        } else {
            charsetForName = null;
        }
        if (charsetForName == null) {
            charsetForName = Charset.defaultCharset();
        }
        DEFAULT_CHARSET = charsetForName;
        DEFAULT_ENCODING = charsetForName.name();
        DEBUG_LOAD = Boolean.getBoolean("jna.debug_load");
        boolean z = Boolean.getBoolean("jna.debug_load.jna");
        DEBUG_JNA_LOAD = z;
        DEBUG_JNA_LOAD_LEVEL = z ? Level.INFO : Level.FINE;
        jnidispatchPath = null;
        typeOptions = Collections.synchronizedMap(new WeakHashMap());
        libraries = Collections.synchronizedMap(new WeakHashMap());
        Callback.UncaughtExceptionHandler uncaughtExceptionHandler = new Callback.UncaughtExceptionHandler() { // from class: com.sun.jna.Native.1
            @Override // com.sun.jna.Callback.UncaughtExceptionHandler
            public void uncaughtException(Callback callback, Throwable th) {
                Native.LOG.log(Level.WARNING, "JNA: Callback " + callback + " threw the following exception", th);
            }
        };
        DEFAULT_HANDLER = uncaughtExceptionHandler;
        callbackExceptionHandler = uncaughtExceptionHandler;
        loadNativeDispatchLibrary();
        if (!isCompatibleVersion(Version.VERSION_NATIVE, getNativeVersion())) {
            String strLineSeparator = System.lineSeparator();
            StringBuilder sb = new StringBuilder();
            sb.append(strLineSeparator);
            sb.append(strLineSeparator);
            sb.append("There is an incompatible JNA native library installed on this system");
            sb.append(strLineSeparator);
            sb.append("Expected: ");
            sb.append(Version.VERSION_NATIVE);
            sb.append(strLineSeparator);
            sb.append("Found:    ");
            sb.append(getNativeVersion());
            sb.append(strLineSeparator);
            if (jnidispatchPath != null) {
                property = "(at " + jnidispatchPath + ")";
            } else {
                property = System.getProperty("java.library.path");
            }
            sb.append(property);
            sb.append(JwtUtilsKt.JWT_DELIMITER);
            sb.append(strLineSeparator);
            sb.append("To resolve this issue you may do one of the following:");
            sb.append(strLineSeparator);
            sb.append(" - remove or uninstall the offending library");
            sb.append(strLineSeparator);
            sb.append(" - set the system property jna.nosys=true");
            sb.append(strLineSeparator);
            sb.append(" - set jna.boot.library.path to include the path to the version of the ");
            sb.append(strLineSeparator);
            sb.append("   jnidispatch library included with the JNA jar file you are using");
            sb.append(strLineSeparator);
            throw new Error(sb.toString());
        }
        POINTER_SIZE = sizeof(0);
        int iSizeof = sizeof(1);
        LONG_SIZE = iSizeof;
        WCHAR_SIZE = sizeof(2);
        SIZE_T_SIZE = sizeof(3);
        BOOL_SIZE = sizeof(4);
        LONG_DOUBLE_SIZE = sizeof(5);
        initIDs();
        if (Boolean.getBoolean("jna.protected")) {
            setProtected(true);
        }
        if (Platform.isSPARC() || Platform.isWindows() || ((Platform.isLinux() && (Platform.isARM() || Platform.isPPC() || Platform.isMIPS() || Platform.isLoongArch())) || Platform.isAIX() || (Platform.isAndroid() && !Platform.isIntel()))) {
            iSizeof = 8;
        }
        MAX_ALIGNMENT = iSizeof;
        MAX_PADDING = (Platform.isMac() && Platform.isPPC()) ? 8 : iSizeof;
        System.setProperty("jna.loaded", "true");
        finalizer = new Object() { // from class: com.sun.jna.Native.2
            public void finalize() throws Throwable {
                Native.dispose();
                super.finalize();
            }
        };
        registeredClasses = new WeakHashMap();
        registeredLibraries = new WeakHashMap();
        nativeThreadTerminationFlag = new ThreadLocal<Memory>() { // from class: com.sun.jna.Native.7
            /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.lang.ThreadLocal
            public Memory initialValue() {
                Memory memory = new Memory(4L);
                memory.clear();
                return memory;
            }
        };
        nativeThreads = Collections.synchronizedMap(new WeakHashMap());
    }

    private static void b(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) {
        Ze ze = new Ze();
        char[] cArr2 = AEQbTJ;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                cArr3[i2] = (char) (((long) cArr2[i2]) ^ 5452877452951418167L);
            }
            cArr2 = cArr3;
        }
        int i3 = (int) (5452877452951418167L ^ ((long) EZpvd));
        if (djBIcL) {
            ze.copydefault = bArr.length;
            char[] cArr4 = new char[ze.copydefault];
            ze.AEQbTJ = 0;
            while (ze.AEQbTJ < ze.copydefault) {
                cArr4[ze.AEQbTJ] = (char) (cArr2[bArr[(ze.copydefault - 1) - ze.AEQbTJ] + i] - i3);
                ze.AEQbTJ++;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (KWHzl) {
            ze.copydefault = cArr.length;
            char[] cArr5 = new char[ze.copydefault];
            ze.AEQbTJ = 0;
            while (ze.AEQbTJ < ze.copydefault) {
                cArr5[ze.AEQbTJ] = (char) (cArr2[cArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - i3);
                ze.AEQbTJ++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        ze.copydefault = iArr.length;
        char[] cArr6 = new char[ze.copydefault];
        ze.AEQbTJ = 0;
        while (ze.AEQbTJ < ze.copydefault) {
            cArr6[ze.AEQbTJ] = (char) (cArr2[iArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - i3);
            ze.AEQbTJ++;
        }
        objArr[0] = new String(cArr6);
    }

    public static boolean isCompatibleVersion(String str, String str2) {
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        if (strArrSplit.length < 3 || strArrSplit2.length < 3) {
            return false;
        }
        return Integer.parseInt(strArrSplit[0]) == Integer.parseInt(strArrSplit2[0]) && Integer.parseInt(strArrSplit[1]) <= Integer.parseInt(strArrSplit2[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dispose() {
        CallbackReference.disposeAll();
        Memory.disposeAll();
        NativeLibrary.disposeAll();
        unregisterAll();
        jnidispatchPath = null;
        System.setProperty("jna.loaded", "false");
    }

    public static boolean deleteLibrary(File file) {
        if (file.delete()) {
            return true;
        }
        markTemporaryFile(file);
        return false;
    }

    private Native() {
    }

    public static long getWindowID(Window window) throws HeadlessException {
        return AWT.getWindowID(window);
    }

    public static long getComponentID(Component component) throws HeadlessException {
        return AWT.getComponentID(component);
    }

    public static Pointer getWindowPointer(Window window) throws HeadlessException {
        return new Pointer(AWT.getWindowID(window));
    }

    public static Pointer getComponentPointer(Component component) throws HeadlessException {
        return new Pointer(AWT.getComponentID(component));
    }

    public static Pointer getDirectBufferPointer(Buffer buffer) {
        long j_getDirectBufferPointer = _getDirectBufferPointer(buffer);
        if (j_getDirectBufferPointer == 0) {
            return null;
        }
        return new Pointer(j_getDirectBufferPointer);
    }

    private static Charset getCharset(String str) {
        Charset charsetForName;
        if (str != null) {
            try {
                charsetForName = Charset.forName(str);
            } catch (IllegalCharsetNameException | UnsupportedCharsetException e) {
                LOG.log(Level.WARNING, "JNA Warning: Encoding ''{0}'' is unsupported ({1})", new Object[]{str, e.getMessage()});
                charsetForName = null;
            }
        } else {
            charsetForName = null;
        }
        if (charsetForName != null) {
            return charsetForName;
        }
        Logger logger = LOG;
        Level level = Level.WARNING;
        Charset charset = DEFAULT_CHARSET;
        logger.log(level, "JNA Warning: Using fallback encoding {0}", charset);
        return charset;
    }

    public static String toString(byte[] bArr) {
        return toString(bArr, getDefaultStringEncoding());
    }

    public static String toString(byte[] bArr, String str) {
        return toString(bArr, getCharset(str));
    }

    public static String toString(byte[] bArr, Charset charset) {
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (bArr[i] == 0) {
                length = i;
                break;
            }
            i++;
        }
        return length == 0 ? "" : new String(bArr, 0, length, charset);
    }

    public static String toString(char[] cArr) {
        int length = cArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (cArr[i] == 0) {
                length = i;
                break;
            }
            i++;
        }
        return length == 0 ? "" : new String(cArr, 0, length);
    }

    public static List<String> toStringList(char[] cArr) {
        return toStringList(cArr, 0, cArr.length);
    }

    public static List<String> toStringList(char[] cArr, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            if (cArr[i] == 0) {
                if (i4 == i) {
                    return arrayList;
                }
                arrayList.add(new String(cArr, i4, i - i4));
                i4 = i + 1;
            }
            i++;
        }
        if (i4 < i3) {
            arrayList.add(new String(cArr, i4, i3 - i4));
        }
        return arrayList;
    }

    public static <T extends Library> T load(Class<T> cls) {
        return (T) load((String) null, cls);
    }

    public static <T extends Library> T load(Class<T> cls, Map<String, ?> map) {
        return (T) load(null, cls, map);
    }

    public static <T extends Library> T load(String str, Class<T> cls) {
        return (T) load(str, cls, Collections.emptyMap());
    }

    public static <T extends Library> T load(String str, Class<T> cls, Map<String, ?> map) {
        if (!Library.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Interface (" + cls.getSimpleName() + ") of library=" + str + " does not extend " + Library.class.getSimpleName());
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new Library.Handler(str, cls, map));
        cacheOptions(cls, map, objNewProxyInstance);
        return cls.cast(objNewProxyInstance);
    }

    @Deprecated
    public static <T> T loadLibrary(Class<T> cls) {
        return (T) loadLibrary((String) null, cls);
    }

    @Deprecated
    public static <T> T loadLibrary(Class<T> cls, Map<String, ?> map) {
        return (T) loadLibrary(null, cls, map);
    }

    @Deprecated
    public static <T> T loadLibrary(String str, Class<T> cls) {
        return (T) loadLibrary(str, cls, Collections.emptyMap());
    }

    @Deprecated
    public static <T> T loadLibrary(String str, Class<T> cls, Map<String, ?> map) {
        if (!Library.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Interface (" + cls.getSimpleName() + ") of library=" + str + " does not extend " + Library.class.getSimpleName());
        }
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new Library.Handler(str, cls, map));
        cacheOptions(cls, map, objNewProxyInstance);
        return cls.cast(objNewProxyInstance);
    }

    private static void loadLibraryInstance(Class<?> cls) {
        if (cls == null || libraries.containsKey(cls)) {
            return;
        }
        try {
            for (Field field : cls.getFields()) {
                if (field.getType() == cls && Modifier.isStatic(field.getModifiers())) {
                    field.setAccessible(true);
                    libraries.put(cls, new WeakReference(field.get(null)));
                    return;
                }
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Could not access instance of " + cls + " (" + e + ")");
        }
    }

    public static Class<?> findEnclosingLibraryClass(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        Map<String, Object> map = typeOptions.get(cls);
        if (map != null) {
            Class<?> cls2 = (Class) map.get(_OPTION_ENCLOSING_LIBRARY);
            return cls2 != null ? cls2 : cls;
        }
        if (Library.class.isAssignableFrom(cls)) {
            return cls;
        }
        if (Callback.class.isAssignableFrom(cls)) {
            cls = CallbackReference.findCallbackClass(cls);
        }
        Class<?> clsFindEnclosingLibraryClass = findEnclosingLibraryClass(cls.getDeclaringClass());
        return clsFindEnclosingLibraryClass != null ? clsFindEnclosingLibraryClass : findEnclosingLibraryClass(cls.getSuperclass());
    }

    public static Map<String, Object> getLibraryOptions(Class<?> cls) {
        Map mapEmptyMap;
        Map<Class<?>, Map<String, Object>> map = typeOptions;
        Map<String, Object> map2 = map.get(cls);
        if (map2 != null) {
            return map2;
        }
        Class<?> clsFindEnclosingLibraryClass = findEnclosingLibraryClass(cls);
        if (clsFindEnclosingLibraryClass != null) {
            loadLibraryInstance(clsFindEnclosingLibraryClass);
        } else {
            clsFindEnclosingLibraryClass = cls;
        }
        Map<String, Object> map3 = map.get(clsFindEnclosingLibraryClass);
        if (map3 != null) {
            map.put(cls, map3);
            return map3;
        }
        try {
            Field field = clsFindEnclosingLibraryClass.getField("OPTIONS");
            field.setAccessible(true);
            mapEmptyMap = (Map) field.get(null);
            if (mapEmptyMap == null) {
                throw new IllegalStateException("Null options field");
            }
        } catch (NoSuchFieldException unused) {
            mapEmptyMap = Collections.emptyMap();
        } catch (Exception e) {
            throw new IllegalArgumentException("OPTIONS must be a public field of type java.util.Map (" + e + "): " + clsFindEnclosingLibraryClass);
        }
        HashMap map4 = new HashMap(mapEmptyMap);
        if (!map4.containsKey(Library.OPTION_TYPE_MAPPER)) {
            map4.put(Library.OPTION_TYPE_MAPPER, lookupField(clsFindEnclosingLibraryClass, "TYPE_MAPPER", TypeMapper.class));
        }
        if (!map4.containsKey(Library.OPTION_STRUCTURE_ALIGNMENT)) {
            map4.put(Library.OPTION_STRUCTURE_ALIGNMENT, lookupField(clsFindEnclosingLibraryClass, "STRUCTURE_ALIGNMENT", Integer.class));
        }
        if (!map4.containsKey(Library.OPTION_STRING_ENCODING)) {
            map4.put(Library.OPTION_STRING_ENCODING, lookupField(clsFindEnclosingLibraryClass, "STRING_ENCODING", String.class));
        }
        Map<String, Object> mapCacheOptions = cacheOptions(clsFindEnclosingLibraryClass, map4, null);
        if (cls != clsFindEnclosingLibraryClass) {
            typeOptions.put(cls, mapCacheOptions);
        }
        return mapCacheOptions;
    }

    private static Object lookupField(Class<?> cls, String str, Class<?> cls2) {
        try {
            Field field = cls.getField(str);
            field.setAccessible(true);
            return field.get(null);
        } catch (NoSuchFieldException unused) {
            return null;
        } catch (Exception e) {
            throw new IllegalArgumentException(str + " must be a public field of type " + cls2.getName() + " (" + e + "): " + cls);
        }
    }

    public static TypeMapper getTypeMapper(Class<?> cls) {
        return (TypeMapper) getLibraryOptions(cls).get(Library.OPTION_TYPE_MAPPER);
    }

    public static String getStringEncoding(Class<?> cls) {
        String str = (String) getLibraryOptions(cls).get(Library.OPTION_STRING_ENCODING);
        return str != null ? str : getDefaultStringEncoding();
    }

    public static String getDefaultStringEncoding() {
        return System.getProperty("jna.encoding", DEFAULT_ENCODING);
    }

    public static int getStructureAlignment(Class<?> cls) {
        Integer num = (Integer) getLibraryOptions(cls).get(Library.OPTION_STRUCTURE_ALIGNMENT);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static byte[] getBytes(String str) {
        return getBytes(str, getDefaultStringEncoding());
    }

    public static byte[] getBytes(String str, String str2) {
        return getBytes(str, getCharset(str2));
    }

    public static byte[] getBytes(String str, Charset charset) {
        return str.getBytes(charset);
    }

    public static byte[] toByteArray(String str) {
        return toByteArray(str, getDefaultStringEncoding());
    }

    public static byte[] toByteArray(String str, String str2) {
        return toByteArray(str, getCharset(str2));
    }

    public static byte[] toByteArray(String str, Charset charset) {
        byte[] bytes = getBytes(str, charset);
        byte[] bArr = new byte[bytes.length + 1];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    public static char[] toCharArray(String str) {
        char[] charArray = str.toCharArray();
        char[] cArr = new char[charArray.length + 1];
        System.arraycopy(charArray, 0, cArr, 0, charArray.length);
        return cArr;
    }

    private static void loadNativeDispatchLibrary() throws Exception {
        if (!Boolean.getBoolean("jna.nounpack")) {
            try {
                removeTemporaryFiles();
            } catch (IOException e) {
                LOG.log(Level.WARNING, "JNA Warning: IOException removing temporary files", (Throwable) e);
            }
        }
        String property = System.getProperty("jna.boot.library.name", "jnidispatch");
        String property2 = System.getProperty("jna.boot.library.path");
        if (property2 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property2, File.pathSeparator);
            while (stringTokenizer.hasMoreTokens()) {
                File file = new File(new File(stringTokenizer.nextToken()), System.mapLibraryName(property).replace(".dylib", ".jnilib"));
                String absolutePath = file.getAbsolutePath();
                Logger logger = LOG;
                Level level = DEBUG_JNA_LOAD_LEVEL;
                logger.log(level, "Looking in {0}", absolutePath);
                if (file.exists()) {
                    try {
                        logger.log(level, "Trying {0}", absolutePath);
                        System.setProperty("jnidispatch.path", absolutePath);
                        KWHzl(absolutePath);
                        jnidispatchPath = absolutePath;
                        logger.log(level, "Found jnidispatch at {0}", absolutePath);
                        return;
                    } catch (UnsatisfiedLinkError unused) {
                    }
                }
                if (Platform.isMac()) {
                    String str = "dylib";
                    String str2 = "jnilib";
                    if (!absolutePath.endsWith("dylib")) {
                        str2 = "dylib";
                        str = "jnilib";
                    }
                    String str3 = absolutePath.substring(0, absolutePath.lastIndexOf(str)) + str2;
                    Logger logger2 = LOG;
                    Level level2 = DEBUG_JNA_LOAD_LEVEL;
                    logger2.log(level2, "Looking in {0}", str3);
                    if (new File(str3).exists()) {
                        try {
                            logger2.log(level2, "Trying {0}", str3);
                            System.setProperty("jnidispatch.path", str3);
                            KWHzl(str3);
                            jnidispatchPath = str3;
                            logger2.log(level2, "Found jnidispatch at {0}", str3);
                            return;
                        } catch (UnsatisfiedLinkError e2) {
                            LOG.log(Level.WARNING, "File found at " + str3 + " but not loadable: " + e2.getMessage(), (Throwable) e2);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!Boolean.parseBoolean(System.getProperty("jna.nosys", "true")) || Platform.isAndroid()) {
            try {
                Logger logger3 = LOG;
                Level level3 = DEBUG_JNA_LOAD_LEVEL;
                logger3.log(level3, "Trying (via loadLibrary) {0}", property);
                EZpvd(property);
                logger3.log(level3, "Found jnidispatch on system path");
                return;
            } catch (UnsatisfiedLinkError unused2) {
            }
        }
        if (!Boolean.getBoolean("jna.noclasspath")) {
            loadNativeDispatchLibraryFromClasspath();
            return;
        }
        throw new UnsatisfiedLinkError("Unable to locate JNA native support library");
    }

    private static void loadNativeDispatchLibraryFromClasspath() throws Exception {
        try {
            String strReplace = System.mapLibraryName("jnidispatch").replace(".dylib", ".jnilib");
            if (Platform.isAIX()) {
                strReplace = "libjnidispatch.a";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("/com/sun/jna/");
            sb.append(Platform.RESOURCE_PREFIX);
            Object[] objArr = new Object[1];
            a((char) 6931, 0, 1, objArr);
            sb.append((String) objArr[0]);
            sb.append(strReplace);
            File fileExtractFromResourcePath = extractFromResourcePath(sb.toString(), Native.class.getClassLoader());
            if (fileExtractFromResourcePath == null && fileExtractFromResourcePath == null) {
                throw new UnsatisfiedLinkError("Could not find JNA native support");
            }
            Logger logger = LOG;
            Level level = DEBUG_JNA_LOAD_LEVEL;
            logger.log(level, "Trying {0}", fileExtractFromResourcePath.getAbsolutePath());
            System.setProperty("jnidispatch.path", fileExtractFromResourcePath.getAbsolutePath());
            KWHzl(fileExtractFromResourcePath.getAbsolutePath());
            String absolutePath = fileExtractFromResourcePath.getAbsolutePath();
            jnidispatchPath = absolutePath;
            logger.log(level, "Found jnidispatch at {0}", absolutePath);
            if (!isUnpacked(fileExtractFromResourcePath) || Boolean.getBoolean("jnidispatch.preserve")) {
                return;
            }
            deleteLibrary(fileExtractFromResourcePath);
        } catch (IOException e) {
            throw new UnsatisfiedLinkError(e.getMessage());
        }
    }

    public static boolean isUnpacked(File file) {
        return file.getName().startsWith(JNA_TMPLIB_PREFIX);
    }

    public static File extractFromResourcePath(String str) throws IOException {
        return extractFromResourcePath(str, null);
    }

    public static File extractFromResourcePath(String str, ClassLoader classLoader) throws Throwable {
        String strSubstring;
        File file;
        FileOutputStream fileOutputStream;
        Object[] objArr = new Object[1];
        a((char) 6931, 0, 1, objArr);
        String str2 = (String) objArr[0];
        Level level = (DEBUG_LOAD || (DEBUG_JNA_LOAD && str.contains("jnidispatch"))) ? Level.INFO : Level.FINE;
        if (classLoader == null && (classLoader = Thread.currentThread().getContextClassLoader()) == null) {
            classLoader = Native.class.getClassLoader();
        }
        Logger logger = LOG;
        logger.log(level, "Looking in classpath from {0} for {1}", new Object[]{classLoader, str});
        String strMapSharedLibraryName = str.startsWith(str2) ? str : NativeLibrary.mapSharedLibraryName(str);
        if (str.startsWith(str2)) {
            strSubstring = str;
        } else {
            strSubstring = Platform.RESOURCE_PREFIX + str2 + strMapSharedLibraryName;
        }
        if (strSubstring.startsWith(str2)) {
            strSubstring = strSubstring.substring(1);
        }
        URL resource = classLoader.getResource(strSubstring);
        if (resource == null) {
            String str3 = Platform.RESOURCE_PREFIX;
            if (strSubstring.startsWith(str3)) {
                if (str3.startsWith("darwin")) {
                    resource = classLoader.getResource("darwin/" + strSubstring.substring(str3.length() + 1));
                }
                if (resource == null) {
                    resource = classLoader.getResource(strMapSharedLibraryName);
                }
            } else {
                if (strSubstring.startsWith("com/sun/jna/" + str3 + str2)) {
                    if (str3.startsWith("com/sun/jna/darwin")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("com/sun/jna/darwin");
                        sb.append(strSubstring.substring(("com/sun/jna/" + str3).length() + 1));
                        resource = classLoader.getResource(sb.toString());
                    }
                    if (resource == null) {
                        resource = classLoader.getResource(strMapSharedLibraryName);
                    }
                }
            }
        }
        if (resource == null) {
            String property = System.getProperty("java.class.path");
            if (classLoader instanceof URLClassLoader) {
                property = Arrays.asList(((URLClassLoader) classLoader).getURLs()).toString();
            }
            throw new IOException("Native library (" + strSubstring + ") not found in resource path (" + property + ")");
        }
        logger.log(level, "Found library resource at {0}", resource);
        if (resource.getProtocol().toLowerCase().equals("file")) {
            try {
                file = new File(new URI(resource.toString()));
            } catch (URISyntaxException unused) {
                file = new File(resource.getPath());
            }
            LOG.log(level, "Looking in {0}", file.getAbsolutePath());
            if (file.exists()) {
                return file;
            }
            throw new IOException("File URL " + resource + " could not be properly decoded");
        }
        if (Boolean.getBoolean("jna.nounpack")) {
            return null;
        }
        InputStream inputStreamOpenStream = resource.openStream();
        try {
            if (inputStreamOpenStream == null) {
                throw new IOException("Can't obtain InputStream for " + strSubstring);
            }
            try {
                File fileCreateTempFile = File.createTempFile(JNA_TMPLIB_PREFIX, Platform.isWindows() ? ".dll" : null, getTempDir());
                if (!Boolean.getBoolean("jnidispatch.preserve")) {
                    fileCreateTempFile.deleteOnExit();
                }
                logger.log(level, "Extracting library to {0}", fileCreateTempFile.getAbsolutePath());
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamOpenStream.read(bArr, 0, 1024);
                        if (i > 0) {
                            fileOutputStream.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (IOException unused2) {
                            }
                        }
                    }
                    inputStreamOpenStream.close();
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                    return fileCreateTempFile;
                } catch (IOException e) {
                    e = e;
                    throw new IOException("Failed to create temporary file for " + str + " library: " + e.getMessage());
                } catch (Throwable th) {
                    th = th;
                    try {
                        inputStreamOpenStream.close();
                    } catch (IOException unused4) {
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException unused5) {
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    public static Library synchronizedLibrary(final Library library) {
        Class<?> cls = library.getClass();
        if (!Proxy.isProxyClass(cls)) {
            throw new IllegalArgumentException("Library must be a proxy class");
        }
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(library);
        if (!(invocationHandler instanceof Library.Handler)) {
            throw new IllegalArgumentException("Unrecognized proxy handler: " + invocationHandler);
        }
        final Library.Handler handler = (Library.Handler) invocationHandler;
        return (Library) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new InvocationHandler() { // from class: com.sun.jna.Native.3
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                Object objInvoke;
                synchronized (handler.getNativeLibrary()) {
                    objInvoke = handler.invoke(library, method, objArr);
                }
                return objInvoke;
            }
        });
    }

    public static String getWebStartLibraryPath(String str) {
        if (System.getProperty("javawebstart.version") == null) {
            return null;
        }
        try {
            String str2 = (String) ((Method) AccessController.doPrivileged(new PrivilegedAction<Method>() { // from class: com.sun.jna.Native.4
                /* JADX DEBUG: Method merged with bridge method: run()Ljava/lang/Object; */
                @Override // java.security.PrivilegedAction
                public Method run() {
                    try {
                        Method declaredMethod = ClassLoader.class.getDeclaredMethod("findLibrary", String.class);
                        declaredMethod.setAccessible(true);
                        return declaredMethod;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            })).invoke(Native.class.getClassLoader(), str);
            if (str2 != null) {
                return new File(str2).getParent();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static void markTemporaryFile(File file) {
        try {
            new File(file.getParentFile(), file.getName() + ".x").createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File getTempDir() throws IOException {
        File file;
        File file2;
        File file3;
        String property = System.getProperty("jna.tmpdir");
        if (property != null) {
            file = new File(property);
            file.mkdirs();
        } else {
            Object[] objArr = new Object[1];
            b(null, null, 127, new byte[]{-117, -123, -118, -119, -120, -121, -124, -122, -123, -124, -126, -125, -126, -127}, objArr);
            file = new File(System.getProperty((String) objArr[0]));
            if (Platform.isMac()) {
                file3 = new File(System.getProperty("user.home"), "Library/Caches/JNA/temp");
            } else if (Platform.isLinux() || Platform.isSolaris() || Platform.isAIX() || Platform.isDragonFlyBSD() || Platform.isFreeBSD() || Platform.isNetBSD() || Platform.isOpenBSD() || Platform.iskFreeBSD()) {
                String str = System.getenv("XDG_CACHE_HOME");
                if (str == null || str.trim().isEmpty()) {
                    file2 = new File(System.getProperty("user.home"), ".cache");
                } else {
                    file2 = new File(str);
                }
                file3 = new File(file2, "JNA/temp");
            } else {
                file3 = new File(file, "jna-" + System.getProperty("user.name").hashCode());
            }
            file3.mkdirs();
            if (file3.exists() && file3.canWrite()) {
                file = file3;
            }
        }
        if (!file.exists()) {
            throw new IOException("JNA temporary directory '" + file + "' does not exist");
        }
        if (file.canWrite()) {
            return file;
        }
        throw new IOException("JNA temporary directory '" + file + "' is not writable");
    }

    public static void removeTemporaryFiles() throws IOException {
        File[] fileArrListFiles = getTempDir().listFiles(new FilenameFilter() { // from class: com.sun.jna.Native.5
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.endsWith(".x") && str.startsWith(Native.JNA_TMPLIB_PREFIX);
            }
        });
        for (int i = 0; fileArrListFiles != null && i < fileArrListFiles.length; i++) {
            File file = fileArrListFiles[i];
            File file2 = new File(file.getParentFile(), file.getName().substring(0, r4.length() - 2));
            if (!file2.exists() || file2.delete()) {
                file.delete();
            }
        }
    }

    public static int getNativeSize(Class<?> cls, Object obj) {
        if (cls.isArray()) {
            int length = Array.getLength(obj);
            if (length > 0) {
                return length * getNativeSize(cls.getComponentType(), Array.get(obj, 0));
            }
            throw new IllegalArgumentException("Arrays of length zero not allowed: " + cls);
        }
        if (Structure.class.isAssignableFrom(cls) && !Structure.ByReference.class.isAssignableFrom(cls)) {
            return Structure.size(cls, (Structure) obj);
        }
        try {
            return getNativeSize(cls);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("The type \"" + cls.getName() + "\" is not supported: " + e.getMessage());
        }
    }

    public static int getNativeSize(Class<?> cls) {
        if (NativeMapped.class.isAssignableFrom(cls)) {
            cls = NativeMappedConverter.getInstance(cls).nativeType();
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return 4;
        }
        if (cls == Byte.TYPE || cls == Byte.class) {
            return 1;
        }
        if (cls == Short.TYPE || cls == Short.class) {
            return 2;
        }
        if (cls == Character.TYPE || cls == Character.class) {
            return WCHAR_SIZE;
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            return 4;
        }
        if (cls == Long.TYPE || cls == Long.class) {
            return 8;
        }
        if (cls == Float.TYPE || cls == Float.class) {
            return 4;
        }
        if (cls == Double.TYPE || cls == Double.class) {
            return 8;
        }
        if (Structure.class.isAssignableFrom(cls)) {
            return Structure.ByValue.class.isAssignableFrom(cls) ? Structure.size(cls) : POINTER_SIZE;
        }
        if (Pointer.class.isAssignableFrom(cls) || ((Platform.HAS_BUFFERS && Buffers.isBuffer(cls)) || Callback.class.isAssignableFrom(cls) || String.class == cls || WString.class == cls)) {
            return POINTER_SIZE;
        }
        throw new IllegalArgumentException("Native size for type \"" + cls.getName() + "\" is unknown");
    }

    public static boolean isSupportedNativeType(Class<?> cls) {
        if (Structure.class.isAssignableFrom(cls)) {
            return true;
        }
        try {
            return getNativeSize(cls) != 0;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static void register(String str) {
        register(findDirectMappedClass(getCallingClass()), str);
    }

    public static void register(NativeLibrary nativeLibrary) {
        register(findDirectMappedClass(getCallingClass()), nativeLibrary);
    }

    public static Class<?> findDirectMappedClass(Class<?> cls) {
        for (Method method : cls.getDeclaredMethods()) {
            if ((method.getModifiers() & 256) != 0) {
                return cls;
            }
        }
        int iLastIndexOf = cls.getName().lastIndexOf("$");
        if (iLastIndexOf != -1) {
            try {
                return findDirectMappedClass(Class.forName(cls.getName().substring(0, iLastIndexOf), true, cls.getClassLoader()));
            } catch (ClassNotFoundException unused) {
            }
        }
        throw new IllegalArgumentException("Can't determine class with native methods from the current context (" + cls + ")");
    }

    public static Class<?> getCallingClass() {
        Class<?>[] classContext = new SecurityManager() { // from class: com.sun.jna.Native.6
            @Override // java.lang.SecurityManager
            public Class<?>[] getClassContext() {
                return super.getClassContext();
            }
        }.getClassContext();
        if (classContext == null) {
            throw new IllegalStateException("The SecurityManager implementation on this platform is broken; you must explicitly provide the class to register");
        }
        if (classContext.length < 4) {
            throw new IllegalStateException("This method must be called from the static initializer of a class");
        }
        return classContext[3];
    }

    public static void setCallbackThreadInitializer(Callback callback, CallbackThreadInitializer callbackThreadInitializer) {
        CallbackReference.setCallbackThreadInitializer(callback, callbackThreadInitializer);
    }

    private static void unregisterAll() {
        Map<Class<?>, long[]> map = registeredClasses;
        synchronized (map) {
            for (Map.Entry<Class<?>, long[]> entry : map.entrySet()) {
                unregister(entry.getKey(), entry.getValue());
            }
            registeredClasses.clear();
        }
    }

    public static void unregister() {
        unregister(findDirectMappedClass(getCallingClass()));
    }

    public static void unregister(Class<?> cls) {
        Map<Class<?>, long[]> map = registeredClasses;
        synchronized (map) {
            long[] jArr = map.get(cls);
            if (jArr != null) {
                unregister(cls, jArr);
                map.remove(cls);
                registeredLibraries.remove(cls);
            }
        }
    }

    public static boolean registered(Class<?> cls) {
        boolean zContainsKey;
        Map<Class<?>, long[]> map = registeredClasses;
        synchronized (map) {
            zContainsKey = map.containsKey(cls);
        }
        return zContainsKey;
    }

    public static String getSignature(Class<?> cls) {
        if (cls.isArray()) {
            return "[" + getSignature(cls.getComponentType());
        }
        if (cls.isPrimitive()) {
            if (cls == Void.TYPE) {
                return ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
            }
            if (cls == Boolean.TYPE) {
                return "Z";
            }
            if (cls == Byte.TYPE) {
                return "B";
            }
            if (cls == Short.TYPE) {
                return ExifInterface.LATITUDE_SOUTH;
            }
            if (cls == Character.TYPE) {
                return "C";
            }
            if (cls == Integer.TYPE) {
                return "I";
            }
            if (cls == Long.TYPE) {
                return "J";
            }
            if (cls == Float.TYPE) {
                return "F";
            }
            if (cls == Double.TYPE) {
                return "D";
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("L");
        Object[] objArr = new Object[1];
        a((char) 6931, 0, 1, objArr);
        sb.append(replace(JwtUtilsKt.JWT_DELIMITER, (String) objArr[0], cls.getName()));
        sb.append(";");
        return sb.toString();
    }

    public static String replace(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int iIndexOf = str3.indexOf(str);
            if (iIndexOf == -1) {
                sb.append(str3);
                return sb.toString();
            }
            sb.append(str3.substring(0, iIndexOf));
            sb.append(str2);
            str3 = str3.substring(iIndexOf + str.length());
        }
    }

    private static int getConversion(Class<?> cls, TypeMapper typeMapper, boolean z) {
        if (cls == Void.class) {
            cls = Void.TYPE;
        }
        if (typeMapper != null) {
            FromNativeConverter fromNativeConverter = typeMapper.getFromNativeConverter(cls);
            ToNativeConverter toNativeConverter = typeMapper.getToNativeConverter(cls);
            if (fromNativeConverter != null) {
                Class<?> clsNativeType = fromNativeConverter.nativeType();
                if (clsNativeType == String.class) {
                    return 24;
                }
                return clsNativeType == WString.class ? 25 : 23;
            }
            if (toNativeConverter != null) {
                Class<?> clsNativeType2 = toNativeConverter.nativeType();
                if (clsNativeType2 == String.class) {
                    return 24;
                }
                return clsNativeType2 == WString.class ? 25 : 23;
            }
        }
        if (Pointer.class.isAssignableFrom(cls)) {
            return 1;
        }
        if (String.class == cls) {
            return 2;
        }
        if (WString.class.isAssignableFrom(cls)) {
            return 20;
        }
        if (Platform.HAS_BUFFERS && Buffers.isBuffer(cls)) {
            return 5;
        }
        if (Structure.class.isAssignableFrom(cls)) {
            return Structure.ByValue.class.isAssignableFrom(cls) ? 4 : 3;
        }
        if (cls.isArray()) {
            char cCharAt = cls.getName().charAt(1);
            if (cCharAt == 'F') {
                return 11;
            }
            if (cCharAt == 'S') {
                return 7;
            }
            if (cCharAt == 'Z') {
                return 13;
            }
            if (cCharAt == 'I') {
                return 9;
            }
            if (cCharAt == 'J') {
                return 10;
            }
            switch (cCharAt) {
                case 'B':
                    return 6;
                case 'C':
                    return 8;
                case 'D':
                    return 12;
            }
        }
        if (cls.isPrimitive()) {
            return cls == Boolean.TYPE ? 14 : 0;
        }
        if (Callback.class.isAssignableFrom(cls)) {
            return 15;
        }
        if (IntegerType.class.isAssignableFrom(cls)) {
            return 21;
        }
        if (PointerType.class.isAssignableFrom(cls)) {
            return 22;
        }
        if (!NativeMapped.class.isAssignableFrom(cls)) {
            if (JNIEnv.class == cls) {
                return 27;
            }
            return z ? 26 : -1;
        }
        Class<?> clsNativeType3 = NativeMappedConverter.getInstance(cls).nativeType();
        if (clsNativeType3 == String.class) {
            return 18;
        }
        return clsNativeType3 == WString.class ? 19 : 17;
    }

    public static void register(Class<?> cls, String str) {
        register(cls, NativeLibrary.getInstance(str, (Map<String, ?>) Collections.singletonMap(Library.OPTION_CLASSLOADER, cls.getClassLoader())));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b9 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void register(Class<?> cls, NativeLibrary nativeLibrary) {
        int i;
        long j;
        FromNativeConverter fromNativeConverter;
        long j2;
        long j3;
        boolean z;
        Method method;
        String str;
        boolean z2;
        long j4;
        Class<?> cls2 = cls;
        NativeLibrary nativeLibrary2 = nativeLibrary;
        Method[] declaredMethods = cls.getDeclaredMethods();
        ArrayList arrayList = new ArrayList();
        Map<String, ?> options = nativeLibrary.getOptions();
        TypeMapper typeMapper = (TypeMapper) options.get(Library.OPTION_TYPE_MAPPER);
        boolean zEquals = Boolean.TRUE.equals(options.get(Library.OPTION_ALLOW_OBJECTS));
        cacheOptions(cls2, options, null);
        for (Method method2 : declaredMethods) {
            if ((method2.getModifiers() & 256) != 0) {
                arrayList.add(method2);
            }
        }
        int size = arrayList.size();
        long[] jArr = new long[size];
        int i2 = 0;
        while (i2 < size) {
            Method method3 = (Method) arrayList.get(i2);
            Class<?> returnType = method3.getReturnType();
            Class<?>[] parameterTypes = method3.getParameterTypes();
            long[] jArr2 = new long[parameterTypes.length];
            long[] jArr3 = new long[parameterTypes.length];
            int[] iArr = new int[parameterTypes.length];
            ToNativeConverter[] toNativeConverterArr = new ToNativeConverter[parameterTypes.length];
            int conversion = getConversion(returnType, typeMapper, zEquals);
            long[] jArr4 = jArr;
            if (conversion == -1) {
                throw new IllegalArgumentException(returnType + " is not a supported return type (in method " + method3.getName() + " in " + cls2 + ")");
            }
            int i3 = i2;
            if (conversion == 3) {
                i = conversion;
                j = Structure.FFIType.get(Pointer.class).getPointer().peer;
                j4 = j;
                fromNativeConverter = null;
                long j5 = j;
                j3 = j4;
                j2 = j5;
            } else {
                if (conversion != 4) {
                    switch (conversion) {
                        default:
                            switch (conversion) {
                                case 21:
                                case 22:
                                    break;
                                case 23:
                                case 24:
                                case 25:
                                    FromNativeConverter fromNativeConverter2 = typeMapper.getFromNativeConverter(returnType);
                                    i = conversion;
                                    long j6 = Structure.FFIType.get(returnType.isPrimitive() ? returnType : Pointer.class).getPointer().peer;
                                    fromNativeConverter = fromNativeConverter2;
                                    j2 = Structure.FFIType.get(fromNativeConverter2.nativeType()).getPointer().peer;
                                    j3 = j6;
                                    break;
                                case 26:
                                    break;
                                default:
                                    i = conversion;
                                    j = Structure.FFIType.get(returnType).getPointer().peer;
                                    j4 = j;
                                    break;
                            }
                        case 17:
                        case 18:
                        case 19:
                            i = conversion;
                            j4 = Structure.FFIType.get(Pointer.class).getPointer().peer;
                            j = Structure.FFIType.get(NativeMappedConverter.getInstance(returnType).nativeType()).getPointer().peer;
                            break;
                    }
                } else {
                    i = conversion;
                    j4 = Structure.FFIType.get(Pointer.class).getPointer().peer;
                    j = Structure.FFIType.get(returnType).getPointer().peer;
                }
                fromNativeConverter = null;
                long j52 = j;
                j3 = j4;
                j2 = j52;
            }
            String str2 = "(";
            int i4 = size;
            ArrayList arrayList2 = arrayList;
            int i5 = 0;
            while (i5 < parameterTypes.length) {
                Class<?> clsNativeType = parameterTypes[i5];
                Class<?>[] clsArr = parameterTypes;
                String str3 = str2 + getSignature(clsNativeType);
                int conversion2 = getConversion(clsNativeType, typeMapper, zEquals);
                iArr[i5] = conversion2;
                if (conversion2 == -1) {
                    throw new IllegalArgumentException(clsNativeType + " is not a supported argument type (in method " + method3.getName() + " in " + cls2 + ")");
                }
                if (conversion2 == 17 || conversion2 == 18 || conversion2 == 19 || conversion2 == 21) {
                    clsNativeType = NativeMappedConverter.getInstance(clsNativeType).nativeType();
                } else if (conversion2 == 23 || conversion2 == 24 || conversion2 == 25) {
                    toNativeConverterArr[i5] = typeMapper.getToNativeConverter(clsNativeType);
                }
                if (conversion2 == 0) {
                    z2 = zEquals;
                    long j7 = Structure.FFIType.get(clsNativeType).getPointer().peer;
                    jArr2[i5] = j7;
                    jArr3[i5] = j7;
                } else if (conversion2 != 4) {
                    switch (conversion2) {
                        default:
                            switch (conversion2) {
                                case 21:
                                case 22:
                                    break;
                                case 23:
                                case 24:
                                case 25:
                                    if (!clsNativeType.isPrimitive()) {
                                        clsNativeType = Pointer.class;
                                    }
                                    z2 = zEquals;
                                    jArr3[i5] = Structure.FFIType.get(clsNativeType).getPointer().peer;
                                    jArr2[i5] = Structure.FFIType.get(toNativeConverterArr[i5].nativeType()).getPointer().peer;
                                    break;
                                default:
                                    z2 = zEquals;
                                    long j8 = Structure.FFIType.get(Pointer.class).getPointer().peer;
                                    jArr2[i5] = j8;
                                    jArr3[i5] = j8;
                                    break;
                            }
                        case 17:
                        case 18:
                        case 19:
                            z2 = zEquals;
                            jArr2[i5] = Structure.FFIType.get(clsNativeType).getPointer().peer;
                            jArr3[i5] = Structure.FFIType.get(Pointer.class).getPointer().peer;
                            break;
                    }
                }
                i5++;
                zEquals = z2;
                parameterTypes = clsArr;
                str2 = str3;
            }
            boolean z3 = zEquals;
            String str4 = (str2 + ")") + getSignature(returnType);
            Class<?>[] exceptionTypes = method3.getExceptionTypes();
            int i6 = 0;
            while (true) {
                if (i6 >= exceptionTypes.length) {
                    z = false;
                } else if (LastErrorException.class.isAssignableFrom(exceptionTypes[i6])) {
                    z = true;
                } else {
                    i6++;
                }
            }
            Function function = nativeLibrary2.getFunction(method3.getName(), method3);
            try {
                method = method3;
                str = str4;
                TypeMapper typeMapper2 = typeMapper;
                try {
                    jArr4[i3] = registerMethod(cls, method3.getName(), str4, iArr, jArr3, jArr2, i, j3, j2, method, function.peer, function.getCallingConvention(), z, toNativeConverterArr, fromNativeConverter, function.encoding);
                    i2 = i3 + 1;
                    nativeLibrary2 = nativeLibrary;
                    jArr = jArr4;
                    zEquals = z3;
                    arrayList = arrayList2;
                    typeMapper = typeMapper2;
                    size = i4;
                    cls2 = cls;
                } catch (NoSuchMethodError unused) {
                    throw new UnsatisfiedLinkError("No method " + method.getName() + " with signature " + str + " in " + cls);
                }
            } catch (NoSuchMethodError unused2) {
                method = method3;
                str = str4;
            }
        }
        Class<?> cls3 = cls2;
        long[] jArr5 = jArr;
        Map<Class<?>, long[]> map = registeredClasses;
        synchronized (map) {
            map.put(cls3, jArr5);
            registeredLibraries.put(cls3, nativeLibrary);
        }
    }

    public static NativeLibrary getNativeLibrary(Library library) {
        if (library == null) {
            throw new IllegalArgumentException("null passed to getNativeLibrary");
        }
        if (!Proxy.isProxyClass(library.getClass())) {
            throw new IllegalArgumentException("library object passed to getNativeLibrary in not a proxy");
        }
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(library);
        if (!(invocationHandler instanceof Library.Handler)) {
            throw new IllegalArgumentException("Object is not a properly initialized Library interface instance");
        }
        return ((Library.Handler) invocationHandler).getNativeLibrary();
    }

    public static NativeLibrary getNativeLibrary(Class<?> cls) {
        NativeLibrary nativeLibrary;
        if (cls == null) {
            throw new IllegalArgumentException("null passed to getNativeLibrary");
        }
        Class<?> clsFindDirectMappedClass = findDirectMappedClass(cls);
        synchronized (registeredClasses) {
            nativeLibrary = registeredLibraries.get(clsFindDirectMappedClass);
            if (nativeLibrary == null) {
                throw new IllegalArgumentException("Class " + cls.getName() + " is not currently registered");
            }
        }
        return nativeLibrary;
    }

    private static Map<String, Object> cacheOptions(Class<?> cls, Map<String, ?> map, Object obj) {
        HashMap map2 = new HashMap(map);
        map2.put(_OPTION_ENCLOSING_LIBRARY, cls);
        typeOptions.put(cls, map2);
        if (obj != null) {
            libraries.put(cls, new WeakReference(obj));
        }
        if (!cls.isInterface() && Library.class.isAssignableFrom(cls)) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Class<?> cls2 = interfaces[i];
                if (Library.class.isAssignableFrom(cls2)) {
                    cacheOptions(cls2, map2, obj);
                    break;
                }
                i++;
            }
        }
        return map2;
    }

    private static NativeMapped fromNative(Class<?> cls, Object obj) {
        return (NativeMapped) NativeMappedConverter.getInstance(cls).fromNative(obj, new FromNativeContext(cls));
    }

    private static NativeMapped fromNative(Method method, Object obj) {
        Class<?> returnType = method.getReturnType();
        return (NativeMapped) NativeMappedConverter.getInstance(returnType).fromNative(obj, new MethodResultContext(returnType, null, null, method));
    }

    private static Class<?> nativeType(Class<?> cls) {
        return NativeMappedConverter.getInstance(cls).nativeType();
    }

    private static Object toNative(ToNativeConverter toNativeConverter, Object obj) {
        return toNativeConverter.toNative(obj, new ToNativeContext());
    }

    private static Object fromNative(FromNativeConverter fromNativeConverter, Object obj, Method method) {
        return fromNativeConverter.fromNative(obj, new MethodResultContext(method.getReturnType(), null, null, method));
    }

    public static void main(String[] strArr) {
        Package r3 = Native.class.getPackage();
        String specificationTitle = r3 != null ? r3.getSpecificationTitle() : "Java Native Access (JNA)";
        String str = specificationTitle != null ? specificationTitle : "Java Native Access (JNA)";
        String str2 = Version.VERSION;
        String specificationVersion = r3 != null ? r3.getSpecificationVersion() : Version.VERSION;
        if (specificationVersion != null) {
            str2 = specificationVersion;
        }
        String str3 = str + " API Version " + str2;
        PrintStream printStream = System.out;
        printStream.println(str3);
        String implementationVersion = r3 != null ? r3.getImplementationVersion() : "5.18.1 (package information missing)";
        printStream.println("Version: " + (implementationVersion != null ? implementationVersion : "5.18.1 (package information missing)"));
        printStream.println(" Native: " + getNativeVersion() + " (" + getAPIChecksum() + ")");
        StringBuilder sb = new StringBuilder();
        sb.append(" Prefix: ");
        sb.append(Platform.RESOURCE_PREFIX);
        printStream.println(sb.toString());
    }

    public static Structure invokeStructure(Function function, long j, int i, Object[] objArr, Structure structure) {
        invokeStructure(function, j, i, objArr, structure.getPointer().peer, structure.getTypeInfo().peer);
        return structure;
    }

    public static long open(String str) {
        return open(str, -1);
    }

    public static Pointer getPointer(long j) {
        long j_getPointer = _getPointer(j);
        if (j_getPointer == 0) {
            return null;
        }
        return new Pointer(j_getPointer);
    }

    public static String getString(Pointer pointer, long j) {
        return getString(pointer, j, getDefaultStringEncoding());
    }

    public static String getString(Pointer pointer, long j, String str) {
        byte[] stringBytes = getStringBytes(pointer, pointer.peer, j);
        if (str != null) {
            try {
                return new String(stringBytes, str);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return new String(stringBytes);
    }

    public static void detach(boolean z) {
        Thread threadCurrentThread = Thread.currentThread();
        if (z) {
            nativeThreads.remove(threadCurrentThread);
            nativeThreadTerminationFlag.get();
            setDetachState(true, 0L);
        } else {
            Map<Thread, Pointer> map = nativeThreads;
            if (map.containsKey(threadCurrentThread)) {
                return;
            }
            Memory memory = nativeThreadTerminationFlag.get();
            map.put(threadCurrentThread, memory);
            setDetachState(false, memory.peer);
        }
    }

    public static Pointer getTerminationFlag(Thread thread) {
        return nativeThreads.get(thread);
    }

    public static class Buffers {
        private Buffers() {
        }

        public static boolean isBuffer(Class<?> cls) {
            return Buffer.class.isAssignableFrom(cls);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static class AWT {
        private AWT() {
        }

        public static long getWindowID(Window window) throws HeadlessException {
            return getComponentID(window);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: java.awt.HeadlessException */
        public static long getComponentID(Object obj) throws HeadlessException {
            if (GraphicsEnvironment.isHeadless()) {
                throw new HeadlessException("No native windows when headless");
            }
            Component component = (Component) obj;
            if (component.isLightweight()) {
                throw new IllegalArgumentException("Component must be heavyweight");
            }
            if (!component.isDisplayable()) {
                throw new IllegalStateException("Component must be displayable");
            }
            if (Platform.isX11() && System.getProperty("java.version").startsWith("1.4") && !component.isVisible()) {
                throw new IllegalStateException("Component must be visible");
            }
            return Native.getWindowHandle0(component);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, int i, short s, Object[] objArr) {
        int i2;
        int i3 = b * 3;
        int i4 = 102 - (s * 3);
        int i5 = (i * 2) + 4;
        byte[] bArr = AhwBna;
        byte[] bArr2 = new byte[i3 + 11];
        int i6 = i3 + 10;
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i5++;
            i4 = i7 + (-i4) + 2;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = i4;
            i4 = bArr[i5];
            i5++;
            i4 = i7 + (-i4) + 2;
            i2 = i8;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    static void AEQbTJ() {
        OLrzqt = new char[]{6074, 34872, 31779, 24587, 21602, 22597, 19540, 12468, 9387, 10396, 7389, 238, 59909, 7701, 568, 13895, 14938, 11882, 21147, 18050, 19105, 59496, 7295, 'W', 13394, 14429, 20458, 48126, 42965, 37789, 40864, 35725, 63357, 58238, 61264, 56110, 3301, 63743, 58564, 53424, 56511, 51329, 46188, 41071, 3306, 63743, 58571, 53408, 3297, 63733, 58590, 53381, 56508, 51355, 46189, 41072, 44099, 38964, 33855, 28708, 32239, 27116, 21978};
        copydefault = 4654935270673348752L;
        AEQbTJ = new char[]{62904, 62897, 62892, 62820, 62905, 62883, 62894, 62885, 62882, 62910, 62880, 62819, 62911, 62887, 62890, 62891, 62886, 62909, 62884, 62795, 62790, 62896, 62889, 62824, 62908, 62907, 62812, 62814, 62895};
        EZpvd = 585626898;
        KWHzl = true;
        djBIcL = true;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:291:0x070b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:296:0x0730 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:443:0x0865 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:459:0x06ac */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:465:0x05bb */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:595:0x086f */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0756 A[Catch: all -> 0x0758, TryCatch #35 {all -> 0x0758, blocks: (B:308:0x0741, B:309:0x0746, B:323:0x075a, B:317:0x074f, B:319:0x0756, B:320:0x0757), top: B:524:0x06d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0757 A[Catch: all -> 0x0758, TryCatch #35 {all -> 0x0758, blocks: (B:308:0x0741, B:309:0x0746, B:323:0x075a, B:317:0x074f, B:319:0x0756, B:320:0x0757), top: B:524:0x06d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x082c A[Catch: Exception -> 0x0865, TryCatch #15 {Exception -> 0x0865, blocks: (B:364:0x07b6, B:366:0x07bc, B:367:0x07bd, B:324:0x075b, B:329:0x0765, B:331:0x076c, B:332:0x076d, B:334:0x076f, B:336:0x0779, B:337:0x077a, B:342:0x0784, B:344:0x078b, B:345:0x078c, B:350:0x0796, B:352:0x079d, B:353:0x079e, B:358:0x07a8, B:360:0x07af, B:361:0x07b0, B:372:0x07c7, B:374:0x07ce, B:375:0x07cf, B:380:0x07d9, B:382:0x07e0, B:383:0x07e1, B:390:0x07ed, B:392:0x07f4, B:393:0x07f5, B:398:0x07fe, B:400:0x0805, B:401:0x0806, B:406:0x080f, B:408:0x0816, B:409:0x0817, B:417:0x0825, B:419:0x082c, B:420:0x082d, B:431:0x0847, B:433:0x084e, B:434:0x084f, B:439:0x085c, B:441:0x0863, B:442:0x0864, B:277:0x06ac), top: B:489:0x06ac, inners: #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x082d A[Catch: Exception -> 0x0865, TryCatch #15 {Exception -> 0x0865, blocks: (B:364:0x07b6, B:366:0x07bc, B:367:0x07bd, B:324:0x075b, B:329:0x0765, B:331:0x076c, B:332:0x076d, B:334:0x076f, B:336:0x0779, B:337:0x077a, B:342:0x0784, B:344:0x078b, B:345:0x078c, B:350:0x0796, B:352:0x079d, B:353:0x079e, B:358:0x07a8, B:360:0x07af, B:361:0x07b0, B:372:0x07c7, B:374:0x07ce, B:375:0x07cf, B:380:0x07d9, B:382:0x07e0, B:383:0x07e1, B:390:0x07ed, B:392:0x07f4, B:393:0x07f5, B:398:0x07fe, B:400:0x0805, B:401:0x0806, B:406:0x080f, B:408:0x0816, B:409:0x0817, B:417:0x0825, B:419:0x082c, B:420:0x082d, B:431:0x0847, B:433:0x084e, B:434:0x084f, B:439:0x085c, B:441:0x0863, B:442:0x0864, B:277:0x06ac), top: B:489:0x06ac, inners: #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x084e A[Catch: Exception -> 0x0865, TryCatch #15 {Exception -> 0x0865, blocks: (B:364:0x07b6, B:366:0x07bc, B:367:0x07bd, B:324:0x075b, B:329:0x0765, B:331:0x076c, B:332:0x076d, B:334:0x076f, B:336:0x0779, B:337:0x077a, B:342:0x0784, B:344:0x078b, B:345:0x078c, B:350:0x0796, B:352:0x079d, B:353:0x079e, B:358:0x07a8, B:360:0x07af, B:361:0x07b0, B:372:0x07c7, B:374:0x07ce, B:375:0x07cf, B:380:0x07d9, B:382:0x07e0, B:383:0x07e1, B:390:0x07ed, B:392:0x07f4, B:393:0x07f5, B:398:0x07fe, B:400:0x0805, B:401:0x0806, B:406:0x080f, B:408:0x0816, B:409:0x0817, B:417:0x0825, B:419:0x082c, B:420:0x082d, B:431:0x0847, B:433:0x084e, B:434:0x084f, B:439:0x085c, B:441:0x0863, B:442:0x0864, B:277:0x06ac), top: B:489:0x06ac, inners: #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:434:0x084f A[Catch: Exception -> 0x0865, TryCatch #15 {Exception -> 0x0865, blocks: (B:364:0x07b6, B:366:0x07bc, B:367:0x07bd, B:324:0x075b, B:329:0x0765, B:331:0x076c, B:332:0x076d, B:334:0x076f, B:336:0x0779, B:337:0x077a, B:342:0x0784, B:344:0x078b, B:345:0x078c, B:350:0x0796, B:352:0x079d, B:353:0x079e, B:358:0x07a8, B:360:0x07af, B:361:0x07b0, B:372:0x07c7, B:374:0x07ce, B:375:0x07cf, B:380:0x07d9, B:382:0x07e0, B:383:0x07e1, B:390:0x07ed, B:392:0x07f4, B:393:0x07f5, B:398:0x07fe, B:400:0x0805, B:401:0x0806, B:406:0x080f, B:408:0x0816, B:409:0x0817, B:417:0x0825, B:419:0x082c, B:420:0x082d, B:431:0x0847, B:433:0x084e, B:434:0x084f, B:439:0x085c, B:441:0x0863, B:442:0x0864, B:277:0x06ac), top: B:489:0x06ac, inners: #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:481:0x04f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:510:0x06d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:563:0x01ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:593:0x087a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:595:0x086f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v117 */
    /* JADX WARN: Type inference failed for: r10v118 */
    /* JADX WARN: Type inference failed for: r10v119 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v61, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r10v62 */
    /* JADX WARN: Type inference failed for: r10v69 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v70 */
    /* JADX WARN: Type inference failed for: r10v77 */
    /* JADX WARN: Type inference failed for: r10v78 */
    /* JADX WARN: Type inference failed for: r10v80 */
    /* JADX WARN: Type inference failed for: r10v83, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v91 */
    /* JADX WARN: Type inference failed for: r12v101 */
    /* JADX WARN: Type inference failed for: r12v102 */
    /* JADX WARN: Type inference failed for: r12v103 */
    /* JADX WARN: Type inference failed for: r12v104 */
    /* JADX WARN: Type inference failed for: r12v105 */
    /* JADX WARN: Type inference failed for: r12v106 */
    /* JADX WARN: Type inference failed for: r12v107 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v69, types: [java.lang.Class<java.lang.ClassLoader>] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v76 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v38, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void EZpvd(String str) throws Exception {
        ?? r12;
        ?? method;
        String[] strArr;
        Exception exc;
        ?? r122;
        ?? r10;
        Object[] objArr;
        Object objNewInstance;
        Throwable cause;
        Object[] objArr2;
        Throwable cause2;
        String str2;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        Class[] clsArr;
        Object[] objArr6;
        Object[] objArr7;
        Object[] objArr8;
        InputStream inputStream;
        Throwable th;
        Object[] objArr9;
        Object[] objArr10;
        Object objInvoke;
        Throwable cause3;
        Object[] objArr11;
        Object[] objArr12;
        Object objInvoke2;
        String str3 = str;
        Object[] objArr13 = new Object[1];
        a((char) 59120, 12, 9, objArr13);
        ?? r4 = 0;
        String str4 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        ?? r8 = 10;
        a((char) 17163, 26, 10, objArr14);
        String str5 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        a((char) 58555, 21, 5, objArr15);
        try {
            String[] strArrAEQbTJ = Zs.AEQbTJ(Zs.copydefault((byte[]) String.class.getMethod("getBytes", String.class).invoke(str3, (String) objArr15[0])));
            if (strArrAEQbTJ == null) {
                strArrAEQbTJ = new String[0];
            }
            int length = strArrAEQbTJ.length;
            String[] strArr2 = new String[length + 1];
            System.arraycopy(strArrAEQbTJ, 0, strArr2, 0, length);
            strArr2[length] = str3;
            int i = 0;
            while (i <= length) {
                String str6 = strArr2[i];
                try {
                    Object[] objArr16 = new Object[1];
                    b(null, null, 127, new byte[]{-121, -110, -111, -111, -126, -112, -124, -113, -114, -122, -124, -120, -122, -115, -116, -126, -121, -126, -118, -116, -126, -121, -126, -118, -116}, objArr16);
                    try {
                        objArr = new Object[]{(String) objArr16[r4]};
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        Class[] clsArr2 = new Class[1];
                        clsArr2[r4] = String.class;
                        objNewInstance = File.class.getDeclaredConstructor(clsArr2).newInstance(objArr);
                        try {
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        try {
                            objArr2 = new Object[1];
                            b(null, null, 127, new byte[]{-110, -121, -123, -117, -108, -109, -126, -115}, objArr2);
                        } catch (Throwable th4) {
                            th = th4;
                            Throwable th5 = th;
                            cause = th5.getCause();
                            if (cause != null) {
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        Throwable th7 = th;
                        Throwable cause4 = th7.getCause();
                        if (cause4 == null) {
                            throw th7;
                        }
                        throw cause4;
                    }
                } catch (Exception e) {
                    e = e;
                    r12 = r4;
                    method = r8;
                    strArr = strArr2;
                }
                try {
                    if (((Boolean) File.class.getMethod((String) objArr2[0], null).invoke(objNewInstance, null)).booleanValue()) {
                        ClassLoader classLoader = Native.class.getClassLoader();
                        Object[] objArr17 = {i < length ? str3 : str6};
                        byte b = (byte) (AhwBna[4] + 1);
                        byte b2 = b;
                        strArr = strArr2;
                        Object[] objArr18 = new Object[1];
                        c(b, b2, b2, objArr18);
                        Method declaredMethod = ClassLoader.class.getDeclaredMethod((String) objArr18[0], String.class);
                        declaredMethod.setAccessible(true);
                        str2 = (String) declaredMethod.invoke(classLoader, objArr17);
                        if (str2 != null) {
                        }
                        exc = e;
                        r10 = 10;
                        r122 = 0;
                        if (i < length) {
                        }
                    } else {
                        try {
                            Object[] objArr19 = new Object[1];
                            b(null, null, 127, new byte[]{-117, -123, -118, -119, -120, -121, -124, -122, -123, -124, -126, -125, -126, -127}, objArr19);
                            String str7 = (String) objArr19[0];
                            try {
                                objNewInstance = File.class.getDeclaredConstructor(String.class).newInstance(System.getProperty(str7, str7));
                                try {
                                    Object[] objArr20 = new Object[1];
                                    b(null, null, 127, new byte[]{-110, -121, -123, -117, -108, -109, -126, -115}, objArr20);
                                    if (!((Boolean) File.class.getMethod((String) objArr20[0], null).invoke(objNewInstance, null)).booleanValue()) {
                                        objNewInstance = Environment.getExternalStorageDirectory();
                                    }
                                    try {
                                        ClassLoader classLoader2 = Native.class.getClassLoader();
                                        try {
                                            Object[] objArr172 = {i < length ? str3 : str6};
                                            byte b3 = (byte) (AhwBna[4] + 1);
                                            byte b22 = b3;
                                            strArr = strArr2;
                                        } catch (Throwable th8) {
                                            th = th8;
                                        }
                                        try {
                                            Object[] objArr182 = new Object[1];
                                            c(b3, b22, b22, objArr182);
                                        } catch (Throwable th9) {
                                            th = th9;
                                            Throwable th10 = th;
                                            cause2 = th10.getCause();
                                            if (cause2 != null) {
                                            }
                                        }
                                        try {
                                            Method declaredMethod2 = ClassLoader.class.getDeclaredMethod((String) objArr182[0], String.class);
                                            declaredMethod2.setAccessible(true);
                                            str2 = (String) declaredMethod2.invoke(classLoader2, objArr172);
                                            if (str2 != null) {
                                                try {
                                                    Object objInvoke3 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                    if (i >= length) {
                                                        str6 = str;
                                                    }
                                                    try {
                                                        Object[] objArr21 = new Object[1];
                                                        b(null, null, 127, new byte[]{-105, -117, -126, -117, -106, -123, -107, -118, -126, -122, -111}, objArr21);
                                                        Runtime.class.getMethod((String) objArr21[0], String.class).invoke(objInvoke3, str6);
                                                        return;
                                                    } catch (Throwable th11) {
                                                        Throwable cause5 = th11.getCause();
                                                        if (cause5 == null) {
                                                            throw th11;
                                                        }
                                                        throw cause5;
                                                    }
                                                } catch (Throwable th12) {
                                                    Throwable cause6 = th12.getCause();
                                                    if (cause6 == null) {
                                                        throw th12;
                                                    }
                                                    throw cause6;
                                                }
                                            }
                                            try {
                                                objArr3 = new Object[1];
                                            } catch (Throwable th13) {
                                                th = th13;
                                            }
                                            try {
                                                objArr3[0] = 47;
                                                Object[] objArr22 = new Object[1];
                                                a((char) 34002, 1, 11, objArr22);
                                                try {
                                                    objArr4 = new Object[1];
                                                } catch (Throwable th14) {
                                                    th = th14;
                                                }
                                                try {
                                                    objArr4[0] = Integer.valueOf(((Integer) String.class.getMethod((String) objArr22[0], Integer.TYPE).invoke(str2, objArr3)).intValue() + 1);
                                                    try {
                                                        objArr5 = new Object[]{objNewInstance, String.class.getMethod(str4, Integer.TYPE).invoke(str2, objArr4)};
                                                        clsArr = new Class[2];
                                                    } catch (Throwable th15) {
                                                        th = th15;
                                                    }
                                                    try {
                                                        clsArr[0] = File.class;
                                                        clsArr[1] = String.class;
                                                        Object objNewInstance2 = File.class.getDeclaredConstructor(clsArr).newInstance(objArr5);
                                                        try {
                                                            URL resource = Native.class.getClassLoader().getResource(str2);
                                                            if (resource == null) {
                                                                try {
                                                                    Object[] objArr23 = new Object[1];
                                                                    a((char) 0, 36, 8, objArr23);
                                                                    if (((Boolean) String.class.getMethod((String) objArr23[0], CharSequence.class).invoke(str2, "!")).booleanValue()) {
                                                                        try {
                                                                            StringBuilder sb = new StringBuilder();
                                                                            Object[] objArr24 = new Object[1];
                                                                            b(null, null, 127, new byte[]{-104, -110, -111, -123, -103, -104, -117, -126, -127}, objArr24);
                                                                            sb.append((String) objArr24[0]);
                                                                            sb.append(str2);
                                                                            String path = new URL(sb.toString()).getPath();
                                                                            try {
                                                                                Object[] objArr25 = new Object[1];
                                                                                a((char) 34002, 1, 11, objArr25);
                                                                                try {
                                                                                    ZipFile zipFile = new ZipFile((String) String.class.getMethod(str4, Integer.TYPE, Integer.TYPE).invoke(path, 5, Integer.valueOf(((Integer) String.class.getMethod((String) objArr25[0], String.class).invoke(path, "!/")).intValue())));
                                                                                    try {
                                                                                        Object[] objArr26 = new Object[1];
                                                                                        a((char) 34002, 1, 11, objArr26);
                                                                                        try {
                                                                                            try {
                                                                                                inputStream = zipFile.getInputStream(zipFile.getEntry((String) String.class.getMethod(str4, Integer.TYPE).invoke(String.class.getMethod(str4, Integer.TYPE).invoke(str2, Integer.valueOf(((Integer) String.class.getMethod((String) objArr26[0], String.class).invoke(str2, "!/")).intValue())), 2)));
                                                                                            } catch (Throwable th16) {
                                                                                                Throwable cause7 = th16.getCause();
                                                                                                if (cause7 == null) {
                                                                                                    throw th16;
                                                                                                }
                                                                                                throw cause7;
                                                                                            }
                                                                                        } catch (Throwable th17) {
                                                                                            Throwable cause8 = th17.getCause();
                                                                                            if (cause8 == null) {
                                                                                                throw th17;
                                                                                            }
                                                                                            throw cause8;
                                                                                        }
                                                                                    } catch (Throwable th18) {
                                                                                        Throwable cause9 = th18.getCause();
                                                                                        if (cause9 == null) {
                                                                                            throw th18;
                                                                                        }
                                                                                        throw cause9;
                                                                                    }
                                                                                } catch (Throwable th19) {
                                                                                    Throwable cause10 = th19.getCause();
                                                                                    if (cause10 == null) {
                                                                                        throw th19;
                                                                                    }
                                                                                    throw cause10;
                                                                                }
                                                                            } catch (Throwable th20) {
                                                                                Throwable cause11 = th20.getCause();
                                                                                if (cause11 == null) {
                                                                                    throw th20;
                                                                                }
                                                                                throw cause11;
                                                                            }
                                                                        } catch (Exception e2) {
                                                                            exc = e2;
                                                                        }
                                                                    } else {
                                                                        try {
                                                                            inputStream = (InputStream) FileInputStream.class.getDeclaredConstructor(String.class).newInstance(str2);
                                                                        } catch (Throwable th21) {
                                                                            Throwable cause12 = th21.getCause();
                                                                            if (cause12 == null) {
                                                                                throw th21;
                                                                            }
                                                                            throw cause12;
                                                                        }
                                                                    }
                                                                } catch (Throwable th22) {
                                                                    Throwable cause13 = th22.getCause();
                                                                    if (cause13 == null) {
                                                                        throw th22;
                                                                    }
                                                                    throw cause13;
                                                                }
                                                            } else {
                                                                String path2 = resource.getPath();
                                                                try {
                                                                    objArr6 = new Object[]{"!/" + str2};
                                                                    objArr7 = new Object[1];
                                                                    a((char) 34002, 1, 11, objArr7);
                                                                } catch (Throwable th23) {
                                                                    th = th23;
                                                                }
                                                                try {
                                                                    int iIntValue = ((Integer) String.class.getMethod((String) objArr7[0], String.class).invoke(path2, objArr6)).intValue();
                                                                    try {
                                                                        objArr8 = new Object[2];
                                                                        objArr8[1] = Integer.valueOf(iIntValue);
                                                                    } catch (Throwable th24) {
                                                                        th = th24;
                                                                    }
                                                                    try {
                                                                        objArr8[0] = 5;
                                                                        Class[] clsArr3 = new Class[2];
                                                                        clsArr3[0] = Integer.TYPE;
                                                                        clsArr3[1] = Integer.TYPE;
                                                                        ZipFile zipFile2 = new ZipFile((String) String.class.getMethod(str4, clsArr3).invoke(path2, objArr8));
                                                                        inputStream = zipFile2.getInputStream(zipFile2.getEntry(str2));
                                                                    } catch (Throwable th25) {
                                                                        th = th25;
                                                                        Throwable th26 = th;
                                                                        Throwable cause14 = th26.getCause();
                                                                        if (cause14 == null) {
                                                                            throw th26;
                                                                        }
                                                                        throw cause14;
                                                                    }
                                                                } catch (Throwable th27) {
                                                                    th = th27;
                                                                    Throwable th28 = th;
                                                                    Throwable cause15 = th28.getCause();
                                                                    if (cause15 == null) {
                                                                        throw th28;
                                                                    }
                                                                    throw cause15;
                                                                }
                                                            }
                                                            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                                                            try {
                                                                Object[] objArr27 = {bufferedInputStream};
                                                                Object objEZpvd = YY.EZpvd(1683135861);
                                                                if (objEZpvd == null) {
                                                                    try {
                                                                        objEZpvd = YY.EZpvd(37, 4, (char) 38177, 1618104329, false, "AEQbTJ", new Class[]{InputStream.class});
                                                                    } catch (Throwable th29) {
                                                                        th = th29;
                                                                        Throwable cause16 = th.getCause();
                                                                        if (cause16 == null) {
                                                                            throw th;
                                                                        }
                                                                        throw cause16;
                                                                    }
                                                                }
                                                                InputStream inputStream2 = (InputStream) ((Method) objEZpvd).invoke(null, objArr27);
                                                                if (bufferedInputStream == inputStream2) {
                                                                    inputStream2.close();
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                Object objInvoke4 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                try {
                                                                                    Object[] objArr28 = {str2, Native.class.getClassLoader()};
                                                                                    Object[] objArr29 = new Object[1];
                                                                                    a((char) 0, 44, 4, objArr29);
                                                                                    Method declaredMethod3 = Runtime.class.getDeclaredMethod((String) objArr29[0], String.class, ClassLoader.class);
                                                                                    declaredMethod3.setAccessible(true);
                                                                                    declaredMethod3.invoke(objInvoke4, objArr28);
                                                                                } catch (Throwable th30) {
                                                                                    Throwable cause17 = th30.getCause();
                                                                                    if (cause17 == null) {
                                                                                        throw th30;
                                                                                    }
                                                                                    throw cause17;
                                                                                }
                                                                            } catch (Throwable th31) {
                                                                                Throwable cause18 = th31.getCause();
                                                                                if (cause18 == null) {
                                                                                    throw th31;
                                                                                }
                                                                                throw cause18;
                                                                            }
                                                                        } catch (Exception unused) {
                                                                            if (Build.VERSION.SDK_INT <= 27) {
                                                                                try {
                                                                                    Object objInvoke5 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                    try {
                                                                                        Object[] objArr30 = {str2, Native.class.getClassLoader()};
                                                                                        Object[] objArr31 = new Object[1];
                                                                                        b(null, null, 127, new byte[]{-118, -126, -122, -107, -122, -118}, objArr31);
                                                                                        Method declaredMethod4 = Runtime.class.getDeclaredMethod((String) objArr31[0], String.class, ClassLoader.class);
                                                                                        declaredMethod4.setAccessible(true);
                                                                                        declaredMethod4.invoke(objInvoke5, objArr30);
                                                                                    } catch (Throwable th32) {
                                                                                        Throwable cause19 = th32.getCause();
                                                                                        if (cause19 == null) {
                                                                                            throw th32;
                                                                                        }
                                                                                        throw cause19;
                                                                                    }
                                                                                } catch (Throwable th33) {
                                                                                    Throwable cause20 = th33.getCause();
                                                                                    if (cause20 == null) {
                                                                                        throw th33;
                                                                                    }
                                                                                    throw cause20;
                                                                                }
                                                                            } else {
                                                                                try {
                                                                                    objInvoke2 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                    ClassLoader classLoader3 = Native.class.getClassLoader();
                                                                                    synchronized (objInvoke2) {
                                                                                    }
                                                                                } catch (Throwable th34) {
                                                                                    Throwable cause21 = th34.getCause();
                                                                                    if (cause21 == null) {
                                                                                        throw th34;
                                                                                    }
                                                                                    throw cause21;
                                                                                }
                                                                            }
                                                                        }
                                                                    } catch (NoSuchMethodException unused2) {
                                                                        objInvoke2 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                        ClassLoader classLoader32 = Native.class.getClassLoader();
                                                                        synchronized (objInvoke2) {
                                                                            try {
                                                                                Object[] objArr32 = {str2, classLoader32};
                                                                                Object[] objArr33 = new Object[1];
                                                                                b(null, null, 127, new byte[]{-118, -126, -122, -107, -110, -125, -123, -121, -126, -109}, objArr33);
                                                                                Method declaredMethod5 = Runtime.class.getDeclaredMethod((String) objArr33[0], String.class, ClassLoader.class);
                                                                                declaredMethod5.setAccessible(true);
                                                                                String str8 = (String) declaredMethod5.invoke(objInvoke2, objArr32);
                                                                                if (str8 != null) {
                                                                                    throw new UnsatisfiedLinkError(str8);
                                                                                }
                                                                            } catch (Throwable th35) {
                                                                                Throwable cause22 = th35.getCause();
                                                                                if (cause22 == null) {
                                                                                    throw th35;
                                                                                }
                                                                                throw cause22;
                                                                            }
                                                                        }
                                                                        r10 = 10;
                                                                        r122 = 0;
                                                                        i++;
                                                                        str3 = str;
                                                                        r8 = r10;
                                                                        r4 = r122;
                                                                        strArr2 = strArr;
                                                                    }
                                                                    r10 = 10;
                                                                    r122 = 0;
                                                                } else {
                                                                    try {
                                                                        Object[] objArr34 = {objNewInstance2};
                                                                        Class[] clsArr4 = new Class[1];
                                                                        try {
                                                                            clsArr4[0] = File.class;
                                                                            OutputStream outputStream = (OutputStream) FileOutputStream.class.getDeclaredConstructor(clsArr4).newInstance(objArr34);
                                                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                                                                            byte[] bArr = new byte[1024];
                                                                            while (true) {
                                                                                int i2 = inputStream2.read(bArr);
                                                                                if (i2 < 0) {
                                                                                    break;
                                                                                } else {
                                                                                    bufferedOutputStream.write(bArr, 0, i2);
                                                                                }
                                                                            }
                                                                            bufferedOutputStream.flush();
                                                                            try {
                                                                                objArr9 = new Object[1];
                                                                                r12 = 0;
                                                                                r12 = 0;
                                                                                r12 = 0;
                                                                                r12 = 0;
                                                                                b(null, null, 127, new byte[]{-100, -101, -121, -110, -102}, objArr9);
                                                                            } catch (Throwable th36) {
                                                                                th = th36;
                                                                            }
                                                                            try {
                                                                                Object objInvoke6 = FileOutputStream.class.getMethod((String) objArr9[0], null).invoke(outputStream, null);
                                                                                try {
                                                                                    objArr10 = new Object[1];
                                                                                    b(null, null, 127, new byte[]{-115, -109, -105, -99}, objArr10);
                                                                                } catch (Throwable th37) {
                                                                                    th = th37;
                                                                                }
                                                                                try {
                                                                                    method = FileDescriptor.class.getMethod((String) objArr10[0], null);
                                                                                    method.invoke(objInvoke6, null);
                                                                                    bufferedOutputStream.close();
                                                                                    inputStream2.close();
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                Object objInvoke7 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                try {
                                                                                                    Object[] objArr35 = new Object[1];
                                                                                                    r12 = 15;
                                                                                                    r12 = 15;
                                                                                                    a((char) 0, 48, 15, objArr35);
                                                                                                    method = 0;
                                                                                                    method = 0;
                                                                                                    try {
                                                                                                        Object[] objArr36 = {File.class.getMethod((String) objArr35[0], null).invoke(objNewInstance2, null), Native.class.getClassLoader()};
                                                                                                        Object[] objArr37 = new Object[1];
                                                                                                        a((char) 0, 44, 4, objArr37);
                                                                                                        method = (String) objArr37[0];
                                                                                                        r12 = ClassLoader.class;
                                                                                                        Method declaredMethod6 = Runtime.class.getDeclaredMethod(method, new Class[]{String.class, r12});
                                                                                                        declaredMethod6.setAccessible(true);
                                                                                                        declaredMethod6.invoke(objInvoke7, objArr36);
                                                                                                    } catch (Throwable th38) {
                                                                                                        Throwable cause23 = th38.getCause();
                                                                                                        if (cause23 == null) {
                                                                                                            throw th38;
                                                                                                        }
                                                                                                        throw cause23;
                                                                                                    }
                                                                                                } catch (Throwable th39) {
                                                                                                    Throwable cause24 = th39.getCause();
                                                                                                    if (cause24 == null) {
                                                                                                        throw th39;
                                                                                                    }
                                                                                                    throw cause24;
                                                                                                }
                                                                                            } catch (NoSuchMethodException unused3) {
                                                                                                try {
                                                                                                    try {
                                                                                                        objInvoke = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                        try {
                                                                                                            Object[] objArr38 = new Object[1];
                                                                                                        } catch (Throwable th40) {
                                                                                                            th = th40;
                                                                                                        }
                                                                                                        try {
                                                                                                            a((char) 0, 48, 15, objArr38);
                                                                                                            Object objInvoke8 = File.class.getMethod((String) objArr38[0], null).invoke(objNewInstance2, null);
                                                                                                            ClassLoader classLoader4 = Native.class.getClassLoader();
                                                                                                            try {
                                                                                                                synchronized (objInvoke) {
                                                                                                                }
                                                                                                            } catch (Throwable th41) {
                                                                                                                th = th41;
                                                                                                            }
                                                                                                        } catch (Throwable th42) {
                                                                                                            th = th42;
                                                                                                            Throwable th43 = th;
                                                                                                            Throwable cause25 = th43.getCause();
                                                                                                            if (cause25 == null) {
                                                                                                                throw th43;
                                                                                                            }
                                                                                                            throw cause25;
                                                                                                        }
                                                                                                    } catch (Throwable th44) {
                                                                                                        Throwable cause26 = th44.getCause();
                                                                                                        if (cause26 == null) {
                                                                                                            throw th44;
                                                                                                        }
                                                                                                        throw cause26;
                                                                                                    }
                                                                                                } catch (Exception e3) {
                                                                                                    e = e3;
                                                                                                    exc = e;
                                                                                                    r10 = method;
                                                                                                    r122 = r12;
                                                                                                    if (i < length) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } catch (Exception unused4) {
                                                                                            if (Build.VERSION.SDK_INT <= 27) {
                                                                                                try {
                                                                                                    Object objInvoke9 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                    try {
                                                                                                        Object[] objArr39 = new Object[1];
                                                                                                        a((char) 0, 48, 15, objArr39);
                                                                                                        try {
                                                                                                            Object[] objArr40 = {File.class.getMethod((String) objArr39[0], null).invoke(objNewInstance2, null), Native.class.getClassLoader()};
                                                                                                            Object[] objArr41 = new Object[1];
                                                                                                            b(null, null, 127, new byte[]{-118, -126, -122, -107, -122, -118}, objArr41);
                                                                                                            Method declaredMethod7 = Runtime.class.getDeclaredMethod((String) objArr41[0], String.class, ClassLoader.class);
                                                                                                            declaredMethod7.setAccessible(true);
                                                                                                            declaredMethod7.invoke(objInvoke9, objArr40);
                                                                                                        } catch (Throwable th45) {
                                                                                                            Throwable cause27 = th45.getCause();
                                                                                                            if (cause27 == null) {
                                                                                                                throw th45;
                                                                                                            }
                                                                                                            throw cause27;
                                                                                                        }
                                                                                                    } catch (Throwable th46) {
                                                                                                        Throwable cause28 = th46.getCause();
                                                                                                        if (cause28 == null) {
                                                                                                            throw th46;
                                                                                                        }
                                                                                                        throw cause28;
                                                                                                    }
                                                                                                } catch (Throwable th47) {
                                                                                                    Throwable cause29 = th47.getCause();
                                                                                                    if (cause29 == null) {
                                                                                                        throw th47;
                                                                                                    }
                                                                                                    throw cause29;
                                                                                                }
                                                                                            }
                                                                                            objInvoke = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                            Object[] objArr382 = new Object[1];
                                                                                            a((char) 0, 48, 15, objArr382);
                                                                                            Object objInvoke82 = File.class.getMethod((String) objArr382[0], null).invoke(objNewInstance2, null);
                                                                                            ClassLoader classLoader42 = Native.class.getClassLoader();
                                                                                            synchronized (objInvoke) {
                                                                                                try {
                                                                                                    objArr11 = new Object[]{objInvoke82, classLoader42};
                                                                                                    r10 = 10;
                                                                                                } catch (Throwable th48) {
                                                                                                    th = th48;
                                                                                                }
                                                                                                try {
                                                                                                    objArr12 = new Object[1];
                                                                                                    b(null, null, 127, new byte[]{-118, -126, -122, -107, -110, -125, -123, -121, -126, -109}, objArr12);
                                                                                                } catch (Throwable th49) {
                                                                                                    th = th49;
                                                                                                    Throwable th50 = th;
                                                                                                    cause3 = th50.getCause();
                                                                                                    if (cause3 != null) {
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    String str9 = (String) objArr12[0];
                                                                                                    Class[] clsArr5 = new Class[2];
                                                                                                    clsArr5[0] = String.class;
                                                                                                    clsArr5[1] = ClassLoader.class;
                                                                                                    Method declaredMethod8 = Runtime.class.getDeclaredMethod(str9, clsArr5);
                                                                                                    declaredMethod8.setAccessible(true);
                                                                                                    String str10 = (String) declaredMethod8.invoke(objInvoke, objArr11);
                                                                                                    if (str10 != null) {
                                                                                                        throw new UnsatisfiedLinkError(str10);
                                                                                                    }
                                                                                                    try {
                                                                                                    } catch (Throwable th51) {
                                                                                                        th = th51;
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (Throwable th52) {
                                                                                                    th = th52;
                                                                                                    Throwable th502 = th;
                                                                                                    cause3 = th502.getCause();
                                                                                                    if (cause3 != null) {
                                                                                                        throw th502;
                                                                                                    }
                                                                                                    throw cause3;
                                                                                                }
                                                                                            }
                                                                                            Object[] objArr42 = new Object[1];
                                                                                            b(null, null, 127, new byte[]{-110, -121, -110, -111, -110, -118}, objArr42);
                                                                                            r122 = 0;
                                                                                            r122 = 0;
                                                                                            ((Boolean) File.class.getMethod((String) objArr42[0], null).invoke(objNewInstance2, null)).booleanValue();
                                                                                            i++;
                                                                                            str3 = str;
                                                                                            r8 = r10;
                                                                                            r4 = r122;
                                                                                            strArr2 = strArr;
                                                                                        }
                                                                                        r10 = 10;
                                                                                        try {
                                                                                            Object[] objArr422 = new Object[1];
                                                                                            b(null, null, 127, new byte[]{-110, -121, -110, -111, -110, -118}, objArr422);
                                                                                            r122 = 0;
                                                                                            r122 = 0;
                                                                                        } catch (Throwable th53) {
                                                                                            th = th53;
                                                                                            r122 = 0;
                                                                                        }
                                                                                        try {
                                                                                            ((Boolean) File.class.getMethod((String) objArr422[0], null).invoke(objNewInstance2, null)).booleanValue();
                                                                                        } catch (Throwable th54) {
                                                                                            th = th54;
                                                                                            Throwable th55 = th;
                                                                                            try {
                                                                                                Throwable cause30 = th55.getCause();
                                                                                                if (cause30 == null) {
                                                                                                    throw th55;
                                                                                                }
                                                                                                throw cause30;
                                                                                            } catch (Exception unused5) {
                                                                                            }
                                                                                        }
                                                                                    } catch (Throwable th56) {
                                                                                        Throwable cause31 = th56.getCause();
                                                                                        if (cause31 == null) {
                                                                                            throw th56;
                                                                                        }
                                                                                        throw cause31;
                                                                                    }
                                                                                } catch (Throwable th57) {
                                                                                    th = th57;
                                                                                    Throwable th58 = th;
                                                                                    Throwable cause32 = th58.getCause();
                                                                                    if (cause32 == null) {
                                                                                        throw th58;
                                                                                    }
                                                                                    throw cause32;
                                                                                }
                                                                            } catch (Throwable th59) {
                                                                                th = th59;
                                                                                Throwable th60 = th;
                                                                                Throwable cause33 = th60.getCause();
                                                                                if (cause33 == null) {
                                                                                    throw th60;
                                                                                }
                                                                                throw cause33;
                                                                            }
                                                                        } catch (Throwable th61) {
                                                                            th = th61;
                                                                            Throwable th62 = th;
                                                                            Throwable cause34 = th62.getCause();
                                                                            if (cause34 == null) {
                                                                                throw th62;
                                                                            }
                                                                            throw cause34;
                                                                        }
                                                                    } catch (Throwable th63) {
                                                                        th = th63;
                                                                    }
                                                                }
                                                            } catch (Throwable th64) {
                                                                th = th64;
                                                            }
                                                        } catch (Exception e4) {
                                                            e = e4;
                                                            method = 10;
                                                            r12 = 0;
                                                            exc = e;
                                                            r10 = method;
                                                            r122 = r12;
                                                            if (i < length) {
                                                            }
                                                        }
                                                    } catch (Throwable th65) {
                                                        th = th65;
                                                        Throwable th66 = th;
                                                        Throwable cause35 = th66.getCause();
                                                        if (cause35 == null) {
                                                            throw th66;
                                                        }
                                                        throw cause35;
                                                    }
                                                } catch (Throwable th67) {
                                                    th = th67;
                                                    Throwable th68 = th;
                                                    Throwable cause36 = th68.getCause();
                                                    if (cause36 == null) {
                                                        throw th68;
                                                    }
                                                    throw cause36;
                                                }
                                            } catch (Throwable th69) {
                                                th = th69;
                                                Throwable th70 = th;
                                                Throwable cause37 = th70.getCause();
                                                if (cause37 == null) {
                                                    throw th70;
                                                }
                                                throw cause37;
                                            }
                                            exc = e2;
                                        } catch (Throwable th71) {
                                            th = th71;
                                            Throwable th102 = th;
                                            cause2 = th102.getCause();
                                            if (cause2 != null) {
                                                throw th102;
                                            }
                                            throw cause2;
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        strArr = strArr2;
                                    }
                                } catch (Throwable th72) {
                                    Throwable cause38 = th72.getCause();
                                    if (cause38 == null) {
                                        throw th72;
                                    }
                                    throw cause38;
                                }
                            } catch (Throwable th73) {
                                Throwable cause39 = th73.getCause();
                                if (cause39 == null) {
                                    throw th73;
                                }
                                throw cause39;
                            }
                        } catch (Exception e6) {
                            exc = e6;
                            strArr = strArr2;
                        }
                        r10 = 10;
                        r122 = 0;
                        if (i < length) {
                            throw exc;
                        }
                    }
                    i++;
                    str3 = str;
                    r8 = r10;
                    r4 = r122;
                    strArr2 = strArr;
                } catch (Throwable th74) {
                    th = th74;
                    Throwable th510 = th;
                    cause = th510.getCause();
                    if (cause != null) {
                        throw th510;
                    }
                    throw cause;
                }
            }
        } catch (Throwable th75) {
            Throwable cause40 = th75.getCause();
            if (cause40 == null) {
                throw th75;
            }
            throw cause40;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:368:0x07d6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:377:0x07fc */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:381:0x0801 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:577:0x098b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:676:0x00e4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:0x0222 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:784:0x099a */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:389:0x080e A[Catch: Exception -> 0x099a, TryCatch #38 {Exception -> 0x099a, blocks: (B:387:0x0808, B:389:0x080e, B:390:0x080f), top: B:671:0x0808 }] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x080f A[Catch: Exception -> 0x099a, TRY_LEAVE, TryCatch #38 {Exception -> 0x099a, blocks: (B:387:0x0808, B:389:0x080e, B:390:0x080f), top: B:671:0x0808 }] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0842 A[Catch: all -> 0x0844, TryCatch #18 {all -> 0x0844, blocks: (B:394:0x0818, B:395:0x081d, B:421:0x0846, B:415:0x083b, B:417:0x0842, B:418:0x0843), top: B:633:0x079f }] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0843 A[Catch: all -> 0x0844, TryCatch #18 {all -> 0x0844, blocks: (B:394:0x0818, B:395:0x081d, B:421:0x0846, B:415:0x083b, B:417:0x0842, B:418:0x0843), top: B:633:0x079f }] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x085f A[Catch: Exception -> 0x098b, TryCatch #56 {Exception -> 0x098b, blocks: (B:487:0x08d6, B:489:0x08dc, B:490:0x08dd, B:422:0x0847, B:433:0x0857, B:435:0x085f, B:436:0x0860, B:441:0x086a, B:443:0x0872, B:444:0x0873, B:453:0x088e, B:455:0x0895, B:456:0x0896, B:467:0x08ad, B:469:0x08b4, B:470:0x08b5, B:478:0x08c0, B:480:0x08c9, B:481:0x08ca, B:506:0x08f7, B:508:0x08fe, B:509:0x08ff, B:517:0x090a, B:519:0x0913, B:520:0x0914, B:534:0x092e, B:536:0x0935, B:537:0x0936, B:547:0x0945, B:549:0x094e, B:550:0x094f, B:560:0x095e, B:562:0x0967, B:563:0x0968, B:568:0x0974, B:570:0x097b, B:571:0x097c, B:573:0x097e, B:575:0x0989, B:576:0x098a, B:15:0x00e4), top: B:676:0x00e4, inners: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0860 A[Catch: Exception -> 0x098b, TryCatch #56 {Exception -> 0x098b, blocks: (B:487:0x08d6, B:489:0x08dc, B:490:0x08dd, B:422:0x0847, B:433:0x0857, B:435:0x085f, B:436:0x0860, B:441:0x086a, B:443:0x0872, B:444:0x0873, B:453:0x088e, B:455:0x0895, B:456:0x0896, B:467:0x08ad, B:469:0x08b4, B:470:0x08b5, B:478:0x08c0, B:480:0x08c9, B:481:0x08ca, B:506:0x08f7, B:508:0x08fe, B:509:0x08ff, B:517:0x090a, B:519:0x0913, B:520:0x0914, B:534:0x092e, B:536:0x0935, B:537:0x0936, B:547:0x0945, B:549:0x094e, B:550:0x094f, B:560:0x095e, B:562:0x0967, B:563:0x0968, B:568:0x0974, B:570:0x097b, B:571:0x097c, B:573:0x097e, B:575:0x0989, B:576:0x098a, B:15:0x00e4), top: B:676:0x00e4, inners: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x08b4 A[Catch: Exception -> 0x098b, TryCatch #56 {Exception -> 0x098b, blocks: (B:487:0x08d6, B:489:0x08dc, B:490:0x08dd, B:422:0x0847, B:433:0x0857, B:435:0x085f, B:436:0x0860, B:441:0x086a, B:443:0x0872, B:444:0x0873, B:453:0x088e, B:455:0x0895, B:456:0x0896, B:467:0x08ad, B:469:0x08b4, B:470:0x08b5, B:478:0x08c0, B:480:0x08c9, B:481:0x08ca, B:506:0x08f7, B:508:0x08fe, B:509:0x08ff, B:517:0x090a, B:519:0x0913, B:520:0x0914, B:534:0x092e, B:536:0x0935, B:537:0x0936, B:547:0x0945, B:549:0x094e, B:550:0x094f, B:560:0x095e, B:562:0x0967, B:563:0x0968, B:568:0x0974, B:570:0x097b, B:571:0x097c, B:573:0x097e, B:575:0x0989, B:576:0x098a, B:15:0x00e4), top: B:676:0x00e4, inners: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:470:0x08b5 A[Catch: Exception -> 0x098b, TryCatch #56 {Exception -> 0x098b, blocks: (B:487:0x08d6, B:489:0x08dc, B:490:0x08dd, B:422:0x0847, B:433:0x0857, B:435:0x085f, B:436:0x0860, B:441:0x086a, B:443:0x0872, B:444:0x0873, B:453:0x088e, B:455:0x0895, B:456:0x0896, B:467:0x08ad, B:469:0x08b4, B:470:0x08b5, B:478:0x08c0, B:480:0x08c9, B:481:0x08ca, B:506:0x08f7, B:508:0x08fe, B:509:0x08ff, B:517:0x090a, B:519:0x0913, B:520:0x0914, B:534:0x092e, B:536:0x0935, B:537:0x0936, B:547:0x0945, B:549:0x094e, B:550:0x094f, B:560:0x095e, B:562:0x0967, B:563:0x0968, B:568:0x0974, B:570:0x097b, B:571:0x097c, B:573:0x097e, B:575:0x0989, B:576:0x098a, B:15:0x00e4), top: B:676:0x00e4, inners: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:480:0x08c9 A[Catch: Exception -> 0x098b, TryCatch #56 {Exception -> 0x098b, blocks: (B:487:0x08d6, B:489:0x08dc, B:490:0x08dd, B:422:0x0847, B:433:0x0857, B:435:0x085f, B:436:0x0860, B:441:0x086a, B:443:0x0872, B:444:0x0873, B:453:0x088e, B:455:0x0895, B:456:0x0896, B:467:0x08ad, B:469:0x08b4, B:470:0x08b5, B:478:0x08c0, B:480:0x08c9, B:481:0x08ca, B:506:0x08f7, B:508:0x08fe, B:509:0x08ff, B:517:0x090a, B:519:0x0913, B:520:0x0914, B:534:0x092e, B:536:0x0935, B:537:0x0936, B:547:0x0945, B:549:0x094e, B:550:0x094f, B:560:0x095e, B:562:0x0967, B:563:0x0968, B:568:0x0974, B:570:0x097b, B:571:0x097c, B:573:0x097e, B:575:0x0989, B:576:0x098a, B:15:0x00e4), top: B:676:0x00e4, inners: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:481:0x08ca A[Catch: Exception -> 0x098b, TryCatch #56 {Exception -> 0x098b, blocks: (B:487:0x08d6, B:489:0x08dc, B:490:0x08dd, B:422:0x0847, B:433:0x0857, B:435:0x085f, B:436:0x0860, B:441:0x086a, B:443:0x0872, B:444:0x0873, B:453:0x088e, B:455:0x0895, B:456:0x0896, B:467:0x08ad, B:469:0x08b4, B:470:0x08b5, B:478:0x08c0, B:480:0x08c9, B:481:0x08ca, B:506:0x08f7, B:508:0x08fe, B:509:0x08ff, B:517:0x090a, B:519:0x0913, B:520:0x0914, B:534:0x092e, B:536:0x0935, B:537:0x0936, B:547:0x0945, B:549:0x094e, B:550:0x094f, B:560:0x095e, B:562:0x0967, B:563:0x0968, B:568:0x0974, B:570:0x097b, B:571:0x097c, B:573:0x097e, B:575:0x0989, B:576:0x098a, B:15:0x00e4), top: B:676:0x00e4, inners: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x08dc A[Catch: Exception -> 0x098b, TryCatch #56 {Exception -> 0x098b, blocks: (B:487:0x08d6, B:489:0x08dc, B:490:0x08dd, B:422:0x0847, B:433:0x0857, B:435:0x085f, B:436:0x0860, B:441:0x086a, B:443:0x0872, B:444:0x0873, B:453:0x088e, B:455:0x0895, B:456:0x0896, B:467:0x08ad, B:469:0x08b4, B:470:0x08b5, B:478:0x08c0, B:480:0x08c9, B:481:0x08ca, B:506:0x08f7, B:508:0x08fe, B:509:0x08ff, B:517:0x090a, B:519:0x0913, B:520:0x0914, B:534:0x092e, B:536:0x0935, B:537:0x0936, B:547:0x0945, B:549:0x094e, B:550:0x094f, B:560:0x095e, B:562:0x0967, B:563:0x0968, B:568:0x0974, B:570:0x097b, B:571:0x097c, B:573:0x097e, B:575:0x0989, B:576:0x098a, B:15:0x00e4), top: B:676:0x00e4, inners: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x08dd A[Catch: Exception -> 0x098b, TryCatch #56 {Exception -> 0x098b, blocks: (B:487:0x08d6, B:489:0x08dc, B:490:0x08dd, B:422:0x0847, B:433:0x0857, B:435:0x085f, B:436:0x0860, B:441:0x086a, B:443:0x0872, B:444:0x0873, B:453:0x088e, B:455:0x0895, B:456:0x0896, B:467:0x08ad, B:469:0x08b4, B:470:0x08b5, B:478:0x08c0, B:480:0x08c9, B:481:0x08ca, B:506:0x08f7, B:508:0x08fe, B:509:0x08ff, B:517:0x090a, B:519:0x0913, B:520:0x0914, B:534:0x092e, B:536:0x0935, B:537:0x0936, B:547:0x0945, B:549:0x094e, B:550:0x094f, B:560:0x095e, B:562:0x0967, B:563:0x0968, B:568:0x0974, B:570:0x097b, B:571:0x097c, B:573:0x097e, B:575:0x0989, B:576:0x098a, B:15:0x00e4), top: B:676:0x00e4, inners: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x08fe A[Catch: Exception -> 0x098b, TryCatch #56 {Exception -> 0x098b, blocks: (B:487:0x08d6, B:489:0x08dc, B:490:0x08dd, B:422:0x0847, B:433:0x0857, B:435:0x085f, B:436:0x0860, B:441:0x086a, B:443:0x0872, B:444:0x0873, B:453:0x088e, B:455:0x0895, B:456:0x0896, B:467:0x08ad, B:469:0x08b4, B:470:0x08b5, B:478:0x08c0, B:480:0x08c9, B:481:0x08ca, B:506:0x08f7, B:508:0x08fe, B:509:0x08ff, B:517:0x090a, B:519:0x0913, B:520:0x0914, B:534:0x092e, B:536:0x0935, B:537:0x0936, B:547:0x0945, B:549:0x094e, B:550:0x094f, B:560:0x095e, B:562:0x0967, B:563:0x0968, B:568:0x0974, B:570:0x097b, B:571:0x097c, B:573:0x097e, B:575:0x0989, B:576:0x098a, B:15:0x00e4), top: B:676:0x00e4, inners: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:509:0x08ff A[Catch: Exception -> 0x098b, TryCatch #56 {Exception -> 0x098b, blocks: (B:487:0x08d6, B:489:0x08dc, B:490:0x08dd, B:422:0x0847, B:433:0x0857, B:435:0x085f, B:436:0x0860, B:441:0x086a, B:443:0x0872, B:444:0x0873, B:453:0x088e, B:455:0x0895, B:456:0x0896, B:467:0x08ad, B:469:0x08b4, B:470:0x08b5, B:478:0x08c0, B:480:0x08c9, B:481:0x08ca, B:506:0x08f7, B:508:0x08fe, B:509:0x08ff, B:517:0x090a, B:519:0x0913, B:520:0x0914, B:534:0x092e, B:536:0x0935, B:537:0x0936, B:547:0x0945, B:549:0x094e, B:550:0x094f, B:560:0x095e, B:562:0x0967, B:563:0x0968, B:568:0x0974, B:570:0x097b, B:571:0x097c, B:573:0x097e, B:575:0x0989, B:576:0x098a, B:15:0x00e4), top: B:676:0x00e4, inners: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0913 A[Catch: Exception -> 0x098b, TryCatch #56 {Exception -> 0x098b, blocks: (B:487:0x08d6, B:489:0x08dc, B:490:0x08dd, B:422:0x0847, B:433:0x0857, B:435:0x085f, B:436:0x0860, B:441:0x086a, B:443:0x0872, B:444:0x0873, B:453:0x088e, B:455:0x0895, B:456:0x0896, B:467:0x08ad, B:469:0x08b4, B:470:0x08b5, B:478:0x08c0, B:480:0x08c9, B:481:0x08ca, B:506:0x08f7, B:508:0x08fe, B:509:0x08ff, B:517:0x090a, B:519:0x0913, B:520:0x0914, B:534:0x092e, B:536:0x0935, B:537:0x0936, B:547:0x0945, B:549:0x094e, B:550:0x094f, B:560:0x095e, B:562:0x0967, B:563:0x0968, B:568:0x0974, B:570:0x097b, B:571:0x097c, B:573:0x097e, B:575:0x0989, B:576:0x098a, B:15:0x00e4), top: B:676:0x00e4, inners: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0914 A[Catch: Exception -> 0x098b, TryCatch #56 {Exception -> 0x098b, blocks: (B:487:0x08d6, B:489:0x08dc, B:490:0x08dd, B:422:0x0847, B:433:0x0857, B:435:0x085f, B:436:0x0860, B:441:0x086a, B:443:0x0872, B:444:0x0873, B:453:0x088e, B:455:0x0895, B:456:0x0896, B:467:0x08ad, B:469:0x08b4, B:470:0x08b5, B:478:0x08c0, B:480:0x08c9, B:481:0x08ca, B:506:0x08f7, B:508:0x08fe, B:509:0x08ff, B:517:0x090a, B:519:0x0913, B:520:0x0914, B:534:0x092e, B:536:0x0935, B:537:0x0936, B:547:0x0945, B:549:0x094e, B:550:0x094f, B:560:0x095e, B:562:0x0967, B:563:0x0968, B:568:0x0974, B:570:0x097b, B:571:0x097c, B:573:0x097e, B:575:0x0989, B:576:0x098a, B:15:0x00e4), top: B:676:0x00e4, inners: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0935 A[Catch: Exception -> 0x098b, TryCatch #56 {Exception -> 0x098b, blocks: (B:487:0x08d6, B:489:0x08dc, B:490:0x08dd, B:422:0x0847, B:433:0x0857, B:435:0x085f, B:436:0x0860, B:441:0x086a, B:443:0x0872, B:444:0x0873, B:453:0x088e, B:455:0x0895, B:456:0x0896, B:467:0x08ad, B:469:0x08b4, B:470:0x08b5, B:478:0x08c0, B:480:0x08c9, B:481:0x08ca, B:506:0x08f7, B:508:0x08fe, B:509:0x08ff, B:517:0x090a, B:519:0x0913, B:520:0x0914, B:534:0x092e, B:536:0x0935, B:537:0x0936, B:547:0x0945, B:549:0x094e, B:550:0x094f, B:560:0x095e, B:562:0x0967, B:563:0x0968, B:568:0x0974, B:570:0x097b, B:571:0x097c, B:573:0x097e, B:575:0x0989, B:576:0x098a, B:15:0x00e4), top: B:676:0x00e4, inners: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0936 A[Catch: Exception -> 0x098b, TryCatch #56 {Exception -> 0x098b, blocks: (B:487:0x08d6, B:489:0x08dc, B:490:0x08dd, B:422:0x0847, B:433:0x0857, B:435:0x085f, B:436:0x0860, B:441:0x086a, B:443:0x0872, B:444:0x0873, B:453:0x088e, B:455:0x0895, B:456:0x0896, B:467:0x08ad, B:469:0x08b4, B:470:0x08b5, B:478:0x08c0, B:480:0x08c9, B:481:0x08ca, B:506:0x08f7, B:508:0x08fe, B:509:0x08ff, B:517:0x090a, B:519:0x0913, B:520:0x0914, B:534:0x092e, B:536:0x0935, B:537:0x0936, B:547:0x0945, B:549:0x094e, B:550:0x094f, B:560:0x095e, B:562:0x0967, B:563:0x0968, B:568:0x0974, B:570:0x097b, B:571:0x097c, B:573:0x097e, B:575:0x0989, B:576:0x098a, B:15:0x00e4), top: B:676:0x00e4, inners: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:549:0x094e A[Catch: Exception -> 0x098b, TryCatch #56 {Exception -> 0x098b, blocks: (B:487:0x08d6, B:489:0x08dc, B:490:0x08dd, B:422:0x0847, B:433:0x0857, B:435:0x085f, B:436:0x0860, B:441:0x086a, B:443:0x0872, B:444:0x0873, B:453:0x088e, B:455:0x0895, B:456:0x0896, B:467:0x08ad, B:469:0x08b4, B:470:0x08b5, B:478:0x08c0, B:480:0x08c9, B:481:0x08ca, B:506:0x08f7, B:508:0x08fe, B:509:0x08ff, B:517:0x090a, B:519:0x0913, B:520:0x0914, B:534:0x092e, B:536:0x0935, B:537:0x0936, B:547:0x0945, B:549:0x094e, B:550:0x094f, B:560:0x095e, B:562:0x0967, B:563:0x0968, B:568:0x0974, B:570:0x097b, B:571:0x097c, B:573:0x097e, B:575:0x0989, B:576:0x098a, B:15:0x00e4), top: B:676:0x00e4, inners: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:550:0x094f A[Catch: Exception -> 0x098b, TryCatch #56 {Exception -> 0x098b, blocks: (B:487:0x08d6, B:489:0x08dc, B:490:0x08dd, B:422:0x0847, B:433:0x0857, B:435:0x085f, B:436:0x0860, B:441:0x086a, B:443:0x0872, B:444:0x0873, B:453:0x088e, B:455:0x0895, B:456:0x0896, B:467:0x08ad, B:469:0x08b4, B:470:0x08b5, B:478:0x08c0, B:480:0x08c9, B:481:0x08ca, B:506:0x08f7, B:508:0x08fe, B:509:0x08ff, B:517:0x090a, B:519:0x0913, B:520:0x0914, B:534:0x092e, B:536:0x0935, B:537:0x0936, B:547:0x0945, B:549:0x094e, B:550:0x094f, B:560:0x095e, B:562:0x0967, B:563:0x0968, B:568:0x0974, B:570:0x097b, B:571:0x097c, B:573:0x097e, B:575:0x0989, B:576:0x098a, B:15:0x00e4), top: B:676:0x00e4, inners: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0967 A[Catch: Exception -> 0x098b, TryCatch #56 {Exception -> 0x098b, blocks: (B:487:0x08d6, B:489:0x08dc, B:490:0x08dd, B:422:0x0847, B:433:0x0857, B:435:0x085f, B:436:0x0860, B:441:0x086a, B:443:0x0872, B:444:0x0873, B:453:0x088e, B:455:0x0895, B:456:0x0896, B:467:0x08ad, B:469:0x08b4, B:470:0x08b5, B:478:0x08c0, B:480:0x08c9, B:481:0x08ca, B:506:0x08f7, B:508:0x08fe, B:509:0x08ff, B:517:0x090a, B:519:0x0913, B:520:0x0914, B:534:0x092e, B:536:0x0935, B:537:0x0936, B:547:0x0945, B:549:0x094e, B:550:0x094f, B:560:0x095e, B:562:0x0967, B:563:0x0968, B:568:0x0974, B:570:0x097b, B:571:0x097c, B:573:0x097e, B:575:0x0989, B:576:0x098a, B:15:0x00e4), top: B:676:0x00e4, inners: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0968 A[Catch: Exception -> 0x098b, TryCatch #56 {Exception -> 0x098b, blocks: (B:487:0x08d6, B:489:0x08dc, B:490:0x08dd, B:422:0x0847, B:433:0x0857, B:435:0x085f, B:436:0x0860, B:441:0x086a, B:443:0x0872, B:444:0x0873, B:453:0x088e, B:455:0x0895, B:456:0x0896, B:467:0x08ad, B:469:0x08b4, B:470:0x08b5, B:478:0x08c0, B:480:0x08c9, B:481:0x08ca, B:506:0x08f7, B:508:0x08fe, B:509:0x08ff, B:517:0x090a, B:519:0x0913, B:520:0x0914, B:534:0x092e, B:536:0x0935, B:537:0x0936, B:547:0x0945, B:549:0x094e, B:550:0x094f, B:560:0x095e, B:562:0x0967, B:563:0x0968, B:568:0x0974, B:570:0x097b, B:571:0x097c, B:573:0x097e, B:575:0x0989, B:576:0x098a, B:15:0x00e4), top: B:676:0x00e4, inners: #41 }] */
    /* JADX WARN: Removed duplicated region for block: B:665:0x022c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0224 A[Catch: Exception -> 0x021a, TRY_LEAVE, TryCatch #76 {Exception -> 0x021a, blocks: (B:43:0x018c, B:49:0x01f4, B:71:0x0224, B:80:0x0265, B:82:0x026b, B:83:0x026c, B:116:0x030b, B:120:0x0380, B:125:0x03da, B:201:0x04ec, B:217:0x053f, B:221:0x0550, B:226:0x0589, B:228:0x058f, B:229:0x0590, B:231:0x0592, B:233:0x0599, B:234:0x059a, B:236:0x05a6, B:237:0x05ac, B:252:0x05fd, B:254:0x05ff, B:256:0x0606, B:257:0x0607, B:270:0x0630, B:317:0x06f3, B:322:0x071e, B:327:0x0758, B:329:0x075e, B:330:0x075f, B:332:0x0761, B:334:0x0768, B:335:0x0769, B:337:0x076b, B:339:0x0772, B:340:0x0773, B:127:0x03e5, B:129:0x03ec, B:130:0x03ed, B:132:0x03ef, B:134:0x03f6, B:135:0x03f7, B:137:0x03f9, B:139:0x0400, B:140:0x0401, B:142:0x0403, B:144:0x040a, B:145:0x040b, B:147:0x040d, B:149:0x0414, B:150:0x0415, B:155:0x0432, B:157:0x0438, B:158:0x0439, B:160:0x043b, B:162:0x0442, B:163:0x0443, B:85:0x026e, B:87:0x0275, B:88:0x0276, B:53:0x01fd, B:55:0x0204, B:56:0x0205, B:58:0x0207, B:60:0x020e, B:61:0x020f, B:63:0x0211, B:65:0x0218, B:66:0x0219, B:151:0x0416, B:114:0x02df, B:76:0x023a, B:73:0x022c, B:124:0x03bd, B:123:0x03a4, B:121:0x0387, B:240:0x05e3, B:242:0x05ea, B:243:0x05ef, B:245:0x05f1, B:247:0x05f8, B:248:0x05f9, B:48:0x01cd, B:235:0x059b, B:119:0x0357, B:46:0x01b8, B:117:0x033a, B:44:0x019a), top: B:740:0x018c, inners: #8, #14, #32, #35, #68, #73, #77, #78, #80, #82, #85, #88, #90, #92 }] */
    /* JADX WARN: Removed duplicated region for block: B:736:0x05ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:740:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:779:0x09a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:784:0x099a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0277  */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v24, types: [java.lang.ClassLoader] */
    /* JADX WARN: Type inference failed for: r11v26, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v37, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v87, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [char[], int[], java.lang.Class[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v118, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r12v124 */
    /* JADX WARN: Type inference failed for: r12v125 */
    /* JADX WARN: Type inference failed for: r12v126 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v59 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v80 */
    /* JADX WARN: Type inference failed for: r12v81 */
    /* JADX WARN: Type inference failed for: r12v83 */
    /* JADX WARN: Type inference failed for: r12v84 */
    /* JADX WARN: Type inference failed for: r12v98 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v100 */
    /* JADX WARN: Type inference failed for: r13v101 */
    /* JADX WARN: Type inference failed for: r13v102 */
    /* JADX WARN: Type inference failed for: r13v103 */
    /* JADX WARN: Type inference failed for: r13v104 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v62 */
    /* JADX WARN: Type inference failed for: r13v63 */
    /* JADX WARN: Type inference failed for: r13v64 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v77 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r13v98 */
    /* JADX WARN: Type inference failed for: r13v99 */
    /* JADX WARN: Type inference failed for: r14v100 */
    /* JADX WARN: Type inference failed for: r14v106 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v72 */
    /* JADX WARN: Type inference failed for: r14v78 */
    /* JADX WARN: Type inference failed for: r14v79 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v84 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v66, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v89, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v77, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v66, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v100 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v116 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v131 */
    /* JADX WARN: Type inference failed for: r8v132 */
    /* JADX WARN: Type inference failed for: r8v133 */
    /* JADX WARN: Type inference failed for: r8v134 */
    /* JADX WARN: Type inference failed for: r8v135 */
    /* JADX WARN: Type inference failed for: r8v136 */
    /* JADX WARN: Type inference failed for: r8v137 */
    /* JADX WARN: Type inference failed for: r8v138 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v67 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r8v97 */
    /* JADX WARN: Type inference failed for: r8v98 */
    /* JADX WARN: Type inference failed for: r8v99 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void KWHzl(String str) throws Exception {
        ?? r14;
        Exception exc;
        ?? r142;
        ?? r13;
        ?? r12;
        ?? r8;
        Object[] objArr;
        ?? OLrzqt2;
        int i;
        boolean z;
        ?? r132;
        Throwable cause;
        Object[] objArr2;
        Class[] clsArr;
        Throwable cause2;
        Object[] objArr3;
        Class[] clsArr2;
        Throwable cause3;
        Object[] objArr4;
        Throwable cause4;
        Object[] objArr5;
        Class[] clsArr3;
        Throwable cause5;
        Object[] objArr6;
        Class[] clsArr4;
        InputStream inputStream;
        Throwable th;
        Throwable cause6;
        Object[] objArr7;
        Object objEZpvd;
        Throwable cause7;
        Object[] objArr8;
        Class[] clsArr5;
        Throwable cause8;
        Object[] objArr9;
        Object[] objArr10;
        Throwable cause9;
        Object[] objArr11;
        Throwable cause10;
        Object[] objArr12;
        Object[] objArr13;
        Method declaredMethod;
        Throwable cause11;
        Object[] objArr14;
        Object[] objArr15;
        Object objInvoke;
        String str2 = str;
        int i2 = 1;
        Object[] objArr16 = new Object[1];
        a((char) 34002, 1, 11, objArr16);
        ?? r4 = 0;
        String str3 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        a((char) 59120, 12, 9, objArr17);
        String str4 = (String) objArr17[0];
        Object[] objArr18 = new Object[1];
        a((char) 17163, 26, 10, objArr18);
        String str5 = (String) objArr18[0];
        Object[] objArr19 = new Object[1];
        a((char) 6931, 0, 1, objArr19);
        try {
            ?? NewInstance = 4;
            ?? r122 = 0;
            ?? r11 = 2;
            Object objInvoke2 = String.class.getMethod(str4, Integer.TYPE, Integer.TYPE).invoke(str2, Integer.valueOf(((Integer) String.class.getMethod(str3, String.class).invoke(str2, (String) objArr19[0])).intValue() + 4), Integer.valueOf(((Integer) String.class.getMethod("length", null).invoke(str2, null)).intValue() - 3));
            Object[] objArr20 = new Object[1];
            a((char) 58555, 21, 5, objArr20);
            String[] strArrAEQbTJ = Zs.AEQbTJ(Zs.copydefault((byte[]) String.class.getMethod("getBytes", String.class).invoke(objInvoke2, (String) objArr20[0])));
            if (strArrAEQbTJ == null) {
                strArrAEQbTJ = new String[0];
            }
            int length = strArrAEQbTJ.length;
            ?? r10 = new String[length + 1];
            System.arraycopy(strArrAEQbTJ, 0, r10, 0, length);
            r10[length] = str2;
            int i3 = 0;
            while (i3 <= length) {
                ?? r133 = r10[i3];
                try {
                    objArr = new Object[i2];
                } catch (Exception e) {
                    e = e;
                    NewInstance = i2;
                    r14 = r11;
                    r133 = r122;
                }
                try {
                    b(r122, r122, 127, new byte[]{-121, -110, -111, -111, -126, -112, -124, -113, -114, -122, -124, -120, -122, -115, -116, -126, -121, -126, -118, -116, -126, -121, -126, -118, -116}, objArr);
                    r14 = (String) objArr[r4];
                } catch (Exception e2) {
                    e = e2;
                    NewInstance = i2;
                    r133 = r122;
                    r14 = 2;
                    r122 = r4;
                    exc = e;
                    r8 = NewInstance;
                    r12 = r122;
                    r13 = r133;
                    r142 = r14;
                    if (i3 >= length) {
                    }
                }
                try {
                    try {
                        r14 = new Object[]{r14};
                        Class[] clsArr6 = new Class[i2];
                        clsArr6[r4] = String.class;
                        NewInstance = File.class.getDeclaredConstructor(clsArr6).newInstance(r14);
                    } catch (Exception e3) {
                        e = e3;
                    }
                    try {
                        Object[] objArr21 = new Object[i2];
                        b(r122, r122, 127, new byte[]{-110, -121, -123, -117, -108, -109, -126, -115}, objArr21);
                        try {
                            boolean zBooleanValue = ((Boolean) File.class.getMethod((String) objArr21[0], r122).invoke(NewInstance, r122)).booleanValue();
                            ?? externalStorageDirectory = NewInstance;
                            if (zBooleanValue) {
                                if (i3 < length) {
                                }
                                if (i3 < length) {
                                }
                                if (OLrzqt2 != 0) {
                                }
                                exc = e;
                                i = 1;
                                z = false;
                                r132 = 0;
                                r142 = 2;
                                r8 = i;
                                r12 = z;
                                r13 = r132;
                                if (i3 >= length) {
                                }
                            } else {
                                try {
                                    Object[] objArr22 = new Object[i2];
                                    b(r122, r122, 127, new byte[]{-117, -123, -118, -119, -120, -121, -124, -122, -123, -124, -126, -125, -126, -127}, objArr22);
                                    String str6 = (String) objArr22[0];
                                    try {
                                        Object[] objArr23 = {System.getProperty(str6, str6)};
                                        Class[] clsArr7 = new Class[i2];
                                        clsArr7[0] = String.class;
                                        Object objNewInstance = File.class.getDeclaredConstructor(clsArr7).newInstance(objArr23);
                                        try {
                                            Object[] objArr24 = new Object[i2];
                                            b(r122, r122, 127, new byte[]{-110, -121, -123, -117, -108, -109, -126, -115}, objArr24);
                                            boolean zBooleanValue2 = ((Boolean) File.class.getMethod((String) objArr24[0], r122).invoke(objNewInstance, r122)).booleanValue();
                                            externalStorageDirectory = objNewInstance;
                                            if (!zBooleanValue2) {
                                                externalStorageDirectory = Environment.getExternalStorageDirectory();
                                            }
                                            if (i3 < length) {
                                                try {
                                                    Object[] objArr25 = new Object[i2];
                                                    a((char) 6931, 0, i2, objArr25);
                                                    try {
                                                        Object[] objArr26 = {(String) objArr25[0]};
                                                        Class[] clsArr8 = new Class[i2];
                                                        clsArr8[0] = String.class;
                                                        int iIntValue = ((Integer) String.class.getMethod(str3, clsArr8).invoke(str2, objArr26)).intValue() + 4;
                                                        try {
                                                            int iIntValue2 = ((Integer) String.class.getMethod("length", r122).invoke(str2, r122)).intValue() - 3;
                                                            try {
                                                                Object[] objArr27 = new Object[2];
                                                                objArr27[i2] = Integer.valueOf(iIntValue2);
                                                                objArr27[0] = Integer.valueOf(iIntValue);
                                                                String strOLrzqt = Zr.OLrzqt(Native.class, (String) String.class.getMethod(str4, Integer.TYPE, Integer.TYPE).invoke(str2, objArr27));
                                                                OLrzqt2 = strOLrzqt;
                                                                if (strOLrzqt == null) {
                                                                    OLrzqt2 = str2;
                                                                }
                                                            } catch (Throwable th2) {
                                                                Throwable cause12 = th2.getCause();
                                                                if (cause12 == null) {
                                                                    throw th2;
                                                                }
                                                                throw cause12;
                                                            }
                                                        } catch (Throwable th3) {
                                                            Throwable cause13 = th3.getCause();
                                                            if (cause13 == null) {
                                                                throw th3;
                                                            }
                                                            throw cause13;
                                                        }
                                                    } catch (Throwable th4) {
                                                        Throwable cause14 = th4.getCause();
                                                        if (cause14 == null) {
                                                            throw th4;
                                                        }
                                                        throw cause14;
                                                    }
                                                } catch (Exception e4) {
                                                    exc = e4;
                                                    i = 1;
                                                    z = false;
                                                    r132 = 0;
                                                    r142 = 2;
                                                    r8 = i;
                                                    r12 = z;
                                                    r13 = r132;
                                                    if (i3 >= length) {
                                                    }
                                                }
                                            } else {
                                                OLrzqt2 = r133;
                                            }
                                            if (i3 < length) {
                                                OLrzqt2 = Zr.OLrzqt(Native.class, OLrzqt2);
                                            }
                                            if (OLrzqt2 != 0) {
                                                try {
                                                    Object objInvoke3 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                    ?? r134 = r133;
                                                    if (i3 >= length) {
                                                        r134 = str2;
                                                    }
                                                    try {
                                                        Object[] objArr28 = {r134};
                                                        Object[] objArr29 = new Object[1];
                                                        b(null, null, 127, new byte[]{-105, -117, -126, -117, -106, -123, -107, -118, -126, -122, -111}, objArr29);
                                                        Runtime.class.getMethod((String) objArr29[0], String.class).invoke(objInvoke3, objArr28);
                                                        return;
                                                    } catch (Throwable th5) {
                                                        Throwable cause15 = th5.getCause();
                                                        if (cause15 == null) {
                                                            throw th5;
                                                        }
                                                        throw cause15;
                                                    }
                                                } catch (Throwable th6) {
                                                    Throwable cause16 = th6.getCause();
                                                    if (cause16 == null) {
                                                        throw th6;
                                                    }
                                                    throw cause16;
                                                }
                                            }
                                            try {
                                                objArr2 = new Object[1];
                                                try {
                                                    objArr2[0] = 47;
                                                    clsArr = new Class[1];
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                            }
                                            try {
                                                clsArr[0] = Integer.TYPE;
                                            } catch (Throwable th9) {
                                                th = th9;
                                                Throwable th10 = th;
                                                cause = th10.getCause();
                                                if (cause != null) {
                                                }
                                            }
                                            try {
                                                try {
                                                    objArr3 = new Object[1];
                                                    try {
                                                        objArr3[0] = Integer.valueOf(((Integer) String.class.getMethod(str3, clsArr).invoke(OLrzqt2, objArr2)).intValue() + 1);
                                                        clsArr2 = new Class[1];
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                    }
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                }
                                                try {
                                                    clsArr2[0] = Integer.TYPE;
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    Throwable th14 = th;
                                                    cause2 = th14.getCause();
                                                    if (cause2 != null) {
                                                    }
                                                }
                                                try {
                                                    try {
                                                        objArr4 = new Object[]{externalStorageDirectory, String.class.getMethod(str4, clsArr2).invoke(OLrzqt2, objArr3)};
                                                    } catch (Throwable th15) {
                                                        th = th15;
                                                    }
                                                    try {
                                                        Class[] clsArr9 = new Class[2];
                                                        try {
                                                            clsArr9[0] = File.class;
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                            Throwable th17 = th;
                                                            cause3 = th17.getCause();
                                                            if (cause3 == null) {
                                                            }
                                                        }
                                                        try {
                                                            clsArr9[1] = String.class;
                                                            Object objNewInstance2 = File.class.getDeclaredConstructor(clsArr9).newInstance(objArr4);
                                                            try {
                                                                URL resource = Native.class.getClassLoader().getResource(OLrzqt2);
                                                                if (resource == null) {
                                                                    try {
                                                                        Object[] objArr30 = new Object[1];
                                                                        a((char) 0, 36, 8, objArr30);
                                                                        if (((Boolean) String.class.getMethod((String) objArr30[0], CharSequence.class).invoke(OLrzqt2, "!")).booleanValue()) {
                                                                            ?? sb = new StringBuilder();
                                                                            Object[] objArr31 = new Object[1];
                                                                            b(null, null, 127, new byte[]{-104, -110, -111, -123, -103, -104, -117, -126, -127}, objArr31);
                                                                            sb.append((String) objArr31[0]);
                                                                            sb.append(OLrzqt2);
                                                                            String path = new URL(sb.toString()).getPath();
                                                                            try {
                                                                                try {
                                                                                    ZipFile zipFile = new ZipFile((String) String.class.getMethod(str4, Integer.TYPE, Integer.TYPE).invoke(path, 5, Integer.valueOf(((Integer) String.class.getMethod(str3, String.class).invoke(path, "!/")).intValue())));
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                inputStream = zipFile.getInputStream(zipFile.getEntry((String) String.class.getMethod(str4, Integer.TYPE).invoke(String.class.getMethod(str4, Integer.TYPE).invoke(OLrzqt2, Integer.valueOf(((Integer) String.class.getMethod(str3, String.class).invoke(OLrzqt2, "!/")).intValue())), 2)));
                                                                                            } catch (Throwable th18) {
                                                                                                Throwable cause17 = th18.getCause();
                                                                                                if (cause17 == null) {
                                                                                                    throw th18;
                                                                                                }
                                                                                                throw cause17;
                                                                                            }
                                                                                        } catch (Throwable th19) {
                                                                                            Throwable cause18 = th19.getCause();
                                                                                            if (cause18 == null) {
                                                                                                throw th19;
                                                                                            }
                                                                                            throw cause18;
                                                                                        }
                                                                                    } catch (Throwable th20) {
                                                                                        Throwable cause19 = th20.getCause();
                                                                                        if (cause19 == null) {
                                                                                            throw th20;
                                                                                        }
                                                                                        throw cause19;
                                                                                    }
                                                                                } catch (Throwable th21) {
                                                                                    Throwable cause20 = th21.getCause();
                                                                                    if (cause20 == null) {
                                                                                        throw th21;
                                                                                    }
                                                                                    throw cause20;
                                                                                }
                                                                            } catch (Throwable th22) {
                                                                                Throwable cause21 = th22.getCause();
                                                                                if (cause21 == null) {
                                                                                    throw th22;
                                                                                }
                                                                                throw cause21;
                                                                            }
                                                                        } else {
                                                                            try {
                                                                                inputStream = (InputStream) FileInputStream.class.getDeclaredConstructor(String.class).newInstance(OLrzqt2);
                                                                            } catch (Throwable th23) {
                                                                                Throwable cause22 = th23.getCause();
                                                                                if (cause22 == null) {
                                                                                    throw th23;
                                                                                }
                                                                                throw cause22;
                                                                            }
                                                                        }
                                                                    } catch (Throwable th24) {
                                                                        Throwable cause23 = th24.getCause();
                                                                        if (cause23 == null) {
                                                                            throw th24;
                                                                        }
                                                                        throw cause23;
                                                                    }
                                                                } else {
                                                                    String path2 = resource.getPath();
                                                                    try {
                                                                        objArr5 = new Object[]{"!/" + OLrzqt2};
                                                                    } catch (Throwable th25) {
                                                                        th = th25;
                                                                    }
                                                                    try {
                                                                        clsArr3 = new Class[1];
                                                                    } catch (Throwable th26) {
                                                                        th = th26;
                                                                        Throwable th27 = th;
                                                                        cause4 = th27.getCause();
                                                                        if (cause4 != null) {
                                                                        }
                                                                    }
                                                                    try {
                                                                        clsArr3[0] = String.class;
                                                                        try {
                                                                            objArr6 = new Object[2];
                                                                            try {
                                                                                try {
                                                                                    objArr6[1] = Integer.valueOf(((Integer) String.class.getMethod(str3, clsArr3).invoke(path2, objArr5)).intValue());
                                                                                } catch (Throwable th28) {
                                                                                    th = th28;
                                                                                }
                                                                            } catch (Throwable th29) {
                                                                                th = th29;
                                                                            }
                                                                        } catch (Throwable th30) {
                                                                            th = th30;
                                                                        }
                                                                        try {
                                                                            objArr6[0] = 5;
                                                                        } catch (Throwable th31) {
                                                                            th = th31;
                                                                            Throwable th32 = th;
                                                                            cause5 = th32.getCause();
                                                                            if (cause5 == null) {
                                                                            }
                                                                        }
                                                                        try {
                                                                            clsArr4 = new Class[2];
                                                                            clsArr4[0] = Integer.TYPE;
                                                                        } catch (Throwable th33) {
                                                                            th = th33;
                                                                            Throwable th322 = th;
                                                                            cause5 = th322.getCause();
                                                                            if (cause5 == null) {
                                                                            }
                                                                        }
                                                                        try {
                                                                            clsArr4[1] = Integer.TYPE;
                                                                            ?? zipFile2 = new ZipFile((String) String.class.getMethod(str4, clsArr4).invoke(path2, objArr6));
                                                                            inputStream = zipFile2.getInputStream(zipFile2.getEntry(OLrzqt2));
                                                                        } catch (Throwable th34) {
                                                                            th = th34;
                                                                            Throwable th3222 = th;
                                                                            cause5 = th3222.getCause();
                                                                            if (cause5 == null) {
                                                                                throw th3222;
                                                                            }
                                                                            throw cause5;
                                                                        }
                                                                    } catch (Throwable th35) {
                                                                        th = th35;
                                                                        Throwable th272 = th;
                                                                        cause4 = th272.getCause();
                                                                        if (cause4 != null) {
                                                                            throw th272;
                                                                        }
                                                                        throw cause4;
                                                                    }
                                                                }
                                                                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                                                                try {
                                                                    objArr7 = new Object[]{bufferedInputStream};
                                                                    objEZpvd = YY.EZpvd(1683135861);
                                                                    if (objEZpvd == null) {
                                                                        try {
                                                                            objEZpvd = YY.EZpvd(37, 4, (char) 38177, 1618104329, false, "AEQbTJ", new Class[]{InputStream.class});
                                                                        } catch (Throwable th36) {
                                                                            th = th36;
                                                                            cause6 = th.getCause();
                                                                            if (cause6 != null) {
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (Throwable th37) {
                                                                    th = th37;
                                                                }
                                                                try {
                                                                    InputStream inputStream2 = (InputStream) ((Method) objEZpvd).invoke(null, objArr7);
                                                                    if (bufferedInputStream == inputStream2) {
                                                                        inputStream2.close();
                                                                        try {
                                                                            Object objInvoke4 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        Object[] objArr32 = {OLrzqt2, Native.class.getClassLoader()};
                                                                                        Object[] objArr33 = new Object[1];
                                                                                        a((char) 0, 44, 4, objArr33);
                                                                                        Method declaredMethod2 = Runtime.class.getDeclaredMethod((String) objArr33[0], String.class, ClassLoader.class);
                                                                                        declaredMethod2.setAccessible(true);
                                                                                        declaredMethod2.invoke(objInvoke4, objArr32);
                                                                                    } catch (Exception unused) {
                                                                                        if (Build.VERSION.SDK_INT <= 27) {
                                                                                            try {
                                                                                                Object objInvoke5 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                try {
                                                                                                    Object[] objArr34 = {OLrzqt2, Native.class.getClassLoader()};
                                                                                                    Object[] objArr35 = new Object[1];
                                                                                                    b(null, null, 127, new byte[]{-118, -126, -122, -107, -122, -118}, objArr35);
                                                                                                    Method declaredMethod3 = Runtime.class.getDeclaredMethod((String) objArr35[0], String.class, ClassLoader.class);
                                                                                                    declaredMethod3.setAccessible(true);
                                                                                                    declaredMethod3.invoke(objInvoke5, objArr34);
                                                                                                } catch (Throwable th38) {
                                                                                                    Throwable cause24 = th38.getCause();
                                                                                                    if (cause24 == null) {
                                                                                                        throw th38;
                                                                                                    }
                                                                                                    throw cause24;
                                                                                                }
                                                                                            } catch (Throwable th39) {
                                                                                                Throwable cause25 = th39.getCause();
                                                                                                if (cause25 == null) {
                                                                                                    throw th39;
                                                                                                }
                                                                                                throw cause25;
                                                                                            }
                                                                                        } else {
                                                                                            try {
                                                                                                objInvoke = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                ClassLoader classLoader = Native.class.getClassLoader();
                                                                                                synchronized (objInvoke) {
                                                                                                }
                                                                                            } catch (Throwable th40) {
                                                                                                Throwable cause26 = th40.getCause();
                                                                                                if (cause26 == null) {
                                                                                                    throw th40;
                                                                                                }
                                                                                                throw cause26;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } catch (NoSuchMethodException unused2) {
                                                                                    objInvoke = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                    ClassLoader classLoader2 = Native.class.getClassLoader();
                                                                                    synchronized (objInvoke) {
                                                                                        try {
                                                                                            Object[] objArr36 = {OLrzqt2, classLoader2};
                                                                                            Object[] objArr37 = new Object[1];
                                                                                            b(null, null, 127, new byte[]{-118, -126, -122, -107, -110, -125, -123, -121, -126, -109}, objArr37);
                                                                                            Method declaredMethod4 = Runtime.class.getDeclaredMethod((String) objArr37[0], String.class, ClassLoader.class);
                                                                                            declaredMethod4.setAccessible(true);
                                                                                            String str7 = (String) declaredMethod4.invoke(objInvoke, objArr36);
                                                                                            if (str7 != null) {
                                                                                                throw new UnsatisfiedLinkError(str7);
                                                                                            }
                                                                                        } catch (Throwable th41) {
                                                                                            Throwable cause27 = th41.getCause();
                                                                                            if (cause27 == null) {
                                                                                                throw th41;
                                                                                            }
                                                                                            throw cause27;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                r8 = 1;
                                                                                r12 = 0;
                                                                                r13 = 0;
                                                                                r142 = 2;
                                                                            } catch (Throwable th42) {
                                                                                Throwable cause28 = th42.getCause();
                                                                                if (cause28 == null) {
                                                                                    throw th42;
                                                                                }
                                                                                throw cause28;
                                                                            }
                                                                        } catch (Throwable th43) {
                                                                            Throwable cause29 = th43.getCause();
                                                                            if (cause29 == null) {
                                                                                throw th43;
                                                                            }
                                                                            throw cause29;
                                                                        }
                                                                    } else {
                                                                        try {
                                                                            objArr8 = new Object[]{objNewInstance2};
                                                                        } catch (Throwable th44) {
                                                                            th = th44;
                                                                        }
                                                                        try {
                                                                            clsArr5 = new Class[1];
                                                                        } catch (Throwable th45) {
                                                                            th = th45;
                                                                            Throwable th46 = th;
                                                                            cause7 = th46.getCause();
                                                                            if (cause7 != null) {
                                                                            }
                                                                        }
                                                                        try {
                                                                            clsArr5[0] = File.class;
                                                                            OutputStream outputStream = (OutputStream) FileOutputStream.class.getDeclaredConstructor(clsArr5).newInstance(objArr8);
                                                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                                                                            byte[] bArr = new byte[1024];
                                                                            while (true) {
                                                                                int i4 = inputStream2.read(bArr);
                                                                                if (i4 < 0) {
                                                                                    break;
                                                                                } else {
                                                                                    bufferedOutputStream.write(bArr, 0, i4);
                                                                                }
                                                                            }
                                                                            bufferedOutputStream.flush();
                                                                            try {
                                                                            } catch (Throwable th47) {
                                                                                th = th47;
                                                                            }
                                                                            try {
                                                                                objArr9 = new Object[1];
                                                                            } catch (Throwable th48) {
                                                                                th = th48;
                                                                                Throwable th49 = th;
                                                                                cause8 = th49.getCause();
                                                                                if (cause8 == null) {
                                                                                }
                                                                            }
                                                                            try {
                                                                                b(null, null, 127, new byte[]{-100, -101, -121, -110, -102}, objArr9);
                                                                            } catch (Throwable th50) {
                                                                                th = th50;
                                                                                Throwable th492 = th;
                                                                                cause8 = th492.getCause();
                                                                                if (cause8 == null) {
                                                                                }
                                                                            }
                                                                            try {
                                                                                Object objInvoke6 = FileOutputStream.class.getMethod((String) objArr9[0], null).invoke(outputStream, null);
                                                                                try {
                                                                                    try {
                                                                                        objArr10 = new Object[1];
                                                                                        b(null, null, 127, new byte[]{-115, -109, -105, -99}, objArr10);
                                                                                    } catch (Throwable th51) {
                                                                                        th = th51;
                                                                                    }
                                                                                } catch (Throwable th52) {
                                                                                    th = th52;
                                                                                }
                                                                                try {
                                                                                    FileDescriptor.class.getMethod((String) objArr10[0], null).invoke(objInvoke6, null);
                                                                                    try {
                                                                                        bufferedOutputStream.close();
                                                                                        inputStream2.close();
                                                                                        try {
                                                                                            try {
                                                                                                Object objInvoke7 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                try {
                                                                                                    Object[] objArr38 = new Object[1];
                                                                                                    a((char) 0, 48, 15, objArr38);
                                                                                                    try {
                                                                                                        try {
                                                                                                            objArr14 = new Object[]{File.class.getMethod((String) objArr38[0], null).invoke(objNewInstance2, null), Native.class.getClassLoader()};
                                                                                                            objArr15 = new Object[1];
                                                                                                        } catch (Throwable th53) {
                                                                                                            th = th53;
                                                                                                        }
                                                                                                        try {
                                                                                                            a((char) 0, 44, 4, objArr15);
                                                                                                            Method declaredMethod5 = Runtime.class.getDeclaredMethod((String) objArr15[0], String.class, ClassLoader.class);
                                                                                                            declaredMethod5.setAccessible(true);
                                                                                                            declaredMethod5.invoke(objInvoke7, objArr14);
                                                                                                        } catch (Throwable th54) {
                                                                                                            th = th54;
                                                                                                            Throwable th55 = th;
                                                                                                            Throwable cause30 = th55.getCause();
                                                                                                            if (cause30 == null) {
                                                                                                                throw th55;
                                                                                                            }
                                                                                                            throw cause30;
                                                                                                        }
                                                                                                    } catch (Exception unused3) {
                                                                                                        try {
                                                                                                            if (Build.VERSION.SDK_INT <= 27) {
                                                                                                                try {
                                                                                                                    Object objInvoke8 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                                    try {
                                                                                                                        Object[] objArr39 = new Object[1];
                                                                                                                        a((char) 0, 48, 15, objArr39);
                                                                                                                        try {
                                                                                                                            Object[] objArr40 = {File.class.getMethod((String) objArr39[0], null).invoke(objNewInstance2, null), Native.class.getClassLoader()};
                                                                                                                            Object[] objArr41 = new Object[1];
                                                                                                                            b(null, null, 127, new byte[]{-118, -126, -122, -107, -122, -118}, objArr41);
                                                                                                                            Method declaredMethod6 = Runtime.class.getDeclaredMethod((String) objArr41[0], String.class, ClassLoader.class);
                                                                                                                            declaredMethod6.setAccessible(true);
                                                                                                                            declaredMethod6.invoke(objInvoke8, objArr40);
                                                                                                                        } catch (Throwable th56) {
                                                                                                                            Throwable cause31 = th56.getCause();
                                                                                                                            if (cause31 == null) {
                                                                                                                                throw th56;
                                                                                                                            }
                                                                                                                            throw cause31;
                                                                                                                        }
                                                                                                                    } catch (Throwable th57) {
                                                                                                                        Throwable cause32 = th57.getCause();
                                                                                                                        if (cause32 == null) {
                                                                                                                            throw th57;
                                                                                                                        }
                                                                                                                        throw cause32;
                                                                                                                    }
                                                                                                                } catch (Throwable th58) {
                                                                                                                    Throwable cause33 = th58.getCause();
                                                                                                                    if (cause33 == null) {
                                                                                                                        throw th58;
                                                                                                                    }
                                                                                                                    throw cause33;
                                                                                                                }
                                                                                                            }
                                                                                                        } catch (NoSuchMethodException unused4) {
                                                                                                        }
                                                                                                        try {
                                                                                                            Object objInvoke9 = Runtime.class.getMethod(str5, null).invoke(null, null);
                                                                                                            try {
                                                                                                                objArr11 = new Object[1];
                                                                                                            } catch (Throwable th59) {
                                                                                                                th = th59;
                                                                                                            }
                                                                                                            try {
                                                                                                                a((char) 0, 48, 15, objArr11);
                                                                                                                try {
                                                                                                                } catch (Throwable th60) {
                                                                                                                    th = th60;
                                                                                                                    Throwable th61 = th;
                                                                                                                    cause9 = th61.getCause();
                                                                                                                    if (cause9 == null) {
                                                                                                                    }
                                                                                                                }
                                                                                                            } catch (Throwable th62) {
                                                                                                                th = th62;
                                                                                                                Throwable th612 = th;
                                                                                                                cause9 = th612.getCause();
                                                                                                                if (cause9 == null) {
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                Object objInvoke10 = File.class.getMethod((String) objArr11[0], null).invoke(objNewInstance2, null);
                                                                                                                ClassLoader classLoader3 = Native.class.getClassLoader();
                                                                                                                try {
                                                                                                                    synchronized (objInvoke9) {
                                                                                                                        try {
                                                                                                                            objArr12 = new Object[]{objInvoke10, classLoader3};
                                                                                                                        } catch (Throwable th63) {
                                                                                                                            th = th63;
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            objArr13 = new Object[1];
                                                                                                                        } catch (Throwable th64) {
                                                                                                                            th = th64;
                                                                                                                            Throwable th65 = th;
                                                                                                                            cause10 = th65.getCause();
                                                                                                                            if (cause10 != null) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            b(null, null, 127, new byte[]{-118, -126, -122, -107, -110, -125, -123, -121, -126, -109}, objArr13);
                                                                                                                        } catch (Throwable th66) {
                                                                                                                            th = th66;
                                                                                                                            Throwable th652 = th;
                                                                                                                            cause10 = th652.getCause();
                                                                                                                            if (cause10 != null) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            String str8 = (String) objArr13[0];
                                                                                                                            r142 = 2;
                                                                                                                            try {
                                                                                                                                Class[] clsArr10 = new Class[2];
                                                                                                                                clsArr10[0] = String.class;
                                                                                                                                try {
                                                                                                                                    clsArr10[1] = ClassLoader.class;
                                                                                                                                    declaredMethod = Runtime.class.getDeclaredMethod(str8, clsArr10);
                                                                                                                                    declaredMethod.setAccessible(true);
                                                                                                                                } catch (Throwable th67) {
                                                                                                                                    th = th67;
                                                                                                                                }
                                                                                                                            } catch (Throwable th68) {
                                                                                                                                th = th68;
                                                                                                                            }
                                                                                                                        } catch (Throwable th69) {
                                                                                                                            th = th69;
                                                                                                                            Throwable th6522 = th;
                                                                                                                            cause10 = th6522.getCause();
                                                                                                                            if (cause10 != null) {
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            String str9 = (String) declaredMethod.invoke(objInvoke9, objArr12);
                                                                                                                            if (str9 != null) {
                                                                                                                                throw new UnsatisfiedLinkError(str9);
                                                                                                                            }
                                                                                                                            try {
                                                                                                                            } catch (Throwable th70) {
                                                                                                                                th = th70;
                                                                                                                                throw th;
                                                                                                                            }
                                                                                                                        } catch (Throwable th71) {
                                                                                                                            th = th71;
                                                                                                                            Throwable th65222 = th;
                                                                                                                            cause10 = th65222.getCause();
                                                                                                                            if (cause10 != null) {
                                                                                                                                throw th65222;
                                                                                                                            }
                                                                                                                            throw cause10;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    r8 = 1;
                                                                                                                    r8 = 1;
                                                                                                                    r8 = 1;
                                                                                                                    r8 = 1;
                                                                                                                    Object[] objArr42 = new Object[1];
                                                                                                                    r13 = 0;
                                                                                                                    r13 = 0;
                                                                                                                    r13 = 0;
                                                                                                                    b(null, null, 127, new byte[]{-110, -121, -110, -111, -110, -118}, objArr42);
                                                                                                                    r12 = 0;
                                                                                                                    r12 = 0;
                                                                                                                    ((Boolean) File.class.getMethod((String) objArr42[0], null).invoke(objNewInstance2, null)).booleanValue();
                                                                                                                    i3++;
                                                                                                                    str2 = str;
                                                                                                                    i2 = r8;
                                                                                                                    r4 = r12;
                                                                                                                    r122 = r13;
                                                                                                                    r11 = r142;
                                                                                                                    NewInstance = 4;
                                                                                                                } catch (Throwable th72) {
                                                                                                                    th = th72;
                                                                                                                }
                                                                                                            } catch (Throwable th73) {
                                                                                                                th = th73;
                                                                                                                Throwable th6122 = th;
                                                                                                                cause9 = th6122.getCause();
                                                                                                                if (cause9 == null) {
                                                                                                                    throw th6122;
                                                                                                                }
                                                                                                                throw cause9;
                                                                                                            }
                                                                                                        } catch (Throwable th74) {
                                                                                                            Throwable cause34 = th74.getCause();
                                                                                                            if (cause34 == null) {
                                                                                                                throw th74;
                                                                                                            }
                                                                                                            throw cause34;
                                                                                                        }
                                                                                                    }
                                                                                                } catch (Throwable th75) {
                                                                                                    Throwable cause35 = th75.getCause();
                                                                                                    if (cause35 == null) {
                                                                                                        throw th75;
                                                                                                    }
                                                                                                    throw cause35;
                                                                                                }
                                                                                            } catch (Throwable th76) {
                                                                                                Throwable cause36 = th76.getCause();
                                                                                                if (cause36 == null) {
                                                                                                    throw th76;
                                                                                                }
                                                                                                throw cause36;
                                                                                            }
                                                                                        } catch (Exception unused5) {
                                                                                        }
                                                                                        r142 = 2;
                                                                                        try {
                                                                                            r8 = 1;
                                                                                            r8 = 1;
                                                                                            r8 = 1;
                                                                                            r8 = 1;
                                                                                        } catch (Throwable th77) {
                                                                                            th = th77;
                                                                                            r8 = 1;
                                                                                        }
                                                                                        try {
                                                                                            Object[] objArr422 = new Object[1];
                                                                                            r13 = 0;
                                                                                            r13 = 0;
                                                                                            r13 = 0;
                                                                                            try {
                                                                                                b(null, null, 127, new byte[]{-110, -121, -110, -111, -110, -118}, objArr422);
                                                                                                r12 = 0;
                                                                                                r12 = 0;
                                                                                            } catch (Throwable th78) {
                                                                                                th = th78;
                                                                                                r12 = 0;
                                                                                            }
                                                                                        } catch (Throwable th79) {
                                                                                            th = th79;
                                                                                            r12 = 0;
                                                                                            r13 = 0;
                                                                                            Throwable th80 = th;
                                                                                            try {
                                                                                                cause11 = th80.getCause();
                                                                                                if (cause11 != null) {
                                                                                                }
                                                                                            } catch (Exception unused6) {
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            ((Boolean) File.class.getMethod((String) objArr422[0], null).invoke(objNewInstance2, null)).booleanValue();
                                                                                        } catch (Throwable th81) {
                                                                                            th = th81;
                                                                                            Throwable th802 = th;
                                                                                            cause11 = th802.getCause();
                                                                                            if (cause11 != null) {
                                                                                                throw th802;
                                                                                            }
                                                                                            throw cause11;
                                                                                        }
                                                                                    } catch (Exception e5) {
                                                                                        e = e5;
                                                                                        r133 = 0;
                                                                                        NewInstance = 1;
                                                                                        r122 = 0;
                                                                                        r14 = 2;
                                                                                        exc = e;
                                                                                        r8 = NewInstance;
                                                                                        r12 = r122;
                                                                                        r13 = r133;
                                                                                        r142 = r14;
                                                                                        if (i3 >= length) {
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th82) {
                                                                                    th = th82;
                                                                                    Throwable th83 = th;
                                                                                    Throwable cause37 = th83.getCause();
                                                                                    if (cause37 == null) {
                                                                                        throw th83;
                                                                                    }
                                                                                    throw cause37;
                                                                                }
                                                                            } catch (Throwable th84) {
                                                                                th = th84;
                                                                                Throwable th4922 = th;
                                                                                cause8 = th4922.getCause();
                                                                                if (cause8 == null) {
                                                                                    throw th4922;
                                                                                }
                                                                                throw cause8;
                                                                            }
                                                                        } catch (Throwable th85) {
                                                                            th = th85;
                                                                            Throwable th462 = th;
                                                                            cause7 = th462.getCause();
                                                                            if (cause7 != null) {
                                                                                throw th462;
                                                                            }
                                                                            throw cause7;
                                                                        }
                                                                    }
                                                                } catch (Throwable th86) {
                                                                    th = th86;
                                                                    th = th;
                                                                    cause6 = th.getCause();
                                                                    if (cause6 != null) {
                                                                        throw th;
                                                                    }
                                                                    throw cause6;
                                                                }
                                                            } catch (Exception e6) {
                                                                e = e6;
                                                                NewInstance = 1;
                                                                r122 = 0;
                                                                r133 = 0;
                                                            }
                                                        } catch (Throwable th87) {
                                                            th = th87;
                                                            Throwable th172 = th;
                                                            cause3 = th172.getCause();
                                                            if (cause3 == null) {
                                                            }
                                                        }
                                                    } catch (Throwable th88) {
                                                        th = th88;
                                                        Throwable th1722 = th;
                                                        cause3 = th1722.getCause();
                                                        if (cause3 == null) {
                                                            throw th1722;
                                                        }
                                                        throw cause3;
                                                    }
                                                } catch (Throwable th89) {
                                                    th = th89;
                                                    Throwable th142 = th;
                                                    cause2 = th142.getCause();
                                                    if (cause2 != null) {
                                                        throw th142;
                                                    }
                                                    throw cause2;
                                                }
                                            } catch (Throwable th90) {
                                                th = th90;
                                                Throwable th102 = th;
                                                cause = th102.getCause();
                                                if (cause != null) {
                                                    throw th102;
                                                }
                                                throw cause;
                                            }
                                            exc = e4;
                                            i = 1;
                                            z = false;
                                            r132 = 0;
                                        } catch (Throwable th91) {
                                            Throwable cause38 = th91.getCause();
                                            if (cause38 == null) {
                                                throw th91;
                                            }
                                            throw cause38;
                                        }
                                    } catch (Throwable th92) {
                                        Throwable cause39 = th92.getCause();
                                        if (cause39 == null) {
                                            throw th92;
                                        }
                                        throw cause39;
                                    }
                                } catch (Exception e7) {
                                    exc = e7;
                                    i = i2;
                                    r132 = r122;
                                    z = false;
                                }
                                r142 = 2;
                                r8 = i;
                                r12 = z;
                                r13 = r132;
                                if (i3 >= length) {
                                    throw exc;
                                }
                            }
                            i3++;
                            str2 = str;
                            i2 = r8;
                            r4 = r12;
                            r122 = r13;
                            r11 = r142;
                            NewInstance = 4;
                        } catch (Throwable th93) {
                            th = th93;
                            Throwable th94 = th;
                            Throwable cause40 = th94.getCause();
                            if (cause40 == null) {
                                throw th94;
                            }
                            throw cause40;
                        }
                    } catch (Throwable th95) {
                        th = th95;
                    }
                } catch (Throwable th96) {
                    Throwable cause41 = th96.getCause();
                    if (cause41 == null) {
                        throw th96;
                    }
                    throw cause41;
                }
            }
        } catch (Throwable th97) {
            Throwable cause42 = th97.getCause();
            if (cause42 == null) {
                throw th97;
            }
            throw cause42;
        }
    }
}
