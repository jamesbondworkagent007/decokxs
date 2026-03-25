package com.okinc.wallet.core.sign.tron;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TronRawData {
    private List<Contract> contract;
    private Long expiration;
    private Long fee_limit;
    private Integer permission_id;
    private String ref_block_bytes;
    private String ref_block_hash;
    private Long timestamp;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(Contract$$serializer.INSTANCE), null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TronRawData() {
        this((List) null, (Long) null, (Long) null, (String) null, (Integer) null, (String) null, (Long) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.wallet.core.sign.tron.TronRawData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TronRawData copy$default(TronRawData tronRawData, List list, Long l, Long l2, String str, Integer num, String str2, Long l3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tronRawData.contract;
        }
        if ((i & 2) != 0) {
            l = tronRawData.expiration;
        }
        Long l4 = l;
        if ((i & 4) != 0) {
            l2 = tronRawData.fee_limit;
        }
        Long l5 = l2;
        if ((i & 8) != 0) {
            str = tronRawData.ref_block_bytes;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            num = tronRawData.permission_id;
        }
        Integer num2 = num;
        if ((i & 32) != 0) {
            str2 = tronRawData.ref_block_hash;
        }
        String str4 = str2;
        if ((i & 64) != 0) {
            l3 = tronRawData.timestamp;
        }
        return tronRawData.copy(list, l4, l5, str3, num2, str4, l3);
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
    public final Integer component5() {
        return this.permission_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ref_block_hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component7() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TronRawData copy(List<Contract> list, Long l, Long l2, String str, Integer num, String str2, Long l3) {
        return new TronRawData(list, l, l2, str, num, str2, l3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TronRawData)) {
            return false;
        }
        TronRawData tronRawData = (TronRawData) obj;
        return Intrinsics.EZpvd(this.contract, tronRawData.contract) && Intrinsics.EZpvd(this.expiration, tronRawData.expiration) && Intrinsics.EZpvd(this.fee_limit, tronRawData.fee_limit) && Intrinsics.EZpvd((Object) this.ref_block_bytes, (Object) tronRawData.ref_block_bytes) && Intrinsics.EZpvd(this.permission_id, tronRawData.permission_id) && Intrinsics.EZpvd((Object) this.ref_block_hash, (Object) tronRawData.ref_block_hash) && Intrinsics.EZpvd(this.timestamp, tronRawData.timestamp);
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
    public final Integer getPermission_id() {
        return this.permission_id;
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
        Integer num = this.permission_id;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        String str2 = this.ref_block_hash;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        Long l3 = this.timestamp;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (l3 != null ? l3.hashCode() : 0);
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
    public final void setPermission_id(Integer num) {
        this.permission_id = num;
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
        return "TronRawData(contract=" + this.contract + ", expiration=" + this.expiration + ", fee_limit=" + this.fee_limit + ", ref_block_bytes=" + this.ref_block_bytes + ", permission_id=" + this.permission_id + ", ref_block_hash=" + this.ref_block_hash + ", timestamp=" + this.timestamp + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.tron.TronRawData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TronRawData> serializer() {
            return TronRawData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TronRawData(int i, List list, Long l, Long l2, String str, Integer num, String str2, Long l3, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.permission_id = null;
        } else {
            this.permission_id = num;
        }
        if ((i & 32) == 0) {
            this.ref_block_hash = null;
        } else {
            this.ref_block_hash = str2;
        }
        if ((i & 64) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = l3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(TronRawData tronRawData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tronRawData.contract != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], tronRawData.contract);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tronRawData.expiration != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, tronRawData.expiration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tronRawData.fee_limit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, tronRawData.fee_limit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tronRawData.ref_block_bytes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, tronRawData.ref_block_bytes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || tronRawData.permission_id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, tronRawData.permission_id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || tronRawData.ref_block_hash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, tronRawData.ref_block_hash);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && tronRawData.timestamp == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, tronRawData.timestamp);
    }

    public TronRawData(List<Contract> list, Long l, Long l2, String str, Integer num, String str2, Long l3) {
        this.contract = list;
        this.expiration = l;
        this.fee_limit = l2;
        this.ref_block_bytes = str;
        this.permission_id = num;
        this.ref_block_hash = str2;
        this.timestamp = l3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r7v0 java.util.List))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r8v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r9v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r13v0 java.lang.Long))
 A[MD:(java.util.List<com.okinc.wallet.core.sign.tron.Contract>, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Long):void (m)] (LINE:97) call: com.okinc.wallet.core.sign.tron.TronRawData.<init>(java.util.List, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Long):void type: THIS */
    public /* synthetic */ TronRawData(List list, Long l, Long l2, String str, Integer num, String str2, Long l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : l3);
    }
}
