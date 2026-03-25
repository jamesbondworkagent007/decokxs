package o;

import android.content.DialogInterface;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46732tci extends AbstractC52792wYn {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public java.util.ArrayList<C55276xgr> AEQbTJ = new java.util.ArrayList<>();
    public DialogInterface.OnDismissListener KWHzl;
    public int OLrzqt;
    public kFZ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull DialogInterface.OnDismissListener onDismissListener) {
        Intrinsics.checkNotNullParameter(onDismissListener, "");
        this.KWHzl = onDismissListener;
    }

    /* JADX INFO: renamed from: o.tci$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tci.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ C46732tci newInstance$default(TaskDescription taskDescription, java.util.List list, int i, kFZ kfz, int i2, java.lang.Object obj) {
            if ((i2 & 4) != 0) {
                kfz = null;
            }
            return taskDescription.copydefault(list, i, kfz);
        }

        public final C46732tci copydefault(@NotNull java.util.List<java.lang.String> list, int i, kFZ kfz) {
            Intrinsics.checkNotNullParameter(list, "");
            C46732tci c46732tci = new C46732tci();
            if (C33129mqd.KWHzl((java.util.Collection) list)) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    c46732tci.AEQbTJ.add(new C55276xgr((java.lang.String) it.next(), null, null, false, false, null, null, 118, null));
                }
            }
            c46732tci.OLrzqt = i;
            c46732tci.copydefault = kfz;
            return c46732tci;
        }

        /* JADX INFO: renamed from: o.tci$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0962TaskDescription implements kFZ {
            public final /* synthetic */ CancellableContinuation<java.lang.String> EZpvd;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.String> */
            /* JADX WARN: Multi-variable type inference failed */
            public C0962TaskDescription(CancellableContinuation<? super java.lang.String> cancellableContinuation) {
                this.EZpvd = cancellableContinuation;
            }

            @Override // o.kFZ
            public void EZpvd(java.lang.String str, int i) {
                Intrinsics.checkNotNullParameter(str, "");
                if (this.EZpvd.isActive()) {
                    CancellableContinuation<java.lang.String> cancellableContinuation = this.EZpvd;
                    Result.Application application = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(str));
                }
            }
        }

        /* JADX INFO: renamed from: o.tci$TaskDescription$StateListAnimator */
        public static final class StateListAnimator implements DialogInterface.OnDismissListener {
            public final /* synthetic */ CancellableContinuation<java.lang.String> AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.String> */
            /* JADX WARN: Multi-variable type inference failed */
            public StateListAnimator(CancellableContinuation<? super java.lang.String> cancellableContinuation) {
                this.AEQbTJ = cancellableContinuation;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                if (this.AEQbTJ.isActive()) {
                    CancellableContinuation<java.lang.String> cancellableContinuation = this.AEQbTJ;
                    Result.Application application = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(null));
                }
            }
        }

        public final java.lang.Object EZpvd(@NotNull java.util.List<java.lang.String> list, int i, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Continuation<? super java.lang.String> continuation) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            C46732tci c46732tciCopydefault = C46732tci.Companion.copydefault(list, i, new C0962TaskDescription(cancellableContinuationImpl));
            c46732tciCopydefault.OLrzqt(new StateListAnimator(cancellableContinuationImpl));
            c46732tciCopydefault.show(fragmentManager, c46732tciCopydefault.getTag());
            java.lang.Object result = cancellableContinuationImpl.getResult();
            if (result == C56442yFn.copydefault()) {
                C56447yFs.copydefault(continuation);
            }
            return result;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
        android.widget.TextView textViewAEQbTJ = c52781wYc.AEQbTJ();
        if (textViewAEQbTJ != null) {
            textViewAEQbTJ.setVisibility(8);
        }
        if (this.OLrzqt < this.AEQbTJ.size()) {
            this.AEQbTJ.get(this.OLrzqt).copydefault(true);
        }
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        int iOLrzqt = C55298xhM.OLrzqt(12, contextRequireContext);
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        constraintLayout.setPaddingRelative(0, iOLrzqt, 0, C55298xhM.OLrzqt(24, contextRequireContext2));
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        c55198xfS.setType(0);
        c55198xfS.setSingleOneColumnData(this.AEQbTJ, new yHO() { // from class: o.tcj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C46732tci.copydefault(this.AEQbTJ, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        });
    }

    public static final Unit copydefault(C46732tci c46732tci, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        kFZ kfz = c46732tci.copydefault;
        if (kfz != null) {
            kfz.EZpvd(java.lang.String.valueOf(c55276xgr != null ? c55276xgr.AhwBna() : null), CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends C55276xgr>) ((java.util.List<? extends java.lang.Object>) c46732tci.AEQbTJ), c55276xgr));
        }
        c46732tci.OLrzqt = CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends C55276xgr>) ((java.util.List<? extends java.lang.Object>) c46732tci.AEQbTJ), c55276xgr);
        c46732tci.dismiss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.KWHzl;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
