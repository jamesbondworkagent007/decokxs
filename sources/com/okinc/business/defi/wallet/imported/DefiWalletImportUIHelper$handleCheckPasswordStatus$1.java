package com.okinc.business.defi.wallet.imported;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.wallet.imported.DefiWalletImportUIHelper$handleCheckPasswordStatus$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractActivityC33041mov;
import o.AbstractC58185ywX;
import o.C10337bmZ;
import o.C13754dXa;
import o.C14469dlz;
import o.C55326xho;
import o.C55328xhq;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC14457dln;
import o.InterfaceC9739bbK;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiWalletImportUIHelper$handleCheckPasswordStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $activity;
    final /* synthetic */ boolean $canFinishCurrent;
    final /* synthetic */ Function1<Continuation<? super Boolean>, Object> $checkImportAvailable;
    final /* synthetic */ InterfaceC14457dln $currentStrategy;
    final /* synthetic */ int $mode;
    final /* synthetic */ Function1<Intent, Unit> $onSetPasswordCreateWalletSuccess;
    final /* synthetic */ Function1<String, Unit> $passwordCallback;
    final /* synthetic */ Bundle $toSetPasswordArgs;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super android.content.Intent, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DefiWalletImportUIHelper$handleCheckPasswordStatus$1(AbstractActivityC33041mov abstractActivityC33041mov, Function1<? super Continuation<? super Boolean>, ? extends Object> function1, Bundle bundle, InterfaceC14457dln interfaceC14457dln, Function1<? super String, Unit> function12, Function1<? super Intent, Unit> function13, boolean z, int i, Continuation<? super DefiWalletImportUIHelper$handleCheckPasswordStatus$1> continuation) {
        super(2, continuation);
        this.$activity = abstractActivityC33041mov;
        this.$checkImportAvailable = function1;
        this.$toSetPasswordArgs = bundle;
        this.$currentStrategy = interfaceC14457dln;
        this.$passwordCallback = function12;
        this.$onSetPasswordCreateWalletSuccess = function13;
        this.$canFinishCurrent = z;
        this.$mode = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletImportUIHelper$handleCheckPasswordStatus$1(this.$activity, this.$checkImportAvailable, this.$toSetPasswordArgs, this.$currentStrategy, this.$passwordCallback, this.$onSetPasswordCreateWalletSuccess, this.$canFinishCurrent, this.$mode, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletImportUIHelper$handleCheckPasswordStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        Bundle bundle;
        Function1<String, Unit> function1;
        final AbstractActivityC33041mov abstractActivityC33041mov;
        final boolean z;
        final int i;
        InterfaceC14457dln interfaceC14457dln;
        Function1<Intent, Unit> function12;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            this.$activity.showLoading();
            Function1<Continuation<? super Boolean>, Object> function13 = this.$checkImportAvailable;
            this.label = 1;
            obj = function13.invoke(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                z = this.Z$0;
                Function1<Intent, Unit> function14 = (Function1) this.L$4;
                Function1<String, Unit> function15 = (Function1) this.L$3;
                InterfaceC14457dln interfaceC14457dln2 = (InterfaceC14457dln) this.L$2;
                bundle = (Bundle) this.L$1;
                AbstractActivityC33041mov abstractActivityC33041mov2 = (AbstractActivityC33041mov) this.L$0;
                C56391yDq.AEQbTJ(obj);
                function12 = function14;
                function1 = function15;
                interfaceC14457dln = interfaceC14457dln2;
                abstractActivityC33041mov = abstractActivityC33041mov2;
                abstractActivityC33041mov.dismissLoading();
                FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                new C14469dlz(supportFragmentManager, abstractActivityC33041mov, bundle, interfaceC14457dln, function1, null, new Function0() { // from class: o.fhu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return DefiWalletImportUIHelper$handleCheckPasswordStatus$1.invokeSuspend$lambda$1$lambda$0(z, i, abstractActivityC33041mov);
                    }
                }, function12, 32, null).EZpvd();
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                AbstractActivityC33041mov abstractActivityC33041mov3 = this.$activity;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    abstractActivityC33041mov3.dismissLoading();
                    C55328xhq.show$default(C55328xhq.OLrzqt, thM7380exceptionOrNullimpl.getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.launchUnitdefault, 0, 1, (Object) null);
            this.$activity.dismissLoading();
            return Unit.INSTANCE;
        }
        AbstractActivityC33041mov abstractActivityC33041mov4 = this.$activity;
        bundle = this.$toSetPasswordArgs;
        InterfaceC14457dln interfaceC14457dln3 = this.$currentStrategy;
        function1 = this.$passwordCallback;
        Function1<Intent, Unit> function16 = this.$onSetPasswordCreateWalletSuccess;
        boolean z2 = this.$canFinishCurrent;
        int i3 = this.$mode;
        Result.Application application2 = Result.Companion;
        AbstractC58185ywX abstractC58185ywXEnsureInitialized$default = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null);
        this.L$0 = abstractActivityC33041mov4;
        this.L$1 = bundle;
        this.L$2 = interfaceC14457dln3;
        this.L$3 = function1;
        this.L$4 = function16;
        this.Z$0 = z2;
        this.I$0 = i3;
        this.label = 2;
        if (AwaitKt.awaitFirst(abstractC58185ywXEnsureInitialized$default, this) == objCopydefault) {
            return objCopydefault;
        }
        abstractActivityC33041mov = abstractActivityC33041mov4;
        z = z2;
        i = i3;
        interfaceC14457dln = interfaceC14457dln3;
        function12 = function16;
        abstractActivityC33041mov.dismissLoading();
        FragmentManager supportFragmentManager2 = abstractActivityC33041mov.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
        new C14469dlz(supportFragmentManager2, abstractActivityC33041mov, bundle, interfaceC14457dln, function1, null, new Function0() { // from class: o.fhu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DefiWalletImportUIHelper$handleCheckPasswordStatus$1.invokeSuspend$lambda$1$lambda$0(z, i, abstractActivityC33041mov);
            }
        }, function12, 32, null).EZpvd();
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        AbstractActivityC33041mov abstractActivityC33041mov32 = this.$activity;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(boolean z, int i, AbstractActivityC33041mov abstractActivityC33041mov) {
        if (z && i == 2) {
            abstractActivityC33041mov.finish();
        }
        return Unit.INSTANCE;
    }
}
