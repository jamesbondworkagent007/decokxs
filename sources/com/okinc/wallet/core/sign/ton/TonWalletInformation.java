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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class TonWalletInformation {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String initCode;
    private final String initData;
    private final String walletAddress;
    private final String walletStateInit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TonWalletInformation copy$default(TonWalletInformation tonWalletInformation, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tonWalletInformation.initCode;
        }
        if ((i & 2) != 0) {
            str2 = tonWalletInformation.initData;
        }
        if ((i & 4) != 0) {
            str3 = tonWalletInformation.walletStateInit;
        }
        if ((i & 8) != 0) {
            str4 = tonWalletInformation.walletAddress;
        }
        return tonWalletInformation.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.initCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.initData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.walletStateInit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonWalletInformation copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new TonWalletInformation(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TonWalletInformation)) {
            return false;
        }
        TonWalletInformation tonWalletInformation = (TonWalletInformation) obj;
        return Intrinsics.EZpvd((Object) this.initCode, (Object) tonWalletInformation.initCode) && Intrinsics.EZpvd((Object) this.initData, (Object) tonWalletInformation.initData) && Intrinsics.EZpvd((Object) this.walletStateInit, (Object) tonWalletInformation.walletStateInit) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) tonWalletInformation.walletAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitCode() {
        return this.initCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitData() {
        return this.initData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletStateInit() {
        return this.walletStateInit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.initCode.hashCode() * 31) + this.initData.hashCode()) * 31) + this.walletStateInit.hashCode()) * 31) + this.walletAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TonWalletInformation(initCode=" + this.initCode + ", initData=" + this.initData + ", walletStateInit=" + this.walletStateInit + ", walletAddress=" + this.walletAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.ton.TonWalletInformation.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TonWalletInformation> serializer() {
            return TonWalletInformation$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TonWalletInformation(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, TonWalletInformation$$serializer.INSTANCE.getDescriptor());
        }
        this.initCode = str;
        this.initData = str2;
        this.walletStateInit = str3;
        this.walletAddress = str4;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(TonWalletInformation tonWalletInformation, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, tonWalletInformation.initCode);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, tonWalletInformation.initData);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, tonWalletInformation.walletStateInit);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, tonWalletInformation.walletAddress);
    }

    public TonWalletInformation(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.initCode = str;
        this.initData = str2;
        this.walletStateInit = str3;
        this.walletAddress = str4;
    }
}
