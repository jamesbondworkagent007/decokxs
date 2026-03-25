package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.compliance.FfiConverterBoolean;
import uniffi.compliance.FfiConverterDouble;
import uniffi.compliance.FfiConverterFloat;
import uniffi.compliance.FfiConverterInt;
import uniffi.compliance.FfiConverterString;
import uniffi.compliance.UniffiLib;

/* JADX INFO: renamed from: o.Axa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C4052Axa extends AbstractC60182zxs implements InterfaceC4055Axd {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4052Axa(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.AEQbTJ(), C3981AwI.uniffiRustBuffer, new Function2() { // from class: o.Axf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4052Axa.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Axi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4052Axa.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_free_idscancallback(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_clone_idscancallback(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4052Axa(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.AEQbTJ(), C3981AwI.uniffiRustBuffer, new Function2() { // from class: o.Axc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C4052Axa.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Axg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C4052Axa.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_free_idscancallback(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_compliance_fn_clone_idscancallback(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC4055Axd
    public void OLrzqt(final boolean z) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Axn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4052Axa.onFrameSelected$lambda$5(z, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onFrameSelected$lambda$5(final boolean z, final long j) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Axp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4052Axa.onFrameSelected$lambda$5$lambda$4(j, z, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onFrameSelected$lambda$5$lambda$4(long j, boolean z, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscancallback_on_frame_selected(j, FfiConverterBoolean.INSTANCE.lower(z).byteValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4055Axd
    public void EZpvd(final float f, final float f2) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Axe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4052Axa.onAutofocus$lambda$7(f, f2, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onAutofocus$lambda$7(final float f, final float f2, final long j) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Axk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4052Axa.onAutofocus$lambda$7$lambda$6(j, f, f2, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onAutofocus$lambda$7$lambda$6(long j, float f, float f2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterFloat ffiConverterFloat = FfiConverterFloat.INSTANCE;
        uniffiLib.uniffi_compliance_fn_method_idscancallback_on_autofocus(j, ffiConverterFloat.lower(f).floatValue(), ffiConverterFloat.lower(f2).floatValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4055Axd
    public void AEQbTJ(final int i) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Axh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4052Axa.onFrameResponse$lambda$9(i, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onFrameResponse$lambda$9(final int i, final long j) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Axj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4052Axa.onFrameResponse$lambda$9$lambda$8(j, i, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onFrameResponse$lambda$9$lambda$8(long j, int i, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscancallback_on_frame_response(j, FfiConverterInt.INSTANCE.lower(i).intValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4055Axd
    public void AEQbTJ(final double d, final boolean z) {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Axm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4052Axa.onComplete$lambda$11(d, z, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onComplete$lambda$11(final double d, final boolean z, final long j) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Axo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4052Axa.onComplete$lambda$11$lambda$10(j, d, z, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onComplete$lambda$11$lambda$10(long j, double d, boolean z, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_compliance_fn_method_idscancallback_on_complete(j, FfiConverterDouble.INSTANCE.lower(d).doubleValue(), FfiConverterBoolean.INSTANCE.lower(z).byteValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC4055Axd
    public void OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Axl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4052Axa.onDebugData$lambda$13(str, str2, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit onDebugData$lambda$13(final java.lang.String str, final java.lang.String str2, final long j) {
        C60173zxj.uniffiRustCall(C3981AwI.uniffiRustBuffer, new Function1() { // from class: o.Axb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C4052Axa.onDebugData$lambda$13$lambda$12(j, str, str2, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit onDebugData$lambda$13$lambda$12(long j, java.lang.String str, java.lang.String str2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        uniffiLib.uniffi_compliance_fn_method_idscancallback_on_debug_data(j, ffiConverterString.lower2(str), ffiConverterString.lower2(str2), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
