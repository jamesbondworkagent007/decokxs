package com.okinc.wallet.core.mpc;

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
public final class MpcPrivateKey {
    private int addressIndex;
    private long chainId;
    private String privateKey;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MpcPrivateKey() {
        this(0L, (String) null, 0, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MpcPrivateKey copy$default(MpcPrivateKey mpcPrivateKey, long j, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = mpcPrivateKey.chainId;
        }
        if ((i2 & 2) != 0) {
            str = mpcPrivateKey.privateKey;
        }
        if ((i2 & 4) != 0) {
            i = mpcPrivateKey.addressIndex;
        }
        return mpcPrivateKey.copy(j, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.privateKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpcPrivateKey copy(long j, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MpcPrivateKey(j, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MpcPrivateKey)) {
            return false;
        }
        MpcPrivateKey mpcPrivateKey = (MpcPrivateKey) obj;
        return this.chainId == mpcPrivateKey.chainId && Intrinsics.EZpvd((Object) this.privateKey, (Object) mpcPrivateKey.privateKey) && this.addressIndex == mpcPrivateKey.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressIndex() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrivateKey() {
        return this.privateKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.chainId) * 31) + this.privateKey.hashCode()) * 31) + Integer.hashCode(this.addressIndex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressIndex(int i) {
        this.addressIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(long j) {
        this.chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrivateKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.privateKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MpcPrivateKey(chainId=" + this.chainId + ", privateKey=" + this.privateKey + ", addressIndex=" + this.addressIndex + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.mpc.MpcPrivateKey.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MpcPrivateKey> serializer() {
            return MpcPrivateKey$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MpcPrivateKey(int i, long j, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? -1L : j;
        if ((i & 2) == 0) {
            this.privateKey = "";
        } else {
            this.privateKey = str;
        }
        if ((i & 4) == 0) {
            this.addressIndex = 0;
        } else {
            this.addressIndex = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(MpcPrivateKey mpcPrivateKey, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || mpcPrivateKey.chainId != -1) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, mpcPrivateKey.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) mpcPrivateKey.privateKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, mpcPrivateKey.privateKey);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && mpcPrivateKey.addressIndex == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, mpcPrivateKey.addressIndex);
    }

    public MpcPrivateKey(long j, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = j;
        this.privateKey = str;
        this.addressIndex = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r1v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(long, java.lang.String, int):void (m)] (LINE:115) call: com.okinc.wallet.core.mpc.MpcPrivateKey.<init>(long, java.lang.String, int):void type: THIS */
    public /* synthetic */ MpcPrivateKey(long j, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i);
    }
}
