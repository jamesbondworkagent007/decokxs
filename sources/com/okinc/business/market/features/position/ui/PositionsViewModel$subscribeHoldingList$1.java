package com.okinc.business.market.features.position.ui;

import com.okinc.business.market.features.holdings.domain.model.HoldingAsset;
import com.okinc.business.market.features.position.ui.PositionsViewModel$subscribeHoldingList$1;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C28434kah;
import o.C29092knC;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class PositionsViewModel$subscribeHoldingList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ PositionsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionsViewModel$subscribeHoldingList$1(PositionsViewModel positionsViewModel, Continuation<? super PositionsViewModel$subscribeHoldingList$1> continuation) {
        super(2, continuation);
        this.this$0 = positionsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionsViewModel$subscribeHoldingList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PositionsViewModel$subscribeHoldingList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        final PositionsViewModel positionsViewModel;
        Application application;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<HoldingAsset> listOLrzqt = ((C29092knC) this.this$0.AEQbTJ.getValue()).OLrzqt();
            if (listOLrzqt != null) {
                positionsViewModel = this.this$0;
                if (listOLrzqt.isEmpty()) {
                    return Unit.INSTANCE;
                }
                C28434kah c28434kah = positionsViewModel.valueOf;
                Function0<Unit> function0 = new Function0() { // from class: o.kod
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return PositionsViewModel$subscribeHoldingList$1.invokeSuspend$lambda$1$lambda$0(positionsViewModel);
                    }
                };
                this.L$0 = positionsViewModel;
                this.label = 1;
                obj = c28434kah.AEQbTJ(listOLrzqt, function0, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                application = new Application(positionsViewModel);
                this.L$0 = null;
                this.label = 2;
                if (((Flow) obj).collect(application, this) == objCopydefault) {
                }
            }
        } else if (i == 1) {
            positionsViewModel = (PositionsViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            application = new Application(positionsViewModel);
            this.L$0 = null;
            this.label = 2;
            if (((Flow) obj).collect(application, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(PositionsViewModel positionsViewModel) {
        positionsViewModel.AEQbTJ(false);
        return Unit.INSTANCE;
    }

    public static final class Application<T> implements FlowCollector {
        public final /* synthetic */ PositionsViewModel OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(PositionsViewModel positionsViewModel) {
            this.OLrzqt = positionsViewModel;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final Object emit(List<HoldingAsset> list, Continuation<? super Unit> continuation) {
            this.OLrzqt.copydefault(new C29092knC(false, list, null, false, 0L, 29, null));
            return Unit.INSTANCE;
        }
    }
}
