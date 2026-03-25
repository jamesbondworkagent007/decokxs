package com.okinc.business.defi.api.model.tx.signdata;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public class StarkNetContractSignData extends ContractSignData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String data;
    private final String from;
    private final String to;
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StarkNetContractSignData() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
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
    public final String getValue() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.model.tx.signdata.StarkNetContractSignData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StarkNetContractSignData> serializer() {
            return StarkNetContractSignData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StarkNetContractSignData(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.data = null;
        } else {
            this.data = str4;
        }
    }

    public static final /* synthetic */ void write$Self(StarkNetContractSignData starkNetContractSignData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || starkNetContractSignData.from != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, starkNetContractSignData.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || starkNetContractSignData.to != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, starkNetContractSignData.to);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || starkNetContractSignData.value != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, starkNetContractSignData.value);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && starkNetContractSignData.data == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, starkNetContractSignData.data);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:286) call: com.okinc.business.defi.api.model.tx.signdata.StarkNetContractSignData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ StarkNetContractSignData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    @Serializable
    public static final class StarkNetRequestData {
        private final String accountAddress;
        private final StarkNetExecutionRequest executionRequest;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StarkNetRequestData() {
            this((String) null, (StarkNetExecutionRequest) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StarkNetRequestData copy$default(StarkNetRequestData starkNetRequestData, String str, StarkNetExecutionRequest starkNetExecutionRequest, int i, Object obj) {
            if ((i & 1) != 0) {
                str = starkNetRequestData.accountAddress;
            }
            if ((i & 2) != 0) {
                starkNetExecutionRequest = starkNetRequestData.executionRequest;
            }
            return starkNetRequestData.copy(str, starkNetExecutionRequest);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.accountAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StarkNetExecutionRequest component2() {
            return this.executionRequest;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StarkNetRequestData copy(String str, StarkNetExecutionRequest starkNetExecutionRequest) {
            return new StarkNetRequestData(str, starkNetExecutionRequest);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StarkNetRequestData)) {
                return false;
            }
            StarkNetRequestData starkNetRequestData = (StarkNetRequestData) obj;
            return Intrinsics.EZpvd((Object) this.accountAddress, (Object) starkNetRequestData.accountAddress) && Intrinsics.EZpvd(this.executionRequest, starkNetRequestData.executionRequest);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAccountAddress() {
            return this.accountAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StarkNetExecutionRequest getExecutionRequest() {
            return this.executionRequest;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.accountAddress;
            int iHashCode = str == null ? 0 : str.hashCode();
            StarkNetExecutionRequest starkNetExecutionRequest = this.executionRequest;
            return (iHashCode * 31) + (starkNetExecutionRequest != null ? starkNetExecutionRequest.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "StarkNetRequestData(accountAddress=" + this.accountAddress + ", executionRequest=" + this.executionRequest + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.model.tx.signdata.StarkNetContractSignData.StarkNetRequestData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<StarkNetRequestData> serializer() {
                return StarkNetContractSignData$StarkNetRequestData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ StarkNetRequestData(int i, String str, StarkNetExecutionRequest starkNetExecutionRequest, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.accountAddress = null;
            } else {
                this.accountAddress = str;
            }
            if ((i & 2) == 0) {
                this.executionRequest = null;
            } else {
                this.executionRequest = starkNetExecutionRequest;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_api(StarkNetRequestData starkNetRequestData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || starkNetRequestData.accountAddress != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, starkNetRequestData.accountAddress);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && starkNetRequestData.executionRequest == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StarkNetContractSignData$StarkNetExecutionRequest$$serializer.INSTANCE, starkNetRequestData.executionRequest);
        }

        public StarkNetRequestData(String str, StarkNetExecutionRequest starkNetExecutionRequest) {
            this.accountAddress = str;
            this.executionRequest = starkNetExecutionRequest;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:com.okinc.business.defi.api.model.tx.signdata.StarkNetContractSignData$StarkNetExecutionRequest:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.model.tx.signdata.StarkNetContractSignData$StarkNetExecutionRequest) : (r3v0 com.okinc.business.defi.api.model.tx.signdata.StarkNetContractSignData$StarkNetExecutionRequest))
 A[MD:(java.lang.String, com.okinc.business.defi.api.model.tx.signdata.StarkNetContractSignData$StarkNetExecutionRequest):void (m)] (LINE:295) call: com.okinc.business.defi.api.model.tx.signdata.StarkNetContractSignData.StarkNetRequestData.<init>(java.lang.String, com.okinc.business.defi.api.model.tx.signdata.StarkNetContractSignData$StarkNetExecutionRequest):void type: THIS */
        public /* synthetic */ StarkNetRequestData(String str, StarkNetExecutionRequest starkNetExecutionRequest, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : starkNetExecutionRequest);
        }
    }

    public StarkNetContractSignData(String str, String str2, String str3, String str4) {
        super(null);
        this.from = str;
        this.to = str2;
        this.value = str3;
        this.data = str4;
    }

    @Serializable
    public static final class StarkNetExecutionRequest {
        private final List<StarkNetCall> calls;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StarkNetContractSignData$StarkNetCall$$serializer.INSTANCE)};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StarkNetExecutionRequest() {
            this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.api.model.tx.signdata.StarkNetContractSignData$StarkNetExecutionRequest */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StarkNetExecutionRequest copy$default(StarkNetExecutionRequest starkNetExecutionRequest, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = starkNetExecutionRequest.calls;
            }
            return starkNetExecutionRequest.copy(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<StarkNetCall> component1() {
            return this.calls;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StarkNetExecutionRequest copy(List<StarkNetCall> list) {
            return new StarkNetExecutionRequest(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StarkNetExecutionRequest) && Intrinsics.EZpvd(this.calls, ((StarkNetExecutionRequest) obj).calls);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<StarkNetCall> getCalls() {
            return this.calls;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            List<StarkNetCall> list = this.calls;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "StarkNetExecutionRequest(calls=" + this.calls + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.model.tx.signdata.StarkNetContractSignData.StarkNetExecutionRequest.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<StarkNetExecutionRequest> serializer() {
                return StarkNetContractSignData$StarkNetExecutionRequest$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ StarkNetExecutionRequest(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.calls = null;
            } else {
                this.calls = list;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_api(StarkNetExecutionRequest starkNetExecutionRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && starkNetExecutionRequest.calls == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], starkNetExecutionRequest.calls);
        }

        public StarkNetExecutionRequest(List<StarkNetCall> list) {
            this.calls = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.defi.api.model.tx.signdata.StarkNetContractSignData$StarkNetCall>):void (m)] (LINE:302) call: com.okinc.business.defi.api.model.tx.signdata.StarkNetContractSignData.StarkNetExecutionRequest.<init>(java.util.List):void type: THIS */
        public /* synthetic */ StarkNetExecutionRequest(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list);
        }
    }

    @Serializable
    public static final class StarkNetCall {
        private final List<String> calldata;
        private String contractAddress;
        private final String contract_address;
        private final String entry_point;
        private String entrypoint;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE)};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StarkNetCall() {
            this((String) null, (String) null, (String) null, (String) null, (List) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.api.model.tx.signdata.StarkNetContractSignData$StarkNetCall */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StarkNetCall copy$default(StarkNetCall starkNetCall, String str, String str2, String str3, String str4, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = starkNetCall.contractAddress;
            }
            if ((i & 2) != 0) {
                str2 = starkNetCall.contract_address;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                str3 = starkNetCall.entrypoint;
            }
            String str6 = str3;
            if ((i & 8) != 0) {
                str4 = starkNetCall.entry_point;
            }
            String str7 = str4;
            if ((i & 16) != 0) {
                list = starkNetCall.calldata;
            }
            return starkNetCall.copy(str, str5, str6, str7, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.contractAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.contract_address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.entrypoint;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.entry_point;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component5() {
            return this.calldata;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StarkNetCall copy(String str, String str2, String str3, String str4, List<String> list) {
            return new StarkNetCall(str, str2, str3, str4, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StarkNetCall)) {
                return false;
            }
            StarkNetCall starkNetCall = (StarkNetCall) obj;
            return Intrinsics.EZpvd((Object) this.contractAddress, (Object) starkNetCall.contractAddress) && Intrinsics.EZpvd((Object) this.contract_address, (Object) starkNetCall.contract_address) && Intrinsics.EZpvd((Object) this.entrypoint, (Object) starkNetCall.entrypoint) && Intrinsics.EZpvd((Object) this.entry_point, (Object) starkNetCall.entry_point) && Intrinsics.EZpvd(this.calldata, starkNetCall.calldata);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getCalldata() {
            return this.calldata;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getContractAddress() {
            return this.contractAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getContract_address() {
            return this.contract_address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getEntry_point() {
            return this.entry_point;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getEntrypoint() {
            return this.entrypoint;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.contractAddress;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.contract_address;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.entrypoint;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.entry_point;
            int iHashCode4 = str4 == null ? 0 : str4.hashCode();
            List<String> list = this.calldata;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list != null ? list.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setContractAddress(String str) {
            this.contractAddress = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setEntrypoint(String str) {
            this.entrypoint = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "StarkNetCall(contractAddress=" + this.contractAddress + ", contract_address=" + this.contract_address + ", entrypoint=" + this.entrypoint + ", entry_point=" + this.entry_point + ", calldata=" + this.calldata + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.model.tx.signdata.StarkNetContractSignData.StarkNetCall.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<StarkNetCall> serializer() {
                return StarkNetContractSignData$StarkNetCall$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ StarkNetCall(int i, String str, String str2, String str3, String str4, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.contractAddress = null;
            } else {
                this.contractAddress = str;
            }
            if ((i & 2) == 0) {
                this.contract_address = null;
            } else {
                this.contract_address = str2;
            }
            if ((i & 4) == 0) {
                this.entrypoint = null;
            } else {
                this.entrypoint = str3;
            }
            if ((i & 8) == 0) {
                this.entry_point = null;
            } else {
                this.entry_point = str4;
            }
            if ((i & 16) == 0) {
                this.calldata = null;
            } else {
                this.calldata = list;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_api(StarkNetCall starkNetCall, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || starkNetCall.contractAddress != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, starkNetCall.contractAddress);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || starkNetCall.contract_address != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, starkNetCall.contract_address);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || starkNetCall.entrypoint != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, starkNetCall.entrypoint);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || starkNetCall.entry_point != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, starkNetCall.entry_point);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && starkNetCall.calldata == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], starkNetCall.calldata);
        }

        public StarkNetCall(String str, String str2, String str3, String str4, List<String> list) {
            this.contractAddress = str;
            this.contract_address = str2;
            this.entrypoint = str3;
            this.entry_point = str4;
            this.calldata = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:308) call: com.okinc.business.defi.api.model.tx.signdata.StarkNetContractSignData.StarkNetCall.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
        public /* synthetic */ StarkNetCall(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list);
        }
    }
}
