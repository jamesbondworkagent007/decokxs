package o;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.imui.bean.ModifyType;
import com.okinc.im.imui.group.management.ModifyAdministratorsActivity$ModifyAdminFragment$performAddAdminAction$1$1;
import com.okinc.im.imui.group.management.ModifyAdministratorsActivity$ModifyAdminFragment$performRemoveAdminAction$1$1;
import com.okinc.im.widgets.SelectableDelegate;
import com.okinc.okimcore.model.exception.OKIMException;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.GroupRole;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import o.C52761wXj;
import o.nVU;
import o.oHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nVU extends nVP {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int fetchVPNInfo = 8;
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.nVV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return nVU.gEmmrt(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.nWa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return nVU.OLrzqt(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.nVZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return nVU.valueOf(this.AEQbTJ);
        }
    });

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

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
            EZpvd = iArr;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nVU.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, GroupInfo groupInfo, java.lang.String str, ModifyType modifyType) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) nVU.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("info", groupInfo), C56390yDp.OLrzqt("id", str), C56390yDp.OLrzqt("type", modifyType)));
            return intent;
        }
    }

    private final GroupInfo gEmmrt() {
        return (GroupInfo) this.values.getValue();
    }

    public static final GroupInfo gEmmrt(nVU nvu) {
        if (Build.VERSION.SDK_INT >= 33) {
            return (GroupInfo) nvu.getIntent().getParcelableExtra("info", GroupInfo.class);
        }
        return (GroupInfo) nvu.getIntent().getParcelableExtra("info");
    }

    /* JADX DEBUG: Possible override for method o.nVP.AYXKKw()V */
    public final java.lang.String AYXKKw() {
        return (java.lang.String) this.isConnected.getValue();
    }

    public static final java.lang.String OLrzqt(nVU nvu) {
        return nvu.getIntent().getStringExtra("id");
    }

    private final ModifyType isConnected() {
        return (ModifyType) this.DbNXlk.getValue();
    }

    public static final ModifyType valueOf(nVU nvu) {
        if (Build.VERSION.SDK_INT >= 33) {
            return (ModifyType) nvu.getIntent().getParcelableExtra("type", ModifyType.class);
        }
        return (ModifyType) nvu.getIntent().getParcelableExtra("type");
    }

    @Override // o.nVP, o.nPL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setBackgroundDrawable(new ColorDrawable(C33070mpX.copydefault(C52761wXj.Activity.EZpvd)));
        }
        ModifyType modifyTypeIsConnected = isConnected();
        if (modifyTypeIsConnected != null) {
            nPO.copydefault(this).setText(EZpvd(modifyTypeIsConnected));
            nPO.copydefault(this).setTextAppearance(C52761wXj.LoaderManager.dUDNAs);
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.nVR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                nVU.AhwBna(this.copydefault);
            }
        });
    }

    public static final void AhwBna(nVU nvu) {
        rVN.reportFullyDrawn$default((android.app.Activity) nvu, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    @Override // o.nPL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public androidx.fragment.app.Fragment AEQbTJ() throws OKIMException {
        StateListAnimator stateListAnimatorNewInstance$default;
        GroupInfo groupInfoGEmmrt = gEmmrt();
        if (groupInfoGEmmrt != null) {
            ModifyType modifyTypeIsConnected = isConnected();
            if (modifyTypeIsConnected != null) {
                int i = ActionBar.EZpvd[modifyTypeIsConnected.ordinal()];
                if (i == 1) {
                    java.lang.String strAYXKKw = AYXKKw();
                    if (strAYXKKw != null) {
                        stateListAnimatorNewInstance$default = StateListAnimator.C0894StateListAnimator.newInstance$default(StateListAnimator.Companion, groupInfoGEmmrt, modifyTypeIsConnected, null, false, new java.util.ArrayList(StringsKt__StringsKt.split$default((java.lang.CharSequence) strAYXKKw, new java.lang.String[]{";"}, false, 0, 6, (java.lang.Object) null)), 12, null);
                    } else {
                        pUU.copydefault("mAllAdminIds cannot be null");
                        finish();
                    }
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    stateListAnimatorNewInstance$default = StateListAnimator.C0894StateListAnimator.newInstance$default(StateListAnimator.Companion, groupInfoGEmmrt, modifyTypeIsConnected, null, false, null, 28, null);
                }
                if (stateListAnimatorNewInstance$default == null) {
                    return stateListAnimatorNewInstance$default;
                }
                throw new OKIMException("Could not create ModifyAdminFragment", -4);
            }
            pUU.copydefault("ModifyType cannot be null");
            finish();
        } else {
            pUU.copydefault("Group Info cannot be null");
            finish();
        }
        stateListAnimatorNewInstance$default = null;
        if (stateListAnimatorNewInstance$default == null) {
        }
    }

    public final java.lang.String EZpvd(ModifyType modifyType) {
        int i = ActionBar.EZpvd[modifyType.ordinal()];
        if (i == 1) {
            java.lang.String string = getString(C35399nuc.LoaderManager.iLWfRf);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        java.lang.String string2 = getString(C35399nuc.LoaderManager.Qsauvs);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator extends nXG {
        public static final C0894StateListAnimator Companion = new C0894StateListAnimator(null);
        public static final int EZpvd = 8;
        public ViewOnClickListenerC54939xaY OLrzqt;
        public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.nWg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return nVU.StateListAnimator.AYXKKw(this.copydefault);
            }
        });
        public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.nWi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return nVU.StateListAnimator.isConnected(this.AEQbTJ);
            }
        });
        public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.nVY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return nVU.StateListAnimator.djBIcL(this.OLrzqt);
            }
        });

        public final /* synthetic */ class Activity {
            public static final /* synthetic */ int[] AEQbTJ;

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
                AEQbTJ = iArr;
            }
        }

        /* JADX INFO: renamed from: o.nVU$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0894StateListAnimator {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nVU.StateListAnimator.StateListAnimator.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ C0894StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0894StateListAnimator() {
            }

            /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.nVU$StateListAnimator$StateListAnimator */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ StateListAnimator newInstance$default(C0894StateListAnimator c0894StateListAnimator, GroupInfo groupInfo, ModifyType modifyType, SelectableDelegate.Mode mode, boolean z, java.util.ArrayList arrayList, int i, java.lang.Object obj) {
                if ((i & 4) != 0) {
                    mode = SelectableDelegate.Mode.MULTIPLE;
                }
                SelectableDelegate.Mode mode2 = mode;
                if ((i & 8) != 0) {
                    z = true;
                }
                boolean z2 = z;
                if ((i & 16) != 0) {
                    arrayList = new java.util.ArrayList();
                }
                return c0894StateListAnimator.AEQbTJ(groupInfo, modifyType, mode2, z2, arrayList);
            }

            public final StateListAnimator AEQbTJ(@NotNull GroupInfo groupInfo, @NotNull ModifyType modifyType, @NotNull SelectableDelegate.Mode mode, boolean z, @NotNull java.util.ArrayList<java.lang.String> arrayList) {
                Intrinsics.checkNotNullParameter(groupInfo, "");
                Intrinsics.checkNotNullParameter(modifyType, "");
                Intrinsics.checkNotNullParameter(mode, "");
                Intrinsics.checkNotNullParameter(arrayList, "");
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("info", groupInfo);
                bundle.putParcelable(OtcExtraKeys.MODE, mode);
                bundle.putParcelable("type", modifyType);
                bundle.putBoolean("filterable", z);
                bundle.putStringArrayList("list", arrayList);
                StateListAnimator stateListAnimator = new StateListAnimator();
                stateListAnimator.setArguments(bundle);
                return stateListAnimator;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GroupInfo getNewProxyInstance() {
            return (GroupInfo) this.copydefault.getValue();
        }

        public static final GroupInfo AYXKKw(StateListAnimator stateListAnimator) throws OKIMException {
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

        /* JADX DEBUG: Possible override for method o.nXG.OLrzqt()Lcom/okinc/okimcore/model/other/GroupInfo; */
        /* JADX DEBUG: Possible override for method o.nXg.OLrzqt()V */
        public final ModifyType OLrzqt() {
            return (ModifyType) this.AEQbTJ.getValue();
        }

        public static final ModifyType isConnected(StateListAnimator stateListAnimator) throws OKIMException {
            ModifyType modifyType;
            if (Build.VERSION.SDK_INT >= 33) {
                modifyType = (ModifyType) stateListAnimator.requireArguments().getParcelable("type", ModifyType.class);
            } else {
                modifyType = (ModifyType) stateListAnimator.requireArguments().getParcelable("type");
            }
            if (modifyType != null) {
                return modifyType;
            }
            throw new OKIMException("Modify Type cannot be null", -3);
        }

        /* JADX DEBUG: Possible override for method o.nXG.AEQbTJ()Ljava/util/List; */
        public final java.util.Set<java.lang.String> AEQbTJ() {
            return (java.util.Set) this.KWHzl.getValue();
        }

        public static final java.util.Set djBIcL(StateListAnimator stateListAnimator) throws OKIMException {
            java.util.Set setOqFWZa;
            java.util.ArrayList<java.lang.String> stringArrayList = stateListAnimator.requireArguments().getStringArrayList("list");
            if (stringArrayList == null || (setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(stringArrayList)) == null) {
                throw new OKIMException("Admin ID list cannot be null", -3);
            }
            return setOqFWZa;
        }

        @Override // androidx.fragment.app.Fragment
        public void onCreate(android.os.Bundle bundle) {
            super.onCreate(bundle);
            setHasOptionsMenu(true);
        }

        @Override // o.nXG, o.AbstractC32996moC, androidx.fragment.app.Fragment
        public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, bundle);
            DbNXlk().setVisibility(0);
            android.widget.ImageView imageViewValueOf = valueOf();
            imageViewValueOf.setEnabled(true);
            imageViewValueOf.setOnClickListener(new View.OnClickListener() { // from class: o.nWc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    nVU.StateListAnimator.KWHzl(this.OLrzqt, view2);
                }
            });
            int i = Activity.AEQbTJ[OLrzqt().ordinal()];
            if (i == 1) {
                gEmmrt().setOnClickListener(new View.OnClickListener() { // from class: o.nWk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        nVU.StateListAnimator.OLrzqt(this.AEQbTJ, view2);
                    }
                });
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                gEmmrt().setOnClickListener(new View.OnClickListener() { // from class: o.nWh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        nVU.StateListAnimator.djBIcL(this.AEQbTJ, view2);
                    }
                });
            }
        }

        public static final void KWHzl(StateListAnimator stateListAnimator, android.view.View view) {
            FragmentActivity activity = stateListAnimator.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }

        public static final void OLrzqt(StateListAnimator stateListAnimator, android.view.View view) {
            java.util.List<GroupMemberInfo> listEjfBZ = stateListAnimator.ejfBZ();
            java.lang.Integer type = stateListAnimator.getNewProxyInstance().getType();
            int value = GroupTagType.PAID_GROUP.getValue();
            if (type != null && type.intValue() == value) {
                stateListAnimator.OLrzqt(listEjfBZ);
            } else {
                stateListAnimator.EZpvd(listEjfBZ);
            }
        }

        public static final void djBIcL(StateListAnimator stateListAnimator, android.view.View view) {
            stateListAnimator.KWHzl(stateListAnimator.ejfBZ());
        }

        public final void EZpvd(java.util.List<GroupMemberInfo> list) {
            OLrzqt(list, new Function0() { // from class: o.nVX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return nVU.StateListAnimator.AhwBna(this.EZpvd);
                }
            });
        }

        public static final Unit AhwBna(StateListAnimator stateListAnimator) {
            FragmentActivity activity = stateListAnimator.getActivity();
            if (activity != null) {
                activity.finish();
            }
            return Unit.INSTANCE;
        }

        public final void OLrzqt(final java.util.List<GroupMemberInfo> list) {
            oHT.ActionBar actionBar = oHT.Companion;
            java.lang.String formattedQuantityString$default = pTD.getFormattedQuantityString$default(this, C35399nuc.Fragment.AubY, list.size(), (java.util.Map) null, 4, (java.lang.Object) null);
            java.lang.String string = getString(C35399nuc.LoaderManager.IKQXqd);
            Intrinsics.checkNotNullExpressionValue(string, "");
            oHT ohtAEQbTJ = actionBar.AEQbTJ(formattedQuantityString$default, string, getString(C35399nuc.LoaderManager.hDKMBd));
            ohtAEQbTJ.copydefault(new Function0() { // from class: o.nVW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return nVU.StateListAnimator.OLrzqt(this.copydefault, list);
                }
            });
            androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            ohtAEQbTJ.show(parentFragmentManager);
        }

        public static final Unit OLrzqt(StateListAnimator stateListAnimator, java.util.List list) {
            stateListAnimator.EZpvd((java.util.List<GroupMemberInfo>) list);
            return Unit.INSTANCE;
        }

        public static final java.lang.CharSequence OLrzqt(GroupMemberInfo groupMemberInfo) {
            Intrinsics.checkNotNullParameter(groupMemberInfo, "");
            return C44157sFk.EZpvd(groupMemberInfo);
        }

        public final void KWHzl(final java.util.List<GroupMemberInfo> list) {
            java.lang.String strCopydefault = C33069mpW.copydefault(this, C35399nuc.LoaderManager.aQtmcU, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("name", CollectionsKt___CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: o.nWf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return nVU.StateListAnimator.OLrzqt((GroupMemberInfo) obj);
                }
            }, 30, null))));
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivityRequireActivity);
            viewOnClickListenerC54939xaY.setTitle(strCopydefault);
            viewOnClickListenerC54939xaY.EZpvd(getString(C35399nuc.LoaderManager.GCXiNH));
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C35399nuc.LoaderManager.OijiEz), new View.OnClickListener() { // from class: o.nWe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    nVU.StateListAnimator.EZpvd(this.AEQbTJ, list, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C35399nuc.LoaderManager.AubY), new View.OnClickListener() { // from class: o.nWb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    nVU.StateListAnimator.KWHzl(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.setCancelable(true);
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
            viewOnClickListenerC54939xaY.show();
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        public static final void EZpvd(final StateListAnimator stateListAnimator, java.util.List list, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
            stateListAnimator.AEQbTJ((java.util.List<GroupMemberInfo>) list, new Function0() { // from class: o.nWd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return nVU.StateListAnimator.valueOf(this.KWHzl);
                }
            });
            viewOnClickListenerC54939xaY.dismiss();
        }

        public static final Unit valueOf(StateListAnimator stateListAnimator) {
            FragmentActivity activity = stateListAnimator.getActivity();
            if (activity != null) {
                activity.finish();
            }
            return Unit.INSTANCE;
        }

        public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
            viewOnClickListenerC54939xaY.dismiss();
        }

        @Override // o.nXG
        public java.util.List<java.lang.Object> AEQbTJ(@NotNull java.util.List<? extends java.lang.Object> list) {
            java.util.ArrayList arrayList;
            Intrinsics.checkNotNullParameter(list, "");
            int i = Activity.AEQbTJ[OLrzqt().ordinal()];
            if (i == 1) {
                java.util.List<java.lang.Object> listAEQbTJ = super.AEQbTJ(list);
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listAEQbTJ) {
                    if (obj instanceof GroupMemberInfo) {
                        GroupMemberInfo groupMemberInfo = (GroupMemberInfo) obj;
                        boolean zContains = AEQbTJ().contains(groupMemberInfo.getMemberId());
                        boolean z = groupMemberInfo.getRole() == GroupRole.Common;
                        if (zContains || !z) {
                        }
                    }
                    arrayList.add(obj);
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                java.util.List<java.lang.Object> listAEQbTJ2 = super.AEQbTJ(list);
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : listAEQbTJ2) {
                    if (!(obj2 instanceof GroupMemberInfo) || ((GroupMemberInfo) obj2).getRole() == GroupRole.Administrator) {
                        arrayList.add(obj2);
                    }
                }
            }
            return arrayList;
        }

        public final void OLrzqt(java.util.List<GroupMemberInfo> list, Function0<Unit> function0) {
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU != null) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ModifyAdministratorsActivity$ModifyAdminFragment$performAddAdminAction$1$1(this, interfaceC35180nqU, list, function0, null), 3, null);
            }
        }

        public final void AEQbTJ(java.util.List<GroupMemberInfo> list, Function0<Unit> function0) {
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU != null) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ModifyAdministratorsActivity$ModifyAdminFragment$performRemoveAdminAction$1$1(this, interfaceC35180nqU, list, function0, null), 3, null);
            }
        }

        @Override // o.nXG
        public void KWHzl(int i) {
            super.KWHzl(i);
            C52794wYp c52794wYpGEmmrt = gEmmrt();
            c52794wYpGEmmrt.setEnabled(i > 0);
            int i2 = Activity.AEQbTJ[OLrzqt().ordinal()];
            if (i2 == 1) {
                c52794wYpGEmmrt.setText(C33069mpW.copydefault(this, C35399nuc.LoaderManager.HJWChPdIKEqB, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(ejfBZ().size())))));
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                c52794wYpGEmmrt.setText(C33069mpW.copydefault(this, C35399nuc.LoaderManager.svhCHd, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(ejfBZ().size())))));
            }
        }

        @Override // o.nXG, androidx.fragment.app.Fragment
        public void onDestroy() {
            super.onDestroy();
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.OLrzqt;
            if (viewOnClickListenerC54939xaY != null) {
                C33062mpP.OLrzqt(viewOnClickListenerC54939xaY);
            }
        }
    }

    @Override // o.nVP, o.nPL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.nVP, o.nPL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.nVP, o.nPL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.nVP, o.nPL, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
