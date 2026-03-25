package com.okinc.okimcore.feature.message.manager;

import com.okinc.okimcore.model.im.ConversationSyncStatus;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationSimpleInfoEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.SharedFlow;
import o.C33129mqd;
import o.C44124sEe;
import o.C44302sKu;
import o.C44489sRs;
import o.C56379yDe;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.sGI;
import o.sMR;
import o.sNJ;
import o.sRX;

/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMWebSocketSyncManagerImpl$syncConversations$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    long J$1;
    long J$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ C44302sKu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InHouseIMWebSocketSyncManagerImpl$syncConversations$1(C44302sKu c44302sKu, Continuation<? super InHouseIMWebSocketSyncManagerImpl$syncConversations$1> continuation) {
        super(2, continuation);
        this.this$0 = c44302sKu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InHouseIMWebSocketSyncManagerImpl$syncConversations$1 inHouseIMWebSocketSyncManagerImpl$syncConversations$1 = new InHouseIMWebSocketSyncManagerImpl$syncConversations$1(this.this$0, continuation);
        inHouseIMWebSocketSyncManagerImpl$syncConversations$1.L$0 = obj;
        return inHouseIMWebSocketSyncManagerImpl$syncConversations$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InHouseIMWebSocketSyncManagerImpl$syncConversations$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Duplicate block (B:57:0x0266) to fix multi-entry loop: BACK_EDGE: B:57:0x0266 -> B:58:0x0273 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v48, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v50, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX WARN: Can't wrap try/catch for region: R(14:121|31|115|32|33|123|34|35|119|36|37|111|38|39) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:30|121|31|115|32|33|123|34|35|119|36|37|111|38|39|(1:41)(10:42|113|43|44|58|(0)(0)|62|(0)|65|(9:70|107|71|(2:74|72)|132|77|109|78|(1:80)(12:81|82|(0)(0)|86|(0)(0)|90|98|(0)(0)|102|(0)|105|106))(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0242, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0243, code lost:
    
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0246, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0247, code lost:
    
        r22 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x024a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x024b, code lost:
    
        r22 = r3;
        r20 = r11;
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0251, code lost:
    
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0254, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0255, code lost:
    
        r22 = r3;
        r20 = r11;
        r3 = r19;
        r10 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x025e, code lost:
    
        r23 = r10;
        r24 = r11;
        r11 = r20;
        r10 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0266, code lost:
    
        r6 = kotlin.Result.Companion;
        r0 = kotlin.Result.m7377constructorimpl(o.C56391yDq.EZpvd(r0));
        r20 = r11;
        r11 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0279 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02b2 A[Catch: all -> 0x02d5, TRY_LEAVE, TryCatch #5 {all -> 0x02d5, blocks: (B:58:0x0273, B:60:0x0279, B:62:0x02ac, B:64:0x02b2, B:57:0x0266), top: B:117:0x0279 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03a4 A[Catch: all -> 0x00be, TryCatch #11 {all -> 0x00be, blocks: (B:8:0x0031, B:82:0x0347, B:84:0x03a4, B:86:0x03b9, B:88:0x03bf, B:90:0x03d4, B:18:0x00b7, B:27:0x0132), top: B:129:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03bf A[Catch: all -> 0x00be, TryCatch #11 {all -> 0x00be, blocks: (B:8:0x0031, B:82:0x0347, B:84:0x03a4, B:86:0x03b9, B:88:0x03bf, B:90:0x03d4, B:18:0x00b7, B:27:0x0132), top: B:129:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03d2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0203 -> B:113:0x0218). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Job job;
        Ref.ObjectRef objectRef;
        Job job2;
        Object objM7377constructorimpl;
        Job job3;
        Ref.ObjectRef objectRef2;
        Job job4;
        Throwable thM7380exceptionOrNullimpl;
        CancellationException cancellationException;
        sMR.Activity activity;
        CoroutineScope coroutineScope;
        Job jobComponent2;
        Job jobLaunch$default;
        C44302sKu c44302sKu;
        Object objOLrzqt;
        Job job5;
        Ref.ObjectRef objectRef3;
        Job job6;
        long j;
        List list;
        long jCurrentTimeMillis;
        int i;
        long j2;
        String str;
        int i2;
        int size;
        CoroutineScope coroutineScope2;
        CoroutineScope coroutineScope3;
        long j3;
        Job job7;
        Ref.ObjectRef objectRef4;
        Job job8;
        Object obj2;
        List<InHouseIMConversationSimpleInfoEntity> listSubList;
        Throwable th;
        Object objM7377constructorimpl2;
        Job job9;
        long jCurrentTimeMillis2;
        long jCurrentTimeMillis3;
        Set<String> setOqFWZa;
        List list2;
        long j4;
        long j5;
        C44302sKu c44302sKu2;
        long j6;
        String str2;
        Job job10;
        long j7;
        long jCurrentTimeMillis4;
        List list3;
        Throwable thM7380exceptionOrNullimpl2;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = this.label;
        String str3 = ", size=";
        try {
        } catch (Throwable th2) {
            th = th2;
            job = job4;
            objectRef = objectRef2;
            job2 = job3;
        }
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            Pair<SharedFlow<sMR.Activity>, Job> pairKWHzl = sMR.EZpvd.KWHzl("SyncConversations", coroutineScope);
            SharedFlow<sMR.Activity> sharedFlowComponent1 = pairKWHzl.component1();
            jobComponent2 = pairKWHzl.component2();
            objectRef = new Ref.ObjectRef();
            jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new InHouseIMWebSocketSyncManagerImpl$syncConversations$1$memoryCollectorJob$1(sharedFlowComponent1, objectRef, null), 3, null);
            C44124sEe.imLogSync$default("sync conversations => on start", null, null, 6, null);
            this.this$0.OLrzqt.tryEmit(new sNJ(null, ConversationSyncStatus.Syncing, 1, null));
            c44302sKu = this.this$0;
            try {
                Result.Application application = Result.Companion;
                C44124sEe.imLogSync$default("sync conversations => fetching channelIds", null, null, 6, null);
                long jCurrentTimeMillis5 = System.currentTimeMillis();
                sGI sgi = c44302sKu.djBIcL;
                C44489sRs c44489sRsHDKMBd = c44302sKu.hDKMBd();
                this.L$0 = jobComponent2;
                this.L$1 = objectRef;
                this.L$2 = jobLaunch$default;
                this.L$3 = c44302sKu;
                this.L$4 = coroutineScope;
                this.J$0 = jCurrentTimeMillis5;
                this.label = 1;
                objOLrzqt = sgi.OLrzqt(c44489sRsHDKMBd, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                job5 = jobLaunch$default;
                objectRef3 = objectRef;
                job6 = jobComponent2;
                j = jCurrentTimeMillis5;
            } catch (Throwable th3) {
                th = th3;
                job = jobComponent2;
                job2 = jobLaunch$default;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                job3 = job2;
                objectRef2 = objectRef;
                job4 = job;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                Job.DefaultImpls.cancel$default(job3, cancellationException, 1, (Object) cancellationException);
                Job.DefaultImpls.cancel$default(job4, cancellationException, 1, (Object) cancellationException);
                activity = (sMR.Activity) objectRef2.element;
                if (activity != null) {
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j5 = this.J$2;
                    long j8 = this.J$1;
                    long j9 = this.J$0;
                    list2 = (List) this.L$4;
                    c44302sKu2 = (C44302sKu) this.L$3;
                    job3 = (Job) this.L$2;
                    objectRef2 = (Ref.ObjectRef) this.L$1;
                    job4 = (Job) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    j4 = j8;
                    j6 = j9;
                    long jCurrentTimeMillis6 = System.currentTimeMillis() - j5;
                    C44124sEe.imLogSync$default("sync conversations => process latest call message timeMs:" + jCurrentTimeMillis6, null, null, 6, null);
                    long j10 = j6 + j4 + jCurrentTimeMillis6;
                    C44124sEe.imLogSync$default("sync conversations => total timeMs:" + j10 + str3 + list2.size(), null, null, 6, null);
                    c44302sKu2.OLrzqt.tryEmit(new sNJ(C56443yFo.KWHzl(j10), ConversationSyncStatus.Synced));
                    sRX srx = sRX.OLrzqt;
                    int size2 = list2.size();
                    sMR.Activity activity2 = (sMR.Activity) objectRef2.element;
                    Integer numAEQbTJ = activity2 == null ? C56443yFo.AEQbTJ(C33129mqd.AhwBna(C56443yFo.AEQbTJ(activity2.KWHzl()))) : null;
                    sMR.Activity activity3 = (sMR.Activity) objectRef2.element;
                    srx.KWHzl(size2, j10, j6, j4, jCurrentTimeMillis6, numAEQbTJ, activity3 == null ? C56443yFo.AEQbTJ(C33129mqd.AhwBna(C56443yFo.AEQbTJ(activity3.EZpvd()))) : null);
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        cancellationException = null;
                        C44124sEe.imLogSync$default("sync conversations => failed to sync conversations: " + C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl), null, null, 6, null);
                        sRX.OLrzqt.EZpvd(C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
                    } else {
                        cancellationException = null;
                    }
                    Job.DefaultImpls.cancel$default(job3, cancellationException, 1, (Object) cancellationException);
                    Job.DefaultImpls.cancel$default(job4, cancellationException, 1, (Object) cancellationException);
                    activity = (sMR.Activity) objectRef2.element;
                    if (activity != null) {
                        C44124sEe.imLogSync$default("[IMMemory tracking] Final memory summary, peak memory usage: " + activity.KWHzl() + ", avgMemoryUsage: " + activity.EZpvd(), null, null, 6, null);
                    }
                    return Unit.INSTANCE;
                }
                long j11 = this.J$2;
                int i4 = this.I$2;
                int i5 = this.I$1;
                int i6 = this.I$0;
                long j12 = this.J$1;
                long j13 = this.J$0;
                List<InHouseIMConversationSimpleInfoEntity> list4 = (List) this.L$6;
                List list5 = (List) this.L$5;
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$4;
                C44302sKu c44302sKu3 = (C44302sKu) this.L$3;
                Job job11 = (Job) this.L$2;
                Ref.ObjectRef objectRef5 = (Ref.ObjectRef) this.L$1;
                Job job12 = (Job) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    job8 = job11;
                    objectRef4 = objectRef5;
                    job7 = job12;
                    j3 = j13;
                    list = list5;
                    coroutineScope3 = coroutineScope4;
                    obj2 = objCopydefault;
                    listSubList = list4;
                } catch (Throwable th4) {
                    th = th4;
                    job8 = job11;
                    objectRef4 = objectRef5;
                    job7 = job12;
                    j3 = j13;
                    list = list5;
                    coroutineScope3 = coroutineScope4;
                    obj2 = objCopydefault;
                    listSubList = list4;
                    job = job7;
                    str = str3;
                    i2 = i6;
                    jCurrentTimeMillis = j12;
                    c44302sKu = c44302sKu3;
                    job2 = job8;
                    objectRef = objectRef4;
                    int i7 = i4;
                    size = i5;
                    long j14 = j3;
                    Result.Application application3 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    j3 = j14;
                    i4 = i7;
                    if (Result.m7384isSuccessimpl(objM7377constructorimpl2)) {
                    }
                    thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                    if (thM7380exceptionOrNullimpl2 != null) {
                    }
                    i = i4 + 1;
                    list = list3;
                    objCopydefault = obj2;
                    j2 = j3;
                    coroutineScope2 = coroutineScope3;
                    if (i < size) {
                    }
                    job = job9;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    job3 = job2;
                    objectRef2 = objectRef;
                    job4 = job;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    Job.DefaultImpls.cancel$default(job3, cancellationException, 1, (Object) cancellationException);
                    Job.DefaultImpls.cancel$default(job4, cancellationException, 1, (Object) cancellationException);
                    activity = (sMR.Activity) objectRef2.element;
                    if (activity != null) {
                    }
                    return Unit.INSTANCE;
                }
                try {
                } catch (Throwable th5) {
                    th = th5;
                    job = job7;
                    str = str3;
                    i2 = i6;
                    jCurrentTimeMillis = j12;
                    c44302sKu = c44302sKu3;
                    job2 = job8;
                    objectRef = objectRef4;
                    int i72 = i4;
                    size = i5;
                    long j142 = j3;
                    Result.Application application32 = Result.Companion;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    j3 = j142;
                    i4 = i72;
                    if (Result.m7384isSuccessimpl(objM7377constructorimpl2)) {
                    }
                    thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                    if (thM7380exceptionOrNullimpl2 != null) {
                    }
                    i = i4 + 1;
                    list = list3;
                    objCopydefault = obj2;
                    j2 = j3;
                    coroutineScope2 = coroutineScope3;
                    if (i < size) {
                    }
                    job = job9;
                    Result.Application application222 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    job3 = job2;
                    objectRef2 = objectRef;
                    job4 = job;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    Job.DefaultImpls.cancel$default(job3, cancellationException, 1, (Object) cancellationException);
                    Job.DefaultImpls.cancel$default(job4, cancellationException, 1, (Object) cancellationException);
                    activity = (sMR.Activity) objectRef2.element;
                    if (activity != null) {
                    }
                    return Unit.INSTANCE;
                }
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56443yFo.KWHzl(System.currentTimeMillis() - j11));
                job = job7;
                str = str3;
                i2 = i6;
                jCurrentTimeMillis = j12;
                c44302sKu = c44302sKu3;
                job2 = job8;
                objectRef = objectRef4;
                size = i5;
                if (Result.m7384isSuccessimpl(objM7377constructorimpl2)) {
                    list3 = list;
                } else {
                    try {
                        long jLongValue = ((Number) objM7377constructorimpl2).longValue();
                        list3 = list;
                        C44124sEe.imLogSync$default("sync conversations batch completed, batch:" + i4 + ", time:" + jLongValue, null, null, 6, null);
                        sRX.OLrzqt.OLrzqt(listSubList.size(), jLongValue);
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                if (thM7380exceptionOrNullimpl2 != null) {
                    C44124sEe.imLogSync$default("sync conversations batch failed, batch:" + i4, thM7380exceptionOrNullimpl2, null, 4, null);
                }
                i = i4 + 1;
                list = list3;
                objCopydefault = obj2;
                j2 = j3;
                coroutineScope2 = coroutineScope3;
                if (i < size) {
                    int i8 = i * i2;
                    try {
                        int iMin = Math.min(i8 + i2, list.size());
                        StringBuilder sb = new StringBuilder();
                        str2 = str;
                        sb.append("sync conversations batch:");
                        sb.append(i + 1);
                        sb.append("/");
                        sb.append(size);
                        sb.append(", startIndex:");
                        sb.append(i8);
                        sb.append(", endIndex:");
                        sb.append(iMin);
                        Object obj3 = objCopydefault;
                        C44124sEe.imLogSync$default(sb.toString(), null, null, 6, null);
                        listSubList = list.subList(i8, iMin);
                        Result.Application application4 = Result.Companion;
                        jCurrentTimeMillis4 = System.currentTimeMillis();
                        job10 = job;
                        this.L$0 = job10;
                        this.L$1 = objectRef;
                        this.L$2 = job2;
                        this.L$3 = c44302sKu;
                        this.L$4 = coroutineScope2;
                        this.L$5 = list;
                        this.L$6 = listSubList;
                        this.J$0 = j2;
                        j3 = j2;
                        j7 = jCurrentTimeMillis;
                        this.J$1 = j7;
                        this.I$0 = i2;
                        this.I$1 = size;
                        this.I$2 = i;
                        this.J$2 = jCurrentTimeMillis4;
                        coroutineScope3 = coroutineScope2;
                        this.label = 2;
                        obj2 = obj3;
                    } catch (Throwable th7) {
                        th = th7;
                        job9 = job;
                    }
                    if (c44302sKu.KWHzl(listSubList, this) == obj2) {
                        return obj2;
                    }
                    c44302sKu3 = c44302sKu;
                    int i9 = i2;
                    str3 = str2;
                    i5 = size;
                    i4 = i;
                    job8 = job2;
                    i6 = i9;
                    job7 = job10;
                    j11 = jCurrentTimeMillis4;
                    objectRef4 = objectRef;
                    j12 = j7;
                    objM7377constructorimpl2 = Result.m7377constructorimpl(C56443yFo.KWHzl(System.currentTimeMillis() - j11));
                    job = job7;
                    str = str3;
                    i2 = i6;
                    jCurrentTimeMillis = j12;
                    c44302sKu = c44302sKu3;
                    job2 = job8;
                    objectRef = objectRef4;
                    size = i5;
                    if (Result.m7384isSuccessimpl(objM7377constructorimpl2)) {
                    }
                    thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
                    if (thM7380exceptionOrNullimpl2 != null) {
                    }
                    i = i4 + 1;
                    list = list3;
                    objCopydefault = obj2;
                    j2 = j3;
                    coroutineScope2 = coroutineScope3;
                    if (i < size) {
                        Object obj4 = objCopydefault;
                        String str4 = str;
                        long j15 = j2;
                        job9 = job;
                        try {
                            jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                            jCurrentTimeMillis3 = System.currentTimeMillis();
                            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((InHouseIMConversationSimpleInfoEntity) it.next()).getChannelId());
                            }
                            setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
                            this.L$0 = job9;
                            this.L$1 = objectRef;
                            try {
                                this.L$2 = job2;
                                this.L$3 = c44302sKu;
                                this.L$4 = list;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.J$0 = j15;
                                this.J$1 = jCurrentTimeMillis2;
                                this.J$2 = jCurrentTimeMillis3;
                                this.label = 3;
                            } catch (Throwable th8) {
                                th = th8;
                                jobComponent2 = job9;
                                jobLaunch$default = job2;
                                job = jobComponent2;
                                job2 = jobLaunch$default;
                                Result.Application application2222 = Result.Companion;
                                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                                job3 = job2;
                                objectRef2 = objectRef;
                                job4 = job;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            job = job9;
                            Result.Application application22222 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                            job3 = job2;
                            objectRef2 = objectRef;
                            job4 = job;
                        }
                        if (c44302sKu.EZpvd(setOqFWZa, this) == obj4) {
                            return obj4;
                        }
                        list2 = list;
                        j4 = jCurrentTimeMillis2;
                        j5 = jCurrentTimeMillis3;
                        c44302sKu2 = c44302sKu;
                        j6 = j15;
                        job3 = job2;
                        objectRef2 = objectRef;
                        str3 = str4;
                        job4 = job9;
                        long jCurrentTimeMillis62 = System.currentTimeMillis() - j5;
                        C44124sEe.imLogSync$default("sync conversations => process latest call message timeMs:" + jCurrentTimeMillis62, null, null, 6, null);
                        long j102 = j6 + j4 + jCurrentTimeMillis62;
                        C44124sEe.imLogSync$default("sync conversations => total timeMs:" + j102 + str3 + list2.size(), null, null, 6, null);
                        c44302sKu2.OLrzqt.tryEmit(new sNJ(C56443yFo.KWHzl(j102), ConversationSyncStatus.Synced));
                        sRX srx2 = sRX.OLrzqt;
                        int size22 = list2.size();
                        sMR.Activity activity22 = (sMR.Activity) objectRef2.element;
                        if (activity22 == null) {
                        }
                        sMR.Activity activity32 = (sMR.Activity) objectRef2.element;
                        srx2.KWHzl(size22, j102, j6, j4, jCurrentTimeMillis62, numAEQbTJ, activity32 == null ? C56443yFo.AEQbTJ(C33129mqd.AhwBna(C56443yFo.AEQbTJ(activity32.EZpvd()))) : null);
                        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl != null) {
                        }
                        Job.DefaultImpls.cancel$default(job3, cancellationException, 1, (Object) cancellationException);
                        Job.DefaultImpls.cancel$default(job4, cancellationException, 1, (Object) cancellationException);
                        activity = (sMR.Activity) objectRef2.element;
                        if (activity != null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                job = job9;
                Result.Application application222222 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                job3 = job2;
                objectRef2 = objectRef;
                job4 = job;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                Job.DefaultImpls.cancel$default(job3, cancellationException, 1, (Object) cancellationException);
                Job.DefaultImpls.cancel$default(job4, cancellationException, 1, (Object) cancellationException);
                activity = (sMR.Activity) objectRef2.element;
                if (activity != null) {
                }
                return Unit.INSTANCE;
            }
            j = this.J$0;
            coroutineScope = (CoroutineScope) this.L$4;
            c44302sKu = (C44302sKu) this.L$3;
            job5 = (Job) this.L$2;
            objectRef3 = (Ref.ObjectRef) this.L$1;
            job6 = (Job) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
        }
        Pair pairOLrzqt = C56390yDp.OLrzqt((List) objOLrzqt, C56443yFo.KWHzl(System.currentTimeMillis() - j));
        list = (List) pairOLrzqt.component1();
        long jLongValue2 = ((Number) pairOLrzqt.component2()).longValue();
        C44124sEe.imLogSync$default("sync conversations => fetching channelIds timeMs:" + jLongValue2 + ", size=" + list.size(), null, null, 6, null);
        job = job6;
        jCurrentTimeMillis = System.currentTimeMillis();
        objectRef = objectRef3;
        job2 = job5;
        i = 0;
        j2 = jLongValue2;
        str = ", size=";
        i2 = 200;
        size = (list.size() + 199) / 200;
        coroutineScope2 = coroutineScope;
        if (i < size) {
        }
        job = job9;
        Result.Application application2222222 = Result.Companion;
        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        job3 = job2;
        objectRef2 = objectRef;
        job4 = job;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        Job.DefaultImpls.cancel$default(job3, cancellationException, 1, (Object) cancellationException);
        Job.DefaultImpls.cancel$default(job4, cancellationException, 1, (Object) cancellationException);
        activity = (sMR.Activity) objectRef2.element;
        if (activity != null) {
        }
        return Unit.INSTANCE;
    }
}
