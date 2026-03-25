package com.reown.foundation.common.model;

import com.reown.util.UtilFunctionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface Key {
    byte[] getKeyAsBytes();

    String getKeyAsHex();

    public static final class DefaultImpls {
        public static byte[] getKeyAsBytes(@NotNull Key key) {
            return UtilFunctionsKt.hexToBytes(key.getKeyAsHex());
        }
    }
}
