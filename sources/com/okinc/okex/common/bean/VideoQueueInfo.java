package com.okinc.okex.common.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class VideoQueueInfo implements Parcelable {
    public static final int $stable = 0;
    private final Integer estimateWaitMin;
    private final Integer estimateWaitSec;
    private final Integer position;
    private final String subStatus;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<VideoQueueInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<VideoQueueInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoQueueInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VideoQueueInfo(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoQueueInfo[] newArray(int i) {
            return new VideoQueueInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VideoQueueInfo() {
        this((Integer) null, (Integer) null, (Integer) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VideoQueueInfo copy$default(VideoQueueInfo videoQueueInfo, Integer num, Integer num2, Integer num3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = videoQueueInfo.estimateWaitSec;
        }
        if ((i & 2) != 0) {
            num2 = videoQueueInfo.position;
        }
        if ((i & 4) != 0) {
            num3 = videoQueueInfo.estimateWaitMin;
        }
        if ((i & 8) != 0) {
            str = videoQueueInfo.subStatus;
        }
        return videoQueueInfo.copy(num, num2, num3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.estimateWaitSec;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.estimateWaitMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.subStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VideoQueueInfo copy(Integer num, Integer num2, Integer num3, String str) {
        return new VideoQueueInfo(num, num2, num3, str);
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
        if (!(obj instanceof VideoQueueInfo)) {
            return false;
        }
        VideoQueueInfo videoQueueInfo = (VideoQueueInfo) obj;
        return Intrinsics.EZpvd(this.estimateWaitSec, videoQueueInfo.estimateWaitSec) && Intrinsics.EZpvd(this.position, videoQueueInfo.position) && Intrinsics.EZpvd(this.estimateWaitMin, videoQueueInfo.estimateWaitMin) && Intrinsics.EZpvd((Object) this.subStatus, (Object) videoQueueInfo.subStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEstimateWaitMin() {
        return this.estimateWaitMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEstimateWaitSec() {
        return this.estimateWaitSec;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubStatus() {
        return this.subStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.estimateWaitSec;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.position;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.estimateWaitMin;
        int iHashCode3 = num3 == null ? 0 : num3.hashCode();
        String str = this.subStatus;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VideoQueueInfo(estimateWaitSec=" + this.estimateWaitSec + ", position=" + this.position + ", estimateWaitMin=" + this.estimateWaitMin + ", subStatus=" + this.subStatus + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.estimateWaitSec;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.position;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.estimateWaitMin;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.subStatus);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.common.bean.VideoQueueInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VideoQueueInfo> serializer() {
            return VideoQueueInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VideoQueueInfo(int i, Integer num, Integer num2, Integer num3, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.estimateWaitSec = null;
        } else {
            this.estimateWaitSec = num;
        }
        if ((i & 2) == 0) {
            this.position = null;
        } else {
            this.position = num2;
        }
        if ((i & 4) == 0) {
            this.estimateWaitMin = null;
        } else {
            this.estimateWaitMin = num3;
        }
        if ((i & 8) == 0) {
            this.subStatus = null;
        } else {
            this.subStatus = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_api(VideoQueueInfo videoQueueInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || videoQueueInfo.estimateWaitSec != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, videoQueueInfo.estimateWaitSec);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || videoQueueInfo.position != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, videoQueueInfo.position);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || videoQueueInfo.estimateWaitMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, videoQueueInfo.estimateWaitMin);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && videoQueueInfo.subStatus == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, videoQueueInfo.subStatus);
    }

    public VideoQueueInfo(Integer num, Integer num2, Integer num3, String str) {
        this.estimateWaitSec = num;
        this.position = num2;
        this.estimateWaitMin = num3;
        this.subStatus = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String):void (m)] (LINE:24) call: com.okinc.okex.common.bean.VideoQueueInfo.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ VideoQueueInfo(Integer num, Integer num2, Integer num3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : str);
    }
}
