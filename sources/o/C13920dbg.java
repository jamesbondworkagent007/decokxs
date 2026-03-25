package o;

import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: o.dbg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13920dbg extends C43280rmM {
    public static final C13920dbg EZpvd = new C13920dbg();

    private C13920dbg() {
        super(null, 1, null);
    }

    @Override // o.C43280rmM
    public OkHttpClient.Builder initClientBuilder() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(new mNR());
        return builder;
    }
}
