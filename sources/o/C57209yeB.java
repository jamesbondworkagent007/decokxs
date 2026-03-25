package o;

import androidx.core.widget.NestedScrollView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C57227yeT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yeB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57209yeB extends NestedScrollView {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.yeB$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yeB.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57209yeB(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57209yeB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57209yeB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        while (true) {
            android.view.View viewFindFocus = findFocus();
            if (viewFindFocus == null || viewFindFocus == this) {
                return;
            }
            if (!EZpvd(viewFindFocus)) {
                pUU.copydefault("WalletMultiAddressInputNestedScrollView", viewFindFocus + " is not a descendant, clearing its focus and retry");
                viewFindFocus.clearFocus();
            } else {
                super.onSizeChanged(i, i2, i3, i4);
                return;
            }
        }
    }

    public final boolean EZpvd(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        while (parent != null && parent != this) {
            parent = parent.getParent();
        }
        return parent == this;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, android.graphics.Rect rect) {
        android.view.View viewFindNextFocusFromRect;
        C57227yeT.TaskDescription taskDescriptionAEQbTJ;
        int i2 = i != 1 ? i != 2 ? i : 130 : 33;
        if (rect == null) {
            viewFindNextFocusFromRect = android.view.FocusFinder.getInstance().findNextFocus(this, null, i2);
        } else {
            viewFindNextFocusFromRect = android.view.FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        }
        if (viewFindNextFocusFromRect == null) {
            return false;
        }
        C57289yfc c57289yfc = viewFindNextFocusFromRect instanceof C57289yfc ? (C57289yfc) viewFindNextFocusFromRect : null;
        android.view.ViewParent parent = c57289yfc != null ? c57289yfc.getParent() : null;
        C57233yeZ c57233yeZ = parent instanceof C57233yeZ ? (C57233yeZ) parent : null;
        if (c57233yeZ == null || (taskDescriptionAEQbTJ = c57233yeZ.AEQbTJ()) == null) {
            return super.onRequestFocusInDescendants(i, rect);
        }
        if (taskDescriptionAEQbTJ.EZpvd() != taskDescriptionAEQbTJ.valueOf()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }
}
