package com.okinc.tradingbot.impl.aiBot.ui.order;

import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.tradingbot.impl.aiBot.dto.AiHomeDto;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC48473uSs;
import o.C43422row;
import o.C48112uFk;
import o.C49968uyZ;
import o.C56391yDq;
import o.C56442yFn;
import o.uEA;
import o.vNB;

/* JADX INFO: loaded from: classes16.dex */
public final class LlmOrderFragment$initViewModel$1 extends SuspendLambda implements Function2<vNB<? extends AiHomeDto>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C48112uFk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LlmOrderFragment$initViewModel$1(C48112uFk c48112uFk, Continuation<? super LlmOrderFragment$initViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = c48112uFk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LlmOrderFragment$initViewModel$1 llmOrderFragment$initViewModel$1 = new LlmOrderFragment$initViewModel$1(this.this$0, continuation);
        llmOrderFragment$initViewModel$1.L$0 = obj;
        return llmOrderFragment$initViewModel$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vNB<? extends AiHomeDto> vnb, Continuation<? super Unit> continuation) {
        return invoke2((vNB<AiHomeDto>) vnb, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vNB<AiHomeDto> vnb, Continuation<? super Unit> continuation) {
        return ((LlmOrderFragment$initViewModel$1) create(vnb, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            vNB vnb = (vNB) this.L$0;
            if (vnb instanceof vNB.StateListAnimator) {
                this.this$0.AEQbTJ().AYXKKw();
                this.this$0.copydefault(C49968uyZ.OLrzqt(((vNB.StateListAnimator) vnb).AEQbTJ(), C43422row.OLrzqt()));
            } else if (vnb instanceof vNB.TaskDescription) {
                this.this$0.fJNWhG();
                AiHomeDto aiHomeDto = (AiHomeDto) ((vNB.TaskDescription) vnb).AEQbTJ();
                AbstractC48473uSs abstractC48473uSsIsConnected = C48112uFk.isConnected(this.this$0);
                Set<String> setKeySet = aiHomeDto.gEmmrt().keySet();
                TextView textView = abstractC48473uSsIsConnected.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(setKeySet.contains("SPOT") ? 0 : 8);
                TextView textView2 = abstractC48473uSsIsConnected.values;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(setKeySet.contains("SWAP") ? 0 : 8);
                LinearLayoutCompat linearLayoutCompat = abstractC48473uSsIsConnected.AhwBna;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
                TextView textView3 = abstractC48473uSsIsConnected.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                if (textView3.getVisibility() == 0) {
                    TextView textView4 = abstractC48473uSsIsConnected.values;
                    Intrinsics.checkNotNullExpressionValue(textView4, "");
                    int i = textView4.getVisibility() != 0 ? 8 : 0;
                    linearLayoutCompat.setVisibility(i);
                    uEA ueaValues = this.this$0.values();
                    ueaValues.OLrzqt(aiHomeDto.isConnected());
                    ueaValues.notifyDataSetChanged();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
