package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TradeOrderStopParam implements Parcelable {
    public static final String AMEND_PX_TRIGGER_TYPE_OPEN = "1";
    private String amendPxOnTriggerType;
    private String attachAlgoId;
    private String failCode;
    private String failReason;
    private String percent;
    private String slOrdPx;
    private String slTriggerPx;
    private String slTriggerPxType;
    private String slTriggerRatio;
    private String sz;
    private String tpOrdKind;
    private String tpOrdPx;
    private String tpTriggerPx;
    private String tpTriggerPxType;
    private String tpTriggerRatio;
    private String tpslMode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeOrderStopParam> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TradeOrderStopParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeOrderStopParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TradeOrderStopParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeOrderStopParam[] newArray(int i) {
            return new TradeOrderStopParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeOrderStopParam() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.amendPxOnTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tpOrdKind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.failCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tpslMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.tpTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.slTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.slTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.percent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.attachAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeOrderStopParam copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        return new TradeOrderStopParam(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeOrderStopParam)) {
            return false;
        }
        TradeOrderStopParam tradeOrderStopParam = (TradeOrderStopParam) obj;
        return Intrinsics.EZpvd((Object) this.tpTriggerPxType, (Object) tradeOrderStopParam.tpTriggerPxType) && Intrinsics.EZpvd((Object) this.slTriggerPxType, (Object) tradeOrderStopParam.slTriggerPxType) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) tradeOrderStopParam.tpTriggerPx) && Intrinsics.EZpvd((Object) this.tpOrdPx, (Object) tradeOrderStopParam.tpOrdPx) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) tradeOrderStopParam.slTriggerPx) && Intrinsics.EZpvd((Object) this.slOrdPx, (Object) tradeOrderStopParam.slOrdPx) && Intrinsics.EZpvd((Object) this.sz, (Object) tradeOrderStopParam.sz) && Intrinsics.EZpvd((Object) this.percent, (Object) tradeOrderStopParam.percent) && Intrinsics.EZpvd((Object) this.attachAlgoId, (Object) tradeOrderStopParam.attachAlgoId) && Intrinsics.EZpvd((Object) this.amendPxOnTriggerType, (Object) tradeOrderStopParam.amendPxOnTriggerType) && Intrinsics.EZpvd((Object) this.tpOrdKind, (Object) tradeOrderStopParam.tpOrdKind) && Intrinsics.EZpvd((Object) this.failCode, (Object) tradeOrderStopParam.failCode) && Intrinsics.EZpvd((Object) this.failReason, (Object) tradeOrderStopParam.failReason) && Intrinsics.EZpvd((Object) this.tpslMode, (Object) tradeOrderStopParam.tpslMode) && Intrinsics.EZpvd((Object) this.tpTriggerRatio, (Object) tradeOrderStopParam.tpTriggerRatio) && Intrinsics.EZpvd((Object) this.slTriggerRatio, (Object) tradeOrderStopParam.slTriggerRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmendPxOnTriggerType() {
        return this.amendPxOnTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAttachAlgoId() {
        return this.attachAlgoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailCode() {
        return this.failCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailReason() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPercent() {
        return this.percent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlOrdPx() {
        return this.slOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPx() {
        return this.slTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerPxType() {
        return this.slTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlTriggerRatio() {
        return this.slTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpOrdKind() {
        return this.tpOrdKind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpOrdPx() {
        return this.tpOrdPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPx() {
        return this.tpTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerPxType() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpTriggerRatio() {
        return this.tpTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpslMode() {
        return this.tpslMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tpTriggerPxType;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.slTriggerPxType;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tpTriggerPx;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tpOrdPx;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.slTriggerPx;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.slOrdPx;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.sz;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.percent;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.attachAlgoId;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.amendPxOnTriggerType;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.tpOrdKind;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.failCode;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.failReason;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.tpslMode;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.tpTriggerRatio;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.slTriggerRatio;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (str16 == null ? 0 : str16.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmendPxOnTriggerType(String str) {
        this.amendPxOnTriggerType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAttachAlgoId(String str) {
        this.attachAlgoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFailCode(String str) {
        this.failCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFailReason(String str) {
        this.failReason = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPercent(String str) {
        this.percent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlOrdPx(String str) {
        this.slOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPx(String str) {
        this.slTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerPxType(String str) {
        this.slTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlTriggerRatio(String str) {
        this.slTriggerRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSz(String str) {
        this.sz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpOrdKind(String str) {
        this.tpOrdKind = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpOrdPx(String str) {
        this.tpOrdPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPx(String str) {
        this.tpTriggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerPxType(String str) {
        this.tpTriggerPxType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpTriggerRatio(String str) {
        this.tpTriggerRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpslMode(String str) {
        this.tpslMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeOrderStopParam(tpTriggerPxType=" + this.tpTriggerPxType + ", slTriggerPxType=" + this.slTriggerPxType + ", tpTriggerPx=" + this.tpTriggerPx + ", tpOrdPx=" + this.tpOrdPx + ", slTriggerPx=" + this.slTriggerPx + ", slOrdPx=" + this.slOrdPx + ", sz=" + this.sz + ", percent=" + this.percent + ", attachAlgoId=" + this.attachAlgoId + ", amendPxOnTriggerType=" + this.amendPxOnTriggerType + ", tpOrdKind=" + this.tpOrdKind + ", failCode=" + this.failCode + ", failReason=" + this.failReason + ", tpslMode=" + this.tpslMode + ", tpTriggerRatio=" + this.tpTriggerRatio + ", slTriggerRatio=" + this.slTriggerRatio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tpTriggerPxType);
        parcel.writeString(this.slTriggerPxType);
        parcel.writeString(this.tpTriggerPx);
        parcel.writeString(this.tpOrdPx);
        parcel.writeString(this.slTriggerPx);
        parcel.writeString(this.slOrdPx);
        parcel.writeString(this.sz);
        parcel.writeString(this.percent);
        parcel.writeString(this.attachAlgoId);
        parcel.writeString(this.amendPxOnTriggerType);
        parcel.writeString(this.tpOrdKind);
        parcel.writeString(this.failCode);
        parcel.writeString(this.failReason);
        parcel.writeString(this.tpslMode);
        parcel.writeString(this.tpTriggerRatio);
        parcel.writeString(this.slTriggerRatio);
    }

    public /* synthetic */ TradeOrderStopParam(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tpTriggerPxType = null;
        } else {
            this.tpTriggerPxType = str;
        }
        if ((i & 2) == 0) {
            this.slTriggerPxType = null;
        } else {
            this.slTriggerPxType = str2;
        }
        if ((i & 4) == 0) {
            this.tpTriggerPx = null;
        } else {
            this.tpTriggerPx = str3;
        }
        if ((i & 8) == 0) {
            this.tpOrdPx = null;
        } else {
            this.tpOrdPx = str4;
        }
        if ((i & 16) == 0) {
            this.slTriggerPx = null;
        } else {
            this.slTriggerPx = str5;
        }
        if ((i & 32) == 0) {
            this.slOrdPx = null;
        } else {
            this.slOrdPx = str6;
        }
        if ((i & 64) == 0) {
            this.sz = null;
        } else {
            this.sz = str7;
        }
        if ((i & 128) == 0) {
            this.percent = null;
        } else {
            this.percent = str8;
        }
        if ((i & 256) == 0) {
            this.attachAlgoId = null;
        } else {
            this.attachAlgoId = str9;
        }
        if ((i & 512) == 0) {
            this.amendPxOnTriggerType = null;
        } else {
            this.amendPxOnTriggerType = str10;
        }
        if ((i & 1024) == 0) {
            this.tpOrdKind = null;
        } else {
            this.tpOrdKind = str11;
        }
        if ((i & 2048) == 0) {
            this.failCode = null;
        } else {
            this.failCode = str12;
        }
        if ((i & 4096) == 0) {
            this.failReason = null;
        } else {
            this.failReason = str13;
        }
        if ((i & 8192) == 0) {
            this.tpslMode = null;
        } else {
            this.tpslMode = str14;
        }
        if ((i & 16384) == 0) {
            this.tpTriggerRatio = null;
        } else {
            this.tpTriggerRatio = str15;
        }
        if ((i & 32768) == 0) {
            this.slTriggerRatio = null;
        } else {
            this.slTriggerRatio = str16;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeOrderStopParam tradeOrderStopParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tradeOrderStopParam.tpTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tradeOrderStopParam.tpTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tradeOrderStopParam.slTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, tradeOrderStopParam.slTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tradeOrderStopParam.tpTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, tradeOrderStopParam.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tradeOrderStopParam.tpOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, tradeOrderStopParam.tpOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || tradeOrderStopParam.slTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, tradeOrderStopParam.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || tradeOrderStopParam.slOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, tradeOrderStopParam.slOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || tradeOrderStopParam.sz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, tradeOrderStopParam.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || tradeOrderStopParam.percent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, tradeOrderStopParam.percent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || tradeOrderStopParam.attachAlgoId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, tradeOrderStopParam.attachAlgoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || tradeOrderStopParam.amendPxOnTriggerType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, tradeOrderStopParam.amendPxOnTriggerType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || tradeOrderStopParam.tpOrdKind != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, tradeOrderStopParam.tpOrdKind);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || tradeOrderStopParam.failCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, tradeOrderStopParam.failCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || tradeOrderStopParam.failReason != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, tradeOrderStopParam.failReason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || tradeOrderStopParam.tpslMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, tradeOrderStopParam.tpslMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || tradeOrderStopParam.tpTriggerRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, tradeOrderStopParam.tpTriggerRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && tradeOrderStopParam.slTriggerRatio == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, tradeOrderStopParam.slTriggerRatio);
    }

    public TradeOrderStopParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.tpTriggerPxType = str;
        this.slTriggerPxType = str2;
        this.tpTriggerPx = str3;
        this.tpOrdPx = str4;
        this.slTriggerPx = str5;
        this.slOrdPx = str6;
        this.sz = str7;
        this.percent = str8;
        this.attachAlgoId = str9;
        this.amendPxOnTriggerType = str10;
        this.tpOrdKind = str11;
        this.failCode = str12;
        this.failReason = str13;
        this.tpslMode = str14;
        this.tpTriggerRatio = str15;
        this.slTriggerRatio = str16;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a7: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:348) call: com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TradeOrderStopParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TradeOrderStopParam> serializer() {
            return TradeOrderStopParam$$serializer.INSTANCE;
        }
    }

    public final boolean isTpTriggerPxRatioValid() {
        return C33129mqd.OLrzqt((CharSequence) this.tpTriggerRatio) && C33129mqd.AhwBna(this.tpTriggerRatio, 0);
    }

    public final boolean isSlTriggerPxRatioValid() {
        return C33129mqd.OLrzqt((CharSequence) this.slTriggerRatio) && C33129mqd.AhwBna(this.slTriggerRatio, 0);
    }
}
