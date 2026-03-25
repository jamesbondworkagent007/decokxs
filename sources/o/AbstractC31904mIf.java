package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mIf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC31904mIf extends wXX {
    public static volatile boolean AEQbTJ;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public ViewDataBinding KWHzl;
    public java.lang.String OLrzqt = "";

    public abstract void EZpvd();

    public abstract java.lang.String KWHzl();

    public abstract ViewDataBinding copydefault(@NotNull android.view.LayoutInflater layoutInflater);

    public final ViewDataBinding OLrzqt() {
        ViewDataBinding viewDataBinding = this.KWHzl;
        if (viewDataBinding != null) {
            return viewDataBinding;
        }
        throw new java.lang.IllegalArgumentException((C56524yIo.AEQbTJ(getClass()).valueOf() + " - ViewBinding is only valid between onCreateView and onDestroyView.").toString());
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String string;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "");
        this.KWHzl = copydefault(layoutInflaterFrom);
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("argEncryptedKey")) != null) {
            str = string;
        }
        this.OLrzqt = str;
        constraintLayout.addView(OLrzqt().getRoot(), new ConstraintLayout.LayoutParams(-1, -1));
        EZpvd();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AEQbTJ(this.OLrzqt);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.KWHzl = null;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Companion.AEQbTJ();
    }

    public final void AEQbTJ(java.lang.String str) {
        if (str.length() == 0) {
            return;
        }
        SPUtils.put(str, java.lang.Boolean.TRUE, KWHzl());
    }

    /* JADX INFO: renamed from: o.mIf$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mIf.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ boolean shouldShowIntro$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
            boolean z4 = (i & 4) != 0 ? false : z;
            if ((i & 8) != 0) {
                z2 = true;
            }
            return taskDescription.copydefault(str, str2, z4, z2, (i & 16) != 0 ? false : z3);
        }

        public final boolean copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            java.lang.String strAEQbTJ = C31923mIy.Companion.AEQbTJ();
            java.lang.String strValueOf = C56524yIo.AEQbTJ(TaskDescription.class).valueOf();
            mNP mnp = mNP.AEQbTJ;
            pUU.KWHzl(strAEQbTJ, "[" + strValueOf + "] isE2EEnv() = " + mnp.copydefault());
            if (z3 || z) {
                return true;
            }
            if (mnp.copydefault() || !z2 || str.length() == 0) {
                return false;
            }
            return !SPUtils.getBoolean(str, false, str2);
        }

        public final void AEQbTJ() {
            AbstractC31904mIf.AEQbTJ = false;
        }
    }
}
