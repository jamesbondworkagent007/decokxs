package com.okinc.okimcore.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.group.GroupBillingType;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupBillingStatus;
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
public final class GroupEntryBillingModel implements Parcelable {
    public static final int $stable = 0;
    private final String amount;
    private final GroupBillingType billingType;
    private final String currencyCode;
    private final Integer currencyId;
    private final String currencySign;
    private final PaidGroupBillingStatus enabled;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GroupEntryBillingModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {PaidGroupBillingStatus.Companion.serializer(), null, null, null, null, GroupBillingType.Companion.serializer()};

    public static final class Creator implements Parcelable.Creator<GroupEntryBillingModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupEntryBillingModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GroupEntryBillingModel(parcel.readInt() == 0 ? null : PaidGroupBillingStatus.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? GroupBillingType.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupEntryBillingModel[] newArray(int i) {
            return new GroupEntryBillingModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupEntryBillingModel() {
        this((PaidGroupBillingStatus) null, (Integer) null, (String) null, (String) null, (String) null, (GroupBillingType) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GroupEntryBillingModel copy$default(GroupEntryBillingModel groupEntryBillingModel, PaidGroupBillingStatus paidGroupBillingStatus, Integer num, String str, String str2, String str3, GroupBillingType groupBillingType, int i, Object obj) {
        if ((i & 1) != 0) {
            paidGroupBillingStatus = groupEntryBillingModel.enabled;
        }
        if ((i & 2) != 0) {
            num = groupEntryBillingModel.currencyId;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            str = groupEntryBillingModel.currencyCode;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = groupEntryBillingModel.currencySign;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = groupEntryBillingModel.amount;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            groupBillingType = groupEntryBillingModel.billingType;
        }
        return groupEntryBillingModel.copy(paidGroupBillingStatus, num2, str4, str5, str6, groupBillingType);
    }

    @SerialName("billingType")
    public static /* synthetic */ void getBillingType$annotations() {
    }

    @SerialName("enabled")
    public static /* synthetic */ void getEnabled$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupBillingStatus component1() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currencyCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.currencySign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupBillingType component6() {
        return this.billingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryBillingModel copy(PaidGroupBillingStatus paidGroupBillingStatus, Integer num, String str, String str2, String str3, GroupBillingType groupBillingType) {
        return new GroupEntryBillingModel(paidGroupBillingStatus, num, str, str2, str3, groupBillingType);
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
        if (!(obj instanceof GroupEntryBillingModel)) {
            return false;
        }
        GroupEntryBillingModel groupEntryBillingModel = (GroupEntryBillingModel) obj;
        return this.enabled == groupEntryBillingModel.enabled && Intrinsics.EZpvd(this.currencyId, groupEntryBillingModel.currencyId) && Intrinsics.EZpvd((Object) this.currencyCode, (Object) groupEntryBillingModel.currencyCode) && Intrinsics.EZpvd((Object) this.currencySign, (Object) groupEntryBillingModel.currencySign) && Intrinsics.EZpvd((Object) this.amount, (Object) groupEntryBillingModel.amount) && this.billingType == groupEntryBillingModel.billingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupBillingType getBillingType() {
        return this.billingType;
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
    public final String getCurrencySign() {
        return this.currencySign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupBillingStatus getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        PaidGroupBillingStatus paidGroupBillingStatus = this.enabled;
        int iHashCode = paidGroupBillingStatus == null ? 0 : paidGroupBillingStatus.hashCode();
        Integer num = this.currencyId;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str = this.currencyCode;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.currencySign;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.amount;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        GroupBillingType groupBillingType = this.billingType;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (groupBillingType != null ? groupBillingType.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupEntryBillingModel(enabled=" + this.enabled + ", currencyId=" + this.currencyId + ", currencyCode=" + this.currencyCode + ", currencySign=" + this.currencySign + ", amount=" + this.amount + ", billingType=" + this.billingType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        PaidGroupBillingStatus paidGroupBillingStatus = this.enabled;
        if (paidGroupBillingStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paidGroupBillingStatus.writeToParcel(parcel, i);
        }
        Integer num = this.currencyId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.currencyCode);
        parcel.writeString(this.currencySign);
        parcel.writeString(this.amount);
        GroupBillingType groupBillingType = this.billingType;
        if (groupBillingType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupBillingType.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupEntryBillingModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupEntryBillingModel> serializer() {
            return GroupEntryBillingModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupEntryBillingModel(int i, PaidGroupBillingStatus paidGroupBillingStatus, Integer num, String str, String str2, String str3, GroupBillingType groupBillingType, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.enabled = null;
        } else {
            this.enabled = paidGroupBillingStatus;
        }
        if ((i & 2) == 0) {
            this.currencyId = null;
        } else {
            this.currencyId = num;
        }
        if ((i & 4) == 0) {
            this.currencyCode = null;
        } else {
            this.currencyCode = str;
        }
        if ((i & 8) == 0) {
            this.currencySign = null;
        } else {
            this.currencySign = str2;
        }
        if ((i & 16) == 0) {
            this.amount = null;
        } else {
            this.amount = str3;
        }
        if ((i & 32) == 0) {
            this.billingType = null;
        } else {
            this.billingType = groupBillingType;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupEntryBillingModel groupEntryBillingModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || groupEntryBillingModel.enabled != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], groupEntryBillingModel.enabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || groupEntryBillingModel.currencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, groupEntryBillingModel.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || groupEntryBillingModel.currencyCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, groupEntryBillingModel.currencyCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || groupEntryBillingModel.currencySign != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, groupEntryBillingModel.currencySign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || groupEntryBillingModel.amount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, groupEntryBillingModel.amount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && groupEntryBillingModel.billingType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], groupEntryBillingModel.billingType);
    }

    public GroupEntryBillingModel(PaidGroupBillingStatus paidGroupBillingStatus, Integer num, String str, String str2, String str3, GroupBillingType groupBillingType) {
        this.enabled = paidGroupBillingStatus;
        this.currencyId = num;
        this.currencyCode = str;
        this.currencySign = str2;
        this.amount = str3;
        this.billingType = groupBillingType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:com.okinc.okimcore.model.im.group.paidgroup.PaidGroupBillingStatus:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.paidgroup.PaidGroupBillingStatus) : (r6v0 com.okinc.okimcore.model.im.group.paidgroup.PaidGroupBillingStatus))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r7v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.im.group.GroupBillingType:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.GroupBillingType) : (r11v0 com.okinc.okimcore.model.im.group.GroupBillingType))
 A[MD:(com.okinc.okimcore.model.im.group.paidgroup.PaidGroupBillingStatus, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.im.group.GroupBillingType):void (m)] (LINE:84) call: com.okinc.okimcore.model.remote.GroupEntryBillingModel.<init>(com.okinc.okimcore.model.im.group.paidgroup.PaidGroupBillingStatus, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, com.okinc.okimcore.model.im.group.GroupBillingType):void type: THIS */
    public /* synthetic */ GroupEntryBillingModel(PaidGroupBillingStatus paidGroupBillingStatus, Integer num, String str, String str2, String str3, GroupBillingType groupBillingType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paidGroupBillingStatus, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : groupBillingType);
    }
}
