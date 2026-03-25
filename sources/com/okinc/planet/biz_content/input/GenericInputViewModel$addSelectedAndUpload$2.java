package com.okinc.planet.biz_content.input;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.okinc.planet.domain.remote.dto.ImageItem;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C47546tsE;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes24.dex */
public final class GenericInputViewModel$addSelectedAndUpload$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $context;
    final /* synthetic */ List<Uri> $uris;
    int label;
    final /* synthetic */ C47546tsE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends android.net.Uri> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GenericInputViewModel$addSelectedAndUpload$2(C47546tsE c47546tsE, List<? extends Uri> list, FragmentActivity fragmentActivity, Continuation<? super GenericInputViewModel$addSelectedAndUpload$2> continuation) {
        super(2, continuation);
        this.this$0 = c47546tsE;
        this.$uris = list;
        this.$context = fragmentActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GenericInputViewModel$addSelectedAndUpload$2(this.this$0, this.$uris, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GenericInputViewModel$addSelectedAndUpload$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            GenericInputViewModel$addSelectedAndUpload$2$newItems$1 genericInputViewModel$addSelectedAndUpload$2$newItems$1 = new GenericInputViewModel$addSelectedAndUpload$2$newItems$1(this.$uris, this.$context, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, genericInputViewModel$addSelectedAndUpload$2$newItems$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) obj;
        List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) this.this$0.AEQbTJ.getValue());
        listFJNWhG.addAll(list);
        this.this$0.copydefault((List<ImageItem>) listFJNWhG);
        C47546tsE c47546tsE = this.this$0;
        FragmentActivity fragmentActivity = this.$context;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C47546tsE.startUpload$default(c47546tsE, fragmentActivity, (ImageItem) it.next(), null, 4, null);
        }
        return Unit.INSTANCE;
    }
}
