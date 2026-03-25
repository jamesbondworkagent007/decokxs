package o;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes21.dex */
public abstract class WM {
    @java.lang.Deprecated
    public abstract java.lang.Iterable<java.lang.annotation.Annotation> annotations();

    public abstract boolean equals(java.lang.Object obj);

    public abstract java.lang.reflect.AnnotatedElement getAnnotated();

    public abstract <A extends java.lang.annotation.Annotation> A getAnnotation(java.lang.Class<A> cls);

    public abstract int getModifiers();

    public abstract java.lang.String getName();

    public abstract java.lang.Class<?> getRawType();

    public abstract JavaType getType();

    public abstract boolean hasAnnotation(java.lang.Class<?> cls);

    public abstract boolean hasOneOf(java.lang.Class<? extends java.lang.annotation.Annotation>[] clsArr);

    public abstract int hashCode();

    public abstract java.lang.String toString();

    public boolean isPublic() {
        return Modifier.isPublic(getModifiers());
    }
}
