package com.okinc.business.dexlogic.main.swap.operation_handler.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C23313hvq;
import o.C33129mqd;
import o.C43251rlk;
import o.InterfaceC9850bdP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class ApproveStatusGroup implements Parcelable {
    public static final int $stable = 0;
    private final ApproveStatus approveStatus;
    private final String approvedAmount;
    private final String deFiPlatformId;
    private final boolean needApprove;
    private final boolean needCancelApproveToken;
    private final String type;
    private final String uniqueKeyForProviderList;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ApproveStatusGroup> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus", ApproveStatus.values()), null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<ApproveStatusGroup> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApproveStatusGroup createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ApproveStatusGroup(parcel.readInt() != 0, ApproveStatus.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApproveStatusGroup[] newArray(int i) {
            return new ApproveStatusGroup[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ApproveStatusGroup copy$default(ApproveStatusGroup approveStatusGroup, boolean z, ApproveStatus approveStatus, String str, String str2, boolean z2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = approveStatusGroup.needApprove;
        }
        if ((i & 2) != 0) {
            approveStatus = approveStatusGroup.approveStatus;
        }
        ApproveStatus approveStatus2 = approveStatus;
        if ((i & 4) != 0) {
            str = approveStatusGroup.approvedAmount;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = approveStatusGroup.type;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            z2 = approveStatusGroup.needCancelApproveToken;
        }
        boolean z3 = z2;
        if ((i & 32) != 0) {
            str3 = approveStatusGroup.uniqueKeyForProviderList;
        }
        String str7 = str3;
        if ((i & 64) != 0) {
            str4 = approveStatusGroup.deFiPlatformId;
        }
        return approveStatusGroup.copy(z, approveStatus2, str5, str6, z3, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.needApprove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveStatus component2() {
        return this.approveStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.approvedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.needCancelApproveToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.uniqueKeyForProviderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.deFiPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveStatusGroup copy(boolean z, @NotNull ApproveStatus approveStatus, @NotNull String str, @NotNull String str2, boolean z2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(approveStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new ApproveStatusGroup(z, approveStatus, str, str2, z2, str3, str4);
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
        if (!(obj instanceof ApproveStatusGroup)) {
            return false;
        }
        ApproveStatusGroup approveStatusGroup = (ApproveStatusGroup) obj;
        return this.needApprove == approveStatusGroup.needApprove && this.approveStatus == approveStatusGroup.approveStatus && Intrinsics.EZpvd((Object) this.approvedAmount, (Object) approveStatusGroup.approvedAmount) && Intrinsics.EZpvd((Object) this.type, (Object) approveStatusGroup.type) && this.needCancelApproveToken == approveStatusGroup.needCancelApproveToken && Intrinsics.EZpvd((Object) this.uniqueKeyForProviderList, (Object) approveStatusGroup.uniqueKeyForProviderList) && Intrinsics.EZpvd((Object) this.deFiPlatformId, (Object) approveStatusGroup.deFiPlatformId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveStatus getApproveStatus() {
        return this.approveStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApprovedAmount() {
        return this.approvedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeFiPlatformId() {
        return this.deFiPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedApprove() {
        return this.needApprove;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedCancelApproveToken() {
        return this.needCancelApproveToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUniqueKeyForProviderList() {
        return this.uniqueKeyForProviderList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.needApprove) * 31) + this.approveStatus.hashCode()) * 31) + this.approvedAmount.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.needCancelApproveToken)) * 31) + this.uniqueKeyForProviderList.hashCode()) * 31) + this.deFiPlatformId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ApproveStatusGroup(needApprove=" + this.needApprove + ", approveStatus=" + this.approveStatus + ", approvedAmount=" + this.approvedAmount + ", type=" + this.type + ", needCancelApproveToken=" + this.needCancelApproveToken + ", uniqueKeyForProviderList=" + this.uniqueKeyForProviderList + ", deFiPlatformId=" + this.deFiPlatformId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.needApprove ? 1 : 0);
        parcel.writeString(this.approveStatus.name());
        parcel.writeString(this.approvedAmount);
        parcel.writeString(this.type);
        parcel.writeInt(this.needCancelApproveToken ? 1 : 0);
        parcel.writeString(this.uniqueKeyForProviderList);
        parcel.writeString(this.deFiPlatformId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatusGroup.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ApproveStatusGroup> serializer() {
            return ApproveStatusGroup$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ApproveStatusGroup(int i, boolean z, ApproveStatus approveStatus, String str, String str2, boolean z2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (20 != (i & 20)) {
            PluginExceptionsKt.throwMissingFieldException(i, 20, ApproveStatusGroup$$serializer.INSTANCE.getDescriptor());
        }
        this.needApprove = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.approveStatus = ApproveStatus.UN_APPROVE;
        } else {
            this.approveStatus = approveStatus;
        }
        this.approvedAmount = str;
        if ((i & 8) == 0) {
            this.type = "0";
        } else {
            this.type = str2;
        }
        this.needCancelApproveToken = z2;
        if ((i & 32) == 0) {
            this.uniqueKeyForProviderList = "";
        } else {
            this.uniqueKeyForProviderList = str3;
        }
        if ((i & 64) == 0) {
            this.deFiPlatformId = "";
        } else {
            this.deFiPlatformId = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(ApproveStatusGroup approveStatusGroup, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !approveStatusGroup.needApprove) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, approveStatusGroup.needApprove);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || approveStatusGroup.approveStatus != ApproveStatus.UN_APPROVE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], approveStatusGroup.approveStatus);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, approveStatusGroup.approvedAmount);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) approveStatusGroup.type, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, approveStatusGroup.type);
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 4, approveStatusGroup.needCancelApproveToken);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) approveStatusGroup.uniqueKeyForProviderList, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, approveStatusGroup.uniqueKeyForProviderList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) approveStatusGroup.deFiPlatformId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, approveStatusGroup.deFiPlatformId);
    }

    public ApproveStatusGroup(boolean z, @NotNull ApproveStatus approveStatus, @NotNull String str, @NotNull String str2, boolean z2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(approveStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.needApprove = z;
        this.approveStatus = approveStatus;
        this.approvedAmount = str;
        this.type = str2;
        this.needCancelApproveToken = z2;
        this.uniqueKeyForProviderList = str3;
        this.deFiPlatformId = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002e: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r10v0 boolean))
  (wrap:com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: SGET  A[WRAPPED] (LINE:69) com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus.UN_APPROVE com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus) : (r11v0 com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus))
  (r12v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("0") : (r13v0 java.lang.String))
  (r14v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
 A[MD:(boolean, com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void (m)] (LINE:67) call: com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatusGroup.<init>(boolean, com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ApproveStatusGroup(boolean z, ApproveStatus approveStatus, String str, String str2, boolean z2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? ApproveStatus.UN_APPROVE : approveStatus, str, (i & 8) != 0 ? "0" : str2, z2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4);
    }

    public final boolean isRegisterType() {
        return Intrinsics.EZpvd((Object) this.type, (Object) "1");
    }

    public final boolean isNeedCancelApprove(@NotNull String str, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        ApproveStatus approveStatus;
        Intrinsics.checkNotNullParameter(str, "");
        return C23313hvq.KWHzl(((InterfaceC9850bdP) C43251rlk.copydefault(InterfaceC9850bdP.class)).EZpvd(this.approvedAmount, C33129mqd.AhwBna(dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getDecimals() : null)), str) && this.needCancelApproveToken && ((approveStatus = this.approveStatus) == ApproveStatus.APPROVED_NEED_CANCEL_APPROVE || approveStatus == ApproveStatus.CANCEL_APPROVING);
    }
}
