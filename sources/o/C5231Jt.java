package o;

import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import com.amplitude.android.internal.ViewTarget;
import com.amplitude.common.Logger;
import java.util.ArrayDeque;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Jt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5231Jt implements InterfaceC5234Jw {
    public final Logger KWHzl;
    public volatile C5230Js copydefault;

    public C5231Jt(@NotNull Logger logger) {
        this.KWHzl = logger;
    }

    @Override // o.InterfaceC5234Jw
    public ViewTarget copydefault(@NotNull java.lang.Object obj, @NotNull kotlin.Pair<java.lang.Float, java.lang.Float> pair, @NotNull ViewTarget.Type type) {
        if (this.copydefault == null) {
            synchronized (this) {
                if (this.copydefault == null) {
                    this.copydefault = new C5230Js(this.KWHzl);
                }
            }
        }
        if (!(obj instanceof Owner)) {
            return null;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(((Owner) obj).getRoot());
        java.lang.String str = null;
        java.lang.String str2 = null;
        while (!arrayDeque.isEmpty()) {
            LayoutNode layoutNode = (LayoutNode) arrayDeque.poll();
            if (layoutNode != null) {
                if (layoutNode.isPlaced() && EZpvd(this.copydefault, layoutNode, pair.component1().floatValue(), pair.component2().floatValue())) {
                    boolean z = false;
                    for (ModifierInfo modifierInfo : layoutNode.getModifierInfo()) {
                        if (modifierInfo.getModifier() instanceof SemanticsModifier) {
                            for (Map.Entry<? extends SemanticsPropertyKey<?>, ? extends java.lang.Object> entry : ((SemanticsModifier) modifierInfo.getModifier()).getSemanticsConfiguration()) {
                                java.lang.String name = entry.getKey().getName();
                                if ("OnClick".equals(name)) {
                                    z = true;
                                } else if ("TestTag".equals(name) && (entry.getValue() instanceof java.lang.String)) {
                                    str = (java.lang.String) entry.getValue();
                                }
                            }
                        } else {
                            java.lang.String canonicalName = modifierInfo.getModifier().getClass().getCanonicalName();
                            if ("androidx.compose.foundation.ClickableElement".equals(canonicalName) || "androidx.compose.foundation.CombinedClickableElement".equals(canonicalName)) {
                                z = true;
                            }
                        }
                    }
                    if (z && type == ViewTarget.Type.Clickable) {
                        str2 = str;
                    }
                }
                arrayDeque.addAll(layoutNode.getZSortedChildren().asMutableList());
            }
        }
        if (str2 == null) {
            return null;
        }
        return new ViewTarget(null, null, null, str2, null, "jetpack_compose", null);
    }

    public static boolean EZpvd(@NotNull C5230Js c5230Js, @NotNull LayoutNode layoutNode, float f, float f2) {
        androidx.compose.ui.geometry.Rect rectCopydefault = c5230Js.copydefault(layoutNode);
        return rectCopydefault != null && f >= rectCopydefault.getLeft() && f <= rectCopydefault.getRight() && f2 >= rectCopydefault.getTop() && f2 <= rectCopydefault.getBottom();
    }
}
