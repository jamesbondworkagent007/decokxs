package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aTU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C6656aTU extends AbstractC32996moC {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public AbstractC8248azE AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C8206ayP.Application.AwvSrB;
    }

    /* JADX INFO: renamed from: o.aTU$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aTU.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C6656aTU copydefault() {
            C6656aTU c6656aTU = new C6656aTU();
            c6656aTU.setArguments(new android.os.Bundle());
            return c6656aTU;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC8248azE abstractC8248azE = (AbstractC8248azE) DataBindingUtil.bind(view);
        this.AEQbTJ = abstractC8248azE;
        if (abstractC8248azE != null) {
            abstractC8248azE.EZpvd.setTitleText(getString(C8206ayP.Dialog.AuCTel));
            abstractC8248azE.EZpvd.AEQbTJ().setVisibility(8);
            C52794wYp c52794wYpAEQbTJ = abstractC8248azE.EZpvd.OLrzqt().AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setVisibility(8);
            }
            abstractC8248azE.EZpvd.setStatus(7);
            abstractC8248azE.EZpvd.setSubTitleText(getString(C8206ayP.Dialog.KWHzl));
            C52794wYp c52794wYpCopydefault = abstractC8248azE.EZpvd.OLrzqt().copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setText(getString(C8206ayP.Dialog.AubY));
            }
            C52794wYp c52794wYpCopydefault2 = abstractC8248azE.EZpvd.OLrzqt().copydefault();
            if (c52794wYpCopydefault2 != null) {
                c52794wYpCopydefault2.setOnClickListener(new Application(c52794wYpCopydefault2, 1000L, this));
            }
        }
        FragmentActivity activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1() { // from class: o.aTV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6656aTU.AEQbTJ((OnBackPressedCallback) obj);
                }
            }, 2, null);
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Reset2FAGenerateTickets_Account_FullPage_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aTS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6656aTU.EZpvd((EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "type", "checkprogress", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AEQbTJ = null;
    }

    /* JADX INFO: renamed from: o.aTU$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C6656aTU KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C6656aTU c6656aTU) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c6656aTU;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                FragmentActivity activity = this.KWHzl.getActivity();
                if (activity != null) {
                    activity.setResult(-1, activity.getIntent());
                    activity.finish();
                }
            }
        }
    }
}
