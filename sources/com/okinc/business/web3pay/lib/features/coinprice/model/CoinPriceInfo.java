package com.okinc.business.web3pay.lib.features.coinprice.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CoinPriceInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean hasPrice;
    private final String price;
    private final String tokenCoinTypeNo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CoinPriceInfo copy$default(CoinPriceInfo coinPriceInfo, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = coinPriceInfo.hasPrice;
        }
        if ((i & 2) != 0) {
            str = coinPriceInfo.price;
        }
        if ((i & 4) != 0) {
            str2 = coinPriceInfo.tokenCoinTypeNo;
        }
        return coinPriceInfo.copy(z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.hasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinPriceInfo copy(boolean z, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CoinPriceInfo(z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinPriceInfo)) {
            return false;
        }
        CoinPriceInfo coinPriceInfo = (CoinPriceInfo) obj;
        return this.hasPrice == coinPriceInfo.hasPrice && Intrinsics.EZpvd((Object) this.price, (Object) coinPriceInfo.price) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) coinPriceInfo.tokenCoinTypeNo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasPrice() {
        return this.hasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenCoinTypeNo() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.hasPrice) * 31) + this.price.hashCode()) * 31) + this.tokenCoinTypeNo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinPriceInfo(hasPrice=" + this.hasPrice + ", price=" + this.price + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.coinprice.model.CoinPriceInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinPriceInfo> serializer() {
            return CoinPriceInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinPriceInfo(int i, boolean z, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, CoinPriceInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.hasPrice = z;
        this.price = str;
        this.tokenCoinTypeNo = str2;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(CoinPriceInfo coinPriceInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, coinPriceInfo.hasPrice);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, coinPriceInfo.price);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, coinPriceInfo.tokenCoinTypeNo);
    }

    public CoinPriceInfo(boolean z, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.hasPrice = z;
        this.price = str;
        this.tokenCoinTypeNo = str2;
    }
}
