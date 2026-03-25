package com.okinc.business.web3pay.lib.core.network.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C31270lqp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class ConvertInfoWS extends C31270lqp {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int convertOrderType;
    private final String currencyAmount;
    private final String tokenAmount;
    private final String tokenCoinTypeNo;
    private final int tokenDecimal;
    private final String tokenSymbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ConvertInfoWS copy$default(ConvertInfoWS convertInfoWS, String str, String str2, int i, int i2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = convertInfoWS.tokenSymbol;
        }
        if ((i3 & 2) != 0) {
            str2 = convertInfoWS.tokenAmount;
        }
        String str5 = str2;
        if ((i3 & 4) != 0) {
            i = convertInfoWS.tokenDecimal;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = convertInfoWS.convertOrderType;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            str3 = convertInfoWS.tokenCoinTypeNo;
        }
        String str6 = str3;
        if ((i3 & 32) != 0) {
            str4 = convertInfoWS.currencyAmount;
        }
        return convertInfoWS.copy(str, str5, i4, i5, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.convertOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertInfoWS copy(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new ConvertInfoWS(str, str2, i, i2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConvertInfoWS)) {
            return false;
        }
        ConvertInfoWS convertInfoWS = (ConvertInfoWS) obj;
        return Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) convertInfoWS.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) convertInfoWS.tokenAmount) && this.tokenDecimal == convertInfoWS.tokenDecimal && this.convertOrderType == convertInfoWS.convertOrderType && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) convertInfoWS.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) convertInfoWS.currencyAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getConvertOrderType() {
        return this.convertOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmount() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenCoinTypeNo() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTokenDecimal() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.tokenSymbol.hashCode() * 31) + this.tokenAmount.hashCode()) * 31) + Integer.hashCode(this.tokenDecimal)) * 31) + Integer.hashCode(this.convertOrderType)) * 31) + this.tokenCoinTypeNo.hashCode()) * 31) + this.currencyAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConvertInfoWS(tokenSymbol=" + this.tokenSymbol + ", tokenAmount=" + this.tokenAmount + ", tokenDecimal=" + this.tokenDecimal + ", convertOrderType=" + this.convertOrderType + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", currencyAmount=" + this.currencyAmount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.network.ws.ConvertInfoWS.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ConvertInfoWS> serializer() {
            return ConvertInfoWS$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConvertInfoWS(int i, String str, String str2, int i2, int i3, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, ConvertInfoWS$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenSymbol = str;
        this.tokenAmount = str2;
        this.tokenDecimal = i2;
        this.convertOrderType = i3;
        this.tokenCoinTypeNo = str3;
        this.currencyAmount = str4;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(ConvertInfoWS convertInfoWS, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, convertInfoWS.tokenSymbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, convertInfoWS.tokenAmount);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, convertInfoWS.tokenDecimal);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, convertInfoWS.convertOrderType);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, convertInfoWS.tokenCoinTypeNo);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, convertInfoWS.currencyAmount);
    }

    public ConvertInfoWS(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.tokenSymbol = str;
        this.tokenAmount = str2;
        this.tokenDecimal = i;
        this.convertOrderType = i2;
        this.tokenCoinTypeNo = str3;
        this.currencyAmount = str4;
    }
}
