package com.okinc.im.imui.inputpanelV2.pluginV2;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class FilePlugin$ensureLauncherRegistered$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ FilePlugin this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilePlugin$ensureLauncherRegistered$1$1(FilePlugin filePlugin, Fragment fragment, Uri uri, Continuation<? super FilePlugin$ensureLauncherRegistered$1$1> continuation) {
        super(2, continuation);
        this.this$0 = filePlugin;
        this.$fragment = fragment;
        this.$uri = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FilePlugin$ensureLauncherRegistered$1$1(this.this$0, this.$fragment, this.$uri, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FilePlugin$ensureLauncherRegistered$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FilePlugin filePlugin = this.this$0;
            Context contextRequireContext = this.$fragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            Uri uri = this.$uri;
            this.label = 1;
            if (filePlugin.EZpvd(contextRequireContext, uri, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
