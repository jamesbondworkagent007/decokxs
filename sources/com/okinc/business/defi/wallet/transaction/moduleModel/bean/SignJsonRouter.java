package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SignJsonRouter extends BaseModel<SignJsonRouterItem> {
    public static final int $stable = 0;

    public SignJsonRouter() {
        super("signJsonRouter");
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class SignJsonRouterItem {
        public static final int $stable = 8;
        private String data;
        private final String title;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SignJsonRouterItem copy$default(SignJsonRouterItem signJsonRouterItem, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signJsonRouterItem.data;
            }
            if ((i & 2) != 0) {
                str2 = signJsonRouterItem.title;
            }
            return signJsonRouterItem.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignJsonRouterItem copy(String str, String str2) {
            return new SignJsonRouterItem(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignJsonRouterItem)) {
                return false;
            }
            SignJsonRouterItem signJsonRouterItem = (SignJsonRouterItem) obj;
            return Intrinsics.EZpvd((Object) this.data, (Object) signJsonRouterItem.data) && Intrinsics.EZpvd((Object) this.title, (Object) signJsonRouterItem.title);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getData() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.data;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.title;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setData(String str) {
            this.data = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SignJsonRouterItem(data=" + this.data + ", title=" + this.title + ")";
        }

        public SignJsonRouterItem(String str, String str2) {
            this.data = str;
            this.title = str2;
        }
    }
}
