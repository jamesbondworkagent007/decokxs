package com.reown.android.relay;

import com.reown.android.Core;
import com.reown.foundation.network.RelayInterface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface RelayConnectionInterface extends RelayInterface {
    void connect(@NotNull Function1<? super Core.Model.Error, Unit> function1);

    void connect(@NotNull Function1<? super Core.Model.Error, Unit> function1, @NotNull Function1<? super String, Unit> function12);

    void disconnect(@NotNull Function1<? super Core.Model.Error, Unit> function1);

    void disconnect(@NotNull Function1<? super Core.Model.Error, Unit> function1, @NotNull Function1<? super String, Unit> function12);

    Flow<Object> getOnResubscribe();

    StateFlow<WSSConnectionState> getWssConnectionState();

    StateFlow<Boolean> isNetworkAvailable();

    void restart(@NotNull Function1<? super Core.Model.Error, Unit> function1);

    /* JADX INFO: loaded from: classes17.dex */
    public static final class DefaultImpls {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.relay.RelayConnectionInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void connect$default(RelayConnectionInterface relayConnectionInterface, Function1 function1, Function1 function12, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: connect");
            }
            if ((i & 1) != 0) {
                function1 = new Function1<Core.Model.Error, Unit>() { // from class: com.reown.android.relay.RelayConnectionInterface.connect.1
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
            relayConnectionInterface.connect(function1, function12);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.relay.RelayConnectionInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void disconnect$default(RelayConnectionInterface relayConnectionInterface, Function1 function1, Function1 function12, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: disconnect");
            }
            if ((i & 1) != 0) {
                function1 = new Function1<Core.Model.Error, Unit>() { // from class: com.reown.android.relay.RelayConnectionInterface.disconnect.1
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
            relayConnectionInterface.disconnect(function1, function12);
        }
    }
}
