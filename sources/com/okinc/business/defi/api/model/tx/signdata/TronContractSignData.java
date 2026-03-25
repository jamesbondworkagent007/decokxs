package com.okinc.business.defi.api.model.tx.signdata;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class TronContractSignData extends ContractSignData {
    public static final int $stable = 8;
    private String functionSelector;
    private RawData raw_data;
    private String raw_data_hex;
    private List<String> signature;
    private String txID;
    private Boolean visible;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TronContractSignData() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFunctionSelector() {
        return this.functionSelector;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RawData getRaw_data() {
        return this.raw_data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRaw_data_hex() {
        return this.raw_data_hex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxID() {
        return this.txID;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getVisible() {
        return this.visible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFunctionSelector(String str) {
        this.functionSelector = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRaw_data(RawData rawData) {
        this.raw_data = rawData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRaw_data_hex(String str) {
        this.raw_data_hex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignature(List<String> list) {
        this.signature = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxID(String str) {
        this.txID = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVisible(Boolean bool) {
        this.visible = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.api.model.tx.signdata.TronContractSignData$RawData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.model.tx.signdata.TronContractSignData$RawData) : (r6v0 com.okinc.business.defi.api.model.tx.signdata.TronContractSignData$RawData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r8v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r10v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(com.okinc.business.defi.api.model.tx.signdata.TronContractSignData$RawData, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.Boolean, java.lang.String):void (m)] (LINE:358) call: com.okinc.business.defi.api.model.tx.signdata.TronContractSignData.<init>(com.okinc.business.defi.api.model.tx.signdata.TronContractSignData$RawData, java.lang.String, java.util.List, java.lang.String, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ TronContractSignData(RawData rawData, String str, List list, String str2, Boolean bool, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rawData, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str3);
    }

    public TronContractSignData(RawData rawData, String str, List<String> list, String str2, Boolean bool, String str3) {
        super(null);
        this.raw_data = rawData;
        this.raw_data_hex = str;
        this.signature = list;
        this.txID = str2;
        this.visible = bool;
        this.functionSelector = str3;
    }

    public static final class RawData {
        public static final int $stable = 8;
        private List<Contract> contract;
        private Long expiration;
        private Long fee_limit;
        private String ref_block_bytes;
        private String ref_block_hash;
        private Long timestamp;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public RawData() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.defi.api.model.tx.signdata.TronContractSignData$RawData */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RawData copy$default(RawData rawData, List list, Long l, Long l2, String str, String str2, Long l3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = rawData.contract;
            }
            if ((i & 2) != 0) {
                l = rawData.expiration;
            }
            Long l4 = l;
            if ((i & 4) != 0) {
                l2 = rawData.fee_limit;
            }
            Long l5 = l2;
            if ((i & 8) != 0) {
                str = rawData.ref_block_bytes;
            }
            String str3 = str;
            if ((i & 16) != 0) {
                str2 = rawData.ref_block_hash;
            }
            String str4 = str2;
            if ((i & 32) != 0) {
                l3 = rawData.timestamp;
            }
            return rawData.copy(list, l4, l5, str3, str4, l3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Contract> component1() {
            return this.contract;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component2() {
            return this.expiration;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component3() {
            return this.fee_limit;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.ref_block_bytes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.ref_block_hash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component6() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RawData copy(List<Contract> list, Long l, Long l2, String str, String str2, Long l3) {
            return new RawData(list, l, l2, str, str2, l3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RawData)) {
                return false;
            }
            RawData rawData = (RawData) obj;
            return Intrinsics.EZpvd(this.contract, rawData.contract) && Intrinsics.EZpvd(this.expiration, rawData.expiration) && Intrinsics.EZpvd(this.fee_limit, rawData.fee_limit) && Intrinsics.EZpvd((Object) this.ref_block_bytes, (Object) rawData.ref_block_bytes) && Intrinsics.EZpvd((Object) this.ref_block_hash, (Object) rawData.ref_block_hash) && Intrinsics.EZpvd(this.timestamp, rawData.timestamp);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Contract> getContract() {
            return this.contract;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getExpiration() {
            return this.expiration;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getFee_limit() {
            return this.fee_limit;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRef_block_bytes() {
            return this.ref_block_bytes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRef_block_hash() {
            return this.ref_block_hash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getTimestamp() {
            return this.timestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            List<Contract> list = this.contract;
            int iHashCode = list == null ? 0 : list.hashCode();
            Long l = this.expiration;
            int iHashCode2 = l == null ? 0 : l.hashCode();
            Long l2 = this.fee_limit;
            int iHashCode3 = l2 == null ? 0 : l2.hashCode();
            String str = this.ref_block_bytes;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            String str2 = this.ref_block_hash;
            int iHashCode5 = str2 == null ? 0 : str2.hashCode();
            Long l3 = this.timestamp;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (l3 != null ? l3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setContract(List<Contract> list) {
            this.contract = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setExpiration(Long l) {
            this.expiration = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFee_limit(Long l) {
            this.fee_limit = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setRef_block_bytes(String str) {
            this.ref_block_bytes = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setRef_block_hash(String str) {
            this.ref_block_hash = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTimestamp(Long l) {
            this.timestamp = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RawData(contract=" + this.contract + ", expiration=" + this.expiration + ", fee_limit=" + this.fee_limit + ", ref_block_bytes=" + this.ref_block_bytes + ", ref_block_hash=" + this.ref_block_hash + ", timestamp=" + this.timestamp + ")";
        }

        public RawData(List<Contract> list, Long l, Long l2, String str, String str2, Long l3) {
            this.contract = list;
            this.expiration = l;
            this.fee_limit = l2;
            this.ref_block_bytes = str;
            this.ref_block_hash = str2;
            this.timestamp = l3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r6v0 java.util.List))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r8v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r11v0 java.lang.Long))
 A[MD:(java.util.List<com.okinc.business.defi.api.model.tx.signdata.TronContractSignData$Contract>, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long):void (m)] (LINE:368) call: com.okinc.business.defi.api.model.tx.signdata.TronContractSignData.RawData.<init>(java.util.List, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long):void type: THIS */
        public /* synthetic */ RawData(List list, Long l, Long l2, String str, String str2, Long l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : l3);
        }
    }

    public static final class Contract {
        public static final int $stable = 8;
        private Parameter parameter;
        private String type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Contract() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Contract copy$default(Contract contract, Parameter parameter, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                parameter = contract.parameter;
            }
            if ((i & 2) != 0) {
                str = contract.type;
            }
            return contract.copy(parameter, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Parameter component1() {
            return this.parameter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Contract copy(Parameter parameter, String str) {
            return new Contract(parameter, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Contract)) {
                return false;
            }
            Contract contract = (Contract) obj;
            return Intrinsics.EZpvd(this.parameter, contract.parameter) && Intrinsics.EZpvd((Object) this.type, (Object) contract.type);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Parameter getParameter() {
            return this.parameter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Parameter parameter = this.parameter;
            int iHashCode = parameter == null ? 0 : parameter.hashCode();
            String str = this.type;
            return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setParameter(Parameter parameter) {
            this.parameter = parameter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setType(String str) {
            this.type = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Contract(parameter=" + this.parameter + ", type=" + this.type + ")";
        }

        public Contract(Parameter parameter, String str) {
            this.parameter = parameter;
            this.type = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.api.model.tx.signdata.TronContractSignData$Parameter:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.model.tx.signdata.TronContractSignData$Parameter) : (r2v0 com.okinc.business.defi.api.model.tx.signdata.TronContractSignData$Parameter))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(com.okinc.business.defi.api.model.tx.signdata.TronContractSignData$Parameter, java.lang.String):void (m)] (LINE:378) call: com.okinc.business.defi.api.model.tx.signdata.TronContractSignData.Contract.<init>(com.okinc.business.defi.api.model.tx.signdata.TronContractSignData$Parameter, java.lang.String):void type: THIS */
        public /* synthetic */ Contract(Parameter parameter, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : parameter, (i & 2) != 0 ? null : str);
        }
    }

    public static final class Parameter {
        public static final int $stable = 8;
        private String type_url;
        private Value value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Parameter() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Parameter copy$default(Parameter parameter, String str, Value value, int i, Object obj) {
            if ((i & 1) != 0) {
                str = parameter.type_url;
            }
            if ((i & 2) != 0) {
                value = parameter.value;
            }
            return parameter.copy(str, value);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.type_url;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Value component2() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Parameter copy(String str, Value value) {
            return new Parameter(str, value);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Parameter)) {
                return false;
            }
            Parameter parameter = (Parameter) obj;
            return Intrinsics.EZpvd((Object) this.type_url, (Object) parameter.type_url) && Intrinsics.EZpvd(this.value, parameter.value);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType_url() {
            return this.type_url;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Value getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.type_url;
            int iHashCode = str == null ? 0 : str.hashCode();
            Value value = this.value;
            return (iHashCode * 31) + (value != null ? value.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setType_url(String str) {
            this.type_url = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setValue(Value value) {
            this.value = value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Parameter(type_url=" + this.type_url + ", value=" + this.value + ")";
        }

        public Parameter(String str, Value value) {
            this.type_url = str;
            this.value = value;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:com.okinc.business.defi.api.model.tx.signdata.TronContractSignData$Value:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.model.tx.signdata.TronContractSignData$Value) : (r3v0 com.okinc.business.defi.api.model.tx.signdata.TronContractSignData$Value))
 A[MD:(java.lang.String, com.okinc.business.defi.api.model.tx.signdata.TronContractSignData$Value):void (m)] (LINE:384) call: com.okinc.business.defi.api.model.tx.signdata.TronContractSignData.Parameter.<init>(java.lang.String, com.okinc.business.defi.api.model.tx.signdata.TronContractSignData$Value):void type: THIS */
        public /* synthetic */ Parameter(String str, Value value, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : value);
        }
    }

    public static final class Value {
        public static final int $stable = 8;
        private Long amount;
        private Long call_value;
        private String contract_address;
        private String data;
        private String owner_address;
        private String to_address;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Value() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Value copy$default(Value value, Long l, Long l2, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                l = value.call_value;
            }
            if ((i & 2) != 0) {
                l2 = value.amount;
            }
            Long l3 = l2;
            if ((i & 4) != 0) {
                str = value.contract_address;
            }
            String str5 = str;
            if ((i & 8) != 0) {
                str2 = value.to_address;
            }
            String str6 = str2;
            if ((i & 16) != 0) {
                str3 = value.data;
            }
            String str7 = str3;
            if ((i & 32) != 0) {
                str4 = value.owner_address;
            }
            return value.copy(l, l3, str5, str6, str7, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component1() {
            return this.call_value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component2() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.contract_address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.to_address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.owner_address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Value copy(Long l, Long l2, String str, String str2, String str3, String str4) {
            return new Value(l, l2, str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return Intrinsics.EZpvd(this.call_value, value.call_value) && Intrinsics.EZpvd(this.amount, value.amount) && Intrinsics.EZpvd((Object) this.contract_address, (Object) value.contract_address) && Intrinsics.EZpvd((Object) this.to_address, (Object) value.to_address) && Intrinsics.EZpvd((Object) this.data, (Object) value.data) && Intrinsics.EZpvd((Object) this.owner_address, (Object) value.owner_address);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getAmount() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getCall_value() {
            return this.call_value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getContract_address() {
            return this.contract_address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getData() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOwner_address() {
            return this.owner_address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTo_address() {
            return this.to_address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Long l = this.call_value;
            int iHashCode = l == null ? 0 : l.hashCode();
            Long l2 = this.amount;
            int iHashCode2 = l2 == null ? 0 : l2.hashCode();
            String str = this.contract_address;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.to_address;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.data;
            int iHashCode5 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.owner_address;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAmount(Long l) {
            this.amount = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCall_value(Long l) {
            this.call_value = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setContract_address(String str) {
            this.contract_address = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setData(String str) {
            this.data = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setOwner_address(String str) {
            this.owner_address = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTo_address(String str) {
            this.to_address = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Value(call_value=" + this.call_value + ", amount=" + this.amount + ", contract_address=" + this.contract_address + ", to_address=" + this.to_address + ", data=" + this.data + ", owner_address=" + this.owner_address + ")";
        }

        public Value(Long l, Long l2, String str, String str2, String str3, String str4) {
            this.call_value = l;
            this.amount = l2;
            this.contract_address = str;
            this.to_address = str2;
            this.data = str3;
            this.owner_address = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r6v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:390) call: com.okinc.business.defi.api.model.tx.signdata.TronContractSignData.Value.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Value(Long l, Long l2, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
        }
    }
}
