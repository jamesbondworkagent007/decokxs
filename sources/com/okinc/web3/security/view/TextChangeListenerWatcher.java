package com.okinc.web3.security.view;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
final class TextChangeListenerWatcher implements TextWatcher {
    private TextChangedListener listener;
    private CharSequence oldText;

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TextChangedListener getListener() {
        return this.listener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setListener(@NotNull TextChangedListener textChangedListener) {
        Intrinsics.checkNotNullParameter(textChangedListener, "");
        this.listener = textChangedListener;
    }

    public TextChangeListenerWatcher(@NotNull CharSequence charSequence, @NotNull TextChangedListener textChangedListener) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(textChangedListener, "");
        this.oldText = charSequence;
        this.listener = textChangedListener;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (Intrinsics.EZpvd((Object) this.oldText.toString(), (Object) charSequence.toString())) {
            return;
        }
        this.listener.onTextChanged(this.oldText, CharSequencesKt.toEditableWithSelection(charSequence));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@NotNull CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.oldText = CharSequencesKt.toEditableWithSelection(charSequence);
    }
}
