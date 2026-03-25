package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23184htT;
import o.C28196kSl;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedKLineVM$fetchBuySellData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bar;
    int label;
    final /* synthetic */ AdvancedKLineVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedKLineVM$fetchBuySellData$1(AdvancedKLineVM advancedKLineVM, String str, Continuation<? super AdvancedKLineVM$fetchBuySellData$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedKLineVM;
        this.$bar = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedKLineVM$fetchBuySellData$1(this.this$0, this.$bar, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedKLineVM$fetchBuySellData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28196kSl c28196kSl = this.this$0.AuCTel;
            DexMultiTokenInfoBean dexMultiTokenInfoBean = (DexMultiTokenInfoBean) this.this$0.EZpvd.getValue();
            String chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
            if (chainId == null) {
                chainId = "";
            }
            this.label = 1;
            obj = c28196kSl.KWHzl(chainId, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        String str = (String) obj;
        if (str.length() > 0) {
            C23184htT c23184htTAEQbTJ = this.this$0.AEQbTJ();
            if (c23184htTAEQbTJ != null) {
                C23184htT.initKlineBuySellPointerAndWsListener$default(c23184htTAEQbTJ, this.$bar, str, null, 4, null);
            }
        } else {
            C23184htT c23184htTAEQbTJ2 = this.this$0.AEQbTJ();
            if (c23184htTAEQbTJ2 != null) {
                c23184htTAEQbTJ2.EZpvd();
            }
        }
        return Unit.INSTANCE;
    }
}
