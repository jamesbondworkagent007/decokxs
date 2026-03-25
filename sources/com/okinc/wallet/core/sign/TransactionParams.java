package com.okinc.wallet.core.sign;

import com.okinc.web3.security.bridge.MnemonicKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TransactionParams {
    private Integer addressIndex;
    private int addressType;
    private long chainId;
    private Integer chainType;
    private String fromAddress;
    private boolean isSpecificMnemonic;
    private String language;
    private boolean mainNetWork;
    private String mnemonic;
    private String prvKey;
    private long realChainId;
    private Object sigData;
    private String token;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.prvKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.mainNetWork;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.isSpecificMnemonic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component13() {
        return this.chainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.mnemonic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.realChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object component6() {
        return this.sigData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fromAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.addressIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionParams copy(String str, String str2, long j, long j2, String str3, @NotNull Object obj, String str4, Integer num, int i, boolean z, @NotNull String str5, boolean z2, Integer num2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new TransactionParams(str, str2, j, j2, str3, obj, str4, num, i, z, str5, z2, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionParams)) {
            return false;
        }
        TransactionParams transactionParams = (TransactionParams) obj;
        return Intrinsics.EZpvd((Object) this.prvKey, (Object) transactionParams.prvKey) && Intrinsics.EZpvd((Object) this.mnemonic, (Object) transactionParams.mnemonic) && this.chainId == transactionParams.chainId && this.realChainId == transactionParams.realChainId && Intrinsics.EZpvd((Object) this.token, (Object) transactionParams.token) && Intrinsics.EZpvd(this.sigData, transactionParams.sigData) && Intrinsics.EZpvd((Object) this.fromAddress, (Object) transactionParams.fromAddress) && Intrinsics.EZpvd(this.addressIndex, transactionParams.addressIndex) && this.addressType == transactionParams.addressType && this.mainNetWork == transactionParams.mainNetWork && Intrinsics.EZpvd((Object) this.language, (Object) transactionParams.language) && this.isSpecificMnemonic == transactionParams.isSpecificMnemonic && Intrinsics.EZpvd(this.chainType, transactionParams.chainType);
    }

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
    public final String getLanguage() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMainNetWork() {
        return this.mainNetWork;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMnemonic() {
        return this.mnemonic;
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
    public final Object getSigData() {
        return this.sigData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.prvKey;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.mnemonic;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = Long.hashCode(this.chainId);
        int iHashCode4 = Long.hashCode(this.realChainId);
        String str3 = this.token;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        int iHashCode6 = this.sigData.hashCode();
        String str4 = this.fromAddress;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        Integer num = this.addressIndex;
        int iHashCode8 = num == null ? 0 : num.hashCode();
        int iHashCode9 = Integer.hashCode(this.addressType);
        int iHashCode10 = Boolean.hashCode(this.mainNetWork);
        int iHashCode11 = this.language.hashCode();
        int iHashCode12 = Boolean.hashCode(this.isSpecificMnemonic);
        Integer num2 = this.chainType;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (num2 != null ? num2.hashCode() : 0);
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
    public final void setLanguage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.language = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainNetWork(boolean z) {
        this.mainNetWork = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMnemonic(String str) {
        this.mnemonic = str;
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
    public final void setSigData(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        this.sigData = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpecificMnemonic(boolean z) {
        this.isSpecificMnemonic = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToken(String str) {
        this.token = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionParams(prvKey=" + this.prvKey + ", mnemonic=" + this.mnemonic + ", chainId=" + this.chainId + ", realChainId=" + this.realChainId + ", token=" + this.token + ", sigData=" + this.sigData + ", fromAddress=" + this.fromAddress + ", addressIndex=" + this.addressIndex + ", addressType=" + this.addressType + ", mainNetWork=" + this.mainNetWork + ", language=" + this.language + ", isSpecificMnemonic=" + this.isSpecificMnemonic + ", chainType=" + this.chainType + ")";
    }

    public TransactionParams(String str, String str2, long j, long j2, String str3, @NotNull Object obj, String str4, Integer num, int i, boolean z, @NotNull String str5, boolean z2, Integer num2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.prvKey = str;
        this.mnemonic = str2;
        this.chainId = j;
        this.realChainId = j2;
        this.token = str3;
        this.sigData = obj;
        this.fromAddress = str4;
        this.addressIndex = num;
        this.addressType = i;
        this.mainNetWork = z;
        this.language = str5;
        this.isSpecificMnemonic = z2;
        this.chainType = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r35v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (r22v0 long)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0013: ARITH (r35v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r24v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r35v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (r27v0 java.lang.Object)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r35v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002d: ARITH (r35v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r29v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0035: ARITH (r35v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r30v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003e: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? true : (r31v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004c: SGET  A[WRAPPED] com.okinc.web3.security.bridge.MnemonicKt.MnemonicLanguageEnglish java.lang.String) : (r32v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0051: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x005b: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r34v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.Object, java.lang.String, java.lang.Integer, int, boolean, java.lang.String, boolean, java.lang.Integer):void (m)] (LINE:41) call: com.okinc.wallet.core.sign.TransactionParams.<init>(java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.Object, java.lang.String, java.lang.Integer, int, boolean, java.lang.String, boolean, java.lang.Integer):void type: THIS */
    public /* synthetic */ TransactionParams(String str, String str2, long j, long j2, String str3, Object obj, String str4, Integer num, int i, boolean z, String str5, boolean z2, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, j, (i2 & 8) != 0 ? 0L : j2, (i2 & 16) != 0 ? null : str3, obj, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : num, (i2 & 256) != 0 ? 1 : i, (i2 & 512) != 0 ? true : z, (i2 & 1024) != 0 ? MnemonicKt.MnemonicLanguageEnglish : str5, (i2 & 2048) != 0 ? false : z2, (i2 & 4096) != 0 ? null : num2);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.TransactionParams.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final TransactionParams AEQbTJ(@NotNull SignParams signParams, @NotNull Object obj) {
            Intrinsics.checkNotNullParameter(signParams, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return new TransactionParams(signParams.getPrvKey(), signParams.getMnemonic(), signParams.getChainId(), signParams.getRealChainId(), signParams.getToken(), obj, null, signParams.getAddressIndex(), signParams.getAddressType(), false, null, signParams.isSpecificMnemonic(), signParams.getChainType(), 1600, null);
        }
    }
}
