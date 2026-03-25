package com.okinc.im.imui.inputpanelV2.pluginV2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.IntentCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C36478obi;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes8.dex */
public final class GalleryPlugin$onActivityResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $data;
    final /* synthetic */ int $requestCode;
    final /* synthetic */ int $resultCode;
    int label;
    final /* synthetic */ C36478obi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryPlugin$onActivityResult$1(int i, int i2, Intent intent, C36478obi c36478obi, Context context, Continuation<? super GalleryPlugin$onActivityResult$1> continuation) {
        super(2, continuation);
        this.$resultCode = i;
        this.$requestCode = i2;
        this.$data = intent;
        this.this$0 = c36478obi;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GalleryPlugin$onActivityResult$1(this.$resultCode, this.$requestCode, this.$data, this.this$0, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GalleryPlugin$onActivityResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList parcelableArrayListExtra;
        ArrayList parcelableArrayListExtra2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$resultCode == -1 && this.$requestCode == 105) {
                Intent intent = this.$data;
                List listAhwBna = null;
                List listQfsBiF = (intent == null || (parcelableArrayListExtra2 = IntentCompat.getParcelableArrayListExtra(intent, "selected_media", Uri.class)) == null) ? null : CollectionsKt___CollectionsKt.QfsBiF(parcelableArrayListExtra2);
                Intent intent2 = this.$data;
                if (intent2 != null && (parcelableArrayListExtra = IntentCompat.getParcelableArrayListExtra(intent2, "use_original_image", Uri.class)) != null) {
                    listAhwBna = CollectionsKt___CollectionsKt.QfsBiF(parcelableArrayListExtra);
                }
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                if (listQfsBiF != null && !listQfsBiF.isEmpty()) {
                    C36478obi c36478obi = this.this$0;
                    Context context = this.$context;
                    this.label = 1;
                    if (c36478obi.AEQbTJ(context, listQfsBiF, listAhwBna, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    pUU.copydefault("GalleryPlugin", "No selected media found.");
                    return Unit.INSTANCE;
                }
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
