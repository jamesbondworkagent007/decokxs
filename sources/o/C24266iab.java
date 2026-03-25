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

/* JADX INFO: renamed from: o.iab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24266iab extends android.widget.RelativeLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public DexMultiChildOrderInfoVo copydefault;
    public final InterfaceC56387yDm djBIcL;
    public DexOrderDetailViewModel gEmmrt;
    public final InterfaceC56387yDm valueOf;

    private final void AEQbTJ(float f) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24266iab(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24266iab(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24266iab(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24266iab(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.iac
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24266iab.isConnected(this.EZpvd);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.iag
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24266iab.AkhnZx(this.EZpvd);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.iad
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24266iab.ejfBZ(this.AEQbTJ);
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.iah
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24266iab.fetchVPNInfo(this.KWHzl);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.iaf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24266iab.values(this.AEQbTJ);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.iae
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24266iab.AYXKKw(this.AEQbTJ);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.iai
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24266iab.DbNXlk(this.OLrzqt);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.iak
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24266iab.djBIcL(this.EZpvd);
            }
        });
        KWHzl();
    }

    private final AppCompatImageView gEmmrt() {
        java.lang.Object value = this.AYXKKw.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatImageView) value;
    }

    public static final AppCompatImageView isConnected(C24266iab c24266iab) {
        return (AppCompatImageView) c24266iab.findViewById(C23274hvD.Application.MediaBrowserCompatMediaBrowserImpl);
    }

    public static final AppCompatImageView AkhnZx(C24266iab c24266iab) {
        return (AppCompatImageView) c24266iab.findViewById(C23274hvD.Application.ICustomTabsServiceStub);
    }

    private final AppCompatImageView OLrzqt() {
        java.lang.Object value = this.KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatImageView) value;
    }

    public static final C22104hYa ejfBZ(C24266iab c24266iab) {
        return (C22104hYa) c24266iab.findViewById(C23274hvD.Application.getNumericShortcut);
    }

    private final C22104hYa valueOf() {
        java.lang.Object value = this.AhwBna.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C22104hYa) value;
    }

    private final AppCompatTextView AYXKKw() {
        java.lang.Object value = this.djBIcL.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView fetchVPNInfo(C24266iab c24266iab) {
        return (AppCompatTextView) c24266iab.findViewById(C23274hvD.Application.removeAllTabs);
    }

    private final C24331ibn copydefault() {
        java.lang.Object value = this.EZpvd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C24331ibn) value;
    }

    public static final C24331ibn values(C24266iab c24266iab) {
        return (C24331ibn) c24266iab.findViewById(C23274hvD.Application.OKvQBs);
    }

    public static final hXF AYXKKw(C24266iab c24266iab) {
        return (hXF) c24266iab.findViewById(C23274hvD.Application.spnCvw);
    }

    private final hXF EZpvd() {
        java.lang.Object value = this.OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (hXF) value;
    }

    public static final hXF DbNXlk(C24266iab c24266iab) {
        return (hXF) c24266iab.findViewById(C23274hvD.Application.ActivityResultContractsStartActivityForResult);
    }

    private final hXF djBIcL() {
        java.lang.Object value = this.valueOf.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (hXF) value;
    }

    private final C22073hWx AEQbTJ() {
        java.lang.Object value = this.AEQbTJ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C22073hWx) value;
    }

    public static final C22073hWx djBIcL(C24266iab c24266iab) {
        return (C22073hWx) c24266iab.findViewById(C23274hvD.Application.putInt);
    }

    public final void KWHzl() {
        android.view.LayoutInflater.from(getContext()).inflate(C23274hvD.Activity.HJWChP, (android.view.ViewGroup) this, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.iab */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initData$default(C24266iab c24266iab, DexOrderDetailViewModel dexOrderDetailViewModel, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            function1 = null;
        }
        c24266iab.OLrzqt(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, dexMultiChildOrderInfoVo2, str, function1);
    }

    public final void OLrzqt(@NotNull DexOrderDetailViewModel dexOrderDetailViewModel, @NotNull final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, @NotNull java.lang.String str, Function1<? super kotlin.Pair<java.lang.Long, java.lang.Long>, Unit> function1) {
        Intrinsics.checkNotNullParameter(dexOrderDetailViewModel, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo2, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = dexOrderDetailViewModel;
        this.copydefault = dexMultiChildOrderInfoVo2;
        OrderDetailBean value = dexOrderDetailViewModel.djBIcL().getValue();
        if (value != null) {
            valueOf().EZpvd(dexMultiChildOrderInfoVo.getStatus(), value.getFromEstimatedTime(), value.getOriginFromEstimatedTime(), function1);
        }
        if (dexMultiChildOrderInfoVo2.isProgressDoneStatus()) {
            setProgress(C56390yDp.OLrzqt(-100L, -100L));
        }
        OrderDetailBean value2 = dexOrderDetailViewModel.djBIcL().getValue();
        setBridgeDescView(dexMultiChildOrderInfoVo2, value2 != null ? value2.isBridgeTimeOut() : false, dexOrderDetailViewModel);
        valueOf().setValue(dexMultiChildOrderInfoVo.getCoinValueShow(str), dexMultiChildOrderInfoVo.getToTokenSymbol());
        AEQbTJ(dexMultiChildOrderInfoVo.getToChainName());
        OLrzqt(dexMultiChildOrderInfoVo.getToTokenIcon());
        KWHzl(dexMultiChildOrderInfoVo.isShowChildOrderLink());
        EZpvd(dexMultiChildOrderInfoVo.getStatus());
        if (!dexMultiChildOrderInfoVo.isPending() && !dexMultiChildOrderInfoVo.isAccelerate()) {
            valueOf().AEQbTJ();
        }
        OLrzqt().setOnClickListener(new View.OnClickListener() { // from class: o.ial
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C24266iab.copydefault(this.KWHzl, dexMultiChildOrderInfoVo, view);
            }
        });
    }

    public static final void copydefault(C24266iab c24266iab, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, android.view.View view) {
        android.content.Context context = c24266iab.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25352ivB.OLrzqt(context, dexMultiChildOrderInfoVo.getExploreUrl());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iab */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setProgress$default(C24266iab c24266iab, kotlin.Pair pair, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pair = null;
        }
        c24266iab.setProgress(pair);
    }

    public final void setProgress(kotlin.Pair<java.lang.Long, java.lang.Long> pair) {
        djBIcL().setProgress(C56390yDp.OLrzqt(-100L, -100L));
        EZpvd().setProgress(pair);
    }

    public final void setBridgeDescView(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, boolean z, @NotNull DexOrderDetailViewModel dexOrderDetailViewModel) {
        java.lang.String bridgeName;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(dexOrderDetailViewModel, "");
        if (dexMultiChildOrderInfoVo.isOpenPackUpViewStatus() && !dexMultiChildOrderInfoVo.isOpenErrorView() && dexMultiChildOrderInfoVo.isErrorCodeNormal()) {
            C24331ibn c24331ibnCopydefault = copydefault();
            boolean zKWHzl = KWHzl(dexOrderDetailViewModel, z);
            DexBridgeOrderInfoVo bridgeOrderInfoVo = dexMultiChildOrderInfoVo.getBridgeOrderInfoVo();
            if (bridgeOrderInfoVo != null && (bridgeName = bridgeOrderInfoVo.getBridgeName()) != null) {
                str = bridgeName;
            }
            c24331ibnCopydefault.setTimeOutDec(C25352ivB.OLrzqt(zKWHzl, str, dexMultiChildOrderInfoVo.getToChainName()));
            copydefault().setVisibility(0);
            return;
        }
        copydefault().setVisibility(8);
    }

    public final boolean KWHzl(DexOrderDetailViewModel dexOrderDetailViewModel, boolean z) {
        OrderDetailBean value = dexOrderDetailViewModel.djBIcL().getValue();
        if (value == null || !value.isOrderInRedeemStatus()) {
            return z;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [146=7] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void EZpvd(java.lang.String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 48) {
            if (iHashCode != 49) {
                if (iHashCode != 48625) {
                    switch (iHashCode) {
                        case 1444:
                            if (str.equals(MultiTransferSignData.DEFAULT_INTERVAL)) {
                                EZpvd(1.0f);
                                AEQbTJ(0.3f);
                                android.content.Context context = getContext();
                                Intrinsics.checkNotNullExpressionValue(context, "");
                                EZpvd(C25382ivf.KWHzl(context, C52761wXj.Activity.DeEinT));
                                android.content.Context context2 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context2, "");
                                KWHzl(C25382ivf.KWHzl(context2, C52761wXj.Activity.aappFQ));
                                return;
                            }
                            break;
                        case 1445:
                            if (str.equals("-2")) {
                                EZpvd(1.0f);
                                AEQbTJ(0.3f);
                                android.content.Context context3 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context3, "");
                                EZpvd(C25382ivf.KWHzl(context3, C52761wXj.Activity.DeEinT));
                                android.content.Context context4 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context4, "");
                                KWHzl(C25382ivf.KWHzl(context4, C52761wXj.Activity.aappFQ));
                                return;
                            }
                            break;
                        case 1446:
                            if (str.equals("-3")) {
                                EZpvd(1.0f);
                                AEQbTJ(0.3f);
                                android.content.Context context5 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context5, "");
                                EZpvd(C25382ivf.KWHzl(context5, C52761wXj.Activity.DeEinT));
                                android.content.Context context6 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context6, "");
                                KWHzl(C25382ivf.KWHzl(context6, C52761wXj.Activity.aappFQ));
                                return;
                            }
                            break;
                        case 1447:
                            if (str.equals("-4")) {
                                EZpvd(1.0f);
                                AEQbTJ(0.3f);
                                android.content.Context context7 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context7, "");
                                EZpvd(C25382ivf.KWHzl(context7, C52761wXj.Activity.DeEinT));
                                android.content.Context context8 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context8, "");
                                KWHzl(C25382ivf.KWHzl(context8, C52761wXj.Activity.aappFQ));
                                return;
                            }
                            break;
                    }
                } else if (str.equals("100")) {
                    EZpvd(0.3f);
                    AEQbTJ(0.3f);
                    android.content.Context context9 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context9, "");
                    EZpvd(C25382ivf.KWHzl(context9, C52761wXj.Activity.Dff));
                    android.content.Context context10 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context10, "");
                    KWHzl(C25382ivf.KWHzl(context10, C52761wXj.Activity.Dff));
                    return;
                }
            } else if (str.equals("1")) {
                EZpvd(1.0f);
                AEQbTJ(1.0f);
                android.content.Context context11 = getContext();
                Intrinsics.checkNotNullExpressionValue(context11, "");
                EZpvd(C25382ivf.KWHzl(context11, C52761wXj.Activity.DeEinT));
                android.content.Context context12 = getContext();
                Intrinsics.checkNotNullExpressionValue(context12, "");
                KWHzl(C25382ivf.KWHzl(context12, C52761wXj.Activity.aappFQ));
                return;
            }
        } else if (str.equals("0")) {
            EZpvd(1.0f);
            AEQbTJ(0.3f);
            android.content.Context context13 = getContext();
            Intrinsics.checkNotNullExpressionValue(context13, "");
            KWHzl(C25382ivf.KWHzl(context13, C52761wXj.Activity.aappFQ));
            android.content.Context context14 = getContext();
            Intrinsics.checkNotNullExpressionValue(context14, "");
            EZpvd(C25382ivf.KWHzl(context14, C52761wXj.Activity.DeEinT));
            return;
        }
        EZpvd(1.0f);
        AEQbTJ(1.0f);
        android.content.Context context15 = getContext();
        Intrinsics.checkNotNullExpressionValue(context15, "");
        EZpvd(C25382ivf.KWHzl(context15, C52761wXj.Activity.DeEinT));
        android.content.Context context16 = getContext();
        Intrinsics.checkNotNullExpressionValue(context16, "");
        KWHzl(C25382ivf.KWHzl(context16, C52761wXj.Activity.aappFQ));
    }

    public final void OLrzqt(java.lang.String str) {
        C25386ivj.loadImageWithBorder$default(gEmmrt(), str, null, 2, null);
    }

    public final void KWHzl(boolean z) {
        OLrzqt().setVisibility(z ? 0 : 8);
    }

    private final void EZpvd(float f) {
        gEmmrt().setAlpha(f);
    }

    private final void KWHzl(int i) {
        AYXKKw().setTextColor(i);
    }

    private final void EZpvd(int i) {
        valueOf().setValueColor(i);
    }

    private final void AEQbTJ(java.lang.String str) {
        AYXKKw().setText(str);
    }

    public final void setInstructionInfo(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(function2, "");
        C25352ivB.setErrorCodeMsgView$default(AEQbTJ(), dexMultiChildOrderInfoVo, function2, false, 4, null);
    }

    public final void setAccelerateViewSize(int i) {
        copydefault().EZpvd().setAccelerateSize(i);
    }

    public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull WalletTxDetailBean walletTxDetailBean, yHO<? super java.lang.Boolean, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(walletTxDetailBean, "");
        C24328ibk.startSpeedUpTx$default(copydefault().EZpvd(), fragmentManager, walletTxDetailBean, null, yho, 4, null);
        C24328ibk.startCancelTx$default(copydefault().EZpvd(), fragmentManager, walletTxDetailBean, null, yho, 4, null);
        C24328ibk.startSpeedUpCancelTx$default(copydefault().EZpvd(), fragmentManager, walletTxDetailBean, null, yho, 4, null);
    }

    public static /* synthetic */ void updateAccelerateState$default(C24266iab c24266iab, AccelerateBean accelerateBean, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str2 = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        c24266iab.OLrzqt(accelerateBean, str, z, str2);
    }

    public final void OLrzqt(@NotNull AccelerateBean accelerateBean, @NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(accelerateBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        copydefault().EZpvd().copydefault(accelerateBean, str, z, str2);
    }
}
