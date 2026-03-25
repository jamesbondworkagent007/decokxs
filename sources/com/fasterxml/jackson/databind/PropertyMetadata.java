package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class PropertyMetadata implements Serializable {
    private static final long serialVersionUID = -1;
    protected Nulls _contentNulls;
    protected final String _defaultValue;
    protected final String _description;
    protected final Integer _index;
    protected final transient StateListAnimator _mergeInfo;
    protected final Boolean _required;
    protected Nulls _valueNulls;
    public static final PropertyMetadata STD_REQUIRED = new PropertyMetadata(Boolean.TRUE, null, null, null, null, null, null);
    public static final PropertyMetadata STD_OPTIONAL = new PropertyMetadata(Boolean.FALSE, null, null, null, null, null, null);
    public static final PropertyMetadata STD_REQUIRED_OR_OPTIONAL = new PropertyMetadata(null, null, null, null, null, null, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Nulls getContentNulls() {
        return this._contentNulls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDefaultValue() {
        return this._defaultValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getDescription() {
        return this._description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Integer getIndex() {
        return this._index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StateListAnimator getMergeInfo() {
        return this._mergeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Boolean getRequired() {
        return this._required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Nulls getValueNulls() {
        return this._valueNulls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean hasDefaultValue() {
        return this._defaultValue != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean hasIndex() {
        return this._index != null;
    }

    public static final class StateListAnimator {
        public final boolean AEQbTJ;
        public final AnnotatedMember EZpvd;

        public StateListAnimator(AnnotatedMember annotatedMember, boolean z) {
            this.EZpvd = annotatedMember;
            this.AEQbTJ = z;
        }

        public static StateListAnimator AEQbTJ(AnnotatedMember annotatedMember) {
            return new StateListAnimator(annotatedMember, true);
        }

        public static StateListAnimator KWHzl(AnnotatedMember annotatedMember) {
            return new StateListAnimator(annotatedMember, false);
        }

        public static StateListAnimator OLrzqt(AnnotatedMember annotatedMember) {
            return new StateListAnimator(annotatedMember, false);
        }
    }

    public PropertyMetadata(Boolean bool, String str, Integer num, String str2, StateListAnimator stateListAnimator, Nulls nulls, Nulls nulls2) {
        this._required = bool;
        this._description = str;
        this._index = num;
        this._defaultValue = (str2 == null || str2.isEmpty()) ? null : str2;
        this._mergeInfo = stateListAnimator;
        this._valueNulls = nulls;
        this._contentNulls = nulls2;
    }

    public static PropertyMetadata construct(Boolean bool, String str, Integer num, String str2) {
        if (str == null && num == null && str2 == null) {
            return bool == null ? STD_REQUIRED_OR_OPTIONAL : bool.booleanValue() ? STD_REQUIRED : STD_OPTIONAL;
        }
        return new PropertyMetadata(bool, str, num, str2, null, null, null);
    }

    @Deprecated
    public static PropertyMetadata construct(boolean z, String str, Integer num, String str2) {
        if (str == null && num == null && str2 == null) {
            return z ? STD_REQUIRED : STD_OPTIONAL;
        }
        return new PropertyMetadata(Boolean.valueOf(z), str, num, str2, null, null, null);
    }

    public Object readResolve() {
        if (this._description != null || this._index != null || this._defaultValue != null || this._mergeInfo != null || this._valueNulls != null || this._contentNulls != null) {
            return this;
        }
        Boolean bool = this._required;
        return bool == null ? STD_REQUIRED_OR_OPTIONAL : bool.booleanValue() ? STD_REQUIRED : STD_OPTIONAL;
    }

    public PropertyMetadata withDescription(String str) {
        return new PropertyMetadata(this._required, str, this._index, this._defaultValue, this._mergeInfo, this._valueNulls, this._contentNulls);
    }

    public PropertyMetadata withMergeInfo(StateListAnimator stateListAnimator) {
        return new PropertyMetadata(this._required, this._description, this._index, this._defaultValue, stateListAnimator, this._valueNulls, this._contentNulls);
    }

    public PropertyMetadata withNulls(Nulls nulls, Nulls nulls2) {
        return new PropertyMetadata(this._required, this._description, this._index, this._defaultValue, this._mergeInfo, nulls, nulls2);
    }

    public PropertyMetadata withDefaultValue(String str) {
        if (str == null || str.isEmpty()) {
            if (this._defaultValue == null) {
                return this;
            }
            str = null;
        } else if (str.equals(this._defaultValue)) {
            return this;
        }
        return new PropertyMetadata(this._required, this._description, this._index, str, this._mergeInfo, this._valueNulls, this._contentNulls);
    }

    public PropertyMetadata withIndex(Integer num) {
        return new PropertyMetadata(this._required, this._description, num, this._defaultValue, this._mergeInfo, this._valueNulls, this._contentNulls);
    }

    public PropertyMetadata withRequired(Boolean bool) {
        Boolean bool2 = this._required;
        if (bool == null) {
            if (bool2 == null) {
                return this;
            }
        } else if (bool.equals(bool2)) {
            return this;
        }
        return new PropertyMetadata(bool, this._description, this._index, this._defaultValue, this._mergeInfo, this._valueNulls, this._contentNulls);
    }

    public boolean isRequired() {
        Boolean bool = this._required;
        return bool != null && bool.booleanValue();
    }
}
