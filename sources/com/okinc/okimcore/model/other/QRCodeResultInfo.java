package com.okinc.okimcore.model.other;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.remote.QRCodeType;
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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class QRCodeResultInfo implements Parcelable {
    public static final int $stable = 0;
    private final String avatar;
    private final String creatorId;
    private final int groupMemberCount;
    private final String id;
    private final String name;
    private final QRCodeType type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<QRCodeResultInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {QRCodeType.Companion.serializer(), null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<QRCodeResultInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QRCodeResultInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new QRCodeResultInfo(QRCodeType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QRCodeResultInfo[] newArray(int i) {
            return new QRCodeResultInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ QRCodeResultInfo copy$default(QRCodeResultInfo qRCodeResultInfo, QRCodeType qRCodeType, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            qRCodeType = qRCodeResultInfo.type;
        }
        if ((i2 & 2) != 0) {
            str = qRCodeResultInfo.id;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = qRCodeResultInfo.creatorId;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = qRCodeResultInfo.avatar;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = qRCodeResultInfo.name;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            i = qRCodeResultInfo.groupMemberCount;
        }
        return qRCodeResultInfo.copy(qRCodeType, str5, str6, str7, str8, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QRCodeType component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.creatorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.groupMemberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QRCodeResultInfo copy(@NotNull QRCodeType qRCodeType, @NotNull String str, @NotNull String str2, String str3, String str4, int i) {
        Intrinsics.checkNotNullParameter(qRCodeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new QRCodeResultInfo(qRCodeType, str, str2, str3, str4, i);
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
        if (!(obj instanceof QRCodeResultInfo)) {
            return false;
        }
        QRCodeResultInfo qRCodeResultInfo = (QRCodeResultInfo) obj;
        return this.type == qRCodeResultInfo.type && Intrinsics.EZpvd((Object) this.id, (Object) qRCodeResultInfo.id) && Intrinsics.EZpvd((Object) this.creatorId, (Object) qRCodeResultInfo.creatorId) && Intrinsics.EZpvd((Object) this.avatar, (Object) qRCodeResultInfo.avatar) && Intrinsics.EZpvd((Object) this.name, (Object) qRCodeResultInfo.name) && this.groupMemberCount == qRCodeResultInfo.groupMemberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreatorId() {
        return this.creatorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGroupMemberCount() {
        return this.groupMemberCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QRCodeType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.type.hashCode();
        int iHashCode2 = this.id.hashCode();
        int iHashCode3 = this.creatorId.hashCode();
        String str = this.avatar;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.name;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.groupMemberCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QRCodeResultInfo(type=" + this.type + ", id=" + this.id + ", creatorId=" + this.creatorId + ", avatar=" + this.avatar + ", name=" + this.name + ", groupMemberCount=" + this.groupMemberCount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.id);
        parcel.writeString(this.creatorId);
        parcel.writeString(this.avatar);
        parcel.writeString(this.name);
        parcel.writeInt(this.groupMemberCount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.other.QRCodeResultInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<QRCodeResultInfo> serializer() {
            return QRCodeResultInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ QRCodeResultInfo(int i, QRCodeType qRCodeType, String str, String str2, String str3, String str4, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, QRCodeResultInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.type = qRCodeType;
        this.id = str;
        this.creatorId = str2;
        this.avatar = str3;
        this.name = str4;
        this.groupMemberCount = i2;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(QRCodeResultInfo qRCodeResultInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], qRCodeResultInfo.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, qRCodeResultInfo.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, qRCodeResultInfo.creatorId);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, qRCodeResultInfo.avatar);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, qRCodeResultInfo.name);
        compositeEncoder.encodeIntElement(serialDescriptor, 5, qRCodeResultInfo.groupMemberCount);
    }

    public QRCodeResultInfo(@NotNull QRCodeType qRCodeType, @NotNull String str, @NotNull String str2, String str3, String str4, int i) {
        Intrinsics.checkNotNullParameter(qRCodeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.type = qRCodeType;
        this.id = str;
        this.creatorId = str2;
        this.avatar = str3;
        this.name = str4;
        this.groupMemberCount = i;
    }
}
