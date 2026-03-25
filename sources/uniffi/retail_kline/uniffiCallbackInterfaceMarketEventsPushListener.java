package uniffi.retail_kline;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C4578Bjg;
import o.C60173zxj;
import o.InterfaceC4535Bhr;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.retail_kline.UniffiVTableCallbackInterfaceMarketEventsPushListener;
import uniffi.retail_kline.uniffiCallbackInterfaceMarketEventsPushListener;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceMarketEventsPushListener {
    public static final uniffiCallbackInterfaceMarketEventsPushListener INSTANCE = new uniffiCallbackInterfaceMarketEventsPushListener();
    public static UniffiVTableCallbackInterfaceMarketEventsPushListener.UniffiByValue vtable = new UniffiVTableCallbackInterfaceMarketEventsPushListener.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, onEventPush.INSTANCE);
    public static final int $stable = 8;

    public static final class onEventPush implements UniffiCallbackInterfaceMarketEventsPushListenerMethod0 {
        public static final int $stable = 0;
        public static final onEventPush INSTANCE = new onEventPush();

        private onEventPush() {
        }

        @Override // uniffi.retail_kline.UniffiCallbackInterfaceMarketEventsPushListenerMethod0
        public void callback(long j, final byte b, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC4535Bhr interfaceC4535BhrCopydefault = FfiConverterTypeMarketEventsPushListener.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.Bjw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceMarketEventsPushListener.onEventPush.callback$lambda$0(interfaceC4535BhrCopydefault, b);
                }
            };
            Function1 function1 = new Function1() { // from class: o.Bjv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceMarketEventsPushListener.onEventPush.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = C4578Bjg.uniffiRustBuffer;
            try {
                function1.invoke(function0.invoke());
            } catch (Exception e) {
                Function1<Throwable, Unit> unExceptionReport = C60173zxj.getUnExceptionReport();
                if (unExceptionReport != null) {
                    unExceptionReport.invoke(e);
                }
                uniffiRustCallStatus.code = (byte) 2;
                uniffiRustCallStatus.error_buf = new BaseFfiConverterString(rustBuffer).lower2(e.toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(InterfaceC4535Bhr interfaceC4535Bhr, byte b) {
            interfaceC4535Bhr.onEventPush(FfiConverterBoolean.INSTANCE.lift(b).booleanValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceMarketEventsPushListener() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeMarketEventsPushListener.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeMarketEventsPushListener.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void AEQbTJ(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_retail_kline_fn_init_callback_vtable_marketeventspushlistener(vtable);
    }
}
