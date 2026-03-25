package o;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import o.C18136fch;
import o.InterfaceC18139fck;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fcj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18138fcj extends C59534zip {
    public C18138fcj(@NotNull C18136fch.StateListAnimator stateListAnimator, @NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(onClickListener, "");
        register(InterfaceC18139fck.StateListAnimator.class, new C18136fch(stateListAnimator));
        register(InterfaceC18139fck.ActionBar.class, new C18137fci());
        register(InterfaceC18139fck.TaskDescription.class, new C18130fcb(onClickListener));
    }
}
