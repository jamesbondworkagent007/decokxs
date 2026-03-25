package com.okinc.business.defi.biz.net.bean;

import com.okinc.wallet.core.sign.evm.ExecuteParams;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class AAAccountInfo {
    public static final int $stable = 8;
    private final String aaAddress;
    private final String contractVersion;
    private final String depositAmount;
    private final String entryPoint;
    private final ExecuteParams[] executeParams;
    private final Boolean isDeploye;
    private final String name;
    private final Boolean needUpdate;
    private final String safeSingleton;
    private final Boolean showInitGas;
    private final Integer signatureTimeout;
    private final String version;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AAAccountInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAaAddress() {
        return this.aaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractVersion() {
        return this.contractVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositAmount() {
        return this.depositAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExecuteParams[] getExecuteParams() {
        return this.executeParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getNeedUpdate() {
        return this.needUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSafeSingleton() {
        return this.safeSingleton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowInitGas() {
        return this.showInitGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSignatureTimeout() {
        return this.signatureTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isDeploye() {
        return this.isDeploye;
    }

    public AAAccountInfo(String str, String str2, String str3, String str4, Integer num, String str5, Boolean bool, Boolean bool2, ExecuteParams[] executeParamsArr, String str6, String str7, Boolean bool3) {
        this.aaAddress = str;
        this.safeSingleton = str2;
        this.version = str3;
        this.entryPoint = str4;
        this.signatureTimeout = num;
        this.depositAmount = str5;
        this.isDeploye = bool;
        this.needUpdate = bool2;
        this.executeParams = executeParamsArr;
        this.contractVersion = str6;
        this.name = str7;
        this.showInitGas = bool3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0078: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0021: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r18v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0031: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0039: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (wrap:com.okinc.wallet.core.sign.evm.ExecuteParams[]:?: TERNARY null = ((wrap:int:0x0041: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.core.sign.evm.ExecuteParams[]) : (r22v0 com.okinc.wallet.core.sign.evm.ExecuteParams[]))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0059: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.Boolean) : (null java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Boolean, com.okinc.wallet.core.sign.evm.ExecuteParams[], java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:1408) call: com.okinc.business.defi.biz.net.bean.AAAccountInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Boolean, com.okinc.wallet.core.sign.evm.ExecuteParams[], java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ AAAccountInfo(String str, String str2, String str3, String str4, Integer num, String str5, Boolean bool, Boolean bool2, ExecuteParams[] executeParamsArr, String str6, String str7, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : executeParamsArr, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) == 0 ? bool3 : null);
    }
}
