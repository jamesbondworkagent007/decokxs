package o;

import android.view.View;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import com.okinc.im.imui.contacts.RemoveMemberDialogFragment$performRemoveMemberAction$1$1$1;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nzp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35676nzp extends AbstractC35529nxA {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.nzA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35676nzp.EZpvd(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.nzB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35676nzp.djBIcL(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.nzz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35676nzp.AhwBna(this.KWHzl);
        }
    });

    private final java.lang.String EZpvd() {
        return (java.lang.String) this.AEQbTJ.getValue();
    }

    public static final java.lang.String EZpvd(C35676nzp c35676nzp) {
        java.lang.String string;
        android.os.Bundle arguments = c35676nzp.getArguments();
        if (arguments != null && (string = arguments.getString("ARG_REQUEST_KEY")) != null) {
            return string;
        }
        java.lang.String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    private final GroupInfo KWHzl() {
        return (GroupInfo) this.copydefault.getValue();
    }

    public static final GroupInfo djBIcL(C35676nzp c35676nzp) {
        android.os.Bundle arguments = c35676nzp.getArguments();
        if (arguments != null) {
            return (GroupInfo) BundleCompat.getParcelable(arguments, "ARG_GROUP_INFO", GroupInfo.class);
        }
        return null;
    }

    public final java.util.List<java.lang.String> copydefault() {
        return (java.util.List) this.KWHzl.getValue();
    }

    public static final java.util.List AhwBna(C35676nzp c35676nzp) {
        java.util.ArrayList<java.lang.String> stringArrayList;
        android.os.Bundle arguments = c35676nzp.getArguments();
        return (arguments == null || (stringArrayList = arguments.getStringArrayList("ARG_MEMBER_IDS")) == null) ? yDY.AhwBna() : stringArrayList;
    }

    /* JADX INFO: renamed from: o.nzp$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nzp.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C35676nzp EZpvd(@NotNull java.lang.String str, @NotNull GroupInfo groupInfo, @NotNull RelationInfo relationInfo) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(groupInfo, "");
            Intrinsics.checkNotNullParameter(relationInfo, "");
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_REQUEST_KEY", str), C56390yDp.OLrzqt("ARG_GROUP_INFO", groupInfo), C56390yDp.OLrzqt("ARG_MEMBER_IDS", yDY.copydefault(relationInfo.getContactsId())));
            C35676nzp c35676nzp = new C35676nzp();
            c35676nzp.setArguments(bundleBundleOf);
            return c35676nzp;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    @Override // androidx.fragment.app.DialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        java.lang.String strAYXKKw;
        if (KWHzl() == null || copydefault().isEmpty()) {
            dismiss();
            return new android.app.Dialog(requireContext());
        }
        java.lang.String quantityString = getResources().getQuantityString(C35399nuc.Fragment.isConnected, copydefault().size());
        Intrinsics.checkNotNullExpressionValue(quantityString, "");
        GroupInfo groupInfoKWHzl = KWHzl();
        if (groupInfoKWHzl != null) {
            java.lang.Integer type = groupInfoKWHzl.getType();
            int value = GroupTagType.PAID_GROUP.getValue();
            if (type != null && type.intValue() == value) {
                strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.OKvQBs);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.htlTjW);
            }
        }
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C35399nuc.LoaderManager.USBtdM);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivityRequireActivity);
        viewOnClickListenerC54939xaY.setTitle(quantityString);
        viewOnClickListenerC54939xaY.EZpvd(strAYXKKw);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) strAYXKKw2, new View.OnClickListener() { // from class: o.nzs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35676nzp.EZpvd(this.EZpvd, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C35399nuc.LoaderManager.OqFWZa, new View.OnClickListener() { // from class: o.nzu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C35676nzp.copydefault(this.KWHzl, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return viewOnClickListenerC54939xaY;
    }

    public static final void EZpvd(final C35676nzp c35676nzp, android.view.View view) {
        GroupInfo groupInfoKWHzl = c35676nzp.KWHzl();
        if (groupInfoKWHzl != null) {
            c35676nzp.OLrzqt(c35676nzp.copydefault(), groupInfoKWHzl, new Function0() { // from class: o.nzC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C35676nzp.valueOf(this.EZpvd);
                }
            }, new Function1() { // from class: o.nzx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C35676nzp.OLrzqt(this.KWHzl, (java.lang.Throwable) obj);
                }
            });
        }
    }

    public static final Unit valueOf(C35676nzp c35676nzp) {
        FragmentKt.setFragmentResult(c35676nzp, c35676nzp.EZpvd(), BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_REMOVE_MEMBER_RESULT", java.lang.Boolean.TRUE)));
        c35676nzp.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C35676nzp c35676nzp, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.AhwBna);
        java.lang.String strCopydefault = C44157sFk.copydefault(th);
        if (strCopydefault != null) {
            strAYXKKw = strCopydefault;
        }
        C55326xho.toastWithFailedIcon$default(strAYXKKw, 0, 1, (java.lang.Object) null);
        FragmentKt.setFragmentResult(c35676nzp, c35676nzp.EZpvd(), BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_REMOVE_MEMBER_RESULT", java.lang.Boolean.FALSE)));
        return Unit.INSTANCE;
    }

    public static final void copydefault(C35676nzp c35676nzp, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        FragmentKt.setFragmentResult(c35676nzp, c35676nzp.EZpvd(), BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_REMOVE_MEMBER_RESULT", java.lang.Boolean.FALSE)));
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void OLrzqt(java.util.List<java.lang.String> list, GroupInfo groupInfo, final Function0<Unit> function0, final Function1<? super java.lang.Throwable, Unit> function1) {
        InterfaceC35180nqU interfaceC35180nqU;
        FragmentActivity activity = getActivity();
        final AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov == null || (interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class)) == null) {
            return;
        }
        abstractActivityC33041mov.showLoading();
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl(C58156yvv.EZpvd(C44525sTa.copydefault.EZpvd(new RemoveMemberDialogFragment$performRemoveMemberAction$1$1$1(interfaceC35180nqU, groupInfo, list, null)), this));
        final Function1 function12 = new Function1() { // from class: o.nzy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35676nzp.OLrzqt(abstractActivityC33041mov, function0, (Unit) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.nzw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C35676nzp.KWHzl(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.nzv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35676nzp.OLrzqt(abstractActivityC33041mov, function1, (java.lang.Throwable) obj);
            }
        };
        abstractActivityC33041mov.addDisposable(abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.nzD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C35676nzp.copydefault(function13, obj);
            }
        }));
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov, Function0 function0, Unit unit) {
        abstractActivityC33041mov.dismissLoading();
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(AbstractActivityC33041mov abstractActivityC33041mov, Function1 function1, java.lang.Throwable th) {
        abstractActivityC33041mov.dismissLoading();
        Intrinsics.copydefault(th);
        C44157sFk.KWHzl(th);
        function1.invoke(th);
        return Unit.INSTANCE;
    }
}
