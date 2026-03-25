package com.okinc.business.market.features.meme.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class NewLogoWsData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainId;
    private final String contractAddress;
    private final String logoBase64;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NewLogoWsData copy$default(NewLogoWsData newLogoWsData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newLogoWsData.chainId;
        }
        if ((i & 2) != 0) {
            str2 = newLogoWsData.contractAddress;
        }
        if ((i & 4) != 0) {
            str3 = newLogoWsData.logoBase64;
        }
        return newLogoWsData.copy(str, str2, str3);
    }

    @SerialName("chainId")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("contractAddress")
    public static /* synthetic */ void getContractAddress$annotations() {
    }

    @SerialName("logoBase64")
    public static /* synthetic */ void getLogoBase64$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.logoBase64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewLogoWsData copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new NewLogoWsData(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewLogoWsData)) {
            return false;
        }
        NewLogoWsData newLogoWsData = (NewLogoWsData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) newLogoWsData.chainId) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) newLogoWsData.contractAddress) && Intrinsics.EZpvd((Object) this.logoBase64, (Object) newLogoWsData.logoBase64);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogoBase64() {
        return this.logoBase64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.chainId.hashCode() * 31) + this.contractAddress.hashCode()) * 31) + this.logoBase64.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewLogoWsData(chainId=" + this.chainId + ", contractAddress=" + this.contractAddress + ", logoBase64=" + this.logoBase64 + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.data.model.NewLogoWsData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NewLogoWsData> serializer() {
            return NewLogoWsData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NewLogoWsData(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, NewLogoWsData$$serializer.INSTANCE.getDescriptor());
        }
        this.chainId = str;
        this.contractAddress = str2;
        this.logoBase64 = str3;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(NewLogoWsData newLogoWsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, newLogoWsData.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, newLogoWsData.contractAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, newLogoWsData.logoBase64);
    }

    public NewLogoWsData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.chainId = str;
        this.contractAddress = str2;
        this.logoBase64 = str3;
    }
}
