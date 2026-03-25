package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.model.tx.signdata.MessageSignData;
import com.okinc.business.dex.tee.domain.model.SignAndBroadcastRes;
import com.okinc.business.dex.tee.domain.model.TeeMarketPlaceOrderParams;
import com.okinc.business.dex.tee.domain.model.TransactionIntentData;
import com.okinc.business.dex.tee.domain.usecase.market.TeeMarketTxUseCase$submitOrder$1;
import com.okinc.business.dex.tee.domain.usecase.market.TeeMarketTxUseCase$submitOrderyxL6bBk$suspendImpl$$inlined$dexRunCatching$1;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gNz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19751gNz {
    public final C19734gNi AYXKKw;
    public final CoroutineDispatcher AhwBna;
    public final C19735gNj AkhnZx;
    public final C19700gMb DbNXlk;
    public final C19747gNv djBIcL;
    public final C23212htv fetchVPNInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object KWHzl(@NotNull TeeMarketPlaceOrderParams teeMarketPlaceOrderParams, @NotNull FragmentActivity fragmentActivity, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, boolean z, @NotNull Continuation<? super Result<SignAndBroadcastRes>> continuation) {
        return EZpvd(this, teeMarketPlaceOrderParams, fragmentActivity, taskDescription, z, continuation);
    }

    public abstract MessageSignData OLrzqt(@NotNull java.lang.String str);

    public AbstractC19751gNz(@NotNull C19734gNi c19734gNi, @NotNull C19700gMb c19700gMb, @NotNull C19735gNj c19735gNj, @NotNull C19747gNv c19747gNv, @NotNull C23212htv c23212htv, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c19734gNi, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c19735gNj, "");
        Intrinsics.checkNotNullParameter(c19747gNv, "");
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AYXKKw = c19734gNi;
        this.DbNXlk = c19700gMb;
        this.AkhnZx = c19735gNj;
        this.djBIcL = c19747gNv;
        this.fetchVPNInfo = c23212htv;
        this.AhwBna = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object EZpvd(AbstractC19751gNz abstractC19751gNz, TeeMarketPlaceOrderParams teeMarketPlaceOrderParams, FragmentActivity fragmentActivity, InterfaceC9740bbL.TaskDescription taskDescription, boolean z, Continuation<? super Result<SignAndBroadcastRes>> continuation) throws java.lang.Throwable {
        TeeMarketTxUseCase$submitOrder$1 teeMarketTxUseCase$submitOrder$1;
        if (continuation instanceof TeeMarketTxUseCase$submitOrder$1) {
            teeMarketTxUseCase$submitOrder$1 = (TeeMarketTxUseCase$submitOrder$1) continuation;
            int i = teeMarketTxUseCase$submitOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeMarketTxUseCase$submitOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                teeMarketTxUseCase$submitOrder$1 = new TeeMarketTxUseCase$submitOrder$1(abstractC19751gNz, continuation);
            }
        }
        TeeMarketTxUseCase$submitOrder$1 teeMarketTxUseCase$submitOrder$12 = teeMarketTxUseCase$submitOrder$1;
        java.lang.Object objWithContext = teeMarketTxUseCase$submitOrder$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeMarketTxUseCase$submitOrder$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            long jValueOf = C33129mqd.valueOf(C23313hvq.addCheckS$default(C56443yFo.KWHzl(jCurrentTimeMillis), teeMarketPlaceOrderParams.getExpireTime(), null, null, null, 14, null));
            C19734gNi c19734gNi = abstractC19751gNz.AYXKKw;
            TransactionIntentData transactionIntentDataEZpvd = abstractC19751gNz.AkhnZx.EZpvd(teeMarketPlaceOrderParams, jCurrentTimeMillis, jValueOf);
            ServiceFeeInfo serviceFeeInfo = teeMarketPlaceOrderParams.getServiceFeeInfo();
            if (serviceFeeInfo != null && serviceFeeInfo.isCharge() && !Intrinsics.EZpvd((java.lang.Object) teeMarketPlaceOrderParams.getServiceFeeInfo().getReferralCommissionAddress(), (java.lang.Object) transactionIntentDataEZpvd.getReferrerAddress())) {
                C31200lpY.AEQbTJ(new OKServerException(0, "referral address is not match " + ("serviceInfoRef: " + teeMarketPlaceOrderParams.getServiceFeeInfo().getReferralCommissionAddress() + ">>>localRef:" + transactionIntentDataEZpvd.getReferrerAddress()), null, null, 13, null));
            }
            java.lang.String strAEQbTJ = c19734gNi.AEQbTJ(transactionIntentDataEZpvd);
            long jValueOf2 = C33129mqd.valueOf(teeMarketPlaceOrderParams.getChainId());
            CoroutineDispatcher coroutineDispatcher = abstractC19751gNz.AhwBna;
            TeeMarketTxUseCase$submitOrderyxL6bBk$suspendImpl$$inlined$dexRunCatching$1 teeMarketTxUseCase$submitOrderyxL6bBk$suspendImpl$$inlined$dexRunCatching$1 = new TeeMarketTxUseCase$submitOrderyxL6bBk$suspendImpl$$inlined$dexRunCatching$1(null, abstractC19751gNz, jValueOf2, strAEQbTJ, z, fragmentActivity, taskDescription, teeMarketPlaceOrderParams, jValueOf);
            teeMarketTxUseCase$submitOrder$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, teeMarketTxUseCase$submitOrderyxL6bBk$suspendImpl$$inlined$dexRunCatching$1, teeMarketTxUseCase$submitOrder$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: submitOrder-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8604submitOrderyxL6bBk$default(AbstractC19751gNz abstractC19751gNz, TeeMarketPlaceOrderParams teeMarketPlaceOrderParams, FragmentActivity fragmentActivity, InterfaceC9740bbL.TaskDescription taskDescription, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitOrder-yxL6bBk");
        }
        if ((i & 8) != 0) {
            z = true;
        }
        return abstractC19751gNz.KWHzl(teeMarketPlaceOrderParams, fragmentActivity, taskDescription, z, continuation);
    }
}
