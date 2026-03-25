package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.business.dex.trade.copytrading.edit.ui.widget.autosell.data.CopyTradingAutoSellStrategy;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public abstract class gUD extends LinearLayoutCompat {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public static final BigDecimal OLrzqt;
    public static final BigDecimal copydefault;
    public final C21533hCx AEQbTJ;
    public Function0<Unit> AYXKKw;
    public Function0<Unit> AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String gEmmrt;

    public abstract CopyTradingAutoSellStrategy AEQbTJ();

    public abstract boolean KWHzl(@NotNull BigDecimal bigDecimal);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnErrorShownStateChangedListener(Function0<Unit> function0) {
        this.AYXKKw = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnRemoveClickListener(Function0<Unit> function0) {
        this.AhwBna = function0;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gUD.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    static {
        BigDecimal bigDecimal = new BigDecimal("100");
        OLrzqt = bigDecimal;
        copydefault = bigDecimal;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gUD(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        C21533hCx c21533hCxCopydefault = C21533hCx.copydefault(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c21533hCxCopydefault, "");
        this.AEQbTJ = c21533hCxCopydefault;
        setId(android.view.View.generateViewId());
        setGravity(16);
        setOrientation(0);
        android.widget.ImageView imageView = c21533hCxCopydefault.copydefault;
        imageView.setOnClickListener(new Fragment(imageView, 1000L, this));
        C55008xbo c55008xbo = c21533hCxCopydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        setUpStrategyInput$default(this, c55008xbo, C23274hvD.Fragment.AuCTel, 0, 2, null);
        final C55001xbh c55001xbhEZpvd = EZpvd();
        if (c55001xbhEZpvd != null) {
            c55001xbhEZpvd.setInputType(2);
            c55001xbhEZpvd.setShowThousandsSeparator(true);
            c55001xbhEZpvd.setMaxDecimalValue(0);
            c55001xbhEZpvd.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.gUH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    gUD.AEQbTJ(c55001xbhEZpvd, this, view, z);
                }
            });
            c55001xbhEZpvd.addTextChangedListener(new Application(c55001xbhEZpvd, this));
        }
        final C55001xbh c55001xbhOLrzqt = OLrzqt();
        if (c55001xbhOLrzqt != null) {
            c55001xbhOLrzqt.setInputType(2);
            c55001xbhOLrzqt.setShowThousandsSeparator(true);
            c55001xbhOLrzqt.setMaxDecimalValue(0);
            c55001xbhOLrzqt.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.gUF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    gUD.EZpvd(c55001xbhOLrzqt, this, view, z);
                }
            });
            c55001xbhOLrzqt.addTextChangedListener(new Activity(c55001xbhOLrzqt, this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gUD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C21533hCx c21533hCxCopydefault = C21533hCx.copydefault(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c21533hCxCopydefault, "");
        this.AEQbTJ = c21533hCxCopydefault;
        setId(android.view.View.generateViewId());
        setGravity(16);
        setOrientation(0);
        android.widget.ImageView imageView = c21533hCxCopydefault.copydefault;
        imageView.setOnClickListener(new PendingIntent(imageView, 1000L, this));
        C55008xbo c55008xbo = c21533hCxCopydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        setUpStrategyInput$default(this, c55008xbo, C23274hvD.Fragment.AuCTel, 0, 2, null);
        final C55001xbh c55001xbhEZpvd = EZpvd();
        if (c55001xbhEZpvd != null) {
            c55001xbhEZpvd.setInputType(2);
            c55001xbhEZpvd.setShowThousandsSeparator(true);
            c55001xbhEZpvd.setMaxDecimalValue(0);
            c55001xbhEZpvd.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.gUH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    gUD.AEQbTJ(c55001xbhEZpvd, this, view, z);
                }
            });
            c55001xbhEZpvd.addTextChangedListener(new StateListAnimator(c55001xbhEZpvd, this));
        }
        final C55001xbh c55001xbhOLrzqt = OLrzqt();
        if (c55001xbhOLrzqt != null) {
            c55001xbhOLrzqt.setInputType(2);
            c55001xbhOLrzqt.setShowThousandsSeparator(true);
            c55001xbhOLrzqt.setMaxDecimalValue(0);
            c55001xbhOLrzqt.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.gUF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    gUD.EZpvd(c55001xbhOLrzqt, this, view, z);
                }
            });
            c55001xbhOLrzqt.addTextChangedListener(new FragmentManager(c55001xbhOLrzqt, this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gUD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C21533hCx c21533hCxCopydefault = C21533hCx.copydefault(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c21533hCxCopydefault, "");
        this.AEQbTJ = c21533hCxCopydefault;
        setId(android.view.View.generateViewId());
        setGravity(16);
        setOrientation(0);
        android.widget.ImageView imageView = c21533hCxCopydefault.copydefault;
        imageView.setOnClickListener(new LoaderManager(imageView, 1000L, this));
        C55008xbo c55008xbo = c21533hCxCopydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        setUpStrategyInput$default(this, c55008xbo, C23274hvD.Fragment.AuCTel, 0, 2, null);
        final C55001xbh c55001xbhEZpvd = EZpvd();
        if (c55001xbhEZpvd != null) {
            c55001xbhEZpvd.setInputType(2);
            c55001xbhEZpvd.setShowThousandsSeparator(true);
            c55001xbhEZpvd.setMaxDecimalValue(0);
            c55001xbhEZpvd.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.gUH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    gUD.AEQbTJ(c55001xbhEZpvd, this, view, z);
                }
            });
            c55001xbhEZpvd.addTextChangedListener(new TaskDescription(c55001xbhEZpvd, this));
        }
        final C55001xbh c55001xbhOLrzqt = OLrzqt();
        if (c55001xbhOLrzqt != null) {
            c55001xbhOLrzqt.setInputType(2);
            c55001xbhOLrzqt.setShowThousandsSeparator(true);
            c55001xbhOLrzqt.setMaxDecimalValue(0);
            c55001xbhOLrzqt.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.gUF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    gUD.EZpvd(c55001xbhOLrzqt, this, view, z);
                }
            });
            c55001xbhOLrzqt.addTextChangedListener(new Dialog(c55001xbhOLrzqt, this));
        }
    }

    public final C55001xbh EZpvd() {
        return this.AEQbTJ.AEQbTJ.AkhnZx();
    }

    public final C55001xbh OLrzqt() {
        return this.AEQbTJ.KWHzl.AkhnZx();
    }

    public final boolean AhwBna() {
        return this.AEQbTJ.AEQbTJ.zLjUOn() || this.AEQbTJ.KWHzl.zLjUOn();
    }

    public final boolean copydefault() {
        return copydefault(EZpvd()) || copydefault(OLrzqt());
    }

    public static final class Activity implements android.text.TextWatcher {
        public final /* synthetic */ C55001xbh KWHzl;
        public final /* synthetic */ gUD OLrzqt;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity(C55001xbh c55001xbh, gUD gud) {
            this.KWHzl = c55001xbh;
            this.OLrzqt = gud;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String strIsConnected = this.KWHzl.isConnected();
            if (Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) this.OLrzqt.gEmmrt)) {
                return;
            }
            java.lang.String str = this.OLrzqt.EZpvd;
            if ((str == null || str.length() == 0) && C23313hvq.copydefault(strIsConnected, BigDecimal.ZERO)) {
                this.KWHzl.setText("");
                return;
            }
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(strIsConnected);
            if (!C23313hvq.valueOf(bigDecimalEZpvd, gUD.copydefault) || !C23313hvq.EZpvd(bigDecimalEZpvd, BigDecimal.ZERO)) {
                java.lang.String str2 = this.OLrzqt.gEmmrt;
                if (str2 != null) {
                    this.KWHzl.setPlainNumericText(str2);
                    return;
                }
                return;
            }
            this.OLrzqt.gEmmrt = strIsConnected;
        }
    }

    public static final class Application implements android.text.TextWatcher {
        public final /* synthetic */ gUD KWHzl;
        public final /* synthetic */ C55001xbh OLrzqt;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application(C55001xbh c55001xbh, gUD gud) {
            this.OLrzqt = c55001xbh;
            this.KWHzl = gud;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String strIsConnected = this.OLrzqt.isConnected();
            if (Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) this.KWHzl.EZpvd)) {
                return;
            }
            java.lang.String str = this.KWHzl.EZpvd;
            if ((str == null || str.length() == 0) && C23313hvq.copydefault(strIsConnected, BigDecimal.ZERO)) {
                this.OLrzqt.setText("");
                return;
            }
            if (this.KWHzl.KWHzl(C33129mqd.EZpvd(strIsConnected))) {
                this.KWHzl.EZpvd = strIsConnected;
                return;
            }
            java.lang.String str2 = this.KWHzl.EZpvd;
            if (str2 != null) {
                this.OLrzqt.setPlainNumericText(str2);
            }
        }
    }

    public static final class Dialog implements android.text.TextWatcher {
        public final /* synthetic */ C55001xbh EZpvd;
        public final /* synthetic */ gUD KWHzl;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Dialog(C55001xbh c55001xbh, gUD gud) {
            this.EZpvd = c55001xbh;
            this.KWHzl = gud;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String strIsConnected = this.EZpvd.isConnected();
            if (Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) this.KWHzl.gEmmrt)) {
                return;
            }
            java.lang.String str = this.KWHzl.EZpvd;
            if ((str == null || str.length() == 0) && C23313hvq.copydefault(strIsConnected, BigDecimal.ZERO)) {
                this.EZpvd.setText("");
                return;
            }
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(strIsConnected);
            if (!C23313hvq.valueOf(bigDecimalEZpvd, gUD.copydefault) || !C23313hvq.EZpvd(bigDecimalEZpvd, BigDecimal.ZERO)) {
                java.lang.String str2 = this.KWHzl.gEmmrt;
                if (str2 != null) {
                    this.EZpvd.setPlainNumericText(str2);
                    return;
                }
                return;
            }
            this.KWHzl.gEmmrt = strIsConnected;
        }
    }

    public static final class FragmentManager implements android.text.TextWatcher {
        public final /* synthetic */ C55001xbh EZpvd;
        public final /* synthetic */ gUD OLrzqt;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public FragmentManager(C55001xbh c55001xbh, gUD gud) {
            this.EZpvd = c55001xbh;
            this.OLrzqt = gud;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String strIsConnected = this.EZpvd.isConnected();
            if (Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) this.OLrzqt.gEmmrt)) {
                return;
            }
            java.lang.String str = this.OLrzqt.EZpvd;
            if ((str == null || str.length() == 0) && C23313hvq.copydefault(strIsConnected, BigDecimal.ZERO)) {
                this.EZpvd.setText("");
                return;
            }
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(strIsConnected);
            if (!C23313hvq.valueOf(bigDecimalEZpvd, gUD.copydefault) || !C23313hvq.EZpvd(bigDecimalEZpvd, BigDecimal.ZERO)) {
                java.lang.String str2 = this.OLrzqt.gEmmrt;
                if (str2 != null) {
                    this.EZpvd.setPlainNumericText(str2);
                    return;
                }
                return;
            }
            this.OLrzqt.gEmmrt = strIsConnected;
        }
    }

    public static final class StateListAnimator implements android.text.TextWatcher {
        public final /* synthetic */ C55001xbh EZpvd;
        public final /* synthetic */ gUD KWHzl;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator(C55001xbh c55001xbh, gUD gud) {
            this.EZpvd = c55001xbh;
            this.KWHzl = gud;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String strIsConnected = this.EZpvd.isConnected();
            if (Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) this.KWHzl.EZpvd)) {
                return;
            }
            java.lang.String str = this.KWHzl.EZpvd;
            if ((str == null || str.length() == 0) && C23313hvq.copydefault(strIsConnected, BigDecimal.ZERO)) {
                this.EZpvd.setText("");
                return;
            }
            if (this.KWHzl.KWHzl(C33129mqd.EZpvd(strIsConnected))) {
                this.KWHzl.EZpvd = strIsConnected;
                return;
            }
            java.lang.String str2 = this.KWHzl.EZpvd;
            if (str2 != null) {
                this.EZpvd.setPlainNumericText(str2);
            }
        }
    }

    public static final class TaskDescription implements android.text.TextWatcher {
        public final /* synthetic */ gUD EZpvd;
        public final /* synthetic */ C55001xbh copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskDescription(C55001xbh c55001xbh, gUD gud) {
            this.copydefault = c55001xbh;
            this.EZpvd = gud;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String strIsConnected = this.copydefault.isConnected();
            if (Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) this.EZpvd.EZpvd)) {
                return;
            }
            java.lang.String str = this.EZpvd.EZpvd;
            if ((str == null || str.length() == 0) && C23313hvq.copydefault(strIsConnected, BigDecimal.ZERO)) {
                this.copydefault.setText("");
                return;
            }
            if (this.EZpvd.KWHzl(C33129mqd.EZpvd(strIsConnected))) {
                this.EZpvd.EZpvd = strIsConnected;
                return;
            }
            java.lang.String str2 = this.EZpvd.EZpvd;
            if (str2 != null) {
                this.copydefault.setPlainNumericText(str2);
            }
        }
    }

    public static final void AEQbTJ(C55001xbh c55001xbh, gUD gud, android.view.View view, boolean z) {
        pUU.KWHzl("CopyTradingAutoSellStrategyItemView", "priceChange%: " + c55001xbh.getClass() + ", #" + gud.valueOf() + ": hasFocus = " + z);
        if (z) {
            C55008xbo c55008xbo = gud.AEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            gud.OLrzqt(c55008xbo);
            return;
        }
        gud.djBIcL();
    }

    public static final void EZpvd(C55001xbh c55001xbh, gUD gud, android.view.View view, boolean z) {
        pUU.KWHzl("CopyTradingAutoSellStrategyItemView", "sell%: " + c55001xbh.getClass() + ", #" + gud.valueOf() + ": hasFocus = " + z);
        if (z) {
            C55008xbo c55008xbo = gud.AEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            gud.OLrzqt(c55008xbo);
            return;
        }
        gud.djBIcL();
    }

    private final int valueOf() {
        android.view.ViewParent parent = getParent();
        Intrinsics.copydefault(parent, "");
        return ((android.view.ViewGroup) parent).indexOfChild(this);
    }

    public final void setLabel(@androidx.annotation.StringRes int i, @androidx.annotation.DrawableRes int i2) {
        C55008xbo c55008xbo = this.AEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        setUpStrategyInput(c55008xbo, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        android.app.Activity activityOLrzqt;
        super.onAttachedToWindow();
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner == null || (activityOLrzqt = C33569myt.OLrzqt(getContext())) == null) {
            return;
        }
        C59541ziw.EZpvd(activityOLrzqt, lifecycleOwner, new InterfaceC59496ziD() { // from class: o.gUE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59496ziD
            public final void OLrzqt(boolean z) {
                gUD.KWHzl(this.OLrzqt, z);
            }
        });
    }

    public static final void KWHzl(gUD gud, boolean z) {
        if (z) {
            return;
        }
        gud.AEQbTJ.AEQbTJ.clearFocus();
        gud.AEQbTJ.KWHzl.clearFocus();
    }

    public static /* synthetic */ void setUpStrategyInput$default(gUD gud, C55008xbo c55008xbo, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setUpStrategyInput");
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        gud.setUpStrategyInput(c55008xbo, i, i2);
    }

    public final void setUpStrategyInput(C55008xbo c55008xbo, @androidx.annotation.StringRes int i, @androidx.annotation.DrawableRes int i2) {
        android.widget.TextView textViewFJNWhG = c55008xbo.fJNWhG();
        if (textViewFJNWhG != null) {
            KWHzl(textViewFJNWhG, i, i2);
        }
        EZpvd(c55008xbo);
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            KWHzl(c55001xbhAkhnZx);
        }
    }

    public final void KWHzl(C55001xbh c55001xbh) {
        c55001xbh.setGravity(TextAlign.RIGHT);
        ViewGroup.LayoutParams layoutParams = c55001xbh.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(c55001xbh.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.ffGIBT));
            android.content.Context context = c55001xbh.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            marginLayoutParams.setMarginEnd(C55298xhM.OLrzqt(4, context));
            c55001xbh.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ gUD copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, gUD gud) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = gud;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                Function0 function0 = this.copydefault.AhwBna;
                if (function0 != null) {
                    function0.invoke();
                }
                android.view.ViewParent parent = this.copydefault.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.copydefault);
                }
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ gUD OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, gUD gud) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = gud;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0 function0 = this.OLrzqt.AhwBna;
                if (function0 != null) {
                    function0.invoke();
                }
                android.view.ViewParent parent = this.OLrzqt.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.OLrzqt);
                }
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ gUD copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, gUD gud) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = gud;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Function0 function0 = this.copydefault.AhwBna;
                if (function0 != null) {
                    function0.invoke();
                }
                android.view.ViewParent parent = this.copydefault.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.copydefault);
                }
            }
        }
    }

    public final void EZpvd(C55008xbo c55008xbo) {
        android.widget.TextView textView = new android.widget.TextView(c55008xbo.getContext());
        textView.setText("%");
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.fdOvFl));
        TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.AxsJAY);
        C55009xbp c55009xbpFIwbmz = c55008xbo.fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.copydefault((android.view.View) textView, (java.lang.Integer) 0);
        }
    }

    public final void OLrzqt(final C55008xbo c55008xbo) {
        c55008xbo.setErrorShowing(false);
        c55008xbo.setState(1);
        Function0<Unit> function0 = this.AYXKKw;
        if (function0 != null) {
            function0.invoke();
        }
        c55008xbo.post(new java.lang.Runnable() { // from class: o.gUL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                gUD.AEQbTJ(c55008xbo);
            }
        });
    }

    public static final void AEQbTJ(C55008xbo c55008xbo) {
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx == null) {
            return;
        }
        android.content.Context context = c55008xbo.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ContextCompat.getSystemService(context, android.view.inputmethod.InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(c55001xbhAkhnZx, 0);
        }
        android.text.Editable text = c55001xbhAkhnZx.getText();
        if (c55001xbhAkhnZx.fetchVPNInfo()) {
            if (Intrinsics.EZpvd((java.lang.Object) (text != null ? text.toString() : null), (java.lang.Object) "-")) {
                c55001xbhAkhnZx.setSelection(text.length());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void djBIcL() {
        C55001xbh c55001xbhEZpvd = EZpvd();
        android.text.Editable text = c55001xbhEZpvd != null ? c55001xbhEZpvd.getText() : null;
        if (text == null || text.length() == 0) {
            C55001xbh c55001xbhOLrzqt = OLrzqt();
            android.text.Editable text2 = c55001xbhOLrzqt != null ? c55001xbhOLrzqt.getText() : null;
            if (text2 == null || text2.length() == 0) {
                this.AEQbTJ.AEQbTJ.setErrorShowing(false);
                this.AEQbTJ.KWHzl.setErrorShowing(false);
            } else {
                C55001xbh c55001xbhEZpvd2 = EZpvd();
                java.lang.String strIsConnected = c55001xbhEZpvd2 != null ? c55001xbhEZpvd2.isConnected() : null;
                BigDecimal bigDecimal = BigDecimal.ZERO;
                if (C23313hvq.copydefault(strIsConnected, bigDecimal)) {
                    if (strIsConnected != null && strIsConnected.length() != 0) {
                        this.AEQbTJ.AEQbTJ.setText("");
                    }
                    this.AEQbTJ.AEQbTJ.setErrorShowing(true);
                } else {
                    this.AEQbTJ.AEQbTJ.setErrorShowing(false);
                }
                C55001xbh c55001xbhOLrzqt2 = OLrzqt();
                java.lang.String strIsConnected2 = c55001xbhOLrzqt2 != null ? c55001xbhOLrzqt2.isConnected() : null;
                if (C23313hvq.copydefault(strIsConnected2, bigDecimal)) {
                    if (strIsConnected2 != null && strIsConnected2.length() != 0) {
                        this.AEQbTJ.KWHzl.setText("");
                    }
                    this.AEQbTJ.KWHzl.setErrorShowing(true);
                } else {
                    this.AEQbTJ.KWHzl.setErrorShowing(false);
                }
            }
        }
        Function0<Unit> function0 = this.AYXKKw;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final boolean copydefault(C55001xbh c55001xbh) {
        android.text.Editable text = c55001xbh != null ? c55001xbh.getText() : null;
        if (text != null && text.length() != 0) {
            if (C23313hvq.copydefault(c55001xbh != null ? c55001xbh.isConnected() : null, BigDecimal.ZERO)) {
                return true;
            }
        }
        return false;
    }

    public final void KWHzl(android.widget.TextView textView, int i, int i2) {
        android.graphics.drawable.Drawable drawable;
        textView.setVisibility(0);
        textView.setGravity(16);
        textView.setCompoundDrawablePadding(textView.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.QkdxfA));
        textView.setText(i);
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.fdOvFl));
        if (i2 == 0 || (drawable = ContextCompat.getDrawable(textView.getContext(), i2)) == null) {
            drawable = null;
        } else {
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(20, context);
            android.content.Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(20, context2));
        }
        TextViewCompat.setCompoundDrawablesRelative(textView, drawable, null, null, null);
        TextViewCompat.setCompoundDrawableTintList(textView, ContextCompat.getColorStateList(textView.getContext(), C52761wXj.Activity.fdOvFl));
        TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.AxsJAY);
    }
}
