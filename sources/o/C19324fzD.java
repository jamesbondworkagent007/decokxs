package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.okinc.uilab.item.OKRegularCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fzD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C19324fzD extends wXX {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public java.lang.Integer KWHzl;
    public Function1<? super java.lang.Integer, Unit> copydefault;

    @Override // o.wXX
    public boolean getHasFooter() {
        return false;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setCloseVisibility(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C17034evF c17034evFAEQbTJ = C17034evF.AEQbTJ(android.view.LayoutInflater.from(constraintLayout.getContext()), constraintLayout, false);
        Intrinsics.checkNotNullExpressionValue(c17034evFAEQbTJ, "");
        OKRegularCell oKRegularCell = c17034evFAEQbTJ.AEQbTJ;
        Intrinsics.copydefault(oKRegularCell);
        AEQbTJ(oKRegularCell);
        oKRegularCell.setOnClickListener(new Activity(oKRegularCell, 1000L, this));
        OKRegularCell oKRegularCell2 = c17034evFAEQbTJ.KWHzl;
        Intrinsics.copydefault(oKRegularCell2);
        AEQbTJ(oKRegularCell2);
        oKRegularCell2.setOnClickListener(new ActionBar(oKRegularCell2, 1000L, this));
        constraintLayout.addView(c17034evFAEQbTJ.getRoot());
    }

    public final void AEQbTJ(OKRegularCell oKRegularCell) {
        oKRegularCell.EZpvd().setTextAppearance(C52761wXj.LoaderManager.run);
        oKRegularCell.EZpvd().setTextColor(ContextCompat.getColor(requireContext(), C52761wXj.Activity.fdOvFl));
        oKRegularCell.AEQbTJ().setTextAppearance(C52761wXj.LoaderManager.zuBGHE);
        oKRegularCell.AEQbTJ().setTextColor(ContextCompat.getColor(requireContext(), C52761wXj.Activity.DCUTEIddSDPG));
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
        show(fragmentManager);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Function1<? super java.lang.Integer, Unit> function1;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        if (this.KWHzl != null || (function1 = this.copydefault) == null) {
            return;
        }
        function1.invoke(null);
    }

    /* JADX INFO: renamed from: o.fzD$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fzD.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C19324fzD copydefault() {
            return new C19324fzD();
        }
    }

    /* JADX INFO: renamed from: o.fzD$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C19324fzD EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C19324fzD c19324fzD) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c19324fzD;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.KWHzl = 2;
                Function1 function1 = this.EZpvd.copydefault;
                if (function1 != null) {
                    function1.invoke(2);
                }
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.fzD$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C19324fzD AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C19324fzD c19324fzD) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = c19324fzD;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl = 1;
                Function1 function1 = this.AEQbTJ.copydefault;
                if (function1 != null) {
                    function1.invoke(1);
                }
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }
}
