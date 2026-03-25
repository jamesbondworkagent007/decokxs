package org.htmlcleaner;

/* JADX INFO: loaded from: classes13.dex */
public enum CloseTag {
    required(false, true),
    optional(true, true),
    forbidden(true, false);

    private final boolean endTagPermitted;
    private final boolean minimizedTagPermitted;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isEndTagPermitted() {
        return this.endTagPermitted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isMinimizedTagPermitted() {
        return this.minimizedTagPermitted;
    }

    CloseTag(boolean z, boolean z2) {
        this.minimizedTagPermitted = z;
        this.endTagPermitted = z2;
    }
}
