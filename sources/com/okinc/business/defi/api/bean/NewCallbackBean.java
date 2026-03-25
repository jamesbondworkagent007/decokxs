package com.okinc.business.defi.api.bean;

import com.google.gson.JsonObject;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class NewCallbackBean {
    public static final int $stable = 8;
    private final JsonObject body;
    private final DexCallbackBean dexCallbackBean;
    private final String dexUniqueKey;
    private String estTime;
    private final Map<String, String> headerMap;
    private boolean isBatch;
    private boolean isBtcMint;
    private Integer protocolId;
    private ReserveBean reserved;
    private final SignAuthType signAuthType;
    private String txType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NewCallbackBean() {
        this(null, null, false, null, false, null, null, null, null, null, null, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component1() {
        return this.headerMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexCallbackBean component10() {
        return this.dexCallbackBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignAuthType component11() {
        return this.signAuthType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component2() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isBatch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.estTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isBtcMint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReserveBean component6() {
        return this.reserved;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.dexUniqueKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewCallbackBean copy(@NotNull Map<String, String> map, @NotNull JsonObject jsonObject, boolean z, String str, boolean z2, ReserveBean reserveBean, Integer num, String str2, String str3, DexCallbackBean dexCallbackBean, SignAuthType signAuthType) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        return new NewCallbackBean(map, jsonObject, z, str, z2, reserveBean, num, str2, str3, dexCallbackBean, signAuthType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewCallbackBean)) {
            return false;
        }
        NewCallbackBean newCallbackBean = (NewCallbackBean) obj;
        return Intrinsics.EZpvd(this.headerMap, newCallbackBean.headerMap) && Intrinsics.EZpvd(this.body, newCallbackBean.body) && this.isBatch == newCallbackBean.isBatch && Intrinsics.EZpvd((Object) this.estTime, (Object) newCallbackBean.estTime) && this.isBtcMint == newCallbackBean.isBtcMint && Intrinsics.EZpvd(this.reserved, newCallbackBean.reserved) && Intrinsics.EZpvd(this.protocolId, newCallbackBean.protocolId) && Intrinsics.EZpvd((Object) this.txType, (Object) newCallbackBean.txType) && Intrinsics.EZpvd((Object) this.dexUniqueKey, (Object) newCallbackBean.dexUniqueKey) && Intrinsics.EZpvd(this.dexCallbackBean, newCallbackBean.dexCallbackBean) && this.signAuthType == newCallbackBean.signAuthType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getBody() {
        return this.body;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexCallbackBean getDexCallbackBean() {
        return this.dexCallbackBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexUniqueKey() {
        return this.dexUniqueKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstTime() {
        return this.estTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getHeaderMap() {
        return this.headerMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProtocolId() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReserveBean getReserved() {
        return this.reserved;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignAuthType getSignAuthType() {
        return this.signAuthType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxType() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.headerMap.hashCode();
        int iHashCode2 = this.body.hashCode();
        int iHashCode3 = Boolean.hashCode(this.isBatch);
        String str = this.estTime;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = Boolean.hashCode(this.isBtcMint);
        ReserveBean reserveBean = this.reserved;
        int iHashCode6 = reserveBean == null ? 0 : reserveBean.hashCode();
        Integer num = this.protocolId;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        String str2 = this.txType;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.dexUniqueKey;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        DexCallbackBean dexCallbackBean = this.dexCallbackBean;
        int iHashCode10 = dexCallbackBean == null ? 0 : dexCallbackBean.hashCode();
        SignAuthType signAuthType = this.signAuthType;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (signAuthType != null ? signAuthType.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBatch() {
        return this.isBatch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBtcMint() {
        return this.isBtcMint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBatch(boolean z) {
        this.isBatch = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBtcMint(boolean z) {
        this.isBtcMint = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstTime(String str) {
        this.estTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProtocolId(Integer num) {
        this.protocolId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReserved(ReserveBean reserveBean) {
        this.reserved = reserveBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxType(String str) {
        this.txType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewCallbackBean(headerMap=" + this.headerMap + ", body=" + this.body + ", isBatch=" + this.isBatch + ", estTime=" + this.estTime + ", isBtcMint=" + this.isBtcMint + ", reserved=" + this.reserved + ", protocolId=" + this.protocolId + ", txType=" + this.txType + ", dexUniqueKey=" + this.dexUniqueKey + ", dexCallbackBean=" + this.dexCallbackBean + ", signAuthType=" + this.signAuthType + ")";
    }

    public NewCallbackBean(@NotNull Map<String, String> map, @NotNull JsonObject jsonObject, boolean z, String str, boolean z2, ReserveBean reserveBean, Integer num, String str2, String str3, DexCallbackBean dexCallbackBean, SignAuthType signAuthType) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        this.headerMap = map;
        this.body = jsonObject;
        this.isBatch = z;
        this.estTime = str;
        this.isBtcMint = z2;
        this.reserved = reserveBean;
        this.protocolId = num;
        this.txType = str2;
        this.dexUniqueKey = str3;
        this.dexCallbackBean = dexCallbackBean;
        this.signAuthType = signAuthType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0073: CONSTRUCTOR 
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:64)) : (r13v0 java.util.Map))
  (wrap:com.google.gson.JsonObject:?: TERNARY null = ((wrap:int:0x000c: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0012: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:65) call: com.google.gson.JsonObject.<init>():void type: CONSTRUCTOR) : (r14v0 com.google.gson.JsonObject))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0017: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r17v0 boolean) : false)
  (wrap:com.okinc.business.defi.api.bean.ReserveBean:?: TERNARY null = ((wrap:int:0x002f: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.ReserveBean) : (r18v0 com.okinc.business.defi.api.bean.ReserveBean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0037: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r19v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:com.okinc.business.defi.api.bean.NewCallbackBean$DexCallbackBean:?: TERNARY null = ((wrap:int:0x004f: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.NewCallbackBean$DexCallbackBean) : (r22v0 com.okinc.business.defi.api.bean.NewCallbackBean$DexCallbackBean))
  (wrap:com.okinc.business.defi.api.model.tx.SignAuthType:?: TERNARY null = ((wrap:int:0x0057: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 com.okinc.business.defi.api.model.tx.SignAuthType) : (null com.okinc.business.defi.api.model.tx.SignAuthType))
 A[MD:(java.util.Map<java.lang.String, java.lang.String>, com.google.gson.JsonObject, boolean, java.lang.String, boolean, com.okinc.business.defi.api.bean.ReserveBean, java.lang.Integer, java.lang.String, java.lang.String, com.okinc.business.defi.api.bean.NewCallbackBean$DexCallbackBean, com.okinc.business.defi.api.model.tx.SignAuthType):void (m)] (LINE:63) call: com.okinc.business.defi.api.bean.NewCallbackBean.<init>(java.util.Map, com.google.gson.JsonObject, boolean, java.lang.String, boolean, com.okinc.business.defi.api.bean.ReserveBean, java.lang.Integer, java.lang.String, java.lang.String, com.okinc.business.defi.api.bean.NewCallbackBean$DexCallbackBean, com.okinc.business.defi.api.model.tx.SignAuthType):void type: THIS */
    public /* synthetic */ NewCallbackBean(Map map, JsonObject jsonObject, boolean z, String str, boolean z2, ReserveBean reserveBean, Integer num, String str2, String str3, DexCallbackBean dexCallbackBean, SignAuthType signAuthType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C56424yEw.KWHzl() : map, (i & 2) != 0 ? new JsonObject() : jsonObject, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str, (i & 16) == 0 ? z2 : false, (i & 32) != 0 ? null : reserveBean, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : dexCallbackBean, (i & 1024) == 0 ? signAuthType : null);
    }

    public static final class DexCallbackBean {
        public static final int $stable = 8;
        private final List<String> mevSuppliers;
        private final String nonce;
        private final List<SignedInfo> signedInfoList;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DexCallbackBean() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.api.bean.NewCallbackBean$DexCallbackBean */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DexCallbackBean copy$default(DexCallbackBean dexCallbackBean, String str, List list, List list2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dexCallbackBean.nonce;
            }
            if ((i & 2) != 0) {
                list = dexCallbackBean.mevSuppliers;
            }
            if ((i & 4) != 0) {
                list2 = dexCallbackBean.signedInfoList;
            }
            return dexCallbackBean.copy(str, list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.nonce;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component2() {
            return this.mevSuppliers;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<SignedInfo> component3() {
            return this.signedInfoList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DexCallbackBean copy(String str, List<String> list, List<SignedInfo> list2) {
            return new DexCallbackBean(str, list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DexCallbackBean)) {
                return false;
            }
            DexCallbackBean dexCallbackBean = (DexCallbackBean) obj;
            return Intrinsics.EZpvd((Object) this.nonce, (Object) dexCallbackBean.nonce) && Intrinsics.EZpvd(this.mevSuppliers, dexCallbackBean.mevSuppliers) && Intrinsics.EZpvd(this.signedInfoList, dexCallbackBean.signedInfoList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getMevSuppliers() {
            return this.mevSuppliers;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNonce() {
            return this.nonce;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<SignedInfo> getSignedInfoList() {
            return this.signedInfoList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.nonce;
            int iHashCode = str == null ? 0 : str.hashCode();
            List<String> list = this.mevSuppliers;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            List<SignedInfo> list2 = this.signedInfoList;
            return (((iHashCode * 31) + iHashCode2) * 31) + (list2 != null ? list2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DexCallbackBean(nonce=" + this.nonce + ", mevSuppliers=" + this.mevSuppliers + ", signedInfoList=" + this.signedInfoList + ")";
        }

        public DexCallbackBean(String str, List<String> list, List<SignedInfo> list2) {
            this.nonce = str;
            this.mevSuppliers = list;
            this.signedInfoList = list2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.util.List<com.okinc.business.defi.api.bean.NewCallbackBean$DexCallbackBean$SignedInfo>):void (m)] (LINE:78) call: com.okinc.business.defi.api.bean.NewCallbackBean.DexCallbackBean.<init>(java.lang.String, java.util.List, java.util.List):void type: THIS */
        public /* synthetic */ DexCallbackBean(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
        }

        public static final class SignedInfo {
            public static final int $stable = 0;
            private final String signedTx;
            private final String transactionHash;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public SignedInfo() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ SignedInfo copy$default(SignedInfo signedInfo, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = signedInfo.transactionHash;
                }
                if ((i & 2) != 0) {
                    str2 = signedInfo.signedTx;
                }
                return signedInfo.copy(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.transactionHash;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.signedTx;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInfo copy(String str, String str2) {
                return new SignedInfo(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SignedInfo)) {
                    return false;
                }
                SignedInfo signedInfo = (SignedInfo) obj;
                return Intrinsics.EZpvd((Object) this.transactionHash, (Object) signedInfo.transactionHash) && Intrinsics.EZpvd((Object) this.signedTx, (Object) signedInfo.signedTx);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getSignedTx() {
                return this.signedTx;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTransactionHash() {
                return this.transactionHash;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.transactionHash;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.signedTx;
                return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SignedInfo(transactionHash=" + this.transactionHash + ", signedTx=" + this.signedTx + ")";
            }

            public SignedInfo(String str, String str2) {
                this.transactionHash = str;
                this.signedTx = str2;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:85) call: com.okinc.business.defi.api.bean.NewCallbackBean.DexCallbackBean.SignedInfo.<init>(java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ SignedInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
            }
        }
    }
}
