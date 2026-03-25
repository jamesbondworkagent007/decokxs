package o;

import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.invest_biz.data.bean.ClaimTokenAmount;
import com.okinc.business.invest_biz.data.bean.InvestCallDataResult;
import com.okinc.business.invest_biz.data.bean.InvestGetGasFeeRequest;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.handler.BaseTransactionHandler$checkIfGasFeesOk$1;
import com.okinc.business.invest_biz.data.handler.BaseTransactionHandler$getCallDataResult$1;
import com.okinc.business.invest_biz.data.handler.BaseTransactionHandler$invoke$1;
import com.okinc.business.invest_biz.data.handler.BaseTransactionHandler$submitTransaction$1;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.lang.ref.WeakReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import kotlinx.coroutines.rx2.RxFlowableKt;
import o.C25493ixk;
import o.InterfaceC25530iyU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iyM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC25522iyM {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final C27568jxe AEQbTJ;
    public final C23724iGz EZpvd;
    public final iFJ KWHzl;
    public final InterfaceC23916iOb copydefault;
    public iGH djBIcL;
    public final iCK gEmmrt;

    public AbstractC25522iyM(@NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull iFJ ifj, @NotNull C23724iGz c23724iGz, @NotNull C27568jxe c27568jxe, @NotNull iCK ick) {
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(ifj, "");
        Intrinsics.checkNotNullParameter(c23724iGz, "");
        Intrinsics.checkNotNullParameter(c27568jxe, "");
        Intrinsics.checkNotNullParameter(ick, "");
        this.copydefault = interfaceC23916iOb;
        this.KWHzl = ifj;
        this.EZpvd = c23724iGz;
        this.AEQbTJ = c27568jxe;
        this.gEmmrt = ick;
    }

    public static /* synthetic */ void invoke$default(AbstractC25522iyM abstractC25522iyM, InterfaceC25466ixJ interfaceC25466ixJ, C25523iyN c25523iyN, InvestTxModel investTxModel, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
        if ((i & 2) != 0) {
            c25523iyN = null;
        }
        abstractC25522iyM.EZpvd(interfaceC25466ixJ, c25523iyN, investTxModel, function1);
    }

    public final void EZpvd(@NotNull InterfaceC25466ixJ interfaceC25466ixJ, C25523iyN c25523iyN, @NotNull InvestTxModel investTxModel, @NotNull Function1<? super InterfaceC25530iyU, Unit> function1) {
        Intrinsics.checkNotNullParameter(interfaceC25466ixJ, "");
        Intrinsics.checkNotNullParameter(investTxModel, "");
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC25466ixJ interfaceC25466ixJ2 = (InterfaceC25466ixJ) new WeakReference(interfaceC25466ixJ).get();
        if (interfaceC25466ixJ2 == null) {
            throw new java.lang.IllegalStateException("host fragment shouldn't be null");
        }
        android.content.Context contextAEQbTJ = interfaceC25466ixJ2.AEQbTJ();
        CoroutineScope coroutineScopeAhwBna = interfaceC25466ixJ2.AhwBna();
        if (coroutineScopeAhwBna != null) {
            C27493jwI.safeLaunch$default(coroutineScopeAhwBna, null, null, new BaseTransactionHandler$invoke$1(this, investTxModel, function1, c25523iyN, interfaceC25466ixJ2, contextAEQbTJ, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(InvestTxModel investTxModel, Continuation<? super Result<InvestCallDataResult>> continuation) throws java.lang.Throwable {
        BaseTransactionHandler$getCallDataResult$1 baseTransactionHandler$getCallDataResult$1;
        java.lang.Object objOLrzqt;
        if (continuation instanceof BaseTransactionHandler$getCallDataResult$1) {
            baseTransactionHandler$getCallDataResult$1 = (BaseTransactionHandler$getCallDataResult$1) continuation;
            int i = baseTransactionHandler$getCallDataResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseTransactionHandler$getCallDataResult$1.label = i - Integer.MIN_VALUE;
            } else {
                baseTransactionHandler$getCallDataResult$1 = new BaseTransactionHandler$getCallDataResult$1(this, continuation);
            }
        }
        java.lang.Object obj = baseTransactionHandler$getCallDataResult$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = baseTransactionHandler$getCallDataResult$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            iFJ ifj = this.KWHzl;
            baseTransactionHandler$getCallDataResult$1.L$0 = investTxModel;
            baseTransactionHandler$getCallDataResult$1.label = 1;
            objOLrzqt = ifj.OLrzqt(investTxModel, baseTransactionHandler$getCallDataResult$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            investTxModel = (InvestTxModel) baseTransactionHandler$getCallDataResult$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (!Result.m7384isSuccessimpl(objOLrzqt)) {
            return Result.m7377constructorimpl(objOLrzqt);
        }
        try {
            Result.Application application = Result.Companion;
            InvestCallDataResult investCallDataResult = (InvestCallDataResult) objOLrzqt;
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) investCallDataResult.EZpvd()) && !C33129mqd.OLrzqt((java.lang.CharSequence) iFG.Companion.AEQbTJ(investCallDataResult.EZpvd(), investTxModel).getSignDataJson())) {
                throw new OKServerException(2, C33070mpX.AYXKKw(C25493ixk.FragmentManager.iRxXKY), null, null, 12, null);
            }
            return Result.m7377constructorimpl(investCallDataResult);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(InterfaceC25466ixJ interfaceC25466ixJ, C25523iyN c25523iyN, InvestCallDataResult investCallDataResult, Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        BaseTransactionHandler$checkIfGasFeesOk$1 baseTransactionHandler$checkIfGasFeesOk$1;
        InterfaceC25466ixJ interfaceC25466ixJ2;
        InvestCallDataResult investCallDataResult2;
        C25523iyN c25523iyN2;
        AbstractC25522iyM abstractC25522iyM;
        if (continuation instanceof BaseTransactionHandler$checkIfGasFeesOk$1) {
            baseTransactionHandler$checkIfGasFeesOk$1 = (BaseTransactionHandler$checkIfGasFeesOk$1) continuation;
            int i = baseTransactionHandler$checkIfGasFeesOk$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseTransactionHandler$checkIfGasFeesOk$1.label = i - Integer.MIN_VALUE;
            } else {
                baseTransactionHandler$checkIfGasFeesOk$1 = new BaseTransactionHandler$checkIfGasFeesOk$1(this, continuation);
            }
        }
        BaseTransactionHandler$checkIfGasFeesOk$1 baseTransactionHandler$checkIfGasFeesOk$12 = baseTransactionHandler$checkIfGasFeesOk$1;
        java.lang.Object objAwait = baseTransactionHandler$checkIfGasFeesOk$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = baseTransactionHandler$checkIfGasFeesOk$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAwait);
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = this.copydefault.gEmmrt().KWHzl();
            baseTransactionHandler$checkIfGasFeesOk$12.L$0 = this;
            interfaceC25466ixJ2 = interfaceC25466ixJ;
            baseTransactionHandler$checkIfGasFeesOk$12.L$1 = interfaceC25466ixJ2;
            baseTransactionHandler$checkIfGasFeesOk$12.L$2 = c25523iyN;
            investCallDataResult2 = investCallDataResult;
            baseTransactionHandler$checkIfGasFeesOk$12.L$3 = investCallDataResult2;
            baseTransactionHandler$checkIfGasFeesOk$12.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtKWHzl, baseTransactionHandler$checkIfGasFeesOk$12);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            c25523iyN2 = c25523iyN;
            abstractC25522iyM = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objAwait);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InvestCallDataResult investCallDataResult3 = (InvestCallDataResult) baseTransactionHandler$checkIfGasFeesOk$12.L$3;
            c25523iyN2 = (C25523iyN) baseTransactionHandler$checkIfGasFeesOk$12.L$2;
            InterfaceC25466ixJ interfaceC25466ixJ3 = (InterfaceC25466ixJ) baseTransactionHandler$checkIfGasFeesOk$12.L$1;
            AbstractC25522iyM abstractC25522iyM2 = (AbstractC25522iyM) baseTransactionHandler$checkIfGasFeesOk$12.L$0;
            C56391yDq.AEQbTJ(objAwait);
            investCallDataResult2 = investCallDataResult3;
            interfaceC25466ixJ2 = interfaceC25466ixJ3;
            abstractC25522iyM = abstractC25522iyM2;
        }
        java.lang.String strEZpvd = ((InterfaceC9738bbJ) objAwait).EZpvd(c25523iyN2.AEQbTJ());
        long jAEQbTJ = c25523iyN2.AEQbTJ();
        java.lang.String strDjBIcL = investCallDataResult2.djBIcL();
        java.lang.String strAEQbTJ = investCallDataResult2.AEQbTJ();
        java.lang.Long l = (java.lang.Long) CollectionsKt___CollectionsKt.firstOrNull(c25523iyN2.copydefault());
        long jLongValue = l != null ? l.longValue() : 0L;
        java.util.List<InvestUserRewardElementInfo> listAhwBna = c25523iyN2.AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        for (java.util.Iterator it = listAhwBna.iterator(); it.hasNext(); it = it) {
            InvestUserRewardElementInfo investUserRewardElementInfo = (InvestUserRewardElementInfo) it.next();
            arrayList.add(new ClaimTokenAmount(C33129mqd.mulS$default(investUserRewardElementInfo.getCoinAmount(), C56443yFo.AEQbTJ(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(investUserRewardElementInfo.getTokenPrecision()))), null, null, null, 14, null), investUserRewardElementInfo.getTokenAddress()));
            c25523iyN2 = c25523iyN2;
        }
        InvestGetGasFeeRequest investGetGasFeeRequest = new InvestGetGasFeeRequest(strEZpvd, C56443yFo.KWHzl(jAEQbTJ), strAEQbTJ, strDjBIcL, C56443yFo.KWHzl(jLongValue), arrayList);
        java.lang.String strAEQbTJ2 = C27491jwG.AEQbTJ(c25523iyN2.AhwBna(), new Function1() { // from class: o.iyK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC25522iyM.EZpvd((InvestUserRewardElementInfo) obj);
            }
        });
        C27568jxe c27568jxe = abstractC25522iyM.AEQbTJ;
        CoroutineScope coroutineScopeAhwBna = interfaceC25466ixJ2.AhwBna();
        androidx.fragment.app.FragmentManager parentFragmentManager = interfaceC25466ixJ2.getParentFragmentManager();
        baseTransactionHandler$checkIfGasFeesOk$12.L$0 = null;
        baseTransactionHandler$checkIfGasFeesOk$12.L$1 = null;
        baseTransactionHandler$checkIfGasFeesOk$12.L$2 = null;
        baseTransactionHandler$checkIfGasFeesOk$12.L$3 = null;
        baseTransactionHandler$checkIfGasFeesOk$12.label = 2;
        objAwait = c27568jxe.KWHzl(coroutineScopeAhwBna, parentFragmentManager, investGetGasFeeRequest, strAEQbTJ2, baseTransactionHandler$checkIfGasFeesOk$12);
        return objAwait == objCopydefault ? objCopydefault : objAwait;
    }

    public static final java.lang.String EZpvd(InvestUserRewardElementInfo investUserRewardElementInfo) {
        Intrinsics.checkNotNullParameter(investUserRewardElementInfo, "");
        java.lang.String currencyAmount = investUserRewardElementInfo.getCurrencyAmount();
        return currencyAmount == null ? "" : currencyAmount;
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> copydefault(NewCallbackBean newCallbackBean, InvestTxModel investTxModel, android.content.Context context) {
        return RxFlowableKt.rxFlowable$default(null, new BaseTransactionHandler$submitTransaction$1(this, new iEQ(newCallbackBean.getHeaderMap(), this.gEmmrt.OLrzqt(newCallbackBean, investTxModel)), investTxModel, context, null), 1, null);
    }

    public final InterfaceC25530iyU KWHzl(android.os.Bundle bundle) {
        if (bundle == null || bundle.getInt("result") != -1) {
            return new InterfaceC25530iyU.StateListAnimator(bundle, 4);
        }
        iGH igh = this.djBIcL;
        java.lang.Integer numValueOf = igh != null ? java.lang.Integer.valueOf(igh.AEQbTJ()) : null;
        iGH igh2 = this.djBIcL;
        java.lang.String strOLrzqt = igh2 != null ? igh2.OLrzqt() : null;
        iGH igh3 = this.djBIcL;
        return new InterfaceC25530iyU.ActionBar(bundle, 3, new InvestTradeManager.TransactionResultExtraData(numValueOf, strOLrzqt, igh3 != null ? java.lang.Integer.valueOf(igh3.EZpvd()) : null), InvestmentKind.Default);
    }

    public final InterfaceC25530iyU.Application copydefault(java.lang.Throwable th) {
        OKServerException oKServerException = th instanceof OKServerException ? (OKServerException) th : null;
        return new InterfaceC25530iyU.Application(th, null, oKServerException != null && oKServerException.getCode() == 5, 0, 10, null);
    }

    /* JADX INFO: renamed from: o.iyM$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iyM.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
