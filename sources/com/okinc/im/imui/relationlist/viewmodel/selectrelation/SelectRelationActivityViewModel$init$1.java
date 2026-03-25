package com.okinc.im.imui.relationlist.viewmodel.selectrelation;

import androidx.lifecycle.MutableLiveData;
import com.okinc.okimcore.model.remote.GroupScenarioType;
import com.okinc.okimcore.model.remote.GroupServiceType;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.oDU;
import o.oDW;

/* JADX INFO: loaded from: classes8.dex */
public final class SelectRelationActivityViewModel$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $completedList;
    final /* synthetic */ String $groupId;
    Object L$0;
    int label;
    final /* synthetic */ SelectRelationActivityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectRelationActivityViewModel$init$1(SelectRelationActivityViewModel selectRelationActivityViewModel, String str, List<String> list, Continuation<? super SelectRelationActivityViewModel$init$1> continuation) {
        super(2, continuation);
        this.this$0 = selectRelationActivityViewModel;
        this.$groupId = str;
        this.$completedList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectRelationActivityViewModel$init$1(this.this$0, this.$groupId, this.$completedList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectRelationActivityViewModel$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableLiveData mutableLiveData;
        Integer num;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableLiveData mutableLiveData2 = this.this$0.copydefault;
            if (this.$groupId != null) {
                oDU odu = this.this$0.AYXKKw;
                String str = this.$groupId;
                this.L$0 = mutableLiveData2;
                this.label = 1;
                Object objAEQbTJ = odu.AEQbTJ(str, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                mutableLiveData = mutableLiveData2;
                obj = objAEQbTJ;
                num = (Integer) obj;
            } else {
                oDW odw = this.this$0.AhwBna;
                GroupServiceType groupServiceType = GroupServiceType.IM;
                GroupScenarioType groupScenarioType = GroupScenarioType.Default;
                this.L$0 = mutableLiveData2;
                this.label = 2;
                Object objEZpvd = odw.EZpvd(groupServiceType, groupScenarioType, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                mutableLiveData = mutableLiveData2;
                obj = objEZpvd;
                num = (Integer) obj;
            }
        } else if (i == 1) {
            mutableLiveData = (MutableLiveData) this.L$0;
            C56391yDq.AEQbTJ(obj);
            num = (Integer) obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = (MutableLiveData) this.L$0;
            C56391yDq.AEQbTJ(obj);
            num = (Integer) obj;
        }
        mutableLiveData.setValue(num);
        this.this$0.copydefault(this.$groupId == null ? CollectionsKt___CollectionsKt.djBIcL((Collection) C56402yEa.EZpvd("owner"), (Iterable) this.$completedList) : this.$completedList);
        return Unit.INSTANCE;
    }
}
