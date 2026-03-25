package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.main.swap.history.detail.DexOrderDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hZq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22147hZq extends android.widget.RelativeLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm gEmmrt;

    private final void EZpvd(float f) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22147hZq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22147hZq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22147hZq(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22147hZq(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.hZx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22147hZq.djBIcL(this.OLrzqt);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.hZu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22147hZq.valueOf(this.OLrzqt);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.hZw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22147hZq.AkhnZx(this.OLrzqt);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.hZy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22147hZq.AhwBna(this.OLrzqt);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.hZv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22147hZq.isConnected(this.EZpvd);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.hZB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22147hZq.gEmmrt(this.AEQbTJ);
            }
        });
        KWHzl();
    }

    private final AppCompatImageView AEQbTJ() {
        java.lang.Object value = this.AEQbTJ.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatImageView) value;
    }

    public static final AppCompatImageView djBIcL(C22147hZq c22147hZq) {
        return (AppCompatImageView) c22147hZq.findViewById(C23274hvD.Application.MediaBrowserCompatMediaBrowserImpl);
    }

    private final AppCompatImageView OLrzqt() {
        java.lang.Object value = this.OLrzqt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatImageView) value;
    }

    public static final AppCompatImageView valueOf(C22147hZq c22147hZq) {
        return (AppCompatImageView) c22147hZq.findViewById(C23274hvD.Application.ICustomTabsServiceStub);
    }

    private final C22104hYa AhwBna() {
        java.lang.Object value = this.EZpvd.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C22104hYa) value;
    }

    public static final C22104hYa AkhnZx(C22147hZq c22147hZq) {
        return (C22104hYa) c22147hZq.findViewById(C23274hvD.Application.getNumericShortcut);
    }

    public static final AppCompatTextView AhwBna(C22147hZq c22147hZq) {
        return (AppCompatTextView) c22147hZq.findViewById(C23274hvD.Application.removeAllTabs);
    }

    private final AppCompatTextView copydefault() {
        java.lang.Object value = this.KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (AppCompatTextView) value;
    }

    private final C24331ibn gEmmrt() {
        java.lang.Object value = this.gEmmrt.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C24331ibn) value;
    }

    public static final C24331ibn isConnected(C22147hZq c22147hZq) {
        return (C24331ibn) c22147hZq.findViewById(C23274hvD.Application.setCheckable);
    }

    private final C22073hWx EZpvd() {
        java.lang.Object value = this.copydefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (C22073hWx) value;
    }

    public static final C22073hWx gEmmrt(C22147hZq c22147hZq) {
        return (C22073hWx) c22147hZq.findViewById(C23274hvD.Application.putInt);
    }

    public final void KWHzl() {
        android.view.LayoutInflater.from(getContext()).inflate(C23274hvD.Activity.Dff, (android.view.ViewGroup) this, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hZq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initData$default(C22147hZq c22147hZq, DexOrderDetailViewModel dexOrderDetailViewModel, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        c22147hZq.KWHzl(dexOrderDetailViewModel, dexMultiChildOrderInfoVo, str, function1);
    }

    public final void KWHzl(@NotNull DexOrderDetailViewModel dexOrderDetailViewModel, @NotNull final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull java.lang.String str, Function1<? super kotlin.Pair<java.lang.Long, java.lang.Long>, Unit> function1) {
        Intrinsics.checkNotNullParameter(dexOrderDetailViewModel, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(str, "");
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2 = dexOrderDetailViewModel.AhwBna().get(0);
        Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo2, "");
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3 = dexMultiChildOrderInfoVo2;
        OrderDetailBean value = dexOrderDetailViewModel.djBIcL().getValue();
        if (value != null) {
            AhwBna().EZpvd((dexMultiChildOrderInfoVo3.isPending() || dexMultiChildOrderInfoVo3.isAccelerate()) ? dexMultiChildOrderInfoVo3.getStatus() : dexMultiChildOrderInfoVo.getStatus(), C23313hvq.addCheckS$default(value.getFromEstimatedTime(), value.getBridgeEstimatedTime(), null, null, null, 14, null), C23313hvq.addCheckS$default(value.getOriginFromEstimatedTime(), value.getOriginBridgeEstimatedTime(), null, null, null, 14, null), function1);
        }
        AhwBna().setValue(dexMultiChildOrderInfoVo.getCoinValueShow(str), dexMultiChildOrderInfoVo.getToTokenSymbol());
        copydefault(dexMultiChildOrderInfoVo.getToChainName());
        OLrzqt(dexMultiChildOrderInfoVo.getToTokenIcon());
        AEQbTJ(dexMultiChildOrderInfoVo.isShowChildOrderLink());
        AEQbTJ((dexMultiChildOrderInfoVo3.isFail() || dexMultiChildOrderInfoVo3.isCanceled() || dexMultiChildOrderInfoVo3.isPending() || dexMultiChildOrderInfoVo3.isAccelerate()) ? dexMultiChildOrderInfoVo3.getStatus() : dexMultiChildOrderInfoVo.getStatus());
        if (!dexMultiChildOrderInfoVo.isPending() && !dexMultiChildOrderInfoVo3.isPending() && !dexMultiChildOrderInfoVo3.isAccelerate()) {
            AhwBna().AEQbTJ();
        }
        OLrzqt().setOnClickListener(new View.OnClickListener() { // from class: o.hZA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C22147hZq.EZpvd(this.AEQbTJ, dexMultiChildOrderInfoVo, view);
            }
        });
    }

    public static final void EZpvd(C22147hZq c22147hZq, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, android.view.View view) {
        android.content.Context context = c22147hZq.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25352ivB.OLrzqt(context, dexMultiChildOrderInfoVo.getExploreUrl());
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [104=7] */
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
                                KWHzl(C25382ivf.KWHzl(context, C52761wXj.Activity.DeEinT));
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
                                KWHzl(C25382ivf.KWHzl(context3, C52761wXj.Activity.DeEinT));
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
                                KWHzl(C25382ivf.KWHzl(context5, C52761wXj.Activity.DeEinT));
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
                                KWHzl(C25382ivf.KWHzl(context7, C52761wXj.Activity.DeEinT));
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
                    KWHzl(C25382ivf.KWHzl(context9, C52761wXj.Activity.Dff));
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
                KWHzl(C25382ivf.KWHzl(context11, C52761wXj.Activity.DeEinT));
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
            KWHzl(C25382ivf.KWHzl(context14, C52761wXj.Activity.DeEinT));
            return;
        }
        AEQbTJ(1.0f);
        EZpvd(1.0f);
        android.content.Context context15 = getContext();
        Intrinsics.checkNotNullExpressionValue(context15, "");
        KWHzl(C25382ivf.KWHzl(context15, C52761wXj.Activity.DeEinT));
        android.content.Context context16 = getContext();
        Intrinsics.checkNotNullExpressionValue(context16, "");
        EZpvd(C25382ivf.KWHzl(context16, C52761wXj.Activity.aappFQ));
    }

    public final void OLrzqt(java.lang.String str) {
        C25386ivj.loadImageWithBorder$default(AEQbTJ(), str, null, 2, null);
    }

    public final void AEQbTJ(boolean z) {
        OLrzqt().setVisibility(z ? 0 : 8);
    }

    private final void AEQbTJ(float f) {
        AEQbTJ().setAlpha(f);
    }

    private final void EZpvd(int i) {
        copydefault().setTextColor(i);
    }

    private final void KWHzl(int i) {
        AhwBna().setValueColor(i);
    }

    private final void copydefault(java.lang.String str) {
        copydefault().setText(str);
    }

    public final void setToTimeOutDescView(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        if (dexMultiChildOrderInfoVo.showTimeOutView()) {
            gEmmrt().setOnlyShowDecView(true);
            gEmmrt().setTimeOutDec(C33070mpX.AYXKKw(C23274hvD.Fragment.QVMIlxQVMIlx));
            gEmmrt().setVisibility(0);
            return;
        }
        gEmmrt().setVisibility(8);
    }

    public final void setInstructionInfo(@NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2) {
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        Intrinsics.checkNotNullParameter(function2, "");
        C25352ivB.setErrorCodeMsgView$default(EZpvd(), dexMultiChildOrderInfoVo, function2, false, 4, null);
    }
}
