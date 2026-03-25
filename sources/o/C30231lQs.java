package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lQs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30231lQs extends wXX {
    public static final Application Companion = new Application(null);

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C31487luu c31487luuOLrzqt = C31487luu.OLrzqt(android.view.LayoutInflater.from(getContext()));
        Intrinsics.checkNotNullExpressionValue(c31487luuOLrzqt, "");
        constraintLayout.addView(c31487luuOLrzqt.getRoot(), new ConstraintLayout.LayoutParams(-1, -2));
    }

    /* JADX INFO: renamed from: o.lQs$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lQs.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C30231lQs KWHzl() {
            return new C30231lQs();
        }
    }
}
