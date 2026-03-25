package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dpg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14662dpg extends AbstractDialogInterfaceOnKeyListenerC57208yeA {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public AbstractC57212yeE AEQbTJ;
    public int copydefault = -1;
    public java.lang.Float OLrzqt = java.lang.Float.valueOf(0.52f);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA
    public void AEQbTJ(java.lang.Float f) {
        this.OLrzqt = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull AbstractC57212yeE abstractC57212yeE) {
        Intrinsics.checkNotNullParameter(abstractC57212yeE, "");
        this.AEQbTJ = abstractC57212yeE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA, o.AbstractC57671ymn
    public java.lang.Float OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.dpg$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dpg.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C14662dpg newInstance$default(Activity activity, float f, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                f = 0.52f;
            }
            if ((i2 & 2) != 0) {
                i = -1;
            }
            return activity.OLrzqt(f, i);
        }

        public final C14662dpg OLrzqt(float f, int i) {
            C14662dpg c14662dpg = new C14662dpg();
            c14662dpg.AEQbTJ(java.lang.Float.valueOf(f));
            c14662dpg.copydefault = i;
            return c14662dpg;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.yeD.add$default(o.yeD, o.yeE, o.yeE, boolean, boolean, int, java.lang.Object):void */
    @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        C57211yeD c57211yeDKWHzl;
        android.app.Dialog dialog;
        android.view.Window window;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        if (this.copydefault != -1 && (dialog = getDialog()) != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(this.copydefault);
        }
        if (this.AEQbTJ != null && (c57211yeDKWHzl = KWHzl()) != null) {
            AbstractC57212yeE abstractC57212yeE = this.AEQbTJ;
            Intrinsics.copydefault(abstractC57212yeE);
            C57211yeD.add$default(c57211yeDKWHzl, null, abstractC57212yeE, false, false, 8, null);
        }
        view.post(new java.lang.Runnable() { // from class: o.dpe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C14662dpg.copydefault(this.EZpvd);
            }
        });
    }

    public static final void copydefault(C14662dpg c14662dpg) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c14662dpg, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}
