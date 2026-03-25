package com.sparrowwallet.hummingbird.registry.pathcomponent;

/* JADX INFO: loaded from: classes24.dex */
public class RangePathComponent extends PathComponent {
    private final int end;
    private final boolean hardened;
    private final int start;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getEnd() {
        return this.end;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getStart() {
        return this.start;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isHardened() {
        return this.hardened;
    }

    public RangePathComponent(int i, int i2, boolean z) {
        this.start = i;
        this.end = i2;
        this.hardened = z;
        if ((i & Integer.MIN_VALUE) != 0 || (Integer.MIN_VALUE & i2) != 0) {
            throw new IllegalArgumentException("Invalid range [" + i + ", " + i2 + "] - most significant bit cannot be set");
        }
        if (i < i2) {
            return;
        }
        throw new IllegalArgumentException("Invalid range [" + i + ", " + i2 + "] - start must be lower than end");
    }

    public String toString() {
        int i = this.start;
        boolean z = this.hardened;
        return "[" + i + (z ? "'" : "") + "-" + this.end + (z ? "'" : "") + "]";
    }
}
