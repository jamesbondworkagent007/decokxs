package com.okinc.business.market.features.tag.domain;

import com.okinc.business.market.data.model.TagMetaData;
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
import o.C29710kyl;
import o.C29715kyq;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.tag.domain.GetTagMetaUseCase$batchGet-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetTagMetaUseCase$batchGet0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends TagMeta>>>, Object> {
    final /* synthetic */ List $keys$inlined;
    final /* synthetic */ boolean $refreshCache$inlined;
    int label;
    final /* synthetic */ C29715kyq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTagMetaUseCase$batchGet0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, C29715kyq c29715kyq, boolean z, List list) {
        super(2, continuation);
        this.this$0 = c29715kyq;
        this.$refreshCache$inlined = z;
        this.$keys$inlined = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetTagMetaUseCase$batchGet0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$refreshCache$inlined, this.$keys$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends TagMeta>>> continuation) {
        return ((GetTagMetaUseCase$batchGet0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092 A[Catch: all -> 0x00c7, CancellationException -> 0x00de, TryCatch #2 {CancellationException -> 0x00de, all -> 0x00c7, blocks: (B:7:0x0011, B:35:0x008b, B:39:0x0096, B:40:0x00a7, B:42:0x00ad, B:44:0x00c2, B:38:0x0092, B:11:0x0024, B:32:0x007a, B:12:0x002d, B:18:0x004b, B:22:0x0056, B:24:0x005e, B:26:0x0062, B:27:0x0067, B:29:0x006b, B:21:0x0052, B:15:0x003a), top: B:52:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad A[Catch: all -> 0x00c7, CancellationException -> 0x00de, LOOP:0: B:40:0x00a7->B:42:0x00ad, LOOP_END, TryCatch #2 {CancellationException -> 0x00de, all -> 0x00c7, blocks: (B:7:0x0011, B:35:0x008b, B:39:0x0096, B:40:0x00a7, B:42:0x00ad, B:44:0x00c2, B:38:0x0092, B:11:0x0024, B:32:0x007a, B:12:0x002d, B:18:0x004b, B:22:0x0056, B:24:0x005e, B:26:0x0062, B:27:0x0067, B:29:0x006b, B:21:0x0052, B:15:0x003a), top: B:52:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objKWHzl;
        List listAhwBna;
        Object objEZpvd;
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
            C29710kyl c29710kyl = this.this$0.OLrzqt;
            this.label = 1;
            objKWHzl = c29710kyl.KWHzl(this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objEZpvd = ((Result) obj).m7386unboximpl();
                    if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
                        objEZpvd = yDY.AhwBna();
                    }
                    Iterable iterable = (Iterable) objEZpvd;
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.this$0.copydefault.OLrzqt((TagMetaData) it.next()));
                    }
                    listAhwBna = arrayList;
                    objM7377constructorimpl = Result.m7377constructorimpl(listAhwBna);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
                C29710kyl c29710kyl2 = this.this$0.OLrzqt;
                List<String> list = this.$keys$inlined;
                this.label = 3;
                objEZpvd = c29710kyl2.EZpvd(list, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
                }
                Iterable iterable2 = (Iterable) objEZpvd;
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(iterable2, 10));
                it = iterable2.iterator();
                while (it.hasNext()) {
                }
                listAhwBna = arrayList2;
                objM7377constructorimpl = Result.m7377constructorimpl(listAhwBna);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
            objKWHzl = C56443yFo.KWHzl(true);
        }
        if (((Boolean) objKWHzl).booleanValue() && !this.$refreshCache$inlined) {
            listAhwBna = yDY.AhwBna();
            objM7377constructorimpl = Result.m7377constructorimpl(listAhwBna);
            return Result.m7376boximpl(objM7377constructorimpl);
        }
        if (this.$refreshCache$inlined) {
            C29710kyl c29710kyl3 = this.this$0.OLrzqt;
            this.label = 2;
            if (c29710kyl3.copydefault(this) == objCopydefault) {
                return objCopydefault;
            }
        }
        C29710kyl c29710kyl22 = this.this$0.OLrzqt;
        List<String> list2 = this.$keys$inlined;
        this.label = 3;
        objEZpvd = c29710kyl22.EZpvd(list2, this);
        if (objEZpvd == objCopydefault) {
        }
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
        }
        Iterable iterable22 = (Iterable) objEZpvd;
        ArrayList arrayList22 = new ArrayList(C56403yEb.AYXKKw(iterable22, 10));
        it = iterable22.iterator();
        while (it.hasNext()) {
        }
        listAhwBna = arrayList22;
        objM7377constructorimpl = Result.m7377constructorimpl(listAhwBna);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
