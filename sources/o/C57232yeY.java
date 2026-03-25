package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import o.C57227yeT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yeY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C57232yeY extends DiffUtil.ItemCallback<C57227yeT.TaskDescription> {
    public static final C57232yeY copydefault = new C57232yeY();

    private C57232yeY() {
    }

    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull C57227yeT.TaskDescription taskDescription, @NotNull C57227yeT.TaskDescription taskDescription2) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(taskDescription2, "");
        return taskDescription.KWHzl() == taskDescription2.KWHzl();
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull C57227yeT.TaskDescription taskDescription, @NotNull C57227yeT.TaskDescription taskDescription2) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(taskDescription2, "");
        return Intrinsics.EZpvd(taskDescription, taskDescription2);
    }
}
