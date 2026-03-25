package com.okinc.web3.security.view;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import o.C57407yho;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class EditTextsKt {
    private static final IntRange NO_SELECTION = new IntRange(-1, -1);

    public static final void setTextChangedListener(@NotNull EditText editText, TextChangedListener textChangedListener) {
        Intrinsics.checkNotNullParameter(editText, "");
        TextChangeListenerWatcher textChangedListenerWatcher = getTextChangedListenerWatcher(editText);
        if (textChangedListener == null && textChangedListenerWatcher != null) {
            editText.removeTextChangedListener(textChangedListenerWatcher);
            return;
        }
        if (textChangedListener != null) {
            if (textChangedListenerWatcher == null) {
                TextChangeListenerWatcher textChangeListenerWatcher = new TextChangeListenerWatcher(editText.getText().toString(), textChangedListener);
                setTextChangedListenerWatcher(editText, textChangeListenerWatcher);
                editText.addTextChangedListener(textChangeListenerWatcher);
                return;
            }
            textChangedListenerWatcher.setListener(textChangedListener);
        }
    }

    private static final IntRange getSelection(CharSequence charSequence) {
        return new IntRange(Selection.getSelectionStart(charSequence), Selection.getSelectionEnd(charSequence));
    }

    private static final TextChangeListenerWatcher getTextChangedListenerWatcher(EditText editText) {
        Object tag = editText.getTag(C57407yho.Application.gwTjWJ);
        if (tag instanceof TextChangeListenerWatcher) {
            return (TextChangeListenerWatcher) tag;
        }
        return null;
    }

    private static final void setTextChangedListenerWatcher(EditText editText, TextChangeListenerWatcher textChangeListenerWatcher) {
        editText.setTag(C57407yho.Application.gwTjWJ, textChangeListenerWatcher);
    }

    private static final void pauseTextChangedEventsRunning(EditText editText, Function0<Unit> function0) {
        TextChangeListenerWatcher textChangedListenerWatcher = getTextChangedListenerWatcher(editText);
        if (textChangedListenerWatcher != null) {
            editText.removeTextChangedListener(textChangedListenerWatcher);
        } else {
            textChangedListenerWatcher = null;
        }
        function0.invoke();
        if (textChangedListenerWatcher != null) {
            editText.addTextChangedListener(textChangedListenerWatcher);
        }
    }

    public static /* synthetic */ void tryRequestFocus$default(EditText editText, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        tryRequestFocus(editText, i);
    }

    public static final void tryRequestFocus(@NotNull final EditText editText, final int i) {
        Intrinsics.checkNotNullParameter(editText, "");
        if (editText.requestFocus()) {
            tryShowSoftInput$default(editText, 0, 1, null);
            return;
        }
        if (i > 0) {
            pUU.KWHzl("EditText", "retry requestFocus: " + editText);
            editText.post(new Runnable() { // from class: com.okinc.web3.security.view.EditTextsKt$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    EditTextsKt.tryRequestFocus$lambda$3(editText, i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryRequestFocus$lambda$3(EditText editText, int i) {
        tryRequestFocus(editText, i - 1);
    }

    public static /* synthetic */ void tryRequestFocusWithoutNotifying$default(EditText editText, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        tryRequestFocusWithoutNotifying(editText, i);
    }

    public static final void tryRequestFocusWithoutNotifying(@NotNull final EditText editText, final int i) {
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
            editText.post(new Runnable() { // from class: com.okinc.web3.security.view.EditTextsKt$$ExternalSyntheticLambda2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    EditTextsKt.tryRequestFocusWithoutNotifying$lambda$6(editText, i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryRequestFocusWithoutNotifying$lambda$6(EditText editText, int i) {
        tryRequestFocusWithoutNotifying(editText, i - 1);
    }

    public static /* synthetic */ void tryShowSoftInput$default(EditText editText, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        tryShowSoftInput(editText, i);
    }

    private static final void tryShowSoftInput(final EditText editText, final int i) {
        Context context = editText.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(context, InputMethodManager.class);
        if (inputMethodManager == null || inputMethodManager.showSoftInput(editText, 0) || i <= 0) {
            return;
        }
        pUU.KWHzl("EditText", "retry showSoftInput: " + editText);
        editText.post(new Runnable() { // from class: com.okinc.web3.security.view.EditTextsKt$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                EditTextsKt.tryShowSoftInput$lambda$7(editText, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryShowSoftInput$lambda$7(EditText editText, int i) {
        tryShowSoftInput(editText, i - 1);
    }

    public static final void updateText(@NotNull EditText editText, @NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(editText, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        TextChangeListenerWatcher textChangedListenerWatcher = getTextChangedListenerWatcher(editText);
        if (textChangedListenerWatcher != null) {
            editText.removeTextChangedListener(textChangedListenerWatcher);
        } else {
            textChangedListenerWatcher = null;
        }
        Editable editableText = editText.getEditableText();
        if (!Intrinsics.EZpvd(editableText, charSequence)) {
            if (editableText == null) {
                editText.setText(charSequence);
            } else {
                editableText.replace(0, editableText.length(), charSequence);
            }
            IntRange selection = getSelection(charSequence);
            if (!Intrinsics.EZpvd(selection, NO_SELECTION)) {
                editText.setSelection(selection.KWHzl(), selection.copydefault());
            }
        }
        if (textChangedListenerWatcher != null) {
            editText.addTextChangedListener(textChangedListenerWatcher);
        }
    }
}
