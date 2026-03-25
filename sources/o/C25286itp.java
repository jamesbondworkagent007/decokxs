package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.collection.ArrayMapKt;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.main.swap.trade.bean.EditTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.main.swap.trade.input.bean.DexTradeGroupInputData;
import com.okinc.business.dexlogic.main.swap.trade.input.bean.DexTradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.input.bean.HorizontalLabelData;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.itp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25286itp {
    public final java.lang.String AEQbTJ;

    public C25286itp(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    public final void AEQbTJ(C24795ika c24795ika, @NotNull AbstractC23101hrq abstractC23101hrq) {
        DexTradeGroupInputData dexTradeGroupInputDataCopydefault;
        DexTradeInputData fromData;
        HorizontalLabelData horizontalLabelData;
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        if (c24795ika == null || (dexTradeGroupInputDataCopydefault = c24795ika.copydefault()) == null || (fromData = dexTradeGroupInputDataCopydefault.getFromData()) == null || (horizontalLabelData = fromData.getHorizontalLabelData()) == null) {
            return;
        }
        java.lang.String data = horizontalLabelData.getAvailableAmountNum().getData();
        abstractC23101hrq.isConnected(false);
        InterfaceC9738bbJ interfaceC9738bbJValueOf = C22380heK.OLrzqt.copydefault(this.AEQbTJ).fARcdN().valueOf();
        boolean fieldNames = interfaceC9738bbJValueOf != null ? interfaceC9738bbJValueOf.getFieldNames() : false;
        if (abstractC23101hrq.QUSxYX().isConnected() && !fieldNames) {
            abstractC23101hrq.RJOkX().KWHzl(data);
        } else {
            c24795ika.setShowContent(C23311hvo.OLrzqt(data, "12"));
            copydefault(abstractC23101hrq, data, c24795ika);
        }
    }

    public static /* synthetic */ void subGasForFromContent$default(C25286itp c25286itp, android.app.Activity activity, AbstractC23101hrq abstractC23101hrq, C24795ika c24795ika, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str = "";
        }
        c25286itp.OLrzqt(activity, abstractC23101hrq, c24795ika, str);
    }

    public final void OLrzqt(android.app.Activity activity, @NotNull AbstractC23101hrq abstractC23101hrq, @NotNull final C24795ika c24795ika, @NotNull java.lang.String str) {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault;
        java.lang.String originContractAddress;
        java.lang.String chainId;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(c24795ika, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String amountNum = c24795ika.copydefault().getFromData().getHorizontalLabelData().getAmountNum();
        abstractC23101hrq.isConnected(false);
        java.lang.String strSubCheckS$default = C23313hvq.subCheckS$default(amountNum, str, java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
        if (C23313hvq.OLrzqt(strSubCheckS$default, 0)) {
            if (!C23317hvu.values()) {
                copydefault(activity, abstractC23101hrq, true);
            }
            c24795ika.setShowContent(C23311hvo.OLrzqt(strSubCheckS$default, "12"));
            abstractC23101hrq.copydefault(new Function1() { // from class: o.itr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C25286itp.KWHzl(c24795ika, (InterfaceC9738bbJ) obj);
                }
            });
            str2 = strSubCheckS$default;
        } else if (C23313hvq.KWHzl(strSubCheckS$default, 0)) {
            if (!C23317hvu.isConnected()) {
                copydefault(activity, abstractC23101hrq, true);
            }
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault2 = abstractC23101hrq.QUSxYX().copydefault();
            if ((dexMultiTokenInfoBeanCopydefault2 != null && dexMultiTokenInfoBeanCopydefault2.isMainChainCoin()) || (dexMultiTokenInfoBeanCopydefault = abstractC23101hrq.QUSxYX().copydefault()) == null || (originContractAddress = dexMultiTokenInfoBeanCopydefault.getOriginContractAddress()) == null) {
                originContractAddress = "";
            }
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault3 = abstractC23101hrq.QUSxYX().copydefault();
            boolean zCopydefault = C22380heK.OLrzqt.copydefault(this.AEQbTJ).fARcdN().copydefault(originContractAddress, (dexMultiTokenInfoBeanCopydefault3 == null || (chainId = dexMultiTokenInfoBeanCopydefault3.getChainId()) == null) ? 0L : C33129mqd.valueOf(chainId));
            c24795ika.setReverseTipVisibility(0);
            c24795ika.setAddFundVisibility(zCopydefault ? 0 : 8);
            c24795ika.setMaxActionVisibility(8);
            c24795ika.setShowContent("");
        } else {
            str2 = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        copydefault(abstractC23101hrq, str2, c24795ika);
    }

    public static final Unit KWHzl(C24795ika c24795ika, InterfaceC9738bbJ interfaceC9738bbJ) {
        c24795ika.setReverseTipVisibility((interfaceC9738bbJ == null || interfaceC9738bbJ.getFieldNames()) ? 8 : 0);
        return Unit.INSTANCE;
    }

    public final Unit copydefault(AbstractC23101hrq abstractC23101hrq, java.lang.String str, C24795ika c24795ika) {
        C24800ikf c24800ikf;
        TradeInputGroup data;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data2;
        EditTextData editData;
        ConsumeData<TradeInputGroup> value = abstractC23101hrq.dmfpNf().getValue();
        if (C23313hvq.AhwBna((value == null || (data = value.getData()) == null || (fromData = data.getFromData()) == null || (data2 = fromData.getData()) == null || (editData = data2.getEditData()) == null) ? null : editData.getData(), str) || C23313hvq.copydefault(str, "")) {
            abstractC23101hrq.OLrzqt(c24795ika.AhwBna(), str);
        }
        hGZ hgzEZpvd = c24795ika.EZpvd();
        if (hgzEZpvd == null || (c24800ikf = hgzEZpvd.copydefault) == null) {
            return null;
        }
        c24800ikf.setCheckData(str);
        return Unit.INSTANCE;
    }

    public final void EZpvd(android.widget.TextView textView, android.widget.CheckBox checkBox, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, AbstractC23101hrq abstractC23101hrq) {
        java.lang.String tokenSymbol;
        if (z) {
            textView.setText(C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.viewModelsdefault, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("gasValue", str), C56390yDp.OLrzqt("symbol", str2), C56390yDp.OLrzqt("value", C23271hvA.getShowData$default(C23271hvA.copydefault, str3, false, null, false, false, 30, null)), C56390yDp.OLrzqt("symbol", str2))));
        } else {
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = C56390yDp.OLrzqt("value", str);
            DexMultiTokenInfoBean value = abstractC23101hrq.zLjUOn().KWHzl().getValue();
            if (value == null || (tokenSymbol = value.getTokenSymbol()) == null) {
                tokenSymbol = "";
            }
            pairArr[1] = C56390yDp.OLrzqt("symbol", tokenSymbol);
            textView.setText(C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.IResultReceiver2Stub, ArrayMapKt.arrayMapOf(pairArr)));
        }
        checkBox.setChecked(C23317hvu.isConnected());
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.itx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z2) {
                C25286itp.KWHzl(compoundButton, z2);
            }
        });
    }

    public static final void KWHzl(android.widget.CompoundButton compoundButton, boolean z) {
        C23317hvu.gEmmrt(z);
    }

    public final void OLrzqt(android.widget.TextView textView, android.widget.CheckBox checkBox, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, AbstractC23101hrq abstractC23101hrq) {
        java.lang.String tokenSymbol;
        if (z) {
            textView.setText(C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.ONJgbh, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("value", str), C56390yDp.OLrzqt("symbol", str2), C56390yDp.OLrzqt("unablevalue", C23271hvA.getShowData$default(C23271hvA.copydefault, str3, false, RoundingMode.DOWN, false, false, 26, null)), C56390yDp.OLrzqt("symbol", str2))));
        } else {
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = C56390yDp.OLrzqt("value", str);
            DexMultiTokenInfoBean value = abstractC23101hrq.zLjUOn().KWHzl().getValue();
            if (value == null || (tokenSymbol = value.getTokenSymbol()) == null) {
                tokenSymbol = "";
            }
            pairArr[1] = C56390yDp.OLrzqt("tokenSymbol", tokenSymbol);
            textView.setText(C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.requestExtraBinder, ArrayMapKt.arrayMapOf(pairArr)));
        }
        checkBox.setChecked(C23317hvu.values());
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.itt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z2) {
                C25286itp.OLrzqt(compoundButton, z2);
            }
        });
    }

    public static final void OLrzqt(android.widget.CompoundButton compoundButton, boolean z) {
        C23317hvu.AkhnZx(z);
    }

    public static /* synthetic */ void showReverseTipDialog$default(C25286itp c25286itp, android.app.Activity activity, AbstractC23101hrq abstractC23101hrq, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c25286itp.copydefault(activity, abstractC23101hrq, z);
    }

    public final void copydefault(android.app.Activity activity, @NotNull AbstractC23101hrq abstractC23101hrq, boolean z) {
        java.lang.String tokenSymbol;
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        if (activity != null) {
            android.view.View viewInflate = android.view.LayoutInflater.from(activity).inflate(C23274hvD.Activity.DcqEDu, (android.view.ViewGroup) null);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewInflate.findViewById(C23274hvD.Application.fastForward);
            android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(C23274hvD.Application.setListNavigationCallbacks);
            android.widget.CheckBox checkBox = (android.widget.CheckBox) viewInflate.findViewById(C23274hvD.Application.hrjNmC);
            java.lang.String showData$default = C23271hvA.getShowData$default(C23271hvA.copydefault, abstractC23101hrq.RJOkX().EZpvd(), false, null, false, false, 30, null);
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = abstractC23101hrq.QUSxYX().copydefault();
            java.lang.String str = (dexMultiTokenInfoBeanCopydefault == null || (tokenSymbol = dexMultiTokenInfoBeanCopydefault.getTokenSymbol()) == null) ? "" : tokenSymbol;
            java.lang.String strDbNXlk = abstractC23101hrq.DbNXlk();
            java.lang.String strSubCheckS$default = C23313hvq.subCheckS$default(abstractC23101hrq.gHZMYf(), strDbNXlk, null, null, null, 14, null);
            boolean zOLrzqt = C23313hvq.OLrzqt(C23313hvq.subCheckS$default(strDbNXlk, abstractC23101hrq.RJOkX().EZpvd(), null, null, null, 14, null), 0);
            boolean zOLrzqt2 = C23313hvq.OLrzqt(strSubCheckS$default, 0);
            if (zOLrzqt) {
                Intrinsics.copydefault(textView);
                Intrinsics.copydefault(checkBox);
                OLrzqt(textView, checkBox, showData$default, str, strSubCheckS$default, zOLrzqt2, abstractC23101hrq);
            } else {
                Intrinsics.copydefault(textView);
                Intrinsics.copydefault(checkBox);
                EZpvd(textView, checkBox, showData$default, str, strSubCheckS$default, zOLrzqt2, abstractC23101hrq);
            }
            linearLayout.setVisibility(z ? 0 : 8);
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
            Intrinsics.copydefault(viewInflate);
            ViewOnClickListenerC54939xaY.addCustomView$default(viewOnClickListenerC54939xaY, viewInflate, 0, 2, null);
            ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, z ? C23274hvD.Fragment.setRccState : C23274hvD.Fragment.buildRccMetadata, (View.OnClickListener) null, 2, (java.lang.Object) null);
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
            viewOnClickListenerC54939xaY.show();
        }
    }
}
