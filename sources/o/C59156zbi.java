package o;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;

/* JADX INFO: renamed from: o.zbi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59156zbi implements Function0 {
    public final C59149zbb AEQbTJ;
    public final AnnotatedCallableKind EZpvd;
    public final yXQ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59156zbi(C59149zbb c59149zbb, yXQ yxq, AnnotatedCallableKind annotatedCallableKind) {
        this.AEQbTJ = c59149zbb;
        this.copydefault = yxq;
        this.EZpvd = annotatedCallableKind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return C59149zbb.KWHzl(this.AEQbTJ, this.copydefault, this.EZpvd);
    }
}
