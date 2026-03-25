package com.sparrowwallet.hummingbird.registry.pathcomponent;

/* JADX INFO: loaded from: classes24.dex */
public class IndexPathComponent extends PathComponent {
    private final boolean hardened;
    private final int index;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isHardened() {
        return this.hardened;
    }

    public IndexPathComponent(int i, boolean z) {
        this.index = i;
        this.hardened = z;
        if ((Integer.MIN_VALUE & i) == 0) {
            return;
        }
        throw new IllegalArgumentException("Invalid index " + i + " - most significant bit cannot be set");
    }

    public String toString() {
        return this.index + (this.hardened ? "'" : "");
    }
}
