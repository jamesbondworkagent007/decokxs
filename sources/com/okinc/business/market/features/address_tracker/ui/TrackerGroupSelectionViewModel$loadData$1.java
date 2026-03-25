package com.okinc.business.market.features.address_tracker.ui;

import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C28586kda;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC25659jBp;
import o.jAL;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerGroupSelectionViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC25659jBp $state;
    Object L$0;
    int label;
    final /* synthetic */ TrackerGroupSelectionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerGroupSelectionViewModel$loadData$1(TrackerGroupSelectionViewModel trackerGroupSelectionViewModel, InterfaceC25659jBp interfaceC25659jBp, Continuation<? super TrackerGroupSelectionViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = trackerGroupSelectionViewModel;
        this.$state = interfaceC25659jBp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerGroupSelectionViewModel$loadData$1(this.this$0, this.$state, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerGroupSelectionViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0119  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objEZpvd;
        MutableStateFlow mutableStateFlow;
        Object objEZpvd2;
        List arrayList;
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28586kda c28586kda = this.this$0.copydefault;
            this.label = 1;
            objOLrzqt = c28586kda.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableStateFlow = (MutableStateFlow) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    objEZpvd = ((Result) obj).m7386unboximpl();
                    if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
                        objEZpvd = yDY.AhwBna();
                    }
                    arrayList = (List) objEZpvd;
                    mutableStateFlow.setValue(new InterfaceC25659jBp.Application(arrayList));
                    return Unit.INSTANCE;
                }
                mutableStateFlow = (MutableStateFlow) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd2 = ((Result) obj).m7386unboximpl();
                if (Result.m7380exceptionOrNullimpl(objEZpvd2) != null) {
                    objEZpvd2 = yDY.AhwBna();
                }
                Iterable<CommonGroupUiModel> iterable = (Iterable) objEZpvd2;
                InterfaceC25659jBp interfaceC25659jBp = this.$state;
                arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
                for (CommonGroupUiModel commonGroupUiModel : iterable) {
                    Iterator<T> it = ((InterfaceC25659jBp.Application) interfaceC25659jBp).OLrzqt().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((CommonGroupUiModel) next).KWHzl() == commonGroupUiModel.KWHzl()) {
                            break;
                        }
                    }
                    CommonGroupUiModel commonGroupUiModel2 = (CommonGroupUiModel) next;
                    arrayList.add(CommonGroupUiModel.copy$default(commonGroupUiModel, 0, null, 0, 0, 0, commonGroupUiModel2 != null ? commonGroupUiModel2.copydefault() : false, false, 95, null));
                }
                mutableStateFlow.setValue(new InterfaceC25659jBp.Application(arrayList));
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
        if (dexUserIdentity == null || dexUserIdentity.KWHzl()) {
            this.this$0.OLrzqt.setValue(InterfaceC25659jBp.ActionBar.copydefault);
            return Unit.INSTANCE;
        }
        MutableStateFlow mutableStateFlow2 = this.this$0.OLrzqt;
        if (this.$state instanceof InterfaceC25659jBp.Application) {
            jAL jal = this.this$0.EZpvd;
            String strEZpvd = dexUserIdentity.EZpvd();
            this.L$0 = mutableStateFlow2;
            this.label = 2;
            objEZpvd2 = jal.EZpvd(strEZpvd, this);
            if (objEZpvd2 == objCopydefault) {
                return objCopydefault;
            }
            mutableStateFlow = mutableStateFlow2;
            if (Result.m7380exceptionOrNullimpl(objEZpvd2) != null) {
            }
            Iterable<CommonGroupUiModel> iterable2 = (Iterable) objEZpvd2;
            InterfaceC25659jBp interfaceC25659jBp2 = this.$state;
            arrayList = new ArrayList(C56403yEb.AYXKKw(iterable2, 10));
            while (r2.hasNext()) {
            }
            mutableStateFlow.setValue(new InterfaceC25659jBp.Application(arrayList));
            return Unit.INSTANCE;
        }
        jAL jal2 = this.this$0.EZpvd;
        String strEZpvd2 = dexUserIdentity.EZpvd();
        this.L$0 = mutableStateFlow2;
        this.label = 3;
        objEZpvd = jal2.EZpvd(strEZpvd2, this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        mutableStateFlow = mutableStateFlow2;
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
        }
        arrayList = (List) objEZpvd;
        mutableStateFlow.setValue(new InterfaceC25659jBp.Application(arrayList));
        return Unit.INSTANCE;
    }
}
