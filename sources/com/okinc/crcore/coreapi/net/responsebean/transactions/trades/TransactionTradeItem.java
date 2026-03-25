package com.okinc.crcore.coreapi.net.responsebean.transactions.trades;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class TransactionTradeItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String baseBal;
    private final String baseBalChg;
    private final String baseCcy;
    private final String basePosBal;
    private final String basePosBalChg;
    private final Long billId;
    private final String fee;
    private final String feeUnitSymbol;
    private final String fillTime;
    private final String from;
    private final String fromDesc;
    private final String instId;
    private final String instType;
    private final String mgnMode;
    private final String ordId;
    private final String pnl;
    private final String price;
    private final String quoteBal;
    private final String quoteBalChg;
    private final String quoteCcy;
    private final String quotePosBal;
    private final String quotePosBalChg;
    private final String sz;
    private final String title;
    private final String to;
    private final String toDesc;
    private final String ts;
    private final String type;
    private final String typeDesc;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionTradeItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 536870911, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.baseBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.fromDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.quoteBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.quoteBalChg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.quoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.quotePosBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.baseBalChg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.quotePosBalChg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.toDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.typeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.feeUnitSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.baseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.basePosBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.basePosBalChg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.billId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.fillTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionTradeItem copy(String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28) {
        return new TransactionTradeItem(str, str2, str3, str4, str5, l, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionTradeItem)) {
            return false;
        }
        TransactionTradeItem transactionTradeItem = (TransactionTradeItem) obj;
        return Intrinsics.EZpvd((Object) this.baseBal, (Object) transactionTradeItem.baseBal) && Intrinsics.EZpvd((Object) this.baseBalChg, (Object) transactionTradeItem.baseBalChg) && Intrinsics.EZpvd((Object) this.baseCcy, (Object) transactionTradeItem.baseCcy) && Intrinsics.EZpvd((Object) this.basePosBal, (Object) transactionTradeItem.basePosBal) && Intrinsics.EZpvd((Object) this.basePosBalChg, (Object) transactionTradeItem.basePosBalChg) && Intrinsics.EZpvd(this.billId, transactionTradeItem.billId) && Intrinsics.EZpvd((Object) this.fee, (Object) transactionTradeItem.fee) && Intrinsics.EZpvd((Object) this.fillTime, (Object) transactionTradeItem.fillTime) && Intrinsics.EZpvd((Object) this.from, (Object) transactionTradeItem.from) && Intrinsics.EZpvd((Object) this.fromDesc, (Object) transactionTradeItem.fromDesc) && Intrinsics.EZpvd((Object) this.instId, (Object) transactionTradeItem.instId) && Intrinsics.EZpvd((Object) this.mgnMode, (Object) transactionTradeItem.mgnMode) && Intrinsics.EZpvd((Object) this.ordId, (Object) transactionTradeItem.ordId) && Intrinsics.EZpvd((Object) this.pnl, (Object) transactionTradeItem.pnl) && Intrinsics.EZpvd((Object) this.price, (Object) transactionTradeItem.price) && Intrinsics.EZpvd((Object) this.quoteBal, (Object) transactionTradeItem.quoteBal) && Intrinsics.EZpvd((Object) this.quoteBalChg, (Object) transactionTradeItem.quoteBalChg) && Intrinsics.EZpvd((Object) this.quoteCcy, (Object) transactionTradeItem.quoteCcy) && Intrinsics.EZpvd((Object) this.quotePosBal, (Object) transactionTradeItem.quotePosBal) && Intrinsics.EZpvd((Object) this.quotePosBalChg, (Object) transactionTradeItem.quotePosBalChg) && Intrinsics.EZpvd((Object) this.sz, (Object) transactionTradeItem.sz) && Intrinsics.EZpvd((Object) this.title, (Object) transactionTradeItem.title) && Intrinsics.EZpvd((Object) this.to, (Object) transactionTradeItem.to) && Intrinsics.EZpvd((Object) this.toDesc, (Object) transactionTradeItem.toDesc) && Intrinsics.EZpvd((Object) this.ts, (Object) transactionTradeItem.ts) && Intrinsics.EZpvd((Object) this.type, (Object) transactionTradeItem.type) && Intrinsics.EZpvd((Object) this.typeDesc, (Object) transactionTradeItem.typeDesc) && Intrinsics.EZpvd((Object) this.instType, (Object) transactionTradeItem.instType) && Intrinsics.EZpvd((Object) this.feeUnitSymbol, (Object) transactionTradeItem.feeUnitSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseBal() {
        return this.baseBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseBalChg() {
        return this.baseBalChg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCcy() {
        return this.baseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBasePosBal() {
        return this.basePosBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBasePosBalChg() {
        return this.basePosBalChg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getBillId() {
        return this.billId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeUnitSymbol() {
        return this.feeUnitSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFillTime() {
        return this.fillTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromDesc() {
        return this.fromDesc;
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
    public final String getMgnMode() {
        return this.mgnMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteBal() {
        return this.quoteBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteBalChg() {
        return this.quoteBalChg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCcy() {
        return this.quoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuotePosBal() {
        return this.quotePosBal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuotePosBalChg() {
        return this.quotePosBalChg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToDesc() {
        return this.toDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTypeDesc() {
        return this.typeDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.baseBal;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.baseBalChg;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.baseCcy;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.basePosBal;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.basePosBalChg;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        Long l = this.billId;
        int iHashCode6 = l == null ? 0 : l.hashCode();
        String str6 = this.fee;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.fillTime;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.from;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.fromDesc;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.instId;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.mgnMode;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.ordId;
        int iHashCode13 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.pnl;
        int iHashCode14 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.price;
        int iHashCode15 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.quoteBal;
        int iHashCode16 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.quoteBalChg;
        int iHashCode17 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.quoteCcy;
        int iHashCode18 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.quotePosBal;
        int iHashCode19 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.quotePosBalChg;
        int iHashCode20 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.sz;
        int iHashCode21 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.title;
        int iHashCode22 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.to;
        int iHashCode23 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.toDesc;
        int iHashCode24 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.ts;
        int iHashCode25 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.type;
        int iHashCode26 = str25 == null ? 0 : str25.hashCode();
        String str26 = this.typeDesc;
        int iHashCode27 = str26 == null ? 0 : str26.hashCode();
        String str27 = this.instType;
        int iHashCode28 = str27 == null ? 0 : str27.hashCode();
        String str28 = this.feeUnitSymbol;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + (str28 == null ? 0 : str28.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionTradeItem(baseBal=" + this.baseBal + ", baseBalChg=" + this.baseBalChg + ", baseCcy=" + this.baseCcy + ", basePosBal=" + this.basePosBal + ", basePosBalChg=" + this.basePosBalChg + ", billId=" + this.billId + ", fee=" + this.fee + ", fillTime=" + this.fillTime + ", from=" + this.from + ", fromDesc=" + this.fromDesc + ", instId=" + this.instId + ", mgnMode=" + this.mgnMode + ", ordId=" + this.ordId + ", pnl=" + this.pnl + ", price=" + this.price + ", quoteBal=" + this.quoteBal + ", quoteBalChg=" + this.quoteBalChg + ", quoteCcy=" + this.quoteCcy + ", quotePosBal=" + this.quotePosBal + ", quotePosBalChg=" + this.quotePosBalChg + ", sz=" + this.sz + ", title=" + this.title + ", to=" + this.to + ", toDesc=" + this.toDesc + ", ts=" + this.ts + ", type=" + this.type + ", typeDesc=" + this.typeDesc + ", instType=" + this.instType + ", feeUnitSymbol=" + this.feeUnitSymbol + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.transactions.trades.TransactionTradeItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TransactionTradeItem> serializer() {
            return TransactionTradeItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TransactionTradeItem(int i, String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseBal = null;
        } else {
            this.baseBal = str;
        }
        if ((i & 2) == 0) {
            this.baseBalChg = null;
        } else {
            this.baseBalChg = str2;
        }
        if ((i & 4) == 0) {
            this.baseCcy = null;
        } else {
            this.baseCcy = str3;
        }
        if ((i & 8) == 0) {
            this.basePosBal = null;
        } else {
            this.basePosBal = str4;
        }
        if ((i & 16) == 0) {
            this.basePosBalChg = null;
        } else {
            this.basePosBalChg = str5;
        }
        if ((i & 32) == 0) {
            this.billId = null;
        } else {
            this.billId = l;
        }
        if ((i & 64) == 0) {
            this.fee = null;
        } else {
            this.fee = str6;
        }
        if ((i & 128) == 0) {
            this.fillTime = null;
        } else {
            this.fillTime = str7;
        }
        if ((i & 256) == 0) {
            this.from = null;
        } else {
            this.from = str8;
        }
        if ((i & 512) == 0) {
            this.fromDesc = null;
        } else {
            this.fromDesc = str9;
        }
        if ((i & 1024) == 0) {
            this.instId = null;
        } else {
            this.instId = str10;
        }
        if ((i & 2048) == 0) {
            this.mgnMode = null;
        } else {
            this.mgnMode = str11;
        }
        if ((i & 4096) == 0) {
            this.ordId = null;
        } else {
            this.ordId = str12;
        }
        if ((i & 8192) == 0) {
            this.pnl = null;
        } else {
            this.pnl = str13;
        }
        if ((i & 16384) == 0) {
            this.price = null;
        } else {
            this.price = str14;
        }
        if ((32768 & i) == 0) {
            this.quoteBal = null;
        } else {
            this.quoteBal = str15;
        }
        if ((65536 & i) == 0) {
            this.quoteBalChg = null;
        } else {
            this.quoteBalChg = str16;
        }
        if ((131072 & i) == 0) {
            this.quoteCcy = null;
        } else {
            this.quoteCcy = str17;
        }
        if ((262144 & i) == 0) {
            this.quotePosBal = null;
        } else {
            this.quotePosBal = str18;
        }
        if ((524288 & i) == 0) {
            this.quotePosBalChg = null;
        } else {
            this.quotePosBalChg = str19;
        }
        if ((1048576 & i) == 0) {
            this.sz = null;
        } else {
            this.sz = str20;
        }
        if ((2097152 & i) == 0) {
            this.title = null;
        } else {
            this.title = str21;
        }
        if ((4194304 & i) == 0) {
            this.to = null;
        } else {
            this.to = str22;
        }
        if ((8388608 & i) == 0) {
            this.toDesc = null;
        } else {
            this.toDesc = str23;
        }
        if ((16777216 & i) == 0) {
            this.ts = null;
        } else {
            this.ts = str24;
        }
        if ((33554432 & i) == 0) {
            this.type = null;
        } else {
            this.type = str25;
        }
        if ((67108864 & i) == 0) {
            this.typeDesc = null;
        } else {
            this.typeDesc = str26;
        }
        if ((134217728 & i) == 0) {
            this.instType = null;
        } else {
            this.instType = str27;
        }
        if ((i & 268435456) == 0) {
            this.feeUnitSymbol = null;
        } else {
            this.feeUnitSymbol = str28;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(TransactionTradeItem transactionTradeItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || transactionTradeItem.baseBal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, transactionTradeItem.baseBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || transactionTradeItem.baseBalChg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, transactionTradeItem.baseBalChg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || transactionTradeItem.baseCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, transactionTradeItem.baseCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || transactionTradeItem.basePosBal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, transactionTradeItem.basePosBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || transactionTradeItem.basePosBalChg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, transactionTradeItem.basePosBalChg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || transactionTradeItem.billId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, transactionTradeItem.billId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || transactionTradeItem.fee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, transactionTradeItem.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || transactionTradeItem.fillTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, transactionTradeItem.fillTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || transactionTradeItem.from != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, transactionTradeItem.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || transactionTradeItem.fromDesc != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, transactionTradeItem.fromDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || transactionTradeItem.instId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, transactionTradeItem.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || transactionTradeItem.mgnMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, transactionTradeItem.mgnMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || transactionTradeItem.ordId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, transactionTradeItem.ordId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || transactionTradeItem.pnl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, transactionTradeItem.pnl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || transactionTradeItem.price != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, transactionTradeItem.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || transactionTradeItem.quoteBal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, transactionTradeItem.quoteBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || transactionTradeItem.quoteBalChg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, transactionTradeItem.quoteBalChg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || transactionTradeItem.quoteCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, transactionTradeItem.quoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || transactionTradeItem.quotePosBal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, transactionTradeItem.quotePosBal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || transactionTradeItem.quotePosBalChg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, transactionTradeItem.quotePosBalChg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || transactionTradeItem.sz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, transactionTradeItem.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || transactionTradeItem.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, transactionTradeItem.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || transactionTradeItem.to != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, transactionTradeItem.to);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || transactionTradeItem.toDesc != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, transactionTradeItem.toDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || transactionTradeItem.ts != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, transactionTradeItem.ts);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || transactionTradeItem.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, transactionTradeItem.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || transactionTradeItem.typeDesc != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, transactionTradeItem.typeDesc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || transactionTradeItem.instType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, StringSerializer.INSTANCE, transactionTradeItem.instType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) && transactionTradeItem.feeUnitSymbol == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, transactionTradeItem.feeUnitSymbol);
    }

    public TransactionTradeItem(String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28) {
        this.baseBal = str;
        this.baseBalChg = str2;
        this.baseCcy = str3;
        this.basePosBal = str4;
        this.basePosBalChg = str5;
        this.billId = l;
        this.fee = str6;
        this.fillTime = str7;
        this.from = str8;
        this.fromDesc = str9;
        this.instId = str10;
        this.mgnMode = str11;
        this.ordId = str12;
        this.pnl = str13;
        this.price = str14;
        this.quoteBal = str15;
        this.quoteBalChg = str16;
        this.quoteCcy = str17;
        this.quotePosBal = str18;
        this.quotePosBalChg = str19;
        this.sz = str20;
        this.title = str21;
        this.to = str22;
        this.toDesc = str23;
        this.ts = str24;
        this.type = str25;
        this.typeDesc = str26;
        this.instType = str27;
        this.feeUnitSymbol = str28;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0150: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r60v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r60v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r60v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r60v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r60v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x002a: ARITH (r60v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r36v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r60v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r60v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r60v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r60v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r60v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r60v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r60v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r60v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r60v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r60v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r60v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r60v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r60v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r60v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r60v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r60v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r60v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r60v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r60v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00eb: ARITH (r60v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f6: ARITH (r60v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0101: ARITH (r60v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010c: ARITH (r60v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.transactions.trades.TransactionTradeItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TransactionTradeItem(String str, String str2, String str3, String str4, String str5, Long l, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16, (i & 131072) != 0 ? null : str17, (i & 262144) != 0 ? null : str18, (i & 524288) != 0 ? null : str19, (i & 1048576) != 0 ? null : str20, (i & 2097152) != 0 ? null : str21, (i & 4194304) != 0 ? null : str22, (i & 8388608) != 0 ? null : str23, (i & 16777216) != 0 ? null : str24, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str25, (i & 67108864) != 0 ? null : str26, (i & 134217728) != 0 ? null : str27, (i & 268435456) != 0 ? null : str28);
    }
}
