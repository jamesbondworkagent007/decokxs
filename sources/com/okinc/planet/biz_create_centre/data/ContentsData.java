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
public final class ContentsData implements Parcelable {
    public static final int $stable = 0;
    private final String likeCount;
    private final String likePopRatio;
    private final String replyCount;
    private final String replyPopRatio;
    private final String viewCount;
    private final String viewPopRatio;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ContentsData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ContentsData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContentsData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ContentsData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContentsData[] newArray(int i) {
            return new ContentsData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ContentsData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ContentsData copy$default(ContentsData contentsData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentsData.likeCount;
        }
        if ((i & 2) != 0) {
            str2 = contentsData.likePopRatio;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = contentsData.viewCount;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = contentsData.viewPopRatio;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = contentsData.replyCount;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = contentsData.replyPopRatio;
        }
        return contentsData.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.likeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.likePopRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.viewCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.viewPopRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.replyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.replyPopRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContentsData copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new ContentsData(str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof ContentsData)) {
            return false;
        }
        ContentsData contentsData = (ContentsData) obj;
        return Intrinsics.EZpvd((Object) this.likeCount, (Object) contentsData.likeCount) && Intrinsics.EZpvd((Object) this.likePopRatio, (Object) contentsData.likePopRatio) && Intrinsics.EZpvd((Object) this.viewCount, (Object) contentsData.viewCount) && Intrinsics.EZpvd((Object) this.viewPopRatio, (Object) contentsData.viewPopRatio) && Intrinsics.EZpvd((Object) this.replyCount, (Object) contentsData.replyCount) && Intrinsics.EZpvd((Object) this.replyPopRatio, (Object) contentsData.replyPopRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLikeCount() {
        return this.likeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLikePopRatio() {
        return this.likePopRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReplyCount() {
        return this.replyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReplyPopRatio() {
        return this.replyPopRatio;
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
        String str = this.likeCount;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.likePopRatio;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.viewCount;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.viewPopRatio;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.replyCount;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.replyPopRatio;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContentsData(likeCount=" + this.likeCount + ", likePopRatio=" + this.likePopRatio + ", viewCount=" + this.viewCount + ", viewPopRatio=" + this.viewPopRatio + ", replyCount=" + this.replyCount + ", replyPopRatio=" + this.replyPopRatio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.likeCount);
        parcel.writeString(this.likePopRatio);
        parcel.writeString(this.viewCount);
        parcel.writeString(this.viewPopRatio);
        parcel.writeString(this.replyCount);
        parcel.writeString(this.replyPopRatio);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_create_centre.data.ContentsData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContentsData> serializer() {
            return ContentsData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContentsData(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.likeCount = "";
        } else {
            this.likeCount = str;
        }
        if ((i & 2) == 0) {
            this.likePopRatio = "";
        } else {
            this.likePopRatio = str2;
        }
        if ((i & 4) == 0) {
            this.viewCount = "";
        } else {
            this.viewCount = str3;
        }
        if ((i & 8) == 0) {
            this.viewPopRatio = "";
        } else {
            this.viewPopRatio = str4;
        }
        if ((i & 16) == 0) {
            this.replyCount = "";
        } else {
            this.replyCount = str5;
        }
        if ((i & 32) == 0) {
            this.replyPopRatio = "";
        } else {
            this.replyPopRatio = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(ContentsData contentsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) contentsData.likeCount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, contentsData.likeCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) contentsData.likePopRatio, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, contentsData.likePopRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) contentsData.viewCount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, contentsData.viewCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) contentsData.viewPopRatio, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, contentsData.viewPopRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) contentsData.replyCount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, contentsData.replyCount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) contentsData.replyPopRatio, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, contentsData.replyPopRatio);
    }

    public ContentsData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.likeCount = str;
        this.likePopRatio = str2;
        this.viewCount = str3;
        this.viewPopRatio = str4;
        this.replyCount = str5;
        this.replyPopRatio = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:23) call: com.okinc.planet.biz_create_centre.data.ContentsData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ContentsData(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
