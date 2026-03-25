package com.okinc.crcore.coreapi.net.responsebean.content;

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
public final class CommunityAuthorResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final String authorId;
    private final Integer followerCount;
    private final String nickName;
    private final String portrait;
    private final Integer type;
    private final String username;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CommunityAuthorResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CommunityAuthorResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommunityAuthorResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CommunityAuthorResponseBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommunityAuthorResponseBean[] newArray(int i) {
            return new CommunityAuthorResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CommunityAuthorResponseBean() {
        this((String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CommunityAuthorResponseBean copy$default(CommunityAuthorResponseBean communityAuthorResponseBean, String str, String str2, String str3, Integer num, Integer num2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = communityAuthorResponseBean.authorId;
        }
        if ((i & 2) != 0) {
            str2 = communityAuthorResponseBean.portrait;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = communityAuthorResponseBean.nickName;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            num = communityAuthorResponseBean.followerCount;
        }
        Integer num3 = num;
        if ((i & 16) != 0) {
            num2 = communityAuthorResponseBean.type;
        }
        Integer num4 = num2;
        if ((i & 32) != 0) {
            str4 = communityAuthorResponseBean.username;
        }
        return communityAuthorResponseBean.copy(str, str5, str6, num3, num4, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.authorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.followerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommunityAuthorResponseBean copy(@NotNull String str, String str2, String str3, Integer num, Integer num2, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CommunityAuthorResponseBean(str, str2, str3, num, num2, str4);
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
        if (!(obj instanceof CommunityAuthorResponseBean)) {
            return false;
        }
        CommunityAuthorResponseBean communityAuthorResponseBean = (CommunityAuthorResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.authorId, (Object) communityAuthorResponseBean.authorId) && Intrinsics.EZpvd((Object) this.portrait, (Object) communityAuthorResponseBean.portrait) && Intrinsics.EZpvd((Object) this.nickName, (Object) communityAuthorResponseBean.nickName) && Intrinsics.EZpvd(this.followerCount, communityAuthorResponseBean.followerCount) && Intrinsics.EZpvd(this.type, communityAuthorResponseBean.type) && Intrinsics.EZpvd((Object) this.username, (Object) communityAuthorResponseBean.username);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuthorId() {
        return this.authorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFollowerCount() {
        return this.followerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPortrait() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsername() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.authorId.hashCode();
        String str = this.portrait;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.nickName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.followerCount;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        Integer num2 = this.type;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        String str3 = this.username;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CommunityAuthorResponseBean(authorId=" + this.authorId + ", portrait=" + this.portrait + ", nickName=" + this.nickName + ", followerCount=" + this.followerCount + ", type=" + this.type + ", username=" + this.username + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.authorId);
        parcel.writeString(this.portrait);
        parcel.writeString(this.nickName);
        Integer num = this.followerCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.type;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.username);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.content.CommunityAuthorResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommunityAuthorResponseBean> serializer() {
            return CommunityAuthorResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CommunityAuthorResponseBean(int i, String str, String str2, String str3, Integer num, Integer num2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        this.authorId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.portrait = null;
        } else {
            this.portrait = str2;
        }
        if ((i & 4) == 0) {
            this.nickName = null;
        } else {
            this.nickName = str3;
        }
        if ((i & 8) == 0) {
            this.followerCount = null;
        } else {
            this.followerCount = num;
        }
        if ((i & 16) == 0) {
            this.type = null;
        } else {
            this.type = num2;
        }
        if ((i & 32) == 0) {
            this.username = null;
        } else {
            this.username = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CommunityAuthorResponseBean communityAuthorResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) communityAuthorResponseBean.authorId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, communityAuthorResponseBean.authorId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || communityAuthorResponseBean.portrait != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, communityAuthorResponseBean.portrait);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || communityAuthorResponseBean.nickName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, communityAuthorResponseBean.nickName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || communityAuthorResponseBean.followerCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, communityAuthorResponseBean.followerCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || communityAuthorResponseBean.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, communityAuthorResponseBean.type);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && communityAuthorResponseBean.username == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, communityAuthorResponseBean.username);
    }

    public CommunityAuthorResponseBean(@NotNull String str, String str2, String str3, Integer num, Integer num2, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.authorId = str;
        this.portrait = str2;
        this.nickName = str3;
        this.followerCount = num;
        this.type = num2;
        this.username = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r8v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r11v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r10v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String):void (m)] (LINE:13) call: com.okinc.crcore.coreapi.net.responsebean.content.CommunityAuthorResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ CommunityAuthorResponseBean(String str, String str2, String str3, Integer num, Integer num2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) == 0 ? str4 : null);
    }
}
