package com.okinc.im.imui.group.paidgroup.membershipsettings;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC44412sOw;
import o.C44255sJa;
import o.C44264sJj;
import o.C56391yDq;
import o.C56442yFn;
import o.sOZ;

/* JADX INFO: loaded from: classes8.dex */
public final class MembershipSettingsViewModel$fetchInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MembershipSettingsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MembershipSettingsViewModel$fetchInfo$1(MembershipSettingsViewModel membershipSettingsViewModel, Continuation<? super MembershipSettingsViewModel$fetchInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = membershipSettingsViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MembershipSettingsViewModel$fetchInfo$1 membershipSettingsViewModel$fetchInfo$1 = new MembershipSettingsViewModel$fetchInfo$1(this.this$0, continuation);
        membershipSettingsViewModel$fetchInfo$1.L$0 = obj;
        return membershipSettingsViewModel$fetchInfo$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MembershipSettingsViewModel$fetchInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0078 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MembershipSettingsViewModel membershipSettingsViewModel;
        AbstractC44412sOw abstractC44412sOw;
        MembershipSettingsViewModel membershipSettingsViewModel2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MembershipSettingsViewModel membershipSettingsViewModel3 = this.this$0;
            Result.Application application2 = Result.Companion;
            C44255sJa c44255sJa = membershipSettingsViewModel3.KWHzl;
            long jValueOf = membershipSettingsViewModel3.valueOf();
            this.L$0 = membershipSettingsViewModel3;
            this.label = 1;
            Object objAEQbTJ = c44255sJa.AEQbTJ(jValueOf, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            membershipSettingsViewModel = membershipSettingsViewModel3;
            obj = objAEQbTJ;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    Result.m7377constructorimpl(Unit.INSTANCE);
                    return Unit.INSTANCE;
                }
                abstractC44412sOw = (AbstractC44412sOw) this.L$1;
                membershipSettingsViewModel2 = (MembershipSettingsViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (membershipSettingsViewModel2.KWHzl(abstractC44412sOw, (sOZ) obj, this) == objCopydefault) {
                    return objCopydefault;
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
                return Unit.INSTANCE;
            }
            membershipSettingsViewModel = (MembershipSettingsViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC44412sOw abstractC44412sOw2 = (AbstractC44412sOw) obj;
        C44264sJj c44264sJj = membershipSettingsViewModel.AYXKKw;
        this.L$0 = membershipSettingsViewModel;
        this.L$1 = abstractC44412sOw2;
        this.label = 2;
        Object objCopydefault2 = c44264sJj.copydefault(this);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        MembershipSettingsViewModel membershipSettingsViewModel4 = membershipSettingsViewModel;
        abstractC44412sOw = abstractC44412sOw2;
        obj = objCopydefault2;
        membershipSettingsViewModel2 = membershipSettingsViewModel4;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        if (membershipSettingsViewModel2.KWHzl(abstractC44412sOw, (sOZ) obj, this) == objCopydefault) {
        }
        Result.m7377constructorimpl(Unit.INSTANCE);
        return Unit.INSTANCE;
    }
}
