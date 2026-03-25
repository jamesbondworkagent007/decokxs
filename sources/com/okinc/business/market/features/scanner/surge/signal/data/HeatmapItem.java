package com.okinc.business.market.features.scanner.surge.signal.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class HeatmapItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String heatLevel;
    public final String timestamp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HeatmapItem() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HeatmapItem copy$default(HeatmapItem heatmapItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = heatmapItem.heatLevel;
        }
        if ((i & 2) != 0) {
            str2 = heatmapItem.timestamp;
        }
        return heatmapItem.KWHzl(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HeatmapItem KWHzl(String str, String str2) {
        return new HeatmapItem(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeatmapItem)) {
            return false;
        }
        HeatmapItem heatmapItem = (HeatmapItem) obj;
        return Intrinsics.EZpvd((Object) this.heatLevel, (Object) heatmapItem.heatLevel) && Intrinsics.EZpvd((Object) this.timestamp, (Object) heatmapItem.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.heatLevel;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.timestamp;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HeatmapItem(heatLevel=" + this.heatLevel + ", timestamp=" + this.timestamp + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.scanner.surge.signal.data.HeatmapItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HeatmapItem> serializer() {
            return HeatmapItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HeatmapItem(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.heatLevel = null;
        } else {
            this.heatLevel = str;
        }
        if ((i & 2) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = str2;
        }
    }

    public static final /* synthetic */ void copydefault(HeatmapItem heatmapItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || heatmapItem.heatLevel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, heatmapItem.heatLevel);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && heatmapItem.timestamp == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, heatmapItem.timestamp);
    }

    public HeatmapItem(String str, String str2) {
        this.heatLevel = str;
        this.timestamp = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:19) call: com.okinc.business.market.features.scanner.surge.signal.data.HeatmapItem.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HeatmapItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
