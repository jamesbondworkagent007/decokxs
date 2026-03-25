package com.fasterxml.jackson.core;

import o.InterfaceC5540Vq;

/* JADX INFO: loaded from: classes21.dex */
public enum StreamReadCapability implements InterfaceC5540Vq {
    DUPLICATE_PROPERTIES(false),
    SCALARS_AS_OBJECTS(false),
    UNTYPED_SCALARS(false),
    EXACT_FLOATS(false);

    private final boolean _defaultState;
    private final int _mask = 1 << ordinal();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5540Vq
    public boolean enabledByDefault() {
        return this._defaultState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5540Vq
    public boolean enabledIn(int i) {
        return (i & this._mask) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5540Vq
    public int getMask() {
        return this._mask;
    }

    StreamReadCapability(boolean z) {
        this._defaultState = z;
    }
}
