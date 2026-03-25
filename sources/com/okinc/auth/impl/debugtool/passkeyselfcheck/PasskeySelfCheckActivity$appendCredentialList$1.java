package com.okinc.auth.impl.debugtool.passkeyselfcheck;

import android.widget.TextView;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC5718aBk;
import o.C56391yDq;
import o.C56442yFn;
import o.C5714aBg;
import o.C59454zhO;
import o.C8270aza;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeySelfCheckActivity$appendCredentialList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC5718aBk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeySelfCheckActivity$appendCredentialList$1(ActivityC5718aBk activityC5718aBk, Continuation<? super PasskeySelfCheckActivity$appendCredentialList$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC5718aBk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeySelfCheckActivity$appendCredentialList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeySelfCheckActivity$appendCredentialList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C8270aza c8270aza = null;
            try {
                List<C5714aBg.Application> listKWHzl = C5714aBg.copydefault.KWHzl(this.this$0);
                C8270aza c8270aza2 = this.this$0.valueOf;
                if (c8270aza2 == null) {
                    Intrinsics.gEmmrt("");
                    c8270aza2 = null;
                }
                String string = c8270aza2.gEmmrt.getText().toString();
                C8270aza c8270aza3 = this.this$0.valueOf;
                if (c8270aza3 == null) {
                    Intrinsics.gEmmrt("");
                    c8270aza3 = null;
                }
                TextView textView = c8270aza3.gEmmrt;
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append("- Stored Credentials: " + listKWHzl.size());
                sb.append('\n');
                if (listKWHzl.isEmpty()) {
                    sb.append("(No passkeys stored)");
                    sb.append('\n');
                } else {
                    int i = 0;
                    for (Object obj2 : listKWHzl) {
                        int i2 = i + 1;
                        if (i < 0) {
                            yDY.AYXKKw();
                        }
                        C5714aBg.Application application = (C5714aBg.Application) obj2;
                        sb.append(" #" + i2 + " Credential:  " + C59454zhO.AkhnZx(application.AEQbTJ(), 24) + "...");
                        sb.append('\n');
                        String strEZpvd = application.EZpvd();
                        String str = "(none)";
                        if (strEZpvd == null) {
                            strEZpvd = "(none)";
                        }
                        sb.append("- UID: " + strEZpvd);
                        sb.append('\n');
                        String strCopydefault = application.copydefault();
                        if (strCopydefault != null) {
                            str = strCopydefault;
                        }
                        sb.append("- RP ID: " + str);
                        sb.append('\n');
                        String strKWHzl = application.KWHzl();
                        if (strKWHzl == null) {
                            strKWHzl = "(unknown)";
                        }
                        sb.append("- Created: " + strKWHzl);
                        sb.append('\n');
                        sb.append("- Bundle: " + (application.OLrzqt() ? "✅ Present" : "❌ Missing"));
                        sb.append('\n');
                        i = i2;
                    }
                }
                textView.setText(sb.toString());
            } catch (Exception e) {
                pUU.copydefault("PasskeySelfCheck", "Failed to load credentials: " + e.getMessage());
                C8270aza c8270aza4 = this.this$0.valueOf;
                if (c8270aza4 == null) {
                    Intrinsics.gEmmrt("");
                    c8270aza4 = null;
                }
                String string2 = c8270aza4.gEmmrt.getText().toString();
                C8270aza c8270aza5 = this.this$0.valueOf;
                if (c8270aza5 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c8270aza = c8270aza5;
                }
                c8270aza.gEmmrt.setText(string2 + "\n\n❌ Failed to load credentials: " + e.getMessage());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
