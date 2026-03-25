package com.okinc.wallet.core.sign;

import com.okinc.web3.security.bridge.MnemonicKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class InvokeMethodParams {
    private Integer addressIndex;
    private int addressType;
    private long chainId;
    private boolean isSpecificMnemonic;
    private String language;
    private boolean mainNetWork;
    private Object methodData;
    private String methodName;
    private String mnemonic;
    private boolean noKey;
    private String prvKey;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;

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
    public final String getLanguage() {
        return this.language;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMainNetWork() {
        return this.mainNetWork;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getMethodData() {
        return this.methodData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethodName() {
        return this.methodName;
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
    public final void setLanguage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.language = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainNetWork(boolean z) {
        this.mainNetWork = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMethodData(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        this.methodData = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMethodName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.methodName = str;
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
    public final void setSpecificMnemonic(boolean z) {
        this.isSpecificMnemonic = z;
    }

    public InvokeMethodParams(long j, String str, String str2, @NotNull String str3, @NotNull Object obj, Integer num, int i, boolean z, @NotNull String str4, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.chainId = j;
        this.prvKey = str;
        this.mnemonic = str2;
        this.methodName = str3;
        this.methodData = obj;
        this.addressIndex = num;
        this.addressType = i;
        this.mainNetWork = z;
        this.language = str4;
        this.noKey = z2;
        this.isSpecificMnemonic = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003c: CONSTRUCTOR 
  (r16v0 long)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.Object)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r22v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r23v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? true : (r24v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0022: SGET  A[WRAPPED] com.okinc.web3.security.bridge.MnemonicKt.MnemonicLanguageEnglish java.lang.String) : (r25v0 java.lang.String))
  (r26v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r27v0 boolean))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Integer, int, boolean, java.lang.String, boolean, boolean):void (m)] (LINE:75) call: com.okinc.wallet.core.sign.InvokeMethodParams.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Integer, int, boolean, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ InvokeMethodParams(long j, String str, String str2, String str3, Object obj, Integer num, int i, boolean z, String str4, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, str3, obj, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? 1 : i, (i2 & 128) != 0 ? true : z, (i2 & 256) != 0 ? MnemonicKt.MnemonicLanguageEnglish : str4, z2, (i2 & 1024) != 0 ? false : z3);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.InvokeMethodParams.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final InvokeMethodParams EZpvd(@NotNull String str, @NotNull SignParams signParams, @NotNull Object obj) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(signParams, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return new InvokeMethodParams(signParams.getChainId(), signParams.getPrvKey(), signParams.getMnemonic(), str, obj, signParams.getAddressIndex(), signParams.getAddressType(), false, null, signParams.getNoKey(), signParams.isSpecificMnemonic(), MLKEMEngine.KyberPolyBytes, null);
        }
    }
}
