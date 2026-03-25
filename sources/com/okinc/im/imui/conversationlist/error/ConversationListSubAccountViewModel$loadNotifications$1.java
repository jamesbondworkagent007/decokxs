package com.okinc.im.imui.conversationlist.error;

import android.content.Context;
import com.okinc.okimcore.model.im.OKConversation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C32979mnm;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.nGF;
import o.pUU;
import o.rXL;
import o.sGF;

/* JADX INFO: loaded from: classes18.dex */
public final class ConversationListSubAccountViewModel$loadNotifications$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ConversationListSubAccountViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationListSubAccountViewModel$loadNotifications$1(ConversationListSubAccountViewModel conversationListSubAccountViewModel, Continuation<? super ConversationListSubAccountViewModel$loadNotifications$1> continuation) {
        super(2, continuation);
        this.this$0 = conversationListSubAccountViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationListSubAccountViewModel$loadNotifications$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationListSubAccountViewModel$loadNotifications$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ConversationListSubAccountViewModel conversationListSubAccountViewModel = this.this$0;
            this.label = 1;
            if (conversationListSubAccountViewModel.copydefault((Continuation<? super Unit>) this) == objCopydefault) {
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
                anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 3;
                if (FlowKt.collectLatest((Flow) obj, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.copydefault();
        sGF sgf = this.this$0.AEQbTJ;
        this.label = 2;
        obj = sgf.AEQbTJ(2, false, false, true, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.label = 3;
        if (FlowKt.collectLatest((Flow) obj, anonymousClass1, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.conversationlist.error.ConversationListSubAccountViewModel$loadNotifications$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Result<? extends List<? extends OKConversation>>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ConversationListSubAccountViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConversationListSubAccountViewModel conversationListSubAccountViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = conversationListSubAccountViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Result<? extends List<? extends OKConversation>> result, Continuation<? super Unit> continuation) {
            return invoke(result.m7386unboximpl(), continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(Result.m7376boximpl(obj), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Object objM7386unboximpl = ((Result) this.L$0).m7386unboximpl();
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    C56391yDq.AEQbTJ(objM7386unboximpl);
                    List<OKConversation> list = (List) objM7386unboximpl;
                    pUU.KWHzl("ConversationListSubAccountViewModel", "loadNotifications: " + list.size());
                    try {
                        MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
                        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                        for (OKConversation oKConversation : list) {
                            rXL rxlEZpvd = rXL.Companion.EZpvd(oKConversation.getTargetId());
                            nGF ngf = null;
                            if (rxlEZpvd != null) {
                                Context applicationContext = C32979mnm.EZpvd.OLrzqt().getApplicationContext();
                                Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                                if (rxlEZpvd.AhwBna()) {
                                    rxlEZpvd = null;
                                }
                                ngf = new nGF(applicationContext, oKConversation, rxlEZpvd);
                            }
                            Intrinsics.copydefault(ngf);
                            arrayList.add(ngf);
                        }
                        mutableStateFlow.setValue(arrayList);
                    } catch (Throwable th) {
                        pUU.copydefault("ConversationListSubAccountViewModel", "error: " + th);
                    }
                } else {
                    pUU.copydefault("ConversationListSubAccountViewModel", "loadNotifications: exception");
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
