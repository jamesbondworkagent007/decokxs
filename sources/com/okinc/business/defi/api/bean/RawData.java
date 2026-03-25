package com.okinc.business.defi.api.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class RawData {
    private List<Contract> contract;
    private Long expiration;
    private Long fee_limit;
    private String ref_block_bytes;
    private String ref_block_hash;
    private Long timestamp;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(Contract$$serializer.INSTANCE), null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RawData() {
        this((List) null, (Long) null, (Long) null, (String) null, (String) null, (Long) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.defi.api.bean.RawData */
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

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.RawData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RawData> serializer() {
            return RawData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RawData(int i, List list, Long l, Long l2, String str, String str2, Long l3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.contract = null;
        } else {
            this.contract = list;
        }
        if ((i & 2) == 0) {
            this.expiration = null;
        } else {
            this.expiration = l;
        }
        if ((i & 4) == 0) {
            this.fee_limit = null;
        } else {
            this.fee_limit = l2;
        }
        if ((i & 8) == 0) {
            this.ref_block_bytes = null;
        } else {
            this.ref_block_bytes = str;
        }
        if ((i & 16) == 0) {
            this.ref_block_hash = null;
        } else {
            this.ref_block_hash = str2;
        }
        if ((i & 32) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = l3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(RawData rawData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || rawData.contract != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], rawData.contract);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || rawData.expiration != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, rawData.expiration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || rawData.fee_limit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, rawData.fee_limit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || rawData.ref_block_bytes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, rawData.ref_block_bytes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || rawData.ref_block_hash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, rawData.ref_block_hash);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && rawData.timestamp == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, rawData.timestamp);
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
 A[MD:(java.util.List<com.okinc.business.defi.api.bean.Contract>, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long):void (m)] (LINE:401) call: com.okinc.business.defi.api.bean.RawData.<init>(java.util.List, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long):void type: THIS */
    public /* synthetic */ RawData(List list, Long l, Long l2, String str, String str2, Long l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : l3);
    }
}
