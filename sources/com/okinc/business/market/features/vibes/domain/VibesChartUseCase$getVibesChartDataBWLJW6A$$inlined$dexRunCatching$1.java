package com.okinc.business.market.features.vibes.domain;

import com.okinc.business.market.data.model.KolInfoData;
import com.okinc.business.market.data.model.VibesChartData;
import com.okinc.business.market.data.model.VibesChartInfoData;
import java.util.ArrayList;
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
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.kAO;
import o.kAQ;
import o.kAR;
import o.kAS;
import o.kAT;
import o.kAU;
import o.kAV;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.vibes.domain.VibesChartUseCase$getVibesChartData-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class VibesChartUseCase$getVibesChartDataBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends kAV>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ VibesTimeRange $timeRange$inlined;
    final /* synthetic */ String $tokenContractAddress$inlined;
    int label;
    final /* synthetic */ kAO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VibesChartUseCase$getVibesChartDataBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, kAO kao, String str, String str2, VibesTimeRange vibesTimeRange) {
        super(2, continuation);
        this.this$0 = kao;
        this.$chainId$inlined = str;
        this.$tokenContractAddress$inlined = str2;
        this.$timeRange$inlined = vibesTimeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VibesChartUseCase$getVibesChartDataBWLJW6A$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$tokenContractAddress$inlined, this.$timeRange$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends kAV>> continuation) {
        return ((VibesChartUseCase$getVibesChartDataBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                kAQ kaq = this.this$0.EZpvd;
                String str = this.$chainId$inlined;
                String str2 = this.$tokenContractAddress$inlined;
                int value = this.$timeRange$inlined.getValue();
                this.label = 1;
                objKWHzl = kaq.KWHzl(str, str2, String.valueOf(value), this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = obj;
            }
            VibesChartData vibesChartData = (VibesChartData) ((AbstractC43419rot) objKWHzl).AEQbTJ();
            float fDjBIcL = C33129mqd.djBIcL(vibesChartData.AYXKKw());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (VibesChartInfoData vibesChartInfoData : vibesChartData.copydefault()) {
                String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.OLrzqt(C33129mqd.djBIcL(vibesChartInfoData.OLrzqt())));
                String strValueOf = vibesChartInfoData.valueOf();
                if (strValueOf == null) {
                    strValueOf = "";
                }
                arrayList.add(new kAS(strGEmmrt, strValueOf));
                String strAEQbTJ = vibesChartInfoData.AEQbTJ();
                if (strAEQbTJ == null) {
                    strAEQbTJ = "";
                }
                String strGEmmrt2 = C33129mqd.gEmmrt(C56443yFo.OLrzqt(C33129mqd.djBIcL(vibesChartInfoData.AEQbTJ()) * fDjBIcL));
                String strValueOf2 = vibesChartInfoData.valueOf();
                if (strValueOf2 == null) {
                    strValueOf2 = "";
                }
                arrayList2.add(new kAR(strAEQbTJ, strGEmmrt2, strValueOf2));
                ArrayList<KolInfoData> arrayListEZpvd = vibesChartInfoData.EZpvd();
                ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(arrayListEZpvd, 10));
                for (KolInfoData kolInfoData : arrayListEZpvd) {
                    String strEZpvd = kolInfoData.EZpvd();
                    String str3 = strEZpvd == null ? "" : strEZpvd;
                    String strCopydefault = kolInfoData.copydefault();
                    String str4 = strCopydefault == null ? "" : strCopydefault;
                    String strOLrzqt = kolInfoData.OLrzqt();
                    String str5 = strOLrzqt == null ? "" : strOLrzqt;
                    String strAEQbTJ2 = vibesChartInfoData.AEQbTJ();
                    String str6 = strAEQbTJ2 == null ? "" : strAEQbTJ2;
                    String strGEmmrt3 = C33129mqd.gEmmrt(C56443yFo.OLrzqt(C33129mqd.djBIcL(vibesChartInfoData.AEQbTJ()) * fDjBIcL));
                    String strValueOf3 = vibesChartInfoData.valueOf();
                    String str7 = strValueOf3 == null ? "" : strValueOf3;
                    String strCopydefault2 = vibesChartInfoData.copydefault();
                    if (strCopydefault2 == null) {
                        strCopydefault2 = "";
                    }
                    arrayList4.add(C56443yFo.KWHzl(arrayList3.add(new kAU(str3, str4, str5, str6, str7, strGEmmrt3, C33129mqd.AhwBna(strCopydefault2)))));
                }
            }
            String strValues = vibesChartData.values();
            String str8 = strValues == null ? "" : strValues;
            String strKWHzl = vibesChartData.KWHzl();
            String str9 = strKWHzl == null ? "" : strKWHzl;
            String strAkhnZx = vibesChartData.AkhnZx();
            String str10 = strAkhnZx == null ? "" : strAkhnZx;
            String strIsConnected = vibesChartData.isConnected();
            String str11 = strIsConnected == null ? "" : strIsConnected;
            String strGEmmrt4 = vibesChartData.gEmmrt();
            String str12 = strGEmmrt4 == null ? "" : strGEmmrt4;
            String strValueOf4 = vibesChartData.valueOf();
            String str13 = strValueOf4 == null ? "" : strValueOf4;
            String strEZpvd2 = vibesChartData.EZpvd();
            String str14 = strEZpvd2 == null ? "" : strEZpvd2;
            String strOLrzqt2 = vibesChartData.OLrzqt();
            String str15 = strOLrzqt2 == null ? "" : strOLrzqt2;
            String strDjBIcL = vibesChartData.djBIcL();
            String str16 = strDjBIcL == null ? "" : strDjBIcL;
            String strAhwBna = vibesChartData.AhwBna();
            objM7377constructorimpl = Result.m7377constructorimpl(new kAV(arrayList, arrayList2, arrayList3, new kAT(str10, str11, str12, str13, str14, str15, str16, strAhwBna == null ? "" : strAhwBna), this.$tokenContractAddress$inlined, str8, str9, vibesChartData.DbNXlk()));
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
