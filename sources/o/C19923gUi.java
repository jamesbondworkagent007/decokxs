package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.okinc.business.dex.trade.copytrading.edit.ui.model.RangeFilterUnit;
import com.okinc.business.dex.trade.copytrading.edit.ui.model.TokenAmountUnit;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gUi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C19923gUi extends ConstraintLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public boolean AEQbTJ;
    public Function1<? super java.lang.Boolean, Unit> AYXKKw;
    public Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> AhwBna;
    public Function0<Unit> AkhnZx;
    public Function0<Unit> EZpvd;
    public DexMultiTokenInfoBean OLrzqt;
    public final C23521hzm copydefault;
    public Function1<? super java.lang.Boolean, Unit> djBIcL;
    public java.lang.String gEmmrt;
    public RangeFilterUnit valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19923gUi(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<Unit> function0) {
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function0<Unit> function0) {
        this.AkhnZx = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnInputChangeListener(Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        this.AhwBna = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnMaxBuyChangedListener(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.djBIcL = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnSkipHodlingChangedListener(Function1<? super java.lang.Boolean, Unit> function1) {
        this.AYXKKw = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:37) call: o.gUi.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C19923gUi(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19923gUi(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C23521hzm c23521hzmAEQbTJ = C23521hzm.AEQbTJ(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c23521hzmAEQbTJ, "");
        this.copydefault = c23521hzmAEQbTJ;
        this.gEmmrt = "";
        setPaddingRelative(getPaddingStart(), C55298xhM.OLrzqt(8, context), getPaddingEnd(), C55298xhM.OLrzqt(8, context));
        C55001xbh c55001xbhAkhnZx = c23521hzmAEQbTJ.OLrzqt.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setShowThousandsSeparator(true);
        }
        c23521hzmAEQbTJ.gEmmrt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.gUf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C19923gUi.EZpvd(this.AEQbTJ, compoundButton, z);
            }
        });
        C55001xbh c55001xbhAkhnZx2 = c23521hzmAEQbTJ.OLrzqt.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.addTextChangedListener(new Activity());
        }
        c23521hzmAEQbTJ.AhwBna.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.gUj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C19923gUi.KWHzl(this.EZpvd, compoundButton, z);
            }
        });
        c23521hzmAEQbTJ.KWHzl.setInitUI(true);
        C55320xhi c55320xhi = c23521hzmAEQbTJ.AEQbTJ;
        c55320xhi.setOnClickListener(new ActionBar(c55320xhi, 1000L, this));
        C55320xhi c55320xhi2 = c23521hzmAEQbTJ.copydefault;
        c55320xhi2.setOnClickListener(new Application(c55320xhi2, 1000L, this));
        AEQbTJ(new TokenAmountUnit("--"));
    }

    /* JADX INFO: renamed from: o.gUi$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gUi.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final android.widget.TextView copydefault(C55008xbo c55008xbo) {
        android.widget.LinearLayout linearLayoutAuCTel = c55008xbo.AuCTel();
        android.view.View childAt = linearLayoutAuCTel != null ? linearLayoutAuCTel.getChildAt(1) : null;
        android.widget.TextView textView = childAt instanceof android.widget.TextView ? (android.widget.TextView) childAt : null;
        if (textView != null) {
            return textView;
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(c55008xbo.getContext());
        android.content.res.ColorStateList colorStateList = ContextCompat.getColorStateList(appCompatTextView.getContext(), C52761wXj.Activity.fdOvFl);
        appCompatTextView.setTextColor(colorStateList);
        TextViewCompat.setTextAppearance(appCompatTextView, C52761wXj.LoaderManager.KWHzl);
        appCompatTextView.setGravity(16);
        appCompatTextView.setCompoundDrawablePadding(appCompatTextView.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.dxcTrN));
        TextViewCompat.setCompoundDrawableTintList(appCompatTextView, colorStateList);
        C55009xbp c55009xbpFIwbmz = c55008xbo.fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.EZpvd(appCompatTextView);
        }
        return appCompatTextView;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(C55008xbo c55008xbo) {
        int i;
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            i = !c55001xbhAkhnZx.isFocused() ? 0 : 1;
        }
        c55008xbo.setState(i);
    }

    public final C19919gUe KWHzl() {
        C19919gUe c19919gUe = this.copydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c19919gUe, "");
        return c19919gUe;
    }

    public final C55008xbo AEQbTJ() {
        C55008xbo c55008xbo = this.copydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        return c55008xbo;
    }

    private final void EZpvd(java.lang.String str) {
        if (str.length() > 0) {
            this.copydefault.OLrzqt.setState(2);
            this.copydefault.OLrzqt.setErrorText(str);
        } else {
            C55008xbo c55008xbo = this.copydefault.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            EZpvd(c55008xbo);
            this.copydefault.OLrzqt.values();
        }
    }

    /* JADX INFO: renamed from: o.gUi$Activity */
    public static final class Activity implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            if (!C19923gUi.this.AEQbTJ) {
                C19923gUi.this.AEQbTJ = C33129mqd.OLrzqt((java.lang.CharSequence) editable);
            }
            C19923gUi.this.copydefault();
        }
    }

    private final void AEQbTJ(RangeFilterUnit rangeFilterUnit) {
        java.lang.String text;
        this.valueOf = rangeFilterUnit;
        C55008xbo c55008xbo = this.copydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        android.widget.TextView textViewCopydefault = copydefault(c55008xbo);
        if (rangeFilterUnit != null) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            text = rangeFilterUnit.getText(context);
        } else {
            text = null;
        }
        textViewCopydefault.setText(text);
    }

    private final void KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        this.OLrzqt = dexMultiTokenInfoBean;
        java.lang.String tokenSymbol = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenSymbol() : null;
        if (tokenSymbol == null) {
            tokenSymbol = "";
        }
        AEQbTJ(new TokenAmountUnit(tokenSymbol));
    }

    public static final void EZpvd(C19923gUi c19923gUi, android.widget.CompoundButton compoundButton, boolean z) {
        C55008xbo c55008xbo = c19923gUi.copydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        c55008xbo.setVisibility(z ? 0 : 8);
        Function1<? super java.lang.Boolean, Unit> function1 = c19923gUi.djBIcL;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
        c19923gUi.copydefault();
    }

    public static final void KWHzl(C19923gUi c19923gUi, android.widget.CompoundButton compoundButton, boolean z) {
        Function1<? super java.lang.Boolean, Unit> function1 = c19923gUi.AYXKKw;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
    }

    public final void setIsSkipHodling(boolean z) {
        this.copydefault.AhwBna.setChecked(z);
    }

    public final void setMaxBuyAmount(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault.gEmmrt.setChecked(C23313hvq.OLrzqt(str, 0));
        this.copydefault.OLrzqt.setText(str);
    }

    public final void setMaxBuyVisible(boolean z) {
        C55320xhi c55320xhi = this.copydefault.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55320xhi, "");
        c55320xhi.setVisibility(z ? 0 : 8);
        C55239xgG c55239xgG = this.copydefault.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c55239xgG, "");
        c55239xgG.setVisibility(z ? 0 : 8);
        Barrier barrier = this.copydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(barrier, "");
        barrier.setVisibility(z ? 0 : 8);
        C55008xbo c55008xbo = this.copydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        c55008xbo.setVisibility((z && this.copydefault.gEmmrt.isChecked()) ? 0 : 8);
    }

    /* JADX INFO: renamed from: o.gUi$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C19923gUi KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C19923gUi c19923gUi) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c19923gUi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C55320xhi c55320xhi = (C55320xhi) this.copydefault;
                Function0 function0 = this.KWHzl.AkhnZx;
                if (function0 != null) {
                    function0.invoke();
                }
                android.content.Context context = c55320xhi.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(new ViewOnClickListenerC54939xaY(context).EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.FYtjSf), c55320xhi.getContext().getString(C23274hvD.Fragment.aeJQwa)), C23274hvD.Fragment.OcIXYQ, (View.OnClickListener) null, 2, (java.lang.Object) null).show();
            }
        }
    }

    /* JADX INFO: renamed from: o.gUi$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C19923gUi AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C19923gUi c19923gUi) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = c19923gUi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C55320xhi c55320xhi = (C55320xhi) this.KWHzl;
                Function0 function0 = this.AEQbTJ.EZpvd;
                if (function0 != null) {
                    function0.invoke();
                }
                android.content.Context context = c55320xhi.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(new ViewOnClickListenerC54939xaY(context).EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.clearRegistrations), c55320xhi.getContext().getString(C23274hvD.Fragment.svhCHd)), C23274hvD.Fragment.OcIXYQ, (View.OnClickListener) null, 2, (java.lang.Object) null).show();
            }
        }
    }

    public final void copydefault() {
        if (!this.copydefault.gEmmrt.isChecked()) {
            Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2 = this.AhwBna;
            if (function2 != null) {
                function2.invoke(java.lang.Boolean.TRUE, "");
                return;
            }
            return;
        }
        C55001xbh c55001xbhAkhnZx = this.copydefault.OLrzqt.AkhnZx();
        java.lang.String strIsConnected = c55001xbhAkhnZx != null ? c55001xbhAkhnZx.isConnected() : null;
        if (strIsConnected == null) {
            strIsConnected = "";
        }
        if (strIsConnected.length() == 0) {
            if (this.AEQbTJ) {
                EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.dbUqJD));
            }
            Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function22 = this.AhwBna;
            if (function22 != null) {
                function22.invoke(java.lang.Boolean.FALSE, strIsConnected);
                return;
            }
            return;
        }
        if (C23313hvq.copydefault(strIsConnected, 0)) {
            EZpvd(C33070mpX.AYXKKw(C23274hvD.Fragment.DRGLNw));
            Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function23 = this.AhwBna;
            if (function23 != null) {
                function23.invoke(java.lang.Boolean.FALSE, strIsConnected);
                return;
            }
            return;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean = this.OLrzqt;
        java.lang.String price = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getPrice() : null;
        java.lang.String str = price == null ? "" : price;
        if (C30565ldZ.EZpvd(str) && C30565ldZ.EZpvd(this.gEmmrt) && C33129mqd.gEmmrt(C33129mqd.mulS$default(strIsConnected, str, null, null, null, 14, null), this.gEmmrt)) {
            int i = C23274hvD.Fragment.DBAlnt;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = C56390yDp.OLrzqt("num", C33129mqd.divS$default(this.gEmmrt, str, 6, null, null, 12, null));
            RangeFilterUnit rangeFilterUnit = this.valueOf;
            java.lang.String unitValue = rangeFilterUnit != null ? rangeFilterUnit.getUnitValue() : null;
            pairArr[1] = C56390yDp.OLrzqt("token", unitValue != null ? unitValue : "");
            EZpvd(C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
            Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function24 = this.AhwBna;
            if (function24 != null) {
                function24.invoke(java.lang.Boolean.FALSE, strIsConnected);
                return;
            }
            return;
        }
        EZpvd("");
        Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function25 = this.AhwBna;
        if (function25 != null) {
            function25.invoke(java.lang.Boolean.TRUE, strIsConnected);
        }
    }

    public final void setMaxBuyTokenSymbol(DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(dexMultiTokenInfoBean);
        this.gEmmrt = str;
        if (AEQbTJ().getVisibility() == 0) {
            C55001xbh c55001xbhAkhnZx = AEQbTJ().AkhnZx();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (c55001xbhAkhnZx != null ? c55001xbhAkhnZx.isConnected() : null))) {
                copydefault();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.EZpvd = null;
        this.AkhnZx = null;
        super.onDetachedFromWindow();
    }
}
