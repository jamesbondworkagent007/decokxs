package com.okinc.business.market.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class PeriodConfig {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String isDefault;
    private final String periodContent;
    private final String periodType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PeriodConfig() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PeriodConfig copy$default(PeriodConfig periodConfig, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = periodConfig.isDefault;
        }
        if ((i & 2) != 0) {
            str2 = periodConfig.periodContent;
        }
        if ((i & 4) != 0) {
            str3 = periodConfig.periodType;
        }
        return periodConfig.copy(str, str2, str3);
    }

    @SerialName("periodContent")
    public static /* synthetic */ void getPeriodContent$annotations() {
    }

    @SerialName("periodType")
    public static /* synthetic */ void getPeriodType$annotations() {
    }

    @SerialName("isDefault")
    public static /* synthetic */ void isDefault$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.periodContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.periodType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodConfig copy(String str, String str2, String str3) {
        return new PeriodConfig(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PeriodConfig)) {
            return false;
        }
        PeriodConfig periodConfig = (PeriodConfig) obj;
        return Intrinsics.EZpvd((Object) this.isDefault, (Object) periodConfig.isDefault) && Intrinsics.EZpvd((Object) this.periodContent, (Object) periodConfig.periodContent) && Intrinsics.EZpvd((Object) this.periodType, (Object) periodConfig.periodType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeriodContent() {
        return this.periodContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeriodType() {
        return this.periodType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.isDefault;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.periodContent;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.periodType;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isDefault() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PeriodConfig(isDefault=" + this.isDefault + ", periodContent=" + this.periodContent + ", periodType=" + this.periodType + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.PeriodConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PeriodConfig> serializer() {
            return PeriodConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PeriodConfig(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.isDefault = (i & 1) == 0 ? "0" : str;
        if ((i & 2) == 0) {
            this.periodContent = "";
        } else {
            this.periodContent = str2;
        }
        if ((i & 4) == 0) {
            this.periodType = "";
        } else {
            this.periodType = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(PeriodConfig periodConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) periodConfig.isDefault, (Object) "0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, periodConfig.isDefault);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) periodConfig.periodContent, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, periodConfig.periodContent);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) periodConfig.periodType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, periodConfig.periodType);
    }

    public PeriodConfig(String str, String str2, String str3) {
        this.isDefault = str;
        this.periodContent = str2;
        this.periodType = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:25) call: com.okinc.business.market.data.model.PeriodConfig.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PeriodConfig(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
