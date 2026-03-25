package com.okinc.im.imui.messageV2.view;

import androidx.lifecycle.MutableLiveData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC35278nsM;
import o.AbstractC35281nsP;
import o.C36588odm;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class MessageListMainViewModel$observeBannerConfigFragments$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MessageListMainViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListMainViewModel$observeBannerConfigFragments$2(MessageListMainViewModel messageListMainViewModel, Continuation<? super MessageListMainViewModel$observeBannerConfigFragments$2> continuation) {
        super(2, continuation);
        this.this$0 = messageListMainViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageListMainViewModel$observeBannerConfigFragments$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListMainViewModel$observeBannerConfigFragments$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<AbstractC35278nsM<?>> flowOLrzqt = this.this$0.getPostValueLengthLimit.OLrzqt(this.this$0.RKDWNf);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
            this.label = 1;
            if (flowOLrzqt.collect(anonymousClass2, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.MessageListMainViewModel$observeBannerConfigFragments$2$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements FlowCollector {
        public final /* synthetic */ MessageListMainViewModel EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(MessageListMainViewModel messageListMainViewModel) {
            this.EZpvd = messageListMainViewModel;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(AbstractC35278nsM<?> abstractC35278nsM, Continuation<? super Unit> continuation) throws Throwable {
            MessageListMainViewModel$observeBannerConfigFragments$2$1$emit$1 messageListMainViewModel$observeBannerConfigFragments$2$1$emit$1;
            AbstractC35281nsP abstractC35281nsP;
            if (continuation instanceof MessageListMainViewModel$observeBannerConfigFragments$2$1$emit$1) {
                messageListMainViewModel$observeBannerConfigFragments$2$1$emit$1 = (MessageListMainViewModel$observeBannerConfigFragments$2$1$emit$1) continuation;
                int i = messageListMainViewModel$observeBannerConfigFragments$2$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    messageListMainViewModel$observeBannerConfigFragments$2$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    messageListMainViewModel$observeBannerConfigFragments$2$1$emit$1 = new MessageListMainViewModel$observeBannerConfigFragments$2$1$emit$1(this, continuation);
                }
            }
            Object obj = messageListMainViewModel$observeBannerConfigFragments$2$1$emit$1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = messageListMainViewModel$observeBannerConfigFragments$2$1$emit$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                abstractC35281nsP = abstractC35278nsM != null ? (AbstractC35281nsP) abstractC35278nsM.EZpvd((AbstractC35281nsP) this.EZpvd.DbNXlk.getValue()) : null;
                MutableLiveData mutableLiveData = this.EZpvd.DbNXlk;
                messageListMainViewModel$observeBannerConfigFragments$2$1$emit$1.L$0 = abstractC35278nsM;
                messageListMainViewModel$observeBannerConfigFragments$2$1$emit$1.L$1 = abstractC35281nsP;
                messageListMainViewModel$observeBannerConfigFragments$2$1$emit$1.label = 1;
                if (C36588odm.KWHzl(mutableLiveData, abstractC35281nsP, messageListMainViewModel$observeBannerConfigFragments$2$1$emit$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC35281nsP abstractC35281nsP2 = (AbstractC35281nsP) messageListMainViewModel$observeBannerConfigFragments$2$1$emit$1.L$1;
                AbstractC35278nsM<?> abstractC35278nsM2 = (AbstractC35278nsM) messageListMainViewModel$observeBannerConfigFragments$2$1$emit$1.L$0;
                C56391yDq.AEQbTJ(obj);
                abstractC35281nsP = abstractC35281nsP2;
                abstractC35278nsM = abstractC35278nsM2;
            }
            if (abstractC35278nsM != null) {
                abstractC35278nsM.copydefault(abstractC35281nsP);
            }
            return Unit.INSTANCE;
        }
    }
}
