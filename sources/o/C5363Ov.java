package o;

import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.GlideException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C5355On;

/* JADX INFO: renamed from: o.Ov, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5363Ov<Data, ResourceType, Transcode> {
    public final java.lang.Class<Data> AEQbTJ;
    public final java.util.List<? extends C5355On<Data, ResourceType, Transcode>> EZpvd;
    public final java.lang.String KWHzl;
    public final Pools.Pool<java.util.List<java.lang.Throwable>> OLrzqt;

    public C5363Ov(java.lang.Class<Data> cls, java.lang.Class<ResourceType> cls2, java.lang.Class<Transcode> cls3, java.util.List<C5355On<Data, ResourceType, Transcode>> list, Pools.Pool<java.util.List<java.lang.Throwable>> pool) {
        this.AEQbTJ = cls;
        this.OLrzqt = pool;
        this.EZpvd = (java.util.List) SE.KWHzl(list);
        this.KWHzl = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public OC<Transcode> OLrzqt(NT<Data> nt, @androidx.annotation.NonNull NM nm, int i, int i2, C5355On.TaskDescription<ResourceType> taskDescription) throws GlideException {
        java.util.List<java.lang.Throwable> list = (java.util.List) SE.OLrzqt(this.OLrzqt.acquire());
        try {
            return AEQbTJ(nt, nm, i, i2, taskDescription, list);
        } finally {
            this.OLrzqt.release(list);
        }
    }

    public final OC<Transcode> AEQbTJ(NT<Data> nt, @androidx.annotation.NonNull NM nm, int i, int i2, C5355On.TaskDescription<ResourceType> taskDescription, java.util.List<java.lang.Throwable> list) throws GlideException {
        int size = this.EZpvd.size();
        OC<Transcode> ocCopydefault = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                ocCopydefault = this.EZpvd.get(i3).copydefault(nt, i, i2, nm, taskDescription);
            } catch (GlideException e) {
                list.add(e);
            }
            if (ocCopydefault != null) {
                break;
            }
        }
        if (ocCopydefault != null) {
            return ocCopydefault;
        }
        throw new GlideException(this.KWHzl, new java.util.ArrayList(list));
    }

    public java.lang.String toString() {
        return "LoadPath{decodePaths=" + java.util.Arrays.toString(this.EZpvd.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
