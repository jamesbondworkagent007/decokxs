package o;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;

/* JADX INFO: renamed from: o.Wr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5567Wr {
    public final java.util.List<SettableBeanProperty> copydefault;

    public C5567Wr() {
        this.copydefault = new java.util.ArrayList();
    }

    public C5567Wr(java.util.List<SettableBeanProperty> list) {
        this.copydefault = list;
    }

    public void AEQbTJ(SettableBeanProperty settableBeanProperty) {
        this.copydefault.add(settableBeanProperty);
    }

    public C5567Wr OLrzqt(NameTransformer nameTransformer) {
        AbstractC5548Vy<java.lang.Object> abstractC5548VyUnwrappingDeserializer;
        java.util.ArrayList arrayList = new java.util.ArrayList(this.copydefault.size());
        for (SettableBeanProperty settableBeanProperty : this.copydefault) {
            SettableBeanProperty settableBeanPropertyWithSimpleName = settableBeanProperty.withSimpleName(nameTransformer.transform(settableBeanProperty.getName()));
            AbstractC5548Vy<java.lang.Object> valueDeserializer = settableBeanPropertyWithSimpleName.getValueDeserializer();
            if (valueDeserializer != null && (abstractC5548VyUnwrappingDeserializer = valueDeserializer.unwrappingDeserializer(nameTransformer)) != valueDeserializer) {
                settableBeanPropertyWithSimpleName = settableBeanPropertyWithSimpleName.withValueDeserializer(abstractC5548VyUnwrappingDeserializer);
            }
            arrayList.add(settableBeanPropertyWithSimpleName);
        }
        return new C5567Wr(arrayList);
    }

    public java.lang.Object KWHzl(JsonParser jsonParser, DeserializationContext deserializationContext, java.lang.Object obj, YA ya) throws java.io.IOException {
        int size = this.copydefault.size();
        for (int i = 0; i < size; i++) {
            SettableBeanProperty settableBeanProperty = this.copydefault.get(i);
            JsonParser jsonParserFIwbmz = ya.fIwbmz();
            jsonParserFIwbmz.RcXXUw();
            settableBeanProperty.deserializeAndSet(jsonParserFIwbmz, deserializationContext, obj);
        }
        return obj;
    }
}
