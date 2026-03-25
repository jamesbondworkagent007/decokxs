package com.okinc.planet.biz_positions;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC46197tLk;
import o.C56391yDq;
import o.C56442yFn;
import o.tGB;
import o.tQX;

/* JADX INFO: loaded from: classes19.dex */
public final class ProfilePositionsHistoryViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $after;
    final /* synthetic */ boolean $isLoadMore;
    final /* synthetic */ String $uniqueName;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProfilePositionsHistoryViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePositionsHistoryViewModel$loadData$1(ProfilePositionsHistoryViewModel profilePositionsHistoryViewModel, String str, String str2, boolean z, Continuation<? super ProfilePositionsHistoryViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = profilePositionsHistoryViewModel;
        this.$uniqueName = str;
        this.$after = str2;
        this.$isLoadMore = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfilePositionsHistoryViewModel$loadData$1 profilePositionsHistoryViewModel$loadData$1 = new ProfilePositionsHistoryViewModel$loadData$1(this.this$0, this.$uniqueName, this.$after, this.$isLoadMore, continuation);
        profilePositionsHistoryViewModel$loadData$1.L$0 = obj;
        return profilePositionsHistoryViewModel$loadData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProfilePositionsHistoryViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        ProfilePositionsHistoryViewModel profilePositionsHistoryViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                ProfilePositionsHistoryViewModel profilePositionsHistoryViewModel2 = this.this$0;
                String str = this.$uniqueName;
                String str2 = this.$after;
                boolean z = this.$isLoadMore;
                Result.Application application = Result.Companion;
                tGB tgb = profilePositionsHistoryViewModel2.AhwBna;
                tGB.TaskDescription taskDescription = new tGB.TaskDescription(str, profilePositionsHistoryViewModel2.EZpvd(), str2, profilePositionsHistoryViewModel2.AEQbTJ, profilePositionsHistoryViewModel2.EZpvd, profilePositionsHistoryViewModel2.valueOf, z, null);
                this.L$0 = profilePositionsHistoryViewModel2;
                this.label = 1;
                Object objAEQbTJ = tgb.AEQbTJ(taskDescription, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                profilePositionsHistoryViewModel = profilePositionsHistoryViewModel2;
                obj = objAEQbTJ;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                profilePositionsHistoryViewModel = (ProfilePositionsHistoryViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            profilePositionsHistoryViewModel.OLrzqt.setValue(AbstractC46197tLk.Companion.KWHzl((tQX.TaskDescription) obj));
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        ProfilePositionsHistoryViewModel profilePositionsHistoryViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            profilePositionsHistoryViewModel3.OLrzqt.setValue(AbstractC46197tLk.Companion.OLrzqt(thM7380exceptionOrNullimpl));
        }
        return Unit.INSTANCE;
    }
}
