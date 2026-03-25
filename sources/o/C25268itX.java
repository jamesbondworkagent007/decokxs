package o;

import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.itX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C25268itX extends Flow {
    public boolean KWHzl;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.itX$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.itX.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25268itX(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25268itX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25268itX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void updatePostLayout(@NotNull final ConstraintLayout constraintLayout) {
        android.view.View viewById;
        boolean z;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.updatePostLayout(constraintLayout);
        android.view.View viewById2 = constraintLayout.getViewById(C23274hvD.Application.dispatchTrackballEvent);
        if (viewById2 == null || (viewById = constraintLayout.getViewById(C23274hvD.Application.getWrapped)) == null) {
            return;
        }
        boolean z2 = !AEQbTJ(viewById2, constraintLayout);
        boolean z3 = !AEQbTJ(viewById, constraintLayout);
        pUU.KWHzl("MemeModeTokenInfoFlow", "updatePostLayout: desiredFirst=" + z2 + ", desiredSecond=" + z3);
        if ((viewById2.getVisibility() == 0) != z2) {
            viewById2.setVisibility(z2 ? 0 : 8);
            z = true;
        } else {
            z = false;
        }
        if ((viewById.getVisibility() == 0) != z3) {
            viewById.setVisibility(z3 ? 0 : 8);
        } else if (!z) {
            return;
        }
        if (this.KWHzl) {
            return;
        }
        pUU.KWHzl("MemeModeTokenInfoFlow", "changed, scheduling relayout, desiredFirst=" + z2 + ", desiredSecond=" + z3);
        this.KWHzl = true;
        post(new java.lang.Runnable() { // from class: o.itT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C25268itX.KWHzl(this.AEQbTJ, constraintLayout);
            }
        });
    }

    public static final void KWHzl(C25268itX c25268itX, ConstraintLayout constraintLayout) {
        c25268itX.KWHzl = false;
        c25268itX.requestLayout();
        constraintLayout.requestLayout();
        java.lang.Object parent = c25268itX.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            view.requestLayout();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        post(new java.lang.Runnable() { // from class: o.itW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C25268itX.AEQbTJ(this.EZpvd);
            }
        });
    }

    public static final void AEQbTJ(C25268itX c25268itX) {
        c25268itX.requestLayout();
    }

    public final boolean AEQbTJ(android.view.View view, ConstraintLayout constraintLayout) {
        return !C55296xhK.AEQbTJ(this) ? view.getLeft() != 0 : view.getRight() != constraintLayout.getWidth();
    }
}
