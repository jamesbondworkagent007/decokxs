package com.okinc.business.market.features.meme.token_detail_sheet.domain.repository;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C28777khF;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC27595jyE;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.meme.token_detail_sheet.domain.repository.KLineRepositoryImpl$getCoinKLineInfo-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class KLineRepositoryImpl$getCoinKLineInfoBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends List<? extends String>>>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $scale$inlined;
    final /* synthetic */ String $tokenAddress$inlined;
    int label;
    final /* synthetic */ C28777khF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineRepositoryImpl$getCoinKLineInfoBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, C28777khF c28777khF, String str, String str2, String str3) {
        super(2, continuation);
        this.this$0 = c28777khF;
        this.$chainId$inlined = str;
        this.$tokenAddress$inlined = str2;
        this.$scale$inlined = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineRepositoryImpl$getCoinKLineInfoBWLJW6A$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$tokenAddress$inlined, this.$scale$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends List<? extends String>>>> continuation) {
        return ((KLineRepositoryImpl$getCoinKLineInfoBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                long jCurrentTimeMillis = System.currentTimeMillis();
                Map mapOLrzqt = C56423yEv.OLrzqt();
                mapOLrzqt.put("chainId", this.$chainId$inlined);
                mapOLrzqt.put(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, this.$tokenAddress$inlined);
                mapOLrzqt.put(TtmlNode.RUBY_AFTER, C56443yFo.KWHzl(jCurrentTimeMillis));
                mapOLrzqt.put(TtmlNode.RUBY_BEFORE, C56443yFo.KWHzl(jCurrentTimeMillis - ((long) 1209600000)));
                mapOLrzqt.put("bar", this.$scale$inlined);
                mapOLrzqt.put("limit", C56443yFo.AEQbTJ(1439));
                Map<String, Object> mapAYXKKw = C56423yEv.AYXKKw(mapOLrzqt);
                InterfaceC27595jyE interfaceC27595jyE = this.this$0.KWHzl;
                this.label = 1;
                obj = interfaceC27595jyE.OLrzqt(mapAYXKKw, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Object data = ((ResponseData) obj).getData();
            Intrinsics.copydefault(data);
            objM7377constructorimpl = Result.m7377constructorimpl(data);
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
