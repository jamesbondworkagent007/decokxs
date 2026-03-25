package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.SignType;
import com.okinc.business.defi.api.model.tx.signdata.BaseSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMMessageSignData;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.trade.features.home.meme.usecase.transaction.v6.pmm.MemeV6MarketEVMPMMTxUseCase$submitPMMOrder$1;
import com.okinc.business.trade.features.home.meme.usecase.transaction.v6.pmm.MemeV6MarketEVMPMMTxUseCase$submitPMMOrderbMdYcbs$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kXn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28333kXn extends AbstractC28329kXj {
    public final C28327kXh AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final kVE KWHzl;
    public final kKG OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28329kXj
    public kVE AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public C28333kXn(@NotNull kVE kve, @NotNull kKG kkg, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C28327kXh c28327kXh) {
        Intrinsics.checkNotNullParameter(kve, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c28327kXh, "");
        this.KWHzl = kve;
        this.OLrzqt = kkg;
        this.EZpvd = coroutineDispatcher;
        this.AEQbTJ = c28327kXh;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.AbstractC28329kXj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, java.lang.String str, int i, @NotNull FragmentActivity fragmentActivity, boolean z, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        MemeV6MarketEVMPMMTxUseCase$submitPMMOrder$1 memeV6MarketEVMPMMTxUseCase$submitPMMOrder$1;
        if (continuation instanceof MemeV6MarketEVMPMMTxUseCase$submitPMMOrder$1) {
            memeV6MarketEVMPMMTxUseCase$submitPMMOrder$1 = (MemeV6MarketEVMPMMTxUseCase$submitPMMOrder$1) continuation;
            int i2 = memeV6MarketEVMPMMTxUseCase$submitPMMOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                memeV6MarketEVMPMMTxUseCase$submitPMMOrder$1.label = i2 - Integer.MIN_VALUE;
            } else {
                memeV6MarketEVMPMMTxUseCase$submitPMMOrder$1 = new MemeV6MarketEVMPMMTxUseCase$submitPMMOrder$1(this, continuation);
            }
        }
        MemeV6MarketEVMPMMTxUseCase$submitPMMOrder$1 memeV6MarketEVMPMMTxUseCase$submitPMMOrder$12 = memeV6MarketEVMPMMTxUseCase$submitPMMOrder$1;
        java.lang.Object objWithContext = memeV6MarketEVMPMMTxUseCase$submitPMMOrder$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = memeV6MarketEVMPMMTxUseCase$submitPMMOrder$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            MemeV6MarketEVMPMMTxUseCase$submitPMMOrderbMdYcbs$$inlined$dexRunCatching$1 memeV6MarketEVMPMMTxUseCase$submitPMMOrderbMdYcbs$$inlined$dexRunCatching$1 = new MemeV6MarketEVMPMMTxUseCase$submitPMMOrderbMdYcbs$$inlined$dexRunCatching$1(null, v6BaseQuoteResponse, str, this, fragmentActivity, z, taskDescription, i);
            memeV6MarketEVMPMMTxUseCase$submitPMMOrder$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, memeV6MarketEVMPMMTxUseCase$submitPMMOrderbMdYcbs$$inlined$dexRunCatching$1, memeV6MarketEVMPMMTxUseCase$submitPMMOrder$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final BaseSignData EZpvd(java.lang.String str) {
        return new EVMMessageSignData(str, false, null, SignType.TYPED_MESSAGE, str, null, null, 102, null);
    }
}
