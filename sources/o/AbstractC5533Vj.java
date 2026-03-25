package o;

import java.lang.reflect.ParameterizedType;

/* JADX INFO: renamed from: o.Vj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5533Vj<T> implements java.lang.Comparable<AbstractC5533Vj<T>> {
    public final java.lang.reflect.Type OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.reflect.Type AEQbTJ() {
        return this.OLrzqt;
    }

    public AbstractC5533Vj() {
        java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof java.lang.Class) {
            throw new java.lang.IllegalArgumentException("Internal error: TypeReference constructed without actual type information");
        }
        this.OLrzqt = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
