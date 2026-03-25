package o;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* JADX INFO: loaded from: classes21.dex */
public class XG extends XF {
    public XG(XB xb, BeanProperty beanProperty, java.lang.String str) {
        super(xb, beanProperty, str);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lcom/fasterxml/jackson/databind/BeanProperty;)Lo/Xy; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lcom/fasterxml/jackson/databind/BeanProperty;)Lo/XF; */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lcom/fasterxml/jackson/databind/BeanProperty;)Lo/Xz; */
    @Override // o.XF, o.C5600Xy, o.AbstractC5601Xz
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public XG OLrzqt(BeanProperty beanProperty) {
        return this.OLrzqt == beanProperty ? this : new XG(this.copydefault, beanProperty, this.EZpvd);
    }

    @Override // o.XF, o.C5600Xy, o.AbstractC5601Xz
    public JsonTypeInfo.As AEQbTJ() {
        return JsonTypeInfo.As.EXISTING_PROPERTY;
    }
}
