package uniffi.growth;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.ANQ;
import o.C60173zxj;
import org.jetbrains.annotations.NotNull;
import uniffi.InternalException;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiForeignFutureCompleteVoid;
import uniffi.UniffiForeignFutureDroppedCallbackStruct;
import uniffi.UniffiForeignFutureResultVoid;
import uniffi.UniffiRustCallStatus;
import uniffi.growth.UniffiVTableCallbackInterfaceUiExecutor;
import uniffi.growth.uniffiCallbackInterfaceUIExecutor;
import uniffi.uniffiForeignFutureDroppedCallbackImpl;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceUIExecutor {
    public static final uniffiCallbackInterfaceUIExecutor INSTANCE = new uniffiCallbackInterfaceUIExecutor();
    public static UniffiVTableCallbackInterfaceUiExecutor.UniffiByValue vtable = new UniffiVTableCallbackInterfaceUiExecutor.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, runOnUi.INSTANCE);
    public static final int $stable = 8;

    public static final class runOnUi implements UniffiCallbackInterfaceUiExecutorMethod0 {
        public static final int $stable = 0;
        public static final runOnUi INSTANCE = new runOnUi();

        private runOnUi() {
        }

        @Override // uniffi.growth.UniffiCallbackInterfaceUiExecutorMethod0
        public void callback(long j, long j2, long j3, long j4, @NotNull final UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, final long j5, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteVoid, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceUIExecutor$runOnUi$callback$makeCall$1 unifficallbackinterfaceuiexecutor_runonui_callback_makecall_1 = new uniffiCallbackInterfaceUIExecutor$runOnUi$callback$makeCall$1(FfiConverterTypeUIExecutor.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), j2, j3, j4, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceUIExecutor$runOnUi$callback$$inlined$uniffiTraitInterfaceCallAsync$1(new Function1() { // from class: o.ARa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceUIExecutor.runOnUi.callback$lambda$0(uniffiForeignFutureCompleteVoid, j5, (Unit) obj);
                }
            }, unifficallbackinterfaceuiexecutor_runonui_callback_makecall_1, new Function1() { // from class: o.ARc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceUIExecutor.runOnUi.callback$lambda$1(uniffiForeignFutureCompleteVoid, j5, (UniffiRustCallStatus.ByValue) obj);
                }
            }, ANQ.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, long j, Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            UniffiForeignFutureResultVoid.UniffiByValue uniffiByValue = new UniffiForeignFutureResultVoid.UniffiByValue(ANQ.uniffiRustBuffer.getRustBufferOp(), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteVoid.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteVoid uniffiForeignFutureCompleteVoid, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultVoid.UniffiByValue uniffiByValue = new UniffiForeignFutureResultVoid.UniffiByValue(ANQ.uniffiRustBuffer.getRustBufferOp(), byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteVoid.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceUIExecutor() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeUIExecutor.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeUIExecutor.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void copydefault(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_growth_fn_init_callback_vtable_uiexecutor(vtable);
    }
}
