package com.okinc.business.market.features.address_tracker;

import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27779kDa;
import o.jAI;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerGroupManageViewModel$deleteGroup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CommonGroupUiModel $group;
    Object L$0;
    int label;
    final /* synthetic */ TrackerGroupManageViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerGroupManageViewModel$deleteGroup$1(TrackerGroupManageViewModel trackerGroupManageViewModel, CommonGroupUiModel commonGroupUiModel, Continuation<? super TrackerGroupManageViewModel$deleteGroup$1> continuation) {
        super(2, continuation);
        this.this$0 = trackerGroupManageViewModel;
        this.$group = commonGroupUiModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerGroupManageViewModel$deleteGroup$1(this.this$0, this.$group, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerGroupManageViewModel$deleteGroup$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jAI jai = this.this$0.AYXKKw;
            int iKWHzl = this.$group.KWHzl();
            this.label = 1;
            objOLrzqt = jai.OLrzqt(iKWHzl, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj2;
                TrackerGroupManageViewModel trackerGroupManageViewModel = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
                if (thM7380exceptionOrNullimpl != null) {
                    trackerGroupManageViewModel.KWHzl(thM7380exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        TrackerGroupManageViewModel trackerGroupManageViewModel2 = this.this$0;
        CommonGroupUiModel commonGroupUiModel = this.$group;
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            ((Number) objOLrzqt).intValue();
            MutableSharedFlow mutableSharedFlow = trackerGroupManageViewModel2.EZpvd;
            InterfaceC27779kDa.ActionBar actionBar = new InterfaceC27779kDa.ActionBar(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + commonGroupUiModel.EZpvd() + "\" deleted");
            this.L$0 = objOLrzqt;
            this.label = 2;
            if (mutableSharedFlow.emit(actionBar, this) == objCopydefault) {
                return objCopydefault;
            }
            obj2 = objOLrzqt;
            objOLrzqt = obj2;
        }
        TrackerGroupManageViewModel trackerGroupManageViewModel3 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
