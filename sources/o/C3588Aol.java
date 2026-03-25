package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiRustCallStatus;
import uniffi.analytics.FfiConverterBoolean;
import uniffi.analytics.FfiConverterSequenceTypeTrackEventParam;
import uniffi.analytics.FfiConverterString;
import uniffi.analytics.FfiConverterTypeExceptionData;
import uniffi.analytics.FfiConverterTypeGrafanaEventData;
import uniffi.analytics.UniffiLib;

/* JADX INFO: renamed from: o.Aol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C3588Aol extends AbstractC60182zxs implements InterfaceC3591Aoo {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3588Aol(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.KWHzl(), C3599Aow.uniffiRustBuffer, new Function2() { // from class: o.Aoy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3588Aol.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Aov
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3588Aol.OLrzqt(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_analytics_fn_free_analyticsinterface(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_analytics_fn_clone_analyticsinterface(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3588Aol(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.KWHzl(), C3599Aow.uniffiRustBuffer, new Function2() { // from class: o.Aon
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C3588Aol.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Aot
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(C3588Aol.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_analytics_fn_free_analyticsinterface(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_analytics_fn_clone_analyticsinterface(j, uniffiRustCallStatus);
    }

    @Override // o.InterfaceC3591Aoo
    public void KWHzl(@NotNull final java.lang.String str, @NotNull final java.util.List<C3555AoE> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Aox
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3588Aol.trackEvent$lambda$5(str, list, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit trackEvent$lambda$5(final java.lang.String str, final java.util.List list, final long j) {
        C60173zxj.uniffiRustCall(C3599Aow.uniffiRustBuffer, new Function1() { // from class: o.Aou
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3588Aol.trackEvent$lambda$5$lambda$4(j, str, list, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit trackEvent$lambda$5$lambda$4(long j, java.lang.String str, java.util.List list, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_analytics_fn_method_analyticsinterface_track_event(j, FfiConverterString.INSTANCE.lower2(str), FfiConverterSequenceTypeTrackEventParam.INSTANCE.lower2((java.lang.Object) list), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC3591Aoo
    public void AEQbTJ(@NotNull final C3551AoA c3551AoA, final boolean z) {
        Intrinsics.checkNotNullParameter(c3551AoA, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Aoq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3588Aol.reportToGrafana$lambda$7(c3551AoA, z, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit reportToGrafana$lambda$7(final C3551AoA c3551AoA, final boolean z, final long j) {
        C60173zxj.uniffiRustCall(C3599Aow.uniffiRustBuffer, new Function1() { // from class: o.Aoz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3588Aol.reportToGrafana$lambda$7$lambda$6(j, c3551AoA, z, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit reportToGrafana$lambda$7$lambda$6(long j, C3551AoA c3551AoA, boolean z, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_analytics_fn_method_analyticsinterface_report_to_grafana(j, FfiConverterTypeGrafanaEventData.INSTANCE.lower2((java.lang.Object) c3551AoA), FfiConverterBoolean.INSTANCE.lower(z).byteValue(), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC3591Aoo
    public void AEQbTJ(@NotNull final C3554AoD c3554AoD) {
        Intrinsics.checkNotNullParameter(c3554AoD, "");
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Aor
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3588Aol.reportException$lambda$9(c3554AoD, ((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit reportException$lambda$9(final C3554AoD c3554AoD, final long j) {
        C60173zxj.uniffiRustCall(C3599Aow.uniffiRustBuffer, new Function1() { // from class: o.Aos
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C3588Aol.reportException$lambda$9$lambda$8(j, c3554AoD, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit reportException$lambda$9$lambda$8(long j, C3554AoD c3554AoD, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_analytics_fn_method_analyticsinterface_report_exception(j, FfiConverterTypeExceptionData.INSTANCE.lower2((java.lang.Object) c3554AoD), uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
