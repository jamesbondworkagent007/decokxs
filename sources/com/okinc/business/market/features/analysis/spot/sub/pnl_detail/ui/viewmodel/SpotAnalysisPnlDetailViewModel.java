package com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailPageType;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailVo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC49411unz;
import o.C25973jNf;
import o.C33129mqd;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.InterfaceC8218ayb;
import o.jME;
import o.jMF;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SpotAnalysisPnlDetailViewModel extends AbstractC49411unz<C25973jNf> {
    public final jMF KWHzl;
    public final InterfaceC8218ayb OLrzqt;
    public final jME copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jMF AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC8218ayb EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jME copydefault() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public SpotAnalysisPnlDetailViewModel(@NotNull InterfaceC8218ayb interfaceC8218ayb, @NotNull jME jme, @NotNull jMF jmf) {
        super(new C25973jNf(false, null, interfaceC8218ayb.OLrzqt().getValue(), null, null, null, 59, null));
        Intrinsics.checkNotNullParameter(interfaceC8218ayb, "");
        Intrinsics.checkNotNullParameter(jme, "");
        Intrinsics.checkNotNullParameter(jmf, "");
        this.OLrzqt = interfaceC8218ayb;
        this.copydefault = jme;
        this.KWHzl = jmf;
    }

    public final void copydefault(String str, String str2) {
        EZpvd(BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SpotAnalysisPnlDetailViewModel$requestCurrentHoldingPnlDetail$1(this, str, str2, null), 3, null), C33129mqd.gEmmrt(str));
    }

    public final void KWHzl(String str, String str2) {
        EZpvd(BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SpotAnalysisPnlDetailViewModel$requestAllTimePnlDetail$1(this, str, str2, null), 3, null), C33129mqd.gEmmrt(str));
    }

    public final Object AEQbTJ(@NotNull PnlDetailPageType pnlDetailPageType, @NotNull Continuation<? super Unit> continuation) {
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.viewmodel.SpotAnalysisPnlDetailViewModel$updatePnlDetailPageType$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((C25973jNf) obj).copydefault();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((C25973jNf) obj).KWHzl((PnlDetailPageType) obj2);
            }
        }, pnlDetailPageType, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object KWHzl(InterfaceC49371unL<PnlDetailVo> interfaceC49371unL, Continuation<? super Unit> continuation) {
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.viewmodel.SpotAnalysisPnlDetailViewModel$updateCurrentHoldingPnlDetail$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((C25973jNf) obj).EZpvd();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((C25973jNf) obj).OLrzqt((InterfaceC49371unL) obj2);
            }
        }, interfaceC49371unL, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object copydefault(InterfaceC49371unL<PnlDetailVo> interfaceC49371unL, Continuation<? super Unit> continuation) {
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.viewmodel.SpotAnalysisPnlDetailViewModel$updateAllTimePnlDetail$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((C25973jNf) obj).AEQbTJ();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((C25973jNf) obj).AEQbTJ((InterfaceC49371unL<PnlDetailVo>) obj2);
            }
        }, interfaceC49371unL, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object EZpvd(@NotNull InterfaceC49371unL<Unit> interfaceC49371unL, @NotNull Continuation<? super Unit> continuation) {
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.viewmodel.SpotAnalysisPnlDetailViewModel$updatePageState$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((C25973jNf) obj).OLrzqt();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((C25973jNf) obj).EZpvd((InterfaceC49371unL<Unit>) obj2);
            }
        }, interfaceC49371unL, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }
}
