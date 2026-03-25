package com.okinc.business.invest_biz.data.bean.response;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class BonusPopupDetailsResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String coinAmount;
    private final String currencyAmount;
    private final String tokenLogo;
    private final String tokenSymbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BonusPopupDetailsResponse copy$default(BonusPopupDetailsResponse bonusPopupDetailsResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bonusPopupDetailsResponse.tokenSymbol;
        }
        if ((i & 2) != 0) {
            str2 = bonusPopupDetailsResponse.tokenLogo;
        }
        if ((i & 4) != 0) {
            str3 = bonusPopupDetailsResponse.coinAmount;
        }
        if ((i & 8) != 0) {
            str4 = bonusPopupDetailsResponse.currencyAmount;
        }
        return bonusPopupDetailsResponse.copy(str, str2, str3, str4);
    }

    @SerialName("coinAmount")
    public static /* synthetic */ void getCoinAmount$annotations() {
    }

    @SerialName("currencyAmount")
    public static /* synthetic */ void getCurrencyAmount$annotations() {
    }

    @SerialName("tokenLogo")
    public static /* synthetic */ void getTokenLogo$annotations() {
    }

    @SerialName("tokenSymbol")
    public static /* synthetic */ void getTokenSymbol$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BonusPopupDetailsResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new BonusPopupDetailsResponse(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusPopupDetailsResponse)) {
            return false;
        }
        BonusPopupDetailsResponse bonusPopupDetailsResponse = (BonusPopupDetailsResponse) obj;
        return Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) bonusPopupDetailsResponse.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) bonusPopupDetailsResponse.tokenLogo) && Intrinsics.EZpvd((Object) this.coinAmount, (Object) bonusPopupDetailsResponse.coinAmount) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) bonusPopupDetailsResponse.currencyAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogo() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.tokenSymbol.hashCode() * 31) + this.tokenLogo.hashCode()) * 31) + this.coinAmount.hashCode()) * 31) + this.currencyAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BonusPopupDetailsResponse(tokenSymbol=" + this.tokenSymbol + ", tokenLogo=" + this.tokenLogo + ", coinAmount=" + this.coinAmount + ", currencyAmount=" + this.currencyAmount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.response.BonusPopupDetailsResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BonusPopupDetailsResponse> serializer() {
            return BonusPopupDetailsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BonusPopupDetailsResponse(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, BonusPopupDetailsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenSymbol = str;
        this.tokenLogo = str2;
        this.coinAmount = str3;
        this.currencyAmount = str4;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(BonusPopupDetailsResponse bonusPopupDetailsResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, bonusPopupDetailsResponse.tokenSymbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, bonusPopupDetailsResponse.tokenLogo);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, bonusPopupDetailsResponse.coinAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, bonusPopupDetailsResponse.currencyAmount);
    }

    public BonusPopupDetailsResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.tokenSymbol = str;
        this.tokenLogo = str2;
        this.coinAmount = str3;
        this.currencyAmount = str4;
    }
}
