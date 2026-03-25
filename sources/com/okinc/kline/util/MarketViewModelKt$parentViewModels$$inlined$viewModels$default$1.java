package com.okinc.kline.util;

import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.google.common.base.Ascii;
import com.okinc.base.bugreport.DetectionInfoBean;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.C44103sDl;
import o.YY;
import o.Ze;
import o.Zi;
import o.pUP;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class MarketViewModelKt$parentViewModels$$inlined$viewModels$default$1 extends Lambda implements Function0<ViewModelStoreOwner> {
    final /* synthetic */ Function0 $ownerProducer;
    private static final byte[] $$c = {76, Ascii.SYN, Ascii.SO, Ascii.RS};
    private static final int $$d = 6;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {10, -109, 37, Ascii.GS, -4, 7, -1, Ascii.GS, 7, 7, Ascii.CR, -12, 17, 0, Ascii.VT, -30, 0, 17, 5};
    private static final int $$b = 38;
    private static int djBIcL = 0;
    private static int AYXKKw = 1;
    private static char[] AEQbTJ = {62847, 62787, 62789, 62786, 62801, 62788, 62809, 62799, 62811, 62816, 62797, 62841, 62828, 62784, 62798, 62790, 62845, 62796, 62813, 62814, 62800, 62812};
    private static int KWHzl = 585626930;
    private static boolean copydefault = true;
    private static boolean OLrzqt = true;
    private static long EZpvd = -8425678431028079434L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$e(short s, short s2, byte b) {
        int i;
        int i2;
        int i3 = (s2 * 3) + 1;
        int i4 = 4 - (b * 3);
        byte[] bArr = $$c;
        int i5 = 101 - s;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i3;
            int i7 = i4;
            i2 = 0;
            i4++;
            i5 = i7 + (-i6);
            i = i2;
            int i8 = i4;
            int i9 = i5;
            i2 = i + 1;
            bArr2[i] = (byte) i9;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i8];
            i4 = i8;
            i7 = i9;
            i4++;
            i5 = i7 + (-i6);
            i = i2;
            int i82 = i4;
            int i92 = i5;
            i2 = i + 1;
            bArr2[i] = (byte) i92;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            int i822 = i4;
            int i922 = i5;
            i2 = i + 1;
            bArr2[i] = (byte) i922;
            if (i2 == i3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketViewModelKt$parentViewModels$$inlined$viewModels$default$1(Function0 function0) {
        super(0);
        this.$ownerProducer = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, int i2, byte b, Object[] objArr) {
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = 11 - (b * 5);
        int i6 = (i2 * 20) + 79;
        int i7 = (i * 10) + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            i7++;
            i6 = i8 + (-i6) + 8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = i6;
            i6 = bArr[i7];
            i7++;
            i6 = i8 + (-i6) + 8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [63=5] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        Throwable cause;
        int i3 = 2 % 2;
        Zi zi = new Zi();
        zi.OLrzqt = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        zi.AEQbTJ = 0;
        int i4 = $10 + 33;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (true) {
            i2 = 3;
            if (zi.AEQbTJ >= cArr.length) {
                break;
            }
            int i6 = $10 + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = zi.AEQbTJ;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[zi.AEQbTJ]), zi, zi};
                    Object objEZpvd = YY.EZpvd(-295504478);
                    if (objEZpvd == null) {
                        byte b = (byte) ($$d - 5);
                        byte b2 = (byte) (b - 1);
                        objEZpvd = YY.EZpvd(217, 4, (char) 0, -364758818, false, $$e(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i7] = ((Long) ((Method) objEZpvd).invoke(null, objArr2)).longValue() % (5439468278228498061L | EZpvd);
                    Object[] objArr3 = {zi, zi};
                    Object objEZpvd2 = YY.EZpvd(1444313200);
                    if (objEZpvd2 == null) {
                        byte b3 = (byte) ($$d - 3);
                        byte b4 = (byte) (b3 - 3);
                        objEZpvd2 = YY.EZpvd(615, 5, (char) 1207, 1379317004, false, $$e(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objEZpvd2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                int i8 = zi.AEQbTJ;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[zi.AEQbTJ]), zi, zi};
                    Object objEZpvd3 = YY.EZpvd(-295504478);
                    if (objEZpvd3 == null) {
                        byte b5 = (byte) ($$d - 5);
                        byte b6 = (byte) (b5 - 1);
                        objEZpvd3 = YY.EZpvd(217, 4, (char) 0, -364758818, false, $$e(b5, b6, b6), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i8] = ((Long) ((Method) objEZpvd3).invoke(null, objArr4)).longValue() ^ (EZpvd ^ 5439468278228498061L);
                    Object[] objArr5 = {zi, zi};
                    Object objEZpvd4 = YY.EZpvd(1444313200);
                    if (objEZpvd4 == null) {
                        byte b7 = (byte) ($$d - 3);
                        byte b8 = (byte) (b7 - 3);
                        objEZpvd4 = YY.EZpvd(615, 5, (char) 1207, 1379317004, false, $$e(b7, b8, b8), new Class[]{Object.class, Object.class});
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
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        zi.AEQbTJ = 0;
        while (zi.AEQbTJ < cArr.length) {
            int i9 = $11 + 65;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr2[zi.AEQbTJ] = (char) jArr[zi.AEQbTJ];
            Object[] objArr6 = {zi, zi};
            Object objEZpvd5 = YY.EZpvd(1444313200);
            if (objEZpvd5 == null) {
                byte b9 = (byte) ($$d - i2);
                byte b10 = (byte) (b9 - 3);
                objEZpvd5 = YY.EZpvd(615, 5, (char) 1207, 1379317004, false, $$e(b9, b10, b10), new Class[]{Object.class, Object.class});
            }
            ((Method) objEZpvd5).invoke(null, objArr6);
            i2 = 3;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ViewModelStoreOwner invoke() {
        int i = 2 % 2;
        int i2 = AYXKKw + 101;
        djBIcL = i2 % 128;
        if (i2 % 2 == 0) {
            return (ViewModelStoreOwner) this.$ownerProducer.invoke();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ViewModelStoreOwner invoke() {
        int i = 2 % 2;
        int i2 = AYXKKw + 39;
        djBIcL = i2 % 128;
        int i3 = i2 % 2;
        ViewModelStoreOwner viewModelStoreOwnerInvoke = invoke();
        int i4 = djBIcL + 109;
        AYXKKw = i4 % 128;
        int i5 = i4 % 2;
        return viewModelStoreOwnerInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [172=6] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(int i, char[] cArr, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        Ze ze = new Ze();
        char[] cArr2 = AEQbTJ;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                int i4 = $10 + 59;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                        Object objEZpvd = YY.EZpvd(-855574269);
                        if (objEZpvd == null) {
                            objEZpvd = YY.EZpvd(1075, 5, (char) 0, -920636289, false, IEncryptorType.DEFAULT_ENCRYPTOR, new Class[]{Integer.TYPE});
                        }
                        cArr3[i3] = ((Character) ((Method) objEZpvd).invoke(null, objArr2)).charValue();
                        i3 /= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i3])};
                    Object objEZpvd2 = YY.EZpvd(-855574269);
                    if (objEZpvd2 == null) {
                        objEZpvd2 = YY.EZpvd(1075, 5, (char) 0, -920636289, false, IEncryptorType.DEFAULT_ENCRYPTOR, new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objEZpvd2).invoke(null, objArr3)).charValue();
                    i3++;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(KWHzl)};
        Object objEZpvd3 = YY.EZpvd(-1914793274);
        if (objEZpvd3 == null) {
            byte b = (byte) ($$d - 4);
            byte b2 = (byte) (b - 2);
            objEZpvd3 = YY.EZpvd(496, 5, (char) 0, -1979818054, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objEZpvd3).invoke(null, objArr4)).intValue();
        int i5 = -1317980492;
        if (OLrzqt) {
            ze.copydefault = bArr.length;
            char[] cArr4 = new char[ze.copydefault];
            ze.AEQbTJ = 0;
            while (ze.AEQbTJ < ze.copydefault) {
                int i6 = $11 + 7;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                cArr4[ze.AEQbTJ] = (char) (cArr2[bArr[(ze.copydefault - 1) - ze.AEQbTJ] + i] - iIntValue);
                Object[] objArr5 = {ze, ze};
                Object objEZpvd4 = YY.EZpvd(i5);
                if (objEZpvd4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objEZpvd4 = YY.EZpvd(300, 21, (char) 0, -1252918328, false, $$e(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objEZpvd4).invoke(null, objArr5);
                i5 = -1317980492;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!copydefault) {
            ze.copydefault = iArr.length;
            char[] cArr5 = new char[ze.copydefault];
            ze.AEQbTJ = 0;
            int i8 = $10 + 13;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            while (ze.AEQbTJ < ze.copydefault) {
                cArr5[ze.AEQbTJ] = (char) (cArr2[iArr[(ze.copydefault - 1) - ze.AEQbTJ] - i] - iIntValue);
                ze.AEQbTJ++;
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
                byte b5 = (byte) 0;
                byte b6 = b5;
                objEZpvd5 = YY.EZpvd(300, 21, (char) 0, -1252918328, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objEZpvd5).invoke(null, objArr6);
            int i10 = $11 + 3;
            $10 = i10 % 128;
            int i11 = i10 % 2;
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static void KWHzl(long j, long j2) throws Throwable {
        int i = 2 % 2;
        long j3 = j ^ (j2 << 32);
        Object[] objArr = new Object[1];
        a(127, null, null, new byte[]{-122, -126, -121, -122, -123, -124, -125, -126, -127}, objArr);
        Object obj = C44103sDl.class.getField((String) objArr[0]).get(null);
        try {
            Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            Object objNewInstance = declaredConstructor.newInstance(null);
            Object[] objArr2 = new Object[1];
            b(new char[]{8828, 42987, 10512, 45734, 13515, 48720, 896, 34248, 3964, 36996, 6717, 39948, 25060, 60210, 27992, 63219, 30720, 64920, 18376, 51574, 21163, 54471, 24180, 9092, 42246, 12104, 45199, 14901, 48197, 485, 35587, 3245, 38654, 6160, 40357, 26615, 59758, 29326, 62505, 32378, 50066, 17717, 53058, 20662}, 34213, objArr2);
            String str = (String) objArr2[0];
            int i2 = djBIcL + 35;
            AYXKKw = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr3 = new Object[1];
                objArr3[1] = str;
                Object[] objArr4 = new Object[1];
                b(new char[]{8794, 62954, 36105, 42173, 31953, 5242}, 55201, objArr4);
                String str2 = (String) objArr4[0];
                Class[] clsArr = new Class[0];
                clsArr[1] = String.class;
                Method method = StringBuilder.class.getMethod(str2, clsArr);
                method.setAccessible(false);
                method.invoke(objNewInstance, objArr3);
            } else {
                Object[] objArr5 = new Object[1];
                b(new char[]{8794, 62954, 36105, 42173, 31953, 5242}, 55201, objArr5);
                Method method2 = StringBuilder.class.getMethod((String) objArr5[0], String.class);
                method2.setAccessible(true);
                method2.invoke(objNewInstance, str);
            }
            Object[] objArr6 = {Long.valueOf(j3)};
            Object[] objArr7 = new Object[1];
            b(new char[]{8794, 62954, 36105, 42173, 31953, 5242}, 55201, objArr7);
            Method method3 = StringBuilder.class.getMethod((String) objArr7[0], Long.TYPE);
            method3.setAccessible(true);
            method3.invoke(objNewInstance, objArr6);
            Object[] objArr8 = new Object[1];
            b(new char[]{8831, 34453, 27609, 52287, 45428, 5560, 65168, 41945, 1037, 59740, 19900, 14051, 39891, 31771, 8518, 34195, 28394, 54062, 46108, 6477, 64898, 42734}, 42187, objArr8);
            String str3 = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            b(new char[]{8783, 28017, 48162, 53024, 7901, 43499, 63627, 2143}, 20261, objArr9);
            Method method4 = StringBuilder.class.getMethod((String) objArr9[0], null);
            method4.setAccessible(true);
            Object objInvoke = method4.invoke(objNewInstance, null);
            Object[] objArr10 = new Object[1];
            a(127, null, null, new byte[]{-119, -120, -125}, objArr10);
            Object[] objArr11 = {objInvoke, (String) objArr10[0]};
            Object[] objArr12 = new Object[1];
            b(new char[]{8792, 11146, 12780, 16339, 1332, 4936, 6466, 26272, 27837, 31471, 16429, 19972, 21575, 41567, 43927, 45549, 49094, 34103, 37645, 39237, 59069}, 2521, objArr12);
            Method method5 = Intrinsics.class.getMethod((String) objArr12[0], Object.class, String.class);
            method5.setAccessible(true);
            method5.invoke(null, objArr11);
            if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                Object[] objArr13 = new Object[1];
                b(new char[]{8820, 64121, 37413, 43567, 17144, 6870, 12964, 52055, 58195, 47908, 21454, 27532, 1015, 55367, 61547, 34869, 41183, 30955, 4280, 10588, 49510, 39196, 45528}, 55337, objArr13);
                String str4 = (String) objArr13[0];
                Object[] objArr14 = new Object[1];
                b(new char[]{8783, 28017, 48162, 53024, 7901, 43499, 63627, 2143}, 20261, objArr14);
                Method method6 = Object.class.getMethod((String) objArr14[0], null);
                method6.setAccessible(true);
                Object[] objArr15 = {method6.invoke(str4, null)};
                Constructor declaredConstructor2 = IllegalStateException.class.getDeclaredConstructor(String.class);
                declaredConstructor2.setAccessible(true);
                throw ((Throwable) declaredConstructor2.newInstance(objArr15));
            }
            int i3 = djBIcL + 101;
            int i4 = i3 % 128;
            AYXKKw = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 15;
            djBIcL = i6 % 128;
            int i7 = i6 % 2;
            Object obj2 = pUU.class.getField("copydefault").get(null);
            int i8 = AYXKKw + 59;
            djBIcL = i8 % 128;
            int i9 = i8 % 2;
            Method method7 = Intrinsics.class.getMethod("copydefault", Object.class);
            method7.setAccessible(true);
            method7.invoke(null, obj2);
            Object[] objArr16 = {str3, objInvoke};
            Method method8 = pUP.class.getMethod("OLrzqt", String.class, String.class);
            method8.setAccessible(true);
            method8.invoke(obj2, objArr16);
            int i10 = AYXKKw + 31;
            djBIcL = i10 % 128;
            if (i10 % 2 != 0) {
                byte[] bArr = $$a;
                byte b = bArr[13];
                Object[] objArr17 = new Object[1];
                c(b, (byte) (-bArr[6]), b, objArr17);
                Method method9 = C44103sDl.ActionBar.class.getMethod((String) objArr17[0], null);
                method9.setAccessible(true);
                Object objInvoke2 = method9.invoke(obj, null);
                Object[] objArr18 = new Object[1];
                a(61, null, null, new byte[]{-113, -122, -109, -125, -122, -126, -114, -121, -110, -122, -111, -112, -123, -117, -113, -114, -121, -115, -122, -116, -119, -122, -121, -122, -122, -117, -118, -120, -121}, objArr18);
                DetectionInfoBean.class.getField((String) objArr18[0]).setBoolean(objInvoke2, false);
            } else {
                byte[] bArr2 = $$a;
                byte b2 = bArr2[13];
                Object[] objArr19 = new Object[1];
                c(b2, (byte) (-bArr2[6]), b2, objArr19);
                Method method10 = C44103sDl.ActionBar.class.getMethod((String) objArr19[0], null);
                method10.setAccessible(true);
                Object objInvoke3 = method10.invoke(obj, null);
                Object[] objArr20 = new Object[1];
                a(127, null, null, new byte[]{-113, -122, -109, -125, -122, -126, -114, -121, -110, -122, -111, -112, -123, -117, -113, -114, -121, -115, -122, -116, -119, -122, -121, -122, -122, -117, -118, -120, -121}, objArr20);
                DetectionInfoBean.class.getField((String) objArr20[0]).setBoolean(objInvoke3, true);
            }
            byte[] bArr3 = $$a;
            byte b3 = bArr3[13];
            Object[] objArr21 = new Object[1];
            c(b3, (byte) (-bArr3[6]), b3, objArr21);
            Method method11 = C44103sDl.ActionBar.class.getMethod((String) objArr21[0], null);
            method11.setAccessible(true);
            Object objInvoke4 = method11.invoke(obj, null);
            Long lValueOf = Long.valueOf(j3);
            Object[] objArr22 = new Object[1];
            a(127, null, null, new byte[]{-126, -106, -122, -116, -119, -117, -107, -109, -108}, objArr22);
            DetectionInfoBean.class.getField((String) objArr22[0]).set(objInvoke4, lValueOf);
            int i11 = AYXKKw + 105;
            djBIcL = i11 % 128;
            int i12 = i11 % 2;
            byte b4 = bArr3[6];
            Object[] objArr23 = new Object[1];
            c((byte) (-b4), bArr3[13], (byte) (-b4), objArr23);
            Method method12 = C44103sDl.ActionBar.class.getMethod((String) objArr23[0], null);
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
