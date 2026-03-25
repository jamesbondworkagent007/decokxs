package com.keystone.module;

/* JADX INFO: loaded from: classes22.dex */
public final class PathItem {
    private final boolean hardened;
    private final int index;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PathItem copy$default(PathItem pathItem, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pathItem.index;
        }
        if ((i2 & 2) != 0) {
            z = pathItem.hardened;
        }
        return pathItem.copy(i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.hardened;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PathItem copy(int i, boolean z) {
        return new PathItem(i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathItem)) {
            return false;
        }
        PathItem pathItem = (PathItem) obj;
        return this.index == pathItem.index && this.hardened == pathItem.hardened;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHardened() {
        return this.hardened;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.index);
        boolean z = this.hardened;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return (iHashCode * 31) + r1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PathItem(index=" + this.index + ", hardened=" + this.hardened + ')';
    }

    public PathItem(int i, boolean z) {
        this.index = i;
        this.hardened = z;
    }
}
