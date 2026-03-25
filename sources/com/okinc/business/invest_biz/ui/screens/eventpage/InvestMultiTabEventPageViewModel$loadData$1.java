package com.okinc.business.invest_biz.ui.screens.eventpage;

import com.okinc.business.invest_biz.ui.screens.eventpage.InvestMultiTabEventPageViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23641iDx;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestMultiTabEventPageViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $specialZoneTabId;
    Object L$0;
    int label;
    final /* synthetic */ InvestMultiTabEventPageViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestMultiTabEventPageViewModel$loadData$1(InvestMultiTabEventPageViewModel investMultiTabEventPageViewModel, int i, Continuation<? super InvestMultiTabEventPageViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = investMultiTabEventPageViewModel;
        this.$specialZoneTabId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestMultiTabEventPageViewModel$loadData$1(this.this$0, this.$specialZoneTabId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestMultiTabEventPageViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot abstractC43419rot;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow<InvestMultiTabEventPageViewModel.Activity> mutableStateFlowEZpvd = this.this$0.EZpvd();
            InvestMultiTabEventPageViewModel.Activity.TaskDescription taskDescription = InvestMultiTabEventPageViewModel.Activity.TaskDescription.copydefault;
            this.label = 1;
            if (mutableStateFlowEZpvd.emit(taskDescription, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    abstractC43419rot = (AbstractC43419rot) obj;
                    InvestMultiTabEventPageViewModel investMultiTabEventPageViewModel = this.this$0;
                    if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                        InvestMultiTabEventPageData investMultiTabEventPageData = (InvestMultiTabEventPageData) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                        MutableStateFlow<InvestMultiTabEventPageViewModel.Activity> mutableStateFlowEZpvd2 = investMultiTabEventPageViewModel.EZpvd();
                        InvestMultiTabEventPageViewModel.Activity.StateListAnimator stateListAnimator = new InvestMultiTabEventPageViewModel.Activity.StateListAnimator(investMultiTabEventPageData);
                        this.L$0 = abstractC43419rot;
                        this.label = 3;
                        if (mutableStateFlowEZpvd2.emit(stateListAnimator, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    InvestMultiTabEventPageViewModel investMultiTabEventPageViewModel2 = this.this$0;
                    if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                abstractC43419rot = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                InvestMultiTabEventPageViewModel investMultiTabEventPageViewModel22 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    MutableStateFlow<InvestMultiTabEventPageViewModel.Activity> mutableStateFlowEZpvd3 = investMultiTabEventPageViewModel22.EZpvd();
                    InvestMultiTabEventPageViewModel.Activity.C0337Activity c0337Activity = InvestMultiTabEventPageViewModel.Activity.C0337Activity.OLrzqt;
                    this.L$0 = abstractC43419rot;
                    this.label = 4;
                    if (mutableStateFlowEZpvd3.emit(c0337Activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC23641iDx interfaceC23641iDx = this.this$0.OLrzqt;
        SpecialZoneActivityParam specialZoneActivityParam = new SpecialZoneActivityParam("", this.$specialZoneTabId);
        this.label = 2;
        obj = interfaceC23641iDx.KWHzl(specialZoneActivityParam, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        InvestMultiTabEventPageViewModel investMultiTabEventPageViewModel3 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
        }
        InvestMultiTabEventPageViewModel investMultiTabEventPageViewModel222 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
