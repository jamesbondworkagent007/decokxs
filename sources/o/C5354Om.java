package o;

import o.OP;

/* JADX INFO: renamed from: o.Om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5354Om<DataType> implements OP.Application {
    public final DataType EZpvd;
    public final NM KWHzl;
    public final NI<DataType> OLrzqt;

    public C5354Om(NI<DataType> ni, DataType datatype, NM nm) {
        this.OLrzqt = ni;
        this.EZpvd = datatype;
        this.KWHzl = nm;
    }

    @Override // o.OP.Application
    public boolean KWHzl(@androidx.annotation.NonNull java.io.File file) {
        return this.OLrzqt.KWHzl(this.EZpvd, file, this.KWHzl);
    }
}
