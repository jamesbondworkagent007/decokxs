package com.okinc.business.defi.api.model.tx.signdata;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public class BaseTransferSignData extends BaseSignData {
    public static final int $stable = 8;
    private long coinId;
    private boolean isTransferMaxAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getCoinId$OKWallet_wallet_api() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTransferMaxAmount() {
        return this.isTransferMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCoinId$OKWallet_wallet_api(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransferMaxAmount(boolean z) {
        this.isTransferMaxAmount = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 long)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(long, boolean):void (m)] (LINE:12) call: com.okinc.business.defi.api.model.tx.signdata.BaseTransferSignData.<init>(long, boolean):void type: THIS */
    public /* synthetic */ BaseTransferSignData(long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? false : z);
    }

    public BaseTransferSignData(long j, boolean z) {
        super(null);
        this.coinId = j;
        this.isTransferMaxAmount = z;
    }

    public long getCoinId() {
        return getCoinId$OKWallet_wallet_api();
    }
}
