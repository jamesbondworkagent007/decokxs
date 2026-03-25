package o;

import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.GlideException;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.On, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5355On<DataType, ResourceType, Transcode> {
    public final Pools.Pool<java.util.List<java.lang.Throwable>> AEQbTJ;
    public final java.lang.String EZpvd;
    public final InterfaceC5429Rj<ResourceType, Transcode> KWHzl;
    public final java.lang.Class<DataType> OLrzqt;
    public final java.util.List<? extends NL<DataType, ResourceType>> copydefault;

    /* JADX INFO: renamed from: o.On$TaskDescription */
    public interface TaskDescription<ResourceType> {
        OC<ResourceType> KWHzl(@androidx.annotation.NonNull OC<ResourceType> oc);
    }

    public C5355On(java.lang.Class<DataType> cls, java.lang.Class<ResourceType> cls2, java.lang.Class<Transcode> cls3, java.util.List<? extends NL<DataType, ResourceType>> list, InterfaceC5429Rj<ResourceType, Transcode> interfaceC5429Rj, Pools.Pool<java.util.List<java.lang.Throwable>> pool) {
        this.OLrzqt = cls;
        this.copydefault = list;
        this.KWHzl = interfaceC5429Rj;
        this.AEQbTJ = pool;
        this.EZpvd = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public OC<Transcode> copydefault(NT<DataType> nt, int i, int i2, @androidx.annotation.NonNull NM nm, TaskDescription<ResourceType> taskDescription) throws GlideException {
        return this.KWHzl.KWHzl(taskDescription.KWHzl(KWHzl(nt, i, i2, nm)), nm);
    }

    public final OC<ResourceType> KWHzl(NT<DataType> nt, int i, int i2, @androidx.annotation.NonNull NM nm) throws GlideException {
        java.util.List<java.lang.Throwable> list = (java.util.List) SE.OLrzqt(this.AEQbTJ.acquire());
        try {
            return copydefault(nt, i, i2, nm, list);
        } finally {
            this.AEQbTJ.release(list);
        }
    }

    public final OC<ResourceType> copydefault(NT<DataType> nt, int i, int i2, @androidx.annotation.NonNull NM nm, java.util.List<java.lang.Throwable> list) throws GlideException {
        int size = this.copydefault.size();
        OC<ResourceType> ocCopydefault = null;
        for (int i3 = 0; i3 < size; i3++) {
            NL<DataType, ResourceType> nl = this.copydefault.get(i3);
            try {
                if (nl.copydefault(nt.AEQbTJ(), nm)) {
                    ocCopydefault = nl.copydefault(nt.AEQbTJ(), i, i2, nm);
                }
            } catch (java.io.IOException | java.lang.OutOfMemoryError | java.lang.RuntimeException e) {
                if (android.util.Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(nl);
                }
                list.add(e);
            }
            if (ocCopydefault != null) {
                break;
            }
        }
        if (ocCopydefault != null) {
            return ocCopydefault;
        }
        throw new GlideException(this.EZpvd, new java.util.ArrayList(list));
    }

    public java.lang.String toString() {
        return "DecodePath{ dataClass=" + this.OLrzqt + ", decoders=" + this.copydefault + ", transcoder=" + this.KWHzl + AbstractJsonLexerKt.END_OBJ;
    }
}
