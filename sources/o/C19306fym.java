package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C19306fym extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public Function0<Unit> OLrzqt;

    /* JADX INFO: renamed from: o.fym$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fym.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(9);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC16473ekb abstractC16473ekbCopydefault = AbstractC16473ekb.copydefault(getLayoutInflater(), constraintLayout, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16473ekbCopydefault, "");
        AppCompatImageView appCompatImageView = abstractC16473ekbCopydefault.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C14677dpv.OLrzqt(appCompatImageView, CDNSourceManager.ImageSource.CreateWalletIcon);
        AppCompatTextView appCompatTextView = abstractC16473ekbCopydefault.KWHzl;
        android.os.Bundle arguments = getArguments();
        appCompatTextView.setText(arguments != null ? arguments.getString("title") : null);
        AppCompatTextView appCompatTextView2 = abstractC16473ekbCopydefault.copydefault;
        android.os.Bundle arguments2 = getArguments();
        appCompatTextView2.setText(arguments2 != null ? arguments2.getString("sub_title") : null);
        AppCompatTextView appCompatTextView3 = abstractC16473ekbCopydefault.copydefault;
        android.os.Bundle arguments3 = getArguments();
        appCompatTextView3.setGravity((arguments3 == null || arguments3.getInt("sub_title_align", 0) != 0) ? 8388611 : 1);
        C52794wYp c52794wYpAEQbTJ = abstractC16473ekbCopydefault.EZpvd.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setVisibility(8);
        }
        C52794wYp c52794wYpCopydefault = abstractC16473ekbCopydefault.EZpvd.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new TaskDescription(c52794wYpCopydefault, 1000L, this));
        }
        constraintLayout.addView(abstractC16473ekbCopydefault.getRoot());
    }

    /* JADX INFO: renamed from: o.fym$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C19306fym AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C19306fym c19306fym) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = c19306fym;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function0 function0 = this.AEQbTJ.OLrzqt;
                if (function0 != null) {
                    function0.invoke();
                }
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }
}
