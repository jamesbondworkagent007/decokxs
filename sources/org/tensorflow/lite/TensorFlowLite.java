package org.tensorflow.lite;

import android.os.Build;
import android.os.Environment;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.zip.ZipFile;
import o.YY;
import o.Zg;
import o.Zm;
import o.Zs;
import org.tensorflow.lite.InterpreterApi;

/* JADX INFO: loaded from: classes13.dex */
public final class TensorFlowLite {
    private static int[] AEQbTJ;
    private static char[] EZpvd;
    private static final Throwable LOAD_LIBRARY_EXCEPTION;
    private static final String[][] TFLITE_RUNTIME_LIBNAMES;
    private static char copydefault;
    private static final AtomicBoolean[] haveLogged;
    private static volatile boolean isInit;
    private static final Logger logger;
    private static final byte[] OLrzqt = {17, 42, 41, -115, -1, -3, Ascii.FF, Ascii.SUB, -27, 9, -14, 19, -15, -5};
    private static final int KWHzl = 115;

    public static native void nativeDoNothing();

    static {
        EZpvd();
        logger = Logger.getLogger(TensorFlowLite.class.getName());
        String[][] strArr = {new String[]{"tensorflowlite_jni", "tensorflowlite_jni_stable"}, new String[]{"tensorflowlite_jni_gms_client"}};
        TFLITE_RUNTIME_LIBNAMES = strArr;
        isInit = false;
        UnsatisfiedLinkError unsatisfiedLinkError = null;
        for (int i = 0; i < 2; i++) {
            for (String str : strArr[i]) {
                try {
                    EZpvd(str);
                    logger.info("Loaded native library: " + str);
                    break;
                } catch (UnsatisfiedLinkError e) {
                    logger.info("Didn't load native library: " + str);
                    if (unsatisfiedLinkError == null) {
                        unsatisfiedLinkError = e;
                    } else {
                        unsatisfiedLinkError.addSuppressed(e);
                    }
                }
            }
        }
        LOAD_LIBRARY_EXCEPTION = unsatisfiedLinkError;
        haveLogged = new AtomicBoolean[InterpreterApi.Options.TfLiteRuntime.values().length];
        for (int i2 = 0; i2 < InterpreterApi.Options.TfLiteRuntime.values().length; i2++) {
            haveLogged[i2] = new AtomicBoolean();
        }
    }

    private TensorFlowLite() {
    }

    @Deprecated
    public static String version() {
        return schemaVersion();
    }

    private static void b(int[] iArr, int i, Object[] objArr) {
        Zm zm = new Zm();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = AEQbTJ;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr3[i2] = (int) (((long) iArr2[i2]) ^ 613195425809619345L);
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = AEQbTJ;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                iArr6[i3] = (int) (((long) iArr5[i3]) ^ 613195425809619345L);
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        zm.OLrzqt = 0;
        while (zm.OLrzqt < iArr.length) {
            cArr[0] = (char) (iArr[zm.OLrzqt] >> 16);
            cArr[1] = (char) iArr[zm.OLrzqt];
            cArr[2] = (char) (iArr[zm.OLrzqt + 1] >> 16);
            cArr[3] = (char) iArr[zm.OLrzqt + 1];
            zm.copydefault = (cArr[0] << 16) + cArr[1];
            zm.KWHzl = (cArr[2] << 16) + cArr[3];
            Zm.EZpvd(iArr4);
            for (int i4 = 0; i4 < 16; i4++) {
                zm.copydefault ^= iArr4[i4];
                zm.KWHzl = Zm.AEQbTJ(zm.copydefault) ^ zm.KWHzl;
                int i5 = zm.copydefault;
                zm.copydefault = zm.KWHzl;
                zm.KWHzl = i5;
            }
            int i6 = zm.copydefault;
            zm.copydefault = zm.KWHzl;
            zm.KWHzl = i6;
            zm.KWHzl ^= iArr4[16];
            zm.copydefault ^= iArr4[17];
            int i7 = zm.copydefault;
            int i8 = zm.KWHzl;
            cArr[0] = (char) (zm.copydefault >>> 16);
            cArr[1] = (char) zm.copydefault;
            cArr[2] = (char) (zm.KWHzl >>> 16);
            cArr[3] = (char) zm.KWHzl;
            Zm.EZpvd(iArr4);
            cArr2[zm.OLrzqt * 2] = cArr[0];
            cArr2[(zm.OLrzqt * 2) + 1] = cArr[1];
            cArr2[(zm.OLrzqt * 2) + 2] = cArr[2];
            cArr2[(zm.OLrzqt * 2) + 3] = cArr[3];
            zm.OLrzqt += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static String runtimeVersion(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
        return getFactory(tfLiteRuntime, "org.tensorflow.lite.TensorFlowLite", "runtimeVersion").runtimeVersion();
    }

    public static String runtimeVersion() {
        return runtimeVersion(null);
    }

    public static String schemaVersion(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
        return getFactory(tfLiteRuntime, "org.tensorflow.lite.TensorFlowLite", "schemaVersion").schemaVersion();
    }

    public static String schemaVersion() {
        return schemaVersion(null);
    }

    public static void init() {
        if (isInit) {
            return;
        }
        try {
            nativeDoNothing();
            isInit = true;
        } catch (UnsatisfiedLinkError e) {
            Throwable th = LOAD_LIBRARY_EXCEPTION;
            if (th == null) {
                th = e;
            }
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + th);
            unsatisfiedLinkError.initCause(e);
            throw unsatisfiedLinkError;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static class PossiblyAvailableRuntime {
        private final Exception exception;
        private final InterpreterFactoryApi factory;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Exception getException() {
            return this.exception;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterpreterFactoryApi getFactory() {
            return this.factory;
        }

        public PossiblyAvailableRuntime(String str, String str2) {
            InterpreterFactoryApi interpreterFactoryApi;
            Exception e = null;
            try {
                Constructor<?> declaredConstructor = Class.forName(str + ".InterpreterFactoryImpl").getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                interpreterFactoryApi = (InterpreterFactoryApi) declaredConstructor.newInstance(new Object[0]);
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException e2) {
                interpreterFactoryApi = null;
                e = e2;
            }
            try {
                if (interpreterFactoryApi != null) {
                    TensorFlowLite.logger.info(String.format("Found %s TF Lite runtime client in %s", str2, str));
                } else {
                    TensorFlowLite.logger.warning(String.format("Failed to construct TF Lite runtime client from %s", str));
                }
            } catch (ClassNotFoundException e3) {
                e = e3;
                TensorFlowLite.logger.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
            } catch (IllegalAccessException e4) {
                e = e4;
                TensorFlowLite.logger.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
            } catch (IllegalArgumentException e5) {
                e = e5;
                TensorFlowLite.logger.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
            } catch (InstantiationException e6) {
                e = e6;
                TensorFlowLite.logger.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
            } catch (NoSuchMethodException e7) {
                e = e7;
                TensorFlowLite.logger.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
            } catch (SecurityException e8) {
                e = e8;
                TensorFlowLite.logger.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
            } catch (InvocationTargetException e9) {
                e = e9;
                TensorFlowLite.logger.info(String.format("Didn't find %s TF Lite runtime client in %s", str2, str));
            }
            this.exception = e;
            this.factory = interpreterFactoryApi;
        }
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) {
        int i2;
        Zg zg = new Zg();
        char[] cArr2 = EZpvd;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr3[i3] = (char) (((long) cArr2[i3]) ^ (-1373230739542369308L));
            }
            cArr2 = cArr3;
        }
        char c = (char) ((-1373230739542369308L) ^ ((long) copydefault));
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            zg.KWHzl = 0;
            while (zg.KWHzl < i2) {
                zg.AEQbTJ = cArr[zg.KWHzl];
                zg.OLrzqt = cArr[zg.KWHzl + 1];
                if (zg.AEQbTJ == zg.OLrzqt) {
                    cArr4[zg.KWHzl] = (char) (zg.AEQbTJ - b);
                    cArr4[zg.KWHzl + 1] = (char) (zg.OLrzqt - b);
                } else {
                    zg.copydefault = zg.AEQbTJ / c;
                    zg.AYXKKw = zg.AEQbTJ % c;
                    zg.EZpvd = zg.OLrzqt / c;
                    zg.djBIcL = zg.OLrzqt % c;
                    if (zg.AYXKKw == zg.djBIcL) {
                        zg.copydefault = ((zg.copydefault + c) - 1) % c;
                        zg.EZpvd = ((zg.EZpvd + c) - 1) % c;
                        int i4 = (zg.copydefault * c) + zg.AYXKKw;
                        int i5 = (zg.EZpvd * c) + zg.djBIcL;
                        cArr4[zg.KWHzl] = cArr2[i4];
                        cArr4[zg.KWHzl + 1] = cArr2[i5];
                    } else if (zg.copydefault == zg.EZpvd) {
                        zg.AYXKKw = ((zg.AYXKKw + c) - 1) % c;
                        zg.djBIcL = ((zg.djBIcL + c) - 1) % c;
                        int i6 = (zg.copydefault * c) + zg.AYXKKw;
                        int i7 = (zg.EZpvd * c) + zg.djBIcL;
                        cArr4[zg.KWHzl] = cArr2[i6];
                        cArr4[zg.KWHzl + 1] = cArr2[i7];
                    } else {
                        int i8 = (zg.copydefault * c) + zg.djBIcL;
                        int i9 = (zg.EZpvd * c) + zg.AYXKKw;
                        cArr4[zg.KWHzl] = cArr2[i8];
                        cArr4[zg.KWHzl + 1] = cArr2[i9];
                    }
                }
                zg.KWHzl += 2;
            }
        }
        for (int i10 = 0; i10 < i; i10++) {
            cArr4[i10] = (char) (cArr4[i10] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static class RuntimeFromSystem {
        static final PossiblyAvailableRuntime TFLITE = new PossiblyAvailableRuntime("com.google.android.gms.tflite", "system");

        private RuntimeFromSystem() {
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static class RuntimeFromApplication {
        static final PossiblyAvailableRuntime TFLITE = new PossiblyAvailableRuntime("org.tensorflow.lite", MimeTypes.BASE_TYPE_APPLICATION);

        private RuntimeFromApplication() {
        }
    }

    public static InterpreterFactoryApi getFactory(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime) {
        return getFactory(tfLiteRuntime, "org.tensorflow.lite.InterpreterApi.Options", "setRuntime");
    }

    private static InterpreterFactoryApi getFactory(InterpreterApi.Options.TfLiteRuntime tfLiteRuntime, String str, String str2) {
        Exception exception;
        String str3;
        if (tfLiteRuntime == null) {
            tfLiteRuntime = InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY;
        }
        InterpreterApi.Options.TfLiteRuntime tfLiteRuntime2 = InterpreterApi.Options.TfLiteRuntime.PREFER_SYSTEM_OVER_APPLICATION;
        if (tfLiteRuntime == tfLiteRuntime2 || tfLiteRuntime == InterpreterApi.Options.TfLiteRuntime.FROM_SYSTEM_ONLY) {
            PossiblyAvailableRuntime possiblyAvailableRuntime = RuntimeFromSystem.TFLITE;
            if (possiblyAvailableRuntime.getFactory() != null) {
                if (!haveLogged[tfLiteRuntime.ordinal()].getAndSet(true)) {
                    logger.info(String.format("TfLiteRuntime.%s: Using system TF Lite runtime client from com.google.android.gms", tfLiteRuntime.name()));
                }
                return possiblyAvailableRuntime.getFactory();
            }
            exception = possiblyAvailableRuntime.getException();
        } else {
            exception = null;
        }
        if (tfLiteRuntime == tfLiteRuntime2 || tfLiteRuntime == InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY) {
            PossiblyAvailableRuntime possiblyAvailableRuntime2 = RuntimeFromApplication.TFLITE;
            if (possiblyAvailableRuntime2.getFactory() != null) {
                if (!haveLogged[tfLiteRuntime.ordinal()].getAndSet(true)) {
                    logger.info(String.format("TfLiteRuntime.%s: Using application TF Lite runtime client from org.tensorflow.lite", tfLiteRuntime.name()));
                }
                return possiblyAvailableRuntime2.getFactory();
            }
            if (exception == null) {
                exception = possiblyAvailableRuntime2.getException();
            } else if (exception.getSuppressed().length == 0) {
                exception.addSuppressed(possiblyAvailableRuntime2.getException());
            }
        }
        int i = AnonymousClass1.$SwitchMap$org$tensorflow$lite$InterpreterApi$Options$TfLiteRuntime[tfLiteRuntime.ordinal()];
        if (i == 1) {
            str3 = String.format("You should declare a build dependency on org.tensorflow.lite:tensorflow-lite, or call .%s with a value other than TfLiteRuntime.FROM_APPLICATION_ONLY (see docs for %s#%s(TfLiteRuntime)).", str2, str, str2);
        } else {
            str3 = i != 2 ? "You should declare a build dependency on org.tensorflow.lite:tensorflow-lite or com.google.android.gms:play-services-tflite-java" : String.format("You should declare a build dependency on com.google.android.gms:play-services-tflite-java, or call .%s with a value other than TfLiteRuntime.FROM_SYSTEM_ONLY  (see docs for %s#%s).", str2, str, str2);
        }
        throw new IllegalStateException("Couldn't find TensorFlow Lite runtime's InterpreterFactoryImpl class -- make sure your app links in the right TensorFlow Lite runtime. " + str3, exception);
    }

    /* JADX INFO: renamed from: org.tensorflow.lite.TensorFlowLite$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$tensorflow$lite$InterpreterApi$Options$TfLiteRuntime;

        static {
            int[] iArr = new int[InterpreterApi.Options.TfLiteRuntime.values().length];
            $SwitchMap$org$tensorflow$lite$InterpreterApi$Options$TfLiteRuntime = iArr;
            try {
                iArr[InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$tensorflow$lite$InterpreterApi$Options$TfLiteRuntime[InterpreterApi.Options.TfLiteRuntime.FROM_SYSTEM_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, int i, short s, Object[] objArr) {
        int i2;
        int i3 = 4 - (b * 2);
        byte[] bArr = OLrzqt;
        int i4 = (s * 2) + 102;
        int i5 = i * 3;
        byte[] bArr2 = new byte[11 - i5];
        int i6 = 10 - i5;
        if (bArr == null) {
            int i7 = i3;
            int i8 = i6;
            int i9 = 0;
            int i10 = i8 + (-i3);
            i3 = i7 + 1;
            i4 = i10 + 2;
            i2 = i9;
            bArr2[i2] = (byte) i4;
            i9 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i11 = i4;
            i7 = i3;
            i3 = bArr[i3];
            i8 = i11;
            int i102 = i8 + (-i3);
            i3 = i7 + 1;
            i4 = i102 + 2;
            i2 = i9;
            bArr2[i2] = (byte) i4;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i9 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    static void EZpvd() {
        AEQbTJ = new int[]{1885438784, 905448878, -958931637, 2125546731, -857950886, -1465325890, 427516622, -1033243281, -1763261934, 522200901, -1417517177, 770534962, 1750625770, 1867317152, -816732893, -1201061688, -1207485033, -539629268};
        EZpvd = new char[]{11793, 11792, 11844, 11786, 11751, 11803, 11746, 11748, 11788, 11804, 11745, 11805, 11787, 11826, 11820, 11782, 11801, 11750, 11839, 11749, 11747, 11800, 11798, 11783, 11799, 11806, 11744, 11825, 11831, 11795, 11802, 11794, 11807, 11796, 11789, 11822};
        copydefault = (char) 7138;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:337:0x07b9 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:339:0x07bb */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:513:0x0921 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:532:0x0727 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:633:0x0628 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:670:0x0089 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:690:0x0930 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:347:0x07c7 A[Catch: Exception -> 0x0930, TryCatch #39 {Exception -> 0x0930, blocks: (B:345:0x07c1, B:347:0x07c7, B:348:0x07c8), top: B:609:0x07c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x07c8 A[Catch: Exception -> 0x0930, TRY_LEAVE, TryCatch #39 {Exception -> 0x0930, blocks: (B:345:0x07c1, B:347:0x07c7, B:348:0x07c8), top: B:609:0x07c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x07ee A[Catch: all -> 0x07f0, TryCatch #44 {all -> 0x07f0, blocks: (B:352:0x07cf, B:353:0x07d4, B:372:0x07f2, B:366:0x07e7, B:368:0x07ee, B:369:0x07ef), top: B:618:0x0755 }] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x07ef A[Catch: all -> 0x07f0, TryCatch #44 {all -> 0x07f0, blocks: (B:352:0x07cf, B:353:0x07d4, B:372:0x07f2, B:366:0x07e7, B:368:0x07ee, B:369:0x07ef), top: B:618:0x0755 }] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0809 A[Catch: Exception -> 0x0921, TryCatch #60 {Exception -> 0x0921, blocks: (B:425:0x0864, B:427:0x086a, B:428:0x086b, B:373:0x07f3, B:381:0x0802, B:383:0x0809, B:384:0x080a, B:386:0x080c, B:388:0x0817, B:389:0x0818, B:397:0x0827, B:399:0x082e, B:400:0x082f, B:408:0x083e, B:410:0x0845, B:411:0x0846, B:419:0x0855, B:421:0x085c, B:422:0x085d, B:438:0x087d, B:440:0x0884, B:441:0x0885, B:452:0x0896, B:454:0x089d, B:455:0x089e, B:464:0x08ad, B:466:0x08b4, B:467:0x08b5, B:472:0x08be, B:474:0x08c5, B:475:0x08c6, B:480:0x08cf, B:482:0x08d6, B:483:0x08d7, B:491:0x08e5, B:493:0x08ec, B:494:0x08ed, B:504:0x0909, B:506:0x0910, B:507:0x0911, B:509:0x0913, B:511:0x091f, B:512:0x0920, B:307:0x0727, B:13:0x0089), top: B:646:0x0727, inners: #67, #75 }] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x080a A[Catch: Exception -> 0x0921, TryCatch #60 {Exception -> 0x0921, blocks: (B:425:0x0864, B:427:0x086a, B:428:0x086b, B:373:0x07f3, B:381:0x0802, B:383:0x0809, B:384:0x080a, B:386:0x080c, B:388:0x0817, B:389:0x0818, B:397:0x0827, B:399:0x082e, B:400:0x082f, B:408:0x083e, B:410:0x0845, B:411:0x0846, B:419:0x0855, B:421:0x085c, B:422:0x085d, B:438:0x087d, B:440:0x0884, B:441:0x0885, B:452:0x0896, B:454:0x089d, B:455:0x089e, B:464:0x08ad, B:466:0x08b4, B:467:0x08b5, B:472:0x08be, B:474:0x08c5, B:475:0x08c6, B:480:0x08cf, B:482:0x08d6, B:483:0x08d7, B:491:0x08e5, B:493:0x08ec, B:494:0x08ed, B:504:0x0909, B:506:0x0910, B:507:0x0911, B:509:0x0913, B:511:0x091f, B:512:0x0920, B:307:0x0727, B:13:0x0089), top: B:646:0x0727, inners: #67, #75 }] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x082e A[Catch: Exception -> 0x0921, TryCatch #60 {Exception -> 0x0921, blocks: (B:425:0x0864, B:427:0x086a, B:428:0x086b, B:373:0x07f3, B:381:0x0802, B:383:0x0809, B:384:0x080a, B:386:0x080c, B:388:0x0817, B:389:0x0818, B:397:0x0827, B:399:0x082e, B:400:0x082f, B:408:0x083e, B:410:0x0845, B:411:0x0846, B:419:0x0855, B:421:0x085c, B:422:0x085d, B:438:0x087d, B:440:0x0884, B:441:0x0885, B:452:0x0896, B:454:0x089d, B:455:0x089e, B:464:0x08ad, B:466:0x08b4, B:467:0x08b5, B:472:0x08be, B:474:0x08c5, B:475:0x08c6, B:480:0x08cf, B:482:0x08d6, B:483:0x08d7, B:491:0x08e5, B:493:0x08ec, B:494:0x08ed, B:504:0x0909, B:506:0x0910, B:507:0x0911, B:509:0x0913, B:511:0x091f, B:512:0x0920, B:307:0x0727, B:13:0x0089), top: B:646:0x0727, inners: #67, #75 }] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x082f A[Catch: Exception -> 0x0921, TryCatch #60 {Exception -> 0x0921, blocks: (B:425:0x0864, B:427:0x086a, B:428:0x086b, B:373:0x07f3, B:381:0x0802, B:383:0x0809, B:384:0x080a, B:386:0x080c, B:388:0x0817, B:389:0x0818, B:397:0x0827, B:399:0x082e, B:400:0x082f, B:408:0x083e, B:410:0x0845, B:411:0x0846, B:419:0x0855, B:421:0x085c, B:422:0x085d, B:438:0x087d, B:440:0x0884, B:441:0x0885, B:452:0x0896, B:454:0x089d, B:455:0x089e, B:464:0x08ad, B:466:0x08b4, B:467:0x08b5, B:472:0x08be, B:474:0x08c5, B:475:0x08c6, B:480:0x08cf, B:482:0x08d6, B:483:0x08d7, B:491:0x08e5, B:493:0x08ec, B:494:0x08ed, B:504:0x0909, B:506:0x0910, B:507:0x0911, B:509:0x0913, B:511:0x091f, B:512:0x0920, B:307:0x0727, B:13:0x0089), top: B:646:0x0727, inners: #67, #75 }] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0845 A[Catch: Exception -> 0x0921, TryCatch #60 {Exception -> 0x0921, blocks: (B:425:0x0864, B:427:0x086a, B:428:0x086b, B:373:0x07f3, B:381:0x0802, B:383:0x0809, B:384:0x080a, B:386:0x080c, B:388:0x0817, B:389:0x0818, B:397:0x0827, B:399:0x082e, B:400:0x082f, B:408:0x083e, B:410:0x0845, B:411:0x0846, B:419:0x0855, B:421:0x085c, B:422:0x085d, B:438:0x087d, B:440:0x0884, B:441:0x0885, B:452:0x0896, B:454:0x089d, B:455:0x089e, B:464:0x08ad, B:466:0x08b4, B:467:0x08b5, B:472:0x08be, B:474:0x08c5, B:475:0x08c6, B:480:0x08cf, B:482:0x08d6, B:483:0x08d7, B:491:0x08e5, B:493:0x08ec, B:494:0x08ed, B:504:0x0909, B:506:0x0910, B:507:0x0911, B:509:0x0913, B:511:0x091f, B:512:0x0920, B:307:0x0727, B:13:0x0089), top: B:646:0x0727, inners: #67, #75 }] */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0846 A[Catch: Exception -> 0x0921, TryCatch #60 {Exception -> 0x0921, blocks: (B:425:0x0864, B:427:0x086a, B:428:0x086b, B:373:0x07f3, B:381:0x0802, B:383:0x0809, B:384:0x080a, B:386:0x080c, B:388:0x0817, B:389:0x0818, B:397:0x0827, B:399:0x082e, B:400:0x082f, B:408:0x083e, B:410:0x0845, B:411:0x0846, B:419:0x0855, B:421:0x085c, B:422:0x085d, B:438:0x087d, B:440:0x0884, B:441:0x0885, B:452:0x0896, B:454:0x089d, B:455:0x089e, B:464:0x08ad, B:466:0x08b4, B:467:0x08b5, B:472:0x08be, B:474:0x08c5, B:475:0x08c6, B:480:0x08cf, B:482:0x08d6, B:483:0x08d7, B:491:0x08e5, B:493:0x08ec, B:494:0x08ed, B:504:0x0909, B:506:0x0910, B:507:0x0911, B:509:0x0913, B:511:0x091f, B:512:0x0920, B:307:0x0727, B:13:0x0089), top: B:646:0x0727, inners: #67, #75 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x085c A[Catch: Exception -> 0x0921, TryCatch #60 {Exception -> 0x0921, blocks: (B:425:0x0864, B:427:0x086a, B:428:0x086b, B:373:0x07f3, B:381:0x0802, B:383:0x0809, B:384:0x080a, B:386:0x080c, B:388:0x0817, B:389:0x0818, B:397:0x0827, B:399:0x082e, B:400:0x082f, B:408:0x083e, B:410:0x0845, B:411:0x0846, B:419:0x0855, B:421:0x085c, B:422:0x085d, B:438:0x087d, B:440:0x0884, B:441:0x0885, B:452:0x0896, B:454:0x089d, B:455:0x089e, B:464:0x08ad, B:466:0x08b4, B:467:0x08b5, B:472:0x08be, B:474:0x08c5, B:475:0x08c6, B:480:0x08cf, B:482:0x08d6, B:483:0x08d7, B:491:0x08e5, B:493:0x08ec, B:494:0x08ed, B:504:0x0909, B:506:0x0910, B:507:0x0911, B:509:0x0913, B:511:0x091f, B:512:0x0920, B:307:0x0727, B:13:0x0089), top: B:646:0x0727, inners: #67, #75 }] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x085d A[Catch: Exception -> 0x0921, TryCatch #60 {Exception -> 0x0921, blocks: (B:425:0x0864, B:427:0x086a, B:428:0x086b, B:373:0x07f3, B:381:0x0802, B:383:0x0809, B:384:0x080a, B:386:0x080c, B:388:0x0817, B:389:0x0818, B:397:0x0827, B:399:0x082e, B:400:0x082f, B:408:0x083e, B:410:0x0845, B:411:0x0846, B:419:0x0855, B:421:0x085c, B:422:0x085d, B:438:0x087d, B:440:0x0884, B:441:0x0885, B:452:0x0896, B:454:0x089d, B:455:0x089e, B:464:0x08ad, B:466:0x08b4, B:467:0x08b5, B:472:0x08be, B:474:0x08c5, B:475:0x08c6, B:480:0x08cf, B:482:0x08d6, B:483:0x08d7, B:491:0x08e5, B:493:0x08ec, B:494:0x08ed, B:504:0x0909, B:506:0x0910, B:507:0x0911, B:509:0x0913, B:511:0x091f, B:512:0x0920, B:307:0x0727, B:13:0x0089), top: B:646:0x0727, inners: #67, #75 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0884 A[Catch: Exception -> 0x0921, TryCatch #60 {Exception -> 0x0921, blocks: (B:425:0x0864, B:427:0x086a, B:428:0x086b, B:373:0x07f3, B:381:0x0802, B:383:0x0809, B:384:0x080a, B:386:0x080c, B:388:0x0817, B:389:0x0818, B:397:0x0827, B:399:0x082e, B:400:0x082f, B:408:0x083e, B:410:0x0845, B:411:0x0846, B:419:0x0855, B:421:0x085c, B:422:0x085d, B:438:0x087d, B:440:0x0884, B:441:0x0885, B:452:0x0896, B:454:0x089d, B:455:0x089e, B:464:0x08ad, B:466:0x08b4, B:467:0x08b5, B:472:0x08be, B:474:0x08c5, B:475:0x08c6, B:480:0x08cf, B:482:0x08d6, B:483:0x08d7, B:491:0x08e5, B:493:0x08ec, B:494:0x08ed, B:504:0x0909, B:506:0x0910, B:507:0x0911, B:509:0x0913, B:511:0x091f, B:512:0x0920, B:307:0x0727, B:13:0x0089), top: B:646:0x0727, inners: #67, #75 }] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0885 A[Catch: Exception -> 0x0921, TryCatch #60 {Exception -> 0x0921, blocks: (B:425:0x0864, B:427:0x086a, B:428:0x086b, B:373:0x07f3, B:381:0x0802, B:383:0x0809, B:384:0x080a, B:386:0x080c, B:388:0x0817, B:389:0x0818, B:397:0x0827, B:399:0x082e, B:400:0x082f, B:408:0x083e, B:410:0x0845, B:411:0x0846, B:419:0x0855, B:421:0x085c, B:422:0x085d, B:438:0x087d, B:440:0x0884, B:441:0x0885, B:452:0x0896, B:454:0x089d, B:455:0x089e, B:464:0x08ad, B:466:0x08b4, B:467:0x08b5, B:472:0x08be, B:474:0x08c5, B:475:0x08c6, B:480:0x08cf, B:482:0x08d6, B:483:0x08d7, B:491:0x08e5, B:493:0x08ec, B:494:0x08ed, B:504:0x0909, B:506:0x0910, B:507:0x0911, B:509:0x0913, B:511:0x091f, B:512:0x0920, B:307:0x0727, B:13:0x0089), top: B:646:0x0727, inners: #67, #75 }] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x089d A[Catch: Exception -> 0x0921, TryCatch #60 {Exception -> 0x0921, blocks: (B:425:0x0864, B:427:0x086a, B:428:0x086b, B:373:0x07f3, B:381:0x0802, B:383:0x0809, B:384:0x080a, B:386:0x080c, B:388:0x0817, B:389:0x0818, B:397:0x0827, B:399:0x082e, B:400:0x082f, B:408:0x083e, B:410:0x0845, B:411:0x0846, B:419:0x0855, B:421:0x085c, B:422:0x085d, B:438:0x087d, B:440:0x0884, B:441:0x0885, B:452:0x0896, B:454:0x089d, B:455:0x089e, B:464:0x08ad, B:466:0x08b4, B:467:0x08b5, B:472:0x08be, B:474:0x08c5, B:475:0x08c6, B:480:0x08cf, B:482:0x08d6, B:483:0x08d7, B:491:0x08e5, B:493:0x08ec, B:494:0x08ed, B:504:0x0909, B:506:0x0910, B:507:0x0911, B:509:0x0913, B:511:0x091f, B:512:0x0920, B:307:0x0727, B:13:0x0089), top: B:646:0x0727, inners: #67, #75 }] */
    /* JADX WARN: Removed duplicated region for block: B:455:0x089e A[Catch: Exception -> 0x0921, TryCatch #60 {Exception -> 0x0921, blocks: (B:425:0x0864, B:427:0x086a, B:428:0x086b, B:373:0x07f3, B:381:0x0802, B:383:0x0809, B:384:0x080a, B:386:0x080c, B:388:0x0817, B:389:0x0818, B:397:0x0827, B:399:0x082e, B:400:0x082f, B:408:0x083e, B:410:0x0845, B:411:0x0846, B:419:0x0855, B:421:0x085c, B:422:0x085d, B:438:0x087d, B:440:0x0884, B:441:0x0885, B:452:0x0896, B:454:0x089d, B:455:0x089e, B:464:0x08ad, B:466:0x08b4, B:467:0x08b5, B:472:0x08be, B:474:0x08c5, B:475:0x08c6, B:480:0x08cf, B:482:0x08d6, B:483:0x08d7, B:491:0x08e5, B:493:0x08ec, B:494:0x08ed, B:504:0x0909, B:506:0x0910, B:507:0x0911, B:509:0x0913, B:511:0x091f, B:512:0x0920, B:307:0x0727, B:13:0x0089), top: B:646:0x0727, inners: #67, #75 }] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x08ec A[Catch: Exception -> 0x0921, TryCatch #60 {Exception -> 0x0921, blocks: (B:425:0x0864, B:427:0x086a, B:428:0x086b, B:373:0x07f3, B:381:0x0802, B:383:0x0809, B:384:0x080a, B:386:0x080c, B:388:0x0817, B:389:0x0818, B:397:0x0827, B:399:0x082e, B:400:0x082f, B:408:0x083e, B:410:0x0845, B:411:0x0846, B:419:0x0855, B:421:0x085c, B:422:0x085d, B:438:0x087d, B:440:0x0884, B:441:0x0885, B:452:0x0896, B:454:0x089d, B:455:0x089e, B:464:0x08ad, B:466:0x08b4, B:467:0x08b5, B:472:0x08be, B:474:0x08c5, B:475:0x08c6, B:480:0x08cf, B:482:0x08d6, B:483:0x08d7, B:491:0x08e5, B:493:0x08ec, B:494:0x08ed, B:504:0x0909, B:506:0x0910, B:507:0x0911, B:509:0x0913, B:511:0x091f, B:512:0x0920, B:307:0x0727, B:13:0x0089), top: B:646:0x0727, inners: #67, #75 }] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x08ed A[Catch: Exception -> 0x0921, TryCatch #60 {Exception -> 0x0921, blocks: (B:425:0x0864, B:427:0x086a, B:428:0x086b, B:373:0x07f3, B:381:0x0802, B:383:0x0809, B:384:0x080a, B:386:0x080c, B:388:0x0817, B:389:0x0818, B:397:0x0827, B:399:0x082e, B:400:0x082f, B:408:0x083e, B:410:0x0845, B:411:0x0846, B:419:0x0855, B:421:0x085c, B:422:0x085d, B:438:0x087d, B:440:0x0884, B:441:0x0885, B:452:0x0896, B:454:0x089d, B:455:0x089e, B:464:0x08ad, B:466:0x08b4, B:467:0x08b5, B:472:0x08be, B:474:0x08c5, B:475:0x08c6, B:480:0x08cf, B:482:0x08d6, B:483:0x08d7, B:491:0x08e5, B:493:0x08ec, B:494:0x08ed, B:504:0x0909, B:506:0x0910, B:507:0x0911, B:509:0x0913, B:511:0x091f, B:512:0x0920, B:307:0x0727, B:13:0x0089), top: B:646:0x0727, inners: #67, #75 }] */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0185 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:584:0x01d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0756 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:668:0x0552 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:685:0x093c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0930 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v72 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v88 */
    /* JADX WARN: Type inference failed for: r12v89 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r12v90 */
    /* JADX WARN: Type inference failed for: r12v91 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v20 */
    /* JADX WARN: Type inference failed for: r18v21 */
    /* JADX WARN: Type inference failed for: r18v22 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v110 */
    /* JADX WARN: Type inference failed for: r4v111 */
    /* JADX WARN: Type inference failed for: r4v112 */
    /* JADX WARN: Type inference failed for: r4v115 */
    /* JADX WARN: Type inference failed for: r4v116 */
    /* JADX WARN: Type inference failed for: r4v117 */
    /* JADX WARN: Type inference failed for: r4v118 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v78 */
    /* JADX WARN: Type inference failed for: r4v79 */
    /* JADX WARN: Type inference failed for: r4v80 */
    /* JADX WARN: Type inference failed for: r4v82 */
    /* JADX WARN: Type inference failed for: r4v86, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v88, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v92 */
    /* JADX WARN: Type inference failed for: r6v71, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Method] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void EZpvd(String str) throws Exception {
        ?? r18;
        Exception exc;
        ?? r12;
        ?? r4;
        Object objNewInstance;
        Object[] objArr;
        ?? r182;
        int i;
        Throwable cause;
        String str2;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Class[] clsArr;
        Throwable cause2;
        Object[] objArr5;
        String str3;
        Throwable cause3;
        Object[] objArr6;
        Class[] clsArr2;
        InputStream inputStream;
        Throwable th;
        Throwable cause4;
        Object[] objArr7;
        Class[] clsArr3;
        Throwable cause5;
        Object[] objArr8;
        Throwable cause6;
        Object[] objArr9;
        Object objInvoke;
        Throwable cause7;
        Throwable cause8;
        Object[] objArr10;
        Object[] objArr11;
        String str4;
        Class[] clsArr4;
        Throwable cause9;
        Object objInvoke2;
        String str5 = str;
        int method = 1;
        Object[] objArr12 = new Object[1];
        a(new char[]{30, 16, '\n', '!', 2, '\t', 25, 0, 13861}, (byte) 40, 9, objArr12);
        ?? r3 = 0;
        String str6 = (String) objArr12[0];
        Object[] objArr13 = new Object[1];
        a(new char[]{17, 4, 2, 15, '\r', 0, 0, 27, '#', 11}, (byte) 10, 10, objArr13);
        String str7 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        b(new int[]{-1414491670, 906824610, -1792882694, 1062005216}, 5, objArr14);
        try {
            String[] strArrAEQbTJ = Zs.AEQbTJ(Zs.copydefault((byte[]) String.class.getMethod("getBytes", String.class).invoke(str5, (String) objArr14[0])));
            if (strArrAEQbTJ == null) {
                strArrAEQbTJ = new String[0];
            }
            int length = strArrAEQbTJ.length;
            String[] strArr = new String[length + 1];
            System.arraycopy(strArrAEQbTJ, 0, strArr, 0, length);
            strArr[length] = str5;
            int i2 = 0;
            ?? r122 = strArr;
            while (i2 <= length) {
                ?? r13 = r122[i2];
                try {
                    Object[] objArr15 = new Object[method];
                    try {
                        b(new int[]{-1075711910, -1521293866, -1620933693, -1173452691, -125929522, -232185779, 1047602994, -1072337595, 1050095033, 1476801112, 527511556, 2035333718, 1423690155, 748868745}, 25, objArr15);
                        try {
                            Object[] objArr16 = {(String) objArr15[r3]};
                            Class[] clsArr5 = new Class[method];
                            clsArr5[r3] = String.class;
                            objNewInstance = File.class.getDeclaredConstructor(clsArr5).newInstance(objArr16);
                            try {
                                objArr = new Object[method];
                                b(new int[]{1396837024, 1312588602, 681049567, 1243010954}, 8, objArr);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            try {
                            } catch (Throwable th3) {
                                th = th3;
                                Throwable th4 = th;
                                Throwable cause10 = th4.getCause();
                                if (cause10 == null) {
                                    throw th4;
                                }
                                throw cause10;
                            }
                        } catch (Throwable th5) {
                            Throwable cause11 = th5.getCause();
                            if (cause11 == null) {
                                throw th5;
                            }
                            throw cause11;
                        }
                    } catch (Exception e) {
                        e = e;
                        r18 = r122;
                        r122 = r3;
                        exc = e;
                        r4 = method;
                        r12 = r122;
                        r18 = r18;
                        if (i2 < length) {
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    r18 = r122;
                }
                if (((Boolean) File.class.getMethod((String) objArr[0], null).invoke(objNewInstance, null)).booleanValue()) {
                    ClassLoader classLoader = TensorFlowLite.class.getClassLoader();
                    Object[] objArr17 = {i2 < length ? str5 : r13};
                    byte b = (byte) (OLrzqt[4] + method);
                    byte b2 = b;
                    r18 = r122;
                    Object[] objArr18 = new Object[method];
                    c(b, b2, b2, objArr18);
                    String str8 = (String) objArr18[0];
                    Class[] clsArr6 = new Class[method];
                    clsArr6[0] = String.class;
                    Method declaredMethod = ClassLoader.class.getDeclaredMethod(str8, clsArr6);
                    declaredMethod.setAccessible(method);
                    str2 = (String) declaredMethod.invoke(classLoader, objArr17);
                    if (str2 != null) {
                    }
                    r12 = 0;
                    r4 = i;
                    r18 = r182;
                    if (i2 < length) {
                    }
                } else {
                    try {
                        Object[] objArr19 = new Object[method];
                        b(new int[]{-662632524, -300999744, 762940381, 1475907592, 2011431623, 1369093505, -2118275343, 284354570}, 14, objArr19);
                        String str9 = (String) objArr19[0];
                        try {
                            Object[] objArr20 = {System.getProperty(str9, str9)};
                            Class[] clsArr7 = new Class[method];
                            clsArr7[0] = String.class;
                            objNewInstance = File.class.getDeclaredConstructor(clsArr7).newInstance(objArr20);
                            try {
                                Object[] objArr21 = new Object[method];
                                b(new int[]{1396837024, 1312588602, 681049567, 1243010954}, 8, objArr21);
                                if (!((Boolean) File.class.getMethod((String) objArr21[0], null).invoke(objNewInstance, null)).booleanValue()) {
                                    objNewInstance = Environment.getExternalStorageDirectory();
                                }
                                try {
                                    ClassLoader classLoader2 = TensorFlowLite.class.getClassLoader();
                                    try {
                                        Object[] objArr172 = {i2 < length ? str5 : r13};
                                        byte b3 = (byte) (OLrzqt[4] + method);
                                        byte b22 = b3;
                                        r18 = r122;
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                    try {
                                        Object[] objArr182 = new Object[method];
                                        c(b3, b22, b22, objArr182);
                                    } catch (Throwable th7) {
                                        th = th7;
                                        Throwable th8 = th;
                                        cause = th8.getCause();
                                        if (cause != null) {
                                        }
                                    }
                                    try {
                                        String str82 = (String) objArr182[0];
                                        Class[] clsArr62 = new Class[method];
                                        clsArr62[0] = String.class;
                                        Method declaredMethod2 = ClassLoader.class.getDeclaredMethod(str82, clsArr62);
                                        declaredMethod2.setAccessible(method);
                                        str2 = (String) declaredMethod2.invoke(classLoader2, objArr172);
                                        if (str2 != null) {
                                            try {
                                                Object objInvoke3 = Runtime.class.getMethod(str7, null).invoke(null, null);
                                                ?? r132 = r13;
                                                if (i2 >= length) {
                                                    r132 = str;
                                                }
                                                try {
                                                    try {
                                                        Object[] objArr22 = new Object[method];
                                                        a(new char[]{30, 1, '!', 31, '\f', 25, '\n', '\t', 2, 14, 13906}, (byte) 111, 11, objArr22);
                                                        String str10 = (String) objArr22[0];
                                                        Class[] clsArr8 = new Class[method];
                                                        clsArr8[0] = String.class;
                                                        Runtime.class.getMethod(str10, clsArr8).invoke(objInvoke3, r132);
                                                        return;
                                                    } catch (Exception e3) {
                                                        exc = e3;
                                                        i = method;
                                                        r182 = r18;
                                                    }
                                                } catch (Throwable th9) {
                                                    Throwable cause12 = th9.getCause();
                                                    if (cause12 == null) {
                                                        throw th9;
                                                    }
                                                    throw cause12;
                                                }
                                            } catch (Throwable th10) {
                                                Throwable cause13 = th10.getCause();
                                                if (cause13 == null) {
                                                    throw th10;
                                                }
                                                throw cause13;
                                            }
                                        } else {
                                            try {
                                                objArr2 = new Object[method];
                                            } catch (Throwable th11) {
                                                th = th11;
                                            }
                                            try {
                                                objArr2[0] = 47;
                                                Object[] objArr23 = new Object[method];
                                                a(new char[]{' ', '!', '!', 4, 25, 4, '#', 0, 21, '!', 13924}, (byte) 104, 11, objArr23);
                                                String str11 = (String) objArr23[0];
                                                Class[] clsArr9 = new Class[method];
                                                clsArr9[0] = Integer.TYPE;
                                                try {
                                                    objArr3 = new Object[method];
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                }
                                                try {
                                                    objArr3[0] = Integer.valueOf(((Integer) String.class.getMethod(str11, clsArr9).invoke(str2, objArr2)).intValue() + method);
                                                    Class[] clsArr10 = new Class[method];
                                                    clsArr10[0] = Integer.TYPE;
                                                    try {
                                                        objArr4 = new Object[]{objNewInstance, String.class.getMethod(str6, clsArr10).invoke(str2, objArr3)};
                                                        clsArr = new Class[2];
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                    }
                                                    try {
                                                        clsArr[0] = File.class;
                                                        clsArr[method] = String.class;
                                                        Object objNewInstance2 = File.class.getDeclaredConstructor(clsArr).newInstance(objArr4);
                                                        try {
                                                            URL resource = TensorFlowLite.class.getClassLoader().getResource(str2);
                                                            if (resource == null) {
                                                                try {
                                                                    Object[] objArr24 = new Object[method];
                                                                    b(new int[]{-732729673, 660088852, 1065269520, -160284529}, 8, objArr24);
                                                                    String str12 = (String) objArr24[0];
                                                                    Class[] clsArr11 = new Class[method];
                                                                    clsArr11[0] = CharSequence.class;
                                                                    if (((Boolean) String.class.getMethod(str12, clsArr11).invoke(str2, "!")).booleanValue()) {
                                                                        try {
                                                                            StringBuilder sb = new StringBuilder();
                                                                            Object[] objArr25 = new Object[method];
                                                                            a(new char[]{'\"', '!', 14, '\b', 18, 27, '#', 1, 13806}, (byte) 78, 9, objArr25);
                                                                            sb.append((String) objArr25[0]);
                                                                            sb.append(str2);
                                                                            String path = new URL(sb.toString()).getPath();
                                                                            try {
                                                                                Object[] objArr26 = new Object[method];
                                                                                a(new char[]{' ', '!', '!', 4, 25, 4, '#', 0, 21, '!', 13924}, (byte) 104, 11, objArr26);
                                                                                try {
                                                                                    ZipFile zipFile = new ZipFile((String) String.class.getMethod(str6, Integer.TYPE, Integer.TYPE).invoke(path, 5, Integer.valueOf(((Integer) String.class.getMethod((String) objArr26[0], String.class).invoke(path, "!/")).intValue())));
                                                                                    try {
                                                                                        Object[] objArr27 = new Object[1];
                                                                                        a(new char[]{' ', '!', '!', 4, 25, 4, '#', 0, 21, '!', 13924}, (byte) 104, 11, objArr27);
                                                                                        try {
                                                                                            try {
                                                                                                inputStream = zipFile.getInputStream(zipFile.getEntry((String) String.class.getMethod(str6, Integer.TYPE).invoke(String.class.getMethod(str6, Integer.TYPE).invoke(str2, Integer.valueOf(((Integer) String.class.getMethod((String) objArr27[0], String.class).invoke(str2, "!/")).intValue())), 2)));
                                                                                            } catch (Throwable th14) {
                                                                                                Throwable cause14 = th14.getCause();
                                                                                                if (cause14 == null) {
                                                                                                    throw th14;
                                                                                                }
                                                                                                throw cause14;
                                                                                            }
                                                                                        } catch (Throwable th15) {
                                                                                            Throwable cause15 = th15.getCause();
                                                                                            if (cause15 == null) {
                                                                                                throw th15;
                                                                                            }
                                                                                            throw cause15;
                                                                                        }
                                                                                    } catch (Throwable th16) {
                                                                                        Throwable cause16 = th16.getCause();
                                                                                        if (cause16 == null) {
                                                                                            throw th16;
                                                                                        }
                                                                                        throw cause16;
                                                                                    }
                                                                                } catch (Throwable th17) {
                                                                                    Throwable cause17 = th17.getCause();
                                                                                    if (cause17 == null) {
                                                                                        throw th17;
                                                                                    }
                                                                                    throw cause17;
                                                                                }
                                                                            } catch (Throwable th18) {
                                                                                Throwable cause18 = th18.getCause();
                                                                                if (cause18 == null) {
                                                                                    throw th18;
                                                                                }
                                                                                throw cause18;
                                                                            }
                                                                        } catch (Exception e4) {
                                                                            exc = e4;
                                                                            i = 1;
                                                                            r182 = r18;
                                                                            r12 = 0;
                                                                            r4 = i;
                                                                            r18 = r182;
                                                                            if (i2 < length) {
                                                                            }
                                                                        }
                                                                    } else {
                                                                        try {
                                                                            inputStream = (InputStream) FileInputStream.class.getDeclaredConstructor(String.class).newInstance(str2);
                                                                        } catch (Throwable th19) {
                                                                            Throwable cause19 = th19.getCause();
                                                                            if (cause19 == null) {
                                                                                throw th19;
                                                                            }
                                                                            throw cause19;
                                                                        }
                                                                    }
                                                                } catch (Throwable th20) {
                                                                    Throwable cause20 = th20.getCause();
                                                                    if (cause20 == null) {
                                                                        throw th20;
                                                                    }
                                                                    throw cause20;
                                                                }
                                                            } else {
                                                                String path2 = resource.getPath();
                                                                try {
                                                                    objArr5 = new Object[]{"!/" + str2};
                                                                } catch (Throwable th21) {
                                                                    th = th21;
                                                                }
                                                                try {
                                                                    Object[] objArr28 = new Object[1];
                                                                    a(new char[]{' ', '!', '!', 4, 25, 4, '#', 0, 21, '!', 13924}, (byte) 104, 11, objArr28);
                                                                    try {
                                                                        str3 = (String) objArr28[0];
                                                                    } catch (Throwable th22) {
                                                                        th = th22;
                                                                    }
                                                                } catch (Throwable th23) {
                                                                    th = th23;
                                                                    Throwable th24 = th;
                                                                    cause2 = th24.getCause();
                                                                    if (cause2 != null) {
                                                                    }
                                                                }
                                                                try {
                                                                    Class[] clsArr12 = new Class[1];
                                                                    clsArr12[0] = String.class;
                                                                    try {
                                                                        objArr6 = new Object[2];
                                                                        try {
                                                                            objArr6[1] = Integer.valueOf(((Integer) String.class.getMethod(str3, clsArr12).invoke(path2, objArr5)).intValue());
                                                                        } catch (Throwable th25) {
                                                                            th = th25;
                                                                        }
                                                                    } catch (Throwable th26) {
                                                                        th = th26;
                                                                    }
                                                                    try {
                                                                        objArr6[0] = 5;
                                                                        clsArr2 = new Class[2];
                                                                        clsArr2[0] = Integer.TYPE;
                                                                    } catch (Throwable th27) {
                                                                        th = th27;
                                                                        Throwable th28 = th;
                                                                        cause3 = th28.getCause();
                                                                        if (cause3 != null) {
                                                                        }
                                                                    }
                                                                    try {
                                                                        clsArr2[1] = Integer.TYPE;
                                                                        ZipFile zipFile2 = new ZipFile((String) String.class.getMethod(str6, clsArr2).invoke(path2, objArr6));
                                                                        inputStream = zipFile2.getInputStream(zipFile2.getEntry(str2));
                                                                    } catch (Throwable th29) {
                                                                        th = th29;
                                                                        Throwable th282 = th;
                                                                        cause3 = th282.getCause();
                                                                        if (cause3 != null) {
                                                                            throw th282;
                                                                        }
                                                                        throw cause3;
                                                                    }
                                                                } catch (Throwable th30) {
                                                                    th = th30;
                                                                    Throwable th242 = th;
                                                                    cause2 = th242.getCause();
                                                                    if (cause2 != null) {
                                                                        throw th242;
                                                                    }
                                                                    throw cause2;
                                                                }
                                                            }
                                                            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                                                            try {
                                                                Object[] objArr29 = {bufferedInputStream};
                                                                Object objEZpvd = YY.EZpvd(1683135861);
                                                                if (objEZpvd == null) {
                                                                    try {
                                                                        objEZpvd = YY.EZpvd(37, 4, (char) 38177, 1618104329, false, "AEQbTJ", new Class[]{InputStream.class});
                                                                    } catch (Throwable th31) {
                                                                        th = th31;
                                                                        Throwable cause21 = th.getCause();
                                                                        if (cause21 == null) {
                                                                            throw th;
                                                                        }
                                                                        throw cause21;
                                                                    }
                                                                }
                                                                InputStream inputStream2 = (InputStream) ((Method) objEZpvd).invoke(null, objArr29);
                                                                r122 = 27;
                                                                r122 = 27;
                                                                if (bufferedInputStream == inputStream2) {
                                                                    inputStream2.close();
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                Object objInvoke4 = Runtime.class.getMethod(str7, null).invoke(null, null);
                                                                                try {
                                                                                    Object[] objArr30 = {str2, TensorFlowLite.class.getClassLoader()};
                                                                                    Object[] objArr31 = new Object[1];
                                                                                    a(new char[]{30, 1, '!', 31}, (byte) 8, 4, objArr31);
                                                                                    Method declaredMethod3 = Runtime.class.getDeclaredMethod((String) objArr31[0], String.class, ClassLoader.class);
                                                                                    declaredMethod3.setAccessible(true);
                                                                                    declaredMethod3.invoke(objInvoke4, objArr30);
                                                                                } catch (Throwable th32) {
                                                                                    Throwable cause22 = th32.getCause();
                                                                                    if (cause22 == null) {
                                                                                        throw th32;
                                                                                    }
                                                                                    throw cause22;
                                                                                }
                                                                            } catch (NoSuchMethodException unused) {
                                                                                try {
                                                                                    objInvoke2 = Runtime.class.getMethod(str7, null).invoke(null, null);
                                                                                    ClassLoader classLoader3 = TensorFlowLite.class.getClassLoader();
                                                                                    synchronized (objInvoke2) {
                                                                                    }
                                                                                } catch (Throwable th33) {
                                                                                    Throwable cause23 = th33.getCause();
                                                                                    if (cause23 == null) {
                                                                                        throw th33;
                                                                                    }
                                                                                    throw cause23;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th34) {
                                                                            Throwable cause24 = th34.getCause();
                                                                            if (cause24 == null) {
                                                                                throw th34;
                                                                            }
                                                                            throw cause24;
                                                                        }
                                                                    } catch (Exception unused2) {
                                                                        if (Build.VERSION.SDK_INT <= 27) {
                                                                            try {
                                                                                Object objInvoke5 = Runtime.class.getMethod(str7, null).invoke(null, null);
                                                                                try {
                                                                                    Object[] objArr32 = {str2, TensorFlowLite.class.getClassLoader()};
                                                                                    Object[] objArr33 = new Object[1];
                                                                                    a(new char[]{0, 6, '\f', 1, '!', 31}, Ascii.FS, 6, objArr33);
                                                                                    Method declaredMethod4 = Runtime.class.getDeclaredMethod((String) objArr33[0], String.class, ClassLoader.class);
                                                                                    declaredMethod4.setAccessible(true);
                                                                                    declaredMethod4.invoke(objInvoke5, objArr32);
                                                                                } catch (Throwable th35) {
                                                                                    Throwable cause25 = th35.getCause();
                                                                                    if (cause25 == null) {
                                                                                        throw th35;
                                                                                    }
                                                                                    throw cause25;
                                                                                }
                                                                            } catch (Throwable th36) {
                                                                                Throwable cause26 = th36.getCause();
                                                                                if (cause26 == null) {
                                                                                    throw th36;
                                                                                }
                                                                                throw cause26;
                                                                            }
                                                                        } else {
                                                                            objInvoke2 = Runtime.class.getMethod(str7, null).invoke(null, null);
                                                                            ClassLoader classLoader32 = TensorFlowLite.class.getClassLoader();
                                                                            synchronized (objInvoke2) {
                                                                                try {
                                                                                    Object[] objArr34 = {str2, classLoader32};
                                                                                    Object[] objArr35 = new Object[1];
                                                                                    b(new int[]{-109045123, -1164765541, 992779868, -64443189, 603527434, 856701037}, 10, objArr35);
                                                                                    Method declaredMethod5 = Runtime.class.getDeclaredMethod((String) objArr35[0], String.class, ClassLoader.class);
                                                                                    declaredMethod5.setAccessible(true);
                                                                                    String str13 = (String) declaredMethod5.invoke(objInvoke2, objArr34);
                                                                                    if (str13 != null) {
                                                                                        throw new UnsatisfiedLinkError(str13);
                                                                                    }
                                                                                } catch (Throwable th37) {
                                                                                    Throwable cause27 = th37.getCause();
                                                                                    if (cause27 == null) {
                                                                                        throw th37;
                                                                                    }
                                                                                    throw cause27;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    r4 = 1;
                                                                    r12 = 0;
                                                                } else {
                                                                    try {
                                                                        try {
                                                                            objArr7 = new Object[]{objNewInstance2};
                                                                        } catch (Throwable th38) {
                                                                            th = th38;
                                                                        }
                                                                        try {
                                                                            clsArr3 = new Class[1];
                                                                        } catch (Throwable th39) {
                                                                            th = th39;
                                                                            Throwable th40 = th;
                                                                            cause4 = th40.getCause();
                                                                            if (cause4 != null) {
                                                                            }
                                                                        }
                                                                        try {
                                                                            clsArr3[0] = File.class;
                                                                            OutputStream outputStream = (OutputStream) FileOutputStream.class.getDeclaredConstructor(clsArr3).newInstance(objArr7);
                                                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                                                                            byte[] bArr = new byte[1024];
                                                                            while (true) {
                                                                                int i3 = inputStream2.read(bArr);
                                                                                if (i3 < 0) {
                                                                                    break;
                                                                                } else {
                                                                                    bufferedOutputStream.write(bArr, 0, i3);
                                                                                }
                                                                            }
                                                                            bufferedOutputStream.flush();
                                                                            try {
                                                                            } catch (Throwable th41) {
                                                                                th = th41;
                                                                            }
                                                                            try {
                                                                                objArr8 = new Object[1];
                                                                                b(new int[]{-1621614460, 1032777284, -2085445419, -1430244218}, 5, objArr8);
                                                                            } catch (Throwable th42) {
                                                                                th = th42;
                                                                                Throwable th43 = th;
                                                                                cause5 = th43.getCause();
                                                                                if (cause5 != null) {
                                                                                }
                                                                            }
                                                                            try {
                                                                                Object objInvoke6 = FileOutputStream.class.getMethod((String) objArr8[0], null).invoke(outputStream, null);
                                                                                try {
                                                                                    try {
                                                                                        objArr9 = new Object[1];
                                                                                        b(new int[]{-1582966481, -1750891707}, 4, objArr9);
                                                                                    } catch (Throwable th44) {
                                                                                        th = th44;
                                                                                        Throwable th45 = th;
                                                                                        cause6 = th45.getCause();
                                                                                        if (cause6 != null) {
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        method = FileDescriptor.class.getMethod((String) objArr9[0], null);
                                                                                        method.invoke(objInvoke6, null);
                                                                                        bufferedOutputStream.close();
                                                                                        inputStream2.close();
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    Object objInvoke7 = Runtime.class.getMethod(str7, null).invoke(null, null);
                                                                                                    try {
                                                                                                        Object[] objArr36 = new Object[1];
                                                                                                        a(new char[]{17, 4, 0, 21, '\n', '!', 1, 30, 15, 0, 11, 5, '!', 2, 13926}, (byte) 116, 15, objArr36);
                                                                                                        method = File.class.getMethod((String) objArr36[0], null).invoke(objNewInstance2, null);
                                                                                                        try {
                                                                                                            method = new Object[]{method, TensorFlowLite.class.getClassLoader()};
                                                                                                            Object[] objArr37 = new Object[1];
                                                                                                            a(new char[]{30, 1, '!', 31}, (byte) 8, 4, objArr37);
                                                                                                            ?? declaredMethod6 = Runtime.class.getDeclaredMethod((String) objArr37[0], String.class, ClassLoader.class);
                                                                                                            declaredMethod6.setAccessible(true);
                                                                                                            declaredMethod6.invoke(objInvoke7, method);
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
                                                                                                } catch (Throwable th48) {
                                                                                                    Throwable cause30 = th48.getCause();
                                                                                                    if (cause30 == null) {
                                                                                                        throw th48;
                                                                                                    }
                                                                                                    throw cause30;
                                                                                                }
                                                                                            } catch (NoSuchMethodException unused3) {
                                                                                                try {
                                                                                                    try {
                                                                                                        method = 0;
                                                                                                        objInvoke = Runtime.class.getMethod(str7, null).invoke(null, null);
                                                                                                        try {
                                                                                                        } catch (Throwable th49) {
                                                                                                            th = th49;
                                                                                                        }
                                                                                                        try {
                                                                                                            Object[] objArr38 = new Object[1];
                                                                                                            a(new char[]{17, 4, 0, 21, '\n', '!', 1, 30, 15, 0, 11, 5, '!', 2, 13926}, (byte) 116, 15, objArr38);
                                                                                                        } catch (Throwable th50) {
                                                                                                            th = th50;
                                                                                                            Throwable th51 = th;
                                                                                                            cause7 = th51.getCause();
                                                                                                            if (cause7 != null) {
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            Object objInvoke8 = File.class.getMethod((String) objArr38[0], null).invoke(objNewInstance2, null);
                                                                                                            ClassLoader classLoader4 = TensorFlowLite.class.getClassLoader();
                                                                                                            try {
                                                                                                                synchronized (objInvoke) {
                                                                                                                }
                                                                                                            } catch (Throwable th52) {
                                                                                                                th = th52;
                                                                                                            }
                                                                                                        } catch (Throwable th53) {
                                                                                                            th = th53;
                                                                                                            Throwable th512 = th;
                                                                                                            cause7 = th512.getCause();
                                                                                                            if (cause7 != null) {
                                                                                                                throw th512;
                                                                                                            }
                                                                                                            throw cause7;
                                                                                                        }
                                                                                                    } catch (Throwable th54) {
                                                                                                        Throwable cause31 = th54.getCause();
                                                                                                        if (cause31 == null) {
                                                                                                            throw th54;
                                                                                                        }
                                                                                                        throw cause31;
                                                                                                    }
                                                                                                } catch (Exception e5) {
                                                                                                    e = e5;
                                                                                                    exc = e;
                                                                                                    r4 = method;
                                                                                                    r12 = r122;
                                                                                                    r18 = r18;
                                                                                                    if (i2 < length) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } catch (Exception unused4) {
                                                                                            if (Build.VERSION.SDK_INT <= 27) {
                                                                                                try {
                                                                                                    Object objInvoke9 = Runtime.class.getMethod(str7, null).invoke(null, null);
                                                                                                    try {
                                                                                                        Object[] objArr39 = new Object[1];
                                                                                                        a(new char[]{17, 4, 0, 21, '\n', '!', 1, 30, 15, 0, 11, 5, '!', 2, 13926}, (byte) 116, 15, objArr39);
                                                                                                        try {
                                                                                                            Object[] objArr40 = {File.class.getMethod((String) objArr39[0], null).invoke(objNewInstance2, null), TensorFlowLite.class.getClassLoader()};
                                                                                                            Object[] objArr41 = new Object[1];
                                                                                                            a(new char[]{0, 6, '\f', 1, '!', 31}, Ascii.FS, 6, objArr41);
                                                                                                            Method declaredMethod7 = Runtime.class.getDeclaredMethod((String) objArr41[0], String.class, ClassLoader.class);
                                                                                                            declaredMethod7.setAccessible(true);
                                                                                                            declaredMethod7.invoke(objInvoke9, objArr40);
                                                                                                        } catch (Throwable th55) {
                                                                                                            Throwable cause32 = th55.getCause();
                                                                                                            if (cause32 == null) {
                                                                                                                throw th55;
                                                                                                            }
                                                                                                            throw cause32;
                                                                                                        }
                                                                                                    } catch (Throwable th56) {
                                                                                                        Throwable cause33 = th56.getCause();
                                                                                                        if (cause33 == null) {
                                                                                                            throw th56;
                                                                                                        }
                                                                                                        throw cause33;
                                                                                                    }
                                                                                                } catch (Throwable th57) {
                                                                                                    Throwable cause34 = th57.getCause();
                                                                                                    if (cause34 == null) {
                                                                                                        throw th57;
                                                                                                    }
                                                                                                    throw cause34;
                                                                                                }
                                                                                            }
                                                                                            method = 0;
                                                                                            objInvoke = Runtime.class.getMethod(str7, null).invoke(null, null);
                                                                                            Object[] objArr382 = new Object[1];
                                                                                            a(new char[]{17, 4, 0, 21, '\n', '!', 1, 30, 15, 0, 11, 5, '!', 2, 13926}, (byte) 116, 15, objArr382);
                                                                                            Object objInvoke82 = File.class.getMethod((String) objArr382[0], null).invoke(objNewInstance2, null);
                                                                                            ClassLoader classLoader42 = TensorFlowLite.class.getClassLoader();
                                                                                            synchronized (objInvoke) {
                                                                                                try {
                                                                                                    objArr10 = new Object[]{objInvoke82, classLoader42};
                                                                                                } catch (Throwable th58) {
                                                                                                    th = th58;
                                                                                                }
                                                                                                try {
                                                                                                    objArr11 = new Object[1];
                                                                                                    try {
                                                                                                        b(new int[]{-109045123, -1164765541, 992779868, -64443189, 603527434, 856701037}, 10, objArr11);
                                                                                                    } catch (Throwable th59) {
                                                                                                        th = th59;
                                                                                                    }
                                                                                                } catch (Throwable th60) {
                                                                                                    th = th60;
                                                                                                    Throwable th61 = th;
                                                                                                    cause8 = th61.getCause();
                                                                                                    if (cause8 == null) {
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    str4 = (String) objArr11[0];
                                                                                                    clsArr4 = new Class[2];
                                                                                                    clsArr4[0] = String.class;
                                                                                                } catch (Throwable th62) {
                                                                                                    th = th62;
                                                                                                    Throwable th612 = th;
                                                                                                    cause8 = th612.getCause();
                                                                                                    if (cause8 == null) {
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    clsArr4[1] = ClassLoader.class;
                                                                                                    Method declaredMethod8 = Runtime.class.getDeclaredMethod(str4, clsArr4);
                                                                                                    declaredMethod8.setAccessible(true);
                                                                                                    String str14 = (String) declaredMethod8.invoke(objInvoke, objArr10);
                                                                                                    if (str14 != null) {
                                                                                                        throw new UnsatisfiedLinkError(str14);
                                                                                                    }
                                                                                                    try {
                                                                                                    } catch (Throwable th63) {
                                                                                                        th = th63;
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (Throwable th64) {
                                                                                                    th = th64;
                                                                                                    Throwable th6122 = th;
                                                                                                    cause8 = th6122.getCause();
                                                                                                    if (cause8 == null) {
                                                                                                        throw th6122;
                                                                                                    }
                                                                                                    throw cause8;
                                                                                                }
                                                                                            }
                                                                                            r4 = 1;
                                                                                            r4 = 1;
                                                                                            r4 = 1;
                                                                                            Object[] objArr42 = new Object[1];
                                                                                            b(new int[]{-415197248, 1216754691, 2087214847, -771571310}, 6, objArr42);
                                                                                            r12 = 0;
                                                                                            r12 = 0;
                                                                                            ((Boolean) File.class.getMethod((String) objArr42[0], null).invoke(objNewInstance2, null)).booleanValue();
                                                                                            i2++;
                                                                                            str5 = str;
                                                                                            r3 = r12;
                                                                                            r122 = r18;
                                                                                            method = r4;
                                                                                        }
                                                                                        try {
                                                                                            r4 = 1;
                                                                                            r4 = 1;
                                                                                            r4 = 1;
                                                                                        } catch (Throwable th65) {
                                                                                            th = th65;
                                                                                            r4 = 1;
                                                                                        }
                                                                                        try {
                                                                                            Object[] objArr422 = new Object[1];
                                                                                            b(new int[]{-415197248, 1216754691, 2087214847, -771571310}, 6, objArr422);
                                                                                            r12 = 0;
                                                                                            r12 = 0;
                                                                                        } catch (Throwable th66) {
                                                                                            th = th66;
                                                                                            r12 = 0;
                                                                                            Throwable th67 = th;
                                                                                            try {
                                                                                                cause9 = th67.getCause();
                                                                                                if (cause9 != null) {
                                                                                                }
                                                                                            } catch (Exception unused5) {
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            ((Boolean) File.class.getMethod((String) objArr422[0], null).invoke(objNewInstance2, null)).booleanValue();
                                                                                        } catch (Throwable th68) {
                                                                                            th = th68;
                                                                                            Throwable th672 = th;
                                                                                            cause9 = th672.getCause();
                                                                                            if (cause9 != null) {
                                                                                                throw th672;
                                                                                            }
                                                                                            throw cause9;
                                                                                        }
                                                                                    } catch (Throwable th69) {
                                                                                        th = th69;
                                                                                        Throwable th452 = th;
                                                                                        cause6 = th452.getCause();
                                                                                        if (cause6 != null) {
                                                                                            throw th452;
                                                                                        }
                                                                                        throw cause6;
                                                                                    }
                                                                                } catch (Throwable th70) {
                                                                                    th = th70;
                                                                                }
                                                                            } catch (Throwable th71) {
                                                                                th = th71;
                                                                                Throwable th432 = th;
                                                                                cause5 = th432.getCause();
                                                                                if (cause5 != null) {
                                                                                    throw th432;
                                                                                }
                                                                                throw cause5;
                                                                            }
                                                                        } catch (Throwable th72) {
                                                                            th = th72;
                                                                            Throwable th402 = th;
                                                                            cause4 = th402.getCause();
                                                                            if (cause4 != null) {
                                                                                throw th402;
                                                                            }
                                                                            throw cause4;
                                                                        }
                                                                    } catch (Exception e6) {
                                                                        e = e6;
                                                                        method = 1;
                                                                        r18 = r18;
                                                                        r122 = 0;
                                                                        exc = e;
                                                                        r4 = method;
                                                                        r12 = r122;
                                                                        r18 = r18;
                                                                        if (i2 < length) {
                                                                        }
                                                                    }
                                                                }
                                                            } catch (Throwable th73) {
                                                                th = th73;
                                                            }
                                                        } catch (Exception e7) {
                                                            e = e7;
                                                            method = method;
                                                            r18 = r18;
                                                        }
                                                    } catch (Throwable th74) {
                                                        th = th74;
                                                        Throwable th75 = th;
                                                        Throwable cause35 = th75.getCause();
                                                        if (cause35 == null) {
                                                            throw th75;
                                                        }
                                                        throw cause35;
                                                    }
                                                } catch (Throwable th76) {
                                                    th = th76;
                                                    Throwable th77 = th;
                                                    Throwable cause36 = th77.getCause();
                                                    if (cause36 == null) {
                                                        throw th77;
                                                    }
                                                    throw cause36;
                                                }
                                            } catch (Throwable th78) {
                                                th = th78;
                                                Throwable th79 = th;
                                                Throwable cause37 = th79.getCause();
                                                if (cause37 == null) {
                                                    throw th79;
                                                }
                                                throw cause37;
                                            }
                                        }
                                    } catch (Throwable th80) {
                                        th = th80;
                                        Throwable th82 = th;
                                        cause = th82.getCause();
                                        if (cause != null) {
                                            throw th82;
                                        }
                                        throw cause;
                                    }
                                } catch (Exception e8) {
                                    e = e8;
                                    r18 = r122;
                                    method = method;
                                }
                            } catch (Throwable th81) {
                                Throwable cause38 = th81.getCause();
                                if (cause38 == null) {
                                    throw th81;
                                }
                                throw cause38;
                            }
                        } catch (Throwable th83) {
                            Throwable cause39 = th83.getCause();
                            if (cause39 == null) {
                                throw th83;
                            }
                            throw cause39;
                        }
                    } catch (Exception e9) {
                        exc = e9;
                        r182 = r122;
                        i = method;
                    }
                    r12 = 0;
                    r4 = i;
                    r18 = r182;
                    if (i2 < length) {
                        throw exc;
                    }
                }
                i2++;
                str5 = str;
                r3 = r12;
                r122 = r18;
                method = r4;
            }
        } catch (Throwable th84) {
            Throwable cause40 = th84.getCause();
            if (cause40 == null) {
                throw th84;
            }
            throw cause40;
        }
    }
}
