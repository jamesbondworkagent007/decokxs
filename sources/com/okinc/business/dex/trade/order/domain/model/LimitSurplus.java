package com.okinc.business.dex.trade.order.domain.model;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class LimitSurplus {
    private final String estAmount;
    private final String estValueUsd;
    private final String executedValueUsd;
    private final String surplusAmount;
    private final List<SurplusDetail> surplusDetailList;
    private final String surplusValueUsd;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(SurplusDetail$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitSurplus() {
        this((String) null, (String) null, (String) null, (String) null, (List) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.dex.trade.order.domain.model.LimitSurplus */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LimitSurplus copy$default(LimitSurplus limitSurplus, String str, String str2, String str3, String str4, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = limitSurplus.estAmount;
        }
        if ((i & 2) != 0) {
            str2 = limitSurplus.estValueUsd;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = limitSurplus.executedValueUsd;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = limitSurplus.surplusAmount;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            list = limitSurplus.surplusDetailList;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            str5 = limitSurplus.surplusValueUsd;
        }
        return limitSurplus.copy(str, str6, str7, str8, list2, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.estAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.estValueUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.executedValueUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.surplusAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SurplusDetail> component5() {
        return this.surplusDetailList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.surplusValueUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitSurplus copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<SurplusDetail> list, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new LimitSurplus(str, str2, str3, str4, list, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitSurplus)) {
            return false;
        }
        LimitSurplus limitSurplus = (LimitSurplus) obj;
        return Intrinsics.EZpvd((Object) this.estAmount, (Object) limitSurplus.estAmount) && Intrinsics.EZpvd((Object) this.estValueUsd, (Object) limitSurplus.estValueUsd) && Intrinsics.EZpvd((Object) this.executedValueUsd, (Object) limitSurplus.executedValueUsd) && Intrinsics.EZpvd((Object) this.surplusAmount, (Object) limitSurplus.surplusAmount) && Intrinsics.EZpvd(this.surplusDetailList, limitSurplus.surplusDetailList) && Intrinsics.EZpvd((Object) this.surplusValueUsd, (Object) limitSurplus.surplusValueUsd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstAmount() {
        return this.estAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstValueUsd() {
        return this.estValueUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExecutedValueUsd() {
        return this.executedValueUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSurplusAmount() {
        return this.surplusAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SurplusDetail> getSurplusDetailList() {
        return this.surplusDetailList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSurplusValueUsd() {
        return this.surplusValueUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.estAmount.hashCode() * 31) + this.estValueUsd.hashCode()) * 31) + this.executedValueUsd.hashCode()) * 31) + this.surplusAmount.hashCode()) * 31) + this.surplusDetailList.hashCode()) * 31) + this.surplusValueUsd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitSurplus(estAmount=" + this.estAmount + ", estValueUsd=" + this.estValueUsd + ", executedValueUsd=" + this.executedValueUsd + ", surplusAmount=" + this.surplusAmount + ", surplusDetailList=" + this.surplusDetailList + ", surplusValueUsd=" + this.surplusValueUsd + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.domain.model.LimitSurplus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LimitSurplus> serializer() {
            return LimitSurplus$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LimitSurplus(int i, String str, String str2, String str3, String str4, List list, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.estAmount = "";
        } else {
            this.estAmount = str;
        }
        if ((i & 2) == 0) {
            this.estValueUsd = "";
        } else {
            this.estValueUsd = str2;
        }
        if ((i & 4) == 0) {
            this.executedValueUsd = "";
        } else {
            this.executedValueUsd = str3;
        }
        if ((i & 8) == 0) {
            this.surplusAmount = "";
        } else {
            this.surplusAmount = str4;
        }
        if ((i & 16) == 0) {
            this.surplusDetailList = yDY.AhwBna();
        } else {
            this.surplusDetailList = list;
        }
        if ((i & 32) == 0) {
            this.surplusValueUsd = "";
        } else {
            this.surplusValueUsd = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LimitSurplus limitSurplus, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) limitSurplus.estAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, limitSurplus.estAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) limitSurplus.estValueUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, limitSurplus.estValueUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) limitSurplus.executedValueUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, limitSurplus.executedValueUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) limitSurplus.surplusAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, limitSurplus.surplusAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(limitSurplus.surplusDetailList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], limitSurplus.surplusDetailList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) limitSurplus.surplusValueUsd, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, limitSurplus.surplusValueUsd);
    }

    public LimitSurplus(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<SurplusDetail> list, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.estAmount = str;
        this.estValueUsd = str2;
        this.executedValueUsd = str3;
        this.surplusAmount = str4;
        this.surplusDetailList = list;
        this.surplusValueUsd = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.util.List:0x0026: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0022: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:168)) : (r10v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.dex.trade.order.domain.model.SurplusDetail>, java.lang.String):void (m)] (LINE:163) call: com.okinc.business.dex.trade.order.domain.model.LimitSurplus.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ LimitSurplus(String str, String str2, String str3, String str4, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? yDY.AhwBna() : list, (i & 32) != 0 ? "" : str5);
    }
}
