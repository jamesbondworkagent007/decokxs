package o;

import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.usecase.generate_content.GenerateLybraRedeemContentUseCase$invoke$1;
import com.okinc.business.invest_biz.data.usecase.generate_content.GenerateLybraRedeemContentUseCase$invoke$2;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iGM extends iXE {
    public final InterfaceC23916iOb AEQbTJ;
    public final iCY EZpvd;
    public final C27164jpy KWHzl;
    public final iFL OLrzqt;
    public final CoroutineDispatcher copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iGM(@NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull iFL ifl, @NotNull C27164jpy c27164jpy, @NotNull iCY icy, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(interfaceC23916iOb, c27164jpy);
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(ifl, "");
        Intrinsics.checkNotNullParameter(c27164jpy, "");
        Intrinsics.checkNotNullParameter(icy, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC23916iOb;
        this.OLrzqt = ifl;
        this.KWHzl = c27164jpy;
        this.EZpvd = icy;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iXE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel initialInfoModel, iXB ixb, @NotNull Continuation<? super Result<? extends InterfaceC24182iXy>> continuation) {
        GenerateLybraRedeemContentUseCase$invoke$1 generateLybraRedeemContentUseCase$invoke$1;
        if (continuation instanceof GenerateLybraRedeemContentUseCase$invoke$1) {
            generateLybraRedeemContentUseCase$invoke$1 = (GenerateLybraRedeemContentUseCase$invoke$1) continuation;
            int i = generateLybraRedeemContentUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateLybraRedeemContentUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                generateLybraRedeemContentUseCase$invoke$1 = new GenerateLybraRedeemContentUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = generateLybraRedeemContentUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = generateLybraRedeemContentUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            GenerateLybraRedeemContentUseCase$invoke$2 generateLybraRedeemContentUseCase$invoke$2 = new GenerateLybraRedeemContentUseCase$invoke$2(initialInfoModel, ixb, this, transactionConfig, null);
            generateLybraRedeemContentUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, generateLybraRedeemContentUseCase$invoke$2, generateLybraRedeemContentUseCase$invoke$1);
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
