package com.okinc.business.trade.features.home.tokenlist.ui.viewmodel;

import com.okinc.business.dexlogic.bean.DexMultiTokenDetailParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC43419rot;
import o.C28391kZr;
import o.C30429law;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenListContentViewModel$addTokenToSubscribe$1 extends SuspendLambda implements Function2<FlowCollector<? super Pair<? extends Boolean, ? extends DexMultiTokenInfoBean>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ DexMultiTokenInfoBean $item;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C30429law this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenListContentViewModel$addTokenToSubscribe$1(C30429law c30429law, DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super TokenListContentViewModel$addTokenToSubscribe$1> continuation) {
        super(2, continuation);
        this.this$0 = c30429law;
        this.$item = dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TokenListContentViewModel$addTokenToSubscribe$1 tokenListContentViewModel$addTokenToSubscribe$1 = new TokenListContentViewModel$addTokenToSubscribe$1(this.this$0, this.$item, continuation);
        tokenListContentViewModel$addTokenToSubscribe$1.L$0 = obj;
        return tokenListContentViewModel$addTokenToSubscribe$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Pair<? extends Boolean, ? extends DexMultiTokenInfoBean>> flowCollector, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super Pair<Boolean, DexMultiTokenInfoBean>>) flowCollector, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Pair<Boolean, DexMultiTokenInfoBean>> flowCollector, Continuation<? super Unit> continuation) {
        return ((TokenListContentViewModel$addTokenToSubscribe$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            flowCollector = (FlowCollector) this.L$0;
            C28391kZr c28391kZr = this.this$0.copydefault;
            List<DexMultiTokenDetailParam> listEZpvd = C56402yEa.EZpvd(new DexMultiTokenDetailParam(this.$item.getChainId(), this.$item.getTokenContractAddress(), this.$item.getTokenSymbol(), this.$item.getDecimals()));
            this.L$0 = flowCollector;
            this.label = 1;
            obj = c28391kZr.KWHzl(listEZpvd, this);
            if (obj == objCopydefault) {
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
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) ((AbstractC43419rot) obj).copydefault();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = list != null ? (DexMultiTokenInfoBean) CollectionsKt___CollectionsKt.firstOrNull(list) : null;
        Pair pairOLrzqt = C56390yDp.OLrzqt(C56443yFo.KWHzl(dexMultiTokenInfoBean != null), dexMultiTokenInfoBean);
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(pairOLrzqt, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
