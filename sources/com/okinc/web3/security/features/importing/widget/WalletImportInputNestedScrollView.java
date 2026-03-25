package com.okinc.web3.security.features.importing.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import com.okinc.web3.security.features.importing.model.WalletImportInputState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WalletImportInputNestedScrollView extends NestedScrollView {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "WalletImportInputNestedScrollView";

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.features.importing.widget.WalletImportInputNestedScrollView.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletImportInputNestedScrollView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletImportInputNestedScrollView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletImportInputNestedScrollView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        while (true) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == null || viewFindFocus == this) {
                return;
            }
            if (!isDescendant(viewFindFocus)) {
                pUU.copydefault(TAG, viewFindFocus + " is not a descendant, clearing its focus and retry");
                viewFindFocus.clearFocus();
            } else {
                super.onSizeChanged(i, i2, i3, i4);
                return;
            }
        }
    }

    private final boolean isDescendant(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this) {
            parent = parent.getParent();
        }
        return parent == this;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View viewFindNextFocusFromRect;
        WalletImportInputState.SeedPhraseState.WordState word;
        int i2 = i != 1 ? i != 2 ? i : 130 : 33;
        if (rect == null) {
            viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i2);
        } else {
            viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        }
        if (viewFindNextFocusFromRect == null) {
            return false;
        }
        SeedPhraseWordEditText seedPhraseWordEditText = viewFindNextFocusFromRect instanceof SeedPhraseWordEditText ? (SeedPhraseWordEditText) viewFindNextFocusFromRect : null;
        ViewParent parent = seedPhraseWordEditText != null ? seedPhraseWordEditText.getParent() : null;
        SeedPhraseWordInputLayout seedPhraseWordInputLayout = parent instanceof SeedPhraseWordInputLayout ? (SeedPhraseWordInputLayout) parent : null;
        if (seedPhraseWordInputLayout == null || (word = seedPhraseWordInputLayout.getWord()) == null) {
            return super.onRequestFocusInDescendants(i, rect);
        }
        if (word.getIndex() != word.getSelectedIndex()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }
}
