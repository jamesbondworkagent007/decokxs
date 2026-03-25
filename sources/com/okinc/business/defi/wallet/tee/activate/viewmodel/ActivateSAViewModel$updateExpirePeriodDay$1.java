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
import o.C56443yFo;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes18.dex */
public final class ActivateSAViewModel$updateExpirePeriodDay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $autoRenew;
    final /* synthetic */ int $expirePeriodDay;
    int label;
    final /* synthetic */ ActivateSAViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivateSAViewModel$updateExpirePeriodDay$1(ActivateSAViewModel activateSAViewModel, int i, boolean z, Continuation<? super ActivateSAViewModel$updateExpirePeriodDay$1> continuation) {
        super(2, continuation);
        this.this$0 = activateSAViewModel;
        this.$expirePeriodDay = i;
        this.$autoRenew = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivateSAViewModel$updateExpirePeriodDay$1(this.this$0, this.$expirePeriodDay, this.$autoRenew, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ActivateSAViewModel$updateExpirePeriodDay$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ActivateSAViewModel.Application application;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivateSAViewModel activateSAViewModel = this.this$0;
            AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$updateExpirePeriodDay$1.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return Integer.valueOf(((ActivateSAViewModel.Application) obj2).EZpvd());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((ActivateSAViewModel.Application) obj2).AEQbTJ(((Number) obj3).intValue());
                }
            };
            Integer numAEQbTJ = C56443yFo.AEQbTJ(this.$expirePeriodDay);
            this.label = 1;
            if (activateSAViewModel.KWHzl(anonymousClass1, numAEQbTJ, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    ActivateSAViewModel activateSAViewModel2 = this.this$0;
                    this.label = 3;
                    obj = activateSAViewModel2.OLrzqt(activateSAViewModel2, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    int i2 = this.$expirePeriodDay;
                    boolean z = this.$autoRenew;
                    ActivateSAViewModel activateSAViewModel3 = this.this$0;
                    application = (ActivateSAViewModel.Application) obj;
                    if (application.OLrzqt() instanceof InterfaceC49371unL.Activity) {
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
                C56391yDq.AEQbTJ(obj);
                int i22 = this.$expirePeriodDay;
                boolean z2 = this.$autoRenew;
                ActivateSAViewModel activateSAViewModel32 = this.this$0;
                application = (ActivateSAViewModel.Application) obj;
                if (application.OLrzqt() instanceof InterfaceC49371unL.Activity) {
                    InterfaceC49371unL<ViewDataChanged> interfaceC49371unLOLrzqt = application.OLrzqt();
                    Intrinsics.copydefault(interfaceC49371unLOLrzqt, "");
                    ViewDataChanged viewDataChangedCopy$default = ViewDataChanged.copy$default((ViewDataChanged) ((InterfaceC49371unL.Activity) interfaceC49371unLOLrzqt).copydefault(), null, i22, z2, false, false, false, false, 121, null);
                    ActivateSAViewModel$updateExpirePeriodDay$1$3$1 activateSAViewModel$updateExpirePeriodDay$1$3$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$updateExpirePeriodDay$1$3$1
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
                    this.label = 4;
                    if (activateSAViewModel32.KWHzl(activateSAViewModel$updateExpirePeriodDay$1$3$1, activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        ActivateSAViewModel activateSAViewModel4 = this.this$0;
        AnonymousClass2 anonymousClass2 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.defi.wallet.tee.activate.viewmodel.ActivateSAViewModel$updateExpirePeriodDay$1.2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj2) {
                return Boolean.valueOf(((ActivateSAViewModel.Application) obj2).copydefault());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj2, Object obj3) {
                ((ActivateSAViewModel.Application) obj2).KWHzl(((Boolean) obj3).booleanValue());
            }
        };
        Boolean boolKWHzl = C56443yFo.KWHzl(this.$autoRenew);
        this.label = 2;
        if (activateSAViewModel4.KWHzl(anonymousClass2, boolKWHzl, this) == objCopydefault) {
            return objCopydefault;
        }
        ActivateSAViewModel activateSAViewModel22 = this.this$0;
        this.label = 3;
        obj = activateSAViewModel22.OLrzqt(activateSAViewModel22, this);
        if (obj == objCopydefault) {
        }
        int i222 = this.$expirePeriodDay;
        boolean z22 = this.$autoRenew;
        ActivateSAViewModel activateSAViewModel322 = this.this$0;
        application = (ActivateSAViewModel.Application) obj;
        if (application.OLrzqt() instanceof InterfaceC49371unL.Activity) {
        }
        return Unit.INSTANCE;
    }
}
