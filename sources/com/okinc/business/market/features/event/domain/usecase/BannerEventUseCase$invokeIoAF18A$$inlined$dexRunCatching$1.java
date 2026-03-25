package com.okinc.business.market.features.event.domain.usecase;

import com.okinc.business.market.data.model.BannerEventData;
import com.okinc.business.market.data.model.BannerEventItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.jRP;
import o.jRQ;
import o.jRU;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.event.domain.usecase.BannerEventUseCase$invoke-IoAF18A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class BannerEventUseCase$invokeIoAF18A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends jRP>>>, Object> {
    int label;
    final /* synthetic */ jRQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerEventUseCase$invokeIoAF18A$$inlined$dexRunCatching$1(Continuation continuation, jRQ jrq) {
        super(2, continuation);
        this.this$0 = jrq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BannerEventUseCase$invokeIoAF18A$$inlined$dexRunCatching$1(continuation, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends jRP>>> continuation) {
        return ((BannerEventUseCase$invokeIoAF18A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Collection collectionAhwBna;
        List<BannerEventItem> listCopydefault;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                jRU jru = this.this$0.copydefault;
                this.label = 1;
                obj = jru.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            BannerEventData bannerEventData = (BannerEventData) CollectionsKt___CollectionsKt.firstOrNull((List) ((AbstractC43419rot) obj).AEQbTJ());
            if (bannerEventData == null || (listCopydefault = bannerEventData.copydefault()) == null) {
                collectionAhwBna = yDY.AhwBna();
            } else {
                collectionAhwBna = new ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
                for (BannerEventItem bannerEventItem : listCopydefault) {
                    String strGEmmrt = bannerEventItem.gEmmrt();
                    String str = strGEmmrt == null ? "" : strGEmmrt;
                    String strEZpvd = bannerEventItem.EZpvd();
                    String str2 = strEZpvd == null ? "" : strEZpvd;
                    String strKWHzl = bannerEventItem.KWHzl();
                    String str3 = strKWHzl == null ? "" : strKWHzl;
                    String strOLrzqt = bannerEventItem.OLrzqt();
                    String str4 = strOLrzqt == null ? "" : strOLrzqt;
                    String strCopydefault = bannerEventItem.copydefault();
                    String str5 = strCopydefault == null ? "" : strCopydefault;
                    String strAEQbTJ = bannerEventItem.AEQbTJ();
                    String str6 = strAEQbTJ == null ? "" : strAEQbTJ;
                    String strAYXKKw = bannerEventItem.AYXKKw();
                    if (strAYXKKw == null) {
                        strAYXKKw = "";
                    }
                    collectionAhwBna.add(new jRP(str, str2, str3, str4, str5, str6, strAYXKKw));
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(collectionAhwBna);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
