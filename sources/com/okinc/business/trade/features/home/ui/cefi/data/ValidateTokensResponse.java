package com.okinc.business.trade.features.home.ui.cefi.data;

import com.google.gson.annotations.SerializedName;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean$$serializer;
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
public final class ValidateTokensResponse {

    @SerializedName("quoteTokenInfo")
    private final DexMultiTokenInfoBean fromTokenInfo;

    @SerializedName("baseTokenInfo")
    private final DexMultiTokenInfoBean toTokenInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ValidateTokensResponse copy$default(ValidateTokensResponse validateTokensResponse, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i, Object obj) {
        if ((i & 1) != 0) {
            dexMultiTokenInfoBean = validateTokensResponse.fromTokenInfo;
        }
        if ((i & 2) != 0) {
            dexMultiTokenInfoBean2 = validateTokensResponse.toTokenInfo;
        }
        return validateTokensResponse.copy(dexMultiTokenInfoBean, dexMultiTokenInfoBean2);
    }

    @SerialName("quoteTokenInfo")
    public static /* synthetic */ void getFromTokenInfo$annotations() {
    }

    @SerialName("baseTokenInfo")
    public static /* synthetic */ void getToTokenInfo$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component1() {
        return this.fromTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component2() {
        return this.toTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValidateTokensResponse copy(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean2, "");
        return new ValidateTokensResponse(dexMultiTokenInfoBean, dexMultiTokenInfoBean2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateTokensResponse)) {
            return false;
        }
        ValidateTokensResponse validateTokensResponse = (ValidateTokensResponse) obj;
        return Intrinsics.EZpvd(this.fromTokenInfo, validateTokensResponse.fromTokenInfo) && Intrinsics.EZpvd(this.toTokenInfo, validateTokensResponse.toTokenInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getFromTokenInfo() {
        return this.fromTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getToTokenInfo() {
        return this.toTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.fromTokenInfo.hashCode() * 31) + this.toTokenInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ValidateTokensResponse(fromTokenInfo=" + this.fromTokenInfo + ", toTokenInfo=" + this.toTokenInfo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ValidateTokensResponse> serializer() {
            return ValidateTokensResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ValidateTokensResponse(int i, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ValidateTokensResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.fromTokenInfo = dexMultiTokenInfoBean;
        this.toTokenInfo = dexMultiTokenInfoBean2;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(ValidateTokensResponse validateTokensResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, dexMultiTokenInfoBean$$serializer, validateTokensResponse.fromTokenInfo);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, dexMultiTokenInfoBean$$serializer, validateTokensResponse.toTokenInfo);
    }

    public ValidateTokensResponse(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean2, "");
        this.fromTokenInfo = dexMultiTokenInfoBean;
        this.toTokenInfo = dexMultiTokenInfoBean2;
    }
}
