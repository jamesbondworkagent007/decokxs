package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.okpaymentapi.data.remote.model.management.Localization;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lAZ extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public com.okinc.okpaymentapi.data.remote.model.management.Channel EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        this.EZpvd = channel;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Localization localization;
        Localization localization2;
        Localization localization3;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC31452luL abstractC31452luLEZpvd = AbstractC31452luL.EZpvd(android.view.LayoutInflater.from(getContext()));
        Intrinsics.checkNotNullExpressionValue(abstractC31452luLEZpvd, "");
        android.widget.TextView textView = abstractC31452luLEZpvd.AEQbTJ;
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel = this.EZpvd;
        java.lang.String googleWalletBottomSheetDescSecondPar = null;
        textView.setText((channel == null || (localization3 = channel.getLocalization()) == null) ? null : localization3.getGoogleWalletBottomSheetTitle());
        android.widget.TextView textView2 = abstractC31452luLEZpvd.KWHzl;
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel2 = this.EZpvd;
        textView2.setText((channel2 == null || (localization2 = channel2.getLocalization()) == null) ? null : localization2.getGoogleWalletBottomSheetDescFirstPar());
        android.widget.TextView textView3 = abstractC31452luLEZpvd.copydefault;
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel3 = this.EZpvd;
        if (channel3 != null && (localization = channel3.getLocalization()) != null) {
            googleWalletBottomSheetDescSecondPar = localization.getGoogleWalletBottomSheetDescSecondPar();
        }
        textView3.setText(googleWalletBottomSheetDescSecondPar);
        C52794wYp c52794wYp = abstractC31452luLEZpvd.OLrzqt;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        constraintLayout.addView(abstractC31452luLEZpvd.getRoot(), new ConstraintLayout.LayoutParams(-1, -1));
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lAZ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final lAZ OLrzqt(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
            Intrinsics.checkNotNullParameter(channel, "");
            lAZ laz = new lAZ();
            laz.EZpvd(channel);
            return laz;
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ lAZ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, lAZ laz) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = laz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }
}
