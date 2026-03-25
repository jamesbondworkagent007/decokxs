package com.okinc.wallet.core.sign.ton;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TonAddress {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int TYPE_BOUNCEABLE = 2;
    public static final int TYPE_NONBOUNCEABLE = 1;
    public static final int TYPE_RAW = 0;
    private final String addr;
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TonAddress copy$default(TonAddress tonAddress, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tonAddress.type;
        }
        if ((i2 & 2) != 0) {
            str = tonAddress.addr;
        }
        return tonAddress.copy(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.addr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonAddress copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TonAddress(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TonAddress)) {
            return false;
        }
        TonAddress tonAddress = (TonAddress) obj;
        return this.type == tonAddress.type && Intrinsics.EZpvd((Object) this.addr, (Object) tonAddress.addr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddr() {
        return this.addr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.type) * 31) + this.addr.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TonAddress(type=" + this.type + ", addr=" + this.addr + ")";
    }

    public /* synthetic */ TonAddress(int i, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, TonAddress$$serializer.INSTANCE.getDescriptor());
        }
        this.type = i2;
        this.addr = str;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(TonAddress tonAddress, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, tonAddress.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tonAddress.addr);
    }

    public TonAddress(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = i;
        this.addr = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.ton.TonAddress.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TonAddress> serializer() {
            return TonAddress$$serializer.INSTANCE;
        }
    }
}
