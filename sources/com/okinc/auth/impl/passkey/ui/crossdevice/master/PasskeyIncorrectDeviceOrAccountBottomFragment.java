package com.okinc.auth.impl.passkey.ui.crossdevice.master;

import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC6085aIg;
import o.C33070mpX;
import o.C52761wXj;
import o.C52781wYc;
import o.C52794wYp;
import o.C55296xhK;
import o.C58893zTh;
import o.C6611aSc;
import o.C8206ayP;
import o.C8269azZ;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyIncorrectDeviceOrAccountBottomFragment extends AbstractC6085aIg {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int valueOf = 8;
    public Function0<Unit> gEmmrt;

    @yCM
    public C58893zTh passkeyTracker;

    /* JADX DEBUG: Possible override for method o.aIg.OLrzqt()V */
    public final C58893zTh OLrzqt() {
        C58893zTh c58893zTh = this.passkeyTracker;
        if (c58893zTh != null) {
            return c58893zTh;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyIncorrectDeviceOrAccountBottomFragment.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyIncorrectDeviceOrAccountBottomFragment$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PasskeyIncorrectDeviceOrAccountBottomFragment newInstance$default(StateListAnimator stateListAnimator, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            return stateListAnimator.copydefault(function0);
        }

        public final PasskeyIncorrectDeviceOrAccountBottomFragment copydefault(Function0<Unit> function0) {
            PasskeyIncorrectDeviceOrAccountBottomFragment passkeyIncorrectDeviceOrAccountBottomFragment = new PasskeyIncorrectDeviceOrAccountBottomFragment();
            passkeyIncorrectDeviceOrAccountBottomFragment.gEmmrt = function0;
            return passkeyIncorrectDeviceOrAccountBottomFragment;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C8269azZ c8269azZAEQbTJ = C8269azZ.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        ImageView imageView = c8269azZAEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C6611aSc.showStatusLottieAnimation$default(imageView, C52761wXj.PendingIntent.ejfBZ, 0, 2, null);
        c8269azZAEQbTJ.AEQbTJ.setText(C33070mpX.AYXKKw(C8206ayP.Dialog.Swccd));
        c8269azZAEQbTJ.AEQbTJ.setContentDescription("okButton");
        C52794wYp c52794wYp = c8269azZAEQbTJ.AEQbTJ;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
        OLrzqt().AEQbTJ();
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ PasskeyIncorrectDeviceOrAccountBottomFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, PasskeyIncorrectDeviceOrAccountBottomFragment passkeyIncorrectDeviceOrAccountBottomFragment) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = passkeyIncorrectDeviceOrAccountBottomFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
                Function0 function0 = this.copydefault.gEmmrt;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
