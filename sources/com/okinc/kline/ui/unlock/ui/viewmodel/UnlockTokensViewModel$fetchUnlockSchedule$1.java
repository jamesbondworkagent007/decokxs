package com.okinc.kline.ui.unlock.ui.viewmodel;

import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C39656pwU;
import o.C39661pwZ;
import o.C39703pxO;
import o.C39713pxY;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes8.dex */
public final class UnlockTokensViewModel$fetchUnlockSchedule$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $ccy;
    final /* synthetic */ String $period;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ UnlockTokensViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockTokensViewModel$fetchUnlockSchedule$1(UnlockTokensViewModel unlockTokensViewModel, String str, String str2, Continuation<? super UnlockTokensViewModel$fetchUnlockSchedule$1> continuation) {
        super(2, continuation);
        this.this$0 = unlockTokensViewModel;
        this.$ccy = str;
        this.$period = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnlockTokensViewModel$fetchUnlockSchedule$1 unlockTokensViewModel$fetchUnlockSchedule$1 = new UnlockTokensViewModel$fetchUnlockSchedule$1(this.this$0, this.$ccy, this.$period, continuation);
        unlockTokensViewModel$fetchUnlockSchedule$1.L$0 = obj;
        return unlockTokensViewModel$fetchUnlockSchedule$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnlockTokensViewModel$fetchUnlockSchedule$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        UnlockTokensViewModel unlockTokensViewModel;
        String str;
        String str2;
        UnlockTokensViewModel unlockTokensViewModel2;
        UnlockTokensViewModel$fetchUnlockSchedule$1$1$2$1 unlockTokensViewModel$fetchUnlockSchedule$1$1$2$1;
        InterfaceC49371unL.Activity activity;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            unlockTokensViewModel = this.this$0;
            String str3 = this.$ccy;
            str = this.$period;
            Result.Application application2 = Result.Companion;
            UnlockTokensViewModel$fetchUnlockSchedule$1$1$1 unlockTokensViewModel$fetchUnlockSchedule$1$1$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.viewmodel.UnlockTokensViewModel$fetchUnlockSchedule$1$1$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((C39713pxY) obj2).AEQbTJ();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((C39713pxY) obj2).EZpvd((InterfaceC49371unL) obj3);
                }
            };
            InterfaceC49371unL.ActionBar actionBar = new InterfaceC49371unL.ActionBar(null, 1, null);
            this.L$0 = unlockTokensViewModel;
            this.L$1 = str3;
            this.L$2 = str;
            this.label = 1;
            if (unlockTokensViewModel.KWHzl(unlockTokensViewModel$fetchUnlockSchedule$1$1$1, actionBar, this) == objCopydefault) {
                return objCopydefault;
            }
            str2 = str3;
        } else {
            if (i != 1) {
                if (i == 2) {
                    unlockTokensViewModel2 = (UnlockTokensViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    C39661pwZ c39661pwZ = unlockTokensViewModel2.AhwBna;
                    Pair pairOLrzqt = C56390yDp.OLrzqt((List) obj, unlockTokensViewModel2.EZpvd);
                    this.L$0 = unlockTokensViewModel2;
                    this.label = 3;
                    obj = c39661pwZ.EZpvd(pairOLrzqt, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    unlockTokensViewModel$fetchUnlockSchedule$1$1$2$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.viewmodel.UnlockTokensViewModel$fetchUnlockSchedule$1$1$2$1
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj2) {
                            return ((C39713pxY) obj2).AEQbTJ();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj2, Object obj3) {
                            ((C39713pxY) obj2).EZpvd((InterfaceC49371unL) obj3);
                        }
                    };
                    activity = new InterfaceC49371unL.Activity((C39703pxO) obj);
                    this.L$0 = null;
                    this.label = 4;
                    if (unlockTokensViewModel2.KWHzl(unlockTokensViewModel$fetchUnlockSchedule$1$1$2$1, activity, this) == objCopydefault) {
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    UnlockTokensViewModel unlockTokensViewModel3 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i == 3) {
                    unlockTokensViewModel2 = (UnlockTokensViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    unlockTokensViewModel$fetchUnlockSchedule$1$1$2$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.viewmodel.UnlockTokensViewModel$fetchUnlockSchedule$1$1$2$1
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj2) {
                            return ((C39713pxY) obj2).AEQbTJ();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj2, Object obj3) {
                            ((C39713pxY) obj2).EZpvd((InterfaceC49371unL) obj3);
                        }
                    };
                    activity = new InterfaceC49371unL.Activity((C39703pxO) obj);
                    this.L$0 = null;
                    this.label = 4;
                    if (unlockTokensViewModel2.KWHzl(unlockTokensViewModel$fetchUnlockSchedule$1$1$2$1, activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    UnlockTokensViewModel unlockTokensViewModel32 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                UnlockTokensViewModel unlockTokensViewModel322 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    UnlockTokensViewModel$fetchUnlockSchedule$1$2$1 unlockTokensViewModel$fetchUnlockSchedule$1$2$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.viewmodel.UnlockTokensViewModel$fetchUnlockSchedule$1$2$1
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj2) {
                            return ((C39713pxY) obj2).AEQbTJ();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj2, Object obj3) {
                            ((C39713pxY) obj2).EZpvd((InterfaceC49371unL) obj3);
                        }
                    };
                    InterfaceC49371unL.Application application3 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (unlockTokensViewModel322.KWHzl(unlockTokensViewModel$fetchUnlockSchedule$1$2$1, application3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            str = (String) this.L$2;
            str2 = (String) this.L$1;
            unlockTokensViewModel = (UnlockTokensViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C39656pwU c39656pwU = unlockTokensViewModel.isConnected;
        this.L$0 = unlockTokensViewModel;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        obj = c39656pwU.copydefault(str2, str, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        unlockTokensViewModel2 = unlockTokensViewModel;
        C39661pwZ c39661pwZ2 = unlockTokensViewModel2.AhwBna;
        Pair pairOLrzqt2 = C56390yDp.OLrzqt((List) obj, unlockTokensViewModel2.EZpvd);
        this.L$0 = unlockTokensViewModel2;
        this.label = 3;
        obj = c39661pwZ2.EZpvd(pairOLrzqt2, this);
        if (obj == objCopydefault) {
        }
        unlockTokensViewModel$fetchUnlockSchedule$1$1$2$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.viewmodel.UnlockTokensViewModel$fetchUnlockSchedule$1$1$2$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj2) {
                return ((C39713pxY) obj2).AEQbTJ();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj2, Object obj3) {
                ((C39713pxY) obj2).EZpvd((InterfaceC49371unL) obj3);
            }
        };
        activity = new InterfaceC49371unL.Activity((C39703pxO) obj);
        this.L$0 = null;
        this.label = 4;
        if (unlockTokensViewModel2.KWHzl(unlockTokensViewModel$fetchUnlockSchedule$1$1$2$1, activity, this) == objCopydefault) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        UnlockTokensViewModel unlockTokensViewModel3222 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
