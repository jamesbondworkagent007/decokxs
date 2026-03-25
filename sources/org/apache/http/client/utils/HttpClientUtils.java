package org.apache.http.client.utils;

import java.io.Closeable;
import java.io.IOException;
import o.C59855zos;
import o.InterfaceC59576zje;
import o.InterfaceC59584zjm;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;

/* JADX INFO: loaded from: classes24.dex */
public class HttpClientUtils {
    private HttpClientUtils() {
    }

    public static void closeQuietly(InterfaceC59584zjm interfaceC59584zjm) {
        InterfaceC59576zje interfaceC59576zjeEZpvd;
        if (interfaceC59584zjm == null || (interfaceC59576zjeEZpvd = interfaceC59584zjm.EZpvd()) == null) {
            return;
        }
        try {
            C59855zos.KWHzl(interfaceC59576zjeEZpvd);
        } catch (IOException unused) {
        }
    }

    public static void closeQuietly(CloseableHttpResponse closeableHttpResponse) {
        try {
            if (closeableHttpResponse != null) {
                try {
                    C59855zos.KWHzl(closeableHttpResponse.EZpvd());
                    closeableHttpResponse.close();
                } catch (Throwable th) {
                    closeableHttpResponse.close();
                    throw th;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static void closeQuietly(HttpClient httpClient) {
        if (httpClient == null || !(httpClient instanceof Closeable)) {
            return;
        }
        try {
            ((Closeable) httpClient).close();
        } catch (IOException unused) {
        }
    }
}
