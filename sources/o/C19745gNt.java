package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.tee.domain.model.TeeLimitPlaceOrderParams;
import com.okinc.business.dex.tee.domain.usecase.limit.TeeLimitTransactionUseCase$createOrder$1;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gNt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19745gNt {
    public final C19700gMb AEQbTJ;
    public final C19741gNp EZpvd;
    public final C19740gNo OLrzqt;

    @yCM
    public C19745gNt(@NotNull C19700gMb c19700gMb, @NotNull C19740gNo c19740gNo, @NotNull C19741gNp c19741gNp) {
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c19740gNo, "");
        Intrinsics.checkNotNullParameter(c19741gNp, "");
        this.AEQbTJ = c19700gMb;
        this.OLrzqt = c19740gNo;
        this.EZpvd = c19741gNp;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.dex.tee.domain.model.TeeLimitPlaceOrderParams.copy$default(com.okinc.business.dex.tee.domain.model.TeeLimitPlaceOrderParams, java.lang.String, java.lang.String, com.okinc.business.dex.tee.domain.model.StrategyType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.tee.domain.model.Rule, com.okinc.business.dex.tee.domain.model.LimitPreset, java.lang.String, int, java.lang.Integer, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ServiceFeeInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, int, java.lang.Object):com.okinc.business.dex.tee.domain.model.TeeLimitPlaceOrderParams */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull TeeLimitPlaceOrderParams teeLimitPlaceOrderParams, @NotNull FragmentActivity fragmentActivity, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, @NotNull Continuation<? super Result<LimitOrderDetailBean>> continuation) throws java.lang.Throwable {
        TeeLimitTransactionUseCase$createOrder$1 teeLimitTransactionUseCase$createOrder$1;
        if (continuation instanceof TeeLimitTransactionUseCase$createOrder$1) {
            teeLimitTransactionUseCase$createOrder$1 = (TeeLimitTransactionUseCase$createOrder$1) continuation;
            int i = teeLimitTransactionUseCase$createOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeLimitTransactionUseCase$createOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                teeLimitTransactionUseCase$createOrder$1 = new TeeLimitTransactionUseCase$createOrder$1(this, continuation);
            }
        }
        java.lang.Object obj = teeLimitTransactionUseCase$createOrder$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeLimitTransactionUseCase$createOrder$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        long jValueOf = C33129mqd.valueOf(teeLimitPlaceOrderParams.getChainId());
        AbstractC19748gNw abstractC19748gNw = this.AEQbTJ.OLrzqt(jValueOf) ? this.OLrzqt : this.EZpvd;
        InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.AEQbTJ.KWHzl();
        java.lang.String strDbNXlk = interfaceC9738bbJKWHzl != null ? interfaceC9738bbJKWHzl.DbNXlk() : null;
        if (strDbNXlk == null) {
            strDbNXlk = "";
        }
        TeeLimitPlaceOrderParams teeLimitPlaceOrderParamsCopy = teeLimitPlaceOrderParams.copy((16758524 & 1) != 0 ? teeLimitPlaceOrderParams.accountId : strDbNXlk, (16758524 & 2) != 0 ? teeLimitPlaceOrderParams.teeId : this.AEQbTJ.isConnected(), (16758524 & 4) != 0 ? teeLimitPlaceOrderParams.strategyType : null, (16758524 & 8) != 0 ? teeLimitPlaceOrderParams.chainId : null, (16758524 & 16) != 0 ? teeLimitPlaceOrderParams.fromTokenAddress : null, (16758524 & 32) != 0 ? teeLimitPlaceOrderParams.toTokenAddress : null, (16758524 & 64) != 0 ? teeLimitPlaceOrderParams.fromAmount : null, (16758524 & 128) != 0 ? teeLimitPlaceOrderParams.toAmount : null, (16758524 & 256) != 0 ? teeLimitPlaceOrderParams.userWalletAddress : this.AEQbTJ.KWHzl(C33129mqd.gEmmrt(C56443yFo.KWHzl(jValueOf))), (16758524 & 512) != 0 ? teeLimitPlaceOrderParams.rule : null, (16758524 & 1024) != 0 ? teeLimitPlaceOrderParams.preset : null, (16758524 & 2048) != 0 ? teeLimitPlaceOrderParams.referralCode : teeLimitPlaceOrderParams.getRefCode(), (16758524 & 4096) != 0 ? teeLimitPlaceOrderParams.sourceType : 0, (16758524 & 8192) != 0 ? teeLimitPlaceOrderParams.strategyDirection : null, (16758524 & 16384) != 0 ? teeLimitPlaceOrderParams.referrerAddress : teeLimitPlaceOrderParams.getRefAddress(), (16758524 & 32768) != 0 ? teeLimitPlaceOrderParams.expireTime : null, (16758524 & 65536) != 0 ? teeLimitPlaceOrderParams.serviceFeeInfo : null, (16758524 & 131072) != 0 ? teeLimitPlaceOrderParams.fromTokenDecimals : null, (16758524 & 262144) != 0 ? teeLimitPlaceOrderParams.toTokenDecimals : null, (16758524 & 524288) != 0 ? teeLimitPlaceOrderParams.estimateGasFee : null, (16758524 & 1048576) != 0 ? teeLimitPlaceOrderParams.minimumReceived : null, (16758524 & 2097152) != 0 ? teeLimitPlaceOrderParams.isCustomExpireTime : false, (16758524 & 4194304) != 0 ? teeLimitPlaceOrderParams.strategyTypeParam : null, (16758524 & 8388608) != 0 ? teeLimitPlaceOrderParams.teeSilentSignEnabled : false);
        teeLimitTransactionUseCase$createOrder$1.label = 1;
        java.lang.Object objEZpvd = abstractC19748gNw.EZpvd(teeLimitPlaceOrderParamsCopy, fragmentActivity, taskDescription, teeLimitTransactionUseCase$createOrder$1);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }
}
