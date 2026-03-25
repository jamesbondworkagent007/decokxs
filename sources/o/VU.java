package o;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/* JADX INFO: loaded from: classes21.dex */
public abstract class VU {
    public JsonFormat.Value _format;
    public JsonIgnoreProperties.Value _ignorals;
    public JsonInclude.Value _include;
    public JsonInclude.Value _includeAsProperty;
    public java.lang.Boolean _isIgnoredType;
    public java.lang.Boolean _mergeable;
    public JsonSetter.Value _setterInfo;
    public JsonAutoDetect.Value _visibility;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JsonFormat.Value getFormat() {
        return this._format;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JsonIgnoreProperties.Value getIgnorals() {
        return this._ignorals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JsonInclude.Value getInclude() {
        return this._include;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JsonInclude.Value getIncludeAsProperty() {
        return this._includeAsProperty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Boolean getIsIgnoredType() {
        return this._isIgnoredType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Boolean getMergeable() {
        return this._mergeable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JsonSetter.Value getSetterInfo() {
        return this._setterInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JsonAutoDetect.Value getVisibility() {
        return this._visibility;
    }

    public VU() {
    }

    public VU(VU vu) {
        this._format = vu._format;
        this._include = vu._include;
        this._includeAsProperty = vu._includeAsProperty;
        this._ignorals = vu._ignorals;
        this._setterInfo = vu._setterInfo;
        this._visibility = vu._visibility;
        this._isIgnoredType = vu._isIgnoredType;
        this._mergeable = vu._mergeable;
    }

    public static VU empty() {
        return StateListAnimator.copydefault;
    }

    public static final class StateListAnimator extends VU {
        public static final StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
        }
    }
}
