package com.okinc.business.market.features.position.domain;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C29123knh;
import o.C29129knn;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class GetLatestPnLUseCase$getTokenBalance$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $tokenAddress$inlined;
    int label;
    final /* synthetic */ C29123knh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLatestPnLUseCase$getTokenBalance$$inlined$dexRunCatching$1(Continuation continuation, C29123knh c29123knh, String str, String str2) {
        super(2, continuation);
        this.this$0 = c29123knh;
        this.$chainId$inlined = str;
        this.$tokenAddress$inlined = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetLatestPnLUseCase$getTokenBalance$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$tokenAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return ((GetLatestPnLUseCase$getTokenBalance$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C29129knn c29129knn = this.this$0.copydefault;
                String str = this.$chainId$inlined;
                String str2 = this.$tokenAddress$inlined;
                this.label = 1;
                Object objEZpvd = c29129knn.EZpvd(str, str2, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                objM7386unboximpl = objEZpvd;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objM7386unboximpl);
            DexMultiTokenInfoBean dexMultiTokenInfoBean = (DexMultiTokenInfoBean) objM7386unboximpl;
            C29123knh c29123knh = this.this$0;
            PnLDetailsUiModel pnLDetailsUiModel = c29123knh.OLrzqt;
            c29123knh.OLrzqt = pnLDetailsUiModel.OLrzqt((393215 & 1) != 0 ? pnLDetailsUiModel.AYXKKw : false, (393215 & 2) != 0 ? pnLDetailsUiModel.DbNXlk : null, (393215 & 4) != 0 ? pnLDetailsUiModel.isConnected : null, (393215 & 8) != 0 ? pnLDetailsUiModel.AkhnZx : null, (393215 & 16) != 0 ? pnLDetailsUiModel.KWHzl : null, (393215 & 32) != 0 ? pnLDetailsUiModel.valueOf : null, (393215 & 64) != 0 ? pnLDetailsUiModel.fJNWhG : null, (393215 & 128) != 0 ? pnLDetailsUiModel.AuCTel : null, (393215 & 256) != 0 ? pnLDetailsUiModel.AhwBna : null, (393215 & 512) != 0 ? pnLDetailsUiModel.djBIcL : null, (393215 & 1024) != 0 ? pnLDetailsUiModel.copydefault : null, (393215 & 2048) != 0 ? pnLDetailsUiModel.EZpvd : null, (393215 & 4096) != 0 ? pnLDetailsUiModel.fetchVPNInfo : null, (393215 & 8192) != 0 ? pnLDetailsUiModel.fIwbmz : null, (393215 & 16384) != 0 ? pnLDetailsUiModel.fARcdN : dexMultiTokenInfoBean.getAmountNum(), (393215 & 32768) != 0 ? pnLDetailsUiModel.values : null, (393215 & 65536) != 0 ? pnLDetailsUiModel.gEmmrt : null, (393215 & 131072) != 0 ? pnLDetailsUiModel.AEQbTJ : dexMultiTokenInfoBean.getPrice(), (393215 & 262144) != 0 ? pnLDetailsUiModel.OLrzqt : dexMultiTokenInfoBean.getCurrencyAmount());
            this.this$0.AEQbTJ.setValue(this.this$0.OLrzqt);
            this.this$0.values = dexMultiTokenInfoBean;
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
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
