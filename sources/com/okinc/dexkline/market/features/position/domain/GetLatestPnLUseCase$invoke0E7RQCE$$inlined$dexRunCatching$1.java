package com.okinc.dexkline.market.features.position.domain;

import com.okinc.dexkline.market.data.model.position_pnl.LatestPnLData;
import com.okinc.dexkline.market.features.position.ui.widget.PnLDetailsUiModel;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C34467ncd;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.xHC;

/* JADX INFO: renamed from: com.okinc.dexkline.market.features.position.domain.GetLatestPnLUseCase$invoke-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class GetLatestPnLUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends PnLDetailsUiModel>>, Object> {
    final /* synthetic */ xHC.ActionBar $params$inlined;
    int label;
    final /* synthetic */ C34467ncd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLatestPnLUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, xHC.ActionBar actionBar, C34467ncd c34467ncd) {
        super(2, continuation);
        this.$params$inlined = actionBar;
        this.this$0 = c34467ncd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetLatestPnLUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(continuation, this.$params$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends PnLDetailsUiModel>> continuation) {
        return ((GetLatestPnLUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        try {
            Result.Application application = Result.Companion;
            String strAYXKKw = this.$params$inlined.AYXKKw();
            String str = strAYXKKw == null ? "" : strAYXKKw;
            String strEZpvd = this.$params$inlined.EZpvd();
            String str2 = strEZpvd == null ? "" : strEZpvd;
            String strOLrzqt = this.$params$inlined.OLrzqt();
            String str3 = strOLrzqt == null ? "" : strOLrzqt;
            String strKWHzl = this.$params$inlined.KWHzl();
            String str4 = strKWHzl == null ? "" : strKWHzl;
            String strAhwBna = this.$params$inlined.AhwBna();
            String str5 = strAhwBna == null ? "" : strAhwBna;
            String strIsConnected = this.$params$inlined.isConnected();
            String str6 = strIsConnected == null ? "" : strIsConnected;
            String strValues = this.$params$inlined.values();
            String str7 = strValues == null ? "" : strValues;
            boolean zEZpvd = Intrinsics.EZpvd((Object) this.$params$inlined.zsXlph(), (Object) "1");
            String strHDKMBd = this.$params$inlined.hDKMBd();
            String str8 = strHDKMBd == null ? "" : strHDKMBd;
            String strUzCIH = this.$params$inlined.uzCIH();
            String str9 = strUzCIH == null ? "" : strUzCIH;
            String strZLjUOn = this.$params$inlined.zLjUOn();
            String str10 = strZLjUOn == null ? "" : strZLjUOn;
            String strAubY = this.$params$inlined.AubY();
            String str11 = strAubY == null ? "" : strAubY;
            String strEjfBZ = this.$params$inlined.ejfBZ();
            String str12 = strEjfBZ == null ? "" : strEjfBZ;
            String strFARcdN = this.$params$inlined.fARcdN();
            PnLDetailsUiModel pnLDetailsUiModelCopydefault = this.this$0.copydefault.copydefault(this.this$0.copydefault.AEQbTJ(new LatestPnLData(str, str2, str3, str4, str5, str6, str7, zEZpvd, str8, str9, str10, str11, str12, strFARcdN == null ? "" : strFARcdN)));
            this.this$0.KWHzl.setValue(pnLDetailsUiModelCopydefault);
            objM7377constructorimpl = Result.m7377constructorimpl(pnLDetailsUiModelCopydefault);
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
