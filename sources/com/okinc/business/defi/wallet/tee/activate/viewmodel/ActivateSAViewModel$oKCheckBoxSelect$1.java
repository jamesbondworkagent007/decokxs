package com.okinc.business.defi.wallet.tee.activate.viewmodel;

import com.okinc.business.defi.wallet.tee.activate.model.ViewDataChanged;
import com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes23.dex */
public final class ActivateSAViewModel$oKCheckBoxSelect$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isSelected;
    int label;
    final /* synthetic */ ActivateSAViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateSAViewModel$oKCheckBoxSelect$1(ActivateSAViewModel activateSAViewModel, boolean z, Continuation<? super ActivateSAViewModel$oKCheckBoxSelect$1> continuation) {
        super(2, continuation);
        this.this$0 = activateSAViewModel;
        this.$isSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivateSAViewModel$oKCheckBoxSelect$1(this.this$0, this.$isSelected, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ActivateSAViewModel$oKCheckBoxSelect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivateSAViewModel activateSAViewModel = this.this$0;
            this.label = 1;
            obj = activateSAViewModel.OLrzqt(activateSAViewModel, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        boolean z = this.$isSelected;
        ActivateSAViewModel activateSAViewModel2 = this.this$0;
        ActivateSAViewModel.Application application = (ActivateSAViewModel.Application) obj;
        if (application.OLrzqt() instanceof InterfaceC49371unL.Activity) {
            InterfaceC49371unL<ViewDataChanged> interfaceC49371unLOLrzqt = application.OLrzqt();
            Intrinsics.copydefault(interfaceC49371unLOLrzqt, "");
            ViewDataChanged viewDataChangedCopy$default = ViewDataChanged.copy$default((ViewDataChanged) ((InterfaceC49371unL.Activity) interfaceC49371unLOLrzqt).copydefault(), null, 0, false, z, false, z, false, 87, null);
            ActivateSAViewModel$oKCheckBoxSelect$1$1$1 activateSAViewModel$oKCheckBoxSelect$1$1$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$oKCheckBoxSelect$1$1$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((ActivateSAViewModel.Application) obj2).OLrzqt();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((ActivateSAViewModel.Application) obj2).KWHzl((InterfaceC49371unL<ViewDataChanged>) obj3);
                }
            };
            InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(viewDataChangedCopy$default);
            this.label = 2;
            if (activateSAViewModel2.KWHzl(activateSAViewModel$oKCheckBoxSelect$1$1$1, activity, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }
}
