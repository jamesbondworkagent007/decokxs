package o;

import com.okinc.liveness.lca.EopTrackEvent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import org.apache.http.client.methods.CloseableHttpResponse;

/* JADX INFO: renamed from: o.zlz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public class C59703zlz implements InvocationHandler {
    public static final java.lang.reflect.Constructor<?> copydefault;
    public final InterfaceC59584zjm KWHzl;

    static {
        try {
            copydefault = java.lang.reflect.Proxy.getProxyClass(C59703zlz.class.getClassLoader(), CloseableHttpResponse.class).getConstructor(InvocationHandler.class);
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public C59703zlz(InterfaceC59584zjm interfaceC59584zjm) {
        this.KWHzl = interfaceC59584zjm;
    }

    public void AEQbTJ() throws java.io.IOException {
        C59855zos.KWHzl(this.KWHzl.EZpvd());
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
        if (method.getName().equals(EopTrackEvent.CLOSE)) {
            AEQbTJ();
            return null;
        }
        try {
            return method.invoke(this.KWHzl, objArr);
        } catch (InvocationTargetException e) {
            java.lang.Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
            throw e;
        }
    }

    public static CloseableHttpResponse AEQbTJ(InterfaceC59584zjm interfaceC59584zjm) {
        try {
            return (CloseableHttpResponse) copydefault.newInstance(new C59703zlz(interfaceC59584zjm));
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.IllegalStateException(e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.IllegalStateException(e2);
        } catch (InvocationTargetException e3) {
            throw new java.lang.IllegalStateException(e3);
        }
    }
}
