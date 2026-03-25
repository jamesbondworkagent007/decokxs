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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class AttachMoveAlgoOrderData implements Parcelable {
    private final String activePx;
    private final String algoClOrdId;
    private final String algoId;
    private String algoOrdType;
    private final String cTime;
    private final String callbackRatio;
    private String callbackSpread;
    private final String cancelType;
    private final String ccy;
    private final String instId;
    private final String last;
    private final String moveTriggerPx;
    private final String ordType;
    private final String posSide;
    private final String reduceOnly;
    private final String sz;
    private final String tdMode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AttachMoveAlgoOrderData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AttachMoveAlgoOrderData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AttachMoveAlgoOrderData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AttachMoveAlgoOrderData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AttachMoveAlgoOrderData[] newArray(int i) {
            return new AttachMoveAlgoOrderData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AttachMoveAlgoOrderData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.activePx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.moveTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.algoClOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.algoOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.callbackRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.callbackSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.cancelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AttachMoveAlgoOrderData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
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
        return new AttachMoveAlgoOrderData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17);
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
        if (!(obj instanceof AttachMoveAlgoOrderData)) {
            return false;
        }
        AttachMoveAlgoOrderData attachMoveAlgoOrderData = (AttachMoveAlgoOrderData) obj;
        return Intrinsics.EZpvd((Object) this.activePx, (Object) attachMoveAlgoOrderData.activePx) && Intrinsics.EZpvd((Object) this.moveTriggerPx, (Object) attachMoveAlgoOrderData.moveTriggerPx) && Intrinsics.EZpvd((Object) this.algoClOrdId, (Object) attachMoveAlgoOrderData.algoClOrdId) && Intrinsics.EZpvd((Object) this.algoId, (Object) attachMoveAlgoOrderData.algoId) && Intrinsics.EZpvd((Object) this.algoOrdType, (Object) attachMoveAlgoOrderData.algoOrdType) && Intrinsics.EZpvd((Object) this.cTime, (Object) attachMoveAlgoOrderData.cTime) && Intrinsics.EZpvd((Object) this.callbackRatio, (Object) attachMoveAlgoOrderData.callbackRatio) && Intrinsics.EZpvd((Object) this.callbackSpread, (Object) attachMoveAlgoOrderData.callbackSpread) && Intrinsics.EZpvd((Object) this.cancelType, (Object) attachMoveAlgoOrderData.cancelType) && Intrinsics.EZpvd((Object) this.ccy, (Object) attachMoveAlgoOrderData.ccy) && Intrinsics.EZpvd((Object) this.instId, (Object) attachMoveAlgoOrderData.instId) && Intrinsics.EZpvd((Object) this.tdMode, (Object) attachMoveAlgoOrderData.tdMode) && Intrinsics.EZpvd((Object) this.posSide, (Object) attachMoveAlgoOrderData.posSide) && Intrinsics.EZpvd((Object) this.sz, (Object) attachMoveAlgoOrderData.sz) && Intrinsics.EZpvd((Object) this.ordType, (Object) attachMoveAlgoOrderData.ordType) && Intrinsics.EZpvd((Object) this.last, (Object) attachMoveAlgoOrderData.last) && Intrinsics.EZpvd((Object) this.reduceOnly, (Object) attachMoveAlgoOrderData.reduceOnly);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActivePx() {
        return this.activePx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoClOrdId() {
        return this.algoClOrdId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoOrdType() {
        return this.algoOrdType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCTime() {
        return this.cTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallbackRatio() {
        return this.callbackRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallbackSpread() {
        return this.callbackSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCancelType() {
        return this.cancelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLast() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMoveTriggerPx() {
        return this.moveTriggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosSide() {
        return this.posSide;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReduceOnly() {
        return this.reduceOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSz() {
        return this.sz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTdMode() {
        return this.tdMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.activePx.hashCode();
        int iHashCode2 = this.moveTriggerPx.hashCode();
        int iHashCode3 = this.algoClOrdId.hashCode();
        int iHashCode4 = this.algoId.hashCode();
        String str = this.algoOrdType;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.cTime.hashCode()) * 31) + this.callbackRatio.hashCode()) * 31) + this.callbackSpread.hashCode()) * 31) + this.cancelType.hashCode()) * 31) + this.ccy.hashCode()) * 31) + this.instId.hashCode()) * 31) + this.tdMode.hashCode()) * 31) + this.posSide.hashCode()) * 31) + this.sz.hashCode()) * 31) + this.ordType.hashCode()) * 31) + this.last.hashCode()) * 31) + this.reduceOnly.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoOrdType(String str) {
        this.algoOrdType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallbackSpread(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.callbackSpread = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AttachMoveAlgoOrderData(activePx=" + this.activePx + ", moveTriggerPx=" + this.moveTriggerPx + ", algoClOrdId=" + this.algoClOrdId + ", algoId=" + this.algoId + ", algoOrdType=" + this.algoOrdType + ", cTime=" + this.cTime + ", callbackRatio=" + this.callbackRatio + ", callbackSpread=" + this.callbackSpread + ", cancelType=" + this.cancelType + ", ccy=" + this.ccy + ", instId=" + this.instId + ", tdMode=" + this.tdMode + ", posSide=" + this.posSide + ", sz=" + this.sz + ", ordType=" + this.ordType + ", last=" + this.last + ", reduceOnly=" + this.reduceOnly + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.activePx);
        parcel.writeString(this.moveTriggerPx);
        parcel.writeString(this.algoClOrdId);
        parcel.writeString(this.algoId);
        parcel.writeString(this.algoOrdType);
        parcel.writeString(this.cTime);
        parcel.writeString(this.callbackRatio);
        parcel.writeString(this.callbackSpread);
        parcel.writeString(this.cancelType);
        parcel.writeString(this.ccy);
        parcel.writeString(this.instId);
        parcel.writeString(this.tdMode);
        parcel.writeString(this.posSide);
        parcel.writeString(this.sz);
        parcel.writeString(this.ordType);
        parcel.writeString(this.last);
        parcel.writeString(this.reduceOnly);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.AttachMoveAlgoOrderData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AttachMoveAlgoOrderData> serializer() {
            return AttachMoveAlgoOrderData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AttachMoveAlgoOrderData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.activePx = "";
        } else {
            this.activePx = str;
        }
        if ((i & 2) == 0) {
            this.moveTriggerPx = "";
        } else {
            this.moveTriggerPx = str2;
        }
        if ((i & 4) == 0) {
            this.algoClOrdId = "";
        } else {
            this.algoClOrdId = str3;
        }
        if ((i & 8) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str4;
        }
        this.algoOrdType = (i & 16) == 0 ? null : str5;
        if ((i & 32) == 0) {
            this.cTime = "";
        } else {
            this.cTime = str6;
        }
        if ((i & 64) == 0) {
            this.callbackRatio = "";
        } else {
            this.callbackRatio = str7;
        }
        if ((i & 128) == 0) {
            this.callbackSpread = "";
        } else {
            this.callbackSpread = str8;
        }
        if ((i & 256) == 0) {
            this.cancelType = "";
        } else {
            this.cancelType = str9;
        }
        if ((i & 512) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str10;
        }
        if ((i & 1024) == 0) {
            this.instId = "";
        } else {
            this.instId = str11;
        }
        if ((i & 2048) == 0) {
            this.tdMode = "";
        } else {
            this.tdMode = str12;
        }
        if ((i & 4096) == 0) {
            this.posSide = "";
        } else {
            this.posSide = str13;
        }
        if ((i & 8192) == 0) {
            this.sz = "";
        } else {
            this.sz = str14;
        }
        if ((i & 16384) == 0) {
            this.ordType = "";
        } else {
            this.ordType = str15;
        }
        if ((32768 & i) == 0) {
            this.last = "";
        } else {
            this.last = str16;
        }
        if ((i & 65536) == 0) {
            this.reduceOnly = "";
        } else {
            this.reduceOnly = str17;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AttachMoveAlgoOrderData attachMoveAlgoOrderData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) attachMoveAlgoOrderData.activePx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, attachMoveAlgoOrderData.activePx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) attachMoveAlgoOrderData.moveTriggerPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, attachMoveAlgoOrderData.moveTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) attachMoveAlgoOrderData.algoClOrdId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, attachMoveAlgoOrderData.algoClOrdId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) attachMoveAlgoOrderData.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, attachMoveAlgoOrderData.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || attachMoveAlgoOrderData.algoOrdType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, attachMoveAlgoOrderData.algoOrdType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) attachMoveAlgoOrderData.cTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, attachMoveAlgoOrderData.cTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) attachMoveAlgoOrderData.callbackRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, attachMoveAlgoOrderData.callbackRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) attachMoveAlgoOrderData.callbackSpread, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, attachMoveAlgoOrderData.callbackSpread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) attachMoveAlgoOrderData.cancelType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, attachMoveAlgoOrderData.cancelType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) attachMoveAlgoOrderData.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, attachMoveAlgoOrderData.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) attachMoveAlgoOrderData.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, attachMoveAlgoOrderData.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) attachMoveAlgoOrderData.tdMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, attachMoveAlgoOrderData.tdMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) attachMoveAlgoOrderData.posSide, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, attachMoveAlgoOrderData.posSide);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) attachMoveAlgoOrderData.sz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, attachMoveAlgoOrderData.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) attachMoveAlgoOrderData.ordType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, attachMoveAlgoOrderData.ordType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) attachMoveAlgoOrderData.last, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, attachMoveAlgoOrderData.last);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && Intrinsics.EZpvd((Object) attachMoveAlgoOrderData.reduceOnly, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 16, attachMoveAlgoOrderData.reduceOnly);
    }

    public AttachMoveAlgoOrderData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
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
        this.activePx = str;
        this.moveTriggerPx = str2;
        this.algoClOrdId = str3;
        this.algoId = str4;
        this.algoOrdType = str5;
        this.cTime = str6;
        this.callbackRatio = str7;
        this.callbackSpread = str8;
        this.cancelType = str9;
        this.ccy = str10;
        this.instId = str11;
        this.tdMode = str12;
        this.posSide = str13;
        this.sz = str14;
        this.ordType = str15;
        this.last = str16;
        this.reduceOnly = str17;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ba: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:68) call: com.okinc.unify_trade.biz.subscribe.AttachMoveAlgoOrderData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AttachMoveAlgoOrderData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17);
    }
}
