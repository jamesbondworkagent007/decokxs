package com.okinc.okex.uploadlog.viewmodel;

import android.net.Uri;
import com.okinc.okex.uploadlog.view.displaymodels.FormElementDisplayModel;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C44086sCv;
import o.C56391yDq;
import o.C56442yFn;
import o.sCP;
import o.sCR;

/* JADX INFO: loaded from: classes10.dex */
public final class UploadLogViewModel$selectAttachment$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ UploadLogViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadLogViewModel$selectAttachment$2(UploadLogViewModel uploadLogViewModel, Uri uri, Continuation<? super UploadLogViewModel$selectAttachment$2> continuation) {
        super(2, continuation);
        this.this$0 = uploadLogViewModel;
        this.$uri = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UploadLogViewModel$selectAttachment$2(this.this$0, this.$uri, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UploadLogViewModel$selectAttachment$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a8 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        List listFJNWhG;
        MutableStateFlow mutableStateFlow;
        UploadLogViewModel uploadLogViewModel;
        Uri uri;
        Object value2;
        List listFJNWhG2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow2 = this.this$0.AEQbTJ;
            UploadLogViewModel uploadLogViewModel2 = this.this$0;
            Uri uri2 = this.$uri;
            do {
                value = mutableStateFlow2.getValue();
                listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) uploadLogViewModel2.AEQbTJ.getValue());
                listFJNWhG.add(uri2);
            } while (!mutableStateFlow2.compareAndSet(value, listFJNWhG));
            C44086sCv c44086sCv = this.this$0.AuCTel;
            Uri uri3 = this.$uri;
            this.label = 1;
            obj = c44086sCv.KWHzl(uri3, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.KWHzl((sCR) obj);
                    mutableStateFlow = this.this$0.AEQbTJ;
                    uploadLogViewModel = this.this$0;
                    uri = this.$uri;
                    do {
                        value2 = mutableStateFlow.getValue();
                        listFJNWhG2 = CollectionsKt___CollectionsKt.fJNWhG((Collection) uploadLogViewModel.AEQbTJ.getValue());
                        listFJNWhG2.remove(uri);
                    } while (!mutableStateFlow.compareAndSet(value2, listFJNWhG2));
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                C44086sCv c44086sCv2 = this.this$0.AuCTel;
                Uri uri4 = this.$uri;
                long jGEmmrt = this.this$0.gEmmrt();
                this.label = 3;
                obj = c44086sCv2.EZpvd(uri4, jGEmmrt, 104857600L, 629145600L, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                this.this$0.KWHzl((sCR) obj);
                mutableStateFlow = this.this$0.AEQbTJ;
                uploadLogViewModel = this.this$0;
                uri = this.$uri;
                do {
                    value2 = mutableStateFlow.getValue();
                    listFJNWhG2 = CollectionsKt___CollectionsKt.fJNWhG((Collection) uploadLogViewModel.AEQbTJ.getValue());
                    listFJNWhG2.remove(uri);
                } while (!mutableStateFlow.compareAndSet(value2, listFJNWhG2));
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        FormElementDisplayModel formElementDisplayModelAEQbTJ = sCP.AEQbTJ((sCR) obj);
        List listFJNWhG3 = CollectionsKt___CollectionsKt.fJNWhG((Collection) this.this$0.djBIcL());
        listFJNWhG3.add(formElementDisplayModelAEQbTJ);
        this.this$0.isConnected.set("ATTACHED_FILE_ELEMENTS", listFJNWhG3);
        UploadLogViewModel uploadLogViewModel3 = this.this$0;
        this.label = 2;
        if (uploadLogViewModel3.AEQbTJ((Continuation<? super Unit>) this) == objCopydefault) {
            return objCopydefault;
        }
        C44086sCv c44086sCv22 = this.this$0.AuCTel;
        Uri uri42 = this.$uri;
        long jGEmmrt2 = this.this$0.gEmmrt();
        this.label = 3;
        obj = c44086sCv22.EZpvd(uri42, jGEmmrt2, 104857600L, 629145600L, this);
        if (obj == objCopydefault) {
        }
        this.this$0.KWHzl((sCR) obj);
        mutableStateFlow = this.this$0.AEQbTJ;
        uploadLogViewModel = this.this$0;
        uri = this.$uri;
        do {
            value2 = mutableStateFlow.getValue();
            listFJNWhG2 = CollectionsKt___CollectionsKt.fJNWhG((Collection) uploadLogViewModel.AEQbTJ.getValue());
            listFJNWhG2.remove(uri);
        } while (!mutableStateFlow.compareAndSet(value2, listFJNWhG2));
        return Unit.INSTANCE;
    }
}
