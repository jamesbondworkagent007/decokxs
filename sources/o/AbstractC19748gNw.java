package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.model.tx.signdata.MessageSignData;
import com.okinc.business.dex.tee.domain.model.TeeLimitPlaceOrderParams;
import com.okinc.business.dex.tee.domain.usecase.limit.TeeLimitTxUseCase$createOrder$1;
import com.okinc.business.dex.tee.domain.usecase.limit.TeeLimitTxUseCase$createOrderBWLJW6A$suspendImpl$$inlined$dexRunCatching$1;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gNw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19748gNw {
    public final C19739gNn AYXKKw;
    public final C19737gNl AkhnZx;
    public final C19734gNi djBIcL;
    public final C23212htv fetchVPNInfo;
    public final CoroutineDispatcher gEmmrt;
    public final C19700gMb isConnected;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object EZpvd(@NotNull TeeLimitPlaceOrderParams teeLimitPlaceOrderParams, @NotNull FragmentActivity fragmentActivity, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, @NotNull Continuation<? super Result<LimitOrderDetailBean>> continuation) {
        return OLrzqt(this, teeLimitPlaceOrderParams, fragmentActivity, taskDescription, continuation);
    }

    public abstract MessageSignData KWHzl(@NotNull java.lang.String str);

    public AbstractC19748gNw(@NotNull C19734gNi c19734gNi, @NotNull C19700gMb c19700gMb, @NotNull C19737gNl c19737gNl, @NotNull C19739gNn c19739gNn, @NotNull C23212htv c23212htv, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c19734gNi, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c19737gNl, "");
        Intrinsics.checkNotNullParameter(c19739gNn, "");
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.djBIcL = c19734gNi;
        this.isConnected = c19700gMb;
        this.AkhnZx = c19737gNl;
        this.AYXKKw = c19739gNn;
        this.fetchVPNInfo = c23212htv;
        this.gEmmrt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object OLrzqt(AbstractC19748gNw abstractC19748gNw, TeeLimitPlaceOrderParams teeLimitPlaceOrderParams, FragmentActivity fragmentActivity, InterfaceC9740bbL.TaskDescription taskDescription, Continuation<? super Result<LimitOrderDetailBean>> continuation) throws java.lang.Throwable {
        TeeLimitTxUseCase$createOrder$1 teeLimitTxUseCase$createOrder$1;
        java.lang.String strAddCheckS$default;
        if (continuation instanceof TeeLimitTxUseCase$createOrder$1) {
            teeLimitTxUseCase$createOrder$1 = (TeeLimitTxUseCase$createOrder$1) continuation;
            int i = teeLimitTxUseCase$createOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeLimitTxUseCase$createOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                teeLimitTxUseCase$createOrder$1 = new TeeLimitTxUseCase$createOrder$1(abstractC19748gNw, continuation);
            }
        }
        TeeLimitTxUseCase$createOrder$1 teeLimitTxUseCase$createOrder$12 = teeLimitTxUseCase$createOrder$1;
        java.lang.Object objWithContext = teeLimitTxUseCase$createOrder$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeLimitTxUseCase$createOrder$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (teeLimitPlaceOrderParams.isCustomExpireTime()) {
                strAddCheckS$default = teeLimitPlaceOrderParams.getExpireTime();
            } else {
                strAddCheckS$default = C23313hvq.addCheckS$default(C56443yFo.KWHzl(jCurrentTimeMillis), teeLimitPlaceOrderParams.getExpireTime(), null, null, null, 14, null);
            }
            long jValueOf = C33129mqd.valueOf(strAddCheckS$default);
            java.lang.String strEZpvd = abstractC19748gNw.djBIcL.EZpvd(abstractC19748gNw.AkhnZx.OLrzqt(teeLimitPlaceOrderParams, jCurrentTimeMillis, jValueOf));
            long jValueOf2 = C33129mqd.valueOf(teeLimitPlaceOrderParams.getChainId());
            CoroutineDispatcher coroutineDispatcher = abstractC19748gNw.gEmmrt;
            TeeLimitTxUseCase$createOrderBWLJW6A$suspendImpl$$inlined$dexRunCatching$1 teeLimitTxUseCase$createOrderBWLJW6A$suspendImpl$$inlined$dexRunCatching$1 = new TeeLimitTxUseCase$createOrderBWLJW6A$suspendImpl$$inlined$dexRunCatching$1(null, abstractC19748gNw, jValueOf2, strEZpvd, teeLimitPlaceOrderParams, fragmentActivity, taskDescription, jValueOf);
            teeLimitTxUseCase$createOrder$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, teeLimitTxUseCase$createOrderBWLJW6A$suspendImpl$$inlined$dexRunCatching$1, teeLimitTxUseCase$createOrder$12);
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
}
