package o;

import android.os.Build;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.imui.group.management.GroupOwnerTransferActivity$TransferOwnerFragment$performTransferOwnerAction$1$1;
import com.okinc.im.widgets.SelectableDelegate;
import com.okinc.okimcore.model.exception.OKIMException;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.GroupRole;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC34206nVj;
import o.C35399nuc;
import o.C52761wXj;
import o.nSR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nVj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC34206nVj extends nVJ {
    public static final Activity Companion = new Activity(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.nVl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC34206nVj.EZpvd(this.AEQbTJ);
        }
    });

    /* JADX INFO: renamed from: o.nVj$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nVj.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, GroupInfo groupInfo) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC34206nVj.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("info", groupInfo)));
            return intent;
        }
    }

    private final GroupInfo AYXKKw() {
        return (GroupInfo) this.valueOf.getValue();
    }

    public static final GroupInfo EZpvd(ActivityC34206nVj activityC34206nVj) {
        if (Build.VERSION.SDK_INT >= 33) {
            return (GroupInfo) activityC34206nVj.getIntent().getParcelableExtra("info", GroupInfo.class);
        }
        return (GroupInfo) activityC34206nVj.getIntent().getParcelableExtra("info");
    }

    @Override // o.nPL
    public androidx.fragment.app.Fragment AEQbTJ() throws OKIMException {
        StateListAnimator stateListAnimatorNewInstance$default;
        GroupInfo groupInfoAYXKKw = AYXKKw();
        if (groupInfoAYXKKw == null || (stateListAnimatorNewInstance$default = StateListAnimator.TaskDescription.newInstance$default(StateListAnimator.Companion, groupInfoAYXKKw, null, false, 6, null)) == null) {
            throw new OKIMException("Group Info cannot be null", -3);
        }
        return stateListAnimatorNewInstance$default;
    }

    @Override // o.nVJ, o.nPL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        nPO.OLrzqt(this).setVisibility(8);
        nPO.copydefault(this).setText(getString(C35399nuc.LoaderManager.OxbLUn));
        nPO.copydefault(this).setTextAppearance(C52761wXj.LoaderManager.dUDNAs);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.nVk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC34206nVj.copydefault(this.copydefault);
            }
        });
    }

    public static final void copydefault(ActivityC34206nVj activityC34206nVj) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC34206nVj, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.nVj$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator extends nXG {
        public static final TaskDescription Companion = new TaskDescription(null);
        public static final int OLrzqt = 8;
        public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.nVi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC34206nVj.StateListAnimator.KWHzl(this.copydefault);
            }
        });

        /* JADX INFO: renamed from: o.nVj$StateListAnimator$TaskDescription */
        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nVj.StateListAnimator.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }

            public static /* synthetic */ StateListAnimator newInstance$default(TaskDescription taskDescription, GroupInfo groupInfo, SelectableDelegate.Mode mode, boolean z, int i, java.lang.Object obj) {
                if ((i & 2) != 0) {
                    mode = SelectableDelegate.Mode.NONE;
                }
                if ((i & 4) != 0) {
                    z = true;
                }
                return taskDescription.copydefault(groupInfo, mode, z);
            }

            public final StateListAnimator copydefault(@NotNull GroupInfo groupInfo, @NotNull SelectableDelegate.Mode mode, boolean z) {
                Intrinsics.checkNotNullParameter(groupInfo, "");
                Intrinsics.checkNotNullParameter(mode, "");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("info", groupInfo);
                bundle.putParcelable(OtcExtraKeys.MODE, mode);
                bundle.putBoolean("filterable", z);
                StateListAnimator stateListAnimator = new StateListAnimator();
                stateListAnimator.setArguments(bundle);
                return stateListAnimator;
            }
        }

        private final GroupInfo AEQbTJ() {
            return (GroupInfo) this.EZpvd.getValue();
        }

        public static final GroupInfo KWHzl(StateListAnimator stateListAnimator) throws OKIMException {
            GroupInfo groupInfo;
            if (Build.VERSION.SDK_INT >= 33) {
                groupInfo = (GroupInfo) stateListAnimator.requireArguments().getParcelable("info", GroupInfo.class);
            } else {
                groupInfo = (GroupInfo) stateListAnimator.requireArguments().getParcelable("info");
            }
            if (groupInfo != null) {
                return groupInfo;
            }
            throw new OKIMException("Group Info cannot be null", -3);
        }

        @Override // o.nXG
        public void KWHzl(@NotNull C43312rms<nNV> c43312rms, @NotNull GroupMemberInfo groupMemberInfo) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(groupMemberInfo, "");
            OLrzqt(AEQbTJ(), groupMemberInfo);
        }

        @Override // o.nXG
        public java.util.List<java.lang.Object> AEQbTJ(@NotNull java.util.List<? extends java.lang.Object> list) {
            Intrinsics.checkNotNullParameter(list, "");
            java.util.List<java.lang.Object> listAEQbTJ = super.AEQbTJ(list);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listAEQbTJ) {
                if (!(obj instanceof GroupMemberInfo) || ((GroupMemberInfo) obj).getRole() != GroupRole.Owner) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        public final ViewOnClickListenerC54939xaY OLrzqt(final GroupInfo groupInfo, final GroupMemberInfo groupMemberInfo) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivityRequireActivity);
            java.lang.String strEZpvd = C44157sFk.EZpvd(groupMemberInfo);
            viewOnClickListenerC54939xaY.setTitle(C33069mpW.copydefault(this, C35399nuc.LoaderManager.GLcwwN, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("name", strEZpvd))));
            viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(this, C35399nuc.LoaderManager.GPCHlQ, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("name", strEZpvd))));
            viewOnClickListenerC54939xaY.EZpvd(C35399nuc.LoaderManager.hDKMBd, new View.OnClickListener() { // from class: o.nVm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC34206nVj.StateListAnimator.EZpvd(this.EZpvd, groupInfo, groupMemberInfo, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.OLrzqt(C35399nuc.LoaderManager.AubY, new View.OnClickListener() { // from class: o.nVq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC34206nVj.StateListAnimator.AEQbTJ(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.setCancelable(true);
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
            viewOnClickListenerC54939xaY.show();
            return viewOnClickListenerC54939xaY;
        }

        public static final void EZpvd(final StateListAnimator stateListAnimator, final GroupInfo groupInfo, GroupMemberInfo groupMemberInfo, final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
            stateListAnimator.copydefault(groupInfo, groupMemberInfo, new Function0() { // from class: o.nVo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC34206nVj.StateListAnimator.OLrzqt(viewOnClickListenerC54939xaY, groupInfo, stateListAnimator);
                }
            });
            viewOnClickListenerC54939xaY.dismiss();
        }

        public static final Unit OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, GroupInfo groupInfo, StateListAnimator stateListAnimator) {
            C55326xho.toastWithSuccessfulIcon$default(C35399nuc.LoaderManager.call, 0, 1, (java.lang.Object) null);
            nSR.StateListAnimator stateListAnimator2 = nSR.Companion;
            android.content.Context context = viewOnClickListenerC54939xaY.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            stateListAnimator.startActivity(stateListAnimator2.KWHzl(context, groupInfo.getGroupId()));
            FragmentActivity activity = stateListAnimator.getActivity();
            if (activity != null) {
                activity.finish();
            }
            return Unit.INSTANCE;
        }

        public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
            viewOnClickListenerC54939xaY.dismiss();
        }

        public final void copydefault(GroupInfo groupInfo, GroupMemberInfo groupMemberInfo, Function0<Unit> function0) {
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU != null) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GroupOwnerTransferActivity$TransferOwnerFragment$performTransferOwnerAction$1$1(this, interfaceC35180nqU, groupInfo, groupMemberInfo, function0, null), 3, null);
            }
        }
    }

    @Override // o.nVJ, o.nPL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.nVJ, o.nPL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.nVJ, o.nPL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.nVJ, o.nPL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
