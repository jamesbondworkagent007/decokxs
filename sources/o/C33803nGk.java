package o;

import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nGk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33803nGk extends AbstractC32996moC {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final int AEQbTJ = C35399nuc.Dialog.invokespecialaKhcqp;
    public nOJ KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        nOJ nojAEQbTJ = nOJ.AEQbTJ(view);
        this.KWHzl = nojAEQbTJ;
        if (nojAEQbTJ != null) {
            nojAEQbTJ.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.nGi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C33803nGk.KWHzl(this.AEQbTJ, view2);
                }
            });
        }
        view.post(new java.lang.Runnable() { // from class: o.nGh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C33803nGk.copydefault(this.AEQbTJ);
            }
        });
    }

    public static final void KWHzl(C33803nGk c33803nGk, android.view.View view) {
        InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class);
        android.content.Context contextRequireContext = c33803nGk.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, contextRequireContext, null, 2, null);
    }

    public static final void copydefault(C33803nGk c33803nGk) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c33803nGk, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.KWHzl = null;
    }

    /* JADX INFO: renamed from: o.nGk$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nGk.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C33803nGk KWHzl() {
            return new C33803nGk();
        }
    }
}
