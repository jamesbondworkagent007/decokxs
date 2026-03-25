package com.sparrowwallet.hummingbird.registry;

import com.google.android.gms.wallet.WalletConstants;
import com.reown.foundation.util.jwt.JwtUtilsKt;

/* JADX INFO: loaded from: classes24.dex */
public enum ScriptExpression {
    SCRIPT_HASH(400, "sh"),
    WITNESS_SCRIPT_HASH(401, "wsh"),
    PUBLIC_KEY(402, "pk"),
    PUBLIC_KEY_HASH(403, JwtUtilsKt.DID_METHOD_PKH),
    WITNESS_PUBLIC_KEY_HASH(404, "wpkh"),
    COMBO(405, "combo"),
    MULTISIG(WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED, "multi"),
    SORTED_MULTISIG(407, "sorted"),
    ADDRESS(307, "addr"),
    RAW_SCRIPT(408, "raw"),
    TAPROOT(409, "tr"),
    COSIGNER(WalletConstants.ERROR_CODE_INVALID_TRANSACTION, "cosigner");

    private final String expression;
    private final int tagValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getExpression() {
        return this.expression;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getTagValue() {
        return this.tagValue;
    }

    ScriptExpression(int i, String str) {
        this.tagValue = i;
        this.expression = str;
    }

    public static ScriptExpression fromTagValue(long j) {
        for (ScriptExpression scriptExpression : values()) {
            if (scriptExpression.tagValue == j) {
                return scriptExpression;
            }
        }
        throw new IllegalArgumentException("Unknown tag value " + j);
    }
}
