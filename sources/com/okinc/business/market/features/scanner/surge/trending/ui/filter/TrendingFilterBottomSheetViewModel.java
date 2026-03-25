package com.okinc.business.market.features.scanner.surge.trending.ui.filter;

import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModel;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import com.okinc.business.market.features.scanner.surge.trending.domain.model.TrendingProtocolUiModel;
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
import o.C29259kqK;
import o.C29264kqP;
import o.C56403yEb;
import o.C59443zhD;
import o.InterfaceC28823khz;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TrendingFilterBottomSheetViewModel extends ViewModel {
    public final StateFlow<C29264kqP> AEQbTJ;
    public TrendingFilterBottomSheetParams OLrzqt = new TrendingFilterBottomSheetParams(null, null, null, null, null, null, null, 127, null);
    public final MutableStateFlow<C29264kqP> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C29264kqP> EZpvd() {
        return this.AEQbTJ;
    }

    @yCM
    public TrendingFilterBottomSheetViewModel() {
        MutableStateFlow<C29264kqP> MutableStateFlow = StateFlowKt.MutableStateFlow(new C29264kqP(null, null, null, null, null, 31, null));
        this.copydefault = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final void AEQbTJ(@NotNull TrendingFilterBottomSheetParams trendingFilterBottomSheetParams) {
        Intrinsics.checkNotNullParameter(trendingFilterBottomSheetParams, "");
        this.OLrzqt = trendingFilterBottomSheetParams;
        MutableStateFlow<C29264kqP> mutableStateFlow = this.copydefault;
        C29264kqP value = mutableStateFlow.getValue();
        List<TrendingProtocolUiModel> listOLrzqt = trendingFilterBottomSheetParams.OLrzqt();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (TrendingProtocolUiModel trendingProtocolUiModel : listOLrzqt) {
            arrayList.add(new InterfaceC28823khz.ActionBar(trendingProtocolUiModel.EZpvd(), trendingProtocolUiModel.KWHzl(), trendingProtocolUiModel.copydefault(), trendingProtocolUiModel.AEQbTJ()));
        }
        mutableStateFlow.setValue(C29264kqP.copy$default(value, arrayList, trendingFilterBottomSheetParams.AEQbTJ(), null, trendingFilterBottomSheetParams.copydefault(), trendingFilterBottomSheetParams.KWHzl(), 4, null));
    }

    public final boolean EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<C29264kqP> mutableStateFlow = this.copydefault;
        C29264kqP value = mutableStateFlow.getValue();
        List<InterfaceC28823khz.ActionBar> listAEQbTJ = this.copydefault.getValue().AEQbTJ();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        boolean z = true;
        for (InterfaceC28823khz.ActionBar actionBarCopy$default : listAEQbTJ) {
            if (Intrinsics.EZpvd((Object) actionBarCopy$default.OLrzqt(), (Object) str)) {
                z = !actionBarCopy$default.EZpvd();
                actionBarCopy$default = InterfaceC28823khz.ActionBar.copy$default(actionBarCopy$default, null, null, null, z, 7, null);
            }
            arrayList.add(actionBarCopy$default);
        }
        mutableStateFlow.setValue(C29264kqP.copy$default(value, arrayList, null, null, null, null, 30, null));
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@NotNull String str, @NotNull String str2) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        TrendingFilter trendingFilterEZpvd = this.copydefault.getValue().EZpvd();
        C29259kqK c29259kqKCopydefault = this.copydefault.getValue().copydefault();
        if ((!StringsKt__StringsKt.fARcdN((CharSequence) str)) && (!StringsKt__StringsKt.fARcdN((CharSequence) str2))) {
            Double dAuCTel = C59443zhD.AuCTel(str);
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dAuCTel != null ? dAuCTel.doubleValue() : 0.0d;
            Double dAuCTel2 = C59443zhD.AuCTel(str2);
            if (dAuCTel2 != null) {
                dDoubleValue = dAuCTel2.doubleValue();
            }
            if (dDoubleValue2 >= dDoubleValue) {
                z = false;
            }
        } else {
            z = true;
        }
        MutableStateFlow<C29264kqP> mutableStateFlow = this.copydefault;
        mutableStateFlow.setValue(C29264kqP.copy$default(mutableStateFlow.getValue(), null, trendingFilterEZpvd.copydefault((TypedValues.PositionType.TYPE_CURVE_FIT & 1) != 0 ? trendingFilterEZpvd.OLrzqt : str, (TypedValues.PositionType.TYPE_CURVE_FIT & 2) != 0 ? trendingFilterEZpvd.AEQbTJ : str2, (TypedValues.PositionType.TYPE_CURVE_FIT & 4) != 0 ? trendingFilterEZpvd.gEmmrt : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 8) != 0 ? trendingFilterEZpvd.djBIcL : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 16) != 0 ? trendingFilterEZpvd.AhwBna : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 32) != 0 ? trendingFilterEZpvd.KWHzl : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 64) != 0 ? trendingFilterEZpvd.AYXKKw : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 128) != 0 ? trendingFilterEZpvd.EZpvd : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 256) != 0 ? trendingFilterEZpvd.copydefault : false), C29259kqK.copy$default(c29259kqKCopydefault, z, false, false, 6, null), null, null, 25, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(@NotNull String str, @NotNull String str2) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        TrendingFilter trendingFilterEZpvd = this.copydefault.getValue().EZpvd();
        C29259kqK c29259kqKCopydefault = this.copydefault.getValue().copydefault();
        if ((!StringsKt__StringsKt.fARcdN((CharSequence) str)) && (!StringsKt__StringsKt.fARcdN((CharSequence) str2))) {
            Double dAuCTel = C59443zhD.AuCTel(str);
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dAuCTel != null ? dAuCTel.doubleValue() : 0.0d;
            Double dAuCTel2 = C59443zhD.AuCTel(str2);
            if (dAuCTel2 != null) {
                dDoubleValue = dAuCTel2.doubleValue();
            }
            if (dDoubleValue2 >= dDoubleValue) {
                z = false;
            }
        } else {
            z = true;
        }
        MutableStateFlow<C29264kqP> mutableStateFlow = this.copydefault;
        mutableStateFlow.setValue(C29264kqP.copy$default(mutableStateFlow.getValue(), null, trendingFilterEZpvd.copydefault((TypedValues.PositionType.TYPE_CURVE_FIT & 1) != 0 ? trendingFilterEZpvd.OLrzqt : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 2) != 0 ? trendingFilterEZpvd.AEQbTJ : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 4) != 0 ? trendingFilterEZpvd.gEmmrt : str, (TypedValues.PositionType.TYPE_CURVE_FIT & 8) != 0 ? trendingFilterEZpvd.djBIcL : str2, (TypedValues.PositionType.TYPE_CURVE_FIT & 16) != 0 ? trendingFilterEZpvd.AhwBna : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 32) != 0 ? trendingFilterEZpvd.KWHzl : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 64) != 0 ? trendingFilterEZpvd.AYXKKw : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 128) != 0 ? trendingFilterEZpvd.EZpvd : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 256) != 0 ? trendingFilterEZpvd.copydefault : false), C29259kqK.copy$default(c29259kqKCopydefault, false, z, false, 5, null), null, null, 25, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(@NotNull String str, @NotNull String str2, @NotNull TokenAgeType tokenAgeType) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tokenAgeType, "");
        TrendingFilter trendingFilterEZpvd = this.copydefault.getValue().EZpvd();
        C29259kqK c29259kqKCopydefault = this.copydefault.getValue().copydefault();
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
        MutableStateFlow<C29264kqP> mutableStateFlow = this.copydefault;
        mutableStateFlow.setValue(C29264kqP.copy$default(mutableStateFlow.getValue(), null, trendingFilterEZpvd.copydefault((TypedValues.PositionType.TYPE_CURVE_FIT & 1) != 0 ? trendingFilterEZpvd.OLrzqt : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 2) != 0 ? trendingFilterEZpvd.AEQbTJ : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 4) != 0 ? trendingFilterEZpvd.gEmmrt : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 8) != 0 ? trendingFilterEZpvd.djBIcL : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 16) != 0 ? trendingFilterEZpvd.AhwBna : str, (TypedValues.PositionType.TYPE_CURVE_FIT & 32) != 0 ? trendingFilterEZpvd.KWHzl : str2, (TypedValues.PositionType.TYPE_CURVE_FIT & 64) != 0 ? trendingFilterEZpvd.AYXKKw : tokenAgeType, (TypedValues.PositionType.TYPE_CURVE_FIT & 128) != 0 ? trendingFilterEZpvd.EZpvd : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 256) != 0 ? trendingFilterEZpvd.copydefault : false), C29259kqK.copy$default(c29259kqKCopydefault, false, false, z, 3, null), null, null, 25, null));
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TrendingFilter trendingFilterEZpvd = this.copydefault.getValue().EZpvd();
        MutableStateFlow<C29264kqP> mutableStateFlow = this.copydefault;
        mutableStateFlow.setValue(C29264kqP.copy$default(mutableStateFlow.getValue(), null, trendingFilterEZpvd.copydefault((TypedValues.PositionType.TYPE_CURVE_FIT & 1) != 0 ? trendingFilterEZpvd.OLrzqt : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 2) != 0 ? trendingFilterEZpvd.AEQbTJ : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 4) != 0 ? trendingFilterEZpvd.gEmmrt : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 8) != 0 ? trendingFilterEZpvd.djBIcL : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 16) != 0 ? trendingFilterEZpvd.AhwBna : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 32) != 0 ? trendingFilterEZpvd.KWHzl : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 64) != 0 ? trendingFilterEZpvd.AYXKKw : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 128) != 0 ? trendingFilterEZpvd.EZpvd : str, (TypedValues.PositionType.TYPE_CURVE_FIT & 256) != 0 ? trendingFilterEZpvd.copydefault : false), null, null, null, 29, null));
    }

    public final void EZpvd(boolean z) {
        TrendingFilter trendingFilterEZpvd = this.copydefault.getValue().EZpvd();
        MutableStateFlow<C29264kqP> mutableStateFlow = this.copydefault;
        mutableStateFlow.setValue(C29264kqP.copy$default(mutableStateFlow.getValue(), null, trendingFilterEZpvd.copydefault((TypedValues.PositionType.TYPE_CURVE_FIT & 1) != 0 ? trendingFilterEZpvd.OLrzqt : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 2) != 0 ? trendingFilterEZpvd.AEQbTJ : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 4) != 0 ? trendingFilterEZpvd.gEmmrt : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 8) != 0 ? trendingFilterEZpvd.djBIcL : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 16) != 0 ? trendingFilterEZpvd.AhwBna : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 32) != 0 ? trendingFilterEZpvd.KWHzl : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 64) != 0 ? trendingFilterEZpvd.AYXKKw : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 128) != 0 ? trendingFilterEZpvd.EZpvd : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 256) != 0 ? trendingFilterEZpvd.copydefault : z), null, null, null, 29, null));
    }

    public final void KWHzl() {
        C29264kqP value;
        C29264kqP c29264kqP;
        ArrayList arrayList;
        MutableStateFlow<C29264kqP> mutableStateFlow = this.copydefault;
        do {
            value = mutableStateFlow.getValue();
            c29264kqP = value;
            List<InterfaceC28823khz.ActionBar> listAEQbTJ = c29264kqP.AEQbTJ();
            arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                arrayList.add(InterfaceC28823khz.ActionBar.copy$default((InterfaceC28823khz.ActionBar) it.next(), null, null, null, true, 7, null));
            }
        } while (!mutableStateFlow.compareAndSet(value, C29264kqP.copy$default(c29264kqP, arrayList, null, null, null, null, 30, null)));
    }

    public final void AEQbTJ() {
        C29264kqP value;
        C29264kqP c29264kqP;
        ArrayList arrayList;
        MutableStateFlow<C29264kqP> mutableStateFlow = this.copydefault;
        do {
            value = mutableStateFlow.getValue();
            c29264kqP = value;
            List<InterfaceC28823khz.ActionBar> listAEQbTJ = c29264kqP.AEQbTJ();
            arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                arrayList.add(InterfaceC28823khz.ActionBar.copy$default((InterfaceC28823khz.ActionBar) it.next(), null, null, null, false, 7, null));
            }
        } while (!mutableStateFlow.compareAndSet(value, C29264kqP.copy$default(c29264kqP, arrayList, null, null, null, null, 30, null)));
    }

    public final void AEQbTJ(@NotNull String str) {
        C29264kqP value;
        Intrinsics.checkNotNullParameter(str, "");
        MutableStateFlow<C29264kqP> mutableStateFlow = this.copydefault;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C29264kqP.copy$default(value, null, null, null, null, str, 15, null)));
    }
}
