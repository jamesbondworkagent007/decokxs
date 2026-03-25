package o;

import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatDialog;
import o.C33582mzF;

/* JADX INFO: renamed from: o.mzE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@java.lang.Deprecated
public class DialogInterfaceC33581mzE extends AppCompatDialog implements android.content.DialogInterface {
    public final C33582mzF EZpvd;

    public DialogInterfaceC33581mzE(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.StyleRes int i) {
        super(context, AEQbTJ(context, i));
        this.EZpvd = new C33582mzF(getContext(), this, getWindow());
    }

    public static int AEQbTJ(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.StyleRes int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(androidx.appcompat.R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setTitle(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
        this.EZpvd.EZpvd(charSequence);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.EZpvd.KWHzl();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (this.EZpvd.EZpvd(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        if (this.EZpvd.AEQbTJ(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX INFO: renamed from: o.mzE$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public static class TaskDescription {
        public final C33582mzF.Activity AEQbTJ;
        public final int EZpvd;
        public boolean OLrzqt;
        public boolean copydefault;

        public TaskDescription(@androidx.annotation.NonNull android.content.Context context) {
            this(context, DialogInterfaceC33581mzE.AEQbTJ(context, 0));
        }

        public TaskDescription(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.StyleRes int i) {
            this.copydefault = true;
            this.OLrzqt = true;
            this.AEQbTJ = new C33582mzF.Activity(new android.view.ContextThemeWrapper(context, DialogInterfaceC33581mzE.AEQbTJ(context, i)));
            this.EZpvd = i;
        }

        public TaskDescription KWHzl(@androidx.annotation.Nullable java.lang.CharSequence charSequence) {
            this.AEQbTJ.fARcdN = charSequence;
            return this;
        }

        public TaskDescription EZpvd(java.lang.CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            C33582mzF.Activity activity = this.AEQbTJ;
            activity.zuBGHE = charSequence;
            activity.wlaJM = onClickListener;
            return this;
        }

        public TaskDescription KWHzl(java.lang.CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            C33582mzF.Activity activity = this.AEQbTJ;
            activity.fJNWhG = charSequence;
            activity.fIwbmz = onClickListener;
            return this;
        }

        public DialogInterfaceC33581mzE EZpvd() {
            DialogInterfaceC33581mzE dialogInterfaceC33581mzE = new DialogInterfaceC33581mzE(this.AEQbTJ.gEmmrt, this.EZpvd);
            dialogInterfaceC33581mzE.EZpvd.AEQbTJ(this.OLrzqt);
            dialogInterfaceC33581mzE.EZpvd.KWHzl(this.copydefault);
            this.AEQbTJ.copydefault(dialogInterfaceC33581mzE.EZpvd);
            dialogInterfaceC33581mzE.setCancelable(this.AEQbTJ.EZpvd);
            if (this.AEQbTJ.EZpvd) {
                dialogInterfaceC33581mzE.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC33581mzE.setOnCancelListener(this.AEQbTJ.iwGUEr);
            dialogInterfaceC33581mzE.setOnDismissListener(this.AEQbTJ.zLjUOn);
            DialogInterface.OnKeyListener onKeyListener = this.AEQbTJ.AubY;
            if (onKeyListener != null) {
                dialogInterfaceC33581mzE.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC33581mzE;
        }

        public DialogInterfaceC33581mzE AEQbTJ() {
            DialogInterfaceC33581mzE dialogInterfaceC33581mzEEZpvd = EZpvd();
            dialogInterfaceC33581mzEEZpvd.show();
            return dialogInterfaceC33581mzEEZpvd;
        }
    }
}
