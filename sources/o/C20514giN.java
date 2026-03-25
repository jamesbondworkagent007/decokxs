package o;

import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.giN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20514giN {
    public static /* synthetic */ android.view.View bindWith$default(android.view.View view, java.lang.Object obj, Function2 function2, Function2 function22, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            function22 = null;
        }
        return copydefault(view, obj, function2, function22);
    }

    public static final <V extends android.view.View, D> V copydefault(@NotNull final V v, @NotNull D d, @NotNull Function2<? super V, ? super D, Unit> function2, final Function2<? super V, ? super D, Unit> function22) {
        Intrinsics.checkNotNullParameter(v, "");
        Intrinsics.checkNotNullParameter(d, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (function22 == null) {
            function22 = function2;
        }
        v.setTag(C13754dXa.ActionBar.RestrictToScope, new InterfaceC20510giJ() { // from class: o.giM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC20510giJ
            public final void EZpvd(java.lang.Object obj) {
                C20514giN.EZpvd(function22, v, obj);
            }
        });
        function2.invoke(v, d);
        return v;
    }

    public static final void EZpvd(Function2 function2, android.view.View view, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        function2.invoke(view, obj);
    }

    public static final boolean copydefault(@NotNull android.view.View view, @NotNull java.lang.Object obj) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(obj, "");
        java.lang.Object tag = view.getTag(C13754dXa.ActionBar.RestrictToScope);
        InterfaceC20510giJ interfaceC20510giJ = tag instanceof InterfaceC20510giJ ? (InterfaceC20510giJ) tag : null;
        if (interfaceC20510giJ == null) {
            return false;
        }
        try {
            Result.Application application = Result.Companion;
            interfaceC20510giJ.EZpvd(obj);
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.TRUE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = bool;
        }
        return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
    }
}
