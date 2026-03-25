package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.signing.cacao.Issuer;
import com.reown.android.internal.utils.CoreValidator;
import com.reown.sign.common.exceptions.MessagesKt;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class FormatAuthenticateMessageUseCase implements FormatAuthenticateMessageUseCaseInterface {

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.FormatAuthenticateMessageUseCase$formatMessage$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        public final /* synthetic */ String $iss;
        public final /* synthetic */ EngineDO.PayloadParams $payloadParams;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, EngineDO.PayloadParams payloadParams, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$iss = str;
            this.$payloadParams = payloadParams;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.$iss, this.$payloadParams, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Exception {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Issuer issuer = new Issuer(this.$iss);
                if (!this.$payloadParams.getChains().contains(issuer.getChainId())) {
                    throw new Exception("Issuer chainId does not match with PayloadParams");
                }
                Iterator<T> it = this.$payloadParams.getChains().iterator();
                while (it.hasNext()) {
                    if (!CoreValidator.INSTANCE.isChainIdCAIP2Compliant((String) it.next())) {
                        throw new Exception(MessagesKt.NAMESPACE_CHAINS_CAIP_2_MESSAGE);
                    }
                }
                CoreValidator coreValidator = CoreValidator.INSTANCE;
                if (!coreValidator.isChainIdCAIP2Compliant(issuer.getChainId())) {
                    throw new Exception("Issuer chainId is not CAIP-2 compliant");
                }
                if (!coreValidator.isAccountIdCAIP10Compliant(issuer.getAccountId())) {
                    throw new Exception("Issuer address is not CAIP-10 compliant");
                }
                return EngineMapperKt.toCAIP222Message(this.$payloadParams, issuer, "Ethereum");
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.reown.sign.engine.use_case.calls.FormatAuthenticateMessageUseCaseInterface
    public Object formatMessage(@NotNull EngineDO.PayloadParams payloadParams, @NotNull String str, @NotNull Continuation<? super String> continuation) throws Exception {
        return SupervisorKt.supervisorScope(new AnonymousClass2(str, payloadParams, null), continuation);
    }
}
