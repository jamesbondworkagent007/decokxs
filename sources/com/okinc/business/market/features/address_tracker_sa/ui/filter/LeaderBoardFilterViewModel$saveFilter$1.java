package com.okinc.business.market.features.address_tracker_sa.ui.filter;

import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C25666jBw;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardFilterViewModel$saveFilter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LeaderBoardFilterModel $model;
    int label;
    final /* synthetic */ LeaderBoardFilterViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderBoardFilterViewModel$saveFilter$1(LeaderBoardFilterViewModel leaderBoardFilterViewModel, LeaderBoardFilterModel leaderBoardFilterModel, Continuation<? super LeaderBoardFilterViewModel$saveFilter$1> continuation) {
        super(2, continuation);
        this.this$0 = leaderBoardFilterViewModel;
        this.$model = leaderBoardFilterModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LeaderBoardFilterViewModel$saveFilter$1(this.this$0, this.$model, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LeaderBoardFilterViewModel$saveFilter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C25666jBw c25666jBw = this.this$0.AEQbTJ;
            LeaderBoardFilterModel leaderBoardFilterModel = this.$model;
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            LeaderBoardFilterModel leaderBoardFilterModelOLrzqt = leaderBoardFilterModel.OLrzqt((1022 & 1) != 0 ? leaderBoardFilterModel.OLrzqt : string, (1022 & 2) != 0 ? leaderBoardFilterModel.AEQbTJ : null, (1022 & 4) != 0 ? leaderBoardFilterModel.EZpvd : null, (1022 & 8) != 0 ? leaderBoardFilterModel.valueOf : null, (1022 & 16) != 0 ? leaderBoardFilterModel.KWHzl : null, (1022 & 32) != 0 ? leaderBoardFilterModel.copydefault : null, (1022 & 64) != 0 ? leaderBoardFilterModel.AYXKKw : null, (1022 & 128) != 0 ? leaderBoardFilterModel.djBIcL : null, (1022 & 256) != 0 ? leaderBoardFilterModel.AhwBna : null, (1022 & 512) != 0 ? leaderBoardFilterModel.gEmmrt : null);
            this.label = 1;
            objAEQbTJ = c25666jBw.AEQbTJ(leaderBoardFilterModelOLrzqt, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        }
        if (((Boolean) objAEQbTJ).booleanValue()) {
            this.this$0.copydefault();
        }
        return Unit.INSTANCE;
    }
}
