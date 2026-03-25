package o;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;

/* JADX INFO: renamed from: o.zcP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59190zcP implements Function1 {
    public final java.util.Collection AEQbTJ;
    public final InterfaceC59381zfv EZpvd;
    public final TypeCheckerState KWHzl;
    public final InterfaceC59384zfy copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59190zcP(java.util.Collection collection, TypeCheckerState typeCheckerState, InterfaceC59384zfy interfaceC59384zfy, InterfaceC59381zfv interfaceC59381zfv) {
        this.AEQbTJ = collection;
        this.KWHzl = typeCheckerState;
        this.copydefault = interfaceC59384zfy;
        this.EZpvd = interfaceC59381zfv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        return C59188zcN.AEQbTJ(this.AEQbTJ, this.KWHzl, this.copydefault, this.EZpvd, (TypeCheckerState.TaskDescription) obj);
    }
}
