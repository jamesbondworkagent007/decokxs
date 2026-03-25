package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class RecurringEditCycleTimeReq implements Parcelable {
    private String algoId;
    private String period;
    private String recurringDay;
    private String recurringHour;
    private String recurringTime;
    private String recurringTimeType;
    private String timeZone;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecurringEditCycleTimeReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RecurringEditCycleTimeReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringEditCycleTimeReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecurringEditCycleTimeReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringEditCycleTimeReq[] newArray(int i) {
            return new RecurringEditCycleTimeReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecurringEditCycleTimeReq copy$default(RecurringEditCycleTimeReq recurringEditCycleTimeReq, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recurringEditCycleTimeReq.algoId;
        }
        if ((i & 2) != 0) {
            str2 = recurringEditCycleTimeReq.recurringTimeType;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = recurringEditCycleTimeReq.timeZone;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = recurringEditCycleTimeReq.period;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = recurringEditCycleTimeReq.recurringHour;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = recurringEditCycleTimeReq.recurringDay;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = recurringEditCycleTimeReq.recurringTime;
        }
        return recurringEditCycleTimeReq.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.recurringTimeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.timeZone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.recurringHour;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.recurringDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.recurringTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringEditCycleTimeReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new RecurringEditCycleTimeReq(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof RecurringEditCycleTimeReq)) {
            return false;
        }
        RecurringEditCycleTimeReq recurringEditCycleTimeReq = (RecurringEditCycleTimeReq) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) recurringEditCycleTimeReq.algoId) && Intrinsics.EZpvd((Object) this.recurringTimeType, (Object) recurringEditCycleTimeReq.recurringTimeType) && Intrinsics.EZpvd((Object) this.timeZone, (Object) recurringEditCycleTimeReq.timeZone) && Intrinsics.EZpvd((Object) this.period, (Object) recurringEditCycleTimeReq.period) && Intrinsics.EZpvd((Object) this.recurringHour, (Object) recurringEditCycleTimeReq.recurringHour) && Intrinsics.EZpvd((Object) this.recurringDay, (Object) recurringEditCycleTimeReq.recurringDay) && Intrinsics.EZpvd((Object) this.recurringTime, (Object) recurringEditCycleTimeReq.recurringTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecurringDay() {
        return this.recurringDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecurringHour() {
        return this.recurringHour;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecurringTime() {
        return this.recurringTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecurringTimeType() {
        return this.recurringTimeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeZone() {
        return this.timeZone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.algoId.hashCode();
        int iHashCode2 = this.recurringTimeType.hashCode();
        int iHashCode3 = this.timeZone.hashCode();
        int iHashCode4 = this.period.hashCode();
        String str = this.recurringHour;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.recurringDay;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.recurringTime;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPeriod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.period = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecurringDay(String str) {
        this.recurringDay = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecurringHour(String str) {
        this.recurringHour = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecurringTime(String str) {
        this.recurringTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecurringTimeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.recurringTimeType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeZone(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.timeZone = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringEditCycleTimeReq(algoId=" + this.algoId + ", recurringTimeType=" + this.recurringTimeType + ", timeZone=" + this.timeZone + ", period=" + this.period + ", recurringHour=" + this.recurringHour + ", recurringDay=" + this.recurringDay + ", recurringTime=" + this.recurringTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.recurringTimeType);
        parcel.writeString(this.timeZone);
        parcel.writeString(this.period);
        parcel.writeString(this.recurringHour);
        parcel.writeString(this.recurringDay);
        parcel.writeString(this.recurringTime);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.RecurringEditCycleTimeReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringEditCycleTimeReq> serializer() {
            return RecurringEditCycleTimeReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringEditCycleTimeReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, RecurringEditCycleTimeReq$$serializer.INSTANCE.getDescriptor());
        }
        this.algoId = str;
        this.recurringTimeType = str2;
        this.timeZone = str3;
        this.period = str4;
        if ((i & 16) == 0) {
            this.recurringHour = null;
        } else {
            this.recurringHour = str5;
        }
        if ((i & 32) == 0) {
            this.recurringDay = null;
        } else {
            this.recurringDay = str6;
        }
        if ((i & 64) == 0) {
            this.recurringTime = null;
        } else {
            this.recurringTime = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(RecurringEditCycleTimeReq recurringEditCycleTimeReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, recurringEditCycleTimeReq.algoId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, recurringEditCycleTimeReq.recurringTimeType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, recurringEditCycleTimeReq.timeZone);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, recurringEditCycleTimeReq.period);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || recurringEditCycleTimeReq.recurringHour != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, recurringEditCycleTimeReq.recurringHour);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || recurringEditCycleTimeReq.recurringDay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, recurringEditCycleTimeReq.recurringDay);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && recurringEditCycleTimeReq.recurringTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, recurringEditCycleTimeReq.recurringTime);
    }

    public RecurringEditCycleTimeReq(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.algoId = str;
        this.recurringTimeType = str2;
        this.timeZone = str3;
        this.period = str4;
        this.recurringHour = str5;
        this.recurringDay = str6;
        this.recurringTime = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:88) call: com.okinc.unify_trade.biz.RecurringEditCycleTimeReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RecurringEditCycleTimeReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
