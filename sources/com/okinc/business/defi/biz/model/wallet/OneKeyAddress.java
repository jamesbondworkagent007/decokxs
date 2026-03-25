package com.okinc.business.defi.biz.model.wallet;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class OneKeyAddress {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String address;
    private final long coinId;
    private final String path;
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OneKeyAddress copy$default(OneKeyAddress oneKeyAddress, long j, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = oneKeyAddress.coinId;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = oneKeyAddress.path;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = oneKeyAddress.address;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            i = oneKeyAddress.type;
        }
        return oneKeyAddress.copy(j2, str3, str4, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OneKeyAddress copy(long j, @NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new OneKeyAddress(j, str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OneKeyAddress)) {
            return false;
        }
        OneKeyAddress oneKeyAddress = (OneKeyAddress) obj;
        return this.coinId == oneKeyAddress.coinId && Intrinsics.EZpvd((Object) this.path, (Object) oneKeyAddress.path) && Intrinsics.EZpvd((Object) this.address, (Object) oneKeyAddress.address) && this.type == oneKeyAddress.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Long.hashCode(this.coinId) * 31) + this.path.hashCode()) * 31) + this.address.hashCode()) * 31) + Integer.hashCode(this.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OneKeyAddress(coinId=" + this.coinId + ", path=" + this.path + ", address=" + this.address + ", type=" + this.type + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.model.wallet.OneKeyAddress.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OneKeyAddress> serializer() {
            return OneKeyAddress$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OneKeyAddress(int i, long j, String str, String str2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, OneKeyAddress$$serializer.INSTANCE.getDescriptor());
        }
        this.coinId = j;
        this.path = str;
        this.address = str2;
        this.type = i2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(OneKeyAddress oneKeyAddress, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, oneKeyAddress.coinId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, oneKeyAddress.path);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, oneKeyAddress.address);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, oneKeyAddress.type);
    }

    public OneKeyAddress(long j, @NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.coinId = j;
        this.path = str;
        this.address = str2;
        this.type = i;
    }
}
