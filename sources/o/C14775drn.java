package o;

import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C14126dfa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.drn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14775drn extends C55019xbz {
    public Function1<? super java.lang.String, Unit> AEQbTJ;
    public boolean KWHzl;
    public Function0<Unit> OLrzqt;
    public Function1<? super java.lang.Boolean, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14775drn(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14775drn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    public final Function1<java.lang.String, Unit> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnEditorActionListener(Function0<Unit> function0) {
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnFocusChanged(Function1<? super java.lang.Boolean, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnTextChanged(Function1<? super java.lang.String, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.spnCvw int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:16) call: o.drn.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C14775drn(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.spnCvw : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14775drn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = true;
        AEQbTJ();
        KWHzl();
    }

    public static final void KWHzl(C14775drn c14775drn, android.view.View view) {
        c14775drn.AEQbTJ();
    }

    /* JADX DEBUG: Possible override for method o.xbz.KWHzl()Lo/xbA; */
    public final void KWHzl() {
        C54957xaq c54957xaqAEQbTJ;
        android.widget.LinearLayout linearLayout;
        C55009xbp c55009xbpFIwbmz = fIwbmz();
        if (c55009xbpFIwbmz != null && (c54957xaqAEQbTJ = c55009xbpFIwbmz.AEQbTJ()) != null && (linearLayout = c54957xaqAEQbTJ.KWHzl) != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.drr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C14775drn.KWHzl(this.OLrzqt, view);
                }
            });
        }
        C55001xbh c55001xbhAkhnZx = AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setInputType(128);
        }
        C55001xbh c55001xbhAkhnZx2 = AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.addTextChangedListener(new Activity());
        }
        C55001xbh c55001xbhAkhnZx3 = AkhnZx();
        if (c55001xbhAkhnZx3 != null) {
            c55001xbhAkhnZx3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.drp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    C14775drn.EZpvd(this.AEQbTJ, view, z);
                }
            });
        }
        C55001xbh c55001xbhAkhnZx4 = AkhnZx();
        if (c55001xbhAkhnZx4 != null) {
            c55001xbhAkhnZx4.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.drq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
                    return C14775drn.AEQbTJ(this.EZpvd, textView, i, keyEvent);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.drn$Activity */
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
            java.lang.String string;
            Function1<java.lang.String, Unit> function1OLrzqt = C14775drn.this.OLrzqt();
            if (function1OLrzqt != null) {
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                function1OLrzqt.invoke(string);
            }
        }
    }

    public static final void EZpvd(C14775drn c14775drn, android.view.View view, boolean z) {
        C55001xbh c55001xbhAkhnZx = c14775drn.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setActivated(z);
        }
        Function1<? super java.lang.Boolean, Unit> function1 = c14775drn.copydefault;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
    }

    public static final boolean AEQbTJ(C14775drn c14775drn, android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        Function0<Unit> function0;
        if (i != 6 || (function0 = c14775drn.OLrzqt) == null) {
            return false;
        }
        function0.invoke();
        return false;
    }

    public final boolean EZpvd() {
        java.lang.String string;
        android.text.Editable text;
        C55001xbh c55001xbhAkhnZx = AkhnZx();
        if (c55001xbhAkhnZx == null || (text = c55001xbhAkhnZx.getText()) == null || (string = text.toString()) == null) {
            string = "";
        }
        if (string.length() == 0) {
            values();
            return false;
        }
        C14126dfa.StateListAnimator stateListAnimatorCopydefault = C14126dfa.KWHzl.copydefault(string);
        if (!stateListAnimatorCopydefault.OLrzqt()) {
            setErrorText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onRewind));
        }
        return stateListAnimatorCopydefault.OLrzqt();
    }

    public final void AEQbTJ() {
        if (this.KWHzl) {
            C55009xbp c55009xbpFIwbmz = fIwbmz();
            if (c55009xbpFIwbmz != null) {
                c55009xbpFIwbmz.isConnected();
            }
            C55009xbp c55009xbpFIwbmz2 = fIwbmz();
            if (c55009xbpFIwbmz2 != null) {
                C55009xbp.replaceFunctionDrawable$default(c55009xbpFIwbmz2, ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.invokespecialgBtXYZ), 0, 0, 6, null);
            }
        } else {
            C55009xbp c55009xbpFIwbmz3 = fIwbmz();
            if (c55009xbpFIwbmz3 != null) {
                c55009xbpFIwbmz3.values();
            }
            C55009xbp c55009xbpFIwbmz4 = fIwbmz();
            if (c55009xbpFIwbmz4 != null) {
                C55009xbp.replaceFunctionDrawable$default(c55009xbpFIwbmz4, ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.ODCBUN), 0, 0, 6, null);
            }
        }
        this.KWHzl = !this.KWHzl;
        C55001xbh c55001xbhAkhnZx = AkhnZx();
        if (c55001xbhAkhnZx != null) {
            if (!this.KWHzl) {
                c55001xbhAkhnZx.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
            }
            android.text.Editable text = c55001xbhAkhnZx.getText();
            c55001xbhAkhnZx.setSelection(text != null ? text.length() : 0);
        }
    }

    public final void setContentDescription(@NotNull java.lang.String str) {
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        Intrinsics.checkNotNullParameter(str, "");
        C55009xbp c55009xbpFIwbmz = fIwbmz();
        if (c55009xbpFIwbmz == null || (c54957xaqAEQbTJ = c55009xbpFIwbmz.AEQbTJ()) == null || (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) == null) {
            return;
        }
        c55001xbh.setContentDescription(str);
    }
}
