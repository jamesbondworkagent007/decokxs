package o;

import android.view.View;
import androidx.core.os.BundleKt;
import com.okinc.auth.api.passkey.PasskeyPromotionSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aMZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C6290aMZ extends AbstractC52785wYg {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public Function0<Unit> EZpvd;
    public Function0<Unit> OLrzqt;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.aMY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6290aMZ.copydefault(this.KWHzl);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function0<Unit> function0) {
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function0<Unit> function0) {
        this.EZpvd = function0;
    }

    /* JADX INFO: renamed from: o.aMZ$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aMZ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C6290aMZ KWHzl(PasskeyPromotionSource passkeyPromotionSource) {
            C6290aMZ c6290aMZ = new C6290aMZ();
            c6290aMZ.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_SOURCE", passkeyPromotionSource)));
            return c6290aMZ;
        }
    }

    private final PasskeyPromotionSource KWHzl() {
        return (PasskeyPromotionSource) this.copydefault.getValue();
    }

    public static final PasskeyPromotionSource copydefault(C6290aMZ c6290aMZ) {
        android.os.Bundle arguments = c6290aMZ.getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("ARG_SOURCE") : null;
        if (serializable instanceof PasskeyPromotionSource) {
            return (PasskeyPromotionSource) serializable;
        }
        return null;
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.AbstractC52785wYg
    public void AEQbTJ(@NotNull C54954xan c54954xan) {
        Intrinsics.checkNotNullParameter(c54954xan, "");
        c54954xan.KWHzl.setImageResource(C52761wXj.TaskDescription.FdcJU);
        c54954xan.AEQbTJ.setText(C33070mpX.AYXKKw(C8206ayP.Dialog.fsSxsn));
        c54954xan.OLrzqt.setText(C33070mpX.AYXKKw(C8206ayP.Dialog.hlkKmr));
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C8206ayP.Dialog.RAQtXZ));
        if (KWHzl() == PasskeyPromotionSource.SIGNUP || KWHzl() == PasskeyPromotionSource.LOGIN) {
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOKDSType(80);
            }
        } else {
            C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
            if (c52794wYpCopydefault2 != null) {
                c52794wYpCopydefault2.setOKDSType(257);
            }
        }
        C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
        if (c52794wYpCopydefault3 != null) {
            c52794wYpCopydefault3.setOnClickListener(new Application(c52794wYpCopydefault3, 1000L, this));
        }
        wyf.setType(7);
        wyf.setSecondaryText(C33070mpX.AYXKKw(C8206ayP.Dialog.zLjUOn));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.aNa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C6290aMZ.OLrzqt(this.copydefault, view);
                }
            });
        }
        C52794wYp c52794wYpCopydefault4 = wyf.copydefault();
        if (c52794wYpCopydefault4 != null) {
            c52794wYpCopydefault4.setContentDescription("continueButton");
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setContentDescription("cancelButton");
        }
    }

    public static final void OLrzqt(C6290aMZ c6290aMZ, android.view.View view) {
        c6290aMZ.dismissAllowingStateLoss();
        Function0<Unit> function0 = c6290aMZ.EZpvd;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: o.aMZ$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C6290aMZ EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C6290aMZ c6290aMZ) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c6290aMZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
                Function0<Unit> function0EZpvd = this.EZpvd.EZpvd();
                if (function0EZpvd != null) {
                    function0EZpvd.invoke();
                }
            }
        }
    }
}
