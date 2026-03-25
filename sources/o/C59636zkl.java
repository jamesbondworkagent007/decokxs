package o;

import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpHost;

/* JADX INFO: renamed from: o.zkl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public final class C59636zkl {
    public final ConcurrentHashMap<java.lang.String, C59635zkk> KWHzl = new ConcurrentHashMap<>();

    public final C59635zkk AEQbTJ(java.lang.String str) {
        C59635zkk c59635zkkEZpvd = EZpvd(str);
        if (c59635zkkEZpvd != null) {
            return c59635zkkEZpvd;
        }
        throw new java.lang.IllegalStateException("Scheme '" + str + "' not registered.");
    }

    public final C59635zkk EZpvd(HttpHost httpHost) {
        C59851zoo.AEQbTJ(httpHost, "Host");
        return AEQbTJ(httpHost.getSchemeName());
    }

    public final C59635zkk EZpvd(java.lang.String str) {
        C59851zoo.AEQbTJ(str, "Scheme name");
        return this.KWHzl.get(str);
    }

    public final C59635zkk EZpvd(C59635zkk c59635zkk) {
        C59851zoo.AEQbTJ(c59635zkk, "Scheme");
        return this.KWHzl.put(c59635zkk.copydefault(), c59635zkk);
    }
}
