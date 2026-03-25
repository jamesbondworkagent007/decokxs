package com.okinc.okimcore.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.group.GroupEntryAssetVerificationType;
import com.okinc.okimcore.model.im.group.GroupEntryAssetsVerificationStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupEntryAssetVerificationInfo implements Parcelable {
    public static final int $stable = 0;
    private final String assetAmount;
    private final GroupEntryAssetsVerificationStatus assetVerificationStatus;
    private final GroupEntryAssetVerificationType assetVerificationType;
    private final String currencyCode;
    private final Integer currencyId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GroupEntryAssetVerificationInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {GroupEntryAssetsVerificationStatus.Companion.serializer(), GroupEntryAssetVerificationType.Companion.serializer(), null, null, null};

    public static final class Creator implements Parcelable.Creator<GroupEntryAssetVerificationInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupEntryAssetVerificationInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GroupEntryAssetVerificationInfo(parcel.readInt() == 0 ? null : GroupEntryAssetsVerificationStatus.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GroupEntryAssetVerificationType.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupEntryAssetVerificationInfo[] newArray(int i) {
            return new GroupEntryAssetVerificationInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupEntryAssetVerificationInfo() {
        this((GroupEntryAssetsVerificationStatus) null, (GroupEntryAssetVerificationType) null, (Integer) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GroupEntryAssetVerificationInfo copy$default(GroupEntryAssetVerificationInfo groupEntryAssetVerificationInfo, GroupEntryAssetsVerificationStatus groupEntryAssetsVerificationStatus, GroupEntryAssetVerificationType groupEntryAssetVerificationType, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            groupEntryAssetsVerificationStatus = groupEntryAssetVerificationInfo.assetVerificationStatus;
        }
        if ((i & 2) != 0) {
            groupEntryAssetVerificationType = groupEntryAssetVerificationInfo.assetVerificationType;
        }
        GroupEntryAssetVerificationType groupEntryAssetVerificationType2 = groupEntryAssetVerificationType;
        if ((i & 4) != 0) {
            num = groupEntryAssetVerificationInfo.currencyId;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str = groupEntryAssetVerificationInfo.currencyCode;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = groupEntryAssetVerificationInfo.assetAmount;
        }
        return groupEntryAssetVerificationInfo.copy(groupEntryAssetsVerificationStatus, groupEntryAssetVerificationType2, num2, str3, str2);
    }

    @SerialName("assetVerificationStatus")
    public static /* synthetic */ void getAssetVerificationStatus$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryAssetsVerificationStatus component1() {
        return this.assetVerificationStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryAssetVerificationType component2() {
        return this.assetVerificationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.currencyCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.assetAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryAssetVerificationInfo copy(GroupEntryAssetsVerificationStatus groupEntryAssetsVerificationStatus, GroupEntryAssetVerificationType groupEntryAssetVerificationType, Integer num, String str, String str2) {
        return new GroupEntryAssetVerificationInfo(groupEntryAssetsVerificationStatus, groupEntryAssetVerificationType, num, str, str2);
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
        if (!(obj instanceof GroupEntryAssetVerificationInfo)) {
            return false;
        }
        GroupEntryAssetVerificationInfo groupEntryAssetVerificationInfo = (GroupEntryAssetVerificationInfo) obj;
        return this.assetVerificationStatus == groupEntryAssetVerificationInfo.assetVerificationStatus && this.assetVerificationType == groupEntryAssetVerificationInfo.assetVerificationType && Intrinsics.EZpvd(this.currencyId, groupEntryAssetVerificationInfo.currencyId) && Intrinsics.EZpvd((Object) this.currencyCode, (Object) groupEntryAssetVerificationInfo.currencyCode) && Intrinsics.EZpvd((Object) this.assetAmount, (Object) groupEntryAssetVerificationInfo.assetAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetAmount() {
        return this.assetAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryAssetsVerificationStatus getAssetVerificationStatus() {
        return this.assetVerificationStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryAssetVerificationType getAssetVerificationType() {
        return this.assetVerificationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        GroupEntryAssetsVerificationStatus groupEntryAssetsVerificationStatus = this.assetVerificationStatus;
        int iHashCode = groupEntryAssetsVerificationStatus == null ? 0 : groupEntryAssetsVerificationStatus.hashCode();
        GroupEntryAssetVerificationType groupEntryAssetVerificationType = this.assetVerificationType;
        int iHashCode2 = groupEntryAssetVerificationType == null ? 0 : groupEntryAssetVerificationType.hashCode();
        Integer num = this.currencyId;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str = this.currencyCode;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.assetAmount;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupEntryAssetVerificationInfo(assetVerificationStatus=" + this.assetVerificationStatus + ", assetVerificationType=" + this.assetVerificationType + ", currencyId=" + this.currencyId + ", currencyCode=" + this.currencyCode + ", assetAmount=" + this.assetAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        GroupEntryAssetsVerificationStatus groupEntryAssetsVerificationStatus = this.assetVerificationStatus;
        if (groupEntryAssetsVerificationStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupEntryAssetsVerificationStatus.writeToParcel(parcel, i);
        }
        GroupEntryAssetVerificationType groupEntryAssetVerificationType = this.assetVerificationType;
        if (groupEntryAssetVerificationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupEntryAssetVerificationType.writeToParcel(parcel, i);
        }
        Integer num = this.currencyId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.currencyCode);
        parcel.writeString(this.assetAmount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupEntryAssetVerificationInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupEntryAssetVerificationInfo> serializer() {
            return GroupEntryAssetVerificationInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupEntryAssetVerificationInfo(int i, GroupEntryAssetsVerificationStatus groupEntryAssetsVerificationStatus, GroupEntryAssetVerificationType groupEntryAssetVerificationType, Integer num, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.assetVerificationStatus = null;
        } else {
            this.assetVerificationStatus = groupEntryAssetsVerificationStatus;
        }
        if ((i & 2) == 0) {
            this.assetVerificationType = null;
        } else {
            this.assetVerificationType = groupEntryAssetVerificationType;
        }
        if ((i & 4) == 0) {
            this.currencyId = null;
        } else {
            this.currencyId = num;
        }
        if ((i & 8) == 0) {
            this.currencyCode = null;
        } else {
            this.currencyCode = str;
        }
        if ((i & 16) == 0) {
            this.assetAmount = null;
        } else {
            this.assetAmount = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupEntryAssetVerificationInfo groupEntryAssetVerificationInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || groupEntryAssetVerificationInfo.assetVerificationStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], groupEntryAssetVerificationInfo.assetVerificationStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || groupEntryAssetVerificationInfo.assetVerificationType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], groupEntryAssetVerificationInfo.assetVerificationType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || groupEntryAssetVerificationInfo.currencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, groupEntryAssetVerificationInfo.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || groupEntryAssetVerificationInfo.currencyCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, groupEntryAssetVerificationInfo.currencyCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && groupEntryAssetVerificationInfo.assetAmount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, groupEntryAssetVerificationInfo.assetAmount);
    }

    public GroupEntryAssetVerificationInfo(GroupEntryAssetsVerificationStatus groupEntryAssetsVerificationStatus, GroupEntryAssetVerificationType groupEntryAssetVerificationType, Integer num, String str, String str2) {
        this.assetVerificationStatus = groupEntryAssetsVerificationStatus;
        this.assetVerificationType = groupEntryAssetVerificationType;
        this.currencyId = num;
        this.currencyCode = str;
        this.assetAmount = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:com.okinc.okimcore.model.im.group.GroupEntryAssetsVerificationStatus:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.GroupEntryAssetsVerificationStatus) : (r5v0 com.okinc.okimcore.model.im.group.GroupEntryAssetsVerificationStatus))
  (wrap:com.okinc.okimcore.model.im.group.GroupEntryAssetVerificationType:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.GroupEntryAssetVerificationType) : (r6v0 com.okinc.okimcore.model.im.group.GroupEntryAssetVerificationType))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r7v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(com.okinc.okimcore.model.im.group.GroupEntryAssetsVerificationStatus, com.okinc.okimcore.model.im.group.GroupEntryAssetVerificationType, java.lang.Integer, java.lang.String, java.lang.String):void (m)] (LINE:123) call: com.okinc.okimcore.model.remote.GroupEntryAssetVerificationInfo.<init>(com.okinc.okimcore.model.im.group.GroupEntryAssetsVerificationStatus, com.okinc.okimcore.model.im.group.GroupEntryAssetVerificationType, java.lang.Integer, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ GroupEntryAssetVerificationInfo(GroupEntryAssetsVerificationStatus groupEntryAssetsVerificationStatus, GroupEntryAssetVerificationType groupEntryAssetVerificationType, Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : groupEntryAssetsVerificationStatus, (i & 2) != 0 ? null : groupEntryAssetVerificationType, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
    }
}
