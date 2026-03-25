package o;

import android.view.View;
import com.okinc.unify_trade.biz.SignalBotSignParamsResult;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotSignParamsPresenter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vYq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50714vYq extends AbstractC54505xKx<AbstractC50753vaB, SignalBotSignParamsPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    @Override // o.AbstractC54505xKx
    public boolean bs_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.HJWChPQdUnVm;
    }

    public static final /* synthetic */ AbstractC50753vaB OLrzqt(C50714vYq c50714vYq) {
        return c50714vYq.gGvvIC();
    }

    /* JADX INFO: renamed from: o.vYq$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vYq.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C50714vYq newInstance$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, SignalBotSignParamsResult signalBotSignParamsResult, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return stateListAnimator.copydefault(str, str2, signalBotSignParamsResult);
        }

        public final C50714vYq copydefault(@NotNull java.lang.String str, java.lang.String str2, SignalBotSignParamsResult signalBotSignParamsResult) {
            Intrinsics.checkNotNullParameter(str, "");
            C50714vYq c50714vYq = new C50714vYq();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("action_type", str);
            bundle.putString("trade_type", str2);
            bundle.putParcelable("data", signalBotSignParamsResult);
            c50714vYq.setArguments(bundle);
            return c50714vYq;
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getString("type");
        }
        android.widget.TextView textView = gGvvIC().AEQbTJ;
        SignalBotSignParamsPresenter signalBotSignParamsPresenterDxcTrN = dxcTrN();
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("action_type")) == null) {
            string = "";
        }
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 != null && (string2 = arguments3.getString("trade_type")) != null) {
            str = string2;
        }
        android.os.Bundle arguments4 = getArguments();
        textView.setText(signalBotSignParamsPresenterDxcTrN.OLrzqt(string, str, arguments4 != null ? (SignalBotSignParamsResult) arguments4.getParcelable("data") : null));
        android.widget.ImageView imageView = gGvvIC().OLrzqt;
        imageView.setOnClickListener(new Activity(imageView, 1000L, this));
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.vYq$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C50714vYq AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C50714vYq c50714vYq) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c50714vYq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C33570myu.EZpvd(this.AEQbTJ.requireContext(), C50714vYq.OLrzqt(this.AEQbTJ).AEQbTJ.getText().toString());
                C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.addQueueItem), 0, 1, (java.lang.Object) null);
            }
        }
    }
}
