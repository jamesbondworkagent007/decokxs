package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fri, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18931fri extends DiffUtil.ItemCallback<C18927fre> {
    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull C18927fre c18927fre, @NotNull C18927fre c18927fre2) {
        Intrinsics.checkNotNullParameter(c18927fre, "");
        Intrinsics.checkNotNullParameter(c18927fre2, "");
        return Intrinsics.EZpvd((java.lang.Object) c18927fre.AEQbTJ(), (java.lang.Object) c18927fre2.AEQbTJ());
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull C18927fre c18927fre, @NotNull C18927fre c18927fre2) {
        Intrinsics.checkNotNullParameter(c18927fre, "");
        Intrinsics.checkNotNullParameter(c18927fre2, "");
        return Intrinsics.EZpvd(c18927fre, c18927fre2);
    }
}
