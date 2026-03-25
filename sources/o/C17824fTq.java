package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.business.defi.api.bean.ActivateTeeGuideModel;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC17792fSl;
import o.C13754dXa;
import o.C52761wXj;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fTq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17824fTq extends AbstractC32996moC {
    public final ActivityResultLauncher<ActivateTeeGuideModel> KWHzl;
    public final int copydefault = C13754dXa.TaskDescription.QfJbVf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    public C17824fTq() {
        ActivityResultLauncher<ActivateTeeGuideModel> activityResultLauncherRegisterForActivityResult = registerForActivityResult(ActivityC17792fSl.ActionBar.KWHzl, new ActivityResultCallback() { // from class: o.fTv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C17824fTq.AEQbTJ(this.copydefault, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.KWHzl = activityResultLauncherRegisterForActivityResult;
    }

    public static final void AEQbTJ(C17824fTq c17824fTq, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            FragmentActivity activity = c17824fTq.getActivity();
            if (activity != null) {
                activity.setResult(-1);
            }
            FragmentActivity activity2 = c17824fTq.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C16584emg c16584emgEZpvd = C16584emg.EZpvd(view);
        Intrinsics.checkNotNullExpressionValue(c16584emgEZpvd, "");
        C33537myN c33537myN = c16584emgEZpvd.valueOf;
        c33537myN.setAppBarColor(0);
        c33537myN.setStatusBarVisible(4);
        c33537myN.setBackVisible(0);
        c33537myN.setBackImage(C52761wXj.TaskDescription.alsFma);
        EZpvd(c16584emgEZpvd);
        java.lang.String str = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ODWQjV) + "\u200b";
        java.lang.String str2 = C33069mpW.copydefault(C13754dXa.FragmentManager.QWSkGZ, C56423yEv.EZpvd(C56390yDp.OLrzqt("learn", str))) + "\u200b";
        c16584emgEZpvd.AYXKKw.setText(C33061mpO.setupSpanStyles$default(str2, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.fTr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17824fTq.OLrzqt((java.util.List) obj);
            }
        }, 14, null));
        c16584emgEZpvd.AYXKKw.setOnTouchListener(new ViewOnTouchListenerC14460dlq(c16584emgEZpvd.AYXKKw, str2, str, new Function0() { // from class: o.fTx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17824fTq.copydefault(this.copydefault);
            }
        }));
        C52794wYp c52794wYp = c16584emgEZpvd.OLrzqt;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
        view.post(new java.lang.Runnable() { // from class: o.fTw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C17824fTq.EZpvd(this.OLrzqt);
            }
        });
    }

    public static final Unit OLrzqt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.UnderlineSpan());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C17824fTq c17824fTq) {
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C13754dXa.FragmentManager.RZOtbZ)), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        FragmentActivity fragmentActivityRequireActivity = c17824fTq.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        WebActivity.TaskDescription.openPage$default(taskDescription, fragmentActivityRequireActivity, bundleBundleOf, null, 4, null);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C17824fTq c17824fTq) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c17824fTq, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void EZpvd(C16584emg c16584emg) {
        LottieAnimationView lottieAnimationView = c16584emg.djBIcL;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        C14677dpv.KWHzl(lottieAnimationView, CDNSourceManager.LottieSource.SACreateGuide);
        c16584emg.djBIcL.cancelAnimation();
        c16584emg.djBIcL.playAnimation();
    }

    /* JADX INFO: renamed from: o.fTq$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C17824fTq OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C17824fTq c17824fTq) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c17824fTq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String string;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ActivityResultLauncher activityResultLauncher = this.OLrzqt.KWHzl;
                android.os.Bundle arguments = this.OLrzqt.getArguments();
                if (arguments == null || (string = arguments.getString("wallet_id")) == null) {
                    return;
                }
                activityResultLauncher.launch(new ActivateTeeGuideModel(string, false, false, (java.lang.String) null, 0, 0, 0, "sa_wallet_dustconvert", WebSocketProtocol.PAYLOAD_SHORT, (DefaultConstructorMarker) null));
            }
        }
    }
}
