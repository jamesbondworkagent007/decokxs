package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fsa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18976fsa {
    public static final androidx.fragment.app.Fragment AEQbTJ(androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return fragment.getParentFragment();
    }

    public static final InterfaceC18922frZ copydefault(@NotNull androidx.fragment.app.Fragment fragment) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(fragment, "");
        java.util.Iterator it = C59405zgS.EZpvd(fragment.getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) new Function1() { // from class: o.fsd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18976fsa.AEQbTJ((androidx.fragment.app.Fragment) obj);
            }
        })).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((androidx.fragment.app.Fragment) next) instanceof InterfaceC18922frZ) {
                break;
            }
        }
        if (next instanceof InterfaceC18922frZ) {
            return (InterfaceC18922frZ) next;
        }
        return null;
    }
}
