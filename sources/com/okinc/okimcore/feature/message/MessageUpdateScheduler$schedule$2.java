package com.okinc.okimcore.feature.message;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageWithReactions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import o.C44169sFw;
import o.C44486sRp;
import o.C56379yDe;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.sDN;
import o.sJZ;

/* JADX INFO: loaded from: classes10.dex */
public final class MessageUpdateScheduler$schedule$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ Set<String> $clientMessageIds;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ sJZ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageUpdateScheduler$schedule$2(sJZ sjz, String str, Set<String> set, Continuation<? super MessageUpdateScheduler$schedule$2> continuation) {
        super(2, continuation);
        this.this$0 = sjz;
        this.$channelId = str;
        this.$clientMessageIds = set;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessageUpdateScheduler$schedule$2 messageUpdateScheduler$schedule$2 = new MessageUpdateScheduler$schedule$2(this.this$0, this.$channelId, this.$clientMessageIds, continuation);
        messageUpdateScheduler$schedule$2.L$0 = obj;
        return messageUpdateScheduler$schedule$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return ((MessageUpdateScheduler$schedule$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okimcore.feature.message.MessageUpdateScheduler$schedule$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $channelId;
        final /* synthetic */ Set<String> $clientMessageIds;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ sJZ this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Set<String> set, sJZ sjz, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$channelId = str;
            this.$clientMessageIds = set;
            this.this$0 = sjz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$channelId, this.$clientMessageIds, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0114  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM7377constructorimpl;
            Throwable thM7380exceptionOrNullimpl;
            String str;
            sJZ sjz;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                String str2 = this.$channelId;
                Set<String> set = this.$clientMessageIds;
                sJZ sjz2 = this.this$0;
                Result.Application application2 = Result.Companion;
                pUU.KWHzl("MessageUpdateScheduler", "[" + str2 + "] messageIds: " + set);
                C44486sRp c44486sRp = sjz2.KWHzl;
                String[] strArr = (String[]) set.toArray(new String[0]);
                this.L$0 = str2;
                this.L$1 = sjz2;
                this.label = 1;
                Object objCopydefault2 = c44486sRp.copydefault(str2, strArr, this);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                str = str2;
                obj = objCopydefault2;
                sjz = sjz2;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    String str3 = this.$channelId;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        pUU.KWHzl("MessageUpdateScheduler", "[" + str3 + "] failure:" + C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
                    }
                    return Unit.INSTANCE;
                }
                sjz = (sJZ) this.L$1;
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                OKMessage oKMessageOLrzqt = C44169sFw.OLrzqt((InHouseIMMessageWithReactions) it.next());
                if (oKMessageOLrzqt != null) {
                    arrayList.add(oKMessageOLrzqt);
                }
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C56443yFo.KWHzl(((OKMessage) it2.next()).getSeq()));
            }
            pUU.KWHzl("MessageUpdateScheduler", "[" + str + "] messages from database: " + size + ", notify seq list=" + arrayList2);
            CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
            MessageUpdateScheduler$schedule$2$1$1$2 messageUpdateScheduler$schedule$2$1$1$2 = new MessageUpdateScheduler$schedule$2$1$1$2(arrayList, str, sjz, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (BuildersKt.withContext(coroutineDispatcherCopydefault, messageUpdateScheduler$schedule$2$1$1$2, this) == objCopydefault) {
                return objCopydefault;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            String str32 = this.$channelId;
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
            return BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, this.this$0.EZpvd, null, new AnonymousClass1(this.$channelId, this.$clientMessageIds, this.this$0, null), 2, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
