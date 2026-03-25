package o;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.localization.util.format.DisplaySign;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.hTE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hTr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21986hTr extends android.widget.LinearLayout {
    public boolean AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public final float EZpvd;
    public final hAT KWHzl;
    public boolean OLrzqt;
    public float copydefault;
    public final InterfaceC56387yDm djBIcL;
    public Function0<Unit> gEmmrt;
    public Function0<Unit> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21986hTr(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ() {
        this.OLrzqt = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIsShareShown(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnAlertClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.valueOf = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnShareClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.gEmmrt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf() {
        this.AhwBna = true;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:38) call: o.hTr.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C21986hTr(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21986hTr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C55298xhM.dp2pxFloat$default(32.0f, null, 1, null);
        hAT hatOLrzqt = hAT.OLrzqt(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(hatOLrzqt, "");
        this.KWHzl = hatOLrzqt;
        this.AYXKKw = true;
        djBIcL();
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.hTF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21986hTr.AEQbTJ(this.copydefault);
            }
        });
    }

    public final void djBIcL() {
        setContentDescription("web3_dex_market_token_detail_title_view");
        C25352ivB.setOnDoubleCheckClickListener$default(this.KWHzl.copydefault, 0L, new Function1() { // from class: o.hTw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21986hTr.EZpvd(this.EZpvd, (android.view.View) obj);
            }
        }, 1, null);
        AppCompatImageView appCompatImageView = this.KWHzl.djBIcL;
        appCompatImageView.setContentDescription("web3_dex_market_detail_more_menu");
        C25352ivB.setOnDoubleCheckClickListener$default(appCompatImageView, 0L, new Function1() { // from class: o.hTC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21986hTr.KWHzl(this.AEQbTJ, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(C21986hTr c21986hTr, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.content.Context context = c21986hTr.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c21986hTr.OLrzqt(context);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C21986hTr c21986hTr, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        hTE hteAhwBna = c21986hTr.AhwBna();
        if (C33129mqd.KWHzl((java.util.Collection) hteAhwBna.AEQbTJ())) {
            hteAhwBna.showAsDropDown(view);
        }
        return Unit.INSTANCE;
    }

    public final hTE AhwBna() {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        hTE hte = new hTE(context, null, 0, 0, 14, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.AhwBna) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.ComponentActivity);
            int i = this.AEQbTJ ? C52761wXj.TaskDescription.addPreRequisiteCollector : C52761wXj.TaskDescription.invokespecialhrnhsO;
            Function0<Unit> function0 = this.valueOf;
            if (function0 == null) {
                function0 = new Function0() { // from class: o.hTz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C21986hTr.OLrzqt();
                    }
                };
            }
            arrayList.add(new hTE.TaskDescription(i, strAYXKKw, function0, this.AEQbTJ ? "web3_dex_market_view_alert_menu_item" : "web3_dex_market_new_alert_menu_item"));
        }
        if (this.AYXKKw) {
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.onSaveInstanceState);
            int i2 = C52761wXj.TaskDescription.zEkrwr;
            Function0<Unit> function02 = this.gEmmrt;
            if (function02 == null) {
                function02 = new Function0() { // from class: o.hTx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C21986hTr.EZpvd();
                    }
                };
            }
            arrayList.add(new hTE.TaskDescription(i2, strAYXKKw2, function02, null, 8, null));
        }
        hte.copydefault(arrayList);
        return hte;
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    public final void OLrzqt(android.content.Context context) {
        if (context instanceof AppCompatActivity) {
            ((AppCompatActivity) context).getOnBackPressedDispatcher().onBackPressed();
        } else if (context instanceof android.content.ContextWrapper) {
            android.content.Context baseContext = ((android.content.ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(baseContext, "");
            OLrzqt(baseContext);
        }
    }

    public final AppCompatImageView gEmmrt() {
        AppCompatImageView appCompatImageView = this.KWHzl.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        return appCompatImageView;
    }

    public final AppCompatTextView AYXKKw() {
        AppCompatTextView appCompatTextView = this.KWHzl.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        return appCompatTextView;
    }

    public static final Unit KWHzl(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hTr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTitleAndContract$default(C21986hTr c21986hTr, java.lang.String str, java.lang.String str2, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: o.hTA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C21986hTr.KWHzl((java.lang.String) obj2);
                }
            };
        }
        c21986hTr.setTitleAndContract(str, str2, function1);
    }

    public final void setTitleAndContract(@NotNull java.lang.String str, @NotNull final java.lang.String str2, @NotNull final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        hAT hat = this.KWHzl;
        hat.AuCTel.setText(C25352ivB.formatAddress$default(str2, 6, 4, null, 4, null));
        hat.fJNWhG.setText(str);
        C25352ivB.setOnDoubleCheckClickListener$default(this.KWHzl.AhwBna, 0L, new Function1() { // from class: o.hTt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21986hTr.AEQbTJ(this.OLrzqt, str2, function1, (android.view.View) obj);
            }
        }, 1, null);
        C25352ivB.setOnDoubleCheckClickListener$default(this.KWHzl.KWHzl, 0L, new Function1() { // from class: o.hTy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21986hTr.EZpvd(this.EZpvd, str2, function1, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit AEQbTJ(C21986hTr c21986hTr, java.lang.String str, Function1 function1, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.content.Context context = c21986hTr.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        hSW.copydefault(context, str, function1, TokenDetailClickLayer.GLOBAL);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C21986hTr c21986hTr, java.lang.String str, Function1 function1, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.content.Context context = c21986hTr.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        hSW.copydefault(context, str, function1, TokenDetailClickLayer.GLOBAL);
        return Unit.INSTANCE;
    }

    public final void setTags(@NotNull java.util.List<TagWrapper> list, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        C28067kNr c28067kNr = this.KWHzl.AkhnZx;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!Intrinsics.EZpvd((java.lang.Object) ((TagWrapper) obj).OLrzqt(), (java.lang.Object) "duringEvent")) {
                arrayList.add(obj);
            }
        }
        C28067kNr.setTags$default(c28067kNr, arrayList, false, false, new Function1() { // from class: o.hTs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C21986hTr.copydefault(function0, str3, str, str5, str2, str4, (java.util.List) obj2);
            }
        }, null, 22, null);
    }

    public static final Unit copydefault(Function0 function0, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (function0 != null) {
            C21847hOn.copydefault("label_community", str, str2, str3, str4, str5);
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void setShowTokenAddress(boolean z) {
        LinearLayoutCompat linearLayoutCompat = this.KWHzl.AhwBna;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(z ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat2 = this.KWHzl.isConnected;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        linearLayoutCompat2.setVisibility(z ^ true ? 0 : 8);
        this.OLrzqt = z;
    }

    public final void setCoinChainCoinImageUrl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl.fIwbmz.AEQbTJ(str2, str);
    }

    public final void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.ejfBZ.setText(str);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strAEQbTJ = C31256lqb.AEQbTJ(str, (Function1<? super java.lang.String, java.lang.String>) new Function1() { // from class: o.hTD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21986hTr.copydefault((java.lang.String) obj);
            }
        });
        if (strAEQbTJ.length() == 0) {
            strAEQbTJ = "--";
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iEZpvd = C25352ivB.EZpvd(context, str);
        AppCompatTextView appCompatTextView = this.KWHzl.fARcdN;
        appCompatTextView.setText(strAEQbTJ);
        appCompatTextView.setTextColor(iEZpvd);
    }

    public static final java.lang.String copydefault(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return kLY.formatPercentage$default(str, DisplaySign.EXCEPT_ZERO, false, null, null, 14, null);
    }

    /* JADX INFO: renamed from: o.hTr$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ Function0 KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, Function0 function0) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.invoke();
            }
        }
    }

    public final void setOnTokenLogoClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C31222lpu c31222lpu = this.KWHzl.fIwbmz;
        c31222lpu.setOnClickListener(new TaskDescription(c31222lpu, 1000L, function0));
    }

    private final android.animation.ValueAnimator AkhnZx() {
        return (android.animation.ValueAnimator) this.djBIcL.getValue();
    }

    public static final android.animation.ValueAnimator AEQbTJ(final C21986hTr c21986hTr) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.hTv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C21986hTr.OLrzqt(this.OLrzqt, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public static final void OLrzqt(C21986hTr c21986hTr, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        c21986hTr.OLrzqt(((java.lang.Float) animatedValue).floatValue());
    }

    public final void OLrzqt(float f) {
        hAT hat = this.KWHzl;
        LinearLayoutCompat linearLayoutCompat = hat.AhwBna;
        float fKWHzl = C56548yJl.KWHzl(f * 2.5f, 0.0f, 1.0f);
        float f2 = 1;
        linearLayoutCompat.setAlpha(f2 - fKWHzl);
        linearLayoutCompat.setTranslationY(((-linearLayoutCompat.getHeight()) * fKWHzl) / 2);
        Intrinsics.copydefault(linearLayoutCompat);
        linearLayoutCompat.setVisibility(fKWHzl < 1.0f ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat2 = hat.isConnected;
        float f3 = (f - 0.6f) * 2.5f;
        float fKWHzl2 = C56548yJl.KWHzl(f3, 0.0f, 1.0f);
        linearLayoutCompat2.setAlpha(fKWHzl2);
        linearLayoutCompat2.setTranslationY(linearLayoutCompat2.getHeight() * (f2 - fKWHzl2));
        Intrinsics.copydefault(linearLayoutCompat2);
        linearLayoutCompat2.setVisibility(f > 0.6f ? 0 : 8);
        AppCompatImageView appCompatImageView = hat.KWHzl;
        appCompatImageView.setAlpha(C56548yJl.KWHzl(f3, 0.0f, 1.0f));
        Intrinsics.copydefault(appCompatImageView);
        appCompatImageView.setVisibility(f > 0.6f ? 0 : 8);
    }

    public final void EZpvd(int i) {
        if (this.OLrzqt) {
            float fKWHzl = C56548yJl.KWHzl((i - this.EZpvd) / 100, 0.0f, 1.0f);
            if (java.lang.Math.abs(fKWHzl - this.copydefault) > 0.01f) {
                this.copydefault = fKWHzl;
                AkhnZx().cancel();
                android.animation.ValueAnimator valueAnimatorAkhnZx = AkhnZx();
                float[] fArr = new float[2];
                java.lang.Object animatedValue = AkhnZx().getAnimatedValue();
                java.lang.Float f = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
                fArr[0] = f != null ? f.floatValue() : this.copydefault;
                fArr[1] = fKWHzl;
                valueAnimatorAkhnZx.setFloatValues(fArr);
                AkhnZx().start();
            }
        }
    }

    public final void fetchVPNInfo() {
        EZpvd(C33129mqd.AhwBna(java.lang.Float.valueOf(this.EZpvd)) + 101);
        this.OLrzqt = false;
    }
}
