package com.okinc.im.imui.group.paidgroup.membershipsettings;

import com.okinc.im.imui.group.paidgroup.membershipsettings.MembershipSettingsViewModel;
import com.okinc.okimcore.model.im.group.GroupBillingType;
import com.okinc.okimcore.model.remote.GroupEntryBillingModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC44414sOy;
import o.C56391yDq;
import o.C56442yFn;
import o.C59443zhD;
import o.oDC;
import o.sON;

/* JADX INFO: loaded from: classes8.dex */
public final class MembershipSettingsViewModel$saveMembershipSettings$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $inputAmount;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MembershipSettingsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MembershipSettingsViewModel$saveMembershipSettings$1(MembershipSettingsViewModel membershipSettingsViewModel, String str, Continuation<? super MembershipSettingsViewModel$saveMembershipSettings$1> continuation) {
        super(2, continuation);
        this.this$0 = membershipSettingsViewModel;
        this.$inputAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MembershipSettingsViewModel$saveMembershipSettings$1 membershipSettingsViewModel$saveMembershipSettings$1 = new MembershipSettingsViewModel$saveMembershipSettings$1(this.this$0, this.$inputAmount, continuation);
        membershipSettingsViewModel$saveMembershipSettings$1.L$0 = obj;
        return membershipSettingsViewModel$saveMembershipSettings$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MembershipSettingsViewModel$saveMembershipSettings$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MembershipSettingsViewModel membershipSettingsViewModel;
        Object objKWHzl;
        String str;
        MembershipSettingsViewModel membershipSettingsViewModel2;
        MembershipSettingsViewModel.Activity.StateListAnimator stateListAnimator;
        MutableSharedFlow mutableSharedFlow;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            membershipSettingsViewModel = this.this$0;
            String str2 = this.$inputAmount;
            Result.Application application2 = Result.Companion;
            oDC odc = membershipSettingsViewModel.gEmmrt;
            long jValueOf = membershipSettingsViewModel.valueOf();
            GroupEntryBillingModel groupEntryBillingModelAEQbTJ = membershipSettingsViewModel.AEQbTJ();
            Integer currencyId = groupEntryBillingModelAEQbTJ != null ? groupEntryBillingModelAEQbTJ.getCurrencyId() : null;
            GroupEntryBillingModel groupEntryBillingModelAEQbTJ2 = membershipSettingsViewModel.AEQbTJ();
            GroupBillingType billingType = groupEntryBillingModelAEQbTJ2 != null ? groupEntryBillingModelAEQbTJ2.getBillingType() : null;
            GroupEntryBillingModel groupEntryBillingModelAEQbTJ3 = membershipSettingsViewModel.AEQbTJ();
            GroupEntryBillingModel groupEntryBillingModel = new GroupEntryBillingModel(groupEntryBillingModelAEQbTJ3 != null ? groupEntryBillingModelAEQbTJ3.getEnabled() : null, currencyId, (String) null, (String) null, str2, billingType, 12, (DefaultConstructorMarker) null);
            this.L$0 = membershipSettingsViewModel;
            this.L$1 = str2;
            this.label = 1;
            objKWHzl = odc.KWHzl(jValueOf, 2, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : groupEntryBillingModel, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            str = str2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        membershipSettingsViewModel2 = (MembershipSettingsViewModel) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        stateListAnimator = new MembershipSettingsViewModel.Activity.StateListAnimator(sON.TaskDescription.AEQbTJ);
                        mutableSharedFlow = membershipSettingsViewModel2.OLrzqt;
                        this.L$0 = null;
                        this.label = 4;
                        if (mutableSharedFlow.emit(stateListAnimator, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        Result.m7377constructorimpl(Unit.INSTANCE);
                        return Unit.INSTANCE;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                C56391yDq.AEQbTJ(obj);
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            String str3 = (String) this.L$1;
            MembershipSettingsViewModel membershipSettingsViewModel3 = (MembershipSettingsViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            membershipSettingsViewModel = membershipSettingsViewModel3;
            str = str3;
            objKWHzl = obj;
        }
        AbstractC44414sOy abstractC44414sOy = (AbstractC44414sOy) objKWHzl;
        if (abstractC44414sOy instanceof AbstractC44414sOy.Activity) {
            MembershipSettingsViewModel.Activity.StateListAnimator stateListAnimator2 = new MembershipSettingsViewModel.Activity.StateListAnimator(new sON.Activity(((AbstractC44414sOy.Activity) abstractC44414sOy).AEQbTJ(), ((AbstractC44414sOy.Activity) abstractC44414sOy).EZpvd()));
            MutableSharedFlow mutableSharedFlow2 = membershipSettingsViewModel.OLrzqt;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (mutableSharedFlow2.emit(stateListAnimator2, this) == objCopydefault) {
                return objCopydefault;
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
            return Unit.INSTANCE;
        }
        if (Intrinsics.EZpvd(abstractC44414sOy, AbstractC44414sOy.Application.copydefault)) {
            membershipSettingsViewModel.valueOf.set("KEY_CURRENT_SAVED_FEE", str);
            MembershipSettingsViewModel.ActionBar.C0448ActionBar c0448ActionBarAEQbTJ = membershipSettingsViewModel.AEQbTJ(C59443zhD.AuCTel(str));
            MutableStateFlow mutableStateFlow = membershipSettingsViewModel.copydefault;
            this.L$0 = membershipSettingsViewModel;
            this.L$1 = null;
            this.label = 3;
            if (mutableStateFlow.emit(c0448ActionBarAEQbTJ, this) == objCopydefault) {
                return objCopydefault;
            }
            membershipSettingsViewModel2 = membershipSettingsViewModel;
            stateListAnimator = new MembershipSettingsViewModel.Activity.StateListAnimator(sON.TaskDescription.AEQbTJ);
            mutableSharedFlow = membershipSettingsViewModel2.OLrzqt;
            this.L$0 = null;
            this.label = 4;
            if (mutableSharedFlow.emit(stateListAnimator, this) == objCopydefault) {
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
            return Unit.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
