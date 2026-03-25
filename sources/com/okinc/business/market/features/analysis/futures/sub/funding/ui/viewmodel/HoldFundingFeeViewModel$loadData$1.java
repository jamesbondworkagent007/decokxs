package com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel;

import com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.HoldFundingFeeViewModel;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C25878jJs;
import o.C25882jJw;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.yDY;

/* JADX INFO: loaded from: classes23.dex */
public final class HoldFundingFeeViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $sortType;
    final /* synthetic */ String $uid;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ HoldFundingFeeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoldFundingFeeViewModel$loadData$1(HoldFundingFeeViewModel holdFundingFeeViewModel, String str, String str2, Continuation<? super HoldFundingFeeViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = holdFundingFeeViewModel;
        this.$sortType = str;
        this.$uid = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HoldFundingFeeViewModel$loadData$1 holdFundingFeeViewModel$loadData$1 = new HoldFundingFeeViewModel$loadData$1(this.this$0, this.$sortType, this.$uid, continuation);
        holdFundingFeeViewModel$loadData$1.L$0 = obj;
        return holdFundingFeeViewModel$loadData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HoldFundingFeeViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:8:0x001f, B:46:0x00dd, B:13:0x002b, B:40:0x00c5, B:42:0x00c9, B:43:0x00cd, B:16:0x0038, B:35:0x00a4, B:37:0x00b1, B:19:0x0049, B:31:0x0090, B:26:0x0077), top: B:66:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:8:0x001f, B:46:0x00dd, B:13:0x002b, B:40:0x00c5, B:42:0x00c9, B:43:0x00cd, B:16:0x0038, B:35:0x00a4, B:37:0x00b1, B:19:0x0049, B:31:0x0090, B:26:0x0077), top: B:66:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        HoldFundingFeeViewModel holdFundingFeeViewModel;
        String str;
        HoldFundingFeeViewModel$loadData$1$2$1 holdFundingFeeViewModel$loadData$1$2$1;
        String str2;
        String str3;
        HoldFundingFeeViewModel holdFundingFeeViewModel2;
        String strOLrzqt;
        HoldFundingFeeViewModel holdFundingFeeViewModel3;
        String str4;
        List listAhwBna;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                HoldFundingFeeViewModel holdFundingFeeViewModel4 = this.this$0;
                AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.HoldFundingFeeViewModel$loadData$1.1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj3) {
                        return ((HoldFundingFeeViewModel.TaskDescription) obj3).KWHzl();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj3, Object obj4) {
                        ((HoldFundingFeeViewModel.TaskDescription) obj3).EZpvd((InterfaceC49371unL) obj4);
                    }
                };
                InterfaceC49371unL.ActionBar actionBar = new InterfaceC49371unL.ActionBar(null, 1, null);
                this.L$0 = coroutineScope;
                this.label = 1;
                if (holdFundingFeeViewModel4.KWHzl(anonymousClass1, actionBar, this) == objCopydefault) {
                    return objCopydefault;
                }
                holdFundingFeeViewModel = this.this$0;
                str = this.$sortType;
                String str5 = this.$uid;
                Result.Application application2 = Result.Companion;
                holdFundingFeeViewModel$loadData$1$2$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.HoldFundingFeeViewModel$loadData$1$2$1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj3) {
                        return ((HoldFundingFeeViewModel.TaskDescription) obj3).EZpvd();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj3, Object obj4) {
                        ((HoldFundingFeeViewModel.TaskDescription) obj3).KWHzl((String) obj4);
                    }
                };
                this.L$0 = holdFundingFeeViewModel;
                this.L$1 = str;
                this.L$2 = str5;
                this.label = 2;
                if (holdFundingFeeViewModel.KWHzl(holdFundingFeeViewModel$loadData$1$2$1, str, this) != objCopydefault) {
                    return objCopydefault;
                }
                str2 = str;
                str3 = str5;
                if (str3 != null) {
                    this.L$0 = holdFundingFeeViewModel;
                    this.L$1 = str2;
                    this.L$2 = null;
                    this.label = 3;
                    Object objOLrzqt = holdFundingFeeViewModel.OLrzqt(holdFundingFeeViewModel, this);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    String str6 = str2;
                    holdFundingFeeViewModel3 = holdFundingFeeViewModel;
                    obj = objOLrzqt;
                    str4 = str6;
                    strOLrzqt = ((HoldFundingFeeViewModel.TaskDescription) obj).OLrzqt();
                    HoldFundingFeeViewModel holdFundingFeeViewModel5 = holdFundingFeeViewModel3;
                    str2 = str4;
                    holdFundingFeeViewModel2 = holdFundingFeeViewModel5;
                    C25878jJs c25878jJsOLrzqt = holdFundingFeeViewModel2.OLrzqt();
                    this.L$0 = holdFundingFeeViewModel2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    obj = c25878jJsOLrzqt.OLrzqt(str2, strOLrzqt, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    listAhwBna = (List) obj;
                    if (listAhwBna == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    C25882jJw c25882jJwEZpvd = holdFundingFeeViewModel2.EZpvd();
                    this.L$0 = null;
                    this.label = 5;
                    obj = c25882jJwEZpvd.EZpvd(listAhwBna, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
                    obj2 = objM7377constructorimpl;
                    HoldFundingFeeViewModel holdFundingFeeViewModel6 = this.this$0;
                    if (Result.m7384isSuccessimpl(obj2)) {
                        List list = (List) obj2;
                        if (list.isEmpty()) {
                            HoldFundingFeeViewModel$loadData$1$3$1 holdFundingFeeViewModel$loadData$1$3$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.HoldFundingFeeViewModel$loadData$1$3$1
                                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                                public Object get(Object obj3) {
                                    return ((HoldFundingFeeViewModel.TaskDescription) obj3).KWHzl();
                                }

                                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                                public void set(Object obj3, Object obj4) {
                                    ((HoldFundingFeeViewModel.TaskDescription) obj3).EZpvd((InterfaceC49371unL) obj4);
                                }
                            };
                            InterfaceC49371unL.TaskDescription taskDescription = new InterfaceC49371unL.TaskDescription(null, 1, null);
                            this.L$0 = obj2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 6;
                            if (holdFundingFeeViewModel6.KWHzl(holdFundingFeeViewModel$loadData$1$3$1, taskDescription, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            HoldFundingFeeViewModel$loadData$1$3$2 holdFundingFeeViewModel$loadData$1$3$2 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.HoldFundingFeeViewModel$loadData$1$3$2
                                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                                public Object get(Object obj3) {
                                    return ((HoldFundingFeeViewModel.TaskDescription) obj3).KWHzl();
                                }

                                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                                public void set(Object obj3, Object obj4) {
                                    ((HoldFundingFeeViewModel.TaskDescription) obj3).EZpvd((InterfaceC49371unL) obj4);
                                }
                            };
                            InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(list);
                            this.L$0 = obj2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 7;
                            if (holdFundingFeeViewModel6.KWHzl(holdFundingFeeViewModel$loadData$1$3$2, activity, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    }
                    HoldFundingFeeViewModel holdFundingFeeViewModel7 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
                        HoldFundingFeeViewModel$loadData$1$4$1 holdFundingFeeViewModel$loadData$1$4$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.HoldFundingFeeViewModel$loadData$1$4$1
                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                            public Object get(Object obj3) {
                                return ((HoldFundingFeeViewModel.TaskDescription) obj3).KWHzl();
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                            public void set(Object obj3, Object obj4) {
                                ((HoldFundingFeeViewModel.TaskDescription) obj3).EZpvd((InterfaceC49371unL) obj4);
                            }
                        };
                        InterfaceC49371unL.Application application3 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, yDY.AhwBna());
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 8;
                        if (holdFundingFeeViewModel7.KWHzl(holdFundingFeeViewModel$loadData$1$4$1, application3, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                String str7 = str3;
                holdFundingFeeViewModel2 = holdFundingFeeViewModel;
                strOLrzqt = str7;
                C25878jJs c25878jJsOLrzqt2 = holdFundingFeeViewModel2.OLrzqt();
                this.L$0 = holdFundingFeeViewModel2;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                obj = c25878jJsOLrzqt2.OLrzqt(str2, strOLrzqt, this);
                if (obj == objCopydefault) {
                }
                listAhwBna = (List) obj;
                if (listAhwBna == null) {
                }
                C25882jJw c25882jJwEZpvd2 = holdFundingFeeViewModel2.EZpvd();
                this.L$0 = null;
                this.label = 5;
                obj = c25882jJwEZpvd2.EZpvd(listAhwBna, this);
                if (obj == objCopydefault) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
                obj2 = objM7377constructorimpl;
                HoldFundingFeeViewModel holdFundingFeeViewModel62 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                HoldFundingFeeViewModel holdFundingFeeViewModel72 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                holdFundingFeeViewModel = this.this$0;
                str = this.$sortType;
                String str52 = this.$uid;
                Result.Application application22 = Result.Companion;
                holdFundingFeeViewModel$loadData$1$2$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.HoldFundingFeeViewModel$loadData$1$2$1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj3) {
                        return ((HoldFundingFeeViewModel.TaskDescription) obj3).EZpvd();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj3, Object obj4) {
                        ((HoldFundingFeeViewModel.TaskDescription) obj3).KWHzl((String) obj4);
                    }
                };
                this.L$0 = holdFundingFeeViewModel;
                this.L$1 = str;
                this.L$2 = str52;
                this.label = 2;
                if (holdFundingFeeViewModel.KWHzl(holdFundingFeeViewModel$loadData$1$2$1, str, this) != objCopydefault) {
                }
                break;
            case 2:
                str3 = (String) this.L$2;
                str2 = (String) this.L$1;
                HoldFundingFeeViewModel holdFundingFeeViewModel8 = (HoldFundingFeeViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                holdFundingFeeViewModel = holdFundingFeeViewModel8;
                if (str3 != null) {
                }
                break;
            case 3:
                str4 = (String) this.L$1;
                holdFundingFeeViewModel3 = (HoldFundingFeeViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                strOLrzqt = ((HoldFundingFeeViewModel.TaskDescription) obj).OLrzqt();
                HoldFundingFeeViewModel holdFundingFeeViewModel52 = holdFundingFeeViewModel3;
                str2 = str4;
                holdFundingFeeViewModel2 = holdFundingFeeViewModel52;
                C25878jJs c25878jJsOLrzqt22 = holdFundingFeeViewModel2.OLrzqt();
                this.L$0 = holdFundingFeeViewModel2;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
                obj = c25878jJsOLrzqt22.OLrzqt(str2, strOLrzqt, this);
                if (obj == objCopydefault) {
                }
                listAhwBna = (List) obj;
                if (listAhwBna == null) {
                }
                C25882jJw c25882jJwEZpvd22 = holdFundingFeeViewModel2.EZpvd();
                this.L$0 = null;
                this.label = 5;
                obj = c25882jJwEZpvd22.EZpvd(listAhwBna, this);
                if (obj == objCopydefault) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
                obj2 = objM7377constructorimpl;
                HoldFundingFeeViewModel holdFundingFeeViewModel622 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                HoldFundingFeeViewModel holdFundingFeeViewModel722 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 4:
                holdFundingFeeViewModel2 = (HoldFundingFeeViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                listAhwBna = (List) obj;
                if (listAhwBna == null) {
                }
                C25882jJw c25882jJwEZpvd222 = holdFundingFeeViewModel2.EZpvd();
                this.L$0 = null;
                this.label = 5;
                obj = c25882jJwEZpvd222.EZpvd(listAhwBna, this);
                if (obj == objCopydefault) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
                obj2 = objM7377constructorimpl;
                HoldFundingFeeViewModel holdFundingFeeViewModel6222 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                HoldFundingFeeViewModel holdFundingFeeViewModel7222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 5:
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
                obj2 = objM7377constructorimpl;
                HoldFundingFeeViewModel holdFundingFeeViewModel62222 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                HoldFundingFeeViewModel holdFundingFeeViewModel72222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 6:
            case 7:
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                HoldFundingFeeViewModel holdFundingFeeViewModel722222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
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
