package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class TokenPair extends BaseModel<TokenItem> {
    public static final int $stable = 0;

    public TokenPair() {
        super("tokenPair");
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class TokenItem {
        public static final int $stable = 0;
        private final String title;
        private final String token1Symbol;
        private final Double token1ToToken2;
        private final String token2Symbol;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TokenItem copy$default(TokenItem tokenItem, String str, String str2, Double d, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = tokenItem.title;
            }
            if ((i & 2) != 0) {
                str2 = tokenItem.token1Symbol;
            }
            if ((i & 4) != 0) {
                d = tokenItem.token1ToToken2;
            }
            if ((i & 8) != 0) {
                str3 = tokenItem.token2Symbol;
            }
            return tokenItem.copy(str, str2, d, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.token1Symbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Double component3() {
            return this.token1ToToken2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.token2Symbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TokenItem copy(String str, String str2, Double d, String str3) {
            return new TokenItem(str, str2, d, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TokenItem)) {
                return false;
            }
            TokenItem tokenItem = (TokenItem) obj;
            return Intrinsics.EZpvd((Object) this.title, (Object) tokenItem.title) && Intrinsics.EZpvd((Object) this.token1Symbol, (Object) tokenItem.token1Symbol) && Intrinsics.EZpvd(this.token1ToToken2, tokenItem.token1ToToken2) && Intrinsics.EZpvd((Object) this.token2Symbol, (Object) tokenItem.token2Symbol);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getToken1Symbol() {
            return this.token1Symbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Double getToken1ToToken2() {
            return this.token1ToToken2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getToken2Symbol() {
            return this.token2Symbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.title;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.token1Symbol;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            Double d = this.token1ToToken2;
            int iHashCode3 = d == null ? 0 : d.hashCode();
            String str3 = this.token2Symbol;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TokenItem(title=" + this.title + ", token1Symbol=" + this.token1Symbol + ", token1ToToken2=" + this.token1ToToken2 + ", token2Symbol=" + this.token2Symbol + ")";
        }

        public TokenItem(String str, String str2, Double d, String str3) {
            this.title = str;
            this.token1Symbol = str2;
            this.token1ToToken2 = d;
            this.token2Symbol = str3;
        }
    }
}
