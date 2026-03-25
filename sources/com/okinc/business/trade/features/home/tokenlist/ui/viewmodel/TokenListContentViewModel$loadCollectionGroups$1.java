package com.okinc.business.trade.features.home.tokenlist.ui.viewmodel;

import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.business.trade.features.home.domain.model.TradingBizType;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C28388kZo;
import o.C30429law;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC28383kZj;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenListContentViewModel$loadCollectionGroups$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C30429law this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenListContentViewModel$loadCollectionGroups$1(C30429law c30429law, Continuation<? super TokenListContentViewModel$loadCollectionGroups$1> continuation) {
        super(2, continuation);
        this.this$0 = c30429law;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenListContentViewModel$loadCollectionGroups$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenListContentViewModel$loadCollectionGroups$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28388kZo c28388kZo = this.this$0.AhwBna;
            boolean z = this.this$0.AuCTel == TradingBizType.Bridge;
            this.label = 1;
            obj = c28388kZo.AEQbTJ(z, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List listAhwBna = (List) ((AbstractC43419rot) obj).copydefault();
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        C30429law c30429law = this.this$0;
        CommonGroupData commonGroupData = (CommonGroupData) CollectionsKt___CollectionsKt.firstOrNull(listAhwBna);
        c30429law.fetchVPNInfo = String.valueOf(commonGroupData != null ? C56443yFo.AEQbTJ(commonGroupData.OLrzqt()) : null);
        this.this$0.AEQbTJ.setValue(new InterfaceC28383kZj.Application(listAhwBna));
        return Unit.INSTANCE;
    }
}
