package o;

import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import com.okinc.business.invest_biz.data.usecase.generate_content.GenerateBabylonRedeemContentUseCase$fetchReceiveInfoApi$1;
import com.okinc.business.invest_biz.data.usecase.generate_content.GenerateBabylonRedeemContentUseCase$fetchReceiveInfoApi$2;
import com.okinc.business.invest_biz.data.usecase.generate_content.GenerateBabylonRedeemContentUseCase$invoke$1;
import com.okinc.business.invest_biz.data.usecase.generate_content.GenerateBabylonRedeemContentUseCase$invoke$2;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iGG extends iXE {
    public final iCO AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final iFL KWHzl;
    public final InterfaceC23916iOb OLrzqt;
    public final C27164jpy copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public iGG(@NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull iFL ifl, @NotNull C27164jpy c27164jpy, @NotNull iCO ico, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(interfaceC23916iOb, c27164jpy);
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(ifl, "");
        Intrinsics.checkNotNullParameter(c27164jpy, "");
        Intrinsics.checkNotNullParameter(ico, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC23916iOb;
        this.KWHzl = ifl;
        this.copydefault = c27164jpy;
        this.AEQbTJ = ico;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iXE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel initialInfoModel, iXB ixb, @NotNull Continuation<? super Result<? extends InterfaceC24182iXy>> continuation) {
        GenerateBabylonRedeemContentUseCase$invoke$1 generateBabylonRedeemContentUseCase$invoke$1;
        if (continuation instanceof GenerateBabylonRedeemContentUseCase$invoke$1) {
            generateBabylonRedeemContentUseCase$invoke$1 = (GenerateBabylonRedeemContentUseCase$invoke$1) continuation;
            int i = generateBabylonRedeemContentUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateBabylonRedeemContentUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                generateBabylonRedeemContentUseCase$invoke$1 = new GenerateBabylonRedeemContentUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = generateBabylonRedeemContentUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = generateBabylonRedeemContentUseCase$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.EZpvd;
        GenerateBabylonRedeemContentUseCase$invoke$2 generateBabylonRedeemContentUseCase$invoke$2 = new GenerateBabylonRedeemContentUseCase$invoke$2(initialInfoModel, transactionConfig, this, ixb, null);
        generateBabylonRedeemContentUseCase$invoke$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, generateBabylonRedeemContentUseCase$invoke$2, generateBabylonRedeemContentUseCase$invoke$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(TransactionConfig transactionConfig, InitialInfoModel.RedeemInitialInfo redeemInitialInfo, Continuation<? super Result<RedeemDetailsAndGasFee>> continuation) throws java.lang.Throwable {
        GenerateBabylonRedeemContentUseCase$fetchReceiveInfoApi$1 generateBabylonRedeemContentUseCase$fetchReceiveInfoApi$1;
        if (continuation instanceof GenerateBabylonRedeemContentUseCase$fetchReceiveInfoApi$1) {
            generateBabylonRedeemContentUseCase$fetchReceiveInfoApi$1 = (GenerateBabylonRedeemContentUseCase$fetchReceiveInfoApi$1) continuation;
            int i = generateBabylonRedeemContentUseCase$fetchReceiveInfoApi$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateBabylonRedeemContentUseCase$fetchReceiveInfoApi$1.label = i - Integer.MIN_VALUE;
            } else {
                generateBabylonRedeemContentUseCase$fetchReceiveInfoApi$1 = new GenerateBabylonRedeemContentUseCase$fetchReceiveInfoApi$1(this, continuation);
            }
        }
        java.lang.Object obj = generateBabylonRedeemContentUseCase$fetchReceiveInfoApi$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = generateBabylonRedeemContentUseCase$fetchReceiveInfoApi$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.EZpvd;
        GenerateBabylonRedeemContentUseCase$fetchReceiveInfoApi$2 generateBabylonRedeemContentUseCase$fetchReceiveInfoApi$2 = new GenerateBabylonRedeemContentUseCase$fetchReceiveInfoApi$2(redeemInitialInfo, this, transactionConfig, null);
        generateBabylonRedeemContentUseCase$fetchReceiveInfoApi$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, generateBabylonRedeemContentUseCase$fetchReceiveInfoApi$2, generateBabylonRedeemContentUseCase$fetchReceiveInfoApi$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }
}
