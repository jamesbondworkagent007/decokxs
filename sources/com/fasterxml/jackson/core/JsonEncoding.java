package com.fasterxml.jackson.core;

import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes21.dex */
public enum JsonEncoding {
    UTF8(C.UTF8_NAME, false, 8),
    UTF16_BE("UTF-16BE", true, 16),
    UTF16_LE(C.UTF16LE_NAME, false, 16),
    UTF32_BE("UTF-32BE", true, 32),
    UTF32_LE("UTF-32LE", false, 32);

    private final boolean _bigEndian;
    private final int _bits;
    private final String _javaName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int bits() {
        return this._bits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getJavaName() {
        return this._javaName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isBigEndian() {
        return this._bigEndian;
    }

    JsonEncoding(String str, boolean z, int i) {
        this._javaName = str;
        this._bigEndian = z;
        this._bits = i;
    }
}
