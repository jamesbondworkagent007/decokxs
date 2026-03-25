package o;

import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestSlippageConfig;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.usecase.GenerateContentUseCase$getBTCPubKey$1;
import com.okinc.business.invest_biz.ui.screens.base_transaction.usecase.GenerateContentUseCase$getWallet$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iXE {
    public final C27164jpy AYXKKw;
    public final InterfaceC23916iOb gEmmrt;

    public abstract java.lang.Object copydefault(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel initialInfoModel, iXB ixb, @NotNull Continuation<? super Result<? extends InterfaceC24182iXy>> continuation);

    public iXE(@NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull C27164jpy c27164jpy) {
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(c27164jpy, "");
        this.gEmmrt = interfaceC23916iOb;
        this.AYXKKw = c27164jpy;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super InterfaceC9738bbJ> continuation) throws java.lang.Throwable {
        GenerateContentUseCase$getWallet$1 generateContentUseCase$getWallet$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof GenerateContentUseCase$getWallet$1) {
            generateContentUseCase$getWallet$1 = (GenerateContentUseCase$getWallet$1) continuation;
            int i = generateContentUseCase$getWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateContentUseCase$getWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                generateContentUseCase$getWallet$1 = new GenerateContentUseCase$getWallet$1(this, continuation);
            }
        }
        java.lang.Object objAwait = generateContentUseCase$getWallet$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = generateContentUseCase$getWallet$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                Result.Application application = Result.Companion;
                AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = this.gEmmrt.gEmmrt().KWHzl();
                generateContentUseCase$getWallet$1.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtKWHzl, generateContentUseCase$getWallet$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAwait);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC9738bbJ) objAwait);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }

    public static /* synthetic */ java.lang.Object getBTCPubKey$default(iXE ixe, long j, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBTCPubKey");
        }
        if ((i & 1) != 0) {
            j = 0;
        }
        return ixe.AEQbTJ(j, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0072 A[Catch: all -> 0x0086, CancellationException -> 0x00a0, TryCatch #2 {CancellationException -> 0x00a0, all -> 0x0086, blocks: (B:13:0x0031, B:31:0x006e, B:33:0x0072, B:37:0x007b, B:39:0x0081, B:18:0x0043, B:25:0x005a, B:27:0x005e, B:21:0x004a), top: B:54:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(long j, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        GenerateContentUseCase$getBTCPubKey$1 generateContentUseCase$getBTCPubKey$1;
        java.lang.Object objM7377constructorimpl;
        iXE ixe;
        java.lang.String strEZpvd;
        InterfaceC9738bbJ interfaceC9738bbJ;
        java.lang.String strEZpvd2;
        if (continuation instanceof GenerateContentUseCase$getBTCPubKey$1) {
            generateContentUseCase$getBTCPubKey$1 = (GenerateContentUseCase$getBTCPubKey$1) continuation;
            int i = generateContentUseCase$getBTCPubKey$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                generateContentUseCase$getBTCPubKey$1.label = i - Integer.MIN_VALUE;
            } else {
                generateContentUseCase$getBTCPubKey$1 = new GenerateContentUseCase$getBTCPubKey$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = generateContentUseCase$getBTCPubKey$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = generateContentUseCase$getBTCPubKey$1.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            Result.Application application2 = Result.Companion;
            generateContentUseCase$getBTCPubKey$1.L$0 = this;
            generateContentUseCase$getBTCPubKey$1.J$0 = j;
            generateContentUseCase$getBTCPubKey$1.label = 1;
            objOLrzqt = OLrzqt(generateContentUseCase$getBTCPubKey$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            ixe = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = generateContentUseCase$getBTCPubKey$1.J$0;
                interfaceC9738bbJ = (InterfaceC9738bbJ) generateContentUseCase$getBTCPubKey$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                InterfaceC9738bbJ interfaceC9738bbJ2 = (InterfaceC9738bbJ) objOLrzqt;
                strEZpvd2 = interfaceC9738bbJ2 == null ? interfaceC9738bbJ2.EZpvd(j) : null;
                if (strEZpvd2 == null) {
                    strEZpvd2 = "";
                }
                strEZpvd = interfaceC9738bbJ.EZpvd(strEZpvd2);
                objM7377constructorimpl = Result.m7377constructorimpl(strEZpvd);
                java.lang.String str = (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                return str == null ? "" : str;
            }
            j = generateContentUseCase$getBTCPubKey$1.J$0;
            ixe = (iXE) generateContentUseCase$getBTCPubKey$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        InterfaceC9738bbJ interfaceC9738bbJ3 = (InterfaceC9738bbJ) objOLrzqt;
        if (interfaceC9738bbJ3 != null) {
            generateContentUseCase$getBTCPubKey$1.L$0 = interfaceC9738bbJ3;
            generateContentUseCase$getBTCPubKey$1.J$0 = j;
            generateContentUseCase$getBTCPubKey$1.label = 2;
            java.lang.Object objOLrzqt2 = ixe.OLrzqt(generateContentUseCase$getBTCPubKey$1);
            if (objOLrzqt2 == objCopydefault) {
                return objCopydefault;
            }
            interfaceC9738bbJ = interfaceC9738bbJ3;
            objOLrzqt = objOLrzqt2;
            InterfaceC9738bbJ interfaceC9738bbJ22 = (InterfaceC9738bbJ) objOLrzqt;
            if (interfaceC9738bbJ22 == null) {
            }
            if (strEZpvd2 == null) {
            }
            strEZpvd = interfaceC9738bbJ.EZpvd(strEZpvd2);
            objM7377constructorimpl = Result.m7377constructorimpl(strEZpvd);
            java.lang.String str2 = (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            if (str2 == null) {
            }
        } else {
            strEZpvd = null;
            objM7377constructorimpl = Result.m7377constructorimpl(strEZpvd);
            java.lang.String str22 = (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            if (str22 == null) {
            }
        }
    }

    public final java.lang.String EZpvd(@NotNull TransactionConfig transactionConfig, @NotNull InvestGasPriceConfig investGasPriceConfig) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        this.AYXKKw.copydefault();
        C27164jpy c27164jpy = this.AYXKKw;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(transactionConfig.copydefault()));
        InvestSlippageConfig investSlippage = investGasPriceConfig.getInvestSlippage();
        java.lang.String automaticValue = investSlippage != null ? investSlippage.getAutomaticValue() : null;
        InvestSlippageConfig investSlippage2 = investGasPriceConfig.getInvestSlippage();
        java.lang.String customMax = investSlippage2 != null ? investSlippage2.getCustomMax() : null;
        InvestSlippageConfig investSlippage3 = investGasPriceConfig.getInvestSlippage();
        return c27164jpy.AEQbTJ(strGEmmrt, automaticValue, customMax, investSlippage3 != null ? java.lang.Integer.valueOf(investSlippage3.getType()) : null).getFirst();
    }
}
