package org.kethereum.crypto.impl.cipher;

import org.kethereum.crypto.api.cipher.AESCipher;

/* JADX INFO: loaded from: classes24.dex */
public final class AESCipherImpl implements AESCipher {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AESCipher.Operation.values().length];
            iArr[AESCipher.Operation.ENCRYPTION.ordinal()] = 1;
            iArr[AESCipher.Operation.DESCRYPTION.ordinal()] = 2;
            copydefault = iArr;
        }
    }
}
