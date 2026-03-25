package com.okinc.im.imui.group.create.affiliate;

import android.net.Uri;
import com.okinc.okimcore.model.other.AffiliateMemberFilter;
import com.okinc.okimcore.model.other.GroupAddMembersResult;
import com.okinc.okimcore.model.other.GroupInfo;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC44396sOg;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.nRE;
import o.sIR;

/* JADX INFO: loaded from: classes23.dex */
public final class CreateAffiliateGroupFragment$performCreateAffiliateGroup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Throwable, Unit> $error;
    final /* synthetic */ Function2<GroupInfo, GroupAddMembersResult, Unit> $failure;
    final /* synthetic */ Uri $groupAvatar;
    final /* synthetic */ String $groupDes;
    final /* synthetic */ String $groupName;
    final /* synthetic */ List<AffiliateMemberFilter> $members;
    final /* synthetic */ Function1<GroupInfo, Unit> $success;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nRE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.okimcore.model.other.GroupInfo, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.okimcore.model.other.GroupInfo, ? super com.okinc.okimcore.model.other.GroupAddMembersResult, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreateAffiliateGroupFragment$performCreateAffiliateGroup$1(nRE nre, String str, String str2, Uri uri, List<AffiliateMemberFilter> list, Function1<? super Throwable, Unit> function1, Function1<? super GroupInfo, Unit> function12, Function2<? super GroupInfo, ? super GroupAddMembersResult, Unit> function2, Continuation<? super CreateAffiliateGroupFragment$performCreateAffiliateGroup$1> continuation) {
        super(2, continuation);
        this.this$0 = nre;
        this.$groupName = str;
        this.$groupDes = str2;
        this.$groupAvatar = uri;
        this.$members = list;
        this.$error = function1;
        this.$success = function12;
        this.$failure = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CreateAffiliateGroupFragment$performCreateAffiliateGroup$1 createAffiliateGroupFragment$performCreateAffiliateGroup$1 = new CreateAffiliateGroupFragment$performCreateAffiliateGroup$1(this.this$0, this.$groupName, this.$groupDes, this.$groupAvatar, this.$members, this.$error, this.$success, this.$failure, continuation);
        createAffiliateGroupFragment$performCreateAffiliateGroup$1.L$0 = obj;
        return createAffiliateGroupFragment$performCreateAffiliateGroup$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateAffiliateGroupFragment$performCreateAffiliateGroup$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
                if (interfaceC35180nqU == null) {
                    return Unit.INSTANCE;
                }
                this.this$0.showLoading();
                String str = this.$groupName;
                String str2 = this.$groupDes;
                Uri uri = this.$groupAvatar;
                List<AffiliateMemberFilter> list = this.$members;
                Result.Application application = Result.Companion;
                sIR sirCopydefault = interfaceC35180nqU.AEQbTJ().copydefault();
                this.label = 1;
                obj = sirCopydefault.EZpvd(str, str2, uri, list, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((AbstractC44396sOg) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Function1<Throwable, Unit> function1 = this.$error;
        nRE nre = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            function1.invoke(thM7380exceptionOrNullimpl);
            nre.dismissLoading();
            nre.AhwBna.set(false);
        }
        nRE nre2 = this.this$0;
        Function1<GroupInfo, Unit> function12 = this.$success;
        Function2<GroupInfo, GroupAddMembersResult, Unit> function2 = this.$failure;
        Function1<Throwable, Unit> function13 = this.$error;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            AbstractC44396sOg abstractC44396sOg = (AbstractC44396sOg) objM7377constructorimpl;
            if (abstractC44396sOg instanceof AbstractC44396sOg.Application) {
                nre2.dismissLoading();
                AbstractC44396sOg.Application application3 = (AbstractC44396sOg.Application) abstractC44396sOg;
                if (application3.KWHzl().isAllAddSuccess()) {
                    function12.invoke(application3.EZpvd());
                } else {
                    function2.invoke(application3.EZpvd(), application3.KWHzl());
                }
            } else {
                if (!(abstractC44396sOg instanceof AbstractC44396sOg.TaskDescription)) {
                    throw new NoWhenBranchMatchedException();
                }
                function13.invoke(((AbstractC44396sOg.TaskDescription) abstractC44396sOg).KWHzl());
                nre2.dismissLoading();
            }
            nre2.AhwBna.set(false);
        }
        return Unit.INSTANCE;
    }
}
