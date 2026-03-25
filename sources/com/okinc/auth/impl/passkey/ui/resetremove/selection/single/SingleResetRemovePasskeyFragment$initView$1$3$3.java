package com.okinc.auth.impl.passkey.ui.resetremove.selection.single;

import com.okinc.auth.api.passkey.PasskeyResetRemoveType;
import com.okinc.auth.impl.passkey.ui.resetremove.selection.BatchResetRemovePasskeyViewModel;
import com.okinc.auth.impl.passkey.ui.resetremove.selection.ResetRemovePasskeySelectionActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C6480aQD;

/* JADX INFO: loaded from: classes18.dex */
public final class SingleResetRemovePasskeyFragment$initView$1$3$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ResetRemovePasskeySelectionActivity $activity;
    final /* synthetic */ PasskeyResetRemoveType $passkeyResetRemoveType;
    int label;
    final /* synthetic */ C6480aQD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleResetRemovePasskeyFragment$initView$1$3$3(C6480aQD c6480aQD, PasskeyResetRemoveType passkeyResetRemoveType, ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity, Continuation<? super SingleResetRemovePasskeyFragment$initView$1$3$3> continuation) {
        super(2, continuation);
        this.this$0 = c6480aQD;
        this.$passkeyResetRemoveType = passkeyResetRemoveType;
        this.$activity = resetRemovePasskeySelectionActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SingleResetRemovePasskeyFragment$initView$1$3$3(this.this$0, this.$passkeyResetRemoveType, this.$activity, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SingleResetRemovePasskeyFragment$initView$1$3$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.showLoadingAtOnce();
            BatchResetRemovePasskeyViewModel batchResetRemovePasskeyViewModelDjBIcL = this.this$0.djBIcL();
            this.label = 1;
            obj = batchResetRemovePasskeyViewModelDjBIcL.EZpvd(this);
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
        boolean zKWHzl = ((PasskeyResetRemoveType.Remove) this.$passkeyResetRemoveType).KWHzl();
        this.this$0.releaseLoading();
        if (!zKWHzl && zBooleanValue) {
            ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity = this.$activity;
            PasskeyResetRemoveType passkeyResetRemoveType = this.$passkeyResetRemoveType;
            resetRemovePasskeySelectionActivity.copydefault(passkeyResetRemoveType, C56402yEa.EZpvd(((PasskeyResetRemoveType.Remove) passkeyResetRemoveType).OLrzqt()));
        } else if (!zKWHzl && !zBooleanValue) {
            final ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity2 = this.$activity;
            final PasskeyResetRemoveType passkeyResetRemoveType2 = this.$passkeyResetRemoveType;
            resetRemovePasskeySelectionActivity2.AEQbTJ("", new Function0<Unit>() { // from class: com.okinc.auth.impl.passkey.ui.resetremove.selection.single.SingleResetRemovePasskeyFragment$initView$1$3$3.2
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function0
                public /* synthetic */ Unit invoke() {
                    EZpvd();
                    return Unit.INSTANCE;
                }

                public final void EZpvd() {
                    ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity3 = resetRemovePasskeySelectionActivity2;
                    PasskeyResetRemoveType passkeyResetRemoveType3 = passkeyResetRemoveType2;
                    resetRemovePasskeySelectionActivity3.copydefault(passkeyResetRemoveType3, C56402yEa.EZpvd(((PasskeyResetRemoveType.Remove) passkeyResetRemoveType3).OLrzqt()));
                }
            });
        } else if (zKWHzl && zBooleanValue) {
            final ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity3 = this.$activity;
            final PasskeyResetRemoveType passkeyResetRemoveType3 = this.$passkeyResetRemoveType;
            resetRemovePasskeySelectionActivity3.EZpvd(new Function0<Unit>() { // from class: com.okinc.auth.impl.passkey.ui.resetremove.selection.single.SingleResetRemovePasskeyFragment$initView$1$3$3.3
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function0
                public /* synthetic */ Unit invoke() {
                    OLrzqt();
                    return Unit.INSTANCE;
                }

                public final void OLrzqt() {
                    ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity4 = resetRemovePasskeySelectionActivity3;
                    PasskeyResetRemoveType passkeyResetRemoveType4 = passkeyResetRemoveType3;
                    resetRemovePasskeySelectionActivity4.copydefault(passkeyResetRemoveType4, C56402yEa.EZpvd(((PasskeyResetRemoveType.Remove) passkeyResetRemoveType4).OLrzqt()));
                }
            });
        } else if (zKWHzl && !zBooleanValue) {
            final ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity4 = this.$activity;
            final PasskeyResetRemoveType passkeyResetRemoveType4 = this.$passkeyResetRemoveType;
            resetRemovePasskeySelectionActivity4.KWHzl(new Function0<Unit>() { // from class: com.okinc.auth.impl.passkey.ui.resetremove.selection.single.SingleResetRemovePasskeyFragment$initView$1$3$3.4
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function0
                public /* synthetic */ Unit invoke() {
                    EZpvd();
                    return Unit.INSTANCE;
                }

                public final void EZpvd() {
                    ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity5 = resetRemovePasskeySelectionActivity4;
                    PasskeyResetRemoveType passkeyResetRemoveType5 = passkeyResetRemoveType4;
                    resetRemovePasskeySelectionActivity5.copydefault(passkeyResetRemoveType5, C56402yEa.EZpvd(((PasskeyResetRemoveType.Remove) passkeyResetRemoveType5).OLrzqt()));
                }
            });
        }
        return Unit.INSTANCE;
    }
}
