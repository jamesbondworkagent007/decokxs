package o;

import com.google.gson.Gson;
import com.okinc.business.defi.biz.core.tx.TransactionType;
import com.okinc.business.defi.biz.core.tx.transaction.TransactionFeeInfo;
import com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction;
import com.okinc.business.defi.biz.core.tx.wallet.OkTransactionWallet;
import com.okinc.business.defi.biz.net.bean.SignInfo;
import com.okinc.business.defi.biz.net.bean.SignInfoReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckBizAndPayloadInfo;
import com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoReq;
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp;
import com.okinc.business.defi.biz.net.bean.UTXONftInfo;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.utxo.ARC20Data;
import com.okinc.wallet.core.sign.utxo.ARC20OutPut;
import com.okinc.wallet.core.sign.utxo.ARC20Transaction;
import com.okinc.wallet.core.sign.utxo.ARC20TxIn;
import com.okinc.wallet.core.sign.utxo.BRC20InscriptionData;
import com.okinc.wallet.core.sign.utxo.RunesData;
import com.okinc.wallet.core.sign.utxo.RunesMainData;
import com.okinc.wallet.core.sign.utxo.RunesMainOutPut;
import com.okinc.wallet.core.sign.utxo.RunesMainTransaction;
import com.okinc.wallet.core.sign.utxo.RunesMainTxIn;
import com.okinc.wallet.core.sign.utxo.RunesOutPut;
import com.okinc.wallet.core.sign.utxo.RunesTransaction;
import com.okinc.wallet.core.sign.utxo.RunesTransactionResult;
import com.okinc.wallet.core.sign.utxo.RunesTransactionResultErrData;
import com.okinc.wallet.core.sign.utxo.RunesTxIn;
import com.okinc.wallet.core.sign.utxo.SRC20Transaction;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResultErrData;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.cqZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12627cqZ extends AbstractC12609cqH {
    public java.lang.String AuCTelauCTel;
    public java.util.List<UTXOInfoResp> AubY;
    public XRC20TransactionResult AwvSrB;
    public boolean AxsJAY;
    public InterfaceC58217yxC DTwDnp;
    public InterfaceC58217yxC OcIXYQ;
    public java.util.List<UTXOInfoResp> QOLQEE;
    public boolean gHZMYf;
    public InterfaceC58217yxC sSMYrx;
    public java.lang.Integer wlaJM;
    public boolean zLjUOn;
    public java.lang.String zsXlph;
    public OkUTXOTransaction.UTXOSignInfo zuBGHE;
    public final java.lang.String uzCIH = "OKBTCTokenTransaction";
    public final C12797ctk QKVWgx = new C12797ctk();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12609cqH
    public java.lang.Integer valueOf() {
        return this.wlaJM;
    }

    @Override // o.AbstractC12609cqH
    public void copydefault(@NotNull TransactionType transactionType, @NotNull OkTransactionWallet okTransactionWallet, java.lang.String str, java.lang.String str2, int i, TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(okTransactionWallet, "");
        super.copydefault(transactionType, okTransactionWallet, str, str2, i, txToastCheckBizAndPayloadInfo);
        this.wlaJM = 32;
    }

    public static final InterfaceC60096zvd wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC12609cqH
    public AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AubY() {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQfsBiF = QfsBiF();
        final Function1 function1 = new Function1() { // from class: o.crr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12627cqZ.gEmmrt(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXQfsBiF.KWHzl(new InterfaceC58229yxO() { // from class: o.crt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12627cqZ.wlaJM(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd gEmmrt(C12627cqZ c12627cqZ, final kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        AbstractC58185ywX abstractC58185ywXLoadUTXO$default = loadUTXO$default(c12627cqZ, true, false, false, false, false, false, false, 0, 254, null);
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQUSxYX = c12627cqZ.QUSxYX();
        final Function2 function2 = new Function2() { // from class: o.crc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C12627cqZ.EZpvd(pair, (kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        return AbstractC58185ywX.EZpvd(abstractC58185ywXLoadUTXO$default, abstractC58185ywXQUSxYX, new InterfaceC58223yxI() { // from class: o.cre
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C12627cqZ.KWHzl(function2, obj, obj2);
            }
        });
    }

    public static final kotlin.Pair KWHzl(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair EZpvd(kotlin.Pair pair, kotlin.Pair pair2, kotlin.Pair pair3) {
        Intrinsics.checkNotNullParameter(pair2, "");
        Intrinsics.checkNotNullParameter(pair3, "");
        return (((java.lang.Boolean) pair.getFirst()).booleanValue() && ((java.lang.Boolean) pair2.getFirst()).booleanValue() && ((java.lang.Boolean) pair3.getFirst()).booleanValue()) ? C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "") : !((java.lang.Boolean) pair.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair.getSecond()) : !((java.lang.Boolean) pair2.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair2.getSecond()) : !((java.lang.Boolean) pair3.getFirst()).booleanValue() ? C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair3.getSecond()) : C56390yDp.OLrzqt(java.lang.Boolean.FALSE, "");
    }

    @Override // o.AbstractC12609cqH
    public void zLjUOn() {
        this.AwvSrB = null;
        sSMYrx();
    }

    @Override // o.AbstractC12609cqH
    public void EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        super.EZpvd(str, z);
        this.AwvSrB = OLrzqt(OLrzqt(this.QOLQEE, this.AubY));
        AEQbTJ(2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.cqZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void manualRefreshUTXO$default(C12627cqZ c12627cqZ, boolean z, boolean z2, boolean z3, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        c12627cqZ.OLrzqt(z, z2, z3, function1);
    }

    public final void OLrzqt(boolean z, boolean z2, boolean z3, Function1<? super java.lang.Boolean, Unit> function1) {
        QVAiDq();
        InterfaceC58217yxC interfaceC58217yxC = this.DTwDnp;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        KWHzl(true);
        AbstractC58185ywX abstractC58185ywXLoadUTXO$default = loadUTXO$default(this, false, false, false, z, z2, z3, false, 0, 199, null);
        final Function1 function12 = new Function1() { // from class: o.crs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12627cqZ.AYXKKw(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.crq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C12627cqZ.iwGUEr(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.crx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12627cqZ.EZpvd(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        this.DTwDnp = abstractC58185ywXLoadUTXO$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.crz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C12627cqZ.AuCTelauCTel(function13, obj);
            }
        });
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(C12627cqZ c12627cqZ, kotlin.Pair pair) {
        c12627cqZ.AEQbTJ(2);
        c12627cqZ.KWHzl(false);
        AbstractC12609cqH.startLoopRefreshFee$default(c12627cqZ, 0L, 1, null);
        return Unit.INSTANCE;
    }

    public static final void AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C12627cqZ c12627cqZ, java.lang.Throwable th) {
        c12627cqZ.KWHzl(false);
        AbstractC12609cqH.startLoopRefreshFee$default(c12627cqZ, 0L, 1, null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC12609cqH
    public void sSMYrx() {
        super.sSMYrx();
        manualRefreshUTXO$default(this, true, false, false, null, 14, null);
    }

    @Override // o.AbstractC12609cqH
    public void gHZMYf() {
        super.gHZMYf();
        manualRefreshUTXO$default(this, false, true, false, null, 13, null);
    }

    public final void RJOkX() {
        java.lang.Integer num = this.wlaJM;
        if (num != null && num.intValue() == 31) {
            OkUTXOTransaction.UTXOSignInfo uTXOSignInfo = this.zuBGHE;
            this.zsXlph = uTXOSignInfo != null ? uTXOSignInfo.getMin() : null;
            return;
        }
        if (num != null && num.intValue() == 33) {
            OkUTXOTransaction.UTXOSignInfo uTXOSignInfo2 = this.zuBGHE;
            this.zsXlph = uTXOSignInfo2 != null ? uTXOSignInfo2.getMax() : null;
        } else if (num != null && num.intValue() == 32) {
            OkUTXOTransaction.UTXOSignInfo uTXOSignInfo3 = this.zuBGHE;
            this.zsXlph = uTXOSignInfo3 != null ? uTXOSignInfo3.getNormal() : null;
        } else if (num != null && num.intValue() == 34) {
            this.zsXlph = this.AuCTelauCTel;
        }
    }

    @Override // o.AbstractC12609cqH
    public TransactionFeeInfo AYXKKw() {
        java.lang.String strKWHzl = KWHzl(this.AwvSrB);
        AkhnZx().setFixed(false);
        TransactionFeeInfo transactionFeeInfoAkhnZx = AkhnZx();
        OkUTXOTransaction.UTXOSignInfo uTXOSignInfo = this.zuBGHE;
        transactionFeeInfoAkhnZx.setSlowFee(C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(uTXOSignInfo != null ? uTXOSignInfo.getMin() : null, strKWHzl), false, (RoundingMode) null, 3, (java.lang.Object) null));
        TransactionFeeInfo transactionFeeInfoAkhnZx2 = AkhnZx();
        OkUTXOTransaction.UTXOSignInfo uTXOSignInfo2 = this.zuBGHE;
        transactionFeeInfoAkhnZx2.setFastFee(C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(uTXOSignInfo2 != null ? uTXOSignInfo2.getMax() : null, strKWHzl), false, (RoundingMode) null, 3, (java.lang.Object) null));
        TransactionFeeInfo transactionFeeInfoAkhnZx3 = AkhnZx();
        OkUTXOTransaction.UTXOSignInfo uTXOSignInfo3 = this.zuBGHE;
        transactionFeeInfoAkhnZx3.setRecommendFee(C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(uTXOSignInfo3 != null ? uTXOSignInfo3.getNormal() : null, strKWHzl), false, (RoundingMode) null, 3, (java.lang.Object) null));
        AkhnZx().setFeeValue(C54862xYb.convertToBigIntegerString$default(C54862xYb.OLrzqt(this.zsXlph, strKWHzl), false, (RoundingMode) null, 3, (java.lang.Object) null));
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
        TransactionFeeInfo transactionFeeInfoAkhnZx6 = AkhnZx();
        OkUTXOTransaction.UTXOSignInfo uTXOSignInfo4 = this.zuBGHE;
        transactionFeeInfoAkhnZx6.setMemPoolGasPriceMin(uTXOSignInfo4 != null ? uTXOSignInfo4.getMempoolMin() : null);
        TransactionFeeInfo transactionFeeInfoAkhnZx7 = AkhnZx();
        OkUTXOTransaction.UTXOSignInfo uTXOSignInfo5 = this.zuBGHE;
        transactionFeeInfoAkhnZx7.setGasPriceMin(uTXOSignInfo5 != null ? uTXOSignInfo5.getMin() : null);
        TransactionFeeInfo transactionFeeInfoAkhnZx8 = AkhnZx();
        OkUTXOTransaction.UTXOSignInfo uTXOSignInfo6 = this.zuBGHE;
        transactionFeeInfoAkhnZx8.setGasPriceNormal(uTXOSignInfo6 != null ? uTXOSignInfo6.getNormal() : null);
        TransactionFeeInfo transactionFeeInfoAkhnZx9 = AkhnZx();
        OkUTXOTransaction.UTXOSignInfo uTXOSignInfo7 = this.zuBGHE;
        transactionFeeInfoAkhnZx9.setGasPriceMax(uTXOSignInfo7 != null ? uTXOSignInfo7.getMax() : null);
        TransactionFeeInfo transactionFeeInfoAkhnZx10 = AkhnZx();
        OkUTXOTransaction.UTXOSignInfo uTXOSignInfo8 = this.zuBGHE;
        transactionFeeInfoAkhnZx10.setMixCost(uTXOSignInfo8 != null ? uTXOSignInfo8.getMinCost() : null);
        TransactionFeeInfo transactionFeeInfoAkhnZx11 = AkhnZx();
        OkUTXOTransaction.UTXOSignInfo uTXOSignInfo9 = this.zuBGHE;
        transactionFeeInfoAkhnZx11.setNormalCost(uTXOSignInfo9 != null ? uTXOSignInfo9.getNormalCost() : null);
        TransactionFeeInfo transactionFeeInfoAkhnZx12 = AkhnZx();
        OkUTXOTransaction.UTXOSignInfo uTXOSignInfo10 = this.zuBGHE;
        transactionFeeInfoAkhnZx12.setMaxCost(uTXOSignInfo10 != null ? uTXOSignInfo10.getMaxCost() : null);
        TransactionFeeInfo transactionFeeInfoAkhnZx13 = AkhnZx();
        OkUTXOTransaction.UTXOSignInfo uTXOSignInfo11 = this.zuBGHE;
        transactionFeeInfoAkhnZx13.setReserveFeeRatio(uTXOSignInfo11 != null ? uTXOSignInfo11.getReserveFeeRatio() : null);
        return AkhnZx();
    }

    public final java.lang.String KWHzl(XRC20TransactionResult xRC20TransactionResult) {
        if (xRC20TransactionResult == null) {
            return null;
        }
        return AEQbTJ(xRC20TransactionResult.getCommitTxFee());
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        return C54862xYb.convertToBigIntegerString$default(C54862xYb.convertToString$default(C54862xYb.divB$default(str, this.zsXlph, 0, null, 6, null), false, null, null, 7, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
    }

    @Override // o.AbstractC12609cqH
    public AbstractC58185ywX<java.lang.Boolean> ORxRYg() {
        KWHzl(true);
        AbstractC58185ywX abstractC58185ywXLoadUTXO$default = loadUTXO$default(this, false, false, false, false, true, false, false, 0, 239, null);
        final Function1 function1 = new Function1() { // from class: o.crl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12627cqZ.AhwBna(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXAEQbTJ = abstractC58185ywXLoadUTXO$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cro
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12627cqZ.sSMYrx(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.lang.Boolean sSMYrx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean AhwBna(C12627cqZ c12627cqZ, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        c12627cqZ.KWHzl(false);
        return (java.lang.Boolean) pair.getFirst();
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QfsBiF() {
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = isConnected().copydefault(fIwbmz(), getFieldNames(), new SignInfoReq(C33129mqd.gEmmrt(copydefault()), DbNXlk(), fARcdN(), 5, (java.lang.String) null, C54862xYb.convertToBigIntegerString$default(AuCTel(), true, (RoundingMode) null, 2, (java.lang.Object) null), (java.lang.String) null, gEmmrt().QbewEr(), (java.lang.Long) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Boolean) null, 8000, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.crv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12627cqZ.OLrzqt(this.copydefault, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.crw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12627cqZ.uzCIH(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> QUSxYX() {
        AbstractC58185ywX<ResponseData<java.util.List<UTXOInfoResp>>> abstractC58185ywXKWHzl = isConnected().KWHzl(fIwbmz(), getFieldNames(), new UTXOInfoReq(copydefault(), yDY.gEmmrt(new UTXOAddressInfoReq(DbNXlk(), (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) 8, (java.lang.String) null, (java.lang.Integer) 1, (java.lang.Integer) 20, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) 0, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 63382, (DefaultConstructorMarker) null), new UTXOAddressInfoReq(DbNXlk(), (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) 7, (java.lang.String) null, (java.lang.Integer) 1, (java.lang.Integer) 20, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) 0, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 63382, (DefaultConstructorMarker) null)), 0, 4, null));
        final Function1 function1 = new Function1() { // from class: o.crn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12627cqZ.EZpvd(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cry
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12627cqZ.ejfBZ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static /* synthetic */ AbstractC58185ywX loadUTXO$default(C12627cqZ c12627cqZ, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        if ((i2 & 8) != 0) {
            z4 = false;
        }
        if ((i2 & 16) != 0) {
            z5 = false;
        }
        if ((i2 & 32) != 0) {
            z6 = false;
        }
        if ((i2 & 64) != 0) {
            z7 = false;
        }
        if ((i2 & 128) != 0) {
            i = 1;
        }
        return c12627cqZ.OLrzqt(z, z2, z3, z4, z5, z6, z7, i);
    }

    public static final InterfaceC60096zvd hDKMBd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(C12627cqZ c12627cqZ, boolean z, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return c12627cqZ.AEQbTJ(z);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public static final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> copydefault(boolean z, boolean z2, boolean z3, final C12627cqZ c12627cqZ, final boolean z4, boolean z5, boolean z6, boolean z7) {
        if (z || z2 || z3) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXCopydefault = c12627cqZ.copydefault(z, z4);
            final Function1 function1 = new Function1() { // from class: o.crD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12627cqZ.OLrzqt(this.EZpvd, z4, (kotlin.Pair) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.crA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12627cqZ.hDKMBd(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        if (z5 || z6 || z7) {
            return c12627cqZ.AEQbTJ(z4);
        }
        if (z4) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXCopydefault2 = c12627cqZ.copydefault(z, z4);
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXAEQbTJ = c12627cqZ.AEQbTJ(z4);
            final Function2 function2 = new Function2() { // from class: o.crB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C12627cqZ.OLrzqt((kotlin.Pair) obj, (kotlin.Pair) obj2);
                }
            };
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXCopydefault2, abstractC58185ywXAEQbTJ, new InterfaceC58223yxI() { // from class: o.crE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58223yxI
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                    return C12627cqZ.AEQbTJ(function2, obj, obj2);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
            return abstractC58185ywXEZpvd;
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, ""));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final kotlin.Pair AEQbTJ(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair OLrzqt(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
    }

    public static final InterfaceC60096zvd getFieldNames(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> OLrzqt(final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, boolean z6, final boolean z7, final int i) {
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXCopydefault = copydefault(z, z4, z5, this, z7, z6, z3, z2);
        final Function1 function1 = new Function1() { // from class: o.crp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12627cqZ.AEQbTJ(this.KWHzl, z, z7, i, z2, z3, z4, z5, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.cru
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12627cqZ.getFieldNames(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AEQbTJ(C12627cqZ c12627cqZ, boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5, boolean z6, kotlin.Pair pair) {
        java.lang.Integer queryCount;
        Intrinsics.checkNotNullParameter(pair, "");
        XRC20TransactionResult xRC20TransactionResult = c12627cqZ.AwvSrB;
        c12627cqZ.AwvSrB = c12627cqZ.OLrzqt(c12627cqZ.OLrzqt(c12627cqZ.QOLQEE, c12627cqZ.AubY));
        if (((java.lang.Boolean) pair.getFirst()).booleanValue() && !c12627cqZ.zLjUOn && !c12627cqZ.gHZMYf && !z && !z2) {
            OkUTXOTransaction.UTXOSignInfo uTXOSignInfo = c12627cqZ.zuBGHE;
            if (i < ((uTXOSignInfo == null || (queryCount = uTXOSignInfo.getQueryCount()) == null) ? c12627cqZ.QKVWgx.OLrzqt() : queryCount.intValue())) {
                XRC20TransactionResult xRC20TransactionResult2 = c12627cqZ.AwvSrB;
                java.lang.String commitTx = xRC20TransactionResult2 != null ? xRC20TransactionResult2.getCommitTx() : null;
                if (commitTx != null && commitTx.length() != 0) {
                    java.lang.String strAEQbTJ = c12627cqZ.AEQbTJ(xRC20TransactionResult != null ? xRC20TransactionResult.getCommitTxFee() : null);
                    XRC20TransactionResult xRC20TransactionResult3 = c12627cqZ.AwvSrB;
                    if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) c12627cqZ.AEQbTJ(xRC20TransactionResult3 != null ? xRC20TransactionResult3.getCommitTxFee() : null))) {
                        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair);
                        Intrinsics.copydefault(abstractC58185ywXKWHzl);
                        return abstractC58185ywXKWHzl;
                    }
                }
                return loadUTXO$default(c12627cqZ, z, z3, z4, z5, z6, false, z2, i + 1, 32, null);
            }
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(pair);
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    /* JADX DEBUG: Type inference failed for r0v29. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> copydefault(boolean z, boolean z2) {
        AbstractC58185ywX<ResponseData<java.util.List<UTXOInfoResp>>> abstractC58185ywXDjBIcL;
        if (gEmmrt().fjfviF()) {
            abstractC58185ywXDjBIcL = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, null, null, 46, null));
        } else if (gEmmrt().dvKsVJ() || gEmmrt().htlTjW() || gEmmrt().igXuih()) {
            abstractC58185ywXDjBIcL = djBIcL(C56402yEa.EZpvd(new UTXOAddressInfoReq(DbNXlk(), (z || z2) ? "0" : AbstractC12609cqH.getTransferAmount$default(this, false, false, false, 7, null), "0", (java.lang.Integer) 4, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (gEmmrt().dvKsVJ() || gEmmrt().htlTjW() || gEmmrt().igXuih()) ? gEmmrt().fFgQHt() : null, (java.lang.String) null, (java.util.List) null, (java.lang.Integer) null, (java.lang.Integer) 0, gEmmrt().QbewEr(), (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 59248, (DefaultConstructorMarker) null)));
        } else {
            abstractC58185ywXDjBIcL = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, null, null, 46, null));
        }
        final StateListAnimator stateListAnimator = new StateListAnimator(z2, this, z);
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXDjBIcL.AEQbTJ(new InterfaceC58229yxO() { // from class: o.crf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12627cqZ.getNewProxyInstance(stateListAnimator, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final kotlin.Pair getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> AEQbTJ(final boolean z) {
        java.lang.String strConvertToString$default;
        int i;
        java.lang.Integer numQbewEr;
        java.util.List<UTXOInfoResp> list;
        java.util.Iterator<T> it;
        java.lang.String strDbNXlk = DbNXlk();
        java.util.ArrayList arrayList = null;
        if (!gEmmrt().fjfviF()) {
            if (!gEmmrt().dvKsVJ() && !gEmmrt().htlTjW()) {
                gEmmrt().igXuih();
            }
        } else {
            if (!z) {
                OkUTXOTransaction.UTXOSignInfo uTXOSignInfo = this.zuBGHE;
                java.lang.String minOutput = uTXOSignInfo != null ? uTXOSignInfo.getMinOutput() : null;
                OkUTXOTransaction.UTXOSignInfo uTXOSignInfo2 = this.zuBGHE;
                strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.KWHzl(minOutput, C54862xYb.OLrzqt("2", uTXOSignInfo2 != null ? uTXOSignInfo2.getInscriptionOutput() : null)), false, null, null, 7, null);
            }
            java.lang.String str = strConvertToString$default;
            java.lang.String strEZpvd = EZpvd(z);
            if (gEmmrt().fjfviF()) {
                if (!gEmmrt().dvKsVJ() && !gEmmrt().htlTjW()) {
                    gEmmrt().igXuih();
                }
                i = 1;
            } else {
                i = 4;
            }
            int i2 = i;
            if (gEmmrt().fjfviF()) {
                if (!gEmmrt().dvKsVJ() && !gEmmrt().htlTjW()) {
                    gEmmrt().igXuih();
                }
                numQbewEr = null;
            } else {
                numQbewEr = gEmmrt().QbewEr();
            }
            list = this.QOLQEE;
            if (list != null && !list.isEmpty()) {
                arrayList = new java.util.ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                    java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
                    if (utxoList != null) {
                        for (UtxoInfo utxoInfo : utxoList) {
                            arrayList.add(utxoInfo.getTxHash() + "-" + utxoInfo.getVout());
                        }
                    }
                }
            }
            AbstractC58185ywX<ResponseData<java.util.List<UTXOInfoResp>>> abstractC58185ywXDjBIcL = djBIcL(C56402yEa.EZpvd(new UTXOAddressInfoReq(strDbNXlk, str, strEZpvd, java.lang.Integer.valueOf(i2), (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) arrayList, (java.lang.Integer) null, (java.lang.Integer) 0, numQbewEr, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 58864, (DefaultConstructorMarker) null)));
            final Function1 function1 = new Function1() { // from class: o.cri
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12627cqZ.KWHzl(z, this, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXDjBIcL.AEQbTJ(new InterfaceC58229yxO() { // from class: o.crm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12627cqZ.fJNWhG(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return abstractC58185ywXAEQbTJ;
        }
        strConvertToString$default = "0";
        java.lang.String str2 = strConvertToString$default;
        java.lang.String strEZpvd2 = EZpvd(z);
        if (gEmmrt().fjfviF()) {
        }
        int i22 = i;
        if (gEmmrt().fjfviF()) {
        }
        list = this.QOLQEE;
        if (list != null) {
            arrayList = new java.util.ArrayList();
            it = list.iterator();
            while (it.hasNext()) {
            }
        }
        AbstractC58185ywX<ResponseData<java.util.List<UTXOInfoResp>>> abstractC58185ywXDjBIcL2 = djBIcL(C56402yEa.EZpvd(new UTXOAddressInfoReq(strDbNXlk, str2, strEZpvd2, java.lang.Integer.valueOf(i22), (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) arrayList, (java.lang.Integer) null, (java.lang.Integer) 0, numQbewEr, (java.lang.String) null, (java.lang.Integer) null, (java.util.List) null, 58864, (DefaultConstructorMarker) null)));
        final Function1 function12 = new Function1() { // from class: o.cri
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12627cqZ.KWHzl(z, this, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXDjBIcL2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.crm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12627cqZ.fJNWhG(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final kotlin.Pair fJNWhG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<UTXOInfoResp>>> djBIcL(java.util.List<UTXOAddressInfoReq> list) {
        return isConnected().KWHzl(fIwbmz(), getFieldNames(), new UTXOInfoReq(copydefault(), list, 0, 4, null));
    }

    public final java.util.List<UtxoInfo> OLrzqt(java.util.List<UTXOInfoResp> list, java.util.List<UTXOInfoResp> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                java.util.List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
                if (utxoList != null) {
                    arrayList.addAll(utxoList);
                }
            }
        }
        if (list2 != null) {
            java.util.Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                java.util.List<UtxoInfo> utxoList2 = ((UTXOInfoResp) it2.next()).getUtxoList();
                if (utxoList2 != null) {
                    arrayList.addAll(utxoList2);
                }
            }
        }
        return arrayList;
    }

    public final java.lang.String EZpvd(boolean z) {
        if (z) {
            return "0";
        }
        java.lang.String feeValue = AYXKKw().getFeeValue();
        return feeValue == null ? "" : feeValue;
    }

    public final int DTwDnp() {
        return this.QKVWgx.EZpvd(getNewProxyInstance(), gEmmrt(), DbNXlk());
    }

    public final int OcIXYQ() {
        return getNewProxyInstance().finit();
    }

    public static /* synthetic */ java.lang.String getMinOutput$default(C12627cqZ c12627cqZ, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return c12627cqZ.KWHzl(z, z2);
    }

    public final java.lang.String KWHzl(boolean z, boolean z2) {
        java.lang.String minOutput;
        java.lang.String minOutput2;
        C10854bwM c10854bwMEZpvd;
        if (z) {
            OkUTXOTransaction.UTXOSignInfo uTXOSignInfo = this.zuBGHE;
            if (uTXOSignInfo != null && (minOutput2 = uTXOSignInfo.getMinOutput()) != null) {
                C10854bwM c10854bwMEZpvd2 = EZpvd();
                int iValueOf = c10854bwMEZpvd2 != null ? c10854bwMEZpvd2.valueOf() : 0;
                C10854bwM c10854bwMEZpvd3 = EZpvd();
                java.lang.String strEZpvd = C54870xYj.EZpvd(minOutput2, iValueOf, c10854bwMEZpvd3 != null ? c10854bwMEZpvd3.AkhnZx() : 0, (!z2 || (c10854bwMEZpvd = EZpvd()) == null) ? null : c10854bwMEZpvd.fJNWhG(), (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                if (strEZpvd != null) {
                    return strEZpvd;
                }
            }
        } else {
            OkUTXOTransaction.UTXOSignInfo uTXOSignInfo2 = this.zuBGHE;
            if (uTXOSignInfo2 != null && (minOutput = uTXOSignInfo2.getMinOutput()) != null) {
                return minOutput;
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final XRC20TransactionResult OLrzqt(java.util.List<UtxoInfo> list) {
        XRC20TransactionResult xRC20TransactionResult;
        XRC20TransactionResult xRC20TransactionResult2;
        if (!C33129mqd.KWHzl((java.util.Collection) list)) {
            xRC20TransactionResult = null;
        } else if (gEmmrt().dvKsVJ()) {
            xRC20TransactionResult = EZpvd((java.lang.String) null, this.QKVWgx.EZpvd(), list);
        } else if (gEmmrt().fjfviF()) {
            xRC20TransactionResult = OLrzqt((java.lang.String) null, this.QKVWgx.EZpvd(), list);
        } else if (gEmmrt().htlTjW()) {
            xRC20TransactionResult = KWHzl((java.lang.String) null, this.QKVWgx.EZpvd(), list);
        } else if (gEmmrt().igXuih()) {
            xRC20TransactionResult = AEQbTJ((java.lang.String) null, this.QKVWgx.EZpvd(), list);
        }
        if (xRC20TransactionResult == null) {
            xRC20TransactionResult = new XRC20TransactionResult((java.lang.String) null, (XRC20TransactionResultErrData) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, 4095, (DefaultConstructorMarker) null);
        }
        java.lang.String str = this.zsXlph;
        if (str == null) {
            str = "";
        }
        if (xRC20TransactionResult.getFeeRate() == null) {
            xRC20TransactionResult.setFeeRate(str);
        }
        java.lang.String commitTxFee = xRC20TransactionResult.getCommitTxFee();
        if ((commitTxFee == null || commitTxFee.length() == 0) && (xRC20TransactionResult2 = this.AwvSrB) != null && C33129mqd.AEQbTJ(xRC20TransactionResult2.getCommitTxFee(), "0")) {
            xRC20TransactionResult.setCommitTxFee(C54862xYb.convertToBigIntegerString$default(C54862xYb.convertToString$default(C54862xYb.OLrzqt(C54862xYb.divB$default(xRC20TransactionResult2.getCommitTxFee(), xRC20TransactionResult2.getFeeRate(), 0, null, 6, null), str), false, null, null, 7, null), false, (RoundingMode) null, 3, (java.lang.Object) null));
        }
        return xRC20TransactionResult;
    }

    @Override // o.AbstractC12609cqH
    public void AEQbTJ(long j) {
        InterfaceC58217yxC interfaceC58217yxC = this.sSMYrx;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(j, 7L, java.util.concurrent.TimeUnit.SECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.cqW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12627cqZ.OLrzqt(this.copydefault, (java.lang.Long) obj);
            }
        };
        this.sSMYrx = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.cra
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C12627cqZ.zuBGHE(function1, obj);
            }
        });
    }

    public static final void zuBGHE(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(final C12627cqZ c12627cqZ, java.lang.Long l) {
        InterfaceC58217yxC interfaceC58217yxC = c12627cqZ.OcIXYQ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXQfsBiF = c12627cqZ.QfsBiF();
        final Function1 function1 = new Function1() { // from class: o.crb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12627cqZ.valueOf(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXQfsBiF.KWHzl(new InterfaceC58229yxO() { // from class: o.crd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12627cqZ.zLjUOn(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.crh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12627cqZ.djBIcL(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.crk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C12627cqZ.AubY(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.crj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12627cqZ.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        c12627cqZ.OcIXYQ = abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.crg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C12627cqZ.zsXlph(function13, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd zLjUOn(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd valueOf(C12627cqZ c12627cqZ, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            return loadUTXO$default(c12627cqZ, false, false, true, false, false, false, false, 0, 251, null);
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.FALSE, pair.getSecond()));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final void AubY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(C12627cqZ c12627cqZ, kotlin.Pair pair) {
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            c12627cqZ.AEQbTJ(1);
        }
        return Unit.INSTANCE;
    }

    public static final void zsXlph(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public void QVAiDq() {
        InterfaceC58217yxC interfaceC58217yxC = this.sSMYrx;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.OcIXYQ;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    public final XRC20TransactionResult EZpvd(java.lang.String str, java.lang.String str2, java.util.List<UtxoInfo> list) {
        XRC20TransactionResult xRC20TransactionResultCopydefault = C54904xZq.copydefault.copydefault(OLrzqt(str, str2), EZpvd(list));
        if (xRC20TransactionResultCopydefault == null) {
            return null;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) xRC20TransactionResultCopydefault.getErrCode(), (java.lang.Object) "1000001")) {
            return xRC20TransactionResultCopydefault;
        }
        XRC20TransactionResultErrData data = xRC20TransactionResultCopydefault.getData();
        if (!C33129mqd.AEQbTJ(data != null ? data.getCommitTxFee() : null, 0)) {
            return xRC20TransactionResultCopydefault;
        }
        XRC20TransactionResultErrData data2 = xRC20TransactionResultCopydefault.getData();
        xRC20TransactionResultCopydefault.setCommitTxFee(data2 != null ? data2.getCommitTxFee() : null);
        return xRC20TransactionResultCopydefault;
    }

    public final XRC20TransactionResult OLrzqt(java.lang.String str, java.lang.String str2, java.util.List<UtxoInfo> list) {
        return C54904xZq.copydefault.copydefault(OLrzqt(str, str2), AEQbTJ(list));
    }

    public final XRC20TransactionResult KWHzl(java.lang.String str, java.lang.String str2, java.util.List<UtxoInfo> list) {
        RunesTransactionResult runesTransactionResultCopydefault = C54904xZq.copydefault.copydefault(OLrzqt(str, str2), copydefault(list));
        if (runesTransactionResultCopydefault != null) {
            return new XRC20TransactionResult((java.lang.String) null, (XRC20TransactionResultErrData) null, (java.lang.String) null, runesTransactionResultCopydefault.getTxHex(), (java.lang.String) null, (java.util.List) null, (java.lang.String) null, runesTransactionResultCopydefault.getTxFee(), (java.lang.String) null, (java.util.List) null, this.zsXlph, (java.lang.String) null, 2935, (DefaultConstructorMarker) null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final XRC20TransactionResult AEQbTJ(java.lang.String str, java.lang.String str2, java.util.List<UtxoInfo> list) {
        RunesTransactionResult runesTransactionResultCopydefault = C54904xZq.copydefault.copydefault(OLrzqt(str, str2), KWHzl(list));
        java.lang.String txFee = null;
        if (runesTransactionResultCopydefault == null) {
            return null;
        }
        if (Intrinsics.EZpvd((java.lang.Object) runesTransactionResultCopydefault.getErrCode(), (java.lang.Object) "1000001")) {
            RunesTransactionResultErrData data = runesTransactionResultCopydefault.getData();
            if (C33129mqd.AEQbTJ(data != null ? data.getTxFee() : null, 0)) {
                RunesTransactionResultErrData data2 = runesTransactionResultCopydefault.getData();
                if (data2 != null) {
                    txFee = data2.getTxFee();
                }
            }
        } else {
            txFee = runesTransactionResultCopydefault.getTxFee();
        }
        return new XRC20TransactionResult(runesTransactionResultCopydefault.getErrCode(), (XRC20TransactionResultErrData) null, (java.lang.String) null, runesTransactionResultCopydefault.getTxHex(), (java.lang.String) null, (java.util.List) null, (java.lang.String) null, txFee, (java.lang.String) null, (java.util.List) null, this.zsXlph, (java.lang.String) null, 2934, (DefaultConstructorMarker) null);
    }

    public final SignParams OLrzqt(java.lang.String str, java.lang.String str2) {
        C10854bwM c10854bwMEZpvd = EZpvd();
        long jQKVWgx = c10854bwMEZpvd != null ? c10854bwMEZpvd.QKVWgx() : -1L;
        C10854bwM c10854bwMEZpvd2 = EZpvd();
        return new SignParams(jQKVWgx, c10854bwMEZpvd2 != null ? c10854bwMEZpvd2.fetchVPNInfo() : -1L, null, str, str2, java.lang.Integer.valueOf(OcIXYQ()), DTwDnp(), null, false, false, null, 1920, null);
    }

    public final ARC20Transaction EZpvd(java.util.List<UtxoInfo> list) {
        UTXONftInfo uTXONftInfo;
        UTXONftInfo uTXONftInfo2;
        if (list == null || list.isEmpty()) {
            return new ARC20Transaction((java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            java.util.ArrayList arrayList2 = null;
            if (!it.hasNext()) {
                break;
            }
            UtxoInfo utxoInfo = (UtxoInfo) it.next();
            java.lang.String txHash = utxoInfo.getTxHash();
            java.lang.String vout = utxoInfo.getVout();
            java.lang.String coinAmount = utxoInfo.getCoinAmount();
            java.lang.String strDbNXlk = DbNXlk();
            int iDTwDnp = DTwDnp();
            int iOcIXYQ = OcIXYQ();
            java.lang.String strKWHzl = this.QKVWgx.KWHzl();
            java.util.List<UTXONftInfo> nftLocaltionVOs = utxoInfo.getNftLocaltionVOs();
            if (nftLocaltionVOs != null) {
                java.util.ArrayList<UTXONftInfo> arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj : nftLocaltionVOs) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) ((UTXONftInfo) obj).getNftId())) {
                        arrayList3.add(obj);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
                    for (UTXONftInfo uTXONftInfo3 : arrayList3) {
                        arrayList2.add(new ARC20Data(uTXONftInfo3.getNftId(), uTXONftInfo3.getTokenType()));
                    }
                }
            }
            arrayList.add(new ARC20TxIn(txHash, vout, coinAmount, strDbNXlk, java.lang.Integer.valueOf(iDTwDnp), java.lang.Integer.valueOf(iOcIXYQ), strKWHzl, arrayList2, (java.lang.String) null, 256, (DefaultConstructorMarker) null));
        }
        int iAhwBna = C33129mqd.AhwBna(AbstractC12609cqH.getTransferAmount$default(this, false, false, false, 7, null));
        java.lang.String strFARcdN = fARcdN();
        java.util.List<UTXONftInfo> nftLocaltionVOs2 = ((UtxoInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getNftLocaltionVOs();
        java.lang.String nftId = (nftLocaltionVOs2 == null || (uTXONftInfo2 = (UTXONftInfo) CollectionsKt___CollectionsKt.firstOrNull(nftLocaltionVOs2)) == null) ? null : uTXONftInfo2.getNftId();
        java.util.List<UTXONftInfo> nftLocaltionVOs3 = ((UtxoInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getNftLocaltionVOs();
        java.util.List listEZpvd = C56402yEa.EZpvd(new ARC20OutPut(java.lang.Integer.valueOf(iAhwBna), strFARcdN, C56402yEa.EZpvd(new ARC20Data(nftId, (nftLocaltionVOs3 == null || (uTXONftInfo = (UTXONftInfo) CollectionsKt___CollectionsKt.firstOrNull(nftLocaltionVOs3)) == null) ? null : uTXONftInfo.getTokenType()))));
        OkUTXOTransaction.UTXOSignInfo uTXOSignInfo = this.zuBGHE;
        return new ARC20Transaction(arrayList, listEZpvd, uTXOSignInfo != null ? uTXOSignInfo.getMinOutput() : null, this.zsXlph, DbNXlk());
    }

    public final SRC20Transaction AEQbTJ(java.util.List<UtxoInfo> list) {
        if (list == null || list.isEmpty()) {
            return new SRC20Transaction((java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BRC20InscriptionData) null, 63, (DefaultConstructorMarker) null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (UtxoInfo utxoInfo : list) {
            arrayList.add(new ARC20TxIn(utxoInfo.getTxHash(), utxoInfo.getVout(), utxoInfo.getCoinAmount(), DbNXlk(), java.lang.Integer.valueOf(DTwDnp()), java.lang.Integer.valueOf(OcIXYQ()), this.QKVWgx.KWHzl(), (java.util.List) null, (java.lang.String) null, MLKEMEngine.KyberPolyBytes, (DefaultConstructorMarker) null));
        }
        java.lang.String str = this.zsXlph;
        OkUTXOTransaction.UTXOSignInfo uTXOSignInfo = this.zuBGHE;
        java.lang.String inscriptionOutput = uTXOSignInfo != null ? uTXOSignInfo.getInscriptionOutput() : null;
        OkUTXOTransaction.UTXOSignInfo uTXOSignInfo2 = this.zuBGHE;
        return new SRC20Transaction(arrayList, str, inscriptionOutput, uTXOSignInfo2 != null ? uTXOSignInfo2.getMinOutput() : null, DbNXlk(), new BRC20InscriptionData("stamp:", "{\"p\":\"src-20\",\"op\":\"transfer\",\"tick\":\"" + gEmmrt().fJNWhG() + "\",\"amt\":\"" + QOLQEE() + "\"}", fARcdN(), (java.lang.Boolean) null, 8, (DefaultConstructorMarker) null));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RunesTransaction copydefault(java.util.List<UtxoInfo> list) {
        UTXONftInfo uTXONftInfo;
        java.lang.String json;
        java.util.ArrayList arrayList;
        if (list == null || list.isEmpty()) {
            return new RunesTransaction((java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
        }
        int i = 10;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (UtxoInfo utxoInfo : list) {
            java.lang.String txHash = utxoInfo.getTxHash();
            java.lang.String vout = utxoInfo.getVout();
            java.lang.String coinAmount = utxoInfo.getCoinAmount();
            java.lang.String strDbNXlk = DbNXlk();
            int iDTwDnp = DTwDnp();
            int iOcIXYQ = OcIXYQ();
            java.lang.String strKWHzl = this.QKVWgx.KWHzl();
            java.util.List<UTXONftInfo> nftLocaltionVOs = utxoInfo.getNftLocaltionVOs();
            if (nftLocaltionVOs != null) {
                java.util.ArrayList<UTXONftInfo> arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj : nftLocaltionVOs) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) ((UTXONftInfo) obj).getNftId())) {
                        arrayList3.add(obj);
                    }
                }
                if (arrayList3.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList3, i));
                    for (UTXONftInfo uTXONftInfo2 : arrayList3) {
                        arrayList.add(new RunesData(uTXONftInfo2.getNftId(), uTXONftInfo2.getValue()));
                    }
                }
                json = arrayList != null ? new Gson().toJson(arrayList) : null;
            }
            arrayList2.add(new RunesTxIn(txHash, vout, coinAmount, strDbNXlk, java.lang.Integer.valueOf(iDTwDnp), java.lang.Integer.valueOf(iOcIXYQ), strKWHzl, json));
            i = 10;
        }
        java.lang.String strFARcdN = fARcdN();
        OkUTXOTransaction.UTXOSignInfo uTXOSignInfo = this.zuBGHE;
        java.lang.String minOutput = uTXOSignInfo != null ? uTXOSignInfo.getMinOutput() : null;
        C33489mxS c33489mxS = C33489mxS.KWHzl;
        KSerializer<RunesData> kSerializerSerializer = RunesData.Companion.serializer();
        java.util.List<UTXONftInfo> nftLocaltionVOs2 = ((UtxoInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getNftLocaltionVOs();
        return new RunesTransaction(arrayList2, C56402yEa.EZpvd(new RunesOutPut(minOutput, strFARcdN, c33489mxS.KWHzl(kSerializerSerializer, new RunesData((nftLocaltionVOs2 == null || (uTXONftInfo = (UTXONftInfo) CollectionsKt___CollectionsKt.firstOrNull(nftLocaltionVOs2)) == null) ? null : uTXONftInfo.getNftId(), QOLQEE())))), (java.lang.String) null, this.zsXlph, DbNXlk(), 4, (DefaultConstructorMarker) null);
    }

    public final RunesMainTransaction KWHzl(java.util.List<UtxoInfo> list) {
        java.lang.String nftId;
        java.lang.String minOutput;
        UTXONftInfo uTXONftInfo;
        java.util.ArrayList arrayList;
        if (list == null || list.isEmpty()) {
            return new RunesMainTransaction((java.util.List) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 255, (DefaultConstructorMarker) null);
        }
        int i = 10;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            nftId = null;
            if (!it.hasNext()) {
                break;
            }
            UtxoInfo utxoInfo = (UtxoInfo) it.next();
            java.lang.String txHash = utxoInfo.getTxHash();
            java.lang.String vout = utxoInfo.getVout();
            java.lang.String coinAmount = utxoInfo.getCoinAmount();
            java.lang.String strDbNXlk = DbNXlk();
            int iDTwDnp = DTwDnp();
            int iOcIXYQ = OcIXYQ();
            java.lang.String strKWHzl = this.QKVWgx.KWHzl();
            java.util.List<UTXONftInfo> nftLocaltionVOs = utxoInfo.getNftLocaltionVOs();
            if (nftLocaltionVOs != null) {
                java.util.ArrayList<UTXONftInfo> arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj : nftLocaltionVOs) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) ((UTXONftInfo) obj).getNftId())) {
                        arrayList3.add(obj);
                    }
                }
                if (arrayList3.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList3, i));
                    for (UTXONftInfo uTXONftInfo2 : arrayList3) {
                        arrayList.add(new RunesData(uTXONftInfo2.getNftId(), uTXONftInfo2.getValue()));
                    }
                }
                if (arrayList != null) {
                    nftId = new Gson().toJson(arrayList);
                }
            }
            arrayList2.add(new RunesMainTxIn(txHash, vout, coinAmount, strDbNXlk, java.lang.Integer.valueOf(iDTwDnp), java.lang.Integer.valueOf(iOcIXYQ), strKWHzl, nftId, (java.lang.String) null, 256, (DefaultConstructorMarker) null));
            i = 10;
        }
        java.lang.String strFARcdN = fARcdN();
        OkUTXOTransaction.UTXOSignInfo uTXOSignInfo = this.zuBGHE;
        java.lang.String minOutput2 = uTXOSignInfo != null ? uTXOSignInfo.getMinOutput() : null;
        C33489mxS c33489mxS = C33489mxS.KWHzl;
        KSerializer<RunesMainData> kSerializerSerializer = RunesMainData.Companion.serializer();
        java.util.List<UTXONftInfo> nftLocaltionVOs2 = ((UtxoInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getNftLocaltionVOs();
        if (nftLocaltionVOs2 != null && (uTXONftInfo = (UTXONftInfo) CollectionsKt___CollectionsKt.firstOrNull(nftLocaltionVOs2)) != null) {
            nftId = uTXONftInfo.getNftId();
        }
        java.util.List listEZpvd = C56402yEa.EZpvd(new RunesMainOutPut(minOutput2, strFARcdN, c33489mxS.KWHzl(kSerializerSerializer, new RunesMainData(nftId, AbstractC12609cqH.getTransferAmount$default(this, false, false, false, 7, null)))));
        java.lang.String str = this.zsXlph;
        java.lang.String strDbNXlk2 = DbNXlk();
        OkUTXOTransaction.UTXOSignInfo uTXOSignInfo2 = this.zuBGHE;
        if (uTXOSignInfo2 == null || (minOutput = uTXOSignInfo2.getMinOutput()) == null) {
            minOutput = "0";
        }
        return new RunesMainTransaction((java.util.List) arrayList2, listEZpvd, (java.lang.String) null, str, strDbNXlk2, false, "0", minOutput, 4, (DefaultConstructorMarker) null);
    }

    public final java.lang.String QOLQEE() {
        return C54862xYb.convertToBigIntegerString$default(C54870xYj.AEQbTJ(AbstractC12609cqH.getTransferAmount$default(this, false, false, false, 7, null), gEmmrt().valueOf()), true, (RoundingMode) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC12609cqH
    public void zsXlph() {
        super.zsXlph();
        InterfaceC58217yxC interfaceC58217yxC = this.DTwDnp;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        QVAiDq();
    }

    /* JADX INFO: renamed from: o.cqZ$StateListAnimator */
    public static final class StateListAnimator implements Function1<?, kotlin.Pair<? extends java.lang.Boolean, ? extends java.lang.String>> {
        public final /* synthetic */ boolean AEQbTJ;
        public final /* synthetic */ C12627cqZ OLrzqt;
        public final /* synthetic */ boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(boolean z, C12627cqZ c12627cqZ, boolean z2) {
            this.AEQbTJ = z;
            this.OLrzqt = c12627cqZ;
            this.copydefault = z2;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final kotlin.Pair<java.lang.Boolean, java.lang.String> invoke(ResponseData<? extends java.util.List<UTXOInfoResp>> responseData) {
            java.util.List<UTXOInfoResp> data;
            java.lang.Object next;
            Intrinsics.checkNotNullParameter(responseData, "");
            if (responseData.getCode() == 0 || responseData.getCode() == 10004 || responseData.getCode() == 100041) {
                if (!this.AEQbTJ) {
                    this.OLrzqt.zLjUOn = responseData.getCode() == 10004 || responseData.getCode() == 100041;
                    if (C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
                        this.OLrzqt.QOLQEE = responseData.getData();
                    }
                }
                if ((this.copydefault || this.AEQbTJ) && (data = responseData.getData()) != null) {
                    C12627cqZ c12627cqZ = this.OLrzqt;
                    java.util.Iterator<T> it = data.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.EZpvd((java.lang.Object) ((UTXOInfoResp) next).getAddress(), (java.lang.Object) c12627cqZ.DbNXlk())) {
                            break;
                        }
                    }
                    UTXOInfoResp uTXOInfoResp = (UTXOInfoResp) next;
                    if (uTXOInfoResp != null) {
                        this.OLrzqt.EZpvd(uTXOInfoResp.getCanTransferAmount());
                    }
                }
                return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
            }
            return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
        }
    }

    public static final kotlin.Pair OLrzqt(C12627cqZ c12627cqZ, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            SignInfo signInfo = (SignInfo) responseData.getData();
            if ((signInfo != null ? signInfo.getInfo() : null) != null) {
                Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
                KSerializer<OkUTXOTransaction.UTXOSignInfo> kSerializerSerializer = OkUTXOTransaction.UTXOSignInfo.Companion.serializer();
                SignInfo signInfo2 = (SignInfo) responseData.getData();
                JsonObject info = signInfo2 != null ? signInfo2.getInfo() : null;
                Intrinsics.copydefault(info);
                OkUTXOTransaction.UTXOSignInfo uTXOSignInfo = (OkUTXOTransaction.UTXOSignInfo) jsonAEQbTJ.decodeFromJsonElement(kSerializerSerializer, info);
                if (C33129mqd.AEQbTJ(uTXOSignInfo.getNormal(), uTXOSignInfo.getMax())) {
                    uTXOSignInfo.setNormal(uTXOSignInfo.getMax());
                    uTXOSignInfo.setNormalCost(uTXOSignInfo.getNormalCost());
                } else if (C33129mqd.gEmmrt(uTXOSignInfo.getNormal(), uTXOSignInfo.getMin())) {
                    uTXOSignInfo.setNormal(uTXOSignInfo.getMin());
                    uTXOSignInfo.setNormalCost(uTXOSignInfo.getMinCost());
                }
                c12627cqZ.zuBGHE = uTXOSignInfo;
                java.lang.Integer num = c12627cqZ.wlaJM;
                if (num == null || num.intValue() != 34) {
                    c12627cqZ.RJOkX();
                }
                return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
            }
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final kotlin.Pair EZpvd(C12627cqZ c12627cqZ, ResponseData responseData) {
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(responseData, "");
        if ((responseData.getCode() == 0 && responseData.getData() != null) || responseData.getCode() == 10004 || responseData.getCode() == 100041) {
            C12797ctk c12797ctk = new C12797ctk();
            java.util.List list = (java.util.List) responseData.getData();
            if (list != null) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (Intrinsics.EZpvd((java.lang.Object) ((UTXOInfoResp) obj).getAddress(), (java.lang.Object) c12627cqZ.DbNXlk())) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            c12627cqZ.AxsJAY = c12797ctk.valueOf(arrayList);
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }

    public static final kotlin.Pair KWHzl(boolean z, C12627cqZ c12627cqZ, ResponseData responseData) {
        java.util.List list;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 || responseData.getCode() == 10004 || responseData.getCode() == 100041) {
            if (!z) {
                c12627cqZ.gHZMYf = responseData.getCode() == 10004 || responseData.getCode() == 100041;
                if (C33129mqd.KWHzl((java.util.Collection) responseData.getData())) {
                    c12627cqZ.AubY = (java.util.List) responseData.getData();
                }
            }
            if (z && (list = (java.util.List) responseData.getData()) != null) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((UTXOInfoResp) next).getAddress(), (java.lang.Object) c12627cqZ.DbNXlk())) {
                        break;
                    }
                }
                UTXOInfoResp uTXOInfoResp = (UTXOInfoResp) next;
                if (uTXOInfoResp != null) {
                    c12627cqZ.OLrzqt(uTXOInfoResp.getCanTransferAmount());
                }
            }
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, responseData.getMsg());
    }
}
