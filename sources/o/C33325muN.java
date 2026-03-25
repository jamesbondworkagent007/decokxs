package o;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33160mrH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.muN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C33325muN extends C57642ymK {
    public float OLrzqt;
    public float copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(float f) {
        this.OLrzqt = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(float f) {
        this.copydefault = f;
    }

    /* JADX INFO: renamed from: o.muN$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.muN.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C33325muN copydefault() {
            return new C33325muN();
        }
    }

    @Override // o.C57642ymK, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        android.widget.FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(view, "");
        setPushContent$default(this, C33070mpX.AYXKKw(C33160mrH.TaskDescription.getFieldNames), null, 2, null);
        OLrzqt(new Function0() { // from class: o.muL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C33325muN.EZpvd();
            }
        });
        OLrzqt(1);
        AEQbTJ(2);
        KWHzl(3L);
        KWHzl(C33570myu.valueOf(getContext()) - C33570myu.OLrzqt());
        copydefault(C33052mpF.dp2px$default(16.0f, null, 1, null), C33052mpF.dp2px$default(16.0f, null, 1, null), C33052mpF.dp2px$default(16.0f, null, 1, null), C33052mpF.dp2px$default(16.0f, null, 1, null));
        super.onViewCreated(view, bundle);
        mPH mphCopydefault = copydefault();
        if (mphCopydefault == null || (frameLayout = mphCopydefault.KWHzl) == null) {
            return;
        }
        frameLayout.setOnTouchListener(new ActionBar());
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.muN$ActionBar */
    public static final class ActionBar implements View.OnTouchListener {
        public ActionBar() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            if (motionEvent != null && motionEvent.getAction() == 0) {
                C33325muN.this.copydefault(motionEvent != null ? motionEvent.getY() : 0.0f);
                return false;
            }
            if (motionEvent == null || motionEvent.getAction() != 1) {
                return false;
            }
            C33325muN.this.OLrzqt(motionEvent != null ? motionEvent.getY() : 0.0f);
            if (C33325muN.this.AEQbTJ() - C33325muN.this.OLrzqt() <= 20.0f) {
                return false;
            }
            C33325muN.this.dismissAllowingStateLoss();
            return true;
        }
    }

    public static /* synthetic */ void setPushContent$default(C33325muN c33325muN, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        c33325muN.copydefault(str, str2);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EZpvd(str);
        AEQbTJ(str2);
        EZpvd(48);
        KWHzl(C33052mpF.dp2px$default(44.0f, null, 1, null) - C33570myu.OLrzqt());
        copydefault(C33052mpF.dp2px$default(16.0f, null, 1, null), C33052mpF.dp2px$default(16.0f, null, 1, null), C33052mpF.dp2px$default(16.0f, null, 1, null), 0);
    }

    @Override // o.C57642ymK, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        android.view.Window window;
        super.onStart();
        android.app.Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(C33160mrH.PendingIntent.KWHzl);
    }
}
