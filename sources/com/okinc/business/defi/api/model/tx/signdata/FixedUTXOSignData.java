package com.okinc.business.defi.api.model.tx.signdata;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class FixedUTXOSignData extends UTXOTransferBaseSignData {
    public static final String BTC_TXTYPE_DUMMY = "64";
    private List<FixedUTXOInfo> batchBean;
    private Integer protocolId;

    @SerializedName("to")
    private String toAddress;
    private String txType;
    private String utxoListJson;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FixedUTXOSignData() {
        this(0L, null, null, null, false, false, null, null, null, null, null, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FixedUTXOInfo> getBatchBean() {
        return this.batchBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProtocolId() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.TransferSignData
    public String getToAddress() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxType() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUtxoListJson() {
        return this.utxoListJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBatchBean(@NotNull List<FixedUTXOInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.batchBean = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProtocolId(Integer num) {
        this.protocolId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.TransferSignData
    public void setToAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxType(String str) {
        this.txType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUtxoListJson(String str) {
        this.utxoListJson = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0074: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r14v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r26v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r26v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r20v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003c: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0040: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:74)) : (r22v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004f: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r24v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.util.List<com.okinc.business.defi.api.model.tx.signdata.FixedUTXOInfo>, java.lang.String, java.lang.Integer, java.lang.String):void (m)] (LINE:65) call: com.okinc.business.defi.api.model.tx.signdata.FixedUTXOSignData.<init>(long, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.util.List, java.lang.String, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ FixedUTXOSignData(long j, String str, String str2, String str3, boolean z, boolean z2, String str4, List list, String str5, Integer num, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? false : z, (i & 32) == 0 ? z2 : false, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? yDY.AhwBna() : list, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : num, (i & 1024) == 0 ? str6 : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedUTXOSignData(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2, String str4, @NotNull List<FixedUTXOInfo> list, String str5, Integer num, String str6) {
        super(j, str2, str, str3, z, z2, str4);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.toAddress = str;
        this.batchBean = list;
        this.txType = str5;
        this.protocolId = num;
        this.utxoListJson = str6;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.model.tx.signdata.FixedUTXOSignData.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final Integer getFirstNftProtocolId() {
        FixedUTXOInfo fixedUTXOInfo = (FixedUTXOInfo) CollectionsKt___CollectionsKt.firstOrNull(this.batchBean);
        if (fixedUTXOInfo != null) {
            return fixedUTXOInfo.getProtocolId();
        }
        return null;
    }
}
