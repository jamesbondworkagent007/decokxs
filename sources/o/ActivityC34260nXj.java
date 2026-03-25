package o;

import android.os.Build;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.bean.ContactType;
import com.okinc.im.imui.bean.ModifyType;
import com.okinc.im.imui.group.members.ModifyMembersActivity$AddMembersFragment$performAddMembersAction$1;
import com.okinc.im.imui.group.members.ModifyMembersActivity$RemoveMembersFragment$performRemoveMembersAction$1$1;
import com.okinc.im.widgets.SelectableDelegate;
import com.okinc.okimcore.model.exception.OKIMException;
import com.okinc.okimcore.model.other.GroupAddMembersResult;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.GroupRole;
import com.okinc.okimcore.model.other.GroupUserSettingInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC34260nXj;
import o.C32113mPz;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nXj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC34260nXj extends AbstractActivityC34258nXh {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int isConnected = 8;
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.nXl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC34260nXj.gEmmrt(this.copydefault);
        }
    });
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.nXm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC34260nXj.AEQbTJ(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.nXk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC34260nXj.valueOf(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.nXj$Activity */
    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ModifyType.values().length];
            try {
                iArr[ModifyType.ADD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ModifyType.REMOVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX INFO: renamed from: o.nXj$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nXj.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    private final GroupInfo gEmmrt() {
        return (GroupInfo) this.values.getValue();
    }

    public static final GroupInfo gEmmrt(ActivityC34260nXj activityC34260nXj) {
        if (Build.VERSION.SDK_INT >= 33) {
            return (GroupInfo) activityC34260nXj.getIntent().getParcelableExtra("info", GroupInfo.class);
        }
        return (GroupInfo) activityC34260nXj.getIntent().getParcelableExtra("info");
    }

    /* JADX DEBUG: Possible override for method o.nXh.AYXKKw()V */
    public final java.lang.String AYXKKw() {
        return (java.lang.String) this.fetchVPNInfo.getValue();
    }

    public static final java.lang.String AEQbTJ(ActivityC34260nXj activityC34260nXj) {
        return activityC34260nXj.getIntent().getStringExtra("id");
    }

    private final ModifyType DbNXlk() {
        return (ModifyType) this.AkhnZx.getValue();
    }

    public static final ModifyType valueOf(ActivityC34260nXj activityC34260nXj) {
        if (Build.VERSION.SDK_INT >= 33) {
            return (ModifyType) activityC34260nXj.getIntent().getParcelableExtra("type", ModifyType.class);
        }
        return (ModifyType) activityC34260nXj.getIntent().getParcelableExtra("type");
    }

    @Override // o.AbstractActivityC34258nXh, o.nPL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.nXn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC34260nXj.AYXKKw(this.AEQbTJ);
            }
        });
    }

    public static final void AYXKKw(ActivityC34260nXj activityC34260nXj) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC34260nXj, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    @Override // o.nPL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public androidx.fragment.app.Fragment AEQbTJ() throws OKIMException {
        androidx.fragment.app.Fragment fragmentNewInstance$default;
        GroupInfo groupInfoGEmmrt = gEmmrt();
        if (groupInfoGEmmrt == null) {
            fragmentNewInstance$default = null;
        } else {
            ModifyType modifyTypeDbNXlk = DbNXlk();
            int i = modifyTypeDbNXlk == null ? -1 : Activity.copydefault[modifyTypeDbNXlk.ordinal()];
            if (i == 1) {
                java.lang.String strAYXKKw = AYXKKw();
                if (strAYXKKw != null) {
                    fragmentNewInstance$default = Application.StateListAnimator.newInstance$default(Application.Companion, groupInfoGEmmrt, null, false, new java.util.ArrayList(StringsKt__StringsKt.split$default((java.lang.CharSequence) strAYXKKw, new java.lang.String[]{";"}, false, 0, 6, (java.lang.Object) null)), 6, null);
                }
            } else if (i == 2) {
                fragmentNewInstance$default = TaskDescription.Application.newInstance$default(TaskDescription.Companion, groupInfoGEmmrt, null, false, 6, null);
            } else {
                throw new java.lang.IllegalArgumentException("Invalid modifyType: " + DbNXlk());
            }
        }
        if (fragmentNewInstance$default != null) {
            return fragmentNewInstance$default;
        }
        throw new OKIMException("Group Info and Member ID list cannot be null", -3);
    }

    /* JADX INFO: renamed from: o.nXj$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application extends C35639nzE {
        public static final StateListAnimator Companion = new StateListAnimator(null);
        public static final int uzCIH = 8;
        public final InterfaceC56387yDm AuCTelauCTel = C56392yDr.copydefault(new Function0() { // from class: o.nXs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC34260nXj.Application.AEQbTJ(this.AEQbTJ);
            }
        });
        public ViewOnClickListenerC54939xaY hDKMBd;

        /* JADX INFO: renamed from: o.nXj$Application$StateListAnimator */
        public static final class StateListAnimator {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nXj.Application.StateListAnimator.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private StateListAnimator() {
            }

            public static /* synthetic */ Application newInstance$default(StateListAnimator stateListAnimator, GroupInfo groupInfo, SelectableDelegate.Mode mode, boolean z, java.util.ArrayList arrayList, int i, java.lang.Object obj) {
                if ((i & 2) != 0) {
                    mode = SelectableDelegate.Mode.MULTIPLE;
                }
                if ((i & 4) != 0) {
                    z = true;
                }
                return stateListAnimator.OLrzqt(groupInfo, mode, z, arrayList);
            }

            public final Application OLrzqt(@NotNull GroupInfo groupInfo, @NotNull SelectableDelegate.Mode mode, boolean z, @NotNull java.util.ArrayList<java.lang.String> arrayList) {
                Intrinsics.checkNotNullParameter(groupInfo, "");
                Intrinsics.checkNotNullParameter(mode, "");
                Intrinsics.checkNotNullParameter(arrayList, "");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("info", groupInfo);
                bundle.putParcelable(OtcExtraKeys.MODE, mode);
                bundle.putBoolean("filterable", z);
                bundle.putStringArrayList("exclude_ids", arrayList);
                bundle.putBoolean("hide_myself", true);
                bundle.putParcelable("user_type", ContactType.BOTH_FRIEND);
                Application application = new Application();
                application.setArguments(bundle);
                return application;
            }
        }

        /* JADX DEBUG: Possible override for method o.nzE.values()Z */
        public final GroupInfo values() {
            return (GroupInfo) this.AuCTelauCTel.getValue();
        }

        public static final GroupInfo AEQbTJ(Application application) throws OKIMException {
            GroupInfo groupInfo;
            if (Build.VERSION.SDK_INT >= 33) {
                groupInfo = (GroupInfo) application.requireArguments().getParcelable("info", GroupInfo.class);
            } else {
                groupInfo = (GroupInfo) application.requireArguments().getParcelable("info");
            }
            if (groupInfo != null) {
                return groupInfo;
            }
            throw new OKIMException("Group Info cannot be null", -3);
        }

        @Override // androidx.fragment.app.Fragment
        public void onCreate(android.os.Bundle bundle) {
            super.onCreate(bundle);
            setHasOptionsMenu(true);
        }

        @Override // o.C35639nzE, o.AbstractC32996moC, androidx.fragment.app.Fragment
        public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            AkhnZx().setText(getString(C35399nuc.LoaderManager.sZqaRl));
            KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.nXr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    ActivityC34260nXj.Application.AEQbTJ(this.OLrzqt, view2);
                }
            });
            android.widget.TextView textViewValueOf = valueOf();
            textViewValueOf.setVisibility(0);
            textViewValueOf.setText(getString(C35399nuc.LoaderManager.QAQCdZ));
        }

        public static final void AEQbTJ(final Application application, android.view.View view) {
            application.KWHzl(application.isConnected(), new Function0() { // from class: o.nXp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC34260nXj.Application.AhwBna(this.copydefault);
                }
            }, new Function1() { // from class: o.nXo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC34260nXj.Application.OLrzqt(this.AEQbTJ, (GroupAddMembersResult) obj);
                }
            }, new Function1() { // from class: o.nXq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC34260nXj.Application.copydefault(this.AEQbTJ, (java.lang.Throwable) obj);
                }
            });
        }

        public static final Unit AhwBna(Application application) {
            FragmentActivity activity = application.getActivity();
            if (activity != null) {
                activity.finish();
            }
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(final Application application, GroupAddMembersResult groupAddMembersResult) {
            Intrinsics.checkNotNullParameter(groupAddMembersResult, "");
            nWM nwm = nWM.EZpvd;
            FragmentActivity fragmentActivityRequireActivity = application.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            application.hDKMBd = nwm.copydefault(fragmentActivityRequireActivity, groupAddMembersResult, application.values().getGroupId(), new Function0() { // from class: o.nXt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC34260nXj.Application.valueOf(this.EZpvd);
                }
            });
            return Unit.INSTANCE;
        }

        public static final Unit valueOf(Application application) {
            FragmentActivity activity = application.getActivity();
            if (activity != null) {
                activity.finish();
            }
            return Unit.INSTANCE;
        }

        public static final Unit copydefault(Application application, java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            java.lang.String strCopydefault = C44157sFk.copydefault(th);
            if (strCopydefault != null) {
                C55326xho.toast$default(strCopydefault, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
            FragmentActivity activity = application.getActivity();
            if (activity != null) {
                activity.finish();
            }
            return Unit.INSTANCE;
        }

        @Override // o.C35639nzE
        public void AEQbTJ(@NotNull java.util.List<? extends java.lang.Object> list, android.view.View view) {
            Intrinsics.checkNotNullParameter(list, "");
            super.AEQbTJ(list, view);
            android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(C35399nuc.StateListAnimator.vqBjd) : null;
            if (textView != null) {
                textView.setText(C35399nuc.LoaderManager.UvfnWv);
            }
        }

        public final void KWHzl(java.util.List<RelationInfo> list, Function0<Unit> function0, Function1<? super GroupAddMembersResult, Unit> function1, Function1<? super java.lang.Throwable, Unit> function12) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ModifyMembersActivity$AddMembersFragment$performAddMembersAction$1(this, list, function12, function0, function1, null), 3, null);
        }

        @Override // o.C35639nzE
        public void copydefault(int i) {
            super.copydefault(i);
            KWHzl().setEnabled(i > 0);
        }

        @Override // androidx.fragment.app.Fragment
        public void onDestroy() {
            super.onDestroy();
            C33062mpP.OLrzqt(this.hDKMBd);
        }
    }

    /* JADX INFO: renamed from: o.nXj$TaskDescription */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class TaskDescription extends nXG {
        public static final Application Companion = new Application(null);

        /* JADX INFO: renamed from: o.nXj$TaskDescription$Application */
        public static final class Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nXj.TaskDescription.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Application() {
            }

            public static /* synthetic */ TaskDescription newInstance$default(Application application, GroupInfo groupInfo, SelectableDelegate.Mode mode, boolean z, int i, java.lang.Object obj) {
                if ((i & 2) != 0) {
                    mode = SelectableDelegate.Mode.MULTIPLE;
                }
                if ((i & 4) != 0) {
                    z = true;
                }
                return application.EZpvd(groupInfo, mode, z);
            }

            public final TaskDescription EZpvd(@NotNull GroupInfo groupInfo, @NotNull SelectableDelegate.Mode mode, boolean z) {
                Intrinsics.checkNotNullParameter(groupInfo, "");
                Intrinsics.checkNotNullParameter(mode, "");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("info", groupInfo);
                bundle.putParcelable(OtcExtraKeys.MODE, mode);
                bundle.putBoolean("filterable", z);
                TaskDescription taskDescription = new TaskDescription();
                taskDescription.setArguments(bundle);
                return taskDescription;
            }
        }

        @Override // o.nXG, o.AbstractC32996moC, androidx.fragment.app.Fragment
        public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            android.widget.TextView textViewFARcdN = fARcdN();
            textViewFARcdN.setTextAppearance(requireContext(), C52761wXj.LoaderManager.hrNTAI);
            textViewFARcdN.setTextColor(C33070mpX.copydefault(C32113mPz.ActionBar.AuCTel));
            textViewFARcdN.setText(getString(C35399nuc.LoaderManager.DGUQLI));
            valueOf().setOnClickListener(new View.OnClickListener() { // from class: o.nXC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    ActivityC34260nXj.TaskDescription.OLrzqt(this.OLrzqt, view2);
                }
            });
        }

        public static final void OLrzqt(TaskDescription taskDescription, android.view.View view) {
            taskDescription.AEQbTJ();
        }

        /* JADX DEBUG: Possible override for method o.nXG.AEQbTJ()Ljava/util/List; */
        public final ViewOnClickListenerC54939xaY AEQbTJ() {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivityRequireActivity);
            viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C35399nuc.LoaderManager.ixgjPv));
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C35399nuc.LoaderManager.htlTjW));
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.USBtdM), new View.OnClickListener() { // from class: o.nXv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC34260nXj.TaskDescription.OLrzqt(viewOnClickListenerC54939xaY, this, view);
                }
            });
            viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C35399nuc.LoaderManager.OqFWZa), new View.OnClickListener() { // from class: o.nXu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC34260nXj.TaskDescription.OLrzqt(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.setCancelable(true);
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
            viewOnClickListenerC54939xaY.show();
            return viewOnClickListenerC54939xaY;
        }

        public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, final TaskDescription taskDescription, android.view.View view) {
            viewOnClickListenerC54939xaY.dismiss();
            taskDescription.OLrzqt(taskDescription.ejfBZ(), new Function0() { // from class: o.nXz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC34260nXj.TaskDescription.OLrzqt(this.KWHzl);
                }
            });
        }

        public static final Unit OLrzqt(TaskDescription taskDescription) {
            FragmentActivity activity = taskDescription.getActivity();
            if (activity != null) {
                activity.finish();
            }
            return Unit.INSTANCE;
        }

        public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
            viewOnClickListenerC54939xaY.dismiss();
        }

        public final void OLrzqt(java.util.List<GroupMemberInfo> list, final Function0<Unit> function0) {
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU != null) {
                showLoading();
                AbstractC58185ywX abstractC58185ywXEZpvd = C44525sTa.copydefault.EZpvd(new ModifyMembersActivity$RemoveMembersFragment$performRemoveMembersAction$1$1(interfaceC35180nqU, this, list, null));
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl(C58156yvv.EZpvd(abstractC58185ywXEZpvd, viewLifecycleOwner));
                final Function1 function1 = new Function1() { // from class: o.nXx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC34260nXj.TaskDescription.copydefault(this.OLrzqt, function0, (Unit) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.nXw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        ActivityC34260nXj.TaskDescription.AEQbTJ(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.nXB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC34260nXj.TaskDescription.AEQbTJ(this.OLrzqt, (java.lang.Throwable) obj);
                    }
                };
                abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.nXy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        ActivityC34260nXj.TaskDescription.OLrzqt(function12, obj);
                    }
                });
            }
        }

        public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit copydefault(TaskDescription taskDescription, Function0 function0, Unit unit) {
            taskDescription.dismissLoading();
            function0.invoke();
            return Unit.INSTANCE;
        }

        public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit AEQbTJ(TaskDescription taskDescription, java.lang.Throwable th) {
            taskDescription.dismissLoading();
            Intrinsics.copydefault(th);
            C44157sFk.KWHzl(th);
            return Unit.INSTANCE;
        }

        @Override // o.nXG
        public void KWHzl(int i) {
            super.KWHzl(i);
            if (i > 0) {
                valueOf().setEnabled(true);
            } else {
                valueOf().setEnabled(false);
            }
        }

        @Override // o.nXG
        public java.util.List<java.lang.Object> AEQbTJ(@NotNull java.util.List<? extends java.lang.Object> list) {
            Intrinsics.checkNotNullParameter(list, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (obj instanceof GroupMemberInfo) {
                    GroupUserSettingInfo userSettingInfo = fetchVPNInfo().getUserSettingInfo();
                    GroupRole role = userSettingInfo != null ? userSettingInfo.getRole() : null;
                    GroupRole groupRole = GroupRole.Administrator;
                    if (role == groupRole) {
                        GroupMemberInfo groupMemberInfo = (GroupMemberInfo) obj;
                        if (groupMemberInfo.getRole() == GroupRole.Owner || groupMemberInfo.getRole() == groupRole) {
                        }
                    } else if (((GroupMemberInfo) obj).getRole() != GroupRole.Owner) {
                    }
                }
                arrayList.add(obj);
            }
            return arrayList;
        }
    }

    @Override // o.AbstractActivityC34258nXh, o.nPL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC34258nXh, o.nPL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC34258nXh, o.nPL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC34258nXh, o.nPL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
