package com.okinc.business.market.data.model.holdings;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class HoldingListResponseData {
    public final List<HoldingData> holdings;
    public final String isExceedLimit;
    public final String smallAmountTokenValue;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(HoldingData$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HoldingListResponseData() {
        this((List) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.holdings.HoldingListResponseData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HoldingListResponseData copy$default(HoldingListResponseData holdingListResponseData, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = holdingListResponseData.holdings;
        }
        if ((i & 2) != 0) {
            str = holdingListResponseData.isExceedLimit;
        }
        if ((i & 4) != 0) {
            str2 = holdingListResponseData.smallAmountTokenValue;
        }
        return holdingListResponseData.copydefault((List<HoldingData>) list, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HoldingData> AEQbTJ() {
        return this.holdings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HoldingListResponseData copydefault(@NotNull List<HoldingData> list, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new HoldingListResponseData(list, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HoldingListResponseData)) {
            return false;
        }
        HoldingListResponseData holdingListResponseData = (HoldingListResponseData) obj;
        return Intrinsics.EZpvd(this.holdings, holdingListResponseData.holdings) && Intrinsics.EZpvd((Object) this.isExceedLimit, (Object) holdingListResponseData.isExceedLimit) && Intrinsics.EZpvd((Object) this.smallAmountTokenValue, (Object) holdingListResponseData.smallAmountTokenValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.holdings.hashCode() * 31) + this.isExceedLimit.hashCode()) * 31) + this.smallAmountTokenValue.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HoldingListResponseData(holdings=" + this.holdings + ", isExceedLimit=" + this.isExceedLimit + ", smallAmountTokenValue=" + this.smallAmountTokenValue + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.holdings.HoldingListResponseData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HoldingListResponseData> serializer() {
            return HoldingListResponseData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HoldingListResponseData(int i, List list, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        this.holdings = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.isExceedLimit = "";
        } else {
            this.isExceedLimit = str;
        }
        if ((i & 4) == 0) {
            this.smallAmountTokenValue = "";
        } else {
            this.smallAmountTokenValue = str2;
        }
    }

    public static final /* synthetic */ void copydefault(HoldingListResponseData holdingListResponseData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(holdingListResponseData.holdings, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], holdingListResponseData.holdings);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) holdingListResponseData.isExceedLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, holdingListResponseData.isExceedLimit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) holdingListResponseData.smallAmountTokenValue, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, holdingListResponseData.smallAmountTokenValue);
    }

    public HoldingListResponseData(@NotNull List<HoldingData> list, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.holdings = list;
        this.isExceedLimit = str;
        this.smallAmountTokenValue = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:9)) : (r2v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.business.market.data.model.holdings.HoldingData>, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.business.market.data.model.holdings.HoldingListResponseData.<init>(java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HoldingListResponseData(List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
