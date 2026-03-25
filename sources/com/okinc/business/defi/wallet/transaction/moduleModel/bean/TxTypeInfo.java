package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class TxTypeInfo {
    public static final int $stable = 0;
    public static final Application Companion = new Application(null);
    public static final String STRATEGY_TYPE_7702_EXECUTE_FROM_SELF = "EVM_OKX7702WALLET_EXECUTEFROMSELF";
    private final String strategyType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TxTypeInfo copy$default(TxTypeInfo txTypeInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = txTypeInfo.strategyType;
        }
        return txTypeInfo.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxTypeInfo copy(String str) {
        return new TxTypeInfo(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TxTypeInfo) && Intrinsics.EZpvd((Object) this.strategyType, (Object) ((TxTypeInfo) obj).strategyType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.strategyType;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TxTypeInfo(strategyType=" + this.strategyType + ")";
    }

    public TxTypeInfo(String str) {
        this.strategyType = str;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxTypeInfo.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
