package com.okinc.business.defi.biz.core.tx.transaction.impl;

import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOInfo;
import com.okinc.business.defi.api.model.tx.signdata.FixedUTXOInfo$$serializer;
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
import com.okinc.business.defi.biz.net.bean.UTXOInfoResp$$serializer;
import com.okinc.business.defi.biz.net.bean.UtxoInfo;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import o.AbstractC12609cqH;
import o.AbstractC12782ctV;
import o.AbstractC58185ywX;
import o.AbstractC58247yxg;
import o.C10854bwM;
import o.C11607cUn;
import o.C12797ctk;
import o.C13934dbu;
import o.C33129mqd;
import o.C33489mxS;
import o.C54862xYb;
import o.C54870xYj;
import o.C56390yDp;
import o.C56402yEa;
import o.C58266yxz;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC60096zvd;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes4.dex */
public final class OkUTXOTransaction extends AbstractC12609cqH {
    public Integer AubY;
    public boolean AwvSrB;
    public String AxsJAY;
    public String DTwDnp;
    public String ORxRYg;
    public String OcIXYQ;
    public String QKVWgx;
    public String QOLQEE;
    public String QUSxYX;
    public int QVAiDq;
    public String QbewEr;
    public InterfaceC58217yxC QfsBiF;
    public String RJOkX;
    public InterfaceC58217yxC RcXXUw;
    public String UeEOUB;
    public volatile int dNCPSb;
    public List<UTXOInfoResp> djSkpj;
    public boolean gHZMYf;
    public boolean sSMYrx;
    public String wlaJM;
    public String zLjUOn;
    public InitArgs zsXlph;
    public InterfaceC58217yxC zuBGHE;
    public final String uzCIH = "OkUTXOTransaction";
    public String AuCTelauCTel = "1";
    public final C12797ctk aKErDB = new C12797ctk();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC12609cqH
    public Integer valueOf() {
        return this.AubY;
    }

    @Override // o.AbstractC12609cqH
    public void copydefault(@NotNull TransactionType transactionType, @NotNull OkTransactionWallet okTransactionWallet, String str, String str2, int i, TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo) throws Exception {
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(okTransactionWallet, "");
        super.copydefault(transactionType, okTransactionWallet, str, str2, i, txToastCheckBizAndPayloadInfo);
        this.AubY = 32;
        AEQbTJ(str2);
    }

    public final void AEQbTJ(String str) throws Exception {
        List<UTXOInfoResp> utxoList;
        if (str == null || str.length() == 0) {
            return;
        }
        InitArgs initArgs = (InitArgs) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) InitArgs.Companion.serializer(), str);
        this.zsXlph = initArgs;
        if (initArgs != null && (utxoList = initArgs.getUtxoList()) != null) {
            Iterator<T> it = utxoList.iterator();
            while (it.hasNext()) {
                if (!Intrinsics.EZpvd((Object) ((UTXOInfoResp) it.next()).getAddress(), (Object) DbNXlk())) {
                    throw new Exception("default utxo address not equal current from address");
                }
            }
        }
        if (QfsBiF()) {
            ArrayList arrayList = new ArrayList();
            List<UTXOInfoResp> listDTwDnp = DTwDnp();
            if (listDTwDnp == null) {
                listDTwDnp = yDY.AhwBna();
            }
            arrayList.addAll(listDTwDnp);
            this.djSkpj = arrayList;
            AbstractC58185ywX<Integer> abstractC58185ywXOLrzqt = OLrzqt(arrayList);
            final Function1 function1 = new Function1() { // from class: o.csO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OkUTXOTransaction.copydefault(this.EZpvd, (java.lang.Integer) obj);
                }
            };
            abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58227yxM() { // from class: o.csQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    OkUTXOTransaction.AubY(function1, obj);
                }
            });
        }
    }

    public static final void AubY(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(OkUTXOTransaction okUTXOTransaction, Integer num) {
        okUTXOTransaction.dNCPSb = num.intValue();
        okUTXOTransaction.copydefault(okUTXOTransaction.QOLQEE(), false, false);
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd AxsJAY(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    @Override // o.AbstractC12609cqH
    public AbstractC58185ywX<Pair<Boolean, String>> AubY() {
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXQUSxYX = QUSxYX();
        final Function1 function1 = new Function1() { // from class: o.csS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OkUTXOTransaction.OLrzqt(this.OLrzqt, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXQUSxYX.KWHzl(new InterfaceC58229yxO() { // from class: o.csU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OkUTXOTransaction.AxsJAY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final Pair AwvSrB(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Pair) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd OLrzqt(final OkUTXOTransaction okUTXOTransaction, final Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        AbstractC58185ywX<Activity> abstractC58185ywXOLrzqt = okUTXOTransaction.OLrzqt(false, !okUTXOTransaction.QfsBiF());
        final Function1 function1 = new Function1() { // from class: o.cst
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OkUTXOTransaction.OLrzqt(pair, okUTXOTransaction, (OkUTXOTransaction.Activity) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.csw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OkUTXOTransaction.AwvSrB(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.csx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OkUTXOTransaction.valueOf(this.copydefault, (kotlin.Pair) obj);
            }
        };
        return abstractC58185ywXAEQbTJ.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.csB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OkUTXOTransaction.zLjUOn(function12, obj);
            }
        });
    }

    public static final Pair OLrzqt(Pair pair, OkUTXOTransaction okUTXOTransaction, Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (!((Boolean) pair.getFirst()).booleanValue() || !activity.KWHzl()) {
            return !((Boolean) pair.getFirst()).booleanValue() ? C56390yDp.OLrzqt(Boolean.FALSE, pair.getSecond()) : !activity.KWHzl() ? C56390yDp.OLrzqt(Boolean.FALSE, activity.copydefault()) : C56390yDp.OLrzqt(Boolean.FALSE, "");
        }
        okUTXOTransaction.dNCPSb = activity.AEQbTJ();
        return C56390yDp.OLrzqt(Boolean.TRUE, "");
    }

    public static final InterfaceC60096zvd zLjUOn(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd valueOf(final OkUTXOTransaction okUTXOTransaction, final Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        AbstractC58185ywX<ResponseData<List<UTXOInfoResp>>> abstractC58185ywXDNCPSb = okUTXOTransaction.dNCPSb();
        final Function1 function1 = new Function1() { // from class: o.csM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OkUTXOTransaction.copydefault(this.copydefault, pair, (ResponseData) obj);
            }
        };
        return abstractC58185ywXDNCPSb.AEQbTJ(new InterfaceC58229yxO() { // from class: o.csP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OkUTXOTransaction.zuBGHE(function1, obj);
            }
        });
    }

    public static final Pair zuBGHE(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Pair) function1.invoke(obj);
    }

    public final boolean QfsBiF() {
        List<UTXOInfoResp> utxoList;
        InitArgs initArgs = this.zsXlph;
        return (initArgs == null || (utxoList = initArgs.getUtxoList()) == null || utxoList.size() <= 0) ? false : true;
    }

    public final List<UTXOInfoResp> DTwDnp() {
        InitArgs initArgs = this.zsXlph;
        if (initArgs != null) {
            return initArgs.getUtxoList();
        }
        return null;
    }

    public final String OcIXYQ() {
        BigDecimal bigDecimal = new BigDecimal("0");
        List<UTXOInfoResp> listDTwDnp = DTwDnp();
        if (listDTwDnp != null) {
            Iterator<T> it = listDTwDnp.iterator();
            while (it.hasNext()) {
                List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
                if (utxoList != null) {
                    Iterator<T> it2 = utxoList.iterator();
                    while (it2.hasNext()) {
                        bigDecimal = C54862xYb.KWHzl(bigDecimal, ((UtxoInfo) it2.next()).getCoinAmount());
                    }
                }
            }
        }
        return C54862xYb.convertToString$default(bigDecimal, false, null, null, 7, null);
    }

    public final String QOLQEE() {
        BigDecimal bigDecimal = new BigDecimal("0");
        List<UTXOInfoResp> listDTwDnp = DTwDnp();
        if (listDTwDnp != null) {
            Iterator<T> it = listDTwDnp.iterator();
            while (it.hasNext()) {
                List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
                if (utxoList != null) {
                    Iterator<T> it2 = utxoList.iterator();
                    while (it2.hasNext()) {
                        bigDecimal = C54862xYb.KWHzl(bigDecimal, ((UtxoInfo) it2.next()).getTokenAmount());
                    }
                }
            }
        }
        return C54862xYb.convertToString$default(bigDecimal, false, null, null, 7, null);
    }

    @Override // o.AbstractC12609cqH
    public void zLjUOn() {
        this.dNCPSb = 0;
        sSMYrx();
    }

    @Override // o.AbstractC12609cqH
    public void EZpvd(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        super.EZpvd(str, z);
        AbstractC58185ywX<Integer> abstractC58185ywXOLrzqt = OLrzqt(this.djSkpj);
        final Function1 function1 = new Function1() { // from class: o.csT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OkUTXOTransaction.EZpvd(this.copydefault, (java.lang.Integer) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58227yxM() { // from class: o.csV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                OkUTXOTransaction.QOLQEE(function1, obj);
            }
        });
    }

    public static final void QOLQEE(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(OkUTXOTransaction okUTXOTransaction, Integer num) {
        okUTXOTransaction.dNCPSb = num.intValue();
        okUTXOTransaction.AEQbTJ(2);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC12609cqH
    public void sSMYrx() {
        super.sSMYrx();
        QVAiDq();
        InterfaceC58217yxC interfaceC58217yxC = this.RcXXUw;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        KWHzl(true);
        AbstractC58185ywX<Activity> abstractC58185ywXOLrzqt = OLrzqt(false, false);
        final Function1 function1 = new Function1() { // from class: o.csJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OkUTXOTransaction.AEQbTJ(this.AEQbTJ, (OkUTXOTransaction.Activity) obj);
            }
        };
        InterfaceC58227yxM<? super Activity> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.csL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                OkUTXOTransaction.gHZMYf(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.csI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OkUTXOTransaction.KWHzl(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        this.RcXXUw = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.csK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                OkUTXOTransaction.sSMYrx(function12, obj);
            }
        });
    }

    public static final void gHZMYf(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(OkUTXOTransaction okUTXOTransaction, Activity activity) {
        if (activity.KWHzl()) {
            okUTXOTransaction.dNCPSb = activity.AEQbTJ();
            okUTXOTransaction.AEQbTJ(2);
        }
        okUTXOTransaction.KWHzl(false);
        AbstractC12609cqH.startLoopRefreshFee$default(okUTXOTransaction, 0L, 1, null);
        return Unit.INSTANCE;
    }

    public static final void sSMYrx(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(OkUTXOTransaction okUTXOTransaction, Throwable th) {
        okUTXOTransaction.KWHzl(false);
        AbstractC12609cqH.startLoopRefreshFee$default(okUTXOTransaction, 0L, 1, null);
        return Unit.INSTANCE;
    }

    private final void djSkpj() {
        Integer num = this.AubY;
        if (num != null && num.intValue() == 31) {
            this.zLjUOn = this.ORxRYg;
            return;
        }
        if (num != null && num.intValue() == 33) {
            this.zLjUOn = this.OcIXYQ;
            return;
        }
        if (num != null && num.intValue() == 32) {
            this.zLjUOn = this.RJOkX;
        } else if (num != null && num.intValue() == 34) {
            this.zLjUOn = this.wlaJM;
        }
    }

    @Override // o.AbstractC12609cqH
    public TransactionFeeInfo AYXKKw() {
        TransactionFeeInfo transactionFeeInfoAkhnZx = AkhnZx();
        BigDecimal bigDecimalOLrzqt = C54862xYb.OLrzqt(this.ORxRYg, Integer.valueOf(this.dNCPSb));
        if (gEmmrt().accept()) {
            bigDecimalOLrzqt = C54862xYb.KWHzl(bigDecimalOLrzqt, this.QUSxYX);
        }
        transactionFeeInfoAkhnZx.setSlowFee(C54862xYb.convertToBigIntegerString$default(bigDecimalOLrzqt, false, (RoundingMode) null, 3, (Object) null));
        TransactionFeeInfo transactionFeeInfoAkhnZx2 = AkhnZx();
        BigDecimal bigDecimalOLrzqt2 = C54862xYb.OLrzqt(this.OcIXYQ, Integer.valueOf(this.dNCPSb));
        if (gEmmrt().accept()) {
            bigDecimalOLrzqt2 = C54862xYb.KWHzl(bigDecimalOLrzqt2, this.QUSxYX);
        }
        transactionFeeInfoAkhnZx2.setFastFee(C54862xYb.convertToBigIntegerString$default(bigDecimalOLrzqt2, false, (RoundingMode) null, 3, (Object) null));
        TransactionFeeInfo transactionFeeInfoAkhnZx3 = AkhnZx();
        BigDecimal bigDecimalOLrzqt3 = C54862xYb.OLrzqt(this.zLjUOn, Integer.valueOf(this.dNCPSb));
        if (gEmmrt().accept()) {
            bigDecimalOLrzqt3 = C54862xYb.KWHzl(bigDecimalOLrzqt3, this.QUSxYX);
        }
        transactionFeeInfoAkhnZx3.setFeeValue(C54862xYb.convertToBigIntegerString$default(bigDecimalOLrzqt3, false, (RoundingMode) null, 3, (Object) null));
        TransactionFeeInfo transactionFeeInfoAkhnZx4 = AkhnZx();
        BigDecimal bigDecimalOLrzqt4 = C54862xYb.OLrzqt(this.RJOkX, Integer.valueOf(this.dNCPSb));
        if (gEmmrt().accept()) {
            bigDecimalOLrzqt4 = C54862xYb.KWHzl(bigDecimalOLrzqt4, this.QUSxYX);
        }
        transactionFeeInfoAkhnZx4.setRecommendFee(C54862xYb.convertToBigIntegerString$default(bigDecimalOLrzqt4, false, (RoundingMode) null, 3, (Object) null));
        C10854bwM c10854bwMEZpvd = EZpvd();
        int iValueOf = c10854bwMEZpvd != null ? c10854bwMEZpvd.valueOf() : 0;
        C10854bwM c10854bwMEZpvd2 = EZpvd();
        int iFZBcTu = c10854bwMEZpvd2 != null ? c10854bwMEZpvd2.fZBcTu() : 0;
        TransactionFeeInfo transactionFeeInfoAkhnZx5 = AkhnZx();
        C10854bwM c10854bwMEZpvd3 = EZpvd();
        transactionFeeInfoAkhnZx5.setFeeSymbol(c10854bwMEZpvd3 != null ? c10854bwMEZpvd3.fJNWhG() : null);
        AkhnZx().setCoinSymbol(gEmmrt().fJNWhG());
        TransactionFeeInfo transactionFeeInfoAkhnZx6 = AkhnZx();
        String recommendFee = AkhnZx().getRecommendFee();
        if (recommendFee == null) {
            recommendFee = "";
        }
        transactionFeeInfoAkhnZx6.setDisplayRecommend(C54870xYj.KWHzl(recommendFee, iValueOf, iFZBcTu, null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null));
        AkhnZx().setMemPoolGasPriceMin(this.DTwDnp);
        AkhnZx().setGasPriceMin(this.ORxRYg);
        AkhnZx().setGasPriceNormal(this.RJOkX);
        AkhnZx().setGasPriceMax(this.OcIXYQ);
        AkhnZx().setMixCost(this.QOLQEE);
        AkhnZx().setNormalCost(this.QbewEr);
        AkhnZx().setMaxCost(this.QKVWgx);
        return AkhnZx();
    }

    public static /* synthetic */ String getMinOutput$default(OkUTXOTransaction okUTXOTransaction, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return okUTXOTransaction.EZpvd(z, z2);
    }

    public final String EZpvd(boolean z, boolean z2) {
        C10854bwM c10854bwMEZpvd;
        if (z) {
            String str = this.QUSxYX;
            if (str != null) {
                C10854bwM c10854bwMEZpvd2 = EZpvd();
                int iValueOf = c10854bwMEZpvd2 != null ? c10854bwMEZpvd2.valueOf() : 0;
                C10854bwM c10854bwMEZpvd3 = EZpvd();
                String strEZpvd = C54870xYj.EZpvd(str, iValueOf, c10854bwMEZpvd3 != null ? c10854bwMEZpvd3.AkhnZx() : 6, (!z2 || (c10854bwMEZpvd = EZpvd()) == null) ? null : c10854bwMEZpvd.fJNWhG(), (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                if (strEZpvd != null) {
                    return strEZpvd;
                }
            }
        } else {
            String str2 = this.QUSxYX;
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    public final Integer QbewEr() {
        String strFJNWhG = fJNWhG();
        return (strFJNWhG == null || strFJNWhG.length() == 0) ? null : -1;
    }

    /* JADX DEBUG: Type inference failed for r0v8. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> */
    private final AbstractC58185ywX<Pair<Boolean, String>> QUSxYX() {
        AbstractC58185ywX<ResponseData<SignInfo>> abstractC58185ywXCopydefault = isConnected().copydefault(fIwbmz(), getFieldNames(), new SignInfoReq(C33129mqd.gEmmrt((gEmmrt().accept() || gEmmrt().iZzfmt() || gEmmrt().DAIeex()) ? copydefault() : Long.valueOf(AEQbTJ())), DbNXlk(), fARcdN(), 5, (String) null, C54862xYb.convertToBigIntegerString$default(AuCTel(), true, (RoundingMode) null, 2, (Object) null), (String) null, gEmmrt().QbewEr(), (Long) null, (Long) null, (String) null, (Integer) null, (Boolean) null, 8000, (DefaultConstructorMarker) null));
        final Function1 function1 = new Function1() { // from class: o.csG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OkUTXOTransaction.copydefault(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.csH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OkUTXOTransaction.getNewProxyInstance(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Pair getNewProxyInstance(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Pair) function1.invoke(obj);
    }

    private final void OLrzqt(JsonObject jsonObject) {
        if (jsonObject == null) {
            return;
        }
        UTXOSignInfo uTXOSignInfo = (UTXOSignInfo) C33489mxS.KWHzl.AEQbTJ().decodeFromJsonElement(UTXOSignInfo.Companion.serializer(), jsonObject);
        AkhnZx().setFixed(false);
        this.DTwDnp = uTXOSignInfo.getMempoolMin();
        this.ORxRYg = uTXOSignInfo.getMin();
        this.RJOkX = uTXOSignInfo.getNormal();
        this.OcIXYQ = uTXOSignInfo.getMax();
        this.QOLQEE = uTXOSignInfo.getMinCost();
        this.QbewEr = uTXOSignInfo.getNormalCost();
        this.QKVWgx = uTXOSignInfo.getMaxCost();
        if (C33129mqd.AEQbTJ(this.RJOkX, this.OcIXYQ)) {
            this.RJOkX = this.OcIXYQ;
            this.QbewEr = this.QOLQEE;
        } else if (C33129mqd.gEmmrt(this.RJOkX, this.ORxRYg)) {
            this.RJOkX = this.ORxRYg;
            this.QbewEr = this.QKVWgx;
        }
        Integer num = this.AubY;
        if (num == null || num.intValue() != 34) {
            djSkpj();
        }
        this.QUSxYX = uTXOSignInfo.getMinOutput();
        this.AxsJAY = uTXOSignInfo.getInscriptionOutput();
        this.UeEOUB = uTXOSignInfo.getTransferReminder();
        Integer queryCount = uTXOSignInfo.getQueryCount();
        this.QVAiDq = queryCount != null ? queryCount.intValue() : this.aKErDB.OLrzqt();
        AkhnZx().setReserveFeeRatio(uTXOSignInfo.getReserveFeeRatio());
    }

    public final String OLrzqt(boolean z, boolean z2, boolean z3) {
        if (QfsBiF()) {
            if (z) {
                return RJOkX();
            }
            return C54862xYb.convertToString$default(C54862xYb.KWHzl(OcIXYQ(), RJOkX()), false, null, null, 7, null);
        }
        if (!z3) {
            if (!gEmmrt().accept()) {
                if (z2) {
                    return AbstractC12609cqH.getTransferAmount$default(this, false, false, false, 7, null);
                }
                return AuCTel();
            }
            String str = this.QUSxYX;
            if (str != null) {
                return str;
            }
        }
        return "0";
    }

    public final String RJOkX() {
        BigDecimal bigDecimal = new BigDecimal("0");
        List<UTXOInfoResp> listDTwDnp = DTwDnp();
        if (listDTwDnp != null) {
            Iterator<T> it = listDTwDnp.iterator();
            while (it.hasNext()) {
                List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
                if (utxoList != null) {
                    for (UtxoInfo utxoInfo : utxoList) {
                        if (C33129mqd.gEmmrt(utxoInfo.getCoinAmount(), this.AxsJAY)) {
                            bigDecimal = C54862xYb.AEQbTJ(C54862xYb.KWHzl(bigDecimal, this.AxsJAY), utxoInfo.getCoinAmount());
                        }
                    }
                }
            }
        }
        return C54862xYb.convertToString$default(bigDecimal, false, null, null, 7, null);
    }

    public final String KWHzl(boolean z, boolean z2) {
        if (z || QfsBiF()) {
            return C54862xYb.convertToString$default(C54862xYb.OLrzqt(this.zLjUOn, Integer.valueOf(this.dNCPSb)), false, null, null, 7, null);
        }
        return (wlaJM() || z2) ? "0" : C54862xYb.convertToString$default(C54862xYb.OLrzqt(this.zLjUOn, Integer.valueOf(this.dNCPSb)), false, null, null, 7, null);
    }

    public static final InterfaceC60096zvd wlaJM(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public final AbstractC58185ywX<Activity> OLrzqt(boolean z, final boolean z2) {
        AbstractC58185ywX abstractC58185ywXAEQbTJ = C11607cUn.AEQbTJ(loadUTXO$default(this, z, z2, 0, 4, null));
        final Function1 function1 = new Function1() { // from class: o.csY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OkUTXOTransaction.copydefault(z2, this, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<Activity> abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.csZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OkUTXOTransaction.wlaJM(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final Activity getFieldNames(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Activity) function1.invoke(obj);
    }

    public static final Activity AEQbTJ(Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return new Activity(true, num.intValue(), "");
    }

    public static /* synthetic */ AbstractC58185ywX loadUTXO$default(OkUTXOTransaction okUTXOTransaction, boolean z, boolean z2, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return okUTXOTransaction.EZpvd(z, z2, i);
    }

    public final AbstractC58185ywX<ResponseData<List<UTXOInfoResp>>> EZpvd(final boolean z, final boolean z2, final int i) {
        Long lCopydefault = (gEmmrt().accept() || gEmmrt().iZzfmt() || gEmmrt().DAIeex()) ? copydefault() : Long.valueOf(AEQbTJ());
        C13934dbu c13934dbuIsConnected = isConnected();
        String strFIwbmz = fIwbmz();
        String fieldNames = getFieldNames();
        String strDbNXlk = DbNXlk();
        String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(OLrzqt(true, z, z2), true, (RoundingMode) null, 2, (Object) null);
        String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(KWHzl(z, z2), true, (RoundingMode) null, 2, (Object) null);
        ArrayList arrayList = new ArrayList();
        List<UTXOInfoResp> listDTwDnp = DTwDnp();
        if (listDTwDnp != null) {
            Iterator<T> it = listDTwDnp.iterator();
            while (it.hasNext()) {
                List<UtxoInfo> utxoList = ((UTXOInfoResp) it.next()).getUtxoList();
                if (utxoList != null) {
                    for (UtxoInfo utxoInfo : utxoList) {
                        arrayList.add(utxoInfo.getTxHash() + "-" + utxoInfo.getVout());
                    }
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        AbstractC58185ywX abstractC58185ywXEZpvd = C11607cUn.EZpvd(c13934dbuIsConnected.KWHzl(strFIwbmz, fieldNames, new UTXOInfoReq(lCopydefault, C56402yEa.EZpvd(new UTXOAddressInfoReq(strDbNXlk, strConvertToBigIntegerString$default, strConvertToBigIntegerString$default2, (Integer) 1, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, (List) arrayList, (Integer) null, (Integer) 0, (Integer) null, (String) null, (Integer) null, (List) null, 62960, (DefaultConstructorMarker) null)), 0, 4, null)));
        final Function1 function1 = new Function1() { // from class: o.csv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OkUTXOTransaction.AEQbTJ(this.AEQbTJ, z2, i, z, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<List<UTXOInfoResp>>> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.csu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OkUTXOTransaction.AuCTelauCTel(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AuCTelauCTel(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(final OkUTXOTransaction okUTXOTransaction, final boolean z, final int i, final boolean z2, final ResponseData responseData) {
        List<UTXOInfoResp> list;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (okUTXOTransaction.QfsBiF()) {
            ArrayList arrayList = new ArrayList();
            List<UTXOInfoResp> listDTwDnp = okUTXOTransaction.DTwDnp();
            if (listDTwDnp == null) {
                listDTwDnp = yDY.AhwBna();
            }
            arrayList.addAll(listDTwDnp);
            List listAhwBna = (List) responseData.getData();
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            arrayList.addAll(listAhwBna);
            list = arrayList;
        } else {
            list = (List) responseData.getData();
        }
        final List<UTXOInfoResp> list2 = list;
        AbstractC58185ywX<Integer> abstractC58185ywXOLrzqt = okUTXOTransaction.OLrzqt(list2);
        final Function1 function1 = new Function1() { // from class: o.csA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OkUTXOTransaction.KWHzl(responseData, z, okUTXOTransaction, i, list2, z2, (java.lang.Integer) obj);
            }
        };
        return abstractC58185ywXOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.csC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OkUTXOTransaction.zsXlph(function1, obj);
            }
        });
    }

    public static final InterfaceC60096zvd zsXlph(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    private final AbstractC58185ywX<ResponseData<List<UTXOInfoResp>>> dNCPSb() {
        return isConnected().KWHzl(fIwbmz(), getFieldNames(), new UTXOInfoReq((gEmmrt().accept() || gEmmrt().iZzfmt() || gEmmrt().DAIeex()) ? copydefault() : Long.valueOf(AEQbTJ()), yDY.gEmmrt(new UTXOAddressInfoReq(DbNXlk(), (String) null, (String) null, (Integer) 8, (String) null, (Integer) 1, (Integer) 20, (String) null, (String) null, (List) null, (Integer) null, (Integer) 0, (Integer) null, (String) null, (Integer) null, (List) null, 63382, (DefaultConstructorMarker) null), new UTXOAddressInfoReq(DbNXlk(), (String) null, (String) null, (Integer) 7, (String) null, (Integer) 1, (Integer) 20, (String) null, (String) null, (List) null, (Integer) null, (Integer) 0, (Integer) null, (String) null, (Integer) null, (List) null, 63382, (DefaultConstructorMarker) null)), 0, 4, null));
    }

    public static final class Activity {
        public int EZpvd;
        public String OLrzqt;
        public boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.OLrzqt;
        }

        public Activity(boolean z, int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = z;
            this.EZpvd = i;
            this.OLrzqt = str;
        }
    }

    public final C12797ctk.StateListAnimator EZpvd(boolean z, List<UTXOInfoResp> list) {
        C12797ctk c12797ctk = this.aKErDB;
        AbstractC12782ctV newProxyInstance = getNewProxyInstance();
        C10854bwM c10854bwMGEmmrt = gEmmrt();
        String strOLrzqt = OLrzqt(false, z, false);
        String strKWHzl = KWHzl(z, false);
        String str = this.AuCTelauCTel;
        String str2 = this.QUSxYX;
        if (str2 == null) {
            str2 = "";
        }
        return c12797ctk.copydefault(newProxyInstance, c10854bwMGEmmrt, strOLrzqt, strKWHzl, str, str2, list);
    }

    public final AbstractC58185ywX<Integer> OLrzqt(List<UTXOInfoResp> list) {
        C12797ctk c12797ctk = this.aKErDB;
        C12797ctk.StateListAnimator stateListAnimatorEZpvd = EZpvd(false, list);
        AbstractC12782ctV newProxyInstance = getNewProxyInstance();
        C10854bwM c10854bwMGEmmrt = gEmmrt();
        String strAuCTel = AuCTel();
        String strOLrzqt = OLrzqt(false, false, false);
        String strKWHzl = KWHzl(false, false);
        String str = this.QUSxYX;
        if (str == null) {
            str = "";
        }
        return C12797ctk.getSignLength$default(c12797ctk, stateListAnimatorEZpvd, newProxyInstance, c10854bwMGEmmrt, strAuCTel, strOLrzqt, strKWHzl, str, DbNXlk(), fARcdN(), null, null, fJNWhG(), QbewEr(), 1536, null);
    }

    @Override // o.AbstractC12609cqH
    public void AEQbTJ(long j) {
        InterfaceC58217yxC interfaceC58217yxC = this.zuBGHE;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(j, 7L, TimeUnit.SECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.csR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OkUTXOTransaction.OLrzqt(this.copydefault, (java.lang.Long) obj);
            }
        };
        this.zuBGHE = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.csW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                OkUTXOTransaction.QUSxYX(function1, obj);
            }
        });
    }

    public static final void QUSxYX(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(final OkUTXOTransaction okUTXOTransaction, Long l) {
        InterfaceC58217yxC interfaceC58217yxC = okUTXOTransaction.QfsBiF;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58185ywX<Pair<Boolean, String>> abstractC58185ywXQUSxYX = okUTXOTransaction.QUSxYX();
        final Function1 function1 = new Function1() { // from class: o.csq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OkUTXOTransaction.AhwBna(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXQUSxYX.KWHzl(new InterfaceC58229yxO() { // from class: o.csp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OkUTXOTransaction.OcIXYQ(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.csF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OkUTXOTransaction.djBIcL(this.copydefault, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.csN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                OkUTXOTransaction.ORxRYg(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.csX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OkUTXOTransaction.copydefault((java.lang.Throwable) obj);
            }
        };
        okUTXOTransaction.QfsBiF = abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cta
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                OkUTXOTransaction.QKVWgx(function13, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd OcIXYQ(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AhwBna(final OkUTXOTransaction okUTXOTransaction, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            AbstractC58185ywX<Activity> abstractC58185ywXOLrzqt = okUTXOTransaction.OLrzqt(false, false);
            final Function1 function1 = new Function1() { // from class: o.csy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OkUTXOTransaction.EZpvd(this.AEQbTJ, (OkUTXOTransaction.Activity) obj);
                }
            };
            return abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.csz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return OkUTXOTransaction.DTwDnp(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(Boolean.FALSE, pair.getSecond()));
    }

    public static final Pair DTwDnp(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Pair) function1.invoke(obj);
    }

    public static final Pair EZpvd(OkUTXOTransaction okUTXOTransaction, Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity.KWHzl()) {
            okUTXOTransaction.dNCPSb = activity.AEQbTJ();
            return C56390yDp.OLrzqt(Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(Boolean.FALSE, activity.copydefault());
    }

    public static final void ORxRYg(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(OkUTXOTransaction okUTXOTransaction, Pair pair) {
        if (((Boolean) pair.getFirst()).booleanValue()) {
            okUTXOTransaction.AEQbTJ(1);
        }
        return Unit.INSTANCE;
    }

    public static final void QKVWgx(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Throwable th) {
        return Unit.INSTANCE;
    }

    public void QVAiDq() {
        InterfaceC58217yxC interfaceC58217yxC = this.zuBGHE;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.QfsBiF;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.Boolean> */
    @Override // o.AbstractC12609cqH
    public AbstractC58185ywX<Boolean> ORxRYg() {
        KWHzl(true);
        AbstractC58185ywX<Activity> abstractC58185ywXOLrzqt = OLrzqt(false, true);
        final Function1 function1 = new Function1() { // from class: o.ctb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OkUTXOTransaction.AhwBna(this.EZpvd, (OkUTXOTransaction.Activity) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.ctd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return OkUTXOTransaction.QfsBiF(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Boolean QfsBiF(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Boolean) function1.invoke(obj);
    }

    public static final Boolean AhwBna(OkUTXOTransaction okUTXOTransaction, Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        okUTXOTransaction.KWHzl(false);
        return Boolean.valueOf(activity.KWHzl());
    }

    @Override // o.AbstractC12609cqH
    public void zsXlph() {
        super.zsXlph();
        InterfaceC58217yxC interfaceC58217yxC = this.RcXXUw;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        QVAiDq();
    }

    @Serializable
    public static final class UTXOSignInfo {
        private final String dummyOutput;
        private final String inscriptionOutput;
        private String max;
        private String maxCost;
        private String mempoolMin;
        private String min;
        private String minCost;
        private final String minOutput;
        private String normal;
        private String normalCost;
        private Integer queryCount;
        private String reserveFeeRatio;
        private String transferReminder;
        private final String txSizeLimit;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UTXOSignInfo() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, 16383, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.min;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.reserveFeeRatio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component11() {
            return this.txSizeLimit;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component12() {
            return this.mempoolMin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component13() {
            return this.transferReminder;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component14() {
            return this.queryCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.normal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.max;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.minCost;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.normalCost;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.maxCost;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.minOutput;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.inscriptionOutput;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.dummyOutput;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UTXOSignInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num) {
            return new UTXOSignInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UTXOSignInfo)) {
                return false;
            }
            UTXOSignInfo uTXOSignInfo = (UTXOSignInfo) obj;
            return Intrinsics.EZpvd((Object) this.min, (Object) uTXOSignInfo.min) && Intrinsics.EZpvd((Object) this.normal, (Object) uTXOSignInfo.normal) && Intrinsics.EZpvd((Object) this.max, (Object) uTXOSignInfo.max) && Intrinsics.EZpvd((Object) this.minCost, (Object) uTXOSignInfo.minCost) && Intrinsics.EZpvd((Object) this.normalCost, (Object) uTXOSignInfo.normalCost) && Intrinsics.EZpvd((Object) this.maxCost, (Object) uTXOSignInfo.maxCost) && Intrinsics.EZpvd((Object) this.minOutput, (Object) uTXOSignInfo.minOutput) && Intrinsics.EZpvd((Object) this.inscriptionOutput, (Object) uTXOSignInfo.inscriptionOutput) && Intrinsics.EZpvd((Object) this.dummyOutput, (Object) uTXOSignInfo.dummyOutput) && Intrinsics.EZpvd((Object) this.reserveFeeRatio, (Object) uTXOSignInfo.reserveFeeRatio) && Intrinsics.EZpvd((Object) this.txSizeLimit, (Object) uTXOSignInfo.txSizeLimit) && Intrinsics.EZpvd((Object) this.mempoolMin, (Object) uTXOSignInfo.mempoolMin) && Intrinsics.EZpvd((Object) this.transferReminder, (Object) uTXOSignInfo.transferReminder) && Intrinsics.EZpvd(this.queryCount, uTXOSignInfo.queryCount);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDummyOutput() {
            return this.dummyOutput;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getInscriptionOutput() {
            return this.inscriptionOutput;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMax() {
            return this.max;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMaxCost() {
            return this.maxCost;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMempoolMin() {
            return this.mempoolMin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMin() {
            return this.min;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMinCost() {
            return this.minCost;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMinOutput() {
            return this.minOutput;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNormal() {
            return this.normal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNormalCost() {
            return this.normalCost;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getQueryCount() {
            return this.queryCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getReserveFeeRatio() {
            return this.reserveFeeRatio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTransferReminder() {
            return this.transferReminder;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTxSizeLimit() {
            return this.txSizeLimit;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.min;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.normal;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.max;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.minCost;
            int iHashCode4 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.normalCost;
            int iHashCode5 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.maxCost;
            int iHashCode6 = str6 == null ? 0 : str6.hashCode();
            String str7 = this.minOutput;
            int iHashCode7 = str7 == null ? 0 : str7.hashCode();
            String str8 = this.inscriptionOutput;
            int iHashCode8 = str8 == null ? 0 : str8.hashCode();
            String str9 = this.dummyOutput;
            int iHashCode9 = str9 == null ? 0 : str9.hashCode();
            String str10 = this.reserveFeeRatio;
            int iHashCode10 = str10 == null ? 0 : str10.hashCode();
            String str11 = this.txSizeLimit;
            int iHashCode11 = str11 == null ? 0 : str11.hashCode();
            String str12 = this.mempoolMin;
            int iHashCode12 = str12 == null ? 0 : str12.hashCode();
            String str13 = this.transferReminder;
            int iHashCode13 = str13 == null ? 0 : str13.hashCode();
            Integer num = this.queryCount;
            return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (num != null ? num.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMax(String str) {
            this.max = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMaxCost(String str) {
            this.maxCost = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMempoolMin(String str) {
            this.mempoolMin = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMin(String str) {
            this.min = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMinCost(String str) {
            this.minCost = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setNormal(String str) {
            this.normal = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setNormalCost(String str) {
            this.normalCost = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setQueryCount(Integer num) {
            this.queryCount = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setReserveFeeRatio(String str) {
            this.reserveFeeRatio = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTransferReminder(String str) {
            this.transferReminder = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UTXOSignInfo(min=" + this.min + ", normal=" + this.normal + ", max=" + this.max + ", minCost=" + this.minCost + ", normalCost=" + this.normalCost + ", maxCost=" + this.maxCost + ", minOutput=" + this.minOutput + ", inscriptionOutput=" + this.inscriptionOutput + ", dummyOutput=" + this.dummyOutput + ", reserveFeeRatio=" + this.reserveFeeRatio + ", txSizeLimit=" + this.txSizeLimit + ", mempoolMin=" + this.mempoolMin + ", transferReminder=" + this.transferReminder + ", queryCount=" + this.queryCount + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction.UTXOSignInfo.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<UTXOSignInfo> serializer() {
                return OkUTXOTransaction$UTXOSignInfo$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ UTXOSignInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.min = null;
            } else {
                this.min = str;
            }
            if ((i & 2) == 0) {
                this.normal = null;
            } else {
                this.normal = str2;
            }
            if ((i & 4) == 0) {
                this.max = null;
            } else {
                this.max = str3;
            }
            if ((i & 8) == 0) {
                this.minCost = null;
            } else {
                this.minCost = str4;
            }
            if ((i & 16) == 0) {
                this.normalCost = null;
            } else {
                this.normalCost = str5;
            }
            if ((i & 32) == 0) {
                this.maxCost = null;
            } else {
                this.maxCost = str6;
            }
            if ((i & 64) == 0) {
                this.minOutput = null;
            } else {
                this.minOutput = str7;
            }
            if ((i & 128) == 0) {
                this.inscriptionOutput = null;
            } else {
                this.inscriptionOutput = str8;
            }
            if ((i & 256) == 0) {
                this.dummyOutput = null;
            } else {
                this.dummyOutput = str9;
            }
            if ((i & 512) == 0) {
                this.reserveFeeRatio = null;
            } else {
                this.reserveFeeRatio = str10;
            }
            if ((i & 1024) == 0) {
                this.txSizeLimit = null;
            } else {
                this.txSizeLimit = str11;
            }
            if ((i & 2048) == 0) {
                this.mempoolMin = null;
            } else {
                this.mempoolMin = str12;
            }
            if ((i & 4096) == 0) {
                this.transferReminder = null;
            } else {
                this.transferReminder = str13;
            }
            if ((i & 8192) == 0) {
                this.queryCount = null;
            } else {
                this.queryCount = num;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(UTXOSignInfo uTXOSignInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || uTXOSignInfo.min != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, uTXOSignInfo.min);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || uTXOSignInfo.normal != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, uTXOSignInfo.normal);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || uTXOSignInfo.max != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, uTXOSignInfo.max);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || uTXOSignInfo.minCost != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, uTXOSignInfo.minCost);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || uTXOSignInfo.normalCost != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, uTXOSignInfo.normalCost);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || uTXOSignInfo.maxCost != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, uTXOSignInfo.maxCost);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || uTXOSignInfo.minOutput != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, uTXOSignInfo.minOutput);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || uTXOSignInfo.inscriptionOutput != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, uTXOSignInfo.inscriptionOutput);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || uTXOSignInfo.dummyOutput != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, uTXOSignInfo.dummyOutput);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || uTXOSignInfo.reserveFeeRatio != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, uTXOSignInfo.reserveFeeRatio);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || uTXOSignInfo.txSizeLimit != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, uTXOSignInfo.txSizeLimit);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || uTXOSignInfo.mempoolMin != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, uTXOSignInfo.mempoolMin);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || uTXOSignInfo.transferReminder != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, uTXOSignInfo.transferReminder);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && uTXOSignInfo.queryCount == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, uTXOSignInfo.queryCount);
        }

        public UTXOSignInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num) {
            this.min = str;
            this.normal = str2;
            this.max = str3;
            this.minCost = str4;
            this.normalCost = str5;
            this.maxCost = str6;
            this.minOutput = str7;
            this.inscriptionOutput = str8;
            this.dummyOutput = str9;
            this.reserveFeeRatio = str10;
            this.txSizeLimit = str11;
            this.mempoolMin = str12;
            this.transferReminder = str13;
            this.queryCount = num;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0090: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x006b: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.Integer) : (null java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:663) call: com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction.UTXOSignInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
        public /* synthetic */ UTXOSignInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) == 0 ? num : null);
        }
    }

    @Serializable
    public static final class InitArgs {
        private List<FixedUTXOInfo> batchBean;
        private List<UTXOInfoResp> utxoList;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(UTXOInfoResp$$serializer.INSTANCE), new ArrayListSerializer(FixedUTXOInfo$$serializer.INSTANCE)};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InitArgs() {
            this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction$InitArgs */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = initArgs.utxoList;
            }
            if ((i & 2) != 0) {
                list2 = initArgs.batchBean;
            }
            return initArgs.copy(list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<UTXOInfoResp> component1() {
            return this.utxoList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<FixedUTXOInfo> component2() {
            return this.batchBean;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InitArgs copy(List<UTXOInfoResp> list, List<FixedUTXOInfo> list2) {
            return new InitArgs(list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitArgs)) {
                return false;
            }
            InitArgs initArgs = (InitArgs) obj;
            return Intrinsics.EZpvd(this.utxoList, initArgs.utxoList) && Intrinsics.EZpvd(this.batchBean, initArgs.batchBean);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<FixedUTXOInfo> getBatchBean() {
            return this.batchBean;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<UTXOInfoResp> getUtxoList() {
            return this.utxoList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            List<UTXOInfoResp> list = this.utxoList;
            int iHashCode = list == null ? 0 : list.hashCode();
            List<FixedUTXOInfo> list2 = this.batchBean;
            return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBatchBean(List<FixedUTXOInfo> list) {
            this.batchBean = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setUtxoList(List<UTXOInfoResp> list) {
            this.utxoList = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "InitArgs(utxoList=" + this.utxoList + ", batchBean=" + this.batchBean + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction.InitArgs.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<InitArgs> serializer() {
                return OkUTXOTransaction$InitArgs$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ InitArgs(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.utxoList = null;
            } else {
                this.utxoList = list;
            }
            if ((i & 2) == 0) {
                this.batchBean = null;
            } else {
                this.batchBean = list2;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(InitArgs initArgs, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || initArgs.utxoList != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], initArgs.utxoList);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && initArgs.batchBean == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], initArgs.batchBean);
        }

        public InitArgs(List<UTXOInfoResp> list, List<FixedUTXOInfo> list2) {
            this.utxoList = list;
            this.batchBean = list2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.defi.biz.net.bean.UTXOInfoResp>, java.util.List<com.okinc.business.defi.api.model.tx.signdata.FixedUTXOInfo>):void (m)] (LINE:682) call: com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction.InitArgs.<init>(java.util.List, java.util.List):void type: THIS */
        public /* synthetic */ InitArgs(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
        }
    }

    @Serializable
    public static final class InputsAndOutputs {
        private static final KSerializer<Object>[] $childSerializers;
        private final List<UTXOSimpleBean> inputs;
        private final List<UTXOSimpleBean> outputs;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InputsAndOutputs() {
            this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction$InputsAndOutputs */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InputsAndOutputs copy$default(InputsAndOutputs inputsAndOutputs, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = inputsAndOutputs.inputs;
            }
            if ((i & 2) != 0) {
                list2 = inputsAndOutputs.outputs;
            }
            return inputsAndOutputs.copy(list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<UTXOSimpleBean> component1() {
            return this.inputs;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<UTXOSimpleBean> component2() {
            return this.outputs;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InputsAndOutputs copy(List<UTXOSimpleBean> list, List<UTXOSimpleBean> list2) {
            return new InputsAndOutputs(list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InputsAndOutputs)) {
                return false;
            }
            InputsAndOutputs inputsAndOutputs = (InputsAndOutputs) obj;
            return Intrinsics.EZpvd(this.inputs, inputsAndOutputs.inputs) && Intrinsics.EZpvd(this.outputs, inputsAndOutputs.outputs);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<UTXOSimpleBean> getInputs() {
            return this.inputs;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<UTXOSimpleBean> getOutputs() {
            return this.outputs;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            List<UTXOSimpleBean> list = this.inputs;
            int iHashCode = list == null ? 0 : list.hashCode();
            List<UTXOSimpleBean> list2 = this.outputs;
            return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "InputsAndOutputs(inputs=" + this.inputs + ", outputs=" + this.outputs + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction.InputsAndOutputs.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<InputsAndOutputs> serializer() {
                return OkUTXOTransaction$InputsAndOutputs$$serializer.INSTANCE;
            }
        }

        static {
            OkUTXOTransaction$InputsAndOutputs$UTXOSimpleBean$$serializer okUTXOTransaction$InputsAndOutputs$UTXOSimpleBean$$serializer = OkUTXOTransaction$InputsAndOutputs$UTXOSimpleBean$$serializer.INSTANCE;
            $childSerializers = new KSerializer[]{new ArrayListSerializer(okUTXOTransaction$InputsAndOutputs$UTXOSimpleBean$$serializer), new ArrayListSerializer(okUTXOTransaction$InputsAndOutputs$UTXOSimpleBean$$serializer)};
        }

        public /* synthetic */ InputsAndOutputs(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.inputs = null;
            } else {
                this.inputs = list;
            }
            if ((i & 2) == 0) {
                this.outputs = null;
            } else {
                this.outputs = list2;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(InputsAndOutputs inputsAndOutputs, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || inputsAndOutputs.inputs != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], inputsAndOutputs.inputs);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && inputsAndOutputs.outputs == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], inputsAndOutputs.outputs);
        }

        public InputsAndOutputs(List<UTXOSimpleBean> list, List<UTXOSimpleBean> list2) {
            this.inputs = list;
            this.outputs = list2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction$InputsAndOutputs$UTXOSimpleBean>, java.util.List<com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction$InputsAndOutputs$UTXOSimpleBean>):void (m)] (LINE:689) call: com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction.InputsAndOutputs.<init>(java.util.List, java.util.List):void type: THIS */
        public /* synthetic */ InputsAndOutputs(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
        }

        @Serializable
        public static final class UTXOSimpleBean {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private final String address;
            private final String amount;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public UTXOSimpleBean() {
                this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ UTXOSimpleBean copy$default(UTXOSimpleBean uTXOSimpleBean, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = uTXOSimpleBean.address;
                }
                if ((i & 2) != 0) {
                    str2 = uTXOSimpleBean.amount;
                }
                return uTXOSimpleBean.copy(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.address;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.amount;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UTXOSimpleBean copy(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new UTXOSimpleBean(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UTXOSimpleBean)) {
                    return false;
                }
                UTXOSimpleBean uTXOSimpleBean = (UTXOSimpleBean) obj;
                return Intrinsics.EZpvd((Object) this.address, (Object) uTXOSimpleBean.address) && Intrinsics.EZpvd((Object) this.amount, (Object) uTXOSimpleBean.amount);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getAddress() {
                return this.address;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getAmount() {
                return this.amount;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.address.hashCode() * 31) + this.amount.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UTXOSimpleBean(address=" + this.address + ", amount=" + this.amount + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction.InputsAndOutputs.UTXOSimpleBean.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<UTXOSimpleBean> serializer() {
                    return OkUTXOTransaction$InputsAndOutputs$UTXOSimpleBean$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ UTXOSimpleBean(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                this.address = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.amount = "0";
                } else {
                    this.amount = str2;
                }
            }

            public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(UTXOSimpleBean uTXOSimpleBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) uTXOSimpleBean.address, (Object) "")) {
                    compositeEncoder.encodeStringElement(serialDescriptor, 0, uTXOSimpleBean.address);
                }
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) uTXOSimpleBean.amount, (Object) "0")) {
                    return;
                }
                compositeEncoder.encodeStringElement(serialDescriptor, 1, uTXOSimpleBean.amount);
            }

            public UTXOSimpleBean(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.address = str;
                this.amount = str2;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:695) call: com.okinc.business.defi.biz.core.tx.transaction.impl.OkUTXOTransaction.InputsAndOutputs.UTXOSimpleBean.<init>(java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ UTXOSimpleBean(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "0" : str2);
            }
        }
    }

    public static final Pair copydefault(OkUTXOTransaction okUTXOTransaction, Pair pair, ResponseData responseData) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(responseData, "");
        if ((responseData.getCode() == 0 && responseData.getData() != null) || responseData.getCode() == 10004 || responseData.getCode() == 100041) {
            C12797ctk c12797ctk = new C12797ctk();
            List list = (List) responseData.getData();
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Intrinsics.EZpvd((Object) ((UTXOInfoResp) obj).getAddress(), (Object) okUTXOTransaction.DbNXlk())) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            okUTXOTransaction.AwvSrB = c12797ctk.valueOf(arrayList);
            return C56390yDp.OLrzqt(pair.getFirst(), pair.getSecond());
        }
        return C56390yDp.OLrzqt(Boolean.FALSE, "");
    }

    public static final Pair copydefault(OkUTXOTransaction okUTXOTransaction, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            SignInfo signInfo = (SignInfo) responseData.getData();
            okUTXOTransaction.OLrzqt(signInfo != null ? signInfo.getInfo() : null);
            return C56390yDp.OLrzqt(Boolean.TRUE, "");
        }
        return C56390yDp.OLrzqt(Boolean.FALSE, responseData.getMsg());
    }

    public static final InterfaceC60096zvd copydefault(boolean z, OkUTXOTransaction okUTXOTransaction, ResponseData responseData) {
        Object next;
        List<UTXOInfoResp> list;
        Intrinsics.checkNotNullParameter(responseData, "");
        if ((responseData.getCode() == 0 && responseData.getData() != null) || responseData.getCode() == 10004 || responseData.getCode() == 100041) {
            if (!z) {
                okUTXOTransaction.sSMYrx = responseData.getCode() == 10004;
                okUTXOTransaction.gHZMYf = responseData.getCode() == 100041;
            }
            List list2 = (List) responseData.getData();
            if (list2 != null) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((Object) ((UTXOInfoResp) next).getAddress(), (Object) okUTXOTransaction.DbNXlk())) {
                        break;
                    }
                }
                UTXOInfoResp uTXOInfoResp = (UTXOInfoResp) next;
                if (uTXOInfoResp != null) {
                    if (!z) {
                        if (okUTXOTransaction.QfsBiF()) {
                            ArrayList arrayList = new ArrayList();
                            List<UTXOInfoResp> listDTwDnp = okUTXOTransaction.DTwDnp();
                            if (listDTwDnp == null) {
                                listDTwDnp = yDY.AhwBna();
                            }
                            arrayList.addAll(listDTwDnp);
                            List listAhwBna = (List) responseData.getData();
                            if (listAhwBna == null) {
                                listAhwBna = yDY.AhwBna();
                            }
                            arrayList.addAll(listAhwBna);
                            list = arrayList;
                        } else {
                            list = (List) responseData.getData();
                        }
                        okUTXOTransaction.djSkpj = list;
                    }
                    if (okUTXOTransaction.gEmmrt().AuCTel()) {
                        okUTXOTransaction.EZpvd(uTXOInfoResp.getCanTransferAmount());
                        okUTXOTransaction.OLrzqt(uTXOInfoResp.getCanTransferAmount());
                    } else {
                        okUTXOTransaction.OLrzqt(uTXOInfoResp.getCanTransferAmount());
                    }
                }
            }
            AbstractC58185ywX<Integer> abstractC58185ywXOLrzqt = okUTXOTransaction.OLrzqt(okUTXOTransaction.djSkpj);
            final Function1 function1 = new Function1() { // from class: o.csD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OkUTXOTransaction.AEQbTJ((java.lang.Integer) obj);
                }
            };
            return abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.csE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return OkUTXOTransaction.getFieldNames(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(new Activity(false, 0, responseData.getMsg()));
    }

    public static final InterfaceC60096zvd KWHzl(ResponseData responseData, boolean z, OkUTXOTransaction okUTXOTransaction, int i, List list, boolean z2, Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        if (responseData.getCode() == 0 && responseData.getData() != null && !z) {
            if (num.intValue() != okUTXOTransaction.dNCPSb && i < okUTXOTransaction.QVAiDq) {
                okUTXOTransaction.dNCPSb = num.intValue();
                okUTXOTransaction.djSkpj = list;
                return okUTXOTransaction.EZpvd(z2, z, i + 1);
            }
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(responseData);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }
}
