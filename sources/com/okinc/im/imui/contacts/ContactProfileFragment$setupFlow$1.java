package com.okinc.im.imui.contacts;

import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.okinc.im.imui.contacts.ContactProfileViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C55113xdn;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.nJM;
import o.rVN;

/* JADX INFO: loaded from: classes8.dex */
public final class ContactProfileFragment$setupFlow$1 extends SuspendLambda implements Function2<ContactProfileViewModel.StateListAnimator, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContactProfileFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactProfileFragment$setupFlow$1(ContactProfileFragment contactProfileFragment, Continuation<? super ContactProfileFragment$setupFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = contactProfileFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContactProfileFragment$setupFlow$1 contactProfileFragment$setupFlow$1 = new ContactProfileFragment$setupFlow$1(this.this$0, continuation);
        contactProfileFragment$setupFlow$1.L$0 = obj;
        return contactProfileFragment$setupFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ContactProfileViewModel.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
        return ((ContactProfileFragment$setupFlow$1) create(stateListAnimator, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C55113xdn c55113xdn;
        NestedScrollView nestedScrollView;
        C55173xeu c55173xeu;
        C55113xdn c55113xdn2;
        NestedScrollView nestedScrollView2;
        C55173xeu c55173xeu2;
        C55113xdn c55113xdn3;
        NestedScrollView nestedScrollView3;
        C55173xeu c55173xeu3;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            ContactProfileViewModel.StateListAnimator stateListAnimator = (ContactProfileViewModel.StateListAnimator) this.L$0;
            if (stateListAnimator instanceof ContactProfileViewModel.StateListAnimator.TaskDescription) {
                nJM njm = this.this$0.KWHzl;
                if (njm != null && (c55173xeu3 = njm.ejfBZ) != null) {
                    c55173xeu3.setVisibility(8);
                }
                nJM njm2 = this.this$0.KWHzl;
                if (njm2 != null && (nestedScrollView3 = njm2.DbNXlk) != null) {
                    nestedScrollView3.setVisibility(8);
                }
                nJM njm3 = this.this$0.KWHzl;
                if (njm3 != null && (c55113xdn3 = njm3.hDKMBd) != null) {
                    c55113xdn3.setVisibility(0);
                }
            } else if (stateListAnimator instanceof ContactProfileViewModel.StateListAnimator.Activity) {
                nJM njm4 = this.this$0.KWHzl;
                if (njm4 != null && (c55173xeu2 = njm4.ejfBZ) != null) {
                    c55173xeu2.setVisibility(8);
                }
                nJM njm5 = this.this$0.KWHzl;
                if (njm5 != null && (nestedScrollView2 = njm5.DbNXlk) != null) {
                    nestedScrollView2.setVisibility(0);
                }
                this.this$0.KWHzl((ContactProfileViewModel.StateListAnimator.Activity) stateListAnimator);
                nJM njm6 = this.this$0.KWHzl;
                if (njm6 != null && (c55113xdn2 = njm6.hDKMBd) != null) {
                    c55113xdn2.setVisibility(8);
                }
                rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            } else if (Intrinsics.EZpvd(stateListAnimator, ContactProfileViewModel.StateListAnimator.ActionBar.OLrzqt)) {
                nJM njm7 = this.this$0.KWHzl;
                if (njm7 != null && (c55173xeu = njm7.ejfBZ) != null) {
                    c55173xeu.setVisibility(0);
                }
                nJM njm8 = this.this$0.KWHzl;
                if (njm8 != null && (nestedScrollView = njm8.DbNXlk) != null) {
                    nestedScrollView.setVisibility(8);
                }
                nJM njm9 = this.this$0.KWHzl;
                if (njm9 != null && (c55113xdn = njm9.hDKMBd) != null) {
                    c55113xdn.setVisibility(8);
                }
                rVN.reportFullyDrawn$default((Fragment) this.this$0, false, (String) null, 2, (Object) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
