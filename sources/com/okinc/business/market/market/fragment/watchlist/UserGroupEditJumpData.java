package com.okinc.business.market.market.fragment.watchlist;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class UserGroupEditJumpData implements Parcelable {
    public static final int $stable = 0;
    private final String displayName;
    private final String groupName;
    private final boolean isPreset;
    private final String scene;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<UserGroupEditJumpData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UserGroupEditJumpData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserGroupEditJumpData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UserGroupEditJumpData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserGroupEditJumpData[] newArray(int i) {
            return new UserGroupEditJumpData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UserGroupEditJumpData copy$default(UserGroupEditJumpData userGroupEditJumpData, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userGroupEditJumpData.groupName;
        }
        if ((i & 2) != 0) {
            str2 = userGroupEditJumpData.displayName;
        }
        if ((i & 4) != 0) {
            str3 = userGroupEditJumpData.scene;
        }
        if ((i & 8) != 0) {
            z = userGroupEditJumpData.isPreset;
        }
        return userGroupEditJumpData.copy(str, str2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.scene;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserGroupEditJumpData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new UserGroupEditJumpData(str, str2, str3, z);
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
        if (!(obj instanceof UserGroupEditJumpData)) {
            return false;
        }
        UserGroupEditJumpData userGroupEditJumpData = (UserGroupEditJumpData) obj;
        return Intrinsics.EZpvd((Object) this.groupName, (Object) userGroupEditJumpData.groupName) && Intrinsics.EZpvd((Object) this.displayName, (Object) userGroupEditJumpData.displayName) && Intrinsics.EZpvd((Object) this.scene, (Object) userGroupEditJumpData.scene) && this.isPreset == userGroupEditJumpData.isPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScene() {
        return this.scene;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.groupName.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.scene.hashCode()) * 31) + Boolean.hashCode(this.isPreset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPreset() {
        return this.isPreset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserGroupEditJumpData(groupName=" + this.groupName + ", displayName=" + this.displayName + ", scene=" + this.scene + ", isPreset=" + this.isPreset + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.groupName);
        parcel.writeString(this.displayName);
        parcel.writeString(this.scene);
        parcel.writeInt(this.isPreset ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.market.fragment.watchlist.UserGroupEditJumpData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserGroupEditJumpData> serializer() {
            return UserGroupEditJumpData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserGroupEditJumpData(int i, String str, String str2, String str3, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, UserGroupEditJumpData$$serializer.INSTANCE.getDescriptor());
        }
        this.groupName = str;
        this.displayName = str2;
        this.scene = str3;
        this.isPreset = z;
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_impl(UserGroupEditJumpData userGroupEditJumpData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, userGroupEditJumpData.groupName);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, userGroupEditJumpData.displayName);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, userGroupEditJumpData.scene);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 3, userGroupEditJumpData.isPreset);
    }

    public UserGroupEditJumpData(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.groupName = str;
        this.displayName = str2;
        this.scene = str3;
        this.isPreset = z;
    }
}
