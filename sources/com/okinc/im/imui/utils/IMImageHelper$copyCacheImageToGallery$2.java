package com.okinc.im.imui.utils;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C34703nhO;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56529yIt;
import o.yFA;
import o.yFB;

/* JADX INFO: loaded from: classes8.dex */
public final class IMImageHelper$copyCacheImageToGallery$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Uri>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $imagePath;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMImageHelper$copyCacheImageToGallery$2(String str, Context context, Continuation<? super IMImageHelper$copyCacheImageToGallery$2> continuation) {
        super(2, continuation);
        this.$imagePath = str;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IMImageHelper$copyCacheImageToGallery$2(this.$imagePath, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Uri> continuation) {
        return ((IMImageHelper$copyCacheImageToGallery$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Uri contentUri;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            File file = new File(this.$imagePath);
            if (!file.exists()) {
                throw new IllegalArgumentException("Image file does not exist");
            }
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            String str = String.format("%s_%s", Arrays.copyOf(new Object[]{C34703nhO.OLrzqt(this.$context.getApplicationContext()), file.getName()}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "");
            if (Build.VERSION.SDK_INT >= 29) {
                contentUri = MediaStore.Images.Media.getContentUri("external_primary");
            } else {
                contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str);
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
            ContentResolver contentResolver = this.$context.getContentResolver();
            if (contentResolver == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Uri uriInsert = contentResolver.insert(contentUri, contentValues);
            if (uriInsert != null) {
                OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        Intrinsics.copydefault(outputStreamOpenOutputStream, "");
                        long jCopyTo$default = yFB.copyTo$default(fileInputStream, outputStreamOpenOutputStream, 0, 2, null);
                        yFA.copydefault(fileInputStream, null);
                        yFA.copydefault(outputStreamOpenOutputStream, null);
                        C56443yFo.KWHzl(jCopyTo$default);
                    } finally {
                    }
                } finally {
                }
            }
            return uriInsert;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
