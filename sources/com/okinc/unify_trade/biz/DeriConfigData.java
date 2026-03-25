package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class DeriConfigData {
    private String derivativesNavConfig;
    private String isSetNavConfig;
    private String showConfigTimes;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DeriConfigData() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DeriConfigData copy$default(DeriConfigData deriConfigData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deriConfigData.isSetNavConfig;
        }
        if ((i & 2) != 0) {
            str2 = deriConfigData.derivativesNavConfig;
        }
        if ((i & 4) != 0) {
            str3 = deriConfigData.showConfigTimes;
        }
        return deriConfigData.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.isSetNavConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.derivativesNavConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.showConfigTimes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeriConfigData copy(String str, String str2, String str3) {
        return new DeriConfigData(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeriConfigData)) {
            return false;
        }
        DeriConfigData deriConfigData = (DeriConfigData) obj;
        return Intrinsics.EZpvd((Object) this.isSetNavConfig, (Object) deriConfigData.isSetNavConfig) && Intrinsics.EZpvd((Object) this.derivativesNavConfig, (Object) deriConfigData.derivativesNavConfig) && Intrinsics.EZpvd((Object) this.showConfigTimes, (Object) deriConfigData.showConfigTimes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDerivativesNavConfig() {
        return this.derivativesNavConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShowConfigTimes() {
        return this.showConfigTimes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.isSetNavConfig;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.derivativesNavConfig;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.showConfigTimes;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isSetNavConfig() {
        return this.isSetNavConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDerivativesNavConfig(String str) {
        this.derivativesNavConfig = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSetNavConfig(String str) {
        this.isSetNavConfig = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowConfigTimes(String str) {
        this.showConfigTimes = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeriConfigData(isSetNavConfig=" + this.isSetNavConfig + ", derivativesNavConfig=" + this.derivativesNavConfig + ", showConfigTimes=" + this.showConfigTimes + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.DeriConfigData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DeriConfigData> serializer() {
            return DeriConfigData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DeriConfigData(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.isSetNavConfig = null;
        } else {
            this.isSetNavConfig = str;
        }
        if ((i & 2) == 0) {
            this.derivativesNavConfig = null;
        } else {
            this.derivativesNavConfig = str2;
        }
        if ((i & 4) == 0) {
            this.showConfigTimes = null;
        } else {
            this.showConfigTimes = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DeriConfigData deriConfigData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || deriConfigData.isSetNavConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, deriConfigData.isSetNavConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || deriConfigData.derivativesNavConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, deriConfigData.derivativesNavConfig);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && deriConfigData.showConfigTimes == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, deriConfigData.showConfigTimes);
    }

    public DeriConfigData(String str, String str2, String str3) {
        this.isSetNavConfig = str;
        this.derivativesNavConfig = str2;
        this.showConfigTimes = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1546) call: com.okinc.unify_trade.biz.DeriConfigData.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DeriConfigData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
