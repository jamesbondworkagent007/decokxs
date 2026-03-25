package com.okinc.im.imui.glide.model;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import com.bumptech.glide.Glide;
import com.okinc.im.imui.glide.model.IMImageModel;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC5360Os;
import o.C32979mnm;
import o.C5448Sc;
import o.C56376yDb;
import o.C56391yDq;
import o.C56442yFn;
import o.RW;
import o.RX;
import o.pUU;
import o.yCZ;
import o.yFA;

/* JADX INFO: loaded from: classes8.dex */
public final class IMImageModel$generateBlurCacheSync$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Uri>, Object> {
    final /* synthetic */ File $cachedFile;
    int label;
    final /* synthetic */ IMImageModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMImageModel$generateBlurCacheSync$1$1(IMImageModel iMImageModel, File file, Continuation<? super IMImageModel$generateBlurCacheSync$1$1> continuation) {
        super(2, continuation);
        this.this$0 = iMImageModel;
        this.$cachedFile = file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IMImageModel$generateBlurCacheSync$1$1(this.this$0, this.$cachedFile, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Uri> continuation) {
        return ((IMImageModel$generateBlurCacheSync$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r14v12, resolved type: R */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("IMImageModel", "generateBlurCacheSync: Using Glide to load and transform the image synchronously");
            Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
            C5448Sc c5448ScEZpvd = new C5448Sc().AYXKKw().AEQbTJ(new yCZ(3, 3), new C56376yDb(Color.argb(130, 0, 0, 0))).EZpvd(applicationOLrzqt.getTheme());
            Intrinsics.checkNotNullExpressionValue(c5448ScEZpvd, "");
            RW rwAEQbTJ = Glide.AEQbTJ(applicationOLrzqt).EZpvd().copydefault(IMImageModel.copy$default(this.this$0, null, null, null, null, null, null, IMImageModel.SourceStrategy.SkipRemote, false, 63, null)).OLrzqt((RX<?>) c5448ScEZpvd).copydefault(AbstractC5360Os.KWHzl).AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(rwAEQbTJ, "");
            Bitmap bitmap = (Bitmap) rwAEQbTJ.get();
            FileOutputStream fileOutputStream = new FileOutputStream(this.$cachedFile);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                yFA.copydefault(fileOutputStream, null);
                return Uri.fromFile(this.$cachedFile);
            } finally {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
