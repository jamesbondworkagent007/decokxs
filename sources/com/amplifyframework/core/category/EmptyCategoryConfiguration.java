package com.amplifyframework.core.category;

/* JADX INFO: loaded from: classes2.dex */
public final class EmptyCategoryConfiguration extends CategoryConfiguration {
    private final CategoryType categoryType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.core.category.CategoryTypeable
    public CategoryType getCategoryType() {
        return this.categoryType;
    }

    private EmptyCategoryConfiguration(CategoryType categoryType) {
        this.categoryType = categoryType;
    }

    public static EmptyCategoryConfiguration forCategoryType(CategoryType categoryType) {
        return new EmptyCategoryConfiguration(categoryType);
    }
}
