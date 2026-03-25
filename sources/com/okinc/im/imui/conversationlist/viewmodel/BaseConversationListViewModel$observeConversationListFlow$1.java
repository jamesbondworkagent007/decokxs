package com.okinc.im.imui.conversationlist.viewmodel;

import com.okinc.im.imui.conversationlist.model.PageTrackData;
import com.okinc.okimcore.model.im.OKConversation;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C32989mnw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.nGA;
import o.sGF;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class BaseConversationListViewModel$observeConversationListFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $page;
    final /* synthetic */ boolean $showCacheFirst;
    final /* synthetic */ int $size;
    int label;
    final /* synthetic */ BaseConversationListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseConversationListViewModel$observeConversationListFlow$1(BaseConversationListViewModel baseConversationListViewModel, int i, boolean z, int i2, Continuation<? super BaseConversationListViewModel$observeConversationListFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = baseConversationListViewModel;
        this.$size = i;
        this.$showCacheFirst = z;
        this.$page = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseConversationListViewModel$observeConversationListFlow$1(this.this$0, this.$size, this.$showCacheFirst, this.$page, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseConversationListViewModel$observeConversationListFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.this$0.DTwDnp()) {
                this.this$0.AuCTelauCTel().setValue(new C32989mnw<>(new nGA.Fragment(true)));
            }
            sGF sgfFetchVPNInfo = this.this$0.fetchVPNInfo();
            int i2 = this.$size;
            boolean newProxyInstance = this.this$0.getNewProxyInstance();
            boolean fieldNames = this.this$0.getFieldNames();
            boolean z = this.$showCacheFirst;
            this.label = 1;
            obj = sgfFetchVPNInfo.AEQbTJ(i2, newProxyInstance, fieldNames, z, this);
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
        Flow flowM7441catch = FlowKt.m7441catch(FlowKt.onStart((Flow) obj, new AnonymousClass1(this.this$0, this.$page, null)), new AnonymousClass2(this.this$0, null));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$page, null);
        this.label = 2;
        if (FlowKt.collectLatest(flowM7441catch, anonymousClass3, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel$observeConversationListFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super Result<? extends List<? extends OKConversation>>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $page;
        int label;
        final /* synthetic */ BaseConversationListViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseConversationListViewModel baseConversationListViewModel, int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = baseConversationListViewModel;
            this.$page = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$page, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Result<? extends List<? extends OKConversation>>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super Result<? extends List<OKConversation>>>) flowCollector, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super Result<? extends List<OKConversation>>> flowCollector, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (this.this$0.wlaJM().get(C56443yFo.AEQbTJ(this.$page)) == null) {
                    this.this$0.wlaJM().put(C56443yFo.AEQbTJ(this.$page), new PageTrackData(this.$page, System.currentTimeMillis(), false, 4, null));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel$observeConversationListFlow$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements yHO<FlowCollector<? super Result<? extends List<? extends OKConversation>>>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseConversationListViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BaseConversationListViewModel baseConversationListViewModel, Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
            this.this$0 = baseConversationListViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHO
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Result<? extends List<? extends OKConversation>>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super Result<? extends List<OKConversation>>>) flowCollector, th, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super Result<? extends List<OKConversation>>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = th;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Throwable th = (Throwable) this.L$0;
                BaseConversationListViewModel baseConversationListViewModel = this.this$0;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                String str = "[In-House] Conversation list flow - flow Error: " + message;
                this.label = 1;
                if (baseConversationListViewModel.OLrzqt(th, str, this) == objCopydefault) {
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
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.conversationlist.viewmodel.BaseConversationListViewModel$observeConversationListFlow$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Result<? extends List<? extends OKConversation>>, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $page;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseConversationListViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BaseConversationListViewModel baseConversationListViewModel, int i, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = baseConversationListViewModel;
            this.$page = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$page, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Result<? extends List<? extends OKConversation>> result, Continuation<? super Unit> continuation) {
            return invoke(result.m7386unboximpl(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(Result.m7376boximpl(obj), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String message;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Object objM7386unboximpl = ((Result) this.L$0).m7386unboximpl();
                this.this$0.KWHzl(false);
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    BaseConversationListViewModel baseConversationListViewModel = this.this$0;
                    C56391yDq.AEQbTJ(objM7386unboximpl);
                    int i2 = this.$page;
                    this.label = 1;
                    if (baseConversationListViewModel.OLrzqt((List<OKConversation>) objM7386unboximpl, i2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    BaseConversationListViewModel baseConversationListViewModel2 = this.this$0;
                    Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                    Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                    if (thM7380exceptionOrNullimpl2 == null || (message = thM7380exceptionOrNullimpl2.getMessage()) == null) {
                        message = "";
                    }
                    String str = "[In-House] Conversation list flow - collectLatest error: " + message;
                    this.label = 2;
                    if (baseConversationListViewModel2.OLrzqt(thM7380exceptionOrNullimpl, str, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
