package com.okinc.im.imui.broadcastmessages.messagelist;

import com.okinc.im.imui.broadcastmessages.BroadcastMessagePageParam;
import com.okinc.okimcore.model.remote.CreateBroadcastChannelResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C35254nrp;
import o.C35764oCv;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oGQ;

/* JADX INFO: loaded from: classes23.dex */
public final class BroadcastMessageListFragmentViewModel$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BroadcastMessagePageParam $request;
    int label;
    final /* synthetic */ BroadcastMessageListFragmentViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessageListFragmentViewModel$init$1(BroadcastMessageListFragmentViewModel broadcastMessageListFragmentViewModel, BroadcastMessagePageParam broadcastMessagePageParam, Continuation<? super BroadcastMessageListFragmentViewModel$init$1> continuation) {
        super(2, continuation);
        this.this$0 = broadcastMessageListFragmentViewModel;
        this.$request = broadcastMessagePageParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BroadcastMessageListFragmentViewModel$init$1(this.this$0, this.$request, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BroadcastMessageListFragmentViewModel$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.broadcastmessages.messagelist.BroadcastMessageListFragmentViewModel$init$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BroadcastMessagePageParam $request;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BroadcastMessageListFragmentViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BroadcastMessageListFragmentViewModel broadcastMessageListFragmentViewModel, BroadcastMessagePageParam broadcastMessagePageParam, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = broadcastMessageListFragmentViewModel;
            this.$request = broadcastMessagePageParam;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$request, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x007a A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            MutableStateFlow mutableStateFlow;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                BroadcastMessageListFragmentViewModel broadcastMessageListFragmentViewModel = this.this$0;
                Result.Application application2 = Result.Companion;
                oGQ ogq = broadcastMessageListFragmentViewModel.AYXKKw;
                this.label = 1;
                obj = ogq.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    C56391yDq.AEQbTJ(obj);
                    mutableStateFlow = this.this$0.OLrzqt;
                    this.label = 3;
                    if (mutableStateFlow.emit((C35254nrp) obj, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
            Result.m7377constructorimpl(C56443yFo.KWHzl(((Boolean) obj).booleanValue()));
            C35764oCv c35764oCv = this.this$0.AhwBna;
            CreateBroadcastChannelResponse createBroadcastChannelResponseAEQbTJ = this.$request.AEQbTJ();
            this.label = 2;
            obj = c35764oCv.AEQbTJ(createBroadcastChannelResponseAEQbTJ, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            mutableStateFlow = this.this$0.OLrzqt;
            this.label = 3;
            if (mutableStateFlow.emit((C35254nrp) obj, this) == objCopydefault) {
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$request, null);
            this.label = 1;
            if (BuildersKt.withContext(io2, anonymousClass1, this) == objCopydefault) {
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
