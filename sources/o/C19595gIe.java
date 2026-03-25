package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gIe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19595gIe {
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public static final java.util.HashSet<java.lang.String> KWHzl = new java.util.HashSet<>();
    public static final android.os.Handler AEQbTJ = new android.os.Handler(android.os.Looper.getMainLooper());

    public C19595gIe(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = str;
        this.copydefault = str2;
    }

    /* JADX INFO: renamed from: o.gIe$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gIe.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C19595gIe newInstance$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.value);
            }
            return stateListAnimator.AEQbTJ(str, str2);
        }

        public final C19595gIe AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new C19595gIe(str, str2);
        }
    }

    public final void KWHzl(android.content.Context context) {
        C55097xdX c55097xdX;
        java.util.HashSet<java.lang.String> hashSet = KWHzl;
        if (hashSet.contains(this.copydefault)) {
            return;
        }
        if (context == null) {
            if (C54819xWm.KWHzl().AEQbTJ() == null) {
                c55097xdX = null;
            } else {
                android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
                Intrinsics.checkNotNullExpressionValue(activityAEQbTJ, "");
                c55097xdX = new C55097xdX(activityAEQbTJ, null, 0, 4, null);
            }
        } else {
            c55097xdX = new C55097xdX(context, null, 0, 4, null);
        }
        C55097xdX c55097xdX2 = c55097xdX;
        if (c55097xdX2 == null) {
            return;
        }
        c55097xdX2.setTitle(this.OLrzqt);
        c55097xdX2.setMessage(this.copydefault);
        c55097xdX2.setType(1);
        c55097xdX2.setState(2);
        c55097xdX2.setCloseBtnShow(false);
        hashSet.add(this.copydefault);
        AEQbTJ.postDelayed(new java.lang.Runnable() { // from class: o.gIh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C19595gIe.copydefault(this.EZpvd);
            }
        }, 3000L);
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX2, 3000L, 0, 0, 0, 28, null);
    }

    public static final void copydefault(C19595gIe c19595gIe) {
        KWHzl.remove(c19595gIe.copydefault);
    }
}
