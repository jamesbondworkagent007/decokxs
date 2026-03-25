package o;

import android.view.View;
import androidx.appcompat.app.AppCompatDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xhh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class DialogC55319xhh extends AppCompatDialog {
    public C54929xaO AEQbTJ;
    public final int EZpvd;
    public final android.os.Handler KWHzl;
    public android.app.Activity OLrzqt;
    public long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54929xaO KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC55319xhh(@NotNull android.app.Activity activity, long j) {
        super(activity, C52761wXj.LoaderManager.gkJEwt);
        Intrinsics.checkNotNullParameter(activity, "");
        this.OLrzqt = activity;
        this.copydefault = j;
        this.AEQbTJ = C54929xaO.EZpvd(android.view.LayoutInflater.from(activity));
        this.KWHzl = new StateListAnimator(android.os.Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: o.xhh$StateListAnimator */
    public static final class StateListAnimator extends android.os.Handler {
        public StateListAnimator(android.os.Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            Intrinsics.checkNotNullParameter(message, "");
            super.handleMessage(message);
            try {
                if (DialogC55319xhh.this.isShowing()) {
                    DialogC55319xhh.this.dismiss();
                }
            } catch (java.lang.Exception e) {
                pUU.copydefault("OKToastDialog", e.toString());
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        ConstraintLayout root;
        super.onCreate(bundle);
        C54929xaO c54929xaO = this.AEQbTJ;
        if (c54929xaO != null && (root = c54929xaO.getRoot()) != null) {
            setContentView(root);
            root.setOnClickListener(new View.OnClickListener() { // from class: o.xhl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    DialogC55319xhh.AEQbTJ(this.KWHzl, view);
                }
            });
        }
        this.KWHzl.removeMessages(this.EZpvd);
        android.os.Handler handler = this.KWHzl;
        handler.sendMessageDelayed(handler.obtainMessage(this.EZpvd, this), this.copydefault);
    }

    public static final void AEQbTJ(DialogC55319xhh dialogC55319xhh, android.view.View view) {
        dialogC55319xhh.dismiss();
    }
}
