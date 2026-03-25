package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fvS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19127fvS extends DiffUtil.ItemCallback<java.lang.Object> {
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[ORIG_RETURN, RETURN] */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean areItemsTheSame(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        if (!(obj instanceof C18977fsb) || !(obj2 instanceof C18977fsb)) {
            if ((obj instanceof C18983fsh) && (obj2 instanceof C18983fsh)) {
                return Intrinsics.EZpvd((java.lang.Object) ((C18983fsh) obj).EZpvd(), (java.lang.Object) ((C18983fsh) obj2).EZpvd());
            }
            return (obj instanceof C18951fsB) && (obj2 instanceof C18951fsB);
        }
        if (((C18977fsb) obj).KWHzl().KWHzl() == ((C18977fsb) obj2).KWHzl().KWHzl()) {
        }
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areContentsTheSame(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        if ((obj instanceof C18977fsb) && (obj2 instanceof C18977fsb)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        if ((obj instanceof C18983fsh) && (obj2 instanceof C18983fsh)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        if ((obj instanceof C18951fsB) && (obj2 instanceof C18951fsB)) {
            return Intrinsics.EZpvd(obj, obj2);
        }
        return false;
    }
}
