package com.reown.android.pairing.client;

import com.reown.android.Core;
import com.reown.android.internal.Validator;
import com.reown.android.internal.common.KoinApplicationKt;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.model.Pairing;
import com.reown.android.pairing.client.PairingInterface;
import com.reown.android.pairing.engine.domain.PairingEngine;
import com.reown.android.pairing.engine.model.EngineDO;
import com.reown.android.pairing.model.mapper.PairingMapperKt;
import com.reown.android.pulse.domain.InsertTelemetryEventUseCase;
import com.reown.android.relay.RelayConnectionInterface;
import com.reown.foundation.util.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import o.C56391yDq;
import o.C56392yDr;
import o.C56403yEb;
import o.C56442yFn;
import o.C56524yIo;
import o.C60018ztu;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class PairingProtocol implements PairingInterface {
    public final InterfaceC56387yDm insertEventUseCase$delegate;
    public final C60018ztu koinApp;
    public final InterfaceC56387yDm logger$delegate;
    public PairingEngine pairingEngine;
    public final InterfaceC56387yDm relayClient$delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PairingProtocol() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public PairingProtocol(@NotNull C60018ztu c60018ztu) {
        Intrinsics.checkNotNullParameter(c60018ztu, "");
        this.koinApp = c60018ztu;
        this.logger$delegate = C56392yDr.copydefault(new Function0<Logger>() { // from class: com.reown.android.pairing.client.PairingProtocol$logger$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Logger invoke() {
                return (Logger) this.this$0.koinApp.OLrzqt().EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(Logger.class), null, null);
            }
        });
        this.relayClient$delegate = C56392yDr.copydefault(new Function0<RelayConnectionInterface>() { // from class: com.reown.android.pairing.client.PairingProtocol$relayClient$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final RelayConnectionInterface invoke() {
                return (RelayConnectionInterface) this.this$0.koinApp.OLrzqt().EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(RelayConnectionInterface.class), null, null);
            }
        });
        this.insertEventUseCase$delegate = C56392yDr.copydefault(new Function0<InsertTelemetryEventUseCase>() { // from class: com.reown.android.pairing.client.PairingProtocol$insertEventUseCase$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final InsertTelemetryEventUseCase invoke() {
                return (InsertTelemetryEventUseCase) this.this$0.koinApp.OLrzqt().EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(InsertTelemetryEventUseCase.class), null, null);
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:o.ztu:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.ztu:0x0004: INVOKE  STATIC call: com.reown.android.internal.common.KoinApplicationKt.getWcKoinApp():o.ztu A[MD:():o.ztu (m), WRAPPED] (LINE:18)) : (r1v0 o.ztu))
 A[MD:(o.ztu):void (m)] (LINE:18) call: com.reown.android.pairing.client.PairingProtocol.<init>(o.ztu):void type: THIS */
    public /* synthetic */ PairingProtocol(C60018ztu c60018ztu, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? KoinApplicationKt.getWcKoinApp() : c60018ztu);
    }

    public final Logger getLogger() {
        return (Logger) this.logger$delegate.getValue();
    }

    public final RelayConnectionInterface getRelayClient() {
        return (RelayConnectionInterface) this.relayClient$delegate.getValue();
    }

    public final InsertTelemetryEventUseCase getInsertEventUseCase() {
        return (InsertTelemetryEventUseCase) this.insertEventUseCase$delegate.getValue();
    }

    @Override // com.reown.android.pairing.client.PairingInterface
    public void initialize() {
        this.pairingEngine = (PairingEngine) this.koinApp.OLrzqt().EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(PairingEngine.class), null, null);
    }

    @Override // com.reown.android.pairing.client.PairingInterface
    public void setDelegate(@NotNull PairingInterface.Delegate delegate) {
        Intrinsics.checkNotNullParameter(delegate, "");
        checkEngineInitialization();
        PairingEngine pairingEngine = this.pairingEngine;
        if (pairingEngine == null) {
            Intrinsics.gEmmrt("");
            pairingEngine = null;
        }
        FlowKt.launchIn(FlowKt.onEach(pairingEngine.getEngineEvent(), new C18181(delegate, null)), WalletConnectScopeKt.getScope());
    }

    /* JADX INFO: renamed from: com.reown.android.pairing.client.PairingProtocol$setDelegate$1, reason: invalid class name and case insensitive filesystem */
    public static final class C18181 extends SuspendLambda implements Function2<EngineDO, Continuation<? super Unit>, Object> {
        public final /* synthetic */ PairingInterface.Delegate $delegate;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18181(PairingInterface.Delegate delegate, Continuation<? super C18181> continuation) {
            super(2, continuation);
            this.$delegate = delegate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            C18181 c18181 = new C18181(this.$delegate, continuation);
            c18181.L$0 = obj;
            return c18181;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull EngineDO engineDO, Continuation<? super Unit> continuation) {
            return ((C18181) create(engineDO, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                EngineDO engineDO = (EngineDO) this.L$0;
                if (engineDO instanceof EngineDO.PairingDelete) {
                    this.$delegate.onPairingDelete(PairingMapperKt.toCore((EngineDO.PairingDelete) engineDO));
                } else if (engineDO instanceof EngineDO.PairingExpire) {
                    this.$delegate.onPairingExpired(new Core.Model.ExpiredPairing(PairingMapperKt.toCore(((EngineDO.PairingExpire) engineDO).getPairing())));
                } else if (engineDO instanceof EngineDO.PairingState) {
                    this.$delegate.onPairingState(new Core.Model.PairingState(((EngineDO.PairingState) engineDO).isPairingState()));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.reown.android.pairing.client.PairingInterface
    public Core.Model.Pairing create(@NotNull final Function1<? super Core.Model.Error, Unit> function1) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(function1, "");
        checkEngineInitialization();
        try {
            PairingEngine pairingEngine = this.pairingEngine;
            if (pairingEngine == null) {
                Intrinsics.gEmmrt("");
                pairingEngine = null;
            }
            return PairingEngine.create$default(pairingEngine, new Function1<Throwable, Unit>() { // from class: com.reown.android.pairing.client.PairingProtocol.create.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.Core$Model$Error, kotlin.Unit> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                    function1.invoke(new Core.Model.Error(th));
                }
            }, null, 2, null);
        } catch (Exception e) {
            function1.invoke(new Core.Model.Error(e));
            return null;
        }
    }

    @Override // com.reown.android.pairing.client.PairingInterface
    public Core.Model.Pairing create(@NotNull final Function1<? super Core.Model.Error, Unit> function1, @NotNull String str) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(str, "");
        checkEngineInitialization();
        try {
            PairingEngine pairingEngine = this.pairingEngine;
            if (pairingEngine == null) {
                Intrinsics.gEmmrt("");
                pairingEngine = null;
            }
            return pairingEngine.create(new Function1<Throwable, Unit>() { // from class: com.reown.android.pairing.client.PairingProtocol.create.2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.Core$Model$Error, kotlin.Unit> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                    function1.invoke(new Core.Model.Error(th));
                }
            }, str);
        } catch (Exception e) {
            function1.invoke(new Core.Model.Error(e));
            return null;
        }
    }

    @Override // com.reown.android.pairing.client.PairingInterface
    public void pair(@NotNull final Core.Params.Pair pair, @NotNull final Function1<? super Core.Params.Pair, Unit> function1, @NotNull final Function1<? super Core.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        checkEngineInitialization();
        try {
            PairingEngine pairingEngine = this.pairingEngine;
            if (pairingEngine == null) {
                Intrinsics.gEmmrt("");
                pairingEngine = null;
            }
            pairingEngine.pair(pair.getUri(), new Function0<Unit>() { // from class: com.reown.android.pairing.client.PairingProtocol.pair.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.Core$Params$Pair, kotlin.Unit> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    function1.invoke(pair);
                }
            }, new Function1<Throwable, Unit>() { // from class: com.reown.android.pairing.client.PairingProtocol.pair.2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.Core$Model$Error, kotlin.Unit> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                    function12.invoke(new Core.Model.Error(new Throwable("Pairing error: " + th.getMessage())));
                }
            });
        } catch (Exception e) {
            function12.invoke(new Core.Model.Error(e));
        }
    }

    @Override // com.reown.android.pairing.client.PairingInterface
    public void disconnect(@NotNull Core.Params.Disconnect disconnect, @NotNull final Function1<? super Core.Model.Error, Unit> function1) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(disconnect, "");
        Intrinsics.checkNotNullParameter(function1, "");
        checkEngineInitialization();
        try {
            PairingEngine pairingEngine = this.pairingEngine;
            if (pairingEngine == null) {
                Intrinsics.gEmmrt("");
                pairingEngine = null;
            }
            pairingEngine.disconnect(disconnect.getTopic(), new Function1<Throwable, Unit>() { // from class: com.reown.android.pairing.client.PairingProtocol.disconnect.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.Core$Model$Error, kotlin.Unit> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                    function1.invoke(new Core.Model.Error(th));
                }
            });
        } catch (Exception e) {
            function1.invoke(new Core.Model.Error(e));
        }
    }

    @Override // com.reown.android.pairing.client.PairingInterface
    public void disconnect(@NotNull String str, @NotNull final Function1<? super Core.Model.Error, Unit> function1) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        checkEngineInitialization();
        try {
            PairingEngine pairingEngine = this.pairingEngine;
            if (pairingEngine == null) {
                Intrinsics.gEmmrt("");
                pairingEngine = null;
            }
            pairingEngine.disconnect(str, new Function1<Throwable, Unit>() { // from class: com.reown.android.pairing.client.PairingProtocol.disconnect.2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.Core$Model$Error, kotlin.Unit> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                    function1.invoke(new Core.Model.Error(th));
                }
            });
        } catch (Exception e) {
            function1.invoke(new Core.Model.Error(e));
        }
    }

    @Override // com.reown.android.pairing.client.PairingInterface
    public void ping(@NotNull Core.Params.Ping ping, final Core.Listeners.PairingPing pairingPing) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(ping, "");
        checkEngineInitialization();
        try {
            PairingEngine pairingEngine = this.pairingEngine;
            if (pairingEngine == null) {
                Intrinsics.gEmmrt("");
                pairingEngine = null;
            }
            pairingEngine.ping(ping.getTopic(), new Function1<String, Unit>() { // from class: com.reown.android.pairing.client.PairingProtocol.ping.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Core.Listeners.PairingPing pairingPing2 = pairingPing;
                    if (pairingPing2 != null) {
                        pairingPing2.onSuccess(new Core.Model.Ping.Success(str));
                    }
                }
            }, new Function1<Throwable, Unit>() { // from class: com.reown.android.pairing.client.PairingProtocol.ping.2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                    Core.Listeners.PairingPing pairingPing2 = pairingPing;
                    if (pairingPing2 != null) {
                        pairingPing2.onError(new Core.Model.Ping.Error(th));
                    }
                }
            });
        } catch (Exception e) {
            if (pairingPing != null) {
                pairingPing.onError(new Core.Model.Ping.Error(e));
            }
        }
    }

    @Override // com.reown.android.pairing.client.PairingInterface
    public List<Core.Model.Pairing> getPairings() throws IllegalStateException {
        checkEngineInitialization();
        PairingEngine pairingEngine = this.pairingEngine;
        if (pairingEngine == null) {
            Intrinsics.gEmmrt("");
            pairingEngine = null;
        }
        List<Pairing> pairings = pairingEngine.getPairings();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(pairings, 10));
        Iterator<T> it = pairings.iterator();
        while (it.hasNext()) {
            arrayList.add(PairingMapperKt.toCore((Pairing) it.next()));
        }
        return arrayList;
    }

    @Override // com.reown.android.pairing.client.PairingInterface
    public boolean validatePairingUri(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Validator.INSTANCE.validateWCUri$android_release(str) != null;
    }

    public final void checkEngineInitialization() throws IllegalStateException {
        if (this.pairingEngine == null) {
            throw new IllegalStateException("CoreClient needs to be initialized first using the initialize function".toString());
        }
    }
}
