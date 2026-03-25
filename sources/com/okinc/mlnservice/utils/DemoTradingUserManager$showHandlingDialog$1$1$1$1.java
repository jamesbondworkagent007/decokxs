package com.okinc.mlnservice.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.material3.TooltipKt;
import com.okinc.okuser.data.Token;
import com.okinc.okuser.data.TokenType;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import o.C32113mPz;
import o.C43056riA;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.ViewOnClickListenerC54939xaY;

/* JADX INFO: loaded from: classes9.dex */
public final class DemoTradingUserManager$showHandlingDialog$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ String $defAppId;
    final /* synthetic */ Map<String, Object> $params;
    final /* synthetic */ ViewOnClickListenerC54939xaY $this_apply;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DemoTradingUserManager$showHandlingDialog$1$1$1$1(Map<String, ? extends Object> map, String str, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Activity activity, Continuation<? super DemoTradingUserManager$showHandlingDialog$1$1$1$1> continuation) {
        super(2, continuation);
        this.$params = map;
        this.$defAppId = str;
        this.$this_apply = viewOnClickListenerC54939xaY;
        this.$activity = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DemoTradingUserManager$showHandlingDialog$1$1$1$1 demoTradingUserManager$showHandlingDialog$1$1$1$1 = new DemoTradingUserManager$showHandlingDialog$1$1$1$1(this.$params, this.$defAppId, this.$this_apply, this.$activity, continuation);
        demoTradingUserManager$showHandlingDialog$1$1$1$1.L$0 = obj;
        return demoTradingUserManager$showHandlingDialog$1$1$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DemoTradingUserManager$showHandlingDialog$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IGET, INVOKE]}, finally: {[IGET, INVOKE, IGET, INVOKE, IF, IGET, INVOKE, IF] complete} */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[Catch: all -> 0x00ae, Exception -> 0x00b0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b0, blocks: (B:7:0x0016, B:21:0x0058, B:23:0x0060, B:26:0x006a, B:28:0x0077, B:30:0x0081, B:31:0x008d, B:11:0x0022, B:17:0x0048, B:14:0x002e), top: B:53:0x000c, outer: #1 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Token token;
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            try {
            } catch (Exception unused) {
                C55326xho.toast$default(C32113mPz.LoaderManager.KWHzl, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                if (!this.$activity.isFinishing() && !this.$activity.isDestroyed()) {
                }
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, Dispatchers.getIO(), null, new DemoTradingUserManager$showHandlingDialog$1$1$1$1$end$1(null), 2, null);
                this.label = 1;
                obj = deferredAsync$default.await(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    token = (Token) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    if (token.getType() == TokenType.LIVE_TRADING) {
                        if (this.$params.containsKey("pageurl")) {
                            Object obj2 = this.$params.get("pageurl");
                            Intrinsics.copydefault(obj2, "");
                            str = (String) obj2;
                        } else {
                            str = "";
                        }
                        String str2 = this.$defAppId;
                        if (this.$params.containsKey("appid")) {
                            Object obj3 = this.$params.get("appid");
                            Intrinsics.copydefault(obj3, "");
                            str2 = (String) obj3;
                        }
                        C43056riA c43056riA = C43056riA.AEQbTJ;
                        Context context = this.$this_apply.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        c43056riA.copydefault(context, str2, str, this.$params);
                    }
                    if (!this.$activity.isFinishing() && !this.$activity.isDestroyed()) {
                        this.$this_apply.dismiss();
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
            Token token2 = (Token) obj;
            this.L$0 = token2;
            this.label = 2;
            if (DelayKt.delay(TooltipKt.TooltipDuration, this) == objCopydefault) {
                return objCopydefault;
            }
            token = token2;
            if (token.getType() == TokenType.LIVE_TRADING) {
            }
            if (!this.$activity.isFinishing()) {
                this.$this_apply.dismiss();
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            if (!this.$activity.isFinishing() && !this.$activity.isDestroyed()) {
                this.$this_apply.dismiss();
            }
            throw th;
        }
    }
}
