package o;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;

/* JADX INFO: loaded from: classes21.dex */
public class XA extends XO {
    public static final XA AEQbTJ = new XA();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static XA KWHzl() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lcom/fasterxml/jackson/databind/BeanProperty;)Lo/Xz; */
    @Override // o.AbstractC5601Xz
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public XA OLrzqt(BeanProperty beanProperty) {
        return this;
    }

    public XA() {
        super(null, null);
    }

    @Override // o.AbstractC5601Xz
    public JsonTypeInfo.As AEQbTJ() {
        return JsonTypeInfo.As.EXISTING_PROPERTY;
    }

    @Override // o.XO, o.AbstractC5601Xz
    public WritableTypeId AEQbTJ(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws java.io.IOException {
        if (!writableTypeId.gEmmrt.isStructStart() || jsonGenerator.AYXKKw()) {
            return null;
        }
        return jsonGenerator.EZpvd(writableTypeId);
    }

    @Override // o.XO, o.AbstractC5601Xz
    public WritableTypeId copydefault(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws java.io.IOException {
        if (writableTypeId == null) {
            return null;
        }
        return jsonGenerator.copydefault(writableTypeId);
    }
}
