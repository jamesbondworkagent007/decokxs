package com.okinc.business.defi.api.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class CosmosSignature {
    public static final int $stable = 8;
    private CosmosPubKey pub_key;
    private String signature;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CosmosSignature() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CosmosSignature copy$default(CosmosSignature cosmosSignature, CosmosPubKey cosmosPubKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            cosmosPubKey = cosmosSignature.pub_key;
        }
        if ((i & 2) != 0) {
            str = cosmosSignature.signature;
        }
        return cosmosSignature.copy(cosmosPubKey, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CosmosPubKey component1() {
        return this.pub_key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CosmosSignature copy(CosmosPubKey cosmosPubKey, String str) {
        return new CosmosSignature(cosmosPubKey, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CosmosSignature)) {
            return false;
        }
        CosmosSignature cosmosSignature = (CosmosSignature) obj;
        return Intrinsics.EZpvd(this.pub_key, cosmosSignature.pub_key) && Intrinsics.EZpvd((Object) this.signature, (Object) cosmosSignature.signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CosmosPubKey getPub_key() {
        return this.pub_key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        CosmosPubKey cosmosPubKey = this.pub_key;
        int iHashCode = cosmosPubKey == null ? 0 : cosmosPubKey.hashCode();
        String str = this.signature;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPub_key(CosmosPubKey cosmosPubKey) {
        this.pub_key = cosmosPubKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignature(String str) {
        this.signature = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CosmosSignature(pub_key=" + this.pub_key + ", signature=" + this.signature + ")";
    }

    public CosmosSignature(CosmosPubKey cosmosPubKey, String str) {
        this.pub_key = cosmosPubKey;
        this.signature = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.api.bean.CosmosSignature$CosmosPubKey:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.bean.CosmosSignature$CosmosPubKey) : (r2v0 com.okinc.business.defi.api.bean.CosmosSignature$CosmosPubKey))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(com.okinc.business.defi.api.bean.CosmosSignature$CosmosPubKey, java.lang.String):void (m)] (LINE:378) call: com.okinc.business.defi.api.bean.CosmosSignature.<init>(com.okinc.business.defi.api.bean.CosmosSignature$CosmosPubKey, java.lang.String):void type: THIS */
    public /* synthetic */ CosmosSignature(CosmosPubKey cosmosPubKey, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cosmosPubKey, (i & 2) != 0 ? null : str);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class CosmosPubKey {
        public static final int $stable = 8;
        private String type;
        private String value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public CosmosPubKey() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CosmosPubKey copy$default(CosmosPubKey cosmosPubKey, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cosmosPubKey.type;
            }
            if ((i & 2) != 0) {
                str2 = cosmosPubKey.value;
            }
            return cosmosPubKey.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CosmosPubKey copy(String str, String str2) {
            return new CosmosPubKey(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CosmosPubKey)) {
                return false;
            }
            CosmosPubKey cosmosPubKey = (CosmosPubKey) obj;
            return Intrinsics.EZpvd((Object) this.type, (Object) cosmosPubKey.type) && Intrinsics.EZpvd((Object) this.value, (Object) cosmosPubKey.value);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.type;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.value;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setType(String str) {
            this.type = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setValue(String str) {
            this.value = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CosmosPubKey(type=" + this.type + ", value=" + this.value + ")";
        }

        public CosmosPubKey(String str, String str2) {
            this.type = str;
            this.value = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:383) call: com.okinc.business.defi.api.bean.CosmosSignature.CosmosPubKey.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ CosmosPubKey(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }
}
