package o;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;

/* JADX INFO: renamed from: o.Xz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5601Xz {
    public abstract JsonTypeInfo.As AEQbTJ();

    public abstract WritableTypeId AEQbTJ(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws java.io.IOException;

    public abstract java.lang.String EZpvd();

    public abstract AbstractC5601Xz OLrzqt(BeanProperty beanProperty);

    public abstract WritableTypeId copydefault(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws java.io.IOException;

    /* JADX INFO: renamed from: o.Xz$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[JsonTypeInfo.As.values().length];
            copydefault = iArr;
            try {
                iArr[JsonTypeInfo.As.EXISTING_PROPERTY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                copydefault[JsonTypeInfo.As.EXTERNAL_PROPERTY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                copydefault[JsonTypeInfo.As.PROPERTY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                copydefault[JsonTypeInfo.As.WRAPPER_ARRAY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                copydefault[JsonTypeInfo.As.WRAPPER_OBJECT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public WritableTypeId AEQbTJ(java.lang.Object obj, com.fasterxml.jackson.core.JsonToken jsonToken) {
        WritableTypeId writableTypeId = new WritableTypeId(obj, jsonToken);
        int i = AnonymousClass1.copydefault[AEQbTJ().ordinal()];
        if (i == 1) {
            writableTypeId.KWHzl = WritableTypeId.Inclusion.PAYLOAD_PROPERTY;
            writableTypeId.copydefault = EZpvd();
        } else if (i == 2) {
            writableTypeId.KWHzl = WritableTypeId.Inclusion.PARENT_PROPERTY;
            writableTypeId.copydefault = EZpvd();
        } else if (i == 3) {
            writableTypeId.KWHzl = WritableTypeId.Inclusion.METADATA_PROPERTY;
            writableTypeId.copydefault = EZpvd();
        } else if (i == 4) {
            writableTypeId.KWHzl = WritableTypeId.Inclusion.WRAPPER_ARRAY;
        } else if (i == 5) {
            writableTypeId.KWHzl = WritableTypeId.Inclusion.WRAPPER_OBJECT;
        } else {
            C5546Vw.OLrzqt();
        }
        return writableTypeId;
    }

    public WritableTypeId OLrzqt(java.lang.Object obj, com.fasterxml.jackson.core.JsonToken jsonToken, java.lang.Object obj2) {
        WritableTypeId writableTypeIdAEQbTJ = AEQbTJ(obj, jsonToken);
        writableTypeIdAEQbTJ.EZpvd = obj2;
        return writableTypeIdAEQbTJ;
    }

    public WritableTypeId copydefault(java.lang.Object obj, java.lang.Class<?> cls, com.fasterxml.jackson.core.JsonToken jsonToken) {
        WritableTypeId writableTypeIdAEQbTJ = AEQbTJ(obj, jsonToken);
        writableTypeIdAEQbTJ.AEQbTJ = cls;
        return writableTypeIdAEQbTJ;
    }
}
