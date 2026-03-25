package com.okinc.business.dexlogic.main.market.detail;

import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.market.common.constants.StringBooleanType;
import com.okinc.business.market.features.group.domain.CommonGroupData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C26109jSg;
import o.C27767kCp;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketCoinDetailViewModel$signalFavoriteListChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TokenBase $tokenBase;
    int label;
    final /* synthetic */ MarketCoinDetailViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketCoinDetailViewModel$signalFavoriteListChange$1(MarketCoinDetailViewModel marketCoinDetailViewModel, TokenBase tokenBase, Continuation<? super MarketCoinDetailViewModel$signalFavoriteListChange$1> continuation) {
        super(2, continuation);
        this.this$0 = marketCoinDetailViewModel;
        this.$tokenBase = tokenBase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketCoinDetailViewModel$signalFavoriteListChange$1(this.this$0, this.$tokenBase, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketCoinDetailViewModel$signalFavoriteListChange$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        List list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C26109jSg c26109jSg = this.this$0.fARcdN;
            this.label = 1;
            if (c26109jSg.AEQbTJ(this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                ArrayList arrayList = null;
                if (Result.m7383isFailureimpl(objKWHzl)) {
                    objKWHzl = null;
                }
                list = (List) objKWHzl;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((CommonGroupData) obj2).copydefault() == StringBooleanType.TRUE) {
                            arrayList.add(obj2);
                        }
                    }
                }
                this.this$0.OLrzqt.setValue(C56443yFo.KWHzl(C33129mqd.KWHzl((Collection) arrayList)));
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        C27767kCp c27767kCp = this.this$0.fetchVPNInfo;
        String chainId = this.$tokenBase.getChainId();
        String tokenContractAddress = this.$tokenBase.getTokenContractAddress();
        this.label = 2;
        objKWHzl = c27767kCp.KWHzl(chainId, tokenContractAddress, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        ArrayList arrayList2 = null;
        if (Result.m7383isFailureimpl(objKWHzl)) {
        }
        list = (List) objKWHzl;
        if (list != null) {
        }
        this.this$0.OLrzqt.setValue(C56443yFo.KWHzl(C33129mqd.KWHzl((Collection) arrayList2)));
        return Unit.INSTANCE;
    }
}
