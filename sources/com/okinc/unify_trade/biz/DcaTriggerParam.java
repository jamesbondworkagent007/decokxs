package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class DcaTriggerParam implements Parcelable {
    private String cycleId;
    private String klinePeriod;
    private String thold;
    private String tholdWarning;
    private String timePeriod;
    private String timeframe;
    private String triggerAction;
    private String triggerCond;
    private String triggerPx;
    private String triggerStrategy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DcaTriggerParam> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DcaTriggerParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcaTriggerParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DcaTriggerParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcaTriggerParam[] newArray(int i) {
            return new DcaTriggerParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DcaTriggerParam() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.triggerAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.klinePeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.triggerStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.triggerCond;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.thold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tholdWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.timePeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.timeframe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.cycleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcaTriggerParam copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        return new DcaTriggerParam(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
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
        if (!(obj instanceof DcaTriggerParam)) {
            return false;
        }
        DcaTriggerParam dcaTriggerParam = (DcaTriggerParam) obj;
        return Intrinsics.EZpvd((Object) this.triggerAction, (Object) dcaTriggerParam.triggerAction) && Intrinsics.EZpvd((Object) this.triggerStrategy, (Object) dcaTriggerParam.triggerStrategy) && Intrinsics.EZpvd((Object) this.triggerCond, (Object) dcaTriggerParam.triggerCond) && Intrinsics.EZpvd((Object) this.triggerPx, (Object) dcaTriggerParam.triggerPx) && Intrinsics.EZpvd((Object) this.thold, (Object) dcaTriggerParam.thold) && Intrinsics.EZpvd((Object) this.tholdWarning, (Object) dcaTriggerParam.tholdWarning) && Intrinsics.EZpvd((Object) this.timePeriod, (Object) dcaTriggerParam.timePeriod) && Intrinsics.EZpvd((Object) this.timeframe, (Object) dcaTriggerParam.timeframe) && Intrinsics.EZpvd((Object) this.cycleId, (Object) dcaTriggerParam.cycleId) && Intrinsics.EZpvd((Object) this.klinePeriod, (Object) dcaTriggerParam.klinePeriod);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCycleId() {
        return this.cycleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKlinePeriod() {
        return this.klinePeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getThold() {
        return this.thold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTholdWarning() {
        return this.tholdWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimePeriod() {
        return this.timePeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeframe() {
        return this.timeframe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerAction() {
        return this.triggerAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerCond() {
        return this.triggerCond;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPx() {
        return this.triggerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerStrategy() {
        return this.triggerStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.triggerAction;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.triggerStrategy;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.triggerCond;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.triggerPx;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.thold;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tholdWarning;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.timePeriod;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.timeframe;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.cycleId;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.klinePeriod;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str10 != null ? str10.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCycleId(String str) {
        this.cycleId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKlinePeriod(String str) {
        this.klinePeriod = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setThold(String str) {
        this.thold = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTholdWarning(String str) {
        this.tholdWarning = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimePeriod(String str) {
        this.timePeriod = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeframe(String str) {
        this.timeframe = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerAction(String str) {
        this.triggerAction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerCond(String str) {
        this.triggerCond = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerPx(String str) {
        this.triggerPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerStrategy(String str) {
        this.triggerStrategy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DcaTriggerParam(triggerAction=" + this.triggerAction + ", triggerStrategy=" + this.triggerStrategy + ", triggerCond=" + this.triggerCond + ", triggerPx=" + this.triggerPx + ", thold=" + this.thold + ", tholdWarning=" + this.tholdWarning + ", timePeriod=" + this.timePeriod + ", timeframe=" + this.timeframe + ", cycleId=" + this.cycleId + ", klinePeriod=" + this.klinePeriod + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.triggerAction);
        parcel.writeString(this.triggerStrategy);
        parcel.writeString(this.triggerCond);
        parcel.writeString(this.triggerPx);
        parcel.writeString(this.thold);
        parcel.writeString(this.tholdWarning);
        parcel.writeString(this.timePeriod);
        parcel.writeString(this.timeframe);
        parcel.writeString(this.cycleId);
        parcel.writeString(this.klinePeriod);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.DcaTriggerParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DcaTriggerParam> serializer() {
            return DcaTriggerParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DcaTriggerParam(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.triggerAction = null;
        } else {
            this.triggerAction = str;
        }
        if ((i & 2) == 0) {
            this.triggerStrategy = null;
        } else {
            this.triggerStrategy = str2;
        }
        if ((i & 4) == 0) {
            this.triggerCond = null;
        } else {
            this.triggerCond = str3;
        }
        if ((i & 8) == 0) {
            this.triggerPx = null;
        } else {
            this.triggerPx = str4;
        }
        if ((i & 16) == 0) {
            this.thold = null;
        } else {
            this.thold = str5;
        }
        if ((i & 32) == 0) {
            this.tholdWarning = null;
        } else {
            this.tholdWarning = str6;
        }
        if ((i & 64) == 0) {
            this.timePeriod = null;
        } else {
            this.timePeriod = str7;
        }
        if ((i & 128) == 0) {
            this.timeframe = null;
        } else {
            this.timeframe = str8;
        }
        if ((i & 256) == 0) {
            this.cycleId = null;
        } else {
            this.cycleId = str9;
        }
        if ((i & 512) == 0) {
            this.klinePeriod = null;
        } else {
            this.klinePeriod = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DcaTriggerParam dcaTriggerParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dcaTriggerParam.triggerAction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, dcaTriggerParam.triggerAction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dcaTriggerParam.triggerStrategy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, dcaTriggerParam.triggerStrategy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dcaTriggerParam.triggerCond != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, dcaTriggerParam.triggerCond);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dcaTriggerParam.triggerPx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, dcaTriggerParam.triggerPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || dcaTriggerParam.thold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, dcaTriggerParam.thold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || dcaTriggerParam.tholdWarning != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, dcaTriggerParam.tholdWarning);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || dcaTriggerParam.timePeriod != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, dcaTriggerParam.timePeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || dcaTriggerParam.timeframe != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, dcaTriggerParam.timeframe);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || dcaTriggerParam.cycleId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, dcaTriggerParam.cycleId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && dcaTriggerParam.klinePeriod == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, dcaTriggerParam.klinePeriod);
    }

    public DcaTriggerParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.triggerAction = str;
        this.triggerStrategy = str2;
        this.triggerCond = str3;
        this.triggerPx = str4;
        this.thold = str5;
        this.tholdWarning = str6;
        this.timePeriod = str7;
        this.timeframe = str8;
        this.cycleId = str9;
        this.klinePeriod = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2774) call: com.okinc.unify_trade.biz.DcaTriggerParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DcaTriggerParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) == 0 ? str10 : null);
    }
}
