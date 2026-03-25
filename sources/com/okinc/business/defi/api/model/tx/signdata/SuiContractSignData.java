package com.okinc.business.defi.api.model.tx.signdata;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class SuiContractSignData extends ContractSignData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String from;
    private final String to;
    private final String txBytes;
    private final String txSerialize;
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SuiContractSignData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxBytes() {
        return this.txBytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxSerialize() {
        return this.txSerialize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.model.tx.signdata.SuiContractSignData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SuiContractSignData> serializer() {
            return SuiContractSignData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SuiContractSignData(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if ((i & 1) == 0) {
            this.from = null;
        } else {
            this.from = str;
        }
        if ((i & 2) == 0) {
            this.to = null;
        } else {
            this.to = str2;
        }
        if ((i & 4) == 0) {
            this.value = null;
        } else {
            this.value = str3;
        }
        if ((i & 8) == 0) {
            this.txSerialize = "";
        } else {
            this.txSerialize = str4;
        }
        if ((i & 16) == 0) {
            this.txBytes = "";
        } else {
            this.txBytes = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(SuiContractSignData suiContractSignData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || suiContractSignData.from != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, suiContractSignData.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || suiContractSignData.to != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, suiContractSignData.to);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || suiContractSignData.value != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, suiContractSignData.value);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) suiContractSignData.txSerialize, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, suiContractSignData.txSerialize);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) suiContractSignData.txBytes, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, suiContractSignData.txBytes);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:328) call: com.okinc.business.defi.api.model.tx.signdata.SuiContractSignData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SuiContractSignData(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) == 0 ? str3 : null, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }

    @Serializable
    public static final class SuiTransactionData {
        private SuiGasConfig gasConfig;
        private SuiGasConfig gasData;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SuiTransactionData() {
            this((SuiGasConfig) null, (SuiGasConfig) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SuiTransactionData copy$default(SuiTransactionData suiTransactionData, SuiGasConfig suiGasConfig, SuiGasConfig suiGasConfig2, int i, Object obj) {
            if ((i & 1) != 0) {
                suiGasConfig = suiTransactionData.gasConfig;
            }
            if ((i & 2) != 0) {
                suiGasConfig2 = suiTransactionData.gasData;
            }
            return suiTransactionData.copy(suiGasConfig, suiGasConfig2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SuiGasConfig component1() {
            return this.gasConfig;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SuiGasConfig component2() {
            return this.gasData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SuiTransactionData copy(SuiGasConfig suiGasConfig, SuiGasConfig suiGasConfig2) {
            return new SuiTransactionData(suiGasConfig, suiGasConfig2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuiTransactionData)) {
                return false;
            }
            SuiTransactionData suiTransactionData = (SuiTransactionData) obj;
            return Intrinsics.EZpvd(this.gasConfig, suiTransactionData.gasConfig) && Intrinsics.EZpvd(this.gasData, suiTransactionData.gasData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SuiGasConfig getGasConfig() {
            return this.gasConfig;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SuiGasConfig getGasData() {
            return this.gasData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            SuiGasConfig suiGasConfig = this.gasConfig;
            int iHashCode = suiGasConfig == null ? 0 : suiGasConfig.hashCode();
            SuiGasConfig suiGasConfig2 = this.gasData;
            return (iHashCode * 31) + (suiGasConfig2 != null ? suiGasConfig2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setGasConfig(SuiGasConfig suiGasConfig) {
            this.gasConfig = suiGasConfig;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setGasData(SuiGasConfig suiGasConfig) {
            this.gasData = suiGasConfig;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SuiTransactionData(gasConfig=" + this.gasConfig + ", gasData=" + this.gasData + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.model.tx.signdata.SuiContractSignData.SuiTransactionData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SuiTransactionData> serializer() {
                return SuiContractSignData$SuiTransactionData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SuiTransactionData(int i, SuiGasConfig suiGasConfig, SuiGasConfig suiGasConfig2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.gasConfig = null;
            } else {
                this.gasConfig = suiGasConfig;
            }
            if ((i & 2) == 0) {
                this.gasData = null;
            } else {
                this.gasData = suiGasConfig2;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_api(SuiTransactionData suiTransactionData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || suiTransactionData.gasConfig != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, SuiContractSignData$SuiGasConfig$$serializer.INSTANCE, suiTransactionData.gasConfig);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && suiTransactionData.gasData == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, SuiContractSignData$SuiGasConfig$$serializer.INSTANCE, suiTransactionData.gasData);
        }

        public SuiTransactionData(SuiGasConfig suiGasConfig, SuiGasConfig suiGasConfig2) {
            this.gasConfig = suiGasConfig;
            this.gasData = suiGasConfig2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.api.model.tx.signdata.SuiContractSignData$SuiGasConfig:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.model.tx.signdata.SuiContractSignData$SuiGasConfig) : (r2v0 com.okinc.business.defi.api.model.tx.signdata.SuiContractSignData$SuiGasConfig))
  (wrap:com.okinc.business.defi.api.model.tx.signdata.SuiContractSignData$SuiGasConfig:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.model.tx.signdata.SuiContractSignData$SuiGasConfig) : (r3v0 com.okinc.business.defi.api.model.tx.signdata.SuiContractSignData$SuiGasConfig))
 A[MD:(com.okinc.business.defi.api.model.tx.signdata.SuiContractSignData$SuiGasConfig, com.okinc.business.defi.api.model.tx.signdata.SuiContractSignData$SuiGasConfig):void (m)] (LINE:337) call: com.okinc.business.defi.api.model.tx.signdata.SuiContractSignData.SuiTransactionData.<init>(com.okinc.business.defi.api.model.tx.signdata.SuiContractSignData$SuiGasConfig, com.okinc.business.defi.api.model.tx.signdata.SuiContractSignData$SuiGasConfig):void type: THIS */
        public /* synthetic */ SuiTransactionData(SuiGasConfig suiGasConfig, SuiGasConfig suiGasConfig2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : suiGasConfig, (i & 2) != 0 ? null : suiGasConfig2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuiContractSignData(String str, String str2, String str3, @NotNull String str4, @NotNull String str5) {
        super(null);
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.from = str;
        this.to = str2;
        this.value = str3;
        this.txSerialize = str4;
        this.txBytes = str5;
    }

    @Serializable
    public static final class SuiGasConfig {
        private String budget;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SuiGasConfig() {
            this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SuiGasConfig copy$default(SuiGasConfig suiGasConfig, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = suiGasConfig.budget;
            }
            return suiGasConfig.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.budget;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SuiGasConfig copy(String str) {
            return new SuiGasConfig(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuiGasConfig) && Intrinsics.EZpvd((Object) this.budget, (Object) ((SuiGasConfig) obj).budget);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBudget() {
            return this.budget;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.budget;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBudget(String str) {
            this.budget = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SuiGasConfig(budget=" + this.budget + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.model.tx.signdata.SuiContractSignData.SuiGasConfig.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SuiGasConfig> serializer() {
                return SuiContractSignData$SuiGasConfig$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SuiGasConfig(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.budget = null;
            } else {
                this.budget = str;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_api(SuiGasConfig suiGasConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && suiGasConfig.budget == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, suiGasConfig.budget);
        }

        public SuiGasConfig(String str) {
            this.budget = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:344) call: com.okinc.business.defi.api.model.tx.signdata.SuiContractSignData.SuiGasConfig.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ SuiGasConfig(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }
}
