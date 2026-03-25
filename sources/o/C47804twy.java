package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47803twx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.twy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C47804twy extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public java.lang.String AEQbTJ = "";
    public Function2<? super java.lang.String, ? super java.util.List<? extends android.net.Uri>, Unit> KWHzl;
    public C47803twx OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function2<? super java.lang.String, ? super java.util.List<? extends android.net.Uri>, Unit> function2) {
        this.KWHzl = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.copydefault;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(4);
        wxq.AEQbTJ().setVisibility(8);
        wxq.valueOf().setVisibility(8);
        wxq.KWHzl().setVisibility(8);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.twx.TaskDescription.newInstance$default(o.twx$TaskDescription, java.lang.String, int, java.lang.String, int, java.lang.Object):o.twx */
    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C47803twx c47803twxNewInstance$default = C47803twx.TaskDescription.newInstance$default(C47803twx.Companion, this.AEQbTJ, 20, null, 4, null);
        c47803twxNewInstance$default.copydefault(new Function2() { // from class: o.twB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C47804twy.EZpvd(this.OLrzqt, (java.lang.String) obj, (java.util.List) obj2);
            }
        });
        this.OLrzqt = c47803twxNewInstance$default;
        getChildFragmentManager().beginTransaction().replace(constraintLayout.getId(), c47803twxNewInstance$default).commitNow();
    }

    public static final Unit EZpvd(C47804twy c47804twy, java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Function2<? super java.lang.String, ? super java.util.List<? extends android.net.Uri>, Unit> function2 = c47804twy.KWHzl;
        if (function2 != null) {
            function2.invoke(str, list);
        }
        c47804twy.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.OLrzqt = null;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: o.twy$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.twy.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C47804twy newInstance$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            return actionBar.KWHzl(str);
        }

        public final C47804twy KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C47804twy c47804twy = new C47804twy();
            c47804twy.KWHzl(str);
            return c47804twy;
        }
    }
}
