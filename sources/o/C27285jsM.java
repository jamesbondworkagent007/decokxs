package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetRawData;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27285jsM extends android.widget.FrameLayout {
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27285jsM(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27285jsM(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:69) call: o.jsM.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27285jsM(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27285jsM(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.jsU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27285jsM.AEQbTJ(context, this);
            }
        });
    }

    private final C23801iJv copydefault() {
        return (C23801iJv) this.copydefault.getValue();
    }

    public static final C23801iJv AEQbTJ(android.content.Context context, C27285jsM c27285jsM) {
        return C23801iJv.KWHzl(android.view.LayoutInflater.from(context), c27285jsM, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.jsM */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(C27285jsM c27285jsM, C27294jsV c27294jsV, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        c27285jsM.setData(c27294jsV, function1, function0);
    }

    public final void setData(@NotNull C27294jsV c27294jsV, Function1<? super AssetRawData, Unit> function1, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(c27294jsV, "");
        C23801iJv c23801iJvCopydefault = copydefault();
        c23801iJvCopydefault.djBIcL.setText(c27294jsV.AhwBna());
        if (c27294jsV.valueOf().size() == 1) {
            android.widget.ImageView imageView = c23801iJvCopydefault.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            android.widget.ImageView imageView2 = c23801iJvCopydefault.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(c27294jsV.valueOf(), 0);
            C27569jxf.loadCircleWithBorder$default(c27569jxf, imageView2, str == null ? "" : str, 0, 0, 0.0f, 28, null);
        } else {
            android.widget.ImageView imageView3 = c23801iJvCopydefault.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(8);
            C27538jxA c27538jxA = C27538jxA.EZpvd;
            android.content.Context context = copydefault().getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c27538jxA.OLrzqt(context, c23801iJvCopydefault.AEQbTJ, C27538jxA.parseInvestLogoData$default(c27538jxA, c27294jsV.valueOf(), null, null, null, 14, null), 20.0f, (48 & 16) != 0 ? C32113mPz.ActionBar.fJNWhG : C25493ixk.TaskDescription.OLrzqt, (48 & 32) != 0 ? 0.5f : 0.0f, (48 & 64) != 0 ? C27569jxf.OLrzqt.EZpvd() : 0);
        }
        C27586jxw c27586jxw = C27586jxw.OLrzqt;
        int iOLrzqt = c27586jxw.OLrzqt(c27294jsV.AEQbTJ(), c27294jsV.gEmmrt());
        android.widget.TextView textView = c23801iJvCopydefault.gEmmrt;
        C27488jwD c27488jwD = C27488jwD.copydefault;
        textView.setText(c27488jwD.KWHzl(C27586jxw.localizeCryptoAmount$default(c27586jxw, C33129mqd.EZpvd(c27294jsV.AYXKKw()), 0, iOLrzqt, null, null, null, 56, null)));
        pUU.copydefault("zxf_precision", "chainid " + c27294jsV.AEQbTJ() + " address " + c27294jsV.gEmmrt() + " maxPrecision " + iOLrzqt);
        if (c27294jsV.djBIcL()) {
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C25493ixk.StateListAnimator.valueOf);
            if (drawable != null) {
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                int iCopydefault = C55298xhM.copydefault(16.0f, context2);
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                drawable.setBounds(0, 0, iCopydefault, C55298xhM.copydefault(16.0f, context3));
                c23801iJvCopydefault.djBIcL.setCompoundDrawablesRelative(null, null, drawable, null);
                android.widget.TextView textView2 = c23801iJvCopydefault.djBIcL;
                android.content.Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                textView2.setCompoundDrawablePadding(C55298xhM.copydefault(4.0f, context4));
            }
        } else {
            c23801iJvCopydefault.djBIcL.setCompoundDrawablesRelative(null, null, null, null);
        }
        android.widget.TextView textView3 = c23801iJvCopydefault.valueOf;
        java.lang.String strKWHzl = "--";
        if (!Intrinsics.EZpvd((java.lang.Object) c27294jsV.OLrzqt(), (java.lang.Object) "--")) {
            strKWHzl = c27586jxw.KWHzl(C33129mqd.EZpvd(c27294jsV.OLrzqt()), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null);
        }
        textView3.setText(c27488jwD.KWHzl(strKWHzl));
        C27569jxf c27569jxf2 = C27569jxf.OLrzqt;
        C52794wYp c52794wYp = c23801iJvCopydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        C27569jxf.setInvestClaimButtonStatus$default(c27569jxf2, c52794wYp, c27294jsV.EZpvd(), c27294jsV.copydefault(), null, 4, null);
        C52794wYp c52794wYp2 = c23801iJvCopydefault.KWHzl;
        c52794wYp2.setOnClickListener(new StateListAnimator(c52794wYp2, 1000L, function1, c27294jsV));
        wYC wyc = c23801iJvCopydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(wyc, "");
        wyc.setVisibility(function0 == null ? 8 : 0);
        if (function0 != null) {
            LinearLayoutCompat linearLayoutCompat = c23801iJvCopydefault.EZpvd;
            linearLayoutCompat.setOnClickListener(new ActionBar(linearLayoutCompat, 1000L, function0));
        }
    }

    /* JADX INFO: renamed from: o.jsM$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ Function0 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function0 function0) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.jsM$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C27294jsV EZpvd;
        public final /* synthetic */ Function1 KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, Function1 function1, C27294jsV c27294jsV) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = function1;
            this.EZpvd = c27294jsV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function1 function1 = this.KWHzl;
                if (function1 != null) {
                    function1.invoke(this.EZpvd.KWHzl());
                }
            }
        }
    }
}
