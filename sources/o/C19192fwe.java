package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.defi.wallet.mine.search.data.model.TagEventProperty;
import com.okinc.business.defi.wallet.mine.search.data.model.TagWrapper;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19192fwe extends RecyclerView.ViewHolder {
    public final Function1<C18982fsg, Unit> AEQbTJ;
    public final C18955fsF AhwBna;
    public final Function1<C18982fsg, Unit> EZpvd;
    public final Function1<TagEventProperty, Unit> KWHzl;
    public final C17178exr OLrzqt;
    public final Function1<java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsg, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsg, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.defi.wallet.mine.search.data.model.TagEventProperty, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19192fwe(@NotNull C17178exr c17178exr, @NotNull Function1<? super C18982fsg, Unit> function1, @NotNull Function1<? super C18982fsg, Unit> function12, @NotNull Function1<? super java.lang.String, Unit> function13, @NotNull Function1<? super TagEventProperty, Unit> function14) {
        super(c17178exr.getRoot());
        Intrinsics.checkNotNullParameter(c17178exr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function14, "");
        this.OLrzqt = c17178exr;
        this.AEQbTJ = function1;
        this.EZpvd = function12;
        this.copydefault = function13;
        this.KWHzl = function14;
        this.AhwBna = new C18955fsF();
    }

    private final android.content.Context KWHzl() {
        android.content.Context context = this.OLrzqt.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return context;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0402  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@NotNull C18982fsg c18982fsg) {
        int iTradeRiseDefault$default;
        Intrinsics.checkNotNullParameter(c18982fsg, "");
        C17178exr c17178exr = this.OLrzqt;
        try {
            ConstraintLayout root = c17178exr.getRoot();
            long jOLrzqt = c18982fsg.copydefault().OLrzqt();
            java.lang.String lowerCase = c18982fsg.copydefault().fetchVPNInfo().toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            root.setContentDescription("web3_search_component_searchbar_result_token_" + jOLrzqt + "_" + lowerCase);
        } catch (java.lang.Exception e) {
            pUU.copydefault("zqh", "set contentDescription error:" + e.getMessage());
        }
        ShapeableImageView shapeableImageView = c17178exr.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "");
        java.lang.String strDbNXlk = c18982fsg.copydefault().DbNXlk();
        int i = C52761wXj.TaskDescription.aHXSQp;
        int i2 = C52761wXj.Activity.zuBGHE;
        android.content.Context context = c17178exr.fetchVPNInfo.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C14725dqq.loadFixSizeBorderImage$default(shapeableImageView, strDbNXlk, i, 1.0f, 32.0f, C33070mpX.OLrzqt(i2, context), false, 32, null);
        c17178exr.fetchVPNInfo.setAlpha(1.0f);
        ShapeableImageView shapeableImageView2 = c17178exr.valueOf;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView2, "");
        java.lang.String strAEQbTJ = c18982fsg.copydefault().AEQbTJ();
        int i3 = C52761wXj.TaskDescription.aHXSQp;
        int i4 = C52761wXj.Activity.zuBGHE;
        android.content.Context context2 = c17178exr.valueOf.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C14725dqq.loadFixSizeBorderImage$default(shapeableImageView2, strAEQbTJ, i3, 1.0f, 16.0f, C33070mpX.OLrzqt(i4, context2), false, 32, null);
        c17178exr.uzCIH.setText(this.AhwBna.EZpvd(c18982fsg.copydefault().isConnected(), c18982fsg.OLrzqt(), KWHzl()));
        java.util.List<TagWrapper> listComponent2 = C18956fsG.EZpvd(c18982fsg.copydefault().valueOf()).component2();
        C19258fxr c19258fxr = c17178exr.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c19258fxr, "");
        C18956fsG.OLrzqt(c19258fxr, KWHzl(), listComponent2, new Function1() { // from class: o.fwb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19192fwe.AEQbTJ(this.OLrzqt, (TagEventProperty) obj);
            }
        });
        android.content.Context contextKWHzl = KWHzl();
        java.util.List<TagWrapper> listValueOf = c18982fsg.copydefault().valueOf();
        java.lang.Integer numDjBIcL = c18982fsg.copydefault().djBIcL();
        C19258fxr c19258fxr2 = c17178exr.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c19258fxr2, "");
        final java.util.List<C18985fsj> listKWHzl = C18956fsG.KWHzl(contextKWHzl, listValueOf, numDjBIcL, c19258fxr2.getVisibility() == 0);
        c17178exr.values.setTags(listKWHzl, new Function0() { // from class: o.fwc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19192fwe.EZpvd(this.OLrzqt, listKWHzl);
            }
        });
        c17178exr.DbNXlk.setText(c18982fsg.copydefault().AkhnZx());
        android.widget.TextView textView = c17178exr.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(c18982fsg.copydefault().ejfBZ() ? 0 : 8);
        android.view.View view = c17178exr.KWHzl;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(c18982fsg.copydefault().ejfBZ() ? 0 : 8);
        c17178exr.isConnected.setText(C14079deg.getAddressStr$default(C14079deg.EZpvd, c18982fsg.copydefault().fetchVPNInfo(), false, 2, null));
        C10854bwM c10854bwMEZpvd = C10954byG.EZpvd.valueOf().EZpvd(c18982fsg.copydefault().fetchVPNInfo(), c18982fsg.copydefault().OLrzqt());
        c17178exr.ejfBZ.setText(C54872xYl.formatCoinPrice$default(C33129mqd.EZpvd(c18982fsg.copydefault().AhwBna()), null, c10854bwMEZpvd != null ? c10854bwMEZpvd.getNewProxyInstance() : false, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, 21, null));
        java.lang.String strCopydefault = c18982fsg.copydefault().copydefault();
        java.lang.String str = "--";
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "--")) {
            iTradeRiseDefault$default = ContextCompat.getColor(KWHzl(), C52761wXj.Activity.QwvEab);
        } else if (C33129mqd.OLrzqt((java.lang.Object) strCopydefault, (java.lang.Object) 0)) {
            iTradeRiseDefault$default = ContextCompat.getColor(KWHzl(), C52761wXj.Activity.fdOvFl);
        } else {
            iTradeRiseDefault$default = C33129mqd.AEQbTJ(strCopydefault, 0) ? C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, KWHzl(), 0.0f, 2, null) : C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, KWHzl(), 0.0f, 2, null);
        }
        c17178exr.getFieldNames.setTextColor(iTradeRiseDefault$default);
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "--")) {
            c17178exr.getFieldNames.setText("--");
        } else {
            c17178exr.getFieldNames.setText(C54873xYm.formatPriceChangePercentage$default(C33129mqd.copydefault(strCopydefault), 0, 0, false, DisplaySign.EXCEPT_ZERO, null, 23, null));
        }
        C54864xYd c54864xYd = C54864xYd.AEQbTJ;
        java.lang.String strAhwBna = c54864xYd.AhwBna();
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(C54862xYb.OLrzqt(c18982fsg.copydefault().KWHzl(), java.lang.Double.valueOf(c54864xYd.OLrzqt())));
        CurrencyDisplayStyle currencyDisplayStyle = CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY;
        java.lang.String largeValue$default = C54873xYm.formatLargeValue$default(bigDecimalEZpvd, null, null, currencyDisplayStyle, null, false, 25, null);
        java.lang.String largeValue$default2 = C54873xYm.formatLargeValue$default(C33129mqd.EZpvd(C54862xYb.OLrzqt(c18982fsg.copydefault().values(), java.lang.Double.valueOf(c54864xYd.OLrzqt()))), null, null, currencyDisplayStyle, null, false, 25, null);
        if (c18982fsg.copydefault().AYXKKw()) {
            Group group = c17178exr.copydefault;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(8);
            ConstraintLayout constraintLayout = c17178exr.AhwBna;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
            java.lang.String largeValue$default3 = C54873xYm.formatLargeValue$default(C33129mqd.EZpvd(C54862xYb.OLrzqt(c18982fsg.copydefault().gEmmrt(), java.lang.Double.valueOf(c54864xYd.OLrzqt()))), null, null, currencyDisplayStyle, null, false, 25, null);
            java.lang.String largeValue$default4 = C54873xYm.formatLargeValue$default(C33129mqd.EZpvd(c18982fsg.copydefault().EZpvd()), null, null, currencyDisplayStyle, null, false, 25, null);
            AppCompatTextView appCompatTextView = c17178exr.hDKMBd;
            java.lang.String strGEmmrt = c18982fsg.copydefault().gEmmrt();
            if (!java.lang.Boolean.valueOf(!Intrinsics.EZpvd((java.lang.Object) strGEmmrt, (java.lang.Object) "--")).booleanValue()) {
                strGEmmrt = null;
            }
            if (strGEmmrt != null) {
                java.lang.String str2 = strAhwBna + largeValue$default3;
                if (str2 == null) {
                    str2 = "--";
                }
                appCompatTextView.setText(str2);
                AppCompatTextView appCompatTextView2 = c17178exr.AuCTelauCTel;
                java.lang.String strValues = c18982fsg.copydefault().values();
                if (!java.lang.Boolean.valueOf(!Intrinsics.EZpvd((java.lang.Object) strValues, (java.lang.Object) "--")).booleanValue()) {
                    strValues = null;
                }
                if (strValues != null) {
                    java.lang.String str3 = strAhwBna + largeValue$default2;
                    if (str3 == null) {
                        str3 = "--";
                    }
                    appCompatTextView2.setText(str3);
                    AppCompatTextView appCompatTextView3 = c17178exr.zsXlph;
                    java.lang.String strKWHzl = c18982fsg.copydefault().KWHzl();
                    if (!java.lang.Boolean.valueOf(!Intrinsics.EZpvd((java.lang.Object) strKWHzl, (java.lang.Object) "--")).booleanValue()) {
                        strKWHzl = null;
                    }
                    if (strKWHzl != null) {
                        java.lang.String str4 = strAhwBna + largeValue$default;
                        if (str4 == null) {
                            str4 = "--";
                        }
                        appCompatTextView3.setText(str4);
                        AppCompatTextView appCompatTextView4 = c17178exr.iwGUEr;
                        java.lang.String strEZpvd = c18982fsg.copydefault().EZpvd();
                        if ((java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) "--") ^ true).booleanValue() ? strEZpvd : null) != null && largeValue$default4 != null) {
                            str = largeValue$default4;
                        }
                        appCompatTextView4.setText(str);
                        C52794wYp c52794wYp = c17178exr.EZpvd;
                        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this, c18982fsg));
                    }
                }
            }
        } else {
            Group group2 = c17178exr.copydefault;
            Intrinsics.checkNotNullExpressionValue(group2, "");
            group2.setVisibility(0);
            ConstraintLayout constraintLayout2 = c17178exr.AhwBna;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(8);
            c17178exr.EZpvd.setOnClickListener(null);
            android.widget.TextView textView2 = c17178exr.AkhnZx;
            java.lang.String strKWHzl2 = c18982fsg.copydefault().KWHzl();
            if (!java.lang.Boolean.valueOf(!Intrinsics.EZpvd((java.lang.Object) strKWHzl2, (java.lang.Object) "--")).booleanValue()) {
                strKWHzl2 = null;
            }
            if (strKWHzl2 != null) {
                java.lang.String strOLrzqt = C33069mpW.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.FloatRange), C56423yEv.EZpvd(C56390yDp.OLrzqt(FirebaseAnalytics.Param.PRICE, strAhwBna + largeValue$default)));
                if (strOLrzqt == null) {
                    strOLrzqt = "--";
                }
                textView2.setText(strOLrzqt);
                android.widget.TextView textView3 = c17178exr.getNewProxyInstance;
                java.lang.String strValues2 = c18982fsg.copydefault().values();
                if ((java.lang.Boolean.valueOf(true ^ Intrinsics.EZpvd((java.lang.Object) strValues2, (java.lang.Object) "--")).booleanValue() ? strValues2 : null) != null) {
                    java.lang.String strOLrzqt2 = C33069mpW.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getCustomView), C56423yEv.EZpvd(C56390yDp.OLrzqt("value", strAhwBna + largeValue$default2)));
                    if (strOLrzqt2 != null) {
                        str = strOLrzqt2;
                    }
                }
                textView3.setText(str);
            }
        }
        ConstraintLayout root2 = c17178exr.getRoot();
        root2.setOnClickListener(new Application(root2, 1000L, this, c18982fsg));
    }

    public static final Unit AEQbTJ(C19192fwe c19192fwe, TagEventProperty tagEventProperty) {
        Intrinsics.checkNotNullParameter(tagEventProperty, "");
        c19192fwe.KWHzl.invoke(tagEventProperty);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C19192fwe c19192fwe, java.util.List list) {
        c19192fwe.copydefault.invoke(C18986fsk.copydefault(list));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fwe$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C19192fwe OLrzqt;
        public final /* synthetic */ C18982fsg copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C19192fwe c19192fwe, C18982fsg c18982fsg) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c19192fwe;
            this.copydefault = c18982fsg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.EZpvd.invoke(this.copydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.fwe$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C18982fsg EZpvd;
        public final /* synthetic */ C19192fwe KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C19192fwe c19192fwe, C18982fsg c18982fsg) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c19192fwe;
            this.EZpvd = c18982fsg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.AEQbTJ.invoke(this.EZpvd);
            }
        }
    }
}
