package o;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class RP {
    public static final C5363Ov<?, ?, ?> KWHzl = new C5363Ov<>(java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, Collections.singletonList(new C5355On(java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, Collections.emptyList(), new C5433Rn(), null)), null);
    public final androidx.collection.ArrayMap<SC, C5363Ov<?, ?, ?>> copydefault = new androidx.collection.ArrayMap<>();
    public final AtomicReference<SC> AEQbTJ = new AtomicReference<>();

    public boolean copydefault(@androidx.annotation.Nullable C5363Ov<?, ?, ?> c5363Ov) {
        return KWHzl.equals(c5363Ov);
    }

    public <Data, TResource, Transcode> C5363Ov<Data, TResource, Transcode> EZpvd(java.lang.Class<Data> cls, java.lang.Class<TResource> cls2, java.lang.Class<Transcode> cls3) {
        C5363Ov<Data, TResource, Transcode> c5363Ov;
        SC scOLrzqt = OLrzqt(cls, cls2, cls3);
        synchronized (this.copydefault) {
            c5363Ov = (C5363Ov) this.copydefault.get(scOLrzqt);
        }
        this.AEQbTJ.set(scOLrzqt);
        return c5363Ov;
    }

    public void AEQbTJ(java.lang.Class<?> cls, java.lang.Class<?> cls2, java.lang.Class<?> cls3, @androidx.annotation.Nullable C5363Ov<?, ?, ?> c5363Ov) {
        synchronized (this.copydefault) {
            androidx.collection.ArrayMap<SC, C5363Ov<?, ?, ?>> arrayMap = this.copydefault;
            SC sc = new SC(cls, cls2, cls3);
            if (c5363Ov == null) {
                c5363Ov = KWHzl;
            }
            arrayMap.put(sc, c5363Ov);
        }
    }

    public final SC OLrzqt(java.lang.Class<?> cls, java.lang.Class<?> cls2, java.lang.Class<?> cls3) {
        SC andSet = this.AEQbTJ.getAndSet(null);
        if (andSet == null) {
            andSet = new SC();
        }
        andSet.OLrzqt(cls, cls2, cls3);
        return andSet;
    }
}
