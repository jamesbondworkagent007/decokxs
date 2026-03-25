package com.okinc.auth.impl.passkey.ui.crossdevice.master;

import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyIncompatibleV2BottomFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC6086aIh;
import o.C33070mpX;
import o.C52761wXj;
import o.C52794wYp;
import o.C55296xhK;
import o.C56390yDp;
import o.C56392yDr;
import o.C58893zTh;
import o.C6611aSc;
import o.C8206ayP;
import o.C8268azY;
import o.InterfaceC56387yDm;
import o.wXQ;
import o.yCM;
import org.jetbrains.annotations.NotNull;
import uniffi.account.LostPasskeyButtonName;
import uniffi.account.LostPasskeyDevice;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyIncompatibleV2BottomFragment extends AbstractC6086aIh {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int gEmmrt = 8;
    public Function0<Unit> djBIcL;

    @yCM
    public C58893zTh passkeyTracker;
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.aIG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(PasskeyIncompatibleV2BottomFragment.OLrzqt(this.copydefault));
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.aIM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(PasskeyIncompatibleV2BottomFragment.KWHzl(this.KWHzl));
        }
    });

    public final C58893zTh AhwBna() {
        C58893zTh c58893zTh = this.passkeyTracker;
        if (c58893zTh != null) {
            return c58893zTh;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyIncompatibleV2BottomFragment.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.auth.impl.passkey.ui.crossdevice.master.PasskeyIncompatibleV2BottomFragment$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PasskeyIncompatibleV2BottomFragment newInstance$default(ActionBar actionBar, Function0 function0, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            return actionBar.OLrzqt(function0, z, z2);
        }

        public final PasskeyIncompatibleV2BottomFragment OLrzqt(Function0<Unit> function0, boolean z, boolean z2) {
            PasskeyIncompatibleV2BottomFragment passkeyIncompatibleV2BottomFragment = new PasskeyIncompatibleV2BottomFragment();
            passkeyIncompatibleV2BottomFragment.djBIcL = function0;
            passkeyIncompatibleV2BottomFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_IS_CURRENT_DEVICE", Boolean.valueOf(z)), C56390yDp.OLrzqt("KEY_IS_SINGLE_FIDO1_V1_PASSKEY", Boolean.valueOf(z2))));
            return passkeyIncompatibleV2BottomFragment;
        }
    }

    /* JADX DEBUG: Possible override for method o.aIh.EZpvd()V */
    public final boolean EZpvd() {
        return ((Boolean) this.AYXKKw.getValue()).booleanValue();
    }

    public static final boolean OLrzqt(PasskeyIncompatibleV2BottomFragment passkeyIncompatibleV2BottomFragment) {
        Bundle arguments = passkeyIncompatibleV2BottomFragment.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("KEY_IS_CURRENT_DEVICE");
        }
        return false;
    }

    public final boolean djBIcL() {
        return ((Boolean) this.valueOf.getValue()).booleanValue();
    }

    public static final boolean KWHzl(PasskeyIncompatibleV2BottomFragment passkeyIncompatibleV2BottomFragment) {
        Bundle arguments = passkeyIncompatibleV2BottomFragment.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("KEY_IS_SINGLE_FIDO1_V1_PASSKEY");
        }
        return false;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setStyle(0);
        setCancelable(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        final LostPasskeyDevice lostPasskeyDevice;
        String strAYXKKw;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        if (EZpvd() && djBIcL()) {
            lostPasskeyDevice = LostPasskeyDevice.ON_DEVICE_SINGLE;
        } else if (EZpvd() && !djBIcL()) {
            lostPasskeyDevice = LostPasskeyDevice.ON_DEVICE_MULTIPLE;
        } else if (EZpvd() || !djBIcL()) {
            lostPasskeyDevice = (EZpvd() || djBIcL()) ? LostPasskeyDevice.ON_DEVICE_SINGLE : LostPasskeyDevice.CROSS_DEVICE_MULTIPLE;
        } else {
            lostPasskeyDevice = LostPasskeyDevice.CROSS_DEVICE_SINGLE;
        }
        C8268azY c8268azYEZpvd = C8268azY.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        c8268azYEZpvd.KWHzl.setNavigationIconVisible(false);
        c8268azYEZpvd.KWHzl.setRightIconVisible(true);
        c8268azYEZpvd.KWHzl.setRightIcon(C52761wXj.TaskDescription.alsFma);
        c8268azYEZpvd.KWHzl.setRightIconOnClickListener(new Function0() { // from class: o.aIK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PasskeyIncompatibleV2BottomFragment.AEQbTJ(this.EZpvd, lostPasskeyDevice);
            }
        });
        ImageView imageView = c8268azYEZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C6611aSc.showStatusLottieAnimation$default(imageView, C52761wXj.PendingIntent.ejfBZ, 0, 2, null);
        TextView textView = c8268azYEZpvd.OLrzqt;
        if (djBIcL()) {
            strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.DNMMPQ);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C8206ayP.Dialog.OTwTPd);
        }
        textView.setText(strAYXKKw);
        c8268azYEZpvd.AEQbTJ.setText(C33070mpX.AYXKKw(C8206ayP.Dialog.dUDNAs));
        C52794wYp c52794wYp = c8268azYEZpvd.AEQbTJ;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this, lostPasskeyDevice));
        AhwBna().AEQbTJ(lostPasskeyDevice);
    }

    public static final Unit AEQbTJ(PasskeyIncompatibleV2BottomFragment passkeyIncompatibleV2BottomFragment, LostPasskeyDevice lostPasskeyDevice) {
        passkeyIncompatibleV2BottomFragment.AhwBna().OLrzqt(lostPasskeyDevice, LostPasskeyButtonName.CLOSE);
        passkeyIncompatibleV2BottomFragment.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ LostPasskeyDevice AEQbTJ;
        public final /* synthetic */ PasskeyIncompatibleV2BottomFragment EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, PasskeyIncompatibleV2BottomFragment passkeyIncompatibleV2BottomFragment, LostPasskeyDevice lostPasskeyDevice) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = passkeyIncompatibleV2BottomFragment;
            this.AEQbTJ = lostPasskeyDevice;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.AhwBna().OLrzqt(this.AEQbTJ, LostPasskeyButtonName.RESET);
                this.EZpvd.dismissAllowingStateLoss();
                Function0 function0 = this.EZpvd.djBIcL;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }
}
