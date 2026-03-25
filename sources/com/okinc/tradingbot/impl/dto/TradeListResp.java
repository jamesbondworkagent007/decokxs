package com.okinc.tradingbot.impl.dto;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class TradeListResp {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String accFillSz;
    public final String algoClOrdId;
    public final String algoOrdType;
    public final String arbOrdType;
    public final String avgPx;
    public final String baseFee;
    public final String batchId;
    public final String cTime;
    public final String cancelSource;
    public final String cancelTime;
    public final String ccy;
    public final String clientOrdId;
    public final ContractDcaExtendInfo contractDcaExtendInfo;
    public final String ctVal;
    public final String cycleId;
    public final String dcaOrdType;
    public final String displayId;
    public final String endTime;
    public final String errCode;
    public final String fee;
    public final String feeCcy;
    public final String feeType;
    public final String groupId;
    public final String instId;
    public final String instType;
    public final String ip;
    public final String lever;
    public final String mgnCcy;
    public final String ordId;
    public final String ordType;
    public final String orderTag;
    public final String planPrice;
    public final String pnl;
    public final String pnlCcy;
    public final String pnlRatio;
    public final String posSide;
    public final String px;
    public final String quoteFee;
    public final String rebate;
    public final String rebateCcy;
    public final String reduceOnly;
    public final String sid;
    public final String side;
    public final String source;
    public final String startTime;
    public final String state;
    public final String strategyOrderType;
    public final String systemType;
    public final String sz;
    public final String tag;
    public final String tdMode;
    public final String tradeQuoteCcy;
    public final String uTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeListResp() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ContractDcaExtendInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 2097151, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.cycleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.side;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractDcaExtendInfo EZpvd() {
        return this.contractDcaExtendInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.accFillSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeListResp OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, ContractDcaExtendInfo contractDcaExtendInfo, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, @NotNull String str51, @NotNull String str52) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str51, "");
        Intrinsics.checkNotNullParameter(str52, "");
        return new TradeListResp(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, contractDcaExtendInfo, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.algoClOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.avgPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.dcaOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeListResp)) {
            return false;
        }
        TradeListResp tradeListResp = (TradeListResp) obj;
        return Intrinsics.EZpvd((Object) this.accFillSz, (Object) tradeListResp.accFillSz) && Intrinsics.EZpvd((Object) this.algoClOrdId, (Object) tradeListResp.algoClOrdId) && Intrinsics.EZpvd((Object) this.algoOrdType, (Object) tradeListResp.algoOrdType) && Intrinsics.EZpvd((Object) this.arbOrdType, (Object) tradeListResp.arbOrdType) && Intrinsics.EZpvd((Object) this.avgPx, (Object) tradeListResp.avgPx) && Intrinsics.EZpvd((Object) this.baseFee, (Object) tradeListResp.baseFee) && Intrinsics.EZpvd((Object) this.batchId, (Object) tradeListResp.batchId) && Intrinsics.EZpvd((Object) this.cTime, (Object) tradeListResp.cTime) && Intrinsics.EZpvd((Object) this.cancelSource, (Object) tradeListResp.cancelSource) && Intrinsics.EZpvd((Object) this.cancelTime, (Object) tradeListResp.cancelTime) && Intrinsics.EZpvd((Object) this.ccy, (Object) tradeListResp.ccy) && Intrinsics.EZpvd((Object) this.clientOrdId, (Object) tradeListResp.clientOrdId) && Intrinsics.EZpvd(this.contractDcaExtendInfo, tradeListResp.contractDcaExtendInfo) && Intrinsics.EZpvd((Object) this.ctVal, (Object) tradeListResp.ctVal) && Intrinsics.EZpvd((Object) this.cycleId, (Object) tradeListResp.cycleId) && Intrinsics.EZpvd((Object) this.dcaOrdType, (Object) tradeListResp.dcaOrdType) && Intrinsics.EZpvd((Object) this.displayId, (Object) tradeListResp.displayId) && Intrinsics.EZpvd((Object) this.endTime, (Object) tradeListResp.endTime) && Intrinsics.EZpvd((Object) this.errCode, (Object) tradeListResp.errCode) && Intrinsics.EZpvd((Object) this.fee, (Object) tradeListResp.fee) && Intrinsics.EZpvd((Object) this.feeCcy, (Object) tradeListResp.feeCcy) && Intrinsics.EZpvd((Object) this.feeType, (Object) tradeListResp.feeType) && Intrinsics.EZpvd((Object) this.groupId, (Object) tradeListResp.groupId) && Intrinsics.EZpvd((Object) this.instId, (Object) tradeListResp.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) tradeListResp.instType) && Intrinsics.EZpvd((Object) this.ip, (Object) tradeListResp.ip) && Intrinsics.EZpvd((Object) this.lever, (Object) tradeListResp.lever) && Intrinsics.EZpvd((Object) this.mgnCcy, (Object) tradeListResp.mgnCcy) && Intrinsics.EZpvd((Object) this.ordId, (Object) tradeListResp.ordId) && Intrinsics.EZpvd((Object) this.ordType, (Object) tradeListResp.ordType) && Intrinsics.EZpvd((Object) this.orderTag, (Object) tradeListResp.orderTag) && Intrinsics.EZpvd((Object) this.planPrice, (Object) tradeListResp.planPrice) && Intrinsics.EZpvd((Object) this.pnl, (Object) tradeListResp.pnl) && Intrinsics.EZpvd((Object) this.pnlCcy, (Object) tradeListResp.pnlCcy) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) tradeListResp.pnlRatio) && Intrinsics.EZpvd((Object) this.posSide, (Object) tradeListResp.posSide) && Intrinsics.EZpvd((Object) this.px, (Object) tradeListResp.px) && Intrinsics.EZpvd((Object) this.quoteFee, (Object) tradeListResp.quoteFee) && Intrinsics.EZpvd((Object) this.rebate, (Object) tradeListResp.rebate) && Intrinsics.EZpvd((Object) this.rebateCcy, (Object) tradeListResp.rebateCcy) && Intrinsics.EZpvd((Object) this.reduceOnly, (Object) tradeListResp.reduceOnly) && Intrinsics.EZpvd((Object) this.sid, (Object) tradeListResp.sid) && Intrinsics.EZpvd((Object) this.side, (Object) tradeListResp.side) && Intrinsics.EZpvd((Object) this.source, (Object) tradeListResp.source) && Intrinsics.EZpvd((Object) this.startTime, (Object) tradeListResp.startTime) && Intrinsics.EZpvd((Object) this.state, (Object) tradeListResp.state) && Intrinsics.EZpvd((Object) this.systemType, (Object) tradeListResp.systemType) && Intrinsics.EZpvd((Object) this.sz, (Object) tradeListResp.sz) && Intrinsics.EZpvd((Object) this.tag, (Object) tradeListResp.tag) && Intrinsics.EZpvd((Object) this.tdMode, (Object) tradeListResp.tdMode) && Intrinsics.EZpvd((Object) this.tradeQuoteCcy, (Object) tradeListResp.tradeQuoteCcy) && Intrinsics.EZpvd((Object) this.uTime, (Object) tradeListResp.uTime) && Intrinsics.EZpvd((Object) this.strategyOrderType, (Object) tradeListResp.strategyOrderType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.orderTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accFillSz.hashCode();
        int iHashCode2 = this.algoClOrdId.hashCode();
        int iHashCode3 = this.algoOrdType.hashCode();
        int iHashCode4 = this.arbOrdType.hashCode();
        int iHashCode5 = this.avgPx.hashCode();
        int iHashCode6 = this.baseFee.hashCode();
        int iHashCode7 = this.batchId.hashCode();
        int iHashCode8 = this.cTime.hashCode();
        int iHashCode9 = this.cancelSource.hashCode();
        int iHashCode10 = this.cancelTime.hashCode();
        int iHashCode11 = this.ccy.hashCode();
        int iHashCode12 = this.clientOrdId.hashCode();
        ContractDcaExtendInfo contractDcaExtendInfo = this.contractDcaExtendInfo;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (contractDcaExtendInfo == null ? 0 : contractDcaExtendInfo.hashCode())) * 31) + this.ctVal.hashCode()) * 31) + this.cycleId.hashCode()) * 31) + this.dcaOrdType.hashCode()) * 31) + this.displayId.hashCode()) * 31) + this.endTime.hashCode()) * 31) + this.errCode.hashCode()) * 31) + this.fee.hashCode()) * 31) + this.feeCcy.hashCode()) * 31) + this.feeType.hashCode()) * 31) + this.groupId.hashCode()) * 31) + this.instId.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.ip.hashCode()) * 31) + this.lever.hashCode()) * 31) + this.mgnCcy.hashCode()) * 31) + this.ordId.hashCode()) * 31) + this.ordType.hashCode()) * 31) + this.orderTag.hashCode()) * 31) + this.planPrice.hashCode()) * 31) + this.pnl.hashCode()) * 31) + this.pnlCcy.hashCode()) * 31) + this.pnlRatio.hashCode()) * 31) + this.posSide.hashCode()) * 31) + this.px.hashCode()) * 31) + this.quoteFee.hashCode()) * 31) + this.rebate.hashCode()) * 31) + this.rebateCcy.hashCode()) * 31) + this.reduceOnly.hashCode()) * 31) + this.sid.hashCode()) * 31) + this.side.hashCode()) * 31) + this.source.hashCode()) * 31) + this.startTime.hashCode()) * 31) + this.state.hashCode()) * 31) + this.systemType.hashCode()) * 31) + this.sz.hashCode()) * 31) + this.tag.hashCode()) * 31) + this.tdMode.hashCode()) * 31) + this.tradeQuoteCcy.hashCode()) * 31) + this.uTime.hashCode()) * 31) + this.strategyOrderType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeListResp(accFillSz=" + this.accFillSz + ", algoClOrdId=" + this.algoClOrdId + ", algoOrdType=" + this.algoOrdType + ", arbOrdType=" + this.arbOrdType + ", avgPx=" + this.avgPx + ", baseFee=" + this.baseFee + ", batchId=" + this.batchId + ", cTime=" + this.cTime + ", cancelSource=" + this.cancelSource + ", cancelTime=" + this.cancelTime + ", ccy=" + this.ccy + ", clientOrdId=" + this.clientOrdId + ", contractDcaExtendInfo=" + this.contractDcaExtendInfo + ", ctVal=" + this.ctVal + ", cycleId=" + this.cycleId + ", dcaOrdType=" + this.dcaOrdType + ", displayId=" + this.displayId + ", endTime=" + this.endTime + ", errCode=" + this.errCode + ", fee=" + this.fee + ", feeCcy=" + this.feeCcy + ", feeType=" + this.feeType + ", groupId=" + this.groupId + ", instId=" + this.instId + ", instType=" + this.instType + ", ip=" + this.ip + ", lever=" + this.lever + ", mgnCcy=" + this.mgnCcy + ", ordId=" + this.ordId + ", ordType=" + this.ordType + ", orderTag=" + this.orderTag + ", planPrice=" + this.planPrice + ", pnl=" + this.pnl + ", pnlCcy=" + this.pnlCcy + ", pnlRatio=" + this.pnlRatio + ", posSide=" + this.posSide + ", px=" + this.px + ", quoteFee=" + this.quoteFee + ", rebate=" + this.rebate + ", rebateCcy=" + this.rebateCcy + ", reduceOnly=" + this.reduceOnly + ", sid=" + this.sid + ", side=" + this.side + ", source=" + this.source + ", startTime=" + this.startTime + ", state=" + this.state + ", systemType=" + this.systemType + ", sz=" + this.sz + ", tag=" + this.tag + ", tdMode=" + this.tdMode + ", tradeQuoteCcy=" + this.tradeQuoteCcy + ", uTime=" + this.uTime + ", strategyOrderType=" + this.strategyOrderType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.posSide;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.TradeListResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeListResp> serializer() {
            return TradeListResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeListResp(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ContractDcaExtendInfo contractDcaExtendInfo, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accFillSz = "";
        } else {
            this.accFillSz = str;
        }
        if ((i & 2) == 0) {
            this.algoClOrdId = "";
        } else {
            this.algoClOrdId = str2;
        }
        if ((i & 4) == 0) {
            this.algoOrdType = "";
        } else {
            this.algoOrdType = str3;
        }
        if ((i & 8) == 0) {
            this.arbOrdType = "";
        } else {
            this.arbOrdType = str4;
        }
        if ((i & 16) == 0) {
            this.avgPx = "";
        } else {
            this.avgPx = str5;
        }
        if ((i & 32) == 0) {
            this.baseFee = "";
        } else {
            this.baseFee = str6;
        }
        if ((i & 64) == 0) {
            this.batchId = "";
        } else {
            this.batchId = str7;
        }
        if ((i & 128) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str8;
        }
        if ((i & 256) == 0) {
            this.cancelSource = "";
        } else {
            this.cancelSource = str9;
        }
        if ((i & 512) == 0) {
            this.cancelTime = "";
        } else {
            this.cancelTime = str10;
        }
        if ((i & 1024) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str11;
        }
        if ((i & 2048) == 0) {
            this.clientOrdId = "";
        } else {
            this.clientOrdId = str12;
        }
        this.contractDcaExtendInfo = (i & 4096) == 0 ? null : contractDcaExtendInfo;
        if ((i & 8192) == 0) {
            this.ctVal = "";
        } else {
            this.ctVal = str13;
        }
        if ((i & 16384) == 0) {
            this.cycleId = "";
        } else {
            this.cycleId = str14;
        }
        if ((i & 32768) == 0) {
            this.dcaOrdType = "";
        } else {
            this.dcaOrdType = str15;
        }
        if ((i & 65536) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str16;
        }
        if ((i & 131072) == 0) {
            this.endTime = "";
        } else {
            this.endTime = str17;
        }
        if ((i & 262144) == 0) {
            this.errCode = "";
        } else {
            this.errCode = str18;
        }
        if ((i & 524288) == 0) {
            this.fee = "";
        } else {
            this.fee = str19;
        }
        if ((i & 1048576) == 0) {
            this.feeCcy = "";
        } else {
            this.feeCcy = str20;
        }
        if ((2097152 & i) == 0) {
            this.feeType = "";
        } else {
            this.feeType = str21;
        }
        if ((4194304 & i) == 0) {
            this.groupId = "";
        } else {
            this.groupId = str22;
        }
        if ((8388608 & i) == 0) {
            this.instId = "";
        } else {
            this.instId = str23;
        }
        if ((16777216 & i) == 0) {
            this.instType = "";
        } else {
            this.instType = str24;
        }
        if ((33554432 & i) == 0) {
            this.ip = "";
        } else {
            this.ip = str25;
        }
        if ((67108864 & i) == 0) {
            this.lever = "";
        } else {
            this.lever = str26;
        }
        if ((134217728 & i) == 0) {
            this.mgnCcy = "";
        } else {
            this.mgnCcy = str27;
        }
        if ((268435456 & i) == 0) {
            this.ordId = "";
        } else {
            this.ordId = str28;
        }
        if ((536870912 & i) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str29;
        }
        if ((1073741824 & i) == 0) {
            this.orderTag = "";
        } else {
            this.orderTag = str30;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.planPrice = "";
        } else {
            this.planPrice = str31;
        }
        if ((i2 & 1) == 0) {
            this.pnl = "";
        } else {
            this.pnl = str32;
        }
        if ((i2 & 2) == 0) {
            this.pnlCcy = "";
        } else {
            this.pnlCcy = str33;
        }
        if ((i2 & 4) == 0) {
            this.pnlRatio = "";
        } else {
            this.pnlRatio = str34;
        }
        if ((i2 & 8) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str35;
        }
        if ((i2 & 16) == 0) {
            this.px = "";
        } else {
            this.px = str36;
        }
        if ((i2 & 32) == 0) {
            this.quoteFee = "";
        } else {
            this.quoteFee = str37;
        }
        if ((i2 & 64) == 0) {
            this.rebate = "";
        } else {
            this.rebate = str38;
        }
        if ((i2 & 128) == 0) {
            this.rebateCcy = "";
        } else {
            this.rebateCcy = str39;
        }
        if ((i2 & 256) == 0) {
            this.reduceOnly = "";
        } else {
            this.reduceOnly = str40;
        }
        if ((i2 & 512) == 0) {
            this.sid = "";
        } else {
            this.sid = str41;
        }
        if ((i2 & 1024) == 0) {
            this.side = "";
        } else {
            this.side = str42;
        }
        if ((i2 & 2048) == 0) {
            this.source = "";
        } else {
            this.source = str43;
        }
        if ((i2 & 4096) == 0) {
            this.startTime = "";
        } else {
            this.startTime = str44;
        }
        if ((i2 & 8192) == 0) {
            this.state = "";
        } else {
            this.state = str45;
        }
        if ((i2 & 16384) == 0) {
            this.systemType = "";
        } else {
            this.systemType = str46;
        }
        if ((i2 & 32768) == 0) {
            this.sz = "";
        } else {
            this.sz = str47;
        }
        if ((i2 & 65536) == 0) {
            this.tag = "";
        } else {
            this.tag = str48;
        }
        if ((i2 & 131072) == 0) {
            this.tdMode = "";
        } else {
            this.tdMode = str49;
        }
        if ((i2 & 262144) == 0) {
            this.tradeQuoteCcy = "";
        } else {
            this.tradeQuoteCcy = str50;
        }
        if ((i2 & 524288) == 0) {
            this.uTime = "";
        } else {
            this.uTime = str51;
        }
        if ((i2 & 1048576) == 0) {
            this.strategyOrderType = "";
        } else {
            this.strategyOrderType = str52;
        }
    }

    public static final /* synthetic */ void OLrzqt(TradeListResp tradeListResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradeListResp.accFillSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeListResp.accFillSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradeListResp.algoClOrdId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeListResp.algoClOrdId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tradeListResp.algoOrdType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tradeListResp.algoOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tradeListResp.arbOrdType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tradeListResp.arbOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tradeListResp.avgPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tradeListResp.avgPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tradeListResp.baseFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tradeListResp.baseFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tradeListResp.batchId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tradeListResp.batchId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tradeListResp.cTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tradeListResp.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tradeListResp.cancelSource, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, tradeListResp.cancelSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tradeListResp.cancelTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tradeListResp.cancelTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tradeListResp.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, tradeListResp.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tradeListResp.clientOrdId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tradeListResp.clientOrdId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || tradeListResp.contractDcaExtendInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, ContractDcaExtendInfo$$serializer.INSTANCE, tradeListResp.contractDcaExtendInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) tradeListResp.ctVal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, tradeListResp.ctVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) tradeListResp.cycleId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, tradeListResp.cycleId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) tradeListResp.dcaOrdType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, tradeListResp.dcaOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) tradeListResp.displayId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, tradeListResp.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) tradeListResp.endTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, tradeListResp.endTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) tradeListResp.errCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, tradeListResp.errCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) tradeListResp.fee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, tradeListResp.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) tradeListResp.feeCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, tradeListResp.feeCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) tradeListResp.feeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, tradeListResp.feeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) tradeListResp.groupId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, tradeListResp.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) tradeListResp.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, tradeListResp.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) tradeListResp.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, tradeListResp.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) tradeListResp.ip, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, tradeListResp.ip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) tradeListResp.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, tradeListResp.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) tradeListResp.mgnCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, tradeListResp.mgnCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) tradeListResp.ordId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, tradeListResp.ordId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) tradeListResp.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, tradeListResp.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) tradeListResp.orderTag, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, tradeListResp.orderTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) tradeListResp.planPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, tradeListResp.planPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) tradeListResp.pnl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, tradeListResp.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) tradeListResp.pnlCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, tradeListResp.pnlCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) tradeListResp.pnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, tradeListResp.pnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) tradeListResp.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, tradeListResp.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) tradeListResp.px, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, tradeListResp.px);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) tradeListResp.quoteFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, tradeListResp.quoteFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) tradeListResp.rebate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, tradeListResp.rebate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) tradeListResp.rebateCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, tradeListResp.rebateCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) tradeListResp.reduceOnly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, tradeListResp.reduceOnly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) tradeListResp.sid, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, tradeListResp.sid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) tradeListResp.side, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, tradeListResp.side);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) tradeListResp.source, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, tradeListResp.source);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) tradeListResp.startTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, tradeListResp.startTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) tradeListResp.state, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, tradeListResp.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) tradeListResp.systemType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 46, tradeListResp.systemType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd((Object) tradeListResp.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 47, tradeListResp.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) tradeListResp.tag, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 48, tradeListResp.tag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) tradeListResp.tdMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 49, tradeListResp.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || !Intrinsics.EZpvd((Object) tradeListResp.tradeQuoteCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 50, tradeListResp.tradeQuoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd((Object) tradeListResp.uTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 51, tradeListResp.uTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) && Intrinsics.EZpvd((Object) tradeListResp.strategyOrderType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 52, tradeListResp.strategyOrderType);
    }

    public TradeListResp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, ContractDcaExtendInfo contractDcaExtendInfo, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, @NotNull String str51, @NotNull String str52) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str51, "");
        Intrinsics.checkNotNullParameter(str52, "");
        this.accFillSz = str;
        this.algoClOrdId = str2;
        this.algoOrdType = str3;
        this.arbOrdType = str4;
        this.avgPx = str5;
        this.baseFee = str6;
        this.batchId = str7;
        this.cTime = str8;
        this.cancelSource = str9;
        this.cancelTime = str10;
        this.ccy = str11;
        this.clientOrdId = str12;
        this.contractDcaExtendInfo = contractDcaExtendInfo;
        this.ctVal = str13;
        this.cycleId = str14;
        this.dcaOrdType = str15;
        this.displayId = str16;
        this.endTime = str17;
        this.errCode = str18;
        this.fee = str19;
        this.feeCcy = str20;
        this.feeType = str21;
        this.groupId = str22;
        this.instId = str23;
        this.instType = str24;
        this.ip = str25;
        this.lever = str26;
        this.mgnCcy = str27;
        this.ordId = str28;
        this.ordType = str29;
        this.orderTag = str30;
        this.planPrice = str31;
        this.pnl = str32;
        this.pnlCcy = str33;
        this.pnlRatio = str34;
        this.posSide = str35;
        this.px = str36;
        this.quoteFee = str37;
        this.rebate = str38;
        this.rebateCcy = str39;
        this.reduceOnly = str40;
        this.sid = str41;
        this.side = str42;
        this.source = str43;
        this.startTime = str44;
        this.state = str45;
        this.systemType = str46;
        this.sz = str47;
        this.tag = str48;
        this.tdMode = str49;
        this.tradeQuoteCcy = str50;
        this.uTime = str51;
        this.strategyOrderType = str52;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0279: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r107v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r107v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r107v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r107v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r107v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r107v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r107v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r107v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r107v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r107v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r107v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r107v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:com.okinc.tradingbot.impl.dto.ContractDcaExtendInfo:?: TERNARY null = ((wrap:int:0x0066: ARITH (r107v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.tradingbot.impl.dto.ContractDcaExtendInfo) : (r66v0 com.okinc.tradingbot.impl.dto.ContractDcaExtendInfo))
  (wrap:java.lang.String:0x0079: TERNARY null = ((wrap:int:0x0070: ARITH (r107v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (r107v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (r107v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0092: ARITH (r107v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009d: ARITH (r107v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a8: ARITH (r107v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r107v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00be: ARITH (r107v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c9: ARITH (r107v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d4: ARITH (r107v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00df: ARITH (r107v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ea: ARITH (r107v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f5: ARITH (r107v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0100: ARITH (r107v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010b: ARITH (r107v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0116: ARITH (r107v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r82v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0121: ARITH (r107v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r83v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012c: ARITH (r107v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r84v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0137: ARITH (r107v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r85v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0140: ARITH (r108v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r86v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0149: ARITH (r108v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r87v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0152: ARITH (r108v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r88v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015b: ARITH (r108v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0164: ARITH (r108v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r90v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x016d: ARITH (r108v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r91v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0176: ARITH (r108v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r92v0 java.lang.String))
  (wrap:java.lang.String:0x018a: TERNARY null = ((wrap:int:0x0181: ARITH (r108v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r93v0 java.lang.String))
  (wrap:java.lang.String:0x0195: TERNARY null = ((wrap:int:0x018c: ARITH (r108v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r94v0 java.lang.String))
  (wrap:java.lang.String:0x01a0: TERNARY null = ((wrap:int:0x0197: ARITH (r108v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r95v0 java.lang.String))
  (wrap:java.lang.String:0x01ab: TERNARY null = ((wrap:int:0x01a2: ARITH (r108v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r96v0 java.lang.String))
  (wrap:java.lang.String:0x01b6: TERNARY null = ((wrap:int:0x01ad: ARITH (r108v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r97v0 java.lang.String))
  (wrap:java.lang.String:0x01c1: TERNARY null = ((wrap:int:0x01b8: ARITH (r108v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r98v0 java.lang.String))
  (wrap:java.lang.String:0x01cc: TERNARY null = ((wrap:int:0x01c3: ARITH (r108v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r99v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01ce: ARITH (r108v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r100v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01d7: ARITH (r108v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r101v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01e0: ARITH (r108v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r102v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01e9: ARITH (r108v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r103v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01f2: ARITH (r108v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r104v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01fb: ARITH (r108v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r105v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0204: ARITH (r108v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r106v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.tradingbot.impl.dto.ContractDcaExtendInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.tradingbot.impl.dto.TradeListResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.tradingbot.impl.dto.ContractDcaExtendInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TradeListResp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ContractDcaExtendInfo contractDcaExtendInfo, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? null : contractDcaExtendInfo, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) != 0 ? "" : str16, (i & 131072) != 0 ? "" : str17, (i & 262144) != 0 ? "" : str18, (i & 524288) != 0 ? "" : str19, (i & 1048576) != 0 ? "" : str20, (i & 2097152) != 0 ? "" : str21, (i & 4194304) != 0 ? "" : str22, (i & 8388608) != 0 ? "" : str23, (i & 16777216) != 0 ? "" : str24, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str25, (i & 67108864) != 0 ? "" : str26, (i & 134217728) != 0 ? "" : str27, (i & 268435456) != 0 ? "" : str28, (i & 536870912) != 0 ? "" : str29, (i & 1073741824) != 0 ? "" : str30, (i & Integer.MIN_VALUE) != 0 ? "" : str31, (i2 & 1) != 0 ? "" : str32, (i2 & 2) != 0 ? "" : str33, (i2 & 4) != 0 ? "" : str34, (i2 & 8) != 0 ? "" : str35, (i2 & 16) != 0 ? "" : str36, (i2 & 32) != 0 ? "" : str37, (i2 & 64) != 0 ? "" : str38, (i2 & 128) != 0 ? "" : str39, (i2 & 256) != 0 ? "" : str40, (i2 & 512) != 0 ? "" : str41, (i2 & 1024) != 0 ? "" : str42, (i2 & 2048) != 0 ? "" : str43, (i2 & 4096) != 0 ? "" : str44, (i2 & 8192) != 0 ? "" : str45, (i2 & 16384) != 0 ? "" : str46, (i2 & 32768) != 0 ? "" : str47, (i2 & 65536) != 0 ? "" : str48, (i2 & 131072) != 0 ? "" : str49, (i2 & 262144) != 0 ? "" : str50, (i2 & 524288) != 0 ? "" : str51, (i2 & 1048576) != 0 ? "" : str52);
    }
}
