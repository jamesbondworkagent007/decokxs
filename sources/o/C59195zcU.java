package o;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;

/* JADX INFO: renamed from: o.zcU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59195zcU implements Function0 {
    public final TypeCheckerState AEQbTJ;
    public final InterfaceC59381zfv EZpvd;
    public final InterfaceC59381zfv KWHzl;
    public final InterfaceC59384zfy copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59195zcU(TypeCheckerState typeCheckerState, InterfaceC59384zfy interfaceC59384zfy, InterfaceC59381zfv interfaceC59381zfv, InterfaceC59381zfv interfaceC59381zfv2) {
        this.AEQbTJ = typeCheckerState;
        this.copydefault = interfaceC59384zfy;
        this.EZpvd = interfaceC59381zfv;
        this.KWHzl = interfaceC59381zfv2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(C59188zcN.OLrzqt(this.AEQbTJ, this.copydefault, this.EZpvd, this.KWHzl));
    }
}
