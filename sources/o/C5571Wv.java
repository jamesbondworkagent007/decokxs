package o;

import com.fasterxml.jackson.databind.ext.NioPathDeserializer;
import com.fasterxml.jackson.databind.ext.NioPathSerializer;

/* JADX INFO: renamed from: o.Wv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5571Wv extends AbstractC5573Wx {
    public final java.lang.Class<?> KWHzl = C5574Wy.EZpvd();

    @Override // o.AbstractC5573Wx
    public AbstractC5548Vy<?> KWHzl(java.lang.Class<?> cls) {
        if (cls == this.KWHzl) {
            return new NioPathDeserializer();
        }
        return null;
    }

    @Override // o.AbstractC5573Wx
    public VD<?> AEQbTJ(java.lang.Class<?> cls) {
        if (this.KWHzl.isAssignableFrom(cls)) {
            return new NioPathSerializer();
        }
        return null;
    }
}
