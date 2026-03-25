package com.okinc.business.dex.trade.common.check.repository;

import com.okinc.business.dexlogic.bean.PreCheckBean;
import com.okinc.business.dexlogic.bean.PreCheckParam;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C19762gOj;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23234huQ;

/* JADX INFO: loaded from: classes5.dex */
public final class PreCheckRepositoryImpl$preCheck$apiResult$1 extends SuspendLambda implements Function1<Continuation<? super ResponseData<PreCheckBean>>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $userWalletAddress;
    int label;
    final /* synthetic */ C19762gOj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreCheckRepositoryImpl$preCheck$apiResult$1(C19762gOj c19762gOj, String str, String str2, Continuation<? super PreCheckRepositoryImpl$preCheck$apiResult$1> continuation) {
        super(1, continuation);
        this.this$0 = c19762gOj;
        this.$chainId = str;
        this.$userWalletAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new PreCheckRepositoryImpl$preCheck$apiResult$1(this.this$0, this.$chainId, this.$userWalletAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ResponseData<PreCheckBean>> continuation) {
        return ((PreCheckRepositoryImpl$preCheck$apiResult$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23234huQ interfaceC23234huQ = this.this$0.KWHzl;
            PreCheckParam preCheckParam = new PreCheckParam(this.$chainId, this.$userWalletAddress);
            this.label = 1;
            obj = interfaceC23234huQ.AEQbTJ(preCheckParam, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C19762gOj c19762gOj = this.this$0;
        c19762gOj.EZpvd.put(this.$chainId, ((ResponseData) obj).getData());
        return obj;
    }
}
