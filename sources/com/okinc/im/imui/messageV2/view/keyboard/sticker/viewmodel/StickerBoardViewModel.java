package com.okinc.im.imui.messageV2.view.keyboard.sticker.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.sticker.model.ListItem;
import com.okinc.im.imui.sticker.model.StickerModel;
import com.okinc.im.imui.sticker.model.StickerPackModel;
import com.okinc.okimcore.stickers.remote.model.StickerConfigResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C33069mpW;
import o.C33129mqd;
import o.C35399nuc;
import o.C37654oxs;
import o.C37657oxv;
import o.C37660oxy;
import o.C37661oxz;
import o.C37721ozF;
import o.C44157sFk;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.C59449zhJ;
import o.InterfaceC36962okp;
import o.InterfaceC36968okv;
import o.InterfaceC44487sRq;
import o.InterfaceC44488sRr;
import o.pTB;
import o.pUU;
import o.yCM;
import o.yDY;
import o.yFL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class StickerBoardViewModel extends ViewModel {
    public final MutableStateFlow<InterfaceC36962okp> AEQbTJ;
    public final MutableStateFlow<Boolean> AYXKKw;
    public final MutableSharedFlow<Unit> AhwBna;
    public final StateFlow<InterfaceC36962okp> AkhnZx;
    public final C37661oxz AuCTel;
    public final StateFlow<Boolean> DbNXlk;
    public final MutableSharedFlow<Unit> EZpvd;
    public final MutableStateFlow<Boolean> KWHzl;
    public final MutableStateFlow<StickerPackModel> OLrzqt;
    public final MutableSharedFlow<String> copydefault;
    public final MutableSharedFlow<Unit> djBIcL;
    public final SharedFlow<Unit> ejfBZ;
    public final C37657oxv fARcdN;
    public final C37654oxs fIwbmz;
    public final SharedFlow<String> fJNWhG;
    public final StateFlow<StickerPackModel> fetchVPNInfo;
    public final MutableStateFlow<List<ListItem>> gEmmrt;
    public final SharedFlow<Unit> getFieldNames;
    public final StateFlow<Boolean> getNewProxyInstance;
    public int isConnected;
    public final SharedFlow<Unit> iwGUEr;
    public final InterfaceC44487sRq uzCIH;
    public final MutableStateFlow<StickerConfigResponse> valueOf;
    public final StateFlow<InterfaceC36968okv> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<StickerPackModel> AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> AhwBna() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> EZpvd() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC36968okv> OLrzqt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC36962okp> copydefault() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> djBIcL() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> fetchVPNInfo() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<String> gEmmrt() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> valueOf() {
        return this.ejfBZ;
    }

    @yCM
    public StickerBoardViewModel(@NotNull InterfaceC44487sRq interfaceC44487sRq, @NotNull C37657oxv c37657oxv, @NotNull C37654oxs c37654oxs, @NotNull C37661oxz c37661oxz) {
        Intrinsics.checkNotNullParameter(interfaceC44487sRq, "");
        Intrinsics.checkNotNullParameter(c37657oxv, "");
        Intrinsics.checkNotNullParameter(c37654oxs, "");
        Intrinsics.checkNotNullParameter(c37661oxz, "");
        this.uzCIH = interfaceC44487sRq;
        this.fARcdN = c37657oxv;
        this.fIwbmz = c37654oxs;
        this.AuCTel = c37661oxz;
        MutableSharedFlow<String> mutableSharedFlowAEQbTJ = C37721ozF.AEQbTJ();
        this.copydefault = mutableSharedFlowAEQbTJ;
        this.fJNWhG = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ);
        MutableSharedFlow<Unit> mutableSharedFlowAEQbTJ2 = C37721ozF.AEQbTJ();
        this.AhwBna = mutableSharedFlowAEQbTJ2;
        this.iwGUEr = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ2);
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.AYXKKw = MutableStateFlow;
        this.getNewProxyInstance = FlowKt.asStateFlow(MutableStateFlow);
        this.valueOf = StateFlowKt.MutableStateFlow(null);
        MutableStateFlow<InterfaceC36962okp> MutableStateFlow2 = StateFlowKt.MutableStateFlow(InterfaceC36962okp.ActionBar.OLrzqt);
        this.AEQbTJ = MutableStateFlow2;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<StickerPackModel> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow3;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow3);
        MutableSharedFlow<Unit> mutableSharedFlowAEQbTJ3 = C37721ozF.AEQbTJ();
        this.djBIcL = mutableSharedFlowAEQbTJ3;
        this.getFieldNames = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ3);
        MutableStateFlow<List<ListItem>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.gEmmrt = MutableStateFlow4;
        MutableSharedFlow<Unit> mutableSharedFlowAEQbTJ4 = C37721ozF.AEQbTJ();
        this.EZpvd = mutableSharedFlowAEQbTJ4;
        this.ejfBZ = FlowKt.asSharedFlow(mutableSharedFlowAEQbTJ4);
        MutableStateFlow<Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.KWHzl = MutableStateFlow5;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow5);
        this.values = FlowKt.stateIn(FlowKt.combine(MutableStateFlow2, MutableStateFlow3, MutableStateFlow4, new StickerBoardViewModel$contentBoardState$1(null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getLazily(), new InterfaceC36968okv.TaskDescription(yDY.AhwBna()));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        if (C44157sFk.gEmmrt().values()) {
            DbNXlk();
        }
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.keyboard.sticker.viewmodel.StickerBoardViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StickerBoardViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableStateFlow mutableStateFlow = StickerBoardViewModel.this.valueOf;
                final StickerBoardViewModel stickerBoardViewModel = StickerBoardViewModel.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.im.imui.messageV2.view.keyboard.sticker.viewmodel.StickerBoardViewModel.1.3
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public final Object emit(StickerConfigResponse stickerConfigResponse, Continuation<? super Unit> continuation) {
                        if (stickerConfigResponse == null) {
                            stickerBoardViewModel.AEQbTJ.tryEmit(InterfaceC36962okp.StateListAnimator.copydefault);
                            return Unit.INSTANCE;
                        }
                        stickerBoardViewModel.AEQbTJ();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (mutableStateFlow.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public final void DbNXlk() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StickerBoardViewModel$getStickerConfig$1(this, null), 3, null);
    }

    public final void AEQbTJ() {
        FlowKt.launchIn(FlowKt.m7441catch(FlowKt.onEach(this.uzCIH.EZpvd(), new StickerBoardViewModel$fetchStickerPacks$1(this, null)), new StickerBoardViewModel$fetchStickerPacks$2(this, null)), ViewModelKt.getViewModelScope(this));
    }

    public final void AkhnZx() {
        this.isConnected = 0;
        this.gEmmrt.tryEmit(yDY.AhwBna());
        this.KWHzl.tryEmit(Boolean.TRUE);
    }

    public final void copydefault(@NotNull StickerPackModel stickerPackModel) {
        Intrinsics.checkNotNullParameter(stickerPackModel, "");
        AkhnZx();
        this.OLrzqt.tryEmit(stickerPackModel);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StickerBoardViewModel$onClickStickerPack$1(this, stickerPackModel, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StickerBoardViewModel$onClickStickerPack$2(this, stickerPackModel, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(@NotNull List<StickerPackModel> list, @NotNull Continuation<? super StickerPackModel> continuation) throws Throwable {
        StickerBoardViewModel$getDefaultPack$1 stickerBoardViewModel$getDefaultPack$1;
        if (continuation instanceof StickerBoardViewModel$getDefaultPack$1) {
            stickerBoardViewModel$getDefaultPack$1 = (StickerBoardViewModel$getDefaultPack$1) continuation;
            int i = stickerBoardViewModel$getDefaultPack$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stickerBoardViewModel$getDefaultPack$1.label = i - Integer.MIN_VALUE;
            } else {
                stickerBoardViewModel$getDefaultPack$1 = new StickerBoardViewModel$getDefaultPack$1(this, continuation);
            }
        }
        Object objAEQbTJ = stickerBoardViewModel$getDefaultPack$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = stickerBoardViewModel$getDefaultPack$1.label;
        Object obj = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            if (list.isEmpty()) {
                return null;
            }
            C37654oxs c37654oxs = this.fIwbmz;
            stickerBoardViewModel$getDefaultPack$1.L$0 = list;
            stickerBoardViewModel$getDefaultPack$1.label = 1;
            objAEQbTJ = c37654oxs.AEQbTJ(stickerBoardViewModel$getDefaultPack$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) stickerBoardViewModel$getDefaultPack$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        String str = (String) objAEQbTJ;
        if (str != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.EZpvd((Object) ((StickerPackModel) next).KWHzl(), (Object) str)) {
                    obj = next;
                    break;
                }
            }
            StickerPackModel stickerPackModel = (StickerPackModel) obj;
            if (stickerPackModel != null) {
                return stickerPackModel;
            }
        }
        return (StickerPackModel) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(String str, boolean z, Continuation<? super Unit> continuation) throws Throwable {
        StickerBoardViewModel$fetchData$1 stickerBoardViewModel$fetchData$1;
        StickerBoardViewModel stickerBoardViewModel;
        if (continuation instanceof StickerBoardViewModel$fetchData$1) {
            stickerBoardViewModel$fetchData$1 = (StickerBoardViewModel$fetchData$1) continuation;
            int i = stickerBoardViewModel$fetchData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stickerBoardViewModel$fetchData$1.label = i - Integer.MIN_VALUE;
            } else {
                stickerBoardViewModel$fetchData$1 = new StickerBoardViewModel$fetchData$1(this, continuation);
            }
        }
        Object objAEQbTJ = stickerBoardViewModel$fetchData$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = stickerBoardViewModel$fetchData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            pUU.EZpvd("sticker_log", "Fetching keyboard stickers for pack: " + str + ", page: " + this.isConnected);
            InterfaceC44487sRq interfaceC44487sRq = this.uzCIH;
            int i3 = this.isConnected;
            stickerBoardViewModel$fetchData$1.L$0 = this;
            stickerBoardViewModel$fetchData$1.Z$0 = z;
            stickerBoardViewModel$fetchData$1.label = 1;
            objAEQbTJ = interfaceC44487sRq.AEQbTJ(str, i3, 50, stickerBoardViewModel$fetchData$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            stickerBoardViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = stickerBoardViewModel$fetchData$1.Z$0;
            stickerBoardViewModel = (StickerBoardViewModel) stickerBoardViewModel$fetchData$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        Iterable<InterfaceC44488sRr> iterable = (Iterable) objAEQbTJ;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
        for (InterfaceC44488sRr interfaceC44488sRr : iterable) {
            arrayList.add(new ListItem.StickerItem(new StickerModel(interfaceC44488sRr.getStickerId(), interfaceC44488sRr.getIconUrl(), false, 4, null)));
        }
        pUU.EZpvd("sticker_log", "new data: " + arrayList.size());
        List<ListItem> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) stickerBoardViewModel.gEmmrt.getValue());
        listFJNWhG.addAll(arrayList);
        stickerBoardViewModel.gEmmrt.tryEmit(listFJNWhG);
        MutableSharedFlow<Unit> mutableSharedFlow = stickerBoardViewModel.EZpvd;
        Unit unit = Unit.INSTANCE;
        mutableSharedFlow.tryEmit(unit);
        stickerBoardViewModel.KWHzl.tryEmit(C56443yFo.KWHzl(arrayList.size() == 50));
        pUU.EZpvd("sticker_log", "scrollToTop: " + z);
        if (z) {
            stickerBoardViewModel.djBIcL.tryEmit(unit);
        }
        return unit;
    }

    public final void KWHzl() {
        pUU.EZpvd("sticker_log", "fetchNextPage: _doneLoadMore:" + this.KWHzl.getValue());
        if (!this.KWHzl.getValue().booleanValue()) {
            this.KWHzl.tryEmit(Boolean.FALSE);
            return;
        }
        int i = this.isConnected + 1;
        this.isConnected = i;
        pUU.EZpvd("sticker_log", "fetchNextPage: currentPage:" + i);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StickerBoardViewModel$fetchNextPage$1(this, null), 3, null);
    }

    public final void KWHzl(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "");
        this.AYXKKw.tryEmit(Boolean.TRUE);
        long length = file.length();
        String strFetchVPNInfo = yFL.fetchVPNInfo(file);
        if (KWHzl(length, strFetchVPNInfo)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StickerBoardViewModel$saveSticker$1(this, file, null), 3, null);
        } else {
            this.copydefault.tryEmit(C33069mpW.copydefault(C35399nuc.LoaderManager.aRClCA, C56423yEv.EZpvd(C56390yDp.OLrzqt("size", pTB.formatLocalized$default(C33129mqd.gEmmrt(Integer.valueOf(AEQbTJ(strFetchVPNInfo))), null, 1, null)))));
            this.AYXKKw.tryEmit(Boolean.FALSE);
        }
    }

    public final boolean copydefault(@NotNull String str) {
        ArrayList arrayList;
        List<StickerConfigResponse.SupportedFormat> listEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        String strReplace$default = C59449zhJ.replace$default(str, "image/", "", false, 4, (Object) null);
        StickerConfigResponse value = this.valueOf.getValue();
        if (value == null || (listEZpvd = value.EZpvd()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            Iterator<T> it = listEZpvd.iterator();
            while (it.hasNext()) {
                arrayList.add(((StickerConfigResponse.SupportedFormat) it.next()).copydefault());
            }
        }
        return arrayList != null && arrayList.contains(strReplace$default);
    }

    public final boolean KWHzl(long j, String str) {
        int iKWHzl = C37660oxy.KWHzl(AEQbTJ(str));
        pUU.copydefault("sticker_log", "Sticker size fileSize: " + j + ", maxSize: " + iKWHzl);
        return j < ((long) iKWHzl);
    }

    public final StickerConfigResponse.SupportedFormat KWHzl(String str) {
        List<StickerConfigResponse.SupportedFormat> listEZpvd;
        StickerConfigResponse value = this.valueOf.getValue();
        Object obj = null;
        if (value == null || (listEZpvd = value.EZpvd()) == null) {
            return null;
        }
        Iterator<T> it = listEZpvd.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.EZpvd((Object) ((StickerConfigResponse.SupportedFormat) next).copydefault(), (Object) str)) {
                obj = next;
                break;
            }
        }
        return (StickerConfigResponse.SupportedFormat) obj;
    }

    public final int AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        StickerConfigResponse.SupportedFormat supportedFormatKWHzl = KWHzl(str);
        if (supportedFormatKWHzl != null) {
            return supportedFormatKWHzl.EZpvd();
        }
        return 0;
    }

    public final int OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        StickerConfigResponse.SupportedFormat supportedFormatKWHzl = KWHzl(str);
        if (supportedFormatKWHzl != null) {
            return supportedFormatKWHzl.OLrzqt();
        }
        return 0;
    }

    public final int EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        StickerConfigResponse.SupportedFormat supportedFormatKWHzl = KWHzl(str);
        if (supportedFormatKWHzl != null) {
            return supportedFormatKWHzl.KWHzl();
        }
        return 0;
    }

    public final boolean OLrzqt(int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String strReplace$default = C59449zhJ.replace$default(str, "image/", "", false, 4, (Object) null);
        return i < OLrzqt(strReplace$default) && i2 < EZpvd(strReplace$default);
    }

    public final void isConnected() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new StickerBoardViewModel$retryForError$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(@NotNull Continuation<? super Boolean> continuation) throws Throwable {
        StickerBoardViewModel$isReachLimit$1 stickerBoardViewModel$isReachLimit$1;
        StickerBoardViewModel stickerBoardViewModel;
        if (continuation instanceof StickerBoardViewModel$isReachLimit$1) {
            stickerBoardViewModel$isReachLimit$1 = (StickerBoardViewModel$isReachLimit$1) continuation;
            int i = stickerBoardViewModel$isReachLimit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stickerBoardViewModel$isReachLimit$1.label = i - Integer.MIN_VALUE;
            } else {
                stickerBoardViewModel$isReachLimit$1 = new StickerBoardViewModel$isReachLimit$1(this, continuation);
            }
        }
        Object objCopydefault = stickerBoardViewModel$isReachLimit$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = stickerBoardViewModel$isReachLimit$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            InterfaceC44487sRq interfaceC44487sRq = this.uzCIH;
            stickerBoardViewModel$isReachLimit$1.L$0 = this;
            stickerBoardViewModel$isReachLimit$1.label = 1;
            objCopydefault = interfaceC44487sRq.copydefault(stickerBoardViewModel$isReachLimit$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            stickerBoardViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            stickerBoardViewModel = (StickerBoardViewModel) stickerBoardViewModel$isReachLimit$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        long jLongValue = ((Number) objCopydefault).longValue();
        StickerConfigResponse value = stickerBoardViewModel.valueOf.getValue();
        return C56443yFo.KWHzl(jLongValue >= (value != null ? value.OLrzqt() : 0L));
    }

    public final Object EZpvd(@NotNull Continuation<? super Boolean> continuation) {
        return this.fARcdN.AEQbTJ(continuation);
    }

    public final Object OLrzqt(@NotNull Continuation<? super Unit> continuation) {
        Object objCopydefault = this.fARcdN.copydefault(continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }
}
