package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wmt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C53514wmt extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public Function1<? super java.lang.String, Unit> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX INFO: renamed from: o.wmt$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wmt.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C53514wmt OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("current_margin_mode", str);
            C53514wmt c53514wmt = new C53514wmt();
            c53514wmt.setArguments(bundle);
            return c53514wmt;
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onHeaderCreated(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setBackgroundResource(C52761wXj.Activity.registerUser);
        AbstractC48498uTq abstractC48498uTqOLrzqt = AbstractC48498uTq.OLrzqt(android.view.LayoutInflater.from(requireContext()), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(abstractC48498uTqOLrzqt, "");
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("current_margin_mode")) == null) {
            string = "cross";
        }
        android.widget.LinearLayout linearLayout = abstractC48498uTqOLrzqt.KWHzl;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.wmu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53514wmt.AEQbTJ(this.EZpvd, view);
            }
        });
        Intrinsics.copydefault(linearLayout);
        AEQbTJ(linearLayout, Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) "cross"));
        android.widget.LinearLayout linearLayout2 = abstractC48498uTqOLrzqt.EZpvd;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: o.wmq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53514wmt.EZpvd(this.KWHzl, view);
            }
        });
        Intrinsics.copydefault(linearLayout2);
        AEQbTJ(linearLayout2, Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) "isolated"));
    }

    public static final void AEQbTJ(C53514wmt c53514wmt, android.view.View view) {
        Function1<? super java.lang.String, Unit> function1 = c53514wmt.AEQbTJ;
        if (function1 != null) {
            function1.invoke("cross");
        }
        c53514wmt.dismissAllowingStateLoss();
    }

    public static final void EZpvd(C53514wmt c53514wmt, android.view.View view) {
        Function1<? super java.lang.String, Unit> function1 = c53514wmt.AEQbTJ;
        if (function1 != null) {
            function1.invoke("isolated");
        }
        c53514wmt.dismissAllowingStateLoss();
    }

    private final void AEQbTJ(android.widget.LinearLayout linearLayout, boolean z) {
        linearLayout.setBackgroundResource(z ? C49511upt.TaskDescription.valueOf : C49511upt.TaskDescription.AYXKKw);
    }
}
