package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.market.ext.UpDownColor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C41090qkJ;
import o.C52761wXj;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C41081qkA extends ConstraintLayout {
    public final C42702rbR OLrzqt;

    /* JADX INFO: renamed from: o.qkA$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[UpDownColor.values().length];
            try {
                iArr[UpDownColor.UP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[UpDownColor.DOWN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41081qkA(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41081qkA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:31) call: o.qkA.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C41081qkA(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41081qkA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42702rbR c42702rbRKWHzl = C42702rbR.KWHzl(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c42702rbRKWHzl, "");
        this.OLrzqt = c42702rbRKWHzl;
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull C41090qkJ.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        copydefault(actionBar.djBIcL(), actionBar.values(), actionBar.copydefault(), actionBar.DbNXlk(), actionBar.AEQbTJ());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) actionBar.EZpvd())) {
            AppCompatImageView appCompatImageView = this.OLrzqt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(0);
            AppCompatImageView appCompatImageView2 = this.OLrzqt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            C33054mpH.loadUrl$default(appCompatImageView2, actionBar.EZpvd(), null, 0, 0, 14, null);
        } else {
            AppCompatImageView appCompatImageView3 = this.OLrzqt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
            appCompatImageView3.setVisibility(8);
        }
        android.widget.TextView textView = this.OLrzqt.AEQbTJ;
        java.lang.String strOLrzqt = actionBar.OLrzqt();
        if (strOLrzqt == null || strOLrzqt.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt)) {
            strOLrzqt = "--";
        }
        textView.setText(strOLrzqt);
        this.OLrzqt.AEQbTJ.setTextColor(AEQbTJ(actionBar.djBIcL()));
        this.OLrzqt.EZpvd.setText(C41786qxQ.OLrzqt(actionBar.djBIcL()));
        this.OLrzqt.EZpvd.setTextColor(AEQbTJ(actionBar.djBIcL()));
        if (actionBar.fetchVPNInfo()) {
            android.widget.TextView textView2 = this.OLrzqt.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            this.OLrzqt.gEmmrt.setText(actionBar.gEmmrt());
            this.OLrzqt.gEmmrt.setTextColor(AEQbTJ(actionBar.djBIcL()));
        } else {
            android.widget.TextView textView3 = this.OLrzqt.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = actionBar.KWHzl();
            setLayoutParams(layoutParams);
            ConstraintLayout root = this.OLrzqt.getRoot();
            root.setOnClickListener(new ActionBar(root, 1000L, actionBar, this, str));
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    private final int AEQbTJ(java.lang.String str) {
        int i = StateListAnimator.EZpvd[UpDownColor.Companion.AEQbTJ(str).ordinal()];
        if (i == 1) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
        }
        if (i == 2) {
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            return C33512mxp.tradeFallDefault$default(c33512mxp2, context2, 0.0f, 2, null);
        }
        return C33070mpX.copydefault(C52761wXj.Activity.Dmq);
    }

    private final int OLrzqt(java.lang.String str) {
        int i = StateListAnimator.EZpvd[UpDownColor.Companion.AEQbTJ(str).ordinal()];
        if (i == 1) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return C33512mxp.tradeRiseTagFill$default(c33512mxp, context, 0.0f, 2, null);
        }
        if (i == 2) {
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            return C33512mxp.tradeFallTagFill$default(c33512mxp2, context2, 0.0f, 2, null);
        }
        return C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC);
    }

    private final void copydefault(java.lang.String str, float f, float f2, float f3, float f4) {
        C41431qqg.setCornerRadius$default(this, f, f2, f3, f4, OLrzqt(str), 0.0f, 32, null);
    }

    public final void EZpvd(final java.lang.String str, final C41090qkJ.ActionBar actionBar) {
        C32866mlf.onEvent$default("Trending_CategoryDetails_Item_Click", (TrackChannel[]) null, new Function1() { // from class: o.qkz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41081qkA.copydefault(str, actionBar, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, C41090qkJ.ActionBar actionBar, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "category_name", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "module_clicked", "top_movers", false, 4, null);
        EventParamsList.put$default(eventParamsList, "item_position", C33129mqd.gEmmrt(java.lang.Integer.valueOf(actionBar.valueOf() + 1)), false, 4, null);
        EventParamsList.put$default(eventParamsList, FirebaseAnalytics.Param.ITEM_NAME, actionBar.OLrzqt(), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qkA$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C41090qkJ.ActionBar KWHzl;
        public final /* synthetic */ C41081qkA OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C41090qkJ.ActionBar actionBar, C41081qkA c41081qkA, java.lang.String str) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = actionBar;
            this.OLrzqt = c41081qkA;
            this.copydefault = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                MarketCoinInfo marketCoinInfo = new MarketCoinInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
                marketCoinInfo.setInstrumentId(this.KWHzl.AYXKKw());
                marketCoinInfo.setInstrumentType(this.KWHzl.AhwBna());
                oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                if (oka != null) {
                    android.content.Context context = this.OLrzqt.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    oKA.TaskDescription.gotoNewKlinePage$default(oka, context, marketCoinInfo, null, null, null, null, null, null, "Market_Overview_Category_TopMovers", null, null, 1788, null);
                }
                this.OLrzqt.EZpvd(this.copydefault, this.KWHzl);
            }
        }
    }
}
