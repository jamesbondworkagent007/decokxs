package com.fasterxml.jackson.databind.json;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.json.JsonWriteFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import o.VV;
import o.VZ;

/* JADX INFO: loaded from: classes21.dex */
public class JsonMapper extends ObjectMapper {
    private static final long serialVersionUID = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.ObjectMapper, o.AbstractC5505Ui
    public JsonFactory getFactory() {
        return this._jsonFactory;
    }

    public static class StateListAnimator extends VZ<JsonMapper, StateListAnimator> {
        public StateListAnimator(JsonMapper jsonMapper) {
            super(jsonMapper);
        }
    }

    public JsonMapper() {
        this(new JsonFactory());
    }

    public JsonMapper(JsonFactory jsonFactory) {
        super(jsonFactory);
    }

    public JsonMapper(JsonMapper jsonMapper) {
        super(jsonMapper);
    }

    /* JADX DEBUG: Method merged with bridge method: copy()Lcom/fasterxml/jackson/databind/ObjectMapper; */
    @Override // com.fasterxml.jackson.databind.ObjectMapper
    public JsonMapper copy() {
        _checkInvalidCopy(JsonMapper.class);
        return new JsonMapper(this);
    }

    public static StateListAnimator builder() {
        return new StateListAnimator(new JsonMapper());
    }

    public static StateListAnimator builder(JsonFactory jsonFactory) {
        return new StateListAnimator(new JsonMapper(jsonFactory));
    }

    public StateListAnimator rebuild() {
        return new StateListAnimator(copy());
    }

    @Override // com.fasterxml.jackson.databind.ObjectMapper, o.AbstractC5505Ui
    public Version version() {
        return VV.KWHzl;
    }

    public boolean isEnabled(JsonReadFeature jsonReadFeature) {
        return isEnabled(jsonReadFeature.mappedFeature());
    }

    public boolean isEnabled(JsonWriteFeature jsonWriteFeature) {
        return isEnabled(jsonWriteFeature.mappedFeature());
    }
}
