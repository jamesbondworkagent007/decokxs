package com.okinc.okex.center.ui.displaymodels;

import androidx.annotation.DrawableRes;
import com.okinc.okex.article.bean.SupportFaqArticle;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC45063sii;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class RelatedArticleDisplayModel extends AbstractC45063sii {
    public static final int $stable = 0;
    private final int iconId;
    private final SupportFaqArticle sourceBean;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RelatedArticleDisplayModel copy$default(RelatedArticleDisplayModel relatedArticleDisplayModel, SupportFaqArticle supportFaqArticle, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            supportFaqArticle = relatedArticleDisplayModel.sourceBean;
        }
        if ((i2 & 2) != 0) {
            str = relatedArticleDisplayModel.title;
        }
        if ((i2 & 4) != 0) {
            i = relatedArticleDisplayModel.iconId;
        }
        return relatedArticleDisplayModel.copy(supportFaqArticle, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportFaqArticle component1() {
        return this.sourceBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.iconId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelatedArticleDisplayModel copy(@NotNull SupportFaqArticle supportFaqArticle, @NotNull String str, @DrawableRes int i) {
        Intrinsics.checkNotNullParameter(supportFaqArticle, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new RelatedArticleDisplayModel(supportFaqArticle, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedArticleDisplayModel)) {
            return false;
        }
        RelatedArticleDisplayModel relatedArticleDisplayModel = (RelatedArticleDisplayModel) obj;
        return Intrinsics.EZpvd(this.sourceBean, relatedArticleDisplayModel.sourceBean) && Intrinsics.EZpvd((Object) this.title, (Object) relatedArticleDisplayModel.title) && this.iconId == relatedArticleDisplayModel.iconId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIconId() {
        return this.iconId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getSourceBean()Ljava/lang/Object; */
    @Override // o.AbstractC45063sii
    public SupportFaqArticle getSourceBean() {
        return this.sourceBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC45063sii
    public String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.sourceBean.hashCode() * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.iconId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RelatedArticleDisplayModel(sourceBean=" + this.sourceBean + ", title=" + this.title + ", iconId=" + this.iconId + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelatedArticleDisplayModel(@NotNull SupportFaqArticle supportFaqArticle, @NotNull String str, @DrawableRes int i) {
        super(supportFaqArticle, str);
        Intrinsics.checkNotNullParameter(supportFaqArticle, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.sourceBean = supportFaqArticle;
        this.title = str;
        this.iconId = i;
    }
}
