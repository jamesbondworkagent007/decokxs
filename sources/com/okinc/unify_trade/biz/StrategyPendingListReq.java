package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public class StrategyPendingListReq {
    private String after;
    private String algoId;
    private String baseCoins;
    private String before;
    private String end;
    private String instDirection;
    private String instId;
    private String instType;
    private boolean isCurrentPair;
    private boolean isSms;
    private String limit;
    private String nmpUnderlyingIds;
    private String ordType;
    private String posOrSide;
    private String referName;
    private boolean requireProfits;
    private String sortOrder;
    private String sortType;
    private String source;
    private String start;
    private String systemSource;
    private String tdMode;
    private String tradeId;
    private String tradeSide;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAfter() {
        return this.after;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCoins() {
        return this.baseCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBefore() {
        return this.before;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnd() {
        return this.end;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstDirection() {
        return this.instDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNmpUnderlyingIds() {
        return this.nmpUnderlyingIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosOrSide() {
        return this.posOrSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferName() {
        return this.referName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRequireProfits() {
        return this.requireProfits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSortOrder() {
        return this.sortOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSortType() {
        return this.sortType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStart() {
        return this.start;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSystemSource() {
        return this.systemSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeId() {
        return this.tradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeSide() {
        return this.tradeSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCurrentPair() {
        return this.isCurrentPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSms() {
        return this.isSms;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAfter(String str) {
        this.after = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(String str) {
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCoins(String str) {
        this.baseCoins = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBefore(String str) {
        this.before = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentPair(boolean z) {
        this.isCurrentPair = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnd(String str) {
        this.end = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstDirection(String str) {
        this.instDirection = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(String str) {
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(String str) {
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLimit(String str) {
        this.limit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNmpUnderlyingIds(String str) {
        this.nmpUnderlyingIds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosOrSide(String str) {
        this.posOrSide = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReferName(String str) {
        this.referName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRequireProfits(boolean z) {
        this.requireProfits = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSms(boolean z) {
        this.isSms = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSortOrder(String str) {
        this.sortOrder = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSortType(String str) {
        this.sortType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.source = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStart(String str) {
        this.start = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSystemSource(String str) {
        this.systemSource = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTdMode(String str) {
        this.tdMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeId(String str) {
        this.tradeId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeSide(String str) {
        this.tradeSide = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.StrategyPendingListReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StrategyPendingListReq> serializer() {
            return StrategyPendingListReq$$serializer.INSTANCE;
        }
    }

    public StrategyPendingListReq() {
        this.source = "3";
        this.ordType = "";
        this.requireProfits = true;
    }

    public /* synthetic */ StrategyPendingListReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, boolean z, boolean z2, String str18, boolean z3, String str19, String str20, String str21, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.algoId = null;
        } else {
            this.algoId = str;
        }
        if ((i & 2) == 0) {
            this.instType = null;
        } else {
            this.instType = str2;
        }
        if ((i & 4) == 0) {
            this.instId = null;
        } else {
            this.instId = str3;
        }
        if ((i & 8) == 0) {
            this.after = null;
        } else {
            this.after = str4;
        }
        if ((i & 16) == 0) {
            this.before = null;
        } else {
            this.before = str5;
        }
        if ((i & 32) == 0) {
            this.limit = null;
        } else {
            this.limit = str6;
        }
        if ((i & 64) == 0) {
            this.start = null;
        } else {
            this.start = str7;
        }
        if ((i & 128) == 0) {
            this.end = null;
        } else {
            this.end = str8;
        }
        if ((i & 256) == 0) {
            this.tdMode = null;
        } else {
            this.tdMode = str9;
        }
        if ((i & 512) == 0) {
            this.instDirection = null;
        } else {
            this.instDirection = str10;
        }
        if ((i & 1024) == 0) {
            this.posOrSide = null;
        } else {
            this.posOrSide = str11;
        }
        if ((i & 2048) == 0) {
            this.referName = null;
        } else {
            this.referName = str12;
        }
        if ((i & 4096) == 0) {
            this.sortType = null;
        } else {
            this.sortType = str13;
        }
        this.source = (i & 8192) == 0 ? "3" : str14;
        this.ordType = (i & 16384) == 0 ? "" : str15;
        if ((32768 & i) == 0) {
            this.tradeId = null;
        } else {
            this.tradeId = str16;
        }
        if ((65536 & i) == 0) {
            this.tradeSide = null;
        } else {
            this.tradeSide = str17;
        }
        if ((131072 & i) == 0) {
            this.isCurrentPair = false;
        } else {
            this.isCurrentPair = z;
        }
        if ((262144 & i) == 0) {
            this.isSms = false;
        } else {
            this.isSms = z2;
        }
        if ((524288 & i) == 0) {
            this.systemSource = null;
        } else {
            this.systemSource = str18;
        }
        this.requireProfits = (1048576 & i) == 0 ? true : z3;
        if ((2097152 & i) == 0) {
            this.baseCoins = null;
        } else {
            this.baseCoins = str19;
        }
        if ((4194304 & i) == 0) {
            this.sortOrder = null;
        } else {
            this.sortOrder = str20;
        }
        if ((i & 8388608) == 0) {
            this.nmpUnderlyingIds = null;
        } else {
            this.nmpUnderlyingIds = str21;
        }
    }

    public static final /* synthetic */ void write$Self(StrategyPendingListReq strategyPendingListReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || strategyPendingListReq.algoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, strategyPendingListReq.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || strategyPendingListReq.instType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, strategyPendingListReq.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || strategyPendingListReq.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, strategyPendingListReq.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || strategyPendingListReq.after != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, strategyPendingListReq.after);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || strategyPendingListReq.before != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, strategyPendingListReq.before);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || strategyPendingListReq.limit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, strategyPendingListReq.limit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || strategyPendingListReq.start != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, strategyPendingListReq.start);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || strategyPendingListReq.end != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, strategyPendingListReq.end);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || strategyPendingListReq.tdMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, strategyPendingListReq.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || strategyPendingListReq.instDirection != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, strategyPendingListReq.instDirection);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || strategyPendingListReq.posOrSide != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, strategyPendingListReq.posOrSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || strategyPendingListReq.referName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, strategyPendingListReq.referName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || strategyPendingListReq.sortType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, strategyPendingListReq.sortType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) strategyPendingListReq.source, (Object) "3")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, strategyPendingListReq.source);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) strategyPendingListReq.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, strategyPendingListReq.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || strategyPendingListReq.tradeId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, strategyPendingListReq.tradeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || strategyPendingListReq.tradeSide != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, strategyPendingListReq.tradeSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || strategyPendingListReq.isCurrentPair) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 17, strategyPendingListReq.isCurrentPair);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || strategyPendingListReq.isSms) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 18, strategyPendingListReq.isSms);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || strategyPendingListReq.systemSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, strategyPendingListReq.systemSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !strategyPendingListReq.requireProfits) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 20, strategyPendingListReq.requireProfits);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || strategyPendingListReq.baseCoins != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, strategyPendingListReq.baseCoins);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || strategyPendingListReq.sortOrder != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, strategyPendingListReq.sortOrder);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) && strategyPendingListReq.nmpUnderlyingIds == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, strategyPendingListReq.nmpUnderlyingIds);
    }

    public String toString() {
        return "StrategyPendingListReq(algoId=" + this.algoId + ", instType=" + this.instType + ", instId=" + this.instId + ", after=" + this.after + ", before=" + this.before + ", limit=" + this.limit + ", start=" + this.start + ", end=" + this.end + ", tdMode=" + this.tdMode + ", instDirection=" + this.instDirection + ", posOrSide=" + this.posOrSide + ", referName=" + this.referName + ", sortType=" + this.sortType + ", source='" + this.source + "', ordType='" + this.ordType + "', tradeId='" + this.tradeId + "', tradeSide = '" + this.tradeSide + "'systemSource= '" + this.systemSource + "', nmpUnderlyingId = '" + this.nmpUnderlyingIds + "', requireProfits = '" + this.requireProfits + "')";
    }
}
