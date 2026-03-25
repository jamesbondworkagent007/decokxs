package com.okinc.business.defi.biz.core.transaction.sign.stacks.bean;

import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class StacksExtJson {
    public static final int $stable = 8;
    private BigInteger nonce;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StacksExtJson copy$default(StacksExtJson stacksExtJson, BigInteger bigInteger, int i, Object obj) {
        if ((i & 1) != 0) {
            bigInteger = stacksExtJson.nonce;
        }
        return stacksExtJson.copy(bigInteger);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigInteger component1() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StacksExtJson copy(BigInteger bigInteger) {
        return new StacksExtJson(bigInteger);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StacksExtJson) && Intrinsics.EZpvd(this.nonce, ((StacksExtJson) obj).nonce);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigInteger getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        BigInteger bigInteger = this.nonce;
        if (bigInteger == null) {
            return 0;
        }
        return bigInteger.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNonce(BigInteger bigInteger) {
        this.nonce = bigInteger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StacksExtJson(nonce=" + this.nonce + ")";
    }

    public StacksExtJson(BigInteger bigInteger) {
        this.nonce = bigInteger;
    }
}
