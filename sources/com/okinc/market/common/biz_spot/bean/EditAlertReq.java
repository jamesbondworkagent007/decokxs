package com.okinc.market.common.biz_spot.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class EditAlertReq implements Parcelable {
    private String condition1;
    private String condition2;
    private String customMsg;
    private String indicatorType;
    private Integer presetCondition;
    private String promptThreshold;
    private int promptType;
    private int repeatType;
    private long ruleId;
    private String signalType;
    private int sourceType;
    private Integer timePeriod;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EditAlertReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EditAlertReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditAlertReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EditAlertReq(parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditAlertReq[] newArray(int i) {
            return new EditAlertReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.condition1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.condition2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.presetCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.promptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.repeatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.promptThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.customMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.timePeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.indicatorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.signalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditAlertReq copy(int i, long j, int i2, int i3, @NotNull String str, @NotNull String str2, Integer num, String str3, String str4, String str5, String str6, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new EditAlertReq(i, j, i2, i3, str, str2, num, str3, str4, str5, str6, num2);
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
        if (!(obj instanceof EditAlertReq)) {
            return false;
        }
        EditAlertReq editAlertReq = (EditAlertReq) obj;
        return this.sourceType == editAlertReq.sourceType && this.ruleId == editAlertReq.ruleId && this.promptType == editAlertReq.promptType && this.repeatType == editAlertReq.repeatType && Intrinsics.EZpvd((Object) this.promptThreshold, (Object) editAlertReq.promptThreshold) && Intrinsics.EZpvd((Object) this.customMsg, (Object) editAlertReq.customMsg) && Intrinsics.EZpvd(this.timePeriod, editAlertReq.timePeriod) && Intrinsics.EZpvd((Object) this.indicatorType, (Object) editAlertReq.indicatorType) && Intrinsics.EZpvd((Object) this.signalType, (Object) editAlertReq.signalType) && Intrinsics.EZpvd((Object) this.condition1, (Object) editAlertReq.condition1) && Intrinsics.EZpvd((Object) this.condition2, (Object) editAlertReq.condition2) && Intrinsics.EZpvd(this.presetCondition, editAlertReq.presetCondition);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCondition1() {
        return this.condition1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCondition2() {
        return this.condition2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomMsg() {
        return this.customMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIndicatorType() {
        return this.indicatorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPresetCondition() {
        return this.presetCondition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPromptThreshold() {
        return this.promptThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPromptType() {
        return this.promptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRepeatType() {
        return this.repeatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRuleId() {
        return this.ruleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignalType() {
        return this.signalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSourceType() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTimePeriod() {
        return this.timePeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.sourceType);
        int iHashCode2 = Long.hashCode(this.ruleId);
        int iHashCode3 = Integer.hashCode(this.promptType);
        int iHashCode4 = Integer.hashCode(this.repeatType);
        int iHashCode5 = this.promptThreshold.hashCode();
        int iHashCode6 = this.customMsg.hashCode();
        Integer num = this.timePeriod;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        String str = this.indicatorType;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        String str2 = this.signalType;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.condition1;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.condition2;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        Integer num2 = this.presetCondition;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCondition1(String str) {
        this.condition1 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCondition2(String str) {
        this.condition2 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.customMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIndicatorType(String str) {
        this.indicatorType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPresetCondition(Integer num) {
        this.presetCondition = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPromptThreshold(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.promptThreshold = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPromptType(int i) {
        this.promptType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRepeatType(int i) {
        this.repeatType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRuleId(long j) {
        this.ruleId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignalType(String str) {
        this.signalType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceType(int i) {
        this.sourceType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimePeriod(Integer num) {
        this.timePeriod = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EditAlertReq(sourceType=" + this.sourceType + ", ruleId=" + this.ruleId + ", promptType=" + this.promptType + ", repeatType=" + this.repeatType + ", promptThreshold=" + this.promptThreshold + ", customMsg=" + this.customMsg + ", timePeriod=" + this.timePeriod + ", indicatorType=" + this.indicatorType + ", signalType=" + this.signalType + ", condition1=" + this.condition1 + ", condition2=" + this.condition2 + ", presetCondition=" + this.presetCondition + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.sourceType);
        parcel.writeLong(this.ruleId);
        parcel.writeInt(this.promptType);
        parcel.writeInt(this.repeatType);
        parcel.writeString(this.promptThreshold);
        parcel.writeString(this.customMsg);
        Integer num = this.timePeriod;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.indicatorType);
        parcel.writeString(this.signalType);
        parcel.writeString(this.condition1);
        parcel.writeString(this.condition2);
        Integer num2 = this.presetCondition;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.market.common.biz_spot.bean.EditAlertReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EditAlertReq> serializer() {
            return EditAlertReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EditAlertReq(int i, int i2, long j, int i3, int i4, String str, String str2, Integer num, String str3, String str4, String str5, String str6, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i, 11, EditAlertReq$$serializer.INSTANCE.getDescriptor());
        }
        this.sourceType = i2;
        this.ruleId = j;
        this.promptType = (i & 4) == 0 ? 0 : i3;
        this.repeatType = i4;
        if ((i & 16) == 0) {
            this.promptThreshold = "";
        } else {
            this.promptThreshold = str;
        }
        if ((i & 32) == 0) {
            this.customMsg = "";
        } else {
            this.customMsg = str2;
        }
        if ((i & 64) == 0) {
            this.timePeriod = null;
        } else {
            this.timePeriod = num;
        }
        if ((i & 128) == 0) {
            this.indicatorType = null;
        } else {
            this.indicatorType = str3;
        }
        if ((i & 256) == 0) {
            this.signalType = null;
        } else {
            this.signalType = str4;
        }
        if ((i & 512) == 0) {
            this.condition1 = null;
        } else {
            this.condition1 = str5;
        }
        if ((i & 1024) == 0) {
            this.condition2 = null;
        } else {
            this.condition2 = str6;
        }
        if ((i & 2048) == 0) {
            this.presetCondition = null;
        } else {
            this.presetCondition = num2;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_api(EditAlertReq editAlertReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, editAlertReq.sourceType);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, editAlertReq.ruleId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || editAlertReq.promptType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, editAlertReq.promptType);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, editAlertReq.repeatType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) editAlertReq.promptThreshold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, editAlertReq.promptThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) editAlertReq.customMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, editAlertReq.customMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || editAlertReq.timePeriod != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, editAlertReq.timePeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || editAlertReq.indicatorType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, editAlertReq.indicatorType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || editAlertReq.signalType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, editAlertReq.signalType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || editAlertReq.condition1 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, editAlertReq.condition1);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || editAlertReq.condition2 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, editAlertReq.condition2);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && editAlertReq.presetCondition == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, editAlertReq.presetCondition);
    }

    public EditAlertReq(int i, long j, int i2, int i3, @NotNull String str, @NotNull String str2, Integer num, String str3, String str4, String str5, String str6, Integer num2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.sourceType = i;
        this.ruleId = j;
        this.promptType = i2;
        this.repeatType = i3;
        this.promptThreshold = str;
        this.customMsg = str2;
        this.timePeriod = num;
        this.indicatorType = str3;
        this.signalType = str4;
        this.condition1 = str5;
        this.condition2 = str6;
        this.presetCondition = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0056: CONSTRUCTOR 
  (r17v0 int)
  (r18v0 long)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r20v0 int))
  (r21v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r24v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0046: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r29v0 java.lang.Integer))
 A[MD:(int, long, int, int, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:50) call: com.okinc.market.common.biz_spot.bean.EditAlertReq.<init>(int, long, int, int, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ EditAlertReq(int i, long j, int i2, int i3, String str, String str2, Integer num, String str3, String str4, String str5, String str6, Integer num2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j, (i4 & 4) != 0 ? 0 : i2, i3, (i4 & 16) != 0 ? "" : str, (i4 & 32) != 0 ? "" : str2, (i4 & 64) != 0 ? null : num, (i4 & 128) != 0 ? null : str3, (i4 & 256) != 0 ? null : str4, (i4 & 512) != 0 ? null : str5, (i4 & 1024) != 0 ? null : str6, (i4 & 2048) != 0 ? null : num2);
    }
}
