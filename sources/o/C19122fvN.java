package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fvN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19122fvN extends DiffUtil.ItemCallback<java.lang.Object> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areItemsTheSame(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        if ((obj instanceof C18992fsq) && (obj2 instanceof C18992fsq)) {
            return Intrinsics.EZpvd((java.lang.Object) ((C18992fsq) obj).AYXKKw(), (java.lang.Object) ((C18992fsq) obj2).AYXKKw());
        }
        if ((obj instanceof C18978fsc) && (obj2 instanceof C18978fsc)) {
            return Intrinsics.EZpvd((java.lang.Object) ((C18978fsc) obj).gEmmrt(), (java.lang.Object) ((C18978fsc) obj2).gEmmrt());
        }
        if ((obj instanceof C18999fsx) && (obj2 instanceof C18999fsx)) {
            return Intrinsics.EZpvd((java.lang.Object) ((C18999fsx) obj).EZpvd(), (java.lang.Object) ((C18999fsx) obj2).EZpvd());
        }
        if ((obj instanceof C18990fso) && (obj2 instanceof C18990fso)) {
            return Intrinsics.EZpvd((java.lang.Object) ((C18990fso) obj).EZpvd(), (java.lang.Object) ((C18990fso) obj2).EZpvd());
        }
        if ((obj instanceof java.lang.String) && (obj2 instanceof java.lang.String)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        return (obj instanceof C18951fsB) && (obj2 instanceof C18951fsB);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areContentsTheSame(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        if ((obj instanceof C18992fsq) && (obj2 instanceof C18992fsq)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        if ((obj instanceof C18978fsc) && (obj2 instanceof C18978fsc)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        if ((obj instanceof C18999fsx) && (obj2 instanceof C18999fsx)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        if ((obj instanceof C18990fso) && (obj2 instanceof C18990fso)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        if ((obj instanceof java.lang.String) && (obj2 instanceof java.lang.String)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        if ((obj instanceof C18951fsB) && (obj2 instanceof C18951fsB)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        return false;
    }
}
