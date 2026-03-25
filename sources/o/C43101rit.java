package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rit, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43101rit {
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.riv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43101rit.copydefault();
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.rix
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43101rit.EZpvd();
        }
    });

    public final java.util.HashMap<java.lang.String, InterfaceC7380aij> djBIcL() {
        return (java.util.HashMap) this.copydefault.getValue();
    }

    public static final java.util.HashMap copydefault() {
        return new java.util.HashMap();
    }

    public final java.util.HashMap<InterfaceC7380aij, InterfaceComponentCallbacks2C43266rlz> OLrzqt() {
        return (java.util.HashMap) this.OLrzqt.getValue();
    }

    public static final java.util.HashMap EZpvd() {
        return new java.util.HashMap();
    }

    public final void AYXKKw() {
        InterfaceComponentCallbacks2C43266rlz module;
        java.util.List<InterfaceC7378aih> list = C43148rjn.EZpvd;
        if (list != null) {
            for (InterfaceC7378aih interfaceC7378aih : list) {
                InterfaceC7380aij interfaceC7380aijRegisterRouter = interfaceC7378aih.registerRouter();
                if (interfaceC7380aijRegisterRouter != null) {
                    if ((interfaceC7378aih instanceof AbstractC7372aib) && (module = ((AbstractC7372aib) interfaceC7378aih).getModule()) != null) {
                        OLrzqt().put(interfaceC7380aijRegisterRouter, module);
                    }
                    java.util.Iterator<T> it = interfaceC7380aijRegisterRouter.KWHzl().iterator();
                    while (it.hasNext()) {
                        djBIcL().put((java.lang.String) it.next(), interfaceC7380aijRegisterRouter);
                    }
                }
            }
        }
    }

    public final InterfaceC7380aij copydefault(@NotNull java.lang.String str) {
        InterfaceComponentCallbacks2C43266rlz interfaceComponentCallbacks2C43266rlz;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC7380aij interfaceC7380aij = djBIcL().get(str);
        if (interfaceC7380aij != null && (interfaceComponentCallbacks2C43266rlz = OLrzqt().get(interfaceC7380aij)) != null) {
            interfaceComponentCallbacks2C43266rlz.doOnCreate();
        }
        return interfaceC7380aij;
    }
}
