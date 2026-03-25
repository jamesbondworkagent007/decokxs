package com.okinc.okimcore.feature.agentbot.usecase;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.feature.agentbot.model.InitAgentBotRequest;
import com.okinc.okimcore.feature.agentbot.model.InitAgentBotResponse;
import com.okinc.okimcore.feature.agentbot.model.enums.AgentBotEntryInfo;
import com.okinc.okimcore.feature.agentbot.remote.AgentBotApiService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.sFD;
import o.sFH;
import o.sFI;

/* JADX INFO: loaded from: classes10.dex */
public final class InitAgentBotUseCaseImpl$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super sFH>, Object> {
    final /* synthetic */ AgentBotEntryInfo $entryInfo;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ sFI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitAgentBotUseCaseImpl$invoke$2(AgentBotEntryInfo agentBotEntryInfo, sFI sfi, Continuation<? super InitAgentBotUseCaseImpl$invoke$2> continuation) {
        super(2, continuation);
        this.$entryInfo = agentBotEntryInfo;
        this.this$0 = sfi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InitAgentBotUseCaseImpl$invoke$2 initAgentBotUseCaseImpl$invoke$2 = new InitAgentBotUseCaseImpl$invoke$2(this.$entryInfo, this.this$0, continuation);
        initAgentBotUseCaseImpl$invoke$2.L$0 = obj;
        return initAgentBotUseCaseImpl$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super sFH> continuation) {
        return ((InitAgentBotUseCaseImpl$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                String apiValue = this.$entryInfo.getApiValue();
                long jLongValue = this.this$0.EZpvd().invoke().longValue();
                Long l = (Long) this.this$0.copydefault.get(apiValue);
                if (l == null || jLongValue - l.longValue() >= 3000) {
                    this.this$0.copydefault.put(apiValue, C56443yFo.KWHzl(jLongValue));
                    InitAgentBotRequest initAgentBotRequest = new InitAgentBotRequest(this.$entryInfo.getApiValue());
                    AgentBotApiService agentBotApiService = this.this$0.OLrzqt;
                    this.label = 1;
                    obj = agentBotApiService.initAgentBotSession(initAgentBotRequest, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    pUU.KWHzl("InitAgentBotUseCase", "Request discarded due to buffering: " + apiValue);
                    return sFH.ActionBar.KWHzl;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            AbstractC43419rot.StateListAnimator stateListAnimator = (AbstractC43419rot.StateListAnimator) actionBar;
            String imChannelId = ((InitAgentBotResponse) stateListAnimator.KWHzl()).getImChannelId();
            Boolean userLanguageSupported = ((InitAgentBotResponse) stateListAnimator.KWHzl()).getUserLanguageSupported();
            if (imChannelId != null) {
                pUU.KWHzl("InitAgentBotUseCase", "Init agent bot session success: " + stateListAnimator.KWHzl());
                return new sFH.TaskDescription(new sFD(imChannelId, userLanguageSupported != null ? userLanguageSupported.booleanValue() : false));
            }
            pUU.valueOf("InitAgentBotUseCase", "Init agent bot session success but channelId is null");
            return sFH.Activity.AEQbTJ;
        }
        if (!(actionBar instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        pUU.copydefault("InitAgentBotUseCase", "Init agent bot session failed: " + ((AbstractC43419rot.ActionBar) actionBar).KWHzl());
        return sFH.Activity.AEQbTJ;
    }
}
