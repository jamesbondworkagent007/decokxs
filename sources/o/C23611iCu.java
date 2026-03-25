package o;

import androidx.lifecycle.ViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iCu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23611iCu<T> extends ViewModel {
    public final Function1<java.lang.String, T> EZpvd;
    public C23599iCi KWHzl;
    public final C23614iCx<T> OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23614iCx<T> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, ? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C23611iCu(@NotNull java.lang.String str, @NotNull Function1<? super java.lang.String, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = str;
        this.EZpvd = function1;
        this.OLrzqt = new C23614iCx<>();
        C23599iCi c23599iCi = new C23599iCi(str, new Function1() { // from class: o.iCz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C23611iCu.EZpvd(this.AEQbTJ, (java.lang.String) obj);
            }
        }, null, 4, null);
        this.KWHzl = c23599iCi;
        c23599iCi.AEQbTJ();
    }

    public static final Unit EZpvd(C23611iCu c23611iCu, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c23611iCu.OLrzqt.postValue(c23611iCu.EZpvd.invoke(str));
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        C23599iCi c23599iCi = this.KWHzl;
        if (c23599iCi != null) {
            c23599iCi.gEmmrt();
        }
        this.KWHzl = null;
    }

    public final void OLrzqt() {
        C23599iCi c23599iCi = this.KWHzl;
        if (c23599iCi != null) {
            c23599iCi.gEmmrt();
        }
    }
}
