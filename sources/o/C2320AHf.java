package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.environment.FfiConverterOptionalString;
import uniffi.environment.FfiConverterString;
import uniffi.environment.UniffiLib;

/* JADX INFO: renamed from: o.AHf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C2320AHf extends AbstractC60182zxs implements InterfaceC2322AHh {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2320AHf(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.copydefault(), C2338AHx.uniffiRustBuffer, new Function2() { // from class: o.AHo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2320AHf.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AHk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2320AHf.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_environment_fn_free_deviceinfointerface(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_environment_fn_clone_deviceinfointerface(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2320AHf(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.copydefault(), C2338AHx.uniffiRustBuffer, new Function2() { // from class: o.AHr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C2320AHf.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AHt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C2320AHf.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_environment_fn_free_deviceinfointerface(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_environment_fn_clone_deviceinfointerface(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC2322AHh
    public java.lang.String AEQbTJ() {
        return FfiConverterString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AHu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2320AHf.getDeviceId$lambda$5(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getDeviceId$lambda$5(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C2338AHx.uniffiRustBuffer, new Function1() { // from class: o.AHw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2320AHf.getDeviceId$lambda$5$lambda$4(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getDeviceId$lambda$5$lambda$4(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_environment_fn_method_deviceinfointerface_get_device_id(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC2322AHh
    public java.lang.String OLrzqt() {
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AHp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2320AHf.getDeviceName$lambda$7(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getDeviceName$lambda$7(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C2338AHx.uniffiRustBuffer, new Function1() { // from class: o.AHs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2320AHf.getDeviceName$lambda$7$lambda$6(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getDeviceName$lambda$7$lambda$6(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_environment_fn_method_deviceinfointerface_get_device_name(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC2322AHh
    public java.lang.String EZpvd() {
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AHm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2320AHf.getDeviceModel$lambda$9(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getDeviceModel$lambda$9(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C2338AHx.uniffiRustBuffer, new Function1() { // from class: o.AHg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2320AHf.getDeviceModel$lambda$9$lambda$8(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getDeviceModel$lambda$9$lambda$8(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_environment_fn_method_deviceinfointerface_get_device_model(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC2322AHh
    public java.lang.String copydefault() {
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AHj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2320AHf.getSystemName$lambda$11(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getSystemName$lambda$11(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C2338AHx.uniffiRustBuffer, new Function1() { // from class: o.AHl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2320AHf.getSystemName$lambda$11$lambda$10(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getSystemName$lambda$11$lambda$10(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_environment_fn_method_deviceinfointerface_get_system_name(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC2322AHh
    public java.lang.String KWHzl() {
        return FfiConverterOptionalString.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.AHq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2320AHf.getSystemVersion$lambda$13(((java.lang.Long) obj).longValue());
            }
        }));
    }

    public static final RustBuffer.ByValue getSystemVersion$lambda$13(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C2338AHx.uniffiRustBuffer, new Function1() { // from class: o.AHn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C2320AHf.getSystemVersion$lambda$13$lambda$12(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    public static final RustBuffer.ByValue getSystemVersion$lambda$13$lambda$12(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_environment_fn_method_deviceinfointerface_get_system_version(j, uniffiRustCallStatus);
    }
}
