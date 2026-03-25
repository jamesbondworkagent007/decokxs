package uniffi.feature_restriction;

import com.sun.jna.Pointer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ALB;
import o.AbstractC2440ALv;
import o.C60173zxj;
import o.InterfaceC2438ALt;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterString;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiRustCallStatus;
import uniffi.feature_restriction.UniffiVTableCallbackInterfaceFeatureRestrictionListener;
import uniffi.feature_restriction.uniffiCallbackInterfaceFeatureRestrictionListener;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceFeatureRestrictionListener {
    public static final uniffiCallbackInterfaceFeatureRestrictionListener INSTANCE = new uniffiCallbackInterfaceFeatureRestrictionListener();
    public static UniffiVTableCallbackInterfaceFeatureRestrictionListener.UniffiByValue vtable = new UniffiVTableCallbackInterfaceFeatureRestrictionListener.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, onFeatureRestrictionEvent.INSTANCE);
    public static final int $stable = 8;

    public static final class onFeatureRestrictionEvent implements UniffiCallbackInterfaceFeatureRestrictionListenerMethod0 {
        public static final int $stable = 0;
        public static final onFeatureRestrictionEvent INSTANCE = new onFeatureRestrictionEvent();

        private onFeatureRestrictionEvent() {
        }

        @Override // uniffi.feature_restriction.UniffiCallbackInterfaceFeatureRestrictionListenerMethod0
        public void callback(long j, @NotNull final RustBuffer.ByValue byValue, @NotNull Pointer pointer, @NotNull UniffiRustCallStatus uniffiRustCallStatus) throws InternalException {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(pointer, "");
            Intrinsics.checkNotNullParameter(uniffiRustCallStatus, "");
            final InterfaceC2438ALt interfaceC2438ALtCopydefault = FfiConverterTypeFeatureRestrictionListener.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j);
            Function0 function0 = new Function0() { // from class: o.AMF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return uniffiCallbackInterfaceFeatureRestrictionListener.onFeatureRestrictionEvent.callback$lambda$0(interfaceC2438ALtCopydefault, byValue);
                }
            };
            Function1 function1 = new Function1() { // from class: o.AMH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceFeatureRestrictionListener.onFeatureRestrictionEvent.callback$lambda$1((Unit) obj);
                }
            };
            RustBuffer rustBuffer = ALB.uniffiRustBuffer;
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
        public static final Unit callback$lambda$0(InterfaceC2438ALt interfaceC2438ALt, RustBuffer.ByValue byValue) {
            interfaceC2438ALt.EZpvd((AbstractC2440ALv) FfiConverterTypeFeatureRestrictionEvent.INSTANCE.lift2(byValue));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "");
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceFeatureRestrictionListener() {
    }

    public static final class uniffiFree implements UniffiCallbackInterfaceFree {
        public static final int $stable = 0;
        public static final uniffiFree INSTANCE = new uniffiFree();

        private uniffiFree() {
        }

        @Override // uniffi.UniffiCallbackInterfaceFree
        public void callback(long j) throws InternalException {
            FfiConverterTypeFeatureRestrictionListener.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeFeatureRestrictionListener.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void OLrzqt(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_feature_restriction_fn_init_callback_vtable_featurerestrictionlistener(vtable);
    }
}
