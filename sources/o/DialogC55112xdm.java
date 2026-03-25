package o;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatDialog;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xdm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class DialogC55112xdm extends AppCompatDialog {
    public wZJ EZpvd;
    public long OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(long j) {
        this.OLrzqt = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC55112xdm(@NotNull android.content.Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = 500L;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        wZJ wzjOLrzqt = wZJ.OLrzqt(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(wzjOLrzqt, "");
        setContentView(wzjOLrzqt.getRoot());
        wzjOLrzqt.getRoot().setContentDescription("blockLoading");
        this.EZpvd = wzjOLrzqt;
        android.view.Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.width = -1;
            android.content.Context context = window.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iAEQbTJ = C55302xhQ.AEQbTJ(context);
            android.content.Context context2 = window.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            layoutParams.height = iAEQbTJ - C55302xhQ.EZpvd(context2);
            window.setAttributes(layoutParams);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        wZJ wzj = this.EZpvd;
        if (wzj == null) {
            Intrinsics.gEmmrt("");
            wzj = null;
        }
        C55113xdn c55113xdn = wzj.AEQbTJ;
        c55113xdn.getViewTreeObserver().addOnGlobalLayoutListener(new TaskDescription(c55113xdn));
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    /* JADX INFO: renamed from: o.xdm$TaskDescription */
    public static final class TaskDescription implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ C55113xdn EZpvd;

        public TaskDescription(C55113xdn c55113xdn) {
            this.EZpvd = c55113xdn;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.EZpvd.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            android.content.Context context = this.EZpvd.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55302xhQ.OLrzqt(context) / 2;
            int width = this.EZpvd.getWidth() / 2;
            android.content.Context context2 = this.EZpvd.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iAEQbTJ = C55302xhQ.AEQbTJ(context2) / 2;
            int height = this.EZpvd.getHeight() / 2;
            android.content.Context context3 = this.EZpvd.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            int iEZpvd = C55302xhQ.EZpvd(context3);
            this.EZpvd.setX(iOLrzqt - width);
            this.EZpvd.setY((iAEQbTJ - height) - iEZpvd);
        }
    }

    public final C55113xdn KWHzl() {
        wZJ wzj = this.EZpvd;
        if (wzj == null) {
            Intrinsics.gEmmrt("");
            wzj = null;
        }
        C55113xdn c55113xdn = wzj.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        return c55113xdn;
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onStart() {
        super.onStart();
        wZJ wzj = this.EZpvd;
        if (wzj == null) {
            Intrinsics.gEmmrt("");
            wzj = null;
        }
        wzj.AEQbTJ.KWHzl(this.OLrzqt);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onStop() {
        super.onStop();
        wZJ wzj = this.EZpvd;
        if (wzj == null) {
            Intrinsics.gEmmrt("");
            wzj = null;
        }
        wzj.AEQbTJ.copydefault();
    }
}
