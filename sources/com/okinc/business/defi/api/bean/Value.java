package com.okinc.business.defi.api.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class Value {
    private Long amount;
    private Long call_value;
    private String contract_address;
    private String data;
    private String owner_address;
    private String to_address;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Value() {
        this((Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
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

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.Value.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Value> serializer() {
            return Value$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Value(int i, Long l, Long l2, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.call_value = null;
        } else {
            this.call_value = l;
        }
        if ((i & 2) == 0) {
            this.amount = null;
        } else {
            this.amount = l2;
        }
        if ((i & 4) == 0) {
            this.contract_address = null;
        } else {
            this.contract_address = str;
        }
        if ((i & 8) == 0) {
            this.to_address = null;
        } else {
            this.to_address = str2;
        }
        if ((i & 16) == 0) {
            this.data = null;
        } else {
            this.data = str3;
        }
        if ((i & 32) == 0) {
            this.owner_address = null;
        } else {
            this.owner_address = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(Value value, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || value.call_value != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, value.call_value);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || value.amount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, value.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || value.contract_address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, value.contract_address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || value.to_address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, value.to_address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || value.data != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, value.data);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && value.owner_address == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, value.owner_address);
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
 A[MD:(java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:426) call: com.okinc.business.defi.api.bean.Value.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ Value(Long l, Long l2, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }
}
