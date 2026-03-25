package o;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;

/* JADX INFO: renamed from: o.zbp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59163zbp implements Function0 {
    public final C59149zbb AEQbTJ;
    public final AnnotatedCallableKind EZpvd;
    public final AbstractC59164zbq KWHzl;
    public final int OLrzqt;
    public final yXQ copydefault;
    public final ProtoBuf.ValueParameter valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59163zbp(C59149zbb c59149zbb, AbstractC59164zbq abstractC59164zbq, yXQ yxq, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf.ValueParameter valueParameter) {
        this.AEQbTJ = c59149zbb;
        this.KWHzl = abstractC59164zbq;
        this.copydefault = yxq;
        this.EZpvd = annotatedCallableKind;
        this.OLrzqt = i;
        this.valueOf = valueParameter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return C59149zbb.copydefault(this.AEQbTJ, this.KWHzl, this.copydefault, this.EZpvd, this.OLrzqt, this.valueOf);
    }
}
