package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class KaspaUtxoResp {
    private String address;
    private String amount;
    private String index;
    private String txId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KaspaUtxoResp() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KaspaUtxoResp copy$default(KaspaUtxoResp kaspaUtxoResp, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kaspaUtxoResp.txId;
        }
        if ((i & 2) != 0) {
            str2 = kaspaUtxoResp.index;
        }
        if ((i & 4) != 0) {
            str3 = kaspaUtxoResp.address;
        }
        if ((i & 8) != 0) {
            str4 = kaspaUtxoResp.amount;
        }
        return kaspaUtxoResp.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KaspaUtxoResp copy(String str, String str2, String str3, String str4) {
        return new KaspaUtxoResp(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KaspaUtxoResp)) {
            return false;
        }
        KaspaUtxoResp kaspaUtxoResp = (KaspaUtxoResp) obj;
        return Intrinsics.EZpvd((Object) this.txId, (Object) kaspaUtxoResp.txId) && Intrinsics.EZpvd((Object) this.index, (Object) kaspaUtxoResp.index) && Intrinsics.EZpvd((Object) this.address, (Object) kaspaUtxoResp.address) && Intrinsics.EZpvd((Object) this.amount, (Object) kaspaUtxoResp.amount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxId() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.txId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.index;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.address;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.amount;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIndex(String str) {
        this.index = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxId(String str) {
        this.txId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KaspaUtxoResp(txId=" + this.txId + ", index=" + this.index + ", address=" + this.address + ", amount=" + this.amount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.KaspaUtxoResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KaspaUtxoResp> serializer() {
            return KaspaUtxoResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KaspaUtxoResp(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.txId = null;
        } else {
            this.txId = str;
        }
        if ((i & 2) == 0) {
            this.index = null;
        } else {
            this.index = str2;
        }
        if ((i & 4) == 0) {
            this.address = null;
        } else {
            this.address = str3;
        }
        if ((i & 8) == 0) {
            this.amount = null;
        } else {
            this.amount = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(KaspaUtxoResp kaspaUtxoResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || kaspaUtxoResp.txId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, kaspaUtxoResp.txId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || kaspaUtxoResp.index != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, kaspaUtxoResp.index);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || kaspaUtxoResp.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, kaspaUtxoResp.address);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && kaspaUtxoResp.amount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, kaspaUtxoResp.amount);
    }

    public KaspaUtxoResp(String str, String str2, String str3, String str4) {
        this.txId = str;
        this.index = str2;
        this.address = str3;
        this.amount = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:170) call: com.okinc.business.defi.biz.net.bean.KaspaUtxoResp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ KaspaUtxoResp(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
