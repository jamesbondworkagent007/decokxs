package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class BaseLeverageMarginInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String bestLeverage;
    private final String isAfterSuccess;
    private final String isCalculate;
    private final String maxSize;
    private final String maxSizeCcy;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BaseLeverageMarginInfo copy$default(BaseLeverageMarginInfo baseLeverageMarginInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = baseLeverageMarginInfo.isCalculate;
        }
        if ((i & 2) != 0) {
            str2 = baseLeverageMarginInfo.bestLeverage;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = baseLeverageMarginInfo.maxSize;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = baseLeverageMarginInfo.maxSizeCcy;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = baseLeverageMarginInfo.isAfterSuccess;
        }
        return baseLeverageMarginInfo.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.isCalculate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.bestLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maxSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.maxSizeCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.isAfterSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BaseLeverageMarginInfo copy(@NotNull String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        return new BaseLeverageMarginInfo(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLeverageMarginInfo)) {
            return false;
        }
        BaseLeverageMarginInfo baseLeverageMarginInfo = (BaseLeverageMarginInfo) obj;
        return Intrinsics.EZpvd((Object) this.isCalculate, (Object) baseLeverageMarginInfo.isCalculate) && Intrinsics.EZpvd((Object) this.bestLeverage, (Object) baseLeverageMarginInfo.bestLeverage) && Intrinsics.EZpvd((Object) this.maxSize, (Object) baseLeverageMarginInfo.maxSize) && Intrinsics.EZpvd((Object) this.maxSizeCcy, (Object) baseLeverageMarginInfo.maxSizeCcy) && Intrinsics.EZpvd((Object) this.isAfterSuccess, (Object) baseLeverageMarginInfo.isAfterSuccess);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBestLeverage() {
        return this.bestLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSize() {
        return this.maxSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSizeCcy() {
        return this.maxSizeCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.isCalculate.hashCode();
        String str = this.bestLeverage;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.maxSize;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.maxSizeCcy;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.isAfterSuccess;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isAfterSuccess() {
        return this.isAfterSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isCalculate() {
        return this.isCalculate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BaseLeverageMarginInfo(isCalculate=" + this.isCalculate + ", bestLeverage=" + this.bestLeverage + ", maxSize=" + this.maxSize + ", maxSizeCcy=" + this.maxSizeCcy + ", isAfterSuccess=" + this.isAfterSuccess + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BaseLeverageMarginInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BaseLeverageMarginInfo> serializer() {
            return BaseLeverageMarginInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BaseLeverageMarginInfo(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, BaseLeverageMarginInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.isCalculate = str;
        this.bestLeverage = str2;
        this.maxSize = str3;
        this.maxSizeCcy = str4;
        this.isAfterSuccess = str5;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BaseLeverageMarginInfo baseLeverageMarginInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, baseLeverageMarginInfo.isCalculate);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, baseLeverageMarginInfo.bestLeverage);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, baseLeverageMarginInfo.maxSize);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, baseLeverageMarginInfo.maxSizeCcy);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, baseLeverageMarginInfo.isAfterSuccess);
    }

    public BaseLeverageMarginInfo(@NotNull String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isCalculate = str;
        this.bestLeverage = str2;
        this.maxSize = str3;
        this.maxSizeCcy = str4;
        this.isAfterSuccess = str5;
    }
}
