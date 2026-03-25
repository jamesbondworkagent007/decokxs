package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.dex.trade.order.domain.model.OrderSide;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hbs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22255hbs extends AbstractC31189lpN<C20064gZo, hCY> {
    public static final Activity Companion = new Activity(null);
    public final Function1<C20064gZo, Unit> AEQbTJ;
    public final Function1<C20064gZo, Unit> copydefault;

    /* JADX INFO: renamed from: o.hbs$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrderStrategyType.values().length];
            try {
                iArr[OrderStrategyType.Market.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OrderStrategyType.Limit.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderStrategyType.Tp.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderStrategyType.Sl.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderStrategyType.CopyTrade.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[OrderSide.values().length];
            try {
                iArr2[OrderSide.None.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[OrderSide.Buy.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[OrderSide.Sell.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            OLrzqt = iArr2;
            int[] iArr3 = new int[OrderSubStatus.values().length];
            try {
                iArr3[OrderSubStatus.Open.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr3[OrderSubStatus.Pending.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr3[OrderSubStatus.Cancelling.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr3[OrderSubStatus.Cancelled.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[OrderSubStatus.Completed.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr3[OrderSubStatus.Failed.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr3[OrderSubStatus.Expired.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr3[OrderSubStatus.Suspended.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr3[OrderSubStatus.Creating.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            AEQbTJ = iArr3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.gZo, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.gZo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C22255hbs(@NotNull Function1<? super C20064gZo, Unit> function1, Function1<? super C20064gZo, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
        this.AEQbTJ = function12;
    }

    /* JADX INFO: renamed from: o.hbs$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hbs.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.lang.String OLrzqt(int i) {
            return "web3_dex_history_order_" + i;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC31189lpN
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public hCY KWHzl(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        hCY hcyCopydefault = hCY.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hcyCopydefault, "");
        return hcyCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/lpN$Activity;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC31189lpN, o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull AbstractC31189lpN<C20064gZo, hCY>.Activity activity, @NotNull C20064gZo c20064gZo) {
        java.lang.String strFetchVPNInfo;
        java.lang.String newProxyInstance;
        java.lang.String strOLrzqt;
        java.lang.String strAYXKKw;
        java.lang.String localizedNumberWithSymbol$default;
        java.lang.String localizedNumber$default;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String strAEQbTJ;
        int iLossAlternativeColor$default;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String strOLrzqt2;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(c20064gZo, "");
        hCY hcy = (hCY) activity.KWHzl();
        hcy.getRoot().setContentDescription(Companion.OLrzqt(activity.getLayoutPosition()));
        if (c20064gZo.AhwBna().length() > 0) {
            hcy.isConnected.setText(c20064gZo.AhwBna());
            AppCompatTextView appCompatTextView = hcy.isConnected;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(0);
        } else {
            AppCompatTextView appCompatTextView2 = hcy.isConnected;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            appCompatTextView2.setVisibility(8);
        }
        java.lang.String strFARcdN = c20064gZo.fARcdN();
        boolean z = (strFARcdN != null && strFARcdN.length() > 0) || ((strFetchVPNInfo = c20064gZo.fetchVPNInfo()) != null && strFetchVPNInfo.length() > 0);
        AppCompatTextView appCompatTextView3 = hcy.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        appCompatTextView3.setVisibility(z ? 0 : 8);
        AppCompatTextView appCompatTextView4 = hcy.values;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
        appCompatTextView4.setVisibility(z ? 0 : 8);
        int i = Application.copydefault[c20064gZo.djBIcL().ordinal()];
        if (i == 1) {
            AppCompatTextView appCompatTextView5 = hcy.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView5, "");
            appCompatTextView5.setVisibility(8);
            AppCompatTextView appCompatTextView6 = hcy.fARcdN;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView6, "");
            appCompatTextView6.setVisibility(8);
            hcy.djBIcL.setText(C33070mpX.AYXKKw(c20064gZo.djBIcL().getStrRes()));
            Unit unit = Unit.INSTANCE;
        } else if (i == 2) {
            AppCompatTextView appCompatTextView7 = hcy.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView7, "");
            appCompatTextView7.setVisibility(0);
            AppCompatTextView appCompatTextView8 = hcy.fARcdN;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView8, "");
            appCompatTextView8.setVisibility(0);
            hcy.djBIcL.setText(C33070mpX.AYXKKw(c20064gZo.djBIcL().getStrRes()));
            hcy.AuCTel.setText(activity.itemView.getContext().getString(C23274hvD.Fragment.getState));
            AppCompatTextView appCompatTextView9 = hcy.AkhnZx;
            if (c20064gZo.AxsJAY().length() > 0) {
                strOLrzqt2 = copydefault(c20064gZo);
            } else {
                strOLrzqt2 = OLrzqt(c20064gZo);
            }
            appCompatTextView9.setText(strOLrzqt2);
            Unit unit2 = Unit.INSTANCE;
        } else if (i == 3) {
            AppCompatTextView appCompatTextView10 = hcy.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView10, "");
            appCompatTextView10.setVisibility(0);
            AppCompatTextView appCompatTextView11 = hcy.fARcdN;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView11, "");
            appCompatTextView11.setVisibility(0);
            hcy.djBIcL.setText(C33070mpX.AYXKKw(c20064gZo.djBIcL().getStrRes()));
            hcy.AkhnZx.setText(OLrzqt(c20064gZo));
            Unit unit3 = Unit.INSTANCE;
        } else if (i == 4) {
            AppCompatTextView appCompatTextView12 = hcy.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView12, "");
            appCompatTextView12.setVisibility(0);
            AppCompatTextView appCompatTextView13 = hcy.fARcdN;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView13, "");
            appCompatTextView13.setVisibility(0);
            hcy.djBIcL.setText(C33070mpX.AYXKKw(c20064gZo.djBIcL().getStrRes()));
            hcy.AkhnZx.setText(OLrzqt(c20064gZo));
            Unit unit4 = Unit.INSTANCE;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            boolean z2 = c20064gZo.AwvSrB().length() > 0 || c20064gZo.zLjUOn().length() > 0 || c20064gZo.AxsJAY().length() > 0;
            AppCompatTextView appCompatTextView14 = hcy.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView14, "");
            appCompatTextView14.setVisibility(z2 ? 0 : 8);
            AppCompatTextView appCompatTextView15 = hcy.fARcdN;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView15, "");
            appCompatTextView15.setVisibility(z2 ? 0 : 8);
            hcy.djBIcL.setText(C33070mpX.AYXKKw(c20064gZo.djBIcL().getStrRes()));
            Unit unit5 = Unit.INSTANCE;
        }
        int i2 = Application.OLrzqt[c20064gZo.AubY().ordinal()];
        if (i2 == 1) {
            boolean z3 = c20064gZo.AuCTelauCTel() && !c20064gZo.KWHzl();
            AppCompatTextView appCompatTextView16 = hcy.ejfBZ;
            if (z3) {
                newProxyInstance = c20064gZo.DbNXlk();
            } else {
                newProxyInstance = c20064gZo.getNewProxyInstance();
            }
            appCompatTextView16.setText(newProxyInstance);
            hcy.AYXKKw.OLrzqt(c20064gZo.AkhnZx(), c20064gZo.getFieldNames(), c20064gZo.copydefault());
            AppCompatTextView appCompatTextView17 = hcy.AuCTel;
            appCompatTextView17.setText(appCompatTextView17.getContext().getString(C23274hvD.Fragment.getState));
            if (c20064gZo.djBIcL() != OrderStrategyType.Market) {
                C55251xgS c55251xgS = hcy.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
                c55251xgS.setVisibility(0);
                if (c20064gZo.zuBGHE()) {
                    hcy.gEmmrt.setOKDSStyle(14);
                    hcy.djBIcL.setOKDSStyle(14);
                } else {
                    hcy.gEmmrt.setOKDSStyle(13);
                    hcy.djBIcL.setOKDSStyle(13);
                }
                hcy.gEmmrt.setText(c20064gZo.wlaJM());
            } else {
                hcy.djBIcL.setOKDSStyle(14);
                C55251xgS c55251xgS2 = hcy.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
                c55251xgS2.setVisibility(8);
            }
            AppCompatTextView appCompatTextView18 = hcy.AkhnZx;
            if (c20064gZo.AxsJAY().length() > 0) {
                strOLrzqt = copydefault(c20064gZo);
            } else {
                strOLrzqt = OLrzqt(c20064gZo);
            }
            appCompatTextView18.setText(strOLrzqt);
            Unit unit6 = Unit.INSTANCE;
        } else if (i2 == 2) {
            hcy.AYXKKw.OLrzqt(c20064gZo.AkhnZx(), c20064gZo.getFieldNames(), c20064gZo.copydefault());
            hcy.ejfBZ.setText(c20064gZo.getNewProxyInstance());
            hcy.AuCTel.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.PlaybackStateCompatActions));
            hcy.djBIcL.setOKDSStyle(14);
            hcy.gEmmrt.setOKDSStyle(14);
            C55251xgS c55251xgS3 = hcy.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c55251xgS3, "");
            c55251xgS3.setVisibility(0);
            C55251xgS c55251xgS4 = hcy.gEmmrt;
            if (copydefault(c20064gZo.djBIcL())) {
                string = c20064gZo.wlaJM();
            } else {
                string = hcy.gEmmrt.getContext().getString(C23274hvD.Fragment.fJNWhG);
                Intrinsics.checkNotNullExpressionValue(string, "");
            }
            c55251xgS4.setText(string);
            Unit unit7 = Unit.INSTANCE;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            hcy.AYXKKw.OLrzqt(c20064gZo.getFieldNames(), c20064gZo.AkhnZx(), c20064gZo.copydefault());
            hcy.ejfBZ.setText(c20064gZo.DbNXlk());
            hcy.AuCTel.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal));
            hcy.djBIcL.setOKDSStyle(13);
            hcy.gEmmrt.setOKDSStyle(13);
            C55251xgS c55251xgS5 = hcy.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c55251xgS5, "");
            c55251xgS5.setVisibility(0);
            C55251xgS c55251xgS6 = hcy.gEmmrt;
            if (copydefault(c20064gZo.djBIcL())) {
                string2 = c20064gZo.wlaJM();
            } else {
                string2 = hcy.gEmmrt.getContext().getString(C23274hvD.Fragment.AuCTel);
                Intrinsics.checkNotNullExpressionValue(string2, "");
            }
            c55251xgS6.setText(string2);
            Unit unit8 = Unit.INSTANCE;
        }
        switch (Application.AEQbTJ[c20064gZo.valueOf().ordinal()]) {
            case 1:
                hcy.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                Unit unit9 = Unit.INSTANCE;
                break;
            case 2:
                hcy.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq));
                Unit unit10 = Unit.INSTANCE;
                break;
            case 3:
                hcy.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                Unit unit11 = Unit.INSTANCE;
                break;
            case 4:
                hcy.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                Unit unit12 = Unit.INSTANCE;
                break;
            case 5:
                hcy.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ));
                Unit unit13 = Unit.INSTANCE;
                break;
            case 6:
                hcy.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
                Unit unit14 = Unit.INSTANCE;
                break;
            case 7:
                hcy.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                Unit unit15 = Unit.INSTANCE;
                break;
            case 8:
                hcy.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq));
                Unit unit16 = Unit.INSTANCE;
                break;
            case 9:
                hcy.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gdmIOq));
                Unit unit17 = Unit.INSTANCE;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        hcy.fetchVPNInfo.setText(C33070mpX.AYXKKw(c20064gZo.valueOf().getTextRes()));
        AppCompatTextView appCompatTextView19 = hcy.fIwbmz;
        if (c20064gZo.valueOf().isTerminalState()) {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.fromCustomAction);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.getPosition);
        }
        appCompatTextView19.setText(strAYXKKw);
        AppCompatTextView appCompatTextView20 = hcy.valueOf;
        java.lang.String strValues = c20064gZo.values();
        java.lang.String str3 = strValues.length() > 0 ? strValues : null;
        if (str3 == null || (localizedNumberWithSymbol$default = C23322hvz.toLocalizedNumberWithSymbol$default(str3, c20064gZo.DbNXlk(), false, null, false, false, 22, null)) == null) {
            localizedNumberWithSymbol$default = "-- " + c20064gZo.DbNXlk();
        }
        appCompatTextView20.setText(localizedNumberWithSymbol$default);
        java.lang.String strAuCTel = c20064gZo.AuCTel();
        java.lang.String str4 = strAuCTel.length() > 0 ? strAuCTel : null;
        if (str4 == null || (localizedNumber$default = C23322hvz.toLocalizedNumber$default(str4, false, (RoundingMode) null, false, false, 15, (java.lang.Object) null)) == null) {
            localizedNumber$default = "--";
        }
        java.lang.String strFIwbmz = c20064gZo.fIwbmz();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strFIwbmz)) {
            str = "(";
            str2 = str + C23322hvz.toLocalizedCurrencyNumberWithPrefix$default(strFIwbmz, false, null, true, false, 11, null) + ")";
        } else {
            str = "(";
            str2 = "";
        }
        AppCompatTextView appCompatTextView21 = hcy.DbNXlk;
        if (C55296xhK.OLrzqt(C43246rlf.OLrzqt.valueOf())) {
            pTF ptf = pTF.KWHzl;
            strAEQbTJ = ptf.AEQbTJ(ptf.AEQbTJ(c20064gZo.getNewProxyInstance() + " " + localizedNumber$default) + " " + str2);
        } else {
            strAEQbTJ = localizedNumber$default + " " + c20064gZo.getNewProxyInstance() + " " + str2;
        }
        appCompatTextView21.setText(strAEQbTJ);
        java.lang.String strFetchVPNInfo2 = c20064gZo.fetchVPNInfo();
        java.lang.String str5 = strFetchVPNInfo2 == null ? "" : strFetchVPNInfo2;
        java.lang.String scientificCurrency$default = C33129mqd.OLrzqt((java.lang.CharSequence) str5) ? C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str5, true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null) : "";
        java.lang.String strFARcdN2 = c20064gZo.fARcdN();
        java.lang.String str6 = strFARcdN2 == null ? "" : strFARcdN2;
        java.lang.String str7 = C33129mqd.OLrzqt((java.lang.CharSequence) str6) ? str + C23311hvo.formatPercent$default(str6, false, 0, 0, null, null, 31, null) + ")" : "";
        if (scientificCurrency$default.length() > 0) {
            str7 = " " + str7;
        }
        hcy.values.setText(scientificCurrency$default + str7);
        if (C23313hvq.EZpvd(c20064gZo.fetchVPNInfo(), 0)) {
            android.content.Context context = hcy.values.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iLossAlternativeColor$default = C33508mxl.profitAlternativeColor$default(context, 0.0f, 1, null);
        } else {
            android.content.Context context2 = hcy.values.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iLossAlternativeColor$default = C33508mxl.lossAlternativeColor$default(context2, 0.0f, 1, null);
        }
        hcy.values.setTextColor(iLossAlternativeColor$default);
        C55251xgS c55251xgS7 = hcy.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55251xgS7, "");
        c55251xgS7.setVisibility((c20064gZo.gEmmrt() && C22416heu.zsXlph()) ? 0 : 8);
        android.view.View view = hcy.EZpvd;
        Intrinsics.checkNotNullExpressionValue(view, "");
        int size = getAdapter().getItems().size();
        java.util.List<?> items = getAdapter().getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        view.setVisibility(size - 1 != CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends C20064gZo>) ((java.util.List<? extends java.lang.Object>) items), c20064gZo) ? 0 : 8);
        ConstraintLayout root = hcy.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, this, c20064gZo));
        for (android.view.View view2 : yDY.gEmmrt(hcy.AYXKKw, hcy.ejfBZ, hcy.gEmmrt, hcy.djBIcL)) {
            view2.setOnClickListener(new StateListAnimator(view2, 1000L, this, c20064gZo));
        }
    }

    /* JADX INFO: renamed from: o.hbs$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C20064gZo EZpvd;
        public final /* synthetic */ C22255hbs KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C22255hbs c22255hbs, C20064gZo c20064gZo) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c22255hbs;
            this.EZpvd = c20064gZo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.copydefault.invoke(this.EZpvd);
            }
        }
    }

    /* JADX INFO: renamed from: o.hbs$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C22255hbs KWHzl;
        public final /* synthetic */ C20064gZo OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C22255hbs c22255hbs, C20064gZo c20064gZo) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c22255hbs;
            this.OLrzqt = c20064gZo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function1 function1 = this.KWHzl.AEQbTJ;
                if (function1 != null) {
                    function1.invoke(this.OLrzqt);
                }
            }
        }
    }

    public final java.lang.String copydefault(C20064gZo c20064gZo) {
        return C23322hvz.toLocalizedNumberWithSymbol$default("1", c20064gZo.DbNXlk(), false, null, false, false, 30, null) + " = " + C23322hvz.toLocalizedNumberWithSymbol$default(c20064gZo.AxsJAY(), c20064gZo.getNewProxyInstance(), false, null, true, false, 22, null);
    }

    public final java.lang.String OLrzqt(C20064gZo c20064gZo) {
        java.lang.String scientificCurrency$default;
        java.lang.String str;
        java.lang.String strAwvSrB = c20064gZo.AwvSrB();
        if (strAwvSrB.length() <= 0) {
            strAwvSrB = null;
        }
        java.lang.String str2 = strAwvSrB;
        if (str2 == null || (scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str2, true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null)) == null) {
            scientificCurrency$default = "--";
        }
        java.lang.String strZLjUOn = c20064gZo.zLjUOn();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strZLjUOn)) {
            str = " / " + C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, strZLjUOn, true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        } else {
            str = "";
        }
        return scientificCurrency$default + str;
    }

    public final boolean copydefault(OrderStrategyType orderStrategyType) {
        return orderStrategyType.getType() == OrderStrategyType.Limit.getType() || orderStrategyType.getType() == OrderStrategyType.Tp.getType() || orderStrategyType.getType() == OrderStrategyType.Sl.getType();
    }
}
