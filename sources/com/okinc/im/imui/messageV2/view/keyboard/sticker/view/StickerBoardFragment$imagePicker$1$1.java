package com.okinc.im.imui.messageV2.view.keyboard.sticker.view;

import android.content.Context;
import android.net.Uri;
import androidx.activity.result.ActivityResultLauncher;
import com.okinc.im.imui.messageV2.view.keyboard.sticker.viewmodel.StickerBoardViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC37620oxK;
import o.C36965oks;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class StickerBoardFragment$imagePicker$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ C36965oks this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerBoardFragment$imagePicker$1$1(C36965oks c36965oks, Uri uri, Continuation<? super StickerBoardFragment$imagePicker$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c36965oks;
        this.$uri = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StickerBoardFragment$imagePicker$1$1(this.this$0, this.$uri, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StickerBoardFragment$imagePicker$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.getContext() == null || this.$uri == null) {
                return Unit.INSTANCE;
            }
            C36965oks c36965oks = this.this$0;
            Context contextRequireContext = c36965oks.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            if (c36965oks.AEQbTJ(contextRequireContext, this.$uri)) {
                ActivityResultLauncher activityResultLauncher = this.this$0.values;
                ActivityC37620oxK.ActionBar actionBar = ActivityC37620oxK.Companion;
                Context contextRequireContext2 = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                activityResultLauncher.launch(actionBar.copydefault(contextRequireContext2, this.$uri));
                return Unit.INSTANCE;
            }
            StickerBoardViewModel stickerBoardViewModelGEmmrt = this.this$0.gEmmrt();
            this.label = 1;
            obj = stickerBoardViewModelGEmmrt.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                this.this$0.AEQbTJ(this.$uri);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            StickerBoardViewModel stickerBoardViewModelGEmmrt2 = this.this$0.gEmmrt();
            this.label = 2;
            if (stickerBoardViewModelGEmmrt2.OLrzqt(this) == objCopydefault) {
                return objCopydefault;
            }
            this.this$0.AEQbTJ(this.$uri);
            return Unit.INSTANCE;
        }
        this.this$0.EZpvd(this.$uri);
        return Unit.INSTANCE;
    }
}
