package com.okinc.im.imui.group.members;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.tabs.TabLayout;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33869nIw;
import o.C33069mpW;
import o.C35399nuc;
import o.C35626nys;
import o.C44157sFk;
import o.C55113xdn;
import o.C55173xeu;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.nWQ;
import o.pTB;
import o.rVN;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class GroupMembersActivity$initViewModel$1 extends SuspendLambda implements yHO<CoroutineScope, GroupMemberListViewModel.StateListAnimator, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nWQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupMembersActivity$initViewModel$1(nWQ nwq, Continuation<? super GroupMembersActivity$initViewModel$1> continuation) {
        super(3, continuation);
        this.this$0 = nwq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, GroupMemberListViewModel.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
        GroupMembersActivity$initViewModel$1 groupMembersActivity$initViewModel$1 = new GroupMembersActivity$initViewModel$1(this.this$0, continuation);
        groupMembersActivity$initViewModel$1.L$0 = stateListAnimator;
        return groupMembersActivity$initViewModel$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupMemberListViewModel.StateListAnimator stateListAnimator = (GroupMemberListViewModel.StateListAnimator) this.L$0;
            this.this$0.dismissLoading();
            T tKWHzl = this.this$0.KWHzl();
            nWQ nwq = this.this$0;
            AbstractC33869nIw abstractC33869nIw = (AbstractC33869nIw) tKWHzl;
            if (stateListAnimator instanceof GroupMemberListViewModel.StateListAnimator.C0446StateListAnimator) {
                C55113xdn c55113xdn = abstractC33869nIw.values;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                c55113xdn.setVisibility(0);
                C55173xeu c55173xeu = abstractC33869nIw.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                c55173xeu.setVisibility(8);
                LinearLayout linearLayout = abstractC33869nIw.copydefault;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(8);
                TextView textView = abstractC33869nIw.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(8);
            } else if (stateListAnimator instanceof GroupMemberListViewModel.StateListAnimator.ActionBar) {
                nwq.showLoading();
            } else if (stateListAnimator instanceof GroupMemberListViewModel.StateListAnimator.Application) {
                C55113xdn c55113xdn2 = abstractC33869nIw.values;
                Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                c55113xdn2.setVisibility(8);
                C55173xeu c55173xeu2 = abstractC33869nIw.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                c55173xeu2.setVisibility(8);
                LinearLayout linearLayout2 = abstractC33869nIw.copydefault;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                linearLayout2.setVisibility(0);
                GroupMemberListViewModel.StateListAnimator.Application application = (GroupMemberListViewModel.StateListAnimator.Application) stateListAnimator;
                nwq.OLrzqt().OLrzqt(application.OLrzqt());
                TabLayout tabLayout = abstractC33869nIw.djBIcL;
                Intrinsics.checkNotNullExpressionValue(tabLayout, "");
                tabLayout.setVisibility(application.OLrzqt().size() > 1 ? 0 : 8);
                if (application.copydefault() > 0) {
                    abstractC33869nIw.fetchVPNInfo.setText(pTB.formatLocalized$default(String.valueOf(application.copydefault()), null, 1, null));
                    TextView textView2 = abstractC33869nIw.fetchVPNInfo;
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    textView2.setVisibility(0);
                } else {
                    abstractC33869nIw.fetchVPNInfo.setVisibility(4);
                }
                String localized$default = pTB.formatLocalized$default(String.valueOf(application.EZpvd()), null, 1, null);
                abstractC33869nIw.isConnected.setText(C33069mpW.copydefault(C35399nuc.LoaderManager.hgxRZI, C56424yEw.gEmmrt(C56390yDp.OLrzqt("count", localized$default), C56390yDp.OLrzqt("max", pTB.formatLocalized$default(String.valueOf(application.copydefault()), null, 1, null)))));
                abstractC33869nIw.OLrzqt.setText(C33069mpW.copydefault(C35399nuc.LoaderManager.svhCHd, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", localized$default))));
                abstractC33869nIw.OLrzqt.setEnabled(application.EZpvd() > 0);
                rVN.reportFullyDrawn$default((Activity) nwq, true, (String) null, 2, (Object) null);
            } else if (stateListAnimator instanceof GroupMemberListViewModel.StateListAnimator.Activity) {
                C35626nys c35626nys = nwq.gEmmrt;
                if (c35626nys != null) {
                    c35626nys.dismissAllowingStateLoss();
                }
                C35626nys.ActionBar actionBar = C35626nys.Companion;
                FragmentManager supportFragmentManager = nwq.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                nwq.gEmmrt = actionBar.EZpvd(supportFragmentManager, ChatOrigin.CONTACT_INFO.getValue(), "", ((GroupMemberListViewModel.StateListAnimator.Activity) stateListAnimator).copydefault(), null, nwq.fetchVPNInfo(), false, nwq.fetchVPNInfo());
            } else if (stateListAnimator instanceof GroupMemberListViewModel.StateListAnimator.FragmentManager) {
                nwq.valueOf();
            } else if (stateListAnimator instanceof GroupMemberListViewModel.StateListAnimator.Dialog) {
                C44157sFk.KWHzl(((GroupMemberListViewModel.StateListAnimator.Dialog) stateListAnimator).copydefault());
            } else {
                if (!(stateListAnimator instanceof GroupMemberListViewModel.StateListAnimator.TaskDescription)) {
                    throw new NoWhenBranchMatchedException();
                }
                C55113xdn c55113xdn3 = abstractC33869nIw.values;
                Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                c55113xdn3.setVisibility(8);
                C55173xeu c55173xeu3 = abstractC33869nIw.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
                c55173xeu3.setVisibility(0);
                LinearLayout linearLayout3 = abstractC33869nIw.copydefault;
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                linearLayout3.setVisibility(8);
                TextView textView3 = abstractC33869nIw.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                textView3.setVisibility(8);
                C44157sFk.KWHzl(((GroupMemberListViewModel.StateListAnimator.TaskDescription) stateListAnimator).EZpvd());
                rVN.reportFullyDrawn$default((Activity) nwq, false, (String) null, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
