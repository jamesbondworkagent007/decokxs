package o;

import kotlin.text.StringsKt__StringsKt;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: o.sIg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44234sIg extends C43280rmM {
    public C44234sIg() {
        super(null, 1, 0 == true ? 1 : 0);
    }

    @Override // o.C43280rmM
    public java.util.List<Interceptor> buildPreCustomInterceptors() {
        return C56402yEa.EZpvd(new C44230sIc());
    }

    @Override // o.C43280rmM
    public OkHttpClient.Builder initClientBuilder() {
        OkHttpClient.Builder builderInitClientBuilder = super.initClientBuilder();
        java.lang.String strAEQbTJ = sFM.copydefault.AEQbTJ();
        if (!C44157sFk.gEmmrt().values() && strAEQbTJ != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)) {
            C44124sEe.imLogTokenOperation$default("Non-login token exists...", null, 2, null);
            builderInitClientBuilder.addInterceptor(new C44235sIh(strAEQbTJ));
        }
        return builderInitClientBuilder;
    }
}
