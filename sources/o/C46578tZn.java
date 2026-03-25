package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tZn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C46578tZn extends DiffUtil.ItemCallback<BoF> {
    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull BoF boF, @NotNull BoF boF2) {
        Intrinsics.checkNotNullParameter(boF, "");
        Intrinsics.checkNotNullParameter(boF2, "");
        return Intrinsics.EZpvd((java.lang.Object) boF.OLrzqt().copydefault(), (java.lang.Object) boF2.OLrzqt().copydefault());
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull BoF boF, @NotNull BoF boF2) {
        Intrinsics.checkNotNullParameter(boF, "");
        Intrinsics.checkNotNullParameter(boF2, "");
        return Intrinsics.EZpvd(boF, boF2) && boF.KWHzl() == boF2.KWHzl();
    }
}
