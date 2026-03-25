package com.okinc.business.invest_biz.ui.screens.home;

import com.okinc.business.invest_biz.data.bean.HomeTab;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC26472jcv;
import o.iFP;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestHomeV2ViewModel$getTabsDataAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends HomeTab>>>, Object> {
    final /* synthetic */ boolean $forceRefresh;
    final /* synthetic */ boolean $needEmit;
    Object L$0;
    int label;
    final /* synthetic */ InvestHomeV2ViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestHomeV2ViewModel$getTabsDataAsync$1(boolean z, InvestHomeV2ViewModel investHomeV2ViewModel, boolean z2, Continuation<? super InvestHomeV2ViewModel$getTabsDataAsync$1> continuation) {
        super(2, continuation);
        this.$forceRefresh = z;
        this.this$0 = investHomeV2ViewModel;
        this.$needEmit = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestHomeV2ViewModel$getTabsDataAsync$1(this.$forceRefresh, this.this$0, this.$needEmit, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends HomeTab>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends List<HomeTab>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<HomeTab>>> continuation) {
        return ((InvestHomeV2ViewModel$getTabsDataAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.$forceRefresh || (this.this$0.AhwBna.getValue() instanceof InterfaceC26472jcv.ActionBar)) {
                MutableStateFlow mutableStateFlow = this.this$0.AhwBna;
                InterfaceC26472jcv.StateListAnimator stateListAnimator = InterfaceC26472jcv.StateListAnimator.EZpvd;
                this.label = 1;
                if (mutableStateFlow.emit(stateListAnimator, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    objOLrzqt = ((Result) obj).m7386unboximpl();
                    InvestHomeV2ViewModel investHomeV2ViewModel = this.this$0;
                    if (Result.m7384isSuccessimpl(objOLrzqt)) {
                        MutableStateFlow mutableStateFlow2 = investHomeV2ViewModel.AhwBna;
                        InterfaceC26472jcv.TaskDescription taskDescription = new InterfaceC26472jcv.TaskDescription((List) objOLrzqt);
                        this.L$0 = objOLrzqt;
                        this.label = 3;
                        if (mutableStateFlow2.emit(taskDescription, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    InvestHomeV2ViewModel investHomeV2ViewModel2 = this.this$0;
                    if (Result.m7380exceptionOrNullimpl(objOLrzqt) != null) {
                    }
                    return Result.m7376boximpl(objOLrzqt);
                }
                if (i != 3) {
                    if (i == 4) {
                        Object obj2 = this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        objOLrzqt = obj2;
                    } else {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        objOLrzqt = ((Result) obj).m7386unboximpl();
                    }
                    return Result.m7376boximpl(objOLrzqt);
                }
                Object obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj3;
                InvestHomeV2ViewModel investHomeV2ViewModel22 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objOLrzqt) != null) {
                    MutableStateFlow mutableStateFlow3 = investHomeV2ViewModel22.AhwBna;
                    InterfaceC26472jcv.ActionBar actionBar = InterfaceC26472jcv.ActionBar.copydefault;
                    this.L$0 = objOLrzqt;
                    this.label = 4;
                    if (mutableStateFlow3.emit(actionBar, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Result.m7376boximpl(objOLrzqt);
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (this.$needEmit) {
            iFP ifp = this.this$0.getNewProxyInstance;
            this.label = 2;
            objOLrzqt = ifp.OLrzqt(this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            InvestHomeV2ViewModel investHomeV2ViewModel3 = this.this$0;
            if (Result.m7384isSuccessimpl(objOLrzqt)) {
            }
            InvestHomeV2ViewModel investHomeV2ViewModel222 = this.this$0;
            if (Result.m7380exceptionOrNullimpl(objOLrzqt) != null) {
            }
            return Result.m7376boximpl(objOLrzqt);
        }
        iFP ifp2 = this.this$0.getNewProxyInstance;
        this.label = 5;
        objOLrzqt = ifp2.OLrzqt(this);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        return Result.m7376boximpl(objOLrzqt);
    }
}
