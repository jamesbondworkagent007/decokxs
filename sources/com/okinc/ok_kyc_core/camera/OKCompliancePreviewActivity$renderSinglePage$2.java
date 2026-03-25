package com.okinc.ok_kyc_core.camera;

import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C43731run;
import o.C56391yDq;
import o.C56442yFn;
import o.C56505yHw;

/* JADX INFO: loaded from: classes23.dex */
public final class OKCompliancePreviewActivity$renderSinglePage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
    final /* synthetic */ String $filePath;
    final /* synthetic */ int $width;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKCompliancePreviewActivity$renderSinglePage$2(String str, int i, Continuation<? super OKCompliancePreviewActivity$renderSinglePage$2> continuation) {
        super(2, continuation);
        this.$filePath = str;
        this.$width = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKCompliancePreviewActivity$renderSinglePage$2(this.$filePath, this.$width, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
        return ((OKCompliancePreviewActivity$renderSinglePage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            PdfRenderer pdfRenderer = new PdfRenderer(ParcelFileDescriptor.open(new File(this.$filePath), 268435456));
            int i = this.$width;
            try {
                PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(0);
                Intrinsics.checkNotNullExpressionValue(pageOpenPage, "");
                Bitmap bitmapAEQbTJ = C43731run.AEQbTJ(pageOpenPage, i);
                C56505yHw.KWHzl(pdfRenderer, null);
                return bitmapAEQbTJ;
            } finally {
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
