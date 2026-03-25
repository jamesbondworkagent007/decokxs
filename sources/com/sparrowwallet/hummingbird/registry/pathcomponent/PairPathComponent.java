package com.sparrowwallet.hummingbird.registry.pathcomponent;

/* JADX INFO: loaded from: classes24.dex */
public class PairPathComponent extends PathComponent {
    private final IndexPathComponent external;
    private final IndexPathComponent internal;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IndexPathComponent getExternal() {
        return this.external;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IndexPathComponent getInternal() {
        return this.internal;
    }

    public PairPathComponent(IndexPathComponent indexPathComponent, IndexPathComponent indexPathComponent2) {
        this.external = indexPathComponent;
        this.internal = indexPathComponent2;
    }

    public String toString() {
        return "<" + this.external.toString() + ";" + this.internal.toString() + ">";
    }
}
