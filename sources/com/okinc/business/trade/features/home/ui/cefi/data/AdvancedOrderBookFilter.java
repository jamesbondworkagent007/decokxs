package com.okinc.business.trade.features.home.ui.cefi.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class AdvancedOrderBookFilter {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String msgKey;
    private final MinMaxData valueData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvancedOrderBookFilter() {
        this((String) null, (MinMaxData) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AdvancedOrderBookFilter copy$default(AdvancedOrderBookFilter advancedOrderBookFilter, String str, MinMaxData minMaxData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advancedOrderBookFilter.msgKey;
        }
        if ((i & 2) != 0) {
            minMaxData = advancedOrderBookFilter.valueData;
        }
        return advancedOrderBookFilter.copy(str, minMaxData);
    }

    @SerialName("msgKey")
    public static /* synthetic */ void getMsgKey$annotations() {
    }

    @SerialName("valueData")
    public static /* synthetic */ void getValueData$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.msgKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MinMaxData component2() {
        return this.valueData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedOrderBookFilter copy(@NotNull String str, MinMaxData minMaxData) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AdvancedOrderBookFilter(str, minMaxData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvancedOrderBookFilter)) {
            return false;
        }
        AdvancedOrderBookFilter advancedOrderBookFilter = (AdvancedOrderBookFilter) obj;
        return Intrinsics.EZpvd((Object) this.msgKey, (Object) advancedOrderBookFilter.msgKey) && Intrinsics.EZpvd(this.valueData, advancedOrderBookFilter.valueData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsgKey() {
        return this.msgKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MinMaxData getValueData() {
        return this.valueData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.msgKey.hashCode();
        MinMaxData minMaxData = this.valueData;
        return (iHashCode * 31) + (minMaxData == null ? 0 : minMaxData.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AdvancedOrderBookFilter(msgKey=" + this.msgKey + ", valueData=" + this.valueData + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.data.AdvancedOrderBookFilter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdvancedOrderBookFilter> serializer() {
            return AdvancedOrderBookFilter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AdvancedOrderBookFilter(int i, String str, MinMaxData minMaxData, SerializationConstructorMarker serializationConstructorMarker) {
        this.msgKey = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.valueData = new MinMaxData((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        } else {
            this.valueData = minMaxData;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(AdvancedOrderBookFilter advancedOrderBookFilter, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) advancedOrderBookFilter.msgKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, advancedOrderBookFilter.msgKey);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(advancedOrderBookFilter.valueData, new MinMaxData((String) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, MinMaxData$$serializer.INSTANCE, advancedOrderBookFilter.valueData);
    }

    public AdvancedOrderBookFilter(@NotNull String str, MinMaxData minMaxData) {
        Intrinsics.checkNotNullParameter(str, "");
        this.msgKey = str;
        this.valueData = minMaxData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:com.okinc.business.trade.features.home.ui.cefi.data.MinMaxData:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.trade.features.home.ui.cefi.data.MinMaxData:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:187) call: com.okinc.business.trade.features.home.ui.cefi.data.MinMaxData.<init>(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r2v0 com.okinc.business.trade.features.home.ui.cefi.data.MinMaxData))
 A[MD:(java.lang.String, com.okinc.business.trade.features.home.ui.cefi.data.MinMaxData):void (m)] (LINE:183) call: com.okinc.business.trade.features.home.ui.cefi.data.AdvancedOrderBookFilter.<init>(java.lang.String, com.okinc.business.trade.features.home.ui.cefi.data.MinMaxData):void type: THIS */
    public /* synthetic */ AdvancedOrderBookFilter(String str, MinMaxData minMaxData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new MinMaxData((String) null, (String) null, 3, (DefaultConstructorMarker) null) : minMaxData);
    }
}
