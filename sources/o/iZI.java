package o;

import com.okinc.business.invest_biz.data.bean.request.DashboardTokenDetailReq;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.use_case.DeFiTokenModelAssetDetailUseCaseImpl$invoke$1;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.use_case.DeFiTokenModelAssetDetailUseCaseImpl$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iZI implements iZF {
    public final CoroutineDispatcher KWHzl;
    public final iDL OLrzqt;
    public final C23580iBq copydefault;

    @yCM
    public iZI(@NotNull iDL idl, @NotNull C23580iBq c23580iBq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(idl, "");
        Intrinsics.checkNotNullParameter(c23580iBq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = idl;
        this.copydefault = c23580iBq;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iZF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.util.List<DashboardTokenDetailReq> list, @NotNull Continuation<? super Result<iEC>> continuation) {
        DeFiTokenModelAssetDetailUseCaseImpl$invoke$1 deFiTokenModelAssetDetailUseCaseImpl$invoke$1;
        java.lang.String strCopydefault;
        if (continuation instanceof DeFiTokenModelAssetDetailUseCaseImpl$invoke$1) {
            deFiTokenModelAssetDetailUseCaseImpl$invoke$1 = (DeFiTokenModelAssetDetailUseCaseImpl$invoke$1) continuation;
            int i = deFiTokenModelAssetDetailUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiTokenModelAssetDetailUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiTokenModelAssetDetailUseCaseImpl$invoke$1 = new DeFiTokenModelAssetDetailUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = deFiTokenModelAssetDetailUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiTokenModelAssetDetailUseCaseImpl$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        if (C24193iYi.OLrzqt.AEQbTJ() || (strCopydefault = this.copydefault.copydefault()) == null) {
            strCopydefault = "";
        }
        CoroutineDispatcher coroutineDispatcher = this.KWHzl;
        DeFiTokenModelAssetDetailUseCaseImpl$invoke$2 deFiTokenModelAssetDetailUseCaseImpl$invoke$2 = new DeFiTokenModelAssetDetailUseCaseImpl$invoke$2(this, strCopydefault, list, null);
        deFiTokenModelAssetDetailUseCaseImpl$invoke$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, deFiTokenModelAssetDetailUseCaseImpl$invoke$2, deFiTokenModelAssetDetailUseCaseImpl$invoke$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }
}
