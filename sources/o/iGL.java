package o;

import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import com.okinc.business.invest_biz.data.usecase.generate_content.GenerateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$1;
import com.okinc.business.invest_biz.data.usecase.generate_content.GenerateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$2;
import com.okinc.business.invest_biz.data.usecase.generate_content.GenerateDotSwapRedeemContentUseCase$invoke$1;
import com.okinc.business.invest_biz.data.usecase.generate_content.GenerateDotSwapRedeemContentUseCase$invoke$2;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iGL extends iXE {
    public final iCQ AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final C27164jpy KWHzl;
    public final iFL OLrzqt;
    public final InterfaceC23916iOb copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iGL(@NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull iFL ifl, @NotNull C27164jpy c27164jpy, @NotNull iCQ icq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(interfaceC23916iOb, c27164jpy);
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(ifl, "");
        Intrinsics.checkNotNullParameter(c27164jpy, "");
        Intrinsics.checkNotNullParameter(icq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC23916iOb;
        this.OLrzqt = ifl;
        this.KWHzl = c27164jpy;
        this.AEQbTJ = icq;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iXE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel initialInfoModel, iXB ixb, @NotNull Continuation<? super Result<? extends InterfaceC24182iXy>> continuation) {
        GenerateDotSwapRedeemContentUseCase$invoke$1 generateDotSwapRedeemContentUseCase$invoke$1;
        if (continuation instanceof GenerateDotSwapRedeemContentUseCase$invoke$1) {
            generateDotSwapRedeemContentUseCase$invoke$1 = (GenerateDotSwapRedeemContentUseCase$invoke$1) continuation;
            int i = generateDotSwapRedeemContentUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateDotSwapRedeemContentUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                generateDotSwapRedeemContentUseCase$invoke$1 = new GenerateDotSwapRedeemContentUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = generateDotSwapRedeemContentUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = generateDotSwapRedeemContentUseCase$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.EZpvd;
        GenerateDotSwapRedeemContentUseCase$invoke$2 generateDotSwapRedeemContentUseCase$invoke$2 = new GenerateDotSwapRedeemContentUseCase$invoke$2(initialInfoModel, ixb, this, transactionConfig, null);
        generateDotSwapRedeemContentUseCase$invoke$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, generateDotSwapRedeemContentUseCase$invoke$2, generateDotSwapRedeemContentUseCase$invoke$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(TransactionConfig transactionConfig, InitialInfoModel.RedeemInitialInfo redeemInitialInfo, iXB ixb, Continuation<? super Result<RedeemDetailsAndGasFee>> continuation) throws java.lang.Throwable {
        GenerateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$1 generateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$1;
        if (continuation instanceof GenerateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$1) {
            generateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$1 = (GenerateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$1) continuation;
            int i = generateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$1.label = i - Integer.MIN_VALUE;
            } else {
                generateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$1 = new GenerateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$1(this, continuation);
            }
        }
        java.lang.Object obj = generateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = generateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.EZpvd;
        GenerateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$2 generateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$2 = new GenerateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$2(ixb, redeemInitialInfo, this, transactionConfig, null);
        generateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, generateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$2, generateDotSwapRedeemContentUseCase$fetchReceiveInfoApi$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }
}
