package o;

import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zbA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59122zbA {
    public final java.io.InputStream EZpvd(@NotNull java.lang.String str) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.ClassLoader classLoader = C59122zbA.class.getClassLoader();
        if (classLoader == null) {
            return java.lang.ClassLoader.getSystemResourceAsStream(str);
        }
        java.net.URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        uRLConnectionOpenConnection.setUseCaches(false);
        return uRLConnectionOpenConnection.getInputStream();
    }
}
