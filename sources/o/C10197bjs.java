package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.assets.detail.biz.BaseItem;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web.WebActivity;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC8224ayh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10197bjs extends RecyclerView.ViewHolder {
    public final AbstractC16986euK KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10197bjs(@NotNull AbstractC16986euK abstractC16986euK) {
        super(abstractC16986euK.getRoot());
        Intrinsics.checkNotNullParameter(abstractC16986euK, "");
        this.KWHzl = abstractC16986euK;
    }

    public final void KWHzl(@NotNull final BaseItem.TaskDescription taskDescription, final TxIdOrHashHistoryDetail txIdOrHashHistoryDetail, final C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.KWHzl.AEQbTJ.setText(taskDescription.copydefault());
        this.KWHzl.OLrzqt.setText(taskDescription.EZpvd());
        this.KWHzl.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.bjt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C10197bjs.AEQbTJ(taskDescription, this, c10854bwM, txIdOrHashHistoryDetail, view);
            }
        });
    }

    public static final void AEQbTJ(BaseItem.TaskDescription taskDescription, C10197bjs c10197bjs, C10854bwM c10854bwM, TxIdOrHashHistoryDetail txIdOrHashHistoryDetail, android.view.View view) {
        java.lang.String okexUID;
        java.lang.String okexUID2;
        java.util.List listKWHzl;
        InterfaceC9774bbt interfaceC9774bbt;
        int iKWHzl = taskDescription.KWHzl();
        if (iKWHzl == 0) {
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", taskDescription.AEQbTJ()), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()), C56390yDp.OLrzqt(OtcExtraKeys.FLAG, java.lang.Boolean.TRUE), C56390yDp.OLrzqt("set_token", java.lang.Boolean.FALSE));
            WebActivity.TaskDescription taskDescription2 = WebActivity.Companion;
            android.content.Context context = c10197bjs.KWHzl.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            WebActivity.TaskDescription.openPage$default(taskDescription2, context, bundleBundleOf, null, 4, null);
            return;
        }
        if (iKWHzl != 1) {
            if (iKWHzl != 2 || (listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9774bbt.class))) == null || (interfaceC9774bbt = (InterfaceC9774bbt) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null) {
                return;
            }
            android.content.Context context2 = c10197bjs.KWHzl.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            interfaceC9774bbt.AEQbTJ(context2, java.lang.Long.valueOf(C33129mqd.valueOf(taskDescription.AEQbTJ())), c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.fetchVPNInfo()) : null);
            return;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (txIdOrHashHistoryDetail != null ? txIdOrHashHistoryDetail.getRecordId() : null))) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (txIdOrHashHistoryDetail != null ? txIdOrHashHistoryDetail.getOkexUID() : null)) && (((txIdOrHashHistoryDetail != null && txIdOrHashHistoryDetail.getTxType() == 8) || (txIdOrHashHistoryDetail != null && txIdOrHashHistoryDetail.getTxType() == 9)) && (okexUID2 = txIdOrHashHistoryDetail.getOkexUID()) != null && okexUID2.contentEquals(dZP.OLrzqt.EZpvd()))) {
                if (txIdOrHashHistoryDetail.getTxType() != 8 && txIdOrHashHistoryDetail.getTxType() == 9) {
                    InterfaceC8224ayh interfaceC8224ayh = (InterfaceC8224ayh) C43248rlh.KWHzl.AEQbTJ(InterfaceC8224ayh.class);
                    android.content.Context context3 = c10197bjs.KWHzl.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    java.lang.String recordId = txIdOrHashHistoryDetail.getRecordId();
                    java.lang.Integer currencyId = txIdOrHashHistoryDetail.getCurrencyId();
                    InterfaceC8224ayh.TaskDescription.goToDepositHistoryDetails$default(interfaceC8224ayh, context3, recordId, null, java.lang.String.valueOf(currencyId != null ? currencyId.intValue() : -1), null, null, 52, null);
                    return;
                }
                InterfaceC8224ayh interfaceC8224ayh2 = (InterfaceC8224ayh) C43248rlh.KWHzl.AEQbTJ(InterfaceC8224ayh.class);
                android.content.Context context4 = c10197bjs.KWHzl.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                InterfaceC8224ayh.TaskDescription.goToWithdrawHistoryDetails$default(interfaceC8224ayh2, context4, null, txIdOrHashHistoryDetail.getRecordId(), null, null, 26, null);
                return;
            }
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (txIdOrHashHistoryDetail != null ? txIdOrHashHistoryDetail.getExchangeUrl() : null))) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (txIdOrHashHistoryDetail != null ? txIdOrHashHistoryDetail.getOkexUID() : null)) && txIdOrHashHistoryDetail != null && txIdOrHashHistoryDetail.getTxType() == 10 && (okexUID = txIdOrHashHistoryDetail.getOkexUID()) != null && okexUID.contentEquals(dZP.OLrzqt.EZpvd())) {
                android.os.Bundle bundleBundleOf2 = BundleKt.bundleOf(C56390yDp.OLrzqt("url", txIdOrHashHistoryDetail.getExchangeUrl()), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
                WebActivity.TaskDescription taskDescription3 = WebActivity.Companion;
                android.content.Context context5 = c10197bjs.KWHzl.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                WebActivity.TaskDescription.openPage$default(taskDescription3, context5, bundleBundleOf2, null, 4, null);
            }
        }
    }
}
