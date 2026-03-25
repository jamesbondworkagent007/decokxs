package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.JsonFactory;
import java.io.Serializable;
import o.C5546Vw;
import o.VT;

/* JADX INFO: loaded from: classes21.dex */
public class DatatypeFeatures implements Serializable {
    protected static final int FEATURE_INDEX_ENUM = 0;
    protected static final int FEATURE_INDEX_JSON_NODE = 1;
    private static final long serialVersionUID = 1;
    private final int _enabledFor1;
    private final int _enabledFor2;
    private final int _explicitFor1;
    private final int _explicitFor2;

    public DatatypeFeatures(int i, int i2, int i3, int i4) {
        this._enabledFor1 = i;
        this._explicitFor1 = i2;
        this._enabledFor2 = i3;
        this._explicitFor2 = i4;
    }

    public static DatatypeFeatures defaultFeatures() {
        return ActionBar.copydefault();
    }

    private DatatypeFeatures _with(int i, int i2, int i3, int i4) {
        return (this._enabledFor1 == i && this._explicitFor1 == i2 && this._enabledFor2 == i3 && this._explicitFor2 == i4) ? this : new DatatypeFeatures(i, i2, i3, i4);
    }

    public DatatypeFeatures with(VT vt) {
        int mask = vt.getMask();
        int iFeatureIndex = vt.featureIndex();
        if (iFeatureIndex == 0) {
            int i = this._enabledFor1;
            return _with(i | mask, mask | this._explicitFor1, this._enabledFor2, this._explicitFor2);
        }
        if (iFeatureIndex == 1) {
            return _with(this._enabledFor1, this._explicitFor1, this._enabledFor2 | mask, mask | this._explicitFor2);
        }
        C5546Vw.OLrzqt();
        return this;
    }

    public DatatypeFeatures withFeatures(VT... vtArr) {
        int i_calcMask = _calcMask(vtArr);
        if (i_calcMask == 0) {
            return this;
        }
        int iFeatureIndex = vtArr[0].featureIndex();
        if (iFeatureIndex == 0) {
            int i = this._enabledFor1;
            return _with(i | i_calcMask, i_calcMask | this._explicitFor1, this._enabledFor2, this._explicitFor2);
        }
        if (iFeatureIndex == 1) {
            return _with(this._enabledFor1, this._explicitFor1, this._enabledFor2 | i_calcMask, i_calcMask | this._explicitFor2);
        }
        C5546Vw.OLrzqt();
        return this;
    }

    public DatatypeFeatures without(VT vt) {
        int mask = vt.getMask();
        int iFeatureIndex = vt.featureIndex();
        if (iFeatureIndex == 0) {
            int i = this._enabledFor1;
            int i2 = this._explicitFor1;
            return _with(i & (~mask), mask | i2, this._enabledFor2, this._explicitFor2);
        }
        if (iFeatureIndex == 1) {
            return _with(this._enabledFor1, this._explicitFor1, this._enabledFor2 & (~mask), mask | this._explicitFor2);
        }
        C5546Vw.OLrzqt();
        return this;
    }

    public DatatypeFeatures withoutFeatures(VT... vtArr) {
        int i_calcMask = _calcMask(vtArr);
        if (i_calcMask == 0) {
            return this;
        }
        int iFeatureIndex = vtArr[0].featureIndex();
        if (iFeatureIndex == 0) {
            int i = this._enabledFor1;
            int i2 = this._explicitFor1;
            return _with(i & (~i_calcMask), i_calcMask | i2, this._enabledFor2, this._explicitFor2);
        }
        if (iFeatureIndex == 1) {
            return _with(this._enabledFor1, this._explicitFor1, this._enabledFor2 & (~i_calcMask), i_calcMask | this._explicitFor2);
        }
        C5546Vw.OLrzqt();
        return this;
    }

    private static final int _calcMask(VT... vtArr) {
        int mask = 0;
        for (VT vt : vtArr) {
            mask |= vt.getMask();
        }
        return mask;
    }

    public boolean isEnabled(VT vt) {
        int iFeatureIndex = vt.featureIndex();
        if (iFeatureIndex == 0) {
            return vt.enabledIn(this._enabledFor1);
        }
        if (iFeatureIndex == 1) {
            return vt.enabledIn(this._enabledFor2);
        }
        C5546Vw.OLrzqt();
        return false;
    }

    public boolean isExplicitlySet(VT vt) {
        int iFeatureIndex = vt.featureIndex();
        if (iFeatureIndex == 0) {
            return vt.enabledIn(this._explicitFor1);
        }
        if (iFeatureIndex == 1) {
            return vt.enabledIn(this._explicitFor2);
        }
        C5546Vw.OLrzqt();
        return false;
    }

    public Boolean getExplicitState(VT vt) {
        int iFeatureIndex = vt.featureIndex();
        if (iFeatureIndex == 0) {
            if (vt.enabledIn(this._explicitFor1)) {
                return Boolean.valueOf(vt.enabledIn(this._enabledFor1));
            }
            return null;
        }
        if (iFeatureIndex == 1) {
            if (vt.enabledIn(this._explicitFor2)) {
                return Boolean.valueOf(vt.enabledIn(this._enabledFor2));
            }
            return null;
        }
        C5546Vw.OLrzqt();
        return null;
    }

    public static class ActionBar {
        public static final DatatypeFeatures copydefault = new DatatypeFeatures(AEQbTJ(EnumFeature.values()), 0, AEQbTJ(JsonNodeFeature.values()), 0);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static DatatypeFeatures copydefault() {
            return copydefault;
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.fasterxml.jackson.core.JsonFactory$Feature */
        /* JADX WARN: Incorrect types in method signature: <F:Ljava/lang/Enum<TF;>;:Lo/Vq;>([TF;)I */
        /* JADX WARN: Multi-variable type inference failed */
        public static int AEQbTJ(Enum[] enumArr) {
            int mask = 0;
            for (JsonFactory.Feature feature : enumArr) {
                if (feature.enabledByDefault()) {
                    mask |= feature.getMask();
                }
            }
            return mask;
        }
    }
}
