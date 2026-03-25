package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import com.okinc.mln_ui.ui.okkit.UdMath;
import com.okinc.planet.biz_userprofile.data.PlanetProfileShareBean;
import com.okinc.planet.biz_userprofile.view.share.FeedProfileShareView$ProfilePnlShareView$initShareView$1;
import com.okinc.planet.biz_userprofile.view.share.FeedProfileShareView$initShareView$1;
import com.okinc.planet.biz_userprofile.view.share.HistoryTotalPnlChartDataPoint;
import com.okinc.planet.biz_userprofile.view.share.HistoryTotalPnlData;
import com.okinc.planet.biz_userprofile.view.share.PlanetShareView;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import o.C55159xeg;
import o.tLR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tLH extends tLI {
    public final tLR.ActionBar.Activity KWHzl;
    public final AbstractActivityC33041mov copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/tLR$ActionBar; */
    /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/tLR; */
    @Override // o.tLI, com.okinc.planet.biz_userprofile.view.share.PlanetShareView
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public tLR.ActionBar.Activity copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.tLI, com.okinc.planet.biz_userprofile.view.share.PlanetShareView
    public AbstractActivityC33041mov OLrzqt() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tLH(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull tLR.ActionBar.Activity activity) {
        super(abstractActivityC33041mov, activity);
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(activity, "");
        this.copydefault = abstractActivityC33041mov;
        this.KWHzl = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.tLI, com.okinc.planet.biz_userprofile.view.share.PlanetShareView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull PlanetProfileShareBean planetProfileShareBean, boolean z, boolean z2, @NotNull Continuation<? super PlanetShareView.TaskDescription> continuation) throws java.lang.Throwable {
        FeedProfileShareView$initShareView$1 feedProfileShareView$initShareView$1;
        boolean z3;
        tLH tlh;
        java.lang.String strAYXKKw;
        PlanetProfileShareBean planetProfileShareBean2;
        tOQ toq;
        java.lang.String strOLrzqt;
        java.lang.String strDjBIcL;
        java.lang.String strKWHzl;
        if (continuation instanceof FeedProfileShareView$initShareView$1) {
            feedProfileShareView$initShareView$1 = (FeedProfileShareView$initShareView$1) continuation;
            int i = feedProfileShareView$initShareView$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                feedProfileShareView$initShareView$1.label = i - Integer.MIN_VALUE;
            } else {
                feedProfileShareView$initShareView$1 = new FeedProfileShareView$initShareView$1(this, continuation);
            }
        }
        java.lang.Object obj = feedProfileShareView$initShareView$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = feedProfileShareView$initShareView$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            feedProfileShareView$initShareView$1.L$0 = this;
            feedProfileShareView$initShareView$1.L$1 = planetProfileShareBean;
            feedProfileShareView$initShareView$1.Z$0 = z;
            feedProfileShareView$initShareView$1.Z$1 = z2;
            feedProfileShareView$initShareView$1.label = 1;
            if (super.copydefault(planetProfileShareBean, z, z2, feedProfileShareView$initShareView$1) == objCopydefault) {
                return objCopydefault;
            }
            z3 = z2;
            tlh = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                toq = (tOQ) feedProfileShareView$initShareView$1.L$3;
                planetProfileShareBean2 = (PlanetProfileShareBean) feedProfileShareView$initShareView$1.L$1;
                tlh = (tLH) feedProfileShareView$initShareView$1.L$0;
                C56391yDq.AEQbTJ(obj);
                toq.AhwBna.setText(C46196tLj.EZpvd.KWHzl(planetProfileShareBean2));
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) tlh.copydefault().AEQbTJ()) || C33129mqd.OLrzqt((java.lang.CharSequence) planetProfileShareBean2.OLrzqt())) {
                    toq.AEQbTJ.setVisibility(0);
                    android.widget.TextView textView = toq.AEQbTJ;
                    if (!C33129mqd.OLrzqt((java.lang.CharSequence) tlh.copydefault().AEQbTJ())) {
                        strOLrzqt = tlh.copydefault().AEQbTJ();
                    } else {
                        strOLrzqt = planetProfileShareBean2.OLrzqt();
                        if (strOLrzqt == null) {
                            strOLrzqt = "";
                        }
                    }
                    textView.setText(strOLrzqt);
                } else {
                    toq.AEQbTJ.setVisibility(8);
                }
                android.widget.TextView textView2 = toq.EZpvd;
                strDjBIcL = planetProfileShareBean2.djBIcL();
                if (strDjBIcL == null) {
                    strDjBIcL = "0";
                }
                textView2.setText(UdMath.formatNumberKmb(strDjBIcL, C56443yFo.AEQbTJ(1), 2, 0, 0));
                android.widget.TextView textView3 = toq.copydefault;
                strKWHzl = planetProfileShareBean2.KWHzl();
                if (strKWHzl == null) {
                    strKWHzl = "0";
                }
                textView3.setText(UdMath.formatNumberKmb(strKWHzl, C56443yFo.AEQbTJ(1), 2, 0, 0));
                android.widget.TextView textView4 = toq.AYXKKw;
                java.lang.String strCopydefault = planetProfileShareBean2.copydefault();
                textView4.setText(UdMath.formatNumberKmb(strCopydefault != null ? strCopydefault : "0", C56443yFo.AEQbTJ(1), 2, 0, 0));
                ConstraintLayout constraintLayoutEZpvd = tlh.gEmmrt().EZpvd();
                Intrinsics.checkNotNullExpressionValue(constraintLayoutEZpvd, "");
                int id = tlh.gEmmrt().EZpvd.getId();
                java.lang.String strValues = planetProfileShareBean2.values();
                return new PlanetShareView.TaskDescription(constraintLayoutEZpvd, id, tLS.AEQbTJ(strValues != null ? strValues : ""), null);
            }
            boolean z4 = feedProfileShareView$initShareView$1.Z$1;
            z = feedProfileShareView$initShareView$1.Z$0;
            planetProfileShareBean = (PlanetProfileShareBean) feedProfileShareView$initShareView$1.L$1;
            tLH tlh2 = (tLH) feedProfileShareView$initShareView$1.L$0;
            C56391yDq.AEQbTJ(obj);
            z3 = z4;
            tlh = tlh2;
        }
        android.view.ViewStub viewStub = tlh.gEmmrt().KWHzl;
        viewStub.setLayoutResource(C47501trL.Application.RVsVBY);
        tOQ toqOLrzqt = tOQ.OLrzqt(viewStub.inflate());
        tlh.gEmmrt().valueOf.AEQbTJ();
        if (z3) {
            toqOLrzqt.KWHzl.setVisibility(0);
        } else {
            toqOLrzqt.KWHzl.setVisibility(8);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) planetProfileShareBean.gEmmrt())) {
            strAYXKKw = planetProfileShareBean.gEmmrt();
        } else {
            strAYXKKw = planetProfileShareBean.AYXKKw();
            if (strAYXKKw == null) {
                strAYXKKw = "";
            }
        }
        AppCompatImageView appCompatImageView = toqOLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        feedProfileShareView$initShareView$1.L$0 = tlh;
        feedProfileShareView$initShareView$1.L$1 = planetProfileShareBean;
        feedProfileShareView$initShareView$1.L$2 = toqOLrzqt;
        feedProfileShareView$initShareView$1.L$3 = toqOLrzqt;
        feedProfileShareView$initShareView$1.label = 2;
        if (tlh.OLrzqt(appCompatImageView, z, strAYXKKw, feedProfileShareView$initShareView$1) == objCopydefault) {
            return objCopydefault;
        }
        planetProfileShareBean2 = planetProfileShareBean;
        toq = toqOLrzqt;
        toq.AhwBna.setText(C46196tLj.EZpvd.KWHzl(planetProfileShareBean2));
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) tlh.copydefault().AEQbTJ())) {
            toq.AEQbTJ.setVisibility(0);
            android.widget.TextView textView5 = toq.AEQbTJ;
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) tlh.copydefault().AEQbTJ())) {
            }
            textView5.setText(strOLrzqt);
        }
        android.widget.TextView textView22 = toq.EZpvd;
        strDjBIcL = planetProfileShareBean2.djBIcL();
        if (strDjBIcL == null) {
        }
        textView22.setText(UdMath.formatNumberKmb(strDjBIcL, C56443yFo.AEQbTJ(1), 2, 0, 0));
        android.widget.TextView textView32 = toq.copydefault;
        strKWHzl = planetProfileShareBean2.KWHzl();
        if (strKWHzl == null) {
        }
        textView32.setText(UdMath.formatNumberKmb(strKWHzl, C56443yFo.AEQbTJ(1), 2, 0, 0));
        android.widget.TextView textView42 = toq.AYXKKw;
        java.lang.String strCopydefault2 = planetProfileShareBean2.copydefault();
        textView42.setText(UdMath.formatNumberKmb(strCopydefault2 != null ? strCopydefault2 : "0", C56443yFo.AEQbTJ(1), 2, 0, 0));
        ConstraintLayout constraintLayoutEZpvd2 = tlh.gEmmrt().EZpvd();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutEZpvd2, "");
        int id2 = tlh.gEmmrt().EZpvd.getId();
        java.lang.String strValues2 = planetProfileShareBean2.values();
        return new PlanetShareView.TaskDescription(constraintLayoutEZpvd2, id2, tLS.AEQbTJ(strValues2 != null ? strValues2 : ""), null);
    }

    @Override // o.tLI
    public void KWHzl() {
        super.KWHzl();
        gEmmrt().OLrzqt.OLrzqt.setImageDrawable(C33070mpX.KWHzl(C47501trL.ActionBar.zsXlph));
    }

    public static final class Activity extends tLI {
        public static final int copydefault = AbstractActivityC33041mov.$stable;
        public final tLR.ActionBar.StateListAnimator EZpvd;
        public final AbstractActivityC33041mov OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/tLR$ActionBar; */
        /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/tLR; */
        @Override // o.tLI, com.okinc.planet.biz_userprofile.view.share.PlanetShareView
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public tLR.ActionBar.StateListAnimator copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.tLI, com.okinc.planet.biz_userprofile.view.share.PlanetShareView
        public AbstractActivityC33041mov OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull tLR.ActionBar.StateListAnimator stateListAnimator) {
            super(abstractActivityC33041mov, stateListAnimator);
            Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            this.OLrzqt = abstractActivityC33041mov;
            this.EZpvd = stateListAnimator;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.tUv.getUrl$default(o.tUv, android.content.Context, java.lang.String, boolean, int, java.lang.Object):java.lang.String */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x017a  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x018f  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0194  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0259  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x027c  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x027f  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x02a3  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x02c8  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        @Override // o.tLI, com.okinc.planet.biz_userprofile.view.share.PlanetShareView
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public java.lang.Object copydefault(@NotNull PlanetProfileShareBean planetProfileShareBean, boolean z, boolean z2, @NotNull Continuation<? super PlanetShareView.TaskDescription> continuation) throws java.lang.Throwable {
            FeedProfileShareView$ProfilePnlShareView$initShareView$1 feedProfileShareView$ProfilePnlShareView$initShareView$1;
            Activity activity;
            tON ton;
            PlanetProfileShareBean planetProfileShareBean2;
            tON ton2;
            android.view.ViewStub viewStub;
            Activity activity2;
            LinearLayoutCompat root;
            java.lang.String strAhwBna;
            java.util.ArrayList<HistoryTotalPnlData> arrayListDbNXlk;
            java.util.List<HistoryTotalPnlChartDataPoint> listAhwBna;
            PlanetProfileShareBean planetProfileShareBean3 = planetProfileShareBean;
            if (continuation instanceof FeedProfileShareView$ProfilePnlShareView$initShareView$1) {
                feedProfileShareView$ProfilePnlShareView$initShareView$1 = (FeedProfileShareView$ProfilePnlShareView$initShareView$1) continuation;
                int i = feedProfileShareView$ProfilePnlShareView$initShareView$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    feedProfileShareView$ProfilePnlShareView$initShareView$1.label = i - Integer.MIN_VALUE;
                } else {
                    feedProfileShareView$ProfilePnlShareView$initShareView$1 = new FeedProfileShareView$ProfilePnlShareView$initShareView$1(this, continuation);
                }
            }
            java.lang.Object obj = feedProfileShareView$ProfilePnlShareView$initShareView$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i2 = feedProfileShareView$ProfilePnlShareView$initShareView$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                feedProfileShareView$ProfilePnlShareView$initShareView$1.L$0 = this;
                feedProfileShareView$ProfilePnlShareView$initShareView$1.L$1 = planetProfileShareBean3;
                feedProfileShareView$ProfilePnlShareView$initShareView$1.label = 1;
                if (super.copydefault(planetProfileShareBean3, z, z2, feedProfileShareView$ProfilePnlShareView$initShareView$1) == objCopydefault) {
                    return objCopydefault;
                }
                activity = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ton2 = (tON) feedProfileShareView$ProfilePnlShareView$initShareView$1.L$4;
                    ton = (tON) feedProfileShareView$ProfilePnlShareView$initShareView$1.L$3;
                    viewStub = (android.view.ViewStub) feedProfileShareView$ProfilePnlShareView$initShareView$1.L$2;
                    planetProfileShareBean2 = (PlanetProfileShareBean) feedProfileShareView$ProfilePnlShareView$initShareView$1.L$1;
                    activity2 = (Activity) feedProfileShareView$ProfilePnlShareView$initShareView$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    ton2.copydefault.EZpvd.setImageDrawable((android.graphics.drawable.Drawable) obj);
                    ton2.copydefault.KWHzl.setText(C33070mpX.AYXKKw(C47501trL.Fragment.gGvvIC));
                    root = ton2.copydefault.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "");
                    if (root.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                        ViewGroup.LayoutParams layoutParams = root.getLayoutParams();
                        if (layoutParams != null) {
                            ((LinearLayout.LayoutParams) layoutParams).setMargins(0, 0, 0, C55298xhM.dp2px$default(16.0f, null, 1, null));
                        } else {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        }
                    }
                    strAhwBna = planetProfileShareBean2.AhwBna();
                    if (strAhwBna == null) {
                        strAhwBna = "";
                    }
                    android.widget.TextView textView = ton2.copydefault.AEQbTJ;
                    tTZ ttz = tTZ.EZpvd;
                    textView.setText(tTZ.getOrderRatioStr$default(ttz, tTZ.pnlFormatTruncate$default(ttz, strAhwBna, 0, 2, null), false, 2, null));
                    textView.setTextColor(activity2.OLrzqt(strAhwBna));
                    C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                    int i3 = c33512mxp.isConnected() != 0 ? C52761wXj.LoaderManager.DXXBbs : C52761wXj.LoaderManager.ODWQjV;
                    android.content.Context context = viewStub.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    android.content.Context contextKWHzl = C55374xij.KWHzl(context, 32, i3);
                    java.lang.String strAhwBna2 = planetProfileShareBean2.AhwBna();
                    boolean zCopydefault = C33129mqd.copydefault(strAhwBna2 == null ? C33129mqd.EZpvd(strAhwBna2) : null, C56443yFo.AEQbTJ(0));
                    kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(C56443yFo.AEQbTJ(C33512mxp.tradeRiseGraph$default(c33512mxp, contextKWHzl, 0.0f, 2, null)), C56443yFo.AEQbTJ(C33512mxp.tradeFallGraph$default(c33512mxp, contextKWHzl, 0.0f, 2, null)));
                    int iIntValue = ((java.lang.Number) pairOLrzqt.component1()).intValue();
                    int iIntValue2 = ((java.lang.Number) pairOLrzqt.component2()).intValue();
                    android.content.Context context2 = viewStub.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    C55159xeg.Application application = new C55159xeg.Application(iIntValue, iIntValue2, 0, 0, 0, 0, 0);
                    C55159xeg.StateListAnimator stateListAnimator = new C55159xeg.StateListAnimator(C56443yFo.AEQbTJ(C52761wXj.LoaderManager.QOLQEE), C56443yFo.OLrzqt(12.0f), C56443yFo.AEQbTJ(2), C56443yFo.AEQbTJ(C33070mpX.copydefault(C52761wXj.Activity.aUsmxb)));
                    Insets insets = Insets.NONE;
                    android.content.Context context3 = viewStub.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    int iCopydefault = C55298xhM.copydefault(1.0f, context3);
                    android.content.Context context4 = viewStub.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    C55159xeg.Activity activityKWHzl = new C55098xdY(context2, application, null, null, null, insets, stateListAnimator, null, null, null, null, null, null, null, new C55159xeg.TaskDescription(iIntValue, iIntValue2, iCopydefault, C55298xhM.copydefault(1.0f, context4)), C56443yFo.KWHzl(true), 16284, null).KWHzl();
                    C55159xeg c55159xeg = ton2.OLrzqt;
                    Application application2 = activity2.new Application(zCopydefault);
                    arrayListDbNXlk = planetProfileShareBean2.DbNXlk();
                    if (arrayListDbNXlk == null) {
                        listAhwBna = new java.util.ArrayList<>(C56403yEb.AYXKKw(arrayListDbNXlk, 10));
                        java.util.Iterator<T> it = arrayListDbNXlk.iterator();
                        while (it.hasNext()) {
                            listAhwBna.add(tLK.OLrzqt((HistoryTotalPnlData) it.next()));
                        }
                    } else {
                        listAhwBna = null;
                    }
                    if (listAhwBna == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    application2.EZpvd(listAhwBna);
                    c55159xeg.setAdapter(application2);
                    c55159xeg.setConfig(activityKWHzl);
                    c55159xeg.setHighestLowestLabelVisibility(false);
                    C55159xeg c55159xeg2 = ton2.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(c55159xeg2, "");
                    java.util.ArrayList<HistoryTotalPnlData> arrayListDbNXlk2 = planetProfileShareBean2.DbNXlk();
                    c55159xeg2.setVisibility((arrayListDbNXlk2 == null && arrayListDbNXlk2.isEmpty()) ? 4 : 0);
                    Intrinsics.copydefault(ton);
                    activity = activity2;
                    planetProfileShareBean3 = planetProfileShareBean2;
                    ConstraintLayout constraintLayoutEZpvd = activity.gEmmrt().EZpvd();
                    Intrinsics.checkNotNullExpressionValue(constraintLayoutEZpvd, "");
                    int id = activity.gEmmrt().EZpvd.getId();
                    java.lang.String strValues = planetProfileShareBean3.values();
                    return new PlanetShareView.TaskDescription(constraintLayoutEZpvd, id, tLS.AEQbTJ(strValues != null ? strValues : ""), null);
                }
                planetProfileShareBean3 = (PlanetProfileShareBean) feedProfileShareView$ProfilePnlShareView$initShareView$1.L$1;
                activity = (Activity) feedProfileShareView$ProfilePnlShareView$initShareView$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            activity.gEmmrt().valueOf.OLrzqt();
            activity.gEmmrt().copydefault.setVisibility(8);
            java.lang.String strAhwBna3 = planetProfileShareBean3.AhwBna();
            java.util.ArrayList<HistoryTotalPnlData> arrayListDbNXlk3 = planetProfileShareBean3.DbNXlk();
            if ((arrayListDbNXlk3 == null || arrayListDbNXlk3.isEmpty()) && C33129mqd.OLrzqt(C33129mqd.EZpvd(strAhwBna3), C56443yFo.AEQbTJ(0))) {
                activity.KWHzl();
                ConstraintLayout constraintLayoutEZpvd2 = activity.gEmmrt().EZpvd();
                Intrinsics.checkNotNullExpressionValue(constraintLayoutEZpvd2, "");
                int id2 = activity.gEmmrt().EZpvd.getId();
                java.lang.String strValues2 = planetProfileShareBean3.values();
                return new PlanetShareView.TaskDescription(constraintLayoutEZpvd2, id2, tLS.AEQbTJ(strValues2 != null ? strValues2 : ""), null);
            }
            android.view.ViewStub viewStub2 = activity.gEmmrt().KWHzl;
            viewStub2.setLayoutResource(C47501trL.Application.OTwTPd);
            tON tonOLrzqt = tON.OLrzqt(viewStub2.inflate());
            C46451tUv c46451tUvEZpvd = C46451tUv.Companion.EZpvd();
            android.content.Context context5 = viewStub2.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            PlanetShareView.StateListAnimator stateListAnimator2 = new PlanetShareView.StateListAnimator(C46451tUv.getUrl$default(c46451tUvEZpvd, context5, null, false, 6, null), C56443yFo.AEQbTJ(C55298xhM.dp2px$default(71.0f, null, 1, null)), C56443yFo.AEQbTJ(C55298xhM.dp2px$default(21.0f, null, 1, null)));
            AbstractActivityC33041mov abstractActivityC33041movOLrzqt = activity.OLrzqt();
            feedProfileShareView$ProfilePnlShareView$initShareView$1.L$0 = activity;
            feedProfileShareView$ProfilePnlShareView$initShareView$1.L$1 = planetProfileShareBean3;
            feedProfileShareView$ProfilePnlShareView$initShareView$1.L$2 = viewStub2;
            feedProfileShareView$ProfilePnlShareView$initShareView$1.L$3 = tonOLrzqt;
            feedProfileShareView$ProfilePnlShareView$initShareView$1.L$4 = tonOLrzqt;
            feedProfileShareView$ProfilePnlShareView$initShareView$1.label = 2;
            java.lang.Object objCopydefault2 = activity.copydefault(stateListAnimator2, abstractActivityC33041movOLrzqt, feedProfileShareView$ProfilePnlShareView$initShareView$1);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            ton = tonOLrzqt;
            planetProfileShareBean2 = planetProfileShareBean3;
            ton2 = ton;
            Activity activity3 = activity;
            viewStub = viewStub2;
            obj = objCopydefault2;
            activity2 = activity3;
            ton2.copydefault.EZpvd.setImageDrawable((android.graphics.drawable.Drawable) obj);
            ton2.copydefault.KWHzl.setText(C33070mpX.AYXKKw(C47501trL.Fragment.gGvvIC));
            root = ton2.copydefault.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            if (root.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            }
            strAhwBna = planetProfileShareBean2.AhwBna();
            if (strAhwBna == null) {
            }
            android.widget.TextView textView2 = ton2.copydefault.AEQbTJ;
            tTZ ttz2 = tTZ.EZpvd;
            textView2.setText(tTZ.getOrderRatioStr$default(ttz2, tTZ.pnlFormatTruncate$default(ttz2, strAhwBna, 0, 2, null), false, 2, null));
            textView2.setTextColor(activity2.OLrzqt(strAhwBna));
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            if (c33512mxp2.isConnected() != 0) {
            }
            android.content.Context context6 = viewStub.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            android.content.Context contextKWHzl2 = C55374xij.KWHzl(context6, 32, i3);
            java.lang.String strAhwBna22 = planetProfileShareBean2.AhwBna();
            boolean zCopydefault2 = C33129mqd.copydefault(strAhwBna22 == null ? C33129mqd.EZpvd(strAhwBna22) : null, C56443yFo.AEQbTJ(0));
            kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt(C56443yFo.AEQbTJ(C33512mxp.tradeRiseGraph$default(c33512mxp2, contextKWHzl2, 0.0f, 2, null)), C56443yFo.AEQbTJ(C33512mxp.tradeFallGraph$default(c33512mxp2, contextKWHzl2, 0.0f, 2, null)));
            int iIntValue3 = ((java.lang.Number) pairOLrzqt2.component1()).intValue();
            int iIntValue22 = ((java.lang.Number) pairOLrzqt2.component2()).intValue();
            android.content.Context context22 = viewStub.getContext();
            Intrinsics.checkNotNullExpressionValue(context22, "");
            C55159xeg.Application application3 = new C55159xeg.Application(iIntValue3, iIntValue22, 0, 0, 0, 0, 0);
            C55159xeg.StateListAnimator stateListAnimator3 = new C55159xeg.StateListAnimator(C56443yFo.AEQbTJ(C52761wXj.LoaderManager.QOLQEE), C56443yFo.OLrzqt(12.0f), C56443yFo.AEQbTJ(2), C56443yFo.AEQbTJ(C33070mpX.copydefault(C52761wXj.Activity.aUsmxb)));
            Insets insets2 = Insets.NONE;
            android.content.Context context32 = viewStub.getContext();
            Intrinsics.checkNotNullExpressionValue(context32, "");
            int iCopydefault2 = C55298xhM.copydefault(1.0f, context32);
            android.content.Context context42 = viewStub.getContext();
            Intrinsics.checkNotNullExpressionValue(context42, "");
            C55159xeg.Activity activityKWHzl2 = new C55098xdY(context22, application3, null, null, null, insets2, stateListAnimator3, null, null, null, null, null, null, null, new C55159xeg.TaskDescription(iIntValue3, iIntValue22, iCopydefault2, C55298xhM.copydefault(1.0f, context42)), C56443yFo.KWHzl(true), 16284, null).KWHzl();
            C55159xeg c55159xeg3 = ton2.OLrzqt;
            Application application22 = activity2.new Application(zCopydefault2);
            arrayListDbNXlk = planetProfileShareBean2.DbNXlk();
            if (arrayListDbNXlk == null) {
            }
            if (listAhwBna == null) {
            }
            application22.EZpvd(listAhwBna);
            c55159xeg3.setAdapter(application22);
            c55159xeg3.setConfig(activityKWHzl2);
            c55159xeg3.setHighestLowestLabelVisibility(false);
            C55159xeg c55159xeg22 = ton2.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55159xeg22, "");
            java.util.ArrayList<HistoryTotalPnlData> arrayListDbNXlk22 = planetProfileShareBean2.DbNXlk();
            if (arrayListDbNXlk22 == null) {
                c55159xeg22.setVisibility((arrayListDbNXlk22 == null && arrayListDbNXlk22.isEmpty()) ? 4 : 0);
                Intrinsics.copydefault(ton);
                activity = activity2;
                planetProfileShareBean3 = planetProfileShareBean2;
            }
            ConstraintLayout constraintLayoutEZpvd22 = activity.gEmmrt().EZpvd();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutEZpvd22, "");
            int id22 = activity.gEmmrt().EZpvd.getId();
            java.lang.String strValues22 = planetProfileShareBean3.values();
            return new PlanetShareView.TaskDescription(constraintLayoutEZpvd22, id22, tLS.AEQbTJ(strValues22 != null ? strValues22 : ""), null);
        }

        @Override // o.tLI
        public void KWHzl() {
            super.KWHzl();
            gEmmrt().OLrzqt.OLrzqt.setImageDrawable(C33070mpX.KWHzl(C47501trL.ActionBar.wlaJM));
        }

        public final class Application extends C55159xeg.ActionBar<HistoryTotalPnlChartDataPoint> {
            public java.util.List<HistoryTotalPnlChartDataPoint> AEQbTJ;
            public final boolean copydefault;

            @Override // o.C55159xeg.ActionBar
            public float AEQbTJ() {
                return 1.0f;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/xeq;)Ljava/lang/String; */
            @Override // o.C55159xeg.ActionBar
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public java.lang.String AEQbTJ(@NotNull HistoryTotalPnlChartDataPoint historyTotalPnlChartDataPoint) {
                Intrinsics.checkNotNullParameter(historyTotalPnlChartDataPoint, "");
                return "";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/xeq;)Z */
            @Override // o.C55159xeg.ActionBar
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public boolean OLrzqt(HistoryTotalPnlChartDataPoint historyTotalPnlChartDataPoint) {
                return this.copydefault;
            }

            public Application(boolean z) {
                this.copydefault = z;
            }

            public final void EZpvd(@NotNull java.util.List<HistoryTotalPnlChartDataPoint> list) {
                Intrinsics.checkNotNullParameter(list, "");
                this.AEQbTJ = list;
                copydefault();
                KWHzl(list, false);
            }

            @Override // o.C55159xeg.ActionBar
            public C55170xer OLrzqt() {
                java.util.List<HistoryTotalPnlChartDataPoint> list = this.AEQbTJ;
                if (list == null || list.isEmpty()) {
                    return new C55170xer(0.0f, 1.0f);
                }
                return C55170xer.Companion.copydefault();
            }

            /* JADX DEBUG: Class process forced to load method for inline: o.tTZ.pnlFormatTruncate$default(o.tTZ, java.lang.Object, int, int, java.lang.Object):java.lang.String */
            /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/xeq;)Ljava/lang/String; */
            @Override // o.C55159xeg.ActionBar
            public java.lang.String EZpvd(@NotNull HistoryTotalPnlChartDataPoint historyTotalPnlChartDataPoint) {
                Intrinsics.checkNotNullParameter(historyTotalPnlChartDataPoint, "");
                tTZ ttz = tTZ.EZpvd;
                return tTZ.getOrderRatioStr$default(ttz, tTZ.pnlFormatTruncate$default(ttz, C33129mqd.gEmmrt(historyTotalPnlChartDataPoint.KWHzl()), 0, 2, null), false, 2, null);
            }
        }
    }
}
