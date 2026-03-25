package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.geL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20300geL extends AbstractC52785wYg {
    public Function0<Unit> KWHzl;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    @Override // o.AbstractC52785wYg
    public boolean AhwBna() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<Unit> function0) {
        this.KWHzl = function0;
    }

    /* JADX INFO: renamed from: o.geL$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.geL.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C20300geL OLrzqt(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            C20300geL c20300geL = new C20300geL();
            c20300geL.KWHzl(function0);
            return c20300geL;
        }
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        c52781wYc.setType(2);
    }

    @Override // o.AbstractC52785wYg
    public void AEQbTJ(@NotNull C54954xan c54954xan) {
        Intrinsics.checkNotNullParameter(c54954xan, "");
        AppCompatImageView appCompatImageView = c54954xan.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C14677dpv.OLrzqt(appCompatImageView, CDNSourceManager.ImageSource.TxChangeTransferTip);
        c54954xan.AEQbTJ.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.cleanupAutoManagers));
        c54954xan.OLrzqt.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.calculateNightMode));
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        wyf.setType(7);
        wyf.setSecondaryText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.hUfVAv));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
            c52794wYpAEQbTJ.setOnClickListener(new TaskDescription(c52794wYpAEQbTJ, 1000L, this));
        }
        wyf.setPrimaryText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AxsJAYsNCnLh));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(257);
            c52794wYpCopydefault.setOnClickListener(new ActionBar(c52794wYpCopydefault, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.geL$Application */
    public static final class Application implements Function1<EventParamsList, Unit> {
        public static final Application copydefault = new Application();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "action_after_pop_up", Web3SecurityTrackEvent.VALUE_CONFIRM, false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.geL$StateListAnimator */
    public static final class StateListAnimator implements Function1<EventParamsList, Unit> {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "action_after_pop_up", OtpEventTracker.OTP_EVENT_VALUE_CANCEL, false, 4, null);
        }
    }

    /* JADX INFO: renamed from: o.geL$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C20300geL OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C20300geL c20300geL) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = c20300geL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C32866mlf.onEvent$default("SendToAddressPopup_Mid_Popup_View", (TrackChannel[]) null, StateListAnimator.AEQbTJ, 1, (java.lang.Object) null);
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.geL$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C20300geL EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C20300geL c20300geL) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = c20300geL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C32866mlf.onEvent$default("SendToAddressPopup_Mid_Popup_View", (TrackChannel[]) null, Application.copydefault, 1, (java.lang.Object) null);
                Function0 function0 = this.EZpvd.KWHzl;
                if (function0 != null) {
                    function0.invoke();
                }
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }
}
