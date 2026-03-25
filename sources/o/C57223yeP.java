package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yeP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57223yeP {
    public static final kotlin.ranges.IntRange OLrzqt = new kotlin.ranges.IntRange(-1, -1);

    public static final void copydefault(@NotNull android.widget.EditText editText, InterfaceC57229yeV interfaceC57229yeV) {
        Intrinsics.checkNotNullParameter(editText, "");
        C57228yeU c57228yeUCopydefault = copydefault(editText);
        if (interfaceC57229yeV == null && c57228yeUCopydefault != null) {
            editText.removeTextChangedListener(c57228yeUCopydefault);
            return;
        }
        if (interfaceC57229yeV != null) {
            if (c57228yeUCopydefault == null) {
                C57228yeU c57228yeU = new C57228yeU(editText.getText().toString(), interfaceC57229yeV);
                KWHzl(editText, c57228yeU);
                editText.addTextChangedListener(c57228yeU);
                return;
            }
            c57228yeUCopydefault.AEQbTJ(interfaceC57229yeV);
        }
    }

    public static final kotlin.ranges.IntRange AEQbTJ(java.lang.CharSequence charSequence) {
        return new kotlin.ranges.IntRange(android.text.Selection.getSelectionStart(charSequence), android.text.Selection.getSelectionEnd(charSequence));
    }

    public static final C57228yeU copydefault(android.widget.EditText editText) {
        java.lang.Object tag = editText.getTag(C13754dXa.ActionBar.getTabAt);
        if (tag instanceof C57228yeU) {
            return (C57228yeU) tag;
        }
        return null;
    }

    public static final void KWHzl(android.widget.EditText editText, C57228yeU c57228yeU) {
        editText.setTag(C13754dXa.ActionBar.getTabAt, c57228yeU);
    }

    public static /* synthetic */ void tryRequestFocus$default(android.widget.EditText editText, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        AEQbTJ(editText, i);
    }

    public static final void AEQbTJ(@NotNull final android.widget.EditText editText, final int i) {
        Intrinsics.checkNotNullParameter(editText, "");
        if (editText.requestFocus()) {
            tryShowSoftInput$default(editText, 0, 1, null);
            return;
        }
        if (i > 0) {
            pUU.KWHzl("EditText", "retry requestFocus: " + editText);
            editText.post(new java.lang.Runnable() { // from class: o.yeQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C57223yeP.copydefault(editText, i);
                }
            });
        }
    }

    public static final void copydefault(android.widget.EditText editText, int i) {
        AEQbTJ(editText, i - 1);
    }

    public static /* synthetic */ void tryRequestFocusWithoutNotifying$default(android.widget.EditText editText, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        AhwBna(editText, i);
    }

    public static final void AhwBna(@NotNull final android.widget.EditText editText, final int i) {
        Intrinsics.checkNotNullParameter(editText, "");
        View.OnFocusChangeListener onFocusChangeListener = editText.getOnFocusChangeListener();
        if (onFocusChangeListener != null) {
            editText.setOnFocusChangeListener(null);
        }
        if (editText.requestFocus()) {
            if (onFocusChangeListener != null) {
                editText.setOnFocusChangeListener(onFocusChangeListener);
            }
            tryShowSoftInput$default(editText, 0, 1, null);
        } else {
            pUU.KWHzl("EditText", "retry requestFocus: " + editText);
            editText.post(new java.lang.Runnable() { // from class: o.yeN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C57223yeP.valueOf(editText, i);
                }
            });
        }
    }

    public static final void valueOf(android.widget.EditText editText, int i) {
        AhwBna(editText, i - 1);
    }

    public static /* synthetic */ void tryShowSoftInput$default(android.widget.EditText editText, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        gEmmrt(editText, i);
    }

    public static final void gEmmrt(final android.widget.EditText editText, final int i) {
        android.content.Context context = editText.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ContextCompat.getSystemService(context, android.view.inputmethod.InputMethodManager.class);
        if (inputMethodManager == null || inputMethodManager.showSoftInput(editText, 0) || i <= 0) {
            return;
        }
        pUU.KWHzl("EditText", "retry showSoftInput: " + editText);
        editText.post(new java.lang.Runnable() { // from class: o.yeO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C57223yeP.AYXKKw(editText, i);
            }
        });
    }

    public static final void AYXKKw(android.widget.EditText editText, int i) {
        gEmmrt(editText, i - 1);
    }

    public static final void AEQbTJ(@NotNull android.widget.EditText editText, @NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(editText, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        C57228yeU c57228yeUCopydefault = copydefault(editText);
        if (c57228yeUCopydefault != null) {
            editText.removeTextChangedListener(c57228yeUCopydefault);
        } else {
            c57228yeUCopydefault = null;
        }
        android.text.Editable editableText = editText.getEditableText();
        if (!Intrinsics.EZpvd(editableText, charSequence)) {
            if (editableText == null) {
                editText.setText(charSequence);
            } else {
                editableText.replace(0, editableText.length(), charSequence);
            }
            kotlin.ranges.IntRange intRangeAEQbTJ = AEQbTJ(charSequence);
            if (!Intrinsics.EZpvd(intRangeAEQbTJ, OLrzqt)) {
                editText.setSelection(intRangeAEQbTJ.KWHzl(), intRangeAEQbTJ.copydefault());
            }
        }
        if (c57228yeUCopydefault != null) {
            editText.addTextChangedListener(c57228yeUCopydefault);
        }
    }
}
