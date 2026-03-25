package o;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: renamed from: o.zbj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59157zbj implements Function0 {
    public final boolean AEQbTJ;
    public final C59149zbb EZpvd;
    public final ProtoBuf.Property OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59157zbj(C59149zbb c59149zbb, boolean z, ProtoBuf.Property property) {
        this.EZpvd = c59149zbb;
        this.AEQbTJ = z;
        this.OLrzqt = property;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return C59149zbb.OLrzqt(this.EZpvd, this.AEQbTJ, this.OLrzqt);
    }
}
