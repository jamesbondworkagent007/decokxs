package com.okinc.business.market.data.model.position_pnl;

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
public final class HoldingTokenData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String chainId;
    public final String price;
    public final String tokenContractAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HoldingTokenData() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HoldingTokenData copy$default(HoldingTokenData holdingTokenData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = holdingTokenData.chainId;
        }
        if ((i & 2) != 0) {
            str2 = holdingTokenData.tokenContractAddress;
        }
        if ((i & 4) != 0) {
            str3 = holdingTokenData.price;
        }
        return holdingTokenData.copydefault(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HoldingTokenData copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new HoldingTokenData(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HoldingTokenData)) {
            return false;
        }
        HoldingTokenData holdingTokenData = (HoldingTokenData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) holdingTokenData.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) holdingTokenData.tokenContractAddress) && Intrinsics.EZpvd((Object) this.price, (Object) holdingTokenData.price);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.chainId.hashCode() * 31) + this.tokenContractAddress.hashCode()) * 31) + this.price.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HoldingTokenData(chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ", price=" + this.price + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.position_pnl.HoldingTokenData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HoldingTokenData> serializer() {
            return HoldingTokenData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HoldingTokenData(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.price = "";
        } else {
            this.price = str3;
        }
    }

    public static final /* synthetic */ void OLrzqt(HoldingTokenData holdingTokenData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) holdingTokenData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, holdingTokenData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) holdingTokenData.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, holdingTokenData.tokenContractAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) holdingTokenData.price, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, holdingTokenData.price);
    }

    public HoldingTokenData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.chainId = str;
        this.tokenContractAddress = str2;
        this.price = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.business.market.data.model.position_pnl.HoldingTokenData.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HoldingTokenData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
