package com.okinc.business.market.features.holders.ui.detail.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.features.holders.domain.model.HistoryStatistics;
import com.okinc.business.market.features.holders.domain.model.HolderDetailModel;
import com.okinc.business.market.features.holders.ui.detail.model.AccountDetail;
import com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel;
import com.okinc.business.market.widget.asset_card.AssetCardData;
import com.okinc.business.market.widget.asset_card.DexAssetContentBlock;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23271hvA;
import o.C23272hvB;
import o.C23274hvD;
import o.C23311hvo;
import o.C23313hvq;
import o.C25322iuY;
import o.C25351ivA;
import o.C25382ivf;
import o.C28012kLq;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C52761wXj;
import o.C56390yDp;
import o.C56402yEa;
import o.C56423yEv;
import o.kLY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class HolderDetailsUiModel implements Parcelable {
    public static final Parcelable.Creator<HolderDetailsUiModel> CREATOR = new Creator();
    public final HistoryStatistics AEQbTJ;
    public final HolderDetailModel EZpvd;
    public final String KWHzl;
    public final boolean OLrzqt;
    public final PnLDetailsUiModel copydefault;

    public static final class Creator implements Parcelable.Creator<HolderDetailsUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HolderDetailsUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HolderDetailsUiModel(HolderDetailModel.CREATOR.createFromParcel(parcel), PnLDetailsUiModel.CREATOR.createFromParcel(parcel), HistoryStatistics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HolderDetailsUiModel[] newArray(int i) {
            return new HolderDetailsUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HolderDetailsUiModel copy$default(HolderDetailsUiModel holderDetailsUiModel, HolderDetailModel holderDetailModel, PnLDetailsUiModel pnLDetailsUiModel, HistoryStatistics historyStatistics, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            holderDetailModel = holderDetailsUiModel.EZpvd;
        }
        if ((i & 2) != 0) {
            pnLDetailsUiModel = holderDetailsUiModel.copydefault;
        }
        PnLDetailsUiModel pnLDetailsUiModel2 = pnLDetailsUiModel;
        if ((i & 4) != 0) {
            historyStatistics = holderDetailsUiModel.AEQbTJ;
        }
        HistoryStatistics historyStatistics2 = historyStatistics;
        if ((i & 8) != 0) {
            z = holderDetailsUiModel.OLrzqt;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str = holderDetailsUiModel.KWHzl;
        }
        return holderDetailsUiModel.copydefault(holderDetailModel, pnLDetailsUiModel2, historyStatistics2, z2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryStatistics AYXKKw() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderDetailModel OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderDetailsUiModel copydefault(@NotNull HolderDetailModel holderDetailModel, @NotNull PnLDetailsUiModel pnLDetailsUiModel, @NotNull HistoryStatistics historyStatistics, boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(holderDetailModel, "");
        Intrinsics.checkNotNullParameter(pnLDetailsUiModel, "");
        Intrinsics.checkNotNullParameter(historyStatistics, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new HolderDetailsUiModel(holderDetailModel, pnLDetailsUiModel, historyStatistics, z, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HolderDetailsUiModel)) {
            return false;
        }
        HolderDetailsUiModel holderDetailsUiModel = (HolderDetailsUiModel) obj;
        return Intrinsics.EZpvd(this.EZpvd, holderDetailsUiModel.EZpvd) && Intrinsics.EZpvd(this.copydefault, holderDetailsUiModel.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, holderDetailsUiModel.AEQbTJ) && this.OLrzqt == holderDetailsUiModel.OLrzqt && Intrinsics.EZpvd((Object) this.KWHzl, (Object) holderDetailsUiModel.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.EZpvd.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HolderDetailsUiModel(holder=" + this.EZpvd + ", pnLDetails=" + this.copydefault + ", statistics=" + this.AEQbTJ + ", isDisplayToken=" + this.OLrzqt + ", nativeTokenSymbol=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.EZpvd.writeToParcel(parcel, i);
        this.copydefault.writeToParcel(parcel, i);
        this.AEQbTJ.writeToParcel(parcel, i);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        parcel.writeString(this.KWHzl);
    }

    public HolderDetailsUiModel(@NotNull HolderDetailModel holderDetailModel, @NotNull PnLDetailsUiModel pnLDetailsUiModel, @NotNull HistoryStatistics historyStatistics, boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(holderDetailModel, "");
        Intrinsics.checkNotNullParameter(pnLDetailsUiModel, "");
        Intrinsics.checkNotNullParameter(historyStatistics, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = holderDetailModel;
        this.copydefault = pnLDetailsUiModel;
        this.AEQbTJ = historyStatistics;
        this.OLrzqt = z;
        this.KWHzl = str;
    }

    public static /* synthetic */ List toAssertCardData$default(HolderDetailsUiModel holderDetailsUiModel, boolean z, String str, AccountDetail accountDetail, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return holderDetailsUiModel.OLrzqt(z, str, accountDetail);
    }

    public final List<AssetCardData> OLrzqt(boolean z, @NotNull String str, @NotNull AccountDetail accountDetail) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(accountDetail, "");
        List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(valueOf());
        listOLrzqt.add(AhwBna());
        listOLrzqt.add(EZpvd());
        listOLrzqt.add(gEmmrt());
        listOLrzqt.add(AEQbTJ());
        listOLrzqt.add(KWHzl());
        if (accountDetail == AccountDetail.HOLDER_DETAIL) {
            if (z) {
                listOLrzqt.add(copydefault());
            }
            listOLrzqt.add(OLrzqt(str));
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final AssetCardData AhwBna() {
        int iIntValue = C25351ivA.KWHzl.KWHzl(this.copydefault.EZpvd()).component2().intValue();
        String strOLrzqt = kLY.OLrzqt(this.OLrzqt, this.copydefault.EZpvd(), this.EZpvd.DbNXlk(), this.KWHzl);
        DexAssetContentBlock.Text text = new DexAssetContentBlock.Text(C33070mpX.AYXKKw(C23274hvD.Fragment.OmPrLP), C52761wXj.LoaderManager.QOLQEE, C52761wXj.Activity.QwvEab);
        DexAssetContentBlock.Text text2 = new DexAssetContentBlock.Text(strOLrzqt, C52761wXj.LoaderManager.gHZMYf, iIntValue);
        String strGEmmrt = this.copydefault.gEmmrt();
        String percentage$default = C33129mqd.OLrzqt((CharSequence) strGEmmrt) ? kLY.formatPercentage$default(strGEmmrt, DisplaySign.EXCEPT_ZERO, false, null, null, 14, null) : "";
        if (percentage$default == null || percentage$default.length() == 0 || StringsKt__StringsKt.fARcdN((CharSequence) percentage$default)) {
            percentage$default = "--";
        }
        return C28012kLq.OLrzqt(text, text2, new DexAssetContentBlock.Text(percentage$default, C52761wXj.LoaderManager.QOLQEE, iIntValue));
    }

    public final AssetCardData valueOf() {
        int iIntValue = C25351ivA.KWHzl.KWHzl(this.copydefault.AkhnZx()).component2().intValue();
        String strOLrzqt = kLY.OLrzqt(this.OLrzqt, this.copydefault.AkhnZx(), this.EZpvd.DbNXlk(), this.KWHzl);
        DexAssetContentBlock.Text text = new DexAssetContentBlock.Text(C33070mpX.AYXKKw(C23274hvD.Fragment.RYPzIz), C52761wXj.LoaderManager.QOLQEE, C52761wXj.Activity.QwvEab);
        DexAssetContentBlock.Text text2 = new DexAssetContentBlock.Text(strOLrzqt, C52761wXj.LoaderManager.gHZMYf, iIntValue);
        String strIsConnected = this.copydefault.isConnected();
        String percentage$default = C33129mqd.OLrzqt((CharSequence) strIsConnected) ? kLY.formatPercentage$default(strIsConnected, DisplaySign.EXCEPT_ZERO, false, null, null, 14, null) : "";
        if (percentage$default == null || percentage$default.length() == 0 || StringsKt__StringsKt.fARcdN((CharSequence) percentage$default)) {
            percentage$default = "--";
        }
        return C28012kLq.OLrzqt(text, text2, new DexAssetContentBlock.Text(percentage$default, C52761wXj.LoaderManager.QOLQEE, iIntValue));
    }

    public final AssetCardData EZpvd() {
        DexAssetContentBlock.Text text = new DexAssetContentBlock.Text(C33070mpX.AYXKKw(C23274hvD.Fragment.addOnMultiWindowModeChangedListener), C52761wXj.LoaderManager.QOLQEE, C52761wXj.Activity.QwvEab);
        TxType txType = TxType.SELL;
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        String strAhwBna = this.AEQbTJ.AhwBna();
        RoundingMode roundingMode = RoundingMode.DOWN;
        return C28012kLq.OLrzqt(text, new DexAssetContentBlock.Trade(TxType.BUY, C23272hvB.formatScientificCurrency$default(c23272hvB, this.AEQbTJ.OLrzqt(), true, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null), C52761wXj.Activity.fdOvFl), new DexAssetContentBlock.Trade(txType, C23272hvB.formatScientificCurrency$default(c23272hvB, strAhwBna, true, roundingMode, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null), C52761wXj.Activity.fdOvFl));
    }

    public final AssetCardData gEmmrt() {
        DexAssetContentBlock.Text text = new DexAssetContentBlock.Text(C33070mpX.AYXKKw(C23274hvD.Fragment.onLaunch), C52761wXj.LoaderManager.QOLQEE, C52761wXj.Activity.QwvEab);
        TxType txType = TxType.SELL;
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        return C28012kLq.OLrzqt(text, new DexAssetContentBlock.Trade(TxType.BUY, C23272hvB.getFormattedLocalCurrencyInICU$default(c23272hvB, this.AEQbTJ.KWHzl(), null, null, false, 14, null), C52761wXj.Activity.fdOvFl), new DexAssetContentBlock.Trade(txType, C23272hvB.getFormattedLocalCurrencyInICU$default(c23272hvB, this.AEQbTJ.djBIcL(), null, null, false, 14, null), C52761wXj.Activity.fdOvFl));
    }

    public final AssetCardData AEQbTJ() {
        DexAssetContentBlock.Text text = new DexAssetContentBlock.Text(C33070mpX.AYXKKw(C23274hvD.Fragment.getActivityResultRegistry), C52761wXj.LoaderManager.QOLQEE, C52761wXj.Activity.QwvEab);
        String strCopydefault = "--";
        DexAssetContentBlock.Text text2 = new DexAssetContentBlock.Text((this.EZpvd.djBIcL().length() <= 0 || !C33129mqd.AEQbTJ(this.EZpvd.djBIcL(), "0")) ? "--" : C25322iuY.OLrzqt.EZpvd(C23313hvq.mulCheckS$default(this.EZpvd.djBIcL(), 1000, null, null, null, 14, null)), C52761wXj.LoaderManager.gHZMYf, C52761wXj.Activity.fdOvFl);
        if (this.EZpvd.djBIcL().length() > 0 && C33129mqd.AEQbTJ(this.EZpvd.djBIcL(), "0")) {
            strCopydefault = C25322iuY.OLrzqt.copydefault(C23313hvq.mulCheckS$default(this.EZpvd.djBIcL(), 1000, null, null, null, 14, null));
        }
        return C28012kLq.OLrzqt(text, text2, new DexAssetContentBlock.Text(strCopydefault, C52761wXj.LoaderManager.QOLQEE, C52761wXj.Activity.DCUTEIddSDPG));
    }

    public final AssetCardData copydefault() {
        return C28012kLq.OLrzqt(new DexAssetContentBlock.Text(C33070mpX.AYXKKw(C23274hvD.Fragment.hQkvHM), C52761wXj.LoaderManager.QOLQEE, C52761wXj.Activity.QwvEab), new DexAssetContentBlock.Text(C25351ivA.KWHzl.KWHzl(this.EZpvd.values()).component1() + C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, C23311hvo.copydefault(this.EZpvd.values()), true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null), C52761wXj.LoaderManager.gHZMYf, C52761wXj.Activity.fdOvFl), new DexAssetContentBlock.Text(C23271hvA.formatTokenCode$default(C23271hvA.copydefault, this.EZpvd.AkhnZx(), true, null, false, null, null, 30, null), C52761wXj.LoaderManager.QOLQEE, C52761wXj.Activity.DCUTEIddSDPG));
    }

    public final AssetCardData KWHzl() {
        String str;
        boolean z = this.AEQbTJ.copydefault().length() == 0 && this.AEQbTJ.gEmmrt().length() == 0;
        DexAssetContentBlock.Text text = new DexAssetContentBlock.Text(C33070mpX.AYXKKw(C23274hvD.Fragment.onBackPressed), C52761wXj.LoaderManager.QOLQEE, C52761wXj.Activity.QwvEab);
        if (z) {
            str = "--";
        } else {
            C23271hvA c23271hvA = C23271hvA.copydefault;
            str = C23271hvA.formatTokenCode$default(c23271hvA, this.AEQbTJ.copydefault(), true, null, false, null, null, 30, null) + " / " + C23271hvA.formatTokenCode$default(c23271hvA, this.AEQbTJ.gEmmrt(), true, null, false, null, null, 30, null);
        }
        return C28012kLq.OLrzqt(text, new DexAssetContentBlock.Text(str, C52761wXj.LoaderManager.gHZMYf, C52761wXj.Activity.fdOvFl), new DexAssetContentBlock.ProgressBar(C33129mqd.djBIcL(this.AEQbTJ.copydefault()), C33129mqd.djBIcL(this.AEQbTJ.gEmmrt()), C25382ivf.KWHzl(C52761wXj.ActionBar.OBJEWx)));
    }

    public final AssetCardData OLrzqt(String str) {
        DexAssetContentBlock.Text text = new DexAssetContentBlock.Text(C33069mpW.copydefault(C23274hvD.Fragment.addOnNewIntentListener, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", str))), C52761wXj.LoaderManager.QOLQEE, C52761wXj.Activity.QwvEab);
        String strEZpvd = "--";
        DexAssetContentBlock.Text text2 = new DexAssetContentBlock.Text(this.EZpvd.isConnected().length() == 0 ? "--" : C23271hvA.formatTokenCode$default(C23271hvA.copydefault, this.EZpvd.isConnected(), true, null, false, null, null, 30, null), C52761wXj.LoaderManager.gHZMYf, C52761wXj.Activity.fdOvFl);
        if (this.EZpvd.AhwBna().length() > 0 && C33129mqd.AEQbTJ(this.EZpvd.AhwBna(), "0")) {
            strEZpvd = C25322iuY.OLrzqt.EZpvd(this.EZpvd.AhwBna());
        }
        return C28012kLq.OLrzqt(text, text2, new DexAssetContentBlock.Text(strEZpvd, C52761wXj.LoaderManager.QOLQEE, C52761wXj.Activity.DCUTEIddSDPG));
    }
}
