package com.okinc.im.picker;

import android.content.Intent;
import androidx.core.os.BundleKt;
import com.okinc.im.picker.OKIMVisualMediaPicker;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC35722oBg;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class MediaPickerActivity$onCreate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKIMVisualMediaPicker $mediaPicker;
    int label;
    final /* synthetic */ ActivityC35722oBg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPickerActivity$onCreate$1(OKIMVisualMediaPicker oKIMVisualMediaPicker, ActivityC35722oBg activityC35722oBg, Continuation<? super MediaPickerActivity$onCreate$1> continuation) {
        super(2, continuation);
        this.$mediaPicker = oKIMVisualMediaPicker;
        this.this$0 = activityC35722oBg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MediaPickerActivity$onCreate$1(this.$mediaPicker, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MediaPickerActivity$onCreate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            OKIMVisualMediaPicker oKIMVisualMediaPicker = this.$mediaPicker;
            this.label = 1;
            obj = oKIMVisualMediaPicker.copydefault(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        OKIMVisualMediaPicker.Activity activity = (OKIMVisualMediaPicker.Activity) obj;
        if (activity instanceof OKIMVisualMediaPicker.Activity.TaskDescription) {
            Intent intent = new Intent();
            OKIMVisualMediaPicker.Activity.TaskDescription taskDescription = (OKIMVisualMediaPicker.Activity.TaskDescription) activity;
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("selected_media", taskDescription.copydefault()), C56390yDp.OLrzqt("use_original_image", taskDescription.OLrzqt())));
            this.this$0.setResult(-1, intent);
            this.this$0.finish();
        } else if (activity instanceof OKIMVisualMediaPicker.Activity.ActionBar) {
            this.this$0.setResult(0);
            this.this$0.finish();
        } else {
            if (!(activity instanceof OKIMVisualMediaPicker.Activity.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            C55326xho.toastWithFailedIcon$default(((OKIMVisualMediaPicker.Activity.StateListAnimator) activity).copydefault(), 0, 1, (Object) null);
            this.this$0.setResult(0);
            this.this$0.finish();
        }
        return Unit.INSTANCE;
    }
}
