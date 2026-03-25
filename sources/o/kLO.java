package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import o.kLL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class kLO<T> extends DiffUtil.ItemCallback<kLL<? extends T>> {
    public abstract boolean EZpvd(T t, T t2);

    public java.lang.Object OLrzqt(T t, T t2) {
        return null;
    }

    public abstract boolean copydefault(T t, T t2);

    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.kLO<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull kLL<? extends T> kll, @NotNull kLL<? extends T> kll2) {
        Intrinsics.checkNotNullParameter(kll, "");
        Intrinsics.checkNotNullParameter(kll2, "");
        if ((kll instanceof kLL.Activity) && (kll2 instanceof kLL.Activity)) {
            return EZpvd(((kLL.Activity) kll).AEQbTJ(), ((kLL.Activity) kll2).AEQbTJ());
        }
        return kll.getClass() == kll2.getClass();
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.kLO<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull kLL<? extends T> kll, @NotNull kLL<? extends T> kll2) {
        Intrinsics.checkNotNullParameter(kll, "");
        Intrinsics.checkNotNullParameter(kll2, "");
        if ((kll instanceof kLL.Activity) && (kll2 instanceof kLL.Activity)) {
            return copydefault(((kLL.Activity) kll).AEQbTJ(), ((kLL.Activity) kll2).AEQbTJ());
        }
        return kll.getClass() == kll2.getClass();
    }

    /* JADX DEBUG: Method merged with bridge method: getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.kLO<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Object getChangePayload(@NotNull kLL<? extends T> kll, @NotNull kLL<? extends T> kll2) {
        Intrinsics.checkNotNullParameter(kll, "");
        Intrinsics.checkNotNullParameter(kll2, "");
        if ((kll instanceof kLL.Activity) && (kll2 instanceof kLL.Activity)) {
            kLL.Activity activity = (kLL.Activity) kll;
            kLL.Activity activity2 = (kLL.Activity) kll2;
            if (EZpvd(activity.AEQbTJ(), activity2.AEQbTJ()) && !copydefault(activity.AEQbTJ(), activity2.AEQbTJ())) {
                return OLrzqt(activity.AEQbTJ(), activity2.AEQbTJ());
            }
        } else if (kll.getClass() == kll2.getClass()) {
            Intrinsics.EZpvd(kll, kll2);
        }
        return null;
    }
}
