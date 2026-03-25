package o;

import android.os.Build;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.android.gms.wallet.WalletConstants;
import com.google.common.base.Ascii;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaValue;
import org.spongycastle.crypto.tls.CipherSuite;
import uniffi.UniffiRustCallStatus;
import uniffi.buy_sell.UniffiLib;

/* JADX INFO: renamed from: o.Aqf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C3688Aqf extends AbstractC60182zxs {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3688Aqf(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), C3722ArM.uniffiRustBuffer, new Function2() { // from class: o.Aqk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3688Aqf.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Aqp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3688Aqf.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_free_buysellfeaturerestrictionutil(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_clone_buysellfeaturerestrictionutil(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3688Aqf(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), C3722ArM.uniffiRustBuffer, new Function2() { // from class: o.Aql
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3688Aqf.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Aqj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3688Aqf.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_free_buysellfeaturerestrictionutil(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_clone_buysellfeaturerestrictionutil(j, uniffiRustCallStatus);
    }

    public C3688Aqf() {
        this(C60184zxu.INSTANCE, ((java.lang.Number) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Aqc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C3688Aqf.OLrzqt((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_constructor_buysellfeaturerestrictionutil_new(uniffiRustCallStatus);
    }

    public static final byte isFiatRestricted$lambda$6(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Aqi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C3688Aqf.isFiatRestricted$lambda$6$lambda$5(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isFiatRestricted$lambda$6$lambda$5(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellfeaturerestrictionutil_is_fiat_restricted(j, uniffiRustCallStatus);
    }

    public static final byte isNewOnshoreIaHidden$lambda$8(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Aqh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C3688Aqf.isNewOnshoreIaHidden$lambda$8$lambda$7(j, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte isNewOnshoreIaHidden$lambda$8$lambda$7(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellfeaturerestrictionutil_is_new_onshore_ia_hidden(j, uniffiRustCallStatus);
    }

    public static final byte isSegregatedAccount$lambda$10(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C3722ArM.uniffiRustBuffer, new Function1() { // from class: o.Aqm
            private static final byte[] $$c = {116, 98, -49, -93};
            private static final int $$d = 22;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {114, 68, -42, 38, Ascii.CR, Ascii.ETB, -25, Ascii.FF, -36, 35, Ascii.EM, 19, -22, 8, Ascii.EM, Ascii.CR};
            private static final int $$b = 51;
            private static int AYXKKw = 0;
            private static int AhwBna = 1;
            private static char OLrzqt = 28999;
            private static char KWHzl = 34153;
            private static char copydefault = 59812;
            private static char AEQbTJ = 6281;
            private static char[] djBIcL = {11786, 11856, 11818, 11837, 11783, 11751, 11747, 11793, 11748, 11749, 11802, 11821, 11803, 11832, 11782, 11801, 11806, 11744, 11788, 11787, 11750, 11789, 11805, 11857, 11859, 11811, 11784, 11807, 11796, 11809, 11831, 11804, 11797, 11819, 11795, 11798, 11824, 11870, 11800, 11839, 11846, 11745, 11790, 11794, 11746, 11756, 11799, 11813, 11792};
            private static char gEmmrt = 7139;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$e(int i, byte b, byte b2) {
                int i2;
                byte[] bArr = $$c;
                int i3 = b + 65;
                int i4 = 3 - (b2 * 3);
                int i5 = i * 4;
                byte[] bArr2 = new byte[1 - i5];
                int i6 = 0 - i5;
                if (bArr == null) {
                    int i7 = i4;
                    int i8 = 0;
                    i3 += i4;
                    i4 = i7;
                    i2 = i8;
                    int i9 = i4 + 1;
                    bArr2[i2] = (byte) i3;
                    i8 = i2 + 1;
                    if (i2 == i6) {
                        return new java.lang.String(bArr2, 0);
                    }
                    i7 = i9;
                    i4 = bArr[i9];
                    i3 += i4;
                    i4 = i7;
                    i2 = i8;
                    int i92 = i4 + 1;
                    bArr2[i2] = (byte) i3;
                    i8 = i2 + 1;
                    if (i2 == i6) {
                    }
                } else {
                    i2 = 0;
                    int i922 = i4 + 1;
                    bArr2[i2] = (byte) i3;
                    i8 = i2 + 1;
                    if (i2 == i6) {
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void c(int i, byte b, byte b2, java.lang.Object[] objArr) {
                int i2;
                int i3 = 114 - b;
                byte[] bArr = $$a;
                int i4 = 11 - i;
                byte[] bArr2 = new byte[6 - b2];
                int i5 = 5 - b2;
                if (bArr == null) {
                    int i6 = i4;
                    i2 = 0;
                    i4++;
                    i3 = i3 + (-i6) + 16;
                    bArr2[i2] = (byte) i3;
                    if (i2 == i5) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i2++;
                    i6 = bArr[i4];
                    i4++;
                    i3 = i3 + (-i6) + 16;
                    bArr2[i2] = (byte) i3;
                    if (i2 == i5) {
                    }
                } else {
                    i2 = 0;
                    bArr2[i2] = (byte) i3;
                    if (i2 == i5) {
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                int i = 2 % 2;
                int i2 = AhwBna + 17;
                AYXKKw = i2 % 128;
                if (i2 % 2 == 0) {
                    return java.lang.Byte.valueOf(C3688Aqf.isSegregatedAccount$lambda$10$lambda$9(j, (UniffiRustCallStatus) obj));
                }
                java.lang.Byte.valueOf(C3688Aqf.isSegregatedAccount$lambda$10$lambda$9(j, (UniffiRustCallStatus) obj));
                throw null;
            }

            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void b(char[] cArr, int i, java.lang.Object[] objArr) throws java.lang.Throwable {
                int i2 = 2 % 2;
                Zh zh = new Zh();
                char[] cArr2 = new char[cArr.length];
                zh.EZpvd = 0;
                char[] cArr3 = new char[2];
                while (zh.EZpvd < cArr.length) {
                    int i3 = $11 + 47;
                    $10 = i3 % 128;
                    if (i3 % 2 != 0) {
                        cArr3[0] = cArr[zh.EZpvd];
                        cArr3[1] = cArr[zh.EZpvd];
                    } else {
                        cArr3[0] = cArr[zh.EZpvd];
                        cArr3[1] = cArr[zh.EZpvd + 1];
                    }
                    int i4 = 58224;
                    int i5 = 0;
                    while (i5 < 16) {
                        int i6 = $10 + 63;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                        char c = cArr3[1];
                        char c2 = cArr3[0];
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i4) ^ ((c2 << 4) + ((char) (((long) copydefault) ^ 6538634990023091910L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(AEQbTJ)};
                            java.lang.Object objEZpvd = YY.EZpvd(-2045992360);
                            if (objEZpvd == null) {
                                byte b = (byte) 0;
                                objEZpvd = YY.EZpvd(501, 5, (char) 0, -2111017180, false, $$e(b, (byte) (b | 53), b), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                            }
                            char cCharValue = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr3[0]), java.lang.Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) OLrzqt) ^ 6538634990023091910L)))), java.lang.Integer.valueOf(cCharValue >>> 5), java.lang.Integer.valueOf(KWHzl)};
                            java.lang.Object objEZpvd2 = YY.EZpvd(-2045992360);
                            if (objEZpvd2 == null) {
                                byte b2 = (byte) 0;
                                objEZpvd2 = YY.EZpvd(501, 5, (char) 0, -2111017180, false, $$e(b2, (byte) (b2 | 53), b2), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                            }
                            cArr3[0] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).charValue();
                            i4 -= 40503;
                            i5++;
                            int i8 = $10 + 57;
                            $11 = i8 % 128;
                            int i9 = i8 % 2;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[zh.EZpvd] = cArr3[0];
                    cArr2[zh.EZpvd + 1] = cArr3[1];
                    java.lang.Object[] objArr4 = {zh, zh};
                    java.lang.Object objEZpvd3 = YY.EZpvd(-549847163);
                    if (objEZpvd3 == null) {
                        byte b3 = (byte) 0;
                        objEZpvd3 = YY.EZpvd(615, 5, (char) 1207, -619105543, false, $$e(b3, (byte) (b3 | 54), b3), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
                }
                objArr[0] = new java.lang.String(cArr2, 0, i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [273=4] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void a(char[] cArr, byte b, int i, java.lang.Object[] objArr) throws java.lang.Throwable {
                int i2;
                java.lang.Object obj;
                int i3 = 2 % 2;
                Zg zg = new Zg();
                char[] cArr2 = djBIcL;
                java.lang.Object obj2 = null;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    for (int i4 = 0; i4 < length; i4++) {
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i4])};
                            java.lang.Object objEZpvd = YY.EZpvd(555755035);
                            if (objEZpvd == null) {
                                byte b2 = (byte) 0;
                                objEZpvd = YY.EZpvd(117, 4, (char) 13956, 620817255, false, $$e(b2, (byte) (b2 | 55), b2), new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            cArr3[i4] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(gEmmrt)};
                java.lang.Object objEZpvd2 = YY.EZpvd(555755035);
                if (objEZpvd2 == null) {
                    byte b3 = (byte) 0;
                    objEZpvd2 = YY.EZpvd(117, 4, (char) 13956, 620817255, false, $$e(b3, (byte) (b3 | 55), b3), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                char cCharValue = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                } else {
                    i2 = i;
                }
                if (i2 > 1) {
                    int i5 = $10 + 45;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    zg.KWHzl = 0;
                    while (zg.KWHzl < i2) {
                        int i7 = $11 + 103;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        zg.AEQbTJ = cArr[zg.KWHzl];
                        zg.OLrzqt = cArr[zg.KWHzl + 1];
                        if (zg.AEQbTJ == zg.OLrzqt) {
                            cArr4[zg.KWHzl] = (char) (zg.AEQbTJ - b);
                            cArr4[zg.KWHzl + 1] = (char) (zg.OLrzqt - b);
                            obj = obj2;
                        } else {
                            java.lang.Object[] objArr4 = {zg, zg, java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), zg};
                            java.lang.Object objEZpvd3 = YY.EZpvd(-526958001);
                            if (objEZpvd3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = (byte) (b4 + 3);
                                objEZpvd3 = YY.EZpvd(491, 5, (char) 30951, -457732301, false, $$e(b4, b5, (byte) (b5 - 3)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class});
                            }
                            if (((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).intValue() == zg.djBIcL) {
                                java.lang.Object[] objArr5 = {zg, zg, java.lang.Integer.valueOf(cCharValue), java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), java.lang.Integer.valueOf(cCharValue), zg, java.lang.Integer.valueOf(cCharValue), zg};
                                java.lang.Object objEZpvd4 = YY.EZpvd(1348337226);
                                if (objEZpvd4 == null) {
                                    byte b6 = (byte) 0;
                                    byte b7 = b6;
                                    objEZpvd4 = YY.EZpvd(221, 5, (char) 3937, 1417491254, false, $$e(b6, b7, b7), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class});
                                }
                                obj = null;
                                int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5)).intValue();
                                int i9 = (zg.EZpvd * cCharValue) + zg.djBIcL;
                                cArr4[zg.KWHzl] = cArr2[iIntValue];
                                cArr4[zg.KWHzl + 1] = cArr2[i9];
                            } else {
                                obj = null;
                                if (zg.copydefault == zg.EZpvd) {
                                    zg.AYXKKw = ((zg.AYXKKw + cCharValue) - 1) % cCharValue;
                                    zg.djBIcL = ((zg.djBIcL + cCharValue) - 1) % cCharValue;
                                    int i10 = (zg.copydefault * cCharValue) + zg.AYXKKw;
                                    int i11 = (zg.EZpvd * cCharValue) + zg.djBIcL;
                                    cArr4[zg.KWHzl] = cArr2[i10];
                                    cArr4[zg.KWHzl + 1] = cArr2[i11];
                                } else {
                                    int i12 = (zg.copydefault * cCharValue) + zg.djBIcL;
                                    int i13 = (zg.EZpvd * cCharValue) + zg.AYXKKw;
                                    cArr4[zg.KWHzl] = cArr2[i12];
                                    cArr4[zg.KWHzl + 1] = cArr2[i13];
                                }
                            }
                        }
                        zg.KWHzl += 2;
                        obj2 = obj;
                    }
                }
                for (int i14 = 0; i14 < i; i14++) {
                    cArr4[i14] = (char) (cArr4[i14] ^ 13722);
                }
                objArr[0] = new java.lang.String(cArr4);
            }

            /* JADX DEBUG: Failed to insert an additional move for type inference into block B:379:0x1355 */
            /* JADX DEBUG: Failed to insert an additional move for type inference into block B:443:0x1361 */
            /* JADX DEBUG: Failed to insert an additional move for type inference into block B:454:0x0bf3 */
            /* JADX DEBUG: Failed to insert an additional move for type inference into block B:456:0x0a2d */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            /* JADX WARN: Code restructure failed: missing block: B:132:0x0fef, code lost:
            
                r12.close();
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:145:0x1077  */
            /* JADX WARN: Removed duplicated region for block: B:151:0x10b9  */
            /* JADX WARN: Removed duplicated region for block: B:159:0x110a A[Catch: IOException -> 0x125f, all -> 0x1351, TRY_LEAVE, TryCatch #28 {, blocks: (B:92:0x0e2b, B:93:0x0e3a, B:98:0x0e88, B:103:0x0ebc, B:110:0x0f0c, B:140:0x1061, B:143:0x1069, B:146:0x1085, B:261:0x1335, B:262:0x1350, B:149:0x10a3, B:152:0x10c7, B:153:0x10e0, B:155:0x10f2, B:157:0x10f8, B:159:0x110a, B:161:0x110e, B:163:0x1114, B:166:0x1128, B:168:0x112e, B:171:0x1140, B:173:0x1146, B:176:0x1157, B:178:0x115d, B:180:0x116e, B:182:0x1176, B:227:0x12b9, B:228:0x12bc, B:234:0x12ca, B:236:0x12d5, B:237:0x12d6, B:245:0x12ef, B:247:0x12f6, B:248:0x12f7, B:250:0x12f9, B:252:0x130a, B:253:0x130b, B:255:0x130d, B:257:0x131e, B:258:0x131f), top: B:407:0x0e2b }] */
            /* JADX WARN: Removed duplicated region for block: B:186:0x1252  */
            /* JADX WARN: Removed duplicated region for block: B:247:0x12f6 A[Catch: Exception -> 0x1335, all -> 0x1351, IOException -> 0x1355, TryCatch #7 {Exception -> 0x1335, blocks: (B:228:0x12bc, B:234:0x12ca, B:236:0x12d5, B:237:0x12d6, B:245:0x12ef, B:247:0x12f6, B:248:0x12f7, B:250:0x12f9, B:252:0x130a, B:253:0x130b, B:255:0x130d, B:257:0x131e, B:258:0x131f), top: B:389:0x0e3a }] */
            /* JADX WARN: Removed duplicated region for block: B:248:0x12f7 A[Catch: Exception -> 0x1335, all -> 0x1351, IOException -> 0x1355, TryCatch #7 {Exception -> 0x1335, blocks: (B:228:0x12bc, B:234:0x12ca, B:236:0x12d5, B:237:0x12d6, B:245:0x12ef, B:247:0x12f6, B:248:0x12f7, B:250:0x12f9, B:252:0x130a, B:253:0x130b, B:255:0x130d, B:257:0x131e, B:258:0x131f), top: B:389:0x0e3a }] */
            /* JADX WARN: Removed duplicated region for block: B:278:0x1423  */
            /* JADX WARN: Removed duplicated region for block: B:313:0x17f2 A[PHI: r5
  0x17f2: PHI (r5v101 int) = (r5v5 int), (r5v5 int), (r5v132 int) binds: [B:289:0x1587, B:291:0x15c2, B:448:0x17f2] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0e03  */
            /* JADX WARN: Type inference failed for: r2v348 */
            /* JADX WARN: Type inference failed for: r2v349 */
            /* JADX WARN: Type inference failed for: r2v488 */
            /* JADX WARN: Type inference failed for: r30v18 */
            /* JADX WARN: Type inference failed for: r30v19 */
            /* JADX WARN: Type inference failed for: r30v20 */
            /* JADX WARN: Type inference failed for: r30v21 */
            /* JADX WARN: Type inference failed for: r30v22 */
            /* JADX WARN: Type inference failed for: r30v23 */
            /* JADX WARN: Type inference failed for: r30v24 */
            /* JADX WARN: Type inference failed for: r30v25 */
            /* JADX WARN: Type inference failed for: r30v26 */
            /* JADX WARN: Type inference failed for: r30v27 */
            /* JADX WARN: Type inference failed for: r30v28 */
            /* JADX WARN: Type inference failed for: r30v29 */
            /* JADX WARN: Type inference failed for: r32v18 */
            /* JADX WARN: Type inference failed for: r32v19 */
            /* JADX WARN: Type inference failed for: r32v21 */
            /* JADX WARN: Type inference failed for: r32v24 */
            /* JADX WARN: Type inference failed for: r32v25 */
            /* JADX WARN: Type inference failed for: r32v26 */
            /* JADX WARN: Type inference failed for: r32v27 */
            /* JADX WARN: Type inference failed for: r32v28 */
            /* JADX WARN: Type inference failed for: r32v29 */
            /* JADX WARN: Type inference failed for: r32v34 */
            /* JADX WARN: Type inference failed for: r32v36 */
            /* JADX WARN: Type inference failed for: r32v37 */
            /* JADX WARN: Type inference failed for: r32v38 */
            /* JADX WARN: Type inference failed for: r32v39 */
            /* JADX WARN: Type inference failed for: r32v40 */
            /* JADX WARN: Type inference failed for: r35v10, types: [int] */
            /* JADX WARN: Type inference failed for: r35v11 */
            /* JADX WARN: Type inference failed for: r35v12 */
            /* JADX WARN: Type inference failed for: r35v13 */
            /* JADX WARN: Type inference failed for: r35v14 */
            /* JADX WARN: Type inference failed for: r35v15 */
            /* JADX WARN: Type inference failed for: r35v16 */
            /* JADX WARN: Type inference failed for: r35v17 */
            /* JADX WARN: Type inference failed for: r35v18 */
            /* JADX WARN: Type inference failed for: r35v23 */
            /* JADX WARN: Type inference failed for: r35v24 */
            /* JADX WARN: Type inference failed for: r35v8 */
            /* JADX WARN: Type inference failed for: r35v9 */
            /* JADX WARN: Type inference failed for: r5v277 */
            /* JADX WARN: Type inference failed for: r5v278 */
            /* JADX WARN: Type inference failed for: r5v292, types: [java.lang.String[]] */
            /* JADX WARN: Type inference failed for: r5v293, types: [java.lang.String] */
            /* JADX WARN: Type inference failed for: r5v296, types: [java.lang.reflect.Field] */
            /* JADX WARN: Type inference failed for: r6v314 */
            /* JADX WARN: Type inference failed for: r6v315 */
            /* JADX WARN: Type inference failed for: r6v317 */
            /* JADX WARN: Type inference failed for: r6v318 */
            /* JADX WARN: Type inference failed for: r6v320 */
            /* JADX WARN: Type inference failed for: r6v524 */
            /* JADX WARN: Type inference failed for: r6v525 */
            /* JADX WARN: Type inference failed for: r6v526 */
            /* JADX WARN: Type inference failed for: r6v527 */
            /* JADX WARN: Type inference failed for: r6v528 */
            /* JADX WARN: Type inference failed for: r6v529 */
            /* JADX WARN: Type inference failed for: r6v530 */
            /* JADX WARN: Type inference failed for: r7v267 */
            /* JADX WARN: Type inference failed for: r7v268 */
            /* JADX WARN: Type inference failed for: r7v269 */
            /* JADX WARN: Type inference failed for: r7v270 */
            /* JADX WARN: Type inference failed for: r7v271 */
            /* JADX WARN: Type inference failed for: r7v272 */
            /* JADX WARN: Type inference failed for: r7v273 */
            /* JADX WARN: Type inference failed for: r7v274 */
            /* JADX WARN: Type inference failed for: r7v275 */
            /* JADX WARN: Type inference failed for: r7v276 */
            /* JADX WARN: Type inference failed for: r7v277 */
            /* JADX WARN: Type inference failed for: r7v279 */
            /* JADX WARN: Type inference failed for: r7v282 */
            /* JADX WARN: Type inference failed for: r7v286 */
            /* JADX WARN: Type inference failed for: r7v287 */
            /* JADX WARN: Type inference failed for: r7v288 */
            /* JADX WARN: Type inference failed for: r7v298 */
            /* JADX WARN: Type inference failed for: r7v299 */
            /* JADX WARN: Type inference failed for: r7v300, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v492 */
            /* JADX WARN: Type inference failed for: r9v78, types: [java.lang.String] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static java.lang.Object[] KWHzl(android.content.Context context, int i, int i2, int i3) throws java.lang.Throwable {
                int i4;
                java.lang.Object[] objArr;
                char c;
                int i5;
                char c2;
                long j2;
                char c3;
                int i6;
                java.lang.Object[] objArr2;
                char c4;
                java.lang.Object[] objArr3;
                char c5;
                java.lang.String str;
                ?? r32;
                int i7;
                java.lang.String str2;
                java.lang.String str3;
                int i8;
                java.lang.String str4;
                java.lang.String str5;
                int i9;
                int length;
                ?? r7;
                ?? r35;
                ?? r322;
                ?? r30;
                ?? r6;
                ?? r2;
                ?? r9;
                java.lang.Process processExec;
                java.lang.Object objNewInstance;
                java.lang.Object objNewInstance2;
                java.lang.Throwable cause;
                java.lang.Object[] objArr4;
                java.lang.InterruptedException interruptedException;
                java.lang.Throwable th;
                ?? r62;
                java.lang.Object objEZpvd;
                java.lang.Object objEZpvd2;
                int i10;
                int length2;
                int i11;
                java.lang.Object[] objArr5;
                char c6;
                char c7;
                char c8;
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                a(new char[]{'\"', 6, 11, 17, 11, '*', '\b', 3, 21, '\b', '*', 6, '\r', JsonPointer.SEPARATOR, 1, 2, '0', 28, 4, '$', 13912, 13912, AbstractJsonLexerKt.COMMA, JsonPointer.SEPARATOR, 23, 21, 4, '*', '\r', '*', '\"', AbstractJsonLexerKt.COMMA, '#', '\n'}, (byte) 110, 34, objArr6);
                java.lang.String str6 = (java.lang.String) objArr6[0];
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(new char[]{50317, 14531, 23794, 31181, 49374, 26082, 19282, 38636}, 7, objArr7);
                java.lang.String str7 = (java.lang.String) objArr7[0];
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                a(new char[]{'\"', 21, 27, 21, '\b', 1, '\"', 6, 22, '\b', 0, '%', 19, 11, 24, '\r'}, (byte) 99, 16, objArr8);
                java.lang.String str8 = (java.lang.String) objArr8[0];
                try {
                    if (context == null) {
                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                        b(new char[]{16995, 54417, 30863, 38307, 10563, 35798, 8760, 48450, 12043, 6650, 39274, 59212}, 12, objArr9);
                        java.lang.Object[] objArr10 = {(java.lang.String) objArr9[0]};
                        java.lang.Object objEZpvd3 = YY.EZpvd(-924280847);
                        if (objEZpvd3 == null) {
                            byte b = (byte) 0;
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            c((byte) ($$a[13] - 1), b, (byte) (b + 3), objArr11);
                            objEZpvd3 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, -859284851, false, (java.lang.String) objArr11[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long jLongValue = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr10)).longValue();
                        long j3 = 413847444;
                        long j4 = (((long) (-433)) * j3) + (((long) (-216)) * jLongValue);
                        long j5 = 217;
                        long j6 = -1;
                        long j7 = j3 ^ j6;
                        long j8 = i;
                        long j9 = j8 ^ j6;
                        long j10 = jLongValue ^ j6;
                        long j11 = j4 + ((((j7 | j9) ^ j6) | ((j10 | j8) ^ j6)) * j5) + ((((j7 | j10) ^ j6) | ((j7 | j8) ^ j6)) * j5) + (j5 * (j3 | ((j10 | j9) ^ j6))) + ((long) (-725015538));
                        int i12 = ~android.os.Process.myUid();
                        int i13 = ((int) (j11 >> 32)) & ((-722897702) + (((-151523593) | i12) * CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256) + (((~(i12 | (-430824367))) | 1995827959) * CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256));
                        int i14 = ~i;
                        int i15 = ((int) j11) & (1723537226 + (((~(2096682863 | i14)) | (~((-1487951403) | i))) * (-831)) + ((~(2147407855 | i)) * (-1662)) + (((~((-659456454) | i14)) | (~(659456453 | i)) | (~((-2096682864) | i))) * 831));
                        if (((i13 & i15) | (i13 ^ i15)) != 0) {
                            objArr5 = new java.lang.Object[]{new int[1], new int[]{(i & (-51)) | (i14 & 50)}, null, new int[]{i}, null};
                            int iMaxMemory = (int) java.lang.Runtime.getRuntime().maxMemory();
                            int i16 = ~iMaxMemory;
                            int i17 = 868884758 + (((~(432072435 | i16)) | 605425664) * CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256) + ((iMaxMemory | 276874832) * (-184)) + ((~((-760623268) | i16)) * CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256) + 16;
                            int i18 = i17 * 85;
                            int i19 = -(-(i3 * 85));
                            int i20 = (i18 & i19) + (i18 | i19);
                            int i21 = ~i17;
                            int i22 = ~i3;
                            int i23 = ~((i21 ^ i22) | (i21 & i22));
                            int i24 = ~((i21 ^ i14) | (i21 & i14));
                            int i25 = (i23 ^ i24) | (i23 & i24);
                            int i26 = ~i;
                            int i27 = ~((i22 ^ i26) | (i26 & i22));
                            int i28 = (i25 ^ i27) | (i25 & i27);
                            int i29 = (i17 ^ i3) | (i17 & i3);
                            int i30 = ~((i29 ^ i) | (i29 & i));
                            int i31 = -(-(((i28 ^ i30) | (i28 & i30)) * (-84)));
                            int i32 = (i20 & i31) + (i31 | i20);
                            int i33 = ~(i22 | i);
                            int i34 = (i33 & i17) | (i17 ^ i33);
                            int i35 = ~((i14 ^ i3) | (i14 & i3));
                            int i36 = -(-(((i34 & i35) | (i34 ^ i35)) * (-84)));
                            int i37 = (i32 & i36) + (i36 | i32);
                            int i38 = ((~((i14 ^ i3) | (i14 & i3))) | (~i29)) * 84;
                            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                            int i40 = i39 << 13;
                            int i41 = (i40 | i39) & (~(i39 & i40));
                            int i42 = i41 >>> 17;
                            int i43 = ((~i41) & i42) | ((~i42) & i41);
                            int i44 = i43 << 5;
                            ((int[]) objArr5[0])[0] = ((~i43) & i44) | ((~i44) & i43);
                            c6 = 0;
                        } else {
                            objArr5 = new java.lang.Object[]{new int[1], new int[]{i}, null, new int[]{i}, null};
                            int i45 = ~((int) android.os.Process.getStartUptimeMillis());
                            int i46 = 1085650172 + (((~((-833365315) | i45)) | (-359330389)) * (-933)) + (((~(i45 | (-359330389))) | 71488020) * 933) + 1880395757;
                            int i47 = i46 * (-493);
                            int i48 = ~i46;
                            int i49 = -(-(i48 * (-988)));
                            int i50 = ((i47 | i49) << 1) - (i47 ^ i49);
                            int i51 = (i46 ^ (-1)) | i46;
                            int i52 = ~i;
                            int i53 = (i50 - (~(-(-(((i51 ^ i52) | (i51 & i52)) * 494))))) - 1;
                            int i54 = ~(((-1) ^ i48) | i48);
                            int i55 = ~(i52 | i46);
                            int i56 = ((i54 & i55) | (i54 ^ i55) | (~i46)) * 494;
                            int i57 = i3 + (((i53 | i56) << 1) - (i56 ^ i53));
                            int i58 = i57 << 13;
                            int i59 = ((~i57) & i58) | ((~i58) & i57);
                            int i60 = i59 >>> 17;
                            int i61 = ((~i59) & i60) | ((~i60) & i59);
                            int i62 = i61 << 5;
                            int i63 = ((~i61) & i62) | ((~i62) & i61);
                            c6 = 0;
                            ((int[]) objArr5[0])[0] = i63;
                        }
                        if (((int[]) objArr5[1])[c6] != i) {
                            return objArr5;
                        }
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        a(new char[]{24, 22, 0, 25, 5, 7, 30, 27, 21, JsonPointer.SEPARATOR, '*', 14, JsonPointer.SEPARATOR, '\r', 28, 22, '0', 21, 26, '\b'}, (byte) 33, 20, objArr12);
                        java.lang.Object[] objArr13 = {(java.lang.String) objArr12[c6]};
                        java.lang.Object objEZpvd4 = YY.EZpvd(-924280847);
                        if (objEZpvd4 == null) {
                            byte b2 = (byte) 0;
                            java.lang.Object[] objArr14 = new java.lang.Object[1];
                            c((byte) ($$a[13] - 1), b2, (byte) (b2 + 3), objArr14);
                            objEZpvd4 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, -859284851, false, (java.lang.String) objArr14[0], new java.lang.Class[]{java.lang.String.class});
                        }
                        long jLongValue2 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr13)).longValue();
                        long j12 = 378521400;
                        long j13 = -375;
                        long j14 = (j13 * j12) + (j13 * jLongValue2);
                        long j15 = 376;
                        long j16 = j12 ^ j6;
                        long j17 = (j12 | jLongValue2) ^ j6;
                        int i64 = ((int) (((((j14 + (((j8 | ((j16 | (jLongValue2 ^ j6)) ^ j6)) | j17) * j15)) + (((long) (-376)) * (((j9 | j12) ^ j6) | j17))) + (j15 * (jLongValue2 | ((j16 | j8) ^ j6)))) + ((long) (-689689494))) >> 32)) & ((((~((-268517705) | i14)) | (~(855101305 | i))) * 988) + 1547254150 + (((~((-850642810) | i)) | 582125105 | (~(855101305 | i14))) * 988));
                        int i65 = (~(1924789872 | i)) | (~(487563462 | i14));
                        int i66 = ~((-1924789873) | i14);
                        if (((((int) r1) & ((-671031431) + ((i65 | i66) * (-516)) + (((~((-218497159) | i)) | (~((-269066305) | i14))) * 516) + ((269066304 | i66) * 516))) | i64) != 0) {
                            objArr = new java.lang.Object[]{new int[1], new int[]{(i & (-61)) | (i14 & 60)}, null, new int[]{i}, null};
                            int iUptimeMillis = (int) android.os.SystemClock.uptimeMillis();
                            int i67 = ~iUptimeMillis;
                            int i68 = (-1737963498) + ((339772240 | i67) * (-192)) + (((~((-699812903) | i67)) | 153110560) * (-384)) + (((~(iUptimeMillis | 1039585142)) | (~(i67 | (-546702343))) | (~((-153110561) | iUptimeMillis))) * 192);
                            int i69 = -(-(i68 * (-68)));
                            int i70 = (1120 ^ i69) + ((i69 & 1120) << 1);
                            int i71 = ~i68;
                            int i72 = (i71 & (-17)) | ((-17) ^ i71);
                            int i73 = ~((i72 & i) | (i72 ^ i));
                            int i74 = (i68 ^ 16) | (i68 & 16);
                            int i75 = ~((i74 & i) | (i74 ^ i));
                            int i76 = -(-(((i73 & i75) | (i73 ^ i75)) * 69));
                            int i77 = (i70 ^ i76) + ((i76 & i70) << 1);
                            int i78 = ~(((-17) ^ i68) | ((-17) & i68));
                            int i79 = ~((-17) | i);
                            int i80 = (i79 & i78) | (i78 ^ i79);
                            int i81 = ~((i68 ^ i) | (i68 & i));
                            int i82 = -(-(((i80 & i81) | (i80 ^ i81)) * (-69)));
                            int i83 = (i77 & i82) + (i82 | i77);
                            int i84 = ~i68;
                            int i85 = (i83 - (~(-(-((~((i84 & 16) | (i84 ^ 16))) * 69))))) - 1;
                            int iAEQbTJ = C3492Amv.AEQbTJ();
                            int i86 = i85 * (-721);
                            int i87 = -(-(i3 * (-721)));
                            int i88 = (i86 & i87) + (i86 | i87);
                            int i89 = ~iAEQbTJ;
                            int i90 = ~i85;
                            int i91 = ~i3;
                            int i92 = i89 | (~(i90 | i91));
                            int i93 = (i85 ^ i3) | (i85 & i3);
                            int i94 = ~i93;
                            int i95 = ((i92 ^ i94) | (i92 & i94)) * 1444;
                            int i96 = (i88 & i95) + (i95 | i88);
                            int i97 = ~i93;
                            int i98 = ~(i85 | iAEQbTJ);
                            int i99 = (i97 & i98) | (i97 ^ i98);
                            int i100 = ~((iAEQbTJ & i3) | (i3 ^ iAEQbTJ));
                            int i101 = ((i100 & i99) | (i99 ^ i100)) * (-1444);
                            int i102 = ((i96 | i101) << 1) - (i101 ^ i96);
                            int i103 = ~((~i85) | i3);
                            int i104 = ~((i85 & i91) | (i91 ^ i85));
                            int i105 = -(-(((i103 & i104) | (i103 ^ i104)) * 722));
                            int i106 = (i102 ^ i105) + ((i105 & i102) << 1);
                            int i107 = i106 << 13;
                            int i108 = (i107 | i106) & (~(i106 & i107));
                            int i109 = i108 >>> 17;
                            int i110 = ((~i108) & i109) | ((~i109) & i108);
                            int i111 = i110 << 5;
                            int i112 = (i110 | i111) & (~(i110 & i111));
                            c7 = 0;
                            ((int[]) objArr[0])[0] = i112;
                        } else {
                            objArr = new java.lang.Object[]{new int[1], new int[]{i}, null, new int[]{i}, null};
                            int iFreeMemory = (int) java.lang.Runtime.getRuntime().freeMemory();
                            int i113 = (-2071033722) + (((~((~iFreeMemory) | (-1150662500))) | 1142200128) * (-245));
                            int i114 = ~(iFreeMemory | (-1150662500));
                            int i115 = i113 + (i114 * (-245)) + ((i114 | 42033203) * 245);
                            int i116 = ((i115 * (-103)) - (~(i3 * (-103)))) - 1;
                            int i117 = ~i115;
                            int i118 = ~i3;
                            int i119 = ~(i117 | i118);
                            int i120 = ~(i118 | i);
                            int i121 = i116 + (((i119 & i120) | (i119 ^ i120)) * 104);
                            int i122 = (~i) | i115;
                            int i123 = ((i121 + ((~((i122 & i3) | (i122 ^ i3))) * (-104))) - (~(((i115 ^ i) | (i115 & i)) * 104))) - 1;
                            int i124 = i123 << 13;
                            int i125 = ((~i123) & i124) | ((~i124) & i123);
                            int i126 = i125 >>> 17;
                            int i127 = ((~i125) & i126) | ((~i126) & i125);
                            int i128 = i127 << 5;
                            int i129 = (i127 | i128) & (~(i127 & i128));
                            c7 = 0;
                            ((int[]) objArr[0])[0] = i129;
                        }
                        if (((int[]) objArr[1])[c7] == i) {
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            b(new char[]{26110, 16519, 43360, 42925, 64441, 21157, 50317, 14531, 23794, 31181, 64796, 60510, 8847, 13094, 23335, 2132, 58021, 50235, 62093, 40892, 21877, 3379, 17287, 33201, 51346, 60012, 49923, 63895, 54634, 41832, 65478, 5329, 50317, 14531, 23794, 31181}, 36, objArr15);
                            java.lang.Object[] objArr16 = {(java.lang.String) objArr15[c7]};
                            java.lang.Object objEZpvd5 = YY.EZpvd(1704729038);
                            if (objEZpvd5 == null) {
                                int i130 = $$b;
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                c((byte) 5, (byte) (i130 - 5), (byte) (i130 & 15), objArr17);
                                objEZpvd5 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1639765170, false, (java.lang.String) objArr17[0], new java.lang.Class[]{java.lang.String.class});
                            }
                            long jLongValue3 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd5).invoke(null, objArr16)).longValue();
                            long j18 = 389035124;
                            long j19 = 983;
                            long j20 = jLongValue3 ^ j6;
                            long j21 = (((long) (-1965)) * j18) + (((long) 984) * jLongValue3) + ((j18 | j20) * j19);
                            long j22 = j18 ^ j6;
                            long j23 = j21 + (((long) (-983)) * (j22 | ((j20 | j9) ^ j6))) + (j19 * (((jLongValue3 | j22) ^ j6) | ((j22 | j9) ^ j6))) + ((long) (-554631851));
                            int i131 = ((int) (j23 >> 32)) & (573411834 + (((~((-144520146) | i)) | (-1302148058)) * (-502)) + ((~((-9441793) | i14)) * (-502)) + (((-144520146) | (~((-1292706266) | i))) * 502));
                            int i132 = ((int) j23) & ((-655253207) + (((~(195611604 | i14)) | (-1632838015)) * (-328)) + (((-1632838015) | i) * CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256) + (((~((-195611605) | i)) | 178834048 | (~((-1616060459) | i14))) * CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256));
                            if (((i131 & i132) | (i131 ^ i132)) != 0) {
                                objArr = new java.lang.Object[]{new int[1], new int[]{(i & (-81)) | (i14 & 80)}, null, new int[]{i}, null};
                                int i133 = (-2009201181) + (((~(i14 | 544834071)) | (-654153600) | (~((-538542104) | i))) * 717) + (((~(544834071 | i)) | (~((-538542104) | i14)) | (-654153600)) * 717);
                                int i134 = (i133 & 16) + (i133 | 16);
                                int iAEQbTJ2 = C3492Amv.AEQbTJ();
                                int i135 = i134 * 303;
                                int i136 = i3 * LuaValue.ERR_CLOSE_FILE_ERROR;
                                int i137 = (i135 ^ i136) + ((i135 & i136) << 1);
                                int i138 = ~i134;
                                int i139 = ~iAEQbTJ2;
                                int i140 = (i138 & i139) | (i138 ^ i139);
                                int i141 = ~((i140 & i3) | (i140 ^ i3));
                                int i142 = i134 | i3;
                                int i143 = ~((i142 & iAEQbTJ2) | (i142 ^ iAEQbTJ2));
                                int i144 = i137 + (((i141 & i143) | (i141 ^ i143)) * (-302));
                                int i145 = ~i134;
                                int i146 = (i145 & i3) | (i145 ^ i3);
                                int i147 = -(-((~((i146 & iAEQbTJ2) | (i146 ^ iAEQbTJ2))) * (-604)));
                                int i148 = (i144 & i147) + (i147 | i144);
                                int i149 = ~i3;
                                int i150 = ~((i134 & i149) | (i149 ^ i134));
                                int i151 = ~((iAEQbTJ2 & i3) | (i3 ^ iAEQbTJ2));
                                int i152 = -(-(((i150 & i151) | (i150 ^ i151)) * 302));
                                int i153 = (i148 & i152) + (i152 | i148);
                                int i154 = i153 << 13;
                                int i155 = (i154 & (~i153)) | ((~i154) & i153);
                                int i156 = i155 >>> 17;
                                int i157 = ((~i155) & i156) | ((~i156) & i155);
                                int i158 = i157 << 5;
                                int i159 = ((~i157) & i158) | ((~i158) & i157);
                                c8 = 0;
                                ((int[]) objArr[0])[0] = i159;
                            } else {
                                objArr = new java.lang.Object[]{new int[1], new int[]{i}, null, new int[]{i}, null};
                                int startUptimeMillis = (int) android.os.Process.getStartUptimeMillis();
                                int i160 = 1688591352 + (((-12587921) | startUptimeMillis) * (-627)) + (((~((-590775300) | startUptimeMillis)) | 601920403) * (-627)) + (((~(startUptimeMillis | 601920403)) | (~((~startUptimeMillis) | 590775299))) * 627);
                                int i161 = i160 * 302;
                                int i162 = -(-((~(i160 | i)) * LuaValue.ERR_CLOSE_FILE_ERROR));
                                int i163 = ((i161 | i162) << 1) - (i161 ^ i162);
                                int i164 = ~((~i160) | i);
                                int i165 = ~i14;
                                int i166 = ((i164 & i165) | (i164 ^ i165)) * LuaValue.ERR_CLOSE_FILE_ERROR;
                                int i167 = (i163 & i166) + (i166 | i163);
                                int i168 = ~i160;
                                int i169 = ~(((-1) ^ i) | i);
                                int i170 = -(-(i167 + (((i168 & i169) | (i168 ^ i169)) * 301)));
                                int i171 = ((i3 | i170) << 1) - (i170 ^ i3);
                                int i172 = i171 << 13;
                                int i173 = (i172 & (~i171)) | ((~i172) & i171);
                                int i174 = i173 >>> 17;
                                int i175 = (i173 | i174) & (~(i173 & i174));
                                int i176 = i175 << 5;
                                int i177 = (i175 | i176) & (~(i175 & i176));
                                c8 = 0;
                                ((int[]) objArr[0])[0] = i177;
                            }
                            if (((int[]) objArr[1])[c8] == i) {
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                a(new char[]{24, '\t', 21, 6, 21, 24, '\r', 24, 6, 21, 24, 23, '\r', 28, '\b', 29, '*', '\b', JsonPointer.SEPARATOR, '\r', 6, 22, '-', '\r', 14, 11, '-', 11, 3, '\b', 20, 26, 1, '\b', 28, 0, 21, 23, '\t', 26, 27, '!'}, (byte) 42, 42, objArr18);
                                java.lang.Object[] objArr19 = {(java.lang.String) objArr18[c8]};
                                java.lang.Object objEZpvd6 = YY.EZpvd(1704729038);
                                if (objEZpvd6 == null) {
                                    int i178 = $$b;
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    c((byte) 5, (byte) (i178 - 5), (byte) (i178 & 15), objArr20);
                                    objEZpvd6 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1639765170, false, (java.lang.String) objArr20[0], new java.lang.Class[]{java.lang.String.class});
                                }
                                long jLongValue4 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd6).invoke(null, objArr19)).longValue();
                                long j24 = 1429303041;
                                long j25 = (((long) 477) * j24) + (((long) (-475)) * jLongValue4);
                                long j26 = ((j24 ^ j6) | jLongValue4) ^ j6;
                                long j27 = jLongValue4 ^ j6;
                                long startElapsedRealtime = (int) android.os.Process.getStartElapsedRealtime();
                                long j28 = ((j27 | j24) | startElapsedRealtime) ^ j6;
                                long j29 = j25 + (((long) (-476)) * (j26 | j28)) + (((long) 952) * j28) + (((long) 476) * (((j27 | (startElapsedRealtime ^ j6)) | j24) ^ j6)) + ((long) (-1594899768));
                                int i179 = ~(1256591650 | i);
                                int i180 = ((int) (j29 >> 32)) & (((1075974434 | i179) * (-196)) + 833582002 + ((i179 | 180617216) * CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256));
                                int iMyTid = android.os.Process.myTid();
                                int i181 = ((int) j29) & ((-1734001323) + (((~(1739979071 | iMyTid)) | 302752661) * (-366)) + (((~(iMyTid | 2009070527)) | 33661205) * 366));
                                if (((i180 & i181) | (i180 ^ i181)) != 0) {
                                    java.lang.Object[] objArr21 = {new int[1], new int[]{(~(i & 90)) & (i | 90)}, null, new int[]{i}, null};
                                    int i182 = ~((int) android.os.Process.getStartElapsedRealtime());
                                    int i183 = 974928424 + (((~((-801011558) | i182)) | (-391684146)) * (-983)) + (((~(i182 | (-391684146))) | 272662544) * 983);
                                    int i184 = (i183 & 16) + (16 | i183) + i3;
                                    int i185 = i184 << 13;
                                    int i186 = (i184 | i185) & (~(i184 & i185));
                                    int i187 = i186 ^ (i186 >>> 17);
                                    int i188 = i187 << 5;
                                    ((int[]) objArr21[0])[0] = (i187 | i188) & (~(i187 & i188));
                                    return objArr21;
                                }
                                java.lang.Object[] objArr22 = {new int[]{((~i) & i) | ((~i) & i)}, new int[]{i}, null, new int[]{i}, null};
                                int i189 = 596467960 + (((~(i14 | 825439953)) | 79740932) * (-108)) + (((~((-367255750) | i)) | 537925136 | (~(i14 | 367255749))) * 54) + ((i | 537925136) * 54);
                                int i190 = ((i189 * (-590)) - (~(-(-((~(((-1) ^ i189) | i189)) * (-1182)))))) - 1;
                                int i191 = ~i189;
                                int i192 = ((-1) ^ i191) | i191;
                                int i193 = ~i;
                                int i194 = ~((i193 & i192) | (i192 ^ i193));
                                int i195 = ~i189;
                                int i196 = (i190 - (~(((i194 & i195) | (i194 ^ i195)) * (-591)))) - 1;
                                int i197 = ~i189;
                                int i198 = -(-((i197 | ((-1) ^ i197)) * 591));
                                int i199 = i3 + (((i196 | i198) << 1) - (i196 ^ i198));
                                int i200 = i199 << 13;
                                int i201 = (i199 | i200) & (~(i199 & i200));
                                int i202 = i201 ^ (i201 >>> 17);
                                int i203 = i202 << 5;
                                return objArr22;
                            }
                        }
                    } else {
                        int i204 = i3;
                        try {
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            a(new char[]{'\"', 6, 11, 17, 11, '*', '\b', 3, 21, '\b', '*', 6, '\r', JsonPointer.SEPARATOR, 1, 2, 0, '\n', '*', 6, 7, 19, 13924}, (byte) 118, 23, objArr23);
                            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr23[0]);
                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                            b(new char[]{37657, 4066, 21934, 18247, 36763, 32064, 62350, 37700, 37657, 4066, 15358, 7284, 58115, 54703}, 14, objArr24);
                            java.lang.String str9 = (java.lang.String) cls.getMethod((java.lang.String) objArr24[0], null).invoke(context, null);
                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                            a(new char[]{'\"', 6, 11, 17, 11, '*', '\b', 3, 21, '\b', '*', 6, '\r', JsonPointer.SEPARATOR, 1, 2, 0, '\n', '*', 6, 7, 19, 13924}, (byte) 118, 23, objArr25);
                            java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr25[0]);
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            a(new char[]{19, '\b', 4, '#', 13827, 13827, AbstractJsonLexerKt.COMMA, JsonPointer.SEPARATOR, 23, 21, 4, '*', '\r', '*', '\"', AbstractJsonLexerKt.COMMA, '#', '\n'}, Ascii.EM, 18, objArr26);
                            java.lang.Object objInvoke = cls2.getMethod((java.lang.String) objArr26[0], null).invoke(context, null);
                            int iIndexOf = ((java.lang.String) java.lang.Class.forName(str6).getField(str7).get(objInvoke)).indexOf(str9);
                            if (iIndexOf > 0) {
                                java.lang.String str10 = (java.lang.String) java.lang.Class.forName(str6).getField(str7).get(objInvoke);
                                int length3 = str10.length();
                                int i205 = ((length3 | (-16)) << 1) - (length3 ^ (-16));
                                if (i205 >= 0) {
                                    int i206 = 0;
                                    str7 = str7;
                                    while (i206 <= i205) {
                                        java.lang.Object[] objArr27 = {str10.substring(i206, (i206 ^ 16) + ((i206 & 16) << 1)), 931995};
                                        java.lang.Object objEZpvd7 = YY.EZpvd(1485637403);
                                        if (objEZpvd7 == null) {
                                            i7 = 5;
                                            r32 = 1554893415;
                                            int i207 = $$b;
                                            str = str10;
                                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                                            c((byte) (i207 & 15), (byte) (i207 - 2), (byte) (i207 & 14), objArr28);
                                            objEZpvd7 = YY.EZpvd(398, 5, (char) 0, 1554893415, false, (java.lang.String) objArr28[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                        } else {
                                            str = str10;
                                            i7 = i7;
                                            r32 = r32;
                                        }
                                        long jLongValue5 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd7).invoke(null, objArr27)).longValue();
                                        long j30 = -488373491;
                                        long j31 = 829;
                                        long j32 = (j31 * j30) + (j31 * jLongValue5);
                                        long j33 = -828;
                                        str2 = str7;
                                        int i208 = i205;
                                        long j34 = -1;
                                        long j35 = ((long) i) ^ j34;
                                        long j36 = j32 + (((((j30 ^ j34) | (jLongValue5 ^ j34)) ^ j34) | (((j35 | j30) | jLongValue5) ^ j34)) * j33);
                                        long j37 = j30 | jLongValue5;
                                        long j38 = j36 + (j33 * (j35 | j37)) + (((long) 828) * (j37 ^ j34)) + ((long) 1816327021);
                                        int i209 = ((int) (j38 >> 32)) & ((-249003052) + (((~((-1745507889) | (~i))) | 308281477) * (-591)) + (((-1745507889) | i) * 591));
                                        int iUptimeMillis2 = (int) android.os.SystemClock.uptimeMillis();
                                        int i210 = ((int) j38) & (1771465493 + (((~((-1459091949) | iUptimeMillis2)) | 1381347432) * 576) + (((~((~iUptimeMillis2) | (-77744517))) | android.R.drawable.alert_light_frame) * 576) + 1087171072);
                                        if (((i210 & i209) | (i209 ^ i210)) == -725904754) {
                                            int i211 = ~i;
                                            java.lang.String str11 = (java.lang.String) java.lang.Class.forName(str6).getField(str2).get(objInvoke);
                                            ((int[]) objArr[3])[0] = i;
                                            ((int[]) objArr[1])[0] = (i & (-21)) | (i211 & 20);
                                            objArr = new java.lang.Object[]{new int[1], new int[1], null, new int[1], str11};
                                            int i212 = -(-((-1502312372) + ((i | 579779276) * (-859)) + (((~(579779276 | i211)) | (~((-545790153) | i))) * 859) + (((~((-612916427) | i211)) | 67126274) * 859) + 16));
                                            int i213 = (i3 & i212) + (i212 | i3);
                                            int i214 = (i213 << 13) ^ i213;
                                            int i215 = i214 >>> 17;
                                            int i216 = (i214 | i215) & (~(i214 & i215));
                                            int i217 = i216 << 5;
                                            ((int[]) objArr[0])[0] = (i216 | i217) & (~(i216 & i217));
                                            i5 = 1;
                                            i4 = i3;
                                            c = 0;
                                            break;
                                        }
                                        str7 = str2;
                                        int i218 = i206 + 81;
                                        i206 = (i218 & (-80)) + (i218 | (-80));
                                        i204 = i3;
                                        i205 = i208;
                                        str10 = str;
                                    }
                                }
                                int i219 = i204;
                                java.lang.String str12 = (java.lang.String) java.lang.Class.forName(str6).getField(str7).get(objInvoke);
                                int length4 = str12.length();
                                int i220 = ((length4 | (-6)) << 1) - (length4 ^ (-6));
                                if (i220 < 0) {
                                    i8 = i219;
                                    str4 = str6;
                                    int i221 = iIndexOf;
                                    java.lang.Object obj = objInvoke;
                                    str5 = str8;
                                    java.lang.String strSubstring = ((java.lang.String) java.lang.Class.forName(str4).getField(str7).get(obj)).substring(0, i221);
                                    i9 = 1;
                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                    a(new char[]{13833}, (byte) 84, 1, objArr29);
                                    java.lang.String[] strArrSplit = strSubstring.split((java.lang.String) objArr29[0]);
                                    length = strArrSplit.length;
                                    r7 = 0;
                                    r2 = strArrSplit;
                                    r6 = obj;
                                    r30 = i7;
                                    r322 = r32;
                                    r35 = str2;
                                    loop0: while (r7 < length) {
                                        r9 = r2[r7];
                                        java.lang.Object[] objArr30 = new java.lang.Object[i9];
                                        a(new char[]{'+', 5, 13880}, (byte) 113, 3, objArr30);
                                        if (r9.split((java.lang.String) objArr30[0]).length > i9) {
                                            synchronized (((java.lang.Class) YY.AEQbTJ(368, 5, 0))) {
                                                try {
                                                    try {
                                                        java.lang.Object[] objArr31 = new java.lang.Object[i9];
                                                        b(new char[]{38111, 20882, 32090, 9088, 952, 34891, 65107, 58262, 59392, 2814, 13727, 47916, 23226, 44097, 56774, 13071}, 16, objArr31);
                                                        java.lang.String str13 = (java.lang.String) objArr31[0];
                                                        try {
                                                            try {
                                                                java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
                                                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                                b(new char[]{47132, 46994}, 2, objArr32);
                                                                processExec = runtime.exec((java.lang.String) objArr32[0], (java.lang.String[]) null, (java.io.File) null);
                                                                try {
                                                                    java.lang.Object[] objArr33 = {processExec.getInputStream()};
                                                                    java.lang.Object objEZpvd8 = YY.EZpvd(-237227398);
                                                                    if (objEZpvd8 == null) {
                                                                        objEZpvd8 = YY.EZpvd(353, 5, (char) 49035, -167969018, false, null, new java.lang.Class[]{java.io.InputStream.class});
                                                                    }
                                                                    objNewInstance = ((java.lang.reflect.Constructor) objEZpvd8).newInstance(objArr33);
                                                                    try {
                                                                        java.lang.Object[] objArr34 = {processExec.getErrorStream()};
                                                                        java.lang.Object objEZpvd9 = YY.EZpvd(-237227398);
                                                                        if (objEZpvd9 == null) {
                                                                            objEZpvd9 = YY.EZpvd(353, 5, (char) 49035, -167969018, false, null, new java.lang.Class[]{java.io.InputStream.class});
                                                                        }
                                                                        objNewInstance2 = ((java.lang.reflect.Constructor) objEZpvd9).newInstance(objArr34);
                                                                        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(processExec.getOutputStream());
                                                                        try {
                                                                            java.lang.Class<?> cls3 = java.lang.Class.forName(str5);
                                                                            r30 = r2;
                                                                            r322 = length == true ? 1 : 0;
                                                                            try {
                                                                                objArr4 = new java.lang.Object[1];
                                                                                r35 = r7;
                                                                            } catch (java.lang.Throwable th2) {
                                                                                th = th2;
                                                                                java.lang.Throwable th3 = th;
                                                                                cause = th3.getCause();
                                                                                if (cause == null) {
                                                                                }
                                                                            }
                                                                            try {
                                                                                b(new char[]{10563, 35798, 9027, 41096, 21608, 29512}, 5, objArr4);
                                                                                cls3.getMethod((java.lang.String) objArr4[0], null).invoke(objNewInstance, null);
                                                                                try {
                                                                                    java.lang.Class<?> cls4 = java.lang.Class.forName(str5);
                                                                                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                                                    b(new char[]{10563, 35798, 9027, 41096, 21608, 29512}, 5, objArr35);
                                                                                    cls4.getMethod((java.lang.String) objArr35[0], null).invoke(objNewInstance2, null);
                                                                                    try {
                                                                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                                        sb.append(str13);
                                                                                        java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                                                        b(new char[]{41431, 13929}, 1, objArr36);
                                                                                        sb.append((java.lang.String) objArr36[0]);
                                                                                        java.lang.String string = sb.toString();
                                                                                        java.lang.Object[] objArr37 = new java.lang.Object[1];
                                                                                        a(new char[]{30, 5, '\n', 27, 13812}, (byte) 82, 5, objArr37);
                                                                                        dataOutputStream.write(string.getBytes((java.lang.String) objArr37[0]));
                                                                                        dataOutputStream.flush();
                                                                                        java.lang.Object[] objArr38 = new java.lang.Object[1];
                                                                                        b(new char[]{51001, 29156, 59273, 45251, 41431, 13929}, 5, objArr38);
                                                                                        java.lang.String str14 = (java.lang.String) objArr38[0];
                                                                                        java.lang.Object[] objArr39 = new java.lang.Object[1];
                                                                                        a(new char[]{30, 5, '\n', 27, 13812}, (byte) 82, 5, objArr39);
                                                                                        dataOutputStream.write(str14.getBytes((java.lang.String) objArr39[0]));
                                                                                        dataOutputStream.flush();
                                                                                        try {
                                                                                            long jNanoTime = java.lang.System.nanoTime();
                                                                                            r7 = r6;
                                                                                            try {
                                                                                                long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L);
                                                                                                ?? r63 = r6;
                                                                                                while (true) {
                                                                                                    try {
                                                                                                        processExec.exitValue();
                                                                                                        r62 = r63;
                                                                                                    } catch (java.lang.IllegalThreadStateException unused) {
                                                                                                        ?? r64 = r63;
                                                                                                        if (nanos > 0) {
                                                                                                            try {
                                                                                                                java.lang.Object[] objArr40 = {java.lang.Long.valueOf(java.lang.Math.min(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 3L))};
                                                                                                                java.lang.Class<?> cls5 = java.lang.Class.forName(str5);
                                                                                                                java.lang.Object[] objArr41 = new java.lang.Object[1];
                                                                                                                b(new char[]{50626, 13099, 8462, 60435, 42974, 51703}, 5, objArr41);
                                                                                                                cls5.getMethod((java.lang.String) objArr41[0], java.lang.Long.TYPE).invoke(null, objArr40);
                                                                                                                r64 = objArr40;
                                                                                                            } catch (java.lang.Throwable th4) {
                                                                                                                java.lang.Throwable cause2 = th4.getCause();
                                                                                                                if (cause2 != null) {
                                                                                                                    throw cause2;
                                                                                                                }
                                                                                                                throw th4;
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            long nanos2 = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(2000L) - (java.lang.System.nanoTime() - jNanoTime);
                                                                                                            r62 = r64;
                                                                                                            if (nanos2 > 0) {
                                                                                                                nanos = nanos2;
                                                                                                                r63 = r64;
                                                                                                            }
                                                                                                        } catch (java.lang.InterruptedException e) {
                                                                                                            e = e;
                                                                                                            interruptedException = e;
                                                                                                            try {
                                                                                                                throw interruptedException;
                                                                                                            } catch (java.lang.Throwable th5) {
                                                                                                                th = th5;
                                                                                                                th = th;
                                                                                                                try {
                                                                                                                    processExec.destroy();
                                                                                                                    throw th;
                                                                                                                } catch (java.lang.Exception unused2) {
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            }
                                                                                                        } catch (java.lang.Throwable th6) {
                                                                                                            th = th6;
                                                                                                            th = th;
                                                                                                            processExec.destroy();
                                                                                                            throw th;
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            break;
                                                                                                        } catch (java.lang.InterruptedException e2) {
                                                                                                            interruptedException = e2;
                                                                                                            throw interruptedException;
                                                                                                        } catch (java.lang.Throwable th7) {
                                                                                                            th = th7;
                                                                                                            processExec.destroy();
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (java.io.IOException unused3) {
                                                                                                    }
                                                                                                }
                                                                                            } catch (java.lang.InterruptedException e3) {
                                                                                                e = e3;
                                                                                            } catch (java.lang.Throwable th8) {
                                                                                                th = th8;
                                                                                            }
                                                                                        } catch (java.lang.InterruptedException e4) {
                                                                                            e = e4;
                                                                                        } catch (java.lang.Throwable th9) {
                                                                                            th = th9;
                                                                                        }
                                                                                    } catch (java.io.IOException unused4) {
                                                                                        length = i8;
                                                                                        r7 = r6;
                                                                                    } catch (java.lang.Exception unused5) {
                                                                                    }
                                                                                } catch (java.lang.Throwable th10) {
                                                                                    java.lang.Throwable cause3 = th10.getCause();
                                                                                    if (cause3 != null) {
                                                                                        throw cause3;
                                                                                    }
                                                                                    throw th10;
                                                                                }
                                                                            } catch (java.lang.Throwable th11) {
                                                                                th = th11;
                                                                                java.lang.Throwable th32 = th;
                                                                                cause = th32.getCause();
                                                                                if (cause == null) {
                                                                                    throw cause;
                                                                                }
                                                                                throw th32;
                                                                            }
                                                                        } catch (java.lang.Throwable th12) {
                                                                            th = th12;
                                                                            boolean z = length == true ? 1 : 0;
                                                                        }
                                                                    } catch (java.lang.Throwable th13) {
                                                                        boolean z2 = length == true ? 1 : 0;
                                                                        java.lang.Throwable cause4 = th13.getCause();
                                                                        if (cause4 != null) {
                                                                            throw cause4;
                                                                        }
                                                                        throw th13;
                                                                    }
                                                                } catch (java.lang.Throwable th14) {
                                                                    boolean z3 = length == true ? 1 : 0;
                                                                    java.lang.Throwable cause5 = th14.getCause();
                                                                    if (cause5 != null) {
                                                                        throw cause5;
                                                                    }
                                                                    throw th14;
                                                                }
                                                            } catch (java.lang.Exception unused6) {
                                                            }
                                                        } catch (java.lang.Exception unused7) {
                                                            boolean z4 = length == true ? 1 : 0;
                                                        }
                                                    } catch (java.io.IOException unused8) {
                                                        r30 = r2;
                                                        r322 = length == true ? 1 : 0;
                                                        r35 = r7;
                                                        length = i8;
                                                        r7 = r6;
                                                    }
                                                } catch (java.io.IOException unused9) {
                                                }
                                            }
                                        } else {
                                            r30 = r2;
                                            r322 = length == true ? 1 : 0;
                                            r35 = r7;
                                            length = i8;
                                            r7 = r6;
                                        }
                                        r6 = r7;
                                        r2 = r30;
                                        i9 = 1;
                                        r7 = r35 + 1;
                                        i8 = length;
                                        length = r322 == true ? 1 : 0;
                                        r30 = r30;
                                        r322 = r322;
                                        r35 = r35;
                                    }
                                    i4 = i8;
                                } else {
                                    int i222 = 0;
                                    int i223 = i220;
                                    objInvoke = objInvoke;
                                    i7 = i7;
                                    r32 = r32;
                                    while (i222 <= i223) {
                                        java.lang.Object[] objArr42 = {str12.substring(i222, i222 + 6), 931995};
                                        java.lang.Object objEZpvd10 = YY.EZpvd(1485637403);
                                        if (objEZpvd10 == null) {
                                            int i224 = $$b;
                                            str3 = str12;
                                            java.lang.Object[] objArr43 = new java.lang.Object[1];
                                            c((byte) (i224 & 15), (byte) (i224 - 2), (byte) (i224 & 14), objArr43);
                                            objEZpvd10 = YY.EZpvd(398, 5, (char) 0, 1554893415, false, (java.lang.String) objArr43[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                        } else {
                                            str3 = str12;
                                        }
                                        long jLongValue6 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd10).invoke(null, objArr42)).longValue();
                                        long j39 = -30528045;
                                        int i225 = iIndexOf;
                                        int i226 = i223;
                                        long j40 = 765;
                                        java.lang.Object obj2 = objInvoke;
                                        java.lang.String str15 = str8;
                                        long j41 = -1;
                                        long j42 = j39 ^ j41;
                                        long j43 = jLongValue6 ^ j41;
                                        long j44 = j42 | j43;
                                        int i227 = i222;
                                        long j45 = i;
                                        long j46 = j45 ^ j41;
                                        java.lang.String str16 = str6;
                                        long j47 = (((long) (-1529)) * j39) + (((long) (-764)) * jLongValue6) + ((((j44 | j46) ^ j41) | (((j42 | jLongValue6) | j45) ^ j41) | (((j43 | j39) | j45) ^ j41)) * j40) + (((long) 1530) * ((j44 ^ j41) | ((j42 | j46) ^ j41))) + (j40 * (((j42 | j45) ^ j41) | (((j43 | j46) | j39) ^ j41))) + ((long) 1358481575);
                                        int i228 = ~i;
                                        int i229 = ((int) (j47 >> 32)) & (1014981159 + (((~(1059223534 | i228)) | (~(1798517350 | i))) * 217) + (((~(1059223534 | i)) | (-2134079471)) * 217) + (((~(i228 | 1798517350)) | (-1059223535)) * 217));
                                        int iNextInt = new java.util.Random().nextInt(718812376);
                                        int i230 = ((int) j47) & (((1153123995 + (((~iNextInt) | (-693473698)) * 1444)) + (((~(iNextInt | 1238469755)) | ((~(1619271130 | iNextInt)) | (-1775607292))) * (-1444))) - 1823164398);
                                        if (((i229 & i230) | (i229 ^ i230)) == -2096167706) {
                                            int i231 = (i & (-21)) | ((~i) & 20);
                                            java.lang.String str17 = (java.lang.String) java.lang.Class.forName(str16).getField(str7).get(obj2);
                                            ((int[]) objArr[3])[0] = i;
                                            ((int[]) objArr[1])[0] = i231;
                                            objArr = new java.lang.Object[]{new int[1], new int[1], null, new int[1], str17};
                                            int iNextInt2 = new java.util.Random().nextInt(851134367);
                                            int i232 = ((((8409152 | r4) | (~(1048487347 | iNextInt2))) * (-338)) - 259978218) + (((~(iNextInt2 | 1056896499)) | (~((-1048487348) | (~iNextInt2)))) * 338) + 16;
                                            int i233 = ((i3 | i232) << 1) - (i232 ^ i3);
                                            int i234 = i233 << 13;
                                            int i235 = (i233 | i234) & (~(i233 & i234));
                                            int i236 = i235 >>> 17;
                                            int i237 = (i235 | i236) & (~(i235 & i236));
                                            int i238 = i237 << 5;
                                            ((int[]) objArr[0])[0] = (i237 | i238) & (~(i237 & i238));
                                            c = 0;
                                            i4 = i3;
                                            break;
                                        }
                                        i222 = i227 + 1;
                                        i219 = i3;
                                        objInvoke = obj2;
                                        iIndexOf = i225;
                                        str6 = str16;
                                        i223 = i226;
                                        str8 = str15;
                                        str12 = str3;
                                        i7 = i226;
                                        r32 = obj2;
                                    }
                                    i8 = i219;
                                    str4 = str6;
                                    int i2212 = iIndexOf;
                                    java.lang.Object obj3 = objInvoke;
                                    str5 = str8;
                                    java.lang.String strSubstring2 = ((java.lang.String) java.lang.Class.forName(str4).getField(str7).get(obj3)).substring(0, i2212);
                                    i9 = 1;
                                    java.lang.Object[] objArr292 = new java.lang.Object[1];
                                    a(new char[]{13833}, (byte) 84, 1, objArr292);
                                    java.lang.String[] strArrSplit2 = strSubstring2.split((java.lang.String) objArr292[0]);
                                    length = strArrSplit2.length;
                                    r7 = 0;
                                    r2 = strArrSplit2;
                                    r6 = obj3;
                                    r30 = i7;
                                    r322 = r32;
                                    r35 = str2;
                                    loop0: while (r7 < length) {
                                    }
                                    i4 = i8;
                                }
                            } else {
                                i4 = i204;
                            }
                            objArr = new java.lang.Object[]{new int[1], new int[]{i}, null, new int[]{i}, null};
                            int startUptimeMillis2 = (int) android.os.Process.getStartUptimeMillis();
                            int i239 = 2095757034 + ((546768470 | startUptimeMillis2) * 614);
                            int i240 = ~startUptimeMillis2;
                            int i241 = i239 + (((~((-324275875) | i240)) | 1312258 | (~(868419828 | i240))) * (-1228)) + (((~(i240 | 869732086)) | (~((-322963617) | i240))) * 614);
                            int iAEQbTJ3 = C3492Amv.AEQbTJ();
                            int i242 = (i241 * (-381)) + ((i4 == true ? 1 : 0) * 192);
                            int i243 = ~i241;
                            int i244 = (i242 - (~(-(-(i243 * (-191)))))) - 1;
                            int i245 = ~(((i4 == true ? 1 : 0) ^ iAEQbTJ3) | ((i4 == true ? 1 : 0) & iAEQbTJ3));
                            int i246 = -(-(((i241 & i245) | (i241 ^ i245)) * 191));
                            int i247 = (i244 & i246) + (i244 | i246);
                            int i248 = ~((i243 ^ (i4 == true ? 1 : 0)) | (i243 & (i4 == true ? 1 : 0)));
                            int i249 = ~iAEQbTJ3;
                            int i250 = ~((i249 & (i4 == true ? 1 : 0)) | (i249 ^ (i4 == true ? 1 : 0)));
                            int i251 = (i247 - (~(((i250 & i248) | (i248 ^ i250)) * 191))) - 1;
                            int i252 = i251 << 13;
                            int i253 = (i252 & (~i251)) | ((~i252) & i251);
                            int i254 = i253 >>> 17;
                            int i255 = (i253 | i254) & (~(i253 & i254));
                            int i256 = i255 << 5;
                            int i257 = ((~i255) & i256) | ((~i256) & i255);
                            c = 0;
                            ((int[]) objArr[0])[0] = i257;
                            i5 = 1;
                            if (((int[]) objArr[i5])[c] == i) {
                                java.lang.Object[] objArr44 = new java.lang.Object[5];
                                objArr44[c] = new int[i5];
                                int[] iArr = new int[i5];
                                objArr44[i5] = iArr;
                                int[] iArr2 = new int[i5];
                                objArr44[3] = iArr2;
                                iArr2[c] = i;
                                iArr[c] = i;
                                objArr44[2] = null;
                                objArr44[4] = null;
                                int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
                                int i258 = ~elapsedCpuTime;
                                int i259 = ((i4 == true ? 1 : 0) - (~((((-1792894970) + ((((~((-601316242) | i258)) | (-591379462)) | (~(601316241 | elapsedCpuTime))) * (-564))) + ((~(elapsedCpuTime | (-2663429))) * 1128)) + (((~((-591379462) | i258)) | (-603979670)) * 564)))) - 1;
                                int i260 = i259 << 13;
                                int i261 = ((~i259) & i260) | ((~i260) & i259);
                                int i262 = i261 >>> 17;
                                int i263 = ((~i261) & i262) | ((~i262) & i261);
                                int i264 = i263 << 5;
                                ((int[]) objArr44[0])[0] = ((~i263) & i264) | ((~i264) & i263);
                                if (((int[]) objArr44[1])[0] != i) {
                                    return objArr44;
                                }
                                if ((i2 & 1) == 0) {
                                    if (Build.VERSION.SDK_INT < 21) {
                                        java.lang.Object[] objArr45 = {new int[]{((~i) & i) | ((~i) & i)}, new int[]{i}, null, new int[]{i}, null};
                                        int i265 = 770322098 + (((~((-869709937) | i)) | (-869728119)) * (-502));
                                        int i266 = ~i;
                                        int i267 = i265 + ((~((-546742353) | i266)) * (-502)) + (((-869709937) | (~((-322985767) | i))) * 502);
                                        int i268 = i267 * (-448);
                                        int i269 = ~(((-1) ^ i267) | i267);
                                        int i270 = ~i267;
                                        int i271 = ~((i270 & i) | (i270 ^ i));
                                        int i272 = ((i269 & i271) | (i269 ^ i271)) * 449;
                                        int i273 = (i268 ^ i272) + ((i268 & i272) << 1);
                                        int i274 = ~i267;
                                        int i275 = -(-((~((i274 & i266) | (i274 ^ i266))) * 449));
                                        int i276 = (i273 ^ i275) + ((i275 & i273) << 1);
                                        int i277 = ((i4 == true ? 1 : 0) & i276) + (i276 | (i4 == true ? 1 : 0));
                                        int i278 = i277 << 13;
                                        int i279 = (i277 | i278) & (~(i277 & i278));
                                        int i280 = i279 >>> 17;
                                        int i281 = ((~i279) & i280) | ((~i280) & i279);
                                        int i282 = i281 << 5;
                                        boolean z5 = i4 == true ? 1 : 0;
                                        objArr3 = objArr45;
                                        c5 = 0;
                                    } else {
                                        java.lang.Object[] objArr46 = new java.lang.Object[1];
                                        b(new char[]{45562, 195, 43851, 19274, 53782, 22975, 21730, 45132, 47440, 58071, 12846, 33745, 56436, 49187}, 13, objArr46);
                                        try {
                                            java.lang.Object[] objArr47 = {(java.lang.String) objArr46[0]};
                                            java.lang.Object[] objArr48 = new java.lang.Object[1];
                                            a(new char[]{'\"', 6, 11, 17, 11, '*', '\b', 3, 21, '\b', '*', 6, '\r', JsonPointer.SEPARATOR, 1, 2, 0, '\n', '*', 6, 7, 19, 13924}, (byte) 118, 23, objArr48);
                                            java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr48[0]);
                                            java.lang.Object[] objArr49 = new java.lang.Object[1];
                                            a(new char[]{19, '\b', 4, 7, 0, 25, 5, 7, ' ', '\r', 11, 19, 25, JsonPointer.SEPARATOR, 26, '\b'}, (byte) 100, 16, objArr49);
                                            java.lang.Object objInvoke2 = cls6.getMethod((java.lang.String) objArr49[0], java.lang.String.class).invoke(context, objArr47);
                                            if (objInvoke2 != null) {
                                                java.lang.Object[] objArr50 = new java.lang.Object[1];
                                                b(new char[]{21877, 3379, 17287, 33201, 51346, 60012, 26312, 52131, 8893, 40124, 57002, 47581, 20317, 5869, 8753, 24162, 31100, 21227, 25845, 3979, 43851, 19274, 53782, 22975, 62614, 41299, 28940, 40064, 50935, 55228, 54795, 61922, 27455, 44740, 37657, 4066, 19282, 38636}, 37, objArr50);
                                                java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr50[0]);
                                                java.lang.Object[] objArr51 = new java.lang.Object[1];
                                                a(new char[]{19, '\b', 4, '#', 21, 1, JsonPointer.SEPARATOR, 25, 11, '(', '\r', 31, JsonPointer.SEPARATOR, '*', 13849}, (byte) 48, 15, objArr51);
                                                java.util.List list = (java.util.List) cls7.getMethod((java.lang.String) objArr51[0], null).invoke(objInvoke2, null);
                                                if (list != null) {
                                                    java.util.Iterator it = list.iterator();
                                                    loop3: while (it.hasNext()) {
                                                        java.lang.Object next = it.next();
                                                        java.lang.Object[] objArr52 = new java.lang.Object[1];
                                                        a(new char[]{'\"', 6, 11, 17, 11, '*', '\b', 3, 21, '\b', '*', 6, '\r', JsonPointer.SEPARATOR, 1, 2, 0, '\n', 28, '0', '\r', '*', '\r', JsonPointer.SEPARATOR, 1, '#', '\"', ')', 13897}, (byte) 74, 29, objArr52);
                                                        java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr52[0]);
                                                        java.lang.Object[] objArr53 = new java.lang.Object[1];
                                                        b(new char[]{37657, 4066, 21934, 18247, 36763, 32064, 62350, 37700, 37657, 4066, 15358, 7284, 58115, 54703}, 14, objArr53);
                                                        java.lang.String str18 = (java.lang.String) cls8.getMethod((java.lang.String) objArr53[0], null).invoke(next, null);
                                                        java.lang.Object[] objArr54 = new java.lang.Object[1];
                                                        b(new char[]{21877, 3379, 17287, 33201, 51346, 60012, 26312, 52131, 8893, 40124, 57002, 47581, 20317, 5869, 8753, 24162, 31100, 21227, 25845, 3979, 43851, 19274, 53782, 22975, 62614, 41299, 28940, 40064, 50935, 55228, 54795, 61922, 27455, 44740, 37657, 4066, 19282, 38636}, 37, objArr54);
                                                        java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr54[0]);
                                                        java.lang.Object[] objArr55 = new java.lang.Object[1];
                                                        b(new char[]{952, 34891, 12144, 40485, 65026, 31246, 19721, 64965, 8014, 42480, 33285, 54638, 60257, 56060, 50007, 42385, 42974, 51703}, 17, objArr55);
                                                        if (((java.lang.Boolean) cls9.getMethod((java.lang.String) objArr55[0], java.lang.String.class).invoke(objInvoke2, str18)).booleanValue()) {
                                                            int length5 = str18.length();
                                                            int i283 = ((length5 | (-20)) << 1) - (length5 ^ (-20));
                                                            if (i283 < 0) {
                                                                continue;
                                                            } else {
                                                                int i284 = 0;
                                                                while (i284 <= i283) {
                                                                    java.lang.Object[] objArr56 = {str18.substring(i284, (i284 & 20) + (i284 | 20)), 931995};
                                                                    java.lang.Object objEZpvd11 = YY.EZpvd(1485637403);
                                                                    if (objEZpvd11 == null) {
                                                                        int i285 = $$b;
                                                                        java.lang.Object[] objArr57 = new java.lang.Object[1];
                                                                        c((byte) (i285 & 15), (byte) (i285 - 2), (byte) (i285 & 14), objArr57);
                                                                        objEZpvd11 = YY.EZpvd(398, 5, (char) 0, 1554893415, false, (java.lang.String) objArr57[0], new java.lang.Class[]{java.lang.String.class, java.lang.Integer.TYPE});
                                                                    }
                                                                    long jLongValue7 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd11).invoke(null, objArr56)).longValue();
                                                                    long j48 = -560446413;
                                                                    int i286 = i283;
                                                                    long j49 = 220;
                                                                    java.lang.Object obj4 = objInvoke2;
                                                                    java.util.Iterator it2 = it;
                                                                    long j50 = -1;
                                                                    java.lang.String str19 = str18;
                                                                    long j51 = i;
                                                                    long j52 = j51 ^ j50;
                                                                    long j53 = (((long) 221) * j48) + (((long) (-219)) * jLongValue7) + (((((j48 ^ j50) | (jLongValue7 ^ j50)) ^ j50) | (((j52 | j48) | jLongValue7) ^ j50)) * j49) + (((long) (-440)) * (((j52 | jLongValue7) ^ j50) | j48)) + (j49 * (j48 | jLongValue7 | j51)) + ((long) 1888399943);
                                                                    int i287 = ((int) (j53 >> 32)) & (((((2639904 | r2) | (~(1321305929 | i))) * (-338)) - 1965453334) + (((~((-1321305930) | (~i))) | (~(1323945833 | i))) * 338));
                                                                    int startElapsedRealtime2 = (int) android.os.Process.getStartElapsedRealtime();
                                                                    int i288 = ~startElapsedRealtime2;
                                                                    int i289 = ((int) j53) & (1872370133 + ((startElapsedRealtime2 | 270532609) * 988) + (((~((-600462745) | i288)) | 34231688) * (-1976)) + (((~(startElapsedRealtime2 | 836763665)) | 270532609 | (~((-836763666) | i288))) * 988));
                                                                    if (((i287 & i289) | (i287 ^ i289)) == 1245577864) {
                                                                        java.lang.Object[] objArr58 = {new int[]{i ^ (i << 5)}, new int[]{(~(i & 70)) & (i | 70)}, null, new int[]{i}, null};
                                                                        int i290 = i3 + 2129291142 + (((~(1055903477 | i)) | 136792225) * (-756)) + ((1055903477 | (~i)) * 756) + 16;
                                                                        int i291 = i290 << 13;
                                                                        int i292 = (i290 | i291) & (~(i290 & i291));
                                                                        int i293 = i292 >>> 17;
                                                                        int i294 = (i292 | i293) & (~(i292 & i293));
                                                                        objArr3 = objArr58;
                                                                        c5 = 0;
                                                                        break loop3;
                                                                    }
                                                                    int i295 = (i284 ^ 16) + ((i284 & 16) << 1);
                                                                    i284 = (i295 & (-15)) + (i295 | (-15));
                                                                    i283 = i286;
                                                                    i4 = i3;
                                                                    it = it2;
                                                                    str18 = str19;
                                                                    objInvoke2 = obj4;
                                                                }
                                                            }
                                                        }
                                                        i4 = i4 == true ? 1 : 0;
                                                        it = it;
                                                        objInvoke2 = objInvoke2;
                                                    }
                                                    int i296 = i4;
                                                    objArr3 = new java.lang.Object[]{new int[1], new int[]{i}, null, new int[]{i}, null};
                                                    int i297 = 2097847988 + (((~(i | 153885100)) | (-1038810603)) * (-465)) + ((153885100 | (~((-1038810603) | i))) * 930) + (((-885187651) | i) * 465);
                                                    int iAEQbTJ4 = C3492Amv.AEQbTJ();
                                                    int i298 = i297 * 334;
                                                    int i299 = (i298 & 333) + (i298 | 333);
                                                    int i300 = ~iAEQbTJ4;
                                                    int i301 = ~(i300 | ((-1) ^ i300));
                                                    int i302 = ~((i297 ^ iAEQbTJ4) | (i297 & iAEQbTJ4));
                                                    int i303 = i299 + (((i301 & i302) | (i301 ^ i302)) * 333);
                                                    int i304 = -(-(((~((~iAEQbTJ4) | i297)) | (~(((-1) ^ iAEQbTJ4) | iAEQbTJ4))) * 333));
                                                    int i305 = ((i303 | i304) << 1) - (i304 ^ i303);
                                                    int i306 = ((i296 == true ? 1 : 0) & i305) + (i305 | (i296 == true ? 1 : 0));
                                                    int i307 = i306 << 13;
                                                    int i308 = (i306 | i307) & (~(i306 & i307));
                                                    int i309 = i308 ^ (i308 >>> 17);
                                                    int i310 = i309 << 5;
                                                    int i311 = ((~i309) & i310) | ((~i310) & i309);
                                                    c5 = 0;
                                                    ((int[]) objArr3[0])[0] = i311;
                                                } else {
                                                    int i2962 = i4;
                                                    objArr3 = new java.lang.Object[]{new int[1], new int[]{i}, null, new int[]{i}, null};
                                                    int i2972 = 2097847988 + (((~(i | 153885100)) | (-1038810603)) * (-465)) + ((153885100 | (~((-1038810603) | i))) * 930) + (((-885187651) | i) * 465);
                                                    int iAEQbTJ42 = C3492Amv.AEQbTJ();
                                                    int i2982 = i2972 * 334;
                                                    int i2992 = (i2982 & 333) + (i2982 | 333);
                                                    int i3002 = ~iAEQbTJ42;
                                                    int i3012 = ~(i3002 | ((-1) ^ i3002));
                                                    int i3022 = ~((i2972 ^ iAEQbTJ42) | (i2972 & iAEQbTJ42));
                                                    int i3032 = i2992 + (((i3012 & i3022) | (i3012 ^ i3022)) * 333);
                                                    int i3042 = -(-(((~((~iAEQbTJ42) | i2972)) | (~(((-1) ^ iAEQbTJ42) | iAEQbTJ42))) * 333));
                                                    int i3052 = ((i3032 | i3042) << 1) - (i3042 ^ i3032);
                                                    int i3062 = ((i2962 == true ? 1 : 0) & i3052) + (i3052 | (i2962 == true ? 1 : 0));
                                                    int i3072 = i3062 << 13;
                                                    int i3082 = (i3062 | i3072) & (~(i3062 & i3072));
                                                    int i3092 = i3082 ^ (i3082 >>> 17);
                                                    int i3102 = i3092 << 5;
                                                    int i3112 = ((~i3092) & i3102) | ((~i3102) & i3092);
                                                    c5 = 0;
                                                    ((int[]) objArr3[0])[0] = i3112;
                                                }
                                            }
                                        } catch (java.lang.Throwable th15) {
                                            java.lang.Throwable cause6 = th15.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th15;
                                        }
                                    }
                                    if (((int[]) objArr3[1])[c5] != i) {
                                        return objArr3;
                                    }
                                } else {
                                    boolean z6 = i4 == true ? 1 : 0;
                                }
                                java.lang.Object[] objArr59 = new java.lang.Object[1];
                                b(new char[]{16995, 54417, 30863, 38307, 10563, 35798, 8760, 48450, 12043, 6650, 39274, 59212}, 12, objArr59);
                                java.lang.Object[] objArr60 = {(java.lang.String) objArr59[0]};
                                java.lang.Object objEZpvd12 = YY.EZpvd(-924280847);
                                if (objEZpvd12 == null) {
                                    byte b3 = (byte) 0;
                                    java.lang.Object[] objArr61 = new java.lang.Object[1];
                                    c((byte) ($$a[13] - 1), b3, (byte) (b3 + 3), objArr61);
                                    objEZpvd12 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, -859284851, false, (java.lang.String) objArr61[0], new java.lang.Class[]{java.lang.String.class});
                                }
                                long jLongValue8 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd12).invoke(null, objArr60)).longValue();
                                long j54 = -158193362;
                                long j55 = -712;
                                long j56 = -1;
                                long j57 = jLongValue8 ^ j56;
                                long jNextInt = new java.util.Random().nextInt();
                                long j58 = jNextInt ^ j56;
                                long j59 = (j58 | j54) ^ j56;
                                long j60 = (((long) (-711)) * j54) + (((long) 713) * jLongValue8) + ((((j57 | j54) ^ j56) | j59) * j55) + (j55 * ((((j57 | j58) | j54) ^ j56) | ((jNextInt | (jLongValue8 | j54)) ^ j56))) + (((long) 712) * (j57 | j59)) + ((long) (-152974732));
                                int i312 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                int i313 = ~i312;
                                int i314 = (~((-1452852202) | i313)) | 8929832;
                                int i315 = ~(i312 | 1459548159);
                                int i316 = ((int) (j60 >> 32)) & (490014482 + ((i314 | i315) * (-713)) + (i315 * 1426) + ((~(15625790 | i313)) * 713));
                                int i317 = (int) java.lang.Runtime.getRuntime().totalMemory();
                                int i318 = ~i317;
                                int i319 = ~(310522814 | i318);
                                int i320 = ((int) j60) & (1951897053 + (((-2058271743) | i319) * (-712)) + (((~(i317 | (-1747748929))) | (~(i318 | 2058271742))) * (-712)) + ((1747749224 | i319) * 712));
                                if (((i316 & i320) | (i316 ^ i320)) != 0) {
                                    objArr = new java.lang.Object[]{new int[1], new int[]{(~(i & 50)) & (i | 50)}, null, new int[]{i}, null};
                                    int i321 = ~i;
                                    int i322 = ~((-394471824) | i321);
                                    int i323 = ~((-798223880) | i);
                                    int i324 = (-1707532884) + ((i322 | i323) * 1150) + (((~(798223879 | i321)) | i323) * (-575)) + (((~(i321 | 394471823)) | (~((-394471824) | i))) * 575);
                                    int iAEQbTJ5 = C3492Amv.AEQbTJ();
                                    int i325 = i324 * (-375);
                                    int i326 = (((-6000) | i325) << 1) - (i325 ^ (-6000));
                                    int i327 = ~i324;
                                    int i328 = (~((i327 & (-17)) | ((-17) ^ i327))) | iAEQbTJ5;
                                    int i329 = ~(i324 | 16);
                                    int i330 = ((i328 & i329) | (i328 ^ i329)) * 376;
                                    int i331 = (i326 ^ i330) + ((i330 & i326) << 1);
                                    int i332 = ~((~iAEQbTJ5) | 16);
                                    int i333 = ~((i324 ^ 16) | (i324 & 16));
                                    int i334 = ((i332 & i333) | (i332 ^ i333)) * (-376);
                                    int i335 = ~((iAEQbTJ5 & (-17)) | ((-17) ^ iAEQbTJ5));
                                    int i336 = i3 + (i331 ^ i334) + ((i334 & i331) << 1) + (((i335 & i324) | (i324 ^ i335)) * 376);
                                    int i337 = i336 ^ (i336 << 13);
                                    int i338 = i337 ^ (i337 >>> 17);
                                    int i339 = i338 << 5;
                                    int i340 = ((~i338) & i339) | ((~i339) & i338);
                                    c2 = 0;
                                    ((int[]) objArr[0])[0] = i340;
                                } else {
                                    java.lang.Object[] objArr62 = {new int[]{i}, new int[]{i}, null, new int[]{i}, null};
                                    int i341 = ~i;
                                    int i342 = ~((-128129948) | i341);
                                    int i343 = ~((-1064565756) | i);
                                    int i344 = i3 + (-1707532884) + ((i342 | i343) * 1150) + (((~(1064565755 | i341)) | i343) * (-575)) + (((~(i341 | 128129947)) | (~((-128129948) | i))) * 575);
                                    int i345 = i344 << 13;
                                    int i346 = (i344 | i345) & (~(i344 & i345));
                                    int i347 = i346 >>> 17;
                                    int i348 = (i346 | i347) & (~(i346 & i347));
                                    int i349 = i348 << 5;
                                    int i350 = ((~i348) & i349) | ((~i349) & i348);
                                    c2 = 0;
                                    objArr = objArr62;
                                }
                                if (((int[]) objArr[1])[c2] == i) {
                                    java.lang.Object[] objArr63 = new java.lang.Object[1];
                                    a(new char[]{24, 22, 0, 25, 5, 7, 30, 27, 21, JsonPointer.SEPARATOR, '*', 14, JsonPointer.SEPARATOR, '\r', 28, 22, '0', 21, 26, '\b'}, (byte) 33, 20, objArr63);
                                    java.lang.Object[] objArr64 = {(java.lang.String) objArr63[c2]};
                                    java.lang.Object objEZpvd13 = YY.EZpvd(-924280847);
                                    if (objEZpvd13 == null) {
                                        byte b4 = (byte) 0;
                                        java.lang.Object[] objArr65 = new java.lang.Object[1];
                                        c((byte) ($$a[13] - 1), b4, (byte) (b4 + 3), objArr65);
                                        objEZpvd13 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, -859284851, false, (java.lang.String) objArr65[0], new java.lang.Class[]{java.lang.String.class});
                                    }
                                    long jLongValue9 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd13).invoke(null, objArr64)).longValue();
                                    long j61 = -128903919;
                                    long j62 = ((j61 ^ j56) | jLongValue9) ^ j56;
                                    long j63 = i;
                                    long j64 = j63 ^ j56;
                                    long j65 = (((long) 595) * j61) + (((long) (-1187)) * jLongValue9) + (((long) (-1188)) * (j62 | ((j64 | jLongValue9) ^ j56)));
                                    long j66 = 594;
                                    long j67 = jLongValue9 ^ j56;
                                    long j68 = (j64 | j61) ^ j56;
                                    long j69 = j65 + ((j62 | ((j67 | j63) ^ j56) | j68) * j66) + (j66 * (((j67 | j61) ^ j56) | ((j67 | j64) ^ j56) | j68)) + ((long) (-182264175));
                                    int iMaxMemory2 = (int) java.lang.Runtime.getRuntime().maxMemory();
                                    int i351 = ~((-1028155591) | iMaxMemory2);
                                    int i352 = (-2085219006) + ((621281282 | i351) * (-280)) + ((i351 | (~((-409070821) | iMaxMemory2))) * CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA);
                                    int i353 = ~((-406874309) | iMaxMemory2);
                                    int i354 = ~iMaxMemory2;
                                    int i355 = ((int) (j69 >> 32)) & (i352 + (((~(i354 | (-2196513))) | i353 | (~((-621281283) | i354))) * CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA));
                                    int i356 = ~(((int) java.lang.Runtime.getRuntime().freeMemory()) | (-1240520191));
                                    if ((i355 | (((int) j69) & ((-292646229) + ((196706219 | i356) * (-220)) + ((i356 | 162551210) * 220) + 2074554502))) != 0) {
                                        objArr = new java.lang.Object[]{new int[1], new int[]{i ^ 60}, null, new int[]{i}, null};
                                        int iMyTid2 = android.os.Process.myTid();
                                        int i357 = (-865100666) + (((~((-1000747298) | iMyTid2)) | (-191948406)) * (-948)) + ((~((~iMyTid2) | (-186654754))) * (-948)) + 1334380620;
                                        int i358 = (i357 ^ 16) + ((i357 & 16) << 1);
                                        j2 = j63;
                                        int i359 = ((i3 | i358) << 1) - (i358 ^ i3);
                                        int i360 = i359 << 13;
                                        int i361 = (i359 | i360) & (~(i359 & i360));
                                        int i362 = i361 >>> 17;
                                        int i363 = (i361 | i362) & (~(i361 & i362));
                                        int i364 = i363 << 5;
                                        int i365 = (i363 | i364) & (~(i363 & i364));
                                        c3 = 0;
                                        ((int[]) objArr[0])[0] = i365;
                                    } else {
                                        j2 = j63;
                                        java.lang.Object[] objArr66 = {new int[1], new int[]{i}, null, new int[]{i}, null};
                                        int i366 = ~((int) android.os.Process.getElapsedCpuTime());
                                        int i367 = ~(899720959 | i366);
                                        int i368 = 395932498 + ((i367 | 292974743) * 764) + (((~(i366 | 292974743)) | 612402792) * (-1528)) + ((618059368 | i367) * 764);
                                        int i369 = ~i368;
                                        int i370 = ~(i369 | ((-1) ^ i369));
                                        int i371 = (i370 & i) | (i ^ i370);
                                        int i372 = ~i368;
                                        int i373 = (i368 * (-375)) + (((i371 & i372) | (i371 ^ i372)) * 376);
                                        int i374 = ~(~i);
                                        int i375 = ~i368;
                                        int i376 = i373 + (((i374 & i375) | (i374 ^ i375)) * (-376));
                                        int i377 = i368 * 376;
                                        int i378 = ((i376 | i377) << 1) - (i376 ^ i377);
                                        int i379 = ((i3 | i378) << 1) - (i378 ^ i3);
                                        int i380 = i379 ^ (i379 << 13);
                                        int i381 = i380 >>> 17;
                                        int i382 = (i380 | i381) & (~(i380 & i381));
                                        int i383 = i382 << 5;
                                        int i384 = ((~i382) & i383) | ((~i383) & i382);
                                        c3 = 0;
                                        ((int[]) objArr66[0])[0] = i384;
                                        objArr = objArr66;
                                    }
                                    if (((int[]) objArr[1])[c3] == i) {
                                        java.lang.Object[] objArr67 = new java.lang.Object[1];
                                        b(new char[]{26110, 16519, 43360, 42925, 64441, 21157, 50317, 14531, 23794, 31181, 64796, 60510, 8847, 13094, 23335, 2132, 58021, 50235, 62093, 40892, 21877, 3379, 17287, 33201, 51346, 60012, 49923, 63895, 54634, 41832, 65478, 5329, 50317, 14531, 23794, 31181}, 36, objArr67);
                                        java.lang.Object[] objArr68 = {(java.lang.String) objArr67[c3]};
                                        java.lang.Object objEZpvd14 = YY.EZpvd(1704729038);
                                        if (objEZpvd14 == null) {
                                            int i385 = $$b;
                                            java.lang.Object[] objArr69 = new java.lang.Object[1];
                                            c((byte) 5, (byte) (i385 - 5), (byte) (i385 & 15), objArr69);
                                            objEZpvd14 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1639765170, false, (java.lang.String) objArr69[0], new java.lang.Class[]{java.lang.String.class});
                                        }
                                        long jLongValue10 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd14).invoke(null, objArr68)).longValue();
                                        long j70 = 146993615;
                                        long j71 = (((long) CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA) * j70) + (((long) (-279)) * jLongValue10);
                                        long j72 = CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA;
                                        long j73 = (j70 ^ j56) | jLongValue10;
                                        long j74 = j71 + ((jLongValue10 | j2) * j72) + (((long) (-280)) * ((j73 ^ j56) | ((j64 | jLongValue10) ^ j56))) + (j72 * ((((jLongValue10 ^ j56) | j70) ^ j56) | ((j64 | j70) ^ j56) | ((j73 | j2) ^ j56))) + ((long) (-312590342));
                                        int i386 = ~i;
                                        int i387 = ((int) (j74 >> 32)) & (2046958418 + ((~(86730374 | i386)) * 979) + ((1523956785 | i) * (-979)) + (((~(86730374 | i)) | (~(1523956785 | i386))) * 979));
                                        int i388 = ~((-1878191199) | i);
                                        int i389 = ((int) j74) & ((((-2147155711) | i388) * (-196)) + 1744579737 + ((i388 | 268964512) * CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256));
                                        if (((i389 & i387) | (i387 ^ i389)) != 0) {
                                            java.lang.Object[] objArr70 = {new int[1], new int[]{(i & (-81)) | (i386 & 80)}, null, new int[]{i}, null};
                                            int i390 = 172751000 + (((~((-626839562) | i386)) | (~((-565856142) | i386))) * (-867)) + (((~((-626839562) | i)) | 555237385 | (~((-565856142) | i))) * (-1734)) + (((~((-555237386) | i386)) | (~((-71602177) | i)) | (~((-10618757) | i))) * 867);
                                            int i391 = ~i390;
                                            int i392 = ~(((-17) & i391) | ((-17) ^ i391));
                                            int i393 = ~(((-17) & i) | ((-17) ^ i));
                                            int i394 = (-7920) + (i390 * (-495)) + (((i392 & i393) | (i392 ^ i393)) * 992);
                                            int i395 = ~((i391 & (-17)) | ((-17) ^ i391));
                                            int i396 = ~(((-17) & i) | ((-17) ^ i));
                                            int i397 = (i395 & i396) | (i395 ^ i396);
                                            int i398 = (i386 ^ 16) | (i386 & 16);
                                            int i399 = (i397 | (~((i398 & i390) | (i398 ^ i390)))) * (-496);
                                            int i400 = (i394 ^ i399) + ((i399 & i394) << 1) + ((i390 | i) * 496);
                                            int iAEQbTJ6 = C3492Amv.AEQbTJ();
                                            i6 = i3;
                                            int i401 = (i400 * 367) + (i6 * 367);
                                            int i402 = -(-(((i400 ^ i6) | (i400 & i6)) * (-366)));
                                            int i403 = (i401 ^ i402) + ((i401 & i402) << 1);
                                            int i404 = ~i6;
                                            int i405 = ~((i404 & iAEQbTJ6) | (i404 ^ iAEQbTJ6));
                                            int i406 = -(-(((i405 & i400) | (i400 ^ i405)) * (-366)));
                                            int i407 = (i403 ^ i406) + ((i406 & i403) << 1);
                                            int i408 = ~i400;
                                            int i409 = ~((i408 & i6) | (i408 ^ i6));
                                            int i410 = ~i6;
                                            int i411 = (i410 ^ i400) | (i400 & i410);
                                            int i412 = ~((iAEQbTJ6 & i411) | (i411 ^ iAEQbTJ6));
                                            int i413 = ((i412 & i409) | (i409 ^ i412)) * 366;
                                            int i414 = ((i407 | i413) << 1) - (i413 ^ i407);
                                            int i415 = (i414 << 13) ^ i414;
                                            int i416 = i415 >>> 17;
                                            int i417 = ((~i415) & i416) | ((~i416) & i415);
                                            int i418 = i417 << 5;
                                            ((int[]) objArr70[0])[0] = (i417 | i418) & (~(i417 & i418));
                                            objArr2 = objArr70;
                                            c4 = 0;
                                        } else {
                                            i6 = i3;
                                            objArr2 = new java.lang.Object[]{new int[1], new int[]{i}, null, new int[]{i}, null};
                                            int iMyUid = android.os.Process.myUid();
                                            int i419 = ~iMyUid;
                                            int i420 = 1556756453 + (((~((-268509218) | iMyUid)) | (~(i419 | 285290549)) | (-924186486)) * 717) + (((~((-268509218) | i419)) | (-924186486) | (~(iMyUid | 285290549))) * 717);
                                            int iAEQbTJ7 = C3492Amv.AEQbTJ();
                                            int i421 = i420 * 407;
                                            int i422 = ~i420;
                                            int i423 = ~((i422 & iAEQbTJ7) | (i422 ^ iAEQbTJ7));
                                            int i424 = ~iAEQbTJ7;
                                            int i425 = (i423 | (~((i424 ^ i420) | (i424 & i420)))) * (-406);
                                            int i426 = (((i421 ^ i425) + ((i421 & i425) << 1)) - (~((~((~i420) | (~iAEQbTJ7))) * (-406)))) - 1;
                                            int i427 = ~(iAEQbTJ7 | ((-1) ^ iAEQbTJ7));
                                            int i428 = ~(i424 | i420);
                                            int i429 = -(-(((i427 & i428) | (i427 ^ i428)) * WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED));
                                            int i430 = i6 + (((i426 | i429) << 1) - (i429 ^ i426));
                                            int i431 = i430 ^ (i430 << 13);
                                            int i432 = i431 >>> 17;
                                            int i433 = ((~i431) & i432) | ((~i432) & i431);
                                            int i434 = i433 << 5;
                                            int i435 = ((~i433) & i434) | ((~i434) & i433);
                                            c4 = 0;
                                            ((int[]) objArr2[0])[0] = i435;
                                        }
                                        if (((int[]) objArr2[1])[c4] != i) {
                                            return objArr2;
                                        }
                                        java.lang.Object[] objArr71 = new java.lang.Object[1];
                                        a(new char[]{24, '\t', 21, 6, 21, 24, '\r', 24, 6, 21, 24, 23, '\r', 28, '\b', 29, '*', '\b', JsonPointer.SEPARATOR, '\r', 6, 22, '-', '\r', 14, 11, '-', 11, 3, '\b', 20, 26, 1, '\b', 28, 0, 21, 23, '\t', 26, 27, '!'}, (byte) 42, 42, objArr71);
                                        java.lang.Object[] objArr72 = {(java.lang.String) objArr71[c4]};
                                        java.lang.Object objEZpvd15 = YY.EZpvd(1704729038);
                                        if (objEZpvd15 == null) {
                                            int i436 = $$b;
                                            java.lang.Object[] objArr73 = new java.lang.Object[1];
                                            c((byte) 5, (byte) (i436 - 5), (byte) (i436 & 15), objArr73);
                                            objEZpvd15 = YY.EZpvd(FrameMetricsAggregator.EVERY_DURATION, 5, (char) 43308, 1639765170, false, (java.lang.String) objArr73[0], new java.lang.Class[]{java.lang.String.class});
                                        }
                                        long jLongValue11 = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd15).invoke(null, objArr72)).longValue();
                                        long j75 = 113814610;
                                        long j76 = 765;
                                        long j77 = j75 ^ j56;
                                        long j78 = jLongValue11 ^ j56;
                                        long j79 = j77 | j78;
                                        long j80 = (((long) (-1529)) * j75) + (((long) (-764)) * jLongValue11) + ((((j79 | j64) ^ j56) | (((j77 | jLongValue11) | j2) ^ j56) | (((j78 | j75) | j2) ^ j56)) * j76) + (((long) 1530) * ((j79 ^ j56) | ((j77 | j64) ^ j56))) + (j76 * (((j77 | j2) ^ j56) | ((j75 | (j78 | j64)) ^ j56))) + ((long) (-279411337));
                                        int i437 = ((int) (j80 >> 32)) & (((~(i386 | (-304088449))) * 130) + 549246294 + (((~((-304088449) | i)) | 86058) * 130));
                                        int iMyTid3 = android.os.Process.myTid();
                                        int i438 = ((int) j80) & ((-169491161) + (((~((-873122471) | iMyTid3)) | (~((~iMyTid3) | 1984618415))) * (-318)) + (((~(1946865327 | iMyTid3)) | 37753088) * (-318)) + (((~(iMyTid3 | (-1946865328))) | (-910875559)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                                        if (((i437 & i438) | (i437 ^ i438)) != 0) {
                                            java.lang.Object[] objArr74 = {new int[1], new int[]{(i & (-91)) | (i386 & 90)}, null, new int[]{i}, null};
                                            int iElapsedRealtime = (int) android.os.SystemClock.elapsedRealtime();
                                            int i439 = (-1690440462) + (((~(iElapsedRealtime | 129686681)) | (-1063009022)) * (-668)) + ((129686681 | (~((-1063009022) | iElapsedRealtime))) * 1336) + ((iElapsedRealtime | (-943989349)) * 668);
                                            int i440 = 10767 - (~(-(-(i439 * (-1343)))));
                                            int i441 = ~((i ^ 16) | (i & 16));
                                            int i442 = i440 + (((i441 & i439) | (i439 ^ i441)) * 672);
                                            int i443 = ~(((-17) & i386) | ((-17) ^ i386));
                                            int i444 = ~((i439 ^ i) | (i439 & i));
                                            int i445 = i442 + (((i443 & i444) | (i443 ^ i444)) * (-672));
                                            int i446 = ~((~i439) | i386);
                                            int i447 = ~((~i439) | 16);
                                            int i448 = -(-(((i446 & i447) | (i446 ^ i447)) * 672));
                                            int i449 = ((i445 | i448) << 1) - (i445 ^ i448);
                                            int i450 = ((i6 | i449) << 1) - (i6 ^ i449);
                                            int i451 = i450 << 13;
                                            int i452 = (i450 | i451) & (~(i450 & i451));
                                            int i453 = i452 >>> 17;
                                            int i454 = ((~i452) & i453) | ((~i453) & i452);
                                            ((int[]) objArr74[0])[0] = i454 ^ (i454 << 5);
                                            return objArr74;
                                        }
                                        java.lang.Object[] objArr75 = {new int[1], new int[]{i}, null, new int[]{i}, null};
                                        int i455 = (~((-1118825451) | i)) | 2567080;
                                        int i456 = ~(i386 | 1190128622);
                                        int i457 = (-1895743994) + ((i455 | i456) * (-470)) + (((~((-1116258371) | i)) | i456) * 470);
                                        int iAEQbTJ8 = C3492Amv.AEQbTJ();
                                        int i458 = i457 * 989;
                                        int i459 = -(-(i6 * (-987)));
                                        int i460 = (i458 & i459) + (i458 | i459);
                                        int i461 = ~i6;
                                        int i462 = ~iAEQbTJ8;
                                        int i463 = ~((i461 & i462) | (i461 ^ i462) | i457);
                                        int i464 = (i457 ^ i6) | (i457 & i6);
                                        int i465 = ~((i464 & iAEQbTJ8) | (i464 ^ iAEQbTJ8));
                                        int i466 = i460 + (((i463 & i465) | (i463 ^ i465)) * 988);
                                        int i467 = ~i6;
                                        int i468 = -(-(((i457 ^ i467) | (i457 & i467)) * (-988)));
                                        int i469 = ((i466 | i468) << 1) - (i466 ^ i468);
                                        int i470 = ~i457;
                                        int i471 = ~((i470 & i467) | (i470 ^ i467));
                                        int i472 = ~((iAEQbTJ8 & i467) | (i467 ^ iAEQbTJ8));
                                        int i473 = (i462 ^ i457) | (i457 & i462);
                                        int i474 = ((i472 & i471) | (i471 ^ i472) | (~((i473 & i6) | (i473 ^ i6)))) * 988;
                                        int i475 = ((i469 | i474) << 1) - (i474 ^ i469);
                                        int i476 = i475 << 13;
                                        int i477 = (i476 & (~i475)) | ((~i476) & i475);
                                        int i478 = i477 >>> 17;
                                        int i479 = (i477 | i478) & (~(i477 & i478));
                                        int i480 = i479 << 5;
                                        ((int[]) objArr75[0])[0] = (i479 | i480) & (~(i479 & i480));
                                        return objArr75;
                                    }
                                }
                            }
                        } catch (java.lang.Throwable th16) {
                            java.lang.Throwable cause7 = th16.getCause();
                            if (cause7 != null) {
                                throw cause7;
                            }
                            throw th16;
                        }
                    }
                    return objArr;
                    try {
                        try {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            objEZpvd = YY.EZpvd(907718786);
                            if (objEZpvd == null) {
                                byte b5 = (byte) 0;
                                try {
                                    java.lang.Object[] objArr76 = new java.lang.Object[1];
                                    c(b5, $$a[9], b5, objArr76);
                                    objEZpvd = YY.EZpvd(353, 5, (char) 49035, 842694142, false, (java.lang.String) objArr76[0], null);
                                } catch (java.lang.Exception unused10) {
                                    java.lang.Object[] objArr77 = new java.lang.Object[1];
                                    a(new char[]{20, '\"', JsonPointer.SEPARATOR, AbstractJsonLexerKt.COMMA, '\r', 11, '#', 2, '\t', '#', 25, 15, '\r', 26, 5, 7, ')', 23, '#', AbstractJsonLexerKt.COMMA, 14, 11, 26, '\b', 13856, 13856, 13803}, (byte) 55, 27, objArr77);
                                    throw new java.io.IOException((java.lang.String) objArr77[0]);
                                }
                            }
                            sb2.append(((java.lang.reflect.Field) objEZpvd).get(objNewInstance).toString());
                            objEZpvd2 = YY.EZpvd(907718786);
                            if (objEZpvd2 == null) {
                                byte b6 = (byte) 0;
                                java.lang.Object[] objArr78 = new java.lang.Object[1];
                                c(b6, $$a[9], b6, objArr78);
                                objEZpvd2 = YY.EZpvd(353, 5, (char) 49035, 842694142, false, (java.lang.String) objArr78[0], null);
                            }
                            sb2.append(((java.lang.reflect.Field) objEZpvd2).get(objNewInstance2).toString());
                            java.lang.String string2 = sb2.toString();
                        } catch (java.io.IOException unused11) {
                        }
                        try {
                            java.lang.Object[] objArr79 = new java.lang.Object[1];
                            b(new char[]{41431, 13929}, 1, objArr79);
                            java.lang.String[] strArrSplit3 = string2.split((java.lang.String) objArr79[0]);
                            length2 = strArrSplit3.length;
                            i11 = 0;
                            while (i11 < length2) {
                                java.lang.String str20 = strArrSplit3[i11];
                                java.lang.Object[] objArr80 = new java.lang.Object[1];
                                b(new char[]{59392, 2814, 13727, 47916, 23226, 44097, 44471, 12336, 60475, 2008, 56347, 6645, 2404, 54052, 48727, 9475, 36356, 29419, 31095, 33778}, 19, objArr80);
                                if (!str20.startsWith((java.lang.String) objArr80[0])) {
                                    java.lang.Object[] objArr81 = new java.lang.Object[1];
                                    b(new char[]{59392, 2814, 13727, 47916, 23226, 44097, 44471, 12336, 60475, 2008, 56347, 6645, 21877, 3379, 17287, 33201, 51346, 60012, 26312, 52131}, 20, objArr81);
                                    if (!str20.startsWith((java.lang.String) objArr81[0])) {
                                        try {
                                            try {
                                                java.lang.Object[] objArr82 = new java.lang.Object[1];
                                                b(new char[]{59392, 2814, 13727, 47916, 23226, 44097, 44471, 12336}, 8, objArr82);
                                                if (str20.startsWith((java.lang.String) objArr82[0])) {
                                                    java.lang.Object[] objArr83 = new java.lang.Object[1];
                                                    b(new char[]{49874, 32978}, 1, objArr83);
                                                    ?? Split = str20.split((java.lang.String) objArr83[0]);
                                                    if (Split.length > 1 && Split[1].equalsIgnoreCase(r9)) {
                                                        java.lang.String str21 = (java.lang.String) java.lang.Class.forName(str4).getField(str7).get(r7);
                                                        ((int[]) objArr[3])[0] = i;
                                                        ((int[]) objArr[1])[0] = i ^ 20;
                                                        objArr = new java.lang.Object[]{new int[1], new int[1], null, new int[1], str21};
                                                        int iFreeMemory2 = (int) java.lang.Runtime.getRuntime().freeMemory();
                                                        int i481 = ~iFreeMemory2;
                                                        int i482 = (~((-312151979) | i481)) | 42141698;
                                                        int i483 = ~(iFreeMemory2 | (-610533445));
                                                        int i484 = (-343693372) + ((i482 | i483) * (-713)) + (i483 * 1426) + ((~((-880543725) | i481)) * 713);
                                                        int iAEQbTJ9 = C3492Amv.AEQbTJ();
                                                        int i485 = ~i484;
                                                        int i486 = ~((i485 & (-17)) | ((-17) ^ i485));
                                                        int i487 = ~(((-17) & iAEQbTJ9) | ((-17) ^ iAEQbTJ9));
                                                        int i488 = (((-7920) + (i484 * (-495))) - (~(((i486 & i487) | (i486 ^ i487)) * 992))) - 1;
                                                        int i489 = ~((~i484) | (-17));
                                                        int i490 = ~(((-17) & iAEQbTJ9) | ((-17) ^ iAEQbTJ9));
                                                        int i491 = (i489 & i490) | (i489 ^ i490);
                                                        int i492 = ~iAEQbTJ9;
                                                        int i493 = ~((i492 & 16) | (i492 ^ 16) | i484);
                                                        int i494 = -(-(((i491 & i493) | (i491 ^ i493)) * (-496)));
                                                        int i495 = (i488 & i494) + (i494 | i488);
                                                        int i496 = ((iAEQbTJ9 & i484) | (i484 ^ iAEQbTJ9)) * 496;
                                                        int i497 = (i3 - (~(-(-((i495 ^ i496) + ((i496 & i495) << 1)))))) - 1;
                                                        int i498 = i497 << 13;
                                                        int i499 = ((~i497) & i498) | ((~i498) & i497);
                                                        int i500 = i499 >>> 17;
                                                        int i501 = (i499 | i500) & (~(i499 & i500));
                                                        int i502 = i501 << 5;
                                                        int i503 = ((~i501) & i502) | ((~i502) & i501);
                                                        c = 0;
                                                        ((int[]) objArr[0])[0] = i503;
                                                        i4 = i3;
                                                        i5 = 1;
                                                        if (((int[]) objArr[i5])[c] == i) {
                                                        }
                                                        return objArr;
                                                    }
                                                }
                                            } catch (java.io.IOException unused12) {
                                                length = i3;
                                                r6 = r7;
                                                r2 = r30;
                                                i9 = 1;
                                                r7 = r35 + 1;
                                                i8 = length;
                                                length = r322 == true ? 1 : 0;
                                                r30 = r30;
                                                r322 = r322;
                                                r35 = r35;
                                            }
                                        } catch (java.io.IOException unused13) {
                                            i10 = i3;
                                            length = i10;
                                            r6 = r7;
                                            r2 = r30;
                                            i9 = 1;
                                            r7 = r35 + 1;
                                            i8 = length;
                                            length = r322 == true ? 1 : 0;
                                            r30 = r30;
                                            r322 = r322;
                                            r35 = r35;
                                        }
                                    }
                                }
                                int i504 = i11 + 49;
                                i11 = (i504 | (-48)) + (i504 & (-48));
                            }
                            length = i3;
                        } catch (java.io.IOException unused14) {
                            i10 = i3;
                        }
                        r6 = r7;
                        r2 = r30;
                        i9 = 1;
                        r7 = r35 + 1;
                        i8 = length;
                        length = r322 == true ? 1 : 0;
                        r30 = r30;
                        r322 = r322;
                        r35 = r35;
                    } catch (java.lang.Exception unused15) {
                        java.lang.Object[] objArr772 = new java.lang.Object[1];
                        a(new char[]{20, '\"', JsonPointer.SEPARATOR, AbstractJsonLexerKt.COMMA, '\r', 11, '#', 2, '\t', '#', 25, 15, '\r', 26, 5, 7, ')', 23, '#', AbstractJsonLexerKt.COMMA, 14, 11, 26, '\b', 13856, 13856, 13803}, (byte) 55, 27, objArr772);
                        throw new java.io.IOException((java.lang.String) objArr772[0]);
                    }
                    try {
                        try {
                            java.lang.Class<?> cls10 = java.lang.Class.forName(str5);
                            java.lang.Object[] objArr84 = new java.lang.Object[1];
                            a(new char[]{'#', 14, JsonPointer.SEPARATOR, '*'}, (byte) 77, 4, objArr84);
                            cls10.getMethod((java.lang.String) objArr84[0], java.lang.Long.TYPE).invoke(objNewInstance, 100L);
                            try {
                                java.lang.Class<?> cls11 = java.lang.Class.forName(str5);
                                java.lang.Object[] objArr85 = new java.lang.Object[1];
                                a(new char[]{'#', 14, JsonPointer.SEPARATOR, '*'}, (byte) 77, 4, objArr85);
                                cls11.getMethod((java.lang.String) objArr85[0], java.lang.Long.TYPE).invoke(objNewInstance2, 10L);
                                try {
                                    try {
                                        processExec.destroy();
                                    } catch (java.io.IOException unused16) {
                                        length = i3;
                                        r7 = r7;
                                    }
                                } catch (java.lang.Exception unused17) {
                                }
                                java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                                objEZpvd = YY.EZpvd(907718786);
                                if (objEZpvd == null) {
                                }
                                sb22.append(((java.lang.reflect.Field) objEZpvd).get(objNewInstance).toString());
                                objEZpvd2 = YY.EZpvd(907718786);
                                if (objEZpvd2 == null) {
                                }
                                sb22.append(((java.lang.reflect.Field) objEZpvd2).get(objNewInstance2).toString());
                                java.lang.String string22 = sb22.toString();
                                java.lang.Object[] objArr792 = new java.lang.Object[1];
                                b(new char[]{41431, 13929}, 1, objArr792);
                                java.lang.String[] strArrSplit32 = string22.split((java.lang.String) objArr792[0]);
                                length2 = strArrSplit32.length;
                                i11 = 0;
                                while (i11 < length2) {
                                }
                                length = i3;
                                r6 = r7;
                                r2 = r30;
                                i9 = 1;
                                r7 = r35 + 1;
                                i8 = length;
                                length = r322 == true ? 1 : 0;
                                r30 = r30;
                                r322 = r322;
                                r35 = r35;
                            } catch (java.lang.Throwable th17) {
                                java.lang.Throwable cause8 = th17.getCause();
                                if (cause8 != null) {
                                    throw cause8;
                                }
                                throw th17;
                            }
                        } catch (java.lang.Throwable th18) {
                            java.lang.Throwable cause9 = th18.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th18;
                        }
                    } catch (java.lang.InterruptedException e5) {
                        interruptedException = e5;
                        throw interruptedException;
                    } catch (java.lang.Throwable th19) {
                        th = th19;
                        processExec.destroy();
                        throw th;
                    }
                    length = i3;
                    r6 = r7;
                    r2 = r30;
                    i9 = 1;
                    r7 = r35 + 1;
                    i8 = length;
                    length = r322 == true ? 1 : 0;
                    r30 = r30;
                    r322 = r322;
                    r35 = r35;
                } catch (java.lang.Throwable th20) {
                    java.lang.Throwable cause10 = th20.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th20;
                }
            }
        })).byteValue();
    }

    public static final byte isSegregatedAccount$lambda$10$lambda$9(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_method_buysellfeaturerestrictionutil_is_segregated_account(j, uniffiRustCallStatus);
    }
}
