package o;

import android.content.ClipData;
import android.os.Build;
import android.view.View;
import androidx.autofill.HintConstants;
import com.okinc.uilab.code.OKCodeInput;
import com.okinc.uilab.edit.OKEditText;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wZo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C52820wZo extends OKEditText {
    public Function0<Unit> AEQbTJ;
    public boolean KWHzl;
    public OKCodeInput.AutofillType OLrzqt;
    public Function1<? super java.lang.String, Unit> copydefault;

    /* JADX INFO: renamed from: o.wZo$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKCodeInput.AutofillType.values().length];
            try {
                iArr[OKCodeInput.AutofillType.SMS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.view.View
    public boolean isEnabled() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnBackListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnPasteListener(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52820wZo(@NotNull android.content.Context context) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = new Function1() { // from class: o.wZv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52820wZo.AEQbTJ((java.lang.String) obj);
            }
        };
        this.AEQbTJ = new Function0() { // from class: o.wZu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52820wZo.AEQbTJ();
            }
        };
        this.KWHzl = true;
        setGravity(17);
        setInputType(2);
        setTextIsSelectable(false);
        setBackgroundResource(C52761wXj.TaskDescription.KWHzl);
        setOnKeyListener(new View.OnKeyListener() { // from class: o.wZs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
                return C52820wZo.AEQbTJ(this.KWHzl, view, i, keyEvent);
            }
        });
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.wZy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                C52820wZo.KWHzl(this.copydefault, view, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(java.lang.String str) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    public final void setAutofillType(OKCodeInput.AutofillType autofillType) {
        this.OLrzqt = autofillType;
        copydefault(autofillType);
    }

    public static final boolean AEQbTJ(C52820wZo c52820wZo, android.view.View view, int i, android.view.KeyEvent keyEvent) {
        if (i != 67 || keyEvent.getAction() != 0) {
            return false;
        }
        c52820wZo.AEQbTJ.invoke();
        return false;
    }

    public static final void KWHzl(C52820wZo c52820wZo, android.view.View view, boolean z) {
        if (z) {
            c52820wZo.setBackgroundResource(C52761wXj.TaskDescription.copydefault);
        } else {
            c52820wZo.setBackgroundResource(C52761wXj.TaskDescription.KWHzl);
        }
    }

    public final void copydefault(OKCodeInput.AutofillType autofillType) {
        if (Build.VERSION.SDK_INT >= 26) {
            int i = autofillType == null ? -1 : TaskDescription.OLrzqt[autofillType.ordinal()];
            if (i == -1) {
                setAutofillHints(new java.lang.String[]{null});
                setImportantForAutofill(2);
            } else {
                if (i != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                setAutofillHints(new java.lang.String[]{HintConstants.AUTOFILL_HINT_SMS_OTP});
                setImportantForAutofill(1);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int getAutofillType() {
        if (this.OLrzqt == null) {
            return 0;
        }
        return super.getAutofillType();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.KWHzl) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        android.content.ClipData primaryClip;
        ClipData.Item itemAt;
        java.lang.CharSequence text;
        if (i == 16908322 || i == 16908337) {
            java.lang.Object systemService = getContext().getSystemService("clipboard");
            java.lang.String string = null;
            android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
            if (clipboardManager != null && (primaryClip = clipboardManager.getPrimaryClip()) != null && (itemAt = primaryClip.getItemAt(0)) != null && (text = itemAt.getText()) != null) {
                string = text.toString();
            }
            this.copydefault.invoke(string);
            return true;
        }
        return super.onTextContextMenuItem(i);
    }
}
