package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tXw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46533tXw extends C43280rmM {
    public final java.util.List<Interceptor> AEQbTJ;
    public final java.util.List<Interceptor> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends okhttp3.Interceptor> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C46533tXw(@NotNull java.util.List<? extends Interceptor> list) {
        super(null, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
        this.EZpvd = list;
    }

    @Override // o.C43280rmM
    public OkHttpClient.Builder initClientBuilder() {
        OkHttpClient.Builder builderInitClientBuilder = super.initClientBuilder();
        java.util.Iterator<Interceptor> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            builderInitClientBuilder.addInterceptor(it.next());
        }
        return builderInitClientBuilder;
    }
}
