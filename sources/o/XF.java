package o;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* JADX INFO: loaded from: classes21.dex */
public class XF extends C5600Xy {
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.XO, o.AbstractC5601Xz
    public java.lang.String EZpvd() {
        return this.EZpvd;
    }

    public XF(XB xb, BeanProperty beanProperty, java.lang.String str) {
        super(xb, beanProperty);
        this.EZpvd = str;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lcom/fasterxml/jackson/databind/BeanProperty;)Lo/Xy; */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lcom/fasterxml/jackson/databind/BeanProperty;)Lo/Xz; */
    @Override // o.C5600Xy, o.AbstractC5601Xz
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public XF OLrzqt(BeanProperty beanProperty) {
        return this.OLrzqt == beanProperty ? this : new XF(this.copydefault, beanProperty, this.EZpvd);
    }

    @Override // o.C5600Xy, o.AbstractC5601Xz
    public JsonTypeInfo.As AEQbTJ() {
        return JsonTypeInfo.As.PROPERTY;
    }
}
