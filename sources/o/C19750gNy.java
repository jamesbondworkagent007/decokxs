package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.tee.domain.model.SignAndBroadcastRes;
import com.okinc.business.dex.tee.domain.model.TeeMarketPlaceOrderParams;
import com.okinc.business.dex.tee.domain.usecase.market.TeeMarketTransactionUseCase$submitOrder$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gNy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19750gNy {
    public final C19700gMb AEQbTJ;
    public final C19744gNs KWHzl;
    public final C19746gNu OLrzqt;

    @yCM
    public C19750gNy(@NotNull C19700gMb c19700gMb, @NotNull C19746gNu c19746gNu, @NotNull C19744gNs c19744gNs) {
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c19746gNu, "");
        Intrinsics.checkNotNullParameter(c19744gNs, "");
        this.AEQbTJ = c19700gMb;
        this.OLrzqt = c19746gNu;
        this.KWHzl = c19744gNs;
    }

    /* JADX INFO: renamed from: submitOrder-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8603submitOrderyxL6bBk$default(C19750gNy c19750gNy, TeeMarketPlaceOrderParams teeMarketPlaceOrderParams, FragmentActivity fragmentActivity, InterfaceC9740bbL.TaskDescription taskDescription, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return c19750gNy.AEQbTJ(teeMarketPlaceOrderParams, fragmentActivity, taskDescription, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull TeeMarketPlaceOrderParams teeMarketPlaceOrderParams, @NotNull FragmentActivity fragmentActivity, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, boolean z, @NotNull Continuation<? super Result<SignAndBroadcastRes>> continuation) throws java.lang.Throwable {
        TeeMarketTransactionUseCase$submitOrder$1 teeMarketTransactionUseCase$submitOrder$1;
        if (continuation instanceof TeeMarketTransactionUseCase$submitOrder$1) {
            teeMarketTransactionUseCase$submitOrder$1 = (TeeMarketTransactionUseCase$submitOrder$1) continuation;
            int i = teeMarketTransactionUseCase$submitOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeMarketTransactionUseCase$submitOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                teeMarketTransactionUseCase$submitOrder$1 = new TeeMarketTransactionUseCase$submitOrder$1(this, continuation);
            }
        }
        TeeMarketTransactionUseCase$submitOrder$1 teeMarketTransactionUseCase$submitOrder$12 = teeMarketTransactionUseCase$submitOrder$1;
        java.lang.Object obj = teeMarketTransactionUseCase$submitOrder$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeMarketTransactionUseCase$submitOrder$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        AbstractC19751gNz abstractC19751gNz = this.AEQbTJ.OLrzqt(C33129mqd.valueOf(teeMarketPlaceOrderParams.getChainId())) ? this.OLrzqt : this.KWHzl;
        teeMarketTransactionUseCase$submitOrder$12.label = 1;
        java.lang.Object objKWHzl = abstractC19751gNz.KWHzl(teeMarketPlaceOrderParams, fragmentActivity, taskDescription, z, teeMarketTransactionUseCase$submitOrder$12);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }
}
