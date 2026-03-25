package com.okinc.auth.impl.passkey.ui.authenticate.asset;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.auth.api.passkey.PasskeyResetRemoveRequest;
import com.okinc.auth.api.passkey.PasskeyResetRemoveType;
import com.okinc.auth.impl.passkey.ui.authenticate.asset.PasskeyAuthenticateServiceFragment$initView$7;
import com.okinc.auth.impl.passkey.ui.bottomsheet.Error50162BottomSheet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.C5724aBq;
import o.C5967aGU;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyAuthenticateServiceFragment$initView$7 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C5967aGU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyAuthenticateServiceFragment$initView$7(C5967aGU c5967aGU, Continuation<? super PasskeyAuthenticateServiceFragment$initView$7> continuation) {
        super(2, continuation);
        this.this$0 = c5967aGU;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyAuthenticateServiceFragment$initView$7(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
        return ((PasskeyAuthenticateServiceFragment$initView$7) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FragmentManager supportFragmentManager;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            FragmentActivity activity = this.this$0.getActivity();
            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                return Unit.INSTANCE;
            }
            final Error50162BottomSheet error50162BottomSheetEZpvd = Error50162BottomSheet.Companion.EZpvd(true, Error50162BottomSheet.EventFlow.ASSET);
            final C5967aGU c5967aGU = this.this$0;
            error50162BottomSheetEZpvd.AEQbTJ(new Function0() { // from class: o.aGY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return PasskeyAuthenticateServiceFragment$initView$7.invokeSuspend$lambda$3$lambda$1(error50162BottomSheetEZpvd);
                }
            });
            error50162BottomSheetEZpvd.KWHzl(new Function0() { // from class: o.aHa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return PasskeyAuthenticateServiceFragment$initView$7.invokeSuspend$lambda$3$lambda$2(c5967aGU);
                }
            });
            error50162BottomSheetEZpvd.show(supportFragmentManager, Error50162BottomSheet.class.getName());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$1(Error50162BottomSheet error50162BottomSheet) {
        FragmentActivity activity = error50162BottomSheet.getActivity();
        if (activity != null) {
            C5724aBq.EZpvd.copydefault(activity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$3$lambda$2(C5967aGU c5967aGU) {
        ActivityResultLauncher activityResultLauncher = c5967aGU.AkhnZx;
        if (activityResultLauncher == null) {
            Intrinsics.gEmmrt("");
            activityResultLauncher = null;
        }
        activityResultLauncher.launch(new PasskeyResetRemoveRequest(PasskeyResetRemoveType.BatchRemove.AEQbTJ, false, null, true, true, 6, null));
        return Unit.INSTANCE;
    }
}
