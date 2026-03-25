package o;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: renamed from: o.zbo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59162zbo implements Function0 {
    public final C59149zbb AEQbTJ;
    public final ProtoBuf.Property KWHzl;
    public final C59218zcr copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59162zbo(C59149zbb c59149zbb, ProtoBuf.Property property, C59218zcr c59218zcr) {
        this.AEQbTJ = c59149zbb;
        this.KWHzl = property;
        this.copydefault = c59218zcr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return C59149zbb.gEmmrt(this.AEQbTJ, this.KWHzl, this.copydefault);
    }
}
