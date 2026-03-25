package com.okinc.ok_kyc_core.presentation.views;

import android.net.Uri;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.ok_kyc_core.data.remote.networkmodel.File;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import o.C42358rPx;
import o.rAX;
import o.rGL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class NewFileUploaderItemView$uploadPdf$1 extends ContinuationImpl {
    public int I$0;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    final /* synthetic */ C42358rPx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewFileUploaderItemView$uploadPdf$1(C42358rPx c42358rPx, Continuation<? super NewFileUploaderItemView$uploadPdf$1> continuation) {
        super(continuation);
        this.this$0 = c42358rPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AEQbTJ((rGL) null, (UIComponentAppModel) null, (String) null, (String) null, (Uri) null, (rAX<List<File>>) null, 0, (SingleFileUploadUseCase.FileType) null, false, (LifecycleOwner) null, 0L, (Function1<? super java.io.File, Unit>) null, (Continuation<? super Unit>) this);
    }
}
