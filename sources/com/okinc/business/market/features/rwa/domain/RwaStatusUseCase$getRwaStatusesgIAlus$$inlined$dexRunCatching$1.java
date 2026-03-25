package com.okinc.business.market.features.rwa.domain;

import com.okinc.business.market.data.model.TagMetaData;
import com.okinc.business.market.features.overview.domain.RwaTradingStatus;
import com.okinc.business.market.features.tag.domain.TagMeta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C28989klF;
import o.C29162koT;
import o.C29715kyq;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC29159koQ;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.rwa.domain.RwaStatusUseCase$getRwaStatuses-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class RwaStatusUseCase$getRwaStatusesgIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends RwaTradingStatus>>>, Object> {
    final /* synthetic */ String $rwaPlatformId$inlined;
    int label;
    final /* synthetic */ C29162koT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RwaStatusUseCase$getRwaStatusesgIAlus$$inlined$dexRunCatching$1(Continuation continuation, C29162koT c29162koT, String str) {
        super(2, continuation);
        this.this$0 = c29162koT;
        this.$rwaPlatformId$inlined = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RwaStatusUseCase$getRwaStatusesgIAlus$$inlined$dexRunCatching$1(continuation, this.this$0, this.$rwaPlatformId$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends RwaTradingStatus>>> continuation) {
        return ((RwaStatusUseCase$getRwaStatusesgIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090 A[Catch: all -> 0x00a3, CancellationException -> 0x00ba, LOOP:0: B:24:0x008a->B:26:0x0090, LOOP_END, TryCatch #2 {CancellationException -> 0x00ba, all -> 0x00a3, blocks: (B:6:0x0010, B:23:0x0078, B:24:0x008a, B:26:0x0090, B:27:0x009e, B:10:0x0022, B:16:0x003c, B:17:0x0051, B:19:0x0057, B:20:0x0065, B:13:0x0029), top: B:35:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objM8678batchGet0E7RQCE$default;
        Iterator it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            InterfaceC29159koQ interfaceC29159koQ = this.this$0.AEQbTJ;
            String str = this.$rwaPlatformId$inlined;
            this.label = 1;
            obj = interfaceC29159koQ.KWHzl(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM8678batchGet0E7RQCE$default = ((Result) obj).m7386unboximpl();
                C56391yDq.AEQbTJ(objM8678batchGet0E7RQCE$default);
                Iterable iterable = (Iterable) objM8678batchGet0E7RQCE$default;
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(C28989klF.KWHzl((TagMeta) it.next()));
                }
                objM7377constructorimpl = Result.m7377constructorimpl(arrayList);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
        }
        Iterable iterable2 = (Iterable) ((AbstractC43419rot) obj).AEQbTJ();
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(iterable2, 10));
        Iterator it2 = iterable2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((TagMetaData) it2.next()).AkhnZx());
        }
        C29715kyq c29715kyq = this.this$0.copydefault;
        this.label = 2;
        objM8678batchGet0E7RQCE$default = C29715kyq.m8678batchGet0E7RQCE$default(c29715kyq, arrayList2, false, this, 2, null);
        if (objM8678batchGet0E7RQCE$default == objCopydefault) {
            return objCopydefault;
        }
        C56391yDq.AEQbTJ(objM8678batchGet0E7RQCE$default);
        Iterable iterable3 = (Iterable) objM8678batchGet0E7RQCE$default;
        ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(iterable3, 10));
        it = iterable3.iterator();
        while (it.hasNext()) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(arrayList3);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
