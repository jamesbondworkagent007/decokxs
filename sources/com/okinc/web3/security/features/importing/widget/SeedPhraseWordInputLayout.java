package com.okinc.web3.security.features.importing.widget;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.material.timepicker.TimeModel;
import com.okinc.web3.security.databinding.LayoutSeedPhraseWordBinding;
import com.okinc.web3.security.features.importing.model.WalletImportInputState;
import com.okinc.web3.security.features.importing.widget.SeedPhraseWordEditText;
import com.okinc.web3.security.view.EditTextsKt;
import com.okinc.web3.security.view.TextChangedListener;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import o.C33570myu;
import o.C55298xhM;
import o.C56548yJl;
import o.C57407yho;
import o.yDT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class SeedPhraseWordInputLayout extends FrameLayout {
    public static final int $stable = 8;
    private final LayoutSeedPhraseWordBinding binding;
    private OnWordFocusGainedListener onWordFocusGainedListener;

    public interface OnWordBackspaceDownListener {
        boolean onBackspaceDown(int i, CharSequence charSequence);
    }

    public interface OnWordEditorActionListener {
        boolean onEditorAction(int i, int i2, KeyEvent keyEvent);
    }

    public interface OnWordFocusGainedListener {
        void onFocusGained(int i);
    }

    public interface OnWordTextChangedListener {
        void onWordTextChanged(int i, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeedPhraseWordInputLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        LayoutSeedPhraseWordBinding layoutSeedPhraseWordBindingInflate = LayoutSeedPhraseWordBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(layoutSeedPhraseWordBindingInflate, "");
        this.binding = layoutSeedPhraseWordBindingInflate;
        setClipToPadding(false);
        layoutSeedPhraseWordBindingInflate.word.setSaveEnabled(false);
        SeedPhraseWordEditText seedPhraseWordEditText = layoutSeedPhraseWordBindingInflate.word;
        InputFilter[] filters = seedPhraseWordEditText.getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "");
        seedPhraseWordEditText.setFilters((InputFilter[]) yDT.EZpvd((LowercaseFilter[]) filters, new LowercaseFilter()));
        layoutSeedPhraseWordBindingInflate.index.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                SeedPhraseWordInputLayout._init_$lambda$0(this.f$0, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeedPhraseWordInputLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        LayoutSeedPhraseWordBinding layoutSeedPhraseWordBindingInflate = LayoutSeedPhraseWordBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(layoutSeedPhraseWordBindingInflate, "");
        this.binding = layoutSeedPhraseWordBindingInflate;
        setClipToPadding(false);
        layoutSeedPhraseWordBindingInflate.word.setSaveEnabled(false);
        SeedPhraseWordEditText seedPhraseWordEditText = layoutSeedPhraseWordBindingInflate.word;
        InputFilter[] filters = seedPhraseWordEditText.getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "");
        seedPhraseWordEditText.setFilters((InputFilter[]) yDT.EZpvd((LowercaseFilter[]) filters, new LowercaseFilter()));
        layoutSeedPhraseWordBindingInflate.index.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                SeedPhraseWordInputLayout._init_$lambda$0(this.f$0, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeedPhraseWordInputLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        LayoutSeedPhraseWordBinding layoutSeedPhraseWordBindingInflate = LayoutSeedPhraseWordBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(layoutSeedPhraseWordBindingInflate, "");
        this.binding = layoutSeedPhraseWordBindingInflate;
        setClipToPadding(false);
        layoutSeedPhraseWordBindingInflate.word.setSaveEnabled(false);
        SeedPhraseWordEditText seedPhraseWordEditText = layoutSeedPhraseWordBindingInflate.word;
        InputFilter[] filters = seedPhraseWordEditText.getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "");
        seedPhraseWordEditText.setFilters((InputFilter[]) yDT.EZpvd((LowercaseFilter[]) filters, new LowercaseFilter()));
        layoutSeedPhraseWordBindingInflate.index.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i22, int i3, int i4, int i5, int i6, int i7, int i8) {
                SeedPhraseWordInputLayout._init_$lambda$0(this.f$0, view, i2, i22, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    private final int getIndex() {
        WalletImportInputState.SeedPhraseState.WordState word = getWord();
        if (word != null) {
            return word.getIndex();
        }
        return -1;
    }

    public final WalletImportInputState.SeedPhraseState.WordState getWord() {
        Object tag = getTag(C57407yho.Application.dHguZz);
        if (tag instanceof WalletImportInputState.SeedPhraseState.WordState) {
            return (WalletImportInputState.SeedPhraseState.WordState) tag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SeedPhraseWordInputLayout seedPhraseWordInputLayout, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Context context = view.getContext();
        SeedPhraseWordEditText seedPhraseWordEditText = seedPhraseWordInputLayout.binding.word;
        Intrinsics.checkNotNullExpressionValue(seedPhraseWordEditText, "");
        Intrinsics.copydefault(context);
        int iOLrzqt = C55298xhM.OLrzqt(10, context);
        seedPhraseWordEditText.setPaddingRelative(((iOLrzqt + i3) - i) + C55298xhM.OLrzqt(8, context), seedPhraseWordEditText.getPaddingTop(), seedPhraseWordEditText.getPaddingEnd(), seedPhraseWordEditText.getPaddingBottom());
    }

    public final void setWord(@NotNull WalletImportInputState.SeedPhraseState.WordState wordState) {
        Intrinsics.checkNotNullParameter(wordState, "");
        setTag(C57407yho.Application.dHguZz, wordState);
        TextView textView = this.binding.index;
        String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(wordState.getIndex() + 1)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        textView.setText(str);
        SeedPhraseWordEditText seedPhraseWordEditText = this.binding.word;
        Intrinsics.checkNotNullExpressionValue(seedPhraseWordEditText, "");
        EditTextsKt.updateText(seedPhraseWordEditText, wordState.getText());
        if (wordState.getSelection() != -1) {
            this.binding.word.setSelection(C56548yJl.valueOf(wordState.getSelection(), this.binding.word.length()));
        }
        this.binding.word.setTextColor(ContextCompat.getColor(getContext(), wordState.getTextColor()));
        setBackgroundResource(wordState.getBackground());
        setSelectedState(wordState.getIndex(), wordState.getSelectedIndex());
    }

    private final void setSelectedState(int i, int i2) {
        if (i2 == -1) {
            this.binding.word.clearFocus();
            C33570myu.AEQbTJ(this.binding.word.getContext(), (View) this.binding.word);
        } else {
            if (i != i2) {
                return;
            }
            bringToFront();
            this.binding.word.setCursorVisible(true);
            try {
                SeedPhraseWordEditText seedPhraseWordEditText = this.binding.word;
                Intrinsics.checkNotNullExpressionValue(seedPhraseWordEditText, "");
                EditTextsKt.tryRequestFocusWithoutNotifying$default(seedPhraseWordEditText, 0, 1, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void setOnWordTextChangedListener(final OnWordTextChangedListener onWordTextChangedListener) {
        if (onWordTextChangedListener == null) {
            SeedPhraseWordEditText seedPhraseWordEditText = this.binding.word;
            Intrinsics.checkNotNullExpressionValue(seedPhraseWordEditText, "");
            EditTextsKt.setTextChangedListener(seedPhraseWordEditText, null);
        } else {
            SeedPhraseWordEditText seedPhraseWordEditText2 = this.binding.word;
            Intrinsics.checkNotNullExpressionValue(seedPhraseWordEditText2, "");
            EditTextsKt.setTextChangedListener(seedPhraseWordEditText2, new TextChangedListener() { // from class: com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.okinc.web3.security.view.TextChangedListener
                public final void onTextChanged(CharSequence charSequence, CharSequence charSequence2) {
                    SeedPhraseWordInputLayout.setOnWordTextChangedListener$lambda$1(this.f$0, onWordTextChangedListener, charSequence, charSequence2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnWordTextChangedListener$lambda$1(SeedPhraseWordInputLayout seedPhraseWordInputLayout, OnWordTextChangedListener onWordTextChangedListener, CharSequence charSequence, CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        SeedPhraseWordEditText seedPhraseWordEditText = seedPhraseWordInputLayout.binding.word;
        Intrinsics.checkNotNullExpressionValue(seedPhraseWordEditText, "");
        EditTextsKt.updateText(seedPhraseWordEditText, charSequence);
        onWordTextChangedListener.onWordTextChanged(seedPhraseWordInputLayout.getIndex(), charSequence, charSequence2);
    }

    public final void setOnWordKeyListener(final OnWordBackspaceDownListener onWordBackspaceDownListener) {
        if (onWordBackspaceDownListener == null) {
            this.binding.word.setOnBackspaceDownListener(null);
        } else {
            this.binding.word.setOnBackspaceDownListener(new SeedPhraseWordEditText.OnBackspaceDownListener() { // from class: com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout$$ExternalSyntheticLambda3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.okinc.web3.security.features.importing.widget.SeedPhraseWordEditText.OnBackspaceDownListener
                public final void onBackspaceDown() {
                    SeedPhraseWordInputLayout.setOnWordKeyListener$lambda$2(onWordBackspaceDownListener, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnWordKeyListener$lambda$2(OnWordBackspaceDownListener onWordBackspaceDownListener, SeedPhraseWordInputLayout seedPhraseWordInputLayout) {
        onWordBackspaceDownListener.onBackspaceDown(seedPhraseWordInputLayout.getIndex(), seedPhraseWordInputLayout.binding.word.getText());
    }

    public final void setOnWordFocusChangeListener(final OnWordFocusGainedListener onWordFocusGainedListener) {
        this.onWordFocusGainedListener = onWordFocusGainedListener;
        if (onWordFocusGainedListener == null) {
            this.binding.word.setOnFocusChangeListener(null);
        } else {
            this.binding.word.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout$$ExternalSyntheticLambda2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    SeedPhraseWordInputLayout.setOnWordFocusChangeListener$lambda$3(onWordFocusGainedListener, this, view, z);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnWordFocusChangeListener$lambda$3(OnWordFocusGainedListener onWordFocusGainedListener, SeedPhraseWordInputLayout seedPhraseWordInputLayout, View view, boolean z) {
        if (z) {
            onWordFocusGainedListener.onFocusGained(seedPhraseWordInputLayout.getIndex());
        }
    }

    public final void setOnWordEditorActionListener(final OnWordEditorActionListener onWordEditorActionListener) {
        if (onWordEditorActionListener == null) {
            this.binding.word.setOnEditorActionListener(null);
        } else {
            this.binding.word.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout$$ExternalSyntheticLambda4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    return SeedPhraseWordInputLayout.setOnWordEditorActionListener$lambda$4(onWordEditorActionListener, this, textView, i, keyEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOnWordEditorActionListener$lambda$4(OnWordEditorActionListener onWordEditorActionListener, SeedPhraseWordInputLayout seedPhraseWordInputLayout, TextView textView, int i, KeyEvent keyEvent) {
        return onWordEditorActionListener.onEditorAction(seedPhraseWordInputLayout.getIndex(), i, keyEvent);
    }
}
