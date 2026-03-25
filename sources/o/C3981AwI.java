package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.compliance.FfiConverterBoolean;
import uniffi.compliance.FfiConverterULong;
import uniffi.compliance.IntegrityCheckingUniffiLib;
import uniffi.compliance.UniffiLib;

/* JADX INFO: renamed from: o.AwI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3981AwI {
    public static final RustBuffer uniffiRustBuffer = new RustBuffer(new TaskDescription());

    /* JADX INFO: renamed from: o.AwI$TaskDescription */
    public static final class TaskDescription implements InterfaceC60174zxk {
        @Override // o.InterfaceC60174zxk
        public RustBuffer.ByValue alloc(long j, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            return UniffiLib.INSTANCE.ffi_compliance_rustbuffer_alloc(j, uniffiRustCallStatus);
        }

        @Override // o.InterfaceC60174zxk
        public void free(RustBuffer.ByValue byValue, UniffiRustCallStatus uniffiRustCallStatus) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            UniffiLib.INSTANCE.ffi_compliance_rustbuffer_free(byValue, uniffiRustCallStatus);
        }
    }

    public static final void uniffiCheckContractApiVersion(IntegrityCheckingUniffiLib integrityCheckingUniffiLib) {
        if (30 != integrityCheckingUniffiLib.ffi_compliance_uniffi_contract_version()) {
            throw new java.lang.RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }

    public static final void uniffiEnsureInitialized() {
        IntegrityCheckingUniffiLib integrityCheckingUniffiLib = IntegrityCheckingUniffiLib.INSTANCE;
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
    }

    /* JADX INFO: renamed from: registerOpencvFunctions-eYxGe6s, reason: not valid java name */
    public static final boolean m8139registerOpencvFunctionseYxGe6s(final long j, final long j2, final long j3, final long j4, final long j5, final long j6, final long j7, final long j8, final long j9, final long j10, final long j11, final long j12, final long j13, final long j14, final long j15, final long j16, final long j17, final long j18, final long j19, final long j20, final long j21, final long j22, final long j23, final long j24, final long j25, final long j26, final long j27, final long j28, final long j29) {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AwH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C3981AwI.registerOpencvFunctions_eYxGe6s$lambda$0(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, (UniffiRustCallStatus) obj));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte registerOpencvFunctions_eYxGe6s$lambda$0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterULong ffiConverterULong = FfiConverterULong.INSTANCE;
        return uniffiLib.uniffi_compliance_fn_func_register_opencv_functions(ffiConverterULong.m9559lowerVKZWuLQ(j).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j2).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j3).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j4).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j5).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j6).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j7).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j8).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j9).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j10).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j11).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j12).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j13).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j14).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j15).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j16).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j17).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j18).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j19).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j20).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j21).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j22).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j23).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j24).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j25).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j26).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j27).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j28).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j29).longValue(), uniffiRustCallStatus);
    }

    /* JADX INFO: renamed from: registerOpencvJniFunctions-PWzV0Is, reason: not valid java name */
    public static final boolean m8140registerOpencvJniFunctionsPWzV0Is(final long j, final long j2) {
        return FfiConverterBoolean.INSTANCE.lift(((java.lang.Number) C60173zxj.uniffiRustCall(uniffiRustBuffer, new Function1() { // from class: o.AwK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Byte.valueOf(C3981AwI.registerOpencvJniFunctions_PWzV0Is$lambda$1(j, j2, (UniffiRustCallStatus) obj));
            }
        })).byteValue()).booleanValue();
    }

    public static final byte registerOpencvJniFunctions_PWzV0Is$lambda$1(long j, long j2, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib uniffiLib = UniffiLib.INSTANCE;
        FfiConverterULong ffiConverterULong = FfiConverterULong.INSTANCE;
        return uniffiLib.uniffi_compliance_fn_func_register_opencv_jni_functions(ffiConverterULong.m9559lowerVKZWuLQ(j).longValue(), ffiConverterULong.m9559lowerVKZWuLQ(j2).longValue(), uniffiRustCallStatus);
    }
}
