package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ztW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59994ztW {
    public static /* synthetic */ C59976ztE onOptions$default(C59976ztE c59976ztE, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return EZpvd(c59976ztE, function1);
    }

    public static final <T> C59976ztE<T> EZpvd(@NotNull C59976ztE<T> c59976ztE, Function1<? super C59978ztG<T>, Unit> function1) {
        Intrinsics.checkNotNullParameter(c59976ztE, "");
        if (function1 != null) {
            C59978ztG<T> c59978ztGOLrzqt = c59976ztE.KWHzl().OLrzqt();
            InterfaceC59997ztZ interfaceC59997ztZOLrzqt = c59978ztGOLrzqt.OLrzqt();
            function1.invoke(c59978ztGOLrzqt);
            if (!Intrinsics.EZpvd(c59978ztGOLrzqt.OLrzqt(), interfaceC59997ztZOLrzqt)) {
                c59976ztE.AEQbTJ().KWHzl((AbstractC59982ztK<?>) c59976ztE.KWHzl());
            }
            if (!c59978ztGOLrzqt.valueOf().isEmpty()) {
                c59976ztE.AEQbTJ().OLrzqt((AbstractC59982ztK<?>) c59976ztE.KWHzl());
            }
            if (c59978ztGOLrzqt.gEmmrt() && (c59976ztE.KWHzl() instanceof C59990ztS)) {
                c59976ztE.AEQbTJ().KWHzl((C59990ztS<?>) c59976ztE.KWHzl());
            }
        }
        return c59976ztE;
    }
}
