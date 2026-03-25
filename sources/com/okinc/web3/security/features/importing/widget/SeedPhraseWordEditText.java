package com.okinc.web3.security.features.importing.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.okinc.web3.security.features.importing.widget.SeedPhraseWordEditText;
import kotlin.jvm.internal.Intrinsics;
import o.C55298xhM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class SeedPhraseWordEditText extends DisableAutofillEditText {
    public static final int $stable = 8;
    private OnBackspaceDownListener onBackspaceDownListener;

    /* JADX INFO: loaded from: classes19.dex */
    public interface OnBackspaceDownListener {
        void onBackspaceDown();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnBackspaceDownListener(OnBackspaceDownListener onBackspaceDownListener) {
        this.onBackspaceDownListener = onBackspaceDownListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeedPhraseWordEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeedPhraseWordEditText(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeedPhraseWordEditText(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        setMeasuredDimension(measuredWidth + C55298xhM.OLrzqt(2, context), getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(@NotNull EditorInfo editorInfo) {
        Intrinsics.checkNotNullParameter(editorInfo, "");
        final InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null) {
            return new InputConnectionWrapper(inputConnectionOnCreateInputConnection) { // from class: com.okinc.web3.security.features.importing.widget.SeedPhraseWordEditText$onCreateInputConnection$1$1
                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                public boolean sendKeyEvent(KeyEvent keyEvent) {
                    SeedPhraseWordEditText.OnBackspaceDownListener onBackspaceDownListener;
                    if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67 && (onBackspaceDownListener = this.onBackspaceDownListener) != null) {
                        onBackspaceDownListener.onBackspaceDown();
                    }
                    return super.sendKeyEvent(keyEvent);
                }

                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                public boolean deleteSurroundingText(int i, int i2) {
                    if (i == 1 && i2 == 0) {
                        return sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67));
                    }
                    return super.deleteSurroundingText(i, i2);
                }
            };
        }
        return null;
    }
}
