package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.settings.FfiConverterBoolean;
import uniffi.settings.FfiConverterInt;
import uniffi.settings.UniffiLib;

/* JADX INFO: loaded from: classes13.dex */
public class BlQ extends AbstractC60182zxs implements BlN {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlQ(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.AEQbTJ(), BoN.uniffiRustBuffer, new Function2() { // from class: o.BlW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BlQ.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.BlY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(BlQ.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_settings_fn_free_colorcorebinding(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_settings_fn_clone_colorcorebinding(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlQ(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.AEQbTJ(), BoN.uniffiRustBuffer, new Function2() { // from class: o.BlR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return BlQ.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.BlV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(BlQ.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_settings_fn_free_colorcorebinding(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_settings_fn_clone_colorcorebinding(j, uniffiRustCallStatus);
    }

    @Override // o.BlN
    public boolean EZpvd(final int i) {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BlU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(BlQ.setThemeMode$lambda$5(i, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte setThemeMode$lambda$5(final int i, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BoN.uniffiRustBuffer, new Function1() { // from class: o.BlZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(BlQ.setThemeMode$lambda$5$lambda$4(j, i, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte setThemeMode$lambda$5$lambda$4(long j, int i, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_colorcorebinding_set_theme_mode(j, FfiConverterInt.INSTANCE.lower(i).intValue(), uniffiRustCallStatus);
    }

    @Override // o.BlN
    public boolean copydefault(final int i) {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BlT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(BlQ.setColorTheme$lambda$7(i, ((java.lang.Long) obj).longValue()));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte setColorTheme$lambda$7(final int i, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BoN.uniffiRustBuffer, new Function1() { // from class: o.Bma
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(BlQ.setColorTheme$lambda$7$lambda$6(j, i, (UniffiRustCallStatus) obj));
            }
        })).byteValue();
    }

    public static final byte setColorTheme$lambda$7$lambda$6(long j, int i, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_colorcorebinding_set_color_theme(j, FfiConverterInt.INSTANCE.lower(i).intValue(), uniffiRustCallStatus);
    }

    @Override // o.BlN
    public int EZpvd() {
        return FfiConverterInt.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BlS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(BlQ.getThemeMode$lambda$9(((java.lang.Long) obj).longValue()));
            }
        })).intValue()).intValue();
    }

    public static final int getThemeMode$lambda$9(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BoN.uniffiRustBuffer, new Function1() { // from class: o.Bmc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(BlQ.getThemeMode$lambda$9$lambda$8(j, (UniffiRustCallStatus) obj));
            }
        })).intValue();
    }

    public static final int getThemeMode$lambda$9$lambda$8(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_colorcorebinding_get_theme_mode(j, uniffiRustCallStatus);
    }

    @Override // o.BlN
    public int copydefault() {
        return FfiConverterInt.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.BlX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(BlQ.getColorTheme$lambda$11(((java.lang.Long) obj).longValue()));
            }
        })).intValue()).intValue();
    }

    public static final int getColorTheme$lambda$11(final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(BoN.uniffiRustBuffer, new Function1() { // from class: o.Bmb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(BlQ.getColorTheme$lambda$11$lambda$10(j, (UniffiRustCallStatus) obj));
            }
        })).intValue();
    }

    public static final int getColorTheme$lambda$11$lambda$10(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_settings_fn_method_colorcorebinding_get_color_theme(j, uniffiRustCallStatus);
    }

    @Override // o.BlN
    public void AEQbTJ() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bme
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BlQ.emitThemeChange$lambda$13(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit emitThemeChange$lambda$13(final long j) {
        C60173zxj.uniffiRustCall(BoN.uniffiRustBuffer, new Function1() { // from class: o.Bmd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BlQ.emitThemeChange$lambda$13$lambda$12(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit emitThemeChange$lambda$13$lambda$12(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_settings_fn_method_colorcorebinding_emit_theme_change(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
