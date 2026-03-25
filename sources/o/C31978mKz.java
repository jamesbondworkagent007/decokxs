package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mKz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C31978mKz extends RecyclerView.ViewHolder {
    public final InterfaceC56387yDm KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31978mKz(@NotNull android.view.View view, @androidx.annotation.IdRes final int i) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.mKG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C31978mKz.KWHzl(this.KWHzl, i);
            }
        });
    }

    public static final android.widget.TextView KWHzl(C31978mKz c31978mKz, int i) {
        return (android.widget.TextView) c31978mKz.itemView.findViewById(i);
    }

    public final android.widget.TextView EZpvd() {
        java.lang.Object value = this.KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (android.widget.TextView) value;
    }
}
