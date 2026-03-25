package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SimpleTextModuleModel extends BaseModel<TextItem> {
    public static final int $stable = 0;

    public SimpleTextModuleModel() {
        super("simpleText");
    }

    public static final class TextItem {
        public static final int $stable = 0;
        private final String text;
        private final String title;
        private final String titleHover;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TextItem copy$default(TextItem textItem, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textItem.text;
            }
            if ((i & 2) != 0) {
                str2 = textItem.title;
            }
            if ((i & 4) != 0) {
                str3 = textItem.titleHover;
            }
            return textItem.copy(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.text;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.titleHover;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TextItem copy(String str, String str2, String str3) {
            return new TextItem(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextItem)) {
                return false;
            }
            TextItem textItem = (TextItem) obj;
            return Intrinsics.EZpvd((Object) this.text, (Object) textItem.text) && Intrinsics.EZpvd((Object) this.title, (Object) textItem.title) && Intrinsics.EZpvd((Object) this.titleHover, (Object) textItem.titleHover);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getText() {
            return this.text;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitleHover() {
            return this.titleHover;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.text;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.title;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.titleHover;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TextItem(text=" + this.text + ", title=" + this.title + ", titleHover=" + this.titleHover + ")";
        }

        public TextItem(String str, String str2, String str3) {
            this.text = str;
            this.title = str2;
            this.titleHover = str3;
        }
    }
}
