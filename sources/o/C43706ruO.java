package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ruO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43706ruO extends C43280rmM {
    public java.lang.String KWHzl;
    public final java.util.HashMap<java.lang.String, java.lang.String> copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43706ruO(@NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map) {
        super(null, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.KWHzl = str;
        this.copydefault = map;
    }

    @Override // o.C43280rmM
    public OkHttpClient.Builder initClientBuilder() {
        OkHttpClient.Builder builderInitClientBuilder = super.initClientBuilder();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.KWHzl)) {
            builderInitClientBuilder.addInterceptor(new C43710ruS(this.KWHzl, this.copydefault));
        }
        return builderInitClientBuilder;
    }
}
