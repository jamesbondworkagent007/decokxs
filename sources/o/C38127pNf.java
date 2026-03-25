package o;

import com.google.gson.Gson;
import com.okinc.lifecycle.impl.di.LifecycleModule;

/* JADX INFO: renamed from: o.pNf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38127pNf implements InterfaceC58162ywA<Gson> {
    public final LifecycleModule copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Gson get() {
        return copydefault(this.copydefault);
    }

    public static Gson copydefault(LifecycleModule lifecycleModule) {
        return (Gson) C58165ywD.KWHzl(lifecycleModule.copydefault());
    }
}
