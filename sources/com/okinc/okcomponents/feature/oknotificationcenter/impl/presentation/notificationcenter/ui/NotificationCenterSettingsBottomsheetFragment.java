package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Checkable;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterSettingsBottomsheetFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C42598rYu;
import o.C55296xhK;
import o.C56390yDp;
import o.C56392yDr;
import o.InterfaceC56387yDm;
import o.rVN;
import o.wXQ;
import o.wXX;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationCenterSettingsBottomsheetFragment extends wXX {
    public C42598rYu EZpvd;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.saI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return NotificationCenterSettingsBottomsheetFragment.copydefault(this.AEQbTJ);
        }
    });
    public final boolean copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.copydefault;
    }

    public final List<SettingsOption> KWHzl() {
        return (List) this.KWHzl.getValue();
    }

    public static final List copydefault(NotificationCenterSettingsBottomsheetFragment notificationCenterSettingsBottomsheetFragment) {
        ArrayList parcelableArrayList = notificationCenterSettingsBottomsheetFragment.requireArguments().getParcelableArrayList("ARG_SETTINGS_OPTION");
        return parcelableArrayList != null ? parcelableArrayList : yDY.AhwBna();
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
        this.EZpvd = C42598rYu.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        AEQbTJ();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.EZpvd = null;
    }

    private final void AEQbTJ() {
        C42598rYu c42598rYu = this.EZpvd;
        if (c42598rYu == null) {
            return;
        }
        LinearLayout linearLayout = c42598rYu.OLrzqt;
        Intrinsics.copydefault(linearLayout);
        linearLayout.setVisibility(KWHzl().contains(SettingsOption.MarkAllAsRead.KWHzl) ? 0 : 8);
        linearLayout.setOnClickListener(new Activity(linearLayout, 1000L, this));
        LinearLayout linearLayout2 = c42598rYu.KWHzl;
        Intrinsics.copydefault(linearLayout2);
        linearLayout2.setVisibility(KWHzl().contains(SettingsOption.CustomiseNotifications.EZpvd) ? 0 : 8);
        linearLayout2.setOnClickListener(new ActionBar(linearLayout2, 1000L, this));
        rVN.reportFullyDrawn$default((Fragment) this, true, (String) null, 2, (Object) null);
    }

    public final void AEQbTJ(SettingsOption settingsOption) {
        dismiss();
        getParentFragmentManager().setFragmentResult("NotificationCenterSettingsBottomsheetFragment", BundleKt.bundleOf(C56390yDp.OLrzqt("REQUEST_KEY_NOTIFICATION_CENTER_SETTINGS", settingsOption)));
    }

    public interface SettingsOption extends Parcelable {

        public static final class MarkAllAsRead implements SettingsOption {
            public static final MarkAllAsRead KWHzl = new MarkAllAsRead();
            public static final Parcelable.Creator<MarkAllAsRead> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<MarkAllAsRead> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MarkAllAsRead createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return MarkAllAsRead.KWHzl;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MarkAllAsRead[] newArray(int i) {
                    return new MarkAllAsRead[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private MarkAllAsRead() {
            }
        }

        public static final class CustomiseNotifications implements SettingsOption {
            public static final CustomiseNotifications EZpvd = new CustomiseNotifications();
            public static final Parcelable.Creator<CustomiseNotifications> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<CustomiseNotifications> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CustomiseNotifications createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return CustomiseNotifications.EZpvd;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CustomiseNotifications[] newArray(int i) {
                    return new CustomiseNotifications[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private CustomiseNotifications() {
            }
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterSettingsBottomsheetFragment.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.notificationcenter.ui.NotificationCenterSettingsBottomsheetFragment$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NotificationCenterSettingsBottomsheetFragment newInstance$default(Application application, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = yDY.AhwBna();
            }
            return application.AEQbTJ(list);
        }

        public final NotificationCenterSettingsBottomsheetFragment AEQbTJ(@NotNull List<? extends SettingsOption> list) {
            Intrinsics.checkNotNullParameter(list, "");
            NotificationCenterSettingsBottomsheetFragment notificationCenterSettingsBottomsheetFragment = new NotificationCenterSettingsBottomsheetFragment();
            notificationCenterSettingsBottomsheetFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_SETTINGS_OPTION", list)));
            return notificationCenterSettingsBottomsheetFragment;
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ NotificationCenterSettingsBottomsheetFragment OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, NotificationCenterSettingsBottomsheetFragment notificationCenterSettingsBottomsheetFragment) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = notificationCenterSettingsBottomsheetFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.AEQbTJ(SettingsOption.CustomiseNotifications.EZpvd);
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ NotificationCenterSettingsBottomsheetFragment KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, NotificationCenterSettingsBottomsheetFragment notificationCenterSettingsBottomsheetFragment) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = notificationCenterSettingsBottomsheetFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.AEQbTJ(SettingsOption.MarkAllAsRead.KWHzl);
            }
        }
    }
}
