package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.io.Serializable;
import o.VU;

/* JADX INFO: loaded from: classes21.dex */
public class MutableConfigOverride extends VU implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MutableConfigOverride setFormat(JsonFormat.Value value) {
        this._format = value;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MutableConfigOverride setIgnorals(JsonIgnoreProperties.Value value) {
        this._ignorals = value;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MutableConfigOverride setInclude(JsonInclude.Value value) {
        this._include = value;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MutableConfigOverride setIncludeAsProperty(JsonInclude.Value value) {
        this._includeAsProperty = value;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MutableConfigOverride setIsIgnoredType(Boolean bool) {
        this._isIgnoredType = bool;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MutableConfigOverride setMergeable(Boolean bool) {
        this._mergeable = bool;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MutableConfigOverride setSetterInfo(JsonSetter.Value value) {
        this._setterInfo = value;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MutableConfigOverride setVisibility(JsonAutoDetect.Value value) {
        this._visibility = value;
        return this;
    }

    public MutableConfigOverride() {
    }

    public MutableConfigOverride(MutableConfigOverride mutableConfigOverride) {
        super(mutableConfigOverride);
    }

    public MutableConfigOverride copy() {
        return new MutableConfigOverride(this);
    }
}
