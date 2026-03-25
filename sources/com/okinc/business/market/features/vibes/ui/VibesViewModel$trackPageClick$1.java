package com.okinc.business.market.features.vibes.ui;

import com.okinc.business.market.features.vibes.domain.VibesSortType;
import com.okinc.business.market.features.vibes.ui.VibesViewModel$trackPageClick$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27727kBc;
import o.C32866mlf;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class VibesViewModel$trackPageClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $buttonName;
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $dimensionType;
    final /* synthetic */ VibesSortType $heatmapSortType;
    final /* synthetic */ VibesSortType $listSortType;
    final /* synthetic */ String $mcapSort;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ VibesViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VibesViewModel$trackPageClick$1(VibesViewModel vibesViewModel, String str, String str2, String str3, String str4, String str5, VibesSortType vibesSortType, VibesSortType vibesSortType2, Continuation<? super VibesViewModel$trackPageClick$1> continuation) {
        super(2, continuation);
        this.this$0 = vibesViewModel;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
        this.$buttonName = str3;
        this.$dimensionType = str4;
        this.$mcapSort = str5;
        this.$heatmapSortType = vibesSortType;
        this.$listSortType = vibesSortType2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VibesViewModel$trackPageClick$1(this.this$0, this.$chainId, this.$tokenContractAddress, this.$buttonName, this.$dimensionType, this.$mcapSort, this.$heatmapSortType, this.$listSortType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VibesViewModel$trackPageClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            VibesViewModel vibesViewModel = this.this$0;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            this.label = 1;
            obj = vibesViewModel.EZpvd(str, str2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        final C27727kBc c27727kBc = (C27727kBc) obj;
        final String str3 = this.$buttonName;
        final String str4 = this.$dimensionType;
        final String str5 = this.$mcapSort;
        final VibesSortType vibesSortType = this.$heatmapSortType;
        final VibesSortType vibesSortType2 = this.$listSortType;
        final String str6 = this.$tokenContractAddress;
        C32866mlf.onEvent$default("DEXMarket_Vibes_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.kBF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return VibesViewModel$trackPageClick$1.invokeSuspend$lambda$4(str3, str4, str5, vibesSortType, vibesSortType2, c27727kBc, str6, (EventParamsList) obj2);
            }
        }, 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4(String str, String str2, String str3, VibesSortType vibesSortType, VibesSortType vibesSortType2, C27727kBc c27727kBc, String str4, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        if (str2 != null) {
            EventParamsList.put$default(eventParamsList, "time_dimension", str2, false, 4, null);
        }
        if (str3 != null) {
            EventParamsList.put$default(eventParamsList, "price_mcap_toggle", str3, false, 4, null);
        }
        if (vibesSortType != null) {
            EventParamsList.put$default(eventParamsList, "kol_heatmap_sort", vibesSortType.getTrackValue(), false, 4, null);
        }
        if (vibesSortType2 != null) {
            EventParamsList.put$default(eventParamsList, "kol_table_sort", vibesSortType2.getTrackValue(), false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "chain_name", c27727kBc.KWHzl(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_symbol", c27727kBc.OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_name", c27727kBc.AEQbTJ(), false, 4, null);
        return Unit.INSTANCE;
    }
}
