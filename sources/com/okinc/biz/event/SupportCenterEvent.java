package com.okinc.biz.event;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes18.dex */
public final class SupportCenterEvent {
    public static final SupportCenterEvent KWHzl = new SupportCenterEvent();

    private SupportCenterEvent() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TypeAiSearchParam {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ TypeAiSearchParam[] $VALUES;
        private final String value;
        public static final TypeAiSearchParam Enter = new TypeAiSearchParam("Enter", 0, "enter");
        public static final TypeAiSearchParam AiResult = new TypeAiSearchParam("AiResult", 1, "ai_result");
        public static final TypeAiSearchParam EsArticle = new TypeAiSearchParam("EsArticle", 2, "es_article");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ TypeAiSearchParam[] $values() {
            return new TypeAiSearchParam[]{Enter, AiResult, EsArticle};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<TypeAiSearchParam> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private TypeAiSearchParam(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            TypeAiSearchParam[] typeAiSearchParamArr$values = $values();
            $VALUES = typeAiSearchParamArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(typeAiSearchParamArr$values);
        }

        public static TypeAiSearchParam valueOf(String str) {
            return (TypeAiSearchParam) Enum.valueOf(TypeAiSearchParam.class, str);
        }

        public static TypeAiSearchParam[] values() {
            return (TypeAiSearchParam[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class ArticlePageParam {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ArticlePageParam[] $VALUES;
        private final String value;
        public static final ArticlePageParam Faq = new ArticlePageParam("Faq", 0, "faq");
        public static final ArticlePageParam Search = new ArticlePageParam("Search", 1, "search");
        public static final ArticlePageParam ExploreTopics = new ArticlePageParam("ExploreTopics", 2, "explore_topics");
        public static final ArticlePageParam IntegratedSolution = new ArticlePageParam("IntegratedSolution", 3, "integrated_solution");
        public static final ArticlePageParam FullArticleList = new ArticlePageParam("FullArticleList", 4, "full_article_list");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ArticlePageParam[] $values() {
            return new ArticlePageParam[]{Faq, Search, ExploreTopics, IntegratedSolution, FullArticleList};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ArticlePageParam> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private ArticlePageParam(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            ArticlePageParam[] articlePageParamArr$values = $values();
            $VALUES = articlePageParamArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(articlePageParamArr$values);
        }

        public static ArticlePageParam valueOf(String str) {
            return (ArticlePageParam) Enum.valueOf(ArticlePageParam.class, str);
        }

        public static ArticlePageParam[] values() {
            return (ArticlePageParam[]) $VALUES.clone();
        }
    }
}
