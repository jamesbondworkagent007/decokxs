package com.okinc.okimcore.extension;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.UUID;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C44161sFo;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.sFB;
import o.yFA;
import o.yFB;

/* JADX INFO: loaded from: classes10.dex */
public final class UriExtKt$toFile$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Uri $this_toFile;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UriExtKt$toFile$2(Uri uri, Context context, Continuation<? super UriExtKt$toFile$2> continuation) {
        super(2, continuation);
        this.$this_toFile = uri;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UriExtKt$toFile$2 uriExtKt$toFile$2 = new UriExtKt$toFile$2(this.$this_toFile, this.$context, continuation);
        uriExtKt$toFile$2.L$0 = obj;
        return uriExtKt$toFile$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
        return ((UriExtKt$toFile$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r9v24, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, java.io.File] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String path;
        ContentResolver contentResolver;
        Uri uri;
        Ref.ObjectRef objectRef;
        Throwable th;
        Context context;
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String scheme = this.$this_toFile.getScheme();
            if (scheme == null) {
                return null;
            }
            int iHashCode = scheme.hashCode();
            if (iHashCode == 3143036) {
                if (scheme.equals("file") && (path = this.$this_toFile.getPath()) != null) {
                    return new File(path);
                }
                return null;
            }
            if (iHashCode != 951530617 || !scheme.equals("content")) {
                return null;
            }
            contentResolver = this.$context.getContentResolver();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            uri = this.$this_toFile;
            Context context2 = this.$context;
            try {
                Result.Application application = Result.Companion;
                this.L$0 = contentResolver;
                this.L$1 = objectRef2;
                this.L$2 = uri;
                this.L$3 = context2;
                this.label = 1;
                Object objGEmmrt = sFB.gEmmrt(uri, context2, this);
                if (objGEmmrt == objCopydefault) {
                    return objCopydefault;
                }
                context = context2;
                objectRef = objectRef2;
                obj = objGEmmrt;
            } catch (Throwable th2) {
                objectRef = objectRef2;
                th = th2;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (Context) this.L$3;
            uri = (Uri) this.L$2;
            objectRef = (Ref.ObjectRef) this.L$1;
            contentResolver = (ContentResolver) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (Throwable th3) {
                th = th3;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        C44161sFo c44161sFo = (C44161sFo) obj;
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        try {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            objectRef.element = new File(context.getCacheDir(), string + "_" + c44161sFo.AEQbTJ());
            FileOutputStream fileOutputStream = new FileOutputStream((File) objectRef.element);
            try {
                yFB.copyTo$default(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                yFA.copydefault(fileOutputStream, null);
                File file = (File) objectRef.element;
                yFA.copydefault(inputStreamOpenInputStream, null);
                objM7377constructorimpl = Result.m7377constructorimpl(file);
                Uri uri2 = this.$this_toFile;
                Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("UriExt", "Failed to copy Uri content to file: " + uri2, thM7380exceptionOrNullimpl);
                    File file2 = (File) objectRef.element;
                    if (file2 != null) {
                        C56443yFo.KWHzl(file2.delete());
                    }
                }
                if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                    File file3 = (File) objM7377constructorimpl;
                    pUU.EZpvd("UriExt", "Temp file: " + (file3 != null ? file3.getAbsolutePath() : null));
                }
                return (File) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            } finally {
            }
        } finally {
        }
    }
}
