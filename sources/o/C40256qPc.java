package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.work.WorkRequest;
import com.okinc.core.util.SPUtils;
import com.okinc.market.search.features.navigation.root.ui.delegate.DefaultNavSearchPopupTipsDelegate$showPopupTips$$inlined$repeatOnLifecycleResume$1;
import com.okinc.market.search.features.navigation.root.ui.model.NavSearchMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qPc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40256qPc {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public androidx.fragment.app.Fragment EZpvd;
    public android.content.Context KWHzl;
    public qLE OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl() {
        this.EZpvd = null;
        this.KWHzl = null;
    }

    /* JADX INFO: renamed from: o.qPc$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qPc.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public void AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.EZpvd = fragment;
        this.KWHzl = fragment.getContext();
    }

    /* JADX INFO: renamed from: o.qPc$TaskDescription */
    public static final class TaskDescription extends android.os.CountDownTimer {
        public final /* synthetic */ C40369qTh AEQbTJ;
        public final /* synthetic */ C40256qPc EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ NavSearchMode copydefault;

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(android.view.View view, C40256qPc c40256qPc, NavSearchMode navSearchMode, C40369qTh c40369qTh) {
            super(WorkRequest.MIN_BACKOFF_MILLIS, WorkRequest.MIN_BACKOFF_MILLIS);
            this.KWHzl = view;
            this.EZpvd = c40256qPc;
            this.copydefault = navSearchMode;
            this.AEQbTJ = c40369qTh;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            android.view.View view = this.KWHzl;
            C40256qPc c40256qPc = this.EZpvd;
            NavSearchMode navSearchMode = this.copydefault;
            C40369qTh c40369qTh = this.AEQbTJ;
            android.content.Context context = c40256qPc.KWHzl;
            c40256qPc.OLrzqt = context != null ? new qLE(context) : null;
            qLE qle = c40256qPc.OLrzqt;
            if (qle != null) {
                qle.OLrzqt(C33070mpX.AYXKKw(qZH.PendingIntent.HrMTQN));
            }
            qLE qle2 = c40256qPc.OLrzqt;
            if (qle2 != null) {
                qle2.OLrzqt(8388613, C55298xhM.dpInt$default(18.0f, (android.content.Context) null, 1, (java.lang.Object) null), C33129mqd.AhwBna(java.lang.Integer.valueOf(view.getWidth())));
            }
            qLE qle3 = c40256qPc.OLrzqt;
            if (qle3 != null) {
                android.content.Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                qle3.showAsDropDown(view, C55298xhM.dpInt$default(C55296xhK.OLrzqt(context2) ? -15.0f : 5.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(0.0f, (android.content.Context) null, 1, (java.lang.Object) null), 8388613);
            }
            SPUtils.put("pop_second_window_showed", java.lang.Boolean.TRUE);
            qPT qptKWHzl = qPU.KWHzl(view);
            if (qptKWHzl != null) {
                qptKWHzl.KWHzl(navSearchMode);
            }
            if (c40369qTh != null) {
                c40369qTh.setOnTouch(null);
            }
        }
    }

    public static final Unit KWHzl(android.os.CountDownTimer countDownTimer, C40369qTh c40369qTh) {
        countDownTimer.cancel();
        if (c40369qTh != null) {
            c40369qTh.setOnTouch(null);
        }
        return Unit.INSTANCE;
    }

    public void copydefault(final C40369qTh c40369qTh, android.view.View view, @NotNull NavSearchMode navSearchMode, @NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2) {
        androidx.fragment.app.Fragment fragment;
        Intrinsics.checkNotNullParameter(navSearchMode, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        androidx.fragment.app.Fragment fragment2 = this.EZpvd;
        if (fragment2 != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment2), null, null, new DefaultNavSearchPopupTipsDelegate$showPopupTips$$inlined$repeatOnLifecycleResume$1(fragment2, Lifecycle.State.RESUMED, null, str, z, view, navSearchMode, str2, this), 3, null);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "trade_page") && kKA.isLogin$default(kKA.EZpvd, null, 1, null) && z && view != null && view.getVisibility() == 0 && (fragment = this.EZpvd) != null && fragment.isResumed() && !SPUtils.getBoolean("pop_second_window_showed", false) && !SPUtils.getBoolean("isNewUser", true)) {
            final android.os.CountDownTimer countDownTimerStart = new TaskDescription(view, this, navSearchMode, c40369qTh).start();
            if (c40369qTh != null) {
                c40369qTh.setOnTouch(new Function0() { // from class: o.qPf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C40256qPc.KWHzl(countDownTimerStart, c40369qTh);
                    }
                });
            }
        }
    }
}
