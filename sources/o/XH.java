package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* JADX INFO: loaded from: classes21.dex */
public abstract class XH implements XB {
    public final TypeFactory KWHzl;
    public final JavaType OLrzqt;

    @Override // o.XB
    public java.lang.String AEQbTJ() {
        return null;
    }

    @Override // o.XB
    public void AEQbTJ(JavaType javaType) {
    }

    public XH() {
        this(null, null);
    }

    public XH(JavaType javaType, TypeFactory typeFactory) {
        this.OLrzqt = javaType;
        this.KWHzl = typeFactory;
    }

    @Override // o.XB
    public java.lang.String EZpvd() {
        return KWHzl((java.lang.Object) null, this.OLrzqt.getRawClass());
    }

    @Override // o.XB
    public JavaType KWHzl(VA va, java.lang.String str) throws java.io.IOException {
        throw new java.lang.IllegalStateException("Sub-class " + getClass().getName() + " MUST implement `typeFromId(DatabindContext,String)");
    }
}
