package com.okinc.wallet.core.sign;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
public final class SignParams {
    public static final int $stable = 8;
    private Integer addressIndex;
    private int addressType;
    private long chainId;
    private Integer chainType;
    private String fromAddress;
    private boolean isSpecificMnemonic;
    private String mnemonic;
    private boolean noKey;
    private String prvKey;
    private long realChainId;
    private String token;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAddressIndex() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getChainType() {
        return this.chainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAddress() {
        return this.fromAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMnemonic() {
        return this.mnemonic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNoKey() {
        return this.noKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrvKey() {
        return this.prvKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRealChainId() {
        return this.realChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSpecificMnemonic() {
        return this.isSpecificMnemonic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressIndex(Integer num) {
        this.addressIndex = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressType(int i) {
        this.addressType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(long j) {
        this.chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainType(Integer num) {
        this.chainType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromAddress(String str) {
        this.fromAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMnemonic(String str) {
        this.mnemonic = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNoKey(boolean z) {
        this.noKey = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrvKey(String str) {
        this.prvKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRealChainId(long j) {
        this.realChainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpecificMnemonic(boolean z) {
        this.isSpecificMnemonic = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToken(String str) {
        this.token = str;
    }

    public SignParams(long j, long j2, String str, String str2, String str3, Integer num, int i, String str4, boolean z, boolean z2, Integer num2) {
        this.chainId = j;
        this.realChainId = j2;
        this.token = str;
        this.prvKey = str2;
        this.mnemonic = str3;
        this.addressIndex = num;
        this.addressType = i;
        this.fromAddress = str4;
        this.noKey = z;
        this.isSpecificMnemonic = z2;
        this.chainType = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (r18v0 long)
  (r20v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001b: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r25v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0023: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r26v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0034: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003d: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r29v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0045: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r30v0 java.lang.Integer))
 A[MD:(long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, java.lang.String, boolean, boolean, java.lang.Integer):void (m)] (LINE:26) call: com.okinc.wallet.core.sign.SignParams.<init>(long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, java.lang.String, boolean, boolean, java.lang.Integer):void type: THIS */
    public /* synthetic */ SignParams(long j, long j2, String str, String str2, String str3, Integer num, int i, String str4, boolean z, boolean z2, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? 1 : i, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? false : z2, (i2 & 1024) != 0 ? null : num2);
    }
}
