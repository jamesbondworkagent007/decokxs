package com.okinc.okimcore.feature.message;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC56422yEu;
import o.C44486sRp;
import o.C44489sRs;
import o.C56379yDe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56540yJd;
import o.pUU;
import o.sJY;

/* JADX INFO: loaded from: classes10.dex */
public final class MessageDownloadScheduler$downloadRemainingMessages$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ long $minSeq;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ sJY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageDownloadScheduler$downloadRemainingMessages$1(sJY sjy, String str, long j, Continuation<? super MessageDownloadScheduler$downloadRemainingMessages$1> continuation) {
        super(2, continuation);
        this.this$0 = sjy;
        this.$channelId = str;
        this.$minSeq = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MessageDownloadScheduler$downloadRemainingMessages$1 messageDownloadScheduler$downloadRemainingMessages$1 = new MessageDownloadScheduler$downloadRemainingMessages$1(this.this$0, this.$channelId, this.$minSeq, continuation);
        messageDownloadScheduler$downloadRemainingMessages$1.L$0 = obj;
        return messageDownloadScheduler$downloadRemainingMessages$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageDownloadScheduler$downloadRemainingMessages$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:53:0x0106, B:55:0x010c, B:64:0x0127, B:61:0x0124, B:15:0x003d, B:33:0x00a7, B:34:0x00b7, B:36:0x00bd, B:38:0x00c8, B:47:0x00e9, B:49:0x00ef, B:41:0x00cf, B:42:0x00d3, B:44:0x00d9, B:50:0x00f3, B:52:0x00fa, B:18:0x0050, B:25:0x007e, B:27:0x0082, B:29:0x0089, B:21:0x0066, B:8:0x001f, B:59:0x0121, B:56:0x0112), top: B:72:0x000b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa A[Catch: all -> 0x0125, TryCatch #0 {all -> 0x0125, blocks: (B:53:0x0106, B:55:0x010c, B:64:0x0127, B:61:0x0124, B:15:0x003d, B:33:0x00a7, B:34:0x00b7, B:36:0x00bd, B:38:0x00c8, B:47:0x00e9, B:49:0x00ef, B:41:0x00cf, B:42:0x00d3, B:44:0x00d9, B:50:0x00f3, B:52:0x00fa, B:18:0x0050, B:25:0x007e, B:27:0x0082, B:29:0x0089, B:21:0x0066, B:8:0x001f, B:59:0x0121, B:56:0x0112), top: B:72:0x000b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010c A[Catch: all -> 0x0125, TRY_LEAVE, TryCatch #0 {all -> 0x0125, blocks: (B:53:0x0106, B:55:0x010c, B:64:0x0127, B:61:0x0124, B:15:0x003d, B:33:0x00a7, B:34:0x00b7, B:36:0x00bd, B:38:0x00c8, B:47:0x00e9, B:49:0x00ef, B:41:0x00cf, B:42:0x00d3, B:44:0x00d9, B:50:0x00f3, B:52:0x00fa, B:18:0x0050, B:25:0x007e, B:27:0x0082, B:29:0x0089, B:21:0x0066, B:8:0x001f, B:59:0x0121, B:56:0x0112), top: B:72:0x000b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0140  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x011e -> B:59:0x0121). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        Object objEZpvd;
        sJY sjy;
        String str;
        long j;
        Object objOLrzqt;
        String str2;
        sJY sjy2;
        long j2;
        ArrayList arrayList;
        Iterator<Long> it;
        Iterator it2;
        String str3;
        sJY sjy3;
        Long lKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sJY sjy4 = this.this$0;
            String str4 = this.$channelId;
            long j3 = this.$minSeq;
            Result.Application application2 = Result.Companion;
            C44489sRs c44489sRs = sjy4.values;
            this.L$0 = sjy4;
            this.L$1 = str4;
            this.J$0 = j3;
            this.label = 1;
            objEZpvd = c44489sRs.EZpvd(str4, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            sjy = sjy4;
            str = str4;
            j = j3;
        } else {
            if (i == 1) {
                long j4 = this.J$0;
                String str5 = (String) this.L$1;
                sJY sjy5 = (sJY) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objEZpvd = obj;
                str = str5;
                j = j4;
                sjy = sjy5;
            } else if (i == 2) {
                long j5 = this.J$1;
                long j6 = this.J$0;
                str2 = (String) this.L$1;
                sjy2 = (sJY) this.L$0;
                C56391yDq.AEQbTJ(obj);
                j = j6;
                j2 = j5;
                objOLrzqt = obj;
                List list = (List) objOLrzqt;
                C56540yJd c56540yJd = new C56540yJd(j, j2);
                arrayList = new ArrayList();
                it = c56540yJd.iterator();
                while (it.hasNext()) {
                    long jNextLong = ((AbstractC56422yEu) it).nextLong();
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            if (((InHouseIMMessageEntity) it3.next()).getSeq() == jNextLong) {
                                lKWHzl = null;
                                break;
                            }
                        }
                    }
                    lKWHzl = C56443yFo.KWHzl(jNextLong);
                    if (lKWHzl != null) {
                        arrayList.add(lKWHzl);
                    }
                }
                if (!arrayList.isEmpty()) {
                    it2 = CollectionsKt___CollectionsKt.valueOf((Iterable) arrayList, 50).iterator();
                    str3 = str2;
                    sjy3 = sjy2;
                    if (it2.hasNext()) {
                    }
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it2 = (Iterator) this.L$2;
                str3 = (String) this.L$1;
                sjy3 = (sJY) this.L$0;
                C56391yDq.AEQbTJ(obj);
                Object objCopydefault2 = obj;
                if (it2.hasNext()) {
                    List list2 = (List) it2.next();
                    this.L$0 = sjy3;
                    this.L$1 = str3;
                    this.L$2 = it2;
                    this.label = 3;
                    objCopydefault2 = sjy3.copydefault(str3, list2, this);
                    if (objCopydefault2 == objCopydefault) {
                        return objCopydefault;
                    }
                    if (it2.hasNext()) {
                    }
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            }
            String str6 = this.$channelId;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.KWHzl("MessageDownloadScheduler", "downloadRemainMessages: [" + str6 + "] failure:" + C56379yDe.AEQbTJ(thM7380exceptionOrNullimpl));
            }
            return Unit.INSTANCE;
        }
        Long l = (Long) objEZpvd;
        long jLongValue = l != null ? l.longValue() : 0L;
        C44486sRp c44486sRp = sjy.valueOf;
        this.L$0 = sjy;
        this.L$1 = str;
        this.J$0 = j;
        this.J$1 = jLongValue;
        this.label = 2;
        objOLrzqt = c44486sRp.OLrzqt(str, j, jLongValue, this);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        str2 = str;
        sjy2 = sjy;
        j2 = jLongValue;
        List list3 = (List) objOLrzqt;
        C56540yJd c56540yJd2 = new C56540yJd(j, j2);
        arrayList = new ArrayList();
        it = c56540yJd2.iterator();
        while (it.hasNext()) {
        }
        if (!arrayList.isEmpty()) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        String str62 = this.$channelId;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
