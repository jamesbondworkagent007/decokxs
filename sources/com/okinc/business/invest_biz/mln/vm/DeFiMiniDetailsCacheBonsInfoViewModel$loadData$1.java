package com.okinc.business.invest_biz.mln.vm;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.base.Ascii;
import com.okinc.base.bugreport.DetectionInfoBean;
import com.okinc.business.invest_biz.data.bean.InvestmentBonusInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C23931iOq;
import o.C44103sDl;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC26500jdW;
import o.YY;
import o.Zh;
import o.Zn;
import o.pUP;
import o.pUU;
import org.spongycastle.crypto.tls.AlertDescription;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiMiniDetailsCacheBonsInfoViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $investmentId;
    int label;
    final /* synthetic */ DeFiMiniDetailsCacheBonsInfoViewModel this$0;
    private static final byte[] $$c = {7, -78, 44, 117};
    private static final int $$d = 101;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {112, 83, 127, 40, -4, 7, -1, Ascii.GS, 7, 7, Ascii.CR, -12, 17, 0, Ascii.VT, -30, 0, 17, 5};
    private static final int $$b = 72;
    private static int djBIcL = 0;
    private static int AhwBna = 1;
    private static char KWHzl = 28772;
    private static char OLrzqt = 43781;
    private static char copydefault = 40740;
    private static char EZpvd = 21923;
    private static char[] AEQbTJ = {45459, 23470, 26027, 3979, 6540, 9165, 52715, 55245, 57795, 35617, 38198, 48977, 18691, 21375, 32099, 1878, 4431, 15203, 50357, 61094, 63635, 33452, 44287, 46817, 16592, 27329, 29747, 7714, 10267, 12893, 62302, 6464, 10065, 19831, 23405, 24848, 3314, 59110, 55499, 45791, 42184, 40612, 28850, 27272, 3301, 59105, 55549, 45768, 42193, 40579, 28851, 27291, 23728, 13940, 10364, 591, 62562, 60964, 49190, 47622, 44059, 34332, 31228, 21502, 17880, 3273, 59106, 55508, 45764, 42205, 40685, 28853, 27292, 23774, 13935, 10367, 599, 62482, 60972, 49210, 47630, 44034, 34320, 31209, 21495, 17859, 16327, 4521, 3311, 59130, 55513, 45787, 42186, 40609, 28853, 27276, 23711, 13941, 10361, 588, 62556, 60941, 49211, 47624, 44061, 34332, 31212};
    private static long AYXKKw = -1427433693515684215L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$e(short s, short s2, byte b) {
        int i;
        byte[] bArr = $$c;
        int i2 = s + AlertDescription.unrecognized_name;
        int i3 = s2 * 2;
        int i4 = 4 - (b * 3);
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            i2 = (-i2) + i4;
            i4 = i6 + 1;
            i = i7;
            bArr2[i] = (byte) i2;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i4];
            int i8 = i4;
            i4 = i2;
            i2 = b2;
            i7 = i + 1;
            i6 = i8;
            i2 = (-i2) + i4;
            i4 = i6 + 1;
            i = i7;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiMiniDetailsCacheBonsInfoViewModel$loadData$1(DeFiMiniDetailsCacheBonsInfoViewModel deFiMiniDetailsCacheBonsInfoViewModel, long j, Continuation<? super DeFiMiniDetailsCacheBonsInfoViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = deFiMiniDetailsCacheBonsInfoViewModel;
        this.$investmentId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:10:0x0032) to fix multi-entry loop: BACK_EDGE: B:9:0x0029 -> B:10:0x0032 */
    private static void c(int i, byte b, byte b2, Object[] objArr) {
        int i2 = 13 - (b * 10);
        int i3 = i * 5;
        int i4 = (b2 * 20) + 79;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3 + 6];
        int i5 = i3 + 5;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i4 = i5 + (-i2) + 8;
            i2 = i2;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i2 + 1;
            i6 = i7;
            i4 = i4 + (-bArr[i8]) + 8;
            i2 = i8;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        int i = 2 % 2;
        DeFiMiniDetailsCacheBonsInfoViewModel$loadData$1 deFiMiniDetailsCacheBonsInfoViewModel$loadData$1 = new DeFiMiniDetailsCacheBonsInfoViewModel$loadData$1(this.this$0, this.$investmentId, continuation);
        int i2 = djBIcL + 57;
        AhwBna = i2 % 128;
        int i3 = i2 % 2;
        return deFiMiniDetailsCacheBonsInfoViewModel$loadData$1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
        int i = 2 % 2;
        int i2 = djBIcL + 45;
        AhwBna = i2 % 128;
        int i3 = i2 % 2;
        Object objInvoke2 = invoke2(coroutineScope, continuation);
        int i4 = djBIcL + 19;
        AhwBna = i4 % 128;
        if (i4 % 2 != 0) {
            return objInvoke2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
        int i = 2 % 2;
        int i2 = AhwBna + 37;
        djBIcL = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((DeFiMiniDetailsCacheBonsInfoViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        if (i3 != 0) {
            int i4 = 12 / 0;
        }
        int i5 = AhwBna + 11;
        djBIcL = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 89 / 0;
        }
        return objInvokeSuspend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        int i = 2 % 2;
        int i2 = djBIcL + 45;
        AhwBna = i2 % 128;
        if (i2 % 2 == 0) {
            C56442yFn.copydefault();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = this.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            C23931iOq c23931iOq = this.this$0.AEQbTJ;
            long j = this.$investmentId;
            this.label = 1;
            objEZpvd = c23931iOq.EZpvd(j, this);
            if (objEZpvd == objCopydefault) {
                int i4 = AhwBna + 75;
                int i5 = i4 % 128;
                djBIcL = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 125;
                AhwBna = i7 % 128;
                int i8 = i7 % 2;
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i9 = AhwBna + 41;
            djBIcL = i9 % 128;
            int i10 = i9 % 2;
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        DeFiMiniDetailsCacheBonsInfoViewModel deFiMiniDetailsCacheBonsInfoViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            deFiMiniDetailsCacheBonsInfoViewModel.OLrzqt().setValue(new InterfaceC26500jdW.StateListAnimator(deFiMiniDetailsCacheBonsInfoViewModel.OLrzqt.KWHzl((InvestmentBonusInfo) objEZpvd)));
        }
        DeFiMiniDetailsCacheBonsInfoViewModel deFiMiniDetailsCacheBonsInfoViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
            int i11 = djBIcL + 59;
            AhwBna = i11 % 128;
            int i12 = i11 % 2;
            deFiMiniDetailsCacheBonsInfoViewModel2.OLrzqt().setValue(InterfaceC26500jdW.TaskDescription.OLrzqt);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [99=4] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3;
        Throwable cause;
        int i4 = 2 % 2;
        Zn zn = new Zn();
        long[] jArr = new long[i2];
        zn.EZpvd = 0;
        while (true) {
            i3 = 3;
            if (zn.EZpvd >= i2) {
                break;
            }
            int i5 = $10 + 33;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = zn.EZpvd;
                try {
                    Object[] objArr2 = {Integer.valueOf(AEQbTJ[i << i6])};
                    Object objEZpvd = YY.EZpvd(927695670);
                    if (objEZpvd == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objEZpvd = YY.EZpvd(217, 4, (char) 0, 862670410, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objEZpvd).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(AYXKKw), Integer.valueOf(c)};
                    Object objEZpvd2 = YY.EZpvd(-297691357);
                    if (objEZpvd2 == null) {
                        byte b3 = (byte) 2;
                        byte b4 = (byte) (b3 - 2);
                        objEZpvd2 = YY.EZpvd(TypedValues.CycleType.TYPE_WAVE_PERIOD, 5, (char) 0, -362718625, false, $$e(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objEZpvd2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {zn, zn};
                    Object objEZpvd3 = YY.EZpvd(1191971121);
                    if (objEZpvd3 == null) {
                        byte b5 = (byte) ($$d & 3);
                        byte b6 = (byte) (b5 - 1);
                        objEZpvd3 = YY.EZpvd(226, 4, (char) 0, 1127007309, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objEZpvd3).invoke(null, objArr4);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                int i7 = zn.EZpvd;
                Object[] objArr5 = {Integer.valueOf(AEQbTJ[i + i7])};
                Object objEZpvd4 = YY.EZpvd(927695670);
                if (objEZpvd4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objEZpvd4 = YY.EZpvd(217, 4, (char) 0, 862670410, false, $$e(b7, b8, b8), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objEZpvd4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(AYXKKw), Integer.valueOf(c)};
                Object objEZpvd5 = YY.EZpvd(-297691357);
                if (objEZpvd5 == null) {
                    byte b9 = (byte) 2;
                    byte b10 = (byte) (b9 - 2);
                    objEZpvd5 = YY.EZpvd(TypedValues.CycleType.TYPE_WAVE_PERIOD, 5, (char) 0, -362718625, false, $$e(b9, b10, b10), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objEZpvd5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {zn, zn};
                Object objEZpvd6 = YY.EZpvd(1191971121);
                if (objEZpvd6 == null) {
                    byte b11 = (byte) ($$d & 3);
                    byte b12 = (byte) (b11 - 1);
                    objEZpvd6 = YY.EZpvd(226, 4, (char) 0, 1127007309, false, $$e(b11, b12, b12), new Class[]{Object.class, Object.class});
                }
                ((Method) objEZpvd6).invoke(null, objArr7);
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        zn.EZpvd = 0;
        while (zn.EZpvd < i2) {
            cArr[zn.EZpvd] = (char) jArr[zn.EZpvd];
            Object[] objArr8 = {zn, zn};
            Object objEZpvd7 = YY.EZpvd(1191971121);
            if (objEZpvd7 == null) {
                byte b13 = (byte) ($$d & i3);
                byte b14 = (byte) (b13 - 1);
                objEZpvd7 = YY.EZpvd(226, 4, (char) 0, 1127007309, false, $$e(b13, b14, b14), new Class[]{Object.class, Object.class});
            }
            ((Method) objEZpvd7).invoke(null, objArr8);
            int i8 = $11 + 5;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            i3 = 3;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [111=4] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        Zh zh = new Zh();
        char[] cArr2 = new char[cArr.length];
        zh.EZpvd = 0;
        char[] cArr3 = new char[2];
        while (zh.EZpvd < cArr.length) {
            cArr3[0] = cArr[zh.EZpvd];
            cArr3[1] = cArr[zh.EZpvd + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                int i5 = $10 + 85;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i3) ^ ((c2 << 4) + ((char) (((long) copydefault) ^ 6538634990023091910L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(EZpvd)};
                    Object objEZpvd = YY.EZpvd(-2045992360);
                    if (objEZpvd == null) {
                        byte b = (byte) 0;
                        objEZpvd = YY.EZpvd(501, 5, (char) 0, -2111017180, false, $$e((byte) ($$c[0] - 1), b, b), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objEZpvd).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) KWHzl) ^ 6538634990023091910L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(OLrzqt)};
                    Object objEZpvd2 = YY.EZpvd(-2045992360);
                    if (objEZpvd2 == null) {
                        byte b2 = (byte) 0;
                        objEZpvd2 = YY.EZpvd(501, 5, (char) 0, -2111017180, false, $$e((byte) ($$c[0] - 1), b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objEZpvd2).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
                    i4++;
                    int i7 = $11 + 117;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[zh.EZpvd] = cArr3[0];
            cArr2[zh.EZpvd + 1] = cArr3[1];
            Object[] objArr4 = {zh, zh};
            Object objEZpvd3 = YY.EZpvd(-549847163);
            if (objEZpvd3 == null) {
                byte b3 = (byte) 0;
                objEZpvd3 = YY.EZpvd(615, 5, (char) 1207, -619105543, false, $$e($$c[0], b3, b3), new Class[]{Object.class, Object.class});
            }
            ((Method) objEZpvd3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static void EZpvd(long j, long j2) throws Throwable {
        Object objInvoke;
        String str;
        Object obj;
        int i = 2 % 2;
        long j3 = j ^ (j2 << 32);
        Object[] objArr = new Object[1];
        a(new char[]{62199, 27167, 63303, 8870, 16443, 15105, 28359, 28272, 23050, 36025}, 9, objArr);
        Object obj2 = C44103sDl.class.getField((String) objArr[0]).get(null);
        int i2 = AhwBna + 53;
        djBIcL = i2 % 128;
        int i3 = i2 % 2;
        try {
            Constructor declaredConstructor = StringBuilder.class.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            Object objNewInstance = declaredConstructor.newInstance(null);
            Object[] objArr2 = new Object[1];
            b(0, 30, (char) 48466, objArr2);
            Object[] objArr3 = {(String) objArr2[0]};
            Object[] objArr4 = new Object[1];
            b(30, 6, (char) 65465, objArr4);
            Method method = StringBuilder.class.getMethod((String) objArr4[0], String.class);
            method.setAccessible(true);
            method.invoke(objNewInstance, objArr3);
            Object[] objArr5 = {Long.valueOf(j3)};
            Object[] objArr6 = new Object[1];
            b(30, 6, (char) 65465, objArr6);
            Method method2 = StringBuilder.class.getMethod((String) objArr6[0], Long.TYPE);
            method2.setAccessible(true);
            method2.invoke(objNewInstance, objArr5);
            Object[] objArr7 = new Object[1];
            a(new char[]{16158, 62136, 59252, 24728, 2696, 57512, 28359, 28272, 23987, 42848, 52021, 36476, 14389, 32682, 62602, 32993, 16443, 15105, 63443, 55453, 2428, 27486}, 22, objArr7);
            String str2 = (String) objArr7[0];
            int i4 = djBIcL + 75;
            AhwBna = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr8 = new Object[1];
                b(122, 52, (char) 0, objArr8);
                Method method3 = StringBuilder.class.getMethod((String) objArr8[0], null);
                method3.setAccessible(true);
                objInvoke = method3.invoke(objNewInstance, null);
                Object[] objArr9 = new Object[1];
                a(new char[]{63222, 14813, 64900, 362}, 3, objArr9);
                str = (String) objArr9[0];
            } else {
                Object[] objArr10 = new Object[1];
                b(36, 8, (char) 0, objArr10);
                Method method4 = StringBuilder.class.getMethod((String) objArr10[0], null);
                method4.setAccessible(true);
                objInvoke = method4.invoke(objNewInstance, null);
                Object[] objArr11 = new Object[1];
                a(new char[]{63222, 14813, 64900, 362}, 3, objArr11);
                str = (String) objArr11[0];
            }
            Object[] objArr12 = new Object[1];
            b(44, 21, (char) 0, objArr12);
            Method method5 = Intrinsics.class.getMethod((String) objArr12[0], Object.class, String.class);
            method5.setAccessible(true);
            method5.invoke(null, objInvoke, str);
            if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                Object[] objArr13 = new Object[1];
                b(65, 23, (char) 0, objArr13);
                String str3 = (String) objArr13[0];
                Object[] objArr14 = new Object[1];
                b(36, 8, (char) 0, objArr14);
                Method method6 = Object.class.getMethod((String) objArr14[0], null);
                method6.setAccessible(true);
                Object[] objArr15 = {method6.invoke(str3, null)};
                Constructor declaredConstructor2 = IllegalStateException.class.getDeclaredConstructor(String.class);
                declaredConstructor2.setAccessible(true);
                throw ((Throwable) declaredConstructor2.newInstance(objArr15));
            }
            int i5 = djBIcL + 43;
            AhwBna = i5 % 128;
            if (i5 % 2 == 0) {
                obj = pUU.class.getField("copydefault").get(null);
                int i6 = 6 / 0;
            } else {
                obj = pUU.class.getField("copydefault").get(null);
            }
            Method method7 = Intrinsics.class.getMethod("copydefault", Object.class);
            method7.setAccessible(true);
            method7.invoke(null, obj);
            Object[] objArr16 = {str2, objInvoke};
            Method method8 = pUP.class.getMethod("OLrzqt", String.class, String.class);
            method8.setAccessible(true);
            method8.invoke(obj, objArr16);
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[6]);
            byte b2 = b;
            Object[] objArr17 = new Object[1];
            c(b, b2, b2, objArr17);
            Method method9 = C44103sDl.ActionBar.class.getMethod((String) objArr17[0], null);
            method9.setAccessible(true);
            Object objInvoke2 = method9.invoke(obj2, null);
            Object[] objArr18 = new Object[1];
            b(88, 19, (char) 0, objArr18);
            DetectionInfoBean.class.getField((String) objArr18[0]).setBoolean(objInvoke2, true);
            int i7 = AhwBna + 121;
            djBIcL = i7 % 128;
            int i8 = i7 % 2;
            byte b3 = (byte) (-bArr[6]);
            byte b4 = b3;
            Object[] objArr19 = new Object[1];
            c(b3, b4, b4, objArr19);
            Method method10 = C44103sDl.ActionBar.class.getMethod((String) objArr19[0], null);
            method10.setAccessible(true);
            Object objInvoke3 = method10.invoke(obj2, null);
            Long lValueOf = Long.valueOf(j3);
            Object[] objArr20 = new Object[1];
            a(new char[]{46984, 31874, 16112, 30086, 24702, 6799, 44569, 30069, 59312, 8975}, 9, objArr20);
            DetectionInfoBean.class.getField((String) objArr20[0]).set(objInvoke3, lValueOf);
            int i9 = djBIcL + 47;
            AhwBna = i9 % 128;
            int i10 = i9 % 2;
            byte b5 = bArr[13];
            byte b6 = b5;
            Object[] objArr21 = new Object[1];
            c(b5, b6, b6, objArr21);
            Method method11 = C44103sDl.ActionBar.class.getMethod((String) objArr21[0], null);
            method11.setAccessible(true);
            method11.invoke(obj2, null);
            int i11 = AhwBna + 23;
            djBIcL = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 64 / 0;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
