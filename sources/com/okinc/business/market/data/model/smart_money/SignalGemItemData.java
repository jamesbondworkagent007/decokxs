package com.okinc.business.market.data.model.smart_money;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.market.common.constants.RiskControlLevel;
import com.okinc.business.market.data.model.common.DexTokenMeta;
import com.okinc.business.market.data.model.common.DexTokenMeta$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class SignalGemItemData {
    public static final int $stable = 0;
    public final String currentMarketCap;
    public final String firstSignalMarketCap;
    public final String firstSignalRectangleTime;
    public final String firstSignalTime;
    public final SignalGemType gemsType;
    public final String maxIncreaseMultiplier;
    public final String maxIncreasePercentage;
    public final DexTokenMeta tokenInfo;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {null, SignalGemType.Companion.serializer(), null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalGemItemData AEQbTJ(@NotNull DexTokenMeta dexTokenMeta, @NotNull SignalGemType signalGemType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(dexTokenMeta, "");
        Intrinsics.checkNotNullParameter(signalGemType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new SignalGemItemData(dexTokenMeta, signalGemType, str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalGemType AEQbTJ() {
        return this.gemsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexTokenMeta AhwBna() {
        return this.tokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.firstSignalMarketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.currentMarketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.firstSignalTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.maxIncreaseMultiplier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalGemItemData)) {
            return false;
        }
        SignalGemItemData signalGemItemData = (SignalGemItemData) obj;
        return Intrinsics.EZpvd(this.tokenInfo, signalGemItemData.tokenInfo) && this.gemsType == signalGemItemData.gemsType && Intrinsics.EZpvd((Object) this.currentMarketCap, (Object) signalGemItemData.currentMarketCap) && Intrinsics.EZpvd((Object) this.firstSignalMarketCap, (Object) signalGemItemData.firstSignalMarketCap) && Intrinsics.EZpvd((Object) this.firstSignalTime, (Object) signalGemItemData.firstSignalTime) && Intrinsics.EZpvd((Object) this.firstSignalRectangleTime, (Object) signalGemItemData.firstSignalRectangleTime) && Intrinsics.EZpvd((Object) this.maxIncreasePercentage, (Object) signalGemItemData.maxIncreasePercentage) && Intrinsics.EZpvd((Object) this.maxIncreaseMultiplier, (Object) signalGemItemData.maxIncreaseMultiplier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.tokenInfo.hashCode() * 31) + this.gemsType.hashCode()) * 31) + this.currentMarketCap.hashCode()) * 31) + this.firstSignalMarketCap.hashCode()) * 31) + this.firstSignalTime.hashCode()) * 31) + this.firstSignalRectangleTime.hashCode()) * 31) + this.maxIncreasePercentage.hashCode()) * 31) + this.maxIncreaseMultiplier.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalGemItemData(tokenInfo=" + this.tokenInfo + ", gemsType=" + this.gemsType + ", currentMarketCap=" + this.currentMarketCap + ", firstSignalMarketCap=" + this.firstSignalMarketCap + ", firstSignalTime=" + this.firstSignalTime + ", firstSignalRectangleTime=" + this.firstSignalRectangleTime + ", maxIncreasePercentage=" + this.maxIncreasePercentage + ", maxIncreaseMultiplier=" + this.maxIncreaseMultiplier + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.smart_money.SignalGemItemData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalGemItemData> serializer() {
            return SignalGemItemData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalGemItemData(int i, DexTokenMeta dexTokenMeta, SignalGemType signalGemType, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, SignalGemItemData$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenInfo = (i & 1) == 0 ? new DexTokenMeta((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (RiskControlLevel) null, 0L, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null) : dexTokenMeta;
        this.gemsType = signalGemType;
        if ((i & 4) == 0) {
            this.currentMarketCap = "0";
        } else {
            this.currentMarketCap = str;
        }
        if ((i & 8) == 0) {
            this.firstSignalMarketCap = "0";
        } else {
            this.firstSignalMarketCap = str2;
        }
        if ((i & 16) == 0) {
            this.firstSignalTime = "0";
        } else {
            this.firstSignalTime = str3;
        }
        if ((i & 32) == 0) {
            this.firstSignalRectangleTime = "0";
        } else {
            this.firstSignalRectangleTime = str4;
        }
        if ((i & 64) == 0) {
            this.maxIncreasePercentage = "0";
        } else {
            this.maxIncreasePercentage = str5;
        }
        if ((i & 128) == 0) {
            this.maxIncreaseMultiplier = "0";
        } else {
            this.maxIncreaseMultiplier = str6;
        }
    }

    public static final /* synthetic */ void OLrzqt(SignalGemItemData signalGemItemData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(signalGemItemData.tokenInfo, new DexTokenMeta((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (RiskControlLevel) null, 0L, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, DexTokenMeta$$serializer.INSTANCE, signalGemItemData.tokenInfo);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], signalGemItemData.gemsType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) signalGemItemData.currentMarketCap, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, signalGemItemData.currentMarketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) signalGemItemData.firstSignalMarketCap, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, signalGemItemData.firstSignalMarketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) signalGemItemData.firstSignalTime, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, signalGemItemData.firstSignalTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) signalGemItemData.firstSignalRectangleTime, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, signalGemItemData.firstSignalRectangleTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) signalGemItemData.maxIncreasePercentage, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, signalGemItemData.maxIncreasePercentage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) signalGemItemData.maxIncreaseMultiplier, (Object) "0")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, signalGemItemData.maxIncreaseMultiplier);
    }

    public SignalGemItemData(@NotNull DexTokenMeta dexTokenMeta, @NotNull SignalGemType signalGemType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(dexTokenMeta, "");
        Intrinsics.checkNotNullParameter(signalGemType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.tokenInfo = dexTokenMeta;
        this.gemsType = signalGemType;
        this.currentMarketCap = str;
        this.firstSignalMarketCap = str2;
        this.firstSignalTime = str3;
        this.firstSignalRectangleTime = str4;
        this.maxIncreasePercentage = str5;
        this.maxIncreaseMultiplier = str6;
    }
}
