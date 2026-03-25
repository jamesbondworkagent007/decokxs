package com.okinc.im.imui.broadcastmessages.messagelist;

import com.okinc.im.imui.broadcastmessages.messagelist.viewproviders.BroadcastHitMaxSendMessageLimitSystemMessage;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C35254nrp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oGH;
import o.yDY;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class BroadcastMessageListFragmentViewModel$actualMessageList$1 extends SuspendLambda implements yHO<C35254nrp, List<? extends C35254nrp>, Continuation<? super List<C35254nrp>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ BroadcastMessageListFragmentViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessageListFragmentViewModel$actualMessageList$1(BroadcastMessageListFragmentViewModel broadcastMessageListFragmentViewModel, Continuation<? super BroadcastMessageListFragmentViewModel$actualMessageList$1> continuation) {
        super(3, continuation);
        this.this$0 = broadcastMessageListFragmentViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(C35254nrp c35254nrp, List<? extends C35254nrp> list, Continuation<? super List<C35254nrp>> continuation) {
        return invoke2(c35254nrp, (List<C35254nrp>) list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C35254nrp c35254nrp, List<C35254nrp> list, Continuation<? super List<C35254nrp>> continuation) {
        BroadcastMessageListFragmentViewModel$actualMessageList$1 broadcastMessageListFragmentViewModel$actualMessageList$1 = new BroadcastMessageListFragmentViewModel$actualMessageList$1(this.this$0, continuation);
        broadcastMessageListFragmentViewModel$actualMessageList$1.L$0 = c35254nrp;
        broadcastMessageListFragmentViewModel$actualMessageList$1.L$1 = list;
        return broadcastMessageListFragmentViewModel$actualMessageList$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.broadcastmessages.messagelist.BroadcastMessageListFragmentViewModel$actualMessageList$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<C35254nrp>>, Object> {
        final /* synthetic */ List<C35254nrp> $messageList;
        final /* synthetic */ C35254nrp $welcomeMessage;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ BroadcastMessageListFragmentViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C35254nrp c35254nrp, List<C35254nrp> list, BroadcastMessageListFragmentViewModel broadcastMessageListFragmentViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$welcomeMessage = c35254nrp;
            this.$messageList = list;
            this.this$0 = broadcastMessageListFragmentViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$welcomeMessage, this.$messageList, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<C35254nrp>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List arrayList;
            Object objEZpvd;
            List list;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                arrayList = new ArrayList();
                C35254nrp c35254nrp = this.$welcomeMessage;
                List<C35254nrp> list2 = this.$messageList;
                BroadcastMessageListFragmentViewModel broadcastMessageListFragmentViewModel = this.this$0;
                if (c35254nrp != null) {
                    C56443yFo.KWHzl(arrayList.add(c35254nrp));
                }
                arrayList.addAll(list2);
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return arrayList;
                }
                Iterator<T> it = list2.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (((C35254nrp) it.next()).OLrzqt().getSentStatus() == OKMessage.SentStatus.SENT && (i2 = i2 + 1) < 0) {
                        yDY.djBIcL();
                    }
                }
                if (i2 < 20) {
                    return arrayList;
                }
                oGH ogh = broadcastMessageListFragmentViewModel.djBIcL;
                OKMessage oKMessageAEQbTJ = OKMessage.Companion.AEQbTJ("", OKConversationType.BROADCAST, new BroadcastHitMaxSendMessageLimitSystemMessage());
                oKMessageAEQbTJ.setSenderUserId(broadcastMessageListFragmentViewModel.valueOf.AEQbTJ());
                oKMessageAEQbTJ.setSentTime(System.currentTimeMillis());
                this.L$0 = arrayList;
                this.L$1 = arrayList;
                this.label = 1;
                objEZpvd = ogh.EZpvd(oKMessageAEQbTJ, (256 & 2) != 0 ? yDY.AhwBna() : null, (256 & 4) != 0 ? null : null, (256 & 8) != 0 ? null : null, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? null : null, (256 & 64) != 0 ? null : null, (256 & 128) != 0 ? 0 : null, (256 & 256) != 0 ? null : null, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                list = arrayList;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list3 = (List) this.L$1;
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                arrayList = list3;
                objEZpvd = obj;
            }
            arrayList.add(objEZpvd);
            return list;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C35254nrp c35254nrp = (C35254nrp) this.L$0;
            List list = (List) this.L$1;
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c35254nrp, list, this.this$0, null);
            this.L$0 = null;
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
