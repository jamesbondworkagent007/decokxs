package o;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;

/* JADX INFO: renamed from: o.Xy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5600Xy extends XO {
    public C5600Xy(XB xb, BeanProperty beanProperty) {
        super(xb, beanProperty);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lcom/fasterxml/jackson/databind/BeanProperty;)Lo/Xz; */
    @Override // o.AbstractC5601Xz
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C5600Xy OLrzqt(BeanProperty beanProperty) {
        return this.OLrzqt == beanProperty ? this : new C5600Xy(this.copydefault, beanProperty);
    }

    @Override // o.AbstractC5601Xz
    public JsonTypeInfo.As AEQbTJ() {
        return JsonTypeInfo.As.WRAPPER_ARRAY;
    }
}
