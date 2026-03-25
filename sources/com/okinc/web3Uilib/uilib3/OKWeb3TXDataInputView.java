package com.okinc.web3Uilib.uilib3;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.uilab.edit.OKEditText;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55001xbh;
import o.C55298xhM;
import o.C56444yFp;
import o.C57391yhY;
import o.C57447yib;
import o.C57451yif;
import o.C57482yjJ;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class OKWeb3TXDataInputView extends ConstraintLayout {
    public TextWatcher AEQbTJ;
    public C55001xbh EZpvd;
    public final C57391yhY copydefault;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InputType.values().length];
            try {
                iArr[InputType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputType.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[HeightMode.values().length];
            try {
                iArr2[HeightMode.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[HeightMode.TALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            KWHzl = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKWeb3TXDataInputView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKWeb3TXDataInputView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:24) call: com.okinc.web3Uilib.uilib3.OKWeb3TXDataInputView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ OKWeb3TXDataInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKWeb3TXDataInputView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C57391yhY c57391yhYCopydefault = C57391yhY.copydefault(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c57391yhYCopydefault, "");
        this.copydefault = c57391yhYCopydefault;
        setPadding(C55298xhM.dpInt$default(24, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(12, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(24, (Context) null, 1, (Object) null), C55298xhM.dpInt$default(12, (Context) null, 1, (Object) null));
    }

    public static final class StateListAnimator {
        public final String AEQbTJ;
        public final Function1<String, Unit> AYXKKw;
        public final String AhwBna;
        public final HeightMode EZpvd;
        public final InputType KWHzl;
        public final int OLrzqt;
        public final int copydefault;
        public final String gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull String str, String str2, String str3, @NotNull HeightMode heightMode, @NotNull InputType inputType, int i, int i2, Function1<? super String, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(heightMode, "");
            Intrinsics.checkNotNullParameter(inputType, "");
            return new StateListAnimator(str, str2, str3, heightMode, inputType, i, i2, function1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InputType KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HeightMode copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((Object) this.AhwBna, (Object) stateListAnimator.AhwBna) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) stateListAnimator.gEmmrt) && this.EZpvd == stateListAnimator.EZpvd && this.KWHzl == stateListAnimator.KWHzl && this.OLrzqt == stateListAnimator.OLrzqt && this.copydefault == stateListAnimator.copydefault && Intrinsics.EZpvd(this.AYXKKw, stateListAnimator.AYXKKw);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<String, Unit> gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AhwBna.hashCode();
            String str = this.AEQbTJ;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.gEmmrt;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            int iHashCode4 = this.EZpvd.hashCode();
            int iHashCode5 = this.KWHzl.hashCode();
            int iHashCode6 = Integer.hashCode(this.OLrzqt);
            int iHashCode7 = Integer.hashCode(this.copydefault);
            Function1<String, Unit> function1 = this.AYXKKw;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (function1 != null ? function1.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DataInputInfoBean(title=" + this.AhwBna + ", hint=" + this.AEQbTJ + ", text=" + this.gEmmrt + ", heightMode=" + this.EZpvd + ", inputType=" + this.KWHzl + ", maxByteLength=" + this.OLrzqt + ", maxDecimalLength=" + this.copydefault + ", textChangeCallback=" + this.AYXKKw + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull String str, String str2, String str3, @NotNull HeightMode heightMode, @NotNull InputType inputType, int i, int i2, Function1<? super String, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(heightMode, "");
            Intrinsics.checkNotNullParameter(inputType, "");
            this.AhwBna = str;
            this.AEQbTJ = str2;
            this.gEmmrt = str3;
            this.EZpvd = heightMode;
            this.KWHzl = inputType;
            this.OLrzqt = i;
            this.copydefault = i2;
            this.AYXKKw = function1;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class HeightMode {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ HeightMode[] $VALUES;
        public static final HeightMode NORMAL = new HeightMode("NORMAL", 0);
        public static final HeightMode TALL = new HeightMode("TALL", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ HeightMode[] $values() {
            return new HeightMode[]{NORMAL, TALL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<HeightMode> getEntries() {
            return $ENTRIES;
        }

        private HeightMode(String str, int i) {
        }

        static {
            HeightMode[] heightModeArr$values = $values();
            $VALUES = heightModeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(heightModeArr$values);
        }

        public static HeightMode valueOf(String str) {
            return (HeightMode) Enum.valueOf(HeightMode.class, str);
        }

        public static HeightMode[] values() {
            return (HeightMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InputType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ InputType[] $VALUES;
        public static final InputType TEXT = new InputType("TEXT", 0);
        public static final InputType NUMBER = new InputType("NUMBER", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ InputType[] $values() {
            return new InputType[]{TEXT, NUMBER};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<InputType> getEntries() {
            return $ENTRIES;
        }

        private InputType(String str, int i) {
        }

        static {
            InputType[] inputTypeArr$values = $values();
            $VALUES = inputTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(inputTypeArr$values);
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }

    public final void setData(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.copydefault.OLrzqt.setText(stateListAnimator.AYXKKw());
        int i = TaskDescription.OLrzqt[stateListAnimator.KWHzl().ordinal()];
        if (i == 1) {
            EZpvd(stateListAnimator);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            KWHzl(stateListAnimator);
        }
    }

    public static final class ActionBar implements TextWatcher {
        public final /* synthetic */ StateListAnimator copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar(StateListAnimator stateListAnimator) {
            this.copydefault = stateListAnimator;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Function1<String, Unit> function1GEmmrt = this.copydefault.gEmmrt();
            if (function1GEmmrt != null) {
                String string = editable != null ? editable.toString() : null;
                if (string == null) {
                    string = "";
                }
                function1GEmmrt.invoke(string);
            }
        }
    }

    private final void EZpvd(StateListAnimator stateListAnimator) {
        OKEditText root = C57447yib.EZpvd(LayoutInflater.from(getContext()), this.copydefault.EZpvd.fIwbmz(), false).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        if (stateListAnimator.OLrzqt() > 0) {
            root.setFilters(new C57482yjJ[]{new C57482yjJ(stateListAnimator.OLrzqt() + 1)});
        }
        String strAhwBna = stateListAnimator.AhwBna();
        if (strAhwBna != null && strAhwBna.length() != 0) {
            root.setText(stateListAnimator.AhwBna());
        }
        root.addTextChangedListener(new ActionBar(stateListAnimator));
        setupEditText(root, stateListAnimator);
    }

    private final void KWHzl(StateListAnimator stateListAnimator) {
        C55001xbh root = C57451yif.EZpvd(LayoutInflater.from(getContext()), this.copydefault.EZpvd.fIwbmz(), false).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setShowThousandsSeparator(true);
        root.EZpvd(stateListAnimator.EZpvd());
        String strAhwBna = stateListAnimator.AhwBna();
        if (strAhwBna != null && strAhwBna.length() != 0) {
            root.setPlainNumericText(stateListAnimator.AhwBna());
        }
        root.removeTextChangedListener(this.AEQbTJ);
        Activity activity = new Activity(stateListAnimator, root);
        this.AEQbTJ = activity;
        Intrinsics.copydefault(activity);
        root.addTextChangedListener(activity);
        this.EZpvd = root;
        setupEditText(root, stateListAnimator);
    }

    public static final class Activity implements TextWatcher {
        public final /* synthetic */ C55001xbh OLrzqt;
        public final /* synthetic */ StateListAnimator copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity(StateListAnimator stateListAnimator, C55001xbh c55001xbh) {
            this.copydefault = stateListAnimator;
            this.OLrzqt = c55001xbh;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Function1<String, Unit> function1GEmmrt = this.copydefault.gEmmrt();
            if (function1GEmmrt != null) {
                function1GEmmrt.invoke(this.OLrzqt.isConnected());
            }
        }
    }

    public final void setupEditText(OKEditText oKEditText, StateListAnimator stateListAnimator) {
        LinearLayout.LayoutParams layoutParams;
        oKEditText.setHint(stateListAnimator.AEQbTJ());
        HeightMode heightModeCopydefault = stateListAnimator.copydefault();
        int[] iArr = TaskDescription.KWHzl;
        int i = iArr[heightModeCopydefault.ordinal()];
        if (i == 1) {
            this.copydefault.EZpvd.setSizeType(48);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.copydefault.EZpvd.setSizeType(100);
        }
        this.copydefault.EZpvd.setContentView(oKEditText);
        int i2 = iArr[stateListAnimator.copydefault().ordinal()];
        if (i2 == 1) {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            layoutParams = new LinearLayout.LayoutParams(-1, C55298xhM.OLrzqt(100, context));
        }
        oKEditText.setLayoutParams(layoutParams);
    }

    public final void setErrorText(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.copydefault.EZpvd.setErrorText(charSequence);
    }

    public final void EZpvd() {
        this.copydefault.EZpvd.values();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C55001xbh c55001xbh;
        super.onDetachedFromWindow();
        TextWatcher textWatcher = this.AEQbTJ;
        if (textWatcher != null && (c55001xbh = this.EZpvd) != null) {
            c55001xbh.removeTextChangedListener(textWatcher);
        }
        this.AEQbTJ = null;
    }
}
