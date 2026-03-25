package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.main.swap.history.bean.AccelerateBean;
import com.okinc.business.dexlogic.main.swap.history.detail.DexOrderDetailViewModel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hZS extends android.widget.RelativeLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public DexMultiChildOrderInfoVo AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm djBIcL;
    public DexOrderDetailViewModel gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values;

    private final void copydefault(float f) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hZS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hZS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hZS(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hZS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.hZR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hZS.DbNXlk(this.OLrzqt);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.hZP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hZS.AkhnZx(this.copydefault);
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.hZU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hZS.fARcdN(this.copydefault);
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.hZV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hZS.fIwbmz(this.OLrzqt);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.hZW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hZS.values(this.copydefault);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.hZT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hZS.AhwBna(this.EZpvd);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.hZX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hZS.ejfBZ(this.KWHzl);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.hZY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hZS.fetchVPNInfo(this.AEQbTJ);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.hZZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hZS.isConnected(this.KWHzl);
            }
        });
        KWHzl();
    }

    public static final AppCompatImageView DbNXlk(hZS hzs) {
        return (AppCompatImageView) hzs.findViewById(C23274hvD.Application.MediaBrowserCompatMediaBrowserImpl);
    }

    private final AppCompatImageView gEmmrt() {
        java.lang.Object value = this.EZpvd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatImageView) value;
    }

    public static final AppCompatImageView AkhnZx(hZS hzs) {
        return (AppCompatImageView) hzs.findViewById(C23274hvD.Application.ICustomTabsServiceStub);
    }

    private final AppCompatImageView EZpvd() {
        java.lang.Object value = this.OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatImageView) value;
    }

    private final C22104hYa AhwBna() {
        java.lang.Object value = this.values.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C22104hYa) value;
    }

    public static final C22104hYa fARcdN(hZS hzs) {
        return (C22104hYa) hzs.findViewById(C23274hvD.Application.getNumericShortcut);
    }

    public static final AppCompatTextView fIwbmz(hZS hzs) {
        return (AppCompatTextView) hzs.findViewById(C23274hvD.Application.removeAllTabs);
    }

    private final AppCompatTextView valueOf() {
        java.lang.Object value = this.djBIcL.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    private final AppCompatTextView AEQbTJ() {
        java.lang.Object value = this.AEQbTJ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    public static final AppCompatTextView values(hZS hzs) {
        return (AppCompatTextView) hzs.findViewById(C23274hvD.Application.OKvQBs);
    }

    public static final android.widget.FrameLayout AhwBna(hZS hzs) {
        return (android.widget.FrameLayout) hzs.findViewById(C23274hvD.Application.gsvlRV);
    }

    private final android.widget.FrameLayout copydefault() {
        java.lang.Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (android.widget.FrameLayout) value;
    }

    private final C24328ibk djBIcL() {
        java.lang.Object value = this.AYXKKw.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C24328ibk) value;
    }

    public static final C24328ibk ejfBZ(hZS hzs) {
        return (C24328ibk) hzs.findViewById(C23274hvD.Application.addSubMenuItem);
    }

    private final C22073hWx OLrzqt() {
        java.lang.Object value = this.KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C22073hWx) value;
    }

    public static final C22073hWx fetchVPNInfo(hZS hzs) {
        return (C22073hWx) hzs.findViewById(C23274hvD.Application.putInt);
    }

    private final hXF AYXKKw() {
        java.lang.Object value = this.valueOf.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (hXF) value;
    }

    public static final hXF isConnected(hZS hzs) {
        return (hXF) hzs.findViewById(C23274hvD.Application.ActivityResultContractsStartActivityForResult);
    }

    public final void KWHzl() {
        android.view.LayoutInflater.from(getContext()).inflate(C23274hvD.Activity.RhjxDW, (android.view.ViewGroup) this, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hZS */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initData$default(hZS hzs, DexOrderDetailViewModel dexOrderDetailViewModel, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        hzs.AEQbTJ(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, str, function1);
    }

    public final void AEQbTJ(@NotNull DexOrderDetailViewModel dexOrderDetailViewModel, @NotNull final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull java.lang.String str, Function1<? super kotlin.Pair<java.lang.Long, java.lang.Long>, Unit> function1) {
        Intrinsics.checkNotNullParameter(dexOrderDetailViewModel, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = dexOrderDetailViewModel;
        this.AhwBna = dexMultiChildOrderInfoVo;
        OrderDetailBean value = dexOrderDetailViewModel.djBIcL().getValue();
        if (value != null) {
            AhwBna().EZpvd(dexMultiChildOrderInfoVo.getStatus(), value.getReviseBridgeEstimatedTime(dexOrderDetailViewModel.AkhnZx().getValue()), value.getOriginBridgeEstimatedTime(), function1);
        }
        AhwBna().setValue(dexMultiChildOrderInfoVo.getCoinValueShow(str), dexMultiChildOrderInfoVo.getToTokenSymbol());
        OLrzqt(dexMultiChildOrderInfoVo.getToChainName());
        EZpvd(dexMultiChildOrderInfoVo.getToTokenIcon());
        OLrzqt(dexMultiChildOrderInfoVo.isShowChildOrderLink());
        copydefault(dexMultiChildOrderInfoVo.getStatus());
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2 = (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.AubY(dexOrderDetailViewModel.AhwBna());
        if (!dexMultiChildOrderInfoVo.isPending() && !dexMultiChildOrderInfoVo.isAccelerate()) {
            AhwBna().AEQbTJ();
        }
        setToDescView(dexMultiChildOrderInfoVo2, AEQbTJ(dexOrderDetailViewModel.fetchVPNInfo()));
        EZpvd().setOnClickListener(new View.OnClickListener() { // from class: o.iaa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                hZS.KWHzl(this.copydefault, dexMultiChildOrderInfoVo, view);
            }
        });
    }

    public static final void KWHzl(hZS hzs, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, android.view.View view) {
        android.content.Context context = hzs.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25352ivB.OLrzqt(context, dexMultiChildOrderInfoVo.getExploreUrl());
    }

    public final boolean AEQbTJ(boolean z) {
        MutableLiveData<OrderDetailBean> mutableLiveDataDjBIcL;
        OrderDetailBean value;
        DexOrderDetailViewModel dexOrderDetailViewModel = this.gEmmrt;
        if (dexOrderDetailViewModel == null || (mutableLiveDataDjBIcL = dexOrderDetailViewModel.djBIcL()) == null || (value = mutableLiveDataDjBIcL.getValue()) == null || !value.isOrderInRedeemStatus()) {
            return z;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [118=7] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void copydefault(java.lang.String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 48) {
            if (iHashCode != 49) {
                if (iHashCode != 48625) {
                    switch (iHashCode) {
                        case 1444:
                            if (str.equals(MultiTransferSignData.DEFAULT_INTERVAL)) {
                                AEQbTJ(1.0f);
                                copydefault(0.3f);
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
                                AEQbTJ(1.0f);
                                copydefault(0.3f);
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
                                AEQbTJ(1.0f);
                                copydefault(0.3f);
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
                                AEQbTJ(1.0f);
                                copydefault(0.3f);
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
                    AEQbTJ(0.3f);
                    copydefault(0.3f);
                    android.content.Context context9 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context9, "");
                    EZpvd(C25382ivf.KWHzl(context9, C52761wXj.Activity.Dff));
                    android.content.Context context10 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context10, "");
                    KWHzl(C25382ivf.KWHzl(context10, C52761wXj.Activity.Dff));
                    return;
                }
            } else if (str.equals("1")) {
                AEQbTJ(1.0f);
                copydefault(1.0f);
                android.content.Context context11 = getContext();
                Intrinsics.checkNotNullExpressionValue(context11, "");
                EZpvd(C25382ivf.KWHzl(context11, C52761wXj.Activity.DeEinT));
                android.content.Context context12 = getContext();
                Intrinsics.checkNotNullExpressionValue(context12, "");
                KWHzl(C25382ivf.KWHzl(context12, C52761wXj.Activity.aappFQ));
                return;
            }
        } else if (str.equals("0")) {
            AEQbTJ(1.0f);
            copydefault(0.3f);
            android.content.Context context13 = getContext();
            Intrinsics.checkNotNullExpressionValue(context13, "");
            KWHzl(C25382ivf.KWHzl(context13, C52761wXj.Activity.aappFQ));
            android.content.Context context14 = getContext();
            Intrinsics.checkNotNullExpressionValue(context14, "");
            EZpvd(C25382ivf.KWHzl(context14, C52761wXj.Activity.DeEinT));
            return;
        }
        AEQbTJ(1.0f);
        copydefault(1.0f);
        android.content.Context context15 = getContext();
        Intrinsics.checkNotNullExpressionValue(context15, "");
        EZpvd(C25382ivf.KWHzl(context15, C52761wXj.Activity.DeEinT));
        android.content.Context context16 = getContext();
        Intrinsics.checkNotNullExpressionValue(context16, "");
        KWHzl(C25382ivf.KWHzl(context16, C52761wXj.Activity.aappFQ));
    }

    public final void EZpvd(java.lang.String str) {
        C25386ivj.loadImageWithBorder$default(gEmmrt(), str, null, 2, null);
    }

    public final void OLrzqt(boolean z) {
        EZpvd().setVisibility(z ? 0 : 8);
    }

    private final void AEQbTJ(float f) {
        gEmmrt().setAlpha(f);
    }

    private final void KWHzl(int i) {
        valueOf().setTextColor(i);
    }

    private final void EZpvd(int i) {
        AhwBna().setValueColor(i);
    }

    private final void OLrzqt(java.lang.String str) {
        valueOf().setText(str);
    }

    public final void setInstructionInfo(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(function2, "");
        C25352ivB.setErrorCodeMsgView$default(OLrzqt(), dexMultiChildOrderInfoVo, function2, false, 4, null);
    }

    public final void setAccelerateViewSize(int i) {
        djBIcL().setAccelerateSize(i);
    }

    public static /* synthetic */ void updateAccelerateState$default(hZS hzs, AccelerateBean accelerateBean, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str2 = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        hzs.copydefault(accelerateBean, str, z, str2);
    }

    public final void copydefault(@NotNull AccelerateBean accelerateBean, @NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(accelerateBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        djBIcL().copydefault(accelerateBean, str, z, str2);
    }

    public final void setProgress(@NotNull kotlin.Pair<java.lang.Long, java.lang.Long> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        AYXKKw().setProgress(pair);
    }

    public final void setToDescView(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, boolean z) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        if (dexMultiChildOrderInfoVo.isOpenPackUpViewStatus() && z && !dexMultiChildOrderInfoVo.isOpenErrorView()) {
            AEQbTJ().setText(C33070mpX.AYXKKw(C23274hvD.Fragment.QVMIlxQVMIlx));
            copydefault().setVisibility(0);
        } else {
            copydefault().setVisibility(8);
        }
    }
}
