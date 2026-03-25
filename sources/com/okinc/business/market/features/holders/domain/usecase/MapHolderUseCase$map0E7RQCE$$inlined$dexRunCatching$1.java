package com.okinc.business.market.features.holders.domain.usecase;

import com.okinc.business.data.model.market.HolderRankingResponseData;
import com.okinc.business.data.model.market.HolderSummaryResponseData;
import com.okinc.business.data.model.market.TokenHolderResponseData;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C26287jYw;
import o.C31256lqb;
import o.C56391yDq;
import o.C56442yFn;
import o.C59443zhD;
import o.jYC;
import o.jYH;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.holders.domain.usecase.MapHolderUseCase$map-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class MapHolderUseCase$map0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C26287jYw>>, Object> {
    final /* synthetic */ TokenHolderResponseData $from$inlined;
    final /* synthetic */ Integer $limit$inlined;
    Object L$0;
    int label;
    final /* synthetic */ jYH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapHolderUseCase$map0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, TokenHolderResponseData tokenHolderResponseData, jYH jyh, Integer num) {
        super(2, continuation);
        this.$from$inlined = tokenHolderResponseData;
        this.this$0 = jyh;
        this.$limit$inlined = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapHolderUseCase$map0E7RQCE$$inlined$dexRunCatching$1(continuation, this.$from$inlined, this.this$0, this.$limit$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C26287jYw>> continuation) {
        return ((MapHolderUseCase$map0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String totalHolderAmount;
        jYC jyc;
        Object objAhwBna;
        String top100HoldAmountPercentage;
        Float fFIwbmz;
        String sniperTagHolderAmount;
        Float fFIwbmz2;
        String suspiciousTagHolderAmount;
        Float fFIwbmz3;
        String totalHolderAmount2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                HolderSummaryResponseData summaryVO = this.$from$inlined.getSummaryVO();
                Float fFIwbmz4 = (summaryVO == null || (totalHolderAmount2 = summaryVO.getTotalHolderAmount()) == null) ? null : C59443zhD.fIwbmz(totalHolderAmount2);
                HolderSummaryResponseData summaryVO2 = this.$from$inlined.getSummaryVO();
                float fFloatValue = (summaryVO2 == null || (suspiciousTagHolderAmount = summaryVO2.getSuspiciousTagHolderAmount()) == null || (fFIwbmz3 = C59443zhD.fIwbmz(suspiciousTagHolderAmount)) == null) ? Float.NaN : fFIwbmz3.floatValue();
                HolderSummaryResponseData summaryVO3 = this.$from$inlined.getSummaryVO();
                float fFloatValue2 = (summaryVO3 == null || (sniperTagHolderAmount = summaryVO3.getSniperTagHolderAmount()) == null || (fFIwbmz2 = C59443zhD.fIwbmz(sniperTagHolderAmount)) == null) ? Float.NaN : fFIwbmz2.floatValue();
                HolderSummaryResponseData summaryVO4 = this.$from$inlined.getSummaryVO();
                if (summaryVO4 == null || (totalHolderAmount = summaryVO4.getTotalHolderAmount()) == null) {
                    totalHolderAmount = "--";
                }
                String str = totalHolderAmount;
                HolderSummaryResponseData summaryVO5 = this.$from$inlined.getSummaryVO();
                float fFloatValue3 = (summaryVO5 == null || (top100HoldAmountPercentage = summaryVO5.getTop100HoldAmountPercentage()) == null || (fFIwbmz = C59443zhD.fIwbmz(top100HoldAmountPercentage)) == null) ? Float.NaN : fFIwbmz.floatValue();
                float fFloatValue4 = fFIwbmz4 != null ? (100 * fFloatValue) / fFIwbmz4.floatValue() : Float.NaN;
                float fFloatValue5 = fFIwbmz4 != null ? (100 * fFloatValue2) / fFIwbmz4.floatValue() : Float.NaN;
                String greaterThan10AmountPercentage = this.$from$inlined.getOwnedVO().getGreaterThan10AmountPercentage();
                String greaterThan10Amount = this.$from$inlined.getOwnedVO().getGreaterThan10Amount();
                HolderSummaryResponseData summaryVO6 = this.$from$inlined.getSummaryVO();
                String strKWHzl = C31256lqb.KWHzl(summaryVO6 != null ? summaryVO6.getTop100BoughtAvgPrice() : null, jYH.Activity.copydefault);
                HolderSummaryResponseData summaryVO7 = this.$from$inlined.getSummaryVO();
                String strKWHzl2 = C31256lqb.KWHzl(summaryVO7 != null ? summaryVO7.getTop100BoughtAvgPricePercentage() : null, jYH.TaskDescription.OLrzqt);
                HolderSummaryResponseData summaryVO8 = this.$from$inlined.getSummaryVO();
                String strKWHzl3 = C31256lqb.KWHzl(summaryVO8 != null ? summaryVO8.getTop100SoldAvgPrice() : null, jYH.Application.OLrzqt);
                HolderSummaryResponseData summaryVO9 = this.$from$inlined.getSummaryVO();
                jYC jyc2 = new jYC(str, fFloatValue3, fFloatValue, fFloatValue4, fFloatValue2, fFloatValue5, greaterThan10Amount, greaterThan10AmountPercentage, strKWHzl, strKWHzl2, strKWHzl3, C31256lqb.KWHzl(summaryVO9 != null ? summaryVO9.getTop100SoldAvgPricePercentage() : null, jYH.ActionBar.OLrzqt));
                jYH jyh = this.this$0;
                List<HolderRankingResponseData> holderRankingList = this.$from$inlined.getHolderRankingList();
                if (holderRankingList == null) {
                    holderRankingList = yDY.AhwBna();
                }
                Integer num = this.$limit$inlined;
                this.L$0 = jyc2;
                this.label = 1;
                Object objCopydefault2 = jyh.copydefault(holderRankingList, num, this);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                jyc = jyc2;
                objAhwBna = objCopydefault2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jyc = (jYC) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAhwBna = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7380exceptionOrNullimpl(objAhwBna) != null) {
                objAhwBna = yDY.AhwBna();
            }
            objM7377constructorimpl = Result.m7377constructorimpl(new C26287jYw(jyc, (List) objAhwBna));
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
