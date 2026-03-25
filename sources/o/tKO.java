package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.mln_ui.ui.okkit.UdMath;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tKO extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public AbstractC46260tNt AEQbTJ;

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tKO.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final tKO copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("arg_twitter_follower_count", str);
            bundle.putString("arg_twitter_followee_count", str2);
            tKO tko = new tKO();
            tko.setArguments(bundle);
            return tko;
        }
    }

    public final java.lang.String KWHzl() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("arg_twitter_follower_count", "0")) == null) ? "0" : string;
    }

    public final java.lang.String copydefault() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("arg_twitter_followee_count", "0")) == null) ? "0" : string;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AEQbTJ = AbstractC46260tNt.copydefault(getLayoutInflater(), constraintLayout, true);
        EZpvd();
    }

    private final void EZpvd() {
        AbstractC46260tNt abstractC46260tNt = this.AEQbTJ;
        if (abstractC46260tNt == null) {
            return;
        }
        java.lang.String numberKmb = UdMath.formatNumberKmb(KWHzl(), 1, 2, 0, 0);
        java.lang.String numberKmb2 = UdMath.formatNumberKmb(copydefault(), 1, 2, 0, 0);
        abstractC46260tNt.KWHzl(numberKmb);
        abstractC46260tNt.AEQbTJ(numberKmb2);
        abstractC46260tNt.executePendingBindings();
    }
}
