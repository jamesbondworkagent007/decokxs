package com.okinc.im.imui.sticker.view;

import android.net.Uri;
import com.okinc.im.imui.picker.ConfirmationDialogConfig;
import com.okinc.im.imui.picker.CropShape;
import com.okinc.im.imui.picker.ImageCropConfig;
import com.okinc.im.imui.sticker.viewmodel.StickerCreationViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC37620oxK;
import o.ActivityC37621oxL;
import o.C35399nuc;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class StickerCreationActivity$launchStickerCropActivity$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Uri $imageUri;
    boolean Z$0;
    int label;
    final /* synthetic */ ActivityC37620oxK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerCreationActivity$launchStickerCropActivity$1(ActivityC37620oxK activityC37620oxK, Uri uri, Continuation<? super StickerCreationActivity$launchStickerCropActivity$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC37620oxK;
        this.$imageUri = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StickerCreationActivity$launchStickerCropActivity$1(this.this$0, this.$imageUri, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StickerCreationActivity$launchStickerCropActivity$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StickerCreationViewModel stickerCreationViewModelAhwBna = this.this$0.AhwBna();
            this.label = 1;
            obj = stickerCreationViewModelAhwBna.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.Z$0;
                C56391yDq.AEQbTJ(obj);
                this.this$0.valueOf.launch(ActivityC37621oxL.Companion.KWHzl(this.this$0, new ImageCropConfig(this.$imageUri, 300.0f, CropShape.SQUARE, 512, 512, null, null, !z ? new ConfirmationDialogConfig(C35399nuc.LoaderManager.onServiceConnected, C35399nuc.LoaderManager.UimiPO, C35399nuc.LoaderManager.QqiRNA, C35399nuc.LoaderManager.iwGUEr) : null, 96, null)));
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            StickerCreationViewModel stickerCreationViewModelAhwBna2 = this.this$0.AhwBna();
            this.Z$0 = zBooleanValue;
            this.label = 2;
            if (stickerCreationViewModelAhwBna2.KWHzl(this) == objCopydefault) {
                return objCopydefault;
            }
        }
        z = zBooleanValue;
        if (!z) {
        }
        this.this$0.valueOf.launch(ActivityC37621oxL.Companion.KWHzl(this.this$0, new ImageCropConfig(this.$imageUri, 300.0f, CropShape.SQUARE, 512, 512, null, null, !z ? new ConfirmationDialogConfig(C35399nuc.LoaderManager.onServiceConnected, C35399nuc.LoaderManager.UimiPO, C35399nuc.LoaderManager.QqiRNA, C35399nuc.LoaderManager.iwGUEr) : null, 96, null)));
        return Unit.INSTANCE;
    }
}
