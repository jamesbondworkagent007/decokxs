package com.okinc.crcore.coreapi.net.responsebean.dex;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SwapAnalysis {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<RiskItem> highRiskList;
    private final List<RiskItem> lowRiskList;
    private final List<RiskItem> middleRiskList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SwapAnalysis() {
        this((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.dex.SwapAnalysis */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SwapAnalysis copy$default(SwapAnalysis swapAnalysis, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = swapAnalysis.highRiskList;
        }
        if ((i & 2) != 0) {
            list2 = swapAnalysis.lowRiskList;
        }
        if ((i & 4) != 0) {
            list3 = swapAnalysis.middleRiskList;
        }
        return swapAnalysis.copy(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RiskItem> component1() {
        return this.highRiskList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RiskItem> component2() {
        return this.lowRiskList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RiskItem> component3() {
        return this.middleRiskList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapAnalysis copy(@NotNull List<RiskItem> list, @NotNull List<RiskItem> list2, @NotNull List<RiskItem> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new SwapAnalysis(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwapAnalysis)) {
            return false;
        }
        SwapAnalysis swapAnalysis = (SwapAnalysis) obj;
        return Intrinsics.EZpvd(this.highRiskList, swapAnalysis.highRiskList) && Intrinsics.EZpvd(this.lowRiskList, swapAnalysis.lowRiskList) && Intrinsics.EZpvd(this.middleRiskList, swapAnalysis.middleRiskList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RiskItem> getHighRiskList() {
        return this.highRiskList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RiskItem> getLowRiskList() {
        return this.lowRiskList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RiskItem> getMiddleRiskList() {
        return this.middleRiskList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.highRiskList.hashCode() * 31) + this.lowRiskList.hashCode()) * 31) + this.middleRiskList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SwapAnalysis(highRiskList=" + this.highRiskList + ", lowRiskList=" + this.lowRiskList + ", middleRiskList=" + this.middleRiskList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.dex.SwapAnalysis.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SwapAnalysis> serializer() {
            return SwapAnalysis$$serializer.INSTANCE;
        }
    }

    static {
        RiskItem$$serializer riskItem$$serializer = RiskItem$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(riskItem$$serializer), new ArrayListSerializer(riskItem$$serializer), new ArrayListSerializer(riskItem$$serializer)};
    }

    public /* synthetic */ SwapAnalysis(int i, List list, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        this.highRiskList = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.lowRiskList = yDY.AhwBna();
        } else {
            this.lowRiskList = list2;
        }
        if ((i & 4) == 0) {
            this.middleRiskList = yDY.AhwBna();
        } else {
            this.middleRiskList = list3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [47=4] */
    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(SwapAnalysis swapAnalysis, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(swapAnalysis.highRiskList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], swapAnalysis.highRiskList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(swapAnalysis.lowRiskList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], swapAnalysis.lowRiskList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(swapAnalysis.middleRiskList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], swapAnalysis.middleRiskList);
    }

    public SwapAnalysis(@NotNull List<RiskItem> list, @NotNull List<RiskItem> list2, @NotNull List<RiskItem> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.highRiskList = list;
        this.lowRiskList = list2;
        this.middleRiskList = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:50)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:51)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:52)) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.crcore.coreapi.net.responsebean.dex.RiskItem>, java.util.List<com.okinc.crcore.coreapi.net.responsebean.dex.RiskItem>, java.util.List<com.okinc.crcore.coreapi.net.responsebean.dex.RiskItem>):void (m)] (LINE:49) call: com.okinc.crcore.coreapi.net.responsebean.dex.SwapAnalysis.<init>(java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ SwapAnalysis(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3);
    }
}
