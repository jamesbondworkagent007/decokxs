package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatusGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C23313hvq;
import o.C33129mqd;
import o.C43251rlk;
import o.InterfaceC9850bdP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class DeFiPlatformTokenApprovalInfo implements Parcelable {
    public static final int $stable = 0;
    private final String amount;
    private final String id;
    private final String name;
    private final boolean needCancelApproveToken;
    private final String status;
    private final String tokenContractAddress;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DeFiPlatformTokenApprovalInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DeFiPlatformTokenApprovalInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeFiPlatformTokenApprovalInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DeFiPlatformTokenApprovalInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeFiPlatformTokenApprovalInfo[] newArray(int i) {
            return new DeFiPlatformTokenApprovalInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DeFiPlatformTokenApprovalInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DeFiPlatformTokenApprovalInfo copy$default(DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo, String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deFiPlatformTokenApprovalInfo.id;
        }
        if ((i & 2) != 0) {
            str2 = deFiPlatformTokenApprovalInfo.name;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = deFiPlatformTokenApprovalInfo.tokenContractAddress;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = deFiPlatformTokenApprovalInfo.amount;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = deFiPlatformTokenApprovalInfo.status;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            z = deFiPlatformTokenApprovalInfo.needCancelApproveToken;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            str6 = deFiPlatformTokenApprovalInfo.type;
        }
        return deFiPlatformTokenApprovalInfo.copy(str, str7, str8, str9, str10, z2, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.needCancelApproveToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeFiPlatformTokenApprovalInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new DeFiPlatformTokenApprovalInfo(str, str2, str3, str4, str5, z, str6);
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
        if (!(obj instanceof DeFiPlatformTokenApprovalInfo)) {
            return false;
        }
        DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo = (DeFiPlatformTokenApprovalInfo) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) deFiPlatformTokenApprovalInfo.id) && Intrinsics.EZpvd((Object) this.name, (Object) deFiPlatformTokenApprovalInfo.name) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) deFiPlatformTokenApprovalInfo.tokenContractAddress) && Intrinsics.EZpvd((Object) this.amount, (Object) deFiPlatformTokenApprovalInfo.amount) && Intrinsics.EZpvd((Object) this.status, (Object) deFiPlatformTokenApprovalInfo.status) && this.needCancelApproveToken == deFiPlatformTokenApprovalInfo.needCancelApproveToken && Intrinsics.EZpvd((Object) this.type, (Object) deFiPlatformTokenApprovalInfo.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
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
    public final boolean getNeedCancelApproveToken() {
        return this.needCancelApproveToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.status.hashCode()) * 31) + Boolean.hashCode(this.needCancelApproveToken)) * 31) + this.type.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeFiPlatformTokenApprovalInfo(id=" + this.id + ", name=" + this.name + ", tokenContractAddress=" + this.tokenContractAddress + ", amount=" + this.amount + ", status=" + this.status + ", needCancelApproveToken=" + this.needCancelApproveToken + ", type=" + this.type + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.tokenContractAddress);
        parcel.writeString(this.amount);
        parcel.writeString(this.status);
        parcel.writeInt(this.needCancelApproveToken ? 1 : 0);
        parcel.writeString(this.type);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeFiPlatformTokenApprovalInfo> serializer() {
            return DeFiPlatformTokenApprovalInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeFiPlatformTokenApprovalInfo(int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str3;
        }
        if ((i & 8) == 0) {
            this.amount = "";
        } else {
            this.amount = str4;
        }
        if ((i & 16) == 0) {
            this.status = ApproveStatus.APPROVE_FAIL.getType();
        } else {
            this.status = str5;
        }
        if ((i & 32) == 0) {
            this.needCancelApproveToken = false;
        } else {
            this.needCancelApproveToken = z;
        }
        if ((i & 64) == 0) {
            this.type = "0";
        } else {
            this.type = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) deFiPlatformTokenApprovalInfo.id, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, deFiPlatformTokenApprovalInfo.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) deFiPlatformTokenApprovalInfo.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, deFiPlatformTokenApprovalInfo.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) deFiPlatformTokenApprovalInfo.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, deFiPlatformTokenApprovalInfo.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) deFiPlatformTokenApprovalInfo.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, deFiPlatformTokenApprovalInfo.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) deFiPlatformTokenApprovalInfo.status, (Object) ApproveStatus.APPROVE_FAIL.getType())) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, deFiPlatformTokenApprovalInfo.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || deFiPlatformTokenApprovalInfo.needCancelApproveToken) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, deFiPlatformTokenApprovalInfo.needCancelApproveToken);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) deFiPlatformTokenApprovalInfo.type, (Object) "0")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, deFiPlatformTokenApprovalInfo.type);
    }

    public DeFiPlatformTokenApprovalInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.id = str;
        this.name = str2;
        this.tokenContractAddress = str3;
        this.amount = str4;
        this.status = str5;
        this.needCancelApproveToken = z;
        this.type = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:java.lang.String:0x0027: TERNARY null = ((wrap:int:0x001d: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0023: INVOKE 
  (wrap:com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus:0x0021: SGET  A[WRAPPED] (LINE:1303) com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus.APPROVE_FAIL com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus)
 VIRTUAL call: com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus.getType():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:1303)) : (r10v0 java.lang.String))
  (wrap:boolean:0x002d: TERNARY null = ((wrap:int:0x0028: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("0") : (r12v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:1298) call: com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ DeFiPlatformTokenApprovalInfo(String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? ApproveStatus.APPROVE_FAIL.getType() : str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? "0" : str6);
    }

    public final boolean isApprovedAndNeedCancelApprove(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C23313hvq.KWHzl(((InterfaceC9850bdP) C43251rlk.copydefault(InterfaceC9850bdP.class)).EZpvd(this.amount, C33129mqd.AhwBna(str2)), str) && this.needCancelApproveToken;
    }

    public final ApproveStatusGroup checkApproveStatusGroupForSwap(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String str3 = this.status;
        ApproveStatus approveStatus = ApproveStatus.APPROVING;
        if (Intrinsics.EZpvd((Object) str3, (Object) approveStatus.getType())) {
            return new ApproveStatusGroup(false, approveStatus, this.amount, this.type, false, (String) null, (String) null, 96, (DefaultConstructorMarker) null);
        }
        ApproveStatus approveStatus2 = ApproveStatus.UN_APPROVE;
        if (Intrinsics.EZpvd((Object) str3, (Object) approveStatus2.getType())) {
            return new ApproveStatusGroup(true, approveStatus2, this.amount, this.type, false, (String) null, (String) null, 96, (DefaultConstructorMarker) null);
        }
        ApproveStatus approveStatus3 = ApproveStatus.CANCEL_APPROVING;
        if (Intrinsics.EZpvd((Object) str3, (Object) approveStatus3.getType())) {
            if (isApprovedAndNeedCancelApprove(str2, str)) {
                return new ApproveStatusGroup(false, approveStatus3, this.amount, this.type, true, (String) null, (String) null, 96, (DefaultConstructorMarker) null);
            }
            return new ApproveStatusGroup(false, approveStatus2, this.amount, this.type, false, (String) null, (String) null, 96, (DefaultConstructorMarker) null);
        }
        if (Intrinsics.EZpvd((Object) str3, (Object) ApproveStatus.APPROVE_FAIL.getType())) {
            if (isApprovedAndNeedCancelApprove(str2, str)) {
                return new ApproveStatusGroup(true, ApproveStatus.APPROVED_NEED_CANCEL_APPROVE, this.amount, this.type, true, (String) null, (String) null, 96, (DefaultConstructorMarker) null);
            }
            return new ApproveStatusGroup(true, approveStatus2, this.amount, this.type, false, (String) null, (String) null, 96, (DefaultConstructorMarker) null);
        }
        ApproveStatus approveStatus4 = ApproveStatus.APPROVED;
        if (Intrinsics.EZpvd((Object) str3, (Object) approveStatus4.getType())) {
            boolean zOLrzqt = false;
            if (C23313hvq.valueOf(this.amount, 0)) {
                zOLrzqt = true;
            } else if (!Intrinsics.EZpvd((Object) this.amount, (Object) "115792089237316195423570985008687907853269984665640564039457584007913129639935")) {
                zOLrzqt = C23313hvq.OLrzqt(str2, ((InterfaceC9850bdP) C43251rlk.copydefault(InterfaceC9850bdP.class)).EZpvd(this.amount, C33129mqd.AhwBna(str)));
            }
            boolean z = zOLrzqt;
            if (isApprovedAndNeedCancelApprove(str2, str)) {
                approveStatus4 = ApproveStatus.APPROVED_NEED_CANCEL_APPROVE;
            }
            return new ApproveStatusGroup(z, approveStatus4, this.amount, this.type, this.needCancelApproveToken, (String) null, (String) null, 96, (DefaultConstructorMarker) null);
        }
        String str4 = this.amount;
        String str5 = str4 == null ? "" : str4;
        String str6 = this.type;
        if (str6 == null) {
            str6 = "0";
        }
        return new ApproveStatusGroup(true, approveStatus2, str5, str6, this.needCancelApproveToken, (String) null, (String) null, 96, (DefaultConstructorMarker) null);
    }
}
