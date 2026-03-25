package o;

import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59098zad;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zaf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59100zaf implements InterfaceC59098zad {
    @Override // o.InterfaceC59098zad
    public java.util.Set<C56935yXu> EZpvd() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59101zag
    public InterfaceC56663yNs EZpvd(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        return null;
    }

    @Override // o.InterfaceC59101zag
    public void OLrzqt(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        InterfaceC59098zad.TaskDescription.KWHzl(this, c56935yXu, yqv);
    }

    @Override // o.InterfaceC59098zad
    public java.util.Collection<? extends InterfaceC56676yOe> copydefault(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        return yDY.AhwBna();
    }

    @Override // o.InterfaceC59098zad, o.InterfaceC59101zag
    public java.util.Collection<? extends InterfaceC56687yOp> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(yqv, "");
        return yDY.AhwBna();
    }

    @Override // o.InterfaceC59101zag
    public java.util.Collection<InterfaceC56665yNu> copydefault(@NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(yzu, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return yDY.AhwBna();
    }

    @Override // o.InterfaceC59098zad
    public java.util.Set<C56935yXu> AEQbTJ() {
        java.util.Collection<InterfaceC56665yNu> collectionCopydefault = copydefault(yZU.valueOf, C59430zgr.copydefault());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (java.lang.Object obj : collectionCopydefault) {
            if (obj instanceof InterfaceC56687yOp) {
                C56935yXu c56935yXuBR_ = ((InterfaceC56687yOp) obj).bR_();
                Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
                linkedHashSet.add(c56935yXuBR_);
            }
        }
        return linkedHashSet;
    }

    @Override // o.InterfaceC59098zad
    public java.util.Set<C56935yXu> bP_() {
        java.util.Collection<InterfaceC56665yNu> collectionCopydefault = copydefault(yZU.getFieldNames, C59430zgr.copydefault());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (java.lang.Object obj : collectionCopydefault) {
            if (obj instanceof InterfaceC56687yOp) {
                C56935yXu c56935yXuBR_ = ((InterfaceC56687yOp) obj).bR_();
                Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
                linkedHashSet.add(c56935yXuBR_);
            }
        }
        return linkedHashSet;
    }
}
