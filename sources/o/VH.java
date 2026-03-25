package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;

/* JADX INFO: loaded from: classes21.dex */
public class VH implements java.io.Closeable, java.io.Flushable {
    public final boolean AEQbTJ;
    public final JsonGenerator AYXKKw;
    public final VD<java.lang.Object> AhwBna;
    public final AbstractC5601Xz DbNXlk;
    public boolean EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final SerializationConfig copydefault;
    public final DefaultSerializerProvider djBIcL;
    public boolean gEmmrt;
    public AbstractC5604Yc valueOf;

    public VH(DefaultSerializerProvider defaultSerializerProvider, JsonGenerator jsonGenerator, boolean z, ObjectWriter.Prefetch prefetch) throws java.io.IOException {
        this.djBIcL = defaultSerializerProvider;
        this.AYXKKw = jsonGenerator;
        this.KWHzl = z;
        this.AhwBna = prefetch.getValueSerializer();
        this.DbNXlk = prefetch.getTypeSerializer();
        SerializationConfig config = defaultSerializerProvider.getConfig();
        this.copydefault = config;
        this.AEQbTJ = config.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE);
        this.OLrzqt = config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE);
        this.valueOf = AbstractC5604Yc.AEQbTJ();
    }

    public VH EZpvd(boolean z) throws java.io.IOException {
        if (z) {
            this.AYXKKw.values();
            this.gEmmrt = true;
        }
        return this;
    }

    @Override // java.io.Flushable
    public void flush() throws java.io.IOException {
        if (this.EZpvd) {
            return;
        }
        this.AYXKKw.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.EZpvd) {
            return;
        }
        this.EZpvd = true;
        if (this.gEmmrt) {
            this.gEmmrt = false;
            this.AYXKKw.fetchVPNInfo();
        }
        if (this.KWHzl) {
            this.AYXKKw.close();
        }
    }
}
