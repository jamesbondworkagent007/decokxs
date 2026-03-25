package com.okinc.business.trade.features.home.tokenlist.ui.viewmodel;

import com.okinc.business.dexlogic.bean.ChainTokensData;
import com.okinc.business.trade.features.home.domain.model.TradingBizType;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C28378kZe;
import o.C30429law;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28386kZm;
import o.InterfaceC28389kZp;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenListContentViewModel$loadTokenList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $searchKey;
    int label;
    final /* synthetic */ C30429law this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenListContentViewModel$loadTokenList$1(C30429law c30429law, String str, Continuation<? super TokenListContentViewModel$loadTokenList$1> continuation) {
        super(2, continuation);
        this.this$0 = c30429law;
        this.$searchKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenListContentViewModel$loadTokenList$1(this.this$0, this.$searchKey, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenListContentViewModel$loadTokenList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC28389kZp interfaceC28389kZp = this.this$0.AuCTel == TradingBizType.Bridge ? this.this$0.valueOf : this.this$0.values;
            C28378kZe c28378kZe = new C28378kZe(this.this$0.AYXKKw, this.this$0.fARcdN, this.$searchKey, this.this$0.AuCTel, !this.this$0.ejfBZ, this.this$0.DbNXlk, this.this$0.djBIcL, this.this$0.fetchVPNInfo, this.this$0.iwGUEr);
            this.label = 1;
            objAEQbTJ = interfaceC28389kZp.AEQbTJ(c28378kZe, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objAEQbTJ;
        if (!abstractC43419rot.EZpvd()) {
            this.this$0.EZpvd.setValue(InterfaceC28386kZm.StateListAnimator.EZpvd);
            return Unit.INSTANCE;
        }
        List<ChainTokensData> list = (List) abstractC43419rot.copydefault();
        if (list == null) {
            return Unit.INSTANCE;
        }
        C30429law c30429law = this.this$0;
        String str = this.$searchKey;
        this.label = 2;
        if (c30429law.KWHzl(str, list, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
