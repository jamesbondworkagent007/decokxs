package com.okinc.im.imui.messageV2.view.keyboard.sticker.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33069mpW;
import o.C33129mqd;
import o.C35399nuc;
import o.C36965oks;
import o.C37658oxw;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.C59449zhJ;
import o.pTB;
import o.pUU;

/* JADX INFO: loaded from: classes16.dex */
public final class StickerBoardFragment$proceedImageProcessing$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ C36965oks this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerBoardFragment$proceedImageProcessing$1(C36965oks c36965oks, Uri uri, Continuation<? super StickerBoardFragment$proceedImageProcessing$1> continuation) {
        super(2, continuation);
        this.this$0 = c36965oks;
        this.$uri = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StickerBoardFragment$proceedImageProcessing$1(this.this$0, this.$uri, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StickerBoardFragment$proceedImageProcessing$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.getContext() != null) {
                C37658oxw c37658oxw = C37658oxw.EZpvd;
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                String strEZpvd = c37658oxw.EZpvd(contextRequireContext, this.$uri);
                if (strEZpvd == null || strEZpvd.length() == 0) {
                    C55326xho.toast$default(C35399nuc.LoaderManager.dGgpab, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                    return Unit.INSTANCE;
                }
                pUU.EZpvd("sticker_log", "Selected media item: " + this.$uri + ", type: " + strEZpvd);
                if (!this.this$0.gEmmrt().copydefault(strEZpvd)) {
                    C55326xho.toast$default(C35399nuc.LoaderManager.dGgpab, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                    return Unit.INSTANCE;
                }
                Context contextRequireContext2 = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                Pair<Integer, Integer> pairOLrzqt = c37658oxw.OLrzqt(contextRequireContext2, this.$uri);
                int iIntValue = pairOLrzqt != null ? pairOLrzqt.getFirst().intValue() : 0;
                int iIntValue2 = pairOLrzqt != null ? pairOLrzqt.getSecond().intValue() : 0;
                boolean zOLrzqt = this.this$0.gEmmrt().OLrzqt(iIntValue, iIntValue2, strEZpvd);
                pUU.EZpvd("sticker_log", "Selected media dimension: " + iIntValue + "x" + iIntValue2);
                if (zOLrzqt) {
                    Context contextRequireContext3 = this.this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                    File fileKWHzl = c37658oxw.KWHzl(contextRequireContext3, this.$uri);
                    if (fileKWHzl != null) {
                        this.this$0.gEmmrt().KWHzl(fileKWHzl);
                    }
                    return Unit.INSTANCE;
                }
                String strReplace$default = C59449zhJ.replace$default(strEZpvd, "image/", "", false, 4, (Object) null);
                pUU.EZpvd("sticker_log", "resizing now fileExtension: " + strReplace$default);
                Context contextRequireContext4 = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
                Bitmap bitmapOLrzqt = c37658oxw.OLrzqt(contextRequireContext4, this.$uri, this.this$0.gEmmrt().OLrzqt(strReplace$default), this.this$0.gEmmrt().EZpvd(strReplace$default));
                if (bitmapOLrzqt != null) {
                    pUU.EZpvd("sticker_log", "resized success: " + bitmapOLrzqt.getWidth() + "x" + bitmapOLrzqt.getHeight());
                    Context contextRequireContext5 = this.this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "");
                    this.this$0.gEmmrt().KWHzl(c37658oxw.AEQbTJ(contextRequireContext5, bitmapOLrzqt));
                } else {
                    pUU.EZpvd("sticker_log", "resized failed");
                    C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(C35399nuc.LoaderManager.gISBfG, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fileType", strReplace$default), C56390yDp.OLrzqt("height", pTB.formatLocalized$default(C33129mqd.gEmmrt(C56443yFo.AEQbTJ(this.this$0.gEmmrt().EZpvd(strReplace$default))), null, 1, null)), C56390yDp.OLrzqt("width", pTB.formatLocalized$default(C33129mqd.gEmmrt(C56443yFo.AEQbTJ(this.this$0.gEmmrt().EZpvd(strReplace$default))), null, 1, null)), C56390yDp.OLrzqt("size", pTB.formatLocalized$default(C33129mqd.gEmmrt(C56443yFo.AEQbTJ(this.this$0.gEmmrt().AEQbTJ(strReplace$default))), null, 1, null)))), 0, 1, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
