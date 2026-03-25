package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerator;
import o.InterfaceC5498Ub;

/* JADX INFO: loaded from: classes21.dex */
public enum JsonWriteFeature implements InterfaceC5498Ub {
    QUOTE_FIELD_NAMES(true, JsonGenerator.Feature.QUOTE_FIELD_NAMES),
    WRITE_NAN_AS_STRINGS(true, JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS),
    WRITE_NUMBERS_AS_STRINGS(false, JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS),
    ESCAPE_NON_ASCII(false, JsonGenerator.Feature.ESCAPE_NON_ASCII),
    WRITE_HEX_UPPER_CASE(true, JsonGenerator.Feature.WRITE_HEX_UPPER_CASE);

    private final boolean _defaultState;
    private final JsonGenerator.Feature _mappedFeature;
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
    @Override // o.InterfaceC5498Ub, o.InterfaceC5540Vq
    public int getMask() {
        return this._mask;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JsonGenerator.Feature mappedFeature() {
        return this._mappedFeature;
    }

    public static int collectDefaults() {
        int mask = 0;
        for (JsonWriteFeature jsonWriteFeature : values()) {
            if (jsonWriteFeature.enabledByDefault()) {
                mask |= jsonWriteFeature.getMask();
            }
        }
        return mask;
    }

    JsonWriteFeature(boolean z, JsonGenerator.Feature feature) {
        this._defaultState = z;
        this._mappedFeature = feature;
    }
}
