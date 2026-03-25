package com.okinc.im.imui.sticker.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.sticker.model.ListItem;
import com.okinc.okimcore.stickers.remote.model.StickerConfigResponse;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
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
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC43419rot;
import o.C37721ozF;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC44487sRq;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class StickerSettingsViewModel extends ViewModel {
    public final MutableStateFlow<Long> AEQbTJ;
    public final StateFlow<Boolean> AYXKKw;
    public final MutableStateFlow<Long> AhwBna;
    public final SharedFlow<String> AkhnZx;
    public final StateFlow<List<ListItem>> DbNXlk;
    public final MutableStateFlow<Boolean> EZpvd;
    public final MutableStateFlow<Boolean> KWHzl;
    public final MutableSharedFlow<Unit> OLrzqt;
    public final MutableSharedFlow<String> copydefault;
    public final MutableSharedFlow<Integer> djBIcL;
    public final InterfaceC44487sRq fARcdN;
    public final SharedFlow<Integer> fIwbmz;
    public final StateFlow<Pair<Long, Long>> fJNWhG;
    public final SharedFlow<Unit> fetchVPNInfo;
    public int gEmmrt;
    public final String isConnected;
    public final MutableStateFlow<List<ListItem>> valueOf;
    public final StateFlow<Boolean> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> AEQbTJ() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Pair<Long, Long>> AYXKKw() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> KWHzl() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> OLrzqt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Integer> djBIcL() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<ListItem>> gEmmrt() {
        return this.DbNXlk;
    }

    @yCM
    public StickerSettingsViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull InterfaceC44487sRq interfaceC44487sRq) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(interfaceC44487sRq, "");
        this.fARcdN = interfaceC44487sRq;
        String str = (String) savedStateHandle.get("KEY_STICKER_ID");
        this.isConnected = str != null ? str : "";
        MutableStateFlow<Long> MutableStateFlow = StateFlowKt.MutableStateFlow(0L);
        this.AEQbTJ = MutableStateFlow;
        MutableStateFlow<Long> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0L);
        this.AhwBna = MutableStateFlow2;
        MutableStateFlow<List<ListItem>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.valueOf = MutableStateFlow3;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow3);
        MutableSharedFlow<Unit> mutableSharedFlowAEQbTJ = C37721ozF.AEQbTJ();
        this.OLrzqt = mutableSharedFlowAEQbTJ;
        this.fetchVPNInfo = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.EZpvd = MutableStateFlow4;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow4);
        MutableSharedFlow<String> mutableSharedFlowAEQbTJ2 = C37721ozF.AEQbTJ();
        this.copydefault = mutableSharedFlowAEQbTJ2;
        this.AkhnZx = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ2);
        MutableSharedFlow<Integer> mutableSharedFlowAEQbTJ3 = C37721ozF.AEQbTJ();
        this.djBIcL = mutableSharedFlowAEQbTJ3;
        this.fIwbmz = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ3);
        MutableStateFlow<Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.KWHzl = MutableStateFlow5;
        this.values = FlowKt.asStateFlow(MutableStateFlow5);
        this.fJNWhG = FlowKt.stateIn(FlowKt.combine(MutableStateFlow2, MutableStateFlow, new StickerSettingsViewModel$subtitle$1(null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getLazily(), new Pair(0L, 0L));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        AhwBna();
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.sticker.viewmodel.StickerSettingsViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StickerSettingsViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            MutableStateFlow mutableStateFlow;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC44487sRq interfaceC44487sRq = StickerSettingsViewModel.this.fARcdN;
                this.label = 1;
                obj = interfaceC44487sRq.OLrzqt(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableStateFlow = (MutableStateFlow) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    mutableStateFlow.tryEmit(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
            StickerConfigResponse stickerConfigResponse = (StickerConfigResponse) ((AbstractC43419rot) obj).copydefault();
            StickerSettingsViewModel.this.AEQbTJ.tryEmit(C56443yFo.KWHzl(stickerConfigResponse != null ? stickerConfigResponse.OLrzqt() : 0L));
            MutableStateFlow mutableStateFlow2 = StickerSettingsViewModel.this.AhwBna;
            InterfaceC44487sRq interfaceC44487sRq2 = StickerSettingsViewModel.this.fARcdN;
            this.L$0 = mutableStateFlow2;
            this.label = 2;
            Object objCopydefault2 = interfaceC44487sRq2.copydefault(this);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            mutableStateFlow = mutableStateFlow2;
            obj = objCopydefault2;
            mutableStateFlow.tryEmit(obj);
            return Unit.INSTANCE;
        }
    }

    private final void AhwBna() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StickerSettingsViewModel$fetchData$1(this, null), 3, null);
    }

    public final void copydefault() {
        pUU.EZpvd("sticker_log", "fetchNextPage: _doneLoadMore:" + this.EZpvd.getValue());
        if (!this.EZpvd.getValue().booleanValue()) {
            this.EZpvd.tryEmit(Boolean.FALSE);
            return;
        }
        int i = this.gEmmrt + 1;
        this.gEmmrt = i;
        pUU.EZpvd("sticker_log", "fetchNextPage: currentPage:" + i);
        AhwBna();
    }

    public final void OLrzqt(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.KWHzl.tryEmit(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StickerSettingsViewModel$removeStickers$1(this, set, null), 3, null);
    }
}
