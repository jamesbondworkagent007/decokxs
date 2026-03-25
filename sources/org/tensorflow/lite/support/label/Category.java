package org.tensorflow.lite.support.label;

import java.util.Objects;

/* JADX INFO: loaded from: classes25.dex */
public final class Category {
    private static final int DEFAULT_INDEX = -1;
    private static final float TOLERANCE = 1.0E-6f;
    private final String displayName;
    private final int index;
    private final String label;
    private final float score;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float getScore() {
        return this.score;
    }

    public static Category create(String str, String str2, float f, int i) {
        return new Category(str, str2, f, i);
    }

    public static Category create(String str, String str2, float f) {
        return new Category(str, str2, f, -1);
    }

    public Category(String str, float f) {
        this(str, "", f, -1);
    }

    private Category(String str, String str2, float f, int i) {
        this.label = str;
        this.displayName = str2;
        this.score = f;
        this.index = i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Category) {
            Category category = (Category) obj;
            if (category.getLabel().equals(this.label) && category.getDisplayName().equals(this.displayName) && Math.abs(category.getScore() - this.score) < TOLERANCE && category.getIndex() == this.index) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.label, this.displayName, Float.valueOf(this.score), Integer.valueOf(this.index));
    }

    public String toString() {
        return "<Category \"" + this.label + "\" (displayName=" + this.displayName + " score=" + this.score + " index=" + this.index + ")>";
    }
}
