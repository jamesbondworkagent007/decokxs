package com.fasterxml.jackson.databind.cfg;

import o.VT;

/* JADX INFO: loaded from: classes21.dex */
public enum EnumFeature implements VT {
    BOGUS_FEATURE(false);

    private static final int FEATURE_INDEX = 0;
    private final boolean _enabledByDefault;
    private final int _mask = 1 << ordinal();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5540Vq
    public boolean enabledByDefault() {
        return this._enabledByDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5540Vq
    public boolean enabledIn(int i) {
        return (i & this._mask) != 0;
    }

    @Override // o.VT
    public int featureIndex() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5540Vq
    public int getMask() {
        return this._mask;
    }

    EnumFeature(boolean z) {
        this._enabledByDefault = z;
    }
}
