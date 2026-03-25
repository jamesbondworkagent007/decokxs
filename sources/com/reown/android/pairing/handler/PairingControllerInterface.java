package com.reown.android.pairing.handler;

import com.reown.android.Core;
import com.reown.android.internal.common.model.Pairing;
import com.reown.android.internal.common.model.SDKError;
import com.reown.foundation.common.model.Topic;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface PairingControllerInterface {
    void deleteAndUnsubscribePairing(@NotNull Core.Params.Delete delete, @NotNull Function1<? super Core.Model.Error, Unit> function1);

    SharedFlow<Unit> getCheckVerifyKeyFlow();

    Flow<SDKError> getFindWrongMethodsFlow();

    Pairing getPairingByTopic(@NotNull Topic topic);

    SharedFlow<Pair<Topic, List<String>>> getStoredPairingFlow();

    void initialize();

    void register(@NotNull String... strArr);

    void setRequestReceived(@NotNull Core.Params.RequestReceived requestReceived, @NotNull Function1<? super Core.Model.Error, Unit> function1);

    void updateMetadata(@NotNull Core.Params.UpdateMetadata updateMetadata, @NotNull Function1<? super Core.Model.Error, Unit> function1);

    public static final class DefaultImpls {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.pairing.handler.PairingControllerInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void setRequestReceived$default(PairingControllerInterface pairingControllerInterface, Core.Params.RequestReceived requestReceived, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRequestReceived");
            }
            if ((i & 2) != 0) {
                function1 = new Function1<Core.Model.Error, Unit>() { // from class: com.reown.android.pairing.handler.PairingControllerInterface.setRequestReceived.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Core.Model.Error error) {
                        Intrinsics.checkNotNullParameter(error, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Core.Model.Error error) {
                        invoke2(error);
                        return Unit.INSTANCE;
                    }
                };
            }
            pairingControllerInterface.setRequestReceived(requestReceived, function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.pairing.handler.PairingControllerInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void updateMetadata$default(PairingControllerInterface pairingControllerInterface, Core.Params.UpdateMetadata updateMetadata, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMetadata");
            }
            if ((i & 2) != 0) {
                function1 = new Function1<Core.Model.Error, Unit>() { // from class: com.reown.android.pairing.handler.PairingControllerInterface.updateMetadata.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Core.Model.Error error) {
                        Intrinsics.checkNotNullParameter(error, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Core.Model.Error error) {
                        invoke2(error);
                        return Unit.INSTANCE;
                    }
                };
            }
            pairingControllerInterface.updateMetadata(updateMetadata, function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.pairing.handler.PairingControllerInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void deleteAndUnsubscribePairing$default(PairingControllerInterface pairingControllerInterface, Core.Params.Delete delete, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteAndUnsubscribePairing");
            }
            if ((i & 2) != 0) {
                function1 = new Function1<Core.Model.Error, Unit>() { // from class: com.reown.android.pairing.handler.PairingControllerInterface.deleteAndUnsubscribePairing.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Core.Model.Error error) {
                        Intrinsics.checkNotNullParameter(error, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Core.Model.Error error) {
                        invoke2(error);
                        return Unit.INSTANCE;
                    }
                };
            }
            pairingControllerInterface.deleteAndUnsubscribePairing(delete, function1);
        }
    }
}
