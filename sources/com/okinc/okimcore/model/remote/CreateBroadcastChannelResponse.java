package com.okinc.okimcore.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class CreateBroadcastChannelResponse implements Parcelable {
    public final Long broadcastChannelId;
    public final Integer total;
    public final List<UserInfo> userInfoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CreateBroadcastChannelResponse> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(CreateBroadcastChannelResponse$UserInfo$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<CreateBroadcastChannelResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateBroadcastChannelResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(UserInfo.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new CreateBroadcastChannelResponse(lValueOf, numValueOf, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateBroadcastChannelResponse[] newArray(int i) {
            return new CreateBroadcastChannelResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.remote.CreateBroadcastChannelResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateBroadcastChannelResponse copy$default(CreateBroadcastChannelResponse createBroadcastChannelResponse, Long l, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = createBroadcastChannelResponse.broadcastChannelId;
        }
        if ((i & 2) != 0) {
            num = createBroadcastChannelResponse.total;
        }
        if ((i & 4) != 0) {
            list = createBroadcastChannelResponse.userInfoList;
        }
        return createBroadcastChannelResponse.AEQbTJ(l, num, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateBroadcastChannelResponse AEQbTJ(Long l, Integer num, List<UserInfo> list) {
        return new CreateBroadcastChannelResponse(l, num, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long AEQbTJ() {
        return this.broadcastChannelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer EZpvd() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UserInfo> OLrzqt() {
        return this.userInfoList;
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
        if (!(obj instanceof CreateBroadcastChannelResponse)) {
            return false;
        }
        CreateBroadcastChannelResponse createBroadcastChannelResponse = (CreateBroadcastChannelResponse) obj;
        return Intrinsics.EZpvd(this.broadcastChannelId, createBroadcastChannelResponse.broadcastChannelId) && Intrinsics.EZpvd(this.total, createBroadcastChannelResponse.total) && Intrinsics.EZpvd(this.userInfoList, createBroadcastChannelResponse.userInfoList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.broadcastChannelId;
        int iHashCode = l == null ? 0 : l.hashCode();
        Integer num = this.total;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        List<UserInfo> list = this.userInfoList;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateBroadcastChannelResponse(broadcastChannelId=" + this.broadcastChannelId + ", total=" + this.total + ", userInfoList=" + this.userInfoList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.broadcastChannelId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num = this.total;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<UserInfo> list = this.userInfoList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<UserInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.CreateBroadcastChannelResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateBroadcastChannelResponse> serializer() {
            return CreateBroadcastChannelResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateBroadcastChannelResponse(int i, Long l, Integer num, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, CreateBroadcastChannelResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.broadcastChannelId = l;
        this.total = num;
        this.userInfoList = list;
    }

    public static final /* synthetic */ void copydefault(CreateBroadcastChannelResponse createBroadcastChannelResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, createBroadcastChannelResponse.broadcastChannelId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, createBroadcastChannelResponse.total);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], createBroadcastChannelResponse.userInfoList);
    }

    public CreateBroadcastChannelResponse(Long l, Integer num, List<UserInfo> list) {
        this.broadcastChannelId = l;
        this.total = num;
        this.userInfoList = list;
    }

    @Serializable
    public static final class UserInfo implements Parcelable {
        public static final int $stable = 0;
        public final String alias;
        public final String enNickname;
        public final String nickname;
        public final Long userUid;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<UserInfo> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes24.dex */
        public static final class Creator implements Parcelable.Creator<UserInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new UserInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UserInfo[] newArray(int i) {
                return new UserInfo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String str, String str2, String str3, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userInfo.alias;
            }
            if ((i & 2) != 0) {
                str2 = userInfo.enNickname;
            }
            if ((i & 4) != 0) {
                str3 = userInfo.nickname;
            }
            if ((i & 8) != 0) {
                l = userInfo.userUid;
            }
            return userInfo.EZpvd(str, str2, str3, l);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.nickname;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UserInfo EZpvd(String str, String str2, String str3, Long l) {
            return new UserInfo(str, str2, str3, l);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.alias;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.enNickname;
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
            if (!(obj instanceof UserInfo)) {
                return false;
            }
            UserInfo userInfo = (UserInfo) obj;
            return Intrinsics.EZpvd((Object) this.alias, (Object) userInfo.alias) && Intrinsics.EZpvd((Object) this.enNickname, (Object) userInfo.enNickname) && Intrinsics.EZpvd((Object) this.nickname, (Object) userInfo.nickname) && Intrinsics.EZpvd(this.userUid, userInfo.userUid);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.alias;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.enNickname;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.nickname;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            Long l = this.userUid;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l != null ? l.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UserInfo(alias=" + this.alias + ", enNickname=" + this.enNickname + ", nickname=" + this.nickname + ", userUid=" + this.userUid + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.alias);
            parcel.writeString(this.enNickname);
            parcel.writeString(this.nickname);
            Long l = this.userUid;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.CreateBroadcastChannelResponse.UserInfo.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<UserInfo> serializer() {
                return CreateBroadcastChannelResponse$UserInfo$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ UserInfo(int i, String str, String str2, String str3, Long l, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i, 15, CreateBroadcastChannelResponse$UserInfo$$serializer.INSTANCE.getDescriptor());
            }
            this.alias = str;
            this.enNickname = str2;
            this.nickname = str3;
            this.userUid = l;
        }

        public static final /* synthetic */ void copydefault(UserInfo userInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, userInfo.alias);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, userInfo.enNickname);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, userInfo.nickname);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, userInfo.userUid);
        }

        public UserInfo(String str, String str2, String str3, Long l) {
            this.alias = str;
            this.enNickname = str2;
            this.nickname = str3;
            this.userUid = l;
        }
    }
}
