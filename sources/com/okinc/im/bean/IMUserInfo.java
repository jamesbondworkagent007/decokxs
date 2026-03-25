package com.okinc.im.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class IMUserInfo implements Parcelable {
    private final String avatarUrl;
    private final String imId;
    private final OfficialTagInfo officialTagInfo;
    private final String username;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = OfficialTagInfo.$stable;
    public static final Parcelable.Creator<IMUserInfo> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<IMUserInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IMUserInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new IMUserInfo(parcel.readString(), parcel.readString(), parcel.readString(), (OfficialTagInfo) parcel.readParcelable(IMUserInfo.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IMUserInfo[] newArray(int i) {
            return new IMUserInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IMUserInfo() {
        this((String) null, (String) null, (String) null, (OfficialTagInfo) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ IMUserInfo copy$default(IMUserInfo iMUserInfo, String str, String str2, String str3, OfficialTagInfo officialTagInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iMUserInfo.imId;
        }
        if ((i & 2) != 0) {
            str2 = iMUserInfo.avatarUrl;
        }
        if ((i & 4) != 0) {
            str3 = iMUserInfo.username;
        }
        if ((i & 8) != 0) {
            officialTagInfo = iMUserInfo.officialTagInfo;
        }
        return iMUserInfo.copy(str, str2, str3, officialTagInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.imId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.avatarUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo component4() {
        return this.officialTagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IMUserInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, OfficialTagInfo officialTagInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new IMUserInfo(str, str2, str3, officialTagInfo);
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
        if (!(obj instanceof IMUserInfo)) {
            return false;
        }
        IMUserInfo iMUserInfo = (IMUserInfo) obj;
        return Intrinsics.EZpvd((Object) this.imId, (Object) iMUserInfo.imId) && Intrinsics.EZpvd((Object) this.avatarUrl, (Object) iMUserInfo.avatarUrl) && Intrinsics.EZpvd((Object) this.username, (Object) iMUserInfo.username) && Intrinsics.EZpvd(this.officialTagInfo, iMUserInfo.officialTagInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImId() {
        return this.imId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo getOfficialTagInfo() {
        return this.officialTagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsername() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.imId.hashCode();
        int iHashCode2 = this.avatarUrl.hashCode();
        int iHashCode3 = this.username.hashCode();
        OfficialTagInfo officialTagInfo = this.officialTagInfo;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (officialTagInfo == null ? 0 : officialTagInfo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IMUserInfo(imId=" + this.imId + ", avatarUrl=" + this.avatarUrl + ", username=" + this.username + ", officialTagInfo=" + this.officialTagInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.imId);
        parcel.writeString(this.avatarUrl);
        parcel.writeString(this.username);
        parcel.writeParcelable(this.officialTagInfo, i);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.bean.IMUserInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IMUserInfo> serializer() {
            return IMUserInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IMUserInfo(int i, String str, String str2, String str3, OfficialTagInfo officialTagInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.imId = "";
        } else {
            this.imId = str;
        }
        if ((i & 2) == 0) {
            this.avatarUrl = "";
        } else {
            this.avatarUrl = str2;
        }
        if ((i & 4) == 0) {
            this.username = "";
        } else {
            this.username = str3;
        }
        if ((i & 8) == 0) {
            this.officialTagInfo = null;
        } else {
            this.officialTagInfo = officialTagInfo;
        }
    }

    public static final /* synthetic */ void write$Self$OKIM_okim_api(IMUserInfo iMUserInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) iMUserInfo.imId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, iMUserInfo.imId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) iMUserInfo.avatarUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, iMUserInfo.avatarUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) iMUserInfo.username, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, iMUserInfo.username);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && iMUserInfo.officialTagInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, OfficialTagInfo$$serializer.INSTANCE, iMUserInfo.officialTagInfo);
    }

    public IMUserInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, OfficialTagInfo officialTagInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.imId = str;
        this.avatarUrl = str2;
        this.username = str3;
        this.officialTagInfo = officialTagInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.remote.OfficialTagInfo:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.OfficialTagInfo) : (r5v0 com.okinc.okimcore.model.remote.OfficialTagInfo))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.remote.OfficialTagInfo):void (m)] (LINE:15) call: com.okinc.im.bean.IMUserInfo.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.remote.OfficialTagInfo):void type: THIS */
    public /* synthetic */ IMUserInfo(String str, String str2, String str3, OfficialTagInfo officialTagInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : officialTagInfo);
    }
}
