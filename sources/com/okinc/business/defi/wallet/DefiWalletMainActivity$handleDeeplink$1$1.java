package com.okinc.business.defi.wallet;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiWalletMainActivity$handleDeeplink$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bundle $bundle;
    final /* synthetic */ Ref.ObjectRef<String> $url;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DefiWalletMainActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMainActivity$handleDeeplink$1$1(Ref.ObjectRef<String> objectRef, DefiWalletMainActivity defiWalletMainActivity, Bundle bundle, Continuation<? super DefiWalletMainActivity$handleDeeplink$1$1> continuation) {
        super(2, continuation);
        this.$url = objectRef;
        this.this$0 = defiWalletMainActivity;
        this.$bundle = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletMainActivity$handleDeeplink$1$1(this.$url, this.this$0, this.$bundle, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletMainActivity$handleDeeplink$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        DefiWalletMainActivity defiWalletMainActivity;
        Bundle bundle;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Ref.ObjectRef<String> objectRef = this.$url;
            String str2 = objectRef.element;
            Intrinsics.copydefault((Object) str2);
            objectRef.element = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{"?"}, false, 0, 6, (Object) null).get(0);
            str = this.$url.element;
            if (str != null) {
                defiWalletMainActivity = this.this$0;
                Bundle bundle2 = this.$bundle;
                String string = bundle2.getString("url");
                this.L$0 = defiWalletMainActivity;
                this.L$1 = bundle2;
                this.L$2 = str;
                this.label = 1;
                Object objCopydefault2 = DefiWalletMainActivity.copydefault(defiWalletMainActivity, str, string, this);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                bundle = bundle2;
                obj = objCopydefault2;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
        } else if (i == 1) {
            str = (String) this.L$2;
            bundle = (Bundle) this.L$1;
            defiWalletMainActivity = (DefiWalletMainActivity) this.L$0;
            C56391yDq.AEQbTJ(obj);
            if (!((Boolean) obj).booleanValue()) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
                if (DefiWalletMainActivity.AEQbTJ(defiWalletMainActivity, str, bundle, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
