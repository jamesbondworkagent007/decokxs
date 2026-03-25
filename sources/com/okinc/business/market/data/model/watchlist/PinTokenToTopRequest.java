package com.okinc.business.market.data.model.watchlist;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class PinTokenToTopRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String accountId;
    public final String chainId;
    public final int groupId;
    public final String tokenContractAddress;
    public final String walletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PinTokenToTopRequest() {
        this((String) null, (String) null, (String) null, (String) null, 0, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PinTokenToTopRequest copy$default(PinTokenToTopRequest pinTokenToTopRequest, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = pinTokenToTopRequest.chainId;
        }
        if ((i2 & 2) != 0) {
            str2 = pinTokenToTopRequest.tokenContractAddress;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = pinTokenToTopRequest.accountId;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = pinTokenToTopRequest.walletAddress;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            i = pinTokenToTopRequest.groupId;
        }
        return pinTokenToTopRequest.copydefault(str, str5, str6, str7, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PinTokenToTopRequest copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new PinTokenToTopRequest(str, str2, str3, str4, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PinTokenToTopRequest)) {
            return false;
        }
        PinTokenToTopRequest pinTokenToTopRequest = (PinTokenToTopRequest) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) pinTokenToTopRequest.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) pinTokenToTopRequest.tokenContractAddress) && Intrinsics.EZpvd((Object) this.accountId, (Object) pinTokenToTopRequest.accountId) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) pinTokenToTopRequest.walletAddress) && this.groupId == pinTokenToTopRequest.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.chainId.hashCode() * 31) + this.tokenContractAddress.hashCode()) * 31) + this.accountId.hashCode()) * 31) + this.walletAddress.hashCode()) * 31) + Integer.hashCode(this.groupId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PinTokenToTopRequest(chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ", accountId=" + this.accountId + ", walletAddress=" + this.walletAddress + ", groupId=" + this.groupId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.watchlist.PinTokenToTopRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PinTokenToTopRequest> serializer() {
            return PinTokenToTopRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PinTokenToTopRequest(int i, String str, String str2, String str3, String str4, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str2;
        }
        if ((i & 4) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str3;
        }
        if ((i & 8) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str4;
        }
        if ((i & 16) == 0) {
            this.groupId = 0;
        } else {
            this.groupId = i2;
        }
    }

    public static final /* synthetic */ void KWHzl(PinTokenToTopRequest pinTokenToTopRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) pinTokenToTopRequest.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, pinTokenToTopRequest.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) pinTokenToTopRequest.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, pinTokenToTopRequest.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) pinTokenToTopRequest.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, pinTokenToTopRequest.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) pinTokenToTopRequest.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, pinTokenToTopRequest.walletAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && pinTokenToTopRequest.groupId == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 4, pinTokenToTopRequest.groupId);
    }

    public PinTokenToTopRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.chainId = str;
        this.tokenContractAddress = str2;
        this.accountId = str3;
        this.walletAddress = str4;
        this.groupId = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:7) call: com.okinc.business.market.data.model.watchlist.PinTokenToTopRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ PinTokenToTopRequest(String str, String str2, String str3, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) == 0 ? str4 : "", (i2 & 16) != 0 ? 0 : i);
    }
}
