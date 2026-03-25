package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.itk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25281itk {
    public java.lang.String AEQbTJ;
    public java.lang.String KWHzl;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public static final java.util.HashSet<java.lang.String> OLrzqt = new java.util.HashSet<>();
    public static final android.os.Handler EZpvd = new android.os.Handler(android.os.Looper.getMainLooper());

    public C25281itk(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.KWHzl = str2;
    }

    /* JADX INFO: renamed from: o.itk$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.itk.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C25281itk newInstance$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = C33070mpX.AYXKKw(C23274hvD.Fragment.getContract);
            }
            return actionBar.OLrzqt(str, str2);
        }

        public final C25281itk OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new C25281itk(str, str2);
        }
    }

    public final void AEQbTJ(android.content.Context context) {
        C55097xdX c55097xdX;
        java.util.HashSet<java.lang.String> hashSet = OLrzqt;
        if (hashSet.contains(this.KWHzl)) {
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
        c55097xdX2.setTitle(this.AEQbTJ);
        c55097xdX2.setMessage(this.KWHzl);
        c55097xdX2.setType(1);
        c55097xdX2.setState(2);
        c55097xdX2.setCloseBtnShow(false);
        hashSet.add(this.KWHzl);
        EZpvd.postDelayed(new java.lang.Runnable() { // from class: o.itn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C25281itk.OLrzqt(this.KWHzl);
            }
        }, 3000L);
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX2, 3000L, 0, 0, 0, 28, null);
    }

    public static final void OLrzqt(C25281itk c25281itk) {
        OLrzqt.remove(c25281itk.KWHzl);
    }
}
