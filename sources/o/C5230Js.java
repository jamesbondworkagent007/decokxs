package o;

import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import com.amplitude.common.Logger;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Js, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C5230Js {
    public final Logger KWHzl;
    public java.lang.reflect.Field OLrzqt;

    public C5230Js(@NotNull Logger logger) {
        this.OLrzqt = null;
        this.KWHzl = logger;
        try {
            java.lang.reflect.Field declaredField = java.lang.Class.forName("androidx.compose.ui.node.LayoutNode").getDeclaredField("layoutDelegate");
            this.OLrzqt = declaredField;
            declaredField.setAccessible(true);
        } catch (java.lang.Exception unused) {
            logger.AEQbTJ("Could not find LayoutNode.layoutDelegate field");
        }
    }

    public androidx.compose.ui.geometry.Rect copydefault(@NotNull LayoutNode layoutNode) {
        java.lang.reflect.Field field = this.OLrzqt;
        if (field == null) {
            return null;
        }
        try {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = (LayoutNodeLayoutDelegate) field.get(layoutNode);
            if (layoutNodeLayoutDelegate == null) {
                return null;
            }
            return LayoutCoordinatesKt.boundsInWindow(layoutNodeLayoutDelegate.getOuterCoordinator().getCoordinates());
        } catch (java.lang.Exception unused) {
            this.KWHzl.KWHzl("Could not fetch position for LayoutNode");
            return null;
        }
    }
}
