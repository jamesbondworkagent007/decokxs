package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aws, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8129aws {
    public static final C8129aws KWHzl = new C8129aws();

    private C8129aws() {
    }

    public static /* synthetic */ void initInputMethod$easyfloat_release$default(C8129aws c8129aws, android.widget.EditText editText, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        c8129aws.AEQbTJ(editText, str);
    }

    /* JADX INFO: renamed from: o.aws$StateListAnimator */
    public static final class StateListAnimator implements View.OnTouchListener {
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ android.widget.EditText OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.widget.EditText editText, java.lang.String str) {
            this.OLrzqt = editText;
            this.KWHzl = str;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            Intrinsics.checkNotNullExpressionValue(motionEvent, "");
            if (motionEvent.getAction() != 0) {
                return false;
            }
            C8129aws.copydefault(this.OLrzqt, this.KWHzl);
            return false;
        }
    }

    public final void AEQbTJ(@NotNull android.widget.EditText editText, java.lang.String str) {
        Intrinsics.checkNotNullParameter(editText, "");
        editText.setOnTouchListener(new StateListAnimator(editText, str));
    }

    public static /* synthetic */ void openInputMethod$default(android.widget.EditText editText, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        copydefault(editText, str);
    }

    public static final void copydefault(@NotNull android.widget.EditText editText, java.lang.String str) {
        Intrinsics.checkNotNullParameter(editText, "");
        C8053avV c8053avVKWHzl = C8056avY.OLrzqt.KWHzl(str);
        if (c8053avVKWHzl != null) {
            c8053avVKWHzl.gEmmrt().flags = 32;
            c8053avVKWHzl.djBIcL().updateViewLayout(c8053avVKWHzl.AYXKKw(), c8053avVKWHzl.gEmmrt());
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new TaskDescription(editText), 100L);
    }

    /* JADX INFO: renamed from: o.aws$TaskDescription */
    public static final class TaskDescription implements java.lang.Runnable {
        public final /* synthetic */ android.widget.EditText KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.widget.EditText editText) {
            this.KWHzl = editText;
        }

        @Override // java.lang.Runnable
        public final void run() {
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.KWHzl.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.KWHzl, 0);
            }
        }
    }

    public static /* synthetic */ Unit closedInputMethod$default(java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return copydefault(str);
    }

    public static final Unit copydefault(java.lang.String str) {
        C8053avV c8053avVKWHzl = C8056avY.OLrzqt.KWHzl(str);
        if (c8053avVKWHzl == null) {
            return null;
        }
        c8053avVKWHzl.gEmmrt().flags = 40;
        c8053avVKWHzl.djBIcL().updateViewLayout(c8053avVKWHzl.AYXKKw(), c8053avVKWHzl.gEmmrt());
        return Unit.INSTANCE;
    }
}
