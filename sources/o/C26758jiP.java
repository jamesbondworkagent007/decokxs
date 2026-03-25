package o;

import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.ReserveBean;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.transaction.usecase.SettleTransactionUseCaseImpl$invoke$1;
import com.okinc.business.invest_biz.ui.screens.transaction.usecase.SettleTransactionUseCaseImpl$invoke$2;
import com.okinc.business.invest_biz.ui.screens.transaction.usecase.SettleTransactionUseCaseImpl$requestDataCallback$1$1$job$1;
import com.okinc.business.invest_biz.ui.screens.transaction.usecase.SettleTransactionUseCaseImpl$submitTransactionCallback$1$1$job$1;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jiP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26758jiP implements iXN {
    public final InterfaceC23916iOb AEQbTJ;
    public final yHS<NewCallbackBean, InvestTxModel, TransactionConfig, java.lang.String, InvestTokenWithAmount, AbstractC58185ywX<ResponseData<java.lang.String>>> AYXKKw;
    public java.lang.String AhwBna;
    public final iFN EZpvd;
    public java.lang.Integer KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final iFJ copydefault;
    public final Function2<NewCallbackBean, InvestTxModel, AbstractC58185ywX<ResponseData<java.lang.String>>> djBIcL;
    public final InterfaceC24171iXn fetchVPNInfo;
    public java.lang.Integer gEmmrt;
    public final C23724iGz valueOf;
    public final iCK values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.Integer num) {
        this.gEmmrt = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.Integer num) {
        this.KWHzl = num;
    }

    public C26758jiP(@NotNull InterfaceC24171iXn interfaceC24171iXn, @NotNull iFN ifn, @NotNull iFJ ifj, @NotNull C23724iGz c23724iGz, @NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull iCK ick, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC24171iXn, "");
        Intrinsics.checkNotNullParameter(ifn, "");
        Intrinsics.checkNotNullParameter(ifj, "");
        Intrinsics.checkNotNullParameter(c23724iGz, "");
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(ick, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.fetchVPNInfo = interfaceC24171iXn;
        this.EZpvd = ifn;
        this.copydefault = ifj;
        this.valueOf = c23724iGz;
        this.AEQbTJ = interfaceC23916iOb;
        this.values = ick;
        this.OLrzqt = coroutineDispatcher;
        this.AYXKKw = new yHS() { // from class: o.jiM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHS
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                return C26758jiP.EZpvd(this.KWHzl, (NewCallbackBean) obj, (InvestTxModel) obj2, (TransactionConfig) obj3, (java.lang.String) obj4, (InvestTokenWithAmount) obj5);
            }
        };
        this.djBIcL = new Function2() { // from class: o.jiR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C26758jiP.AEQbTJ(this.EZpvd, (NewCallbackBean) obj, (InvestTxModel) obj2);
            }
        };
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yCM
    public C26758jiP(@NotNull InterfaceC24171iXn interfaceC24171iXn, @NotNull iFN ifn, @NotNull iFJ ifj, @NotNull C23724iGz c23724iGz, @NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this(interfaceC24171iXn, ifn, ifj, c23724iGz, interfaceC23916iOb, iCK.AEQbTJ, coroutineDispatcher);
        Intrinsics.checkNotNullParameter(interfaceC24171iXn, "");
        Intrinsics.checkNotNullParameter(ifn, "");
        Intrinsics.checkNotNullParameter(ifj, "");
        Intrinsics.checkNotNullParameter(c23724iGz, "");
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
    }

    @Override // o.iXN
    public InvestTradeManager.TransactionResultExtraData copydefault() {
        return new InvestTradeManager.TransactionResultExtraData(this.KWHzl, this.AhwBna, this.gEmmrt);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iXN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull TransactionConfig transactionConfig, @NotNull InterfaceC24182iXy interfaceC24182iXy, @NotNull InvestTxModel investTxModel, @NotNull Continuation<? super Result<C24183iXz>> continuation) {
        SettleTransactionUseCaseImpl$invoke$1 settleTransactionUseCaseImpl$invoke$1;
        if (continuation instanceof SettleTransactionUseCaseImpl$invoke$1) {
            settleTransactionUseCaseImpl$invoke$1 = (SettleTransactionUseCaseImpl$invoke$1) continuation;
            int i = settleTransactionUseCaseImpl$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                settleTransactionUseCaseImpl$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                settleTransactionUseCaseImpl$invoke$1 = new SettleTransactionUseCaseImpl$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = settleTransactionUseCaseImpl$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = settleTransactionUseCaseImpl$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            SettleTransactionUseCaseImpl$invoke$2 settleTransactionUseCaseImpl$invoke$2 = new SettleTransactionUseCaseImpl$invoke$2(investTxModel, transactionConfig, this, interfaceC24182iXy, null);
            settleTransactionUseCaseImpl$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, settleTransactionUseCaseImpl$invoke$2, settleTransactionUseCaseImpl$invoke$1);
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

    public static final AbstractC58185ywX EZpvd(final C26758jiP c26758jiP, final NewCallbackBean newCallbackBean, final InvestTxModel investTxModel, final TransactionConfig transactionConfig, final java.lang.String str, final InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        Intrinsics.checkNotNullParameter(investTxModel, "");
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return C25471ixO.copydefault(new InterfaceC58187ywZ() { // from class: o.jiU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C26758jiP.KWHzl(newCallbackBean, c26758jiP, transactionConfig, str, investTokenWithAmount, investTxModel, interfaceC58184ywW);
            }
        });
    }

    public static final void KWHzl(NewCallbackBean newCallbackBean, C26758jiP c26758jiP, TransactionConfig transactionConfig, java.lang.String str, InvestTokenWithAmount investTokenWithAmount, InvestTxModel investTxModel, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        if (!iCF.EZpvd(newCallbackBean)) {
            interfaceC58184ywW.onError(new java.lang.Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DAIeex)));
            interfaceC58184ywW.onComplete();
        }
        ReserveBean reserved = newCallbackBean.getReserved();
        final Job jobSafeLaunch$default = C27493jwI.safeLaunch$default(CoroutineScopeKt.CoroutineScope(c26758jiP.OLrzqt), null, null, new SettleTransactionUseCaseImpl$requestDataCallback$1$1$job$1(c26758jiP, transactionConfig, reserved != null ? C27492jwH.OLrzqt.OLrzqt(reserved.getReservedAmount(), reserved.getPrecision()) : null, str, (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.firstOrNull(c26758jiP.AEQbTJ.gEmmrt().copydefault()), investTokenWithAmount, interfaceC58184ywW, investTxModel, null), 3, null);
        interfaceC58184ywW.setCancellable(new InterfaceC58225yxK() { // from class: o.jiO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58225yxK
            public final void cancel() {
                C26758jiP.AEQbTJ(jobSafeLaunch$default);
            }
        });
    }

    public static final void AEQbTJ(Job job) {
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
    }

    public static final AbstractC58185ywX AEQbTJ(final C26758jiP c26758jiP, final NewCallbackBean newCallbackBean, final InvestTxModel investTxModel) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        Intrinsics.checkNotNullParameter(investTxModel, "");
        return C25471ixO.copydefault(new InterfaceC58187ywZ() { // from class: o.jiQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C26758jiP.AEQbTJ(this.KWHzl, newCallbackBean, investTxModel, interfaceC58184ywW);
            }
        });
    }

    public static final void AEQbTJ(C26758jiP c26758jiP, NewCallbackBean newCallbackBean, InvestTxModel investTxModel, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        final Job jobSafeLaunch$default = C27493jwI.safeLaunch$default(CoroutineScopeKt.CoroutineScope(c26758jiP.OLrzqt), null, null, new SettleTransactionUseCaseImpl$submitTransactionCallback$1$1$job$1(c26758jiP, newCallbackBean, investTxModel, interfaceC58184ywW, null), 3, null);
        interfaceC58184ywW.setCancellable(new InterfaceC58225yxK() { // from class: o.jiN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58225yxK
            public final void cancel() {
                C26758jiP.EZpvd(jobSafeLaunch$default);
            }
        });
    }

    public static final void EZpvd(Job job) {
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
    }
}
