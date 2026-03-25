package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.google.android.flexbox.FlexboxLayout;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import com.okinc.business.dexui.main.market.base.TokenDetailEventTrackingInfo;
import com.okinc.business.market.domain.model.coininfo.Social;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kmH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29044kmH extends ConstraintLayout {
    public final InterfaceC56387yDm EZpvd;
    public TokenDetailEventTrackingInfo KWHzl;
    public Function1<? super java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29044kmH(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventTrackingInfo(TokenDetailEventTrackingInfo tokenDetailEventTrackingInfo) {
        this.KWHzl = tokenDetailEventTrackingInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:26) call: o.kmH.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C29044kmH(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29044kmH(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.kmJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29044kmH.AEQbTJ(context, this);
            }
        });
    }

    private final hFF EZpvd() {
        return (hFF) this.EZpvd.getValue();
    }

    public static final hFF AEQbTJ(android.content.Context context, C29044kmH c29044kmH) {
        hFF hffOLrzqt = hFF.OLrzqt(android.view.LayoutInflater.from(context), c29044kmH);
        Intrinsics.checkNotNullExpressionValue(hffOLrzqt, "");
        return hffOLrzqt;
    }

    public final void OLrzqt(@NotNull java.util.List<Social> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
        EZpvd();
        KWHzl(str, str2, str3);
        copydefault(list);
    }

    public final void EZpvd(TokenDetailButtonName tokenDetailButtonName) {
        TokenDetailEventTrackingInfo tokenDetailEventTrackingInfo = this.KWHzl;
        if (tokenDetailEventTrackingInfo != null) {
            C21847hOn.EZpvd(tokenDetailEventTrackingInfo, TokenDetailClickLayer.COMPONENTS, tokenDetailButtonName, CoinDetailTabType.INFO);
        }
    }

    public final void KWHzl(final java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        EZpvd().AEQbTJ.removeAllViews();
        EZpvd().AEQbTJ.addView(copydefault(C23274hvD.Fragment.addOnReportDrawnListener, C52761wXj.TaskDescription.UJpkuA, new Function0() { // from class: o.kmG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29044kmH.OLrzqt(this.EZpvd, str2);
            }
        }));
        if ((C33129mqd.OLrzqt((java.lang.CharSequence) str) ? str : null) != null) {
            EZpvd().AEQbTJ.addView(copydefault(C23274hvD.Fragment.postWhenReportersAreDone, C52761wXj.TaskDescription.UJpkuA, new Function0() { // from class: o.kmN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C29044kmH.AEQbTJ(this.KWHzl, str3, str);
                }
            }));
        }
    }

    public static final Unit OLrzqt(C29044kmH c29044kmH, java.lang.String str) {
        Function1<? super java.lang.String, Unit> function1 = c29044kmH.copydefault;
        if (function1 != null) {
            function1.invoke("https://x.com/search?q=(%24" + str + ")");
        }
        c29044kmH.EZpvd(TokenDetailButtonName.INFO_SEARCH_X);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C29044kmH c29044kmH, java.lang.String str, java.lang.String str2) {
        Function1<? super java.lang.String, Unit> function1 = c29044kmH.copydefault;
        if (function1 != null) {
            function1.invoke("https://x.com/search?q=(%24" + str + "%20OR%20" + str2 + ")");
        }
        c29044kmH.EZpvd(TokenDetailButtonName.INFO_SEARCH_X);
        return Unit.INSTANCE;
    }

    public final void copydefault(java.util.List<Social> list) {
        EZpvd().EZpvd.removeAllViews();
        if (list.isEmpty()) {
            android.widget.TextView textView = EZpvd().copydefault;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            FlexboxLayout flexboxLayout = EZpvd().EZpvd;
            Intrinsics.checkNotNullExpressionValue(flexboxLayout, "");
            flexboxLayout.setVisibility(8);
            return;
        }
        for (final Social social : list) {
            EZpvd().EZpvd.addView(copydefault(social.EZpvd(), social.copydefault(), new Function0() { // from class: o.kmF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C29044kmH.EZpvd(this.KWHzl, social);
                }
            }));
        }
    }

    public static final Unit EZpvd(C29044kmH c29044kmH, Social social) {
        android.content.Context context = c29044kmH.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25352ivB.copydefault(context, social.AEQbTJ());
        c29044kmH.EZpvd(TokenDetailButtonName.Companion.EZpvd(social));
        return Unit.INSTANCE;
    }

    public final C52794wYp copydefault(@androidx.annotation.StringRes int i, @androidx.annotation.DrawableRes int i2, Function0<Unit> function0) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C52794wYp c52794wYp = new C52794wYp(context, null, 0, 6, null);
        c52794wYp.setOKDSSize(32);
        c52794wYp.setOKDSType(260);
        int i3 = C52761wXj.Activity.Dmq;
        android.content.Context context2 = c52794wYp.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c52794wYp.setTextColor(C25382ivf.copydefault(i3, context2));
        c52794wYp.setText(c52794wYp.getContext().getString(i));
        android.content.Context context3 = c52794wYp.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        c52794wYp.setCompoundDrawablePadding(C55298xhM.copydefault(4.0f, context3));
        android.content.Context context4 = c52794wYp.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        int iCopydefault = C55298xhM.copydefault(16.0f, context4);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(c52794wYp.getContext(), i2);
        if (drawable != null) {
            drawable.setBounds(0, 0, iCopydefault, iCopydefault);
        } else {
            drawable = null;
        }
        c52794wYp.setCompoundDrawablesRelative(drawable, null, null, null);
        android.content.Context context5 = c52794wYp.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        int iCopydefault2 = C55298xhM.copydefault(12.0f, context5);
        c52794wYp.setPadding(iCopydefault2, c52794wYp.getPaddingTop(), iCopydefault2, c52794wYp.getPaddingBottom());
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, function0, this));
        return c52794wYp;
    }

    /* JADX INFO: renamed from: o.kmH$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ Function0 EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C29044kmH copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, Function0 function0, C29044kmH c29044kmH) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = function0;
            this.copydefault = c29044kmH;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.invoke();
                this.copydefault.EZpvd(TokenDetailButtonName.INFO_SEARCH_X);
            }
        }
    }
}
