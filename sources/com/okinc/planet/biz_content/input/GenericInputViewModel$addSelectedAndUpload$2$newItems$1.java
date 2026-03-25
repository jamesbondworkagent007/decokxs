package com.okinc.planet.biz_content.input;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.okinc.planet.domain.remote.dto.ImageItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C48948ufM;
import o.C56391yDq;
import o.C56442yFn;
import o.tTQ;

/* JADX INFO: loaded from: classes24.dex */
public final class GenericInputViewModel$addSelectedAndUpload$2$newItems$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ImageItem>>, Object> {
    final /* synthetic */ FragmentActivity $context;
    final /* synthetic */ List<Uri> $uris;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends android.net.Uri> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GenericInputViewModel$addSelectedAndUpload$2$newItems$1(List<? extends Uri> list, FragmentActivity fragmentActivity, Continuation<? super GenericInputViewModel$addSelectedAndUpload$2$newItems$1> continuation) {
        super(2, continuation);
        this.$uris = list;
        this.$context = fragmentActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenericInputViewModel$addSelectedAndUpload$2$newItems$1(this.$uris, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends ImageItem>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<ImageItem>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<ImageItem>> continuation) {
        return ((GenericInputViewModel$addSelectedAndUpload$2$newItems$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List<Uri> list = this.$uris;
            FragmentActivity fragmentActivity = this.$context;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Bitmap bitmapCopydefault = tTQ.OLrzqt.copydefault(fragmentActivity, (Uri) it.next());
                ImageItem imageItem = bitmapCopydefault != null ? new ImageItem(null, null, C48948ufM.copydefault.AEQbTJ(fragmentActivity, bitmapCopydefault), null, null, null, null, null, null, null, null, 2043, null) : null;
                if (imageItem != null) {
                    arrayList.add(imageItem);
                }
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
