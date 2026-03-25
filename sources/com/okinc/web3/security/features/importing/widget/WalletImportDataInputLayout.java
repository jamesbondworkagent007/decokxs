package com.okinc.web3.security.features.importing.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.okinc.web3.security.databinding.LayoutWalletImportDataInputBinding;
import com.okinc.web3.security.features.importing.adapter.SeedPhraseWordAdapter;
import com.okinc.web3.security.features.importing.model.WalletImportInputState;
import com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout;
import com.okinc.web3.security.view.EditTextsKt;
import com.okinc.web3.security.view.TextChangedListener;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.C33570myu;
import o.C55298xhM;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WalletImportDataInputLayout extends ConstraintLayout {
    private static final String TAG = "WalletImportDataInputLayout";
    private final LayoutWalletImportDataInputBinding binding;
    private SeedPhraseWordInputLayout.OnWordBackspaceDownListener onWordBackspaceDownListener;
    private SeedPhraseWordInputLayout.OnWordEditorActionListener onWordEditorActionListener;
    private SeedPhraseWordInputLayout.OnWordFocusGainedListener onWordFocusGainedListener;
    private SeedPhraseWordInputLayout.OnWordTextChangedListener onWordTextChangedListener;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnWordBackspaceDownListener(SeedPhraseWordInputLayout.OnWordBackspaceDownListener onWordBackspaceDownListener) {
        this.onWordBackspaceDownListener = onWordBackspaceDownListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnWordEditorActionListener(SeedPhraseWordInputLayout.OnWordEditorActionListener onWordEditorActionListener) {
        this.onWordEditorActionListener = onWordEditorActionListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnWordFocusGainedListener(SeedPhraseWordInputLayout.OnWordFocusGainedListener onWordFocusGainedListener) {
        this.onWordFocusGainedListener = onWordFocusGainedListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnWordTextChangedListener(SeedPhraseWordInputLayout.OnWordTextChangedListener onWordTextChangedListener) {
        this.onWordTextChangedListener = onWordTextChangedListener;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletImportDataInputLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        LayoutWalletImportDataInputBinding layoutWalletImportDataInputBindingInflate = LayoutWalletImportDataInputBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(layoutWalletImportDataInputBindingInflate, "");
        this.binding = layoutWalletImportDataInputBindingInflate;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setMinHeight(C55298xhM.OLrzqt(72, context2));
        layoutWalletImportDataInputBindingInflate.wordList.setLayoutManager(new FlexboxLayoutManager(getContext()) { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout.1
            @Override // com.google.android.flexbox.FlexboxLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollHorizontally() {
                return false;
            }
        });
        RecyclerView recyclerView = layoutWalletImportDataInputBindingInflate.wordList;
        Executor mainExecutor = ContextCompat.getMainExecutor(getContext());
        Intrinsics.checkNotNullExpressionValue(mainExecutor, "");
        recyclerView.setAdapter(new SeedPhraseWordAdapter(mainExecutor, new SeedPhraseWordInputLayout.OnWordFocusGainedListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout.OnWordFocusGainedListener
            public final void onFocusGained(int i) {
                WalletImportDataInputLayout._init_$lambda$0(this.f$0, i);
            }
        }, new SeedPhraseWordInputLayout.OnWordBackspaceDownListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout.OnWordBackspaceDownListener
            public final boolean onBackspaceDown(int i, CharSequence charSequence) {
                return WalletImportDataInputLayout._init_$lambda$1(this.f$0, i, charSequence);
            }
        }, new SeedPhraseWordInputLayout.OnWordTextChangedListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout.OnWordTextChangedListener
            public final void onWordTextChanged(int i, CharSequence charSequence, CharSequence charSequence2) {
                WalletImportDataInputLayout._init_$lambda$2(this.f$0, i, charSequence, charSequence2);
            }
        }, new SeedPhraseWordInputLayout.OnWordEditorActionListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout.OnWordEditorActionListener
            public final boolean onEditorAction(int i, int i2, KeyEvent keyEvent) {
                return WalletImportDataInputLayout._init_$lambda$3(this.f$0, i, i2, keyEvent);
            }
        }));
        RecyclerView recyclerView2 = layoutWalletImportDataInputBindingInflate.wordList;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        recyclerView2.setItemAnimator(defaultItemAnimator);
        layoutWalletImportDataInputBindingInflate.wordList.addOnChildAttachStateChangeListener(new RecyclerView.OnChildAttachStateChangeListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout.7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewAttachedToWindow(View view) {
                Intrinsics.checkNotNullParameter(view, "");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewDetachedFromWindow(View view) {
                Intrinsics.checkNotNullParameter(view, "");
                pUU.KWHzl(WalletImportDataInputLayout.TAG, "onChildViewDetachedFromWindow: " + view);
            }
        });
        layoutWalletImportDataInputBindingInflate.wordList.setPreserveFocusAfterLayout(false);
        layoutWalletImportDataInputBindingInflate.privateKey.setSaveEnabled(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletImportDataInputLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        LayoutWalletImportDataInputBinding layoutWalletImportDataInputBindingInflate = LayoutWalletImportDataInputBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(layoutWalletImportDataInputBindingInflate, "");
        this.binding = layoutWalletImportDataInputBindingInflate;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setMinHeight(C55298xhM.OLrzqt(72, context2));
        layoutWalletImportDataInputBindingInflate.wordList.setLayoutManager(new FlexboxLayoutManager(getContext()) { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout.1
            @Override // com.google.android.flexbox.FlexboxLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollHorizontally() {
                return false;
            }
        });
        RecyclerView recyclerView = layoutWalletImportDataInputBindingInflate.wordList;
        Executor mainExecutor = ContextCompat.getMainExecutor(getContext());
        Intrinsics.checkNotNullExpressionValue(mainExecutor, "");
        recyclerView.setAdapter(new SeedPhraseWordAdapter(mainExecutor, new SeedPhraseWordInputLayout.OnWordFocusGainedListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout.OnWordFocusGainedListener
            public final void onFocusGained(int i) {
                WalletImportDataInputLayout._init_$lambda$0(this.f$0, i);
            }
        }, new SeedPhraseWordInputLayout.OnWordBackspaceDownListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout.OnWordBackspaceDownListener
            public final boolean onBackspaceDown(int i, CharSequence charSequence) {
                return WalletImportDataInputLayout._init_$lambda$1(this.f$0, i, charSequence);
            }
        }, new SeedPhraseWordInputLayout.OnWordTextChangedListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout.OnWordTextChangedListener
            public final void onWordTextChanged(int i, CharSequence charSequence, CharSequence charSequence2) {
                WalletImportDataInputLayout._init_$lambda$2(this.f$0, i, charSequence, charSequence2);
            }
        }, new SeedPhraseWordInputLayout.OnWordEditorActionListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout.OnWordEditorActionListener
            public final boolean onEditorAction(int i, int i2, KeyEvent keyEvent) {
                return WalletImportDataInputLayout._init_$lambda$3(this.f$0, i, i2, keyEvent);
            }
        }));
        RecyclerView recyclerView2 = layoutWalletImportDataInputBindingInflate.wordList;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        recyclerView2.setItemAnimator(defaultItemAnimator);
        layoutWalletImportDataInputBindingInflate.wordList.addOnChildAttachStateChangeListener(new RecyclerView.OnChildAttachStateChangeListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout.7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewAttachedToWindow(View view) {
                Intrinsics.checkNotNullParameter(view, "");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewDetachedFromWindow(View view) {
                Intrinsics.checkNotNullParameter(view, "");
                pUU.KWHzl(WalletImportDataInputLayout.TAG, "onChildViewDetachedFromWindow: " + view);
            }
        });
        layoutWalletImportDataInputBindingInflate.wordList.setPreserveFocusAfterLayout(false);
        layoutWalletImportDataInputBindingInflate.privateKey.setSaveEnabled(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletImportDataInputLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        LayoutWalletImportDataInputBinding layoutWalletImportDataInputBindingInflate = LayoutWalletImportDataInputBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(layoutWalletImportDataInputBindingInflate, "");
        this.binding = layoutWalletImportDataInputBindingInflate;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setMinHeight(C55298xhM.OLrzqt(72, context2));
        layoutWalletImportDataInputBindingInflate.wordList.setLayoutManager(new FlexboxLayoutManager(getContext()) { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout.1
            @Override // com.google.android.flexbox.FlexboxLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollHorizontally() {
                return false;
            }
        });
        RecyclerView recyclerView = layoutWalletImportDataInputBindingInflate.wordList;
        Executor mainExecutor = ContextCompat.getMainExecutor(getContext());
        Intrinsics.checkNotNullExpressionValue(mainExecutor, "");
        recyclerView.setAdapter(new SeedPhraseWordAdapter(mainExecutor, new SeedPhraseWordInputLayout.OnWordFocusGainedListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout.OnWordFocusGainedListener
            public final void onFocusGained(int i2) {
                WalletImportDataInputLayout._init_$lambda$0(this.f$0, i2);
            }
        }, new SeedPhraseWordInputLayout.OnWordBackspaceDownListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout.OnWordBackspaceDownListener
            public final boolean onBackspaceDown(int i2, CharSequence charSequence) {
                return WalletImportDataInputLayout._init_$lambda$1(this.f$0, i2, charSequence);
            }
        }, new SeedPhraseWordInputLayout.OnWordTextChangedListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout.OnWordTextChangedListener
            public final void onWordTextChanged(int i2, CharSequence charSequence, CharSequence charSequence2) {
                WalletImportDataInputLayout._init_$lambda$2(this.f$0, i2, charSequence, charSequence2);
            }
        }, new SeedPhraseWordInputLayout.OnWordEditorActionListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout.OnWordEditorActionListener
            public final boolean onEditorAction(int i2, int i22, KeyEvent keyEvent) {
                return WalletImportDataInputLayout._init_$lambda$3(this.f$0, i2, i22, keyEvent);
            }
        }));
        RecyclerView recyclerView2 = layoutWalletImportDataInputBindingInflate.wordList;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        recyclerView2.setItemAnimator(defaultItemAnimator);
        layoutWalletImportDataInputBindingInflate.wordList.addOnChildAttachStateChangeListener(new RecyclerView.OnChildAttachStateChangeListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout.7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewAttachedToWindow(View view) {
                Intrinsics.checkNotNullParameter(view, "");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewDetachedFromWindow(View view) {
                Intrinsics.checkNotNullParameter(view, "");
                pUU.KWHzl(WalletImportDataInputLayout.TAG, "onChildViewDetachedFromWindow: " + view);
            }
        });
        layoutWalletImportDataInputBindingInflate.wordList.setPreserveFocusAfterLayout(false);
        layoutWalletImportDataInputBindingInflate.privateKey.setSaveEnabled(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletImportDataInputLayout(@NotNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        LayoutWalletImportDataInputBinding layoutWalletImportDataInputBindingInflate = LayoutWalletImportDataInputBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(layoutWalletImportDataInputBindingInflate, "");
        this.binding = layoutWalletImportDataInputBindingInflate;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setMinHeight(C55298xhM.OLrzqt(72, context2));
        layoutWalletImportDataInputBindingInflate.wordList.setLayoutManager(new FlexboxLayoutManager(getContext()) { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout.1
            @Override // com.google.android.flexbox.FlexboxLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollHorizontally() {
                return false;
            }
        });
        RecyclerView recyclerView = layoutWalletImportDataInputBindingInflate.wordList;
        Executor mainExecutor = ContextCompat.getMainExecutor(getContext());
        Intrinsics.checkNotNullExpressionValue(mainExecutor, "");
        recyclerView.setAdapter(new SeedPhraseWordAdapter(mainExecutor, new SeedPhraseWordInputLayout.OnWordFocusGainedListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout.OnWordFocusGainedListener
            public final void onFocusGained(int i22) {
                WalletImportDataInputLayout._init_$lambda$0(this.f$0, i22);
            }
        }, new SeedPhraseWordInputLayout.OnWordBackspaceDownListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout.OnWordBackspaceDownListener
            public final boolean onBackspaceDown(int i22, CharSequence charSequence) {
                return WalletImportDataInputLayout._init_$lambda$1(this.f$0, i22, charSequence);
            }
        }, new SeedPhraseWordInputLayout.OnWordTextChangedListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout.OnWordTextChangedListener
            public final void onWordTextChanged(int i22, CharSequence charSequence, CharSequence charSequence2) {
                WalletImportDataInputLayout._init_$lambda$2(this.f$0, i22, charSequence, charSequence2);
            }
        }, new SeedPhraseWordInputLayout.OnWordEditorActionListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.web3.security.features.importing.widget.SeedPhraseWordInputLayout.OnWordEditorActionListener
            public final boolean onEditorAction(int i22, int i222, KeyEvent keyEvent) {
                return WalletImportDataInputLayout._init_$lambda$3(this.f$0, i22, i222, keyEvent);
            }
        }));
        RecyclerView recyclerView2 = layoutWalletImportDataInputBindingInflate.wordList;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        recyclerView2.setItemAnimator(defaultItemAnimator);
        layoutWalletImportDataInputBindingInflate.wordList.addOnChildAttachStateChangeListener(new RecyclerView.OnChildAttachStateChangeListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout.7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewAttachedToWindow(View view) {
                Intrinsics.checkNotNullParameter(view, "");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
            public void onChildViewDetachedFromWindow(View view) {
                Intrinsics.checkNotNullParameter(view, "");
                pUU.KWHzl(WalletImportDataInputLayout.TAG, "onChildViewDetachedFromWindow: " + view);
            }
        });
        layoutWalletImportDataInputBindingInflate.wordList.setPreserveFocusAfterLayout(false);
        layoutWalletImportDataInputBindingInflate.privateKey.setSaveEnabled(false);
    }

    public final boolean isWordListInvisible() {
        RecyclerView recyclerView = this.binding.wordList;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        return recyclerView.getVisibility() == 4;
    }

    public final void setWordListInvisible(boolean z) {
        RecyclerView recyclerView = this.binding.wordList;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(z ? 4 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(WalletImportDataInputLayout walletImportDataInputLayout, int i) {
        SeedPhraseWordInputLayout.OnWordFocusGainedListener onWordFocusGainedListener = walletImportDataInputLayout.onWordFocusGainedListener;
        if (onWordFocusGainedListener != null) {
            onWordFocusGainedListener.onFocusGained(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(WalletImportDataInputLayout walletImportDataInputLayout, int i, CharSequence charSequence) {
        SeedPhraseWordInputLayout.OnWordBackspaceDownListener onWordBackspaceDownListener = walletImportDataInputLayout.onWordBackspaceDownListener;
        if (onWordBackspaceDownListener != null) {
            return onWordBackspaceDownListener.onBackspaceDown(i, charSequence);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(WalletImportDataInputLayout walletImportDataInputLayout, int i, CharSequence charSequence, CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        SeedPhraseWordInputLayout.OnWordTextChangedListener onWordTextChangedListener = walletImportDataInputLayout.onWordTextChangedListener;
        if (onWordTextChangedListener != null) {
            onWordTextChangedListener.onWordTextChanged(i, charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$3(WalletImportDataInputLayout walletImportDataInputLayout, int i, int i2, KeyEvent keyEvent) {
        SeedPhraseWordInputLayout.OnWordEditorActionListener onWordEditorActionListener = walletImportDataInputLayout.onWordEditorActionListener;
        if (onWordEditorActionListener != null) {
            return onWordEditorActionListener.onEditorAction(i, i2, keyEvent);
        }
        return false;
    }

    public final void setOnPrivateKeyTextChangedListener(final TextChangedListener textChangedListener) {
        if (textChangedListener == null) {
            DisableAutofillEditText disableAutofillEditText = this.binding.privateKey;
            Intrinsics.checkNotNullExpressionValue(disableAutofillEditText, "");
            EditTextsKt.setTextChangedListener(disableAutofillEditText, null);
        } else {
            DisableAutofillEditText disableAutofillEditText2 = this.binding.privateKey;
            Intrinsics.checkNotNullExpressionValue(disableAutofillEditText2, "");
            EditTextsKt.setTextChangedListener(disableAutofillEditText2, new TextChangedListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$$ExternalSyntheticLambda4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.okinc.web3.security.view.TextChangedListener
                public final void onTextChanged(CharSequence charSequence, CharSequence charSequence2) {
                    WalletImportDataInputLayout.setOnPrivateKeyTextChangedListener$lambda$5(this.f$0, textChangedListener, charSequence, charSequence2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnPrivateKeyTextChangedListener$lambda$5(WalletImportDataInputLayout walletImportDataInputLayout, TextChangedListener textChangedListener, CharSequence charSequence, CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        DisableAutofillEditText disableAutofillEditText = walletImportDataInputLayout.binding.privateKey;
        Intrinsics.checkNotNullExpressionValue(disableAutofillEditText, "");
        EditTextsKt.updateText(disableAutofillEditText, charSequence);
        textChangedListener.onTextChanged(charSequence, charSequence2);
    }

    public final void updatePrivateKey(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        DisableAutofillEditText disableAutofillEditText = this.binding.privateKey;
        Intrinsics.checkNotNullExpressionValue(disableAutofillEditText, "");
        EditTextsKt.updateText(disableAutofillEditText, str);
        if (i != -1) {
            this.binding.privateKey.setSelection(i);
        }
    }

    public final void showKeyboardForPrivateKey() {
        DisableAutofillEditText disableAutofillEditText = this.binding.privateKey;
        Intrinsics.checkNotNullExpressionValue(disableAutofillEditText, "");
        if (disableAutofillEditText.getVisibility() == 0) {
            C33570myu.AEQbTJ(this.binding.privateKey.getContext(), (EditText) this.binding.privateKey);
            return;
        }
        DisableAutofillEditText disableAutofillEditText2 = this.binding.privateKey;
        Intrinsics.checkNotNullExpressionValue(disableAutofillEditText2, "");
        disableAutofillEditText2.setVisibility(0);
        this.binding.privateKey.setAlpha(0.0f);
        DisableAutofillEditText disableAutofillEditText3 = this.binding.privateKey;
        Intrinsics.checkNotNullExpressionValue(disableAutofillEditText3, "");
        EditTextsKt.tryRequestFocus$default(disableAutofillEditText3, 0, 1, null);
    }

    public final void hidePrivateKey() {
        DisableAutofillEditText disableAutofillEditText = this.binding.privateKey;
        Intrinsics.checkNotNullExpressionValue(disableAutofillEditText, "");
        disableAutofillEditText.setVisibility(8);
    }

    public final void makePrivateKeyFullyVisible() {
        DisableAutofillEditText disableAutofillEditText = this.binding.privateKey;
        Intrinsics.checkNotNullExpressionValue(disableAutofillEditText, "");
        disableAutofillEditText.setVisibility(0);
        this.binding.privateKey.setAlpha(1.0f);
    }

    public final void setPrivateKeyHint(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.binding.privateKey.setHint(str);
    }

    public final Object awaitItemAnimatorFinished(final boolean z, @NotNull Continuation<? super Unit> continuation) {
        final RecyclerView.ItemAnimator itemAnimator = this.binding.wordList.getItemAnimator();
        if (itemAnimator == null) {
            return Unit.INSTANCE;
        }
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final Runnable runnable = new Runnable() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$awaitItemAnimatorFinished$2$resumeRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                if (cancellableContinuationImpl.isActive()) {
                    CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                    Result.Application application = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
                }
            }
        };
        final Runnable runnable2 = new Runnable() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$awaitItemAnimatorFinished$2$checkRunningRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                if (itemAnimator.isRunning()) {
                    RecyclerView.ItemAnimator itemAnimator2 = itemAnimator;
                    final WalletImportDataInputLayout walletImportDataInputLayout = this;
                    final Runnable runnable3 = runnable;
                    itemAnimator2.isRunning(new RecyclerView.ItemAnimator.ItemAnimatorFinishedListener() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$awaitItemAnimatorFinished$2$checkRunningRunnable$1.1
                        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener
                        public final void onAnimationsFinished() {
                            walletImportDataInputLayout.post(runnable3);
                        }
                    });
                    return;
                }
                if (cancellableContinuationImpl.isActive()) {
                    CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                    Result.Application application = Result.Companion;
                    cancellableContinuation.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
                }
            }
        };
        post(runnable2);
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$awaitItemAnimatorFinished$2$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (z) {
                    itemAnimator.endAnimations();
                }
                this.removeCallbacks(runnable2);
                this.removeCallbacks(runnable);
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result == C56442yFn.copydefault() ? result : Unit.INSTANCE;
    }

    public final Object submitWordList(@NotNull List<WalletImportInputState.SeedPhraseState.WordState> list, @NotNull Continuation<? super Unit> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        RecyclerView.Adapter adapter = this.binding.wordList.getAdapter();
        SeedPhraseWordAdapter seedPhraseWordAdapter = adapter instanceof SeedPhraseWordAdapter ? (SeedPhraseWordAdapter) adapter : null;
        if (seedPhraseWordAdapter != null) {
            seedPhraseWordAdapter.submitList(list, new Runnable() { // from class: com.okinc.web3.security.features.importing.widget.WalletImportDataInputLayout$submitWordList$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    if (cancellableContinuationImpl.isActive()) {
                        CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl;
                        Result.Application application = Result.Companion;
                        cancellableContinuation.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
                    }
                }
            });
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result == C56442yFn.copydefault() ? result : Unit.INSTANCE;
    }
}
