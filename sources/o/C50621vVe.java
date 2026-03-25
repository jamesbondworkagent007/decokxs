package o;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.okinc.uilab.edit.OKEditText;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33565myp;
import o.C48033uCm;
import o.C50621vVe;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vVe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50621vVe extends ConstraintLayout {
    public Function1<? super java.lang.String, Unit> AEQbTJ;
    public boolean EZpvd;
    public ViewTreeObserver.OnPreDrawListener KWHzl;
    public final AbstractC50955vds OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50621vVe(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50621vVe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    public final Function1<java.lang.String, Unit> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnTextChangeCallback(Function1<? super java.lang.String, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:27) call: o.vVe.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C50621vVe(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50621vVe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = "";
        AbstractC50955vds abstractC50955vds = (AbstractC50955vds) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.UJpkuA, this, true);
        this.OLrzqt = abstractC50955vds;
        C55001xbh c55001xbh = abstractC50955vds.EZpvd;
        c55001xbh.setShowThousandsSeparator(true);
        c55001xbh.setAutoScale(true);
        abstractC50955vds.copydefault.setAutoScale(true);
        abstractC50955vds.EZpvd.setHintTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        OLrzqt();
    }

    /* JADX INFO: renamed from: o.vVe$ActionBar */
    public static final class ActionBar implements View.OnLayoutChangeListener {
        public ActionBar() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            C50621vVe.this.setMinHeight(C55298xhM.dp2px$default(70.0f, null, 1, null));
        }
    }

    private final void OLrzqt() {
        android.widget.TextView textView = this.OLrzqt.OLrzqt;
        textView.setOnClickListener(new TaskDescription(textView, 1000L, this));
        C55001xbh c55001xbh = this.OLrzqt.EZpvd;
        Activity activity = new Activity(c55001xbh);
        this.KWHzl = activity;
        c55001xbh.getViewTreeObserver().addOnPreDrawListener(activity);
        c55001xbh.addTextChangedListener(new StateListAnimator());
        final OKEditText oKEditText = this.OLrzqt.copydefault;
        oKEditText.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: o.vVa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return C50621vVe.KWHzl(this.AEQbTJ, oKEditText);
            }
        });
        android.view.View root = this.OLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.addOnLayoutChangeListener(new ActionBar());
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        AppCompatActivity appCompatActivityCopydefault = C49955uyM.copydefault(context);
        if (appCompatActivityCopydefault != null) {
            C33565myp.EZpvd().copydefault(appCompatActivityCopydefault, new C33565myp.Application() { // from class: o.vVd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C33565myp.Application
                public final void EZpvd(int i, boolean z) {
                    C50621vVe.KWHzl(this.EZpvd, i, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.vVe$Activity */
    public static final class Activity implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ C55001xbh KWHzl;

        public Activity(C55001xbh c55001xbh) {
            this.KWHzl = c55001xbh;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (C50621vVe.this.EZpvd) {
                return true;
            }
            float textSize = this.KWHzl.getTextSize();
            if (textSize == C50621vVe.this.OLrzqt.OLrzqt.getTextSize()) {
                return true;
            }
            C50621vVe.this.OLrzqt.OLrzqt.setTextSize(0, textSize);
            return true;
        }
    }

    /* JADX INFO: renamed from: o.vVe$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String string;
            if (editable == null || (string = editable.toString()) == null || !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string)) {
                C50621vVe.this.EZpvd = false;
                C50621vVe.this.OLrzqt.copydefault.setVisibility(4);
            } else {
                C50621vVe.this.EZpvd = true;
                C50621vVe.this.OLrzqt.copydefault.setVisibility(0);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) C50621vVe.this.copydefault) && !Intrinsics.EZpvd((java.lang.Object) C50621vVe.this.copydefault, (java.lang.Object) java.lang.String.valueOf(C50621vVe.this.OLrzqt.copydefault.getText()))) {
                    OKEditText oKEditText = C50621vVe.this.OLrzqt.copydefault;
                    final C50621vVe c50621vVe = C50621vVe.this;
                    oKEditText.post(new java.lang.Runnable() { // from class: o.vVb
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            C50621vVe.StateListAnimator.copydefault(c50621vVe);
                        }
                    });
                }
            }
            Function1<java.lang.String, Unit> function1AEQbTJ = C50621vVe.this.AEQbTJ();
            if (function1AEQbTJ != null) {
                function1AEQbTJ.invoke(editable != null ? editable.toString() : null);
            }
            C56028xvA.OLrzqt("recurringAmount", C56423yEv.EZpvd(C56390yDp.OLrzqt(Web3SecurityTrackEvent.VALUE_INPUT, java.lang.String.valueOf(editable))));
        }

        public static final void copydefault(C50621vVe c50621vVe) {
            c50621vVe.OLrzqt.copydefault.setText(c50621vVe.copydefault);
        }
    }

    public static final boolean KWHzl(C50621vVe c50621vVe, OKEditText oKEditText) {
        if (!c50621vVe.EZpvd) {
            return true;
        }
        float textSize = oKEditText.getTextSize();
        if (textSize == c50621vVe.OLrzqt.OLrzqt.getTextSize()) {
            return true;
        }
        c50621vVe.OLrzqt.OLrzqt.setTextSize(0, textSize);
        return true;
    }

    public static final void KWHzl(C50621vVe c50621vVe, int i, boolean z) {
        if (z) {
            return;
        }
        c50621vVe.OLrzqt.EZpvd.clearFocus();
    }

    public final void setMaxDecimal(int i) {
        this.OLrzqt.EZpvd.setMaxDecimalValue(i);
    }

    public final void setUnit(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.OLrzqt.setText(str);
    }

    public final void setHint(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.text.Editable text = this.OLrzqt.EZpvd.getText();
        boolean z = !C33129mqd.OLrzqt((java.lang.CharSequence) (text != null ? text.toString() : null));
        this.EZpvd = z;
        if (z) {
            this.OLrzqt.copydefault.setVisibility(0);
        } else {
            this.OLrzqt.copydefault.setVisibility(4);
        }
        boolean z2 = this.EZpvd;
        this.copydefault = str;
        if (z2) {
            this.OLrzqt.copydefault.setText(str);
        }
    }

    /* JADX INFO: renamed from: o.vVe$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C50621vVe AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C50621vVe c50621vVe) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = c50621vVe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C33570myu.AEQbTJ(this.AEQbTJ.getContext(), (android.widget.EditText) this.AEQbTJ.OLrzqt.EZpvd);
                C56028xvA.botClickTrack$default("recurringUnit", null, 2, null);
            }
        }
    }

    public final void setAmount(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = false;
        this.OLrzqt.copydefault.setVisibility(4);
        this.OLrzqt.EZpvd.setPlainNumericText(str);
    }

    public final java.lang.String KWHzl() {
        return this.OLrzqt.EZpvd.isConnected();
    }

    public final void EZpvd() {
        this.OLrzqt.AEQbTJ.setVisibility(8);
    }

    public final void setInputErrorMsg(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.AEQbTJ.setText(str);
        this.OLrzqt.AEQbTJ.setVisibility(0);
    }

    public final void copydefault() {
        this.OLrzqt.EZpvd.setPlainNumericText("");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.KWHzl;
        if (onPreDrawListener != null) {
            this.OLrzqt.EZpvd.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
        C33565myp.EZpvd().OLrzqt();
        super.onDetachedFromWindow();
    }
}
