package com.reown.android.pairing.client;

import com.reown.android.Core;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface PairingInterface {

    public interface Delegate {

        public static final class DefaultImpls {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void onPairingDelete(@NotNull Delegate delegate, @NotNull Core.Model.DeletedPairing deletedPairing) {
                Intrinsics.checkNotNullParameter(deletedPairing, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void onPairingExpired(@NotNull Delegate delegate, @NotNull Core.Model.ExpiredPairing expiredPairing) {
                Intrinsics.checkNotNullParameter(expiredPairing, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void onPairingState(@NotNull Delegate delegate, @NotNull Core.Model.PairingState pairingState) {
                Intrinsics.checkNotNullParameter(pairingState, "");
            }
        }

        void onPairingDelete(@NotNull Core.Model.DeletedPairing deletedPairing);

        void onPairingExpired(@NotNull Core.Model.ExpiredPairing expiredPairing);

        void onPairingState(@NotNull Core.Model.PairingState pairingState);
    }

    Core.Model.Pairing create(@NotNull Function1<? super Core.Model.Error, Unit> function1);

    Core.Model.Pairing create(@NotNull Function1<? super Core.Model.Error, Unit> function1, @NotNull String str);

    void disconnect(@NotNull Core.Params.Disconnect disconnect, @NotNull Function1<? super Core.Model.Error, Unit> function1);

    void disconnect(@NotNull String str, @NotNull Function1<? super Core.Model.Error, Unit> function1);

    List<Core.Model.Pairing> getPairings();

    void initialize();

    void pair(@NotNull Core.Params.Pair pair, @NotNull Function1<? super Core.Params.Pair, Unit> function1, @NotNull Function1<? super Core.Model.Error, Unit> function12);

    void ping(@NotNull Core.Params.Ping ping, Core.Listeners.PairingPing pairingPing);

    void setDelegate(@NotNull Delegate delegate);

    boolean validatePairingUri(@NotNull String str);

    /* JADX INFO: loaded from: classes17.dex */
    public static final class DefaultImpls {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.pairing.client.PairingInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Core.Model.Pairing create$default(PairingInterface pairingInterface, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
            if ((i & 1) != 0) {
                function1 = new Function1<Core.Model.Error, Unit>() { // from class: com.reown.android.pairing.client.PairingInterface.create.1
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
            return pairingInterface.create(function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.pairing.client.PairingInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Core.Model.Pairing create$default(PairingInterface pairingInterface, Function1 function1, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
            if ((i & 1) != 0) {
                function1 = new Function1<Core.Model.Error, Unit>() { // from class: com.reown.android.pairing.client.PairingInterface.create.2
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
            return pairingInterface.create(function1, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.pairing.client.PairingInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void pair$default(PairingInterface pairingInterface, Core.Params.Pair pair, Function1 function1, Function1 function12, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pair");
            }
            if ((i & 2) != 0) {
                function1 = new Function1<Core.Params.Pair, Unit>() { // from class: com.reown.android.pairing.client.PairingInterface.pair.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Core.Params.Pair pair2) {
                        Intrinsics.checkNotNullParameter(pair2, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Core.Params.Pair pair2) {
                        invoke2(pair2);
                        return Unit.INSTANCE;
                    }
                };
            }
            if ((i & 4) != 0) {
                function12 = new Function1<Core.Model.Error, Unit>() { // from class: com.reown.android.pairing.client.PairingInterface.pair.2
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
            pairingInterface.pair(pair, function1, function12);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.pairing.client.PairingInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void disconnect$default(PairingInterface pairingInterface, String str, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: disconnect");
            }
            if ((i & 2) != 0) {
                function1 = new Function1<Core.Model.Error, Unit>() { // from class: com.reown.android.pairing.client.PairingInterface.disconnect.1
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
            pairingInterface.disconnect(str, (Function1<? super Core.Model.Error, Unit>) function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.pairing.client.PairingInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void disconnect$default(PairingInterface pairingInterface, Core.Params.Disconnect disconnect, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: disconnect");
            }
            if ((i & 2) != 0) {
                function1 = new Function1<Core.Model.Error, Unit>() { // from class: com.reown.android.pairing.client.PairingInterface.disconnect.2
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
            pairingInterface.disconnect(disconnect, (Function1<? super Core.Model.Error, Unit>) function1);
        }

        public static /* synthetic */ void ping$default(PairingInterface pairingInterface, Core.Params.Ping ping, Core.Listeners.PairingPing pairingPing, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ping");
            }
            if ((i & 2) != 0) {
                pairingPing = null;
            }
            pairingInterface.ping(ping, pairingPing);
        }
    }
}
