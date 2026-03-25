package com.okinc.okex.center.ui.displaymodels;

import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.ui.adapter.ActivityHighlightCardAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class HighlightArticleDisplayModel extends ActivityHighlightCardAdapter.TaskDescription {
    public static final int $stable = 8;
    private final String description;
    private final SelfServiceToolBean selfServiceTool;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HighlightArticleDisplayModel copy$default(HighlightArticleDisplayModel highlightArticleDisplayModel, String str, String str2, SelfServiceToolBean selfServiceToolBean, int i, Object obj) {
        if ((i & 1) != 0) {
            str = highlightArticleDisplayModel.title;
        }
        if ((i & 2) != 0) {
            str2 = highlightArticleDisplayModel.description;
        }
        if ((i & 4) != 0) {
            selfServiceToolBean = highlightArticleDisplayModel.selfServiceTool;
        }
        return highlightArticleDisplayModel.copy(str, str2, selfServiceToolBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceToolBean component3() {
        return this.selfServiceTool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HighlightArticleDisplayModel copy(@NotNull String str, String str2, SelfServiceToolBean selfServiceToolBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return new HighlightArticleDisplayModel(str, str2, selfServiceToolBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighlightArticleDisplayModel)) {
            return false;
        }
        HighlightArticleDisplayModel highlightArticleDisplayModel = (HighlightArticleDisplayModel) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) highlightArticleDisplayModel.title) && Intrinsics.EZpvd((Object) this.description, (Object) highlightArticleDisplayModel.description) && Intrinsics.EZpvd(this.selfServiceTool, highlightArticleDisplayModel.selfServiceTool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceToolBean getSelfServiceTool() {
        return this.selfServiceTool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.title.hashCode();
        String str = this.description;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        SelfServiceToolBean selfServiceToolBean = this.selfServiceTool;
        return (((iHashCode * 31) + iHashCode2) * 31) + (selfServiceToolBean != null ? selfServiceToolBean.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HighlightArticleDisplayModel(title=" + this.title + ", description=" + this.description + ", selfServiceTool=" + this.selfServiceTool + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:com.okinc.okex.center.bean.SelfServiceToolBean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.SelfServiceToolBean) : (r4v0 com.okinc.okex.center.bean.SelfServiceToolBean))
 A[MD:(java.lang.String, java.lang.String, com.okinc.okex.center.bean.SelfServiceToolBean):void (m)] (LINE:8) call: com.okinc.okex.center.ui.displaymodels.HighlightArticleDisplayModel.<init>(java.lang.String, java.lang.String, com.okinc.okex.center.bean.SelfServiceToolBean):void type: THIS */
    public /* synthetic */ HighlightArticleDisplayModel(String str, String str2, SelfServiceToolBean selfServiceToolBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : selfServiceToolBean);
    }

    public HighlightArticleDisplayModel(@NotNull String str, String str2, SelfServiceToolBean selfServiceToolBean) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
        this.description = str2;
        this.selfServiceTool = selfServiceToolBean;
    }
}
