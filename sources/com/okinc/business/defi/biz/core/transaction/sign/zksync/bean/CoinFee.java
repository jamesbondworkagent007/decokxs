package com.okinc.business.defi.biz.core.transaction.sign.zksync.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class CoinFee {
    public String amount;
    public Long coinId;
    public String originSymbol;
    public String rate;
    public String tokenId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinFee() {
        this((Long) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CoinFee copy$default(CoinFee coinFee, Long l, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            l = coinFee.coinId;
        }
        if ((i & 2) != 0) {
            str = coinFee.tokenId;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = coinFee.amount;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = coinFee.originSymbol;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = coinFee.rate;
        }
        return coinFee.AEQbTJ(l, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinFee AEQbTJ(Long l, String str, String str2, String str3, String str4) {
        return new CoinFee(l, str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long KWHzl() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.originSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinFee)) {
            return false;
        }
        CoinFee coinFee = (CoinFee) obj;
        return Intrinsics.EZpvd(this.coinId, coinFee.coinId) && Intrinsics.EZpvd((Object) this.tokenId, (Object) coinFee.tokenId) && Intrinsics.EZpvd((Object) this.amount, (Object) coinFee.amount) && Intrinsics.EZpvd((Object) this.originSymbol, (Object) coinFee.originSymbol) && Intrinsics.EZpvd((Object) this.rate, (Object) coinFee.rate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.coinId;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.tokenId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.amount;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.originSymbol;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.rate;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinFee(coinId=" + this.coinId + ", tokenId=" + this.tokenId + ", amount=" + this.amount + ", originSymbol=" + this.originSymbol + ", rate=" + this.rate + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.zksync.bean.CoinFee.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinFee> serializer() {
            return CoinFee$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CoinFee(int i, Long l, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinId = null;
        } else {
            this.coinId = l;
        }
        if ((i & 2) == 0) {
            this.tokenId = null;
        } else {
            this.tokenId = str;
        }
        if ((i & 4) == 0) {
            this.amount = null;
        } else {
            this.amount = str2;
        }
        if ((i & 8) == 0) {
            this.originSymbol = null;
        } else {
            this.originSymbol = str3;
        }
        if ((i & 16) == 0) {
            this.rate = null;
        } else {
            this.rate = str4;
        }
    }

    public static final /* synthetic */ void EZpvd(CoinFee coinFee, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || coinFee.coinId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, coinFee.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || coinFee.tokenId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, coinFee.tokenId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || coinFee.amount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, coinFee.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || coinFee.originSymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, coinFee.originSymbol);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && coinFee.rate == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, coinFee.rate);
    }

    public CoinFee(Long l, String str, String str2, String str3, String str4) {
        this.coinId = l;
        this.tokenId = str;
        this.amount = str2;
        this.originSymbol = str3;
        this.rate = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r5v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:20) call: com.okinc.business.defi.biz.core.transaction.sign.zksync.bean.CoinFee.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CoinFee(Long l, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
