package com.okinc.im.imui.relationlist.viewmodel.selectrelation;

import androidx.lifecycle.MutableLiveData;
import com.okinc.okimcore.model.remote.GroupScenarioType;
import com.okinc.okimcore.model.remote.GroupServiceType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.oDW;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiSelectRelationViewModel$loadMaxNumberAsync$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ MultiSelectRelationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiSelectRelationViewModel$loadMaxNumberAsync$2(MultiSelectRelationViewModel multiSelectRelationViewModel, Continuation<? super MultiSelectRelationViewModel$loadMaxNumberAsync$2> continuation) {
        super(2, continuation);
        this.this$0 = multiSelectRelationViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiSelectRelationViewModel$loadMaxNumberAsync$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MultiSelectRelationViewModel$loadMaxNumberAsync$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableLiveData mutableLiveData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("MultiSelectRelationViewModel", "Fetching max member count for new group");
            MutableLiveData mutableLiveData2 = this.this$0.AYXKKw;
            oDW odw = this.this$0.AkhnZx;
            GroupServiceType groupServiceType = GroupServiceType.IM;
            GroupScenarioType groupScenarioType = GroupScenarioType.Default;
            this.L$0 = mutableLiveData2;
            this.label = 1;
            Object objEZpvd = odw.EZpvd(groupServiceType, groupScenarioType, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            mutableLiveData = mutableLiveData2;
            obj = objEZpvd;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = (MutableLiveData) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        mutableLiveData.setValue(obj);
        return Unit.INSTANCE;
    }
}
