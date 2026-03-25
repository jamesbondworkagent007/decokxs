package com.okinc.business.market.features.holders.domain.usecase;

import com.okinc.business.data.model.market.HolderDetailResponseData;
import com.okinc.business.dexlogic.bean.TradingHistoryStatisticsResult;
import com.okinc.business.market.features.holders.domain.model.HistoryStatistics;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.jYA;
import o.jYE;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.holders.domain.usecase.GetHistoryStatisticsUseCase$invoke-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetHistoryStatisticsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends HistoryStatistics>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $tokenAddress$inlined;
    final /* synthetic */ String $walletAddress$inlined;
    Object L$0;
    int label;
    final /* synthetic */ jYE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHistoryStatisticsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, jYE jye, String str, String str2, String str3) {
        super(2, continuation);
        this.this$0 = jye;
        this.$chainId$inlined = str;
        this.$tokenAddress$inlined = str2;
        this.$walletAddress$inlined = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetHistoryStatisticsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$tokenAddress$inlined, this.$walletAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends HistoryStatistics>> continuation) {
        return ((GetHistoryStatisticsUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b A[Catch: all -> 0x00bb, CancellationException -> 0x00d2, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00d2, all -> 0x00bb, blocks: (B:7:0x0014, B:24:0x007f, B:27:0x0087, B:29:0x008b, B:34:0x00b2, B:35:0x00b6, B:11:0x0029, B:17:0x0049, B:20:0x0066, B:14:0x0032), top: B:43:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objAEQbTJ;
        HistoryStatistics historyStatisticsOLrzqt;
        HistoryStatistics historyStatistics;
        Object objM7386unboximpl;
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
            jYA jya = this.this$0.OLrzqt;
            String str = this.$chainId$inlined;
            String str2 = this.$tokenAddress$inlined;
            String str3 = this.$walletAddress$inlined;
            this.label = 1;
            objAEQbTJ = jya.AEQbTJ(str, str2, str3, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                HistoryStatistics historyStatistics2 = (HistoryStatistics) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                historyStatistics = historyStatistics2;
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = null;
                }
                HolderDetailResponseData holderDetailResponseData = (HolderDetailResponseData) objM7386unboximpl;
                String explorerUrl = holderDetailResponseData != null ? holderDetailResponseData.getExplorerUrl() : null;
                historyStatisticsOLrzqt = historyStatistics.KWHzl((65535 & 1) != 0 ? historyStatistics.OLrzqt : 0, (65535 & 2) != 0 ? historyStatistics.AuCTel : null, (65535 & 4) != 0 ? historyStatistics.ejfBZ : null, (65535 & 8) != 0 ? historyStatistics.gEmmrt : null, (65535 & 16) != 0 ? historyStatistics.EZpvd : null, (65535 & 32) != 0 ? historyStatistics.copydefault : null, (65535 & 64) != 0 ? historyStatistics.KWHzl : null, (65535 & 128) != 0 ? historyStatistics.AEQbTJ : null, (65535 & 256) != 0 ? historyStatistics.AkhnZx : null, (65535 & 512) != 0 ? historyStatistics.isConnected : null, (65535 & 1024) != 0 ? historyStatistics.fetchVPNInfo : null, (65535 & 2048) != 0 ? historyStatistics.values : null, (65535 & 4096) != 0 ? historyStatistics.valueOf : null, (65535 & 8192) != 0 ? historyStatistics.DbNXlk : null, (65535 & 16384) != 0 ? historyStatistics.djBIcL : null, (65535 & 32768) != 0 ? historyStatistics.AYXKKw : null, (65535 & 65536) != 0 ? historyStatistics.AhwBna : explorerUrl != null ? "" : explorerUrl);
                objM7377constructorimpl = Result.m7377constructorimpl(historyStatisticsOLrzqt);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        }
        historyStatisticsOLrzqt = this.this$0.copydefault.OLrzqt((TradingHistoryStatisticsResult) ((AbstractC43419rot) objAEQbTJ).AEQbTJ());
        if (C33129mqd.OLrzqt((CharSequence) historyStatisticsOLrzqt.EZpvd())) {
            objM7377constructorimpl = Result.m7377constructorimpl(historyStatisticsOLrzqt);
            return Result.m7376boximpl(objM7377constructorimpl);
        }
        jYA jya2 = this.this$0.OLrzqt;
        String str4 = this.$chainId$inlined;
        String str5 = this.$tokenAddress$inlined;
        String str6 = this.$walletAddress$inlined;
        this.L$0 = historyStatisticsOLrzqt;
        this.label = 2;
        Object objCopydefault2 = jya2.copydefault(str4, str5, str6, this);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        historyStatistics = historyStatisticsOLrzqt;
        objM7386unboximpl = objCopydefault2;
        if (Result.m7383isFailureimpl(objM7386unboximpl)) {
        }
        HolderDetailResponseData holderDetailResponseData2 = (HolderDetailResponseData) objM7386unboximpl;
        if (holderDetailResponseData2 != null) {
        }
        historyStatisticsOLrzqt = historyStatistics.KWHzl((65535 & 1) != 0 ? historyStatistics.OLrzqt : 0, (65535 & 2) != 0 ? historyStatistics.AuCTel : null, (65535 & 4) != 0 ? historyStatistics.ejfBZ : null, (65535 & 8) != 0 ? historyStatistics.gEmmrt : null, (65535 & 16) != 0 ? historyStatistics.EZpvd : null, (65535 & 32) != 0 ? historyStatistics.copydefault : null, (65535 & 64) != 0 ? historyStatistics.KWHzl : null, (65535 & 128) != 0 ? historyStatistics.AEQbTJ : null, (65535 & 256) != 0 ? historyStatistics.AkhnZx : null, (65535 & 512) != 0 ? historyStatistics.isConnected : null, (65535 & 1024) != 0 ? historyStatistics.fetchVPNInfo : null, (65535 & 2048) != 0 ? historyStatistics.values : null, (65535 & 4096) != 0 ? historyStatistics.valueOf : null, (65535 & 8192) != 0 ? historyStatistics.DbNXlk : null, (65535 & 16384) != 0 ? historyStatistics.djBIcL : null, (65535 & 32768) != 0 ? historyStatistics.AYXKKw : null, (65535 & 65536) != 0 ? historyStatistics.AhwBna : explorerUrl != null ? "" : explorerUrl);
        objM7377constructorimpl = Result.m7377constructorimpl(historyStatisticsOLrzqt);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
