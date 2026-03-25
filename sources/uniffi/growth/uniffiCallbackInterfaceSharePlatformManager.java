package uniffi.growth;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import o.ANQ;
import o.API;
import o.AQF;
import o.C60173zxj;
import org.jetbrains.annotations.NotNull;
import uniffi.InternalException;
import uniffi.RustBuffer;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;
import uniffi.UniffiForeignFutureCompleteRustBuffer;
import uniffi.UniffiForeignFutureDroppedCallbackStruct;
import uniffi.UniffiForeignFutureResultRustBuffer;
import uniffi.UniffiRustCallStatus;
import uniffi.growth.UniffiVTableCallbackInterfaceSharePlatformManager;
import uniffi.growth.uniffiCallbackInterfaceSharePlatformManager;
import uniffi.uniffiForeignFutureDroppedCallbackImpl;

/* JADX INFO: loaded from: classes13.dex */
public final class uniffiCallbackInterfaceSharePlatformManager {
    public static final uniffiCallbackInterfaceSharePlatformManager INSTANCE = new uniffiCallbackInterfaceSharePlatformManager();
    public static UniffiVTableCallbackInterfaceSharePlatformManager.UniffiByValue vtable = new UniffiVTableCallbackInterfaceSharePlatformManager.UniffiByValue(uniffiFree.INSTANCE, uniffiClone.INSTANCE, fetchDisplaySharePlatformList.INSTANCE, getCachedSharePlatformList.INSTANCE, fetchShareComponentConfig.INSTANCE, generateUniversalLink.INSTANCE);
    public static final int $stable = 8;

    public static final class fetchDisplaySharePlatformList implements UniffiCallbackInterfaceSharePlatformManagerMethod0 {
        public static final int $stable = 0;
        public static final fetchDisplaySharePlatformList INSTANCE = new fetchDisplaySharePlatformList();

        private fetchDisplaySharePlatformList() {
        }

        @Override // uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod0
        public void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteRustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceSharePlatformManager$fetchDisplaySharePlatformList$callback$makeCall$1 unifficallbackinterfaceshareplatformmanager_fetchdisplayshareplatformlist_callback_makecall_1 = new uniffiCallbackInterfaceSharePlatformManager$fetchDisplaySharePlatformList$callback$makeCall$1(FfiConverterTypeSharePlatformManager.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), byValue, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceSharePlatformManager$fetchDisplaySharePlatformList$callback$$inlined$uniffiTraitInterfaceCallAsync$1(new Function1() { // from class: o.AQQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharePlatformManager.fetchDisplaySharePlatformList.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (java.util.List) obj);
                }
            }, unifficallbackinterfaceshareplatformmanager_fetchdisplayshareplatformlist_callback_makecall_1, new Function1() { // from class: o.AQR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharePlatformManager.fetchDisplaySharePlatformList.callback$lambda$1(uniffiForeignFutureCompleteRustBuffer, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, ANQ.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, List list) {
            Intrinsics.checkNotNullParameter(list, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(ANQ.uniffiRustBuffer.getRustBufferOp(), FfiConverterSequenceTypeSharePlatform.INSTANCE.lower2((Object) list), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteRustBuffer.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(ANQ.uniffiRustBuffer.getRustBufferOp(), new RustBuffer.ByValue(null, 1, null), byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteRustBuffer.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    private uniffiCallbackInterfaceSharePlatformManager() {
    }

    public static final class getCachedSharePlatformList implements UniffiCallbackInterfaceSharePlatformManagerMethod1 {
        public static final int $stable = 0;
        public static final getCachedSharePlatformList INSTANCE = new getCachedSharePlatformList();

        private getCachedSharePlatformList() {
        }

        @Override // uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod1
        public void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteRustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceSharePlatformManager$getCachedSharePlatformList$callback$makeCall$1 unifficallbackinterfaceshareplatformmanager_getcachedshareplatformlist_callback_makecall_1 = new uniffiCallbackInterfaceSharePlatformManager$getCachedSharePlatformList$callback$makeCall$1(FfiConverterTypeSharePlatformManager.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), byValue, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceSharePlatformManager$getCachedSharePlatformList$callback$$inlined$uniffiTraitInterfaceCallAsync$1(new Function1() { // from class: o.AQV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharePlatformManager.getCachedSharePlatformList.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (java.util.List) obj);
                }
            }, unifficallbackinterfaceshareplatformmanager_getcachedshareplatformlist_callback_makecall_1, new Function1() { // from class: o.ARd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharePlatformManager.getCachedSharePlatformList.callback$lambda$1(uniffiForeignFutureCompleteRustBuffer, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, ANQ.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, List list) {
            Intrinsics.checkNotNullParameter(list, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(ANQ.uniffiRustBuffer.getRustBufferOp(), FfiConverterSequenceTypeSharePlatform.INSTANCE.lower2((Object) list), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteRustBuffer.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(ANQ.uniffiRustBuffer.getRustBufferOp(), new RustBuffer.ByValue(null, 1, null), byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteRustBuffer.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    public static final class fetchShareComponentConfig implements UniffiCallbackInterfaceSharePlatformManagerMethod2 {
        public static final int $stable = 0;
        public static final fetchShareComponentConfig INSTANCE = new fetchShareComponentConfig();

        private fetchShareComponentConfig() {
        }

        @Override // uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod2
        public void callback(long j, @NotNull final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteRustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceSharePlatformManager$fetchShareComponentConfig$callback$makeCall$1 unifficallbackinterfaceshareplatformmanager_fetchsharecomponentconfig_callback_makecall_1 = new uniffiCallbackInterfaceSharePlatformManager$fetchShareComponentConfig$callback$makeCall$1(FfiConverterTypeSharePlatformManager.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceSharePlatformManager$fetchShareComponentConfig$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.AQY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharePlatformManager.fetchShareComponentConfig.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (API) obj);
                }
            }, unifficallbackinterfaceshareplatformmanager_fetchsharecomponentconfig_callback_makecall_1, new Function1() { // from class: o.AQX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharePlatformManager.fetchShareComponentConfig.callback$lambda$1(uniffiForeignFutureCompleteRustBuffer, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, ANQ.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, API api2) {
            Intrinsics.checkNotNullParameter(api2, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(ANQ.uniffiRustBuffer.getRustBufferOp(), FfiConverterTypeShareComponentConfig.INSTANCE.lower2((Object) api2), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteRustBuffer.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(ANQ.uniffiRustBuffer.getRustBufferOp(), new RustBuffer.ByValue(null, 1, null), byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteRustBuffer.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }
    }

    public static final class generateUniversalLink implements UniffiCallbackInterfaceSharePlatformManagerMethod3 {
        public static final int $stable = 0;
        public static final generateUniversalLink INSTANCE = new generateUniversalLink();

        private generateUniversalLink() {
        }

        @Override // uniffi.growth.UniffiCallbackInterfaceSharePlatformManagerMethod3
        public void callback(long j, @NotNull RustBuffer.ByValue byValue, @NotNull final UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, final long j2, @NotNull UniffiForeignFutureDroppedCallbackStruct uniffiForeignFutureDroppedCallbackStruct) {
            Intrinsics.checkNotNullParameter(byValue, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureCompleteRustBuffer, "");
            Intrinsics.checkNotNullParameter(uniffiForeignFutureDroppedCallbackStruct, "");
            uniffiCallbackInterfaceSharePlatformManager$generateUniversalLink$callback$makeCall$1 unifficallbackinterfaceshareplatformmanager_generateuniversallink_callback_makecall_1 = new uniffiCallbackInterfaceSharePlatformManager$generateUniversalLink$callback$makeCall$1(FfiConverterTypeSharePlatformManager.INSTANCE.getHandleMap$OKCore_deploy().copydefault(j), byValue, null);
            uniffiForeignFutureDroppedCallbackStruct.uniffiSetValue$OKCore_deploy(new UniffiForeignFutureDroppedCallbackStruct(C60173zxj.getUniffiForeignFutureHandleMap().EZpvd(BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new uniffiCallbackInterfaceSharePlatformManager$generateUniversalLink$callback$$inlined$uniffiTraitInterfaceCallAsyncWithError$1(new Function1() { // from class: o.AQZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharePlatformManager.generateUniversalLink.callback$lambda$0(uniffiForeignFutureCompleteRustBuffer, j2, (AQF) obj);
                }
            }, unifficallbackinterfaceshareplatformmanager_generateuniversallink_callback_makecall_1, new Function1() { // from class: o.AQW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return uniffiCallbackInterfaceSharePlatformManager.generateUniversalLink.callback$lambda$1(uniffiForeignFutureCompleteRustBuffer, j2, (UniffiRustCallStatus.ByValue) obj);
                }
            }, ANQ.uniffiRustBuffer, null), 3, null)), uniffiForeignFutureDroppedCallbackImpl.INSTANCE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$0(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, AQF aqf) {
            Intrinsics.checkNotNullParameter(aqf, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(ANQ.uniffiRustBuffer.getRustBufferOp(), FfiConverterTypeUniversalLinkResponse.INSTANCE.lower2((Object) aqf), new UniffiRustCallStatus.ByValue(null, 1, null));
            uniffiByValue.write();
            uniffiForeignFutureCompleteRustBuffer.callback(j, uniffiByValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit callback$lambda$1(UniffiForeignFutureCompleteRustBuffer uniffiForeignFutureCompleteRustBuffer, long j, UniffiRustCallStatus.ByValue byValue) {
            Intrinsics.checkNotNullParameter(byValue, "");
            UniffiForeignFutureResultRustBuffer.UniffiByValue uniffiByValue = new UniffiForeignFutureResultRustBuffer.UniffiByValue(ANQ.uniffiRustBuffer.getRustBufferOp(), new RustBuffer.ByValue(null, 1, null), byValue);
            uniffiByValue.write();
            uniffiForeignFutureCompleteRustBuffer.callback(j, uniffiByValue);
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
            FfiConverterTypeSharePlatformManager.INSTANCE.getHandleMap$OKCore_deploy().AEQbTJ(j);
        }
    }

    public static final class uniffiClone implements UniffiCallbackInterfaceClone {
        public static final int $stable = 0;
        public static final uniffiClone INSTANCE = new uniffiClone();

        private uniffiClone() {
        }

        @Override // uniffi.UniffiCallbackInterfaceClone
        public long callback(long j) {
            return FfiConverterTypeSharePlatformManager.INSTANCE.getHandleMap$OKCore_deploy().OLrzqt(j);
        }
    }

    public final void AEQbTJ(@NotNull UniffiLib uniffiLib) {
        Intrinsics.checkNotNullParameter(uniffiLib, "");
        uniffiLib.uniffi_growth_fn_init_callback_vtable_shareplatformmanager(vtable);
    }
}
