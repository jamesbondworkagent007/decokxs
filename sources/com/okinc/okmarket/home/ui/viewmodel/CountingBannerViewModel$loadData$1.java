package com.okinc.okmarket.home.ui.viewmodel;

import com.okinc.okmarket.home.NewCoinInfo;
import com.okinc.okmarket.home.ui.viewmodel.CountingBannerViewModel;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C46608taQ;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes10.dex */
public final class CountingBannerViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ CountingBannerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountingBannerViewModel$loadData$1(CountingBannerViewModel countingBannerViewModel, Continuation<? super CountingBannerViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = countingBannerViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CountingBannerViewModel$loadData$1 countingBannerViewModel$loadData$1 = new CountingBannerViewModel$loadData$1(this.this$0, continuation);
        countingBannerViewModel$loadData$1.L$0 = obj;
        return countingBannerViewModel$loadData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CountingBannerViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0145 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        CountingBannerViewModel countingBannerViewModel;
        Object obj2;
        NewCoinInfo newCoinInfo;
        Object obj3;
        CountingBannerViewModel countingBannerViewModel2;
        Throwable thM7380exceptionOrNullimpl;
        CountingBannerViewModel$loadData$1$3$1 countingBannerViewModel$loadData$1$3$1;
        InterfaceC49371unL.Application application;
        CountingBannerViewModel$loadData$1$3$2 countingBannerViewModel$loadData$1$3$2;
        InterfaceC49371unL.Application application2;
        CountingBannerViewModel countingBannerViewModel3;
        CountingBannerViewModel$loadData$1$1$2 countingBannerViewModel$loadData$1$1$2;
        InterfaceC49371unL.ActionBar actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (Throwable th) {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                CountingBannerViewModel countingBannerViewModel4 = this.this$0;
                Result.Application application4 = Result.Companion;
                CountingBannerViewModel$loadData$1$1$1 countingBannerViewModel$loadData$1$1$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.home.ui.viewmodel.CountingBannerViewModel$loadData$1$1$1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj4) {
                        return ((CountingBannerViewModel.Activity) obj4).copydefault();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj4, Object obj5) {
                        ((CountingBannerViewModel.Activity) obj4).copydefault((InterfaceC49371unL) obj5);
                    }
                };
                InterfaceC49371unL.ActionBar actionBar2 = new InterfaceC49371unL.ActionBar(null, 1, null);
                this.L$0 = countingBannerViewModel4;
                this.label = 1;
                if (countingBannerViewModel4.KWHzl(countingBannerViewModel$loadData$1$1$1, actionBar2, this) == objCopydefault) {
                    return objCopydefault;
                }
                countingBannerViewModel3 = countingBannerViewModel4;
                countingBannerViewModel$loadData$1$1$2 = new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.home.ui.viewmodel.CountingBannerViewModel$loadData$1$1$2
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj4) {
                        return ((CountingBannerViewModel.Activity) obj4).EZpvd();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj4, Object obj5) {
                        ((CountingBannerViewModel.Activity) obj4).EZpvd((InterfaceC49371unL<NewCoinInfo>) obj5);
                    }
                };
                actionBar = new InterfaceC49371unL.ActionBar(null, 1, null);
                this.L$0 = countingBannerViewModel3;
                this.label = 2;
                if (countingBannerViewModel3.KWHzl(countingBannerViewModel$loadData$1$1$2, actionBar, this) == objCopydefault) {
                    return objCopydefault;
                }
                C46608taQ c46608taQ = countingBannerViewModel3.KWHzl;
                Unit unit = Unit.INSTANCE;
                this.L$0 = null;
                this.label = 3;
                obj = c46608taQ.EZpvd(unit, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                objM7377constructorimpl = Result.m7377constructorimpl((Pair) obj);
                countingBannerViewModel = this.this$0;
                if (!Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    Pair pair = (Pair) objM7377constructorimpl;
                    NewCoinInfo newCoinInfo2 = (NewCoinInfo) pair.component1();
                    List list = (List) pair.component2();
                    CountingBannerViewModel$loadData$1$2$1 countingBannerViewModel$loadData$1$2$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.home.ui.viewmodel.CountingBannerViewModel$loadData$1$2$1
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj4) {
                            return ((CountingBannerViewModel.Activity) obj4).copydefault();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj4, Object obj5) {
                            ((CountingBannerViewModel.Activity) obj4).copydefault((InterfaceC49371unL) obj5);
                        }
                    };
                    InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(list);
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = countingBannerViewModel;
                    this.L$2 = newCoinInfo2;
                    this.label = 4;
                    if (countingBannerViewModel.KWHzl(countingBannerViewModel$loadData$1$2$1, activity, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    newCoinInfo = newCoinInfo2;
                    if (newCoinInfo != null) {
                        CountingBannerViewModel$loadData$1$2$2 countingBannerViewModel$loadData$1$2$2 = new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.home.ui.viewmodel.CountingBannerViewModel$loadData$1$2$2
                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                            public Object get(Object obj4) {
                                return ((CountingBannerViewModel.Activity) obj4).EZpvd();
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                            public void set(Object obj4, Object obj5) {
                                ((CountingBannerViewModel.Activity) obj4).EZpvd((InterfaceC49371unL<NewCoinInfo>) obj5);
                            }
                        };
                        InterfaceC49371unL.TaskDescription taskDescription = new InterfaceC49371unL.TaskDescription(null, 1, null);
                        this.L$0 = objM7377constructorimpl;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                        if (countingBannerViewModel.KWHzl(countingBannerViewModel$loadData$1$2$2, taskDescription, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        CountingBannerViewModel$loadData$1$2$3 countingBannerViewModel$loadData$1$2$3 = new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.home.ui.viewmodel.CountingBannerViewModel$loadData$1$2$3
                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                            public Object get(Object obj4) {
                                return ((CountingBannerViewModel.Activity) obj4).EZpvd();
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                            public void set(Object obj4, Object obj5) {
                                ((CountingBannerViewModel.Activity) obj4).EZpvd((InterfaceC49371unL<NewCoinInfo>) obj5);
                            }
                        };
                        InterfaceC49371unL.Activity activity2 = new InterfaceC49371unL.Activity(newCoinInfo);
                        this.L$0 = objM7377constructorimpl;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 6;
                        if (countingBannerViewModel.KWHzl(countingBannerViewModel$loadData$1$2$3, activity2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    obj3 = objM7377constructorimpl;
                    obj2 = obj3;
                    countingBannerViewModel2 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null && !(thM7380exceptionOrNullimpl instanceof CancellationException)) {
                        countingBannerViewModel$loadData$1$3$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.home.ui.viewmodel.CountingBannerViewModel$loadData$1$3$1
                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                            public Object get(Object obj4) {
                                return ((CountingBannerViewModel.Activity) obj4).copydefault();
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                            public void set(Object obj4, Object obj5) {
                                ((CountingBannerViewModel.Activity) obj4).copydefault((InterfaceC49371unL) obj5);
                            }
                        };
                        application = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                        this.L$0 = obj2;
                        this.L$1 = countingBannerViewModel2;
                        this.L$2 = thM7380exceptionOrNullimpl;
                        this.label = 7;
                        if (countingBannerViewModel2.KWHzl(countingBannerViewModel$loadData$1$3$1, application, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        countingBannerViewModel$loadData$1$3$2 = new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.home.ui.viewmodel.CountingBannerViewModel$loadData$1$3$2
                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                            public Object get(Object obj4) {
                                return ((CountingBannerViewModel.Activity) obj4).EZpvd();
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                            public void set(Object obj4, Object obj5) {
                                ((CountingBannerViewModel.Activity) obj4).EZpvd((InterfaceC49371unL<NewCoinInfo>) obj5);
                            }
                        };
                        application2 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 8;
                        if (countingBannerViewModel2.KWHzl(countingBannerViewModel$loadData$1$3$2, application2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                obj2 = objM7377constructorimpl;
                countingBannerViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    countingBannerViewModel$loadData$1$3$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.home.ui.viewmodel.CountingBannerViewModel$loadData$1$3$1
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj4) {
                            return ((CountingBannerViewModel.Activity) obj4).copydefault();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj4, Object obj5) {
                            ((CountingBannerViewModel.Activity) obj4).copydefault((InterfaceC49371unL) obj5);
                        }
                    };
                    application = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                    this.L$0 = obj2;
                    this.L$1 = countingBannerViewModel2;
                    this.L$2 = thM7380exceptionOrNullimpl;
                    this.label = 7;
                    if (countingBannerViewModel2.KWHzl(countingBannerViewModel$loadData$1$3$1, application, this) == objCopydefault) {
                    }
                    countingBannerViewModel$loadData$1$3$2 = new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.home.ui.viewmodel.CountingBannerViewModel$loadData$1$3$2
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj4) {
                            return ((CountingBannerViewModel.Activity) obj4).EZpvd();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj4, Object obj5) {
                            ((CountingBannerViewModel.Activity) obj4).EZpvd((InterfaceC49371unL<NewCoinInfo>) obj5);
                        }
                    };
                    application2 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 8;
                    if (countingBannerViewModel2.KWHzl(countingBannerViewModel$loadData$1$3$2, application2, this) == objCopydefault) {
                    }
                }
                return Unit.INSTANCE;
            case 1:
                countingBannerViewModel3 = (CountingBannerViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                countingBannerViewModel$loadData$1$1$2 = new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.home.ui.viewmodel.CountingBannerViewModel$loadData$1$1$2
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj4) {
                        return ((CountingBannerViewModel.Activity) obj4).EZpvd();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj4, Object obj5) {
                        ((CountingBannerViewModel.Activity) obj4).EZpvd((InterfaceC49371unL<NewCoinInfo>) obj5);
                    }
                };
                actionBar = new InterfaceC49371unL.ActionBar(null, 1, null);
                this.L$0 = countingBannerViewModel3;
                this.label = 2;
                if (countingBannerViewModel3.KWHzl(countingBannerViewModel$loadData$1$1$2, actionBar, this) == objCopydefault) {
                }
                C46608taQ c46608taQ2 = countingBannerViewModel3.KWHzl;
                Unit unit2 = Unit.INSTANCE;
                this.L$0 = null;
                this.label = 3;
                obj = c46608taQ2.EZpvd(unit2, this);
                if (obj == objCopydefault) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl((Pair) obj);
                countingBannerViewModel = this.this$0;
                if (!Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                break;
            case 2:
                countingBannerViewModel3 = (CountingBannerViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                C46608taQ c46608taQ22 = countingBannerViewModel3.KWHzl;
                Unit unit22 = Unit.INSTANCE;
                this.L$0 = null;
                this.label = 3;
                obj = c46608taQ22.EZpvd(unit22, this);
                if (obj == objCopydefault) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl((Pair) obj);
                countingBannerViewModel = this.this$0;
                if (!Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                break;
            case 3:
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl((Pair) obj);
                countingBannerViewModel = this.this$0;
                if (!Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                break;
            case 4:
                newCoinInfo = (NewCoinInfo) this.L$2;
                countingBannerViewModel = (CountingBannerViewModel) this.L$1;
                Object obj4 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = obj4;
                if (newCoinInfo != null) {
                }
                obj3 = objM7377constructorimpl;
                obj2 = obj3;
                countingBannerViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 5:
            case 6:
                obj3 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                obj2 = obj3;
                countingBannerViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 7:
                thM7380exceptionOrNullimpl = (Throwable) this.L$2;
                countingBannerViewModel2 = (CountingBannerViewModel) this.L$1;
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                countingBannerViewModel$loadData$1$3$2 = new MutablePropertyReference1Impl() { // from class: com.okinc.okmarket.home.ui.viewmodel.CountingBannerViewModel$loadData$1$3$2
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj42) {
                        return ((CountingBannerViewModel.Activity) obj42).EZpvd();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj42, Object obj5) {
                        ((CountingBannerViewModel.Activity) obj42).EZpvd((InterfaceC49371unL<NewCoinInfo>) obj5);
                    }
                };
                application2 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                this.L$0 = obj2;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 8;
                if (countingBannerViewModel2.KWHzl(countingBannerViewModel$loadData$1$3$2, application2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 8:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
