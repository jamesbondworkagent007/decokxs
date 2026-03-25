package o;

import android.os.Build;
import android.view.View;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.imui.group.create.affiliate.CreateAffiliateGroupFragment$performCreateAffiliateGroup$1;
import com.okinc.im.imui.picker.PickerSelectionType;
import com.okinc.okimcore.model.other.AffiliateMemberFilter;
import com.okinc.okimcore.model.other.GroupAddMembersResult;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.rxutils.RxBus;
import com.okinc.uilab.edit.OKEditText;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC35723oBh;
import o.C35399nuc;
import o.C37152ooT;
import o.nRE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class nRE extends AbstractC32996moC implements AbstractC35723oBh.Activity {
    public ViewOnClickListenerC54939xaY KWHzl;
    public java.lang.String OLrzqt;
    public C33874nJa copydefault;
    public AbstractC35723oBh djBIcL;
    public android.net.Uri valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public final int EZpvd = C35399nuc.Dialog.QVAiDq;
    public final AtomicBoolean AhwBna = new AtomicBoolean(false);
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.nRI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return nRE.gEmmrt(this.EZpvd);
        }
    });
    public java.lang.String AYXKKw = "";
    public final StateListAnimator isConnected = new StateListAnimator();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nRE.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.util.List<AffiliateMemberFilter> EZpvd() {
        return (java.util.List) this.gEmmrt.getValue();
    }

    public static final java.util.List gEmmrt(nRE nre) {
        java.util.ArrayList parcelableArrayList;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableArrayList = nre.requireArguments().getParcelableArrayList("list", AffiliateMemberFilter.class);
        } else {
            parcelableArrayList = nre.requireArguments().getParcelableArrayList("list");
        }
        return parcelableArrayList != null ? parcelableArrayList : yDY.AhwBna();
    }

    public final void KWHzl(java.lang.String str) {
        this.AYXKKw = str;
        requireActivity().invalidateOptionsMenu();
    }

    public final void OLrzqt(android.net.Uri uri) {
        this.valueOf = uri;
        C33874nJa c33874nJa = this.copydefault;
        if (c33874nJa != null) {
            if (c33874nJa == null) {
                Intrinsics.gEmmrt("");
                c33874nJa = null;
            }
            C35893oHp c35893oHp = c33874nJa.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            java.lang.String string = uri != null ? uri.toString() : null;
            C35891oHn.loadGroupAvatar$default(c35893oHp, string != null ? string : "", null, 2, null);
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.copydefault = C33874nJa.EZpvd(view);
        view.post(new java.lang.Runnable() { // from class: o.nRD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                nRE.valueOf(this.copydefault);
            }
        });
    }

    public static final void valueOf(nRE nre) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) nre, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        fragmentActivityRequireActivity.addMenuProvider(this.isConnected, getViewLifecycleOwner(), Lifecycle.State.RESUMED);
        final C33874nJa c33874nJa = this.copydefault;
        if (c33874nJa == null) {
            Intrinsics.gEmmrt("");
            c33874nJa = null;
        }
        OKEditText oKEditText = c33874nJa.copydefault;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C33606mzd.copydefault(oKEditText, viewLifecycleOwner, new Function1() { // from class: o.nRK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nRE.KWHzl(this.EZpvd, (java.lang.CharSequence) obj);
            }
        });
        C35893oHp c35893oHp = c33874nJa.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        C35891oHn.loadGroupAvatar$default(c35893oHp, "", null, 2, null);
        c33874nJa.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.nRL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                nRE.AEQbTJ(this.copydefault, c33874nJa, view2);
            }
        });
    }

    public static final Unit KWHzl(nRE nre, java.lang.CharSequence charSequence) {
        java.lang.String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        nre.KWHzl(string);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(nRE nre, C33874nJa c33874nJa, android.view.View view) {
        C33570myu.AEQbTJ(nre.requireContext(), (android.view.View) c33874nJa.copydefault);
        nre.AEQbTJ();
    }

    public final void AEQbTJ() {
        C37152ooT.Application application = C37152ooT.Companion;
        java.lang.String string = getString(C35399nuc.LoaderManager.hTAtCx);
        Intrinsics.checkNotNullExpressionValue(string, "");
        AbstractC35723oBh abstractC35723oBhCopydefault = application.copydefault(string, (30 & 2) != 0, (30 & 4) != 0 ? null : null, (30 & 8) == 0 ? false : true, (30 & 16) == 0 ? null : null, (30 & 32) != 0 ? PickerSelectionType.ALL : PickerSelectionType.PHOTO);
        this.djBIcL = abstractC35723oBhCopydefault;
        if (abstractC35723oBhCopydefault != null) {
            abstractC35723oBhCopydefault.show(getChildFragmentManager(), "PickImageDialogFragment");
        }
    }

    public final boolean OLrzqt() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AYXKKw)) {
            java.util.List<AffiliateMemberFilter> listEZpvd = EZpvd();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = listEZpvd.iterator();
            while (it.hasNext()) {
                C56406yEe.KWHzl(arrayList, ((AffiliateMemberFilter) it.next()).getIdentifyIds());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static final class StateListAnimator implements MenuProvider {
        public StateListAnimator() {
        }

        @Override // androidx.core.view.MenuProvider
        public void onCreateMenu(android.view.Menu menu, android.view.MenuInflater menuInflater) {
            Intrinsics.checkNotNullParameter(menu, "");
            Intrinsics.checkNotNullParameter(menuInflater, "");
            menuInflater.inflate(C35399nuc.FragmentManager.copydefault, menu);
        }

        @Override // androidx.core.view.MenuProvider
        public void onPrepareMenu(android.view.Menu menu) {
            Intrinsics.checkNotNullParameter(menu, "");
            android.view.MenuItem menuItemFindItem = menu.findItem(C35399nuc.StateListAnimator.DDjfYY);
            if (menuItemFindItem != null) {
                nRE nre = nRE.this;
                menuItemFindItem.setTitle(C33070mpX.AYXKKw(C35399nuc.LoaderManager.fOrBHg));
                menuItemFindItem.setEnabled(nre.OLrzqt());
            }
            super.onPrepareMenu(menu);
        }

        @Override // androidx.core.view.MenuProvider
        public boolean onMenuItemSelected(android.view.MenuItem menuItem) {
            Intrinsics.checkNotNullParameter(menuItem, "");
            if (menuItem.getItemId() != C35399nuc.StateListAnimator.DDjfYY || !nRE.this.OLrzqt()) {
                return true;
            }
            nRE nre = nRE.this;
            java.lang.String str = nre.AYXKKw;
            java.lang.String str2 = nRE.this.OLrzqt;
            java.lang.String str3 = str2 == null ? "" : str2;
            android.net.Uri uri = nRE.this.valueOf;
            java.util.List listEZpvd = nRE.this.EZpvd();
            final nRE nre2 = nRE.this;
            Function1 function1 = new Function1() { // from class: o.nRM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return nRE.StateListAnimator.AEQbTJ(nre2, (GroupInfo) obj);
                }
            };
            final nRE nre3 = nRE.this;
            nre.EZpvd(str, str3, uri, listEZpvd, function1, new Function2() { // from class: o.nRR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return nRE.StateListAnimator.copydefault(nre3, (GroupInfo) obj, (GroupAddMembersResult) obj2);
                }
            }, new Function1() { // from class: o.nRQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return nRE.StateListAnimator.KWHzl((java.lang.Throwable) obj);
                }
            });
            return true;
        }

        public static final Unit AEQbTJ(nRE nre, GroupInfo groupInfo) {
            Intrinsics.checkNotNullParameter(groupInfo, "");
            RxBus.KWHzl("event_created_affiliate_group");
            nre.AEQbTJ(groupInfo, nre.AYXKKw);
            return Unit.INSTANCE;
        }

        public static final Unit copydefault(final nRE nre, final GroupInfo groupInfo, GroupAddMembersResult groupAddMembersResult) {
            Intrinsics.checkNotNullParameter(groupInfo, "");
            Intrinsics.checkNotNullParameter(groupAddMembersResult, "");
            FragmentActivity activity = nre.getActivity();
            if (activity != null) {
                nre.KWHzl = nWM.EZpvd.copydefault(activity, groupAddMembersResult, groupInfo.getGroupId(), new Function0() { // from class: o.nRJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return nRE.StateListAnimator.KWHzl(nre, groupInfo);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(nRE nre, GroupInfo groupInfo) {
            RxBus.KWHzl("event_created_affiliate_group");
            nre.AEQbTJ(groupInfo, nre.AYXKKw);
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            C44157sFk.KWHzl(th);
            return Unit.INSTANCE;
        }
    }

    public final void AEQbTJ(GroupInfo groupInfo, java.lang.String str) {
        sHZ shzAEQbTJ;
        sIR sirCopydefault;
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU != null && (shzAEQbTJ = interfaceC35180nqU.AEQbTJ()) != null && (sirCopydefault = shzAEQbTJ.copydefault()) != null) {
            sirCopydefault.copydefault(groupInfo.getGroupId());
        }
        nWM nwm = nWM.EZpvd;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        nwm.OLrzqt((AbstractActivityC33041mov) fragmentActivityRequireActivity, groupInfo, str);
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2, android.net.Uri uri, java.util.List<AffiliateMemberFilter> list, Function1<? super GroupInfo, Unit> function1, Function2<? super GroupInfo, ? super GroupAddMembersResult, Unit> function2, Function1<? super java.lang.Throwable, Unit> function12) {
        pUU.KWHzl("createGroup", "performCreateAffiliateGroup->mIsCreatingGroup:" + this.AhwBna.get());
        if (this.AhwBna.getAndSet(true)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CreateAffiliateGroupFragment$performCreateAffiliateGroup$1(this, str, str2, uri, list, function12, function1, function2, null), 3, null);
    }

    @Override // o.AbstractC35723oBh.Activity
    public void copydefault(@NotNull android.net.Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        OLrzqt(uri);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AbstractC35723oBh abstractC35723oBh = this.djBIcL;
        if (abstractC35723oBh != null) {
            abstractC35723oBh.dismissAllowingStateLoss();
        }
        C33062mpP.OLrzqt(this.KWHzl);
    }
}
