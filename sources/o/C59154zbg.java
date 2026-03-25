package o;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;

/* JADX INFO: renamed from: o.zbg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59154zbg implements Function0 {
    public final AnnotatedCallableKind AEQbTJ;
    public final yXQ KWHzl;
    public final C59149zbb OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59154zbg(C59149zbb c59149zbb, yXQ yxq, AnnotatedCallableKind annotatedCallableKind) {
        this.OLrzqt = c59149zbb;
        this.KWHzl = yxq;
        this.AEQbTJ = annotatedCallableKind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return C59149zbb.AEQbTJ(this.OLrzqt, this.KWHzl, this.AEQbTJ);
    }
}
