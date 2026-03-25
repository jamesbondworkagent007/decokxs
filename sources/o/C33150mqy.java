package o;

import com.google.common.net.HttpHeaders;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.unifieddomain.DomainType;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Triple;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: o.mqy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33150mqy extends C33141mqp {
    public java.io.File AEQbTJ;
    public final DomainType AYXKKw;
    public java.lang.String AhwBna;
    public AtomicReference<Call> EZpvd;
    public java.lang.String OLrzqt;
    public java.io.File djBIcL;

    public C33150mqy(java.io.File file, java.lang.String str, int i, DomainType domainType) {
        super(i);
        this.EZpvd = new AtomicReference<>();
        this.OLrzqt = "OkHttpSyncFetcher";
        this.AEQbTJ = file;
        this.AhwBna = str;
        this.djBIcL = new java.io.File(file.getParentFile(), file.getName() + "tmp");
        this.AYXKKw = domainType;
    }

    public void KWHzl(InterfaceC33145mqt interfaceC33145mqt) throws java.lang.Throwable {
        java.lang.String strOLrzqt = OLrzqt(this.AhwBna, this.AYXKKw);
        pUU.KWHzl(this.OLrzqt, "fetch: starting: origin:" + this.AhwBna + ", requestUrl:" + strOLrzqt + ", hostMode:" + this.AYXKKw);
        Triple<java.lang.Boolean, java.lang.Integer, java.lang.String> tripleEZpvd = EZpvd(strOLrzqt, interfaceC33145mqt);
        pUU.KWHzl(this.OLrzqt, "fetch: end: origin:" + this.AhwBna + ", requestUrl:" + strOLrzqt + ", hostMode:" + this.AYXKKw);
        C43461rpi.copydefault.OLrzqt(tripleEZpvd.getFirst(), tripleEZpvd.getThird(), this.AYXKKw, this.AhwBna, strOLrzqt);
        if (tripleEZpvd.getFirst().booleanValue()) {
            interfaceC33145mqt.copydefault("SUCCESS");
        } else {
            interfaceC33145mqt.EZpvd(tripleEZpvd.getSecond().intValue(), tripleEZpvd.getThird());
        }
    }

    public final Triple<java.lang.Boolean, java.lang.Integer, java.lang.String> EZpvd(java.lang.String str, InterfaceC33145mqt interfaceC33145mqt) throws java.lang.Throwable {
        java.io.FileOutputStream fileOutputStream;
        java.lang.Throwable th;
        java.io.InputStream inputStreamByteStream;
        if (android.text.TextUtils.isEmpty(str)) {
            return new Triple<>(java.lang.Boolean.FALSE, 1703, "url is null");
        }
        try {
            this.EZpvd.set(C33141mqp.AEQbTJ(this.copydefault).newCall(new Request.Builder().addHeader(HttpHeaders.CONNECTION, EopTrackEvent.CLOSE).url(str).build()));
            try {
                pUU.KWHzl(this.OLrzqt, "fetch: start to fetch:" + str);
                Response responseExecute = this.EZpvd.get().execute();
                pUU.KWHzl(this.OLrzqt, "fetch success, url:" + str + ",code :" + responseExecute.code());
                if (200 == responseExecute.code()) {
                    java.io.File parentFile = this.djBIcL.getParentFile();
                    if (!parentFile.isDirectory()) {
                        parentFile.mkdirs();
                    }
                    if (this.djBIcL.exists() && this.djBIcL.isFile()) {
                        this.djBIcL.delete();
                    }
                    try {
                        this.djBIcL.createNewFile();
                        java.io.InputStream inputStream = null;
                        try {
                            fileOutputStream = new java.io.FileOutputStream(this.djBIcL);
                            try {
                                inputStreamByteStream = responseExecute.body().byteStream();
                            } catch (java.io.IOException e) {
                                e = e;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                copydefault(inputStream, fileOutputStream);
                                throw th;
                            }
                            try {
                                long jContentLength = responseExecute.body().contentLength();
                                byte[] bArr = new byte[4096];
                                int i = 0;
                                while (true) {
                                    int i2 = inputStreamByteStream.read(bArr);
                                    if (i2 <= 0) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i2);
                                    i += i2;
                                    interfaceC33145mqt.copydefault(i, jContentLength);
                                }
                                fileOutputStream.flush();
                                if (this.AEQbTJ.exists() && this.AEQbTJ.isFile()) {
                                    this.AEQbTJ.delete();
                                }
                                this.djBIcL.renameTo(this.AEQbTJ);
                                Triple<java.lang.Boolean, java.lang.Integer, java.lang.String> triple = new Triple<>(java.lang.Boolean.TRUE, null, null);
                                copydefault(inputStreamByteStream, fileOutputStream);
                                return triple;
                            } catch (java.io.IOException e2) {
                                e = e2;
                                inputStream = inputStreamByteStream;
                                try {
                                    if (this.EZpvd.get().isCanceled()) {
                                        Triple<java.lang.Boolean, java.lang.Integer, java.lang.String> triple2 = new Triple<>(java.lang.Boolean.FALSE, 1705, e.getMessage());
                                        copydefault(inputStream, fileOutputStream);
                                        return triple2;
                                    }
                                    Triple<java.lang.Boolean, java.lang.Integer, java.lang.String> triple3 = new Triple<>(java.lang.Boolean.FALSE, 1701, e.getMessage());
                                    copydefault(inputStream, fileOutputStream);
                                    return triple3;
                                } catch (java.lang.Throwable th3) {
                                    inputStreamByteStream = inputStream;
                                    th = th3;
                                    th = th;
                                    inputStream = inputStreamByteStream;
                                    copydefault(inputStream, fileOutputStream);
                                    throw th;
                                }
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                th = th;
                                inputStream = inputStreamByteStream;
                                copydefault(inputStream, fileOutputStream);
                                throw th;
                            }
                        } catch (java.io.IOException e3) {
                            e = e3;
                            fileOutputStream = null;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            fileOutputStream = null;
                        }
                    } catch (java.io.IOException e4) {
                        return new Triple<>(java.lang.Boolean.FALSE, 1700, e4.getMessage());
                    }
                } else {
                    return new Triple<>(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(responseExecute.code()), "OkHttp network error:" + responseExecute.message());
                }
            } catch (java.io.IOException e5) {
                return new Triple<>(java.lang.Boolean.FALSE, 1702, "Call exec error: " + e5.getMessage());
            }
        } catch (java.lang.Exception e6) {
            return new Triple<>(java.lang.Boolean.FALSE, 1703, e6.getMessage());
        }
    }

    public java.lang.String OLrzqt(java.lang.String str, DomainType domainType) {
        HttpUrl httpUrl;
        java.lang.String strAEQbTJ;
        java.lang.String host;
        return (domainType == null || (httpUrl = HttpUrl.parse(str)) == null || (strAEQbTJ = C43385roL.Companion.EZpvd().AEQbTJ(domainType)) == null || C33148mqw.copydefault(strAEQbTJ) || (host = android.net.Uri.parse(strAEQbTJ).getHost()) == null) ? str : httpUrl.newBuilder().host(host).build().toString();
    }

    public void copydefault(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.lang.Exception unused) {
                pUU.copydefault(this.OLrzqt, "close with some exception");
                return;
            }
        }
        if (outputStream != null) {
            outputStream.close();
        }
    }

    public void OLrzqt() {
        if (this.EZpvd.get() != null) {
            this.EZpvd.get().cancel();
        }
    }
}
