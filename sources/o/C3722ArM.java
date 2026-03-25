package o;

import com.google.common.base.Ascii;
import com.okinc.base.bugreport.DetectionInfoBean;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C44103sDl;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.buy_sell.BuySellFormatterException;
import uniffi.buy_sell.FfiConverterBoolean;
import uniffi.buy_sell.FfiConverterString;
import uniffi.buy_sell.FfiConverterTypeBSCQuickConvertInteractor;
import uniffi.buy_sell.FfiConverterTypeBSCQuickConvertState;
import uniffi.buy_sell.FfiConverterTypeBuySellFormatter;
import uniffi.buy_sell.FfiConverterTypeBuySellOrderDetailDependencies;
import uniffi.buy_sell.FfiConverterTypeBuySellOrderDetailInteractor;
import uniffi.buy_sell.FfiConverterTypeBuySellOrderDetailState;
import uniffi.buy_sell.FfiConverterTypeRecurringBuyPlanDetailDependencies;
import uniffi.buy_sell.FfiConverterTypeRecurringBuyPlanDetailInteractor;
import uniffi.buy_sell.FfiConverterTypeRecurringBuyPlanDetailState;
import uniffi.buy_sell.FfiConverterTypeRecurringBuyPlanListDependencies;
import uniffi.buy_sell.FfiConverterTypeRecurringBuyPlanListInteractor;
import uniffi.buy_sell.FfiConverterTypeRecurringBuyPlanListState;
import uniffi.buy_sell.FfiConverterTypeRecurringBuyPlanOrderListDependencies;
import uniffi.buy_sell.FfiConverterTypeRecurringBuyPlanOrderListInteractor;
import uniffi.buy_sell.FfiConverterTypeRecurringBuyPlanOrderListState;
import uniffi.buy_sell.FfiConverterTypeRoundingMode;
import uniffi.buy_sell.FfiConverterUInt;
import uniffi.buy_sell.IntegrityCheckingUniffiLib;
import uniffi.buy_sell.RoundingMode;
import uniffi.buy_sell.UniffiLib;

/* JADX INFO: renamed from: o.ArM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C3722ArM {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new StateListAnimator());

    /* JADX INFO: renamed from: o.ArM$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_buy_sell_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_buy_sell_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_buy_sell_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }

    public static final boolean bSCQuickConvertStateIsEqual(@NotNull final C3652Apw c3652Apw, @NotNull final C3652Apw c3652Apw2) {
        Intrinsics.checkNotNullParameter(c3652Apw, "");
        Intrinsics.checkNotNullParameter(c3652Apw2, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.ArQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C3722ArM.bSCQuickConvertStateIsEqual$lambda$0(c3652Apw, c3652Apw2, (UniffiRustCallStatus) obj));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte bSCQuickConvertStateIsEqual$lambda$0(C3652Apw c3652Apw, C3652Apw c3652Apw2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterTypeBSCQuickConvertState ffiConverterTypeBSCQuickConvertState = FfiConverterTypeBSCQuickConvertState.INSTANCE;
        return uniffiLib.uniffi_buy_sell_fn_func_b_s_c_quick_convert_state_is_equal(ffiConverterTypeBSCQuickConvertState.lower2((java.lang.Object) c3652Apw), ffiConverterTypeBSCQuickConvertState.lower2((java.lang.Object) c3652Apw2), uniffiRustCallStatus);
    }

    public static final boolean buySellOrderDetailStateIsEqual(@NotNull final C3760Ary c3760Ary, @NotNull final C3760Ary c3760Ary2) {
        Intrinsics.checkNotNullParameter(c3760Ary, "");
        Intrinsics.checkNotNullParameter(c3760Ary2, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.ArY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C3722ArM.buySellOrderDetailStateIsEqual$lambda$1(c3760Ary, c3760Ary2, (UniffiRustCallStatus) obj));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte buySellOrderDetailStateIsEqual$lambda$1(C3760Ary c3760Ary, C3760Ary c3760Ary2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterTypeBuySellOrderDetailState ffiConverterTypeBuySellOrderDetailState = FfiConverterTypeBuySellOrderDetailState.INSTANCE;
        return uniffiLib.uniffi_buy_sell_fn_func_buy_sell_order_detail_state_is_equal(ffiConverterTypeBuySellOrderDetailState.lower2((java.lang.Object) c3760Ary), ffiConverterTypeBuySellOrderDetailState.lower2((java.lang.Object) c3760Ary2), uniffiRustCallStatus);
    }

    public static final C3634Ape createBscQuickConvertInteractor() {
        return FfiConverterTypeBSCQuickConvertInteractor.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.ArZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C3722ArM.createBscQuickConvertInteractor$lambda$2((UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long createBscQuickConvertInteractor$lambda$2(UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_func_create_bsc_quick_convert_interactor(uniffiRustCallStatus);
    }

    public static final C3738Arc createBuySellOrderDetailInteractor(@NotNull final C3740Are c3740Are) {
        Intrinsics.checkNotNullParameter(c3740Are, "");
        return FfiConverterTypeBuySellOrderDetailInteractor.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.ArS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C3722ArM.createBuySellOrderDetailInteractor$lambda$3(c3740Are, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long createBuySellOrderDetailInteractor$lambda$3(C3740Are c3740Are, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_func_create_buy_sell_order_detail_interactor(FfiConverterTypeBuySellOrderDetailDependencies.INSTANCE.lower2((java.lang.Object) c3740Are), uniffiRustCallStatus);
    }

    public static final C3766AsD createRecurringBuyPlanDetailInteractor(@NotNull final C3763AsA c3763AsA) {
        Intrinsics.checkNotNullParameter(c3763AsA, "");
        return FfiConverterTypeRecurringBuyPlanDetailInteractor.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.ArU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C3722ArM.createRecurringBuyPlanDetailInteractor$lambda$4(c3763AsA, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long createRecurringBuyPlanDetailInteractor$lambda$4(C3763AsA c3763AsA, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_func_create_recurring_buy_plan_detail_interactor(FfiConverterTypeRecurringBuyPlanDetailDependencies.INSTANCE.lower2((java.lang.Object) c3763AsA), uniffiRustCallStatus);
    }

    public static final C3833AtR createRecurringBuyPlanListInteractor(@NotNull final C3835AtT c3835AtT) {
        Intrinsics.checkNotNullParameter(c3835AtT, "");
        return FfiConverterTypeRecurringBuyPlanListInteractor.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.ArR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C3722ArM.createRecurringBuyPlanListInteractor$lambda$5(c3835AtT, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long createRecurringBuyPlanListInteractor$lambda$5(C3835AtT c3835AtT, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_func_create_recurring_buy_plan_list_interactor(FfiConverterTypeRecurringBuyPlanListDependencies.INSTANCE.lower2((java.lang.Object) c3835AtT), uniffiRustCallStatus);
    }

    public static final C3879AuK createRecurringBuyPlanOrderListInteractor(@NotNull final C3882AuN c3882AuN) {
        Intrinsics.checkNotNullParameter(c3882AuN, "");
        return FfiConverterTypeRecurringBuyPlanOrderListInteractor.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.ArN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(C3722ArM.createRecurringBuyPlanOrderListInteractor$lambda$6(c3882AuN, (UniffiRustCallStatus) obj));
            }
        })).longValue());
    }

    public static final long createRecurringBuyPlanOrderListInteractor$lambda$6(C3882AuN c3882AuN, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_func_create_recurring_buy_plan_order_list_interactor(FfiConverterTypeRecurringBuyPlanOrderListDependencies.INSTANCE.lower2((java.lang.Object) c3882AuN), uniffiRustCallStatus);
    }

    /* JADX INFO: renamed from: cryptoFormatterFormat-hJeF8fQ, reason: not valid java name */
    public static final java.lang.String m8083cryptoFormatterFormathJeF8fQ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final RoundingMode roundingMode, final int i) throws BuySellFormatterException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCallWithError(uniffiRustBuffer, BuySellFormatterException.ErrorHandler, new Function1() { // from class: o.ArX
            private static final byte[] $$c = {Ascii.US, 98, -75, Ascii.DC4};
            private static final int $$d = 180;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {88, 37, -69, 48, 4, -7, 1, -29, -7, -7, -13, Ascii.FF, -17, 0, -11, Ascii.RS, 0, -17, -5};
            private static final int $$b = 226;
            private static int AYXKKw = 0;
            private static int AhwBna = 1;
            private static char[] EZpvd = {11788, 11831, 11784, 11789, 11824, 11794, 11802, 11822, 11801, 11827, 11825, 11785, 11833, 11790, 11804, 11800, 11797, 11793, 11837, 11795, 11826, 11835, 11844, 11799, 11807, 11798, 11870, 11780, 11820, 11792, 11803, 11787, 11805, 11791, 11786, 11834};
            private static char gEmmrt = 7138;
            private static int djBIcL = 1694165160;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static java.lang.String $$e(int i2, short s, byte b) {
                int i3;
                int i4 = 120 - s;
                int i5 = i2 * 2;
                int i6 = b + 4;
                byte[] bArr = $$c;
                byte[] bArr2 = new byte[i5 + 1];
                if (bArr == null) {
                    i4 = i5;
                    int i7 = i6;
                    int i8 = 0;
                    i4 += i6;
                    i6 = i7;
                    i3 = i8;
                    int i9 = i6 + 1;
                    bArr2[i3] = (byte) i4;
                    i8 = i3 + 1;
                    if (i3 == i5) {
                        return new java.lang.String(bArr2, 0);
                    }
                    i7 = i9;
                    i6 = bArr[i9];
                    i4 += i6;
                    i6 = i7;
                    i3 = i8;
                    int i92 = i6 + 1;
                    bArr2[i3] = (byte) i4;
                    i8 = i3 + 1;
                    if (i3 == i5) {
                    }
                } else {
                    i3 = 0;
                    int i922 = i6 + 1;
                    bArr2[i3] = (byte) i4;
                    i8 = i3 + 1;
                    if (i3 == i5) {
                    }
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void c(byte b, int i2, int i3, java.lang.Object[] objArr) {
                int i4;
                int i5;
                int i6 = 13 - (b * 10);
                int i7 = 11 - (i3 * 5);
                int i8 = (i2 * 20) + 79;
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[i7];
                if (bArr == null) {
                    int i9 = i7;
                    i5 = 0;
                    i8 = i8 + i9 + 8;
                    i4 = i5;
                    i5 = i4 + 1;
                    bArr2[i4] = (byte) i8;
                    if (i5 == i7) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i6++;
                    i9 = bArr[i6];
                    i8 = i8 + i9 + 8;
                    i4 = i5;
                    i5 = i4 + 1;
                    bArr2[i4] = (byte) i8;
                    if (i5 == i7) {
                    }
                } else {
                    i4 = 0;
                    i5 = i4 + 1;
                    bArr2[i4] = (byte) i8;
                    if (i5 == i7) {
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                int i2 = 2 % 2;
                int i3 = AhwBna + 65;
                AYXKKw = i3 % 128;
                int i4 = i3 % 2;
                java.lang.String str3 = str;
                if (i4 == 0) {
                    return C3722ArM.cryptoFormatterFormat_hJeF8fQ$lambda$7(str3, str2, roundingMode, i, (UniffiRustCallStatus) obj);
                }
                C3722ArM.cryptoFormatterFormat_hJeF8fQ$lambda$7(str3, str2, roundingMode, i, (UniffiRustCallStatus) obj);
                java.lang.Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [129=6] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            private static void b(int i2, char[] cArr, int i3, int i4, boolean z, java.lang.Object[] objArr) throws java.lang.Throwable {
                int i5;
                int i6 = 2 % 2;
                Zl zl = new Zl();
                char[] cArr2 = new char[i4];
                zl.OLrzqt = 0;
                int i7 = $10 + 65;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                while (true) {
                    i5 = 654343494;
                    if (zl.OLrzqt >= i4) {
                        break;
                    }
                    zl.KWHzl = cArr[zl.OLrzqt];
                    cArr2[zl.OLrzqt] = (char) (i2 + zl.KWHzl);
                    int i9 = zl.OLrzqt;
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i9]), java.lang.Integer.valueOf(djBIcL)};
                        java.lang.Object objEZpvd = YY.EZpvd(1433686791);
                        if (objEZpvd == null) {
                            byte length = (byte) $$c.length;
                            objEZpvd = YY.EZpvd(625, 5, (char) 0, 1364500091, false, $$e((byte) 0, length, (byte) (length - 5)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                        }
                        cArr2[i9] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                        try {
                            java.lang.Object[] objArr3 = {zl, zl};
                            java.lang.Object objEZpvd2 = YY.EZpvd(654343494);
                            if (objEZpvd2 == null) {
                                byte b = (byte) 0;
                                objEZpvd2 = YY.EZpvd(625, 5, (char) 0, 589344826, false, $$e(b, (byte) (b + 5), (byte) (-1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                            }
                            ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3);
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                if (i3 > 0) {
                    int i10 = $11 + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    zl.AEQbTJ = i3;
                    char[] cArr3 = new char[i4];
                    java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i4);
                    java.lang.System.arraycopy(cArr3, 0, cArr2, i4 - zl.AEQbTJ, zl.AEQbTJ);
                    java.lang.System.arraycopy(cArr3, zl.AEQbTJ, cArr2, 0, i4 - zl.AEQbTJ);
                }
                if (z) {
                    int i12 = $11 + 61;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    char[] cArr4 = new char[i4];
                    zl.OLrzqt = 0;
                    while (zl.OLrzqt < i4) {
                        int i14 = $11 + 89;
                        $10 = i14 % 128;
                        if (i14 % 2 != 0) {
                            cArr4[zl.OLrzqt] = cArr2[(i4 - zl.OLrzqt) / 0];
                            try {
                                java.lang.Object[] objArr4 = {zl, zl};
                                java.lang.Object objEZpvd3 = YY.EZpvd(i5);
                                if (objEZpvd3 == null) {
                                    byte b2 = (byte) 0;
                                    objEZpvd3 = YY.EZpvd(625, 5, (char) 0, 589344826, false, $$e(b2, (byte) (b2 + 5), (byte) (-1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                                }
                                ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
                            } catch (java.lang.Throwable th3) {
                                java.lang.Throwable cause3 = th3.getCause();
                                if (cause3 == null) {
                                    throw th3;
                                }
                                throw cause3;
                            }
                        } else {
                            cArr4[zl.OLrzqt] = cArr2[(i4 - zl.OLrzqt) - 1];
                            try {
                                java.lang.Object[] objArr5 = {zl, zl};
                                java.lang.Object objEZpvd4 = YY.EZpvd(654343494);
                                if (objEZpvd4 == null) {
                                    byte b3 = (byte) 0;
                                    objEZpvd4 = YY.EZpvd(625, 5, (char) 0, 589344826, false, $$e(b3, (byte) (b3 + 5), (byte) (-1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                                }
                                ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5);
                            } catch (java.lang.Throwable th4) {
                                java.lang.Throwable cause4 = th4.getCause();
                                if (cause4 == null) {
                                    throw th4;
                                }
                                throw cause4;
                            }
                        }
                        i5 = 654343494;
                    }
                    cArr2 = cArr4;
                }
                java.lang.String str3 = new java.lang.String(cArr2);
                int i15 = $11 + 119;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                objArr[0] = str3;
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [195=4, 273=4, 219=4] */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            /* JADX WARN: Removed duplicated region for block: B:36:0x010d  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0142  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(int i2, char[] cArr, byte b, java.lang.Object[] objArr) throws java.lang.Throwable {
                int i3;
                int i4 = 2;
                int i5 = 2 % 2;
                Zg zg = new Zg();
                char[] cArr2 = EZpvd;
                int i6 = 555755035;
                if (cArr2 != null) {
                    int i7 = $10 + 51;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = $10 + 47;
                        $11 = i10 % 128;
                        int i11 = i10 % i4;
                        try {
                            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[i9])};
                            java.lang.Object objEZpvd = YY.EZpvd(i6);
                            if (objEZpvd == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objEZpvd = YY.EZpvd(117, 4, (char) 13956, 620817255, false, $$e(b2, b3, (byte) (b3 - 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
                            }
                            cArr3[i9] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                            i9++;
                            i4 = 2;
                            i6 = 555755035;
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
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objEZpvd2 = YY.EZpvd(117, 4, (char) 13956, 620817255, false, $$e(b4, b5, (byte) (b5 - 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
                }
                char cCharValue = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).charValue();
                char[] cArr4 = new char[i2];
                if (i2 % 2 != 0) {
                    int i12 = $10 + 89;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        i3 = i2 + 76;
                        cArr4[i3] = (char) (cArr[i3] / b);
                    } else {
                        i3 = i2 - 1;
                        cArr4[i3] = (char) (cArr[i3] - b);
                    }
                } else {
                    i3 = i2;
                }
                if (i3 > 1) {
                    zg.KWHzl = 0;
                    while (zg.KWHzl < i3) {
                        int i13 = $11 + 49;
                        $10 = i13 % 128;
                        if (i13 % 2 != 0) {
                            zg.AEQbTJ = cArr[zg.KWHzl];
                            zg.OLrzqt = cArr[zg.KWHzl];
                            if (zg.AEQbTJ == zg.OLrzqt) {
                                int i14 = $10 + 105;
                                $11 = i14 % 128;
                                if (i14 % 2 == 0) {
                                    cArr4[zg.KWHzl] = (char) (zg.AEQbTJ / b);
                                    cArr4[zg.KWHzl] = (char) (zg.OLrzqt + b);
                                } else {
                                    cArr4[zg.KWHzl] = (char) (zg.AEQbTJ - b);
                                    cArr4[zg.KWHzl + 1] = (char) (zg.OLrzqt - b);
                                }
                            } else {
                                java.lang.Object[] objArr4 = {zg, zg, java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), zg};
                                java.lang.Object objEZpvd3 = YY.EZpvd(-526958001);
                                if (objEZpvd3 == null) {
                                    byte b6 = (byte) 0;
                                    objEZpvd3 = YY.EZpvd(491, 5, (char) 30951, -457732301, false, $$e(b6, (byte) (b6 | 52), (byte) (-1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class});
                                }
                                if (((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4)).intValue() == zg.djBIcL) {
                                    java.lang.Object[] objArr5 = {zg, zg, java.lang.Integer.valueOf(cCharValue), java.lang.Integer.valueOf(cCharValue), zg, zg, java.lang.Integer.valueOf(cCharValue), java.lang.Integer.valueOf(cCharValue), zg, java.lang.Integer.valueOf(cCharValue), zg};
                                    java.lang.Object objEZpvd4 = YY.EZpvd(1348337226);
                                    if (objEZpvd4 == null) {
                                        byte b7 = (byte) 0;
                                        objEZpvd4 = YY.EZpvd(221, 5, (char) 3937, 1417491254, false, $$e(b7, (byte) (b7 | 55), (byte) (-1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class});
                                    }
                                    int iIntValue = ((java.lang.Integer) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5)).intValue();
                                    int i15 = (zg.EZpvd * cCharValue) + zg.djBIcL;
                                    cArr4[zg.KWHzl] = cArr2[iIntValue];
                                    cArr4[zg.KWHzl + 1] = cArr2[i15];
                                } else if (zg.copydefault == zg.EZpvd) {
                                    zg.AYXKKw = ((zg.AYXKKw + cCharValue) - 1) % cCharValue;
                                    zg.djBIcL = ((zg.djBIcL + cCharValue) - 1) % cCharValue;
                                    int i16 = (zg.copydefault * cCharValue) + zg.AYXKKw;
                                    int i17 = (zg.EZpvd * cCharValue) + zg.djBIcL;
                                    cArr4[zg.KWHzl] = cArr2[i16];
                                    cArr4[zg.KWHzl + 1] = cArr2[i17];
                                } else {
                                    int i18 = (zg.copydefault * cCharValue) + zg.djBIcL;
                                    int i19 = (zg.EZpvd * cCharValue) + zg.AYXKKw;
                                    cArr4[zg.KWHzl] = cArr2[i18];
                                    cArr4[zg.KWHzl + 1] = cArr2[i19];
                                }
                            }
                        } else {
                            zg.AEQbTJ = cArr[zg.KWHzl];
                            zg.OLrzqt = cArr[zg.KWHzl + 1];
                            if (zg.AEQbTJ == zg.OLrzqt) {
                            }
                        }
                        zg.KWHzl += 2;
                    }
                }
                for (int i20 = 0; i20 < i2; i20++) {
                    cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                }
                objArr[0] = new java.lang.String(cArr4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
            public static void copydefault(long j, long j2) throws java.lang.Throwable {
                java.lang.reflect.Method method;
                int i2 = 2 % 2;
                long j3 = j ^ (j2 << 32);
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(9, new char[]{23, '\f', 25, 19, 25, 24, 29, 23, 13826}, Ascii.SO, objArr);
                java.lang.Object obj = C44103sDl.class.getField((java.lang.String) objArr[0]).get(null);
                try {
                    java.lang.reflect.Constructor declaredConstructor = java.lang.StringBuilder.class.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(34, new char[]{'\r', 30, 30, 6, '\n', 24, 31, '\f', '\f', 5, ' ', 28, 31, 26, 31, '!', 15, 22, 25, 1, 0, 29, '#', 16, 6, 24, 29, 0, 2, 17, 26, 30, 22, 28}, (byte) 47, objArr2);
                    java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    b(284, new char[]{65531, 5, 65532, 7, 7, 65528}, 6, 6, true, objArr4);
                    java.lang.reflect.Method method2 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr4[0], java.lang.String.class);
                    method2.setAccessible(true);
                    method2.invoke(objNewInstance, objArr3);
                    java.lang.Object[] objArr5 = {java.lang.Long.valueOf(j3)};
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(284, new char[]{65531, 5, 65532, 7, 7, 65528}, 6, 6, true, objArr6);
                    java.lang.reflect.Method method3 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr6[0], java.lang.Long.TYPE);
                    method3.setAccessible(true);
                    method3.invoke(objNewInstance, objArr5);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(22, new char[]{30, 31, '#', 31, '!', '#', 29, 23, '#', 5, 18, 29, 11, 23, '\t', '\n', 25, 24, 26, 6, 0, 6}, (byte) 110, objArr7);
                    java.lang.String str3 = (java.lang.String) objArr7[0];
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(286, new char[]{'\t', 4, 65512, '\t', 7, 65534, 3, 65532}, 8, 8, false, objArr8);
                    java.lang.reflect.Method method4 = java.lang.StringBuilder.class.getMethod((java.lang.String) objArr8[0], null);
                    method4.setAccessible(true);
                    java.lang.Object objInvoke = method4.invoke(objNewInstance, null);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a(3, new char[]{21, 1, 13892}, (byte) 71, objArr9);
                    java.lang.String str4 = (java.lang.String) objArr9[0];
                    int i3 = AhwBna + 83;
                    AYXKKw = i3 % 128;
                    int i4 = i3 % 2;
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    a(21, new char[]{31, 26, 31, '!', 22, '\n', 16, '#', 1, '\"', 13848, 13848, 6, 25, 6, 30, 18, 31, '#', 31, 13834}, (byte) 34, objArr10);
                    java.lang.reflect.Method method5 = Intrinsics.class.getMethod((java.lang.String) objArr10[0], java.lang.Object.class, java.lang.String.class);
                    method5.setAccessible(true);
                    method5.invoke(null, objInvoke, str4);
                    if (!pUU.class.getField("AEQbTJ").getBoolean(null)) {
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        a(23, new char[]{16, 22, 23, 14, 14, ' ', 21, 5, 27, 24, 16, '#', 29, 20, '#', 29, '#', 22, 29, 0, 21, 29, 13848}, Ascii.EM, objArr11);
                        java.lang.String string = ((java.lang.String) objArr11[0]).toString();
                        int i5 = AYXKKw + 77;
                        AhwBna = i5 % 128;
                        if (i5 % 2 != 0) {
                            java.lang.Object[] objArr12 = {string};
                            java.lang.reflect.Constructor declaredConstructor2 = java.lang.IllegalStateException.class.getDeclaredConstructor(java.lang.String.class);
                            declaredConstructor2.setAccessible(true);
                            throw ((java.lang.Throwable) declaredConstructor2.newInstance(objArr12));
                        }
                        java.lang.Object[] objArr13 = new java.lang.Object[0];
                        objArr13[0] = string;
                        java.lang.Class[] clsArr = new java.lang.Class[0];
                        clsArr[1] = java.lang.String.class;
                        java.lang.reflect.Constructor declaredConstructor3 = java.lang.IllegalStateException.class.getDeclaredConstructor(clsArr);
                        declaredConstructor3.setAccessible(true);
                        throw ((java.lang.Throwable) declaredConstructor3.newInstance(objArr13));
                    }
                    int i6 = AYXKKw + 15;
                    AhwBna = i6 % 128;
                    if (i6 % 2 == 0) {
                        pUU.class.getField("copydefault").get(null);
                        throw null;
                    }
                    java.lang.Object obj2 = pUU.class.getField("copydefault").get(null);
                    java.lang.reflect.Method method6 = Intrinsics.class.getMethod("copydefault", java.lang.Object.class);
                    method6.setAccessible(true);
                    method6.invoke(null, obj2);
                    java.lang.Object[] objArr14 = {str3, objInvoke};
                    java.lang.reflect.Method method7 = pUP.class.getMethod("OLrzqt", java.lang.String.class, java.lang.String.class);
                    method7.setAccessible(true);
                    method7.invoke(obj2, objArr14);
                    byte[] bArr = $$a;
                    byte b = bArr[6];
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    c(b, b, bArr[13], objArr15);
                    java.lang.reflect.Method method8 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr15[0], null);
                    method8.setAccessible(true);
                    java.lang.Object objInvoke2 = method8.invoke(obj, null);
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    a(19, new char[]{21, 5, 25, '\"', 13883, 13883, 29, '#', 7, 2, 27, 23, 25, 1, 0, 29, '#', 16, 13871}, (byte) 71, objArr16);
                    DetectionInfoBean.class.getField((java.lang.String) objArr16[0]).setBoolean(objInvoke2, true);
                    byte b2 = bArr[6];
                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                    c(b2, b2, bArr[13], objArr17);
                    java.lang.reflect.Method method9 = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr17[0], null);
                    method9.setAccessible(true);
                    java.lang.Object objInvoke3 = method9.invoke(obj, null);
                    java.lang.Long lValueOf = java.lang.Long.valueOf(j3);
                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                    a(9, new char[]{'\f', 0, '\r', ' ', 7, 2, 27, 17, 13906}, (byte) 93, objArr18);
                    DetectionInfoBean.class.getField((java.lang.String) objArr18[0]).set(objInvoke3, lValueOf);
                    int i7 = AhwBna + 35;
                    AYXKKw = i7 % 128;
                    if (i7 % 2 != 0) {
                        byte b3 = bArr[13];
                        byte b4 = bArr[6];
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        c(b3, b3, b4, objArr19);
                        method = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr19[0], null);
                        method.setAccessible(true);
                    } else {
                        byte b5 = bArr[13];
                        byte b6 = bArr[6];
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        c(b5, b5, b6, objArr20);
                        method = C44103sDl.ActionBar.class.getMethod((java.lang.String) objArr20[0], null);
                        method.setAccessible(true);
                    }
                    method.invoke(obj, null);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }));
    }

    public static final RustBuffer.ByValue cryptoFormatterFormat_hJeF8fQ$lambda$7(java.lang.String str, java.lang.String str2, RoundingMode roundingMode, int i, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_buy_sell_fn_func_crypto_formatter_format(ffiConverterString.lower2(str), ffiConverterString.lower2(str2), FfiConverterTypeRoundingMode.INSTANCE.lower2((java.lang.Object) roundingMode), FfiConverterUInt.INSTANCE.m9552lowerWZ4Q5Ns(i).intValue(), uniffiRustCallStatus);
    }

    /* JADX INFO: renamed from: fiatFormatterFormatExchangeRate-Urd2D_w, reason: not valid java name */
    public static final java.lang.String m8084fiatFormatterFormatExchangeRateUrd2D_w(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final RoundingMode roundingMode, final int i) throws BuySellFormatterException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCallWithError(uniffiRustBuffer, BuySellFormatterException.ErrorHandler, new Function1() { // from class: o.ArK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3722ArM.fiatFormatterFormatExchangeRate_Urd2D_w$lambda$8(str, str2, str3, str4, roundingMode, i, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue fiatFormatterFormatExchangeRate_Urd2D_w$lambda$8(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, RoundingMode roundingMode, int i, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_buy_sell_fn_func_fiat_formatter_format_exchange_rate(ffiConverterString.lower2(str), ffiConverterString.lower2(str2), ffiConverterString.lower2(str3), ffiConverterString.lower2(str4), FfiConverterTypeRoundingMode.INSTANCE.lower2((java.lang.Object) roundingMode), FfiConverterUInt.INSTANCE.m9552lowerWZ4Q5Ns(i).intValue(), uniffiRustCallStatus);
    }

    /* JADX INFO: renamed from: fiatFormatterFormatWithCodeMax-hJeF8fQ, reason: not valid java name */
    public static final java.lang.String m8085fiatFormatterFormatWithCodeMaxhJeF8fQ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final RoundingMode roundingMode, final int i) throws BuySellFormatterException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCallWithError(uniffiRustBuffer, BuySellFormatterException.ErrorHandler, new Function1() { // from class: o.ArL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3722ArM.fiatFormatterFormatWithCodeMax_hJeF8fQ$lambda$9(str, str2, roundingMode, i, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue fiatFormatterFormatWithCodeMax_hJeF8fQ$lambda$9(java.lang.String str, java.lang.String str2, RoundingMode roundingMode, int i, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_buy_sell_fn_func_fiat_formatter_format_with_code_max(ffiConverterString.lower2(str), ffiConverterString.lower2(str2), FfiConverterTypeRoundingMode.INSTANCE.lower2((java.lang.Object) roundingMode), FfiConverterUInt.INSTANCE.m9552lowerWZ4Q5Ns(i).intValue(), uniffiRustCallStatus);
    }

    /* JADX INFO: renamed from: fiatFormatterFormatWithCodeMinmax-LRKxwks, reason: not valid java name */
    public static final java.lang.String m8086fiatFormatterFormatWithCodeMinmaxLRKxwks(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final RoundingMode roundingMode, final int i, final int i2) throws BuySellFormatterException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCallWithError(uniffiRustBuffer, BuySellFormatterException.ErrorHandler, new Function1() { // from class: o.Asb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3722ArM.fiatFormatterFormatWithCodeMinmax_LRKxwks$lambda$10(str, str2, roundingMode, i, i2, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue fiatFormatterFormatWithCodeMinmax_LRKxwks$lambda$10(java.lang.String str, java.lang.String str2, RoundingMode roundingMode, int i, int i2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        RustBuffer.ByValue byValueLower2 = ffiConverterString.lower2(str);
        RustBuffer.ByValue byValueLower22 = ffiConverterString.lower2(str2);
        RustBuffer.ByValue byValueLower23 = FfiConverterTypeRoundingMode.INSTANCE.lower2((java.lang.Object) roundingMode);
        FfiConverterUInt ffiConverterUInt = FfiConverterUInt.INSTANCE;
        return uniffiLib.uniffi_buy_sell_fn_func_fiat_formatter_format_with_code_minmax(byValueLower2, byValueLower22, byValueLower23, ffiConverterUInt.m9552lowerWZ4Q5Ns(i).intValue(), ffiConverterUInt.m9552lowerWZ4Q5Ns(i2).intValue(), uniffiRustCallStatus);
    }

    /* JADX INFO: renamed from: fiatFormatterFormatWithSymbolMax-hJeF8fQ, reason: not valid java name */
    public static final java.lang.String m8087fiatFormatterFormatWithSymbolMaxhJeF8fQ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final RoundingMode roundingMode, final int i) throws BuySellFormatterException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCallWithError(uniffiRustBuffer, BuySellFormatterException.ErrorHandler, new Function1() { // from class: o.Asa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3722ArM.fiatFormatterFormatWithSymbolMax_hJeF8fQ$lambda$11(str, str2, roundingMode, i, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue fiatFormatterFormatWithSymbolMax_hJeF8fQ$lambda$11(java.lang.String str, java.lang.String str2, RoundingMode roundingMode, int i, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        return uniffiLib.uniffi_buy_sell_fn_func_fiat_formatter_format_with_symbol_max(ffiConverterString.lower2(str), ffiConverterString.lower2(str2), FfiConverterTypeRoundingMode.INSTANCE.lower2((java.lang.Object) roundingMode), FfiConverterUInt.INSTANCE.m9552lowerWZ4Q5Ns(i).intValue(), uniffiRustCallStatus);
    }

    /* JADX INFO: renamed from: fiatFormatterFormatWithSymbolMinmax-LRKxwks, reason: not valid java name */
    public static final java.lang.String m8088fiatFormatterFormatWithSymbolMinmaxLRKxwks(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final RoundingMode roundingMode, final int i, final int i2) throws BuySellFormatterException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCallWithError(uniffiRustBuffer, BuySellFormatterException.ErrorHandler, new Function1() { // from class: o.ArW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3722ArM.fiatFormatterFormatWithSymbolMinmax_LRKxwks$lambda$12(str, str2, roundingMode, i, i2, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue fiatFormatterFormatWithSymbolMinmax_LRKxwks$lambda$12(java.lang.String str, java.lang.String str2, RoundingMode roundingMode, int i, int i2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        RustBuffer.ByValue byValueLower2 = ffiConverterString.lower2(str);
        RustBuffer.ByValue byValueLower22 = ffiConverterString.lower2(str2);
        RustBuffer.ByValue byValueLower23 = FfiConverterTypeRoundingMode.INSTANCE.lower2((java.lang.Object) roundingMode);
        FfiConverterUInt ffiConverterUInt = FfiConverterUInt.INSTANCE;
        return uniffiLib.uniffi_buy_sell_fn_func_fiat_formatter_format_with_symbol_minmax(byValueLower2, byValueLower22, byValueLower23, ffiConverterUInt.m9552lowerWZ4Q5Ns(i).intValue(), ffiConverterUInt.m9552lowerWZ4Q5Ns(i2).intValue(), uniffiRustCallStatus);
    }

    /* JADX INFO: renamed from: plainFormatterFormatPlainString-Qn1smSk, reason: not valid java name */
    public static final java.lang.String m8089plainFormatterFormatPlainStringQn1smSk(@NotNull final java.lang.String str, final int i) throws BuySellFormatterException {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCallWithError(uniffiRustBuffer, BuySellFormatterException.ErrorHandler, new Function1() { // from class: o.Asc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3722ArM.plainFormatterFormatPlainString_Qn1smSk$lambda$13(str, i, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue plainFormatterFormatPlainString_Qn1smSk$lambda$13(java.lang.String str, int i, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_func_plain_formatter_format_plain_string(FfiConverterString.INSTANCE.lower2(str), FfiConverterUInt.INSTANCE.m9552lowerWZ4Q5Ns(i).intValue(), uniffiRustCallStatus);
    }

    /* JADX INFO: renamed from: plainFormatterToPlainString-Qn1smSk, reason: not valid java name */
    public static final java.lang.String m8090plainFormatterToPlainStringQn1smSk(@NotNull final java.lang.String str, final int i) throws BuySellFormatterException {
        Intrinsics.checkNotNullParameter(str, "");
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) C60173zxj.uniffiRustCallWithError(uniffiRustBuffer, BuySellFormatterException.ErrorHandler, new Function1() { // from class: o.ArV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3722ArM.plainFormatterToPlainString_Qn1smSk$lambda$14(str, i, (UniffiRustCallStatus) obj);
            }
        }));
    }

    public static final RustBuffer.ByValue plainFormatterToPlainString_Qn1smSk$lambda$14(java.lang.String str, int i, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_buy_sell_fn_func_plain_formatter_to_plain_string(FfiConverterString.INSTANCE.lower2(str), FfiConverterUInt.INSTANCE.m9552lowerWZ4Q5Ns(i).intValue(), uniffiRustCallStatus);
    }

    public static final boolean recurringBuyPlanDetailStateIsEqual(@NotNull final C3819AtD c3819AtD, @NotNull final C3819AtD c3819AtD2) {
        Intrinsics.checkNotNullParameter(c3819AtD, "");
        Intrinsics.checkNotNullParameter(c3819AtD2, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.ArO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C3722ArM.recurringBuyPlanDetailStateIsEqual$lambda$15(c3819AtD, c3819AtD2, (UniffiRustCallStatus) obj));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte recurringBuyPlanDetailStateIsEqual$lambda$15(C3819AtD c3819AtD, C3819AtD c3819AtD2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterTypeRecurringBuyPlanDetailState ffiConverterTypeRecurringBuyPlanDetailState = FfiConverterTypeRecurringBuyPlanDetailState.INSTANCE;
        return uniffiLib.uniffi_buy_sell_fn_func_recurring_buy_plan_detail_state_is_equal(ffiConverterTypeRecurringBuyPlanDetailState.lower2((java.lang.Object) c3819AtD), ffiConverterTypeRecurringBuyPlanDetailState.lower2((java.lang.Object) c3819AtD2), uniffiRustCallStatus);
    }

    public static final boolean recurringBuyPlanListStateIsEqual(@NotNull final C3871AuC c3871AuC, @NotNull final C3871AuC c3871AuC2) {
        Intrinsics.checkNotNullParameter(c3871AuC, "");
        Intrinsics.checkNotNullParameter(c3871AuC2, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.ArP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C3722ArM.recurringBuyPlanListStateIsEqual$lambda$16(c3871AuC, c3871AuC2, (UniffiRustCallStatus) obj));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte recurringBuyPlanListStateIsEqual$lambda$16(C3871AuC c3871AuC, C3871AuC c3871AuC2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterTypeRecurringBuyPlanListState ffiConverterTypeRecurringBuyPlanListState = FfiConverterTypeRecurringBuyPlanListState.INSTANCE;
        return uniffiLib.uniffi_buy_sell_fn_func_recurring_buy_plan_list_state_is_equal(ffiConverterTypeRecurringBuyPlanListState.lower2((java.lang.Object) c3871AuC), ffiConverterTypeRecurringBuyPlanListState.lower2((java.lang.Object) c3871AuC2), uniffiRustCallStatus);
    }

    public static final boolean recurringBuyPlanOrderListStateIsEqual(@NotNull final C3961Avp c3961Avp, @NotNull final C3961Avp c3961Avp2) {
        Intrinsics.checkNotNullParameter(c3961Avp, "");
        Intrinsics.checkNotNullParameter(c3961Avp2, "");
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.ArT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C3722ArM.recurringBuyPlanOrderListStateIsEqual$lambda$17(c3961Avp, c3961Avp2, (UniffiRustCallStatus) obj));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte recurringBuyPlanOrderListStateIsEqual$lambda$17(C3961Avp c3961Avp, C3961Avp c3961Avp2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterTypeRecurringBuyPlanOrderListState ffiConverterTypeRecurringBuyPlanOrderListState = FfiConverterTypeRecurringBuyPlanOrderListState.INSTANCE;
        return uniffiLib.uniffi_buy_sell_fn_func_recurring_buy_plan_order_list_state_is_equal(ffiConverterTypeRecurringBuyPlanOrderListState.lower2((java.lang.Object) c3961Avp), ffiConverterTypeRecurringBuyPlanOrderListState.lower2((java.lang.Object) c3961Avp2), uniffiRustCallStatus);
    }

    public static final void registerFormatter(@NotNull final InterfaceC3696Aqn interfaceC3696Aqn) {
        Intrinsics.checkNotNullParameter(interfaceC3696Aqn, "");
        C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.ArJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3722ArM.registerFormatter$lambda$18(interfaceC3696Aqn, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final Unit registerFormatter$lambda$18(InterfaceC3696Aqn interfaceC3696Aqn, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_buy_sell_fn_func_register_formatter(FfiConverterTypeBuySellFormatter.INSTANCE.lower2(interfaceC3696Aqn).longValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
