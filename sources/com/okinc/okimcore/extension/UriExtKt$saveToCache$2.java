package com.okinc.okimcore.extension;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C44156sFj;
import o.C44161sFo;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.sFB;
import o.sFC;
import o.yFA;
import o.yFB;
import o.yFL;

/* JADX INFO: loaded from: classes10.dex */
public final class UriExtKt$saveToCache$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C44156sFj>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Uri $this_saveToCache;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UriExtKt$saveToCache$2(Uri uri, Context context, Continuation<? super UriExtKt$saveToCache$2> continuation) {
        super(2, continuation);
        this.$this_saveToCache = uri;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UriExtKt$saveToCache$2 uriExtKt$saveToCache$2 = new UriExtKt$saveToCache$2(this.$this_saveToCache, this.$context, continuation);
        uriExtKt$saveToCache$2.L$0 = obj;
        return uriExtKt$saveToCache$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C44156sFj> continuation) {
        return ((UriExtKt$saveToCache$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3 A[Catch: all -> 0x020c, TryCatch #3 {all -> 0x020c, blocks: (B:7:0x0025, B:24:0x009b, B:26:0x00a3, B:27:0x00bd, B:29:0x00c3, B:35:0x00ff, B:37:0x0110, B:38:0x0113, B:42:0x011e, B:44:0x0124, B:46:0x0135, B:62:0x0184, B:51:0x0150, B:52:0x0153, B:53:0x0154, B:54:0x016a, B:55:0x016b, B:61:0x017e, B:74:0x01f5, B:75:0x020b, B:72:0x01f1, B:73:0x01f4, B:30:0x00d8, B:12:0x003f, B:20:0x007c, B:16:0x0050, B:70:0x01ef, B:45:0x0129, B:57:0x0171, B:60:0x017b, B:67:0x01ea, B:68:0x01ed, B:49:0x014e), top: B:92:0x000b, inners: #0, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3 A[Catch: all -> 0x020c, TryCatch #3 {all -> 0x020c, blocks: (B:7:0x0025, B:24:0x009b, B:26:0x00a3, B:27:0x00bd, B:29:0x00c3, B:35:0x00ff, B:37:0x0110, B:38:0x0113, B:42:0x011e, B:44:0x0124, B:46:0x0135, B:62:0x0184, B:51:0x0150, B:52:0x0153, B:53:0x0154, B:54:0x016a, B:55:0x016b, B:61:0x017e, B:74:0x01f5, B:75:0x020b, B:72:0x01f1, B:73:0x01f4, B:30:0x00d8, B:12:0x003f, B:20:0x007c, B:16:0x0050, B:70:0x01ef, B:45:0x0129, B:57:0x0171, B:60:0x017b, B:67:0x01ea, B:68:0x01ed, B:49:0x014e), top: B:92:0x000b, inners: #0, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8 A[Catch: all -> 0x020c, TRY_LEAVE, TryCatch #3 {all -> 0x020c, blocks: (B:7:0x0025, B:24:0x009b, B:26:0x00a3, B:27:0x00bd, B:29:0x00c3, B:35:0x00ff, B:37:0x0110, B:38:0x0113, B:42:0x011e, B:44:0x0124, B:46:0x0135, B:62:0x0184, B:51:0x0150, B:52:0x0153, B:53:0x0154, B:54:0x016a, B:55:0x016b, B:61:0x017e, B:74:0x01f5, B:75:0x020b, B:72:0x01f1, B:73:0x01f4, B:30:0x00d8, B:12:0x003f, B:20:0x007c, B:16:0x0050, B:70:0x01ef, B:45:0x0129, B:57:0x0171, B:60:0x017b, B:67:0x01ea, B:68:0x01ed, B:49:0x014e), top: B:92:0x000b, inners: #0, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0110 A[Catch: all -> 0x020c, TryCatch #3 {all -> 0x020c, blocks: (B:7:0x0025, B:24:0x009b, B:26:0x00a3, B:27:0x00bd, B:29:0x00c3, B:35:0x00ff, B:37:0x0110, B:38:0x0113, B:42:0x011e, B:44:0x0124, B:46:0x0135, B:62:0x0184, B:51:0x0150, B:52:0x0153, B:53:0x0154, B:54:0x016a, B:55:0x016b, B:61:0x017e, B:74:0x01f5, B:75:0x020b, B:72:0x01f1, B:73:0x01f4, B:30:0x00d8, B:12:0x003f, B:20:0x007c, B:16:0x0050, B:70:0x01ef, B:45:0x0129, B:57:0x0171, B:60:0x017b, B:67:0x01ea, B:68:0x01ed, B:49:0x014e), top: B:92:0x000b, inners: #0, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016b A[Catch: all -> 0x020c, TRY_LEAVE, TryCatch #3 {all -> 0x020c, blocks: (B:7:0x0025, B:24:0x009b, B:26:0x00a3, B:27:0x00bd, B:29:0x00c3, B:35:0x00ff, B:37:0x0110, B:38:0x0113, B:42:0x011e, B:44:0x0124, B:46:0x0135, B:62:0x0184, B:51:0x0150, B:52:0x0153, B:53:0x0154, B:54:0x016a, B:55:0x016b, B:61:0x017e, B:74:0x01f5, B:75:0x020b, B:72:0x01f1, B:73:0x01f4, B:30:0x00d8, B:12:0x003f, B:20:0x007c, B:16:0x0050, B:70:0x01ef, B:45:0x0129, B:57:0x0171, B:60:0x017b, B:67:0x01ea, B:68:0x01ed, B:49:0x014e), top: B:92:0x000b, inners: #0, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        Uri uri;
        ContentResolver contentResolver;
        Context context;
        ContentResolver contentResolver2;
        String strCopydefault;
        String str;
        boolean zBooleanValue;
        File file;
        FileOutputStream fileOutputStream;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            uri = this.$this_saveToCache;
            Context context2 = this.$context;
            Result.Application application2 = Result.Companion;
            contentResolver = context2.getContentResolver();
            pUU.KWHzl("Uri.saveToCache", "Saving to cache: " + uri);
            this.L$0 = uri;
            this.L$1 = context2;
            this.L$2 = contentResolver;
            this.label = 1;
            Object objGEmmrt = sFB.gEmmrt(uri, context2, this);
            if (objGEmmrt == objCopydefault) {
                return objCopydefault;
            }
            context = context2;
            obj = objGEmmrt;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$4;
                strCopydefault = (String) this.L$3;
                contentResolver2 = (ContentResolver) this.L$2;
                context = (Context) this.L$1;
                uri = (Uri) this.L$0;
                C56391yDq.AEQbTJ(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    strCopydefault = yFL.DbNXlk(new File(strCopydefault)) + ".jpg";
                }
                if (sFC.AEQbTJ(strCopydefault, context)) {
                    String strAEQbTJ = sFB.AEQbTJ();
                    pUU.KWHzl("Uri.saveToCache", "Original target name '" + strCopydefault + "' is invalid, using fallback: " + strAEQbTJ);
                    strCopydefault = strAEQbTJ;
                } else {
                    pUU.KWHzl("Uri.saveToCache", "Using original target name: " + strCopydefault);
                }
                String str2 = !zBooleanValue ? "image/jpeg" : str;
                file = new File(context.getFilesDir(), "im");
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, strCopydefault);
                if (!zBooleanValue) {
                    if (str == null) {
                        str = "";
                    }
                    Bitmap bitmapOLrzqt = sFB.OLrzqt(context, uri, str);
                    if (bitmapOLrzqt != null) {
                        fileOutputStream = new FileOutputStream(file2);
                        try {
                            bitmapOLrzqt.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                            bitmapOLrzqt.recycle();
                            Unit unit = Unit.INSTANCE;
                            yFA.copydefault(fileOutputStream, null);
                            pUU.KWHzl("Uri.saveToCache", "Converted to JPG: " + strCopydefault);
                        } finally {
                        }
                    } else {
                        throw new IOException("Failed to extract bitmap from Uri: " + uri);
                    }
                } else {
                    InputStream inputStreamOpenInputStream = contentResolver2.openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            fileOutputStream = new FileOutputStream(file2);
                            try {
                                long jCopyTo$default = yFB.copyTo$default(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                                yFA.copydefault(fileOutputStream, null);
                                yFA.copydefault(inputStreamOpenInputStream, null);
                                C56443yFo.KWHzl(jCopyTo$default);
                            } finally {
                            }
                        } finally {
                        }
                    } else {
                        throw new IOException("Failed to get input stream from Uri: " + uri);
                    }
                }
                Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file2);
                pUU.KWHzl("Uri.saveToCache", "Saved to cache: " + uriForFile);
                C44161sFo c44161sFo = new C44161sFo(strCopydefault, file2.length(), str2);
                pUU.KWHzl("Uri.saveToCache", "Successfully cached to: " + uriForFile + " with size " + c44161sFo.AYXKKw());
                Intrinsics.copydefault(uriForFile);
                objM7377constructorimpl = Result.m7377constructorimpl(new C44156sFj(file2, uriForFile, c44161sFo));
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("Uri.saveToCache", "Error saving Uri to cache: " + uri, thM7380exceptionOrNullimpl);
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    return objM7377constructorimpl;
                }
                return null;
            }
            contentResolver = (ContentResolver) this.L$2;
            Context context3 = (Context) this.L$1;
            uri = (Uri) this.L$0;
            C56391yDq.AEQbTJ(obj);
            context = context3;
        }
        contentResolver2 = contentResolver;
        C44161sFo c44161sFo2 = (C44161sFo) obj;
        strCopydefault = c44161sFo2.copydefault();
        String strOLrzqt = c44161sFo2.OLrzqt();
        this.L$0 = uri;
        this.L$1 = context;
        this.L$2 = contentResolver2;
        this.L$3 = strCopydefault;
        this.L$4 = strOLrzqt;
        this.label = 2;
        Object objKWHzl = sFB.KWHzl(uri, context, strOLrzqt, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        str = strOLrzqt;
        obj = objKWHzl;
        zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
        }
        if (sFC.AEQbTJ(strCopydefault, context)) {
        }
        if (!zBooleanValue) {
        }
        file = new File(context.getFilesDir(), "im");
        if (!file.exists()) {
        }
        File file22 = new File(file, strCopydefault);
        if (!zBooleanValue) {
        }
        Uri uriForFile2 = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file22);
        pUU.KWHzl("Uri.saveToCache", "Saved to cache: " + uriForFile2);
        C44161sFo c44161sFo3 = new C44161sFo(strCopydefault, file22.length(), str2);
        pUU.KWHzl("Uri.saveToCache", "Successfully cached to: " + uriForFile2 + " with size " + c44161sFo3.AYXKKw());
        Intrinsics.copydefault(uriForFile2);
        objM7377constructorimpl = Result.m7377constructorimpl(new C44156sFj(file22, uriForFile2, c44161sFo3));
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
    }
}
