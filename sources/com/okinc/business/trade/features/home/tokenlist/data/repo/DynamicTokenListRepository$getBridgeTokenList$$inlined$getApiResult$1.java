package com.okinc.business.trade.features.home.tokenlist.data.repo;

import com.okinc.business.defi.api.bean.OKWalletHiddenSmallAssetTokenModel;
import com.okinc.business.dexlogic.bean.ChainTokensData;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28379kZf;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23233huP;
import o.kYA;

/* JADX INFO: loaded from: classes7.dex */
public final class DynamicTokenListRepository$getBridgeTokenList$$inlined$getApiResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<List<? extends ChainTokensData>>>, Object> {
    final /* synthetic */ C28379kZf $request$inlined;
    int label;
    final /* synthetic */ kYA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicTokenListRepository$getBridgeTokenList$$inlined$getApiResult$1(Continuation continuation, kYA kya, C28379kZf c28379kZf) {
        super(2, continuation);
        this.this$0 = kya;
        this.$request$inlined = c28379kZf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DynamicTokenListRepository$getBridgeTokenList$$inlined$getApiResult$1(continuation, this.this$0, this.$request$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<? extends ChainTokensData>>> continuation) {
        return ((DynamicTokenListRepository$getBridgeTokenList$$inlined$getApiResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            OKWalletHiddenSmallAssetTokenModel oKWalletHiddenSmallAssetTokenModelAEQbTJ = this.this$0.copydefault.AEQbTJ();
            InterfaceC23233huP interfaceC23233huP = this.this$0.KWHzl;
            String strOLrzqt = this.$request$inlined.OLrzqt();
            String strGEmmrt = this.$request$inlined.gEmmrt();
            String strKWHzl = this.$request$inlined.KWHzl();
            String strDjBIcL = this.$request$inlined.djBIcL();
            String strAYXKKw = this.$request$inlined.AYXKKw();
            String strCopydefault = this.$request$inlined.copydefault();
            String strEZpvd = this.$request$inlined.EZpvd();
            String strAEQbTJ = this.$request$inlined.AEQbTJ();
            String hiddenValue = oKWalletHiddenSmallAssetTokenModelAEQbTJ.getEnableHidden() ? oKWalletHiddenSmallAssetTokenModelAEQbTJ.getHiddenValue() : null;
            this.label = 1;
            obj = interfaceC23233huP.OLrzqt(strOLrzqt, strGEmmrt, strKWHzl, strDjBIcL, strAYXKKw, strCopydefault, strEZpvd, strAEQbTJ, hiddenValue, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
