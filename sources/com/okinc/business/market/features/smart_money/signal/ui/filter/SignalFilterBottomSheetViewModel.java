package com.okinc.business.market.features.smart_money.signal.ui.filter;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModel;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalFilterBottomSheetParams;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMetricsFilter;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalsFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C29537kvX;
import o.C29601kwi;
import o.C56403yEb;
import o.InterfaceC28823khz;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalFilterBottomSheetViewModel extends ViewModel {
    public SignalFilterBottomSheetParams EZpvd = new SignalFilterBottomSheetParams(null, null, null, 7, null);
    public final StateFlow<C29601kwi> KWHzl;
    public final MutableStateFlow<C29601kwi> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C29601kwi> copydefault() {
        return this.KWHzl;
    }

    @yCM
    public SignalFilterBottomSheetViewModel() {
        MutableStateFlow<C29601kwi> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.KWHzl = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void KWHzl(@NotNull SignalFilterBottomSheetParams signalFilterBottomSheetParams) {
        Intrinsics.checkNotNullParameter(signalFilterBottomSheetParams, "");
        this.EZpvd = signalFilterBottomSheetParams;
        MutableStateFlow<C29601kwi> mutableStateFlow = this.copydefault;
        List<SignalMultiSelectUiModel> listKWHzl = signalFilterBottomSheetParams.KWHzl();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        for (SignalMultiSelectUiModel signalMultiSelectUiModel : listKWHzl) {
            arrayList.add(new InterfaceC28823khz.ActionBar(signalMultiSelectUiModel.copydefault(), signalMultiSelectUiModel.OLrzqt(), signalMultiSelectUiModel.AEQbTJ(), signalMultiSelectUiModel.valueOf()));
        }
        mutableStateFlow.setValue(new C29601kwi(arrayList, signalFilterBottomSheetParams.OLrzqt(), signalFilterBottomSheetParams.copydefault(), new C29537kvX(false, false, false, false, false, false, false, false, false, false, false, 2047, null)));
    }

    public final boolean KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C29601kwi value = this.copydefault.getValue();
        if (value == null) {
            return false;
        }
        MutableStateFlow<C29601kwi> mutableStateFlow = this.copydefault;
        List<InterfaceC28823khz.ActionBar> listOLrzqt = value.OLrzqt();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        boolean z = true;
        for (InterfaceC28823khz.ActionBar actionBarCopy$default : listOLrzqt) {
            if (Intrinsics.EZpvd((Object) actionBarCopy$default.OLrzqt(), (Object) str)) {
                z = !actionBarCopy$default.EZpvd();
                actionBarCopy$default = InterfaceC28823khz.ActionBar.copy$default(actionBarCopy$default, null, null, null, z, 7, null);
            }
            arrayList.add(actionBarCopy$default);
        }
        mutableStateFlow.setValue(C29601kwi.copy$default(value, arrayList, null, null, null, 14, null));
        return z;
    }

    public final void KWHzl(@NotNull PriceRangeFilter priceRangeFilter, boolean z) {
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        C29601kwi value = this.copydefault.getValue();
        if (value == null) {
            return;
        }
        MutableStateFlow<C29601kwi> mutableStateFlow = this.copydefault;
        SignalMetricsFilter signalMetricsFilterEZpvd = value.EZpvd();
        SignalMetricsFilter signalMetricsFilterEZpvd2 = signalMetricsFilterEZpvd.EZpvd((TypedValues.PositionType.TYPE_PERCENT_Y & 1) != 0 ? signalMetricsFilterEZpvd.AEQbTJ : priceRangeFilter, (TypedValues.PositionType.TYPE_PERCENT_Y & 2) != 0 ? signalMetricsFilterEZpvd.AYXKKw : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 4) != 0 ? signalMetricsFilterEZpvd.EZpvd : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 8) != 0 ? signalMetricsFilterEZpvd.AhwBna : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 16) != 0 ? signalMetricsFilterEZpvd.OLrzqt : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 32) != 0 ? signalMetricsFilterEZpvd.valueOf : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 64) != 0 ? signalMetricsFilterEZpvd.djBIcL : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 128) != 0 ? signalMetricsFilterEZpvd.KWHzl : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 256) != 0 ? signalMetricsFilterEZpvd.copydefault : null);
        C29537kvX c29537kvXCopydefault = value.copydefault();
        mutableStateFlow.setValue(C29601kwi.copy$default(value, null, signalMetricsFilterEZpvd2, null, c29537kvXCopydefault.OLrzqt((2043 & 1) != 0 ? c29537kvXCopydefault.copydefault : z, (2043 & 2) != 0 ? c29537kvXCopydefault.AkhnZx : false, (2043 & 4) != 0 ? c29537kvXCopydefault.AEQbTJ : false, (2043 & 8) != 0 ? c29537kvXCopydefault.gEmmrt : false, (2043 & 16) != 0 ? c29537kvXCopydefault.KWHzl : false, (2043 & 32) != 0 ? c29537kvXCopydefault.valueOf : false, (2043 & 64) != 0 ? c29537kvXCopydefault.AYXKKw : false, (2043 & 128) != 0 ? c29537kvXCopydefault.djBIcL : false, (2043 & 256) != 0 ? c29537kvXCopydefault.AhwBna : false, (2043 & 512) != 0 ? c29537kvXCopydefault.OLrzqt : false, (2043 & 1024) != 0 ? c29537kvXCopydefault.EZpvd : false), 5, null));
    }

    public final void djBIcL(@NotNull PriceRangeFilter priceRangeFilter, boolean z) {
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        C29601kwi value = this.copydefault.getValue();
        if (value == null) {
            return;
        }
        MutableStateFlow<C29601kwi> mutableStateFlow = this.copydefault;
        SignalMetricsFilter signalMetricsFilterEZpvd = value.EZpvd();
        SignalMetricsFilter signalMetricsFilterEZpvd2 = signalMetricsFilterEZpvd.EZpvd((TypedValues.PositionType.TYPE_PERCENT_Y & 1) != 0 ? signalMetricsFilterEZpvd.AEQbTJ : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 2) != 0 ? signalMetricsFilterEZpvd.AYXKKw : priceRangeFilter, (TypedValues.PositionType.TYPE_PERCENT_Y & 4) != 0 ? signalMetricsFilterEZpvd.EZpvd : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 8) != 0 ? signalMetricsFilterEZpvd.AhwBna : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 16) != 0 ? signalMetricsFilterEZpvd.OLrzqt : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 32) != 0 ? signalMetricsFilterEZpvd.valueOf : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 64) != 0 ? signalMetricsFilterEZpvd.djBIcL : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 128) != 0 ? signalMetricsFilterEZpvd.KWHzl : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 256) != 0 ? signalMetricsFilterEZpvd.copydefault : null);
        C29537kvX c29537kvXCopydefault = value.copydefault();
        mutableStateFlow.setValue(C29601kwi.copy$default(value, null, signalMetricsFilterEZpvd2, null, c29537kvXCopydefault.OLrzqt((2043 & 1) != 0 ? c29537kvXCopydefault.copydefault : false, (2043 & 2) != 0 ? c29537kvXCopydefault.AkhnZx : z, (2043 & 4) != 0 ? c29537kvXCopydefault.AEQbTJ : false, (2043 & 8) != 0 ? c29537kvXCopydefault.gEmmrt : false, (2043 & 16) != 0 ? c29537kvXCopydefault.KWHzl : false, (2043 & 32) != 0 ? c29537kvXCopydefault.valueOf : false, (2043 & 64) != 0 ? c29537kvXCopydefault.AYXKKw : false, (2043 & 128) != 0 ? c29537kvXCopydefault.djBIcL : false, (2043 & 256) != 0 ? c29537kvXCopydefault.AhwBna : false, (2043 & 512) != 0 ? c29537kvXCopydefault.OLrzqt : false, (2043 & 1024) != 0 ? c29537kvXCopydefault.EZpvd : false), 5, null));
    }

    public final void AEQbTJ(@NotNull PriceRangeFilter priceRangeFilter, boolean z) {
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        C29601kwi value = this.copydefault.getValue();
        if (value == null) {
            return;
        }
        MutableStateFlow<C29601kwi> mutableStateFlow = this.copydefault;
        SignalMetricsFilter signalMetricsFilterEZpvd = value.EZpvd();
        SignalMetricsFilter signalMetricsFilterEZpvd2 = signalMetricsFilterEZpvd.EZpvd((TypedValues.PositionType.TYPE_PERCENT_Y & 1) != 0 ? signalMetricsFilterEZpvd.AEQbTJ : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 2) != 0 ? signalMetricsFilterEZpvd.AYXKKw : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 4) != 0 ? signalMetricsFilterEZpvd.EZpvd : priceRangeFilter, (TypedValues.PositionType.TYPE_PERCENT_Y & 8) != 0 ? signalMetricsFilterEZpvd.AhwBna : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 16) != 0 ? signalMetricsFilterEZpvd.OLrzqt : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 32) != 0 ? signalMetricsFilterEZpvd.valueOf : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 64) != 0 ? signalMetricsFilterEZpvd.djBIcL : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 128) != 0 ? signalMetricsFilterEZpvd.KWHzl : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 256) != 0 ? signalMetricsFilterEZpvd.copydefault : null);
        C29537kvX c29537kvXCopydefault = value.copydefault();
        mutableStateFlow.setValue(C29601kwi.copy$default(value, null, signalMetricsFilterEZpvd2, null, c29537kvXCopydefault.OLrzqt((2043 & 1) != 0 ? c29537kvXCopydefault.copydefault : false, (2043 & 2) != 0 ? c29537kvXCopydefault.AkhnZx : false, (2043 & 4) != 0 ? c29537kvXCopydefault.AEQbTJ : z, (2043 & 8) != 0 ? c29537kvXCopydefault.gEmmrt : false, (2043 & 16) != 0 ? c29537kvXCopydefault.KWHzl : false, (2043 & 32) != 0 ? c29537kvXCopydefault.valueOf : false, (2043 & 64) != 0 ? c29537kvXCopydefault.AYXKKw : false, (2043 & 128) != 0 ? c29537kvXCopydefault.djBIcL : false, (2043 & 256) != 0 ? c29537kvXCopydefault.AhwBna : false, (2043 & 512) != 0 ? c29537kvXCopydefault.OLrzqt : false, (2043 & 1024) != 0 ? c29537kvXCopydefault.EZpvd : false), 5, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(@NotNull String str, @NotNull String str2, @NotNull TokenAgeType tokenAgeType) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tokenAgeType, "");
        C29601kwi value = this.copydefault.getValue();
        if (value == null) {
            return;
        }
        if ((!StringsKt__StringsKt.fARcdN((CharSequence) str)) && (!StringsKt__StringsKt.fARcdN((CharSequence) str2))) {
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str);
            int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
            Integer intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(str2);
            if (iIntValue >= (intOrNull2 != null ? intOrNull2.intValue() : 0)) {
                z = false;
            }
        } else {
            z = true;
        }
        MutableStateFlow<C29601kwi> mutableStateFlow = this.copydefault;
        SignalMetricsFilter signalMetricsFilterEZpvd = value.EZpvd();
        SignalMetricsFilter signalMetricsFilterEZpvd2 = signalMetricsFilterEZpvd.EZpvd((TypedValues.PositionType.TYPE_PERCENT_Y & 1) != 0 ? signalMetricsFilterEZpvd.AEQbTJ : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 2) != 0 ? signalMetricsFilterEZpvd.AYXKKw : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 4) != 0 ? signalMetricsFilterEZpvd.EZpvd : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 8) != 0 ? signalMetricsFilterEZpvd.AhwBna : str, (TypedValues.PositionType.TYPE_PERCENT_Y & 16) != 0 ? signalMetricsFilterEZpvd.OLrzqt : str2, (TypedValues.PositionType.TYPE_PERCENT_Y & 32) != 0 ? signalMetricsFilterEZpvd.valueOf : tokenAgeType, (TypedValues.PositionType.TYPE_PERCENT_Y & 64) != 0 ? signalMetricsFilterEZpvd.djBIcL : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 128) != 0 ? signalMetricsFilterEZpvd.KWHzl : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 256) != 0 ? signalMetricsFilterEZpvd.copydefault : null);
        C29537kvX c29537kvXCopydefault = value.copydefault();
        mutableStateFlow.setValue(C29601kwi.copy$default(value, null, signalMetricsFilterEZpvd2, null, c29537kvXCopydefault.OLrzqt((2043 & 1) != 0 ? c29537kvXCopydefault.copydefault : false, (2043 & 2) != 0 ? c29537kvXCopydefault.AkhnZx : false, (2043 & 4) != 0 ? c29537kvXCopydefault.AEQbTJ : false, (2043 & 8) != 0 ? c29537kvXCopydefault.gEmmrt : false, (2043 & 16) != 0 ? c29537kvXCopydefault.KWHzl : false, (2043 & 32) != 0 ? c29537kvXCopydefault.valueOf : false, (2043 & 64) != 0 ? c29537kvXCopydefault.AYXKKw : z, (2043 & 128) != 0 ? c29537kvXCopydefault.djBIcL : false, (2043 & 256) != 0 ? c29537kvXCopydefault.AhwBna : false, (2043 & 512) != 0 ? c29537kvXCopydefault.OLrzqt : false, (2043 & 1024) != 0 ? c29537kvXCopydefault.EZpvd : false), 5, null));
    }

    public final void AhwBna(@NotNull PriceRangeFilter priceRangeFilter, boolean z) {
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        C29601kwi value = this.copydefault.getValue();
        if (value == null) {
            return;
        }
        MutableStateFlow<C29601kwi> mutableStateFlow = this.copydefault;
        SignalMetricsFilter signalMetricsFilterEZpvd = value.EZpvd();
        SignalMetricsFilter signalMetricsFilterEZpvd2 = signalMetricsFilterEZpvd.EZpvd((TypedValues.PositionType.TYPE_PERCENT_Y & 1) != 0 ? signalMetricsFilterEZpvd.AEQbTJ : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 2) != 0 ? signalMetricsFilterEZpvd.AYXKKw : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 4) != 0 ? signalMetricsFilterEZpvd.EZpvd : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 8) != 0 ? signalMetricsFilterEZpvd.AhwBna : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 16) != 0 ? signalMetricsFilterEZpvd.OLrzqt : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 32) != 0 ? signalMetricsFilterEZpvd.valueOf : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 64) != 0 ? signalMetricsFilterEZpvd.djBIcL : priceRangeFilter, (TypedValues.PositionType.TYPE_PERCENT_Y & 128) != 0 ? signalMetricsFilterEZpvd.KWHzl : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 256) != 0 ? signalMetricsFilterEZpvd.copydefault : null);
        C29537kvX c29537kvXCopydefault = value.copydefault();
        mutableStateFlow.setValue(C29601kwi.copy$default(value, null, signalMetricsFilterEZpvd2, null, c29537kvXCopydefault.OLrzqt((2043 & 1) != 0 ? c29537kvXCopydefault.copydefault : false, (2043 & 2) != 0 ? c29537kvXCopydefault.AkhnZx : false, (2043 & 4) != 0 ? c29537kvXCopydefault.AEQbTJ : false, (2043 & 8) != 0 ? c29537kvXCopydefault.gEmmrt : z, (2043 & 16) != 0 ? c29537kvXCopydefault.KWHzl : false, (2043 & 32) != 0 ? c29537kvXCopydefault.valueOf : false, (2043 & 64) != 0 ? c29537kvXCopydefault.AYXKKw : false, (2043 & 128) != 0 ? c29537kvXCopydefault.djBIcL : false, (2043 & 256) != 0 ? c29537kvXCopydefault.AhwBna : false, (2043 & 512) != 0 ? c29537kvXCopydefault.OLrzqt : false, (2043 & 1024) != 0 ? c29537kvXCopydefault.EZpvd : false), 5, null));
    }

    public final void EZpvd(@NotNull PriceRangeFilter priceRangeFilter, boolean z) {
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        C29601kwi value = this.copydefault.getValue();
        if (value == null) {
            return;
        }
        MutableStateFlow<C29601kwi> mutableStateFlow = this.copydefault;
        SignalMetricsFilter signalMetricsFilterEZpvd = value.EZpvd();
        SignalMetricsFilter signalMetricsFilterEZpvd2 = signalMetricsFilterEZpvd.EZpvd((TypedValues.PositionType.TYPE_PERCENT_Y & 1) != 0 ? signalMetricsFilterEZpvd.AEQbTJ : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 2) != 0 ? signalMetricsFilterEZpvd.AYXKKw : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 4) != 0 ? signalMetricsFilterEZpvd.EZpvd : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 8) != 0 ? signalMetricsFilterEZpvd.AhwBna : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 16) != 0 ? signalMetricsFilterEZpvd.OLrzqt : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 32) != 0 ? signalMetricsFilterEZpvd.valueOf : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 64) != 0 ? signalMetricsFilterEZpvd.djBIcL : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 128) != 0 ? signalMetricsFilterEZpvd.KWHzl : priceRangeFilter, (TypedValues.PositionType.TYPE_PERCENT_Y & 256) != 0 ? signalMetricsFilterEZpvd.copydefault : null);
        C29537kvX c29537kvXCopydefault = value.copydefault();
        mutableStateFlow.setValue(C29601kwi.copy$default(value, null, signalMetricsFilterEZpvd2, null, c29537kvXCopydefault.OLrzqt((2043 & 1) != 0 ? c29537kvXCopydefault.copydefault : false, (2043 & 2) != 0 ? c29537kvXCopydefault.AkhnZx : false, (2043 & 4) != 0 ? c29537kvXCopydefault.AEQbTJ : false, (2043 & 8) != 0 ? c29537kvXCopydefault.gEmmrt : false, (2043 & 16) != 0 ? c29537kvXCopydefault.KWHzl : z, (2043 & 32) != 0 ? c29537kvXCopydefault.valueOf : false, (2043 & 64) != 0 ? c29537kvXCopydefault.AYXKKw : false, (2043 & 128) != 0 ? c29537kvXCopydefault.djBIcL : false, (2043 & 256) != 0 ? c29537kvXCopydefault.AhwBna : false, (2043 & 512) != 0 ? c29537kvXCopydefault.OLrzqt : false, (2043 & 1024) != 0 ? c29537kvXCopydefault.EZpvd : false), 5, null));
    }

    public final void valueOf(@NotNull PriceRangeFilter priceRangeFilter, boolean z) {
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        C29601kwi value = this.copydefault.getValue();
        if (value == null) {
            return;
        }
        MutableStateFlow<C29601kwi> mutableStateFlow = this.copydefault;
        SignalMetricsFilter signalMetricsFilterEZpvd = value.EZpvd();
        SignalMetricsFilter signalMetricsFilterEZpvd2 = signalMetricsFilterEZpvd.EZpvd((TypedValues.PositionType.TYPE_PERCENT_Y & 1) != 0 ? signalMetricsFilterEZpvd.AEQbTJ : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 2) != 0 ? signalMetricsFilterEZpvd.AYXKKw : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 4) != 0 ? signalMetricsFilterEZpvd.EZpvd : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 8) != 0 ? signalMetricsFilterEZpvd.AhwBna : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 16) != 0 ? signalMetricsFilterEZpvd.OLrzqt : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 32) != 0 ? signalMetricsFilterEZpvd.valueOf : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 64) != 0 ? signalMetricsFilterEZpvd.djBIcL : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 128) != 0 ? signalMetricsFilterEZpvd.KWHzl : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 256) != 0 ? signalMetricsFilterEZpvd.copydefault : priceRangeFilter);
        C29537kvX c29537kvXCopydefault = value.copydefault();
        mutableStateFlow.setValue(C29601kwi.copy$default(value, null, signalMetricsFilterEZpvd2, null, c29537kvXCopydefault.OLrzqt((2043 & 1) != 0 ? c29537kvXCopydefault.copydefault : false, (2043 & 2) != 0 ? c29537kvXCopydefault.AkhnZx : false, (2043 & 4) != 0 ? c29537kvXCopydefault.AEQbTJ : false, (2043 & 8) != 0 ? c29537kvXCopydefault.gEmmrt : false, (2043 & 16) != 0 ? c29537kvXCopydefault.KWHzl : false, (2043 & 32) != 0 ? c29537kvXCopydefault.valueOf : z, (2043 & 64) != 0 ? c29537kvXCopydefault.AYXKKw : false, (2043 & 128) != 0 ? c29537kvXCopydefault.djBIcL : false, (2043 & 256) != 0 ? c29537kvXCopydefault.AhwBna : false, (2043 & 512) != 0 ? c29537kvXCopydefault.OLrzqt : false, (2043 & 1024) != 0 ? c29537kvXCopydefault.EZpvd : false), 5, null));
    }

    public final void AYXKKw(@NotNull PriceRangeFilter priceRangeFilter, boolean z) {
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        C29601kwi value = this.copydefault.getValue();
        if (value == null) {
            return;
        }
        MutableStateFlow<C29601kwi> mutableStateFlow = this.copydefault;
        SignalsFilter signalsFilterCopy$default = SignalsFilter.copy$default(value.AEQbTJ(), priceRangeFilter, null, null, null, 14, null);
        C29537kvX c29537kvXCopydefault = value.copydefault();
        mutableStateFlow.setValue(C29601kwi.copy$default(value, null, null, signalsFilterCopy$default, c29537kvXCopydefault.OLrzqt((2043 & 1) != 0 ? c29537kvXCopydefault.copydefault : false, (2043 & 2) != 0 ? c29537kvXCopydefault.AkhnZx : false, (2043 & 4) != 0 ? c29537kvXCopydefault.AEQbTJ : false, (2043 & 8) != 0 ? c29537kvXCopydefault.gEmmrt : false, (2043 & 16) != 0 ? c29537kvXCopydefault.KWHzl : false, (2043 & 32) != 0 ? c29537kvXCopydefault.valueOf : false, (2043 & 64) != 0 ? c29537kvXCopydefault.AYXKKw : false, (2043 & 128) != 0 ? c29537kvXCopydefault.djBIcL : z, (2043 & 256) != 0 ? c29537kvXCopydefault.AhwBna : false, (2043 & 512) != 0 ? c29537kvXCopydefault.OLrzqt : false, (2043 & 1024) != 0 ? c29537kvXCopydefault.EZpvd : false), 3, null));
    }

    public final void gEmmrt(@NotNull PriceRangeFilter priceRangeFilter, boolean z) {
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        C29601kwi value = this.copydefault.getValue();
        if (value == null) {
            return;
        }
        MutableStateFlow<C29601kwi> mutableStateFlow = this.copydefault;
        SignalsFilter signalsFilterCopy$default = SignalsFilter.copy$default(value.AEQbTJ(), null, priceRangeFilter, null, null, 13, null);
        C29537kvX c29537kvXCopydefault = value.copydefault();
        mutableStateFlow.setValue(C29601kwi.copy$default(value, null, null, signalsFilterCopy$default, c29537kvXCopydefault.OLrzqt((2043 & 1) != 0 ? c29537kvXCopydefault.copydefault : false, (2043 & 2) != 0 ? c29537kvXCopydefault.AkhnZx : false, (2043 & 4) != 0 ? c29537kvXCopydefault.AEQbTJ : false, (2043 & 8) != 0 ? c29537kvXCopydefault.gEmmrt : false, (2043 & 16) != 0 ? c29537kvXCopydefault.KWHzl : false, (2043 & 32) != 0 ? c29537kvXCopydefault.valueOf : false, (2043 & 64) != 0 ? c29537kvXCopydefault.AYXKKw : false, (2043 & 128) != 0 ? c29537kvXCopydefault.djBIcL : false, (2043 & 256) != 0 ? c29537kvXCopydefault.AhwBna : z, (2043 & 512) != 0 ? c29537kvXCopydefault.OLrzqt : false, (2043 & 1024) != 0 ? c29537kvXCopydefault.EZpvd : false), 3, null));
    }

    public final void OLrzqt(@NotNull PriceRangeFilter priceRangeFilter, boolean z) {
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        C29601kwi value = this.copydefault.getValue();
        if (value == null) {
            return;
        }
        MutableStateFlow<C29601kwi> mutableStateFlow = this.copydefault;
        SignalsFilter signalsFilterCopy$default = SignalsFilter.copy$default(value.AEQbTJ(), null, null, priceRangeFilter, null, 11, null);
        C29537kvX c29537kvXCopydefault = value.copydefault();
        mutableStateFlow.setValue(C29601kwi.copy$default(value, null, null, signalsFilterCopy$default, c29537kvXCopydefault.OLrzqt((2043 & 1) != 0 ? c29537kvXCopydefault.copydefault : false, (2043 & 2) != 0 ? c29537kvXCopydefault.AkhnZx : false, (2043 & 4) != 0 ? c29537kvXCopydefault.AEQbTJ : false, (2043 & 8) != 0 ? c29537kvXCopydefault.gEmmrt : false, (2043 & 16) != 0 ? c29537kvXCopydefault.KWHzl : false, (2043 & 32) != 0 ? c29537kvXCopydefault.valueOf : false, (2043 & 64) != 0 ? c29537kvXCopydefault.AYXKKw : false, (2043 & 128) != 0 ? c29537kvXCopydefault.djBIcL : false, (2043 & 256) != 0 ? c29537kvXCopydefault.AhwBna : false, (2043 & 512) != 0 ? c29537kvXCopydefault.OLrzqt : z, (2043 & 1024) != 0 ? c29537kvXCopydefault.EZpvd : false), 3, null));
    }

    public final void copydefault(@NotNull PriceRangeFilter priceRangeFilter, boolean z) {
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        C29601kwi value = this.copydefault.getValue();
        if (value == null) {
            return;
        }
        MutableStateFlow<C29601kwi> mutableStateFlow = this.copydefault;
        SignalsFilter signalsFilterCopy$default = SignalsFilter.copy$default(value.AEQbTJ(), null, null, null, priceRangeFilter, 7, null);
        C29537kvX c29537kvXCopydefault = value.copydefault();
        mutableStateFlow.setValue(C29601kwi.copy$default(value, null, null, signalsFilterCopy$default, c29537kvXCopydefault.OLrzqt((2043 & 1) != 0 ? c29537kvXCopydefault.copydefault : false, (2043 & 2) != 0 ? c29537kvXCopydefault.AkhnZx : false, (2043 & 4) != 0 ? c29537kvXCopydefault.AEQbTJ : false, (2043 & 8) != 0 ? c29537kvXCopydefault.gEmmrt : false, (2043 & 16) != 0 ? c29537kvXCopydefault.KWHzl : false, (2043 & 32) != 0 ? c29537kvXCopydefault.valueOf : false, (2043 & 64) != 0 ? c29537kvXCopydefault.AYXKKw : false, (2043 & 128) != 0 ? c29537kvXCopydefault.djBIcL : false, (2043 & 256) != 0 ? c29537kvXCopydefault.AhwBna : false, (2043 & 512) != 0 ? c29537kvXCopydefault.OLrzqt : false, (2043 & 1024) != 0 ? c29537kvXCopydefault.EZpvd : z), 3, null));
    }

    public final void OLrzqt() {
        C29601kwi value;
        C29601kwi c29601kwiCopy$default;
        MutableStateFlow<C29601kwi> mutableStateFlow = this.copydefault;
        do {
            value = mutableStateFlow.getValue();
            C29601kwi c29601kwi = value;
            if (c29601kwi != null) {
                List<InterfaceC28823khz.ActionBar> listOLrzqt = c29601kwi.OLrzqt();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                Iterator<T> it = listOLrzqt.iterator();
                while (it.hasNext()) {
                    arrayList.add(InterfaceC28823khz.ActionBar.copy$default((InterfaceC28823khz.ActionBar) it.next(), null, null, null, true, 7, null));
                }
                c29601kwiCopy$default = C29601kwi.copy$default(c29601kwi, arrayList, null, null, null, 14, null);
            } else {
                c29601kwiCopy$default = null;
            }
        } while (!mutableStateFlow.compareAndSet(value, c29601kwiCopy$default));
    }

    public final void EZpvd() {
        C29601kwi value;
        C29601kwi c29601kwiCopy$default;
        MutableStateFlow<C29601kwi> mutableStateFlow = this.copydefault;
        do {
            value = mutableStateFlow.getValue();
            C29601kwi c29601kwi = value;
            if (c29601kwi != null) {
                List<InterfaceC28823khz.ActionBar> listOLrzqt = c29601kwi.OLrzqt();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                Iterator<T> it = listOLrzqt.iterator();
                while (it.hasNext()) {
                    arrayList.add(InterfaceC28823khz.ActionBar.copy$default((InterfaceC28823khz.ActionBar) it.next(), null, null, null, false, 7, null));
                }
                c29601kwiCopy$default = C29601kwi.copy$default(c29601kwi, arrayList, null, null, null, 14, null);
            } else {
                c29601kwiCopy$default = null;
            }
        } while (!mutableStateFlow.compareAndSet(value, c29601kwiCopy$default));
    }
}
