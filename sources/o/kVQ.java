package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenDetailReq;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.meme.usecase.MemeCoinListUseCase$tokenAdd$1;
import com.okinc.business.trade.features.home.meme.usecase.MemeCoinListUseCase$tokenAddgIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class kVQ {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC28274kVi copydefault;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull DexMultiTokenDetailReq dexMultiTokenDetailReq, @NotNull Continuation<? super Result<? extends java.util.List<DexMultiTokenInfoBean>>> continuation) {
        MemeCoinListUseCase$tokenAdd$1 memeCoinListUseCase$tokenAdd$1;
        if (continuation instanceof MemeCoinListUseCase$tokenAdd$1) {
            memeCoinListUseCase$tokenAdd$1 = (MemeCoinListUseCase$tokenAdd$1) continuation;
            int i = memeCoinListUseCase$tokenAdd$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeCoinListUseCase$tokenAdd$1.label = i - Integer.MIN_VALUE;
            } else {
                memeCoinListUseCase$tokenAdd$1 = new MemeCoinListUseCase$tokenAdd$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = memeCoinListUseCase$tokenAdd$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeCoinListUseCase$tokenAdd$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            MemeCoinListUseCase$tokenAddgIAlus$$inlined$dexRunCatching$1 memeCoinListUseCase$tokenAddgIAlus$$inlined$dexRunCatching$1 = new MemeCoinListUseCase$tokenAddgIAlus$$inlined$dexRunCatching$1(null, this, dexMultiTokenDetailReq);
            memeCoinListUseCase$tokenAdd$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, memeCoinListUseCase$tokenAddgIAlus$$inlined$dexRunCatching$1, memeCoinListUseCase$tokenAdd$1);
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
