package com.okinc.im.picker;

import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResultLauncher;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC35726oBk;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes16.dex */
public final class OKIMVisualMediaPicker$handleSelectedMedia$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Uri> $uris;
    int label;
    final /* synthetic */ OKIMVisualMediaPicker this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends android.net.Uri> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OKIMVisualMediaPicker$handleSelectedMedia$1(OKIMVisualMediaPicker oKIMVisualMediaPicker, List<? extends Uri> list, Continuation<? super OKIMVisualMediaPicker$handleSelectedMedia$1> continuation) {
        super(2, continuation);
        this.this$0 = oKIMVisualMediaPicker;
        this.$uris = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKIMVisualMediaPicker$handleSelectedMedia$1(this.this$0, this.$uris, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKIMVisualMediaPicker$handleSelectedMedia$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl((List<? extends Uri>) this.$uris);
            OKIMVisualMediaPicker oKIMVisualMediaPicker = this.this$0;
            List<Uri> list = this.$uris;
            this.label = 1;
            obj = oKIMVisualMediaPicker.EZpvd((List<? extends Uri>) list, (Continuation<? super List<? extends Uri>>) this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        List<? extends Uri> list2 = (List) obj;
        if (!list2.isEmpty()) {
            if (this.this$0.AYXKKw.AEQbTJ()) {
                OKIMVisualMediaPicker oKIMVisualMediaPicker2 = this.this$0;
                this.label = 2;
                if (oKIMVisualMediaPicker2.KWHzl((List<? extends Uri>) list2, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
            } else if (this.this$0.AYXKKw.KWHzl()) {
                Intent intentEZpvd = ActivityC35726oBk.Companion.EZpvd(this.this$0.KWHzl(), list2);
                ActivityResultLauncher activityResultLauncher = this.this$0.valueOf;
                if (activityResultLauncher != null) {
                    activityResultLauncher.launch(intentEZpvd);
                }
            } else {
                OKIMVisualMediaPicker.finishWithResult$default(this.this$0, list2, null, 2, null);
            }
        } else {
            OKIMVisualMediaPicker.finishWithResult$default(this.this$0, yDY.AhwBna(), null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
