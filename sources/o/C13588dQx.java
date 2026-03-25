package o;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: o.dQx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13588dQx implements InterfaceC57335ygV {
    public final InterfaceC56387yDm<AbstractC57329ygP> OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.dQw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C13588dQx.OLrzqt();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57335ygV
    public InterfaceC56387yDm<AbstractC57329ygP> copydefault() {
        return this.OLrzqt;
    }

    public static final C13585dQu OLrzqt() {
        return new C13585dQu();
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
