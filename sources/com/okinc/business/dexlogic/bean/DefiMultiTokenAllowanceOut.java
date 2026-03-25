package com.okinc.business.dexlogic.bean;

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
public final class DefiMultiTokenAllowanceOut {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String amount;
    private final boolean needCancelApproveToken;
    private final String status;
    private final String tokenContractAddress;
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefiMultiTokenAllowanceOut() {
        this((String) null, (String) null, (String) null, (String) null, false, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DefiMultiTokenAllowanceOut copy$default(DefiMultiTokenAllowanceOut defiMultiTokenAllowanceOut, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = defiMultiTokenAllowanceOut.tokenContractAddress;
        }
        if ((i & 2) != 0) {
            str2 = defiMultiTokenAllowanceOut.amount;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = defiMultiTokenAllowanceOut.status;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = defiMultiTokenAllowanceOut.type;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = defiMultiTokenAllowanceOut.needCancelApproveToken;
        }
        return defiMultiTokenAllowanceOut.copy(str, str5, str6, str7, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.status;
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
    public final DefiMultiTokenAllowanceOut copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new DefiMultiTokenAllowanceOut(str, str2, str3, str4, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefiMultiTokenAllowanceOut)) {
            return false;
        }
        DefiMultiTokenAllowanceOut defiMultiTokenAllowanceOut = (DefiMultiTokenAllowanceOut) obj;
        return Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) defiMultiTokenAllowanceOut.tokenContractAddress) && Intrinsics.EZpvd((Object) this.amount, (Object) defiMultiTokenAllowanceOut.amount) && Intrinsics.EZpvd((Object) this.status, (Object) defiMultiTokenAllowanceOut.status) && Intrinsics.EZpvd((Object) this.type, (Object) defiMultiTokenAllowanceOut.type) && this.needCancelApproveToken == defiMultiTokenAllowanceOut.needCancelApproveToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
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
        return (((((((this.tokenContractAddress.hashCode() * 31) + this.amount.hashCode()) * 31) + this.status.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.needCancelApproveToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DefiMultiTokenAllowanceOut(tokenContractAddress=" + this.tokenContractAddress + ", amount=" + this.amount + ", status=" + this.status + ", type=" + this.type + ", needCancelApproveToken=" + this.needCancelApproveToken + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.DefiMultiTokenAllowanceOut.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DefiMultiTokenAllowanceOut> serializer() {
            return DefiMultiTokenAllowanceOut$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DefiMultiTokenAllowanceOut(int i, String str, String str2, String str3, String str4, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str;
        }
        if ((i & 2) == 0) {
            this.amount = "";
        } else {
            this.amount = str2;
        }
        if ((i & 4) == 0) {
            this.status = "2";
        } else {
            this.status = str3;
        }
        if ((i & 8) == 0) {
            this.type = "0";
        } else {
            this.type = str4;
        }
        if ((i & 16) == 0) {
            this.needCancelApproveToken = false;
        } else {
            this.needCancelApproveToken = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DefiMultiTokenAllowanceOut defiMultiTokenAllowanceOut, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) defiMultiTokenAllowanceOut.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, defiMultiTokenAllowanceOut.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) defiMultiTokenAllowanceOut.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, defiMultiTokenAllowanceOut.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) defiMultiTokenAllowanceOut.status, (Object) "2")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, defiMultiTokenAllowanceOut.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) defiMultiTokenAllowanceOut.type, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, defiMultiTokenAllowanceOut.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || defiMultiTokenAllowanceOut.needCancelApproveToken) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, defiMultiTokenAllowanceOut.needCancelApproveToken);
        }
    }

    public DefiMultiTokenAllowanceOut(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.tokenContractAddress = str;
        this.amount = str2;
        this.status = str3;
        this.type = str4;
        this.needCancelApproveToken = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r5v0 java.lang.String) : (""))
  (wrap:java.lang.String:0x0015: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("2") : (r6v0 java.lang.String))
  (wrap:java.lang.String:0x001c: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("0") : (r7v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:1276) call: com.okinc.business.dexlogic.bean.DefiMultiTokenAllowanceOut.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ DefiMultiTokenAllowanceOut(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? "2" : str3, (i & 8) != 0 ? "0" : str4, (i & 16) != 0 ? false : z);
    }

    public final boolean isApprovedAndNeedCancelApprove(@NotNull String str, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        return C23313hvq.KWHzl(((InterfaceC9850bdP) C43251rlk.copydefault(InterfaceC9850bdP.class)).EZpvd(this.amount, C33129mqd.AhwBna(dexMultiTokenInfoBean.getDecimals())), str) && this.needCancelApproveToken;
    }
}
