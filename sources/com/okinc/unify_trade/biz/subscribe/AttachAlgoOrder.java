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

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class AttachAlgoOrder implements Parcelable {
    private String amendPxOnTriggerType;
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
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AttachAlgoOrder> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AttachAlgoOrder> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AttachAlgoOrder createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AttachAlgoOrder(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AttachAlgoOrder[] newArray(int i) {
            return new AttachAlgoOrder[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AttachAlgoOrder() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tpTriggerPxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tpOrdKind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tpTriggerRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
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
        return this.amendPxOnTriggerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AttachAlgoOrder copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        return new AttachAlgoOrder(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
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
        if (!(obj instanceof AttachAlgoOrder)) {
            return false;
        }
        AttachAlgoOrder attachAlgoOrder = (AttachAlgoOrder) obj;
        return Intrinsics.EZpvd((Object) this.tpTriggerPxType, (Object) attachAlgoOrder.tpTriggerPxType) && Intrinsics.EZpvd((Object) this.slTriggerPxType, (Object) attachAlgoOrder.slTriggerPxType) && Intrinsics.EZpvd((Object) this.tpTriggerPx, (Object) attachAlgoOrder.tpTriggerPx) && Intrinsics.EZpvd((Object) this.tpOrdPx, (Object) attachAlgoOrder.tpOrdPx) && Intrinsics.EZpvd((Object) this.slTriggerPx, (Object) attachAlgoOrder.slTriggerPx) && Intrinsics.EZpvd((Object) this.slOrdPx, (Object) attachAlgoOrder.slOrdPx) && Intrinsics.EZpvd((Object) this.sz, (Object) attachAlgoOrder.sz) && Intrinsics.EZpvd((Object) this.percent, (Object) attachAlgoOrder.percent) && Intrinsics.EZpvd((Object) this.amendPxOnTriggerType, (Object) attachAlgoOrder.amendPxOnTriggerType) && Intrinsics.EZpvd((Object) this.tpOrdKind, (Object) attachAlgoOrder.tpOrdKind) && Intrinsics.EZpvd((Object) this.tpTriggerRatio, (Object) attachAlgoOrder.tpTriggerRatio) && Intrinsics.EZpvd((Object) this.slTriggerRatio, (Object) attachAlgoOrder.slTriggerRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmendPxOnTriggerType() {
        return this.amendPxOnTriggerType;
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
        String str9 = this.amendPxOnTriggerType;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.tpOrdKind;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.tpTriggerRatio;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.slTriggerRatio;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str12 != null ? str12.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmendPxOnTriggerType(String str) {
        this.amendPxOnTriggerType = str;
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
    public String toString() {
        return "AttachAlgoOrder(tpTriggerPxType=" + this.tpTriggerPxType + ", slTriggerPxType=" + this.slTriggerPxType + ", tpTriggerPx=" + this.tpTriggerPx + ", tpOrdPx=" + this.tpOrdPx + ", slTriggerPx=" + this.slTriggerPx + ", slOrdPx=" + this.slOrdPx + ", sz=" + this.sz + ", percent=" + this.percent + ", amendPxOnTriggerType=" + this.amendPxOnTriggerType + ", tpOrdKind=" + this.tpOrdKind + ", tpTriggerRatio=" + this.tpTriggerRatio + ", slTriggerRatio=" + this.slTriggerRatio + ")";
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
        parcel.writeString(this.amendPxOnTriggerType);
        parcel.writeString(this.tpOrdKind);
        parcel.writeString(this.tpTriggerRatio);
        parcel.writeString(this.slTriggerRatio);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.AttachAlgoOrder.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AttachAlgoOrder> serializer() {
            return AttachAlgoOrder$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AttachAlgoOrder(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.amendPxOnTriggerType = null;
        } else {
            this.amendPxOnTriggerType = str9;
        }
        if ((i & 512) == 0) {
            this.tpOrdKind = null;
        } else {
            this.tpOrdKind = str10;
        }
        if ((i & 1024) == 0) {
            this.tpTriggerRatio = null;
        } else {
            this.tpTriggerRatio = str11;
        }
        if ((i & 2048) == 0) {
            this.slTriggerRatio = null;
        } else {
            this.slTriggerRatio = str12;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AttachAlgoOrder attachAlgoOrder, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || attachAlgoOrder.tpTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, attachAlgoOrder.tpTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || attachAlgoOrder.slTriggerPxType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, attachAlgoOrder.slTriggerPxType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || attachAlgoOrder.tpTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, attachAlgoOrder.tpTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || attachAlgoOrder.tpOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, attachAlgoOrder.tpOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || attachAlgoOrder.slTriggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, attachAlgoOrder.slTriggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || attachAlgoOrder.slOrdPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, attachAlgoOrder.slOrdPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || attachAlgoOrder.sz != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, attachAlgoOrder.sz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || attachAlgoOrder.percent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, attachAlgoOrder.percent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || attachAlgoOrder.amendPxOnTriggerType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, attachAlgoOrder.amendPxOnTriggerType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || attachAlgoOrder.tpOrdKind != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, attachAlgoOrder.tpOrdKind);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || attachAlgoOrder.tpTriggerRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, attachAlgoOrder.tpTriggerRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && attachAlgoOrder.slTriggerRatio == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, attachAlgoOrder.slTriggerRatio);
    }

    public AttachAlgoOrder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.tpTriggerPxType = str;
        this.slTriggerPxType = str2;
        this.tpTriggerPx = str3;
        this.tpOrdPx = str4;
        this.slTriggerPx = str5;
        this.slOrdPx = str6;
        this.sz = str7;
        this.percent = str8;
        this.amendPxOnTriggerType = str9;
        this.tpOrdKind = str10;
        this.tpTriggerRatio = str11;
        this.slTriggerRatio = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0078: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:388) call: com.okinc.unify_trade.biz.subscribe.AttachAlgoOrder.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AttachAlgoOrder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) == 0 ? str12 : null);
    }
}
