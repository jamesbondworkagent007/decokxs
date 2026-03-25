package com.okinc.web3.security.features.importing.model;

/* JADX INFO: loaded from: classes12.dex */
public interface SuggestedWordInput {

    public static final class PrivateKey implements SuggestedWordInput {
        public static final int $stable = 0;
        public static final PrivateKey INSTANCE = new PrivateKey();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PrivateKey";
        }

        private PrivateKey() {
        }
    }

    public static final class SeedPhrase implements SuggestedWordInput {
        public static final int $stable = 0;
        private final int index;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SeedPhrase copy$default(SeedPhrase seedPhrase, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = seedPhrase.index;
            }
            return seedPhrase.copy(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.index;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SeedPhrase copy(int i) {
            return new SeedPhrase(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SeedPhrase) && this.index == ((SeedPhrase) obj).index;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getIndex() {
            return this.index;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Integer.hashCode(this.index);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SeedPhrase(index=" + this.index + ")";
        }

        public SeedPhrase(int i) {
            this.index = i;
        }
    }
}
