package com.okinc.tradingbot.impl.dto;

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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ArbitrageStakingProfitsResponse {
    public final ArbitrageStakingProfitItem estimated;
    public final boolean hasNextPage;
    public final List<ArbitrageStakingProfitItem> list;
    public final int total;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(ArbitrageStakingProfitItem$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArbitrageStakingProfitsResponse() {
        this((ArbitrageStakingProfitItem) null, (List) null, false, 0, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.dto.ArbitrageStakingProfitsResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArbitrageStakingProfitsResponse copy$default(ArbitrageStakingProfitsResponse arbitrageStakingProfitsResponse, ArbitrageStakingProfitItem arbitrageStakingProfitItem, List list, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            arbitrageStakingProfitItem = arbitrageStakingProfitsResponse.estimated;
        }
        if ((i2 & 2) != 0) {
            list = arbitrageStakingProfitsResponse.list;
        }
        if ((i2 & 4) != 0) {
            z = arbitrageStakingProfitsResponse.hasNextPage;
        }
        if ((i2 & 8) != 0) {
            i = arbitrageStakingProfitsResponse.total;
        }
        return arbitrageStakingProfitsResponse.AEQbTJ(arbitrageStakingProfitItem, list, z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageStakingProfitsResponse AEQbTJ(ArbitrageStakingProfitItem arbitrageStakingProfitItem, @NotNull List<ArbitrageStakingProfitItem> list, boolean z, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ArbitrageStakingProfitsResponse(arbitrageStakingProfitItem, list, z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.hasNextPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageStakingProfitItem KWHzl() {
        return this.estimated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ArbitrageStakingProfitItem> OLrzqt() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArbitrageStakingProfitsResponse)) {
            return false;
        }
        ArbitrageStakingProfitsResponse arbitrageStakingProfitsResponse = (ArbitrageStakingProfitsResponse) obj;
        return Intrinsics.EZpvd(this.estimated, arbitrageStakingProfitsResponse.estimated) && Intrinsics.EZpvd(this.list, arbitrageStakingProfitsResponse.list) && this.hasNextPage == arbitrageStakingProfitsResponse.hasNextPage && this.total == arbitrageStakingProfitsResponse.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ArbitrageStakingProfitItem arbitrageStakingProfitItem = this.estimated;
        return ((((((arbitrageStakingProfitItem == null ? 0 : arbitrageStakingProfitItem.hashCode()) * 31) + this.list.hashCode()) * 31) + Boolean.hashCode(this.hasNextPage)) * 31) + Integer.hashCode(this.total);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ArbitrageStakingProfitsResponse(estimated=" + this.estimated + ", list=" + this.list + ", hasNextPage=" + this.hasNextPage + ", total=" + this.total + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.dto.ArbitrageStakingProfitsResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ArbitrageStakingProfitsResponse> serializer() {
            return ArbitrageStakingProfitsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ArbitrageStakingProfitsResponse(int i, ArbitrageStakingProfitItem arbitrageStakingProfitItem, List list, boolean z, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        this.estimated = (i & 1) == 0 ? null : arbitrageStakingProfitItem;
        if ((i & 2) == 0) {
            this.list = yDY.AhwBna();
        } else {
            this.list = list;
        }
        if ((i & 4) == 0) {
            this.hasNextPage = true;
        } else {
            this.hasNextPage = z;
        }
        if ((i & 8) == 0) {
            this.total = 0;
        } else {
            this.total = i2;
        }
    }

    public static final /* synthetic */ void EZpvd(ArbitrageStakingProfitsResponse arbitrageStakingProfitsResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || arbitrageStakingProfitsResponse.estimated != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ArbitrageStakingProfitItem$$serializer.INSTANCE, arbitrageStakingProfitsResponse.estimated);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(arbitrageStakingProfitsResponse.list, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], arbitrageStakingProfitsResponse.list);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !arbitrageStakingProfitsResponse.hasNextPage) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, arbitrageStakingProfitsResponse.hasNextPage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && arbitrageStakingProfitsResponse.total == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 3, arbitrageStakingProfitsResponse.total);
    }

    public ArbitrageStakingProfitsResponse(ArbitrageStakingProfitItem arbitrageStakingProfitItem, @NotNull List<ArbitrageStakingProfitItem> list, boolean z, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        this.estimated = arbitrageStakingProfitItem;
        this.list = list;
        this.hasNextPage = z;
        this.total = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:com.okinc.tradingbot.impl.dto.ArbitrageStakingProfitItem:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.tradingbot.impl.dto.ArbitrageStakingProfitItem) : (r1v0 com.okinc.tradingbot.impl.dto.ArbitrageStakingProfitItem))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0009: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:8)) : (r2v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000d: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(com.okinc.tradingbot.impl.dto.ArbitrageStakingProfitItem, java.util.List<com.okinc.tradingbot.impl.dto.ArbitrageStakingProfitItem>, boolean, int):void (m)] (LINE:6) call: com.okinc.tradingbot.impl.dto.ArbitrageStakingProfitsResponse.<init>(com.okinc.tradingbot.impl.dto.ArbitrageStakingProfitItem, java.util.List, boolean, int):void type: THIS */
    public /* synthetic */ ArbitrageStakingProfitsResponse(ArbitrageStakingProfitItem arbitrageStakingProfitItem, List list, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : arbitrageStakingProfitItem, (i2 & 2) != 0 ? yDY.AhwBna() : list, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? 0 : i);
    }
}
