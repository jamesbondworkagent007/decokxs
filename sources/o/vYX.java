package o;

import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentContainerView;
import com.okinc.unify_trade.biz.SignalListItem;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotSignIntroPresenter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C50710vYm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class vYX extends AbstractC49945uyC<uWP, SignalBotSignIntroPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final int copydefault = C48033uCm.Activity.GFUIi;
    public boolean AEQbTJ = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.copydefault;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vYX.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void OLrzqt(@NotNull SignalListItem signalListItem, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(signalListItem, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            vYX vyx = new vYX();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", signalListItem);
            vyx.setArguments(bundle);
            vyx.show(fragmentManager, vYX.class.getSimpleName());
        }
    }

    @Override // o.AbstractC49945uyC, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        copydefault();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AuCTel();
        isConnected();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(3);
        android.widget.TextView textViewAYXKKw = wxq.AYXKKw();
        SignalListItem signalListItemEZpvd = OLrzqt().EZpvd();
        textViewAYXKKw.setText(signalListItemEZpvd != null ? signalListItemEZpvd.getSignalChanName() : null);
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(false);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
    }

    private final void copydefault() {
        SignalBotSignIntroPresenter signalBotSignIntroPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        signalBotSignIntroPresenterOLrzqt.EZpvd(arguments != null ? (SignalListItem) arguments.getParcelable("data") : null);
    }

    private final void AuCTel() {
        android.widget.TextView textView = values().AEQbTJ;
        SignalListItem signalListItemEZpvd = OLrzqt().EZpvd();
        java.lang.String signalDescription = signalListItemEZpvd != null ? signalListItemEZpvd.getSignalDescription() : null;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.newSessionWithExtras);
        if (signalDescription == null || signalDescription.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) signalDescription)) {
            signalDescription = strAYXKKw;
        }
        textView.setText(signalDescription);
        if (OLrzqt().copydefault()) {
            FragmentContainerView fragmentContainerView = values().EZpvd;
            Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "");
            fragmentContainerView.setVisibility(0);
            android.widget.TextView textView2 = values().KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
            int i = C48033uCm.Application.ActivityResultLauncherHolder;
            C50710vYm.StateListAnimator stateListAnimator = C50710vYm.Companion;
            SignalListItem signalListItemEZpvd2 = OLrzqt().EZpvd();
            fragmentTransactionBeginTransaction.replace(i, stateListAnimator.copydefault(signalListItemEZpvd2 != null ? signalListItemEZpvd2.getSignalChanId() : null));
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
            values().AEQbTJ.post(new java.lang.Runnable() { // from class: o.vYY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    vYX.copydefault(this.OLrzqt);
                }
            });
            return;
        }
        FragmentContainerView fragmentContainerView2 = values().EZpvd;
        Intrinsics.checkNotNullExpressionValue(fragmentContainerView2, "");
        fragmentContainerView2.setVisibility(8);
        C52794wYp c52794wYp = values().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(8);
        android.widget.TextView textView3 = values().KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(8);
        android.widget.TextView textView4 = values().copydefault;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(8);
    }

    public static final void copydefault(vYX vyx) {
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(vyx.values().AEQbTJ.getLineCount()), 2)) {
            vyx.EZpvd(vyx.AEQbTJ);
        }
    }

    private final void isConnected() {
        android.widget.TextView textView = values().copydefault;
        textView.setOnClickListener(new ActionBar(textView, 1000L, this));
        C52794wYp c52794wYp = values().OLrzqt;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
    }

    public final void EZpvd(boolean z) {
        android.widget.TextView textView = values().copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        values().copydefault.setText(C33070mpX.AYXKKw(z ? C55688xof.Application.r8lambdatX1ZAZ_6mxGyPSL59qbNSbD0n4g : C55688xof.Application.invokeSuspendlambda1));
        values().AEQbTJ.setMaxLines(z ? 2 : Integer.MAX_VALUE);
        values().AEQbTJ.setEllipsize(TextUtils.TruncateAt.END);
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ vYX AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, vYX vyx) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = vyx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.AEQbTJ = !r7.AEQbTJ;
                vYX vyx = this.AEQbTJ;
                vyx.EZpvd(vyx.AEQbTJ);
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ vYX AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, vYX vyx) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = vyx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ vYX KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, vYX vyx) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = vyx;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C33569myt.copydefault(this.KWHzl.requireContext(), android.net.Uri.parse(C33070mpX.AYXKKw(C55688xof.Application.getView)));
            }
        }
    }
}
