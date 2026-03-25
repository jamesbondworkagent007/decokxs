package org.kethereum.crypto.api.cipher;

/* JADX INFO: loaded from: classes24.dex */
public interface AESCipher {

    public enum Operation {
        ENCRYPTION,
        DESCRYPTION
    }

    public enum Mode {
        CTR("CTR"),
        CDC("CDC");

        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getId() {
            return this.id;
        }

        Mode(String str) {
            this.id = str;
        }
    }

    public enum Padding {
        NO("NoPadding"),
        PKCS5("PKCS5Padding");

        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getId() {
            return this.id;
        }

        Padding(String str) {
            this.id = str;
        }
    }
}
