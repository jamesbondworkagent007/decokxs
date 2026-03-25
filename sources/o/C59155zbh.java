package o;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: renamed from: o.zbh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59155zbh implements Function0 {
    public final ProtoBuf.Property AEQbTJ;
    public final C59218zcr OLrzqt;
    public final C59149zbb copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59155zbh(C59149zbb c59149zbb, ProtoBuf.Property property, C59218zcr c59218zcr) {
        this.copydefault = c59149zbb;
        this.AEQbTJ = property;
        this.OLrzqt = c59218zcr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return C59149zbb.djBIcL(this.copydefault, this.AEQbTJ, this.OLrzqt);
    }
}
