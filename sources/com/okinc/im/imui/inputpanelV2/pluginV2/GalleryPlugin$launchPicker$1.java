package com.okinc.im.imui.inputpanelV2.pluginV2;

import androidx.fragment.app.Fragment;
import com.okinc.im.picker.OKIMVisualMediaPicker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C36478obi;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class GalleryPlugin$launchPicker$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ OKIMVisualMediaPicker $mediaPicker;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C36478obi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryPlugin$launchPicker$1(C36478obi c36478obi, Fragment fragment, OKIMVisualMediaPicker oKIMVisualMediaPicker, Continuation<? super GalleryPlugin$launchPicker$1> continuation) {
        super(2, continuation);
        this.this$0 = c36478obi;
        this.$fragment = fragment;
        this.$mediaPicker = oKIMVisualMediaPicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GalleryPlugin$launchPicker$1(this.this$0, this.$fragment, this.$mediaPicker, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GalleryPlugin$launchPicker$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C36478obi c36478obi;
        Fragment fragment;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            c36478obi = this.this$0;
            Fragment fragment2 = this.$fragment;
            OKIMVisualMediaPicker oKIMVisualMediaPicker = this.$mediaPicker;
            this.L$0 = c36478obi;
            this.L$1 = fragment2;
            this.label = 1;
            Object objCopydefault2 = oKIMVisualMediaPicker.copydefault(this);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            fragment = fragment2;
            obj = objCopydefault2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fragment = (Fragment) this.L$1;
            c36478obi = (C36478obi) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        c36478obi.AEQbTJ(fragment, (OKIMVisualMediaPicker.Activity) obj);
        return Unit.INSTANCE;
    }
}
