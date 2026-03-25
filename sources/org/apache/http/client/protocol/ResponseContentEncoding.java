package org.apache.http.client.protocol;

import java.io.IOException;
import java.util.Locale;
import o.C59554zjI;
import o.InterfaceC59517ziY;
import o.InterfaceC59518ziZ;
import o.InterfaceC59548zjC;
import o.InterfaceC59576zje;
import o.InterfaceC59584zjm;
import o.InterfaceC59585zjn;
import o.InterfaceC59838zob;
import org.apache.http.HttpException;
import org.apache.http.client.entity.DecompressingEntity;
import org.apache.http.client.entity.DeflateInputStreamFactory;
import org.apache.http.client.entity.GZIPInputStreamFactory;
import org.apache.http.client.entity.InputStreamFactory;

/* JADX INFO: loaded from: classes24.dex */
public class ResponseContentEncoding implements InterfaceC59585zjn {
    public static final String UNCOMPRESSED = "http.client.response.uncompressed";
    private final InterfaceC59548zjC<InputStreamFactory> decoderRegistry;
    private final boolean ignoreUnknown;

    public ResponseContentEncoding(InterfaceC59548zjC<InputStreamFactory> interfaceC59548zjC, boolean z) {
        this.decoderRegistry = interfaceC59548zjC == null ? C59554zjI.OLrzqt().EZpvd("gzip", GZIPInputStreamFactory.getInstance()).EZpvd("x-gzip", GZIPInputStreamFactory.getInstance()).EZpvd("deflate", DeflateInputStreamFactory.getInstance()).AEQbTJ() : interfaceC59548zjC;
        this.ignoreUnknown = z;
    }

    public ResponseContentEncoding(boolean z) {
        this(null, z);
    }

    public ResponseContentEncoding(InterfaceC59548zjC<InputStreamFactory> interfaceC59548zjC) {
        this(interfaceC59548zjC, true);
    }

    public ResponseContentEncoding() {
        this((InterfaceC59548zjC<InputStreamFactory>) null);
    }

    @Override // o.InterfaceC59585zjn
    public void process(InterfaceC59584zjm interfaceC59584zjm, InterfaceC59838zob interfaceC59838zob) throws HttpException, IOException {
        InterfaceC59518ziZ contentEncoding;
        InterfaceC59576zje interfaceC59576zjeEZpvd = interfaceC59584zjm.EZpvd();
        if (!HttpClientContext.adapt(interfaceC59838zob).getRequestConfig().isContentCompressionEnabled() || interfaceC59576zjeEZpvd == null || interfaceC59576zjeEZpvd.getContentLength() == 0 || (contentEncoding = interfaceC59576zjeEZpvd.getContentEncoding()) == null) {
            return;
        }
        for (InterfaceC59517ziY interfaceC59517ziY : contentEncoding.getElements()) {
            String lowerCase = interfaceC59517ziY.copydefault().toLowerCase(Locale.ROOT);
            InputStreamFactory inputStreamFactoryKWHzl = this.decoderRegistry.KWHzl(lowerCase);
            if (inputStreamFactoryKWHzl != null) {
                interfaceC59584zjm.OLrzqt(new DecompressingEntity(interfaceC59584zjm.EZpvd(), inputStreamFactoryKWHzl));
                interfaceC59584zjm.removeHeaders("Content-Length");
                interfaceC59584zjm.removeHeaders("Content-Encoding");
                interfaceC59584zjm.removeHeaders("Content-MD5");
            } else if (!"identity".equals(lowerCase) && !this.ignoreUnknown) {
                throw new HttpException("Unsupported Content-Encoding: " + interfaceC59517ziY.copydefault());
            }
        }
    }
}
