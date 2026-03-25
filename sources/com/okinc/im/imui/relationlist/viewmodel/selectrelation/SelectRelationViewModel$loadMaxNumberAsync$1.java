package com.okinc.im.imui.relationlist.viewmodel.selectrelation;

import androidx.lifecycle.MutableLiveData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.oDU;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class SelectRelationViewModel$loadMaxNumberAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $groupId;
    Object L$0;
    int label;
    final /* synthetic */ SelectRelationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectRelationViewModel$loadMaxNumberAsync$1(SelectRelationViewModel selectRelationViewModel, String str, Continuation<? super SelectRelationViewModel$loadMaxNumberAsync$1> continuation) {
        super(2, continuation);
        this.this$0 = selectRelationViewModel;
        this.$groupId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectRelationViewModel$loadMaxNumberAsync$1(this.this$0, this.$groupId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectRelationViewModel$loadMaxNumberAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableLiveData mutableLiveData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("SelectRelationViewModel", "Setting max number from group info");
            MutableLiveData mutableLiveData2 = this.this$0.djBIcL;
            oDU odu = this.this$0.gEmmrt;
            String str = this.$groupId;
            this.L$0 = mutableLiveData2;
            this.label = 1;
            Object objAEQbTJ = odu.AEQbTJ(str, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            mutableLiveData = mutableLiveData2;
            obj = objAEQbTJ;
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
