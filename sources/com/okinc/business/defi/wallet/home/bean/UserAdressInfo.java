package com.okinc.business.defi.wallet.home.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class UserAdressInfo {
    public final String addressRemark;
    public final int collectType;
    public final Long firstActiveTime;
    public final List<LabelType> labelList;
    public final String targetAddress;
    public final String twitterAvatar;
    public final String twitterName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(LabelType$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.defi.wallet.home.bean.UserAdressInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserAdressInfo copy$default(UserAdressInfo userAdressInfo, String str, String str2, int i, String str3, String str4, Long l, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = userAdressInfo.targetAddress;
        }
        if ((i2 & 2) != 0) {
            str2 = userAdressInfo.addressRemark;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            i = userAdressInfo.collectType;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = userAdressInfo.twitterAvatar;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = userAdressInfo.twitterName;
        }
        String str7 = str4;
        if ((i2 & 32) != 0) {
            l = userAdressInfo.firstActiveTime;
        }
        Long l2 = l;
        if ((i2 & 64) != 0) {
            list = userAdressInfo.labelList;
        }
        return userAdressInfo.KWHzl(str, str5, i3, str6, str7, l2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserAdressInfo KWHzl(@NotNull String str, @NotNull String str2, int i, String str3, String str4, Long l, @NotNull List<LabelType> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new UserAdressInfo(str, str2, i, str3, str4, l, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.twitterName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.twitterAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAdressInfo)) {
            return false;
        }
        UserAdressInfo userAdressInfo = (UserAdressInfo) obj;
        return Intrinsics.EZpvd((Object) this.targetAddress, (Object) userAdressInfo.targetAddress) && Intrinsics.EZpvd((Object) this.addressRemark, (Object) userAdressInfo.addressRemark) && this.collectType == userAdressInfo.collectType && Intrinsics.EZpvd((Object) this.twitterAvatar, (Object) userAdressInfo.twitterAvatar) && Intrinsics.EZpvd((Object) this.twitterName, (Object) userAdressInfo.twitterName) && Intrinsics.EZpvd(this.firstActiveTime, userAdressInfo.firstActiveTime) && Intrinsics.EZpvd(this.labelList, userAdressInfo.labelList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.targetAddress.hashCode();
        int iHashCode2 = this.addressRemark.hashCode();
        int iHashCode3 = Integer.hashCode(this.collectType);
        String str = this.twitterAvatar;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.twitterName;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        Long l = this.firstActiveTime;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (l != null ? l.hashCode() : 0)) * 31) + this.labelList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserAdressInfo(targetAddress=" + this.targetAddress + ", addressRemark=" + this.addressRemark + ", collectType=" + this.collectType + ", twitterAvatar=" + this.twitterAvatar + ", twitterName=" + this.twitterName + ", firstActiveTime=" + this.firstActiveTime + ", labelList=" + this.labelList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.bean.UserAdressInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserAdressInfo> serializer() {
            return UserAdressInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserAdressInfo(int i, String str, String str2, int i2, String str3, String str4, Long l, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (71 != (i & 71)) {
            PluginExceptionsKt.throwMissingFieldException(i, 71, UserAdressInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.targetAddress = str;
        this.addressRemark = str2;
        this.collectType = i2;
        if ((i & 8) == 0) {
            this.twitterAvatar = null;
        } else {
            this.twitterAvatar = str3;
        }
        if ((i & 16) == 0) {
            this.twitterName = null;
        } else {
            this.twitterName = str4;
        }
        if ((i & 32) == 0) {
            this.firstActiveTime = null;
        } else {
            this.firstActiveTime = l;
        }
        this.labelList = list;
    }

    public static final /* synthetic */ void KWHzl(UserAdressInfo userAdressInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, userAdressInfo.targetAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, userAdressInfo.addressRemark);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, userAdressInfo.collectType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || userAdressInfo.twitterAvatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, userAdressInfo.twitterAvatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || userAdressInfo.twitterName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, userAdressInfo.twitterName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || userAdressInfo.firstActiveTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, userAdressInfo.firstActiveTime);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], userAdressInfo.labelList);
    }

    public UserAdressInfo(@NotNull String str, @NotNull String str2, int i, String str3, String str4, Long l, @NotNull List<LabelType> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.targetAddress = str;
        this.addressRemark = str2;
        this.collectType = i;
        this.twitterAvatar = str3;
        this.twitterName = str4;
        this.firstActiveTime = l;
        this.labelList = list;
    }
}
