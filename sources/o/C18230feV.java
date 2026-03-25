package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.biz.net.bean.AddressCoinBalanceDetail;
import com.okinc.business.defi.biz.net.bean.AddressCoinPriceInfo;
import com.okinc.business.defi.biz.net.bean.AddressTokenAsset;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.feV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18230feV extends AbstractC59533zio<AddressTokenAsset, Activity> {
    public final Function1<AddressTokenAsset, Unit> KWHzl;
    public final Function2<AddressTokenAsset, android.view.View, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<AddressTokenAsset, Unit> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.biz.net.bean.AddressTokenAsset, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.business.defi.biz.net.bean.AddressTokenAsset, ? super android.view.View, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C18230feV(@NotNull Function1<? super AddressTokenAsset, Unit> function1, @NotNull Function2<? super AddressTokenAsset, ? super android.view.View, Unit> function2) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.KWHzl = function1;
        this.OLrzqt = function2;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Activity onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.setLocationManually, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return new Activity(this, viewInflate);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d6  */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(@NotNull Activity activity, @NotNull AddressTokenAsset addressTokenAsset) {
        java.lang.String strOLrzqt;
        java.lang.String address;
        java.lang.String price;
        java.lang.String priceChangePercent24h;
        int iCopydefault;
        java.lang.String strOLrzqt2;
        java.lang.String valuationFromAsset$default;
        AddressCoinBalanceDetail addressCoinBalanceDetail;
        AddressCoinBalanceDetail addressCoinBalanceDetail2;
        AddressCoinBalanceDetail addressCoinBalanceDetail3;
        AddressCoinBalanceDetail addressCoinBalanceDetail4;
        java.lang.Character chWlaJM;
        java.lang.String string;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(addressTokenAsset, "");
        java.lang.String imageUrl = addressTokenAsset.getImageUrl();
        java.lang.String name = addressTokenAsset.getName();
        if (name == null || (chWlaJM = C59454zhO.wlaJM(name)) == null || (string = chWlaJM.toString()) == null || (strOLrzqt = C9700baY.OLrzqt(string)) == null) {
            strOLrzqt = "";
        }
        java.lang.String str = (imageUrl == null || imageUrl.length() == 0) ? strOLrzqt : imageUrl;
        if (C9700baY.EZpvd(activity.itemView.getContext())) {
            C14725dqq.loadFixSizeBorderImage$default(activity.OLrzqt(), str, C52761wXj.TaskDescription.aHXSQp, 0.0f, 32.0f, 0, false, 52, null);
        }
        android.widget.TextView textViewEZpvd = activity.EZpvd();
        java.lang.String symbol = addressTokenAsset.getSymbol();
        java.lang.String str2 = "--";
        if (symbol == null) {
            symbol = "--";
        }
        textViewEZpvd.setText(symbol);
        android.widget.ImageView imageViewCopydefault = activity.copydefault();
        java.util.List<AddressCoinBalanceDetail> coinBalanceDetails = addressTokenAsset.getCoinBalanceDetails();
        if (coinBalanceDetails != null && (addressCoinBalanceDetail4 = (AddressCoinBalanceDetail) CollectionsKt___CollectionsKt.firstOrNull(coinBalanceDetails)) != null && addressCoinBalanceDetail4.isRiskyToken()) {
            imageViewCopydefault.setVisibility(0);
            imageViewCopydefault.setOnClickListener(new ActionBar(imageViewCopydefault, 1000L, this, addressTokenAsset, imageViewCopydefault));
        } else {
            imageViewCopydefault.setVisibility(8);
            imageViewCopydefault.setOnClickListener(null);
        }
        java.util.List<AddressCoinBalanceDetail> coinBalanceDetails2 = addressTokenAsset.getCoinBalanceDetails();
        AddressCoinPriceInfo coinPriceVo = (coinBalanceDetails2 == null || (addressCoinBalanceDetail3 = (AddressCoinBalanceDetail) CollectionsKt___CollectionsKt.firstOrNull(coinBalanceDetails2)) == null) ? null : addressCoinBalanceDetail3.getCoinPriceVo();
        java.util.List<AddressCoinBalanceDetail> coinBalanceDetails3 = addressTokenAsset.getCoinBalanceDetails();
        java.lang.Long lValueOf = (coinBalanceDetails3 == null || (addressCoinBalanceDetail2 = (AddressCoinBalanceDetail) CollectionsKt___CollectionsKt.firstOrNull(coinBalanceDetails3)) == null) ? null : java.lang.Long.valueOf(addressCoinBalanceDetail2.getChainIndex());
        C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
        java.util.List<AddressCoinBalanceDetail> coinBalanceDetails4 = addressTokenAsset.getCoinBalanceDetails();
        if (coinBalanceDetails4 == null || (addressCoinBalanceDetail = (AddressCoinBalanceDetail) CollectionsKt___CollectionsKt.firstOrNull(coinBalanceDetails4)) == null || (address = addressCoinBalanceDetail.getAddress()) == null) {
            address = "";
        }
        C10854bwM c10854bwMEZpvd = c10948byAValueOf.EZpvd(address, C33129mqd.valueOf(lValueOf));
        if (coinPriceVo == null || (price = coinPriceVo.getPrice()) == null) {
            price = "0";
        }
        java.lang.String coinPrice$default = C54872xYl.formatCoinPrice$default(C33129mqd.EZpvd(price), null, c10854bwMEZpvd != null ? c10854bwMEZpvd.getNewProxyInstance() : false, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, 21, null);
        if (coinPriceVo == null || (priceChangePercent24h = coinPriceVo.getPriceChangePercent24h()) == null) {
            priceChangePercent24h = "";
        }
        java.lang.String priceChangePercentage$default = C54873xYm.formatPriceChangePercentage$default(C33129mqd.copydefault(priceChangePercent24h), 0, 0, false, null, null, 31, null);
        if (C33129mqd.AEQbTJ(priceChangePercent24h, 0)) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = activity.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iCopydefault = C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
        } else if (C33129mqd.gEmmrt(priceChangePercent24h, 0)) {
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context2 = activity.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iCopydefault = C33512mxp.tradeFallDefault$default(c33512mxp2, context2, 0.0f, 2, null);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.QwvEab);
        }
        activity.KWHzl().setText(coinPrice$default);
        activity.KWHzl().setTextColor(iCopydefault);
        activity.djBIcL().setTextColor(iCopydefault);
        android.widget.TextView textViewDjBIcL = activity.djBIcL();
        if (priceChangePercentage$default.length() > 0) {
            priceChangePercentage$default = "(" + priceChangePercentage$default + ")";
        }
        textViewDjBIcL.setText(priceChangePercentage$default);
        android.widget.TextView textViewAhwBna = activity.AhwBna();
        java.lang.String coinAmount = addressTokenAsset.getCoinAmount();
        if (coinAmount == null) {
            strOLrzqt2 = "--";
        } else {
            strOLrzqt2 = C54870xYj.OLrzqt(coinAmount, (249 & 1) != 0 ? 0 : 0, c10854bwMEZpvd != null ? c10854bwMEZpvd.AkhnZx() : 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
            if (strOLrzqt2 == null) {
            }
        }
        textViewAhwBna.setText(strOLrzqt2);
        android.widget.TextView textViewAEQbTJ = activity.AEQbTJ();
        java.lang.String currencyAmount = addressTokenAsset.getCurrencyAmount();
        if (currencyAmount != null && (valuationFromAsset$default = C54880xYt.formatValuationFromAsset$default(currencyAmount, null, false, 0, false, 15, null)) != null) {
            str2 = valuationFromAsset$default;
        }
        textViewAEQbTJ.setText(str2);
        if (c10854bwMEZpvd != null && c10854bwMEZpvd.getNewProxyInstance()) {
            activity.djBIcL().setVisibility(8);
            activity.KWHzl().setVisibility(8);
        }
        android.view.View view = activity.itemView;
        view.setOnClickListener(new TaskDescription(view, 1000L, this, addressTokenAsset));
    }

    /* JADX INFO: renamed from: o.feV$Activity */
    public final class Activity extends RecyclerView.ViewHolder {
        public final android.widget.TextView AEQbTJ;
        public final android.widget.TextView AhwBna;
        public final android.widget.ImageView EZpvd;
        public final android.widget.ImageView KWHzl;
        public final /* synthetic */ C18230feV OLrzqt;
        public final android.widget.TextView copydefault;
        public final android.widget.TextView gEmmrt;
        public final android.widget.TextView valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView EZpvd() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.ImageView copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.widget.TextView djBIcL() {
            return this.AhwBna;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C18230feV c18230feV, android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.OLrzqt = c18230feV;
            android.view.View viewFindViewById = view.findViewById(C13754dXa.ActionBar.OtRJxF);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.EZpvd = (android.widget.ImageView) viewFindViewById;
            android.view.View viewFindViewById2 = view.findViewById(C13754dXa.ActionBar.addMenuProvider);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            this.gEmmrt = (android.widget.TextView) viewFindViewById2;
            android.view.View viewFindViewById3 = view.findViewById(C13754dXa.ActionBar.setMediaController);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            this.KWHzl = (android.widget.ImageView) viewFindViewById3;
            android.view.View viewFindViewById4 = view.findViewById(C13754dXa.ActionBar.addContentView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
            this.valueOf = (android.widget.TextView) viewFindViewById4;
            android.view.View viewFindViewById5 = view.findViewById(C13754dXa.ActionBar.onRequestPermissionsResult);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
            this.AhwBna = (android.widget.TextView) viewFindViewById5;
            android.view.View viewFindViewById6 = view.findViewById(C13754dXa.ActionBar.initViewTreeOwners);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
            this.AEQbTJ = (android.widget.TextView) viewFindViewById6;
            android.view.View viewFindViewById7 = view.findViewById(C13754dXa.ActionBar.lambdanew2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "");
            this.copydefault = (android.widget.TextView) viewFindViewById7;
        }
    }

    /* JADX INFO: renamed from: o.feV$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ AddressTokenAsset AEQbTJ;
        public final /* synthetic */ C18230feV EZpvd;
        public final /* synthetic */ android.widget.ImageView KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C18230feV c18230feV, AddressTokenAsset addressTokenAsset, android.widget.ImageView imageView) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = c18230feV;
            this.AEQbTJ = addressTokenAsset;
            this.KWHzl = imageView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.OLrzqt.invoke(this.AEQbTJ, this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.feV$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ AddressTokenAsset KWHzl;
        public final /* synthetic */ C18230feV OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C18230feV c18230feV, AddressTokenAsset addressTokenAsset) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = c18230feV;
            this.KWHzl = addressTokenAsset;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.copydefault().invoke(this.KWHzl);
            }
        }
    }
}
