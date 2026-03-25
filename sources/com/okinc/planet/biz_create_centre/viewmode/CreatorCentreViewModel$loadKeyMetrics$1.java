package com.okinc.planet.biz_create_centre.viewmode;

import com.okinc.planet.biz_create_centre.data.OrbitCreateCentreInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C47779twZ;
import o.C47858txz;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class CreatorCentreViewModel$loadKeyMetrics$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C47858txz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorCentreViewModel$loadKeyMetrics$1(C47858txz c47858txz, Continuation<? super CreatorCentreViewModel$loadKeyMetrics$1> continuation) {
        super(2, continuation);
        this.this$0 = c47858txz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreatorCentreViewModel$loadKeyMetrics$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreatorCentreViewModel$loadKeyMetrics$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.gEmmrt.setValue(C47858txz.StateListAnimator.TaskDescription.EZpvd);
                pUU.EZpvd("CreatorCentreViewModel", "Loading key metrics data...");
                C47779twZ c47779twZ = this.this$0.AhwBna;
                this.label = 1;
                obj = c47779twZ.copydefault(this);
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
            if (pair.getFirst() != null) {
                pUU.EZpvd("CreatorCentreViewModel", "Key metrics loaded successfully");
                MutableStateFlow mutableStateFlow = this.this$0.gEmmrt;
                Object first = pair.getFirst();
                Intrinsics.copydefault(first);
                mutableStateFlow.setValue(new C47858txz.StateListAnimator.C0967StateListAnimator((OrbitCreateCentreInfo) first));
                MutableStateFlow mutableStateFlow2 = this.this$0.KWHzl;
                Object first2 = pair.getFirst();
                Intrinsics.copydefault(first2);
                mutableStateFlow2.setValue(((OrbitCreateCentreInfo) first2).getContentsData());
                MutableStateFlow mutableStateFlow3 = this.this$0.OLrzqt;
                Object first3 = pair.getFirst();
                Intrinsics.copydefault(first3);
                mutableStateFlow3.setValue(((OrbitCreateCentreInfo) first3).getLiveStreamsData());
                MutableStateFlow mutableStateFlow4 = this.this$0.AEQbTJ;
                Object first4 = pair.getFirst();
                Intrinsics.copydefault(first4);
                mutableStateFlow4.setValue(((OrbitCreateCentreInfo) first4).getGroupsData());
                MutableStateFlow mutableStateFlow5 = this.this$0.copydefault;
                Object first5 = pair.getFirst();
                Intrinsics.copydefault(first5);
                Long startTime = ((OrbitCreateCentreInfo) first5).getStartTime();
                Object first6 = pair.getFirst();
                Intrinsics.copydefault(first6);
                mutableStateFlow5.setValue(new Pair(startTime, ((OrbitCreateCentreInfo) first6).getEndTime()));
            } else {
                pUU.valueOf("CreatorCentreViewModel", "Key metrics data is null");
                this.this$0.gEmmrt.setValue(new C47858txz.StateListAnimator.ActionBar("Failed to load data", ((Number) pair.getSecond()).intValue()));
            }
        } catch (Exception e) {
            pUU.AEQbTJ("CreatorCentreViewModel", "Error loading key metrics", e);
            MutableStateFlow mutableStateFlow6 = this.this$0.gEmmrt;
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            mutableStateFlow6.setValue(new C47858txz.StateListAnimator.ActionBar(message, -1));
        }
        return Unit.INSTANCE;
    }
}
