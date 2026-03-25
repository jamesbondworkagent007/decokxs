package o;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* JADX INFO: loaded from: classes21.dex */
public class XC extends XO {
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.XO, o.AbstractC5601Xz
    public java.lang.String EZpvd() {
        return this.EZpvd;
    }

    public XC(XB xb, BeanProperty beanProperty, java.lang.String str) {
        super(xb, beanProperty);
        this.EZpvd = str;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lcom/fasterxml/jackson/databind/BeanProperty;)Lo/Xz; */
    @Override // o.AbstractC5601Xz
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public XC OLrzqt(BeanProperty beanProperty) {
        return this.OLrzqt == beanProperty ? this : new XC(this.copydefault, beanProperty, this.EZpvd);
    }

    @Override // o.AbstractC5601Xz
    public JsonTypeInfo.As AEQbTJ() {
        return JsonTypeInfo.As.EXTERNAL_PROPERTY;
    }
}
