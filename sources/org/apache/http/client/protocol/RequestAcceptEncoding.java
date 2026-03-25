package org.apache.http.client.protocol;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.util.List;
import o.InterfaceC59577zjf;
import o.InterfaceC59580zji;
import o.InterfaceC59838zob;
import org.apache.http.HttpException;
import org.apache.http.client.config.RequestConfig;

/* JADX INFO: loaded from: classes24.dex */
public class RequestAcceptEncoding implements InterfaceC59580zji {
    private final String acceptEncoding;

    public RequestAcceptEncoding(List<String> list) {
        String string;
        if (list == null || list.isEmpty()) {
            string = "gzip,deflate";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(list.get(i));
            }
            string = sb.toString();
        }
        this.acceptEncoding = string;
    }

    public RequestAcceptEncoding() {
        this(null);
    }

    @Override // o.InterfaceC59580zji
    public void process(InterfaceC59577zjf interfaceC59577zjf, InterfaceC59838zob interfaceC59838zob) throws HttpException, IOException {
        RequestConfig requestConfig = HttpClientContext.adapt(interfaceC59838zob).getRequestConfig();
        if (interfaceC59577zjf.containsHeader(HttpHeaders.ACCEPT_ENCODING) || !requestConfig.isContentCompressionEnabled()) {
            return;
        }
        interfaceC59577zjf.addHeader(HttpHeaders.ACCEPT_ENCODING, this.acceptEncoding);
    }
}
