package com.okinc.assets.backend.api.model.tax;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;

/* JADX INFO: loaded from: classes22.dex */
public final class TaxFaq {
    public static final int $stable = 8;
    private final String mainTitle;
    private final List<TitleContent> simpleFaqArticles;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.tax.TaxFaq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaxFaq copy$default(TaxFaq taxFaq, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxFaq.mainTitle;
        }
        if ((i & 2) != 0) {
            list = taxFaq.simpleFaqArticles;
        }
        return taxFaq.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mainTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TitleContent> component2() {
        return this.simpleFaqArticles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaxFaq copy(String str, List<TitleContent> list) {
        return new TaxFaq(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxFaq)) {
            return false;
        }
        TaxFaq taxFaq = (TaxFaq) obj;
        return Intrinsics.EZpvd((Object) this.mainTitle, (Object) taxFaq.mainTitle) && Intrinsics.EZpvd(this.simpleFaqArticles, taxFaq.simpleFaqArticles);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMainTitle() {
        return this.mainTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TitleContent> getSimpleFaqArticles() {
        return this.simpleFaqArticles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.mainTitle;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<TitleContent> list = this.simpleFaqArticles;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TaxFaq(mainTitle=" + this.mainTitle + ", simpleFaqArticles=" + this.simpleFaqArticles + ")";
    }

    public TaxFaq(String str, List<TitleContent> list) {
        this.mainTitle = str;
        this.simpleFaqArticles = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:10)) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.assets.backend.api.model.tax.TaxFaq$TitleContent>):void (m)] (LINE:8) call: com.okinc.assets.backend.api.model.tax.TaxFaq.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ TaxFaq(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? yDY.AhwBna() : list);
    }

    public static final class TitleContent {
        public static final int $stable = 0;
        private final String content;
        private final String title;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TitleContent copy$default(TitleContent titleContent, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = titleContent.title;
            }
            if ((i & 2) != 0) {
                str2 = titleContent.content;
            }
            return titleContent.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.content;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TitleContent copy(String str, String str2) {
            return new TitleContent(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TitleContent)) {
                return false;
            }
            TitleContent titleContent = (TitleContent) obj;
            return Intrinsics.EZpvd((Object) this.title, (Object) titleContent.title) && Intrinsics.EZpvd((Object) this.content, (Object) titleContent.content);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getContent() {
            return this.content;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.title;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.content;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TitleContent(title=" + this.title + ", content=" + this.content + ")";
        }

        public TitleContent(String str, String str2) {
            this.title = str;
            this.content = str2;
        }
    }
}
