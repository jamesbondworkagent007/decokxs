package o;

import android.view.View;
import com.okinc.uilab.edit.OKEditText;
import java.lang.ref.WeakReference;
import java.text.DecimalFormatSymbols;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55005xbl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xbh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55001xbh extends OKEditText {
    public static final Application Companion = new Application(null);
    public static final int values = 8;
    public boolean AkhnZx;
    public final android.text.TextWatcher AuCTel;
    public int AuCTelauCTel;
    public C55007xbn AubY;
    public java.lang.String AwvSrB;
    public boolean AxsJAY;
    public boolean DbNXlk;
    public int ORxRYg;
    public boolean OcIXYQ;
    public android.view.inputmethod.InputConnection ejfBZ;
    public boolean fARcdN;
    public java.util.Set<java.lang.String> fIwbmz;
    public boolean fJNWhG;
    public android.text.method.NumberKeyListener fetchVPNInfo;
    public java.lang.String gHZMYf;
    public java.util.Locale getFieldNames;
    public int getNewProxyInstance;
    public java.lang.String hDKMBd;
    public boolean isConnected;
    public int iwGUEr;
    public View.OnFocusChangeListener sSMYrx;
    public ActionBar uzCIH;
    public boolean wlaJM;
    public final View.OnFocusChangeListener zLjUOn;
    public boolean zsXlph;
    public java.util.List<android.text.TextWatcher> zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55001xbh(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55001xbh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.text.method.NumberKeyListener AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Locale AhwBna() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionBar DbNXlk() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.inputmethod.InputConnection djBIcL() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.uilab.edit.OKEditText
    public boolean getAutoScale() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAcceptKeyListener(@NotNull android.text.method.NumberKeyListener numberKeyListener) {
        Intrinsics.checkNotNullParameter(numberKeyListener, "");
        this.fetchVPNInfo = numberKeyListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowEditNegative(boolean z) {
        this.isConnected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDotSeparatorBeforeSelection$OKUILib_uilib(boolean z) {
        this.fJNWhG = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputConnection$OKUILib_uilib(android.view.inputmethod.InputConnection inputConnection) {
        this.ejfBZ = inputConnection;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] androidx.appcompat.R.attr.editTextStyle int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:37) call: o.xbh.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55001xbh(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? androidx.appcompat.R.attr.editTextStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55001xbh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        this.getFieldNames = locale;
        this.zLjUOn = new View.OnFocusChangeListener() { // from class: o.xbi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                C55001xbh.KWHzl(this.OLrzqt, view, z);
            }
        };
        this.iwGUEr = 214748364;
        this.getNewProxyInstance = Integer.MAX_VALUE;
        this.fIwbmz = yEE.copydefault();
        this.AwvSrB = "";
        this.hDKMBd = "";
        int i2 = 0;
        this.uzCIH = new ActionBar(i2, 0, 0, 7, null);
        this.fetchVPNInfo = new Activity(this);
        this.AubY = new C55007xbn(i2, 0 == true ? 1 : 0, null, null, false, false, 63, null);
        this.AxsJAY = true;
        this.gHZMYf = "";
        this.AuCTel = new StateListAnimator();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.zuBGHE = arrayList;
        arrayList.add(getScaleTextWatcher$OKUILib_uilib());
        EZpvd();
    }

    public final void setLocale(@NotNull java.util.Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "");
        this.getFieldNames = locale;
        setFilters(OLrzqt());
    }

    public final void setShowThousandsSeparator(boolean z) {
        this.OcIXYQ = z;
        setFilters(OLrzqt());
        if (getKeyListener() instanceof android.text.method.DigitsKeyListener) {
            setKeyListener(AYXKKw());
        }
    }

    public static final void KWHzl(C55001xbh c55001xbh, android.view.View view, boolean z) {
        if (z) {
            if (android.text.TextUtils.isEmpty(c55001xbh.getText())) {
                c55001xbh.fJNWhG();
                c55001xbh.setText("-");
                c55001xbh.setSelection(1);
                c55001xbh.EZpvd();
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(c55001xbh.getText()), (java.lang.Object) "-")) {
            c55001xbh.fJNWhG();
            c55001xbh.setText("");
            c55001xbh.EZpvd();
        }
        View.OnFocusChangeListener onFocusChangeListener = c55001xbh.sSMYrx;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }

    public final void setAllowShowNegative(boolean z) {
        this.AkhnZx = z;
        setFilters(OLrzqt());
        if (z) {
            return;
        }
        this.isConnected = false;
    }

    public final void setNegativeMode(boolean z) {
        this.wlaJM = z;
        if (z) {
            this.isConnected = true;
            setAllowShowNegative(true);
            super.setOnFocusChangeListener(this.zLjUOn);
        } else {
            super.setOnFocusChangeListener(this.sSMYrx);
        }
        setFilters(OLrzqt());
        if (getKeyListener() instanceof android.text.method.DigitsKeyListener) {
            setKeyListener(AYXKKw());
        }
    }

    public final void setMaxDecimalValue(int i) {
        ActionBar actionBarCopy$default;
        this.iwGUEr = i;
        if (values() != Integer.MAX_VALUE) {
            actionBarCopy$default = ActionBar.copy$default(this.uzCIH, 0, values() - i, i, 1, null);
        } else {
            actionBarCopy$default = ActionBar.copy$default(this.uzCIH, 0, 0, i, 3, null);
        }
        setModel(actionBarCopy$default);
    }

    public final int AkhnZx() {
        return this.uzCIH.KWHzl();
    }

    public final void setMaxInputLength(int i) {
        ActionBar actionBarCopy$default;
        this.getNewProxyInstance = i;
        if (AkhnZx() != 214748364 && AkhnZx() != Integer.MAX_VALUE && i - AkhnZx() >= 0) {
            actionBarCopy$default = ActionBar.copy$default(this.uzCIH, i, i - AkhnZx(), 0, 4, null);
        } else {
            actionBarCopy$default = ActionBar.copy$default(this.uzCIH, i, 0, 0, 6, null);
        }
        setModel(actionBarCopy$default);
    }

    public final int values() {
        return this.uzCIH.AEQbTJ();
    }

    public final void setLegalCharacters(@NotNull java.util.Set<java.lang.String> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.fIwbmz = set;
        this.AubY.EZpvd(set);
    }

    public final void EZpvd(int i) {
        setModel(ActionBar.copy$default(this.uzCIH, 0, 0, i, 3, null));
    }

    public final void OLrzqt(int i, int i2, int i3) throws java.lang.IllegalArgumentException {
        if (i != Integer.MAX_VALUE) {
            if (i2 != Integer.MAX_VALUE && i < i2) {
                throw new java.lang.IllegalArgumentException("maxLength=" + i + " must be no less than maxIntegerLength=" + i2);
            }
            if (i3 != Integer.MAX_VALUE && i < i3) {
                throw new java.lang.IllegalArgumentException("maxLength=" + i + " must be no less than maxDecimalLength=" + i3);
            }
        }
        setModel(this.uzCIH.EZpvd(i, i2, i3));
    }

    @Override // com.okinc.uilab.edit.OKEditText
    public void setAutoScale(boolean z) {
        this.DbNXlk = z;
        super.setAutoScale(z);
        if (this.DbNXlk) {
            addTextChangedListener(getScaleTextWatcher$OKUILib_uilib());
        } else {
            removeTextChangedListener(getScaleTextWatcher$OKUILib_uilib());
        }
    }

    public final void setPlainNumericText(@NotNull java.lang.String str) {
        java.lang.String strKWHzl = "";
        Intrinsics.checkNotNullParameter(str, "");
        this.AwvSrB = str;
        this.zsXlph = false;
        if (android.text.TextUtils.isEmpty(str)) {
            if (this.wlaJM && hasFocus()) {
                strKWHzl = "-";
            }
        } else {
            strKWHzl = KWHzl(str, new Function1() { // from class: o.xbg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C55001xbh.EZpvd(this.KWHzl, (java.lang.String) obj);
                }
            });
        }
        try {
            setText(strKWHzl);
            setSelection(strKWHzl.length());
        } catch (java.lang.Exception e) {
            e.toString();
        }
        this.zsXlph = true;
    }

    public static final java.lang.String EZpvd(C55001xbh c55001xbh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Locale locale = java.util.Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String strEZpvd = c55001xbh.EZpvd(str, locale);
        java.lang.String strOLrzqt = c55001xbh.OLrzqt(strEZpvd);
        Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String strAEQbTJ = c55001xbh.AEQbTJ(pTB.OLrzqt(c55001xbh.AEQbTJ(strEZpvd, true, locale), strOLrzqt.length(), c55001xbh.getFieldNames), false, c55001xbh.getFieldNames);
        return c55001xbh.KWHzl(strAEQbTJ, StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strAEQbTJ, C38303pTu.EZpvd(c55001xbh.getFieldNames), 0, false, 6, (java.lang.Object) null));
    }

    public final java.lang.String isConnected() {
        if (getText() != null) {
            java.lang.String strEZpvd = StringsKt__StringsKt.EZpvd(AEQbTJ(java.lang.String.valueOf(getText()), true, this.getFieldNames), (java.lang.CharSequence) C38303pTu.EZpvd(this.getFieldNames));
            if (!Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) "-")) {
                return strEZpvd;
            }
        }
        return "";
    }

    public final void setLocalizedNumericText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.zsXlph = false;
        java.lang.String strAEQbTJ = AEQbTJ(str);
        this.hDKMBd = strAEQbTJ;
        try {
            setText(strAEQbTJ);
            setSelection(this.hDKMBd.length());
        } catch (java.lang.Exception e) {
            e.toString();
        }
        this.zsXlph = true;
    }

    public final java.lang.String valueOf() {
        return getText() != null ? AEQbTJ(java.lang.String.valueOf(getText())) : "";
    }

    public final void setModel(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.uzCIH = actionBar;
        setFilters(OLrzqt());
    }

    /* JADX INFO: renamed from: o.xbh$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            java.util.List list = C55001xbh.this.zuBGHE;
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((android.text.TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
        @Override // android.text.TextWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            java.util.List list = C55001xbh.this.zuBGHE;
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((android.text.TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
                }
            }
            java.lang.String strValueOf = java.lang.String.valueOf(charSequence);
            boolean z = false;
            C55001xbh.this.AuCTelauCTel = 0;
            C55001xbh c55001xbh = C55001xbh.this;
            c55001xbh.ORxRYg = c55001xbh.getSelectionStart();
            if (Intrinsics.EZpvd((java.lang.Object) strValueOf, (java.lang.Object) ("-" + C38303pTu.EZpvd(C55001xbh.this.AhwBna())))) {
                C55001xbh.this.AuCTelauCTel = 1;
            } else {
                int i4 = C55001xbh.this.ORxRYg;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (C55001xbh.this.copydefault(strValueOf, i5)) {
                        C55001xbh.this.AuCTelauCTel++;
                    }
                }
            }
            if (android.text.TextUtils.isEmpty(charSequence)) {
                return;
            }
            Intrinsics.copydefault(charSequence);
            if (charSequence.length() <= 1 || C55001xbh.this.getSelectionStart() <= 0) {
                return;
            }
            C55001xbh c55001xbh2 = C55001xbh.this;
            if (!c55001xbh2.copydefault(charSequence.toString(), C55001xbh.this.getSelectionStart() - 1)) {
                if (C55001xbh.this.ORxRYg - 1 < charSequence.length()) {
                    java.util.Locale locale = java.util.Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    if (C38303pTu.AEQbTJ(locale).charAt(0) != charSequence.charAt(C55001xbh.this.getSelectionStart() - 1)) {
                        z = true;
                    }
                }
            }
            c55001xbh2.setDotSeparatorBeforeSelection$OKUILib_uilib(z);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String strValueOf = java.lang.String.valueOf(editable);
            if (!C55001xbh.this.zsXlph) {
                java.util.List list = C55001xbh.this.zuBGHE;
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((android.text.TextWatcher) it.next()).afterTextChanged(editable);
                    }
                }
                if (C55001xbh.this.values() >= 1000 || editable == null) {
                    return;
                }
                int length = editable.length();
                if (length > C55001xbh.this.values()) {
                    length = C55001xbh.this.values();
                }
                java.lang.String string = editable.toString();
                C55001xbh.this.fJNWhG();
                try {
                    android.view.inputmethod.InputConnection inputConnectionDjBIcL = C55001xbh.this.djBIcL();
                    if (inputConnectionDjBIcL != null) {
                        inputConnectionDjBIcL.deleteSurroundingText(10000, 10000);
                        java.lang.String strSubstring = string.substring(0, length);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        inputConnectionDjBIcL.commitText(strSubstring, 0);
                    }
                    C55001xbh c55001xbh = C55001xbh.this;
                    c55001xbh.setSelection(c55001xbh.ORxRYg > C55001xbh.this.values() ? C55001xbh.this.values() : C55001xbh.this.ORxRYg);
                } catch (java.lang.Exception e) {
                    e.toString();
                }
                C55001xbh.this.EZpvd();
                return;
            }
            C55001xbh.this.djBIcL(strValueOf);
        }
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.sSMYrx = onFocusChangeListener;
        if (Intrinsics.EZpvd(super.getOnFocusChangeListener(), this.zLjUOn)) {
            return;
        }
        super.setOnFocusChangeListener(onFocusChangeListener);
    }

    public final void djBIcL(java.lang.String str) {
        java.lang.String str2 = "-";
        if (this.wlaJM && C33129mqd.OLrzqt((java.lang.CharSequence) str) && !C59449zhJ.startsWith$default(str, "-", false, 2, null)) {
            fJNWhG();
            setText("-");
            setSelection(1);
            EZpvd();
            return;
        }
        if (!this.isConnected && C33129mqd.OLrzqt((java.lang.CharSequence) str) && C59449zhJ.startsWith$default(str, "-", false, 2, null)) {
            fJNWhG();
            setText("");
            setSelection(0);
            EZpvd();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<android.text.TextWatcher> list = this.zuBGHE;
        if (list != null) {
            arrayList.addAll(list);
        }
        fJNWhG();
        java.util.List<android.text.TextWatcher> list2 = this.zuBGHE;
        if (list2 != null) {
            list2.clear();
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "-") || !this.isConnected) {
            java.lang.String strAEQbTJ = AEQbTJ(str);
            if (!this.wlaJM || strAEQbTJ.length() != 0) {
                str2 = strAEQbTJ;
            }
        }
        try {
            android.view.inputmethod.InputConnection inputConnection = this.ejfBZ;
            if (inputConnection != null) {
                inputConnection.deleteSurroundingText(10000, 10000);
                inputConnection.commitText(str2, 0);
            }
            if (this.ORxRYg > str2.length()) {
                setSelection(str2.length());
            } else {
                setSelection(AEQbTJ(str2, this.AuCTelauCTel) + (this.fJNWhG ? 1 : 0));
            }
            this.fJNWhG = false;
        } catch (java.lang.Exception e) {
            e.toString();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((android.text.TextWatcher) arrayList.get(i)).afterTextChanged(new android.text.SpannableStringBuilder(str2));
        }
        java.util.List<android.text.TextWatcher> list3 = this.zuBGHE;
        if (list3 != null) {
            list3.addAll(arrayList);
        }
        EZpvd();
    }

    public int AEQbTJ(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        int i2 = 0;
        int i3 = i;
        for (int i4 = 0; i4 < length; i4++) {
            if (copydefault(str, i4)) {
                i3--;
            } else {
                i2++;
            }
            if (i3 <= 0) {
                break;
            }
        }
        return i2 + i;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(@NotNull android.view.inputmethod.EditorInfo editorInfo) {
        Intrinsics.checkNotNullParameter(editorInfo, "");
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.ejfBZ = inputConnectionOnCreateInputConnection;
        return inputConnectionOnCreateInputConnection;
    }

    public final void EZpvd() {
        super.addTextChangedListener(this.AuCTel);
    }

    public final void fJNWhG() {
        super.removeTextChangedListener(this.AuCTel);
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(@NotNull android.text.TextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(textWatcher, "");
        java.util.List<android.text.TextWatcher> list = this.zuBGHE;
        if (list != null) {
            list.add(textWatcher);
        }
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(android.text.TextWatcher textWatcher) {
        java.util.List<android.text.TextWatcher> list;
        java.util.List<android.text.TextWatcher> list2 = this.zuBGHE;
        if (list2 == null || !CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends android.text.TextWatcher>) ((java.lang.Iterable<? extends java.lang.Object>) list2), textWatcher) || (list = this.zuBGHE) == null) {
            return;
        }
        C56532yIw.EZpvd(list).remove(textWatcher);
    }

    public final java.lang.String EZpvd(java.lang.String str, java.util.Locale locale) {
        int length = str.length();
        java.lang.String str2 = "";
        for (int i = 0; i < length; i++) {
            java.lang.String strValueOf = java.lang.String.valueOf(str.charAt(i));
            C55005xbl.StateListAnimator stateListAnimator = C55005xbl.Companion;
            if (stateListAnimator.KWHzl(strValueOf, i, this.AkhnZx) || stateListAnimator.copydefault().contains(strValueOf) || android.text.TextUtils.equals(C38303pTu.EZpvd(locale), strValueOf)) {
                str2 = str2 + strValueOf;
            }
        }
        return str2;
    }

    public final android.text.InputFilter[] OLrzqt() {
        this.zsXlph = true;
        this.AxsJAY = false;
        if (pTF.KWHzl.EZpvd()) {
            setLegalCharacters(yEE.AhwBna("✅", " ❌"));
        }
        C55007xbn c55007xbn = this.AubY;
        c55007xbn.EZpvd(this.uzCIH.KWHzl());
        c55007xbn.EZpvd(this.OcIXYQ);
        c55007xbn.copydefault(this.getFieldNames);
        c55007xbn.copydefault(false);
        c55007xbn.OLrzqt(this.AkhnZx);
        Unit unit = Unit.INSTANCE;
        return new android.text.InputFilter[]{c55007xbn};
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] inputFilterArr) {
        java.util.List listGHZMYf;
        if (this.AubY == null || inputFilterArr == null || (listGHZMYf = yDV.gHZMYf(inputFilterArr)) == null) {
            return;
        }
        if (listGHZMYf.contains(this.AubY)) {
            listGHZMYf.remove(this.AubY);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.zsXlph) {
            arrayList.add(this.AubY);
        }
        arrayList.addAll(listGHZMYf);
        super.setFilters((android.text.InputFilter[]) arrayList.toArray(new android.text.InputFilter[0]));
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            this.fARcdN = true;
        }
        return super.onTextContextMenuItem(i);
    }

    public final void AuCTel() {
        this.zsXlph = false;
        setFilters(new android.text.InputFilter[0]);
        this.AubY.copydefault(true);
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        if (android.text.TextUtils.equals(this.gHZMYf, str)) {
            return str;
        }
        java.lang.String strAEQbTJ = AEQbTJ(str, false, this.getFieldNames);
        return !C55005xbl.Companion.AEQbTJ(strAEQbTJ, this.fIwbmz, this.getFieldNames, this.OcIXYQ, this.AkhnZx) ? "" : KWHzl(EZpvd(strAEQbTJ, this.getFieldNames), new Function1() { // from class: o.xbf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55001xbh.copydefault(this.EZpvd, (java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String copydefault(C55001xbh c55001xbh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return c55001xbh.EZpvd(str);
    }

    public final java.lang.String KWHzl(java.lang.String str, Function1<? super java.lang.String, java.lang.String> function1) {
        if (C59449zhJ.startsWith$default(str, "-", false, 2, null)) {
            java.lang.String strSubstring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            java.lang.String strInvoke = function1.invoke(strSubstring);
            if (strInvoke.length() == 0) {
                return strInvoke;
            }
            return "-" + strInvoke;
        }
        return function1.invoke(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(java.lang.String str) {
        int iIndexOf$default;
        int i;
        int length;
        if (this.fARcdN) {
            int length2 = str.length();
            i = 0;
            iIndexOf$default = -1;
            while (i < length2) {
                if (android.text.TextUtils.equals(java.lang.String.valueOf(str.charAt(i)), C38303pTu.EZpvd(this.getFieldNames))) {
                    if (iIndexOf$default != -1) {
                        break;
                    }
                    iIndexOf$default = i;
                }
                i++;
            }
        } else {
            iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, C38303pTu.EZpvd(this.getFieldNames), 0, false, 6, (java.lang.Object) null);
        }
        i = -1;
        this.fARcdN = false;
        if (iIndexOf$default + 1 == i) {
            str = str.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(str, "");
        } else if (i != -1) {
            str = str.substring(0, i);
            Intrinsics.checkNotNullExpressionValue(str, "");
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        int length3 = str.length();
        int length4 = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length4 && str.charAt(i3) == '0'; i3++) {
            i2 = i3;
        }
        if (iIndexOf$default != -1 && i2 <= (length = str.length() - 1)) {
            while (true) {
                if (str.charAt(length) != '0') {
                    break;
                }
                if (length == i2) {
                    length3 = length;
                    break;
                }
                int i4 = length;
                length--;
                length3 = i4;
            }
        }
        int i5 = i2 + 1;
        java.lang.String strSubstring = "0";
        if ((i5 == str.length() && str.charAt(i2) == '0') || (i2 + 2 == length3 && iIndexOf$default != -1)) {
            if (OLrzqt(str, length3 - 1)) {
                java.lang.String strSubstring2 = str.substring(0);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                str = "0" + strSubstring2;
            } else if (str.length() > 1 && str.charAt(0) == '0') {
                if (!android.text.TextUtils.equals(java.lang.String.valueOf(str.charAt(1)), C38303pTu.EZpvd(this.getFieldNames))) {
                }
            } else if (iIndexOf$default != -1) {
                str = str.substring(i2);
                Intrinsics.checkNotNullExpressionValue(str, "");
            } else {
                str = "0";
            }
            strSubstring = str;
        } else if (iIndexOf$default == 0 && i > 0) {
            java.lang.String strSubstring3 = str.substring(0, i);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
            strSubstring = "0" + strSubstring3;
        } else if (iIndexOf$default == 0) {
            java.lang.String strSubstring4 = str.substring(0);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
            strSubstring = "0" + strSubstring4;
        } else if (iIndexOf$default != -1 && android.text.TextUtils.equals(java.lang.String.valueOf(str.charAt(i5)), C38303pTu.EZpvd(this.getFieldNames))) {
            strSubstring = str.substring(i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        } else if (iIndexOf$default != -1 && OLrzqt(str, i2)) {
            strSubstring = str.substring(i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        } else if (iIndexOf$default != -1) {
            strSubstring = str.substring(i5);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        } else if (OLrzqt(str, i2)) {
            strSubstring = str.substring(i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        } else if (iIndexOf$default != -1 || i5 != str.length()) {
            strSubstring = str.substring(i5);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        }
        java.lang.String strKWHzl = KWHzl(strSubstring, iIndexOf$default);
        this.gHZMYf = strKWHzl;
        return strKWHzl;
    }

    public final java.lang.String KWHzl(java.lang.String str, int i) {
        java.lang.String strValueOf = valueOf(EZpvd(str, StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, C38303pTu.EZpvd(this.getFieldNames), 0, false, 6, (java.lang.Object) null)), i);
        return this.OcIXYQ ? KWHzl(strValueOf) : strValueOf;
    }

    public final java.lang.String EZpvd(java.lang.String str, int i) {
        java.lang.String strSubstring;
        if (this.uzCIH.AEQbTJ() > 1000) {
            return str;
        }
        java.lang.String strCopydefault = copydefault(str);
        java.lang.String strOLrzqt = OLrzqt(str);
        int iCopydefault = this.uzCIH.copydefault();
        if (strCopydefault.length() > iCopydefault) {
            strCopydefault = strCopydefault.substring(0, iCopydefault);
            Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
        }
        if (i != -1 && this.uzCIH.KWHzl() > 0) {
            strCopydefault = strCopydefault + C38303pTu.EZpvd(this.getFieldNames);
            if (!android.text.TextUtils.isEmpty(strOLrzqt)) {
                if (strOLrzqt.length() > this.uzCIH.KWHzl()) {
                    strOLrzqt = strOLrzqt.substring(0, this.uzCIH.KWHzl());
                    Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
                }
                strCopydefault = strCopydefault + strOLrzqt;
            }
        }
        if (strCopydefault.length() <= this.uzCIH.OLrzqt()) {
            return strCopydefault;
        }
        if (i != -1) {
            strSubstring = strCopydefault.substring(0, this.uzCIH.OLrzqt() + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        } else {
            strSubstring = strCopydefault.substring(0, this.uzCIH.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        }
        return strSubstring;
    }

    public final java.lang.String valueOf(java.lang.String str, int i) {
        if (i == -1) {
            return str;
        }
        int iMin = (int) java.lang.Math.min(2147483647L, ((long) i) + ((long) this.uzCIH.KWHzl()));
        if (iMin >= str.length()) {
            java.lang.String strSubstring = str.substring(0);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            return strSubstring;
        }
        if (this.uzCIH.KWHzl() == 0) {
            java.lang.String strSubstring2 = str.substring(0, iMin);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            return strSubstring2;
        }
        java.lang.String strSubstring3 = str.substring(0, iMin + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
        return strSubstring3;
    }

    public final java.lang.String copydefault(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!C55005xbl.Companion.KWHzl(java.lang.String.valueOf(str.charAt(i2)), i2, this.AkhnZx) && !copydefault(str, i2)) {
                break;
            }
            i++;
        }
        java.lang.String strSubstring = str.substring(0, i);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        java.lang.String strCopydefault = copydefault(str);
        if (strCopydefault.length() == str.length() || strCopydefault.length() + 1 == str.length()) {
            return "";
        }
        java.lang.String strSubstring = str.substring(strCopydefault.length() + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public final boolean OLrzqt(java.lang.String str, int i) {
        return i >= 0 && i < str.length() && Intrinsics.copydefault(49, (int) str.charAt(i)) <= 0 && Intrinsics.copydefault((int) str.charAt(i), 57) <= 0;
    }

    public boolean copydefault(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return i >= 0 && i < str.length() && Intrinsics.copydefault(48, (int) str.charAt(i)) <= 0 && Intrinsics.copydefault((int) str.charAt(i), 57) <= 0;
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        if (str.length() == 0) {
            return "";
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, C38303pTu.EZpvd(this.getFieldNames), 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default == -1) {
            return valueOf(str);
        }
        java.lang.String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        java.lang.String strValueOf = valueOf(strSubstring);
        java.lang.String strSubstring2 = str.substring(iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        return strValueOf + strSubstring2;
    }

    public final java.lang.String valueOf(java.lang.String str) {
        java.lang.String strKWHzl = pTB.KWHzl(C59449zhJ.replace$default(str, C38303pTu.EZpvd(this.getFieldNames), java.lang.String.valueOf(new DecimalFormatSymbols(java.util.Locale.US).getDecimalSeparator()), false, 4, (java.lang.Object) null), this.getFieldNames);
        return pTF.KWHzl.EZpvd() ? C59449zhJ.replace$default(C59449zhJ.replace$default(strKWHzl, "✅", "", false, 4, (java.lang.Object) null), " ❌", "", false, 4, (java.lang.Object) null) : strKWHzl;
    }

    public static /* synthetic */ java.lang.String unFormat$default(C55001xbh c55001xbh, java.lang.String str, boolean z, java.util.Locale locale, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unFormat");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            locale = java.util.Locale.getDefault();
        }
        return c55001xbh.AEQbTJ(str, z, locale);
    }

    public final java.lang.String AEQbTJ(java.lang.String str, boolean z, java.util.Locale locale) {
        try {
            java.lang.String strReplace$default = C59449zhJ.replace$default(C59449zhJ.replace$default(str, "✅", "", false, 4, (java.lang.Object) null), C38303pTu.AEQbTJ(locale), "", false, 4, (java.lang.Object) null);
            if (!z) {
                return strReplace$default;
            }
            return C59449zhJ.replace$default(strReplace$default, C38303pTu.EZpvd(locale), java.lang.String.valueOf(new DecimalFormatSymbols(java.util.Locale.US).getDecimalSeparator()), false, 4, (java.lang.Object) null);
        } catch (java.lang.Exception e) {
            e.toString();
            return str;
        }
    }

    /* JADX INFO: renamed from: o.xbh$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xbh.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.xbh$Activity */
    public static final class Activity extends android.text.method.NumberKeyListener {
        public WeakReference<C55001xbh> KWHzl;

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return 8194;
        }

        public Activity(@NotNull C55001xbh c55001xbh) {
            Intrinsics.checkNotNullParameter(c55001xbh, "");
            this.KWHzl = new WeakReference<>(c55001xbh);
        }

        @Override // android.text.method.NumberKeyListener
        public char[] getAcceptedChars() {
            C55001xbh c55001xbh;
            java.util.Locale locale = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.Character chValueOf = java.lang.Character.valueOf(C38303pTu.EZpvd(locale).charAt(0));
            java.util.Locale locale2 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            java.util.List listAhwBna = yDY.AhwBna('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', chValueOf, java.lang.Character.valueOf(C38303pTu.AEQbTJ(locale2).charAt(0)));
            WeakReference<C55001xbh> weakReference = this.KWHzl;
            if (weakReference != null && (c55001xbh = weakReference.get()) != null && c55001xbh.gEmmrt()) {
                listAhwBna.add('-');
            }
            return CollectionsKt___CollectionsKt.values(listAhwBna);
        }
    }

    /* JADX INFO: renamed from: o.xbh$ActionBar */
    public static final class ActionBar {
        public final int EZpvd;
        public final int KWHzl;
        public int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(0, 0, 0, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, int i2, int i3, int i4, java.lang.Object obj) {
            if ((i4 & 1) != 0) {
                i = actionBar.KWHzl;
            }
            if ((i4 & 2) != 0) {
                i2 = actionBar.OLrzqt;
            }
            if ((i4 & 4) != 0) {
                i3 = actionBar.EZpvd;
            }
            return actionBar.EZpvd(i, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(int i, int i2, int i3) {
            return new ActionBar(i, i2, i3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.KWHzl == actionBar.KWHzl && this.OLrzqt == actionBar.OLrzqt && this.EZpvd == actionBar.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Integer.hashCode(this.KWHzl) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Model(maxInputLength=" + this.KWHzl + ", maxIntegerLength=" + this.OLrzqt + ", maxDecimalLength=" + this.EZpvd + ")";
        }

        public ActionBar(int i, int i2, int i3) {
            this.KWHzl = i;
            this.OLrzqt = i2;
            this.EZpvd = i3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (Integer.MAX_VALUE int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (Integer.MAX_VALUE int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000d: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (Integer.MAX_VALUE int) : (r4v0 int))
 A[MD:(int, int, int):void (m)] (LINE:1010) call: o.xbh.ActionBar.<init>(int, int, int):void type: THIS */
        public /* synthetic */ ActionBar(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? Integer.MAX_VALUE : i, (i4 & 2) != 0 ? Integer.MAX_VALUE : i2, (i4 & 4) != 0 ? Integer.MAX_VALUE : i3);
        }

        public final int OLrzqt() {
            long jMin = java.lang.Math.min(this.KWHzl, ((long) this.OLrzqt) + ((long) this.EZpvd));
            if (jMin < 2147483647L) {
                return (int) jMin;
            }
            return Integer.MAX_VALUE;
        }
    }
}
