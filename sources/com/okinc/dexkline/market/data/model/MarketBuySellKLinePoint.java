package com.okinc.dexkline.market.data.model;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class MarketBuySellKLinePoint {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String buyAmount;
    public final String buyCount;
    public final String buyPrice;
    public final String buyValue;
    public final String fromAddressTag;
    public final String sellAmount;
    public final String sellCount;
    public final String sellPrice;
    public final String sellValue;
    public final String time;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.fromAddressTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketBuySellKLinePoint EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new MarketBuySellKLinePoint(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.buyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.buyPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.sellPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.sellCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketBuySellKLinePoint)) {
            return false;
        }
        MarketBuySellKLinePoint marketBuySellKLinePoint = (MarketBuySellKLinePoint) obj;
        return Intrinsics.EZpvd((Object) this.time, (Object) marketBuySellKLinePoint.time) && Intrinsics.EZpvd((Object) this.buyPrice, (Object) marketBuySellKLinePoint.buyPrice) && Intrinsics.EZpvd((Object) this.buyCount, (Object) marketBuySellKLinePoint.buyCount) && Intrinsics.EZpvd((Object) this.buyAmount, (Object) marketBuySellKLinePoint.buyAmount) && Intrinsics.EZpvd((Object) this.buyValue, (Object) marketBuySellKLinePoint.buyValue) && Intrinsics.EZpvd((Object) this.sellPrice, (Object) marketBuySellKLinePoint.sellPrice) && Intrinsics.EZpvd((Object) this.sellCount, (Object) marketBuySellKLinePoint.sellCount) && Intrinsics.EZpvd((Object) this.sellAmount, (Object) marketBuySellKLinePoint.sellAmount) && Intrinsics.EZpvd((Object) this.sellValue, (Object) marketBuySellKLinePoint.sellValue) && Intrinsics.EZpvd((Object) this.fromAddressTag, (Object) marketBuySellKLinePoint.fromAddressTag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.time.hashCode() * 31) + this.buyPrice.hashCode()) * 31) + this.buyCount.hashCode()) * 31) + this.buyAmount.hashCode()) * 31) + this.buyValue.hashCode()) * 31) + this.sellPrice.hashCode()) * 31) + this.sellCount.hashCode()) * 31) + this.sellAmount.hashCode()) * 31) + this.sellValue.hashCode()) * 31) + this.fromAddressTag.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketBuySellKLinePoint(time=" + this.time + ", buyPrice=" + this.buyPrice + ", buyCount=" + this.buyCount + ", buyAmount=" + this.buyAmount + ", buyValue=" + this.buyValue + ", sellPrice=" + this.sellPrice + ", sellCount=" + this.sellCount + ", sellAmount=" + this.sellAmount + ", sellValue=" + this.sellValue + ", fromAddressTag=" + this.fromAddressTag + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.MarketBuySellKLinePoint.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MarketBuySellKLinePoint> serializer() {
            return MarketBuySellKLinePoint$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MarketBuySellKLinePoint(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i, FrameMetricsAggregator.EVERY_DURATION, MarketBuySellKLinePoint$$serializer.INSTANCE.getDescriptor());
        }
        this.time = str;
        this.buyPrice = str2;
        this.buyCount = str3;
        this.buyAmount = str4;
        this.buyValue = str5;
        this.sellPrice = str6;
        this.sellCount = str7;
        this.sellAmount = str8;
        this.sellValue = str9;
        if ((i & 512) == 0) {
            this.fromAddressTag = "";
        } else {
            this.fromAddressTag = str10;
        }
    }

    public static final /* synthetic */ void AEQbTJ(MarketBuySellKLinePoint marketBuySellKLinePoint, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, marketBuySellKLinePoint.time);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, marketBuySellKLinePoint.buyPrice);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, marketBuySellKLinePoint.buyCount);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, marketBuySellKLinePoint.buyAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, marketBuySellKLinePoint.buyValue);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, marketBuySellKLinePoint.sellPrice);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, marketBuySellKLinePoint.sellCount);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, marketBuySellKLinePoint.sellAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, marketBuySellKLinePoint.sellValue);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) marketBuySellKLinePoint.fromAddressTag, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, marketBuySellKLinePoint.fromAddressTag);
    }

    public MarketBuySellKLinePoint(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.time = str;
        this.buyPrice = str2;
        this.buyCount = str3;
        this.buyAmount = str4;
        this.buyValue = str5;
        this.sellPrice = str6;
        this.sellCount = str7;
        this.sellAmount = str8;
        this.sellValue = str9;
        this.fromAddressTag = str10;
    }
}
