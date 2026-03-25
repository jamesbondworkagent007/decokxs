package aws.sdk.kotlin.services.comprehend.serde;

import com.bytedance.applog.encryptor.IEncryptorType;
import com.google.common.base.Ascii;
import com.okinc.base.bugreport.DetectionInfoBean;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import o.ApplicationConfig;
import o.C44103sDl;
import o.YY;
import o.Ze;
import o.Zl;
import o.pUP;
import o.pUU;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes21.dex */
public final class CreateEndpointOperationDeserializer$deserialize$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ ApplicationConfig this$0;
    private static final byte[] $$c = {112, 83, 127, 40};
    private static final int $$d = 57;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {94, -113, -19, 84, 4, -7, 1, -29, -7, -7, -13, Ascii.FF, -17, 0, -11, Ascii.RS, 0, -17, -5};
    private static final int $$b = CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384;
    private static int gEmmrt = 0;
    private static int djBIcL = 1;
    private static int copydefault = 1694165036;
    private static char[] OLrzqt = {62854, 62952, 62972, 62955, 62969, 62859, 62968, 62957, 62958, 62953, 62909, 62970, 62949, 62946, 62874, 62945, 62971, 62867, 62873, 62948, 62959, 62950, 62848, 62858, 62944, 62954};
    private static int KWHzl = 585626973;
    private static boolean EZpvd = true;
    private static boolean AEQbTJ = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$e(byte b, byte b2, short s) {
        int i;
        int i2 = 116 - b;
        byte[] bArr = $$c;
        int i3 = s * 4;
        int i4 = (b2 * 4) + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i5 = i4;
            int i6 = 0;
            i2 += i4;
            i4 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i3) {
                return new String(bArr2, 0);
            }
            i5 = i4;
            i4 = bArr[i4];
            i2 += i4;
            i4 = i5 + 1;
            i = i6;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i3) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateEndpointOperationDeserializer$deserialize$1(ApplicationConfig applicationConfig, Continuation<? super CreateEndpointOperationDeserializer$deserialize$1> continuation) {
        super(continuation);
        this.this$0 = applicationConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, int i, short s2, Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = (i * 10) + 4;
        int i4 = s2 * 5;
        int i5 = 99 - (s * 20);
        byte[] bArr2 = new byte[11 - i4];
        int i6 = 10 - i4;
        if (bArr == 0) {
            int i7 = i6;
            i2 = 0;
            i5 = i5 + i7 + 8;
            i3++;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i3];
            i5 = i5 + i7 + 8;
            i3++;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        int i = 2 % 2;
        int i2 = djBIcL + 125;
        gEmmrt = i2 % 128;
        int i3 = i2 % 2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objAEQbTJ = this.this$0.AEQbTJ(null, null, this);
        int i4 = gEmmrt + 65;
        djBIcL = i4 % 128;
        int i5 = i4 % 2;
        return objAEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [122=6] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(boolean z, int i, int i2, int i3, char[] cArr, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        Zl zl = new Zl();
        char[] cArr2 = new char[i3];
        zl.OLrzqt = 0;
        int i5 = $11 + 63;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (zl.OLrzqt < i3) {
            int i7 = $10 + 73;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            zl.KWHzl = cArr[zl.OLrzqt];
            cArr2[zl.OLrzqt] = (char) (i + zl.KWHzl);
            int i9 = zl.OLrzqt;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(copydefault)};
                Object objEZpvd = YY.EZpvd(1433686791);
                if (objEZpvd == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objEZpvd = YY.EZpvd(625, 5, (char) 0, 1364500091, false, $$e(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objEZpvd).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {zl, zl};
                Object objEZpvd2 = YY.EZpvd(654343494);
                if (objEZpvd2 == null) {
                    byte b3 = (byte) ($$d & 7);
                    byte b4 = (byte) (b3 - 1);
                    objEZpvd2 = YY.EZpvd(625, 5, (char) 0, 589344826, false, $$e(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objEZpvd2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            zl.AEQbTJ = i2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - zl.AEQbTJ, zl.AEQbTJ);
            System.arraycopy(cArr3, zl.AEQbTJ, cArr2, 0, i3 - zl.AEQbTJ);
            int i10 = $11 + 121;
            $10 = i10 % 128;
            int i11 = i10 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i3];
            zl.OLrzqt = 0;
            while (zl.OLrzqt < i3) {
                int i12 = $10 + 33;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    cArr4[zl.OLrzqt] = cArr2[zl.OLrzqt + i3];
                    Object[] objArr4 = {zl, zl};
                    Object objEZpvd3 = YY.EZpvd(654343494);
                    if (objEZpvd3 == null) {
                        byte b5 = (byte) ($$d & 7);
                        byte b6 = (byte) (b5 - 1);
                        objEZpvd3 = YY.EZpvd(625, 5, (char) 0, 589344826, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objEZpvd3).invoke(null, objArr4);
                } else {
                    cArr4[zl.OLrzqt] = cArr2[(i3 - zl.OLrzqt) - 1];
                    try {
                        Object[] objArr5 = {zl, zl};
                        Object objEZpvd4 = YY.EZpvd(654343494);
                        if (objEZpvd4 == null) {
                            byte b7 = (byte) ($$d & 7);
                            byte b8 = (byte) (b7 - 1);
                            objEZpvd4 = YY.EZpvd(625, 5, (char) 0, 589344826, false, $$e(b7, b8, b8), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objEZpvd4).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [165=5, 172=4] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void b(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        Ze ze = new Ze();
        char[] cArr2 = OLrzqt;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            loop0: while (true) {
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = $11 + 99;
                    $10 = i5 % 128;
                    if (i5 % 2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                            Object objEZpvd = YY.EZpvd(-855574269);
                            if (objEZpvd == null) {
                                objEZpvd = YY.EZpvd(1075, 5, (char) 0, -920636289, false, IEncryptorType.DEFAULT_ENCRYPTOR, new Class[]{Integer.TYPE});
                            }
                            cArr3[i4] = ((Character) ((Method) objEZpvd).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                        Object objEZpvd2 = YY.EZpvd(-855574269);
                        if (objEZpvd2 == null) {
                            objEZpvd2 = YY.EZpvd(1075, 5, (char) 0, -920636289, false, IEncryptorType.DEFAULT_ENCRYPTOR, new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objEZpvd2).invoke(null, objArr3)).charValue();
                    }
                }
                break loop0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(KWHzl)};
        Object objEZpvd3 = YY.EZpvd(-1914793274);
        if (objEZpvd3 == null) {
            byte b = (byte) 0;
            objEZpvd3 = YY.EZpvd(496, 5, (char) 0, -1979818054, false, $$e((byte) ($$d & 87), b, b), new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objEZpvd3).invoke(null, objArr4)).intValue();
        int i6 = 15;
        int i7 = -1317980492;
        if (AEQbTJ) {
            ze.copydefault = bArr.length;
            char[] cArr4 = new char[ze.copydefault];
            ze.AEQbTJ = 0;
            while (ze.AEQbTJ < ze.copydefault) {
                cArr4[ze.AEQbTJ] = (char) (cArr2[bArr[(ze.copydefault - 1) - ze.AEQbTJ] + i] - iIntValue);
                Object[] objArr5 = {ze, ze};
                Object objEZpvd4 = YY.EZpvd(i7);
                if (objEZpvd4 == null) {
                    byte b2 = (byte) i6;
                    byte b3 = (byte) 0;
                    objEZpvd4 = YY.EZpvd(300, 21, (char) 0, -1252918328, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objEZpvd4).invoke(null, objArr5);
                i6 = 15;
                i7 = -1317980492;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!EZpvd) {
            ze.copydefault = iArr.length;
            char[] cArr5 = new char[ze.copydefault];
            ze.AEQbTJ = 0;
            while (ze.AEQbTJ < ze.copydefault) {
                int i8 = $11 + 17;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr5[ze.AEQbTJ] = (char) (cArr2[iArr[ze.copydefault >> ze.AEQbTJ] >> i] << iIntValue);
                    i2 = ze.AEQbTJ % 0;
                } else {
                    cArr5[ze.AEQbTJ] = (char) (cArr2[iArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - iIntValue);
                    i2 = ze.AEQbTJ + 1;
                }
                ze.AEQbTJ = i2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        ze.copydefault = cArr.length;
        char[] cArr6 = new char[ze.copydefault];
        ze.AEQbTJ = 0;
        while (ze.AEQbTJ < ze.copydefault) {
            cArr6[ze.AEQbTJ] = (char) (cArr2[cArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - iIntValue);
            Object[] objArr6 = {ze, ze};
            Object objEZpvd5 = YY.EZpvd(-1317980492);
            if (objEZpvd5 == null) {
                byte b4 = (byte) 0;
                objEZpvd5 = YY.EZpvd(300, 21, (char) 0, -1252918328, false, $$e((byte) 15, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objEZpvd5).invoke(null, objArr6);
        }
        String str = new String(cArr6);
        int i9 = $11 + 49;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static void EZpvd(long j, long j2) throws Throwable {
        int i = 2 % 2;
        long j3 = j ^ (j2 << 32);
        Object[] objArr = new Object[1];
        a(false, CipherSuite.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, 2, 9, new char[]{'\b', 7, 65500, '\b', 6, '\t', 65530, 7, 2}, objArr);
        Object obj = C44103sDl.class.getField((String) objArr[0]).get(null);
        try {
            Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            Object objNewInstance = declaredConstructor.newInstance(null);
            Object[] objArr2 = new Object[1];
            b(null, null, 127, new byte[]{-110, -114, -116, -125, -111, -112, -112, -125, -113, -118, -119, -119, -122, -114, -116, -121, -115, -116, -117, -118, -124, -119, -120, -121, -122, -123, -124, -125, -126, -127}, objArr2);
            String str = (String) objArr2[0];
            int i2 = djBIcL + 105;
            gEmmrt = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr3 = new Object[1];
            a(true, CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256, 6, 6, new char[]{65531, 5, 65532, 7, 7, 65528}, objArr3);
            Method method = StringBuilder.class.getMethod((String) objArr3[0], String.class);
            method.setAccessible(true);
            method.invoke(objNewInstance, str);
            Object[] objArr4 = {Long.valueOf(j3)};
            Object[] objArr5 = new Object[1];
            a(true, CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256, 6, 6, new char[]{65531, 5, 65532, 7, 7, 65528}, objArr5);
            Method method2 = StringBuilder.class.getMethod((String) objArr5[0], Long.TYPE);
            method2.setAccessible(true);
            method2.invoke(objNewInstance, objArr4);
            Object[] objArr6 = new Object[1];
            b(null, null, 127, new byte[]{-124, -121, -106, -125, -107, -125, -105, -106, -119, -112, -125, -108, -109, -107, -119, -108, -118, -116, -121, -118, -121, -109}, objArr6);
            String str2 = (String) objArr6[0];
            Object[] objArr7 = new Object[1];
            b(null, null, 127, new byte[]{-106, -107, -108, -124, -118, -104, -119, -118}, objArr7);
            Method method3 = StringBuilder.class.getMethod((String) objArr7[0], null);
            method3.setAccessible(true);
            Object objInvoke = method3.invoke(objNewInstance, null);
            Object[] objArr8 = new Object[1];
            b(null, null, 127, new byte[]{-106, -102, -103}, objArr8);
            String str3 = (String) objArr8[0];
            int i4 = djBIcL + 51;
            gEmmrt = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr9 = new Object[1];
            a(false, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, 4, 21, new char[]{65535, 14, 65535, '\f', 65533, 2, 65535, 65533, 5, 65512, '\t', 14, 65512, 15, 6, 6, 65514, 65531, '\f', 65531, 7}, objArr9);
            Method method4 = Intrinsics.class.getMethod((String) objArr9[0], Object.class, String.class);
            method4.setAccessible(true);
            method4.invoke(null, objInvoke, str3);
            if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                Object[] objArr10 = new Object[1];
                a(false, 150, 10, 23, new char[]{'\n', 15, '\n', 21, '\n', 2, '\r', '\n', 27, 6, 65520, '\f', 65517, 16, '\b', 65473, '\n', 20, 65473, 15, 16, 21, 65473}, objArr10);
                String str4 = (String) objArr10[0];
                Object[] objArr11 = new Object[1];
                b(null, null, 127, new byte[]{-106, -107, -108, -124, -118, -104, -119, -118}, objArr11);
                Method method5 = Object.class.getMethod((String) objArr11[0], null);
                method5.setAccessible(true);
                Object[] objArr12 = {method5.invoke(str4, null)};
                Constructor declaredConstructor2 = IllegalStateException.class.getDeclaredConstructor(String.class);
                declaredConstructor2.setAccessible(true);
                throw ((Throwable) declaredConstructor2.newInstance(objArr12));
            }
            Object obj2 = pUU.class.getField("copydefault").get(null);
            int i6 = djBIcL + 7;
            gEmmrt = i6 % 128;
            int i7 = i6 % 2;
            Method method6 = Intrinsics.class.getMethod("copydefault", Object.class);
            method6.setAccessible(true);
            method6.invoke(null, obj2);
            int i8 = djBIcL + 99;
            gEmmrt = i8 % 128;
            if (i8 % 2 != 0) {
                Object[] objArr13 = {objInvoke, str2};
                Method method7 = pUP.class.getMethod("OLrzqt", String.class, String.class);
                method7.setAccessible(true);
                method7.invoke(obj2, objArr13);
            } else {
                Object[] objArr14 = {str2, objInvoke};
                Method method8 = pUP.class.getMethod("OLrzqt", String.class, String.class);
                method8.setAccessible(true);
                method8.invoke(obj2, objArr14);
            }
            byte[] bArr = $$a;
            byte b = bArr[13];
            byte b2 = b;
            Object[] objArr15 = new Object[1];
            c(b, b2, b2, objArr15);
            Method method9 = C44103sDl.ActionBar.class.getMethod((String) objArr15[0], null);
            method9.setAccessible(true);
            Object objInvoke2 = method9.invoke(obj, null);
            Object[] objArr16 = new Object[1];
            a(false, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, 4, 14, new char[]{'\t', 14, 65535, 65534, 3, '\r', 65502, 65535, 16, 3, 65533, 65535, 65516, '\t'}, objArr16);
            DetectionInfoBean.class.getField((String) objArr16[0]).setBoolean(objInvoke2, true);
            int i9 = gEmmrt + 71;
            djBIcL = i9 % 128;
            if (i9 % 2 == 0) {
                byte b3 = bArr[13];
                byte b4 = b3;
                Object[] objArr17 = new Object[1];
                c(b3, b4, b4, objArr17);
                Method method10 = C44103sDl.ActionBar.class.getMethod((String) objArr17[0], null);
                method10.setAccessible(true);
                Object objInvoke3 = method10.invoke(obj, null);
                Long lValueOf = Long.valueOf(j3);
                Object[] objArr18 = new Object[1];
                a(false, 27450, 1, 87, new char[]{65535, '\n', 1, '\t', 65508, 2, 16, 65533, 0}, objArr18);
                DetectionInfoBean.class.getField((String) objArr18[0]).set(objInvoke3, lValueOf);
            } else {
                byte b5 = bArr[13];
                byte b6 = b5;
                Object[] objArr19 = new Object[1];
                c(b5, b6, b6, objArr19);
                Method method11 = C44103sDl.ActionBar.class.getMethod((String) objArr19[0], null);
                method11.setAccessible(true);
                Object objInvoke4 = method11.invoke(obj, null);
                Long lValueOf2 = Long.valueOf(j3);
                Object[] objArr20 = new Object[1];
                a(true, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256, 1, 9, new char[]{65535, '\n', 1, '\t', 65508, 2, 16, 65533, 0}, objArr20);
                DetectionInfoBean.class.getField((String) objArr20[0]).set(objInvoke4, lValueOf2);
            }
            int i10 = gEmmrt + 49;
            djBIcL = i10 % 128;
            int i11 = i10 % 2;
            byte b7 = bArr[6];
            byte b8 = b7;
            Object[] objArr21 = new Object[1];
            c(b7, b8, b8, objArr21);
            Method method12 = C44103sDl.ActionBar.class.getMethod((String) objArr21[0], null);
            method12.setAccessible(true);
            method12.invoke(obj, null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
