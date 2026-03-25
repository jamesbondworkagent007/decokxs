package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;

/* JADX INFO: renamed from: o.Yg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5608Yg extends VD<java.lang.Object> implements XT {
    public final VD<java.lang.Object> AEQbTJ;
    public final AbstractC5601Xz copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC5601Xz copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.VD
    public java.lang.Class<java.lang.Object> handledType() {
        return java.lang.Object.class;
    }

    public C5608Yg(AbstractC5601Xz abstractC5601Xz, VD<?> vd) {
        this.copydefault = abstractC5601Xz;
        this.AEQbTJ = vd;
    }

    @Override // o.VD
    public void serialize(java.lang.Object obj, JsonGenerator jsonGenerator, VI vi) throws java.io.IOException {
        this.AEQbTJ.serializeWithType(obj, jsonGenerator, vi, this.copydefault);
    }

    @Override // o.VD
    public void serializeWithType(java.lang.Object obj, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws java.io.IOException {
        this.AEQbTJ.serializeWithType(obj, jsonGenerator, vi, abstractC5601Xz);
    }

    @Override // o.XT
    public VD<?> createContextual(VI vi, BeanProperty beanProperty) throws JsonMappingException {
        VD<?> vdHandleSecondaryContextualization = this.AEQbTJ;
        if (vdHandleSecondaryContextualization instanceof XT) {
            vdHandleSecondaryContextualization = vi.handleSecondaryContextualization(vdHandleSecondaryContextualization, beanProperty);
        }
        return vdHandleSecondaryContextualization == this.AEQbTJ ? this : new C5608Yg(this.copydefault, vdHandleSecondaryContextualization);
    }
}
