package o;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* JADX INFO: loaded from: classes21.dex */
public class XE extends XO {
    public XE(XB xb, BeanProperty beanProperty) {
        super(xb, beanProperty);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lcom/fasterxml/jackson/databind/BeanProperty;)Lo/Xz; */
    @Override // o.AbstractC5601Xz
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public XE OLrzqt(BeanProperty beanProperty) {
        return this.OLrzqt == beanProperty ? this : new XE(this.copydefault, beanProperty);
    }

    @Override // o.AbstractC5601Xz
    public JsonTypeInfo.As AEQbTJ() {
        return JsonTypeInfo.As.WRAPPER_OBJECT;
    }
}
