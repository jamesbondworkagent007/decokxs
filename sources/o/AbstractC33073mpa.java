package o;

import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mpa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC33073mpa extends ViewModel {
    public final C58216yxB QSLkRj = new C58216yxB();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58216yxB call() {
        return this.QSLkRj;
    }

    public final java.lang.String DbNXlk(@androidx.annotation.StringRes int i) {
        java.lang.String string = C32979mnm.EZpvd.OLrzqt().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mpa */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.String getFormattedString$default(AbstractC33073mpa abstractC33073mpa, int i, java.util.Map map, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFormattedString");
        }
        if ((i2 & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        return abstractC33073mpa.KWHzl(i, map);
    }

    public final java.lang.String KWHzl(@androidx.annotation.StringRes int i, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), i, map);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        if (this.QSLkRj.isDisposed() || this.QSLkRj.KWHzl() <= 0) {
            return;
        }
        this.QSLkRj.dispose();
    }
}
