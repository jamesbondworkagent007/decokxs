package com.okinc.planet.biz_create_centre.data;

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

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class LiveStreamsData implements Parcelable {
    public static final int $stable = 0;
    private final boolean permission;
    private final String shareCount;
    private final String sharePopRatio;
    private final String streamCount;
    private final String streamPopRatio;
    private final String viewCount;
    private final String viewPopRatio;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LiveStreamsData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LiveStreamsData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiveStreamsData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LiveStreamsData(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiveStreamsData[] newArray(int i) {
            return new LiveStreamsData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LiveStreamsData() {
        this(false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LiveStreamsData copy$default(LiveStreamsData liveStreamsData, boolean z, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            z = liveStreamsData.permission;
        }
        if ((i & 2) != 0) {
            str = liveStreamsData.streamCount;
        }
        String str7 = str;
        if ((i & 4) != 0) {
            str2 = liveStreamsData.streamPopRatio;
        }
        String str8 = str2;
        if ((i & 8) != 0) {
            str3 = liveStreamsData.viewCount;
        }
        String str9 = str3;
        if ((i & 16) != 0) {
            str4 = liveStreamsData.viewPopRatio;
        }
        String str10 = str4;
        if ((i & 32) != 0) {
            str5 = liveStreamsData.shareCount;
        }
        String str11 = str5;
        if ((i & 64) != 0) {
            str6 = liveStreamsData.sharePopRatio;
        }
        return liveStreamsData.copy(z, str7, str8, str9, str10, str11, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.permission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.streamCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.streamPopRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.viewCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.viewPopRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.shareCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sharePopRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveStreamsData copy(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        return new LiveStreamsData(z, str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof LiveStreamsData)) {
            return false;
        }
        LiveStreamsData liveStreamsData = (LiveStreamsData) obj;
        return this.permission == liveStreamsData.permission && Intrinsics.EZpvd((Object) this.streamCount, (Object) liveStreamsData.streamCount) && Intrinsics.EZpvd((Object) this.streamPopRatio, (Object) liveStreamsData.streamPopRatio) && Intrinsics.EZpvd((Object) this.viewCount, (Object) liveStreamsData.viewCount) && Intrinsics.EZpvd((Object) this.viewPopRatio, (Object) liveStreamsData.viewPopRatio) && Intrinsics.EZpvd((Object) this.shareCount, (Object) liveStreamsData.shareCount) && Intrinsics.EZpvd((Object) this.sharePopRatio, (Object) liveStreamsData.sharePopRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPermission() {
        return this.permission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareCount() {
        return this.shareCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSharePopRatio() {
        return this.sharePopRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStreamCount() {
        return this.streamCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStreamPopRatio() {
        return this.streamPopRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getViewCount() {
        return this.viewCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getViewPopRatio() {
        return this.viewPopRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.permission);
        String str = this.streamCount;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.streamPopRatio;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.viewCount;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.viewPopRatio;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.shareCount;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.sharePopRatio;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiveStreamsData(permission=" + this.permission + ", streamCount=" + this.streamCount + ", streamPopRatio=" + this.streamPopRatio + ", viewCount=" + this.viewCount + ", viewPopRatio=" + this.viewPopRatio + ", shareCount=" + this.shareCount + ", sharePopRatio=" + this.sharePopRatio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.permission ? 1 : 0);
        parcel.writeString(this.streamCount);
        parcel.writeString(this.streamPopRatio);
        parcel.writeString(this.viewCount);
        parcel.writeString(this.viewPopRatio);
        parcel.writeString(this.shareCount);
        parcel.writeString(this.sharePopRatio);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_create_centre.data.LiveStreamsData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LiveStreamsData> serializer() {
            return LiveStreamsData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LiveStreamsData(int i, boolean z, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        this.permission = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.streamCount = "";
        } else {
            this.streamCount = str;
        }
        if ((i & 4) == 0) {
            this.streamPopRatio = "";
        } else {
            this.streamPopRatio = str2;
        }
        if ((i & 8) == 0) {
            this.viewCount = "";
        } else {
            this.viewCount = str3;
        }
        if ((i & 16) == 0) {
            this.viewPopRatio = "";
        } else {
            this.viewPopRatio = str4;
        }
        if ((i & 32) == 0) {
            this.shareCount = "";
        } else {
            this.shareCount = str5;
        }
        if ((i & 64) == 0) {
            this.sharePopRatio = "";
        } else {
            this.sharePopRatio = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(LiveStreamsData liveStreamsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || liveStreamsData.permission) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, liveStreamsData.permission);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) liveStreamsData.streamCount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, liveStreamsData.streamCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) liveStreamsData.streamPopRatio, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, liveStreamsData.streamPopRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) liveStreamsData.viewCount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, liveStreamsData.viewCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) liveStreamsData.viewPopRatio, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, liveStreamsData.viewPopRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) liveStreamsData.shareCount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, liveStreamsData.shareCount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) liveStreamsData.sharePopRatio, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, liveStreamsData.sharePopRatio);
    }

    public LiveStreamsData(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        this.permission = z;
        this.streamCount = str;
        this.streamPopRatio = str2;
        this.viewCount = str3;
        this.viewPopRatio = str4;
        this.shareCount = str5;
        this.sharePopRatio = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.String) : (""))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:35) call: com.okinc.planet.biz_create_centre.data.LiveStreamsData.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LiveStreamsData(boolean z, String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) == 0 ? str6 : "");
    }
}
