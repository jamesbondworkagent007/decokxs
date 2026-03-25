package com.okinc.im.imui.group.paidgroup.membershipsettings;

import android.widget.ScrollView;
import androidx.fragment.app.Fragment;
import com.okinc.im.imui.group.paidgroup.membershipsettings.MembershipSettingsViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C34323nZs;
import o.C55113xdn;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.nJY;
import o.rVN;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class MembershipSettingsFragment$setupObservers$1$1 extends SuspendLambda implements yHO<CoroutineScope, MembershipSettingsViewModel.ActionBar, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34323nZs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MembershipSettingsFragment$setupObservers$1$1(C34323nZs c34323nZs, Continuation<? super MembershipSettingsFragment$setupObservers$1$1> continuation) {
        super(3, continuation);
        this.this$0 = c34323nZs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, MembershipSettingsViewModel.ActionBar actionBar, Continuation<? super Unit> continuation) {
        MembershipSettingsFragment$setupObservers$1$1 membershipSettingsFragment$setupObservers$1$1 = new MembershipSettingsFragment$setupObservers$1$1(this.this$0, continuation);
        membershipSettingsFragment$setupObservers$1$1.L$0 = actionBar;
        return membershipSettingsFragment$setupObservers$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            MembershipSettingsViewModel.ActionBar actionBar = (MembershipSettingsViewModel.ActionBar) this.L$0;
            nJY njy = this.this$0.gEmmrt;
            if (njy == null) {
                Intrinsics.gEmmrt("");
                njy = null;
            }
            C34323nZs c34323nZs = this.this$0;
            if (Intrinsics.EZpvd(actionBar, MembershipSettingsViewModel.ActionBar.Application.EZpvd)) {
                C55113xdn c55113xdn = njy.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                c55113xdn.setVisibility(0);
                C55113xdn.showLoading$default(njy.fetchVPNInfo, 0L, 1, null);
            } else if (Intrinsics.EZpvd(actionBar, MembershipSettingsViewModel.ActionBar.StateListAnimator.EZpvd)) {
                C55113xdn c55113xdn2 = njy.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                c55113xdn2.setVisibility(8);
                njy.fetchVPNInfo.copydefault();
                ScrollView scrollView = njy.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(scrollView, "");
                scrollView.setVisibility(0);
                C55173xeu c55173xeu = njy.copydefault;
                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                c55173xeu.setVisibility(8);
                rVN.reportFullyDrawn$default((Fragment) c34323nZs, true, (String) null, 2, (Object) null);
            } else if (actionBar instanceof MembershipSettingsViewModel.ActionBar.C0448ActionBar) {
                MembershipSettingsViewModel.ActionBar.C0448ActionBar c0448ActionBar = (MembershipSettingsViewModel.ActionBar.C0448ActionBar) actionBar;
                c34323nZs.copydefault(c0448ActionBar.AEQbTJ(), c0448ActionBar.OLrzqt());
            } else {
                if (!Intrinsics.EZpvd(actionBar, MembershipSettingsViewModel.ActionBar.Activity.AEQbTJ)) {
                    throw new NoWhenBranchMatchedException();
                }
                C55113xdn c55113xdn3 = njy.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                c55113xdn3.setVisibility(8);
                njy.fetchVPNInfo.copydefault();
                ScrollView scrollView2 = njy.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(scrollView2, "");
                scrollView2.setVisibility(8);
                C55173xeu c55173xeu2 = njy.copydefault;
                Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                c55173xeu2.setVisibility(0);
                rVN.reportFullyDrawn$default((Fragment) c34323nZs, false, (String) null, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
