package com.okinc.business.market.features.address_tracker_sa.ui.recommendation;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.jBB;
import o.jBD;

/* JADX INFO: loaded from: classes6.dex */
public final class AddressTrackerRecommendationViewModel$loadLeaderBoardData$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<jBB> $boardData;
    final /* synthetic */ int $startingPosition;
    Object L$0;
    int label;
    final /* synthetic */ AddressTrackerRecommendationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressTrackerRecommendationViewModel$loadLeaderBoardData$3(Ref.ObjectRef<jBB> objectRef, AddressTrackerRecommendationViewModel addressTrackerRecommendationViewModel, int i, Continuation<? super AddressTrackerRecommendationViewModel$loadLeaderBoardData$3> continuation) {
        super(2, continuation);
        this.$boardData = objectRef;
        this.this$0 = addressTrackerRecommendationViewModel;
        this.$startingPosition = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddressTrackerRecommendationViewModel$loadLeaderBoardData$3(this.$boardData, this.this$0, this.$startingPosition, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddressTrackerRecommendationViewModel$loadLeaderBoardData$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef<jBB> objectRef;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Ref.ObjectRef<jBB> objectRef2 = this.$boardData;
            jBD jbd = this.this$0.djBIcL;
            int i2 = this.$startingPosition;
            this.L$0 = objectRef2;
            this.label = 1;
            Object objOLrzqt = jbd.OLrzqt(i2, i2 + 3, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            objectRef = objectRef2;
            objM7386unboximpl = objOLrzqt;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        boolean zM7383isFailureimpl = Result.m7383isFailureimpl(objM7386unboximpl);
        T t = objM7386unboximpl;
        if (zM7383isFailureimpl) {
            t = 0;
        }
        objectRef.element = t;
        return Unit.INSTANCE;
    }
}
