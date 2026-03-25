package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: o.dRa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13592dRa implements InterfaceC57335ygV {
    public final InterfaceC56387yDm<AbstractC57329ygP> AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.dRb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C13592dRa.AEQbTJ();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57335ygV
    public InterfaceC56387yDm<AbstractC57329ygP> copydefault() {
        return this.AEQbTJ;
    }

    public static final dQY AEQbTJ() {
        return new dQY();
    }

    @Override // o.InterfaceC57335ygV
    public java.util.Set<java.lang.String> EZpvd() {
        return copydefault().getValue().getSupportJSMethods();
    }

    @Override // o.InterfaceC57335ygV
    public java.lang.String KWHzl() {
        return copydefault().getValue().getSupportJSObjectUri();
    }
}
