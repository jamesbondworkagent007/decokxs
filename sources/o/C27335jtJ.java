package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.business.invest_biz.data.bean.AggregateItemRateType;
import com.okinc.business.invest_biz.data.bean.InvestTag;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27335jtJ extends android.widget.FrameLayout {
    public final InterfaceC56387yDm OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27335jtJ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27335jtJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:36) call: o.jtJ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27335jtJ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27335jtJ(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.jtF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27335jtJ.KWHzl(context, this);
            }
        });
    }

    private final C23729iHd KWHzl() {
        return (C23729iHd) this.OLrzqt.getValue();
    }

    public static final C23729iHd KWHzl(android.content.Context context, C27335jtJ c27335jtJ) {
        return C23729iHd.copydefault(android.view.LayoutInflater.from(context), c27335jtJ, true);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.jxf.setSDAvatarLayout$default(o.jxf, android.content.Context, o.jqt, com.okinc.business.invest_biz.data.bean.InvestPlatformLogo, int, float, int, java.lang.Object):void */
    public final void setData(@NotNull C26526jdw c26526jdw, @NotNull Function0<? extends android.app.Activity> function0, @NotNull Function1<? super C26526jdw, Unit> function1) {
        int iCopydefault;
        java.lang.String tvl$default;
        Intrinsics.checkNotNullParameter(c26526jdw, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C23729iHd c23729iHdKWHzl = KWHzl();
        c23729iHdKWHzl.fIwbmz.setText(c26526jdw.AYXKKw());
        boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) c26526jdw.valueOf());
        android.widget.TextView textView = c23729iHdKWHzl.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(zOLrzqt ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat = c23729iHdKWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        ViewGroup.LayoutParams layoutParams = linearLayoutCompat.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = !zOLrzqt ? 16 : 0;
            linearLayoutCompat.setLayoutParams(layoutParams2);
            c23729iHdKWHzl.fJNWhG.setText(c26526jdw.valueOf());
            c23729iHdKWHzl.values.setText(c26526jdw.AkhnZx());
            C27439jvH c27439jvH = c23729iHdKWHzl.AhwBna;
            Intrinsics.checkNotNullExpressionValue(c27439jvH, "");
            boolean z = true;
            c27439jvH.setVisibility(c26526jdw.AEQbTJ() ^ true ? 8 : 0);
            android.widget.TextView textView2 = c23729iHdKWHzl.values;
            if (c26526jdw.DbNXlk() == AggregateItemRateType.EMPTY && !c26526jdw.OLrzqt()) {
                iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.UlJrfe);
            } else {
                iCopydefault = C27569jxf.OLrzqt.copydefault(c26526jdw.OLrzqt());
            }
            textView2.setTextColor(iCopydefault);
            if ((!C33129mqd.OLrzqt((java.lang.CharSequence) c26526jdw.fetchVPNInfo()) || !c26526jdw.values()) && !C33129mqd.OLrzqt((java.lang.CharSequence) c26526jdw.KWHzl()) && !(!c26526jdw.isConnected().isEmpty())) {
                z = false;
            }
            LinearLayoutCompat linearLayoutCompat2 = c23729iHdKWHzl.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
            ViewGroup.LayoutParams layoutParams3 = linearLayoutCompat2.getLayoutParams();
            if (layoutParams3 != null) {
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.gravity = !z ? TextAlign.RIGHT : 8388613;
                linearLayoutCompat2.setLayoutParams(layoutParams4);
                LinearLayoutCompat linearLayoutCompat3 = c23729iHdKWHzl.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
                linearLayoutCompat3.setVisibility(z ? 0 : 8);
                android.widget.TextView textView3 = c23729iHdKWHzl.fetchVPNInfo;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                textView3.setVisibility(((C33129mqd.OLrzqt((java.lang.CharSequence) c26526jdw.fetchVPNInfo()) && c26526jdw.values()) || C33129mqd.OLrzqt((java.lang.CharSequence) c26526jdw.KWHzl())) ? 0 : 8);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) c26526jdw.KWHzl())) {
                    android.content.Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    tvl$default = C33069mpW.KWHzl(context, C25493ixk.FragmentManager.getPostValueLengthLimit, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", C27492jwH.formatTvl$default(C27492jwH.OLrzqt, c26526jdw.KWHzl(), false, false, 2, null))));
                } else {
                    tvl$default = C27492jwH.formatTvl$default(C27492jwH.OLrzqt, c26526jdw.fetchVPNInfo(), false, true, 2, null);
                }
                c23729iHdKWHzl.fetchVPNInfo.setText(tvl$default);
                android.widget.TextView textView4 = c23729iHdKWHzl.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                C55251xgS c55251xgS = c23729iHdKWHzl.isConnected;
                Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
                AEQbTJ(textView4, c55251xgS, c26526jdw.djBIcL());
                java.lang.String strKWHzl = C33492mxV.OLrzqt() ? c26526jdw.EZpvd().KWHzl() : c26526jdw.EZpvd().OLrzqt();
                if (C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl)) {
                    C55251xgS c55251xgS2 = c23729iHdKWHzl.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
                    c55251xgS2.setVisibility(0);
                    Intrinsics.copydefault(Glide.KWHzl(c23729iHdKWHzl.KWHzl).EZpvd(strKWHzl).copydefault((RY<android.graphics.drawable.Drawable>) new StateListAnimator(c23729iHdKWHzl)).EZpvd());
                } else {
                    C55251xgS c55251xgS3 = c23729iHdKWHzl.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c55251xgS3, "");
                    c55251xgS3.setVisibility(8);
                }
                C27569jxf c27569jxf = C27569jxf.OLrzqt;
                C27569jxf.setSDAvatarLayout$default(c27569jxf, function0.invoke(), c23729iHdKWHzl.copydefault, c26526jdw.copydefault(), C32113mPz.ActionBar.fJNWhG, 0.0f, 16, (java.lang.Object) null);
                c27569jxf.EZpvd(function0.invoke(), c23729iHdKWHzl.AkhnZx, c26526jdw.isConnected());
                ConstraintLayout constraintLayoutAEQbTJ = c23729iHdKWHzl.getRoot();
                constraintLayoutAEQbTJ.setOnClickListener(new ActionBar(constraintLayoutAEQbTJ, 1000L, function1, c26526jdw));
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* JADX INFO: renamed from: o.jtJ$StateListAnimator */
    public static final class StateListAnimator implements RY<android.graphics.drawable.Drawable> {
        public final /* synthetic */ C23729iHd KWHzl;

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
            return false;
        }

        public StateListAnimator(C23729iHd c23729iHd) {
            this.KWHzl = c23729iHd;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            this.KWHzl.KWHzl.setTagIcon(drawable);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(android.widget.TextView textView, C55251xgS c55251xgS, java.util.List<InvestTag> list) {
        boolean z;
        if (list.isEmpty()) {
            z = true;
        } else {
            InvestTag investTag = (InvestTag) CollectionsKt___CollectionsKt.firstOrNull(list);
            java.lang.String strOLrzqt = investTag != null ? investTag.OLrzqt() : null;
            if (strOLrzqt != null && strOLrzqt.length() != 0) {
                z = false;
            }
        }
        c55251xgS.setVisibility(8);
        textView.setVisibility(8);
        if (z) {
            return;
        }
        InvestTag investTag2 = (InvestTag) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        c55251xgS.setText(investTag2.OLrzqt());
        textView.setText(investTag2.OLrzqt());
        c55251xgS.setOKDSStyle(investTag2.copydefault() == 2 ? 7 : 0);
        c55251xgS.setVisibility(investTag2.copydefault() != 1 ? 0 : 8);
        textView.setVisibility(investTag2.copydefault() != 1 ? 8 : 0);
    }

    /* JADX INFO: renamed from: o.jtJ$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ Function1 EZpvd;
        public final /* synthetic */ C26526jdw KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function1 function1, C26526jdw c26526jdw) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = function1;
            this.KWHzl = c26526jdw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.invoke(this.KWHzl);
            }
        }
    }
}
