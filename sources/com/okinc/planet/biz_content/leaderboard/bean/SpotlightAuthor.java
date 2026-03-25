package com.okinc.planet.biz_content.leaderboard.bean;

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
public final class SpotlightAuthor implements Parcelable {
    public static final int $stable = 0;
    private final String authorId;
    private final String nickName;
    private final String officialStatus;
    private final String portrait;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SpotlightAuthor> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SpotlightAuthor> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotlightAuthor createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SpotlightAuthor(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotlightAuthor[] newArray(int i) {
            return new SpotlightAuthor[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotlightAuthor() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SpotlightAuthor copy$default(SpotlightAuthor spotlightAuthor, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotlightAuthor.authorId;
        }
        if ((i & 2) != 0) {
            str2 = spotlightAuthor.nickName;
        }
        if ((i & 4) != 0) {
            str3 = spotlightAuthor.portrait;
        }
        if ((i & 8) != 0) {
            str4 = spotlightAuthor.officialStatus;
        }
        return spotlightAuthor.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.authorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.officialStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotlightAuthor copy(String str, String str2, String str3, String str4) {
        return new SpotlightAuthor(str, str2, str3, str4);
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
        if (!(obj instanceof SpotlightAuthor)) {
            return false;
        }
        SpotlightAuthor spotlightAuthor = (SpotlightAuthor) obj;
        return Intrinsics.EZpvd((Object) this.authorId, (Object) spotlightAuthor.authorId) && Intrinsics.EZpvd((Object) this.nickName, (Object) spotlightAuthor.nickName) && Intrinsics.EZpvd((Object) this.portrait, (Object) spotlightAuthor.portrait) && Intrinsics.EZpvd((Object) this.officialStatus, (Object) spotlightAuthor.officialStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuthorId() {
        return this.authorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOfficialStatus() {
        return this.officialStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPortrait() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.authorId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.nickName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.portrait;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.officialStatus;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotlightAuthor(authorId=" + this.authorId + ", nickName=" + this.nickName + ", portrait=" + this.portrait + ", officialStatus=" + this.officialStatus + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.authorId);
        parcel.writeString(this.nickName);
        parcel.writeString(this.portrait);
        parcel.writeString(this.officialStatus);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_content.leaderboard.bean.SpotlightAuthor.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotlightAuthor> serializer() {
            return SpotlightAuthor$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotlightAuthor(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.authorId = null;
        } else {
            this.authorId = str;
        }
        if ((i & 2) == 0) {
            this.nickName = null;
        } else {
            this.nickName = str2;
        }
        if ((i & 4) == 0) {
            this.portrait = null;
        } else {
            this.portrait = str3;
        }
        if ((i & 8) == 0) {
            this.officialStatus = null;
        } else {
            this.officialStatus = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(SpotlightAuthor spotlightAuthor, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || spotlightAuthor.authorId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, spotlightAuthor.authorId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || spotlightAuthor.nickName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, spotlightAuthor.nickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || spotlightAuthor.portrait != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, spotlightAuthor.portrait);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && spotlightAuthor.officialStatus == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, spotlightAuthor.officialStatus);
    }

    public SpotlightAuthor(String str, String str2, String str3, String str4) {
        this.authorId = str;
        this.nickName = str2;
        this.portrait = str3;
        this.officialStatus = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:47) call: com.okinc.planet.biz_content.leaderboard.bean.SpotlightAuthor.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SpotlightAuthor(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
