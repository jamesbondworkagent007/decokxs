package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.DexBridgeOrderInfoVo;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.main.swap.history.bean.AccelerateBean;
import com.okinc.business.dexlogic.main.swap.history.detail.DexOrderDetailViewModel;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hYY extends android.widget.RelativeLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm valueOf;

    private final void EZpvd(float f) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hYY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hYY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hYY(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hYY(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.hZa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hYY.fetchVPNInfo(this.KWHzl);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.hZc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hYY.djBIcL(this.copydefault);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.hZe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hYY.DbNXlk(this.copydefault);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.hZi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hYY.values(this.AEQbTJ);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.hZf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hYY.valueOf(this.EZpvd);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.hZj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hYY.AkhnZx(this.copydefault);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.hZg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hYY.AYXKKw(this.KWHzl);
            }
        });
        AEQbTJ();
    }

    private final AppCompatImageView EZpvd() {
        java.lang.Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatImageView) value;
    }

    public static final AppCompatImageView fetchVPNInfo(hYY hyy) {
        return (AppCompatImageView) hyy.findViewById(C23274hvD.Application.MediaBrowserCompatMediaBrowserImpl);
    }

    private final AppCompatImageView KWHzl() {
        java.lang.Object value = this.KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatImageView) value;
    }

    public static final AppCompatImageView djBIcL(hYY hyy) {
        return (AppCompatImageView) hyy.findViewById(C23274hvD.Application.ICustomTabsServiceStub);
    }

    private final C22104hYa AYXKKw() {
        java.lang.Object value = this.valueOf.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C22104hYa) value;
    }

    public static final C22104hYa DbNXlk(hYY hyy) {
        return (C22104hYa) hyy.findViewById(C23274hvD.Application.getNumericShortcut);
    }

    private final AppCompatTextView valueOf() {
        java.lang.Object value = this.AEQbTJ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView values(hYY hyy) {
        return (AppCompatTextView) hyy.findViewById(C23274hvD.Application.removeAllTabs);
    }

    private final C24331ibn OLrzqt() {
        java.lang.Object value = this.EZpvd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C24331ibn) value;
    }

    public static final C24331ibn valueOf(hYY hyy) {
        return (C24331ibn) hyy.findViewById(C23274hvD.Application.setCheckable);
    }

    private final hXZ AhwBna() {
        java.lang.Object value = this.AhwBna.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (hXZ) value;
    }

    public static final hXZ AkhnZx(hYY hyy) {
        return (hXZ) hyy.findViewById(C23274hvD.Application.setListener);
    }

    public static final C22073hWx AYXKKw(hYY hyy) {
        return (C22073hWx) hyy.findViewById(C23274hvD.Application.putInt);
    }

    private final C22073hWx copydefault() {
        java.lang.Object value = this.OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C22073hWx) value;
    }

    public final void AEQbTJ() {
        android.view.LayoutInflater.from(getContext()).inflate(C23274hvD.Activity.GqbzPL, (android.view.ViewGroup) this, true);
    }

    public final void KWHzl(@NotNull final DexOrderDetailViewModel dexOrderDetailViewModel, @NotNull final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull java.lang.String str, final Function1<? super kotlin.Pair<java.lang.Long, java.lang.Long>, Unit> function1, final Function1<? super kotlin.Pair<java.lang.Long, java.lang.Long>, Unit> function12) {
        Intrinsics.checkNotNullParameter(dexOrderDetailViewModel, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(str, "");
        OrderDetailBean value = dexOrderDetailViewModel.djBIcL().getValue();
        if (value != null) {
            AYXKKw().EZpvd(dexMultiChildOrderInfoVo.getStatus(), value.getFromEstimatedTime(), value.getOriginFromEstimatedTime(), new Function1() { // from class: o.hYV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return hYY.OLrzqt(function1, (kotlin.Pair) obj);
                }
            });
            DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2 = dexOrderDetailViewModel.AhwBna().get(1);
            Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo2, "");
            if (dexMultiChildOrderInfoVo2.isPending()) {
                AhwBna().copydefault(value.getReviseBridgeEstimatedTime(dexOrderDetailViewModel.AkhnZx().getValue()), value.getOriginBridgeEstimatedTime());
                AhwBna().setOnCountDownCallback(new Function1() { // from class: o.hZb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return hYY.AEQbTJ(function12, this, dexOrderDetailViewModel, (kotlin.Pair) obj);
                    }
                });
            } else {
                AhwBna().EZpvd();
            }
        }
        OrderDetailBean value2 = dexOrderDetailViewModel.djBIcL().getValue();
        setFromBridgeDescView(dexOrderDetailViewModel, value2 != null ? value2.isBridgeTimeOut() : false);
        AYXKKw().setValue(dexMultiChildOrderInfoVo.getCoinValueShow(str), dexMultiChildOrderInfoVo.getToTokenSymbol());
        EZpvd(dexMultiChildOrderInfoVo.getToChainName());
        OLrzqt(dexMultiChildOrderInfoVo.getToTokenIcon());
        OLrzqt(dexMultiChildOrderInfoVo.isShowChildOrderLink());
        AEQbTJ(dexMultiChildOrderInfoVo.getStatus());
        if (!dexMultiChildOrderInfoVo.isPending() && !dexMultiChildOrderInfoVo.isAccelerate()) {
            AYXKKw().AEQbTJ();
        }
        KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.hZd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                hYY.EZpvd(this.AEQbTJ, dexMultiChildOrderInfoVo, view);
            }
        });
    }

    public static final Unit OLrzqt(Function1 function1, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (function1 != null) {
            function1.invoke(pair);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function1 function1, hYY hyy, DexOrderDetailViewModel dexOrderDetailViewModel, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (function1 != null) {
            function1.invoke(pair);
        }
        if (((java.lang.Number) pair.getSecond()).longValue() == -1 && ((java.lang.Number) pair.getFirst()).longValue() == -1) {
            hyy.setFromBridgeDescView(dexOrderDetailViewModel, true);
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(hYY hyy, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, android.view.View view) {
        android.content.Context context = hyy.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25352ivB.OLrzqt(context, dexMultiChildOrderInfoVo.getExploreUrl());
    }

    public final void setFromBridgeDescView(DexOrderDetailViewModel dexOrderDetailViewModel, boolean z) {
        java.lang.String bridgeName;
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo = dexOrderDetailViewModel.AhwBna().get(1);
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo, "");
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2 = dexMultiChildOrderInfoVo;
        if (dexMultiChildOrderInfoVo2.showTimeOutView()) {
            C24331ibn c24331ibnOLrzqt = OLrzqt();
            boolean zOLrzqt = OLrzqt(dexOrderDetailViewModel, z);
            DexBridgeOrderInfoVo bridgeOrderInfoVo = dexMultiChildOrderInfoVo2.getBridgeOrderInfoVo();
            if (bridgeOrderInfoVo != null && (bridgeName = bridgeOrderInfoVo.getBridgeName()) != null) {
                str = bridgeName;
            }
            c24331ibnOLrzqt.setTimeOutDec(C25352ivB.OLrzqt(zOLrzqt, str, dexMultiChildOrderInfoVo2.getToChainName()));
            OLrzqt().setVisibility(0);
            return;
        }
        OLrzqt().setVisibility(8);
    }

    public final boolean OLrzqt(DexOrderDetailViewModel dexOrderDetailViewModel, boolean z) {
        OrderDetailBean value = dexOrderDetailViewModel.djBIcL().getValue();
        if (value == null || !value.isOrderInRedeemStatus()) {
            return z;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AhwBna().EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [152=7] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void AEQbTJ(java.lang.String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 48) {
            if (iHashCode != 49) {
                if (iHashCode != 48625) {
                    switch (iHashCode) {
                        case 1444:
                            if (str.equals(MultiTransferSignData.DEFAULT_INTERVAL)) {
                                AEQbTJ(1.0f);
                                EZpvd(0.3f);
                                android.content.Context context = getContext();
                                Intrinsics.checkNotNullExpressionValue(context, "");
                                OLrzqt(C25382ivf.KWHzl(context, C52761wXj.Activity.DeEinT));
                                android.content.Context context2 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context2, "");
                                EZpvd(C25382ivf.KWHzl(context2, C52761wXj.Activity.aappFQ));
                                return;
                            }
                            break;
                        case 1445:
                            if (str.equals("-2")) {
                                AEQbTJ(1.0f);
                                EZpvd(0.3f);
                                android.content.Context context3 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context3, "");
                                OLrzqt(C25382ivf.KWHzl(context3, C52761wXj.Activity.DeEinT));
                                android.content.Context context4 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "");
                                EZpvd(C25382ivf.KWHzl(context4, C52761wXj.Activity.aappFQ));
                                return;
                            }
                            break;
                        case 1446:
                            if (str.equals("-3")) {
                                AEQbTJ(1.0f);
                                EZpvd(0.3f);
                                android.content.Context context5 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "");
                                OLrzqt(C25382ivf.KWHzl(context5, C52761wXj.Activity.DeEinT));
                                android.content.Context context6 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context6, "");
                                EZpvd(C25382ivf.KWHzl(context6, C52761wXj.Activity.aappFQ));
                                return;
                            }
                            break;
                        case 1447:
                            if (str.equals("-4")) {
                                AEQbTJ(1.0f);
                                EZpvd(0.3f);
                                android.content.Context context7 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context7, "");
                                OLrzqt(C25382ivf.KWHzl(context7, C52761wXj.Activity.DeEinT));
                                android.content.Context context8 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context8, "");
                                EZpvd(C25382ivf.KWHzl(context8, C52761wXj.Activity.aappFQ));
                                return;
                            }
                            break;
                    }
                } else if (str.equals("100")) {
                    AEQbTJ(0.3f);
                    EZpvd(0.3f);
                    android.content.Context context9 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context9, "");
                    OLrzqt(C25382ivf.KWHzl(context9, C52761wXj.Activity.Dff));
                    android.content.Context context10 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context10, "");
                    EZpvd(C25382ivf.KWHzl(context10, C52761wXj.Activity.Dff));
                    return;
                }
            } else if (str.equals("1")) {
                AEQbTJ(1.0f);
                EZpvd(1.0f);
                android.content.Context context11 = getContext();
                Intrinsics.checkNotNullExpressionValue(context11, "");
                OLrzqt(C25382ivf.KWHzl(context11, C52761wXj.Activity.DeEinT));
                android.content.Context context12 = getContext();
                Intrinsics.checkNotNullExpressionValue(context12, "");
                EZpvd(C25382ivf.KWHzl(context12, C52761wXj.Activity.aappFQ));
                return;
            }
        } else if (str.equals("0")) {
            AEQbTJ(1.0f);
            EZpvd(0.3f);
            android.content.Context context13 = getContext();
            Intrinsics.checkNotNullExpressionValue(context13, "");
            EZpvd(C25382ivf.KWHzl(context13, C52761wXj.Activity.aappFQ));
            android.content.Context context14 = getContext();
            Intrinsics.checkNotNullExpressionValue(context14, "");
            OLrzqt(C25382ivf.KWHzl(context14, C52761wXj.Activity.DeEinT));
            return;
        }
        AEQbTJ(1.0f);
        EZpvd(1.0f);
        android.content.Context context15 = getContext();
        Intrinsics.checkNotNullExpressionValue(context15, "");
        OLrzqt(C25382ivf.KWHzl(context15, C52761wXj.Activity.DeEinT));
        android.content.Context context16 = getContext();
        Intrinsics.checkNotNullExpressionValue(context16, "");
        EZpvd(C25382ivf.KWHzl(context16, C52761wXj.Activity.aappFQ));
    }

    public final void OLrzqt(java.lang.String str) {
        C25386ivj.loadImageWithBorder$default(EZpvd(), str, null, 2, null);
    }

    public final void OLrzqt(boolean z) {
        KWHzl().setVisibility(z ? 0 : 8);
    }

    private final void AEQbTJ(float f) {
        EZpvd().setAlpha(f);
    }

    private final void EZpvd(int i) {
        valueOf().setTextColor(i);
    }

    private final void OLrzqt(int i) {
        AYXKKw().setValueColor(i);
    }

    private final void EZpvd(java.lang.String str) {
        valueOf().setText(str);
    }

    public final void setInstructionInfo(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(function2, "");
        C25352ivB.setErrorCodeMsgView$default(copydefault(), dexMultiChildOrderInfoVo, function2, false, 4, null);
    }

    public final void setAccelerateViewSize(int i) {
        OLrzqt().EZpvd().setAccelerateSize(i);
    }

    public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull WalletTxDetailBean walletTxDetailBean, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletTxDetailBean, "");
        C24328ibk.startSpeedUpTx$default(OLrzqt().EZpvd(), fragmentManager, walletTxDetailBean, null, yho, 4, null);
        C24328ibk.startCancelTx$default(OLrzqt().EZpvd(), fragmentManager, walletTxDetailBean, null, yho, 4, null);
        C24328ibk.startSpeedUpCancelTx$default(OLrzqt().EZpvd(), fragmentManager, walletTxDetailBean, null, yho, 4, null);
    }

    public static /* synthetic */ void updateAccelerateState$default(hYY hyy, AccelerateBean accelerateBean, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str2 = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        hyy.OLrzqt(accelerateBean, str, z, str2);
    }

    public final void OLrzqt(@NotNull AccelerateBean accelerateBean, @NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(accelerateBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        OLrzqt().EZpvd().copydefault(accelerateBean, str, z, str2);
    }
}
