package com.okinc.crcore.coreapi.net.responsebean;

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
public final class PositionSummary {
    private final List<PositionDetail> details;
    private final String margin;
    private final String mgnRatio;
    private final String upl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(PositionDetail$$serializer.INSTANCE), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PositionSummary() {
        this((List) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.PositionSummary */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PositionSummary copy$default(PositionSummary positionSummary, List list, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = positionSummary.details;
        }
        if ((i & 2) != 0) {
            str = positionSummary.margin;
        }
        if ((i & 4) != 0) {
            str2 = positionSummary.mgnRatio;
        }
        if ((i & 8) != 0) {
            str3 = positionSummary.upl;
        }
        return positionSummary.copy(list, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PositionDetail> component1() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.margin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PositionSummary copy(@NotNull List<PositionDetail> list, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new PositionSummary(list, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PositionSummary)) {
            return false;
        }
        PositionSummary positionSummary = (PositionSummary) obj;
        return Intrinsics.EZpvd(this.details, positionSummary.details) && Intrinsics.EZpvd((Object) this.margin, (Object) positionSummary.margin) && Intrinsics.EZpvd((Object) this.mgnRatio, (Object) positionSummary.mgnRatio) && Intrinsics.EZpvd((Object) this.upl, (Object) positionSummary.upl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PositionDetail> getDetails() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMargin() {
        return this.margin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMgnRatio() {
        return this.mgnRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpl() {
        return this.upl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.details.hashCode() * 31) + this.margin.hashCode()) * 31) + this.mgnRatio.hashCode()) * 31) + this.upl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PositionSummary(details=" + this.details + ", margin=" + this.margin + ", mgnRatio=" + this.mgnRatio + ", upl=" + this.upl + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.PositionSummary.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PositionSummary> serializer() {
            return PositionSummary$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PositionSummary(int i, List list, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.details = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.margin = "";
        } else {
            this.margin = str;
        }
        if ((i & 4) == 0) {
            this.mgnRatio = "";
        } else {
            this.mgnRatio = str2;
        }
        if ((i & 8) == 0) {
            this.upl = "";
        } else {
            this.upl = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(PositionSummary positionSummary, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(positionSummary.details, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], positionSummary.details);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) positionSummary.margin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, positionSummary.margin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) positionSummary.mgnRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, positionSummary.mgnRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) positionSummary.upl, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, positionSummary.upl);
    }

    public PositionSummary(@NotNull List<PositionDetail> list, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.details = list;
        this.margin = str;
        this.mgnRatio = str2;
        this.upl = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:27)) : (r2v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.crcore.coreapi.net.responsebean.PositionDetail>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:26) call: com.okinc.crcore.coreapi.net.responsebean.PositionSummary.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PositionSummary(List list, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
