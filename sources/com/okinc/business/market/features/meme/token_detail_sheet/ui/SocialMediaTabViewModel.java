package com.okinc.business.market.features.meme.token_detail_sheet.ui;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.features.meme.token_detail_sheet.domain.model.PumpLiveInfoData;
import com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC28861kik;
import o.AbstractC28869kis;
import o.C25389ivm;
import o.C29709kyk;
import o.C29715kyq;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27595jyE;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialMediaTabViewModel extends ViewModel {
    public final TokenDetailCommonParams AEQbTJ;
    public final C29715kyq AYXKKw;
    public final CoroutineDispatcher AhwBna;
    public final StateFlow<AbstractC28861kik> EZpvd;
    public final MutableStateFlow<AbstractC28869kis> KWHzl;
    public final MutableStateFlow<AbstractC28861kik> OLrzqt;
    public final C29709kyk copydefault;
    public final StateFlow<AbstractC28869kis> djBIcL;
    public final InterfaceC27595jyE gEmmrt;
    public boolean valueOf;
    public final TokenDetailTabData.SocialTab values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC28861kik> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC28869kis> copydefault() {
        return this.djBIcL;
    }

    @yCM
    public SocialMediaTabViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull C29709kyk c29709kyk, @NotNull C29715kyq c29715kyq) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c29709kyk, "");
        Intrinsics.checkNotNullParameter(c29715kyq, "");
        this.AhwBna = coroutineDispatcher;
        this.gEmmrt = interfaceC27595jyE;
        this.copydefault = c29709kyk;
        this.AYXKKw = c29715kyq;
        this.valueOf = true;
        MutableStateFlow<AbstractC28869kis> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC28869kis.Application.OLrzqt);
        this.KWHzl = MutableStateFlow;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<AbstractC28861kik> MutableStateFlow2 = StateFlowKt.MutableStateFlow(AbstractC28861kik.TaskDescription.OLrzqt);
        this.OLrzqt = MutableStateFlow2;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow2);
        TokenDetailCommonParams tokenDetailCommonParams = (TokenDetailCommonParams) savedStateHandle.get("common_data");
        tokenDetailCommonParams = tokenDetailCommonParams == null ? new TokenDetailCommonParams(null, null, null, null, null, false, false, null, null, false, 1023, null) : tokenDetailCommonParams;
        this.AEQbTJ = tokenDetailCommonParams;
        TokenDetailTabData.SocialTab socialTab = (TokenDetailTabData.SocialTab) savedStateHandle.get("social_data");
        socialTab = socialTab == null ? new TokenDetailTabData.SocialTab(false, null, null, null, null, 31, null) : socialTab;
        this.values = socialTab;
        OLrzqt();
        CompactTagData compactTagDataKWHzl = socialTab.KWHzl();
        if (Intrinsics.EZpvd((Object) (compactTagDataKWHzl != null ? compactTagDataKWHzl.copydefault() : null), (Object) "live_open")) {
            KWHzl(tokenDetailCommonParams.KWHzl(), tokenDetailCommonParams.djBIcL());
        } else {
            CompactTagData compactTagDataKWHzl2 = socialTab.KWHzl();
            if (Intrinsics.EZpvd((Object) (compactTagDataKWHzl2 != null ? compactTagDataKWHzl2.copydefault() : null), (Object) "live_closed")) {
                MutableStateFlow.setValue(new AbstractC28869kis.TaskDescription(new PumpLiveInfoData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null), false));
            }
        }
        KWHzl(socialTab.copydefault());
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), coroutineDispatcher, null, new AnonymousClass1(null), 2, null);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.meme.token_detail_sheet.ui.SocialMediaTabViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SocialMediaTabViewModel.this.new AnonymousClass1(continuation);
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
                C29709kyk c29709kyk = SocialMediaTabViewModel.this.copydefault;
                this.label = 1;
                if (c29709kyk.AEQbTJ(this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
            }
            return Unit.INSTANCE;
        }
    }

    public final void OLrzqt() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AhwBna, null, new SocialMediaTabViewModel$loadRedirectDialogPreference$1(this, null), 2, null);
    }

    public final void KWHzl() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AhwBna, null, new SocialMediaTabViewModel$hideRedirectNotice$1(this, null), 2, null);
    }

    public final void KWHzl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SocialMediaTabViewModel$fetchPumpLiveInfo$1(this, str, str2, null), 3, null);
    }

    public final void KWHzl(@NotNull List<CompactTagData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SocialMediaTabViewModel$fetchDexScreenerTags$1(this, list, null), 3, null);
        } else {
            this.OLrzqt.setValue(AbstractC28861kik.TaskDescription.OLrzqt);
        }
    }
}
