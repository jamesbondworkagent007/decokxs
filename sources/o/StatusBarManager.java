package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.base.Ascii;
import com.okinc.base.bugreport.DetectionInfoBean;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C44103sDl;
import o.StatusBarManager;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes20.dex */
public final class StatusBarManager {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public final ResourcesManager AEQbTJ;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.StatusBarManager$Activity) A[MD:(o.StatusBarManager$Activity):void (m)] call: o.StatusBarManager.<init>(o.StatusBarManager$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ StatusBarManager(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResourcesManager AEQbTJ() {
        return this.AEQbTJ;
    }

    public StatusBarManager(Activity activity) {
        this.AEQbTJ = activity.EZpvd();
    }

    public static final class StateListAnimator {
        private static final byte[] $$c = {48, -53, -22, 107};
        private static final int $$d = CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {48, -53, -22, 107, 4, -7, 1, -29, -7, -7, -13, Ascii.FF, -17, 0, -11, Ascii.RS, 0, -17, -5};
        private static final int $$b = 29;
        private static int OLrzqt = 0;
        private static int EZpvd = 1;
        private static int KWHzl = 1694165070;
        private static char[] AEQbTJ = {'T', 55449, 45535, 35542, 25354, 15463, 5450, 60829, 47621, 25304, 2991, 12423, 55637, 34310, 44813, 22472, 31896, 9621, 49750, 60216, 36926, 47321, 24992, 3725, 14187, 56373, 34078, 44513, 19116, 953, 56139, 45590, 35099, 24777, 16376, 5787, 61023, 50534, 39966, 31685, 21168, 10718, 321, 55340, 46869, 36578, 26025, 15515, 5240, 62247, 51714, 41463, 3298, 54325, 48456, 34417, 28601, 12513, 6636, 57658, 51801};
        private static long copydefault = -5842493727427603376L;

        /* JADX DEBUG: Duplicate block (B:10:0x002a) to fix multi-entry loop: BACK_EDGE: B:9:0x0021 -> B:10:0x002a */
        private static java.lang.String $$e(short s, short s2, int i) {
            int i2 = s + 4;
            int i3 = s2 * 3;
            int i4 = 116 - i;
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[i3 + 1];
            int i5 = -1;
            if (bArr == null) {
                i5 = -1;
                i4 = (-i2) + i4;
                i2 = i2;
            }
            while (true) {
                int i6 = i5 + 1;
                bArr2[i6] = (byte) i4;
                if (i6 == i3) {
                    return new java.lang.String(bArr2, 0);
                }
                int i7 = i2 + 1;
                i5 = i6;
                i4 = (-bArr[i7]) + i4;
                i2 = i7;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.StatusBarManager.StateListAnimator.<init>():void type: THIS */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:10:0x0029) to fix multi-entry loop: BACK_EDGE: B:9:0x0025 -> B:10:0x0029 */
        private static void c(int i, short s, byte b, java.lang.Object[] objArr) {
            int i2 = s + 4;
            int i3 = b * 5;
            byte[] bArr = $$a;
            int i4 = (i * 20) + 79;
            byte[] bArr2 = new byte[i3 + 6];
            int i5 = i3 + 5;
            int i6 = -1;
            if (bArr == null) {
                i4 = i4 + i5 + 8;
            }
            while (true) {
                i6++;
                bArr2[i6] = (byte) i4;
                if (i6 == i5) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                } else {
                    i2++;
                    i4 = i4 + bArr[i2] + 8;
                }
            }
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        private static void b(int i, int i2, char c, java.lang.Object[] objArr) throws java.lang.Throwable {
            int i3 = 2 % 2;
            Zn zn = new Zn();
            long[] jArr = new long[i2];
            zn.EZpvd = 0;
            while (zn.EZpvd < i2) {
                int i4 = $11 + 13;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = zn.EZpvd;
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(AEQbTJ[i / i5])};
                        java.lang.Object objEZpvd = YY.EZpvd(927695670);
                        if (objEZpvd == null) {
                            byte b = (byte) (-1);
                            objEZpvd = YY.EZpvd(217, 4, (char) 0, 862670410, false, $$e(b, (byte) (b + 1), (byte) $$c.length), new java.lang.Class[]{java.lang.Integer.TYPE});
                        }
                        java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i5), java.lang.Long.valueOf(copydefault), java.lang.Integer.valueOf(c)};
                        java.lang.Object objEZpvd2 = YY.EZpvd(-297691357);
                        if (objEZpvd2 == null) {
                            byte b2 = (byte) (-1);
                            byte b3 = (byte) (b2 + 1);
                            objEZpvd2 = YY.EZpvd(TypedValues.CycleType.TYPE_WAVE_PERIOD, 5, (char) 0, -362718625, false, $$e(b2, b3, (byte) (b3 + 2)), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                        }
                        jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).longValue();
                        java.lang.Object[] objArr4 = {zn, zn};
                        java.lang.Object objEZpvd3 = YY.EZpvd(1191971121);
                        if (objEZpvd3 == null) {
                            byte b4 = (byte) (-1);
                            byte b5 = (byte) (b4 + 1);
                            objEZpvd3 = YY.EZpvd(226, 4, (char) 0, 1127007309, false, $$e(b4, b5, (byte) (b5 + 3)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                        }
                        ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i6 = zn.EZpvd;
                    java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(AEQbTJ[i + i6])};
                    java.lang.Object objEZpvd4 = YY.EZpvd(927695670);
                    if (objEZpvd4 == null) {
                        byte b6 = (byte) (-1);
                        objEZpvd4 = YY.EZpvd(217, 4, (char) 0, 862670410, false, $$e(b6, (byte) (b6 + 1), (byte) $$c.length), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    java.lang.Object[] objArr6 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5)).longValue()), java.lang.Long.valueOf(i6), java.lang.Long.valueOf(copydefault), java.lang.Integer.valueOf(c)};
                    java.lang.Object objEZpvd5 = YY.EZpvd(-297691357);
                    if (objEZpvd5 == null) {
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (b7 + 1);
                        objEZpvd5 = YY.EZpvd(TypedValues.CycleType.TYPE_WAVE_PERIOD, 5, (char) 0, -362718625, false, $$e(b7, b8, (byte) (b8 + 2)), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                    }
                    jArr[i6] = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd5).invoke(null, objArr6)).longValue();
                    java.lang.Object[] objArr7 = {zn, zn};
                    java.lang.Object objEZpvd6 = YY.EZpvd(1191971121);
                    if (objEZpvd6 == null) {
                        byte b9 = (byte) (-1);
                        byte b10 = (byte) (b9 + 1);
                        objEZpvd6 = YY.EZpvd(226, 4, (char) 0, 1127007309, false, $$e(b9, b10, (byte) (b10 + 3)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) objEZpvd6).invoke(null, objArr7);
                }
            }
            char[] cArr = new char[i2];
            zn.EZpvd = 0;
            while (zn.EZpvd < i2) {
                cArr[zn.EZpvd] = (char) jArr[zn.EZpvd];
                java.lang.Object[] objArr8 = {zn, zn};
                java.lang.Object objEZpvd7 = YY.EZpvd(1191971121);
                if (objEZpvd7 == null) {
                    byte b11 = (byte) (-1);
                    byte b12 = (byte) (b11 + 1);
                    objEZpvd7 = YY.EZpvd(226, 4, (char) 0, 1127007309, false, $$e(b11, b12, (byte) (b12 + 3)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) objEZpvd7).invoke(null, objArr8);
            }
            java.lang.String str = new java.lang.String(cArr);
            int i7 = $10 + 57;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            objArr[0] = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [129=4] */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0132  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(boolean z, int i, int i2, int i3, char[] cArr, java.lang.Object[] objArr) throws java.lang.Throwable {
            int i4;
            java.lang.Throwable cause;
            int i5 = 2 % 2;
            Zl zl = new Zl();
            char[] cArr2 = new char[i3];
            zl.OLrzqt = 0;
            while (true) {
                i4 = 654343494;
                if (zl.OLrzqt >= i3) {
                    break;
                }
                zl.KWHzl = cArr[zl.OLrzqt];
                cArr2[zl.OLrzqt] = (char) (i + zl.KWHzl);
                int i6 = zl.OLrzqt;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i6]), java.lang.Integer.valueOf(KWHzl)};
                    java.lang.Object objEZpvd = YY.EZpvd(1433686791);
                    if (objEZpvd == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objEZpvd = YY.EZpvd(625, 5, (char) 0, 1364500091, false, $$e(b, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr2[i6] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                    java.lang.Object[] objArr3 = {zl, zl};
                    java.lang.Object objEZpvd2 = YY.EZpvd(654343494);
                    if (objEZpvd2 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objEZpvd2 = YY.EZpvd(625, 5, (char) 0, 589344826, false, $$e(b3, b4, (byte) (b4 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3);
                } catch (java.lang.Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            if (i2 > 0) {
                int i7 = $10 + 45;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                zl.AEQbTJ = i2;
                char[] cArr3 = new char[i3];
                java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i3);
                java.lang.System.arraycopy(cArr3, 0, cArr2, i3 - zl.AEQbTJ, zl.AEQbTJ);
                java.lang.System.arraycopy(cArr3, zl.AEQbTJ, cArr2, 0, i3 - zl.AEQbTJ);
                int i9 = $11 + 119;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            }
            if (z) {
                char[] cArr4 = new char[i3];
                zl.OLrzqt = 0;
                while (zl.OLrzqt < i3) {
                    cArr4[zl.OLrzqt] = cArr2[(i3 - zl.OLrzqt) - 1];
                    java.lang.Object[] objArr4 = {zl, zl};
                    java.lang.Object objEZpvd3 = YY.EZpvd(i4);
                    if (objEZpvd3 == null) {
                        byte b5 = (byte) (-1);
                        byte b6 = (byte) (b5 + 1);
                        objEZpvd3 = YY.EZpvd(625, 5, (char) 0, 589344826, false, $$e(b5, b6, (byte) (b6 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
                    i4 = 654343494;
                }
                int i11 = $10 + 35;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                cArr2 = cArr4;
            }
            objArr[0] = new java.lang.String(cArr2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        public static void AEQbTJ(long j, long j2) throws java.lang.Throwable {
            int i = 2 % 2;
            long j3 = j ^ (j2 << 32);
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(false, 188, 7, 9, new char[]{6, '\t', 65530, 7, 2, '\b', 7, 65500, '\b'}, objArr);
            java.lang.Object obj = C44103sDl.class.getField((java.lang.String) objArr[0]).get(null);
            try {
                java.lang.reflect.Constructor declaredConstructor = java.lang.StringBuilder.class.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(true, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, 1, 30, new char[]{65510, 65497, '\n', 2, 0, 1, 11, 11, 0, 65506, '\n', 14, 14, 65511, '\n', 2, 4, 7, 2, 65471, 19, 17, 14, 15, 4, 65521, 3, 17, 0, 20}, objArr2);
                java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a(true, 190, 6, 6, new char[]{65531, 5, 65532, 7, 7, 65528}, objArr4);
                java.lang.reflect.Method method = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr4[0], java.lang.String.class);
                method.setAccessible(true);
                method.invoke(objNewInstance, objArr3);
                int i2 = EZpvd + 77;
                OLrzqt = i2 % 128;
                int i3 = i2 % 2;
                java.lang.Object[] objArr5 = {java.lang.Long.valueOf(j3)};
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                a(true, 190, 6, 6, new char[]{65531, 5, 65532, 7, 7, 65528}, objArr6);
                java.lang.reflect.Method method2 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr6[0], java.lang.Long.TYPE);
                method2.setAccessible(true);
                method2.invoke(objNewInstance, objArr5);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                a(true, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384, 1, 22, new char[]{65504, 14, 1, 3, 65533, '\n', 65533, 65513, 3, 11, '\b', 65533, 5, 65504, '\n', 11, 5, 16, 65535, 1, 16, 1}, objArr7);
                java.lang.String str = (java.lang.String) objArr7[0];
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b(0, 8, (char) 3238, objArr8);
                java.lang.reflect.Method method3 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr8[0], null);
                method3.setAccessible(true);
                java.lang.Object objInvoke = method3.invoke(objNewInstance, null);
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a(true, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 2, 3, new char[]{6, 0, 65530}, objArr9);
                java.lang.String str2 = (java.lang.String) objArr9[0];
                int i4 = OLrzqt + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                EZpvd = i4 % 128;
                int i5 = i4 % 2;
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                b(8, 21, (char) 46816, objArr10);
                java.lang.reflect.Method method4 = Intrinsics.class.getMethod((java.lang.String) objArr10[0], java.lang.Object.class, java.lang.String.class);
                method4.setAccessible(true);
                method4.invoke(null, objInvoke, str2);
                if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                    java.lang.Object[] objArr11 = new java.lang.Object[1];
                    b(29, 23, (char) 3952, objArr11);
                    java.lang.Object[] objArr12 = {((java.lang.String) objArr11[0]).toString()};
                    java.lang.reflect.Constructor declaredConstructor2 = java.lang.IllegalStateException.class.getDeclaredConstructor(java.lang.String.class);
                    declaredConstructor2.setAccessible(true);
                    throw ((java.lang.Throwable) declaredConstructor2.newInstance(objArr12));
                }
                java.lang.Object obj2 = pUU.class.getField("copydefault").get(null);
                int i6 = OLrzqt + 57;
                EZpvd = i6 % 128;
                int i7 = i6 % 2;
                java.lang.reflect.Method method5 = Intrinsics.class.getMethod("copydefault", java.lang.Object.class);
                method5.setAccessible(true);
                method5.invoke(null, obj2);
                int i8 = OLrzqt + 91;
                EZpvd = i8 % 128;
                int i9 = i8 % 2;
                java.lang.Object[] objArr13 = {str, objInvoke};
                java.lang.reflect.Method method6 = pUP.class.getMethod("OLrzqt", java.lang.String.class, java.lang.String.class);
                method6.setAccessible(true);
                method6.invoke(obj2, objArr13);
                byte[] bArr = $$a;
                byte b = bArr[6];
                byte b2 = b;
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                c(b2, (byte) (-b2), b, objArr14);
                java.lang.reflect.Method method7 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr14[0], null);
                method7.setAccessible(true);
                java.lang.Object objInvoke2 = method7.invoke(obj, null);
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                a(true, 188, 19, 19, new char[]{65533, 65534, 4, '\b', '\b', 65505, 7, '\b', 2, '\r', 65530, 65532, 2, 5, '\t', '\t', 65498, '\f', 2}, objArr15);
                DetectionInfoBean.class.getField((java.lang.String) objArr15[0]).setBoolean(objInvoke2, true);
                int i10 = EZpvd + 93;
                int i11 = i10 % 128;
                OLrzqt = i11;
                int i12 = i10 % 2;
                int i13 = i11 + 39;
                EZpvd = i13 % 128;
                if (i13 % 2 == 0) {
                    byte b3 = bArr[6];
                    byte b4 = b3;
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    c(b4, (byte) (-b4), b3, objArr16);
                    java.lang.reflect.Method method8 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr16[0], null);
                    method8.setAccessible(false);
                    java.lang.Object objInvoke3 = method8.invoke(obj, null);
                    java.lang.Long lValueOf = java.lang.Long.valueOf(j3);
                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                    b(19, 69, (char) 0, objArr17);
                    DetectionInfoBean.class.getField((java.lang.String) objArr17[0]).set(objInvoke3, lValueOf);
                } else {
                    byte b5 = bArr[6];
                    byte b6 = b5;
                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                    c(b6, (byte) (-b6), b5, objArr18);
                    java.lang.reflect.Method method9 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr18[0], null);
                    method9.setAccessible(true);
                    java.lang.Object objInvoke4 = method9.invoke(obj, null);
                    java.lang.Long lValueOf2 = java.lang.Long.valueOf(j3);
                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                    b(52, 9, (char) 0, objArr19);
                    DetectionInfoBean.class.getField((java.lang.String) objArr19[0]).set(objInvoke4, lValueOf2);
                }
                byte b7 = bArr[13];
                byte b8 = b7;
                java.lang.Object[] objArr20 = new java.lang.Object[1];
                c(b8, (byte) (b8 | 9), b7, objArr20);
                java.lang.reflect.Method method10 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr20[0], null);
                method10.setAccessible(true);
                method10.invoke(obj, null);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SetRiskConfigurationResponse(");
        sb.append("riskConfiguration=" + this.AEQbTJ);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        ResourcesManager resourcesManager = this.AEQbTJ;
        if (resourcesManager != null) {
            return resourcesManager.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && StatusBarManager.class == obj.getClass() && Intrinsics.EZpvd(this.AEQbTJ, ((StatusBarManager) obj).AEQbTJ);
    }

    public static /* synthetic */ StatusBarManager copy$default(StatusBarManager statusBarManager, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.SetRiskConfigurationResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull StatusBarManager.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(StatusBarManager.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(statusBarManager);
        function1.invoke(activity);
        return activity.copydefault();
    }

    public static final class Activity {
        public ResourcesManager OLrzqt;

        public final Activity AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ResourcesManager EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(ResourcesManager resourcesManager) {
            this.OLrzqt = resourcesManager;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull StatusBarManager statusBarManager) {
            this();
            Intrinsics.checkNotNullParameter(statusBarManager, "");
            this.OLrzqt = statusBarManager.AEQbTJ();
        }

        public final StatusBarManager copydefault() {
            return new StatusBarManager(this, null);
        }
    }
}
