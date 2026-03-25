package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.biz.ArbInvestDetailsBean;
import com.okinc.unify_trade.biz.EstimatedStakingVo;
import com.okinc.unify_trade.biz.PlaceOrderCondition;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wdm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53030wdm extends android.widget.RelativeLayout {
    public SmartArbitrageReq KWHzl;
    public uWZ OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53030wdm(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53030wdm(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGridReq(@NotNull SmartArbitrageReq smartArbitrageReq) {
        Intrinsics.checkNotNullParameter(smartArbitrageReq, "");
        this.KWHzl = smartArbitrageReq;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: o.wdm.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53030wdm(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53030wdm(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        isConnected();
        AYXKKw();
        this.KWHzl = new SmartArbitrageReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (ArbInvestDetailsBean) null, (java.lang.Float) null, (PlaceOrderCondition) null, (java.lang.String) null, (EstimatedStakingVo) null, (EstimatedStakingVo) null, (StrategyConfigInfo) null, (java.lang.String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: o.wdm$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wdm.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void isConnected() {
        this.OLrzqt = (uWZ) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.sVvuFk, this, true);
        copydefault(java.lang.Boolean.FALSE);
    }

    public final void AYXKKw() {
        uWZ uwz = this.OLrzqt;
        if (uwz == null) {
            Intrinsics.gEmmrt("");
            uwz = null;
        }
        uwz.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.wdq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53030wdm.KWHzl(this.copydefault, view);
            }
        });
    }

    public static final void KWHzl(C53030wdm c53030wdm, android.view.View view) {
        uWZ uwz = c53030wdm.OLrzqt;
        if (uwz == null) {
            Intrinsics.gEmmrt("");
            uwz = null;
        }
        LinearLayoutCompat linearLayoutCompat = uwz.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        boolean z = !(linearLayoutCompat.getVisibility() == 0);
        c53030wdm.copydefault(java.lang.Boolean.valueOf(z));
        if (z) {
            C32866mlf.onEvent$default("BotPlaceOrder_AdvancedSetting_DropDown_Click", (TrackChannel[]) null, new Function1() { // from class: o.wdo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53030wdm.copydefault((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void refreshVisibleState$default(C53030wdm c53030wdm, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        c53030wdm.copydefault(bool);
    }

    public final void copydefault(java.lang.Boolean bool) {
        boolean zBooleanValue = bool != null ? bool.booleanValue() : SPUtils.getBoolean("sp_tag_visible_state_sr_cal", false);
        uWZ uwz = null;
        if (zBooleanValue) {
            uWZ uwz2 = this.OLrzqt;
            if (uwz2 == null) {
                Intrinsics.gEmmrt("");
                uwz2 = null;
            }
            android.view.ViewPropertyAnimator duration = uwz2.OLrzqt.animate().translationY(0.0f).setDuration(300L);
            Intrinsics.checkNotNullExpressionValue(duration, "");
            duration.withStartAction(new java.lang.Runnable() { // from class: o.wdn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C53030wdm.AEQbTJ(this.KWHzl);
                }
            });
            duration.start();
        } else {
            uWZ uwz3 = this.OLrzqt;
            if (uwz3 == null) {
                Intrinsics.gEmmrt("");
                uwz3 = null;
            }
            android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = uwz3.OLrzqt.animate();
            uWZ uwz4 = this.OLrzqt;
            if (uwz4 == null) {
                Intrinsics.gEmmrt("");
                uwz4 = null;
            }
            android.view.ViewPropertyAnimator duration2 = viewPropertyAnimatorAnimate.translationY(uwz4.OLrzqt.getHeight()).setDuration(300L);
            Intrinsics.checkNotNullExpressionValue(duration2, "");
            duration2.withEndAction(new java.lang.Runnable() { // from class: o.wdj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C53030wdm.EZpvd(this.OLrzqt);
                }
            });
            duration2.start();
        }
        int i = zBooleanValue ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG;
        uWZ uwz5 = this.OLrzqt;
        if (uwz5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uwz = uwz5;
        }
        uwz.EZpvd.setImageResource(i);
    }

    public static final void AEQbTJ(C53030wdm c53030wdm) {
        uWZ uwz = c53030wdm.OLrzqt;
        if (uwz == null) {
            Intrinsics.gEmmrt("");
            uwz = null;
        }
        uwz.OLrzqt.setVisibility(0);
    }

    public static final void EZpvd(C53030wdm c53030wdm) {
        uWZ uwz = c53030wdm.OLrzqt;
        if (uwz == null) {
            Intrinsics.gEmmrt("");
            uwz = null;
        }
        uwz.OLrzqt.setVisibility(8);
    }

    public final android.widget.TextView OLrzqt() {
        uWZ uwz = this.OLrzqt;
        if (uwz == null) {
            Intrinsics.gEmmrt("");
            uwz = null;
        }
        android.widget.TextView textView = uwz.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.view.View gEmmrt() {
        uWZ uwz = this.OLrzqt;
        if (uwz == null) {
            Intrinsics.gEmmrt("");
            uwz = null;
        }
        android.view.View view = uwz.values;
        Intrinsics.checkNotNullExpressionValue(view, "");
        return view;
    }

    public final android.widget.TextView KWHzl() {
        uWZ uwz = this.OLrzqt;
        if (uwz == null) {
            Intrinsics.gEmmrt("");
            uwz = null;
        }
        android.widget.TextView textView = uwz.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.TextView EZpvd() {
        uWZ uwz = this.OLrzqt;
        if (uwz == null) {
            Intrinsics.gEmmrt("");
            uwz = null;
        }
        android.widget.TextView textView = uwz.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.TextView copydefault() {
        uWZ uwz = this.OLrzqt;
        if (uwz == null) {
            Intrinsics.gEmmrt("");
            uwz = null;
        }
        android.widget.TextView textView = uwz.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.TextView AhwBna() {
        uWZ uwz = this.OLrzqt;
        if (uwz == null) {
            Intrinsics.gEmmrt("");
            uwz = null;
        }
        android.widget.TextView textView = uwz.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.TextView AEQbTJ() {
        uWZ uwz = this.OLrzqt;
        if (uwz == null) {
            Intrinsics.gEmmrt("");
            uwz = null;
        }
        android.widget.TextView textView = uwz.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final C55258xgZ djBIcL() {
        uWZ uwz = this.OLrzqt;
        if (uwz == null) {
            Intrinsics.gEmmrt("");
            uwz = null;
        }
        C55258xgZ c55258xgZ = uwz.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
        return c55258xgZ;
    }

    public final android.widget.TextView valueOf() {
        uWZ uwz = this.OLrzqt;
        if (uwz == null) {
            Intrinsics.gEmmrt("");
            uwz = null;
        }
        android.widget.TextView textView = uwz.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }
}
