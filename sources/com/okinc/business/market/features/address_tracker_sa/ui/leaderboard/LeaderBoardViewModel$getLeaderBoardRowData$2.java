package com.okinc.business.market.features.address_tracker_sa.ui.leaderboard;

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
import o.jBH;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardViewModel$getLeaderBoardRowData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<jBB> $boardData;
    final /* synthetic */ jBH $filter;
    final /* synthetic */ String $walletAddress;
    Object L$0;
    int label;
    final /* synthetic */ LeaderBoardViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeaderBoardViewModel$getLeaderBoardRowData$2(Ref.ObjectRef<jBB> objectRef, LeaderBoardViewModel leaderBoardViewModel, jBH jbh, String str, Continuation<? super LeaderBoardViewModel$getLeaderBoardRowData$2> continuation) {
        super(2, continuation);
        this.$boardData = objectRef;
        this.this$0 = leaderBoardViewModel;
        this.$filter = jbh;
        this.$walletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LeaderBoardViewModel$getLeaderBoardRowData$2(this.$boardData, this.this$0, this.$filter, this.$walletAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LeaderBoardViewModel$getLeaderBoardRowData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v6, resolved type: T */
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
            jBD jbd = this.this$0.uzCIH;
            jBH jbh = this.$filter;
            String str = this.$walletAddress;
            this.L$0 = objectRef2;
            this.label = 1;
            Object objEZpvd = jbd.EZpvd(jbh, str, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            objectRef = objectRef2;
            objM7386unboximpl = objEZpvd;
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
