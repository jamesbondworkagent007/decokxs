package com.okinc.dexkline.market.features.filter.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class TimeRangeFilter implements Parcelable {
    public static final int $stable = 0;
    public final String endTime;
    public final transient boolean shouldShowDash;
    public final String startTime;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TimeRangeFilter> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TimeRangeFilter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TimeRangeFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TimeRangeFilter(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TimeRangeFilter[] newArray(int i) {
            return new TimeRangeFilter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TimeRangeFilter() {
        this((String) null, (String) null, false, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TimeRangeFilter copy$default(TimeRangeFilter timeRangeFilter, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = timeRangeFilter.startTime;
        }
        if ((i & 2) != 0) {
            str2 = timeRangeFilter.endTime;
        }
        if ((i & 4) != 0) {
            z = timeRangeFilter.shouldShowDash;
        }
        return timeRangeFilter.AEQbTJ(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeRangeFilter AEQbTJ(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TimeRangeFilter(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.endTime;
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
        if (!(obj instanceof TimeRangeFilter)) {
            return false;
        }
        TimeRangeFilter timeRangeFilter = (TimeRangeFilter) obj;
        return Intrinsics.EZpvd((Object) this.startTime, (Object) timeRangeFilter.startTime) && Intrinsics.EZpvd((Object) this.endTime, (Object) timeRangeFilter.endTime) && this.shouldShowDash == timeRangeFilter.shouldShowDash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.startTime.hashCode() * 31) + this.endTime.hashCode()) * 31) + Boolean.hashCode(this.shouldShowDash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TimeRangeFilter(startTime=" + this.startTime + ", endTime=" + this.endTime + ", shouldShowDash=" + this.shouldShowDash + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.startTime);
        parcel.writeString(this.endTime);
        parcel.writeInt(this.shouldShowDash ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.features.filter.domain.TimeRangeFilter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TimeRangeFilter> serializer() {
            return TimeRangeFilter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TimeRangeFilter(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.startTime = "";
        } else {
            this.startTime = str;
        }
        if ((i & 2) == 0) {
            this.endTime = "";
        } else {
            this.endTime = str2;
        }
        if ((i & 4) == 0) {
            this.shouldShowDash = true;
        } else {
            this.shouldShowDash = z;
        }
    }

    public static final /* synthetic */ void EZpvd(TimeRangeFilter timeRangeFilter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) timeRangeFilter.startTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, timeRangeFilter.startTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) timeRangeFilter.endTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, timeRangeFilter.endTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && timeRangeFilter.shouldShowDash) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, timeRangeFilter.shouldShowDash);
    }

    public TimeRangeFilter(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.startTime = str;
        this.endTime = str2;
        this.shouldShowDash = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:10) call: com.okinc.dexkline.market.features.filter.domain.TimeRangeFilter.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ TimeRangeFilter(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? true : z);
    }
}
