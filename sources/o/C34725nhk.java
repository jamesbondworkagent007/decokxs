package o;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import androidx.core.view.KeyEventDispatcher;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nhk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34725nhk extends C32995moB {
    public C34674ngZ KWHzl;
    public java.lang.String copydefault = "";
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    public final C34674ngZ KWHzl() {
        C34674ngZ c34674ngZ = this.KWHzl;
        Intrinsics.copydefault(c34674ngZ);
        return c34674ngZ;
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl().AEQbTJ.setText(str);
        this.copydefault = str;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.app.Dialog dialog;
        android.view.Window window;
        android.view.Window window2;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        android.app.Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.setDimAmount(0.3f);
        }
        android.app.Dialog dialog3 = getDialog();
        if (dialog3 != null && (window = dialog3.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        android.app.Dialog dialog4 = getDialog();
        if (dialog4 != null) {
            dialog4.setCanceledOnTouchOutside(false);
        }
        KeyEventDispatcher.Component activity = getActivity();
        if ((activity instanceof DialogInterface.OnCancelListener) && (dialog = getDialog()) != null) {
            dialog.setOnCancelListener((DialogInterface.OnCancelListener) activity);
        }
        this.KWHzl = C34674ngZ.AEQbTJ(layoutInflater, viewGroup, false);
        return KWHzl().getRoot();
    }

    /* JADX INFO: renamed from: o.nhk$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nhk.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C34725nhk copydefault() {
            return new C34725nhk();
        }
    }
}
