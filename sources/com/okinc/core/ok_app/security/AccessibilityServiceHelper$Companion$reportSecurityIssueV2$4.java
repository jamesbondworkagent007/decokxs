package com.okinc.core.ok_app.security;

import com.okinc.core.ok_app.api.bean.AccessibilityServiceInfoDetails;
import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonObject;
import o.C33129mqd;
import o.C33427mwJ;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;
import o.InterfaceC33254msw;

/* JADX INFO: loaded from: classes8.dex */
public final class AccessibilityServiceHelper$Companion$reportSecurityIssueV2$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<AccessibilityServiceInfoDetails> $highReportInfoDetails;
    final /* synthetic */ JsonObject $jsonObject;
    final /* synthetic */ List<AccessibilityServiceInfoDetails> $mediumReportInfoDetails;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityServiceHelper$Companion$reportSecurityIssueV2$4(JsonObject jsonObject, List<AccessibilityServiceInfoDetails> list, List<AccessibilityServiceInfoDetails> list2, Continuation<? super AccessibilityServiceHelper$Companion$reportSecurityIssueV2$4> continuation) {
        super(2, continuation);
        this.$jsonObject = jsonObject;
        this.$mediumReportInfoDetails = list;
        this.$highReportInfoDetails = list2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccessibilityServiceHelper$Companion$reportSecurityIssueV2$4(this.$jsonObject, this.$mediumReportInfoDetails, this.$highReportInfoDetails, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccessibilityServiceHelper$Companion$reportSecurityIssueV2$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Result resultM7376boximpl;
        InterfaceC33254msw interfaceC33254msw;
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC33254msw.class));
            if (listKWHzl == null || (interfaceC33254msw = (InterfaceC33254msw) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null) {
                resultM7376boximpl = null;
                if (resultM7376boximpl != null && Result.m7384isSuccessimpl(resultM7376boximpl.m7386unboximpl())) {
                    if (C33129mqd.KWHzl((Collection) this.$mediumReportInfoDetails)) {
                        C33427mwJ.StateListAnimator stateListAnimator = C33427mwJ.Companion;
                        List<AccessibilityServiceInfoDetails> list = this.$mediumReportInfoDetails;
                        Intrinsics.copydefault(list);
                        stateListAnimator.EZpvd((List<AccessibilityServiceInfoDetails>) list, stateListAnimator.KWHzl());
                    }
                    if (C33129mqd.KWHzl((Collection) this.$highReportInfoDetails)) {
                        C33427mwJ.StateListAnimator stateListAnimator2 = C33427mwJ.Companion;
                        List<AccessibilityServiceInfoDetails> list2 = this.$highReportInfoDetails;
                        Intrinsics.copydefault(list2);
                        stateListAnimator2.EZpvd((List<AccessibilityServiceInfoDetails>) list2, stateListAnimator2.OLrzqt());
                    }
                }
                return Unit.INSTANCE;
            }
            JsonObject jsonObject = this.$jsonObject;
            this.label = 1;
            objKWHzl = interfaceC33254msw.KWHzl(jsonObject, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        resultM7376boximpl = Result.m7376boximpl(objKWHzl);
        if (resultM7376boximpl != null) {
            if (C33129mqd.KWHzl((Collection) this.$mediumReportInfoDetails)) {
            }
            if (C33129mqd.KWHzl((Collection) this.$highReportInfoDetails)) {
            }
        }
        return Unit.INSTANCE;
    }
}
