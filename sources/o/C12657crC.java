package o;

import com.okinc.business.defi.biz.core.tx.TransactionType;
import com.okinc.business.defi.biz.core.tx.transaction.TransactionFeeInfo;
import com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction;
import com.okinc.business.defi.biz.core.tx.wallet.OkTransactionWallet;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.defi.biz.net.bean.BrcJsonRes;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckBizAndPayloadInfo;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.XRC20BalanceDetailInfoReq;
import com.okinc.business.defi.biz.net.bean.XRC20BalanceDetailInfoResp;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.utxo.BRC20InscriptionData;
import com.okinc.wallet.core.sign.utxo.BRC20Transaction;
import com.okinc.wallet.core.sign.utxo.BRC20TransactionResult;
import com.okinc.wallet.core.sign.utxo.UTXOTxIn;
import com.okinc.web3.security.bridge.MnemonicKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonObject;
import o.C12797ctk;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.crC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12657crC extends AbstractC12609cqH {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int uzCIH = 8;
    public java.lang.Integer AuCTelauCTel;
    public InterfaceC58217yxC AubY;
    public java.lang.String AwvSrB;
    public java.lang.String AxsJAY;
    public java.lang.String DTwDnp;
    public java.lang.String ORxRYg;
    public InterfaceC58217yxC OcIXYQ;
    public boolean QKVWgx;
    public boolean QOLQEE;
    public java.lang.String QUSxYX;
    public java.lang.String QVAiDq;
    public java.lang.String QbewEr;
    public java.lang.String QfsBiF;
    public java.lang.String RJOkX;
    public java.lang.String UeEOUB;
    public java.lang.String aKErDB;
    public int dNCPSb;
    public java.lang.String djSkpj;
    public java.lang.String dvKsVJ;
    public InterfaceC58217yxC dxcTrN;
    public java.util.List<UTXOInfoResp> fFgQHt;
    public volatile BRC20TransactionResult finit;
    public java.lang.Integer gHZMYf;
    public java.lang.String wlaJM;
    public java.lang.String zsXlph;
    public java.lang.String zuBGHE;
    public final java.lang.String zLjUOn = "OkUTXOInscribeTransaction";
    public final java.lang.String RcXXUw = xYS.copydefault.KWHzl(MnemonicKt.MnemonicLanguageEnglish);
    public java.lang.String sSMYrx = "1";
    public final C12797ctk fZBcTu = new C12797ctk();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OcIXYQ() {
        java.lang.String str = this.ORxRYg;
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String QbewEr() {
        java.lang.String str = this.zsXlph;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: o.crC$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.crC.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.AbstractC12609cqH
    public void copydefault(@NotNull TransactionType transactionType, @NotNull OkTransactionWallet okTransactionWallet, java.lang.String str, java.lang.String str2, int i, TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(okTransactionWallet, "");
        super.copydefault(transactionType, okTransactionWallet, str, str2, i, txToastCheckBizAndPayloadInfo);
        this.AuCTelauCTel = 32;
        this.gHZMYf = 32;
    }

    public static final kotlin.Pair copydefault(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (kotlin.Pair) yho.invoke(obj, obj2, obj3);
    }

    @Override // o.AbstractC12609cqH
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AubY() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDjSkpj = djSkpj();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQfsBiF = QfsBiF();
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQOLQEE = QOLQEE();
        final yHO yho = new yHO() { // from class: o.crF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C12657crC.KWHzl((kotlin.Pair) obj, (kotlin.Pair) obj2, (kotlin.Pair) obj3);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXDjSkpj, abstractC58185ywXQfsBiF, abstractC58185ywXQOLQEE, new InterfaceC58228yxN() { // from class: o.crJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58228yxN
            public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C12657crC.copydefault(yho, obj, obj2, obj3);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.crS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12657crC.AYXKKw(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.crZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12657crC.QKVWgx(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair KWHzl(kotlin.Pair pair, kotlin.Pair pair2, kotlin.Pair pair3) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        Intrinsics.checkNotNullParameter(pair3, "");
        return (((java.lang.Boolean) pair.getFirst()).booleanValue() && ((java.lang.Boolean) pair2.getFirst()).booleanValue() && ((java.lang.Boolean) pair3.getFirst()).booleanValue()) ? C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "") : !((java.lang.Boolean) pair.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair.getSecond()) : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair2.getSecond()) : !((java.lang.Boolean) pair3.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair3.getSecond()) : C56390yDp.OLrzqt(java.lang.Boolean.FALSE, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd QKVWgx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AYXKKw(C12657crC c12657crC, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return c12657crC.DTwDnp();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    @Override // o.AbstractC12609cqH
    public void zLjUOn() {
        sSMYrx();
    }

    @Override // o.AbstractC12609cqH
    public void EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        super.EZpvd(str, z);
    }

    @Override // o.AbstractC12609cqH
    public void sSMYrx() {
        super.sSMYrx();
        InterfaceC58217yxC interfaceC58217yxC = this.AubY;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        KWHzl(true);
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQfsBiF = QfsBiF();
        final Function1 function1 = new Function1() { // from class: o.csj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12657crC.AhwBna(this.copydefault, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM<? super kotlin.Pair<java.lang.Boolean, java.lang.String>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.csl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C12657crC.zuBGHE(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.csk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12657crC.EZpvd(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        this.AubY = abstractC58185ywXQfsBiF.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.csr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C12657crC.gHZMYf(function12, obj);
            }
        });
    }

    public static final void zuBGHE(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(C12657crC c12657crC, kotlin.Pair pair) {
        c12657crC.KWHzl(false);
        return Unit.INSTANCE;
    }

    public static final void gHZMYf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C12657crC c12657crC, java.lang.Throwable th) {
        c12657crC.KWHzl(false);
        return Unit.INSTANCE;
    }

    public final void valueOf(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "commitTxFee")) {
            java.lang.Integer num = this.AuCTelauCTel;
            if (num != null && num.intValue() == 31) {
                this.wlaJM = this.QfsBiF;
                return;
            }
            if (num != null && num.intValue() == 33) {
                this.wlaJM = this.RJOkX;
                return;
            }
            if (num != null && num.intValue() == 32) {
                this.wlaJM = this.aKErDB;
                return;
            } else {
                if (num != null && num.intValue() == 34) {
                    this.wlaJM = this.AwvSrB;
                    return;
                }
                return;
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "revealTxFee")) {
            java.lang.Integer num2 = this.gHZMYf;
            if (num2 != null && num2.intValue() == 31) {
                this.UeEOUB = this.QfsBiF;
                return;
            }
            if (num2 != null && num2.intValue() == 33) {
                this.UeEOUB = this.RJOkX;
                return;
            }
            if (num2 != null && num2.intValue() == 32) {
                this.UeEOUB = this.aKErDB;
            } else if (num2 != null && num2.intValue() == 34) {
                this.UeEOUB = this.zuBGHE;
            }
        }
    }

    @Override // o.AbstractC12609cqH
    public java.lang.Integer valueOf() {
        return AEQbTJ(this.AxsJAY);
    }

    public final java.lang.Integer AEQbTJ(java.lang.String str) {
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "commitTxFee") && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "revealTxFee")) {
            return this.gHZMYf;
        }
        return this.AuCTelauCTel;
    }

    public final java.lang.String gEmmrt(java.lang.String str) {
        return EZpvd(this.finit, str);
    }

    public final java.lang.String EZpvd(BRC20TransactionResult bRC20TransactionResult, java.lang.String str) {
        BigDecimal bigDecimalKWHzl;
        java.util.List<java.lang.String> revealTxFees;
        java.util.List<java.lang.String> revealTxFees2;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "commitTxFee")) {
            bigDecimalKWHzl = C54862xYb.divB$default(bRC20TransactionResult != null ? bRC20TransactionResult.getCommitTxFee() : null, this.wlaJM, 0, null, 4, null);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "revealTxFee")) {
            bigDecimalKWHzl = C54862xYb.divB$default((bRC20TransactionResult == null || (revealTxFees2 = bRC20TransactionResult.getRevealTxFees()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(revealTxFees2), this.UeEOUB, 0, null, 4, null);
        } else {
            bigDecimalKWHzl = C54862xYb.KWHzl(C54862xYb.divB$default(bRC20TransactionResult != null ? bRC20TransactionResult.getCommitTxFee() : null, this.wlaJM, 0, null, 4, null), C54862xYb.divB$default((bRC20TransactionResult == null || (revealTxFees = bRC20TransactionResult.getRevealTxFees()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(revealTxFees), this.UeEOUB, 0, null, 4, null));
        }
        return C54862xYb.convertToBigIntegerString$default(C54862xYb.convertToString$default(bigDecimalKWHzl, false, null, null, 7, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
    }

    @Override // o.AbstractC12609cqH
    public TransactionFeeInfo AYXKKw() {
        return KWHzl(this.AxsJAY);
    }

    public final TransactionFeeInfo KWHzl(java.lang.String str) {
        java.util.List<java.lang.String> revealTxFees;
        java.util.List<java.lang.String> revealTxFees2;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "commitTxFee")) {
            TransactionFeeInfo transactionFeeInfoAkhnZx = AkhnZx();
            BRC20TransactionResult bRC20TransactionResult = this.finit;
            transactionFeeInfoAkhnZx.setFeeValue(bRC20TransactionResult != null ? bRC20TransactionResult.getCommitTxFee() : null);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "revealTxFee")) {
            TransactionFeeInfo transactionFeeInfoAkhnZx2 = AkhnZx();
            BRC20TransactionResult bRC20TransactionResult2 = this.finit;
            transactionFeeInfoAkhnZx2.setFeeValue((bRC20TransactionResult2 == null || (revealTxFees2 = bRC20TransactionResult2.getRevealTxFees()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(revealTxFees2));
        } else {
            TransactionFeeInfo transactionFeeInfoAkhnZx3 = AkhnZx();
            BRC20TransactionResult bRC20TransactionResult3 = this.finit;
            java.lang.String commitTxFee = bRC20TransactionResult3 != null ? bRC20TransactionResult3.getCommitTxFee() : null;
            BRC20TransactionResult bRC20TransactionResult4 = this.finit;
            transactionFeeInfoAkhnZx3.setFeeValue(C54862xYb.convertToString$default(C54862xYb.KWHzl(commitTxFee, (bRC20TransactionResult4 == null || (revealTxFees = bRC20TransactionResult4.getRevealTxFees()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(revealTxFees)), false, null, null, 7, null));
        }
        java.lang.String strGEmmrt = gEmmrt(str);
        AkhnZx().setSlowFee(C54862xYb.convertToString$default(C54862xYb.OLrzqt(this.QfsBiF, strGEmmrt), false, null, null, 7, null));
        AkhnZx().setRecommendFee(C54862xYb.convertToString$default(C54862xYb.OLrzqt(this.aKErDB, strGEmmrt), false, null, null, 7, null));
        AkhnZx().setFastFee(C54862xYb.convertToString$default(C54862xYb.OLrzqt(this.RJOkX, strGEmmrt), false, null, null, 7, null));
        C10854bwM c10854bwMEZpvd = EZpvd();
        int iValueOf = c10854bwMEZpvd != null ? c10854bwMEZpvd.valueOf() : 0;
        C10854bwM c10854bwMEZpvd2 = EZpvd();
        int iFZBcTu = c10854bwMEZpvd2 != null ? c10854bwMEZpvd2.fZBcTu() : 0;
        TransactionFeeInfo transactionFeeInfoAkhnZx4 = AkhnZx();
        C10854bwM c10854bwMEZpvd3 = EZpvd();
        transactionFeeInfoAkhnZx4.setFeeSymbol(c10854bwMEZpvd3 != null ? c10854bwMEZpvd3.fJNWhG() : null);
        AkhnZx().setCoinSymbol(gEmmrt().fJNWhG());
        TransactionFeeInfo transactionFeeInfoAkhnZx5 = AkhnZx();
        java.lang.String recommendFee = AkhnZx().getRecommendFee();
        if (recommendFee == null) {
            recommendFee = "";
        }
        transactionFeeInfoAkhnZx5.setDisplayRecommend(C54870xYj.KWHzl(recommendFee, iValueOf, iFZBcTu, null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null));
        AkhnZx().setMemPoolGasPriceMin(this.QUSxYX);
        AkhnZx().setGasPriceMin(this.QfsBiF);
        AkhnZx().setGasPriceNormal(this.aKErDB);
        AkhnZx().setGasPriceMax(this.RJOkX);
        AkhnZx().setMixCost(this.QbewEr);
        AkhnZx().setNormalCost(this.djSkpj);
        AkhnZx().setMaxCost(this.DTwDnp);
        return AkhnZx();
    }

    public static /* synthetic */ java.lang.String getMinOutput$default(C12657crC c12657crC, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return c12657crC.EZpvd(z, z2);
    }

    public final java.lang.String EZpvd(boolean z, boolean z2) {
        C10854bwM c10854bwMEZpvd;
        if (z) {
            java.lang.String str = this.QVAiDq;
            if (str != null) {
                C10854bwM c10854bwMEZpvd2 = EZpvd();
                int iValueOf = c10854bwMEZpvd2 != null ? c10854bwMEZpvd2.valueOf() : 0;
                C10854bwM c10854bwMEZpvd3 = EZpvd();
                java.lang.String strEZpvd = C54870xYj.EZpvd(str, iValueOf, c10854bwMEZpvd3 != null ? c10854bwMEZpvd3.AkhnZx() : 6, (!z2 || (c10854bwMEZpvd = EZpvd()) == null) ? null : c10854bwMEZpvd.fJNWhG(), (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                if (strEZpvd != null) {
                    return strEZpvd;
                }
            }
        } else {
            java.lang.String str2 = this.QVAiDq;
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> djSkpj() {
        AbstractC58185ywX<ResponseData<XRC20BalanceDetailInfoResp>> abstractC58185ywXKWHzl = isConnected().KWHzl(new XRC20BalanceDetailInfoReq(DbNXlk(), java.lang.Long.valueOf(AEQbTJ())));
        final Function1 function1 = new Function1() { // from class: o.crR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12657crC.AhwBna(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.crT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12657crC.AuCTelauCTel(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair zsXlph(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QfsBiF() {
        AbstractC58185ywX<ResponseData<BrcJsonRes>> abstractC58185ywXQVAiDq = QVAiDq();
        final Function1 function1 = new Function1() { // from class: o.csb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12657crC.gEmmrt(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXQVAiDq.AEQbTJ(new InterfaceC58229yxO() { // from class: o.csh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12657crC.zsXlph(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public final AbstractC58185ywX<ResponseData<BrcJsonRes>> QVAiDq() {
        if (gEmmrt().DAIeex()) {
            return isConnected().OLrzqt(gEmmrt().fJNWhG(), C54870xYj.AEQbTJ(C54862xYb.convertToBigIntegerString$default(AbstractC12609cqH.getTransferAmount$default(this, false, false, false, 7, null), true, (RoundingMode) null, 2, (java.lang.Object) null), gEmmrt().valueOf()), ExtJson.BRC20TYPE_TRANSFER, "brc20-s", C14079deg.EZpvd.AEQbTJ(gEmmrt()));
        }
        return isConnected().copydefault(gEmmrt().fJNWhG(), C54870xYj.AEQbTJ(C54862xYb.convertToBigIntegerString$default(AbstractC12609cqH.getTransferAmount$default(this, false, false, false, 7, null), true, (RoundingMode) null, 2, (java.lang.Object) null), gEmmrt().valueOf()), ExtJson.BRC20TYPE_TRANSFER);
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QOLQEE() {
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = isConnected().copydefault(fIwbmz(), getFieldNames(), new SignInfoReq(C33129mqd.gEmmrt(copydefault()), DbNXlk(), fARcdN(), 5, (java.lang.String) null, C54862xYb.convertToBigIntegerString$default(AuCTel(), true, (RoundingMode) null, 2, (java.lang.Object) null), (java.lang.String) null, gEmmrt().QbewEr(), (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8000, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.crX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12657crC.AYXKKw(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.crU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12657crC.getNewProxyInstance(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public final void copydefault(JsonObject jsonObject) {
        if (jsonObject == null) {
            return;
        }
        OkUTXOTransaction.UTXOSignInfo uTXOSignInfo = (OkUTXOTransaction.UTXOSignInfo) C33489mxS.KWHzl.AEQbTJ().decodeFromJsonElement(OkUTXOTransaction.UTXOSignInfo.Companion.serializer(), jsonObject);
        AkhnZx().setFixed(false);
        this.QUSxYX = uTXOSignInfo.getMempoolMin();
        this.QfsBiF = uTXOSignInfo.getMin();
        this.aKErDB = uTXOSignInfo.getNormal();
        this.RJOkX = uTXOSignInfo.getMax();
        this.QbewEr = uTXOSignInfo.getMinCost();
        this.djSkpj = uTXOSignInfo.getNormalCost();
        this.DTwDnp = uTXOSignInfo.getMaxCost();
        if (C33129mqd.AEQbTJ(this.aKErDB, this.RJOkX)) {
            this.aKErDB = this.RJOkX;
            this.djSkpj = this.QbewEr;
        } else if (C33129mqd.gEmmrt(this.aKErDB, this.QfsBiF)) {
            this.aKErDB = this.QfsBiF;
            this.djSkpj = this.DTwDnp;
        }
        valueOf("commitTxFee");
        valueOf("revealTxFee");
        this.QVAiDq = uTXOSignInfo.getMinOutput();
        this.ORxRYg = uTXOSignInfo.getInscriptionOutput();
        this.dvKsVJ = uTXOSignInfo.getTransferReminder();
        java.lang.Integer queryCount = uTXOSignInfo.getQueryCount();
        this.dNCPSb = queryCount != null ? queryCount.intValue() : this.fZBcTu.OLrzqt();
    }

    public final java.lang.String QUSxYX() {
        return OcIXYQ();
    }

    public final java.lang.String RJOkX() {
        java.lang.String feeValue = KWHzl((java.lang.String) null).getFeeValue();
        return feeValue == null ? "" : feeValue;
    }

    public static final InterfaceC60096zvd wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> DTwDnp() {
        AbstractC58185ywX abstractC58185ywXKWHzl = C11607cUn.KWHzl(loadUTXO$default(this, 0, 1, null));
        final Function1 function1 = new Function1() { // from class: o.css
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12657crC.djBIcL(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.cso
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12657crC.wlaJM(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final kotlin.Pair getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair OLrzqt(C12657crC c12657crC, BRC20TransactionResult bRC20TransactionResult) {
        Intrinsics.checkNotNullParameter(bRC20TransactionResult, "");
        c12657crC.finit = bRC20TransactionResult;
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    public static /* synthetic */ AbstractC58185ywX loadUTXO$default(C12657crC c12657crC, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return c12657crC.EZpvd(i);
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<UTXOInfoResp>>> EZpvd(final int i) {
        C13934dbu c13934dbuIsConnected = isConnected();
        java.lang.String strFIwbmz = fIwbmz();
        java.lang.String fieldNames = getFieldNames();
        java.lang.Long lCopydefault = copydefault();
        java.lang.String strDbNXlk = DbNXlk();
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(QUSxYX(), true, (RoundingMode) null, 2, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(RJOkX(), true, (RoundingMode) null, 2, (java.lang.Object) null);
        C10854bwM c10854bwMGEmmrt = gEmmrt();
        AbstractC58185ywX<ResponseData<java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = c13934dbuIsConnected.KWHzl(strFIwbmz, fieldNames, new UTXOInfoReq(lCopydefault, C56402yEa.EZpvd(new UTXOAddressInfoReq(strDbNXlk, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, (java.lang.Integer) 11, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) 0, c10854bwMGEmmrt != null ? c10854bwMGEmmrt.QbewEr() : null, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 59376, (DefaultConstructorMarker) null)), 0, 4, null));
        final Function1 function1 = new Function1() { // from class: o.crL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12657crC.valueOf(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.crO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12657crC.zLjUOn(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C11607cUn.EZpvd(abstractC58185ywXKWHzl2);
        final Function1 function12 = new Function1() { // from class: o.crQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12657crC.OLrzqt(this.KWHzl, i, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl3 = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.crP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12657crC.sSMYrx(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        return abstractC58185ywXKWHzl3;
    }

    public static final InterfaceC60096zvd zLjUOn(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final kotlin.Pair AubY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd valueOf(C12657crC c12657crC, final ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        AbstractC58185ywX<BRC20TransactionResult> abstractC58185ywXOLrzqt = c12657crC.OLrzqt((java.util.List<UTXOInfoResp>) responseData.getData());
        final Function1 function1 = new Function1() { // from class: o.csf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12657crC.AEQbTJ(responseData, (BRC20TransactionResult) obj);
            }
        };
        return abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.csi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12657crC.AubY(function1, obj);
            }
        });
    }

    public static final kotlin.Pair AEQbTJ(ResponseData responseData, BRC20TransactionResult bRC20TransactionResult) {
        Intrinsics.checkNotNullParameter(bRC20TransactionResult, "");
        return C56390yDp.OLrzqt(bRC20TransactionResult, responseData);
    }

    public static final InterfaceC60096zvd sSMYrx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(C12657crC c12657crC, int i, kotlin.Pair pair) {
        java.util.List<java.lang.String> revealTxs;
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        BRC20TransactionResult bRC20TransactionResult = (BRC20TransactionResult) first;
        java.lang.String commitTx = bRC20TransactionResult.getCommitTx();
        boolean z = commitTx == null || commitTx.length() == 0 || (revealTxs = bRC20TransactionResult.getRevealTxs()) == null || revealTxs.isEmpty() || !Intrinsics.EZpvd((java.lang.Object) c12657crC.EZpvd(bRC20TransactionResult, "commitTxFee"), (java.lang.Object) c12657crC.gEmmrt("commitTxFee")) || !Intrinsics.EZpvd((java.lang.Object) c12657crC.EZpvd(bRC20TransactionResult, "revealTxFee"), (java.lang.Object) c12657crC.gEmmrt("revealTxFee"));
        if (((ResponseData) pair.getSecond()).getCode() == 0 && z && i < c12657crC.dNCPSb) {
            c12657crC.finit = bRC20TransactionResult;
            c12657crC.fFgQHt = (java.util.List) ((ResponseData) pair.getSecond()).getData();
            return c12657crC.EZpvd(i + 1);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair.getSecond());
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public final C12797ctk.StateListAnimator EZpvd(java.util.List<UTXOInfoResp> list) {
        C12797ctk c12797ctk = this.fZBcTu;
        AbstractC12782ctV newProxyInstance = getNewProxyInstance();
        C10854bwM c10854bwMGEmmrt = gEmmrt();
        java.lang.String strQUSxYX = QUSxYX();
        java.lang.String strRJOkX = RJOkX();
        java.lang.String str = this.sSMYrx;
        java.lang.String str2 = this.QVAiDq;
        if (str2 == null) {
            str2 = "";
        }
        return c12797ctk.copydefault(newProxyInstance, c10854bwMGEmmrt, strQUSxYX, strRJOkX, str, str2, list);
    }

    private final int UeEOUB() {
        return this.fZBcTu.EZpvd(getNewProxyInstance(), gEmmrt(), DbNXlk());
    }

    @Override // o.AbstractC12609cqH
    public void AEQbTJ(long j) {
        InterfaceC58217yxC interfaceC58217yxC = this.OcIXYQ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(j, 7L, java.util.concurrent.TimeUnit.SECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.cse
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12657crC.OLrzqt(this.copydefault, (java.lang.Long) obj);
            }
        };
        this.OcIXYQ = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.csg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C12657crC.DTwDnp(function1, obj);
            }
        });
    }

    public static final void DTwDnp(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(final C12657crC c12657crC, java.lang.Long l) {
        InterfaceC58217yxC interfaceC58217yxC = c12657crC.dxcTrN;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQOLQEE = c12657crC.QOLQEE();
        final Function1 function1 = new Function1() { // from class: o.crH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12657crC.djBIcL(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXQOLQEE.KWHzl(new InterfaceC58229yxO() { // from class: o.crI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12657crC.AxsJAY(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.crG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12657crC.valueOf(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.crK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C12657crC.ORxRYg(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.crM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12657crC.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        c12657crC.dxcTrN = abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.crN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C12657crC.OcIXYQ(function13, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd AxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd djBIcL(C12657crC c12657crC, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDTwDnp = c12657crC.DTwDnp();
            final Function1 function1 = new Function1() { // from class: o.csc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12657crC.copydefault((kotlin.Pair) obj);
                }
            };
            return abstractC58185ywXDTwDnp.AEQbTJ(new InterfaceC58229yxO() { // from class: o.csa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12657crC.AwvSrB(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair.getSecond()));
    }

    public static final kotlin.Pair AwvSrB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair.getSecond());
    }

    public static final void ORxRYg(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(C12657crC c12657crC, kotlin.Pair pair) {
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c12657crC.AEQbTJ(1);
        }
        return Unit.INSTANCE;
    }

    public static final void OcIXYQ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public void aKErDB() {
        InterfaceC58217yxC interfaceC58217yxC = this.OcIXYQ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.dxcTrN;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.Boolean> */
    @Override // o.AbstractC12609cqH
    public AbstractC58185ywX<java.lang.Boolean> ORxRYg() {
        KWHzl(true);
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDTwDnp = DTwDnp();
        final Function1 function1 = new Function1() { // from class: o.crY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12657crC.gEmmrt(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXDTwDnp.AEQbTJ(new InterfaceC58229yxO() { // from class: o.csd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12657crC.QOLQEE(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.lang.Boolean QOLQEE(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean gEmmrt(C12657crC c12657crC, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c12657crC.KWHzl(false);
        return (java.lang.Boolean) pair.getFirst();
    }

    public static final BRC20TransactionResult uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BRC20TransactionResult) function1.invoke(obj);
    }

    public final AbstractC58185ywX<BRC20TransactionResult> OLrzqt(final java.util.List<UTXOInfoResp> list) {
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl("");
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXOLrzqt = C11607cUn.OLrzqt(abstractC58185ywXKWHzl);
        final Function1 function1 = new Function1() { // from class: o.csm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12657crC.AEQbTJ(list, this, (java.lang.String) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.csn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12657crC.uzCIH(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return C11607cUn.AEQbTJ(abstractC58185ywXAEQbTJ);
    }

    public static final BRC20TransactionResult AEQbTJ(java.util.List list, C12657crC c12657crC, java.lang.String str) throws java.lang.Exception {
        java.util.ArrayList<UTXOTxIn> arrayListKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        BRC20TransactionResult bRC20TransactionResultCopydefault = null;
        if (list != null && !list.isEmpty()) {
            java.lang.String str2 = c12657crC.RcXXUw;
            C12797ctk.StateListAnimator stateListAnimatorEZpvd = c12657crC.EZpvd((java.util.List<UTXOInfoResp>) list);
            if (stateListAnimatorEZpvd != null && (arrayListKWHzl = stateListAnimatorEZpvd.KWHzl()) != null) {
                bRC20TransactionResultCopydefault = c12657crC.copydefault((java.lang.String) null, str2, arrayListKWHzl);
            } else {
                throw new java.lang.Exception("utxo error");
            }
        }
        return bRC20TransactionResultCopydefault == null ? new BRC20TransactionResult((java.util.List) null, "", yDY.AhwBna(), "", yDY.AhwBna(), (java.lang.String) null, 33, (DefaultConstructorMarker) null) : bRC20TransactionResultCopydefault;
    }

    public final BRC20TransactionResult copydefault(java.lang.String str, java.lang.String str2, java.util.ArrayList<UTXOTxIn> arrayList) {
        C10854bwM c10854bwMEZpvd = EZpvd();
        long jQKVWgx = c10854bwMEZpvd != null ? c10854bwMEZpvd.QKVWgx() : -1L;
        C10854bwM c10854bwMEZpvd2 = EZpvd();
        SignParams signParams = new SignParams(jQKVWgx, c10854bwMEZpvd2 != null ? c10854bwMEZpvd2.fetchVPNInfo() : -1L, null, str, str2, java.lang.Integer.valueOf(getNewProxyInstance().finit()), UeEOUB(), null, false, false, null, 1920, null);
        java.lang.String str3 = this.wlaJM;
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.String str5 = this.UeEOUB;
        java.lang.String str6 = str5 == null ? "" : str5;
        java.lang.String strOcIXYQ = OcIXYQ();
        java.lang.String strDbNXlk = DbNXlk();
        java.util.List listEZpvd = C56402yEa.EZpvd(new BRC20InscriptionData("text/plain;charset=utf-8", QbewEr(), DbNXlk(), java.lang.Boolean.FALSE));
        java.lang.String str7 = this.QVAiDq;
        return C54904xZq.copydefault.AEQbTJ(signParams, new BRC20Transaction(str4, str6, strOcIXYQ, strDbNXlk, arrayList, listEZpvd, str7 == null ? "" : str7, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, 1920, (DefaultConstructorMarker) null));
    }

    @Override // o.AbstractC12609cqH
    public void zsXlph() {
        super.zsXlph();
        InterfaceC58217yxC interfaceC58217yxC = this.AubY;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        aKErDB();
    }

    public static final kotlin.Pair AhwBna(C12657crC c12657crC, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            XRC20BalanceDetailInfoResp xRC20BalanceDetailInfoResp = (XRC20BalanceDetailInfoResp) responseData.getData();
            c12657crC.EZpvd(java.lang.String.valueOf(xRC20BalanceDetailInfoResp != null ? xRC20BalanceDetailInfoResp.getAvailableWithoutSpending() : null));
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final kotlin.Pair gEmmrt(C12657crC c12657crC, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            BrcJsonRes brcJsonRes = (BrcJsonRes) responseData.getData();
            c12657crC.zsXlph = brcJsonRes != null ? brcJsonRes.getBrcJson() : null;
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final kotlin.Pair AYXKKw(C12657crC c12657crC, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            SignInfo signInfo = (SignInfo) responseData.getData();
            c12657crC.copydefault(signInfo != null ? signInfo.getInfo() : null);
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final InterfaceC60096zvd djBIcL(final C12657crC c12657crC, ResponseData responseData) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(responseData, "");
        if ((responseData.getCode() == 0 && responseData.getData() != null) || responseData.getCode() == 10004 || responseData.getCode() == 100041) {
            c12657crC.QOLQEE = responseData.getCode() == 10004;
            c12657crC.QKVWgx = responseData.getCode() == 100041;
            java.util.List list = (java.util.List) responseData.getData();
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((UTXOInfoResp) next).getAddress(), (java.lang.Object) c12657crC.DbNXlk())) {
                        break;
                    }
                }
                UTXOInfoResp uTXOInfoResp = (UTXOInfoResp) next;
                if (uTXOInfoResp != null) {
                    c12657crC.fFgQHt = (java.util.List) responseData.getData();
                    c12657crC.OLrzqt(uTXOInfoResp.getCanTransferAmount());
                }
            }
            AbstractC58185ywX<BRC20TransactionResult> abstractC58185ywXOLrzqt = c12657crC.OLrzqt(c12657crC.fFgQHt);
            final Function1 function1 = new Function1() { // from class: o.crV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12657crC.OLrzqt(this.EZpvd, (BRC20TransactionResult) obj);
                }
            };
            return abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.crW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12657crC.getFieldNames(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg()));
    }
}
