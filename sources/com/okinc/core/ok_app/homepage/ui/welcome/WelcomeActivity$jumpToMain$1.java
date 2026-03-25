package com.okinc.core.ok_app.homepage.ui.welcome;

import com.google.android.gms.measurement.zza;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class WelcomeActivity$jumpToMain$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WelcomeActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeActivity$jumpToMain$1(WelcomeActivity welcomeActivity, Continuation<? super WelcomeActivity$jumpToMain$1> continuation) {
        super(continuation);
        this.this$0 = welcomeActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WelcomeActivity.EZpvd(zza.AEQbTJ(), zza.AEQbTJ(), zza.AEQbTJ(), 623399356, -623399342, new Object[]{this.this$0, this}, zza.AEQbTJ());
    }
}
