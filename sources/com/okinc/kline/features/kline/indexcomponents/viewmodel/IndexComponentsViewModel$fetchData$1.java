package com.okinc.kline.features.kline.indexcomponents.viewmodel;

import com.okinc.kline.features.kline.indexcomponents.data.model.IndexComponentsResp;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.oRC;
import o.oRM;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class IndexComponentsViewModel$fetchData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $index;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IndexComponentsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexComponentsViewModel$fetchData$1(IndexComponentsViewModel indexComponentsViewModel, String str, Continuation<? super IndexComponentsViewModel$fetchData$1> continuation) {
        super(2, continuation);
        this.this$0 = indexComponentsViewModel;
        this.$index = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IndexComponentsViewModel$fetchData$1 indexComponentsViewModel$fetchData$1 = new IndexComponentsViewModel$fetchData$1(this.this$0, this.$index, continuation);
        indexComponentsViewModel$fetchData$1.L$0 = obj;
        return indexComponentsViewModel$fetchData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IndexComponentsViewModel$fetchData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            IndexComponentsViewModel indexComponentsViewModel = this.this$0;
            AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.features.kline.indexcomponents.viewmodel.IndexComponentsViewModel$fetchData$1.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj3) {
                    return ((oRM) obj3).AEQbTJ();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj3, Object obj4) {
                    ((oRM) obj3).copydefault((InterfaceC49371unL<IndexComponentsResp>) obj4);
                }
            };
            InterfaceC49371unL.ActionBar actionBar = new InterfaceC49371unL.ActionBar(null, 1, null);
            this.L$0 = coroutineScope;
            this.label = 1;
            if (indexComponentsViewModel.KWHzl(anonymousClass1, actionBar, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    objM7377constructorimpl = Result.m7377constructorimpl((IndexComponentsResp) obj);
                    obj2 = objM7377constructorimpl;
                    IndexComponentsViewModel indexComponentsViewModel2 = this.this$0;
                    if (Result.m7384isSuccessimpl(obj2)) {
                        IndexComponentsViewModel$fetchData$1$3$1 indexComponentsViewModel$fetchData$1$3$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.features.kline.indexcomponents.viewmodel.IndexComponentsViewModel$fetchData$1$3$1
                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                            public Object get(Object obj3) {
                                return ((oRM) obj3).AEQbTJ();
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                            public void set(Object obj3, Object obj4) {
                                ((oRM) obj3).copydefault((InterfaceC49371unL<IndexComponentsResp>) obj4);
                            }
                        };
                        InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity((IndexComponentsResp) obj2);
                        this.L$0 = obj2;
                        this.label = 3;
                        if (indexComponentsViewModel2.KWHzl(indexComponentsViewModel$fetchData$1$3$1, activity, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    IndexComponentsViewModel indexComponentsViewModel3 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                    if (thM7380exceptionOrNullimpl != null) {
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
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                IndexComponentsViewModel indexComponentsViewModel32 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("IndexComponentsVM", "fetchData failed", thM7380exceptionOrNullimpl);
                    IndexComponentsViewModel$fetchData$1$4$1 indexComponentsViewModel$fetchData$1$4$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.features.kline.indexcomponents.viewmodel.IndexComponentsViewModel$fetchData$1$4$1
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj3) {
                            return ((oRM) obj3).AEQbTJ();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj3, Object obj4) {
                            ((oRM) obj3).copydefault((InterfaceC49371unL<IndexComponentsResp>) obj4);
                        }
                    };
                    InterfaceC49371unL.Application application2 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                    this.L$0 = obj2;
                    this.label = 4;
                    if (indexComponentsViewModel32.KWHzl(indexComponentsViewModel$fetchData$1$4$1, application2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        IndexComponentsViewModel indexComponentsViewModel4 = this.this$0;
        String str = this.$index;
        Result.Application application3 = Result.Companion;
        oRC orc = indexComponentsViewModel4.AEQbTJ;
        this.L$0 = null;
        this.label = 2;
        obj = orc.EZpvd(str, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((IndexComponentsResp) obj);
        obj2 = objM7377constructorimpl;
        IndexComponentsViewModel indexComponentsViewModel22 = this.this$0;
        if (Result.m7384isSuccessimpl(obj2)) {
        }
        IndexComponentsViewModel indexComponentsViewModel322 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
