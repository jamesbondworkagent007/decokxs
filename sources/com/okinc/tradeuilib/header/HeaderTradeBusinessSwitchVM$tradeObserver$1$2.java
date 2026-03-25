package com.okinc.tradeuilib.header;

import java.util.ArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import o.AbstractC54531xLw;
import o.C49668usr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC54581xNr;
import o.xND;

/* JADX INFO: loaded from: classes19.dex */
public final class HeaderTradeBusinessSwitchVM$tradeObserver$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC54581xNr $it;
    int label;
    final /* synthetic */ C49668usr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderTradeBusinessSwitchVM$tradeObserver$1$2(C49668usr c49668usr, InterfaceC54581xNr interfaceC54581xNr, Continuation<? super HeaderTradeBusinessSwitchVM$tradeObserver$1$2> continuation) {
        super(2, continuation);
        this.this$0 = c49668usr;
        this.$it = interfaceC54581xNr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HeaderTradeBusinessSwitchVM$tradeObserver$1$2(this.this$0, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HeaderTradeBusinessSwitchVM$tradeObserver$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.tradeuilib.header.HeaderTradeBusinessSwitchVM$tradeObserver$1$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC54581xNr $it;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C49668usr this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C49668usr c49668usr, InterfaceC54581xNr interfaceC54581xNr, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c49668usr;
            this.$it = interfaceC54581xNr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$it, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                ArrayList arrayList = new ArrayList();
                arrayList.add(BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new C06221(this.$it, this.this$0, null), 2, null));
                xND xndAEQbTJ = this.this$0.DbNXlk().AEQbTJ();
                if (xndAEQbTJ != null && Intrinsics.EZpvd(xndAEQbTJ.DbNXlk(), C56443yFo.KWHzl(true))) {
                    arrayList.add(BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new AnonymousClass2(this.$it, this.this$0, null), 2, null));
                }
                xND xndAEQbTJ2 = this.this$0.DbNXlk().AEQbTJ();
                if (xndAEQbTJ2 != null && Intrinsics.EZpvd(xndAEQbTJ2.AkhnZx(), C56443yFo.KWHzl(true))) {
                    arrayList.add(BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new AnonymousClass3(this.$it, this.this$0, null), 2, null));
                }
                this.label = 1;
                if (AwaitKt.joinAll(arrayList, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.tradeuilib.header.HeaderTradeBusinessSwitchVM$tradeObserver$1$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C06221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ InterfaceC54581xNr $it;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C49668usr this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06221(InterfaceC54581xNr interfaceC54581xNr, C49668usr c49668usr, Continuation<? super C06221> continuation) {
                super(2, continuation);
                this.$it = interfaceC54581xNr;
                this.this$0 = c49668usr;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06221 c06221 = new C06221(this.$it, this.this$0, continuation);
                c06221.L$0 = obj;
                return c06221;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM7377constructorimpl;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                try {
                } catch (Throwable th) {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    InterfaceC54581xNr interfaceC54581xNr = this.$it;
                    Result.Application application2 = Result.Companion;
                    this.label = 1;
                    obj = interfaceC54581xNr.EZpvd("SPOT", this);
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
                objM7377constructorimpl = Result.m7377constructorimpl((AbstractC54531xLw) obj);
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C06231 c06231 = new C06231(this.this$0, (AbstractC54531xLw) objM7377constructorimpl, null);
                this.label = 2;
                if (BuildersKt.withContext(main, c06231, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.okinc.tradeuilib.header.HeaderTradeBusinessSwitchVM$tradeObserver$1$2$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C06231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ AbstractC54531xLw $spot;
                int label;
                final /* synthetic */ C49668usr this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C06231(C49668usr c49668usr, AbstractC54531xLw abstractC54531xLw, Continuation<? super C06231> continuation) {
                    super(2, continuation);
                    this.this$0 = c49668usr;
                    this.$spot = abstractC54531xLw;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C06231(this.this$0, this.$spot, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C06231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        this.this$0.AYXKKw().setValue(this.$spot);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.okinc.tradeuilib.header.HeaderTradeBusinessSwitchVM$tradeObserver$1$2$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ InterfaceC54581xNr $it;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C49668usr this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InterfaceC54581xNr interfaceC54581xNr, C49668usr c49668usr, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$it = interfaceC54581xNr;
                this.this$0 = c49668usr;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$it, this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM7377constructorimpl;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                try {
                } catch (Throwable th) {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    InterfaceC54581xNr interfaceC54581xNr = this.$it;
                    Result.Application application2 = Result.Companion;
                    this.label = 1;
                    obj = interfaceC54581xNr.EZpvd("SWAP", this);
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
                objM7377constructorimpl = Result.m7377constructorimpl((AbstractC54531xLw) obj);
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C06241 c06241 = new C06241(this.this$0, (AbstractC54531xLw) objM7377constructorimpl, null);
                this.label = 2;
                if (BuildersKt.withContext(main, c06241, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.okinc.tradeuilib.header.HeaderTradeBusinessSwitchVM$tradeObserver$1$2$1$2$1, reason: invalid class name and collision with other inner class name */
            public static final class C06241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ AbstractC54531xLw $swap;
                int label;
                final /* synthetic */ C49668usr this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C06241(C49668usr c49668usr, AbstractC54531xLw abstractC54531xLw, Continuation<? super C06241> continuation) {
                    super(2, continuation);
                    this.this$0 = c49668usr;
                    this.$swap = abstractC54531xLw;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C06241(this.this$0, this.$swap, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C06241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        this.this$0.djBIcL().setValue(this.$swap);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX INFO: renamed from: com.okinc.tradeuilib.header.HeaderTradeBusinessSwitchVM$tradeObserver$1$2$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ InterfaceC54581xNr $it;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ C49668usr this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(InterfaceC54581xNr interfaceC54581xNr, C49668usr c49668usr, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$it = interfaceC54581xNr;
                this.this$0 = c49668usr;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$it, this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM7377constructorimpl;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                try {
                } catch (Throwable th) {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    InterfaceC54581xNr interfaceC54581xNr = this.$it;
                    Result.Application application2 = Result.Companion;
                    this.label = 1;
                    obj = interfaceC54581xNr.EZpvd("OPTION", this);
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
                objM7377constructorimpl = Result.m7377constructorimpl((AbstractC54531xLw) obj);
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C06251 c06251 = new C06251(this.this$0, (AbstractC54531xLw) objM7377constructorimpl, null);
                this.label = 2;
                if (BuildersKt.withContext(main, c06251, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.okinc.tradeuilib.header.HeaderTradeBusinessSwitchVM$tradeObserver$1$2$1$3$1, reason: invalid class name and collision with other inner class name */
            public static final class C06251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ AbstractC54531xLw $option;
                int label;
                final /* synthetic */ C49668usr this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C06251(C49668usr c49668usr, AbstractC54531xLw abstractC54531xLw, Continuation<? super C06251> continuation) {
                    super(2, continuation);
                    this.this$0 = c49668usr;
                    this.$option = abstractC54531xLw;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C06251(this.this$0, this.$option, continuation);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C06251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        this.this$0.gEmmrt().setValue(this.$option);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$it, null);
            this.label = 1;
            if (SupervisorKt.supervisorScope(anonymousClass1, this) == objCopydefault) {
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
        MainCoroutineDispatcher main = Dispatchers.getMain();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
        this.label = 2;
        if (BuildersKt.withContext(main, anonymousClass2, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.tradeuilib.header.HeaderTradeBusinessSwitchVM$tradeObserver$1$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C49668usr this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C49668usr c49668usr, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = c49668usr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.valueOf();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
