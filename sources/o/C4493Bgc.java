package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.oklogging.FfiConverterInt;
import uniffi.oklogging.FfiConverterOptionalString;
import uniffi.oklogging.FfiConverterString;
import uniffi.oklogging.FfiConverterUInt;
import uniffi.oklogging.UniffiLib;

/* JADX INFO: renamed from: o.Bgc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C4493Bgc extends AbstractC60182zxs implements InterfaceC4494Bgd {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4493Bgc(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.OLrzqt(), BfX.uniffiRustBuffer, new Function2() { // from class: o.Bgg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4493Bgc.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Bge
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4493Bgc.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_oklogging_fn_free_platformlogger(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_oklogging_fn_clone_platformlogger(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4493Bgc(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.OLrzqt(), BfX.uniffiRustBuffer, new Function2() { // from class: o.Bgl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4493Bgc.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Bgj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4493Bgc.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_oklogging_fn_free_platformlogger(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_oklogging_fn_clone_platformlogger(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4494Bgd
    public void copydefault(final int i, final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, final int i2, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bgk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4493Bgc.writeLog_bPJOTnY$lambda$5(i, str, str2, str3, i2, str4, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit writeLog_bPJOTnY$lambda$5(final int i, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final int i2, final java.lang.String str4, final long j) {
        C60173zxj.uniffiRustCall(BfX.uniffiRustBuffer, new Function1() { // from class: o.Bgi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4493Bgc.writeLog_bPJOTnY$lambda$5$lambda$4(j, i, str, str2, str3, i2, str4, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit writeLog_bPJOTnY$lambda$5$lambda$4(long j, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, java.lang.String str4, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        int iIntValue = FfiConverterInt.INSTANCE.lower(i).intValue();
        RustBuffer.ByValue byValueLower2 = FfiConverterOptionalString.INSTANCE.lower2(str);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        uniffiLib.uniffi_oklogging_fn_method_platformlogger_write_log(j, iIntValue, byValueLower2, ffiConverterString.lower2(str2), ffiConverterString.lower2(str3), FfiConverterUInt.INSTANCE.m9552lowerWZ4Q5Ns(i2).intValue(), ffiConverterString.lower2(str4), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
