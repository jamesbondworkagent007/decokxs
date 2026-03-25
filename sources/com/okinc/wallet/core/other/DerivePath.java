package com.okinc.wallet.core.other;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class DerivePath {
    private int addressIndex;
    private int addressType;
    private long chainId;
    private String path;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DerivePath() {
        this(0L, (String) null, 0, 0, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DerivePath copy$default(DerivePath derivePath, long j, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = derivePath.chainId;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            str = derivePath.path;
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            i = derivePath.addressIndex;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = derivePath.addressType;
        }
        return derivePath.copy(j2, str2, i4, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DerivePath copy(long j, @NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DerivePath(j, str, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DerivePath)) {
            return false;
        }
        DerivePath derivePath = (DerivePath) obj;
        return this.chainId == derivePath.chainId && Intrinsics.EZpvd((Object) this.path, (Object) derivePath.path) && this.addressIndex == derivePath.addressIndex && this.addressType == derivePath.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressIndex() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Long.hashCode(this.chainId) * 31) + this.path.hashCode()) * 31) + Integer.hashCode(this.addressIndex)) * 31) + Integer.hashCode(this.addressType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressIndex(int i) {
        this.addressIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressType(int i) {
        this.addressType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(long j) {
        this.chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.path = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DerivePath(chainId=" + this.chainId + ", path=" + this.path + ", addressIndex=" + this.addressIndex + ", addressType=" + this.addressType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.other.DerivePath.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DerivePath> serializer() {
            return DerivePath$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DerivePath(int i, long j, String str, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? -1L : j;
        if ((i & 2) == 0) {
            this.path = "";
        } else {
            this.path = str;
        }
        if ((i & 4) == 0) {
            this.addressIndex = 0;
        } else {
            this.addressIndex = i2;
        }
        if ((i & 8) == 0) {
            this.addressType = 1;
        } else {
            this.addressType = i3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(DerivePath derivePath, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || derivePath.chainId != -1) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, derivePath.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) derivePath.path, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, derivePath.path);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || derivePath.addressIndex != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, derivePath.addressIndex);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && derivePath.addressType == 1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, derivePath.addressType);
    }

    public DerivePath(long j, @NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = j;
        this.path = str;
        this.addressIndex = i;
        this.addressType = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (wrap:long:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r7v0 long))
  (wrap:java.lang.String:0x000d: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:int:0x0013: TERNARY null = ((wrap:int:0x000e: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0014: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r11v0 int))
 A[MD:(long, java.lang.String, int, int):void (m)] (LINE:23) call: com.okinc.wallet.core.other.DerivePath.<init>(long, java.lang.String, int, int):void type: THIS */
    public /* synthetic */ DerivePath(long j, String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1L : j, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 1 : i2);
    }
}
