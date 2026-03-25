package com.sparrowwallet.hummingbird.registry.pathcomponent;

/* JADX INFO: loaded from: classes24.dex */
public class WildcardPathComponent extends PathComponent {
    private final boolean hardened;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isHardened() {
        return this.hardened;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "*";
    }

    public WildcardPathComponent(boolean z) {
        this.hardened = z;
    }
}
