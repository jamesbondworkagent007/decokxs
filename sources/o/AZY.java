package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.RustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.network.FfiConverterSequenceTypeWsArgPayload;
import uniffi.network.FfiConverterString;
import uniffi.network.FfiConverterTypeNativeWsListener;
import uniffi.network.FfiConverterTypeRustWsDataCallback;
import uniffi.network.FfiConverterTypeRustWsStateCallback;
import uniffi.network.FfiConverterTypeWsListenerKind;
import uniffi.network.UniffiLib;
import uniffi.network.WsListenerKind;

/* JADX INFO: loaded from: classes25.dex */
public class AZY extends AbstractC60182zxs implements AZX {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AZY(@NotNull C60184zxu c60184zxu, long j) {
        super(j, UniffiLib.INSTANCE.AEQbTJ(), C4298Bav.uniffiRustBuffer, new Function2() { // from class: o.Baa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AZY.EZpvd(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.AZZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(AZY.AEQbTJ(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60184zxu, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_network_fn_free_nativewsconnection(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AEQbTJ(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_network_fn_clone_nativewsconnection(j, uniffiRustCallStatus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AZY(@NotNull C60168zxe c60168zxe) {
        super(0L, UniffiLib.INSTANCE.AEQbTJ(), C4298Bav.uniffiRustBuffer, new Function2() { // from class: o.Bab
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AZY.KWHzl(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2);
            }
        }, new Function2() { // from class: o.Bad
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Long.valueOf(AZY.copydefault(((java.lang.Long) obj).longValue(), (UniffiRustCallStatus) obj2));
            }
        });
        Intrinsics.checkNotNullParameter(c60168zxe, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_network_fn_free_nativewsconnection(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long copydefault(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_network_fn_clone_nativewsconnection(j, uniffiRustCallStatus);
    }

    @Override // o.AZX
    public WsListenerKind OLrzqt() {
        return (WsListenerKind) FfiConverterTypeWsListenerKind.INSTANCE.lift2((RustBuffer.ByValue) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bah
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AZY.EZpvd(((java.lang.Long) obj).longValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RustBuffer.ByValue EZpvd(final long j) {
        return (RustBuffer.ByValue) C60173zxj.uniffiRustCall(C4298Bav.uniffiRustBuffer, new Function1() { // from class: o.Bag
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AZY.OLrzqt(j, (UniffiRustCallStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RustBuffer.ByValue OLrzqt(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_network_fn_method_nativewsconnection_kind(j, uniffiRustCallStatus);
    }

    @Override // o.AZX
    public InterfaceC4285Bai AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.util.List<C4408Bcz> list, @NotNull final InterfaceC4388Bcf interfaceC4388Bcf, @NotNull final InterfaceC4325BbV interfaceC4325BbV) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC4388Bcf, "");
        Intrinsics.checkNotNullParameter(interfaceC4325BbV, "");
        return FfiConverterTypeNativeWsListener.INSTANCE.lift(((java.lang.Number) callWithHandle$OKCore_deploy(new Function1() { // from class: o.Bae
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AZY.createListener$lambda$7(str, list, interfaceC4388Bcf, interfaceC4325BbV, ((java.lang.Long) obj).longValue()));
            }
        })).longValue());
    }

    public static final long createListener$lambda$7(final java.lang.String str, final java.util.List list, final InterfaceC4388Bcf interfaceC4388Bcf, final InterfaceC4325BbV interfaceC4325BbV, final long j) {
        return ((java.lang.Number) C60173zxj.uniffiRustCall(C4298Bav.uniffiRustBuffer, new Function1() { // from class: o.Bac
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Long.valueOf(AZY.createListener$lambda$7$lambda$6(j, str, list, interfaceC4388Bcf, interfaceC4325BbV, (UniffiRustCallStatus) obj));
            }
        })).longValue();
    }

    public static final long createListener$lambda$7$lambda$6(long j, java.lang.String str, java.util.List list, InterfaceC4388Bcf interfaceC4388Bcf, InterfaceC4325BbV interfaceC4325BbV, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        return UniffiLib.INSTANCE.uniffi_network_fn_method_nativewsconnection_create_listener(j, FfiConverterString.INSTANCE.lower2(str), FfiConverterSequenceTypeWsArgPayload.INSTANCE.lower2((java.lang.Object) list), FfiConverterTypeRustWsStateCallback.INSTANCE.lower2(interfaceC4388Bcf).longValue(), FfiConverterTypeRustWsDataCallback.INSTANCE.lower2(interfaceC4325BbV).longValue(), uniffiRustCallStatus);
    }

    @Override // o.AZX
    public void copydefault() {
        callWithHandle$OKCore_deploy(new Function1() { // from class: o.Baf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AZY.reconnect$lambda$9(((java.lang.Long) obj).longValue());
            }
        });
    }

    public static final Unit reconnect$lambda$9(final long j) {
        C60173zxj.uniffiRustCall(C4298Bav.uniffiRustBuffer, new Function1() { // from class: o.AZU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AZY.reconnect$lambda$9$lambda$8(j, (UniffiRustCallStatus) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit reconnect$lambda$9$lambda$8(long j, UniffiRustCallStatus uniffiRustCallStatus) {
        Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
        UniffiLib.INSTANCE.uniffi_network_fn_method_nativewsconnection_reconnect(j, uniffiRustCallStatus);
        return Unit.INSTANCE;
    }
}
