package com.okinc.planet.biz_create_centre.viewmode;

import androidx.lifecycle.MutableLiveData;
import com.okinc.planet.biz_create_centre.data.EarningsHistoryInfo;
import com.okinc.uilab.stateful.StatefulView;
import java.util.Collection;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C47778twY;
import o.C47855txw;
import o.C47857txy;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class EarningsViewModel$loadMoreEarningsList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C47857txy $currentState;
    final /* synthetic */ String $nextCursor;
    int label;
    final /* synthetic */ C47855txw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsViewModel$loadMoreEarningsList$1(String str, C47855txw c47855txw, C47857txy c47857txy, Continuation<? super EarningsViewModel$loadMoreEarningsList$1> continuation) {
        super(2, continuation);
        this.$nextCursor = str;
        this.this$0 = c47855txw;
        this.$currentState = c47857txy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EarningsViewModel$loadMoreEarningsList$1(this.$nextCursor, this.this$0, this.$currentState, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EarningsViewModel$loadMoreEarningsList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    long jValueOf = C33129mqd.valueOf(this.$nextCursor);
                    C47778twY c47778twY = this.this$0.OLrzqt;
                    this.label = 1;
                    obj = c47778twY.KWHzl(jValueOf, 10L, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                Pair pair = (Pair) obj;
                EarningsHistoryInfo earningsHistoryInfo = (EarningsHistoryInfo) pair.component1();
                ((Number) pair.component2()).intValue();
                if (earningsHistoryInfo != null) {
                    this.this$0.KWHzl = earningsHistoryInfo.getNextCursor();
                    this.this$0.KWHzl().setValue(new C47857txy(StatefulView.Status.Content, this.this$0.AEQbTJ(CollectionsKt___CollectionsKt.fJNWhG((Collection) this.$currentState.OLrzqt()), earningsHistoryInfo.getHistory()), earningsHistoryInfo.getNextCursor(), false, 0, 16, null));
                    pUU.EZpvd("EarningsViewModel", "Earnings history load more: " + earningsHistoryInfo.getHistory().size() + " new items, nextCursor: " + earningsHistoryInfo.getNextCursor());
                } else {
                    this.this$0.AEQbTJ().setValue("Failed to load more earnings");
                    pUU.copydefault("EarningsViewModel", "Failed to load more earnings history");
                }
            } catch (Exception e) {
                MutableLiveData<String> mutableLiveDataAEQbTJ = this.this$0.AEQbTJ();
                String message = e.getMessage();
                if (message == null) {
                    message = "Error loading more earnings";
                }
                mutableLiveDataAEQbTJ.setValue(message);
                pUU.AEQbTJ("EarningsViewModel", "Error loading more earnings history", e);
            }
            this.this$0.AEQbTJ = false;
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.this$0.AEQbTJ = false;
            throw th;
        }
    }
}
