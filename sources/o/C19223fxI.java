package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fxI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19223fxI extends RecyclerView.ViewHolder {
    public final Function0<Unit> copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19223fxI(@NotNull android.view.View view, boolean z, @NotNull Function0<Unit> function0) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = function0;
        android.view.View viewFindViewById = view.findViewById(C13754dXa.ActionBar.IntegerRes);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        viewFindViewById.setVisibility(z ? 0 : 8);
        C8003auW.copydefault((ConstraintLayout) view.findViewById(C13754dXa.ActionBar.Api26Impl)).throttleFirst(500L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.fxL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19223fxI.EZpvd(this.copydefault, obj);
            }
        });
    }

    public static final void EZpvd(C19223fxI c19223fxI, java.lang.Object obj) {
        c19223fxI.copydefault.invoke();
    }
}
