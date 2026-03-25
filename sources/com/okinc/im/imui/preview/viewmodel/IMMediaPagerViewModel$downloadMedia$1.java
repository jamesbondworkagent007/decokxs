package com.okinc.im.imui.preview.viewmodel;

import com.okinc.im.imui.preview.viewmodel.IMMediaPagerViewModel;
import com.okinc.im.imui.tracking.model.MediaType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import java.io.FileNotFoundException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C35779oDj;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sIS;

/* JADX INFO: loaded from: classes18.dex */
public final class IMMediaPagerViewModel$downloadMedia$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $mediaType;
    final /* synthetic */ OKMessage $message;
    Object L$0;
    int label;
    final /* synthetic */ IMMediaPagerViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IMMediaPagerViewModel$downloadMedia$1(OKMessage oKMessage, IMMediaPagerViewModel iMMediaPagerViewModel, String str, Continuation<? super IMMediaPagerViewModel$downloadMedia$1> continuation) {
        super(2, continuation);
        this.$message = oKMessage;
        this.this$0 = iMMediaPagerViewModel;
        this.$mediaType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IMMediaPagerViewModel$downloadMedia$1(this.$message, this.this$0, this.$mediaType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IMMediaPagerViewModel$downloadMedia$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        final MediaType mediaTypeAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            OKMessageContent content = this.$message.getContent();
            pUU.KWHzl("IMMediaPagerViewModel", "downloadMedia: Request download => message contentType: " + (content != null ? content.getContentType() : null));
            mediaTypeAEQbTJ = this.this$0.AEQbTJ(this.$message.getContent());
            C35779oDj c35779oDj = this.this$0.gEmmrt;
            OKMessage oKMessage = this.$message;
            String str = this.$mediaType;
            this.L$0 = mediaTypeAEQbTJ;
            this.label = 1;
            obj = c35779oDj.KWHzl(oKMessage, str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            mediaTypeAEQbTJ = (MediaType) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        final IMMediaPagerViewModel iMMediaPagerViewModel = this.this$0;
        FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.im.imui.preview.viewmodel.IMMediaPagerViewModel$downloadMedia$1.4
            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public final Object emit(sIS sis, Continuation<? super Unit> continuation) {
                if (sis instanceof sIS.StateListAnimator) {
                    pUU.EZpvd("IMMediaPagerViewModel", "downloadMedia: progress => " + ((sIS.StateListAnimator) sis).KWHzl());
                    return Unit.INSTANCE;
                }
                if (sis instanceof sIS.Activity) {
                    pUU.KWHzl("IMMediaPagerViewModel", "downloadMedia: success");
                    Object objEmit = iMMediaPagerViewModel.copydefault.emit(new IMMediaPagerViewModel.ActionBar.TaskDescription(mediaTypeAEQbTJ), continuation);
                    return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
                }
                if (sis instanceof sIS.Application) {
                    sIS.Application application = (sIS.Application) sis;
                    pUU.AEQbTJ("IMMediaPagerViewModel", "downloadMedia: error", application.copydefault());
                    Exception excCopydefault = application.copydefault();
                    if ((excCopydefault instanceof IllegalArgumentException) || (excCopydefault instanceof FileNotFoundException)) {
                        Object objEmit2 = iMMediaPagerViewModel.copydefault.emit(new IMMediaPagerViewModel.ActionBar.Application(mediaTypeAEQbTJ), continuation);
                        return objEmit2 == C56442yFn.copydefault() ? objEmit2 : Unit.INSTANCE;
                    }
                    Object objEmit3 = iMMediaPagerViewModel.copydefault.emit(new IMMediaPagerViewModel.ActionBar.StateListAnimator(mediaTypeAEQbTJ), continuation);
                    return objEmit3 == C56442yFn.copydefault() ? objEmit3 : Unit.INSTANCE;
                }
                if (!(sis instanceof sIS.TaskDescription)) {
                    throw new NoWhenBranchMatchedException();
                }
                pUU.AEQbTJ("IMMediaPagerViewModel", "downloadMedia: expired", ((sIS.TaskDescription) sis).KWHzl());
                Object objEmit4 = iMMediaPagerViewModel.copydefault.emit(new IMMediaPagerViewModel.ActionBar.StateListAnimator(mediaTypeAEQbTJ), continuation);
                return objEmit4 == C56442yFn.copydefault() ? objEmit4 : Unit.INSTANCE;
            }
        };
        this.L$0 = null;
        this.label = 2;
        if (((Flow) obj).collect(flowCollector, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
