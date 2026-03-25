package com.okinc.wallet.core.sign.zksync;

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
public final class ZKSyncToken {
    private String decimals;
    private String id;
    private String symbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ZKSyncToken copy$default(ZKSyncToken zKSyncToken, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zKSyncToken.id;
        }
        if ((i & 2) != 0) {
            str2 = zKSyncToken.symbol;
        }
        if ((i & 4) != 0) {
            str3 = zKSyncToken.decimals;
        }
        return zKSyncToken.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ZKSyncToken copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ZKSyncToken(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZKSyncToken)) {
            return false;
        }
        ZKSyncToken zKSyncToken = (ZKSyncToken) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) zKSyncToken.id) && Intrinsics.EZpvd((Object) this.symbol, (Object) zKSyncToken.symbol) && Intrinsics.EZpvd((Object) this.decimals, (Object) zKSyncToken.decimals);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDecimals() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.decimals.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDecimals(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.decimals = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ZKSyncToken(id=" + this.id + ", symbol=" + this.symbol + ", decimals=" + this.decimals + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.zksync.ZKSyncToken.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ZKSyncToken> serializer() {
            return ZKSyncToken$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ZKSyncToken(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, ZKSyncToken$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.symbol = str2;
        this.decimals = str3;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(ZKSyncToken zKSyncToken, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, zKSyncToken.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, zKSyncToken.symbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, zKSyncToken.decimals);
    }

    public ZKSyncToken(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.symbol = str2;
        this.decimals = str3;
    }
}
