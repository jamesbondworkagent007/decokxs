package com.okinc.business.market.widget.chart;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import com.google.android.material.textfield.TextInputLayout;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.business.market.widget.chart.RankingFilterEditView;
import java.io.IOException;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.C23272hvB;
import o.C23274hvD;
import o.C25382ivf;
import o.C33054mpH;
import o.C33070mpX;
import o.C33129mqd;
import o.C52761wXj;
import o.C55001xbh;
import o.C55296xhK;
import o.C56444yFp;
import o.C59449zhJ;
import o.C59454zhO;
import o.InterfaceC56445yFq;
import o.hEI;
import o.pTF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class RankingFilterEditView extends FrameLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public InputSymbol AEQbTJ;
    public boolean EZpvd;
    public final hEI KWHzl;
    public boolean OLrzqt;
    public Function0<Unit> valueOf;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InputSymbol.values().length];
            try {
                iArr[InputSymbol.CurrencySymbol.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputSymbol.Percentage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputSymbol.NoSymbol.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RankingFilterEditView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RankingFilterEditView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSaveTextEnableListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.valueOf = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:31) call: com.okinc.business.market.widget.chart.RankingFilterEditView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ RankingFilterEditView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankingFilterEditView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        InputSymbol inputSymbol = InputSymbol.CurrencySymbol;
        this.AEQbTJ = inputSymbol;
        hEI heiOLrzqt = hEI.OLrzqt(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(heiOLrzqt, "");
        this.KWHzl = heiOLrzqt;
        this.OLrzqt = true;
        C55001xbh c55001xbh = heiOLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55001xbh, "");
        setHintFor(c55001xbh, inputSymbol);
        C55001xbh c55001xbh2 = heiOLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55001xbh2, "");
        setHintFor(c55001xbh2, inputSymbol);
        C55001xbh c55001xbh3 = heiOLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55001xbh3, "");
        copydefault(c55001xbh3);
        C55001xbh c55001xbh4 = heiOLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55001xbh4, "");
        copydefault(c55001xbh4);
        heiOLrzqt.AEQbTJ.setShowThousandsSeparator(true);
        heiOLrzqt.copydefault.setShowThousandsSeparator(true);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.widget.chart.RankingFilterEditView.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    private final void copydefault(final AppCompatEditText appCompatEditText) {
        AEQbTJ(appCompatEditText);
        Editable text = appCompatEditText.getText();
        if (text != null && text.length() == 0) {
            appCompatEditText.setGravity(8388659);
        } else {
            appCompatEditText.setGravity(TextAlign.LEFT);
        }
        appCompatEditText.addTextChangedListener(new Activity(appCompatEditText, this));
        appCompatEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.kLB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                RankingFilterEditView.setupEditText$lambda$0(this.EZpvd, appCompatEditText, view, z);
            }
        });
    }

    public static final class Activity implements TextWatcher {
        public String EZpvd = "";
        public final /* synthetic */ RankingFilterEditView KWHzl;
        public final /* synthetic */ AppCompatEditText OLrzqt;
        public boolean copydefault;

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity(AppCompatEditText appCompatEditText, RankingFilterEditView rankingFilterEditView) {
            this.OLrzqt = appCompatEditText;
            this.KWHzl = rankingFilterEditView;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String string = charSequence != null ? charSequence.toString() : null;
            if (string == null) {
                string = "";
            }
            this.EZpvd = string;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) throws IOException {
            if (this.copydefault) {
                return;
            }
            this.copydefault = true;
            String string = editable != null ? editable.toString() : null;
            if (string == null) {
                string = "";
            }
            if (string.length() == 0) {
                this.OLrzqt.setGravity(8388659);
            } else {
                this.OLrzqt.setGravity(TextAlign.LEFT);
                if (this.KWHzl.AEQbTJ == InputSymbol.Percentage) {
                    this.KWHzl.OLrzqt(this.OLrzqt, string, this);
                }
            }
            if (!this.KWHzl.EZpvd) {
                this.KWHzl.EZpvd(this.OLrzqt);
            } else {
                this.KWHzl.KWHzl(this.OLrzqt);
            }
            this.copydefault = false;
            Function0 function0 = this.KWHzl.valueOf;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final void setupEditText$lambda$0(RankingFilterEditView rankingFilterEditView, AppCompatEditText appCompatEditText, View view, boolean z) {
        Intrinsics.copydefault(view);
        rankingFilterEditView.setHintFor(view, rankingFilterEditView.AEQbTJ);
        if (appCompatEditText.getId() == rankingFilterEditView.KWHzl.copydefault.getId()) {
            rankingFilterEditView.AEQbTJ(rankingFilterEditView, z, true);
        } else if (appCompatEditText.getId() == rankingFilterEditView.KWHzl.AEQbTJ.getId()) {
            rankingFilterEditView.AEQbTJ(rankingFilterEditView, z, false);
        }
    }

    private final void AEQbTJ(AppCompatEditText appCompatEditText) {
        Editable text;
        Editable text2;
        if (appCompatEditText.getId() == this.KWHzl.AEQbTJ.getId() && (text2 = appCompatEditText.getText()) != null && text2.length() > 0) {
            this.KWHzl.AYXKKw.setGravity(AkhnZx() | 48);
        } else {
            if (appCompatEditText.getId() != this.KWHzl.copydefault.getId() || (text = appCompatEditText.getText()) == null || text.length() <= 0) {
                return;
            }
            this.KWHzl.gEmmrt.setGravity(AkhnZx() | 48);
        }
    }

    public static /* synthetic */ void setHintSymbolMode$default(RankingFilterEditView rankingFilterEditView, InputSymbol inputSymbol, int i, Object obj) {
        if ((i & 1) != 0) {
            inputSymbol = InputSymbol.CurrencySymbol;
        }
        rankingFilterEditView.setHintSymbolMode(inputSymbol);
    }

    public final void setHintSymbolMode(@NotNull InputSymbol inputSymbol) {
        InputSymbol inputSymbol2;
        Intrinsics.checkNotNullParameter(inputSymbol, "");
        this.AEQbTJ = inputSymbol;
        int i = TaskDescription.copydefault[inputSymbol.ordinal()];
        if (i == 1) {
            inputSymbol2 = InputSymbol.CurrencySymbol;
        } else if (i == 2) {
            inputSymbol2 = InputSymbol.Percentage;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            inputSymbol2 = InputSymbol.NoSymbol;
        }
        C55001xbh c55001xbh = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55001xbh, "");
        setHintFor(c55001xbh, inputSymbol2);
        C55001xbh c55001xbh2 = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55001xbh2, "");
        setHintFor(c55001xbh2, inputSymbol2);
        C55001xbh c55001xbh3 = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55001xbh3, "");
        copydefault(c55001xbh3);
        C55001xbh c55001xbh4 = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55001xbh4, "");
        copydefault(c55001xbh4);
    }

    public final void setFilterTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.KWHzl.setText(str);
    }

    public final void setMinValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.copydefault.setText(str);
    }

    public final void setMaxValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.AEQbTJ.setText(str);
    }

    public final String copydefault() throws IOException {
        String string;
        String string2;
        Editable text = this.KWHzl.copydefault.getText();
        if (text == null || (string2 = text.toString()) == null) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder();
            int length = string2.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = string2.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            string = sb.toString();
        }
        return string == null ? "" : string;
    }

    public final String OLrzqt() throws IOException {
        String string;
        String string2;
        Editable text = this.KWHzl.AEQbTJ.getText();
        if (text == null || (string2 = text.toString()) == null) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder();
            int length = string2.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = string2.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            string = sb.toString();
        }
        return string == null ? "" : string;
    }

    public final C55001xbh KWHzl() {
        C55001xbh c55001xbh = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55001xbh, "");
        return c55001xbh;
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ RankingFilterEditView EZpvd;
        public final /* synthetic */ hEI KWHzl;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ Function0 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, hEI hei, RankingFilterEditView rankingFilterEditView, Function0 function0) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = hei;
            this.EZpvd = rankingFilterEditView;
            this.copydefault = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ImageView imageView = this.KWHzl.OLrzqt;
                int i = C52761wXj.TaskDescription.DNMMPQ;
                Context context = this.EZpvd.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                imageView.setImageDrawable(C33070mpX.EZpvd(i, context));
                this.copydefault.invoke();
            }
        }
    }

    public final C55001xbh AEQbTJ() {
        C55001xbh c55001xbh = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55001xbh, "");
        return c55001xbh;
    }

    public final void EZpvd() {
        hEI hei = this.KWHzl;
        hei.copydefault.setText("");
        hei.AEQbTJ.setText("");
        hei.copydefault.clearFocus();
        hei.AEQbTJ.clearFocus();
    }

    public final void setHintFor(View view, InputSymbol inputSymbol) {
        String string = getContext().getString(C23274hvD.Fragment.values);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = getContext().getString(C23274hvD.Fragment.QwvEab);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        if (inputSymbol == InputSymbol.NoSymbol) {
            if (view.getId() == this.KWHzl.AEQbTJ.getId()) {
                this.KWHzl.AYXKKw.setHint(pTF.KWHzl.AEQbTJ(string));
                this.KWHzl.AYXKKw.setGravity(AkhnZx() | 48);
                return;
            } else {
                if (view.getId() == this.KWHzl.copydefault.getId()) {
                    if (this.EZpvd) {
                        string2 = string2 + " (2)";
                    }
                    this.KWHzl.gEmmrt.setHint(pTF.KWHzl.AEQbTJ(string2));
                    this.KWHzl.gEmmrt.setGravity(AkhnZx() | 48);
                    return;
                }
                return;
            }
        }
        if (view.getId() == this.KWHzl.AEQbTJ.getId()) {
            this.KWHzl.AYXKKw.setHint(pTF.KWHzl.AEQbTJ(string + " (" + inputSymbol.getSymbol() + ")"));
            this.KWHzl.AYXKKw.setGravity(AkhnZx() | 48);
            return;
        }
        if (view.getId() == this.KWHzl.copydefault.getId()) {
            this.KWHzl.gEmmrt.setHint(pTF.KWHzl.AEQbTJ(string2 + " (" + inputSymbol.getSymbol() + ")"));
            this.KWHzl.gEmmrt.setGravity(AkhnZx() | 48);
        }
    }

    public final void AYXKKw() {
        this.OLrzqt = true;
        djBIcL();
    }

    public final void djBIcL() {
        int i = C52761wXj.Activity.aeJQwa;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(C25382ivf.copydefault(i, context));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "");
        int i2 = C52761wXj.Activity.svhCHd;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(C25382ivf.copydefault(i2, context2));
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf2, "");
        hEI hei = this.KWHzl;
        hei.gEmmrt.setDefaultHintTextColor(colorStateListValueOf);
        hei.AYXKKw.setDefaultHintTextColor(colorStateListValueOf);
        hei.gEmmrt.setHintTextColor(colorStateListValueOf2);
        hei.AYXKKw.setHintTextColor(colorStateListValueOf2);
    }

    public final void setupUnitPicker(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        hEI hei = this.KWHzl;
        LinearLayoutCompat linearLayoutCompat = hei.valueOf;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(0);
        LinearLayoutCompat linearLayoutCompat2 = hei.valueOf;
        linearLayoutCompat2.setOnClickListener(new Application(linearLayoutCompat2, 1000L, hei, this, function0));
        hei.AEQbTJ.setShowThousandsSeparator(false);
        hei.copydefault.setShowThousandsSeparator(false);
    }

    public final void setUnitPickerText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.djBIcL.setText(str);
    }

    public final void valueOf() {
        ImageView imageView = this.KWHzl.OLrzqt;
        int i = C52761wXj.TaskDescription.DCUTEIddSDPG;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        imageView.setImageDrawable(C33070mpX.EZpvd(i, context));
    }

    public final void AEQbTJ(TextInputLayout textInputLayout, boolean z) {
        Drawable drawable = ContextCompat.getDrawable(getContext(), z ? C23274hvD.ActionBar.finit : C23274hvD.ActionBar.fFgQHt);
        Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        GradientDrawable gradientDrawable = drawableMutate instanceof GradientDrawable ? (GradientDrawable) drawableMutate : null;
        if (this.OLrzqt && gradientDrawable != null) {
            int i = C52761wXj.Activity.GQzpsZ;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            gradientDrawable.setColor(C25382ivf.copydefault(i, context));
            if (!z) {
                gradientDrawable.setStroke(0, 0);
            }
        }
        textInputLayout.setBackground(gradientDrawable);
    }

    public final void KWHzl(@NotNull AppCompatEditText appCompatEditText) throws IOException {
        Intrinsics.checkNotNullParameter(appCompatEditText, "");
        String strCopydefault = copydefault();
        if (strCopydefault.length() > 0 && Integer.parseInt(strCopydefault) < 3) {
            C55001xbh c55001xbh = this.KWHzl.copydefault;
            Editable text = c55001xbh.getText();
            c55001xbh.setSelection(text != null ? text.length() : 0);
            return;
        }
        EZpvd(appCompatEditText);
    }

    public final void EZpvd(AppCompatEditText appCompatEditText) throws IOException {
        String strCopydefault = copydefault();
        String strOLrzqt = OLrzqt();
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(strCopydefault);
        BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(strOLrzqt);
        if ((C33129mqd.AEQbTJ(bigDecimalEZpvd, bigDecimalEZpvd2) || C33129mqd.OLrzqt(bigDecimalEZpvd, bigDecimalEZpvd2)) && !C33129mqd.OLrzqt((Object) bigDecimalEZpvd2, (Object) 0) && !C33129mqd.OLrzqt((Object) bigDecimalEZpvd, (Object) 0)) {
            TextInputLayout textInputLayout = this.KWHzl.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
            AEQbTJ(textInputLayout);
            TextInputLayout textInputLayout2 = this.KWHzl.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
            AEQbTJ(textInputLayout2);
            this.KWHzl.EZpvd.setText(getContext().getString(C23274hvD.Fragment.zLnOGN));
            this.KWHzl.EZpvd.setVisibility(0);
            return;
        }
        this.KWHzl.EZpvd.setText("");
        this.KWHzl.EZpvd.setVisibility(8);
        if (appCompatEditText.getId() == this.KWHzl.copydefault.getId()) {
            AEQbTJ(this, appCompatEditText.hasFocus(), true);
        } else if (appCompatEditText.getId() == this.KWHzl.AEQbTJ.getId()) {
            AEQbTJ(this, appCompatEditText.hasFocus(), false);
        }
    }

    public final void AEQbTJ(TextInputLayout textInputLayout) {
        textInputLayout.setBackgroundResource(C23274hvD.ActionBar.giSNqX);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C33054mpH.OLrzqt(context, this.KWHzl.copydefault);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C33054mpH.OLrzqt(context2, this.KWHzl.AEQbTJ);
    }

    public final boolean gEmmrt() {
        TextView textView = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView.getVisibility() == 0;
    }

    public final boolean AhwBna() {
        return !gEmmrt();
    }

    public final void AEQbTJ(@NotNull RankingFilterEditView rankingFilterEditView, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(rankingFilterEditView, "");
        if (rankingFilterEditView.gEmmrt()) {
            return;
        }
        boolean z3 = z && z2;
        boolean z4 = z && !z2;
        if (this.OLrzqt) {
            djBIcL();
        }
        TextInputLayout textInputLayout = rankingFilterEditView.KWHzl.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "");
        AEQbTJ(textInputLayout, z3);
        TextInputLayout textInputLayout2 = rankingFilterEditView.KWHzl.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "");
        AEQbTJ(textInputLayout2, z4);
        if (this.OLrzqt || z || copydefault().length() <= 0 || Integer.parseInt(copydefault()) >= 3) {
            return;
        }
        this.KWHzl.copydefault.setText("2");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InputSymbol {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ InputSymbol[] $VALUES;
        public static final InputSymbol CurrencySymbol = new InputSymbol("CurrencySymbol", 0);
        public static final InputSymbol Percentage = new InputSymbol("Percentage", 1);
        public static final InputSymbol NoSymbol = new InputSymbol("NoSymbol", 2);

        public final /* synthetic */ class Application {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[InputSymbol.values().length];
                try {
                    iArr[InputSymbol.CurrencySymbol.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InputSymbol.Percentage.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InputSymbol.NoSymbol.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                AEQbTJ = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ InputSymbol[] $values() {
            return new InputSymbol[]{CurrencySymbol, Percentage, NoSymbol};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<InputSymbol> getEntries() {
            return $ENTRIES;
        }

        private InputSymbol(String str, int i) {
        }

        static {
            InputSymbol[] inputSymbolArr$values = $values();
            $VALUES = inputSymbolArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(inputSymbolArr$values);
        }

        public final String getSymbol() {
            int i = Application.AEQbTJ[ordinal()];
            if (i == 1) {
                return C23272hvB.KWHzl.OLrzqt().getSymbol();
            }
            if (i == 2) {
                return "%";
            }
            if (i == 3) {
                return "";
            }
            throw new NoWhenBranchMatchedException();
        }

        public static InputSymbol valueOf(String str) {
            return (InputSymbol) Enum.valueOf(InputSymbol.class, str);
        }

        public static InputSymbol[] values() {
            return (InputSymbol[]) $VALUES.clone();
        }
    }

    public final void OLrzqt(AppCompatEditText appCompatEditText, String str, TextWatcher textWatcher) throws IOException {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(string);
        if (intOrNull != null) {
            if (C59449zhJ.startsWith$default(string, "100", false, 2, null)) {
                string = "100";
            } else if (intOrNull.intValue() > 99) {
                string = C59454zhO.AkhnZx(intOrNull.toString(), 2);
            }
        }
        appCompatEditText.removeTextChangedListener(textWatcher);
        appCompatEditText.setText(string);
        appCompatEditText.setSelection(string.length());
        appCompatEditText.addTextChangedListener(textWatcher);
    }

    private final int AkhnZx() {
        return C55296xhK.AEQbTJ(this) ? 8388613 : 8388611;
    }
}
