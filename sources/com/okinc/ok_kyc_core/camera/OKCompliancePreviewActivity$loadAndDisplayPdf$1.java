package com.okinc.ok_kyc_core.camera;

import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC43724rug;
import o.C42462rTt;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes23.dex */
public final class OKCompliancePreviewActivity$loadAndDisplayPdf$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Uri $fileUri;
    int label;
    final /* synthetic */ ActivityC43724rug this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKCompliancePreviewActivity$loadAndDisplayPdf$1(ActivityC43724rug activityC43724rug, Uri uri, Continuation<? super OKCompliancePreviewActivity$loadAndDisplayPdf$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC43724rug;
        this.$fileUri = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKCompliancePreviewActivity$loadAndDisplayPdf$1(this.this$0, this.$fileUri, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKCompliancePreviewActivity$loadAndDisplayPdf$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        ParcelFileDescriptor parcelFileDescriptorOpen;
        PdfRenderer pdfRenderer;
        Throwable th2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            PdfRenderer pdfRenderer2 = null;
            pdfRenderer2 = null;
            ParcelFileDescriptor parcelFileDescriptor = null;
            try {
                parcelFileDescriptorOpen = ParcelFileDescriptor.open(new File(C42462rTt.AEQbTJ.KWHzl(this.this$0, this.$fileUri, false)), 268435456);
                try {
                    pdfRenderer = new PdfRenderer(parcelFileDescriptorOpen);
                } catch (Exception e) {
                    pdfRenderer = null;
                    parcelFileDescriptor = parcelFileDescriptorOpen;
                    e = e;
                } catch (Throwable th3) {
                    th = th3;
                    if (pdfRenderer2 != null) {
                    }
                    if (parcelFileDescriptorOpen != null) {
                    }
                    throw th;
                }
                try {
                    int pageCount = pdfRenderer.getPageCount();
                    for (int i = 0; i < pageCount; i++) {
                        PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i);
                        Intrinsics.checkNotNullExpressionValue(pageOpenPage, "");
                        this.this$0.AEQbTJ(this.this$0.OLrzqt(pageOpenPage));
                        pageOpenPage.close();
                    }
                    pdfRenderer.close();
                } catch (Exception e2) {
                    e = e2;
                    parcelFileDescriptor = parcelFileDescriptorOpen;
                    try {
                        pUU.copydefault(this.this$0.getTAG(), String.valueOf(e));
                        if (pdfRenderer != null) {
                            pdfRenderer.close();
                        }
                        if (parcelFileDescriptor != null) {
                            parcelFileDescriptorOpen = parcelFileDescriptor;
                            parcelFileDescriptorOpen.close();
                        }
                    } catch (Throwable th4) {
                        parcelFileDescriptorOpen = parcelFileDescriptor;
                        th2 = th4;
                        PdfRenderer pdfRenderer3 = pdfRenderer;
                        th = th2;
                        pdfRenderer2 = pdfRenderer3;
                        if (pdfRenderer2 != null) {
                            pdfRenderer2.close();
                        }
                        if (parcelFileDescriptorOpen != null) {
                            parcelFileDescriptorOpen.close();
                        }
                        throw th;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    PdfRenderer pdfRenderer32 = pdfRenderer;
                    th = th2;
                    pdfRenderer2 = pdfRenderer32;
                    if (pdfRenderer2 != null) {
                    }
                    if (parcelFileDescriptorOpen != null) {
                    }
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                pdfRenderer = null;
            } catch (Throwable th6) {
                th = th6;
                parcelFileDescriptorOpen = null;
            }
            if (parcelFileDescriptorOpen != null) {
                parcelFileDescriptorOpen.close();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
