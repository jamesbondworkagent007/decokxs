package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;

/* JADX INFO: loaded from: classes21.dex */
public abstract class XO extends AbstractC5601Xz {
    public final BeanProperty OLrzqt;
    public final XB copydefault;

    public void AEQbTJ(java.lang.Object obj) {
    }

    @Override // o.AbstractC5601Xz
    public java.lang.String EZpvd() {
        return null;
    }

    public XO(XB xb, BeanProperty beanProperty) {
        this.copydefault = xb;
        this.OLrzqt = beanProperty;
    }

    @Override // o.AbstractC5601Xz
    public WritableTypeId AEQbTJ(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws java.io.IOException {
        copydefault(writableTypeId);
        if (writableTypeId.EZpvd == null) {
            return null;
        }
        return jsonGenerator.EZpvd(writableTypeId);
    }

    @Override // o.AbstractC5601Xz
    public WritableTypeId copydefault(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws java.io.IOException {
        if (writableTypeId == null) {
            return null;
        }
        return jsonGenerator.copydefault(writableTypeId);
    }

    public void copydefault(WritableTypeId writableTypeId) {
        java.lang.String strOLrzqt;
        if (writableTypeId.EZpvd == null) {
            java.lang.Object obj = writableTypeId.OLrzqt;
            java.lang.Class<?> cls = writableTypeId.AEQbTJ;
            if (cls == null) {
                strOLrzqt = KWHzl(obj);
            } else {
                strOLrzqt = OLrzqt(obj, cls);
            }
            writableTypeId.EZpvd = strOLrzqt;
        }
    }

    public java.lang.String KWHzl(java.lang.Object obj) {
        java.lang.String strOLrzqt = this.copydefault.OLrzqt(obj);
        if (strOLrzqt == null) {
            AEQbTJ(obj);
        }
        return strOLrzqt;
    }

    public java.lang.String OLrzqt(java.lang.Object obj, java.lang.Class<?> cls) {
        java.lang.String strKWHzl = this.copydefault.KWHzl(obj, cls);
        if (strKWHzl == null) {
            AEQbTJ(obj);
        }
        return strKWHzl;
    }
}
