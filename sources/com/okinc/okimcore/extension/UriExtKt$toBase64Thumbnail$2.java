package com.okinc.okimcore.extension;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Base64;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C59449zhJ;
import o.C59454zhO;
import o.pUU;
import o.sFB;

/* JADX INFO: loaded from: classes10.dex */
public final class UriExtKt$toBase64Thumbnail$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $maxDimension;
    final /* synthetic */ long $targetSizeInBytes;
    final /* synthetic */ Uri $this_toBase64Thumbnail;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UriExtKt$toBase64Thumbnail$2(Uri uri, Context context, int i, long j, Continuation<? super UriExtKt$toBase64Thumbnail$2> continuation) {
        super(2, continuation);
        this.$this_toBase64Thumbnail = uri;
        this.$context = context;
        this.$maxDimension = i;
        this.$targetSizeInBytes = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UriExtKt$toBase64Thumbnail$2(this.$this_toBase64Thumbnail, this.$context, this.$maxDimension, this.$targetSizeInBytes, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((UriExtKt$toBase64Thumbnail$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        Exception e;
        Bitmap bitmapAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Bitmap bitmap = null;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("UriExt", "Creating thumbnail for: " + this.$this_toBase64Thumbnail);
                Uri uri = this.$this_toBase64Thumbnail;
                Context context = this.$context;
                this.label = 1;
                obj = sFB.AkhnZx(uri, context, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            String str = (String) obj;
            if (str != null && (C59449zhJ.startsWith$default(str, "image/", false, 2, null) || C59449zhJ.startsWith$default(str, "video/", false, 2, null))) {
                Bitmap bitmapOLrzqt = sFB.OLrzqt(this.$context, this.$this_toBase64Thumbnail, str);
                if (bitmapOLrzqt == null) {
                    return null;
                }
                Bitmap bitmapOLrzqt2 = sFB.OLrzqt(bitmapOLrzqt, this.$context, this.$this_toBase64Thumbnail);
                if (!Intrinsics.EZpvd(bitmapOLrzqt2, bitmapOLrzqt)) {
                    bitmapOLrzqt.recycle();
                }
                bitmapAEQbTJ = sFB.AEQbTJ(bitmapOLrzqt2, this.$maxDimension);
                try {
                    try {
                        if (!Intrinsics.EZpvd(bitmapAEQbTJ, bitmapOLrzqt2)) {
                            bitmapOLrzqt2.recycle();
                        }
                        String strEncodeToString = Base64.encodeToString(sFB.copydefault(bitmapAEQbTJ, this.$targetSizeInBytes), 2);
                        Intrinsics.copydefault((Object) strEncodeToString);
                        pUU.KWHzl("UriExt", "Thumbnail success: " + C59454zhO.AkhnZx(strEncodeToString, 10) + "...");
                        if (bitmapAEQbTJ != null) {
                            bitmapAEQbTJ.recycle();
                        }
                        return strEncodeToString;
                    } catch (Throwable th2) {
                        th = th2;
                        bitmap = bitmapAEQbTJ;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    pUU.AEQbTJ("UriExt", "Error creating thumbnail", e);
                    if (bitmapAEQbTJ == null) {
                        return null;
                    }
                    bitmapAEQbTJ.recycle();
                    return null;
                }
            }
            throw new IllegalArgumentException("Invalid URI or unsupported type");
        } catch (Exception e3) {
            e = e3;
            bitmapAEQbTJ = null;
        } catch (Throwable th3) {
            th = th3;
            if (bitmap != null) {
            }
            throw th;
        }
    }
}
