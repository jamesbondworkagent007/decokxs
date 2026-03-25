package com.okinc.ok_kyc_widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.okinc.ok_kyc_widget.UploadNew;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C56391yDq;
import o.C56442yFn;
import o.C56505yHw;
import o.pUU;
import o.yFA;

/* JADX INFO: loaded from: classes23.dex */
public final class UploadNew$UploadItemViewBinder$renderPdfPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ImageView $errorImageView;
    final /* synthetic */ ImageView $imageView;
    final /* synthetic */ LifecycleCoroutineScope $lifecycleScope;
    final /* synthetic */ Uri $pdfUri;
    int label;
    final /* synthetic */ UploadNew.Application this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadNew$UploadItemViewBinder$renderPdfPage$1(Context context, Uri uri, LifecycleCoroutineScope lifecycleCoroutineScope, ImageView imageView, UploadNew.Application application, ImageView imageView2, Continuation<? super UploadNew$UploadItemViewBinder$renderPdfPage$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$pdfUri = uri;
        this.$lifecycleScope = lifecycleCoroutineScope;
        this.$imageView = imageView;
        this.this$0 = application;
        this.$errorImageView = imageView2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UploadNew$UploadItemViewBinder$renderPdfPage$1(this.$context, this.$pdfUri, this.$lifecycleScope, this.$imageView, this.this$0, this.$errorImageView, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UploadNew$UploadItemViewBinder$renderPdfPage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.$context.getContentResolver().openFileDescriptor(this.$pdfUri, "r");
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    LifecycleCoroutineScope lifecycleCoroutineScope = this.$lifecycleScope;
                    ImageView imageView = this.$imageView;
                    try {
                        PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpenFileDescriptor);
                        try {
                            PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(0);
                            try {
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(pageOpenPage.getWidth(), pageOpenPage.getHeight(), Bitmap.Config.ARGB_8888);
                                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                canvas.drawColor(-1);
                                canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
                                pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                                BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope, Dispatchers.getMain(), null, new UploadNew$UploadItemViewBinder$renderPdfPage$1$1$1$1$1(imageView, bitmapCreateBitmap, null), 2, null);
                                C56505yHw.KWHzl(pageOpenPage, null);
                                C56505yHw.KWHzl(pdfRenderer, null);
                                yFA.copydefault(parcelFileDescriptorOpenFileDescriptor, null);
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                }
            } catch (Exception e) {
                pUU.copydefault("UploadNew", "renderPdfPage e=" + e);
                BuildersKt__Builders_commonKt.launch$default(this.$lifecycleScope, Dispatchers.getMain(), null, new AnonymousClass2(this.this$0, this.$errorImageView, null), 2, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: renamed from: com.okinc.ok_kyc_widget.UploadNew$UploadItemViewBinder$renderPdfPage$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ImageView $errorImageView;
        int label;
        final /* synthetic */ UploadNew.Application this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UploadNew.Application application, ImageView imageView, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = application;
            this.$errorImageView = imageView;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$errorImageView, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.AEQbTJ(true, this.$errorImageView);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
