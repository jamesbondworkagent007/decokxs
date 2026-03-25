package org.htmlcleaner;

/* JADX INFO: loaded from: classes13.dex */
public enum Display {
    block(true, false),
    inline(false, true),
    any(true, false),
    none(true, false);

    private boolean afterTagLineBreakNeeded;
    private boolean leadingAndEndWhitespacesAllowed;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isAfterTagLineBreakNeeded() {
        return this.afterTagLineBreakNeeded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isLeadingAndEndWhitespacesAllowed() {
        return this.leadingAndEndWhitespacesAllowed;
    }

    Display(boolean z, boolean z2) {
        this.afterTagLineBreakNeeded = z;
        this.leadingAndEndWhitespacesAllowed = z2;
    }
}
