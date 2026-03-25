package com.okinc.kline.ui.unlock.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.kline.data.KlineCoinInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C39656pwU;
import o.C39705pxQ;
import o.C39713pxY;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes8.dex */
public final class UnlockTokensViewModel$fetchPreData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UnlockTokensViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnlockTokensViewModel$fetchPreData$2(UnlockTokensViewModel unlockTokensViewModel, Continuation<? super UnlockTokensViewModel$fetchPreData$2> continuation) {
        super(2, continuation);
        this.this$0 = unlockTokensViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnlockTokensViewModel$fetchPreData$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnlockTokensViewModel$fetchPreData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.kline.ui.unlock.ui.viewmodel.UnlockTokensViewModel$fetchPreData$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ UnlockTokensViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UnlockTokensViewModel unlockTokensViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = unlockTokensViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00a7 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:14:0x0032, B:41:0x00bb, B:17:0x003f, B:33:0x008a, B:35:0x0093, B:37:0x0099, B:38:0x00a7, B:21:0x004e, B:27:0x0071, B:30:0x007d, B:24:0x005b), top: B:57:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ba A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM7377constructorimpl;
            Throwable thM7380exceptionOrNullimpl;
            CoroutineScope coroutineScope;
            UnlockTokensViewModel unlockTokensViewModel;
            Object objOLrzqt;
            KlineCoinInfo klineCoinInfo;
            UnlockTokensViewModel$fetchPreData$2$1$1$3 unlockTokensViewModel$fetchPreData$2$1$1$3;
            InterfaceC49371unL.TaskDescription taskDescription;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                unlockTokensViewModel = this.this$0;
                Result.Application application2 = Result.Companion;
                UnlockTokensViewModel$fetchPreData$2$1$1$1 unlockTokensViewModel$fetchPreData$2$1$1$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.viewmodel.UnlockTokensViewModel$fetchPreData$2$1$1$1
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj2) {
                        return ((C39713pxY) obj2).copydefault();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj2, Object obj3) {
                        ((C39713pxY) obj2).AEQbTJ((InterfaceC49371unL<KlineCoinInfo>) obj3);
                    }
                };
                InterfaceC49371unL.ActionBar actionBar = new InterfaceC49371unL.ActionBar(null, 1, null);
                this.L$0 = unlockTokensViewModel;
                this.L$1 = coroutineScope;
                this.label = 1;
                if (unlockTokensViewModel.KWHzl(unlockTokensViewModel$fetchPreData$2$1$1$1, actionBar, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        coroutineScope = (CoroutineScope) this.L$1;
                        unlockTokensViewModel = (UnlockTokensViewModel) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        objOLrzqt = obj;
                        CoroutineScope coroutineScope2 = coroutineScope;
                        klineCoinInfo = (KlineCoinInfo) objOLrzqt;
                        if (!klineCoinInfo.getSupportTokenUnlock() && unlockTokensViewModel.valueOf()) {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new UnlockTokensViewModel$fetchPreData$2$1$1$2(unlockTokensViewModel, null), 3, null);
                        } else {
                            unlockTokensViewModel$fetchPreData$2$1$1$3 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.viewmodel.UnlockTokensViewModel$fetchPreData$2$1$1$3
                                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                                public Object get(Object obj2) {
                                    return ((C39713pxY) obj2).KWHzl();
                                }

                                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                                public void set(Object obj2, Object obj3) {
                                    ((C39713pxY) obj2).copydefault((InterfaceC49371unL<C39705pxQ>) obj3);
                                }
                            };
                            taskDescription = new InterfaceC49371unL.TaskDescription(null, 1, null);
                            this.L$0 = klineCoinInfo;
                            this.L$1 = null;
                            this.label = 3;
                            if (unlockTokensViewModel.KWHzl(unlockTokensViewModel$fetchPreData$2$1$1$3, taskDescription, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                        objM7377constructorimpl = Result.m7377constructorimpl(klineCoinInfo);
                        UnlockTokensViewModel unlockTokensViewModel2 = this.this$0;
                        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                        }
                        UnlockTokensViewModel unlockTokensViewModel3 = this.this$0;
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (i == 3) {
                        klineCoinInfo = (KlineCoinInfo) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        objM7377constructorimpl = Result.m7377constructorimpl(klineCoinInfo);
                        UnlockTokensViewModel unlockTokensViewModel22 = this.this$0;
                        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                            UnlockTokensViewModel$fetchPreData$2$1$2$1 unlockTokensViewModel$fetchPreData$2$1$2$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.viewmodel.UnlockTokensViewModel$fetchPreData$2$1$2$1
                                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                                public Object get(Object obj2) {
                                    return ((C39713pxY) obj2).copydefault();
                                }

                                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                                public void set(Object obj2, Object obj3) {
                                    ((C39713pxY) obj2).AEQbTJ((InterfaceC49371unL<KlineCoinInfo>) obj3);
                                }
                            };
                            InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity((KlineCoinInfo) objM7377constructorimpl);
                            this.L$0 = objM7377constructorimpl;
                            this.L$1 = null;
                            this.label = 4;
                            if (unlockTokensViewModel22.KWHzl(unlockTokensViewModel$fetchPreData$2$1$2$1, activity, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
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
                    objM7377constructorimpl = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    UnlockTokensViewModel unlockTokensViewModel322 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        UnlockTokensViewModel$fetchPreData$2$1$3$1 unlockTokensViewModel$fetchPreData$2$1$3$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.viewmodel.UnlockTokensViewModel$fetchPreData$2$1$3$1
                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                            public Object get(Object obj2) {
                                return ((C39713pxY) obj2).copydefault();
                            }

                            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                            public void set(Object obj2, Object obj3) {
                                ((C39713pxY) obj2).AEQbTJ((InterfaceC49371unL<KlineCoinInfo>) obj3);
                            }
                        };
                        InterfaceC49371unL.Application application3 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                        this.L$0 = objM7377constructorimpl;
                        this.L$1 = null;
                        this.label = 5;
                        if (unlockTokensViewModel322.KWHzl(unlockTokensViewModel$fetchPreData$2$1$3$1, application3, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                coroutineScope = (CoroutineScope) this.L$1;
                unlockTokensViewModel = (UnlockTokensViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            C39656pwU c39656pwU = unlockTokensViewModel.isConnected;
            String strAEQbTJ = unlockTokensViewModel.AEQbTJ();
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            this.L$0 = unlockTokensViewModel;
            this.L$1 = coroutineScope;
            this.label = 2;
            objOLrzqt = c39656pwU.OLrzqt(strAEQbTJ, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            CoroutineScope coroutineScope22 = coroutineScope;
            klineCoinInfo = (KlineCoinInfo) objOLrzqt;
            if (!klineCoinInfo.getSupportTokenUnlock()) {
                unlockTokensViewModel$fetchPreData$2$1$1$3 = new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.unlock.ui.viewmodel.UnlockTokensViewModel$fetchPreData$2$1$1$3
                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                    public Object get(Object obj2) {
                        return ((C39713pxY) obj2).KWHzl();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                    public void set(Object obj2, Object obj3) {
                        ((C39713pxY) obj2).copydefault((InterfaceC49371unL<C39705pxQ>) obj3);
                    }
                };
                taskDescription = new InterfaceC49371unL.TaskDescription(null, 1, null);
                this.L$0 = klineCoinInfo;
                this.L$1 = null;
                this.label = 3;
                if (unlockTokensViewModel.KWHzl(unlockTokensViewModel$fetchPreData$2$1$1$3, taskDescription, this) == objCopydefault) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(klineCoinInfo);
                UnlockTokensViewModel unlockTokensViewModel222 = this.this$0;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                }
                UnlockTokensViewModel unlockTokensViewModel3222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this.this$0), Dispatchers.getDefault(), null, new AnonymousClass1(this.this$0, null), 2, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
