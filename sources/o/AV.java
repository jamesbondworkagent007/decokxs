package o;

import aws.smithy.kotlin.runtime.http.engine.okhttp.OkHttpDns$lookup$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import okhttp3.Dns;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AV implements Dns {
    public final DE EZpvd;

    public AV(@NotNull DE de) {
        Intrinsics.checkNotNullParameter(de, "");
        this.EZpvd = de;
    }

    @Override // okhttp3.Dns
    public java.util.List<java.net.InetAddress> lookup(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (java.util.List) BuildersKt__BuildersKt.runBlocking$default(null, new OkHttpDns$lookup$1(this, str, null), 1, null);
    }
}
