package o;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xfJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55189xfJ extends android.widget.RelativeLayout {
    public android.app.Activity AEQbTJ;
    public int AYXKKw;
    public int EZpvd;
    public final Application KWHzl;
    public Function0<Unit> OLrzqt;
    public final C54916xaB copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55189xfJ(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnBeforeOpen(Function0<Unit> function0) {
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:20) call: o.xfJ.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C55189xfJ(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55189xfJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C54916xaB c54916xaBOLrzqt = C54916xaB.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c54916xaBOLrzqt, "");
        this.copydefault = c54916xaBOLrzqt;
        this.AEQbTJ = C33569myt.OLrzqt(context);
        this.KWHzl = new Application();
        C55230xfy root = c54916xaBOLrzqt.getRoot();
        root.setFocusable(true);
        root.setFocusableInTouchMode(true);
        root.requestFocus();
        c54916xaBOLrzqt.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.xfI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C55189xfJ.AEQbTJ(this.EZpvd, view);
            }
        });
    }

    private final C55180xfA OLrzqt() {
        android.app.Activity activity = this.AEQbTJ;
        Intrinsics.copydefault(activity, "");
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = ((AppCompatActivity) activity).getSupportFragmentManager().findFragmentByTag("SearchBarFragment");
        if (fragmentFindFragmentByTag instanceof C55180xfA) {
            return (C55180xfA) fragmentFindFragmentByTag;
        }
        return null;
    }

    public static final void AEQbTJ(C55189xfJ c55189xfJ, android.view.View view) {
        c55189xfJ.copydefault(true);
    }

    public final void copydefault(boolean z) {
        Function0<Unit> function0 = this.OLrzqt;
        if (function0 != null) {
            function0.invoke();
        }
        if (z) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            this.EZpvd = iArr[0];
            this.AYXKKw = iArr[1];
        }
        android.app.Activity activity = this.AEQbTJ;
        if (activity instanceof AppCompatActivity) {
            Intrinsics.copydefault(activity, "");
            if (((AppCompatActivity) activity).getSupportFragmentManager().findFragmentByTag("SearchBarFragment") != null) {
                return;
            }
            C55180xfA c55180xfA = new C55180xfA();
            this.KWHzl.OLrzqt(c55180xfA);
            c55180xfA.AEQbTJ(z);
            c55180xfA.EZpvd(this.AYXKKw);
            c55180xfA.EZpvd(this.copydefault.getRoot().KWHzl().getHint());
            android.app.Activity activity2 = this.AEQbTJ;
            Intrinsics.copydefault(activity2, "");
            androidx.fragment.app.FragmentManager supportFragmentManager = ((AppCompatActivity) activity2).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c55180xfA.KWHzl(supportFragmentManager, "SearchBarFragment");
        }
    }

    public final void setHintText(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.copydefault.getRoot().KWHzl().setHint(charSequence);
    }

    public final void setSize(int i) {
        this.copydefault.getRoot().setOKDSSize(i);
        this.KWHzl.EZpvd(java.lang.Integer.valueOf(i));
        C55180xfA c55180xfAOLrzqt = OLrzqt();
        if (c55180xfAOLrzqt != null) {
            c55180xfAOLrzqt.OLrzqt(i);
        }
    }

    public final void setText(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.KWHzl.KWHzl(charSequence);
        C55180xfA c55180xfAOLrzqt = OLrzqt();
        if (c55180xfAOLrzqt != null) {
            c55180xfAOLrzqt.copydefault(charSequence);
        }
    }

    public final void KWHzl(boolean z) {
        this.KWHzl.EZpvd(java.lang.Boolean.valueOf(z));
        C55180xfA c55180xfAOLrzqt = OLrzqt();
        if (c55180xfAOLrzqt != null) {
            c55180xfAOLrzqt.copydefault(z);
        }
    }

    public final void setHistoryText(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.KWHzl.AEQbTJ(charSequence);
        C55180xfA c55180xfAOLrzqt = OLrzqt();
        if (c55180xfAOLrzqt != null) {
            c55180xfAOLrzqt.KWHzl(charSequence);
        }
    }

    public final void setCustomContentView(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.KWHzl.KWHzl(view);
        C55180xfA c55180xfAOLrzqt = OLrzqt();
        if (c55180xfAOLrzqt != null) {
            c55180xfAOLrzqt.KWHzl(view);
        }
    }

    public final void setHistoryRecordList(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl.EZpvd(list);
        C55180xfA c55180xfAOLrzqt = OLrzqt();
        if (c55180xfAOLrzqt != null) {
            c55180xfAOLrzqt.AEQbTJ(list);
        }
    }

    public final void setCancelCallback(Function0<Unit> function0) {
        this.KWHzl.KWHzl(function0);
        C55180xfA c55180xfAOLrzqt = OLrzqt();
        if (c55180xfAOLrzqt != null) {
            c55180xfAOLrzqt.OLrzqt(function0);
        }
    }

    public final void setClearCallback(Function0<Unit> function0) {
        this.KWHzl.EZpvd(function0);
        C55180xfA c55180xfAOLrzqt = OLrzqt();
        if (c55180xfAOLrzqt != null) {
            c55180xfAOLrzqt.KWHzl(function0);
        }
    }

    public final void setTextChangedListener(@NotNull android.text.TextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(textWatcher, "");
        this.KWHzl.KWHzl(textWatcher);
        C55180xfA c55180xfAOLrzqt = OLrzqt();
        if (c55180xfAOLrzqt != null) {
            c55180xfAOLrzqt.OLrzqt(textWatcher);
        }
    }

    public final void setCancelText(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.KWHzl.copydefault(charSequence);
        C55180xfA c55180xfAOLrzqt = OLrzqt();
        if (c55180xfAOLrzqt != null) {
            c55180xfAOLrzqt.OLrzqt(charSequence);
        }
    }

    public final java.lang.String AEQbTJ() {
        java.lang.String strCopydefault;
        C55180xfA c55180xfAOLrzqt = OLrzqt();
        if (c55180xfAOLrzqt != null && (strCopydefault = c55180xfAOLrzqt.copydefault()) != null) {
            return strCopydefault;
        }
        java.lang.CharSequence charSequenceKWHzl = this.KWHzl.KWHzl();
        if (charSequenceKWHzl != null) {
            return charSequenceKWHzl.toString();
        }
        return null;
    }

    public final void setOnEditorActionListener(@NotNull TextView.OnEditorActionListener onEditorActionListener) {
        Intrinsics.checkNotNullParameter(onEditorActionListener, "");
        this.KWHzl.KWHzl(onEditorActionListener);
        C55180xfA c55180xfAOLrzqt = OLrzqt();
        if (c55180xfAOLrzqt != null) {
            c55180xfAOLrzqt.OLrzqt(onEditorActionListener);
        }
    }

    public final void copydefault() {
        C55180xfA c55180xfAOLrzqt = OLrzqt();
        if (c55180xfAOLrzqt != null) {
            c55180xfAOLrzqt.AEQbTJ();
        }
    }

    public final void setSearchBarYOffset(int i) {
        this.KWHzl.KWHzl(java.lang.Integer.valueOf(i));
        C55180xfA c55180xfAOLrzqt = OLrzqt();
        if (c55180xfAOLrzqt != null) {
            c55180xfAOLrzqt.copydefault(i);
        }
    }

    public final C55230xfy EZpvd() {
        C55180xfA c55180xfAOLrzqt = OLrzqt();
        if (c55180xfAOLrzqt != null) {
            return c55180xfAOLrzqt.OLrzqt();
        }
        return null;
    }

    /* JADX INFO: renamed from: o.xfJ$Application */
    public static final class Application {
        public Function0<Unit> AEQbTJ;
        public Function0<Unit> AYXKKw;
        public java.lang.CharSequence AhwBna;
        public android.text.TextWatcher AkhnZx;
        public Function0<Unit> EZpvd;
        public java.lang.CharSequence KWHzl;
        public java.lang.Boolean OLrzqt;
        public android.view.View copydefault;
        public TextView.OnEditorActionListener djBIcL;
        public java.lang.Integer gEmmrt;
        public java.lang.Integer isConnected;
        public java.util.List<java.lang.String> valueOf;
        public java.lang.CharSequence values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.CharSequence charSequence) {
            this.AhwBna = charSequence;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Boolean bool) {
            this.OLrzqt = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Integer num) {
            this.isConnected = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<java.lang.String> list) {
            this.valueOf = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(Function0<Unit> function0) {
            this.AEQbTJ = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.CharSequence KWHzl() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(android.text.TextWatcher textWatcher) {
            this.AkhnZx = textWatcher;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(android.view.View view) {
            this.copydefault = view;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(TextView.OnEditorActionListener onEditorActionListener) {
            this.djBIcL = onEditorActionListener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.CharSequence charSequence) {
            this.values = charSequence;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Integer num) {
            this.gEmmrt = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(Function0<Unit> function0) {
            this.EZpvd = function0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.CharSequence charSequence) {
            this.KWHzl = charSequence;
        }

        public final void OLrzqt(@NotNull C55180xfA c55180xfA) {
            Intrinsics.checkNotNullParameter(c55180xfA, "");
            java.lang.Integer num = this.isConnected;
            if (num != null) {
                c55180xfA.OLrzqt(num.intValue());
            }
            c55180xfA.copydefault(this.values);
            java.lang.Boolean bool = this.OLrzqt;
            if (bool != null) {
                c55180xfA.copydefault(bool.booleanValue());
            }
            java.lang.CharSequence charSequence = this.AhwBna;
            if (charSequence != null) {
                c55180xfA.KWHzl(charSequence);
                C55187xfH c55187xfHKWHzl = c55180xfA.KWHzl();
                if (c55187xfHKWHzl != null) {
                    c55187xfHKWHzl.setTitle(charSequence);
                }
            }
            android.view.View view = this.copydefault;
            if (view != null) {
                c55180xfA.KWHzl(view);
            }
            java.util.List<java.lang.String> list = this.valueOf;
            if (list != null) {
                c55180xfA.AEQbTJ(list);
            }
            Function0<Unit> function0 = this.EZpvd;
            if (function0 != null) {
                c55180xfA.OLrzqt(function0);
            }
            Function0<Unit> function02 = this.AEQbTJ;
            if (function02 != null) {
                c55180xfA.KWHzl(function02);
            }
            android.text.TextWatcher textWatcher = this.AkhnZx;
            if (textWatcher != null) {
                c55180xfA.OLrzqt(textWatcher);
            }
            Function0<Unit> function03 = this.AYXKKw;
            if (function03 != null) {
                c55180xfA.AEQbTJ(function03);
            }
            java.lang.CharSequence charSequence2 = this.KWHzl;
            if (charSequence2 != null) {
                c55180xfA.OLrzqt(charSequence2);
            }
            TextView.OnEditorActionListener onEditorActionListener = this.djBIcL;
            if (onEditorActionListener != null) {
                c55180xfA.OLrzqt(onEditorActionListener);
            }
            java.lang.Integer num2 = this.gEmmrt;
            if (num2 != null) {
                c55180xfA.copydefault(num2.intValue());
            }
        }
    }
}
