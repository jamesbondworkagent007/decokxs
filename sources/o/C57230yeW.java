package o;

import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yeW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57230yeW extends C55001xbh {
    public final java.util.ArrayList<Application> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57230yeW(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:21) call: o.yeW.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C57230yeW(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57230yeW(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = new java.util.ArrayList<>();
        setMaxDecimalValue(24);
        setShowThousandsSeparator(true);
        setKeyListener(AYXKKw());
    }

    public final void AEQbTJ(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        application.AEQbTJ(this);
        addTextChangedListener(application.AEQbTJ());
        this.OLrzqt.add(application);
    }

    public final void EZpvd(Application application) {
        if (application != null) {
            application.AEQbTJ(null);
        }
        removeTextChangedListener(application != null ? application.AEQbTJ() : null);
        C56532yIw.EZpvd(this.OLrzqt).remove(application);
    }

    public static /* synthetic */ void setTextWrapper$default(C57230yeW c57230yeW, java.lang.String str, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        c57230yeW.setTextWrapper(str, roundingMode);
    }

    public final void setTextWrapper(java.lang.String str, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(roundingMode, "");
        if (str == null) {
            str = "";
        }
        setPlainNumericText(str);
    }

    public final java.lang.String copydefault() {
        android.text.Editable text = getText();
        if (text == null || text.length() == 0) {
            android.text.Editable text2 = getText();
            if (text2 != null) {
                return text2.toString();
            }
            return null;
        }
        return isConnected();
    }

    public final void setSelectionMax() {
        java.lang.String string;
        android.text.Editable text = getText();
        setSelection((text == null || (string = text.toString()) == null) ? 0 : string.length());
    }

    /* JADX INFO: renamed from: o.yeW$Application */
    public static abstract class Application {
        public C57230yeW AhwBna;
        public final android.text.TextWatcher valueOf = new StateListAnimator();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.text.TextWatcher AEQbTJ() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C57230yeW c57230yeW) {
            this.AhwBna = c57230yeW;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C57230yeW KWHzl() {
            return this.AhwBna;
        }

        public abstract void OLrzqt(java.lang.String str);

        /* JADX INFO: renamed from: o.yeW$Application$StateListAnimator */
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
                Application application = Application.this;
                C57230yeW c57230yeWKWHzl = application.KWHzl();
                application.OLrzqt(c57230yeWKWHzl != null ? c57230yeWKWHzl.isConnected() : null);
            }
        }
    }
}
