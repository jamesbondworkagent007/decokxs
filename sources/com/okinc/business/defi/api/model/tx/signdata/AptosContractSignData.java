package com.okinc.business.defi.api.model.tx.signdata;

import com.okinc.business.defi.api.bean.AptosSignType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class AptosContractSignData extends ContractSignData {
    public static final int $stable = 8;
    private String abi;
    private String aptosPayload;
    private String from;
    private String gasUnitPrice;
    private Boolean isRawType;
    private String maxGasAmount;
    private String payload;
    private String secondarySignerAddresses;
    private AptosSignType signType;
    private String to;
    private String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AptosContractSignData() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAbi() {
        return this.abi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAptosPayload() {
        return this.aptosPayload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasUnitPrice() {
        return this.gasUnitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxGasAmount() {
        return this.maxGasAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayload() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSecondarySignerAddresses() {
        return this.secondarySignerAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AptosSignType getSignType() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isRawType() {
        return this.isRawType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAbi(String str) {
        this.abi = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAptosPayload(String str) {
        this.aptosPayload = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(String str) {
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasUnitPrice(String str) {
        this.gasUnitPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxGasAmount(String str) {
        this.maxGasAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayload(String str) {
        this.payload = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRawType(Boolean bool) {
        this.isRawType = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondarySignerAddresses(String str) {
        this.secondarySignerAddresses = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignType(@NotNull AptosSignType aptosSignType) {
        Intrinsics.checkNotNullParameter(aptosSignType, "");
        this.signType = aptosSignType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(String str) {
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.api.bean.AptosSignType:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:271) com.okinc.business.defi.api.bean.AptosSignType.SIGN_PAYLOAD com.okinc.business.defi.api.bean.AptosSignType) : (r13v0 com.okinc.business.defi.api.bean.AptosSignType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0041: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (null java.lang.String))
 A[MD:(com.okinc.business.defi.api.bean.AptosSignType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:270) call: com.okinc.business.defi.api.model.tx.signdata.AptosContractSignData.<init>(com.okinc.business.defi.api.bean.AptosSignType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AptosContractSignData(AptosSignType aptosSignType, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AptosSignType.SIGN_PAYLOAD : aptosSignType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : str8, (i & 1024) == 0 ? str9 : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AptosContractSignData(@NotNull AptosSignType aptosSignType, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9) {
        super(null);
        Intrinsics.checkNotNullParameter(aptosSignType, "");
        this.signType = aptosSignType;
        this.gasUnitPrice = str;
        this.maxGasAmount = str2;
        this.abi = str3;
        this.payload = str4;
        this.from = str5;
        this.to = str6;
        this.value = str7;
        this.isRawType = bool;
        this.aptosPayload = str8;
        this.secondarySignerAddresses = str9;
    }
}
