package com.okinc.business.defi.biz.core.transaction.sign.evm.bean;

import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public class EVMExtJson {
    public static final int $stable = 8;
    private final List<EVMAuthorization> authorizationList;
    private final int decimal;
    private final String extFee;
    private final Integer feeType;
    private final String gas;
    private final String gasPrice;
    private final String nonce;
    private final String oldTxHash;
    private final String priorityFee;
    private final int repeatTxType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EVMAuthorization> getAuthorizationList() {
        return this.authorizationList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDecimal() {
        return this.decimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtFee() {
        return this.extFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFeeType() {
        return this.feeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGas() {
        return this.gas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOldTxHash() {
        return this.oldTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRepeatTxType() {
        return this.repeatTxType;
    }

    public EVMExtJson(String str, String str2, String str3, String str4, int i, int i2, String str5, String str6, Integer num, List<EVMAuthorization> list) {
        this.nonce = str;
        this.gas = str2;
        this.gasPrice = str3;
        this.priorityFee = str4;
        this.decimal = i;
        this.repeatTxType = i2;
        this.extFee = str5;
        this.oldTxHash = str6;
        this.feeType = num;
        this.authorizationList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 int)
  (r18v0 int)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.Integer)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r22v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.Integer, java.util.List<com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization>):void (m)] (LINE:133) call: com.okinc.business.defi.biz.core.transaction.sign.evm.bean.EVMExtJson.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.Integer, java.util.List):void type: THIS */
    public /* synthetic */ EVMExtJson(String str, String str2, String str3, String str4, int i, int i2, String str5, String str6, Integer num, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i, i2, str5, str6, num, (i3 & 512) != 0 ? null : list);
    }
}
