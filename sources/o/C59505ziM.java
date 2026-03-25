package o;

import java.net.URLConnection;
import java.security.PrivilegedAction;
import org.apache.commons.logging.LogFactory;

/* JADX INFO: renamed from: o.ziM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59505ziM implements PrivilegedAction {
    public final /* synthetic */ java.net.URL AEQbTJ;

    public C59505ziM(java.net.URL url) {
        this.AEQbTJ = url;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0072: MOVE (r5 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:28:0x0072 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.security.PrivilegedAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object run() throws java.lang.Throwable {
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2;
        java.lang.StringBuffer stringBuffer;
        java.io.InputStream inputStream3 = null;
        try {
            try {
                URLConnection uRLConnectionOpenConnection = this.AEQbTJ.openConnection();
                uRLConnectionOpenConnection.setUseCaches(false);
                inputStream = uRLConnectionOpenConnection.getInputStream();
            } catch (java.io.IOException unused) {
                inputStream = null;
            } catch (java.lang.Throwable th) {
                th = th;
                if (inputStream3 != null) {
                }
                throw th;
            }
            if (inputStream == null) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused2) {
                        if (LogFactory.KWHzl()) {
                            stringBuffer = new java.lang.StringBuffer();
                            stringBuffer.append("Unable to close stream for URL ");
                            stringBuffer.append(this.AEQbTJ);
                            LogFactory.AYXKKw(stringBuffer.toString());
                        }
                    }
                }
                return null;
            }
            try {
                java.util.Properties properties = new java.util.Properties();
                properties.load(inputStream);
                inputStream.close();
                return properties;
            } catch (java.io.IOException unused3) {
                if (LogFactory.KWHzl()) {
                    java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
                    stringBuffer2.append("Unable to read URL ");
                    stringBuffer2.append(this.AEQbTJ);
                    LogFactory.AYXKKw(stringBuffer2.toString());
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused4) {
                        if (LogFactory.KWHzl()) {
                            stringBuffer = new java.lang.StringBuffer();
                            stringBuffer.append("Unable to close stream for URL ");
                            stringBuffer.append(this.AEQbTJ);
                            LogFactory.AYXKKw(stringBuffer.toString());
                        }
                    }
                }
                return null;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            inputStream3 = inputStream2;
            if (inputStream3 != null) {
                try {
                    inputStream3.close();
                } catch (java.io.IOException unused5) {
                    if (LogFactory.KWHzl()) {
                        java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer();
                        stringBuffer3.append("Unable to close stream for URL ");
                        stringBuffer3.append(this.AEQbTJ);
                        LogFactory.AYXKKw(stringBuffer3.toString());
                    }
                }
            }
            throw th;
        }
    }
}
