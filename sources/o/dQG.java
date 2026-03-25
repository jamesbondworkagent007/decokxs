package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class dQG implements InterfaceC57335ygV {
    public final InterfaceC56387yDm<AbstractC57329ygP> copydefault = C56392yDr.copydefault(new Function0() { // from class: o.dQH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return dQG.OLrzqt();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57335ygV
    public InterfaceC56387yDm<AbstractC57329ygP> copydefault() {
        return this.copydefault;
    }

    public static final dQF OLrzqt() {
        return new dQF();
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
