package o;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* JADX INFO: renamed from: o.Xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC5580Xe {
    JavaType copydefault(java.lang.reflect.Type type);

    /* JADX INFO: renamed from: o.Xe$Application */
    public static class Application implements InterfaceC5580Xe {
        public final TypeFactory AEQbTJ;
        public final TypeBindings EZpvd;

        public Application(TypeFactory typeFactory, TypeBindings typeBindings) {
            this.AEQbTJ = typeFactory;
            this.EZpvd = typeBindings;
        }

        @Override // o.InterfaceC5580Xe
        public JavaType copydefault(java.lang.reflect.Type type) {
            return this.AEQbTJ.resolveMemberType(type, this.EZpvd);
        }
    }
}
