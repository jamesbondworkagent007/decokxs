package com.okinc.business.defi.wallet.custom;

import android.graphics.drawable.Drawable;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC58185ywX;
import o.ActivityC16104edd;
import o.C10598brV;
import o.C10614brl;
import o.C10639bsJ;
import o.C12827cuN;
import o.C13754dXa;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC54939xaY;

/* JADX INFO: loaded from: classes18.dex */
public final class AddCustomNetworkActivity$showDeleteDialog$1$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewOnClickListenerC54939xaY $this_apply;
    int label;
    final /* synthetic */ ActivityC16104edd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddCustomNetworkActivity$showDeleteDialog$1$1$1$1$1(ActivityC16104edd activityC16104edd, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Continuation<? super AddCustomNetworkActivity$showDeleteDialog$1$1$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC16104edd;
        this.$this_apply = viewOnClickListenerC54939xaY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AddCustomNetworkActivity$showDeleteDialog$1$1$1$1$1(this.this$0, this.$this_apply, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AddCustomNetworkActivity$showDeleteDialog$1$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MainCoroutineDispatcher main;
        AnonymousClass2 anonymousClass2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C10639bsJ c10639bsJ = C10639bsJ.EZpvd;
            CustomChainMeta customChainMeta = this.this$0.AEQbTJ;
            Intrinsics.copydefault(customChainMeta);
            long jEZpvd = customChainMeta.EZpvd();
            CustomChainMeta customChainMeta2 = this.this$0.AEQbTJ;
            Intrinsics.copydefault(customChainMeta2);
            AbstractC58185ywX<Boolean> abstractC58185ywXEZpvd = c10639bsJ.EZpvd(jEZpvd, customChainMeta2.isConnected());
            this.label = 1;
            if (AwaitKt.awaitLast(abstractC58185ywXEZpvd, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    C12827cuN instance$default = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null);
                    this.label = 3;
                    obj = instance$default.EZpvd(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    ActivityC16104edd activityC16104edd = this.this$0;
                    while (r11.hasNext()) {
                    }
                    main = Dispatchers.getMain();
                    anonymousClass2 = new AnonymousClass2(this.$this_apply, this.this$0, null);
                    this.label = 4;
                    if (BuildersKt.withContext(main, anonymousClass2, this) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                ActivityC16104edd activityC16104edd2 = this.this$0;
                for (String str : (List) obj) {
                    C10614brl.TaskDescription taskDescription = C10614brl.Companion;
                    String chainId = C10614brl.TaskDescription.getInstance$default(taskDescription, null, 1, null).KWHzl(str).getChainId();
                    CustomChainMeta customChainMeta3 = activityC16104edd2.AEQbTJ;
                    Intrinsics.copydefault(customChainMeta3);
                    if (Intrinsics.EZpvd((Object) chainId, (Object) String.valueOf(customChainMeta3.EZpvd()))) {
                        C10614brl.TaskDescription.getInstance$default(taskDescription, null, 1, null).copydefault(str);
                    }
                }
                main = Dispatchers.getMain();
                anonymousClass2 = new AnonymousClass2(this.$this_apply, this.this$0, null);
                this.label = 4;
                if (BuildersKt.withContext(main, anonymousClass2, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC58185ywX<Boolean> abstractC58185ywXEZpvd2 = C10598brV.AEQbTJ.EZpvd(true);
        this.label = 2;
        if (AwaitKt.awaitLast(abstractC58185ywXEZpvd2, this) == objCopydefault) {
            return objCopydefault;
        }
        C12827cuN instance$default2 = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null);
        this.label = 3;
        obj = instance$default2.EZpvd(this);
        if (obj == objCopydefault) {
        }
        ActivityC16104edd activityC16104edd22 = this.this$0;
        while (r11.hasNext()) {
        }
        main = Dispatchers.getMain();
        anonymousClass2 = new AnonymousClass2(this.$this_apply, this.this$0, null);
        this.label = 4;
        if (BuildersKt.withContext(main, anonymousClass2, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.custom.AddCustomNetworkActivity$showDeleteDialog$1$1$1$1$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ViewOnClickListenerC54939xaY $this_apply;
        int label;
        final /* synthetic */ ActivityC16104edd this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, ActivityC16104edd activityC16104edd, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$this_apply = viewOnClickListenerC54939xaY;
            this.this$0 = activityC16104edd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$this_apply, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C55326xho.toast$default(C13754dXa.FragmentManager.DlABUU, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                this.$this_apply.dismiss();
                this.this$0.finish();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
