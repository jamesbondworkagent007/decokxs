package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.market.ext.UpDownColor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC41076qjw;
import o.C41093qkM;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qkw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C41129qkw extends ConstraintLayout {
    public final C42699rbO OLrzqt;

    /* JADX INFO: renamed from: o.qkw$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

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
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41129qkw(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41129qkw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:28) call: o.qkw.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C41129qkw(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41129qkw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42699rbO c42699rbOAEQbTJ = C42699rbO.AEQbTJ(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42699rbOAEQbTJ, "");
        this.OLrzqt = c42699rbOAEQbTJ;
    }

    public final void OLrzqt(@NotNull C41093qkM.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        android.view.View root = this.OLrzqt.getRoot();
        root.setOnClickListener(new TaskDescription(root, 1000L, this, actionBar));
        EZpvd(actionBar.AYXKKw(), actionBar.AkhnZx(), actionBar.copydefault(), actionBar.isConnected(), actionBar.KWHzl());
        if (getContext() != null) {
            android.widget.TextView textView = this.OLrzqt.valueOf;
            java.lang.String strEZpvd = actionBar.EZpvd();
            if (strEZpvd == null || strEZpvd.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd)) {
                strEZpvd = "--";
            }
            textView.setText(strEZpvd);
            this.OLrzqt.AhwBna.setText(C41786qxQ.OLrzqt(actionBar.AYXKKw()));
            this.OLrzqt.valueOf.setTextColor(KWHzl(actionBar.AYXKKw()));
            this.OLrzqt.AhwBna.setTextColor(KWHzl(actionBar.AYXKKw()));
        }
        C42699rbO c42699rbO = this.OLrzqt;
        if (actionBar.gEmmrt()) {
            Group group = c42699rbO.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(0);
            int i = 0;
            for (java.lang.Object obj : yDY.copydefault(c42699rbO.EZpvd, c42699rbO.KWHzl, c42699rbO.AYXKKw)) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) obj;
                java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(actionBar.AhwBna(), i);
                if (str == null || str.length() == 0) {
                    Intrinsics.copydefault(appCompatImageView);
                    appCompatImageView.setVisibility(8);
                } else {
                    Intrinsics.copydefault(appCompatImageView);
                    appCompatImageView.setVisibility(0);
                    C33054mpH.loadUrl$default(appCompatImageView, str, null, 0, 0, 14, null);
                }
                i++;
            }
        } else {
            Group group2 = c42699rbO.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(group2, "");
            group2.setVisibility(8);
        }
        java.lang.String strDjBIcL = actionBar.djBIcL();
        if (strDjBIcL == null || strDjBIcL.length() == 0) {
            android.widget.TextView textView2 = this.OLrzqt.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
        } else {
            android.widget.TextView textView3 = this.OLrzqt.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(0);
            this.OLrzqt.copydefault.setText(actionBar.djBIcL());
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = actionBar.OLrzqt();
            setLayoutParams(layoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void EZpvd(java.lang.String str, float f, float f2, float f3, float f4) {
        C41431qqg.setCornerRadius$default(this, f, f2, f3, f4, OLrzqt(str), 0.0f, 32, null);
    }

    public final int KWHzl(java.lang.String str) {
        int i = StateListAnimator.OLrzqt[UpDownColor.Companion.AEQbTJ(str).ordinal()];
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

    public final int OLrzqt(java.lang.String str) {
        int i = StateListAnimator.OLrzqt[UpDownColor.Companion.AEQbTJ(str).ordinal()];
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

    public final void KWHzl(final C41093qkM.ActionBar actionBar) {
        C32866mlf.onEvent$default("Markets_Overview_Item_Click", (TrackChannel[]) null, new Function1() { // from class: o.qky
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41129qkw.KWHzl(actionBar, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(C41093qkM.ActionBar actionBar, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "module", "categories", false, 4, null);
        EventParamsList.put$default(eventParamsList, "item_type", "category", false, 4, null);
        EventParamsList.put$default(eventParamsList, FirebaseAnalytics.Param.ITEM_NAME, actionBar.EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "item_position", C33129mqd.gEmmrt(java.lang.Integer.valueOf(actionBar.valueOf() + 1)), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qkw$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C41129qkw KWHzl;
        public final /* synthetic */ C41093qkM.ActionBar OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C41129qkw c41129qkw, C41093qkM.ActionBar actionBar) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c41129qkw;
            this.OLrzqt = actionBar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                ActivityC41076qjw.Activity activity = ActivityC41076qjw.Companion;
                android.content.Context context = this.KWHzl.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                activity.AEQbTJ(context, this.OLrzqt.AEQbTJ(), this.OLrzqt.EZpvd());
                this.KWHzl.KWHzl(this.OLrzqt);
            }
        }
    }
}
