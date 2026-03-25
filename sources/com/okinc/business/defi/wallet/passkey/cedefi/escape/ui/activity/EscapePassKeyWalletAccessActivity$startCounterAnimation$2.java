package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.AbstractC17010eui;
import o.C13754dXa;
import o.C33069mpW;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.fJX;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapePassKeyWalletAccessActivity$startCounterAnimation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int label;
    final /* synthetic */ fJX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EscapePassKeyWalletAccessActivity$startCounterAnimation$2(fJX fjx, Continuation<? super EscapePassKeyWalletAccessActivity$startCounterAnimation$2> continuation) {
        super(2, continuation);
        this.this$0 = fjx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EscapePassKeyWalletAccessActivity$startCounterAnimation$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EscapePassKeyWalletAccessActivity$startCounterAnimation$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002d -> B:14:0x0030). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        AbstractC17010eui abstractC17010eui = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            i = 1;
            if (i < 6) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            C56391yDq.AEQbTJ(obj);
            AbstractC17010eui abstractC17010eui2 = this.this$0.OLrzqt;
            if (abstractC17010eui2 == null) {
                Intrinsics.gEmmrt("");
                abstractC17010eui2 = null;
            }
            abstractC17010eui2.AEQbTJ.setText(C33069mpW.KWHzl(this.this$0, C13754dXa.FragmentManager.ensureClassLoader, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", String.valueOf(5 - i)))));
            i++;
            if (i < 6) {
                this.I$0 = i;
                this.label = 1;
                if (DelayKt.delay(1000L, this) == objCopydefault) {
                    return objCopydefault;
                }
                AbstractC17010eui abstractC17010eui22 = this.this$0.OLrzqt;
                if (abstractC17010eui22 == null) {
                }
                abstractC17010eui22.AEQbTJ.setText(C33069mpW.KWHzl(this.this$0, C13754dXa.FragmentManager.ensureClassLoader, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", String.valueOf(5 - i)))));
                i++;
                if (i < 6) {
                    this.this$0.AEQbTJ = true;
                    AbstractC17010eui abstractC17010eui3 = this.this$0.OLrzqt;
                    if (abstractC17010eui3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC17010eui = abstractC17010eui3;
                    }
                    abstractC17010eui.AEQbTJ.setText(this.this$0.getString(C13754dXa.FragmentManager.hUfVAv));
                    this.this$0.OLrzqt();
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
