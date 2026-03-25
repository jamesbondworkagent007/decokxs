package com.okinc.im.imui.inputpanelV2.pluginV2;

import android.content.Context;
import android.net.Uri;
import com.okinc.im.imui.inputpanelV2.pluginV2.FilePlugin;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yFA;
import o.yFB;

/* JADX INFO: loaded from: classes8.dex */
public final class FilePlugin$copyToLocalCache$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Uri>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ FilePlugin.Activity $metadata;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilePlugin$copyToLocalCache$2(Context context, FilePlugin.Activity activity, Continuation<? super FilePlugin$copyToLocalCache$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$metadata = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FilePlugin$copyToLocalCache$2 filePlugin$copyToLocalCache$2 = new FilePlugin$copyToLocalCache$2(this.$context, this.$metadata, continuation);
        filePlugin$copyToLocalCache$2.L$0 = obj;
        return filePlugin$copyToLocalCache$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Uri> continuation) {
        return ((FilePlugin$copyToLocalCache$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Context context = this.$context;
            FilePlugin.Activity activity = this.$metadata;
            try {
                Result.Application application = Result.Companion;
                File file = new File(context.getCacheDir(), "im_file_uploads");
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, System.currentTimeMillis() + "_" + activity.KWHzl());
                InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(activity.valueOf());
                if (inputStreamOpenInputStream != null) {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            yFB.copyTo$default(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                            yFA.copydefault(fileOutputStream, null);
                            yFA.copydefault(inputStreamOpenInputStream, null);
                            objM7377constructorimpl = Result.m7377constructorimpl(Uri.fromFile(file2));
                        } finally {
                        }
                    } finally {
                    }
                } else {
                    throw new IllegalStateException(("Could not open input stream for " + activity.valueOf()).toString());
                }
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("FilePlugin", "copyToLocalCache failed", thM7380exceptionOrNullimpl);
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                return null;
            }
            return objM7377constructorimpl;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
