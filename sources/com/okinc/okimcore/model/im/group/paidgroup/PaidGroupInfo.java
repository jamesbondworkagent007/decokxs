package com.okinc.okimcore.model.im.group.paidgroup;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.remote.GroupEntryBillingModel;
import com.okinc.okimcore.model.remote.GroupEntryBillingModel$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PaidGroupInfo implements Parcelable {
    public static final int $stable = 0;
    private final GroupEntryBillingModel billingModel;
    private final String outstandingAmount;
    private final PaidGroupMemberStatus paidGroupMemberStatus;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PaidGroupInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PaidGroupInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaidGroupInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PaidGroupInfo(parcel.readInt() == 0 ? null : GroupEntryBillingModel.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PaidGroupMemberStatus.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaidGroupInfo[] newArray(int i) {
            return new PaidGroupInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PaidGroupInfo() {
        this((GroupEntryBillingModel) null, (PaidGroupMemberStatus) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PaidGroupInfo copy$default(PaidGroupInfo paidGroupInfo, GroupEntryBillingModel groupEntryBillingModel, PaidGroupMemberStatus paidGroupMemberStatus, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            groupEntryBillingModel = paidGroupInfo.billingModel;
        }
        if ((i & 2) != 0) {
            paidGroupMemberStatus = paidGroupInfo.paidGroupMemberStatus;
        }
        if ((i & 4) != 0) {
            str = paidGroupInfo.outstandingAmount;
        }
        return paidGroupInfo.copy(groupEntryBillingModel, paidGroupMemberStatus, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryBillingModel component1() {
        return this.billingModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupMemberStatus component2() {
        return this.paidGroupMemberStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.outstandingAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupInfo copy(GroupEntryBillingModel groupEntryBillingModel, PaidGroupMemberStatus paidGroupMemberStatus, String str) {
        return new PaidGroupInfo(groupEntryBillingModel, paidGroupMemberStatus, str);
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
        if (!(obj instanceof PaidGroupInfo)) {
            return false;
        }
        PaidGroupInfo paidGroupInfo = (PaidGroupInfo) obj;
        return Intrinsics.EZpvd(this.billingModel, paidGroupInfo.billingModel) && Intrinsics.EZpvd(this.paidGroupMemberStatus, paidGroupInfo.paidGroupMemberStatus) && Intrinsics.EZpvd((Object) this.outstandingAmount, (Object) paidGroupInfo.outstandingAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEntryBillingModel getBillingModel() {
        return this.billingModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOutstandingAmount() {
        return this.outstandingAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupMemberStatus getPaidGroupMemberStatus() {
        return this.paidGroupMemberStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        GroupEntryBillingModel groupEntryBillingModel = this.billingModel;
        int iHashCode = groupEntryBillingModel == null ? 0 : groupEntryBillingModel.hashCode();
        PaidGroupMemberStatus paidGroupMemberStatus = this.paidGroupMemberStatus;
        int iHashCode2 = paidGroupMemberStatus == null ? 0 : paidGroupMemberStatus.hashCode();
        String str = this.outstandingAmount;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PaidGroupInfo(billingModel=" + this.billingModel + ", paidGroupMemberStatus=" + this.paidGroupMemberStatus + ", outstandingAmount=" + this.outstandingAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        GroupEntryBillingModel groupEntryBillingModel = this.billingModel;
        if (groupEntryBillingModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupEntryBillingModel.writeToParcel(parcel, i);
        }
        PaidGroupMemberStatus paidGroupMemberStatus = this.paidGroupMemberStatus;
        if (paidGroupMemberStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paidGroupMemberStatus.writeToParcel(parcel, i);
        }
        parcel.writeString(this.outstandingAmount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PaidGroupInfo> serializer() {
            return PaidGroupInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaidGroupInfo(int i, GroupEntryBillingModel groupEntryBillingModel, PaidGroupMemberStatus paidGroupMemberStatus, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.billingModel = null;
        } else {
            this.billingModel = groupEntryBillingModel;
        }
        if ((i & 2) == 0) {
            this.paidGroupMemberStatus = null;
        } else {
            this.paidGroupMemberStatus = paidGroupMemberStatus;
        }
        if ((i & 4) == 0) {
            this.outstandingAmount = null;
        } else {
            this.outstandingAmount = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(PaidGroupInfo paidGroupInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || paidGroupInfo.billingModel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, GroupEntryBillingModel$$serializer.INSTANCE, paidGroupInfo.billingModel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || paidGroupInfo.paidGroupMemberStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, PaidGroupMemberStatus$$serializer.INSTANCE, paidGroupInfo.paidGroupMemberStatus);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && paidGroupInfo.outstandingAmount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, paidGroupInfo.outstandingAmount);
    }

    public PaidGroupInfo(GroupEntryBillingModel groupEntryBillingModel, PaidGroupMemberStatus paidGroupMemberStatus, String str) {
        this.billingModel = groupEntryBillingModel;
        this.paidGroupMemberStatus = paidGroupMemberStatus;
        this.outstandingAmount = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.okimcore.model.remote.GroupEntryBillingModel:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.GroupEntryBillingModel) : (r2v0 com.okinc.okimcore.model.remote.GroupEntryBillingModel))
  (wrap:com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus) : (r3v0 com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(com.okinc.okimcore.model.remote.GroupEntryBillingModel, com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus, java.lang.String):void (m)] (LINE:13) call: com.okinc.okimcore.model.im.group.paidgroup.PaidGroupInfo.<init>(com.okinc.okimcore.model.remote.GroupEntryBillingModel, com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus, java.lang.String):void type: THIS */
    public /* synthetic */ PaidGroupInfo(GroupEntryBillingModel groupEntryBillingModel, PaidGroupMemberStatus paidGroupMemberStatus, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : groupEntryBillingModel, (i & 2) != 0 ? null : paidGroupMemberStatus, (i & 4) != 0 ? null : str);
    }
}
