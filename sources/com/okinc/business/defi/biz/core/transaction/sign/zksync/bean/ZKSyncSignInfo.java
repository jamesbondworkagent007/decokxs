package com.okinc.business.defi.biz.core.transaction.sign.zksync.bean;

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

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ZKSyncSignInfo {
    public String accountId;
    public String chainId;
    public List<CoinFee> coinFeeList;
    public String nonce;
    public String originSymbol;
    public String tokenId;
    public String validFrom;
    public String validUntil;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(CoinFee$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ZKSyncSignInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinFee> AEQbTJ() {
        return this.coinFeeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.originSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ZKSyncSignInfo copydefault(String str, String str2, String str3, String str4, String str5, List<CoinFee> list, String str6, String str7) {
        return new ZKSyncSignInfo(str, str2, str3, str4, str5, list, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZKSyncSignInfo)) {
            return false;
        }
        ZKSyncSignInfo zKSyncSignInfo = (ZKSyncSignInfo) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) zKSyncSignInfo.accountId) && Intrinsics.EZpvd((Object) this.tokenId, (Object) zKSyncSignInfo.tokenId) && Intrinsics.EZpvd((Object) this.chainId, (Object) zKSyncSignInfo.chainId) && Intrinsics.EZpvd((Object) this.originSymbol, (Object) zKSyncSignInfo.originSymbol) && Intrinsics.EZpvd((Object) this.nonce, (Object) zKSyncSignInfo.nonce) && Intrinsics.EZpvd(this.coinFeeList, zKSyncSignInfo.coinFeeList) && Intrinsics.EZpvd((Object) this.validFrom, (Object) zKSyncSignInfo.validFrom) && Intrinsics.EZpvd((Object) this.validUntil, (Object) zKSyncSignInfo.validUntil);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.validFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.accountId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tokenId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.chainId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.originSymbol;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.nonce;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        List<CoinFee> list = this.coinFeeList;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        String str6 = this.validFrom;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.validUntil;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ZKSyncSignInfo(accountId=" + this.accountId + ", tokenId=" + this.tokenId + ", chainId=" + this.chainId + ", originSymbol=" + this.originSymbol + ", nonce=" + this.nonce + ", coinFeeList=" + this.coinFeeList + ", validFrom=" + this.validFrom + ", validUntil=" + this.validUntil + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.validUntil;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.zksync.bean.ZKSyncSignInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ZKSyncSignInfo> serializer() {
            return ZKSyncSignInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ZKSyncSignInfo(int i, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accountId = null;
        } else {
            this.accountId = str;
        }
        if ((i & 2) == 0) {
            this.tokenId = null;
        } else {
            this.tokenId = str2;
        }
        if ((i & 4) == 0) {
            this.chainId = null;
        } else {
            this.chainId = str3;
        }
        if ((i & 8) == 0) {
            this.originSymbol = null;
        } else {
            this.originSymbol = str4;
        }
        if ((i & 16) == 0) {
            this.nonce = null;
        } else {
            this.nonce = str5;
        }
        if ((i & 32) == 0) {
            this.coinFeeList = null;
        } else {
            this.coinFeeList = list;
        }
        if ((i & 64) == 0) {
            this.validFrom = null;
        } else {
            this.validFrom = str6;
        }
        if ((i & 128) == 0) {
            this.validUntil = null;
        } else {
            this.validUntil = str7;
        }
    }

    public static final /* synthetic */ void KWHzl(ZKSyncSignInfo zKSyncSignInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || zKSyncSignInfo.accountId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, zKSyncSignInfo.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || zKSyncSignInfo.tokenId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, zKSyncSignInfo.tokenId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || zKSyncSignInfo.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, zKSyncSignInfo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || zKSyncSignInfo.originSymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, zKSyncSignInfo.originSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || zKSyncSignInfo.nonce != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, zKSyncSignInfo.nonce);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || zKSyncSignInfo.coinFeeList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], zKSyncSignInfo.coinFeeList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || zKSyncSignInfo.validFrom != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, zKSyncSignInfo.validFrom);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && zKSyncSignInfo.validUntil == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, zKSyncSignInfo.validUntil);
    }

    public ZKSyncSignInfo(String str, String str2, String str3, String str4, String str5, List<CoinFee> list, String str6, String str7) {
        this.accountId = str;
        this.tokenId = str2;
        this.chainId = str3;
        this.originSymbol = str4;
        this.nonce = str5;
        this.coinFeeList = list;
        this.validFrom = str6;
        this.validUntil = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r15v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.defi.biz.core.transaction.sign.zksync.bean.CoinFee>, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.defi.biz.core.transaction.sign.zksync.bean.ZKSyncSignInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ZKSyncSignInfo(String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str6, (i & 128) == 0 ? str7 : null);
    }
}
