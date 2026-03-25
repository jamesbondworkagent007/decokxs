package com.okinc.im.imui.relationlist.viewmodel.selectrelation;

import com.okinc.im.imui.relationlist.viewmodel.selectrelation.SelectRelationViewModel;
import com.okinc.okimcore.model.other.GroupAddMembersResult;
import com.okinc.okimcore.model.remote.GroupScenarioType;
import com.okinc.okimcore.model.remote.GroupServiceType;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oDR;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class SelectRelationViewModel$addMembersToGroup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SelectRelationViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectRelationViewModel$addMembersToGroup$1(SelectRelationViewModel selectRelationViewModel, Continuation<? super SelectRelationViewModel$addMembersToGroup$1> continuation) {
        super(2, continuation);
        this.this$0 = selectRelationViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SelectRelationViewModel$addMembersToGroup$1 selectRelationViewModel$addMembersToGroup$1 = new SelectRelationViewModel$addMembersToGroup$1(this.this$0, continuation);
        selectRelationViewModel$addMembersToGroup$1.L$0 = obj;
        return selectRelationViewModel$addMembersToGroup$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectRelationViewModel$addMembersToGroup$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SelectRelationViewModel selectRelationViewModel = this.this$0;
                Result.Application application = Result.Companion;
                selectRelationViewModel.KWHzl.setValue(C56443yFo.KWHzl(true));
                oDR odr = selectRelationViewModel.AhwBna;
                String str = selectRelationViewModel.isConnected;
                GroupServiceType groupServiceType = GroupServiceType.IM;
                GroupScenarioType groupScenarioType = GroupScenarioType.Default;
                List<String> value = selectRelationViewModel.djBIcL().getValue();
                Boolean boolEZpvd = selectRelationViewModel.EZpvd();
                this.label = 1;
                obj = odr.OLrzqt(str, groupServiceType, groupScenarioType, value, boolEZpvd, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((GroupAddMembersResult) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        SelectRelationViewModel selectRelationViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            GroupAddMembersResult groupAddMembersResult = (GroupAddMembersResult) objM7377constructorimpl;
            selectRelationViewModel2.KWHzl.setValue(C56443yFo.KWHzl(false));
            if (groupAddMembersResult.isAllAddSuccess()) {
                pUU.KWHzl("SelectRelationViewModel", "Add member all success");
                String str2 = selectRelationViewModel2.isConnected;
                if (str2 != null) {
                    selectRelationViewModel2.copydefault.setValue(new C32989mnw(new SelectRelationViewModel.Application.TaskDescription(str2)));
                }
            } else {
                pUU.KWHzl("SelectRelationViewModel", "Add member success but with fail reason");
                selectRelationViewModel2.copydefault.setValue(new C32989mnw(new SelectRelationViewModel.Application.C0477Application(groupAddMembersResult)));
            }
        }
        SelectRelationViewModel selectRelationViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            selectRelationViewModel3.KWHzl.setValue(C56443yFo.KWHzl(false));
            pUU.KWHzl("SelectRelationViewModel", "Add member error:" + thM7380exceptionOrNullimpl);
            String message = thM7380exceptionOrNullimpl.getMessage();
            if (message != null) {
                selectRelationViewModel3.copydefault.setValue(new C32989mnw(new SelectRelationViewModel.Application.Activity(message)));
            }
        }
        return Unit.INSTANCE;
    }
}
