package com.bytedance.applog.network;

import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface INetworkClientV2 {

    public enum RequestMethod {
        METHOD_GET,
        METHOD_POST
    }

    public enum RequestType {
        REQUEST_AB,
        REQUEST_FINDER,
        REQUEST_TRACER
    }

    byte[] execute(RequestMethod requestMethod, URL url, byte[] bArr, Map<String, String> map, Map<String, Object> map2);
}
