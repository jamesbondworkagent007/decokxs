package com.okinc.tradeapi.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class OuterTickersData {
    private String askPx;
    private String askSz;
    private String bidPx;
    private String bidSz;
    private String ccy;
    private String high24h;
    private String instId;
    private String instType;
    private String last;
    private String lastSz;
    private String low24h;
    private String open24h;
    private String sodUtc0;
    private String sodUtc8;
    private String ts;
    private String vol24h;
    private String volCcy24h;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OuterTickersData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.sodUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.sodUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.high24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.low24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.volCcy24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.vol24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.lastSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.askPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.askSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.bidPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.bidSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.open24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OuterTickersData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, String str6, String str7, String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        return new OuterTickersData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OuterTickersData)) {
            return false;
        }
        OuterTickersData outerTickersData = (OuterTickersData) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) outerTickersData.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) outerTickersData.instId) && Intrinsics.EZpvd((Object) this.last, (Object) outerTickersData.last) && Intrinsics.EZpvd((Object) this.lastSz, (Object) outerTickersData.lastSz) && Intrinsics.EZpvd((Object) this.askPx, (Object) outerTickersData.askPx) && Intrinsics.EZpvd((Object) this.askSz, (Object) outerTickersData.askSz) && Intrinsics.EZpvd((Object) this.bidPx, (Object) outerTickersData.bidPx) && Intrinsics.EZpvd((Object) this.bidSz, (Object) outerTickersData.bidSz) && Intrinsics.EZpvd((Object) this.open24h, (Object) outerTickersData.open24h) && Intrinsics.EZpvd((Object) this.sodUtc0, (Object) outerTickersData.sodUtc0) && Intrinsics.EZpvd((Object) this.sodUtc8, (Object) outerTickersData.sodUtc8) && Intrinsics.EZpvd((Object) this.high24h, (Object) outerTickersData.high24h) && Intrinsics.EZpvd((Object) this.low24h, (Object) outerTickersData.low24h) && Intrinsics.EZpvd((Object) this.volCcy24h, (Object) outerTickersData.volCcy24h) && Intrinsics.EZpvd((Object) this.vol24h, (Object) outerTickersData.vol24h) && Intrinsics.EZpvd((Object) this.ccy, (Object) outerTickersData.ccy) && Intrinsics.EZpvd((Object) this.ts, (Object) outerTickersData.ts);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAskPx() {
        return this.askPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAskSz() {
        return this.askSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBidPx() {
        return this.bidPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBidSz() {
        return this.bidSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHigh24h() {
        return this.high24h;
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
    public final String getLast() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastSz() {
        return this.lastSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLow24h() {
        return this.low24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpen24h() {
        return this.open24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSodUtc0() {
        return this.sodUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSodUtc8() {
        return this.sodUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVol24h() {
        return this.vol24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolCcy24h() {
        return this.volCcy24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instType.hashCode();
        int iHashCode2 = this.instId.hashCode();
        int iHashCode3 = this.last.hashCode();
        int iHashCode4 = this.lastSz.hashCode();
        String str = this.askPx;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.askSz;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.bidPx;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.bidSz;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.open24h.hashCode()) * 31) + this.sodUtc0.hashCode()) * 31) + this.sodUtc8.hashCode()) * 31) + this.high24h.hashCode()) * 31) + this.low24h.hashCode()) * 31) + this.volCcy24h.hashCode()) * 31) + this.vol24h.hashCode()) * 31) + this.ccy.hashCode()) * 31) + this.ts.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAskPx(String str) {
        this.askPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAskSz(String str) {
        this.askSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBidPx(String str) {
        this.bidPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBidSz(String str) {
        this.bidSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHigh24h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.high24h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLast(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.last = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLastSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.lastSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLow24h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.low24h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpen24h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.open24h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSodUtc0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sodUtc0 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSodUtc8(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sodUtc8 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTs(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ts = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVol24h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.vol24h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVolCcy24h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.volCcy24h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OuterTickersData(instType=" + this.instType + ", instId=" + this.instId + ", last=" + this.last + ", lastSz=" + this.lastSz + ", askPx=" + this.askPx + ", askSz=" + this.askSz + ", bidPx=" + this.bidPx + ", bidSz=" + this.bidSz + ", open24h=" + this.open24h + ", sodUtc0=" + this.sodUtc0 + ", sodUtc8=" + this.sodUtc8 + ", high24h=" + this.high24h + ", low24h=" + this.low24h + ", volCcy24h=" + this.volCcy24h + ", vol24h=" + this.vol24h + ", ccy=" + this.ccy + ", ts=" + this.ts + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradeapi.bean.OuterTickersData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OuterTickersData> serializer() {
            return OuterTickersData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OuterTickersData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instType = "";
        } else {
            this.instType = str;
        }
        if ((i & 2) == 0) {
            this.instId = "";
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.last = "";
        } else {
            this.last = str3;
        }
        if ((i & 8) == 0) {
            this.lastSz = "";
        } else {
            this.lastSz = str4;
        }
        if ((i & 16) == 0) {
            this.askPx = "";
        } else {
            this.askPx = str5;
        }
        if ((i & 32) == 0) {
            this.askSz = "";
        } else {
            this.askSz = str6;
        }
        if ((i & 64) == 0) {
            this.bidPx = "";
        } else {
            this.bidPx = str7;
        }
        if ((i & 128) == 0) {
            this.bidSz = "";
        } else {
            this.bidSz = str8;
        }
        if ((i & 256) == 0) {
            this.open24h = "";
        } else {
            this.open24h = str9;
        }
        if ((i & 512) == 0) {
            this.sodUtc0 = "";
        } else {
            this.sodUtc0 = str10;
        }
        if ((i & 1024) == 0) {
            this.sodUtc8 = "";
        } else {
            this.sodUtc8 = str11;
        }
        if ((i & 2048) == 0) {
            this.high24h = "";
        } else {
            this.high24h = str12;
        }
        if ((i & 4096) == 0) {
            this.low24h = "";
        } else {
            this.low24h = str13;
        }
        if ((i & 8192) == 0) {
            this.volCcy24h = "";
        } else {
            this.volCcy24h = str14;
        }
        if ((i & 16384) == 0) {
            this.vol24h = "";
        } else {
            this.vol24h = str15;
        }
        if ((32768 & i) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str16;
        }
        if ((i & 65536) == 0) {
            this.ts = "";
        } else {
            this.ts = str17;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OuterTickersData outerTickersData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) outerTickersData.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, outerTickersData.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) outerTickersData.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, outerTickersData.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) outerTickersData.last, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, outerTickersData.last);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) outerTickersData.lastSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, outerTickersData.lastSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) outerTickersData.askPx, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, outerTickersData.askPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) outerTickersData.askSz, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, outerTickersData.askSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) outerTickersData.bidPx, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, outerTickersData.bidPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) outerTickersData.bidSz, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, outerTickersData.bidSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) outerTickersData.open24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, outerTickersData.open24h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) outerTickersData.sodUtc0, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, outerTickersData.sodUtc0);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) outerTickersData.sodUtc8, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, outerTickersData.sodUtc8);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) outerTickersData.high24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, outerTickersData.high24h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) outerTickersData.low24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, outerTickersData.low24h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) outerTickersData.volCcy24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, outerTickersData.volCcy24h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) outerTickersData.vol24h, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, outerTickersData.vol24h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) outerTickersData.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, outerTickersData.ccy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && Intrinsics.EZpvd((Object) outerTickersData.ts, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 16, outerTickersData.ts);
    }

    public OuterTickersData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, String str6, String str7, String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        this.instType = str;
        this.instId = str2;
        this.last = str3;
        this.lastSz = str4;
        this.askPx = str5;
        this.askSz = str6;
        this.bidPx = str7;
        this.bidSz = str8;
        this.open24h = str9;
        this.sodUtc0 = str10;
        this.sodUtc8 = str11;
        this.high24h = str12;
        this.low24h = str13;
        this.volCcy24h = str14;
        this.vol24h = str15;
        this.ccy = str16;
        this.ts = str17;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ba: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:30) call: com.okinc.tradeapi.bean.OuterTickersData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OuterTickersData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17);
    }
}
