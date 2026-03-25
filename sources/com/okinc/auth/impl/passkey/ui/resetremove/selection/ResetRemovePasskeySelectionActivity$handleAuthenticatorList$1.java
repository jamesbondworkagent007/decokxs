package com.okinc.auth.impl.passkey.ui.resetremove.selection;

import com.okinc.auth.api.passkey.PasskeyResetRemoveType;
import com.okinc.auth.impl.passkey.model.AuthenticatorSelectModel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5922aFc;

/* JADX INFO: loaded from: classes14.dex */
public final class ResetRemovePasskeySelectionActivity$handleAuthenticatorList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<AuthenticatorSelectModel> $authenticatorList;
    final /* synthetic */ PasskeyResetRemoveType $passkeyResetRemoveType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ResetRemovePasskeySelectionActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetRemovePasskeySelectionActivity$handleAuthenticatorList$1(ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity, PasskeyResetRemoveType passkeyResetRemoveType, List<AuthenticatorSelectModel> list, Continuation<? super ResetRemovePasskeySelectionActivity$handleAuthenticatorList$1> continuation) {
        super(2, continuation);
        this.this$0 = resetRemovePasskeySelectionActivity;
        this.$passkeyResetRemoveType = passkeyResetRemoveType;
        this.$authenticatorList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ResetRemovePasskeySelectionActivity$handleAuthenticatorList$1 resetRemovePasskeySelectionActivity$handleAuthenticatorList$1 = new ResetRemovePasskeySelectionActivity$handleAuthenticatorList$1(this.this$0, this.$passkeyResetRemoveType, this.$authenticatorList, continuation);
        resetRemovePasskeySelectionActivity$handleAuthenticatorList$1.L$0 = obj;
        return resetRemovePasskeySelectionActivity$handleAuthenticatorList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResetRemovePasskeySelectionActivity$handleAuthenticatorList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        PasskeyResetRemoveType remove;
        Object objM7377constructorimpl;
        Object objM7377constructorimpl2;
        Object objM7377constructorimpl3;
        boolean zKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BatchResetRemovePasskeyViewModel batchResetRemovePasskeyViewModelAYXKKw = this.this$0.AYXKKw();
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = batchResetRemovePasskeyViewModelAYXKKw.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C5922aFc c5922aFc = C5922aFc.KWHzl;
        C5922aFc.log$default(c5922aFc, "[RESET/REMOVE]", null, this.this$0.getTAG() + " handle auth list: isPasskeyCompatibleWithRegion: " + zBooleanValue, 2, null);
        if (zBooleanValue) {
            remove = this.$passkeyResetRemoveType;
        } else {
            remove = this.$passkeyResetRemoveType;
            if (remove instanceof PasskeyResetRemoveType.BatchReset) {
                remove = PasskeyResetRemoveType.BatchRemove.AEQbTJ;
            } else if (remove instanceof PasskeyResetRemoveType.Reset) {
                remove = new PasskeyResetRemoveType.Remove(((PasskeyResetRemoveType.Reset) this.$passkeyResetRemoveType).OLrzqt(), ((PasskeyResetRemoveType.Reset) this.$passkeyResetRemoveType).AEQbTJ(), ((PasskeyResetRemoveType.Reset) this.$passkeyResetRemoveType).copydefault());
            }
        }
        C5922aFc.log$default(c5922aFc, "[RESET/REMOVE]", null, this.this$0.getTAG() + " handle auth list: typeAfterCompatibleCheck: " + remove, 2, null);
        C5922aFc.log$default(c5922aFc, "[RESET/REMOVE]", null, this.this$0.getTAG() + " handle auth list: authenticatorList.size: " + this.$authenticatorList.size(), 2, null);
        if (this.$authenticatorList.size() > 1) {
            if (remove instanceof PasskeyResetRemoveType.Reset) {
                remove = PasskeyResetRemoveType.BatchReset.EZpvd;
            }
            C5922aFc.log$default(c5922aFc, "[RESET/REMOVE]", null, this.this$0.getTAG() + " handle auth list: finalType: batch: " + remove, 2, null);
            this.this$0.copydefault(remove);
        } else {
            List<AuthenticatorSelectModel> list = this.$authenticatorList;
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(((AuthenticatorSelectModel) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).OLrzqt().AhwBna());
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            boolean z = remove instanceof PasskeyResetRemoveType.Reset;
            String strOLrzqt = z ? ((PasskeyResetRemoveType.Reset) remove).OLrzqt() : "";
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = strOLrzqt;
            }
            String str = (String) objM7377constructorimpl;
            List<AuthenticatorSelectModel> list2 = this.$authenticatorList;
            try {
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(((AuthenticatorSelectModel) CollectionsKt___CollectionsKt.AuCTelauCTel(list2)).OLrzqt().copydefault());
            } catch (Throwable th2) {
                Result.Application application4 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
            }
            String strOLrzqt2 = z ? ((PasskeyResetRemoveType.Reset) remove).OLrzqt() : "";
            if (Result.m7383isFailureimpl(objM7377constructorimpl2)) {
                objM7377constructorimpl2 = strOLrzqt2;
            }
            String str2 = (String) objM7377constructorimpl2;
            List<AuthenticatorSelectModel> list3 = this.$authenticatorList;
            try {
                Result.Application application5 = Result.Companion;
                objM7377constructorimpl3 = Result.m7377constructorimpl(C56443yFo.KWHzl(((AuthenticatorSelectModel) CollectionsKt___CollectionsKt.AuCTelauCTel(list3)).OLrzqt().fetchVPNInfo()));
            } catch (Throwable th3) {
                Result.Application application6 = Result.Companion;
                objM7377constructorimpl3 = Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
            }
            if (z) {
                zKWHzl = ((PasskeyResetRemoveType.Reset) remove).copydefault();
            } else {
                zKWHzl = remove instanceof PasskeyResetRemoveType.Remove ? ((PasskeyResetRemoveType.Remove) remove).KWHzl() : false;
            }
            Boolean boolKWHzl = C56443yFo.KWHzl(zKWHzl);
            if (Result.m7383isFailureimpl(objM7377constructorimpl3)) {
                objM7377constructorimpl3 = boolKWHzl;
            }
            boolean zBooleanValue2 = ((Boolean) objM7377constructorimpl3).booleanValue();
            if ((remove instanceof PasskeyResetRemoveType.Remove) || (remove instanceof PasskeyResetRemoveType.BatchRemove)) {
                this.this$0.AEQbTJ(new PasskeyResetRemoveType.Remove(str, str2, zBooleanValue2));
            } else if ((remove instanceof PasskeyResetRemoveType.BatchReset) || z) {
                this.this$0.AEQbTJ(new PasskeyResetRemoveType.Reset(str, str2, zBooleanValue2));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
