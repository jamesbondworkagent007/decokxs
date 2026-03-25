package com.okinc.im.bean;

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

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class IMRelationInfo implements Parcelable {
    public static final int $stable = 0;
    private final String avatar;
    private final String displayName;
    private final String phoneHash;
    private final String userUid;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<IMRelationInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<IMRelationInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IMRelationInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new IMRelationInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IMRelationInfo[] newArray(int i) {
            return new IMRelationInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ IMRelationInfo copy$default(IMRelationInfo iMRelationInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iMRelationInfo.userUid;
        }
        if ((i & 2) != 0) {
            str2 = iMRelationInfo.avatar;
        }
        if ((i & 4) != 0) {
            str3 = iMRelationInfo.displayName;
        }
        if ((i & 8) != 0) {
            str4 = iMRelationInfo.phoneHash;
        }
        return iMRelationInfo.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.phoneHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IMRelationInfo copy(@NotNull String str, String str2, @NotNull String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new IMRelationInfo(str, str2, str3, str4);
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
        if (!(obj instanceof IMRelationInfo)) {
            return false;
        }
        IMRelationInfo iMRelationInfo = (IMRelationInfo) obj;
        return Intrinsics.EZpvd((Object) this.userUid, (Object) iMRelationInfo.userUid) && Intrinsics.EZpvd((Object) this.avatar, (Object) iMRelationInfo.avatar) && Intrinsics.EZpvd((Object) this.displayName, (Object) iMRelationInfo.displayName) && Intrinsics.EZpvd((Object) this.phoneHash, (Object) iMRelationInfo.phoneHash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPhoneHash() {
        return this.phoneHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserUid() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.userUid.hashCode();
        String str = this.avatar;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.displayName.hashCode();
        String str2 = this.phoneHash;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IMRelationInfo(userUid=" + this.userUid + ", avatar=" + this.avatar + ", displayName=" + this.displayName + ", phoneHash=" + this.phoneHash + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.userUid);
        parcel.writeString(this.avatar);
        parcel.writeString(this.displayName);
        parcel.writeString(this.phoneHash);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.bean.IMRelationInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IMRelationInfo> serializer() {
            return IMRelationInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IMRelationInfo(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (13 != (i & 13)) {
            PluginExceptionsKt.throwMissingFieldException(i, 13, IMRelationInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.userUid = str;
        if ((i & 2) == 0) {
            this.avatar = null;
        } else {
            this.avatar = str2;
        }
        this.displayName = str3;
        this.phoneHash = str4;
    }

    public static final /* synthetic */ void write$Self$OKIM_okim_api(IMRelationInfo iMRelationInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, iMRelationInfo.userUid);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || iMRelationInfo.avatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, iMRelationInfo.avatar);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, iMRelationInfo.displayName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, iMRelationInfo.phoneHash);
    }

    public IMRelationInfo(@NotNull String str, String str2, @NotNull String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.userUid = str;
        this.avatar = str2;
        this.displayName = str3;
        this.phoneHash = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.im.bean.IMRelationInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ IMRelationInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, str4);
    }
}
