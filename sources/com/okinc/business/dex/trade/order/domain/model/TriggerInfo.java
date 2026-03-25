package com.okinc.business.dex.trade.order.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class TriggerInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String triggerMarketCapacity;
    private final String triggerPrice;
    private final String triggerRate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TriggerInfo() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TriggerInfo copy$default(TriggerInfo triggerInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = triggerInfo.triggerMarketCapacity;
        }
        if ((i & 2) != 0) {
            str2 = triggerInfo.triggerPrice;
        }
        if ((i & 4) != 0) {
            str3 = triggerInfo.triggerRate;
        }
        return triggerInfo.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.triggerMarketCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.triggerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.triggerRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TriggerInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TriggerInfo(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TriggerInfo)) {
            return false;
        }
        TriggerInfo triggerInfo = (TriggerInfo) obj;
        return Intrinsics.EZpvd((Object) this.triggerMarketCapacity, (Object) triggerInfo.triggerMarketCapacity) && Intrinsics.EZpvd((Object) this.triggerPrice, (Object) triggerInfo.triggerPrice) && Intrinsics.EZpvd((Object) this.triggerRate, (Object) triggerInfo.triggerRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerMarketCapacity() {
        return this.triggerMarketCapacity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerPrice() {
        return this.triggerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggerRate() {
        return this.triggerRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.triggerMarketCapacity.hashCode() * 31) + this.triggerPrice.hashCode()) * 31) + this.triggerRate.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TriggerInfo(triggerMarketCapacity=" + this.triggerMarketCapacity + ", triggerPrice=" + this.triggerPrice + ", triggerRate=" + this.triggerRate + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.domain.model.TriggerInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TriggerInfo> serializer() {
            return TriggerInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TriggerInfo(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.triggerMarketCapacity = "";
        } else {
            this.triggerMarketCapacity = str;
        }
        if ((i & 2) == 0) {
            this.triggerPrice = "";
        } else {
            this.triggerPrice = str2;
        }
        if ((i & 4) == 0) {
            this.triggerRate = "";
        } else {
            this.triggerRate = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TriggerInfo triggerInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) triggerInfo.triggerMarketCapacity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, triggerInfo.triggerMarketCapacity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) triggerInfo.triggerPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, triggerInfo.triggerPrice);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) triggerInfo.triggerRate, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, triggerInfo.triggerRate);
    }

    public TriggerInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.triggerMarketCapacity = str;
        this.triggerPrice = str2;
        this.triggerRate = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:133) call: com.okinc.business.dex.trade.order.domain.model.TriggerInfo.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TriggerInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
