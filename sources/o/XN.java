package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;

/* JADX INFO: loaded from: classes21.dex */
public class XN {
    public VD<java.lang.Object> AEQbTJ;
    public MapSerializer KWHzl;
    public final BeanProperty OLrzqt;
    public final AnnotatedMember copydefault;

    public XN(BeanProperty beanProperty, AnnotatedMember annotatedMember, VD<?> vd) {
        this.copydefault = annotatedMember;
        this.OLrzqt = beanProperty;
        this.AEQbTJ = vd;
        if (vd instanceof MapSerializer) {
            this.KWHzl = (MapSerializer) vd;
        }
    }

    public void OLrzqt(SerializationConfig serializationConfig) {
        this.copydefault.fixAccess(serializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public void copydefault(java.lang.Object obj, JsonGenerator jsonGenerator, VI vi) throws java.lang.Exception {
        java.lang.Object value = this.copydefault.getValue(obj);
        if (value == null) {
            return;
        }
        if (!(value instanceof java.util.Map)) {
            vi.reportBadDefinition(this.OLrzqt.getType(), java.lang.String.format("Value returned by 'any-getter' %s() not java.util.Map but %s", this.copydefault.getName(), value.getClass().getName()));
        }
        MapSerializer mapSerializer = this.KWHzl;
        if (mapSerializer != null) {
            mapSerializer.serializeWithoutTypeInfo((java.util.Map) value, jsonGenerator, vi);
        } else {
            this.AEQbTJ.serialize(value, jsonGenerator, vi);
        }
    }

    public void copydefault(java.lang.Object obj, JsonGenerator jsonGenerator, VI vi, XX xx) throws java.lang.Exception {
        java.lang.Object value = this.copydefault.getValue(obj);
        if (value == null) {
            return;
        }
        if (!(value instanceof java.util.Map)) {
            vi.reportBadDefinition(this.OLrzqt.getType(), java.lang.String.format("Value returned by 'any-getter' (%s()) not java.util.Map but %s", this.copydefault.getName(), value.getClass().getName()));
        }
        MapSerializer mapSerializer = this.KWHzl;
        if (mapSerializer != null) {
            mapSerializer.serializeFilteredAnyProperties(vi, jsonGenerator, obj, (java.util.Map) value, xx, null);
        } else {
            this.AEQbTJ.serialize(value, jsonGenerator, vi);
        }
    }

    public void OLrzqt(VI vi) throws JsonMappingException {
        VD<?> vd = this.AEQbTJ;
        if (vd instanceof XT) {
            VD<?> vdHandlePrimaryContextualization = vi.handlePrimaryContextualization(vd, this.OLrzqt);
            this.AEQbTJ = vdHandlePrimaryContextualization;
            if (vdHandlePrimaryContextualization instanceof MapSerializer) {
                this.KWHzl = (MapSerializer) vdHandlePrimaryContextualization;
            }
        }
    }
}
