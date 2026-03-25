package o;

import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.usecase.GetRedeemInitialInfoUseCaseImpl$invoke$1;
import com.okinc.business.invest_biz.data.usecase.GetRedeemInitialInfoUseCaseImpl$invoke$2;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iFK implements iXG {
    public final iNQ AEQbTJ;
    public final java.util.Map<C23621iDd, InitialInfoModel.RedeemInitialInfo> KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final InterfaceC23916iOb copydefault;

    @yCM
    public iFK(@NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull iNQ inq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(inq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC23916iOb;
        this.AEQbTJ = inq;
        this.OLrzqt = coroutineDispatcher;
        this.KWHzl = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iXG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull TransactionConfig transactionConfig, @NotNull Continuation<? super Result<? extends InitialInfoModel>> continuation) {
        GetRedeemInitialInfoUseCaseImpl$invoke$1 getRedeemInitialInfoUseCaseImpl$invoke$1;
        if (continuation instanceof GetRedeemInitialInfoUseCaseImpl$invoke$1) {
            getRedeemInitialInfoUseCaseImpl$invoke$1 = (GetRedeemInitialInfoUseCaseImpl$invoke$1) continuation;
            int i = getRedeemInitialInfoUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRedeemInitialInfoUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getRedeemInitialInfoUseCaseImpl$invoke$1 = new GetRedeemInitialInfoUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = getRedeemInitialInfoUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getRedeemInitialInfoUseCaseImpl$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
        GetRedeemInitialInfoUseCaseImpl$invoke$2 getRedeemInitialInfoUseCaseImpl$invoke$2 = new GetRedeemInitialInfoUseCaseImpl$invoke$2(transactionConfig, this, null);
        getRedeemInitialInfoUseCaseImpl$invoke$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, getRedeemInitialInfoUseCaseImpl$invoke$2, getRedeemInitialInfoUseCaseImpl$invoke$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    @Override // o.iXG
    public java.lang.Object copydefault(@NotNull Continuation<? super Unit> continuation) {
        this.KWHzl.clear();
        return Unit.INSTANCE;
    }
}
