package o;

import androidx.camera.video.AudioStats;
import com.okinc.business.defi.api.model.tx.signdata.ContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.EVM5792ContractSignData;
import com.okinc.business.defi.api.model.tx.signdata.PlatformItem;
import com.okinc.business.defi.biz.constant.KYSApprovalType;
import com.okinc.business.defi.biz.constant.KYSAssetType;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.CoinMetaError;
import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean;
import com.okinc.business.defi.biz.core.transaction.bean.CommonExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.net.bean.AmountDetail;
import com.okinc.business.defi.biz.net.bean.Asset;
import com.okinc.business.defi.biz.net.bean.AssetsDiffInfo;
import com.okinc.business.defi.biz.net.bean.AuthQuantity;
import com.okinc.business.defi.biz.net.bean.AuthQuantityInfo;
import com.okinc.business.defi.biz.net.bean.BlackAddressWarning;
import com.okinc.business.defi.biz.net.bean.ContractAddressResp;
import com.okinc.business.defi.biz.net.bean.ExposureInfo;
import com.okinc.business.defi.biz.net.bean.Intention;
import com.okinc.business.defi.biz.net.bean.KYSPreTxCheckInfo;
import com.okinc.business.defi.biz.net.bean.Spender;
import com.okinc.business.defi.biz.net.bean.TxToastCheckReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.ApproveInfoModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.ButtonGroupModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.PreExecTransactionRes;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.ShowInformationModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxInfoItem;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import java.math.RoundingMode;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.AbstractC8426bCW;
import o.C13754dXa;
import o.InterfaceC9737bbI;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.bFm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8601bFm<Fee extends AbstractC8426bCW<?>, SignData extends ContractSignData> extends AbstractC8564bFB<Fee, SignData> {
    public KYSPreTxCheckInfo OLrzqt;
    public ContractAddressResp copydefault;
    public ApproveInfoModuleModel.ApproveInfoListItem gEmmrt;
    public OKWBaseTransaction.TransactionType EZpvd = OKWBaseTransaction.TransactionType.Contract;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.bFw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC8601bFm.copydefault(this.EZpvd);
        }
    });
    public boolean KWHzl = true;

    /* JADX INFO: renamed from: o.bFm$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKWBaseTransaction.TransactionType.values().length];
            try {
                iArr[OKWBaseTransaction.TransactionType.Approve.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKWBaseTransaction.TransactionType.CancelApprove.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OKWBaseTransaction.TransactionType.DappTransfer.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    public abstract java.lang.String AEQbTJ(boolean z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull OKWBaseTransaction.TransactionType transactionType) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        this.EZpvd = transactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem) {
        this.gEmmrt = approveInfoListItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC8564bFB
    public void OLrzqt(@NotNull java.util.List<TxToastCheckRes> list) {
        Intrinsics.checkNotNullParameter(list, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractAddressResp Y_() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KYSPreTxCheckInfo ab_() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveInfoModuleModel.ApproveInfoListItem ad_() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(ContractAddressResp contractAddressResp) {
        this.copydefault = contractAddressResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public OKWBaseTransaction.TransactionType k_() {
        return this.EZpvd;
    }

    @Override // o.AbstractC8564bFB
    public java.lang.String l_() {
        return null;
    }

    public abstract java.lang.String zuBGHE();

    public final C8518bEI ac_() {
        return (C8518bEI) this.AEQbTJ.getValue();
    }

    public static final C8518bEI copydefault(AbstractC8601bFm abstractC8601bFm) {
        return new C8518bEI(abstractC8601bFm);
    }

    @Override // o.AbstractC8564bFB
    public boolean q_() {
        QVAiDq();
        return true;
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl;
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        if (ae_()) {
            abstractC58185ywXKWHzl = OcIXYQ();
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
        }
        final Function2 function2 = new Function2() { // from class: o.bFq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC8601bFm.EZpvd((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, abstractC58185ywXKWHzl, new InterfaceC58223yxI() { // from class: o.bFp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC8601bFm.EZpvd(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair EZpvd(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair EZpvd(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        return !((java.lang.Boolean) pair.getFirst()).booleanValue() ? pair : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? pair2 : C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    public final void QVAiDq() {
        C8518bEI c8518bEIAc_ = ac_();
        java.util.List<ContractSignData.FromToken> fromToken = QVsKAR().getFromToken();
        if (fromToken == null) {
            fromToken = yDY.AhwBna();
        }
        c8518bEIAc_.KWHzl(fromToken);
        C8518bEI c8518bEIAc_2 = ac_();
        java.lang.String strZuBGHE = zuBGHE();
        if (strZuBGHE == null) {
            strZuBGHE = "";
        }
        c8518bEIAc_2.KWHzl(strZuBGHE);
    }

    @Override // o.AbstractC8564bFB
    public java.util.HashSet<java.lang.Long> j_() {
        java.util.HashSet<java.lang.Long> hashSetJ_ = super.j_();
        java.util.Set<C10854bwM> setOLrzqt = ac_().OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(setOLrzqt, 10));
        java.util.Iterator<T> it = setOLrzqt.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((C10854bwM) it.next()).AhwBna()));
        }
        hashSetJ_.addAll(arrayList);
        return hashSetJ_;
    }

    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OcIXYQ() {
        if (gwTjWJ()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = OFhtUX().KWHzl(dUDNAs().USBtdM(), dUDNAs().DbNXlk(), dHguZz().AhwBna(), zLjUOn(), (32 & 16) != 0 ? null : null, (32 & 32) != 0 ? null : java.lang.Boolean.TRUE, (32 & 64) != 0 ? null : null);
        final Function1 function1 = new Function1() { // from class: o.bFs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC8601bFm.KWHzl(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bFr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC8601bFm.OLrzqt(function1, obj);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static /* synthetic */ java.lang.String getInputData$default(AbstractC8601bFm abstractC8601bFm, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInputData");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return abstractC8601bFm.AEQbTJ(z);
    }

    public boolean ae_() {
        return aUsmxb() == OKWBaseTransaction.TransactionType.Approve || aUsmxb() == OKWBaseTransaction.TransactionType.CancelApprove;
    }

    public int ai_() {
        int i = ActionBar.copydefault[aUsmxb().ordinal()];
        if (i == 1 || i == 2) {
            return 4;
        }
        return i != 3 ? 3 : 6;
    }

    @Override // o.AbstractC8564bFB
    public AbstractC58185ywX<Unit> p_() {
        AbstractC58185ywX<Unit> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public final C8518bEI aj_() {
        return ac_();
    }

    @Override // o.AbstractC8564bFB
    public void x_() {
        DLWbHP().AEQbTJ(new C9808bca(ORxRYg(), dHguZz()));
    }

    public boolean ORxRYg() {
        return C33129mqd.copydefault(AbstractC8564bFB.getChainBalance$default(this, null, 1, null), zuBGHE());
    }

    @Override // o.AbstractC8564bFB
    public void AhwBna() throws CoinMetaError {
        boolean z;
        boolean zDTwDnp = DTwDnp();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (aUsmxb() != OKWBaseTransaction.TransactionType.Contract) {
            z = zDTwDnp;
        } else {
            if (zDTwDnp) {
                arrayList.add(new C9786bcE(true, "", ""));
            } else {
                C9786bcE c9786bcEAEQbTJ = ac_().AEQbTJ();
                arrayList.add(c9786bcEAEQbTJ);
                if (!c9786bcEAEQbTJ.AhwBna()) {
                    z = true;
                }
            }
            z = zDTwDnp;
        }
        arrayList.add(new C9784bcC(z, fJNWhG().AYXKKw(), null, 4, null));
        DLWbHP().OLrzqt(arrayList);
    }

    public boolean DTwDnp() throws CoinMetaError {
        boolean z = this.KWHzl;
        if (!z) {
            return z;
        }
        return C33129mqd.copydefault(DCJXGO().KWHzl(java.lang.Long.valueOf(fJNWhG().AYXKKw().AhwBna()), htlTjW()), C54862xYb.KWHzl(fJNWhG().AEQbTJ(), zuBGHE()));
    }

    public final java.lang.String wlaJM() {
        Spender spenderValue;
        KYSPreTxCheckInfo kYSPreTxCheckInfo = this.OLrzqt;
        java.util.List<ExposureInfo> exposures = kYSPreTxCheckInfo != null ? kYSPreTxCheckInfo.getExposures() : null;
        if (exposures == null || exposures.isEmpty() || (spenderValue = ((ExposureInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(exposures)).getSpenderValue()) == null) {
            return null;
        }
        return spenderValue.getName();
    }

    public final boolean ak_() {
        KYSPreTxCheckInfo kYSPreTxCheckInfo = this.OLrzqt;
        if (C33129mqd.KWHzl((java.util.Collection) (kYSPreTxCheckInfo != null ? kYSPreTxCheckInfo.getExposures() : null))) {
            KYSPreTxCheckInfo kYSPreTxCheckInfo2 = this.OLrzqt;
            java.util.List<AssetsDiffInfo> assetsDiffs = kYSPreTxCheckInfo2 != null ? kYSPreTxCheckInfo2.getAssetsDiffs() : null;
            if (assetsDiffs == null || assetsDiffs.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean al_() {
        KYSPreTxCheckInfo kYSPreTxCheckInfo = this.OLrzqt;
        java.util.List<AssetsDiffInfo> assetsDiffs = kYSPreTxCheckInfo != null ? kYSPreTxCheckInfo.getAssetsDiffs() : null;
        if (assetsDiffs != null && !assetsDiffs.isEmpty()) {
            KYSPreTxCheckInfo kYSPreTxCheckInfo2 = this.OLrzqt;
            java.util.List<ExposureInfo> exposures = kYSPreTxCheckInfo2 != null ? kYSPreTxCheckInfo2.getExposures() : null;
            if (exposures != null && !exposures.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String Z_() {
        Intention contractIntention;
        KYSPreTxCheckInfo kYSPreTxCheckInfo = this.OLrzqt;
        if (kYSPreTxCheckInfo == null || (contractIntention = kYSPreTxCheckInfo.getContractIntention()) == null) {
            return null;
        }
        return contractIntention.getFormatMethodNameAndParameter();
    }

    public final java.lang.String W_() {
        AuthQuantityInfo authQuantityInfo;
        KYSPreTxCheckInfo kYSPreTxCheckInfo = this.OLrzqt;
        if (kYSPreTxCheckInfo == null || (authQuantityInfo = kYSPreTxCheckInfo.getAuthQuantityInfo()) == null) {
            return null;
        }
        return authQuantityInfo.getEditUiType();
    }

    public final java.lang.String EZpvd(boolean z) {
        java.lang.String defaultAmount;
        ApproveInfoModuleModel.TxInfoItem tokenInfo;
        java.lang.Integer decimals;
        ApproveInfoModuleModel.AuthQuantity authQuantity;
        ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem = this.gEmmrt;
        if (approveInfoListItem == null || (authQuantity = approveInfoListItem.getAuthQuantity()) == null || (defaultAmount = authQuantity.getDefaultAmount()) == null) {
            defaultAmount = "0";
        }
        java.lang.String str = defaultAmount;
        if (!z) {
            return str;
        }
        ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem2 = this.gEmmrt;
        return C54862xYb.formatToString$default(C54862xYb.divB$default(str, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, (approveInfoListItem2 == null || (tokenInfo = approveInfoListItem2.getTokenInfo()) == null || (decimals = tokenInfo.getDecimals()) == null) ? 18 : decimals.intValue())), 0, null, 6, null), false, null, null, 7, null);
    }

    public final java.lang.String X_() {
        AuthQuantityInfo authQuantityInfo;
        java.util.List<AuthQuantity> authQuantityList;
        AuthQuantity authQuantity;
        ApproveInfoModuleModel.AuthQuantity authQuantity2;
        java.lang.String warnTip;
        ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem = this.gEmmrt;
        if (approveInfoListItem != null && (authQuantity2 = approveInfoListItem.getAuthQuantity()) != null && (warnTip = authQuantity2.getWarnTip()) != null) {
            return warnTip;
        }
        KYSPreTxCheckInfo kYSPreTxCheckInfo = this.OLrzqt;
        java.lang.String languageKey = (kYSPreTxCheckInfo == null || (authQuantityInfo = kYSPreTxCheckInfo.getAuthQuantityInfo()) == null || (authQuantityList = authQuantityInfo.getAuthQuantityList()) == null || (authQuantity = (AuthQuantity) CollectionsKt___CollectionsKt.AkhnZx(authQuantityList, 0)) == null) ? null : authQuantity.getLanguageKey();
        return languageKey == null ? "" : languageKey;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.util.ArrayList<java.lang.Integer> getNewProxyInstance() {
        java.util.ArrayList<java.lang.Integer> arrayListCopydefault = yDY.copydefault(6);
        int iQwvEab = QwvEab();
        if (iQwvEab != 3 && iQwvEab != 4) {
            arrayListCopydefault.add(2);
        }
        return arrayListCopydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.bFm<Fee extends o.bCW<?>, SignData extends com.okinc.business.defi.api.model.tx.signdata.ContractSignData> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public TxToastCheckReq i_() {
        java.lang.String strOLrzqt;
        TxToastCheckReq txToastCheckReqI_ = super.i_();
        txToastCheckReqI_.setCoinId(java.lang.Long.valueOf(dHguZz().AhwBna()));
        txToastCheckReqI_.setBizType(OJuSTm().getBizType());
        txToastCheckReqI_.setTo(zLjUOn());
        txToastCheckReqI_.setAmount(C54862xYb.convertToBigIntegerString$default(zuBGHE(), false, (RoundingMode) null, 3, (java.lang.Object) null));
        InterfaceC9729bbA interfaceC9729bbA = this instanceof InterfaceC9729bbA ? (InterfaceC9729bbA) this : null;
        java.lang.String strCopydefault = interfaceC9729bbA != null ? interfaceC9729bbA.copydefault() : null;
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        txToastCheckReqI_.setGasPrice(strCopydefault);
        txToastCheckReqI_.setInputData(getInputData$default(this, false, 1, null));
        txToastCheckReqI_.setTokenAddress(zLjUOn());
        if (aUsmxb() == OKWBaseTransaction.TransactionType.Approve && QwvEab() == 2) {
            InterfaceC9730bbB interfaceC9730bbB = this instanceof InterfaceC9730bbB ? (InterfaceC9730bbB) this : null;
            strOLrzqt = interfaceC9730bbB != null ? interfaceC9730bbB.OLrzqt() : null;
        } else {
            strOLrzqt = "";
        }
        txToastCheckReqI_.setProjectAddress(strOLrzqt);
        PlatformItem dapp = OJuSTm().getDapp();
        java.lang.String urlWithoutScheme = dapp != null ? dapp.getUrlWithoutScheme() : null;
        txToastCheckReqI_.setDomain(urlWithoutScheme != null ? urlWithoutScheme : "");
        txToastCheckReqI_.setRequestId(UUID.randomUUID().toString());
        return txToastCheckReqI_;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01df  */
    /* JADX WARN: Type inference failed for: r4v10, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void AEQbTJ(@NotNull java.util.List<TxToastCheckRes> list) {
        java.util.Iterator it;
        boolean z;
        boolean z2;
        java.lang.Integer approvalType;
        java.util.List<java.lang.String> causeRiskItem;
        boolean z3;
        boolean z4;
        java.util.List<java.lang.String> causeRiskItem2;
        java.lang.String str;
        java.lang.Object obj;
        java.lang.String addressType;
        java.lang.Boolean tagExt;
        java.lang.String str2;
        boolean z5;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = null;
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        boolean zBooleanValue = ((java.lang.Boolean) pairOLrzqt.component1()).booleanValue();
        java.lang.Object objComponent2 = pairOLrzqt.component2();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt(bool, yDY.AhwBna());
        boolean zBooleanValue2 = ((java.lang.Boolean) pairOLrzqt2.component1()).booleanValue();
        java.lang.Object objComponent22 = pairOLrzqt2.component2();
        kotlin.Pair pairOLrzqt3 = C56390yDp.OLrzqt(bool, yDY.AhwBna());
        boolean zBooleanValue3 = ((java.lang.Boolean) pairOLrzqt3.component1()).booleanValue();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = pairOLrzqt3.component2();
        java.util.Iterator it2 = list.iterator();
        boolean z6 = zBooleanValue;
        boolean z7 = zBooleanValue2;
        boolean z8 = true;
        boolean z9 = true;
        boolean z10 = true;
        boolean zBooleanValue4 = false;
        boolean z11 = false;
        boolean z12 = true;
        boolean z13 = true;
        C9868bdh c9868bdh = null;
        boolean z14 = true;
        while (it2.hasNext()) {
            TxToastCheckRes txToastCheckRes = (TxToastCheckRes) it2.next();
            java.lang.Integer checkType = txToastCheckRes.getCheckType();
            if (checkType == null) {
                it = it2;
            } else {
                it = it2;
                if (checkType.intValue() == 9) {
                    KYSPreTxCheckInfo kYSPreTxCheckInfoAEQbTJ = OHqIaq().AEQbTJ(txToastCheckRes);
                    this.OLrzqt = kYSPreTxCheckInfoAEQbTJ;
                    java.util.List<java.lang.String> riskAddressList = kYSPreTxCheckInfoAEQbTJ.getRiskAddressList();
                    java.util.List<java.lang.String> similarAddressList = kYSPreTxCheckInfoAEQbTJ.getSimilarAddressList();
                    BlackAddressWarning blackAddressWarning = kYSPreTxCheckInfoAEQbTJ.getBlackAddressWarning();
                    zBooleanValue4 = (blackAddressWarning == null || (tagExt = blackAddressWarning.getTagExt()) == null) ? false : tagExt.booleanValue();
                    BlackAddressWarning blackAddressWarning2 = kYSPreTxCheckInfoAEQbTJ.getBlackAddressWarning();
                    java.lang.String address = blackAddressWarning2 != null ? blackAddressWarning2.getAddress() : null;
                    if (address == null) {
                        address = str3;
                    }
                    if (C33129mqd.KWHzl((java.util.Collection) riskAddressList)) {
                        objComponent2 = str3;
                        objComponent22 = riskAddressList;
                        z6 = false;
                        z7 = false;
                    } else if (C33129mqd.KWHzl((java.util.Collection) similarAddressList)) {
                        objComponent2 = str3;
                        objComponent22 = similarAddressList;
                        z6 = false;
                        z7 = true;
                    }
                    if (zBooleanValue4 && C33129mqd.OLrzqt((java.lang.CharSequence) address)) {
                        BlackAddressWarning blackAddressWarning3 = kYSPreTxCheckInfoAEQbTJ.getBlackAddressWarning();
                        java.lang.String address2 = blackAddressWarning3 != null ? blackAddressWarning3.getAddress() : null;
                        if (address2 == null) {
                            address2 = str3;
                        }
                        objComponent22 = C56402yEa.EZpvd(address2);
                    }
                    java.util.List<ExposureInfo> exposures = kYSPreTxCheckInfoAEQbTJ.getExposures();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : exposures) {
                        Spender spenderValue = ((ExposureInfo) obj2).getSpenderValue();
                        if (spenderValue != null) {
                            addressType = spenderValue.getAddressType();
                            obj = objComponent2;
                        } else {
                            obj = objComponent2;
                            addressType = null;
                        }
                        if (Intrinsics.EZpvd((java.lang.Object) addressType, (java.lang.Object) TxToastCheckRes.EOA_ADDRESS_TYPE)) {
                            arrayList.add(obj2);
                        }
                        objComponent2 = obj;
                    }
                    java.lang.Object obj3 = objComponent2;
                    ?? arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        java.lang.String spenderKey = ((ExposureInfo) it3.next()).getSpenderKey();
                        if (spenderKey != null) {
                            arrayList2.add(spenderKey);
                        }
                    }
                    objectRef.element = arrayList2;
                    java.util.List<java.lang.String> causeRiskItem3 = kYSPreTxCheckInfoAEQbTJ.getCauseRiskItem();
                    if (causeRiskItem3 != null) {
                        z = true;
                        if (causeRiskItem3.contains(TxToastCheckRes.NOT_SAME_PARAMS)) {
                            z14 = false;
                        }
                    } else {
                        z = true;
                    }
                    java.util.List<java.lang.String> causeRiskItem4 = kYSPreTxCheckInfoAEQbTJ.getCauseRiskItem();
                    if (causeRiskItem4 != null && causeRiskItem4.contains(TxToastCheckRes.PURCHASE_MALICIOUS_TOKEN) == z) {
                        z9 = false;
                    }
                    java.util.List<java.lang.String> causeRiskItem5 = kYSPreTxCheckInfoAEQbTJ.getCauseRiskItem();
                    if (causeRiskItem5 != null && causeRiskItem5.contains(TxToastCheckRes.BASIC_RISK_REJECT) == z) {
                        z12 = false;
                    }
                    java.util.List<java.lang.String> causeRiskItem6 = kYSPreTxCheckInfoAEQbTJ.getCauseRiskItem();
                    if (causeRiskItem6 != null && causeRiskItem6.contains(TxToastCheckRes.BASIC_RISK_ALERT) == z) {
                        z10 = false;
                    }
                    java.util.List<ExposureInfo> exposures2 = kYSPreTxCheckInfoAEQbTJ.getExposures();
                    if ((exposures2 instanceof java.util.Collection) && exposures2.isEmpty()) {
                        z2 = false;
                        causeRiskItem = kYSPreTxCheckInfoAEQbTJ.getCauseRiskItem();
                        if (causeRiskItem == null) {
                        }
                        java.util.List<java.lang.String> causeRiskItem7 = kYSPreTxCheckInfoAEQbTJ.getCauseRiskItem();
                    } else {
                        java.util.Iterator<T> it4 = exposures2.iterator();
                        while (it4.hasNext()) {
                            Spender spenderValue2 = ((ExposureInfo) it4.next()).getSpenderValue();
                            if (((spenderValue2 == null || (approvalType = spenderValue2.getApprovalType()) == null) ? null : KYSApprovalType.Companion.OLrzqt(java.lang.Integer.valueOf(approvalType.intValue()))) == KYSApprovalType.CANCEL_AUTHORIZATION) {
                                z2 = true;
                                break;
                            }
                        }
                        z2 = false;
                        causeRiskItem = kYSPreTxCheckInfoAEQbTJ.getCauseRiskItem();
                        if (causeRiskItem == null) {
                            z3 = true;
                            z11 = causeRiskItem.contains(TxToastCheckRes.QUEUE_WITHDRAWAL_RISK);
                            java.util.List<java.lang.String> causeRiskItem72 = kYSPreTxCheckInfoAEQbTJ.getCauseRiskItem();
                            z4 = ((causeRiskItem72 == null || causeRiskItem72.contains(TxToastCheckRes.FROM_RISK_REJECT) != z3) ? false : z3) ^ z3;
                            causeRiskItem2 = kYSPreTxCheckInfoAEQbTJ.getCauseRiskItem();
                            if (causeRiskItem2 == null && causeRiskItem2.contains(TxToastCheckRes.TO_EOA_HAS_CALLDATA) == z3) {
                                str = str3;
                                zBooleanValue3 = z2;
                                z8 = z4;
                                objComponent2 = obj3;
                                z13 = false;
                            } else {
                                str = str3;
                                zBooleanValue3 = z2;
                                z8 = z4;
                                objComponent2 = obj3;
                            }
                        } else {
                            z3 = true;
                        }
                        java.util.List<java.lang.String> causeRiskItem722 = kYSPreTxCheckInfoAEQbTJ.getCauseRiskItem();
                        if (causeRiskItem722 == null) {
                            z4 = ((causeRiskItem722 == null || causeRiskItem722.contains(TxToastCheckRes.FROM_RISK_REJECT) != z3) ? false : z3) ^ z3;
                            causeRiskItem2 = kYSPreTxCheckInfoAEQbTJ.getCauseRiskItem();
                            if (causeRiskItem2 == null) {
                                str = str3;
                                zBooleanValue3 = z2;
                                z8 = z4;
                                objComponent2 = obj3;
                            }
                        }
                    }
                }
                it2 = it;
                str3 = str;
            }
            if (checkType != null && checkType.intValue() == 6) {
                kotlin.Pair pairOLrzqt4 = C56390yDp.OLrzqt(java.lang.Boolean.TRUE, str3);
                boolean zBooleanValue5 = ((java.lang.Boolean) pairOLrzqt4.component1()).booleanValue();
                java.lang.String str4 = (java.lang.String) pairOLrzqt4.component2();
                this.KWHzl = true;
                str = str3;
                if (Intrinsics.EZpvd(txToastCheckRes.getResult(), java.lang.Boolean.FALSE)) {
                    C8519bEJ c8519bEJ = C8519bEJ.copydefault;
                    int iQwvEab = QwvEab();
                    WalletType walletTypeQwvEab = dUDNAs().QwvEab();
                    OKWBaseTransaction.TransactionType transactionTypeAUsmxb = aUsmxb();
                    C10854bwM c10854bwMDHguZz = dHguZz();
                    java.lang.String address3 = fERRXa().getAddress();
                    java.lang.String msg = txToastCheckRes.getMsg();
                    c8519bEJ.KWHzl(iQwvEab, walletTypeQwvEab, transactionTypeAUsmxb, c10854bwMDHguZz, address3, msg == null ? str : msg, OJuSTm());
                    java.lang.String msg2 = txToastCheckRes.getMsg();
                    str2 = msg2 == null ? str : msg2;
                    z5 = false;
                } else {
                    if (Intrinsics.EZpvd((java.lang.Object) txToastCheckRes.getResultCode(), (java.lang.Object) TxToastCheckRes.RESULT_CODE_INSUFFICIENT_FUNDS)) {
                        this.KWHzl = false;
                    }
                    str2 = str4;
                    z5 = zBooleanValue5;
                }
                c9868bdh = new C9868bdh(z5, str2, null, null, 12, null);
            } else {
                str = str3;
                if (checkType != null && checkType.intValue() == 2 && Intrinsics.EZpvd(txToastCheckRes.getResult(), java.lang.Boolean.FALSE)) {
                    java.lang.String blackAddress = txToastCheckRes.getBlackAddress();
                    if (blackAddress == null) {
                        blackAddress = str;
                    }
                    objComponent2 = blackAddress;
                    z6 = false;
                }
            }
            it2 = it;
            str3 = str;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (c9868bdh != null) {
            arrayList3.add(c9868bdh);
        }
        C9789bcH[] c9789bcHArr = new C9789bcH[9];
        c9789bcHArr[0] = new C9788bcG(z8, true);
        java.lang.String str5 = (java.lang.String) objComponent2;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj4 : (java.lang.Iterable) objComponent22) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (C33129mqd.gEmmrt(java.lang.Integer.valueOf(i), 3)) {
                arrayList4.add(obj4);
            }
            i++;
        }
        boolean z15 = z9;
        boolean z16 = z10;
        c9789bcHArr[1] = new C9870bdj(z6, str5, z7, zBooleanValue4, arrayList4, null, 32, null);
        c9789bcHArr[2] = new C9814bcg(((java.util.List) objectRef.element).isEmpty() || zBooleanValue3, (java.util.List) objectRef.element);
        c9789bcHArr[3] = new C9866bdf(z14);
        c9789bcHArr[4] = new C9875bdo(z15);
        c9789bcHArr[5] = new C9824bcq(z12);
        c9789bcHArr[6] = new C9873bdm(!z11);
        c9789bcHArr[7] = new C9823bcp(z16);
        c9789bcHArr[8] = new C9883bdw(z13);
        arrayList3.addAll(yDY.gEmmrt(c9789bcHArr));
        DLWbHP().OLrzqt(arrayList3);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public void KWHzl(@NotNull PreExecTransactionRes preExecTransactionRes) {
        Intrinsics.checkNotNullParameter(preExecTransactionRes, "");
        super.KWHzl(preExecTransactionRes);
        this.gEmmrt = null;
        this.KWHzl = !(preExecTransactionRes.getTxInfo() != null ? Intrinsics.EZpvd(r2.getNeedFillUp(), java.lang.Boolean.TRUE) : false);
    }

    @Override // o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> dxcTrN() {
        if (zblBkD()) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) RlQdEF())) {
                ShowInformationModuleModel showInformationModuleModel = new ShowInformationModuleModel();
                showInformationModuleModel.setData(new ShowInformationModuleModel.InformationItem(RlQdEF()));
                KWHzl(showInformationModuleModel);
            }
            if (QVsKAR() instanceof EVM5792ContractSignData) {
                ButtonGroupModuleModel buttonGroupModuleModel = new ButtonGroupModuleModel();
                buttonGroupModuleModel.setData(new ButtonGroupModuleModel.ButtonGroup(C33070mpX.AYXKKw(C13754dXa.FragmentManager.shouldAnimateActionModeView), C33070mpX.AYXKKw(C13754dXa.FragmentManager.updateStatusGuard)));
                KWHzl(buttonGroupModuleModel);
            }
        }
        return super.dxcTrN();
    }

    public final void KWHzl(BaseModel<?> baseModel) {
        TxInfoItem txInfo;
        java.util.List<? extends BaseModel<?>> listFJNWhG;
        java.util.List<BaseModel<?>> moduleList;
        PreExecTransactionRes preExecTransactionResQSLkRj = QSLkRj();
        if (preExecTransactionResQSLkRj == null || (txInfo = preExecTransactionResQSLkRj.getTxInfo()) == null) {
            return;
        }
        TxInfoItem txInfo2 = preExecTransactionResQSLkRj.getTxInfo();
        if (txInfo2 == null || (moduleList = txInfo2.getModuleList()) == null || (listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) moduleList)) == null) {
            listFJNWhG = null;
        } else {
            listFJNWhG.add(baseModel);
        }
        txInfo.setModuleList(listFJNWhG);
    }

    @Override // o.AbstractC8564bFB
    public java.util.ArrayList<java.lang.Integer> AuCTelauCTel() {
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        if (aUsmxb() == OKWBaseTransaction.TransactionType.Approve) {
            arrayList.add(3);
        }
        return arrayList;
    }

    public static /* synthetic */ BroadcastBean generateBroadcastModel$default(AbstractC8601bFm abstractC8601bFm, java.lang.String str, java.lang.String str2, CommonExtJson commonExtJson, java.lang.Object obj, int i, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateBroadcastModel");
        }
        if ((i & 4) != 0) {
            commonExtJson = abstractC8601bFm.ah_();
        }
        if ((i & 8) != 0) {
            obj = null;
        }
        return abstractC8601bFm.EZpvd(str, str2, commonExtJson, obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bFB.generateCommonBroadcastModel$default(o.bFB, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, com.okinc.business.defi.biz.core.transaction.bean.CommonExtJson, java.lang.Object, java.lang.String, java.lang.String, int, java.lang.Object):com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean */
    public final BroadcastBean EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull CommonExtJson commonExtJson, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(commonExtJson, "");
        return AbstractC8564bFB.generateCommonBroadcastModel$default(this, str, str2, dHguZz().AhwBna(), C54862xYb.convertToBigIntegerString$default(zuBGHE(), true, (RoundingMode) null, 2, (java.lang.Object) null), QKudOq().AEQbTJ(), commonExtJson, obj, getInputData$default(this, false, 1, null), null, 256, null);
    }

    public final CommonExtJson ah_() {
        return new CommonExtJson(dHguZz().valueOf(), 0, null);
    }

    public final boolean QUSxYX() {
        java.util.List listAhwBna = yDY.AhwBna(2, 7, 5);
        if (!dHguZz().fARcdN() ? !(!dHguZz().run() ? !dHguZz().ejfBZ() ? !dHguZz().DGOPHZ() && !dHguZz().ixgjPv() : aUsmxb() != OKWBaseTransaction.TransactionType.Contract && aUsmxb() != OKWBaseTransaction.TransactionType.Approve && aUsmxb() != OKWBaseTransaction.TransactionType.DappTransfer : !listAhwBna.contains(java.lang.Integer.valueOf(QwvEab())) || aUsmxb() == OKWBaseTransaction.TransactionType.CancelApprove) : listAhwBna.contains(java.lang.Integer.valueOf(QwvEab()))) {
            KYSPreTxCheckInfo kYSPreTxCheckInfoAb_ = ab_();
            if (kYSPreTxCheckInfoAb_ != null && C33129mqd.KWHzl((java.util.Collection) kYSPreTxCheckInfoAb_.getAssetsDiffs())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x0135 */
    /* JADX DEBUG: Type inference failed for r12v1. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final java.util.List<AbstractC8601bFm<Fee, SignData>.Activity> OLrzqt(final boolean z) {
        java.lang.String strEZpvd;
        java.lang.String strFJNWhG;
        if (QUSxYX()) {
            KYSPreTxCheckInfo kYSPreTxCheckInfoAb_ = ab_();
            java.util.List<AssetsDiffInfo> assetsDiffs = kYSPreTxCheckInfoAb_ != null ? kYSPreTxCheckInfoAb_.getAssetsDiffs() : null;
            if (C33129mqd.KWHzl((java.util.Collection) assetsDiffs)) {
                Intrinsics.copydefault(assetsDiffs);
                return C59467zhb.zuBGHE(C59467zhb.wlaJM(C59467zhb.fetchVPNInfo(CollectionsKt___CollectionsKt.QVAiDq(assetsDiffs), new Function1() { // from class: o.bFt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC8601bFm.AEQbTJ(z, this, (AssetsDiffInfo) obj);
                    }
                })));
            }
        }
        if (!z) {
            return null;
        }
        SignData signdataQVsKAR = QVsKAR();
        C10854bwM c10854bwMDHguZz = dHguZz();
        java.lang.String strZuBGHE = zuBGHE();
        if (strZuBGHE == null) {
            strZuBGHE = "";
        }
        if (!C33129mqd.KWHzl((java.util.Collection) signdataQVsKAR.getFromToken())) {
            if (C33129mqd.AEQbTJ(strZuBGHE) == AudioStats.AUDIO_AMPLITUDE_NONE) {
                return null;
            }
            java.lang.String strDbNXlk = c10854bwMDHguZz.DbNXlk();
            boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) strDbNXlk);
            java.lang.Object obj = strDbNXlk;
            if (!zOLrzqt) {
                C18046fax c18046fax = new C18046fax();
                java.lang.Character chWlaJM = C59454zhO.wlaJM(c10854bwMDHguZz.fJNWhG());
                java.lang.String string = chWlaJM != null ? chWlaJM.toString() : null;
                c18046fax.KWHzl(string != null ? string : "");
                obj = c18046fax;
            }
            return C56402yEa.EZpvd(new Activity(this, obj, "-" + C54870xYj.EZpvd(strZuBGHE, c10854bwMDHguZz.valueOf(), c10854bwMDHguZz.DTwDnp(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null), c10854bwMDHguZz.fJNWhG(), OLrzqt(c10854bwMDHguZz, strZuBGHE), false));
        }
        java.util.List<ContractSignData.FromToken> fromToken = signdataQVsKAR.getFromToken();
        Intrinsics.copydefault(fromToken);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(fromToken, 10));
        for (ContractSignData.FromToken fromToken2 : fromToken) {
            C10854bwM c10854bwM = fromToken2.isNativeToken() ? c10854bwMDHguZz : (C10854bwM) InterfaceC9737bbI.Application.getTokenWithContractAddressAndChainId$default(C11627cVg.KWHzl, fromToken2.getTokenContractAddress(), c10854bwMDHguZz.fetchVPNInfo(), false, 4, null);
            ?? imageUrl = C33129mqd.OLrzqt((java.lang.CharSequence) fromToken2.getImageUrl()) ? fromToken2.getImageUrl() : c10854bwM != null ? c10854bwM.DbNXlk() : 0;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) fromToken2.getFormatAmount())) {
                strEZpvd = fromToken2.getFormatAmount();
            } else if (c10854bwM != null) {
                strEZpvd = C54870xYj.EZpvd(fromToken2.getAmount(), c10854bwM.valueOf(), c10854bwM.DTwDnp(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
            } else {
                strEZpvd = "";
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) fromToken2.getSymbol())) {
                strFJNWhG = fromToken2.getSymbol();
            } else {
                strFJNWhG = c10854bwM != null ? c10854bwM.fJNWhG() : null;
                if (strFJNWhG == null) {
                    strFJNWhG = "";
                }
            }
            java.lang.String strOLrzqt = (c10854bwM == null || fromToken2.getAmount().length() == 0) ? "" : OLrzqt(c10854bwM, fromToken2.getAmount());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) imageUrl)) {
                Intrinsics.copydefault((java.lang.Object) imageUrl);
            } else {
                C18046fax c18046fax2 = new C18046fax();
                java.lang.Character chWlaJM2 = C59454zhO.wlaJM(strFJNWhG);
                java.lang.String string2 = chWlaJM2 != null ? chWlaJM2.toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                c18046fax2.KWHzl(string2);
                imageUrl = c18046fax2;
            }
            arrayList.add(new Activity(this, imageUrl, "-" + strEZpvd, fromToken2.getSymbol(), strOLrzqt, false));
        }
        return arrayList;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bbI.Application.getTokenWithContractAddressAndChainId$default(o.bbI, java.lang.String, long, boolean, int, java.lang.Object):o.bbC */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b A[PHI: r3
  0x009b: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v25 java.lang.String) binds: [B:40:0x008d, B:42:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Activity AEQbTJ(boolean z, AbstractC8601bFm abstractC8601bFm, AssetsDiffInfo assetsDiffInfo) {
        Asset asset;
        int iValueOf;
        int i;
        int iDTwDnp;
        boolean z2;
        java.lang.String str;
        java.lang.String strAYXKKw;
        java.lang.Integer assetType;
        java.lang.String nftImageUrl;
        java.lang.String strCopydefault;
        java.lang.String strCopydefault2;
        java.lang.String symbol;
        java.lang.String imageUrl;
        Intrinsics.checkNotNullParameter(assetsDiffInfo, "");
        java.lang.String diff = assetsDiffInfo.getDiff();
        java.lang.String str2 = "-";
        boolean zStartsWith$default = diff != null ? C59449zhJ.startsWith$default(diff, "-", false, 2, null) : false;
        if ((z && !zStartsWith$default) || ((!z && zStartsWith$default) || (asset = assetsDiffInfo.getAsset()) == null)) {
            return null;
        }
        java.lang.Integer decimals = asset.getDecimals();
        if (decimals != null) {
            iValueOf = decimals.intValue();
        } else {
            java.lang.Integer assetType2 = asset.getAssetType();
            int value = KYSAssetType.NFT_TYPE.getValue();
            if (assetType2 != null && assetType2.intValue() == value) {
                i = 0;
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) asset.getAddress())) {
                    C11627cVg c11627cVg = C11627cVg.KWHzl;
                    java.lang.String address = asset.getAddress();
                    java.lang.String str3 = address == null ? "" : address;
                    java.lang.Long chainId = asset.getChainId();
                    C10854bwM c10854bwM = (C10854bwM) InterfaceC9737bbI.Application.getTokenWithContractAddressAndChainId$default(c11627cVg, str3, chainId != null ? chainId.longValue() : -1L, false, 4, null);
                    iDTwDnp = c10854bwM != null ? c10854bwM.DTwDnp() : 8;
                }
                int i2 = iDTwDnp;
                z2 = true;
                if (!zStartsWith$default) {
                    str = diff;
                } else if (diff != null) {
                    diff = diff.substring(1);
                    Intrinsics.checkNotNullExpressionValue(diff, "");
                    str = diff;
                } else {
                    str = null;
                }
                if (str == null && C59449zhJ.gEmmrt(str, "0x0", true)) {
                    strAYXKKw = "0";
                } else if (str != null || str.length() == 0) {
                    strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialaGOrKO);
                } else {
                    strAYXKKw = C9700baY.EZpvd(str) ? C54870xYj.EZpvd(C33491mxU.OLrzqt(str), i, i2, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null) : C54870xYj.EZpvd(str, i, i2, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                }
                if (!zStartsWith$default) {
                    if (zStartsWith$default) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str2 = Marker.ANY_NON_NULL_MARKER;
                }
                assetType = asset.getAssetType();
                int value2 = KYSAssetType.NATIVE_TYPE.getValue();
                if (assetType != null && assetType.intValue() == value2) {
                    java.lang.String str4 = str2 + strAYXKKw;
                    symbol = asset.getSymbol();
                    if (symbol == null) {
                        symbol = "";
                    }
                    imageUrl = asset.getImageUrl();
                    if (imageUrl == null) {
                        imageUrl = "";
                    }
                    z2 = false;
                    strCopydefault = symbol;
                    str2 = str4;
                    nftImageUrl = imageUrl;
                } else {
                    int value3 = KYSAssetType.TOKEN_TYPE.getValue();
                    if (assetType == null || assetType.intValue() != value3) {
                        int value4 = KYSAssetType.OTHER_TYPE.getValue();
                        if (assetType == null || assetType.intValue() != value4) {
                            int value5 = KYSAssetType.NFT_TYPE.getValue();
                            if (assetType != null && assetType.intValue() == value5) {
                                AmountDetail amountDetail = assetsDiffInfo.getAmountDetail();
                                nftImageUrl = amountDetail != null ? amountDetail.getNftImageUrl() : null;
                                if (nftImageUrl == null) {
                                    nftImageUrl = "";
                                }
                                AmountDetail amountDetail2 = assetsDiffInfo.getAmountDetail();
                                java.lang.String tokenNum = amountDetail2 != null ? amountDetail2.getTokenNum() : null;
                                if (C33129mqd.OLrzqt((java.lang.CharSequence) tokenNum)) {
                                    str2 = str2 + tokenNum;
                                }
                                strCopydefault = abstractC8601bFm.copydefault(assetsDiffInfo.getAmountDetail());
                            } else {
                                nftImageUrl = "";
                                str2 = nftImageUrl;
                                z2 = false;
                                strCopydefault = str2;
                            }
                        }
                    }
                }
                java.lang.String diffUsdValue = assetsDiffInfo.getDiffUsdValue();
                strCopydefault2 = diffUsdValue != null ? abstractC8601bFm.copydefault(diffUsdValue) : null;
                if (strCopydefault2 == null) {
                    strCopydefault2 = "";
                }
                return new Activity(abstractC8601bFm, nftImageUrl, str2, strCopydefault, strCopydefault2, z2);
            }
            iValueOf = abstractC8601bFm.dHguZz().valueOf();
        }
        i = iValueOf;
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) asset.getAddress())) {
        }
        int i22 = iDTwDnp;
        z2 = true;
        if (!zStartsWith$default) {
        }
        if (str == null) {
            if (str != null) {
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialaGOrKO);
            }
        }
        if (!zStartsWith$default) {
        }
        assetType = asset.getAssetType();
        int value22 = KYSAssetType.NATIVE_TYPE.getValue();
        if (assetType != null) {
            java.lang.String str42 = str2 + strAYXKKw;
            symbol = asset.getSymbol();
            if (symbol == null) {
            }
            imageUrl = asset.getImageUrl();
            if (imageUrl == null) {
            }
            z2 = false;
            strCopydefault = symbol;
            str2 = str42;
            nftImageUrl = imageUrl;
        }
        java.lang.String diffUsdValue2 = assetsDiffInfo.getDiffUsdValue();
        if (diffUsdValue2 != null) {
        }
        if (strCopydefault2 == null) {
        }
        return new Activity(abstractC8601bFm, nftImageUrl, str2, strCopydefault, strCopydefault2, z2);
    }

    public final java.lang.String copydefault(AmountDetail amountDetail) {
        java.lang.String localized$default;
        if (amountDetail == null) {
            return "";
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) amountDetail.getNftName())) {
            java.lang.String nftName = amountDetail.getNftName();
            Intrinsics.copydefault((java.lang.Object) nftName);
            return nftName;
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) amountDetail.getTokenId())) {
            return "";
        }
        java.lang.String tokenId = amountDetail.getTokenId();
        Intrinsics.copydefault((java.lang.Object) tokenId);
        if (C59449zhJ.startsWith$default(tokenId, "-", false, 2, null)) {
            tokenId = tokenId.substring(1);
            Intrinsics.checkNotNullExpressionValue(tokenId, "");
        }
        if (C9700baY.EZpvd(tokenId)) {
            localized$default = pTB.formatLocalized$default(C33491mxU.OLrzqt(tokenId), null, 1, null);
        } else {
            localized$default = pTB.formatLocalized$default(tokenId, null, 1, null);
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor) + localized$default;
    }

    public final java.lang.String OLrzqt(C10854bwM c10854bwM, java.lang.String str) {
        WalletTickerManager.CoinPrice coinPriceCopydefault = DarRvM().copydefault(java.lang.Long.valueOf(c10854bwM.AhwBna()));
        return (coinPriceCopydefault == null || !coinPriceCopydefault.getHasPrice()) ? "" : copydefault(C54862xYb.OLrzqt(C54870xYj.AEQbTJ(str, c10854bwM.valueOf()), coinPriceCopydefault.getRealPrice()));
    }

    public final java.lang.String aa_() {
        java.util.List<ExposureInfo> exposures;
        ExposureInfo exposureInfo;
        KYSPreTxCheckInfo kYSPreTxCheckInfoAb_ = ab_();
        if (kYSPreTxCheckInfoAb_ == null || (exposures = kYSPreTxCheckInfoAb_.getExposures()) == null || (exposureInfo = (ExposureInfo) CollectionsKt___CollectionsKt.firstOrNull(exposures)) == null) {
            return null;
        }
        Spender spenderValue = exposureInfo.getSpenderValue();
        java.lang.String approvalRaw = spenderValue != null ? spenderValue.getApprovalRaw() : null;
        if (approvalRaw == null) {
            approvalRaw = "";
        }
        if (C59449zhJ.startsWith$default(approvalRaw, "-", false, 2, null)) {
            approvalRaw = approvalRaw.substring(1);
            Intrinsics.checkNotNullExpressionValue(approvalRaw, "");
        }
        return approvalRaw;
    }

    public final void dNCPSb() {
        KYSPreTxCheckInfo kYSPreTxCheckInfoAb_;
        java.util.List<ExposureInfo> exposures;
        ExposureInfo exposureInfo;
        Asset asset;
        ContractAddressResp contractAddressRespY_;
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) aa_()) || (kYSPreTxCheckInfoAb_ = ab_()) == null || (exposures = kYSPreTxCheckInfoAb_.getExposures()) == null || (exposureInfo = (ExposureInfo) CollectionsKt___CollectionsKt.firstOrNull(exposures)) == null || (asset = exposureInfo.getAsset()) == null || (contractAddressRespY_ = Y_()) == null) {
            return;
        }
        contractAddressRespY_.setPrecision(C11600cUg.copydefault(asset.getDecimals()));
        contractAddressRespY_.setLogo(asset.getImageUrl());
        java.lang.String symbol = asset.getSymbol();
        if (symbol == null) {
            symbol = "";
        }
        contractAddressRespY_.setSymbol(symbol);
    }

    public final java.lang.String copydefault(@NotNull C10854bwM c10854bwM, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(str, "");
        WalletTickerManager.CoinPrice coinPriceCopydefault = DarRvM().copydefault(java.lang.Long.valueOf(c10854bwM.AhwBna()));
        return (coinPriceCopydefault == null || !coinPriceCopydefault.getHasPrice()) ? "" : C54862xYb.convertToString$default(C54862xYb.OLrzqt(str, coinPriceCopydefault.getRealPrice()), false, null, null, 7, null);
    }

    /* JADX INFO: renamed from: o.bFm$Activity */
    public final class Activity {
        public final boolean AEQbTJ;
        public final java.lang.Object EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final /* synthetic */ AbstractC8601bFm<Fee, SignData> gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Object EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.AEQbTJ;
        }

        public Activity(@NotNull AbstractC8601bFm abstractC8601bFm, @NotNull java.lang.Object obj, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, boolean z) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.gEmmrt = abstractC8601bFm;
            this.EZpvd = obj;
            this.KWHzl = str;
            this.copydefault = str2;
            this.OLrzqt = str3;
            this.AEQbTJ = z;
        }
    }

    public static final kotlin.Pair KWHzl(AbstractC8601bFm abstractC8601bFm, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            abstractC8601bFm.copydefault = (ContractAddressResp) responseData.getData();
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
