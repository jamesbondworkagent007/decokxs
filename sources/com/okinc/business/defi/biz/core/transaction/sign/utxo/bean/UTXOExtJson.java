package com.okinc.business.defi.biz.core.transaction.sign.utxo.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class UTXOExtJson {
    public static final int $stable = 8;
    private final String brc20Type;
    private final String brc20TypeExt;
    private final Integer broadcastType;
    private final String gasFrom;
    private final List<String> inscriptionIds;
    private final String nftId;
    private final List<String> nftIds;
    private final String nftLocation;
    private final List<String> nftLocations;
    private final String oldTxHash;
    private final Integer protocolId;
    private final String publicKey;
    private final Integer utxoType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UTXOExtJson() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.utxoType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.oldTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.broadcastType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.gasFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.nftIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.nftLocation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.nftLocations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component7() {
        return this.inscriptionIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.brc20Type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.brc20TypeExt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTXOExtJson copy(Integer num, String str, String str2, List<String> list, String str3, List<String> list2, List<String> list3, String str4, String str5, String str6, Integer num2, Integer num3, String str7) {
        return new UTXOExtJson(num, str, str2, list, str3, list2, list3, str4, str5, str6, num2, num3, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UTXOExtJson)) {
            return false;
        }
        UTXOExtJson uTXOExtJson = (UTXOExtJson) obj;
        return Intrinsics.EZpvd(this.utxoType, uTXOExtJson.utxoType) && Intrinsics.EZpvd((Object) this.gasFrom, (Object) uTXOExtJson.gasFrom) && Intrinsics.EZpvd((Object) this.nftId, (Object) uTXOExtJson.nftId) && Intrinsics.EZpvd(this.nftIds, uTXOExtJson.nftIds) && Intrinsics.EZpvd((Object) this.nftLocation, (Object) uTXOExtJson.nftLocation) && Intrinsics.EZpvd(this.nftLocations, uTXOExtJson.nftLocations) && Intrinsics.EZpvd(this.inscriptionIds, uTXOExtJson.inscriptionIds) && Intrinsics.EZpvd((Object) this.brc20Type, (Object) uTXOExtJson.brc20Type) && Intrinsics.EZpvd((Object) this.brc20TypeExt, (Object) uTXOExtJson.brc20TypeExt) && Intrinsics.EZpvd((Object) this.oldTxHash, (Object) uTXOExtJson.oldTxHash) && Intrinsics.EZpvd(this.broadcastType, uTXOExtJson.broadcastType) && Intrinsics.EZpvd(this.protocolId, uTXOExtJson.protocolId) && Intrinsics.EZpvd((Object) this.publicKey, (Object) uTXOExtJson.publicKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBrc20Type() {
        return this.brc20Type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBrc20TypeExt() {
        return this.brc20TypeExt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBroadcastType() {
        return this.broadcastType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasFrom() {
        return this.gasFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getInscriptionIds() {
        return this.inscriptionIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftId() {
        return this.nftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getNftIds() {
        return this.nftIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftLocation() {
        return this.nftLocation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getNftLocations() {
        return this.nftLocations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOldTxHash() {
        return this.oldTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProtocolId() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getUtxoType() {
        return this.utxoType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.utxoType;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.gasFrom;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.nftId;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        List<String> list = this.nftIds;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        String str3 = this.nftLocation;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        List<String> list2 = this.nftLocations;
        int iHashCode6 = list2 == null ? 0 : list2.hashCode();
        List<String> list3 = this.inscriptionIds;
        int iHashCode7 = list3 == null ? 0 : list3.hashCode();
        String str4 = this.brc20Type;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.brc20TypeExt;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.oldTxHash;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        Integer num2 = this.broadcastType;
        int iHashCode11 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.protocolId;
        int iHashCode12 = num3 == null ? 0 : num3.hashCode();
        String str7 = this.publicKey;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UTXOExtJson(utxoType=" + this.utxoType + ", gasFrom=" + this.gasFrom + ", nftId=" + this.nftId + ", nftIds=" + this.nftIds + ", nftLocation=" + this.nftLocation + ", nftLocations=" + this.nftLocations + ", inscriptionIds=" + this.inscriptionIds + ", brc20Type=" + this.brc20Type + ", brc20TypeExt=" + this.brc20TypeExt + ", oldTxHash=" + this.oldTxHash + ", broadcastType=" + this.broadcastType + ", protocolId=" + this.protocolId + ", publicKey=" + this.publicKey + ")";
    }

    public UTXOExtJson(Integer num, String str, String str2, List<String> list, String str3, List<String> list2, List<String> list3, String str4, String str5, String str6, Integer num2, Integer num3, String str7) {
        this.utxoType = num;
        this.gasFrom = str;
        this.nftId = str2;
        this.nftIds = list;
        this.nftLocation = str3;
        this.nftLocations = list2;
        this.inscriptionIds = list3;
        this.brc20Type = str4;
        this.brc20TypeExt = str5;
        this.oldTxHash = str6;
        this.broadcastType = num2;
        this.protocolId = num3;
        this.publicKey = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0084: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r15v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001a: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002a: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r20v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0032: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r21v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0052: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r25v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x005a: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r26v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String):void (m)] (LINE:89) call: com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOExtJson.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ UTXOExtJson(Integer num, String str, String str2, List list, String str3, List list2, List list3, String str4, String str5, String str6, Integer num2, Integer num3, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : list3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : num2, (i & 2048) != 0 ? null : num3, (i & 4096) == 0 ? str7 : null);
    }
}
