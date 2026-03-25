package com.okinc.business.market.features.chain_list.domain;

import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25980jNm;
import o.C25983jNp;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.chain_list.domain.GetChainInfoUseCase$getChainName-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class GetChainInfoUseCase$getChainNamegIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    int label;
    final /* synthetic */ C25980jNm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChainInfoUseCase$getChainNamegIAlus$$inlined$dexRunCatching$1(Continuation continuation, C25980jNm c25980jNm, String str) {
        super(2, continuation);
        this.this$0 = c25980jNm;
        this.$chainId$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetChainInfoUseCase$getChainNamegIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends String>> continuation) {
        return ((GetChainInfoUseCase$getChainNamegIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            if (!this.this$0.KWHzl.isEmpty()) {
                str = (String) this.this$0.KWHzl.get(this.$chainId$inlined);
                if (str == null) {
                    str = "";
                }
                objM7377constructorimpl = Result.m7377constructorimpl(str);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C25983jNp c25983jNp = this.this$0.AEQbTJ;
            this.label = 1;
            obj = c25983jNp.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        for (MarketChainBean marketChainBean : (List) obj) {
            this.this$0.copydefault.put(marketChainBean.getChainId(), marketChainBean.getChainBWLogoUrl());
            this.this$0.OLrzqt.put(marketChainBean.getChainId(), marketChainBean.getChainLogo());
            this.this$0.KWHzl.put(marketChainBean.getChainId(), marketChainBean.getChainName());
        }
        str = (String) this.this$0.KWHzl.get(this.$chainId$inlined);
        if (str == null) {
            str = "";
        }
        objM7377constructorimpl = Result.m7377constructorimpl(str);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
