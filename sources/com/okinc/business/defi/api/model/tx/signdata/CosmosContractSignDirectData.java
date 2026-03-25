package com.okinc.business.defi.api.model.tx.signdata;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class CosmosContractSignDirectData extends CosmosContractSignData {
    public static final int $stable = 8;
    private String chainId;
    private SignDoc sign_doc;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CosmosContractSignDirectData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignDoc getSign_doc() {
        return this.sign_doc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(String str) {
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSign_doc(SignDoc signDoc) {
        this.sign_doc = signDoc;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:com.okinc.business.defi.api.model.tx.signdata.CosmosContractSignDirectData$SignDoc:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.api.model.tx.signdata.CosmosContractSignDirectData$SignDoc) : (r3v0 com.okinc.business.defi.api.model.tx.signdata.CosmosContractSignDirectData$SignDoc))
 A[MD:(java.lang.String, com.okinc.business.defi.api.model.tx.signdata.CosmosContractSignDirectData$SignDoc):void (m)] (LINE:180) call: com.okinc.business.defi.api.model.tx.signdata.CosmosContractSignDirectData.<init>(java.lang.String, com.okinc.business.defi.api.model.tx.signdata.CosmosContractSignDirectData$SignDoc):void type: THIS */
    public /* synthetic */ CosmosContractSignDirectData(String str, SignDoc signDoc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : signDoc);
    }

    public CosmosContractSignDirectData(String str, SignDoc signDoc) {
        this.chainId = str;
        this.sign_doc = signDoc;
    }

    public static final class SignDoc {
        public static final int $stable = 8;
        private String accountNumber;
        private String authInfoBytes;
        private String bodyBytes;
        private String chainId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SignDoc() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAuthInfoBytes() {
            return this.authInfoBytes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBodyBytes() {
            return this.bodyBytes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAccountNumber(String str) {
            this.accountNumber = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAuthInfoBytes(String str) {
            this.authInfoBytes = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBodyBytes(String str) {
            this.bodyBytes = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setChainId(String str) {
            this.chainId = str;
        }

        public SignDoc(String str, String str2, String str3, String str4) {
            this.chainId = str;
            this.accountNumber = str2;
            this.bodyBytes = str3;
            this.authInfoBytes = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:186) call: com.okinc.business.defi.api.model.tx.signdata.CosmosContractSignDirectData.SignDoc.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ SignDoc(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }
    }
}
