package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.SignType;
import com.okinc.business.defi.api.model.tx.signdata.BaseSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVMMessageSignData;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketNonSolPMMTxV6UseCase$submitPMMOrder$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketNonSolPMMTxV6UseCase$submitPMMOrderhUnOzRk$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kRo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28172kRo extends AbstractC28177kRt {
    public final C28196kSl EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final C28180kRw OLrzqt;

    @yCM
    public C28172kRo(@NotNull C28196kSl c28196kSl, @NotNull C28180kRw c28180kRw, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c28196kSl, "");
        Intrinsics.checkNotNullParameter(c28180kRw, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = c28196kSl;
        this.OLrzqt = c28180kRw;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.AbstractC28177kRt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, int i, @NotNull FragmentActivity fragmentActivity, boolean z, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        AdvancedMarketNonSolPMMTxV6UseCase$submitPMMOrder$1 advancedMarketNonSolPMMTxV6UseCase$submitPMMOrder$1;
        if (continuation instanceof AdvancedMarketNonSolPMMTxV6UseCase$submitPMMOrder$1) {
            advancedMarketNonSolPMMTxV6UseCase$submitPMMOrder$1 = (AdvancedMarketNonSolPMMTxV6UseCase$submitPMMOrder$1) continuation;
            int i2 = advancedMarketNonSolPMMTxV6UseCase$submitPMMOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                advancedMarketNonSolPMMTxV6UseCase$submitPMMOrder$1.label = i2 - Integer.MIN_VALUE;
            } else {
                advancedMarketNonSolPMMTxV6UseCase$submitPMMOrder$1 = new AdvancedMarketNonSolPMMTxV6UseCase$submitPMMOrder$1(this, continuation);
            }
        }
        AdvancedMarketNonSolPMMTxV6UseCase$submitPMMOrder$1 advancedMarketNonSolPMMTxV6UseCase$submitPMMOrder$12 = advancedMarketNonSolPMMTxV6UseCase$submitPMMOrder$1;
        java.lang.Object objWithContext = advancedMarketNonSolPMMTxV6UseCase$submitPMMOrder$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = advancedMarketNonSolPMMTxV6UseCase$submitPMMOrder$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            AdvancedMarketNonSolPMMTxV6UseCase$submitPMMOrderhUnOzRk$$inlined$dexRunCatching$1 advancedMarketNonSolPMMTxV6UseCase$submitPMMOrderhUnOzRk$$inlined$dexRunCatching$1 = new AdvancedMarketNonSolPMMTxV6UseCase$submitPMMOrderhUnOzRk$$inlined$dexRunCatching$1(null, v6BaseQuoteResponse, this, fragmentActivity, z, taskDescription, i);
            advancedMarketNonSolPMMTxV6UseCase$submitPMMOrder$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedMarketNonSolPMMTxV6UseCase$submitPMMOrderhUnOzRk$$inlined$dexRunCatching$1, advancedMarketNonSolPMMTxV6UseCase$submitPMMOrder$12);
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

    public final BaseSignData KWHzl(java.lang.String str) {
        return new EVMMessageSignData(str, false, null, SignType.TYPED_MESSAGE, str, null, null, 102, null);
    }
}
