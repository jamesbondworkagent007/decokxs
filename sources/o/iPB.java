package o;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.gson.Gson;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.ClaimTokenAmount;
import com.okinc.business.invest_biz.data.bean.InvestCallDataResult;
import com.okinc.business.invest_biz.data.bean.InvestGetGasFeeRequest;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.bean.InvestTransactionParam;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.claim.Web3RewardsClaimHandler$checkIfGasFeesOk$1;
import com.okinc.business.invest_biz.ui.claim.Web3RewardsClaimHandler$invoke$1;
import com.okinc.business.invest_biz.ui.claim.Web3RewardsClaimHandler$submitTransaction$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import kotlinx.coroutines.rx2.RxFlowableKt;
import o.InterfaceC25530iyU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iPB {
    public final C27568jxe AEQbTJ;
    public final iCK AYXKKw;
    public final InterfaceC23966iPy EZpvd;
    public final InterfaceC23916iOb KWHzl;
    public final iPA OLrzqt;
    public iGH copydefault;

    public iPB(@NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull InterfaceC23966iPy interfaceC23966iPy, @NotNull iPA ipa, @NotNull C27568jxe c27568jxe, @NotNull iCK ick) {
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(interfaceC23966iPy, "");
        Intrinsics.checkNotNullParameter(ipa, "");
        Intrinsics.checkNotNullParameter(c27568jxe, "");
        Intrinsics.checkNotNullParameter(ick, "");
        this.KWHzl = interfaceC23916iOb;
        this.EZpvd = interfaceC23966iPy;
        this.OLrzqt = ipa;
        this.AEQbTJ = c27568jxe;
        this.AYXKKw = ick;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yCM
    public iPB(@NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull InterfaceC23966iPy interfaceC23966iPy, @NotNull iPA ipa) {
        this(interfaceC23916iOb, interfaceC23966iPy, ipa, C27568jxe.EZpvd, iCK.AEQbTJ);
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(interfaceC23966iPy, "");
        Intrinsics.checkNotNullParameter(ipa, "");
    }

    public final void copydefault(@NotNull AppCompatActivity appCompatActivity, @NotNull C25523iyN c25523iyN, @NotNull Function1<? super InterfaceC25530iyU, Unit> function1) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(c25523iyN, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AppCompatActivity appCompatActivity2 = (AppCompatActivity) new WeakReference(appCompatActivity).get();
        if (appCompatActivity2 == null) {
            throw new java.lang.IllegalStateException("host shouldn't be null");
        }
        C27493jwI.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(appCompatActivity2), null, null, new Web3RewardsClaimHandler$invoke$1(this, c25523iyN, function1, appCompatActivity2, appCompatActivity, null), 3, null);
    }

    public final InterfaceC25530iyU.Application copydefault(java.lang.Throwable th) {
        OKServerException oKServerException = th instanceof OKServerException ? (OKServerException) th : null;
        int code = oKServerException != null ? oKServerException.getCode() : Integer.MIN_VALUE;
        boolean z = code == 5;
        java.lang.String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        return new InterfaceC25530iyU.Application(th, message, z, code);
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> AEQbTJ(NewCallbackBean newCallbackBean, InvestTxModel investTxModel, android.content.Context context) {
        return RxFlowableKt.rxFlowable$default(null, new Web3RewardsClaimHandler$submitTransaction$1(this, new iEQ(newCallbackBean.getHeaderMap(), this.AYXKKw.OLrzqt(newCallbackBean, investTxModel)), context, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(AppCompatActivity appCompatActivity, C25523iyN c25523iyN, InvestCallDataResult investCallDataResult, Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        Web3RewardsClaimHandler$checkIfGasFeesOk$1 web3RewardsClaimHandler$checkIfGasFeesOk$1;
        AppCompatActivity appCompatActivity2;
        InvestCallDataResult investCallDataResult2;
        C25523iyN c25523iyN2;
        iPB ipb;
        if (continuation instanceof Web3RewardsClaimHandler$checkIfGasFeesOk$1) {
            web3RewardsClaimHandler$checkIfGasFeesOk$1 = (Web3RewardsClaimHandler$checkIfGasFeesOk$1) continuation;
            int i = web3RewardsClaimHandler$checkIfGasFeesOk$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                web3RewardsClaimHandler$checkIfGasFeesOk$1.label = i - Integer.MIN_VALUE;
            } else {
                web3RewardsClaimHandler$checkIfGasFeesOk$1 = new Web3RewardsClaimHandler$checkIfGasFeesOk$1(this, continuation);
            }
        }
        Web3RewardsClaimHandler$checkIfGasFeesOk$1 web3RewardsClaimHandler$checkIfGasFeesOk$12 = web3RewardsClaimHandler$checkIfGasFeesOk$1;
        java.lang.Object objAwait = web3RewardsClaimHandler$checkIfGasFeesOk$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = web3RewardsClaimHandler$checkIfGasFeesOk$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAwait);
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = this.KWHzl.gEmmrt().KWHzl();
            web3RewardsClaimHandler$checkIfGasFeesOk$12.L$0 = this;
            appCompatActivity2 = appCompatActivity;
            web3RewardsClaimHandler$checkIfGasFeesOk$12.L$1 = appCompatActivity2;
            web3RewardsClaimHandler$checkIfGasFeesOk$12.L$2 = c25523iyN;
            investCallDataResult2 = investCallDataResult;
            web3RewardsClaimHandler$checkIfGasFeesOk$12.L$3 = investCallDataResult2;
            web3RewardsClaimHandler$checkIfGasFeesOk$12.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtKWHzl, web3RewardsClaimHandler$checkIfGasFeesOk$12);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            c25523iyN2 = c25523iyN;
            ipb = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objAwait);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InvestCallDataResult investCallDataResult3 = (InvestCallDataResult) web3RewardsClaimHandler$checkIfGasFeesOk$12.L$3;
            c25523iyN2 = (C25523iyN) web3RewardsClaimHandler$checkIfGasFeesOk$12.L$2;
            AppCompatActivity appCompatActivity3 = (AppCompatActivity) web3RewardsClaimHandler$checkIfGasFeesOk$12.L$1;
            iPB ipb2 = (iPB) web3RewardsClaimHandler$checkIfGasFeesOk$12.L$0;
            C56391yDq.AEQbTJ(objAwait);
            investCallDataResult2 = investCallDataResult3;
            appCompatActivity2 = appCompatActivity3;
            ipb = ipb2;
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
        java.lang.String strAEQbTJ2 = C27491jwG.AEQbTJ(c25523iyN2.AhwBna(), new Function1() { // from class: o.iPD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iPB.EZpvd((InvestUserRewardElementInfo) obj);
            }
        });
        C27568jxe c27568jxe = ipb.AEQbTJ;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(appCompatActivity2);
        androidx.fragment.app.FragmentManager supportFragmentManager = appCompatActivity2.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        web3RewardsClaimHandler$checkIfGasFeesOk$12.L$0 = null;
        web3RewardsClaimHandler$checkIfGasFeesOk$12.L$1 = null;
        web3RewardsClaimHandler$checkIfGasFeesOk$12.L$2 = null;
        web3RewardsClaimHandler$checkIfGasFeesOk$12.L$3 = null;
        web3RewardsClaimHandler$checkIfGasFeesOk$12.label = 2;
        objAwait = c27568jxe.EZpvd(lifecycleScope, supportFragmentManager, investGetGasFeeRequest, strAEQbTJ2, web3RewardsClaimHandler$checkIfGasFeesOk$12);
        return objAwait == objCopydefault ? objCopydefault : objAwait;
    }

    public static final java.lang.String EZpvd(InvestUserRewardElementInfo investUserRewardElementInfo) {
        Intrinsics.checkNotNullParameter(investUserRewardElementInfo, "");
        java.lang.String currencyAmount = investUserRewardElementInfo.getCurrencyAmount();
        return currencyAmount == null ? "" : currencyAmount;
    }

    public final InterfaceC25530iyU OLrzqt(android.os.Bundle bundle) {
        if (bundle == null || bundle.getInt("result") != -1) {
            return new InterfaceC25530iyU.StateListAnimator(bundle, 4);
        }
        iGH igh = this.copydefault;
        java.lang.Integer numValueOf = igh != null ? java.lang.Integer.valueOf(igh.AEQbTJ()) : null;
        iGH igh2 = this.copydefault;
        java.lang.String strOLrzqt = igh2 != null ? igh2.OLrzqt() : null;
        iGH igh3 = this.copydefault;
        return new InterfaceC25530iyU.ActionBar(bundle, 3, new InvestTradeManager.TransactionResultExtraData(numValueOf, strOLrzqt, igh3 != null ? java.lang.Integer.valueOf(igh3.EZpvd()) : null), InvestmentKind.Default);
    }

    public final InvestTxModel OLrzqt(C25523iyN c25523iyN, InterfaceC9738bbJ interfaceC9738bbJ) {
        java.util.List<java.lang.Long> listAhwBna;
        java.lang.Long lOLrzqt = c25523iyN.OLrzqt();
        if (c25523iyN.djBIcL() != null) {
            listAhwBna = C56402yEa.EZpvd(c25523iyN.djBIcL());
        } else {
            listAhwBna = c25523iyN.valueOf() ? yDY.AhwBna() : c25523iyN.copydefault();
        }
        java.util.List<java.lang.Long> list = listAhwBna;
        long jAEQbTJ = c25523iyN.AEQbTJ();
        boolean zValueOf = c25523iyN.valueOf();
        int iKWHzl = c25523iyN.KWHzl();
        java.lang.String strDbNXlk = interfaceC9738bbJ.DbNXlk();
        java.lang.String strEZpvd = interfaceC9738bbJ.EZpvd(c25523iyN.AEQbTJ());
        java.lang.String strAEQbTJ = C27491jwG.AEQbTJ(c25523iyN.AhwBna(), new Function1() { // from class: o.iPC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iPB.OLrzqt((InvestUserRewardElementInfo) obj);
            }
        });
        java.util.List<InvestUserRewardElementInfo> listAhwBna2 = c25523iyN.AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna2, 10));
        for (InvestUserRewardElementInfo investUserRewardElementInfo : listAhwBna2) {
            ButtonType buttonType = investUserRewardElementInfo.getButtonType();
            java.lang.String tokenPrecision = investUserRewardElementInfo.getTokenPrecision();
            java.lang.String str = tokenPrecision == null ? "" : tokenPrecision;
            java.lang.String tokenSymbol = investUserRewardElementInfo.getTokenSymbol();
            java.lang.String str2 = tokenSymbol == null ? "" : tokenSymbol;
            java.lang.String currencyAmount = investUserRewardElementInfo.getCurrencyAmount();
            java.lang.String str3 = currencyAmount == null ? "" : currencyAmount;
            java.lang.String tokenLogo = investUserRewardElementInfo.getTokenLogo();
            java.lang.String str4 = tokenLogo == null ? "" : tokenLogo;
            java.lang.String tokenAddress = investUserRewardElementInfo.getTokenAddress();
            arrayList.add(new InvestTokenWithAmount(c25523iyN.AEQbTJ(), C33129mqd.mulS$default(investUserRewardElementInfo.getCoinAmount(), java.lang.Double.valueOf(java.lang.Math.pow(10.0d, C33129mqd.AEQbTJ(investUserRewardElementInfo.getTokenPrecision()))), null, null, null, 14, null), str3, false, false, (java.lang.String) null, tokenAddress == null ? "" : tokenAddress, str4, (java.lang.String) null, str2, str, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, buttonType, investUserRewardElementInfo.getTokenAddress(), (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268384568, (DefaultConstructorMarker) null));
        }
        java.util.List list2 = null;
        boolean z = false;
        boolean z2 = false;
        java.lang.String json = new Gson().toJson(new InvestTransactionParam(list2, z, z2, c25523iyN.AEQbTJ(), (java.lang.Integer) null, c25523iyN.OLrzqt(), (java.lang.String) null, c25523iyN.copydefault(), (java.lang.Long) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (InvestPoolV3) null, (java.lang.Integer) null, (java.lang.Boolean) null, 65367, (DefaultConstructorMarker) null));
        Intrinsics.checkNotNullExpressionValue(json, "");
        C25477ixU c25477ixUEZpvd = c25523iyN.EZpvd();
        java.lang.String strOLrzqt = c25477ixUEZpvd != null ? c25477ixUEZpvd.OLrzqt() : null;
        C25477ixU c25477ixUEZpvd2 = c25523iyN.EZpvd();
        java.util.List<java.lang.String> listCopydefault = c25477ixUEZpvd2 != null ? c25477ixUEZpvd2.copydefault() : null;
        C25477ixU c25477ixUEZpvd3 = c25523iyN.EZpvd();
        return new InvestTxModel(iKWHzl, strDbNXlk, strEZpvd, (java.util.List) list, (java.lang.Long) null, jAEQbTJ, strAEQbTJ, (java.util.List) arrayList, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, json, 0, zValueOf, lOLrzqt, (java.lang.String) null, 0, (java.util.List) listCopydefault, c25477ixUEZpvd3 != null ? c25477ixUEZpvd3.EZpvd() : null, (java.util.List) null, (java.util.Map) null, (java.lang.String) null, (java.lang.String) null, strOLrzqt, (java.lang.Integer) null, (java.lang.Integer) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BTCMode) null, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.util.List) null, false, (java.lang.Long) null, -281870576, 65535, (DefaultConstructorMarker) null);
    }

    public static final java.lang.String OLrzqt(InvestUserRewardElementInfo investUserRewardElementInfo) {
        Intrinsics.checkNotNullParameter(investUserRewardElementInfo, "");
        java.lang.String currencyAmount = investUserRewardElementInfo.getCurrencyAmount();
        return currencyAmount == null ? "0" : currencyAmount;
    }
}
