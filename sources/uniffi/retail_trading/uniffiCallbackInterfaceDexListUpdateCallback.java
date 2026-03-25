package uniffi.retail_trading;

import com.sun.jna.Pointer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BjI;
import o.BlA;
import o.C60173zxj;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.ok_future_utils.FfiConverterTypeOKFFIError;
import uniffi.ok_future_utils.OkffiException;
import uniffi.retail_trading.UniffiVTableCallbackInterfaceDexListUpdateCallback;
import uniffi.retail_trading.uniffiCallbackInterfaceDexListUpdateCallback;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceDexListUpdateCallback {
    public static final uniffiCallbackInterfaceDexListUpdateCallback INSTANCE = new uniffiCallbackInterfaceDexListUpdateCallback();
    public static UniffiVTableCallbackInterfaceDexListUpdateCallback.UniffiByValue vtable = new UniffiVTableCallbackInterfaceDexListUpdateCallback.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, onUpdateDexListBatched.INSTANCE, onUpdateDexListError.INSTANCE, onUpdateDexListCompleted.INSTANCE);
    public static final int $stable = 8;

    public static final class onUpdateDexListBatched implements UniffiCallbackInterfaceDexListUpdateCallbackMethod0 {
        public static final int $stable = 0;
        public static final onUpdateDexListBatched INSTANCE = new onUpdateDexListBatched();

        private onUpdateDexListBatched() {
        }

        @Override // uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final BjI bjICopydefault = FfiConverterTypeDexListUpdateCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BlH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceDexListUpdateCallback.onUpdateDexListBatched.callback$lambda$0(bjICopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BlG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceDexListUpdateCallback.onUpdateDexListBatched.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = BlA.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(BjI bjI, RustBuffer.ByValue byValue) {
            bjI.copydefault((List) FfiConverterSequenceTypeQuotationDexItemVo.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceDexListUpdateCallback() {
    }

    public static final class onUpdateDexListError implements UniffiCallbackInterfaceDexListUpdateCallbackMethod1 {
        public static final int $stable = 0;
        public static final onUpdateDexListError INSTANCE = new onUpdateDexListError();

        private onUpdateDexListError() {
        }

        @Override // uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod1
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final BjI bjICopydefault = FfiConverterTypeDexListUpdateCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BlL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceDexListUpdateCallback.onUpdateDexListError.callback$lambda$0(bjICopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BlO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceDexListUpdateCallback.onUpdateDexListError.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = BlA.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(BjI bjI, RustBuffer.ByValue byValue) {
            bjI.AEQbTJ((OkffiException) FfiConverterTypeOKFFIError.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class onUpdateDexListCompleted implements UniffiCallbackInterfaceDexListUpdateCallbackMethod2 {
        public static final int $stable = 0;
        public static final onUpdateDexListCompleted INSTANCE = new onUpdateDexListCompleted();

        private onUpdateDexListCompleted() {
        }

        @Override // uniffi.retail_trading.UniffiCallbackInterfaceDexListUpdateCallbackMethod2
        public void callback(long j, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final BjI bjICopydefault = FfiConverterTypeDexListUpdateCallback.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.BlK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceDexListUpdateCallback.onUpdateDexListCompleted.callback$lambda$0(bjICopydefault);
                }
            };
            Function1 function1 = new Function1() { // from class: o.BlJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceDexListUpdateCallback.onUpdateDexListCompleted.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = BlA.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(BjI bjI) {
            bjI.copydefault();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeDexListUpdateCallback.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeDexListUpdateCallback.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void OLrzqt(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_retail_trading_fn_init_callback_vtable_dexlistupdatecallback(vtable);
    }
}
