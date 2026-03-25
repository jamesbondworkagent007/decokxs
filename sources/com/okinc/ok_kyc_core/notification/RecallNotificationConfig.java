package com.okinc.ok_kyc_core.notification;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class RecallNotificationConfig implements Parcelable {

    @SerializedName("max_resend_count")
    private long maxResendCount;

    @SerializedName("page_key")
    private String pageKey;

    @SerializedName("recall_duration_in_secs")
    private long recallDurationInSecs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecallNotificationConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RecallNotificationConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecallNotificationConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecallNotificationConfig(parcel.readLong(), parcel.readLong(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecallNotificationConfig[] newArray(int i) {
            return new RecallNotificationConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecallNotificationConfig() {
        this(0L, 0L, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecallNotificationConfig copy$default(RecallNotificationConfig recallNotificationConfig, long j, long j2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = recallNotificationConfig.recallDurationInSecs;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = recallNotificationConfig.maxResendCount;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = recallNotificationConfig.pageKey;
        }
        return recallNotificationConfig.copy(j3, j4, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.recallDurationInSecs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.maxResendCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pageKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecallNotificationConfig copy(long j, long j2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new RecallNotificationConfig(j, j2, str);
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
        if (!(obj instanceof RecallNotificationConfig)) {
            return false;
        }
        RecallNotificationConfig recallNotificationConfig = (RecallNotificationConfig) obj;
        return this.recallDurationInSecs == recallNotificationConfig.recallDurationInSecs && this.maxResendCount == recallNotificationConfig.maxResendCount && Intrinsics.EZpvd((Object) this.pageKey, (Object) recallNotificationConfig.pageKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getMaxResendCount() {
        return this.maxResendCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPageKey() {
        return this.pageKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRecallDurationInSecs() {
        return this.recallDurationInSecs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.recallDurationInSecs) * 31) + Long.hashCode(this.maxResendCount)) * 31) + this.pageKey.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxResendCount(long j) {
        this.maxResendCount = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPageKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pageKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecallDurationInSecs(long j) {
        this.recallDurationInSecs = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecallNotificationConfig(recallDurationInSecs=" + this.recallDurationInSecs + ", maxResendCount=" + this.maxResendCount + ", pageKey=" + this.pageKey + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.recallDurationInSecs);
        parcel.writeLong(this.maxResendCount);
        parcel.writeString(this.pageKey);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.notification.RecallNotificationConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecallNotificationConfig> serializer() {
            return RecallNotificationConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecallNotificationConfig(int i, long j, long j2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.recallDurationInSecs = 0L;
        } else {
            this.recallDurationInSecs = j;
        }
        if ((i & 2) == 0) {
            this.maxResendCount = 0L;
        } else {
            this.maxResendCount = j2;
        }
        if ((i & 4) == 0) {
            this.pageKey = "";
        } else {
            this.pageKey = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(RecallNotificationConfig recallNotificationConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || recallNotificationConfig.recallDurationInSecs != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, recallNotificationConfig.recallDurationInSecs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || recallNotificationConfig.maxResendCount != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, recallNotificationConfig.maxResendCount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) recallNotificationConfig.pageKey, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, recallNotificationConfig.pageKey);
    }

    public RecallNotificationConfig(long j, long j2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.recallDurationInSecs = j;
        this.maxResendCount = j2;
        this.pageKey = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r5v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r7v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(long, long, java.lang.String):void (m)] (LINE:13) call: com.okinc.ok_kyc_core.notification.RecallNotificationConfig.<init>(long, long, java.lang.String):void type: THIS */
    public /* synthetic */ RecallNotificationConfig(long j, long j2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) == 0 ? j2 : 0L, (i & 4) != 0 ? "" : str);
    }
}
