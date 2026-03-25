package o;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: renamed from: o.zbk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59158zbk implements Function0 {
    public final C59149zbb EZpvd;
    public final ProtoBuf.Property OLrzqt;
    public final C59218zcr copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59158zbk(C59149zbb c59149zbb, ProtoBuf.Property property, C59218zcr c59218zcr) {
        this.EZpvd = c59149zbb;
        this.OLrzqt = property;
        this.copydefault = c59218zcr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return C59149zbb.KWHzl(this.EZpvd, this.OLrzqt, this.copydefault);
    }
}
