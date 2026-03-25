package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.ldo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC30580ldo extends LinearLayoutCompat {
    public static final BigDecimal KWHzl;
    public static final BigDecimal OLrzqt;
    public java.lang.String AEQbTJ;
    public android.widget.TextView AYXKKw;
    public Function0<Unit> AhwBna;
    public final C21528hCs EZpvd;
    public android.widget.TextView djBIcL;
    public Function0<Unit> gEmmrt;
    public java.lang.String valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;

    public abstract boolean AEQbTJ(@NotNull BigDecimal bigDecimal);

    public abstract AdvancedAutoSellStrategy OLrzqt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnErrorShownStateChangedListener(Function0<Unit> function0) {
        this.gEmmrt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnRemoveClickListener(Function0<Unit> function0) {
        this.AhwBna = function0;
    }

    /* JADX INFO: renamed from: o.ldo$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ldo.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    static {
        BigDecimal bigDecimal = new BigDecimal("100");
        OLrzqt = bigDecimal;
        KWHzl = bigDecimal;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC30580ldo(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        C21528hCs c21528hCsCopydefault = C21528hCs.copydefault(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c21528hCsCopydefault, "");
        this.EZpvd = c21528hCsCopydefault;
        setId(android.view.View.generateViewId());
        setGravity(16);
        setOrientation(1);
        android.widget.ImageView imageView = c21528hCsCopydefault.copydefault;
        imageView.setOnClickListener(new Dialog(imageView, 1000L, this));
        android.widget.ImageView imageView2 = c21528hCsCopydefault.OLrzqt;
        imageView2.setOnClickListener(new PendingIntent(imageView2, 1000L, this));
        android.widget.TextView textView = c21528hCsCopydefault.AhwBna;
        textView.setOnClickListener(new Fragment(textView, 1000L));
        c21528hCsCopydefault.KWHzl.setHintText("");
        c21528hCsCopydefault.EZpvd.setHintText("");
        C55008xbo c55008xbo = c21528hCsCopydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        setUpStrategyInput(c55008xbo, C23274hvD.Fragment.AuCTel);
        C55008xbo c55008xbo2 = c21528hCsCopydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
        this.djBIcL = copydefault(c55008xbo2);
        C55008xbo c55008xbo3 = c21528hCsCopydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55008xbo3, "");
        this.AYXKKw = copydefault(c55008xbo3);
        final C55001xbh c55001xbhKWHzl = KWHzl();
        if (c55001xbhKWHzl != null) {
            c55001xbhKWHzl.setInputType(2);
            c55001xbhKWHzl.setShowThousandsSeparator(true);
            c55001xbhKWHzl.EZpvd(0);
            c55001xbhKWHzl.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.ldk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    AbstractC30580ldo.EZpvd(c55001xbhKWHzl, this, view, z);
                }
            });
            c55001xbhKWHzl.addTextChangedListener(new Activity(c55001xbhKWHzl, this));
        }
        final C55001xbh c55001xbhEZpvd = EZpvd();
        if (c55001xbhEZpvd != null) {
            c55001xbhEZpvd.setInputType(2);
            c55001xbhEZpvd.setShowThousandsSeparator(true);
            c55001xbhEZpvd.EZpvd(0);
            c55001xbhEZpvd.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.ldm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    AbstractC30580ldo.KWHzl(c55001xbhEZpvd, this, view, z);
                }
            });
            c55001xbhEZpvd.addTextChangedListener(new ActionBar(c55001xbhEZpvd, this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC30580ldo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C21528hCs c21528hCsCopydefault = C21528hCs.copydefault(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c21528hCsCopydefault, "");
        this.EZpvd = c21528hCsCopydefault;
        setId(android.view.View.generateViewId());
        setGravity(16);
        setOrientation(1);
        android.widget.ImageView imageView = c21528hCsCopydefault.copydefault;
        imageView.setOnClickListener(new PictureInPictureParams(imageView, 1000L, this));
        android.widget.ImageView imageView2 = c21528hCsCopydefault.OLrzqt;
        imageView2.setOnClickListener(new SharedElementCallback(imageView2, 1000L, this));
        android.widget.TextView textView = c21528hCsCopydefault.AhwBna;
        textView.setOnClickListener(new AssistContent(textView, 1000L));
        c21528hCsCopydefault.KWHzl.setHintText("");
        c21528hCsCopydefault.EZpvd.setHintText("");
        C55008xbo c55008xbo = c21528hCsCopydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        setUpStrategyInput(c55008xbo, C23274hvD.Fragment.AuCTel);
        C55008xbo c55008xbo2 = c21528hCsCopydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
        this.djBIcL = copydefault(c55008xbo2);
        C55008xbo c55008xbo3 = c21528hCsCopydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55008xbo3, "");
        this.AYXKKw = copydefault(c55008xbo3);
        final C55001xbh c55001xbhKWHzl = KWHzl();
        if (c55001xbhKWHzl != null) {
            c55001xbhKWHzl.setInputType(2);
            c55001xbhKWHzl.setShowThousandsSeparator(true);
            c55001xbhKWHzl.EZpvd(0);
            c55001xbhKWHzl.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.ldk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    AbstractC30580ldo.EZpvd(c55001xbhKWHzl, this, view, z);
                }
            });
            c55001xbhKWHzl.addTextChangedListener(new FragmentManager(c55001xbhKWHzl, this));
        }
        final C55001xbh c55001xbhEZpvd = EZpvd();
        if (c55001xbhEZpvd != null) {
            c55001xbhEZpvd.setInputType(2);
            c55001xbhEZpvd.setShowThousandsSeparator(true);
            c55001xbhEZpvd.EZpvd(0);
            c55001xbhEZpvd.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.ldm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    AbstractC30580ldo.KWHzl(c55001xbhEZpvd, this, view, z);
                }
            });
            c55001xbhEZpvd.addTextChangedListener(new StateListAnimator(c55001xbhEZpvd, this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC30580ldo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C21528hCs c21528hCsCopydefault = C21528hCs.copydefault(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c21528hCsCopydefault, "");
        this.EZpvd = c21528hCsCopydefault;
        setId(android.view.View.generateViewId());
        setGravity(16);
        setOrientation(1);
        android.widget.ImageView imageView = c21528hCsCopydefault.copydefault;
        imageView.setOnClickListener(new TaskStackBuilder(imageView, 1000L, this));
        android.widget.ImageView imageView2 = c21528hCsCopydefault.OLrzqt;
        imageView2.setOnClickListener(new VoiceInteractor(imageView2, 1000L, this));
        android.widget.TextView textView = c21528hCsCopydefault.AhwBna;
        textView.setOnClickListener(new ComponentCallbacks2(textView, 1000L));
        c21528hCsCopydefault.KWHzl.setHintText("");
        c21528hCsCopydefault.EZpvd.setHintText("");
        C55008xbo c55008xbo = c21528hCsCopydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        setUpStrategyInput(c55008xbo, C23274hvD.Fragment.AuCTel);
        C55008xbo c55008xbo2 = c21528hCsCopydefault.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
        this.djBIcL = copydefault(c55008xbo2);
        C55008xbo c55008xbo3 = c21528hCsCopydefault.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55008xbo3, "");
        this.AYXKKw = copydefault(c55008xbo3);
        final C55001xbh c55001xbhKWHzl = KWHzl();
        if (c55001xbhKWHzl != null) {
            c55001xbhKWHzl.setInputType(2);
            c55001xbhKWHzl.setShowThousandsSeparator(true);
            c55001xbhKWHzl.EZpvd(0);
            c55001xbhKWHzl.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.ldk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    AbstractC30580ldo.EZpvd(c55001xbhKWHzl, this, view, z);
                }
            });
            c55001xbhKWHzl.addTextChangedListener(new LoaderManager(c55001xbhKWHzl, this));
        }
        final C55001xbh c55001xbhEZpvd = EZpvd();
        if (c55001xbhEZpvd != null) {
            c55001xbhEZpvd.setInputType(2);
            c55001xbhEZpvd.setShowThousandsSeparator(true);
            c55001xbhEZpvd.EZpvd(0);
            c55001xbhEZpvd.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.ldm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    AbstractC30580ldo.KWHzl(c55001xbhEZpvd, this, view, z);
                }
            });
            c55001xbhEZpvd.addTextChangedListener(new Application(c55001xbhEZpvd, this));
        }
    }

    public final C55001xbh KWHzl() {
        return this.EZpvd.KWHzl.AkhnZx();
    }

    public final C55001xbh EZpvd() {
        return this.EZpvd.EZpvd.AkhnZx();
    }

    public final android.widget.TextView djBIcL() {
        android.widget.TextView textView = this.EZpvd.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final C55008xbo copydefault() {
        C55008xbo c55008xbo = this.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        return c55008xbo;
    }

    /* JADX INFO: renamed from: o.ldo$ActionBar */
    public static final class ActionBar implements android.text.TextWatcher {
        public final /* synthetic */ C55001xbh EZpvd;
        public final /* synthetic */ AbstractC30580ldo KWHzl;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar(C55001xbh c55001xbh, AbstractC30580ldo abstractC30580ldo) {
            this.EZpvd = c55001xbh;
            this.KWHzl = abstractC30580ldo;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String strIsConnected = this.EZpvd.isConnected();
            if (Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) this.KWHzl.valueOf)) {
                return;
            }
            java.lang.String str = this.KWHzl.AEQbTJ;
            if ((str == null || str.length() == 0) && C23313hvq.copydefault(strIsConnected, BigDecimal.ZERO)) {
                this.EZpvd.setText("");
                return;
            }
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(strIsConnected);
            if (!C23313hvq.valueOf(bigDecimalEZpvd, AbstractC30580ldo.KWHzl) || !C23313hvq.EZpvd(bigDecimalEZpvd, BigDecimal.ZERO)) {
                java.lang.String str2 = this.KWHzl.valueOf;
                if (str2 != null) {
                    this.EZpvd.setPlainNumericText(str2);
                }
            } else {
                this.KWHzl.valueOf = strIsConnected;
            }
            this.KWHzl.AhwBna();
        }
    }

    /* JADX INFO: renamed from: o.ldo$Activity */
    public static final class Activity implements android.text.TextWatcher {
        public final /* synthetic */ C55001xbh KWHzl;
        public final /* synthetic */ AbstractC30580ldo OLrzqt;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity(C55001xbh c55001xbh, AbstractC30580ldo abstractC30580ldo) {
            this.KWHzl = c55001xbh;
            this.OLrzqt = abstractC30580ldo;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String strIsConnected = this.KWHzl.isConnected();
            if (Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) this.OLrzqt.AEQbTJ)) {
                return;
            }
            java.lang.String str = this.OLrzqt.AEQbTJ;
            if ((str == null || str.length() == 0) && C23313hvq.copydefault(strIsConnected, BigDecimal.ZERO)) {
                this.KWHzl.setText("");
                return;
            }
            if (this.OLrzqt.AEQbTJ(C33129mqd.EZpvd(strIsConnected))) {
                this.OLrzqt.AEQbTJ = strIsConnected;
            } else {
                java.lang.String str2 = this.OLrzqt.AEQbTJ;
                if (str2 != null) {
                    this.KWHzl.setPlainNumericText(str2);
                }
            }
            this.OLrzqt.valueOf();
        }
    }

    /* JADX INFO: renamed from: o.ldo$Application */
    public static final class Application implements android.text.TextWatcher {
        public final /* synthetic */ AbstractC30580ldo EZpvd;
        public final /* synthetic */ C55001xbh OLrzqt;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application(C55001xbh c55001xbh, AbstractC30580ldo abstractC30580ldo) {
            this.OLrzqt = c55001xbh;
            this.EZpvd = abstractC30580ldo;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String strIsConnected = this.OLrzqt.isConnected();
            if (Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) this.EZpvd.valueOf)) {
                return;
            }
            java.lang.String str = this.EZpvd.AEQbTJ;
            if ((str == null || str.length() == 0) && C23313hvq.copydefault(strIsConnected, BigDecimal.ZERO)) {
                this.OLrzqt.setText("");
                return;
            }
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(strIsConnected);
            if (!C23313hvq.valueOf(bigDecimalEZpvd, AbstractC30580ldo.KWHzl) || !C23313hvq.EZpvd(bigDecimalEZpvd, BigDecimal.ZERO)) {
                java.lang.String str2 = this.EZpvd.valueOf;
                if (str2 != null) {
                    this.OLrzqt.setPlainNumericText(str2);
                }
            } else {
                this.EZpvd.valueOf = strIsConnected;
            }
            this.EZpvd.AhwBna();
        }
    }

    /* JADX INFO: renamed from: o.ldo$FragmentManager */
    public static final class FragmentManager implements android.text.TextWatcher {
        public final /* synthetic */ AbstractC30580ldo AEQbTJ;
        public final /* synthetic */ C55001xbh KWHzl;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public FragmentManager(C55001xbh c55001xbh, AbstractC30580ldo abstractC30580ldo) {
            this.KWHzl = c55001xbh;
            this.AEQbTJ = abstractC30580ldo;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String strIsConnected = this.KWHzl.isConnected();
            if (Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) this.AEQbTJ.AEQbTJ)) {
                return;
            }
            java.lang.String str = this.AEQbTJ.AEQbTJ;
            if ((str == null || str.length() == 0) && C23313hvq.copydefault(strIsConnected, BigDecimal.ZERO)) {
                this.KWHzl.setText("");
                return;
            }
            if (this.AEQbTJ.AEQbTJ(C33129mqd.EZpvd(strIsConnected))) {
                this.AEQbTJ.AEQbTJ = strIsConnected;
            } else {
                java.lang.String str2 = this.AEQbTJ.AEQbTJ;
                if (str2 != null) {
                    this.KWHzl.setPlainNumericText(str2);
                }
            }
            this.AEQbTJ.valueOf();
        }
    }

    /* JADX INFO: renamed from: o.ldo$LoaderManager */
    public static final class LoaderManager implements android.text.TextWatcher {
        public final /* synthetic */ AbstractC30580ldo KWHzl;
        public final /* synthetic */ C55001xbh copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public LoaderManager(C55001xbh c55001xbh, AbstractC30580ldo abstractC30580ldo) {
            this.copydefault = c55001xbh;
            this.KWHzl = abstractC30580ldo;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String strIsConnected = this.copydefault.isConnected();
            if (Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) this.KWHzl.AEQbTJ)) {
                return;
            }
            java.lang.String str = this.KWHzl.AEQbTJ;
            if ((str == null || str.length() == 0) && C23313hvq.copydefault(strIsConnected, BigDecimal.ZERO)) {
                this.copydefault.setText("");
                return;
            }
            if (this.KWHzl.AEQbTJ(C33129mqd.EZpvd(strIsConnected))) {
                this.KWHzl.AEQbTJ = strIsConnected;
            } else {
                java.lang.String str2 = this.KWHzl.AEQbTJ;
                if (str2 != null) {
                    this.copydefault.setPlainNumericText(str2);
                }
            }
            this.KWHzl.valueOf();
        }
    }

    /* JADX INFO: renamed from: o.ldo$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        public final /* synthetic */ C55001xbh AEQbTJ;
        public final /* synthetic */ AbstractC30580ldo EZpvd;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator(C55001xbh c55001xbh, AbstractC30580ldo abstractC30580ldo) {
            this.AEQbTJ = c55001xbh;
            this.EZpvd = abstractC30580ldo;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String strIsConnected = this.AEQbTJ.isConnected();
            if (Intrinsics.EZpvd((java.lang.Object) strIsConnected, (java.lang.Object) this.EZpvd.valueOf)) {
                return;
            }
            java.lang.String str = this.EZpvd.AEQbTJ;
            if ((str == null || str.length() == 0) && C23313hvq.copydefault(strIsConnected, BigDecimal.ZERO)) {
                this.AEQbTJ.setText("");
                return;
            }
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(strIsConnected);
            if (!C23313hvq.valueOf(bigDecimalEZpvd, AbstractC30580ldo.KWHzl) || !C23313hvq.EZpvd(bigDecimalEZpvd, BigDecimal.ZERO)) {
                java.lang.String str2 = this.EZpvd.valueOf;
                if (str2 != null) {
                    this.AEQbTJ.setPlainNumericText(str2);
                }
            } else {
                this.EZpvd.valueOf = strIsConnected;
            }
            this.EZpvd.AhwBna();
        }
    }

    public static final void EZpvd(C55001xbh c55001xbh, AbstractC30580ldo abstractC30580ldo, android.view.View view, boolean z) {
        pUU.KWHzl("TradeAutoSellStrategyItemView", "priceChange%: " + c55001xbh.getClass() + ", #" + abstractC30580ldo.AYXKKw() + ": hasFocus = " + z);
        if (z) {
            C55008xbo c55008xbo = abstractC30580ldo.EZpvd.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            abstractC30580ldo.djBIcL(c55008xbo);
        } else {
            abstractC30580ldo.fetchVPNInfo();
        }
        abstractC30580ldo.valueOf();
    }

    public static final void KWHzl(C55001xbh c55001xbh, AbstractC30580ldo abstractC30580ldo, android.view.View view, boolean z) {
        pUU.KWHzl("TradeAutoSellStrategyItemView", "sell%: " + c55001xbh.getClass() + ", #" + abstractC30580ldo.AYXKKw() + ": hasFocus = " + z);
        if (z) {
            C55008xbo c55008xbo = abstractC30580ldo.EZpvd.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            abstractC30580ldo.djBIcL(c55008xbo);
        } else {
            abstractC30580ldo.fetchVPNInfo();
        }
        abstractC30580ldo.AhwBna();
    }

    private final int AYXKKw() {
        android.view.ViewParent parent = getParent();
        Intrinsics.copydefault(parent, "");
        return ((android.view.ViewGroup) parent).indexOfChild(this);
    }

    public final void setLabel(@androidx.annotation.StringRes int i) {
        C55008xbo c55008xbo = this.EZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
        setUpStrategyInput(c55008xbo, i);
    }

    public final void setRemoteConfigVisible() {
        android.widget.LinearLayout linearLayout = this.EZpvd.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        android.widget.LinearLayout linearLayout2 = this.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(8);
    }

    /* JADX INFO: renamed from: o.ldo$AssistContent */
    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(android.view.View view, long j) {
            this.EZpvd = view;
            this.AEQbTJ = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C55326xho.toast$default(C33070mpX.AYXKKw(C23274hvD.Fragment.onConnectionSuspended), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.ldo$ComponentCallbacks2 */
    public static final class ComponentCallbacks2 implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks2(android.view.View view, long j) {
            this.AEQbTJ = view;
            this.KWHzl = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C55326xho.toast$default(C33070mpX.AYXKKw(C23274hvD.Fragment.onConnectionSuspended), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.ldo$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ AbstractC30580ldo KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, AbstractC30580ldo abstractC30580ldo) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = abstractC30580ldo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.view.ViewParent parent = this.KWHzl.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.KWHzl);
                }
                Function0 function0 = this.KWHzl.AhwBna;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.ldo$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j) {
            this.AEQbTJ = view;
            this.KWHzl = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C55326xho.toast$default(C33070mpX.AYXKKw(C23274hvD.Fragment.onConnectionSuspended), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.ldo$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ AbstractC30580ldo AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, AbstractC30580ldo abstractC30580ldo) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = abstractC30580ldo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.view.ViewParent parent = this.AEQbTJ.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.AEQbTJ);
                }
                Function0 function0 = this.AEQbTJ.AhwBna;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.ldo$PictureInPictureParams */
    public static final class PictureInPictureParams implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ AbstractC30580ldo KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(android.view.View view, long j, AbstractC30580ldo abstractC30580ldo) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = abstractC30580ldo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.view.ViewParent parent = this.KWHzl.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.KWHzl);
                }
                Function0 function0 = this.KWHzl.AhwBna;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.ldo$SharedElementCallback */
    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ AbstractC30580ldo KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(android.view.View view, long j, AbstractC30580ldo abstractC30580ldo) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = abstractC30580ldo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.view.ViewParent parent = this.KWHzl.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.KWHzl);
                }
                Function0 function0 = this.KWHzl.AhwBna;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.ldo$TaskStackBuilder */
    public static final class TaskStackBuilder implements View.OnClickListener {
        public final /* synthetic */ AbstractC30580ldo EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(android.view.View view, long j, AbstractC30580ldo abstractC30580ldo) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = abstractC30580ldo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.view.ViewParent parent = this.EZpvd.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.EZpvd);
                }
                Function0 function0 = this.EZpvd.AhwBna;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.ldo$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ AbstractC30580ldo AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, AbstractC30580ldo abstractC30580ldo) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = abstractC30580ldo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.view.ViewParent parent = this.AEQbTJ.getParent();
                android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.AEQbTJ);
                }
                Function0 function0 = this.AEQbTJ.AhwBna;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        android.app.Activity activityOLrzqt;
        super.onAttachedToWindow();
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner == null || (activityOLrzqt = C33569myt.OLrzqt(getContext())) == null) {
            return;
        }
        C59541ziw.EZpvd(activityOLrzqt, lifecycleOwner, new InterfaceC59496ziD() { // from class: o.ldl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59496ziD
            public final void OLrzqt(boolean z) {
                AbstractC30580ldo.OLrzqt(this.EZpvd, z);
            }
        });
    }

    public static final void OLrzqt(AbstractC30580ldo abstractC30580ldo, boolean z) {
        if (z) {
            return;
        }
        abstractC30580ldo.EZpvd.KWHzl.clearFocus();
        abstractC30580ldo.EZpvd.EZpvd.clearFocus();
    }

    public final void setUpStrategyInput(C55008xbo c55008xbo, @androidx.annotation.StringRes int i) {
        android.widget.TextView textViewFJNWhG = c55008xbo.fJNWhG();
        if (textViewFJNWhG != null) {
            AEQbTJ(textViewFJNWhG, i);
        }
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            OLrzqt(c55001xbhAkhnZx);
        }
    }

    private final void OLrzqt(C55001xbh c55001xbh) {
        c55001xbh.setGravity(TextAlign.LEFT);
        ViewGroup.LayoutParams layoutParams = c55001xbh.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            android.content.Context context = c55001xbh.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            marginLayoutParams.setMarginEnd(C55298xhM.OLrzqt(4, context));
            c55001xbh.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final android.widget.TextView copydefault(C55008xbo c55008xbo) {
        android.widget.TextView textView = new android.widget.TextView(c55008xbo.getContext());
        textView.setText("%");
        TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.AxsJAY);
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.QwvEab));
        C55009xbp c55009xbpFIwbmz = c55008xbo.fIwbmz();
        if (c55009xbpFIwbmz != null) {
            c55009xbpFIwbmz.copydefault((android.view.View) textView, (java.lang.Integer) 0);
        }
        return textView;
    }

    public final void valueOf() {
        C55001xbh c55001xbhKWHzl = KWHzl();
        boolean z = c55001xbhKWHzl != null && c55001xbhKWHzl.hasFocus();
        C55001xbh c55001xbhKWHzl2 = KWHzl();
        android.text.Editable text = c55001xbhKWHzl2 != null ? c55001xbhKWHzl2.getText() : null;
        boolean z2 = true ^ (text == null || text.length() == 0);
        android.widget.TextView textView = this.djBIcL;
        if (textView != null) {
            textView.setVisibility((z || z2) ? 8 : 0);
        }
        int i = this instanceof C30584lds ? C23274hvD.Fragment.getExtraBinder : C23274hvD.Fragment.hashCode;
        if (z || z2) {
            this.EZpvd.KWHzl.setTitleType(2);
            C55001xbh c55001xbhAkhnZx = this.EZpvd.KWHzl.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setGravity(TextAlign.LEFT);
            }
            this.EZpvd.KWHzl.setLabelText(getContext().getString(i) + " (%)");
            C55008xbo c55008xbo = this.EZpvd.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            EZpvd(c55008xbo);
            return;
        }
        this.EZpvd.KWHzl.setTitleType(0);
        android.widget.TextView textViewFJNWhG = this.EZpvd.KWHzl.fJNWhG();
        if (textViewFJNWhG != null) {
            AEQbTJ(textViewFJNWhG, i);
        }
    }

    public final void AhwBna() {
        C55001xbh c55001xbhEZpvd = EZpvd();
        boolean z = c55001xbhEZpvd != null && c55001xbhEZpvd.hasFocus();
        C55001xbh c55001xbhEZpvd2 = EZpvd();
        android.text.Editable text = c55001xbhEZpvd2 != null ? c55001xbhEZpvd2.getText() : null;
        boolean z2 = true ^ (text == null || text.length() == 0);
        android.widget.TextView textView = this.AYXKKw;
        if (textView != null) {
            textView.setVisibility((z || z2) ? 8 : 0);
        }
        if (z || z2) {
            this.EZpvd.EZpvd.setTitleType(2);
            C55001xbh c55001xbhAkhnZx = this.EZpvd.EZpvd.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setGravity(TextAlign.LEFT);
            }
            this.EZpvd.EZpvd.setLabelText(getContext().getString(C23274hvD.Fragment.AuCTel) + " (%)");
            C55008xbo c55008xbo = this.EZpvd.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
            EZpvd(c55008xbo);
            return;
        }
        this.EZpvd.EZpvd.setTitleType(0);
        android.widget.TextView textViewFJNWhG = this.EZpvd.EZpvd.fJNWhG();
        if (textViewFJNWhG != null) {
            AEQbTJ(textViewFJNWhG, C23274hvD.Fragment.AuCTel);
        }
    }

    private final void djBIcL(final C55008xbo c55008xbo) {
        c55008xbo.setErrorShowing(false);
        c55008xbo.setState(1);
        gEmmrt();
        Function0<Unit> function0 = this.gEmmrt;
        if (function0 != null) {
            function0.invoke();
        }
        c55008xbo.post(new java.lang.Runnable() { // from class: o.ldn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC30580ldo.KWHzl(c55008xbo);
            }
        });
    }

    public static final void KWHzl(C55008xbo c55008xbo) {
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
    private final void fetchVPNInfo() {
        C55001xbh c55001xbhKWHzl = KWHzl();
        android.text.Editable text = c55001xbhKWHzl != null ? c55001xbhKWHzl.getText() : null;
        if (text == null || text.length() == 0) {
            C55001xbh c55001xbhEZpvd = EZpvd();
            android.text.Editable text2 = c55001xbhEZpvd != null ? c55001xbhEZpvd.getText() : null;
            if (text2 == null || text2.length() == 0) {
                this.EZpvd.KWHzl.setErrorShowing(false);
                this.EZpvd.EZpvd.setErrorShowing(false);
            } else {
                C55001xbh c55001xbhKWHzl2 = KWHzl();
                java.lang.String strIsConnected = c55001xbhKWHzl2 != null ? c55001xbhKWHzl2.isConnected() : null;
                BigDecimal bigDecimal = BigDecimal.ZERO;
                if (C23313hvq.copydefault(strIsConnected, bigDecimal)) {
                    if (strIsConnected != null && strIsConnected.length() != 0) {
                        this.EZpvd.KWHzl.setText("");
                    }
                    this.EZpvd.KWHzl.setErrorShowing(true);
                } else {
                    this.EZpvd.KWHzl.setErrorShowing(false);
                }
                C55001xbh c55001xbhEZpvd2 = EZpvd();
                java.lang.String strIsConnected2 = c55001xbhEZpvd2 != null ? c55001xbhEZpvd2.isConnected() : null;
                if (C23313hvq.copydefault(strIsConnected2, bigDecimal)) {
                    if (strIsConnected2 != null && strIsConnected2.length() != 0) {
                        this.EZpvd.EZpvd.setText("");
                    }
                    this.EZpvd.EZpvd.setErrorShowing(true);
                } else {
                    this.EZpvd.EZpvd.setErrorShowing(false);
                }
            }
        }
        gEmmrt();
        Function0<Unit> function0 = this.gEmmrt;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void gEmmrt() {
        java.lang.String strAYXKKw;
        boolean z = this.EZpvd.KWHzl.zLjUOn() || this.EZpvd.EZpvd.zLjUOn();
        android.widget.TextView textView = this.EZpvd.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        if (copydefault(KWHzl()) || copydefault(EZpvd())) {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatQueueItem);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.fromQueueItem);
        }
        this.EZpvd.valueOf.setText(strAYXKKw);
    }

    private final boolean copydefault(C55001xbh c55001xbh) {
        android.text.Editable text = c55001xbh != null ? c55001xbh.getText() : null;
        return (text == null || text.length() == 0 || !C23313hvq.copydefault(c55001xbh.isConnected(), BigDecimal.ZERO)) ? false : true;
    }

    public final void EZpvd(C55008xbo c55008xbo) {
        C54957xaq c54957xaqAEQbTJ;
        android.widget.TextView textView;
        C55009xbp c55009xbpFIwbmz = c55008xbo.fIwbmz();
        if (c55009xbpFIwbmz == null || (c54957xaqAEQbTJ = c55009xbpFIwbmz.AEQbTJ()) == null || (textView = c54957xaqAEQbTJ.AhwBna) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.removeRule(15);
            android.content.Context context = c55008xbo.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            layoutParams2.topMargin = C55298xhM.OLrzqt(4, context);
            textView.requestLayout();
        }
        textView.setTextSize(12.0f);
        textView.setTextColor(ContextCompat.getColor(c55008xbo.getContext(), C52761wXj.Activity.QwvEab));
    }

    public final android.widget.TextView OLrzqt(@NotNull C55008xbo c55008xbo) {
        android.widget.LinearLayout linearLayoutDjBIcL;
        Intrinsics.checkNotNullParameter(c55008xbo, "");
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        android.widget.TextView textView = new android.widget.TextView(c55008xbo.getContext());
        textView.setText(Marker.ANY_NON_NULL_MARKER);
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.fdOvFl));
        textView.setTextSize(c55001xbhAkhnZx != null ? java.lang.Float.valueOf(c55001xbhAkhnZx.getTextSize() / textView.getResources().getDisplayMetrics().scaledDensity).floatValue() : 16.0f);
        textView.setGravity(16);
        textView.setVisibility(8);
        C55009xbp c55009xbpFIwbmz = c55008xbo.fIwbmz();
        if (c55009xbpFIwbmz != null && (linearLayoutDjBIcL = c55009xbpFIwbmz.djBIcL()) != null) {
            LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -1);
            ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
            Unit unit = Unit.INSTANCE;
            linearLayoutDjBIcL.addView(textView, 0, layoutParams);
        }
        return textView;
    }

    public final void OLrzqt(android.widget.TextView textView, C55001xbh c55001xbh) {
        int i = 0;
        boolean z = c55001xbh != null && c55001xbh.hasFocus();
        android.text.Editable text = c55001xbh != null ? c55001xbh.getText() : null;
        boolean z2 = text == null || text.length() == 0;
        if (textView != null) {
            if (!z && !(!z2)) {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    public final void AEQbTJ(android.widget.TextView textView, int i) {
        textView.setVisibility(0);
        textView.setGravity(16);
        textView.setCompoundDrawablePadding(textView.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.QkdxfA));
        textView.setText(i);
        TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.AxsJAY);
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.fdOvFl));
    }
}
