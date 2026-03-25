package com.okinc.dexkline.market.features.coindetail.domain;

import com.okinc.kline.news.data.po.KlineFlashContentPo;
import com.okinc.kline.news.data.po.KlineFlashPo;
import com.okinc.kline.news.data.vo.KlineFlashVo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C33129mqd;
import o.C37980pHv;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.mWA;
import o.mWJ;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.dexkline.market.features.coindetail.domain.KlineDexFlashNewsUseCase$getDexContentFlashData-bMdYcbs$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class KlineDexFlashNewsUseCase$getDexContentFlashDatabMdYcbs$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends KlineFlashVo>>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $cursor$inlined;
    final /* synthetic */ String $group$inlined;
    final /* synthetic */ Integer $size$inlined;
    final /* synthetic */ String $token$inlined;
    final /* synthetic */ String $tokenAddress$inlined;
    int label;
    final /* synthetic */ mWA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineDexFlashNewsUseCase$getDexContentFlashDatabMdYcbs$$inlined$dexRunCatching$1(Continuation continuation, mWA mwa, String str, String str2, String str3, String str4, String str5, Integer num) {
        super(2, continuation);
        this.this$0 = mwa;
        this.$chainId$inlined = str;
        this.$tokenAddress$inlined = str2;
        this.$token$inlined = str3;
        this.$group$inlined = str4;
        this.$cursor$inlined = str5;
        this.$size$inlined = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineDexFlashNewsUseCase$getDexContentFlashDatabMdYcbs$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$tokenAddress$inlined, this.$token$inlined, this.$group$inlined, this.$cursor$inlined, this.$size$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends KlineFlashVo>>> continuation) {
        return ((KlineDexFlashNewsUseCase$getDexContentFlashDatabMdYcbs$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Collection collectionAhwBna;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                mWJ mwj = this.this$0.copydefault;
                String str = this.$chainId$inlined;
                String str2 = this.$tokenAddress$inlined;
                String str3 = this.$token$inlined;
                String str4 = this.$group$inlined;
                String str5 = this.$cursor$inlined;
                Integer num = this.$size$inlined;
                this.label = 1;
                obj = mwj.copydefault(str, str2, str3, str4, str5, num, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            List<KlineFlashContentPo> contentDataList = ((KlineFlashPo) ((AbstractC43419rot) obj).AEQbTJ()).getContentDataList();
            if (contentDataList != null) {
                collectionAhwBna = new ArrayList(C56403yEb.AYXKKw(contentDataList, 10));
                for (KlineFlashContentPo klineFlashContentPo : contentDataList) {
                    String strKWHzl = C37980pHv.OLrzqt.KWHzl(C56443yFo.KWHzl(C33129mqd.valueOf(klineFlashContentPo.getPublishTime())));
                    String str6 = this.$token$inlined;
                    String str7 = this.$group$inlined;
                    if (str7 == null) {
                        str7 = "";
                    }
                    collectionAhwBna.add(new KlineFlashVo(klineFlashContentPo, strKWHzl, str6, str7, this.$chainId$inlined, this.$tokenAddress$inlined));
                }
            } else {
                collectionAhwBna = yDY.AhwBna();
            }
            objM7377constructorimpl = Result.m7377constructorimpl(collectionAhwBna);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("cedefi", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
