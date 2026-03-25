package o;

import android.os.Build;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.im.widgets.SelectableDelegate;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC34289nYl;
import o.C35399nuc;
import o.sDX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nYl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC34289nYl extends AbstractActivityC34298nYu<nHO> {
    public Application OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.nYn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC34289nYl.AEQbTJ(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.nYp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(ActivityC34289nYl.OLrzqt(this.AEQbTJ));
        }
    });
    public final int KWHzl = C35399nuc.Dialog.AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.nYl$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nYl.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, GroupInfo groupInfo, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC34289nYl.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("info", groupInfo), C56390yDp.OLrzqt("KEY_IS_VIP_GROUP", java.lang.Boolean.valueOf(z))));
            return intent;
        }
    }

    private final GroupInfo djBIcL() {
        return (GroupInfo) this.valueOf.getValue();
    }

    public static final GroupInfo AEQbTJ(ActivityC34289nYl activityC34289nYl) {
        if (Build.VERSION.SDK_INT >= 33) {
            return (GroupInfo) activityC34289nYl.getIntent().getParcelableExtra("info", GroupInfo.class);
        }
        return (GroupInfo) activityC34289nYl.getIntent().getParcelableExtra("info");
    }

    /* JADX DEBUG: Possible override for method o.nYu.OLrzqt()V */
    public final java.lang.Boolean OLrzqt() {
        return (java.lang.Boolean) this.EZpvd.getValue();
    }

    public static final boolean OLrzqt(ActivityC34289nYl activityC34289nYl) {
        return activityC34289nYl.getIntent().getBooleanExtra("KEY_IS_VIP_GROUP", false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC34298nYu, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (djBIcL() != null) {
            GroupInfo groupInfoDjBIcL = djBIcL();
            if ((groupInfoDjBIcL != null ? groupInfoDjBIcL.getUserSettingInfo() : null) != null) {
                if (bundle == null) {
                    this.OLrzqt = EZpvd();
                    androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
                    int i = C35399nuc.StateListAnimator.DIIpTV;
                    Application application = this.OLrzqt;
                    Intrinsics.copydefault(application);
                    fragmentTransactionBeginTransaction.add(i, application, "ChooseMentionedMembersFragment").commitNowAllowingStateLoss();
                } else {
                    androidx.fragment.app.Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("ChooseMentionedMembersFragment");
                    if (fragmentFindFragmentByTag != null && (fragmentFindFragmentByTag instanceof Application)) {
                        this.OLrzqt = (Application) fragmentFindFragmentByTag;
                    }
                }
                nHO nho = (nHO) KWHzl();
                nho.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.nYo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        ActivityC34289nYl.OLrzqt(this.OLrzqt, view);
                    }
                });
                nho.valueOf.setText(getString(C35399nuc.LoaderManager.Dff));
                getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.nYm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC34289nYl.AYXKKw(this.AEQbTJ);
                    }
                });
                return;
            }
        }
        finish();
    }

    public static final void OLrzqt(ActivityC34289nYl activityC34289nYl, android.view.View view) {
        activityC34289nYl.onBackPressed();
    }

    public static final void AYXKKw(ActivityC34289nYl activityC34289nYl) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC34289nYl, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Possible override for method o.nYu.EZpvd()V */
    public final Application EZpvd() {
        Application.TaskDescription taskDescription = Application.Companion;
        GroupInfo groupInfoDjBIcL = djBIcL();
        Intrinsics.copydefault(groupInfoDjBIcL);
        java.lang.Boolean boolOLrzqt = OLrzqt();
        return Application.TaskDescription.newInstance$default(taskDescription, groupInfoDjBIcL, null, false, boolOLrzqt != null ? boolOLrzqt.booleanValue() : false, 6, null);
    }

    /* JADX INFO: renamed from: o.nYl$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application extends nXG {
        public static final TaskDescription Companion = new TaskDescription(null);

        /* JADX INFO: renamed from: o.nYl$Application$TaskDescription */
        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nYl.Application.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }

            public static /* synthetic */ Application newInstance$default(TaskDescription taskDescription, GroupInfo groupInfo, SelectableDelegate.Mode mode, boolean z, boolean z2, int i, java.lang.Object obj) {
                if ((i & 2) != 0) {
                    mode = SelectableDelegate.Mode.NONE;
                }
                if ((i & 4) != 0) {
                    z = true;
                }
                return taskDescription.AEQbTJ(groupInfo, mode, z, z2);
            }

            public final Application AEQbTJ(@NotNull GroupInfo groupInfo, @NotNull SelectableDelegate.Mode mode, boolean z, boolean z2) {
                Intrinsics.checkNotNullParameter(groupInfo, "");
                Intrinsics.checkNotNullParameter(mode, "");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("info", groupInfo);
                bundle.putParcelable(OtcExtraKeys.MODE, mode);
                bundle.putBoolean("filterable", z);
                bundle.putBoolean("KEY_IS_VIP_GROUP", z2);
                Application application = new Application();
                application.setArguments(bundle);
                return application;
            }
        }

        @Override // o.nXG, o.AbstractC32996moC, androidx.fragment.app.Fragment
        public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            EZpvd(fJNWhG());
        }

        public final void EZpvd(SelectableDelegate.Mode mode) {
            nHO nhoAEQbTJ = AEQbTJ();
            if (nhoAEQbTJ != null) {
                if (mode == SelectableDelegate.Mode.NONE) {
                    nhoAEQbTJ.copydefault.setText(getString(C35399nuc.LoaderManager.RvdRAu));
                    nhoAEQbTJ.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.nYq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            ActivityC34289nYl.Application.EZpvd(this.EZpvd, view);
                        }
                    });
                    nhoAEQbTJ.KWHzl.setVisibility(8);
                } else {
                    nhoAEQbTJ.copydefault.setText(getString(C35399nuc.LoaderManager.AubY));
                    nhoAEQbTJ.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.nYv
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            ActivityC34289nYl.Application.AYXKKw(this.KWHzl, view);
                        }
                    });
                    nhoAEQbTJ.KWHzl.setVisibility(0);
                }
                values().setIndexBarVisibility(false);
            }
        }

        public static final void EZpvd(Application application, android.view.View view) {
            application.OLrzqt(SelectableDelegate.Mode.MULTIPLE);
        }

        public static final void AYXKKw(Application application, android.view.View view) {
            application.OLrzqt(SelectableDelegate.Mode.NONE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
        /* JADX DEBUG: Possible override for method o.nXG.AEQbTJ()Ljava/util/List; */
        /* JADX WARN: Multi-variable type inference failed */
        public final nHO AEQbTJ() {
            FragmentActivity activity = getActivity();
            if (activity == null || !(activity instanceof ActivityC34289nYl)) {
                return null;
            }
            return (nHO) ((ActivityC34289nYl) activity).KWHzl();
        }

        @Override // o.nXG
        public void copydefault(@NotNull C59534zip c59534zip) {
            Intrinsics.checkNotNullParameter(c59534zip, "");
            super.copydefault(c59534zip);
            c59534zip.register(C37736ozU.class, new StateListAnimator());
            c59534zip.register(C35692oAd.class, new C33655nAy());
        }

        @Override // o.nXG
        public java.lang.String KWHzl(int i, java.lang.Object obj) {
            return obj == null ? ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER : ((obj instanceof C37736ozU) || (obj instanceof C35692oAd)) ? "↑" : super.KWHzl(i, obj);
        }

        @Override // o.nXG
        public java.util.List<java.lang.Object> AEQbTJ(@NotNull java.util.List<? extends java.lang.Object> list) {
            Intrinsics.checkNotNullParameter(list, "");
            java.util.List<java.lang.Object> listAEQbTJ = super.AEQbTJ(list);
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + 2);
            boolean zIsAllowAtAll = fetchVPNInfo().isAllowAtAll();
            boolean z = fJNWhG() == SelectableDelegate.Mode.NONE;
            java.lang.String strFIwbmz = fIwbmz();
            boolean z2 = strFIwbmz == null || strFIwbmz.length() == 0;
            if (zIsAllowAtAll && z && z2) {
                arrayList.add(0, new C37736ozU(10, null, C33070mpX.AYXKKw(sDX.StateListAnimator.AkhnZx)));
                arrayList.add(1, C35692oAd.AEQbTJ);
            }
            arrayList.addAll(listAEQbTJ);
            return arrayList;
        }

        @Override // o.nXG
        public void KWHzl(@NotNull C43312rms<nNV> c43312rms, @NotNull GroupMemberInfo groupMemberInfo) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(groupMemberInfo, "");
            EZpvd(false, yDY.copydefault(groupMemberInfo));
        }

        @Override // o.nXG
        public void copydefault(@NotNull SelectableDelegate.Mode mode) {
            Intrinsics.checkNotNullParameter(mode, "");
            super.copydefault(mode);
            EZpvd(mode);
        }

        @Override // o.nXG
        public void KWHzl(int i) {
            super.KWHzl(i);
            nHO nhoAEQbTJ = AEQbTJ();
            if (nhoAEQbTJ != null) {
                nhoAEQbTJ.djBIcL.setText(C33069mpW.copydefault(this, C35399nuc.LoaderManager.zeUYeG, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("count", java.lang.String.valueOf(i)))));
                if (i > 0) {
                    nhoAEQbTJ.OLrzqt.setEnabled(true);
                    nhoAEQbTJ.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.nYs
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            ActivityC34289nYl.Application.KWHzl(this.OLrzqt, view);
                        }
                    });
                } else {
                    nhoAEQbTJ.OLrzqt.setOnClickListener(null);
                    nhoAEQbTJ.OLrzqt.setEnabled(false);
                }
            }
        }

        public static final void KWHzl(Application application, android.view.View view) {
            application.EZpvd(false, new java.util.ArrayList<>(application.ejfBZ()));
        }

        public final void EZpvd(boolean z, java.util.ArrayList<GroupMemberInfo> arrayList) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                if (z) {
                    C36404oaN.EZpvd.KWHzl();
                } else if (arrayList != null) {
                    C36404oaN.EZpvd.EZpvd(arrayList);
                }
                activity.finish();
            }
        }

        /* JADX INFO: renamed from: o.nYl$Application$StateListAnimator */
        public final class StateListAnimator extends AbstractC43310rmq<C37736ozU, AbstractC34002nNu> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.AbstractC43310rmq
            public int getItemLayoutId() {
                return C35399nuc.Dialog.gwwfep;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.AbstractC43310rmq
            public int getVariableId() {
                return C35342ntX.djBIcL;
            }

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public StateListAnimator() {
            }

            /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
            /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
            @Override // o.AbstractC43310rmq
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public void onBindViewHolder(@NotNull C43312rms<AbstractC34002nNu> c43312rms, @NotNull final C37736ozU c37736ozU) {
                Intrinsics.checkNotNullParameter(c43312rms, "");
                Intrinsics.checkNotNullParameter(c37736ozU, "");
                super.onBindViewHolder((C43312rms) c43312rms, c37736ozU);
                android.view.View view = c43312rms.itemView;
                final Application application = Application.this;
                view.setOnClickListener(new View.OnClickListener() { // from class: o.nYt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        ActivityC34289nYl.Application.StateListAnimator.KWHzl(c37736ozU, application, view2);
                    }
                });
            }

            public static final void KWHzl(C37736ozU c37736ozU, Application application, android.view.View view) {
                if (c37736ozU.AEQbTJ() == 10) {
                    application.EZpvd(true, (java.util.ArrayList<GroupMemberInfo>) null);
                }
            }
        }
    }

    @Override // o.AbstractActivityC34298nYu, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC34298nYu, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC34298nYu, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC34298nYu, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
