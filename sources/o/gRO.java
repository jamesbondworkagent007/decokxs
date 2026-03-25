package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.dex.trade.order.domain.model.OrderSide;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gRO extends AbstractC31189lpN<C20064gZo, C21552hDp> {
    public final Function1<C20064gZo, Unit> EZpvd;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrderStrategyType.values().length];
            try {
                iArr[OrderStrategyType.Market.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OrderStrategyType.CopyTrade.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[OrderSide.values().length];
            try {
                iArr2[OrderSide.None.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[OrderSide.Buy.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[OrderSide.Sell.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr2;
            int[] iArr3 = new int[OrderSubStatus.values().length];
            try {
                iArr3[OrderSubStatus.Open.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[OrderSubStatus.Pending.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr3[OrderSubStatus.Cancelling.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr3[OrderSubStatus.Cancelled.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[OrderSubStatus.Completed.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[OrderSubStatus.Failed.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[OrderSubStatus.Expired.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[OrderSubStatus.Suspended.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr3[OrderSubStatus.Creating.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            copydefault = iArr3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.gZo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public gRO(@NotNull Function1<? super C20064gZo, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC31189lpN
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C21552hDp KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21552hDp c21552hDpCopydefault = C21552hDp.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21552hDpCopydefault, "");
        return c21552hDpCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC31189lpN
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C21552hDp c21552hDp, @NotNull C20064gZo c20064gZo) {
        java.lang.String newProxyInstance;
        java.lang.String localizedNumberWithSymbol$default;
        java.lang.String strAEQbTJ;
        java.lang.String localizedNumber$default;
        java.lang.String scientificCurrency$default;
        java.lang.String str;
        java.lang.String scientificCurrency$default2;
        java.lang.String str2;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(c21552hDp, "");
        Intrinsics.checkNotNullParameter(c20064gZo, "");
        c21552hDp.getRoot().setTag(c20064gZo);
        C25352ivB.setOnDoubleCheckClickListener$default(c21552hDp.getRoot(), 0L, new Function1() { // from class: o.gRP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gRO.EZpvd(this.KWHzl, (android.view.View) obj);
            }
        }, 1, null);
        int i = TaskDescription.KWHzl[c20064gZo.djBIcL().ordinal()];
        boolean z = false;
        c21552hDp.KWHzl.setFieldVisible(i != 1 && (i != 2 || c20064gZo.AwvSrB().length() > 0 || c20064gZo.zLjUOn().length() > 0 || c20064gZo.AxsJAY().length() > 0));
        c21552hDp.fetchVPNInfo.setText(C33070mpX.AYXKKw(c20064gZo.djBIcL().getStrRes()));
        int i2 = TaskDescription.AEQbTJ[c20064gZo.AubY().ordinal()];
        java.lang.String str4 = "--";
        if (i2 == 1) {
            if (c20064gZo.AuCTelauCTel() && !c20064gZo.KWHzl()) {
                z = true;
            }
            AppCompatTextView appCompatTextView = c21552hDp.DbNXlk;
            if (z) {
                newProxyInstance = c20064gZo.DbNXlk();
            } else {
                newProxyInstance = c20064gZo.getNewProxyInstance();
            }
            appCompatTextView.setText(newProxyInstance);
            c21552hDp.valueOf.OLrzqt(c20064gZo.AkhnZx(), c20064gZo.getFieldNames(), c20064gZo.copydefault());
            c21552hDp.OLrzqt.setTitle(C23274hvD.Fragment.getState);
            c21552hDp.fetchVPNInfo.setOKDSStyle(14);
            c21552hDp.AYXKKw.setOKDSStyle(14);
            c21552hDp.KWHzl.setContent(C23322hvz.toLocalizedNumberWithSymbol$default("1", c20064gZo.DbNXlk(), false, null, false, false, 30, null) + " = " + C23322hvz.toLocalizedNumberWithSymbol$default(c20064gZo.AxsJAY(), c20064gZo.getNewProxyInstance(), false, null, true, false, 22, null));
            C55251xgS c55251xgS = c21552hDp.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(8);
        } else if (i2 == 2) {
            c21552hDp.valueOf.OLrzqt(c20064gZo.AkhnZx(), c20064gZo.getFieldNames(), c20064gZo.copydefault());
            c21552hDp.DbNXlk.setText(c20064gZo.getNewProxyInstance());
            c21552hDp.OLrzqt.setTitle(C23274hvD.Fragment.PlaybackStateCompatActions);
            c21552hDp.fetchVPNInfo.setOKDSStyle(14);
            c21552hDp.AYXKKw.setOKDSStyle(14);
            C19863gSc c19863gSc = c21552hDp.KWHzl;
            java.lang.String strAwvSrB = c20064gZo.AwvSrB();
            java.lang.String str5 = strAwvSrB.length() > 0 ? strAwvSrB : null;
            if (str5 == null || (scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str5, true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null)) == null) {
                scientificCurrency$default = "--";
            }
            java.lang.String strZLjUOn = c20064gZo.zLjUOn();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strZLjUOn)) {
                str = " / " + C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, strZLjUOn, true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
            } else {
                str = "";
            }
            c19863gSc.setContent(scientificCurrency$default + str);
            C55251xgS c55251xgS2 = c21552hDp.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
            c55251xgS2.setVisibility(0);
            c21552hDp.AYXKKw.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.fJNWhG));
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c21552hDp.valueOf.OLrzqt(c20064gZo.getFieldNames(), c20064gZo.AkhnZx(), c20064gZo.copydefault());
            c21552hDp.DbNXlk.setText(c20064gZo.DbNXlk());
            c21552hDp.OLrzqt.setTitle(C23274hvD.Fragment.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal);
            c21552hDp.fetchVPNInfo.setOKDSStyle(13);
            c21552hDp.AYXKKw.setOKDSStyle(13);
            C19863gSc c19863gSc2 = c21552hDp.KWHzl;
            java.lang.String strAwvSrB2 = c20064gZo.AwvSrB();
            java.lang.String str6 = strAwvSrB2.length() > 0 ? strAwvSrB2 : null;
            if (str6 == null || (scientificCurrency$default2 = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str6, true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null)) == null) {
                scientificCurrency$default2 = "--";
            }
            java.lang.String strZLjUOn2 = c20064gZo.zLjUOn();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strZLjUOn2)) {
                str2 = " / " + C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, strZLjUOn2, true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
            } else {
                str2 = "";
            }
            c19863gSc2.setContent(scientificCurrency$default2 + str2);
            C55251xgS c55251xgS3 = c21552hDp.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55251xgS3, "");
            c55251xgS3.setVisibility(0);
            c21552hDp.AYXKKw.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.AuCTel));
        }
        switch (TaskDescription.copydefault[c20064gZo.valueOf().ordinal()]) {
            case 1:
                c21552hDp.isConnected.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                break;
            case 2:
                c21552hDp.isConnected.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq));
                break;
            case 3:
                c21552hDp.isConnected.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                break;
            case 4:
                c21552hDp.isConnected.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                break;
            case 5:
                c21552hDp.isConnected.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ));
                break;
            case 6:
                c21552hDp.isConnected.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
                break;
            case 7:
                c21552hDp.isConnected.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                break;
            case 8:
                c21552hDp.isConnected.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq));
                break;
            case 9:
                c21552hDp.isConnected.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        c21552hDp.isConnected.setText(C33070mpX.AYXKKw(c20064gZo.valueOf().getTextRes()));
        c21552hDp.AEQbTJ.setTitle(c20064gZo.valueOf().isTerminalState() ? C23274hvD.Fragment.fromCustomAction : C23274hvD.Fragment.getPosition);
        C19863gSc c19863gSc3 = c21552hDp.OLrzqt;
        java.lang.String strValues = c20064gZo.values();
        java.lang.String str7 = strValues.length() > 0 ? strValues : null;
        if (str7 == null || (localizedNumberWithSymbol$default = C23322hvz.toLocalizedNumberWithSymbol$default(str7, c20064gZo.DbNXlk(), false, null, false, false, 30, null)) == null) {
            localizedNumberWithSymbol$default = "-- " + c20064gZo.DbNXlk();
        }
        c19863gSc3.setContent(localizedNumberWithSymbol$default);
        java.lang.String strAuCTel = c20064gZo.AuCTel();
        java.lang.String str8 = strAuCTel.length() > 0 ? strAuCTel : null;
        if (str8 != null && (localizedNumber$default = C23322hvz.toLocalizedNumber$default(str8, false, (RoundingMode) null, false, false, 15, (java.lang.Object) null)) != null) {
            str4 = localizedNumber$default;
        }
        java.lang.String strFIwbmz = c20064gZo.fIwbmz();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strFIwbmz)) {
            str3 = "(" + C23322hvz.toLocalizedCurrencyNumberWithPrefix$default(strFIwbmz, false, null, true, false, 11, null) + ")";
        }
        C19863gSc c19863gSc4 = c21552hDp.AEQbTJ;
        if (C55296xhK.OLrzqt(C43246rlf.OLrzqt.valueOf())) {
            pTF ptf = pTF.KWHzl;
            strAEQbTJ = ptf.AEQbTJ(ptf.AEQbTJ(c20064gZo.getNewProxyInstance() + " " + str4) + " " + str3);
        } else {
            strAEQbTJ = str4 + " " + c20064gZo.getNewProxyInstance() + " " + str3;
        }
        c19863gSc4.setContent(strAEQbTJ);
    }

    public static final Unit EZpvd(gRO gro, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.Object tag = view.getTag();
        C20064gZo c20064gZo = tag instanceof C20064gZo ? (C20064gZo) tag : null;
        if (c20064gZo != null) {
            gro.EZpvd.invoke(c20064gZo);
        }
        return Unit.INSTANCE;
    }
}
