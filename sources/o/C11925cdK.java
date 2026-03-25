package o;

import com.okinc.business.defi.api.bean.NFTCollectionName;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.api.model.tx.signdata.TronApprovalSignData;
import com.okinc.business.defi.api.model.tx.signdata.TronContractSignData;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.core.transaction.sign.tron.OKWTronSignContract;
import com.okinc.business.defi.biz.net.bean.ContractAddressResp;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.TxMessage;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC8919bLm;
import o.C13754dXa;
import o.InterfaceC9730bbB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cdK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11925cdK extends OKWTronSignContract<TronApprovalSignData> implements InterfaceC9730bbB {
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.cdJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C11925cdK.EZpvd(this.AEQbTJ);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final kotlin.Pair AEQbTJ(kotlin.Pair pair, Unit unit) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(unit, "");
        return pair;
    }

    @Override // o.InterfaceC9730bbB
    public boolean KWHzl() {
        return false;
    }

    public final C11983ceP aKErDB() {
        return (C11983ceP) this.AYXKKw.getValue();
    }

    public static final C11983ceP EZpvd(C11925cdK c11925cdK) {
        return new C11983ceP(c11925cdK);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.tron.OKWTronSignContract, o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public boolean KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull C10854bwM c10854bwM, @NotNull SignDataArgs<TronApprovalSignData> signDataArgs) {
        OKWBaseTransaction.TransactionType transactionType;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(signDataArgs, "");
        boolean zKWHzl = super.KWHzl(abstractC12782ctV, c10854bwM, signDataArgs);
        java.lang.String inputData$default = AbstractC8601bFm.getInputData$default(this, false, 1, null);
        java.lang.String str = inputData$default != null ? inputData$default : "";
        if (Intrinsics.EZpvd(((TronApprovalSignData) QVsKAR()).isCancelApprove(), java.lang.Boolean.TRUE)) {
            transactionType = OKWBaseTransaction.TransactionType.CancelApprove;
        } else {
            AbstractC8919bLm.ActionBar actionBar = AbstractC8919bLm.Companion;
            if (actionBar.AEQbTJ(str)) {
                if (actionBar.KWHzl(str)) {
                    transactionType = OKWBaseTransaction.TransactionType.Approve;
                } else {
                    transactionType = OKWBaseTransaction.TransactionType.CancelApprove;
                }
            } else {
                transactionType = C33129mqd.OLrzqt(a_(false), "0") ? OKWBaseTransaction.TransactionType.CancelApprove : OKWBaseTransaction.TransactionType.Approve;
            }
        }
        OLrzqt(transactionType);
        return zKWHzl;
    }

    public static final kotlin.Pair AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC8601bFm
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OcIXYQ() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXOcIXYQ = super.OcIXYQ();
        final Function1 function1 = new Function1() { // from class: o.cdM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C11925cdK.AEQbTJ(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOcIXYQ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cdO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C11925cdK.AhwBna(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AEQbTJ(C11925cdK c11925cdK, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (c11925cdK.Y_() == null) {
            c11925cdK.copydefault(new ContractAddressResp((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.Boolean) null, 0, (java.lang.String) null, 255, (DefaultConstructorMarker) null));
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair gEmmrt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.tron.OKWTronSignContract, o.AbstractC8601bFm, o.AbstractC8564bFB
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> r_() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXR_ = super.r_();
        AbstractC58185ywX<Unit> abstractC58185ywXDvKsVJ = dvKsVJ();
        final Function2 function2 = new Function2() { // from class: o.cdI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C11925cdK.AEQbTJ((kotlin.Pair) obj, (Unit) obj2);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXR_, abstractC58185ywXDvKsVJ, new InterfaceC58223yxI() { // from class: o.cdN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C11925cdK.gEmmrt(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX DEBUG: Type inference failed for r0v5. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    public final AbstractC58185ywX<Unit> dvKsVJ() {
        final java.lang.String inputData$default = AbstractC8601bFm.getInputData$default(this, false, 1, null);
        if (inputData$default == null) {
            inputData$default = "";
        }
        if (AbstractC8919bLm.Companion.AEQbTJ(inputData$default)) {
            C13934dbu c13934dbuOFhtUX = OFhtUX();
            long jFetchVPNInfo = dHguZz().fetchVPNInfo();
            AbstractC58185ywX<ResponseData<NFTCollectionName>> abstractC58185ywXOLrzqt = c13934dbuOFhtUX.copydefault(java.lang.Long.valueOf(jFetchVPNInfo), zLjUOn()).OLrzqt(AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, new NFTCollectionName(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setIconUri)), null, 47, null)));
            final Function1 function1 = new Function1() { // from class: o.cdH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C11925cdK.EZpvd(this.KWHzl, inputData$default, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cdG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C11925cdK.EZpvd(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return abstractC58185ywXAEQbTJ;
        }
        AbstractC58185ywX<Unit> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final Unit EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit EZpvd(C11925cdK c11925cdK, java.lang.String str, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        C8497bDo c8497bDoDLWbHP = c11925cdK.DLWbHP();
        boolean zKWHzl = AbstractC8919bLm.Companion.KWHzl(str);
        java.lang.String strOLrzqt = c11925cdK.OLrzqt();
        NFTCollectionName nFTCollectionName = (NFTCollectionName) responseData.getData();
        c8497bDoDLWbHP.AEQbTJ(new C9876bdp(false, zKWHzl, strOLrzqt, nFTCollectionName != null ? nFTCollectionName.getName() : null));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB, com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> dxcTrN() {
        dNCPSb();
        return super.dxcTrN();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.tron.OKWTronSignContract
    public long RcXXUw() {
        if (djSkpj()) {
            return C33129mqd.valueOf(((TronApprovalSignData) QVsKAR()).getCoinId());
        }
        return super.RcXXUw();
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.tron.OKWTronSignContract
    public SignedTx KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (djSkpj()) {
            return aKErDB().EZpvd(str);
        }
        return super.KWHzl(str);
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.tron.OKWTronSignContract
    public TxMessage djBIcL() {
        if (djSkpj()) {
            return aKErDB().copydefault();
        }
        return super.djBIcL();
    }

    @Override // o.InterfaceC9730bbB
    public boolean w_() {
        return aUsmxb() == OKWBaseTransaction.TransactionType.Approve;
    }

    @Override // o.InterfaceC9730bbB
    public boolean AEQbTJ() {
        AbstractC8919bLm.ActionBar actionBar = AbstractC8919bLm.Companion;
        java.lang.String inputData$default = AbstractC8601bFm.getInputData$default(this, false, 1, null);
        if (inputData$default == null) {
            inputData$default = "";
        }
        return !actionBar.AEQbTJ(inputData$default);
    }

    @Override // o.InterfaceC9730bbB
    public java.lang.String a_(boolean z) {
        InterfaceC9730bbB.StateListAnimator stateListAnimatorEZpvd = EZpvd();
        java.lang.String strOLrzqt = C33491mxU.OLrzqt(KDccX());
        if (z) {
            return C54870xYj.EZpvd(strOLrzqt, stateListAnimatorEZpvd != null ? stateListAnimatorEZpvd.copydefault() : 0, stateListAnimatorEZpvd != null ? stateListAnimatorEZpvd.valueOf() : 8, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
        }
        return strOLrzqt;
    }

    private final java.lang.String KDccX() {
        java.lang.String strAa_ = aa_();
        return (strAa_ == null || strAa_.length() == 0) ? DGOPHZDGOPHZ() : strAa_;
    }

    private final java.lang.String DGOPHZDGOPHZ() {
        TronContractSignData.Value valueFvQaOB = fvQaOB();
        if (valueFvQaOB == null) {
            valueFvQaOB = new TronContractSignData.Value(null, null, null, null, null, null, 63, null);
        }
        java.lang.String data = valueFvQaOB.getData();
        if (data == null) {
            data = "";
        }
        int iCopydefault = C11600cUg.copydefault(java.lang.Integer.valueOf(data.length()));
        if (iCopydefault > 64) {
            iCopydefault -= 64;
        }
        java.lang.String strSubstring = data.substring(iCopydefault);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    @Override // o.InterfaceC9730bbB
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TronContractSignData.Value valueFvQaOB = fvQaOB();
        if (valueFvQaOB == null) {
            valueFvQaOB = new TronContractSignData.Value(null, null, null, null, null, null, 63, null);
        }
        if (valueFvQaOB.getCall_value() != null) {
            valueFvQaOB.setCall_value(java.lang.Long.valueOf(C33129mqd.valueOf(str)));
        }
        java.lang.String strCopydefault = C33491mxU.copydefault(str);
        if (C59449zhJ.startsWith$default(strCopydefault, EIP1271Verifier.hexPrefix, false, 2, null)) {
            strCopydefault = strCopydefault.substring(2);
            Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int iRJOkX = CollectionsKt___CollectionsKt.RJOkX(C56548yJl.AhwBna(0, 64 - strCopydefault.length()));
        for (int i = 0; i < iRJOkX; i++) {
            stringBuffer.append("0");
        }
        stringBuffer.append(strCopydefault);
        java.lang.String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String data = valueFvQaOB.getData();
        if (data == null) {
            data = "";
        }
        int length = data.length();
        if (length == 0) {
            return;
        }
        java.lang.String strSubstring = data.substring(0, length - 64);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        valueFvQaOB.setData(strSubstring + string);
    }

    @Override // o.InterfaceC9730bbB
    public InterfaceC9730bbB.StateListAnimator EZpvd() {
        ContractAddressResp contractAddressRespY_ = Y_();
        if (contractAddressRespY_ == null) {
            return null;
        }
        return new InterfaceC9730bbB.StateListAnimator(zLjUOn(), null, null, contractAddressRespY_.getSymbol(), contractAddressRespY_.getPrecision(), contractAddressRespY_.getPrecision(), contractAddressRespY_.getLogo(), null, contractAddressRespY_.isNft(), 128, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.tron.OKWTronSignContract, o.AbstractC8601bFm
    public java.lang.String AEQbTJ(boolean z) {
        if (z) {
            return super.AEQbTJ(true);
        }
        if (djSkpj()) {
            xYW xyw = xYW.AEQbTJ;
            java.lang.String approvalAddress = ((TronApprovalSignData) QVsKAR()).getApprovalAddress();
            if (approvalAddress == null) {
                approvalAddress = "";
            }
            return xyw.EZpvd(approvalAddress, C54862xYb.convertToBigIntegerString$default(zuBGHE(), false, (RoundingMode) null, 3, (java.lang.Object) null), aKErDB().EZpvd());
        }
        return super.AEQbTJ(false);
    }

    @Override // o.InterfaceC9730bbB
    public java.lang.String OLrzqt() {
        return C12801cto.EZpvd.KWHzl(AbstractC8601bFm.getInputData$default(this, false, 1, null), java.lang.String.valueOf(dHguZz().fetchVPNInfo()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean djSkpj() {
        return aUsmxb() == OKWBaseTransaction.TransactionType.CancelApprove && !UeEOUB() && ((TronApprovalSignData) QVsKAR()).getCoinId().length() > 0;
    }

    public final boolean UeEOUB() {
        InterfaceC9730bbB.StateListAnimator stateListAnimatorEZpvd = EZpvd();
        if (stateListAnimatorEZpvd == null || !Intrinsics.EZpvd(stateListAnimatorEZpvd.djBIcL(), java.lang.Boolean.TRUE)) {
            AbstractC8919bLm.ActionBar actionBar = AbstractC8919bLm.Companion;
            TronContractSignData.Value valueFvQaOB = fvQaOB();
            java.lang.String data = valueFvQaOB != null ? valueFvQaOB.getData() : null;
            if (data == null) {
                data = "";
            }
            if (!actionBar.AEQbTJ(data)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.okinc.business.defi.biz.core.transaction.sign.tron.OKWTronSignContract
    public java.lang.String fARcdN() {
        if (fZBcTu()) {
            return OLrzqt();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean fZBcTu() {
        return !UeEOUB() && ((aUsmxb() == OKWBaseTransaction.TransactionType.Approve) || (aUsmxb() == OKWBaseTransaction.TransactionType.CancelApprove && ((TronApprovalSignData) QVsKAR()).getCoinId().length() > 0));
    }
}
