package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19162fwA extends RecyclerView.ViewHolder {
    public final Function1<C18987fsl, Unit> AEQbTJ;
    public final C16875esF copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsl, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19162fwA(@NotNull C16875esF c16875esF, @NotNull Function1<? super C18987fsl, Unit> function1) {
        super(c16875esF.getRoot());
        Intrinsics.checkNotNullParameter(c16875esF, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = c16875esF;
        this.AEQbTJ = function1;
    }

    public final void copydefault(@NotNull C18987fsl c18987fsl) {
        Intrinsics.checkNotNullParameter(c18987fsl, "");
        final C16875esF c16875esF = this.copydefault;
        android.widget.ImageView imageView = c16875esF.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C14725dqq.AEQbTJ(imageView, c18987fsl.copydefault(), C13754dXa.Activity.fZBcTu, new Function1() { // from class: o.fwE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19162fwA.AEQbTJ(c16875esF, (C5335Nt) obj);
            }
        }, 32.0f);
        c16875esF.EZpvd.setText(c18987fsl.EZpvd());
        AppCompatTextView appCompatTextView = c16875esF.copydefault;
        java.lang.String strKWHzl = C19221fxG.KWHzl(c18987fsl.KWHzl());
        if (strKWHzl == null) {
            strKWHzl = c18987fsl.KWHzl();
        }
        appCompatTextView.setText(strKWHzl);
        ConstraintLayout root = c16875esF.getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, this, c18987fsl));
    }

    public static final Unit AEQbTJ(C16875esF c16875esF, C5335Nt c5335Nt) {
        Intrinsics.checkNotNullParameter(c5335Nt, "");
        android.content.Context context = c16875esF.OLrzqt.getContext();
        int i = C52761wXj.Activity.zuBGHE;
        android.content.Context context2 = c16875esF.OLrzqt.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C14641dpL(context, 8.0f, 1.0f, C33070mpX.OLrzqt(i, context2)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fwA$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C18987fsl EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C19162fwA copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C19162fwA c19162fwA, C18987fsl c18987fsl) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = c19162fwA;
            this.EZpvd = c18987fsl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.AEQbTJ.invoke(this.EZpvd);
            }
        }
    }
}
