package com.okinc.planet.biz_content.input;

import android.content.Context;
import android.graphics.Bitmap;
import com.okinc.planet.domain.remote.dto.ImageItem;
import com.okinc.planet.domain.remote.dto.UploadState;
import com.okinc.planet_api.RichShareToFeedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C48948ufM;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.tTQ;

/* JADX INFO: loaded from: classes19.dex */
public final class GenericInputViewModel$addShareImageAndUpload$1$newItems$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends ImageItem>>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ List<RichShareToFeedImage> $shareImages;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericInputViewModel$addShareImageAndUpload$1$newItems$1(List<RichShareToFeedImage> list, Context context, Continuation<? super GenericInputViewModel$addShareImageAndUpload$1$newItems$1> continuation) {
        super(2, continuation);
        this.$shareImages = list;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GenericInputViewModel$addShareImageAndUpload$1$newItems$1 genericInputViewModel$addShareImageAndUpload$1$newItems$1 = new GenericInputViewModel$addShareImageAndUpload$1$newItems$1(this.$shareImages, this.$context, continuation);
        genericInputViewModel$addShareImageAndUpload$1$newItems$1.L$0 = obj;
        return genericInputViewModel$addShareImageAndUpload$1$newItems$1;
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
        return ((GenericInputViewModel$addShareImageAndUpload$1$newItems$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String filePath;
        String filePath2;
        String pathUrl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List<RichShareToFeedImage> list = this.$shareImages;
            Context context = this.$context;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (RichShareToFeedImage richShareToFeedImage : list) {
                if (C33129mqd.OLrzqt((CharSequence) richShareToFeedImage.getBitmapKey()) && (((filePath2 = richShareToFeedImage.getFilePath()) == null || filePath2.length() == 0) && ((pathUrl = richShareToFeedImage.getPathUrl()) == null || pathUrl.length() == 0))) {
                    C48948ufM c48948ufM = C48948ufM.copydefault;
                    String bitmapKey = richShareToFeedImage.getBitmapKey();
                    Intrinsics.copydefault((Object) bitmapKey);
                    Bitmap bitmapKWHzl = c48948ufM.KWHzl(bitmapKey);
                    if (bitmapKWHzl != null) {
                        File fileBitmapToCacheFile$default = tTQ.bitmapToCacheFile$default(tTQ.OLrzqt, context, bitmapKWHzl, null, 0, 12, null);
                        filePath = fileBitmapToCacheFile$default != null ? fileBitmapToCacheFile$default.getPath() : null;
                        if (filePath == null) {
                        }
                    } else {
                        filePath = richShareToFeedImage.getFilePath();
                    }
                } else {
                    filePath = richShareToFeedImage.getFilePath();
                }
                arrayList.add(new ImageItem(null, null, richShareToFeedImage.getBitmapKey(), UploadState.Uploading, null, richShareToFeedImage.getPathUrl(), null, null, null, filePath, null, 1491, null));
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
