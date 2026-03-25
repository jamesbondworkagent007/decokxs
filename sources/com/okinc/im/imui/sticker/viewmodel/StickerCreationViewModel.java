package com.okinc.im.imui.sticker.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.okimcore.stickers.remote.model.StickerConfigResponse;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC43419rot;
import o.C33069mpW;
import o.C33129mqd;
import o.C35399nuc;
import o.C37657oxv;
import o.C37660oxy;
import o.C37721ozF;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC44487sRq;
import o.pTB;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class StickerCreationViewModel extends ViewModel {
    public final MutableStateFlow<Boolean> AEQbTJ;
    public final SharedFlow<Unit> AYXKKw;
    public final C37657oxv AhwBna;
    public final MutableSharedFlow<Unit> EZpvd;
    public final MutableSharedFlow<String> KWHzl;
    public final SharedFlow<String> OLrzqt;
    public final MutableStateFlow<Integer> copydefault;
    public final InterfaceC44487sRq djBIcL;
    public final StateFlow<Boolean> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> copydefault() {
        return this.valueOf;
    }

    @yCM
    public StickerCreationViewModel(@NotNull InterfaceC44487sRq interfaceC44487sRq, @NotNull C37657oxv c37657oxv) {
        Intrinsics.checkNotNullParameter(interfaceC44487sRq, "");
        Intrinsics.checkNotNullParameter(c37657oxv, "");
        this.djBIcL = interfaceC44487sRq;
        this.AhwBna = c37657oxv;
        this.copydefault = StateFlowKt.MutableStateFlow(0);
        MutableSharedFlow<String> mutableSharedFlowAEQbTJ = C37721ozF.AEQbTJ();
        this.KWHzl = mutableSharedFlowAEQbTJ;
        this.OLrzqt = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ);
        MutableSharedFlow<Unit> mutableSharedFlowAEQbTJ2 = C37721ozF.AEQbTJ();
        this.EZpvd = mutableSharedFlowAEQbTJ2;
        this.AYXKKw = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ2);
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.AEQbTJ = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.sticker.viewmodel.StickerCreationViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StickerCreationViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            int iEZpvd;
            List<StickerConfigResponse.SupportedFormat> listEZpvd;
            Object next;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC44487sRq interfaceC44487sRq = StickerCreationViewModel.this.djBIcL;
                this.label = 1;
                obj = interfaceC44487sRq.OLrzqt(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            StickerConfigResponse stickerConfigResponse = (StickerConfigResponse) ((AbstractC43419rot) obj).copydefault();
            MutableStateFlow mutableStateFlow = StickerCreationViewModel.this.copydefault;
            if (stickerConfigResponse == null || (listEZpvd = stickerConfigResponse.EZpvd()) == null) {
                iEZpvd = 0;
            } else {
                Iterator<T> it = listEZpvd.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((Object) ((StickerConfigResponse.SupportedFormat) next).copydefault(), (Object) "png")) {
                        break;
                    }
                }
                StickerConfigResponse.SupportedFormat supportedFormat = (StickerConfigResponse.SupportedFormat) next;
                if (supportedFormat != null) {
                    iEZpvd = supportedFormat.EZpvd();
                }
            }
            mutableStateFlow.tryEmit(C56443yFo.AEQbTJ(iEZpvd));
            return Unit.INSTANCE;
        }
    }

    public final void OLrzqt(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "");
        this.AEQbTJ.tryEmit(Boolean.TRUE);
        long length = file.length();
        int iKWHzl = C37660oxy.KWHzl(this.copydefault.getValue().intValue());
        pUU.EZpvd("sticker_log", "Sticker size fileSize: " + length + ", maxSize: " + iKWHzl);
        if (length <= iKWHzl) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StickerCreationViewModel$saveSticker$1(this, file, null), 3, null);
            return;
        }
        pUU.copydefault("sticker_log", "Sticker size exceeds the maximum allowed size fileSize: " + length + ", maxSize: " + iKWHzl);
        this.KWHzl.tryEmit(C33069mpW.copydefault(C35399nuc.LoaderManager.aRClCA, C56423yEv.EZpvd(C56390yDp.OLrzqt("size", pTB.formatLocalized$default(C33129mqd.gEmmrt(Integer.valueOf(iKWHzl)), null, 1, null)))));
        this.AEQbTJ.tryEmit(Boolean.FALSE);
    }

    public final Object EZpvd(@NotNull Continuation<? super Boolean> continuation) {
        return this.AhwBna.AEQbTJ(continuation);
    }

    public final Object KWHzl(@NotNull Continuation<? super Unit> continuation) {
        Object objCopydefault = this.AhwBna.copydefault(continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }
}
