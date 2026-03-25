package com.okinc.okimcore.model.im.inhouseim.ws;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.inhouseim.UserTagType;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo$$serializer;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class ReactionUserDetail implements Parcelable {
    private final String avatarUrl;
    private final Integer groupRole;
    private final String name;
    private final OfficialTagInfo officialTagInfo;
    private final List<UserTagType> userTagType;
    private final String userUid;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ReactionUserDetail> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(UserTagType.Companion.serializer())};

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<ReactionUserDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReactionUserDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList arrayList = null;
            OfficialTagInfo officialTagInfoCreateFromParcel = parcel.readInt() == 0 ? null : OfficialTagInfo.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(UserTagType.valueOf(parcel.readString()));
                }
            }
            return new ReactionUserDetail(string, string2, officialTagInfoCreateFromParcel, string3, numValueOf, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReactionUserDetail[] newArray(int i) {
            return new ReactionUserDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.okimcore.model.im.inhouseim.ws.ReactionUserDetail */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReactionUserDetail copy$default(ReactionUserDetail reactionUserDetail, String str, String str2, OfficialTagInfo officialTagInfo, String str3, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reactionUserDetail.name;
        }
        if ((i & 2) != 0) {
            str2 = reactionUserDetail.avatarUrl;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            officialTagInfo = reactionUserDetail.officialTagInfo;
        }
        OfficialTagInfo officialTagInfo2 = officialTagInfo;
        if ((i & 8) != 0) {
            str3 = reactionUserDetail.userUid;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            num = reactionUserDetail.groupRole;
        }
        Integer num2 = num;
        if ((i & 32) != 0) {
            list = reactionUserDetail.userTagType;
        }
        return reactionUserDetail.copy(str, str4, officialTagInfo2, str5, num2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.avatarUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo component3() {
        return this.officialTagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.groupRole;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UserTagType> component6() {
        return this.userTagType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReactionUserDetail copy(String str, @NotNull String str2, OfficialTagInfo officialTagInfo, @NotNull String str3, Integer num, List<? extends UserTagType> list) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ReactionUserDetail(str, str2, officialTagInfo, str3, num, list);
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
        if (!(obj instanceof ReactionUserDetail)) {
            return false;
        }
        ReactionUserDetail reactionUserDetail = (ReactionUserDetail) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) reactionUserDetail.name) && Intrinsics.EZpvd((Object) this.avatarUrl, (Object) reactionUserDetail.avatarUrl) && Intrinsics.EZpvd(this.officialTagInfo, reactionUserDetail.officialTagInfo) && Intrinsics.EZpvd((Object) this.userUid, (Object) reactionUserDetail.userUid) && Intrinsics.EZpvd(this.groupRole, reactionUserDetail.groupRole) && Intrinsics.EZpvd(this.userTagType, reactionUserDetail.userTagType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getGroupRole() {
        return this.groupRole;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo getOfficialTagInfo() {
        return this.officialTagInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UserTagType> getUserTagType() {
        return this.userTagType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserUid() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.name;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.avatarUrl.hashCode();
        OfficialTagInfo officialTagInfo = this.officialTagInfo;
        int iHashCode3 = officialTagInfo == null ? 0 : officialTagInfo.hashCode();
        int iHashCode4 = this.userUid.hashCode();
        Integer num = this.groupRole;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        List<UserTagType> list = this.userTagType;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReactionUserDetail(name=" + this.name + ", avatarUrl=" + this.avatarUrl + ", officialTagInfo=" + this.officialTagInfo + ", userUid=" + this.userUid + ", groupRole=" + this.groupRole + ", userTagType=" + this.userTagType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.name);
        parcel.writeString(this.avatarUrl);
        OfficialTagInfo officialTagInfo = this.officialTagInfo;
        if (officialTagInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            officialTagInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.userUid);
        Integer num = this.groupRole;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<UserTagType> list = this.userTagType;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<UserTagType> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.ReactionUserDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReactionUserDetail> serializer() {
            return ReactionUserDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReactionUserDetail(int i, String str, String str2, OfficialTagInfo officialTagInfo, String str3, Integer num, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (14 != (i & 14)) {
            PluginExceptionsKt.throwMissingFieldException(i, 14, ReactionUserDetail$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        this.avatarUrl = str2;
        this.officialTagInfo = officialTagInfo;
        this.userUid = str3;
        if ((i & 16) == 0) {
            this.groupRole = null;
        } else {
            this.groupRole = num;
        }
        if ((i & 32) == 0) {
            this.userTagType = null;
        } else {
            this.userTagType = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(ReactionUserDetail reactionUserDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || reactionUserDetail.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, reactionUserDetail.name);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, reactionUserDetail.avatarUrl);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, OfficialTagInfo$$serializer.INSTANCE, reactionUserDetail.officialTagInfo);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, reactionUserDetail.userUid);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || reactionUserDetail.groupRole != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, reactionUserDetail.groupRole);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && reactionUserDetail.userTagType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], reactionUserDetail.userTagType);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.okinc.okimcore.model.im.inhouseim.UserTagType> */
    /* JADX WARN: Multi-variable type inference failed */
    public ReactionUserDetail(String str, @NotNull String str2, OfficialTagInfo officialTagInfo, @NotNull String str3, Integer num, List<? extends UserTagType> list) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.name = str;
        this.avatarUrl = str2;
        this.officialTagInfo = officialTagInfo;
        this.userUid = str3;
        this.groupRole = num;
        this.userTagType = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (r11v0 java.lang.String)
  (r12v0 com.okinc.okimcore.model.remote.OfficialTagInfo)
  (r13v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r14v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r15v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, com.okinc.okimcore.model.remote.OfficialTagInfo, java.lang.String, java.lang.Integer, java.util.List<? extends com.okinc.okimcore.model.im.inhouseim.UserTagType>):void (m)] (LINE:32) call: com.okinc.okimcore.model.im.inhouseim.ws.ReactionUserDetail.<init>(java.lang.String, java.lang.String, com.okinc.okimcore.model.remote.OfficialTagInfo, java.lang.String, java.lang.Integer, java.util.List):void type: THIS */
    public /* synthetic */ ReactionUserDetail(String str, String str2, OfficialTagInfo officialTagInfo, String str3, Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, officialTagInfo, str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : list);
    }
}
