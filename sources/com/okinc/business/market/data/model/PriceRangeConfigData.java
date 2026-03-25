package com.okinc.business.market.data.model;

import com.okinc.business.market.data.constant.PriceRangeValueType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class PriceRangeConfigData {
    public static final int $stable = 0;
    public final String value;
    public final PriceRangeValueType valueType;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {PriceRangeValueType.Companion.serializer(), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PriceRangeConfigData() {
        this((PriceRangeValueType) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PriceRangeConfigData copy$default(PriceRangeConfigData priceRangeConfigData, PriceRangeValueType priceRangeValueType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            priceRangeValueType = priceRangeConfigData.valueType;
        }
        if ((i & 2) != 0) {
            str = priceRangeConfigData.value;
        }
        return priceRangeConfigData.KWHzl(priceRangeValueType, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeConfigData KWHzl(@NotNull PriceRangeValueType priceRangeValueType, @NotNull String str) {
        Intrinsics.checkNotNullParameter(priceRangeValueType, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new PriceRangeConfigData(priceRangeValueType, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceRangeConfigData)) {
            return false;
        }
        PriceRangeConfigData priceRangeConfigData = (PriceRangeConfigData) obj;
        return this.valueType == priceRangeConfigData.valueType && Intrinsics.EZpvd((Object) this.value, (Object) priceRangeConfigData.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.valueType.hashCode() * 31) + this.value.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PriceRangeConfigData(valueType=" + this.valueType + ", value=" + this.value + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.PriceRangeConfigData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PriceRangeConfigData> serializer() {
            return PriceRangeConfigData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PriceRangeConfigData(int i, PriceRangeValueType priceRangeValueType, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.valueType = (i & 1) == 0 ? PriceRangeValueType.Min : priceRangeValueType;
        if ((i & 2) == 0) {
            this.value = "0";
        } else {
            this.value = str;
        }
    }

    public static final /* synthetic */ void KWHzl(PriceRangeConfigData priceRangeConfigData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || priceRangeConfigData.valueType != PriceRangeValueType.Min) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], priceRangeConfigData.valueType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) priceRangeConfigData.value, (Object) "0")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, priceRangeConfigData.value);
    }

    public PriceRangeConfigData(@NotNull PriceRangeValueType priceRangeValueType, @NotNull String str) {
        Intrinsics.checkNotNullParameter(priceRangeValueType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.valueType = priceRangeValueType;
        this.value = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:com.okinc.business.market.data.constant.PriceRangeValueType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.data.constant.PriceRangeValueType:0x0004: SGET  A[WRAPPED] (LINE:10) com.okinc.business.market.data.constant.PriceRangeValueType.Min com.okinc.business.market.data.constant.PriceRangeValueType) : (r1v0 com.okinc.business.market.data.constant.PriceRangeValueType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r2v0 java.lang.String))
 A[MD:(com.okinc.business.market.data.constant.PriceRangeValueType, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.market.data.model.PriceRangeConfigData.<init>(com.okinc.business.market.data.constant.PriceRangeValueType, java.lang.String):void type: THIS */
    public /* synthetic */ PriceRangeConfigData(PriceRangeValueType priceRangeValueType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PriceRangeValueType.Min : priceRangeValueType, (i & 2) != 0 ? "0" : str);
    }
}
