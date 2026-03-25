package com.okinc.business.defi.biz.core.transaction.sign.eos.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class EosSignInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainid;
    private final String contract;
    private final String expiration;
    private final String precision;
    private final String ref_block_number;
    private final String ref_block_prefix;
    private final String symbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EosSignInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EosSignInfo copy$default(EosSignInfo eosSignInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eosSignInfo.chainid;
        }
        if ((i & 2) != 0) {
            str2 = eosSignInfo.symbol;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = eosSignInfo.precision;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = eosSignInfo.contract;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = eosSignInfo.ref_block_prefix;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = eosSignInfo.ref_block_number;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = eosSignInfo.expiration;
        }
        return eosSignInfo.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.contract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ref_block_prefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ref_block_number;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EosSignInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new EosSignInfo(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EosSignInfo)) {
            return false;
        }
        EosSignInfo eosSignInfo = (EosSignInfo) obj;
        return Intrinsics.EZpvd((Object) this.chainid, (Object) eosSignInfo.chainid) && Intrinsics.EZpvd((Object) this.symbol, (Object) eosSignInfo.symbol) && Intrinsics.EZpvd((Object) this.precision, (Object) eosSignInfo.precision) && Intrinsics.EZpvd((Object) this.contract, (Object) eosSignInfo.contract) && Intrinsics.EZpvd((Object) this.ref_block_prefix, (Object) eosSignInfo.ref_block_prefix) && Intrinsics.EZpvd((Object) this.ref_block_number, (Object) eosSignInfo.ref_block_number) && Intrinsics.EZpvd((Object) this.expiration, (Object) eosSignInfo.expiration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainid() {
        return this.chainid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContract() {
        return this.contract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiration() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrecision() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRef_block_number() {
        return this.ref_block_number;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRef_block_prefix() {
        return this.ref_block_prefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.chainid;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.symbol;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.precision;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.contract;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.ref_block_prefix;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.ref_block_number;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.expiration;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EosSignInfo(chainid=" + this.chainid + ", symbol=" + this.symbol + ", precision=" + this.precision + ", contract=" + this.contract + ", ref_block_prefix=" + this.ref_block_prefix + ", ref_block_number=" + this.ref_block_number + ", expiration=" + this.expiration + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.eos.bean.EosSignInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EosSignInfo> serializer() {
            return EosSignInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EosSignInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainid = null;
        } else {
            this.chainid = str;
        }
        if ((i & 2) == 0) {
            this.symbol = null;
        } else {
            this.symbol = str2;
        }
        if ((i & 4) == 0) {
            this.precision = null;
        } else {
            this.precision = str3;
        }
        if ((i & 8) == 0) {
            this.contract = null;
        } else {
            this.contract = str4;
        }
        if ((i & 16) == 0) {
            this.ref_block_prefix = null;
        } else {
            this.ref_block_prefix = str5;
        }
        if ((i & 32) == 0) {
            this.ref_block_number = null;
        } else {
            this.ref_block_number = str6;
        }
        if ((i & 64) == 0) {
            this.expiration = null;
        } else {
            this.expiration = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EosSignInfo eosSignInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || eosSignInfo.chainid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, eosSignInfo.chainid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || eosSignInfo.symbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, eosSignInfo.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || eosSignInfo.precision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, eosSignInfo.precision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || eosSignInfo.contract != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, eosSignInfo.contract);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || eosSignInfo.ref_block_prefix != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, eosSignInfo.ref_block_prefix);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || eosSignInfo.ref_block_number != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, eosSignInfo.ref_block_number);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && eosSignInfo.expiration == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, eosSignInfo.expiration);
    }

    public EosSignInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.chainid = str;
        this.symbol = str2;
        this.precision = str3;
        this.contract = str4;
        this.ref_block_prefix = str5;
        this.ref_block_number = str6;
        this.expiration = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.defi.biz.core.transaction.sign.eos.bean.EosSignInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EosSignInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }
}
