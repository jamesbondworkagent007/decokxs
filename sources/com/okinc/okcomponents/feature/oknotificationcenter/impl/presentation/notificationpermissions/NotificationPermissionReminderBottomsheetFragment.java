package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationpermissions;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.okinc.components.track.TrackChannel;
import com.okinc.okuser.data.User;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC44621saQ;
import o.C32866mlf;
import o.C33625mzw;
import o.C42596rYs;
import o.C42602rYy;
import o.C43251rlk;
import o.C52794wYp;
import o.C55296xhK;
import o.InterfaceC47278tmy;
import o.rVN;
import o.rXV;
import o.wXQ;
import o.wYF;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class NotificationPermissionReminderBottomsheetFragment extends AbstractC44621saQ {
    public final boolean AYXKKw = true;
    public final InterfaceC47278tmy djBIcL = (InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class);
    public C42602rYy gEmmrt;

    @yCM
    public C42596rYs sharedPreferences;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AhwBna = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Possible override for method o.saQ.EZpvd()V */
    public final C42596rYs EZpvd() {
        C42596rYs c42596rYs = this.sharedPreferences;
        if (c42596rYs != null) {
            return c42596rYs;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.gEmmrt = C42602rYy.copydefault(getCustomLayoutInflater(), constraintLayout, true);
        rVN.reportFullyDrawn$default((Fragment) this, true, (String) null, 2, (Object) null);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.gEmmrt = null;
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setPrimaryText(getString(rXV.TaskDescription.AkhnZx));
        wyf.setSecondaryText(getString(rXV.TaskDescription.AhwBna));
        wyf.setType(7);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, wyf, this));
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new Activity(c52794wYpAEQbTJ, 1000L, this));
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull DialogInterface dialogInterface) {
        String uid;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        C42596rYs c42596rYsEZpvd = EZpvd();
        User userOLrzqt = this.djBIcL.OLrzqt();
        if (userOLrzqt == null || (uid = userOLrzqt.getUid()) == null) {
            uid = "logged_out_state";
        }
        c42596rYsEZpvd.copydefault("notification_permission_reminder_" + uid, System.currentTimeMillis());
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationpermissions.NotificationPermissionReminderBottomsheetFragment.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final NotificationPermissionReminderBottomsheetFragment KWHzl() {
            return new NotificationPermissionReminderBottomsheetFragment();
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ NotificationPermissionReminderBottomsheetFragment EZpvd;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, NotificationPermissionReminderBottomsheetFragment notificationPermissionReminderBottomsheetFragment) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = notificationPermissionReminderBottomsheetFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.dismiss();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ wYF EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ NotificationPermissionReminderBottomsheetFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, wYF wyf, NotificationPermissionReminderBottomsheetFragment notificationPermissionReminderBottomsheetFragment) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = wyf;
            this.copydefault = notificationPermissionReminderBottomsheetFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Context context = this.EZpvd.getContext();
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                if (activity != null) {
                    C33625mzw.OLrzqt().EZpvd(activity);
                } else {
                    Context context2 = this.EZpvd.getContext();
                    while (true) {
                        if (!(context2 instanceof ContextWrapper)) {
                            break;
                        }
                        if (context2 instanceof android.app.Activity) {
                            C33625mzw.OLrzqt().EZpvd((android.app.Activity) context2);
                            break;
                        }
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    }
                }
                C32866mlf.onEvent$default("MessagingNotificationCenter_Bottomsheet_DeviceNotificationOn_Click", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
                this.copydefault.dismiss();
            }
        }
    }
}
