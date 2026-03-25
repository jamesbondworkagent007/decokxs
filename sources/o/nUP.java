package o;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import com.okinc.im.imui.bean.ModifyType;
import com.okinc.okimcore.model.exception.OKIMException;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import o.nUP;
import o.nVU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nUP extends AbstractActivityC33007moN {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.nUS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return nUP.OLrzqt(this.EZpvd);
        }
    });

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nUP.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, GroupInfo groupInfo) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) nUP.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("info", groupInfo)));
            return intent;
        }
    }

    private final GroupInfo OLrzqt() {
        return (GroupInfo) this.AhwBna.getValue();
    }

    public static final GroupInfo OLrzqt(nUP nup) {
        if (Build.VERSION.SDK_INT >= 33) {
            return (GroupInfo) nup.getIntent().getParcelableExtra("info", GroupInfo.class);
        }
        return (GroupInfo) nup.getIntent().getParcelableExtra("info");
    }

    @Override // o.AbstractActivityC33007moN
    public java.lang.CharSequence EZpvd() {
        java.lang.String string = getString(C35399nuc.LoaderManager.HJWChPOKBmQNaCIdOM);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.AbstractActivityC33007moN
    public androidx.fragment.app.Fragment copydefault() throws OKIMException {
        ActionBar actionBarKWHzl;
        GroupInfo groupInfoOLrzqt = OLrzqt();
        if (groupInfoOLrzqt == null || (actionBarKWHzl = ActionBar.Companion.KWHzl(groupInfoOLrzqt)) == null) {
            throw new OKIMException("Group Info cannot be null", -3);
        }
        return actionBarKWHzl;
    }

    @Override // o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        djBIcL().djBIcL.setTextAppearance(C52761wXj.LoaderManager.dUDNAs);
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(C52761wXj.Activity.EZpvd)));
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.nUQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                nUP.EZpvd(this.AEQbTJ);
            }
        });
    }

    public static final void EZpvd(nUP nup) {
        rVN.reportFullyDrawn$default((android.app.Activity) nup, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final class ActionBar extends AbstractC32996moC {
        public final C59534zip EZpvd;
        public final java.util.ArrayList<java.lang.Object> KWHzl;
        public final int OLrzqt = C35399nuc.Dialog.QUSxYX;
        public C34198nVb copydefault;
        public final InterfaceC56387yDm gEmmrt;
        public C33876nJc valueOf;
        public static final C0893ActionBar Companion = new C0893ActionBar(null);
        public static final int AEQbTJ = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC32996moC
        public int getLayoutId() {
            return this.OLrzqt;
        }

        public ActionBar() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            this.KWHzl = arrayList;
            this.EZpvd = new C59534zip(arrayList);
            this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.nUU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return nUP.ActionBar.OLrzqt(this.copydefault);
                }
            });
        }

        /* JADX INFO: renamed from: o.nUP$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0893ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nUP.ActionBar.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ C0893ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0893ActionBar() {
            }

            public final ActionBar KWHzl(@NotNull GroupInfo groupInfo) {
                Intrinsics.checkNotNullParameter(groupInfo, "");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("info", groupInfo);
                ActionBar actionBar = new ActionBar();
                actionBar.setArguments(bundle);
                return actionBar;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GroupInfo AEQbTJ() {
            return (GroupInfo) this.gEmmrt.getValue();
        }

        public static final GroupInfo OLrzqt(ActionBar actionBar) throws OKIMException {
            GroupInfo groupInfo;
            if (Build.VERSION.SDK_INT >= 33) {
                groupInfo = (GroupInfo) actionBar.requireArguments().getParcelable("info", GroupInfo.class);
            } else {
                groupInfo = (GroupInfo) actionBar.requireArguments().getParcelable("info");
            }
            if (groupInfo != null) {
                return groupInfo;
            }
            throw new OKIMException("Group Info cannot be null", -3);
        }

        @Override // o.AbstractC32996moC
        public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(view, "");
            C33876nJc c33876nJcEZpvd = C33876nJc.EZpvd(view);
            this.valueOf = c33876nJcEZpvd;
            if (c33876nJcEZpvd == null) {
                Intrinsics.gEmmrt("");
                c33876nJcEZpvd = null;
            }
            c33876nJcEZpvd.KWHzl.setText(copydefault());
            c33876nJcEZpvd.EZpvd.setLayoutManager(C33047mpA.copydefault(requireContext(), 5));
            KWHzl(this.EZpvd);
            c33876nJcEZpvd.EZpvd.setAdapter(this.EZpvd);
        }

        public final java.lang.CharSequence copydefault() {
            java.lang.String string = getString(C35399nuc.LoaderManager.hbZCHz);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
        public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            C34198nVb c34198nVb = new C34198nVb(AEQbTJ().getGroupId());
            this.copydefault = c34198nVb;
            c34198nVb.observe(getViewLifecycleOwner(), new Application());
        }

        public static final class Application extends AbstractC32943mnC<GroupMemberInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<com.okinc.okimcore.model.other.GroupMemberInfo>] */
            /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Z */
            @Override // o.AbstractC32943mnC, o.AbstractC32992mnz
            /* JADX INFO: renamed from: copydefault */
            public boolean KWHzl(java.util.List<? extends GroupMemberInfo> list) {
                Intrinsics.checkNotNullParameter(list, "");
                return false;
            }

            public Application() {
                super(null, null, 0, 7, null);
            }

            /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Landroid/view/View;)V */
            @Override // o.AbstractC32992mnz
            public void AEQbTJ(java.util.List<GroupMemberInfo> list, android.view.View view) {
                Intrinsics.checkNotNullParameter(list, "");
                super.AEQbTJ(list, view);
                ActionBar.this.OLrzqt(list);
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) ActionBar.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }

            /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Throwable;Ljava/lang/Object;Landroid/view/View;)V */
            @Override // o.AbstractC32992mnz
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public void KWHzl(java.lang.Throwable th, java.util.List<GroupMemberInfo> list, android.view.View view) {
                Intrinsics.checkNotNullParameter(th, "");
                super.KWHzl(th, list, view);
                C33134mqi.AEQbTJ(th.getMessage());
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) ActionBar.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        }

        @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
        public void onResume() {
            super.onResume();
            if (isReenter()) {
                pUU.KWHzl("AdminManage", "onResume->:forceLoad");
                C34198nVb c34198nVb = this.copydefault;
                if (c34198nVb == null) {
                    Intrinsics.gEmmrt("");
                    c34198nVb = null;
                }
                c34198nVb.copydefault();
            }
        }

        public static final java.lang.CharSequence EZpvd(GroupMemberInfo groupMemberInfo) {
            Intrinsics.checkNotNullParameter(groupMemberInfo, "");
            return C44170sFx.copydefault(groupMemberInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void OLrzqt(java.util.List<GroupMemberInfo> list) {
            pUU.KWHzl("AdminManage", "updateList:" + CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: o.nUO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return nUP.ActionBar.EZpvd((GroupMemberInfo) obj);
                }
            }, 30, null));
            java.util.ArrayList arrayList = new java.util.ArrayList(list);
            arrayList.add(new C37736ozU(3, getResources().getDrawable(C35399nuc.ActionBar.iwGUEr), ""));
            if (!list.isEmpty()) {
                arrayList.add(new C37736ozU(4, getResources().getDrawable(C35399nuc.ActionBar.ORxRYg), ""));
            }
            this.KWHzl.clear();
            this.KWHzl.addAll(arrayList);
            this.EZpvd.notifyDataSetChanged();
        }

        public final void KWHzl(@NotNull C59534zip c59534zip) {
            Intrinsics.checkNotNullParameter(c59534zip, "");
            c59534zip.register(GroupMemberInfo.class, new TaskDescription());
            c59534zip.register(C37736ozU.class, new StateListAnimator(C35399nuc.Dialog.fLIjIY, C35342ntX.djBIcL));
        }

        public static final class TaskDescription extends C36420oad {
            /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
            /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
            @Override // o.C36420oad, o.AbstractC43310rmq
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public void onBindViewHolder(C43312rms<nLB> c43312rms, GroupMemberInfo groupMemberInfo) {
                Intrinsics.checkNotNullParameter(c43312rms, "");
                Intrinsics.checkNotNullParameter(groupMemberInfo, "");
                super.onBindViewHolder(c43312rms, groupMemberInfo);
            }
        }

        public static final class StateListAnimator extends C43318rmy<C37736ozU, nLJ> {
            public StateListAnimator(int i, int i2) {
                super(i, i2);
            }

            /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
            /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
            @Override // o.AbstractC43310rmq
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public void onBindViewHolder(C43312rms<nLJ> c43312rms, final C37736ozU c37736ozU) {
                Intrinsics.checkNotNullParameter(c43312rms, "");
                Intrinsics.checkNotNullParameter(c37736ozU, "");
                super.onBindViewHolder((C43312rms) c43312rms, c37736ozU);
                ((nLJ) c43312rms.OLrzqt()).EZpvd.setImageDrawable(c37736ozU.copydefault());
                android.view.View view = c43312rms.itemView;
                final ActionBar actionBar = ActionBar.this;
                view.setOnClickListener(new View.OnClickListener() { // from class: o.nUW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        nUP.ActionBar.StateListAnimator.copydefault(c37736ozU, actionBar, view2);
                    }
                });
            }

            public static final void copydefault(C37736ozU c37736ozU, final ActionBar actionBar, android.view.View view) {
                java.lang.String groupId;
                int iAEQbTJ = c37736ozU.AEQbTJ();
                if (iAEQbTJ != 3) {
                    if (iAEQbTJ != 4) {
                        return;
                    }
                    nVU.TaskDescription taskDescription = nVU.Companion;
                    FragmentActivity fragmentActivityRequireActivity = actionBar.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    actionBar.startActivity(taskDescription.EZpvd(fragmentActivityRequireActivity, actionBar.AEQbTJ(), null, ModifyType.REMOVE));
                    return;
                }
                GroupInfo groupInfoAEQbTJ = actionBar.AEQbTJ();
                if (groupInfoAEQbTJ == null || (groupId = groupInfoAEQbTJ.getGroupId()) == null) {
                    return;
                }
                FragmentActivity fragmentActivityRequireActivity2 = actionBar.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
                C37683oyU.AEQbTJ(groupId, fragmentActivityRequireActivity2, new Function1() { // from class: o.nUV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return nUP.ActionBar.StateListAnimator.KWHzl(actionBar, (java.util.List) obj);
                    }
                }, new Function1() { // from class: o.nUT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return nUP.ActionBar.StateListAnimator.KWHzl((java.lang.Throwable) obj);
                    }
                });
            }

            public static final java.lang.CharSequence AEQbTJ(GroupMemberInfo groupMemberInfo) {
                Intrinsics.checkNotNullParameter(groupMemberInfo, "");
                return groupMemberInfo.getMemberId();
            }

            public static final Unit KWHzl(ActionBar actionBar, java.util.List list) {
                Intrinsics.checkNotNullParameter(list, "");
                java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, ";", null, null, 0, null, new Function1() { // from class: o.nUX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return nUP.ActionBar.StateListAnimator.AEQbTJ((GroupMemberInfo) obj);
                    }
                }, 30, null);
                nVU.TaskDescription taskDescription = nVU.Companion;
                FragmentActivity fragmentActivityRequireActivity = actionBar.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                actionBar.startActivity(taskDescription.EZpvd(fragmentActivityRequireActivity, actionBar.AEQbTJ(), strJoinToString$default, ModifyType.ADD));
                return Unit.INSTANCE;
            }

            public static final Unit KWHzl(java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                C33134mqi.AEQbTJ(th.getMessage());
                return Unit.INSTANCE;
            }
        }
    }

    @Override // o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
