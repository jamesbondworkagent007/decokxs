package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jGr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25796jGr extends wXX {
    public AbstractC23460hye copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.jGr$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jGr.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C25796jGr OLrzqt(@androidx.annotation.StringRes int i, @androidx.annotation.StringRes int i2) {
            C25796jGr c25796jGr = new C25796jGr();
            c25796jGr.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARGS_TITLE_TEXT", java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt("ARGS_CONTENT_TEXT", java.lang.Integer.valueOf(i2))));
            return c25796jGr;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(2);
        android.os.Bundle arguments = getArguments();
        java.lang.String string = wxq.getContext().getString(arguments != null ? arguments.getInt("ARGS_TITLE_TEXT") : C23274hvD.Fragment.getPriority);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
        wxq.AYXKKw().setTextAppearance(C52761wXj.LoaderManager.DGOPHZ);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.os.Bundle arguments = getArguments();
        int i = arguments != null ? arguments.getInt("ARGS_CONTENT_TEXT") : C23274hvD.Fragment.zhUgOk;
        AbstractC23460hye abstractC23460hyeAEQbTJ = AbstractC23460hye.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(abstractC23460hyeAEQbTJ, "");
        abstractC23460hyeAEQbTJ.OLrzqt.setText(abstractC23460hyeAEQbTJ.getRoot().getContext().getString(i));
        this.copydefault = abstractC23460hyeAEQbTJ;
    }
}
