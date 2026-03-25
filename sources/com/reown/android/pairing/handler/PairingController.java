package com.reown.android.pairing.handler;

import com.reown.android.Core;
import com.reown.android.internal.common.KoinApplicationKt;
import com.reown.android.internal.common.model.Pairing;
import com.reown.android.internal.common.model.SDKError;
import com.reown.android.pairing.engine.domain.PairingEngine;
import com.reown.android.pairing.model.mapper.PairingMapperKt;
import com.reown.foundation.common.model.Topic;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import o.C56392yDr;
import o.C56524yIo;
import o.C60018ztu;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class PairingController implements PairingControllerInterface {
    public final InterfaceC56387yDm checkVerifyKeyFlow$delegate;
    public final InterfaceC56387yDm findWrongMethodsFlow$delegate;
    public final C60018ztu koinApp;
    public PairingEngine pairingEngine;
    public final InterfaceC56387yDm storedPairingFlow$delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PairingController() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public PairingController(@NotNull C60018ztu c60018ztu) {
        Intrinsics.checkNotNullParameter(c60018ztu, "");
        this.koinApp = c60018ztu;
        this.findWrongMethodsFlow$delegate = C56392yDr.copydefault(new Function0<Flow<? extends SDKError>>() { // from class: com.reown.android.pairing.handler.PairingController$findWrongMethodsFlow$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX DEBUG: Return type fixed from 'kotlinx.coroutines.flow.Flow<com.reown.android.internal.common.model.SDKError>' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public final Flow<? extends SDKError> invoke() {
                PairingEngine pairingEngine = this.this$0.pairingEngine;
                PairingEngine pairingEngine2 = null;
                if (pairingEngine == null) {
                    Intrinsics.gEmmrt("");
                    pairingEngine = null;
                }
                MutableSharedFlow<SDKError> internalErrorFlow = pairingEngine.getInternalErrorFlow();
                PairingEngine pairingEngine3 = this.this$0.pairingEngine;
                if (pairingEngine3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    pairingEngine2 = pairingEngine3;
                }
                return FlowKt.merge(internalErrorFlow, pairingEngine2.getJsonRpcErrorFlow());
            }
        });
        this.storedPairingFlow$delegate = C56392yDr.copydefault(new Function0<SharedFlow<? extends Pair<? extends Topic, ? extends List<String>>>>() { // from class: com.reown.android.pairing.handler.PairingController$storedPairingFlow$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX DEBUG: Return type fixed from 'kotlinx.coroutines.flow.SharedFlow<kotlin.Pair<com.reown.foundation.common.model.Topic, java.util.List<java.lang.String>>>' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public final SharedFlow<? extends Pair<? extends Topic, ? extends List<String>>> invoke() {
                PairingEngine pairingEngine = this.this$0.pairingEngine;
                if (pairingEngine == null) {
                    Intrinsics.gEmmrt("");
                    pairingEngine = null;
                }
                return pairingEngine.getStoredPairingTopicFlow();
            }
        });
        this.checkVerifyKeyFlow$delegate = C56392yDr.copydefault(new Function0<SharedFlow<? extends Unit>>() { // from class: com.reown.android.pairing.handler.PairingController$checkVerifyKeyFlow$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX DEBUG: Return type fixed from 'kotlinx.coroutines.flow.SharedFlow<kotlin.Unit>' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public final SharedFlow<? extends Unit> invoke() {
                PairingEngine pairingEngine = this.this$0.pairingEngine;
                if (pairingEngine == null) {
                    Intrinsics.gEmmrt("");
                    pairingEngine = null;
                }
                return pairingEngine.getCheckVerifyKeyFlow();
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:o.ztu:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.ztu:0x0004: INVOKE  STATIC call: com.reown.android.internal.common.KoinApplicationKt.getWcKoinApp():o.ztu A[MD:():o.ztu (m), WRAPPED] (LINE:15)) : (r1v0 o.ztu))
 A[MD:(o.ztu):void (m)] (LINE:15) call: com.reown.android.pairing.handler.PairingController.<init>(o.ztu):void type: THIS */
    public /* synthetic */ PairingController(C60018ztu c60018ztu, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? KoinApplicationKt.getWcKoinApp() : c60018ztu);
    }

    @Override // com.reown.android.pairing.handler.PairingControllerInterface
    public Flow<SDKError> getFindWrongMethodsFlow() {
        return (Flow) this.findWrongMethodsFlow$delegate.getValue();
    }

    @Override // com.reown.android.pairing.handler.PairingControllerInterface
    public SharedFlow<Pair<Topic, List<String>>> getStoredPairingFlow() {
        return (SharedFlow) this.storedPairingFlow$delegate.getValue();
    }

    @Override // com.reown.android.pairing.handler.PairingControllerInterface
    public SharedFlow<Unit> getCheckVerifyKeyFlow() {
        return (SharedFlow) this.checkVerifyKeyFlow$delegate.getValue();
    }

    @Override // com.reown.android.pairing.handler.PairingControllerInterface
    public void initialize() {
        this.pairingEngine = (PairingEngine) this.koinApp.OLrzqt().EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(PairingEngine.class), null, null);
    }

    @Override // com.reown.android.pairing.handler.PairingControllerInterface
    public void register(@NotNull String... strArr) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(strArr, "");
        checkEngineInitialization();
        PairingEngine pairingEngine = this.pairingEngine;
        if (pairingEngine == null) {
            Intrinsics.gEmmrt("");
            pairingEngine = null;
        }
        pairingEngine.register((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // com.reown.android.pairing.handler.PairingControllerInterface
    public Pairing getPairingByTopic(@NotNull Topic topic) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(topic, "");
        checkEngineInitialization();
        try {
            PairingEngine pairingEngine = this.pairingEngine;
            if (pairingEngine == null) {
                Intrinsics.gEmmrt("");
                pairingEngine = null;
            }
            return pairingEngine.getPairingByTopic(topic);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.reown.android.pairing.handler.PairingControllerInterface
    public void setRequestReceived(@NotNull Core.Params.RequestReceived requestReceived, @NotNull final Function1<? super Core.Model.Error, Unit> function1) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(requestReceived, "");
        Intrinsics.checkNotNullParameter(function1, "");
        checkEngineInitialization();
        try {
            PairingEngine pairingEngine = this.pairingEngine;
            if (pairingEngine == null) {
                Intrinsics.gEmmrt("");
                pairingEngine = null;
            }
            pairingEngine.setRequestReceived(requestReceived.getTopic(), new Function1<Throwable, Unit>() { // from class: com.reown.android.pairing.handler.PairingController.setRequestReceived.1
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

    @Override // com.reown.android.pairing.handler.PairingControllerInterface
    public void updateMetadata(@NotNull Core.Params.UpdateMetadata updateMetadata, @NotNull Function1<? super Core.Model.Error, Unit> function1) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(updateMetadata, "");
        Intrinsics.checkNotNullParameter(function1, "");
        checkEngineInitialization();
        try {
            PairingEngine pairingEngine = this.pairingEngine;
            if (pairingEngine == null) {
                Intrinsics.gEmmrt("");
                pairingEngine = null;
            }
            pairingEngine.updateMetadata(updateMetadata.getTopic(), PairingMapperKt.toAppMetaData(updateMetadata.getMetadata()), updateMetadata.getMetaDataType());
        } catch (Exception e) {
            function1.invoke(new Core.Model.Error(e));
        }
    }

    @Override // com.reown.android.pairing.handler.PairingControllerInterface
    public void deleteAndUnsubscribePairing(@NotNull Core.Params.Delete delete, @NotNull Function1<? super Core.Model.Error, Unit> function1) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(delete, "");
        Intrinsics.checkNotNullParameter(function1, "");
        checkEngineInitialization();
        try {
            PairingEngine pairingEngine = this.pairingEngine;
            if (pairingEngine == null) {
                Intrinsics.gEmmrt("");
                pairingEngine = null;
            }
            pairingEngine.deleteAndUnsubscribePairing(delete.getTopic());
        } catch (Exception e) {
            function1.invoke(new Core.Model.Error(e));
        }
    }

    public final void checkEngineInitialization() throws IllegalStateException {
        if (this.pairingEngine == null) {
            throw new IllegalStateException("CoreClient needs to be initialized first using the initialize function".toString());
        }
    }
}
