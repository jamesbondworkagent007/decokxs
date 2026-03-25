package com.okinc.okimcore.feature.message;

import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageWithReactions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import o.C44169sFw;
import o.C44484sRn;
import o.C44486sRp;
import o.C56379yDe;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.sDN;
import o.sJW;

/* JADX INFO: loaded from: classes10.dex */
public final class MessageHiddenScheduler$schedule$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ Set<String> $clientMessageIds;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ sJW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageHiddenScheduler$schedule$2(sJW sjw, String str, Set<String> set, Continuation<? super MessageHiddenScheduler$schedule$2> continuation) {
        super(2, continuation);
        this.this$0 = sjw;
        this.$channelId = str;
        this.$clientMessageIds = set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessageHiddenScheduler$schedule$2 messageHiddenScheduler$schedule$2 = new MessageHiddenScheduler$schedule$2(this.this$0, this.$channelId, this.$clientMessageIds, continuation);
        messageHiddenScheduler$schedule$2.L$0 = obj;
        return messageHiddenScheduler$schedule$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return ((MessageHiddenScheduler$schedule$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okimcore.feature.message.MessageHiddenScheduler$schedule$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $channelId;
        final /* synthetic */ Set<String> $clientMessageIds;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ sJW this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(sJW sjw, String str, Set<String> set, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = sjw;
            this.$channelId = str;
            this.$clientMessageIds = set;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$channelId, this.$clientMessageIds, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x00ee A[Catch: all -> 0x0134, TryCatch #0 {all -> 0x0134, blocks: (B:7:0x0016, B:43:0x012d, B:12:0x002f, B:38:0x00ea, B:40:0x00ee, B:15:0x003f, B:22:0x0070, B:23:0x007b, B:25:0x0081, B:27:0x0092, B:29:0x00a4, B:30:0x00a8, B:31:0x00b7, B:33:0x00bd, B:34:0x00cf, B:18:0x0050), top: B:52:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0147  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM7377constructorimpl;
            Throwable thM7380exceptionOrNullimpl;
            String str;
            sJW sjw;
            List list;
            sJW sjw2;
            String str2;
            InHouseIMConversationEntity inHouseIMConversationEntity;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                sJW sjw3 = this.this$0;
                str = this.$channelId;
                Set<String> set = this.$clientMessageIds;
                Result.Application application2 = Result.Companion;
                C44486sRp c44486sRp = sjw3.copydefault;
                String[] strArr = (String[]) set.toArray(new String[0]);
                this.L$0 = sjw3;
                this.L$1 = str;
                this.label = 1;
                Object objCopydefault2 = c44486sRp.copydefault(str, strArr, this);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                sjw = sjw3;
                obj = objCopydefault2;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                        String str3 = this.$channelId;
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl != null) {
                            pUU.KWHzl("MessageHiddenScheduler", "[" + str3 + "] failure:" + C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
                        }
                        return Unit.INSTANCE;
                    }
                    List list2 = (List) this.L$2;
                    String str4 = (String) this.L$1;
                    sJW sjw4 = (sJW) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    list = list2;
                    str2 = str4;
                    sjw2 = sjw4;
                    inHouseIMConversationEntity = (InHouseIMConversationEntity) obj;
                    if (inHouseIMConversationEntity != null) {
                        OKConversationType conversationType = C44169sFw.OLrzqt(inHouseIMConversationEntity).getConversationType();
                        pUU.KWHzl("MessageHiddenScheduler", "[" + str2 + "] conversationType=" + conversationType);
                        CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
                        MessageHiddenScheduler$schedule$2$1$1$1 messageHiddenScheduler$schedule$2$1$1$1 = new MessageHiddenScheduler$schedule$2$1$1$1(str2, list, sjw2, conversationType, null);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 3;
                        if (BuildersKt.withContext(coroutineDispatcherCopydefault, messageHiddenScheduler$schedule$2$1$1$1, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    String str32 = this.$channelId;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                str = (String) this.L$1;
                sjw = (sJW) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) obj) {
                InHouseIMMessageWithReactions inHouseIMMessageWithReactions = (InHouseIMMessageWithReactions) obj2;
                if (inHouseIMMessageWithReactions.getImMessageEntity().isVisible() == null || Intrinsics.EZpvd(inHouseIMMessageWithReactions.getImMessageEntity().isVisible(), C56443yFo.KWHzl(false))) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((InHouseIMMessageWithReactions) it.next()).getImMessageEntity().getMessageId());
            }
            List listQbewEr = CollectionsKt___CollectionsKt.QbewEr(arrayList2);
            C44484sRn c44484sRn = sjw.AEQbTJ;
            this.L$0 = sjw;
            this.L$1 = str;
            this.L$2 = listQbewEr;
            this.label = 2;
            Object objEZpvd = c44484sRn.EZpvd(str, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            list = listQbewEr;
            obj = objEZpvd;
            sjw2 = sjw;
            str2 = str;
            inHouseIMConversationEntity = (InHouseIMConversationEntity) obj;
            if (inHouseIMConversationEntity != null) {
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            String str322 = this.$channelId;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, this.this$0.KWHzl, null, new AnonymousClass1(this.this$0, this.$channelId, this.$clientMessageIds, null), 2, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
