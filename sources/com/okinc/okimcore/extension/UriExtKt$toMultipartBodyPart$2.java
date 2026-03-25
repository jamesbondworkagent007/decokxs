package com.okinc.okimcore.extension;

import android.content.Context;
import android.net.Uri;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44161sFo;
import o.C56391yDq;
import o.C56442yFn;
import o.sFB;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes10.dex */
public final class UriExtKt$toMultipartBodyPart$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MultipartBody.Part>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $overrideFileName;
    final /* synthetic */ String $partName;
    final /* synthetic */ Uri $this_toMultipartBodyPart;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UriExtKt$toMultipartBodyPart$2(Uri uri, Context context, String str, String str2, Continuation<? super UriExtKt$toMultipartBodyPart$2> continuation) {
        super(2, continuation);
        this.$this_toMultipartBodyPart = uri;
        this.$context = context;
        this.$partName = str;
        this.$overrideFileName = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UriExtKt$toMultipartBodyPart$2(this.$this_toMultipartBodyPart, this.$context, this.$partName, this.$overrideFileName, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MultipartBody.Part> continuation) {
        return ((UriExtKt$toMultipartBodyPart$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C44161sFo c44161sFo;
        RequestBody requestBody;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Uri uri = this.$this_toMultipartBodyPart;
            Context context = this.$context;
            this.label = 1;
            obj = sFB.gEmmrt(uri, context, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c44161sFo = (C44161sFo) this.L$0;
                C56391yDq.AEQbTJ(obj);
                requestBody = (RequestBody) obj;
                if (requestBody != null) {
                    return null;
                }
                MultipartBody.Part.Companion companion = MultipartBody.Part.Companion;
                String str = this.$partName;
                String strAEQbTJ = this.$overrideFileName;
                if (strAEQbTJ == null) {
                    strAEQbTJ = c44161sFo.AEQbTJ();
                }
                return companion.createFormData(str, strAEQbTJ, requestBody);
            }
            C56391yDq.AEQbTJ(obj);
        }
        C44161sFo c44161sFo2 = (C44161sFo) obj;
        Uri uri2 = this.$this_toMultipartBodyPart;
        Context context2 = this.$context;
        this.L$0 = c44161sFo2;
        this.label = 2;
        Object objDjBIcL = sFB.djBIcL(uri2, context2, this);
        if (objDjBIcL == objCopydefault) {
            return objCopydefault;
        }
        c44161sFo = c44161sFo2;
        obj = objDjBIcL;
        requestBody = (RequestBody) obj;
        if (requestBody != null) {
        }
    }
}
