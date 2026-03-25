package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.fvW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19131fvW extends C19188fwa<java.lang.Object> {
    public C19131fvW() {
        super(new DiffUtil.ItemCallback<java.lang.Object>() { // from class: o.fvW.2
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areItemsTheSame(java.lang.Object obj, java.lang.Object obj2) {
                Intrinsics.checkNotNullParameter(obj, "");
                Intrinsics.checkNotNullParameter(obj2, "");
                if ((obj instanceof C18989fsn) && (obj2 instanceof C18989fsn)) {
                    return Intrinsics.EZpvd((java.lang.Object) ((C18989fsn) obj).AEQbTJ().valueOf(), (java.lang.Object) ((C18989fsn) obj2).AEQbTJ().valueOf());
                }
                return (obj instanceof C18951fsB) && (obj2 instanceof C18951fsB);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areContentsTheSame(java.lang.Object obj, java.lang.Object obj2) {
                Intrinsics.checkNotNullParameter(obj, "");
                Intrinsics.checkNotNullParameter(obj2, "");
                if ((obj instanceof C18989fsn) && (obj2 instanceof C18989fsn)) {
                    return Intrinsics.EZpvd(obj, obj2);
                }
                if ((obj instanceof C18951fsB) && (obj2 instanceof C18951fsB)) {
                    return Intrinsics.EZpvd(obj, obj2);
                }
                return false;
            }
        });
    }
}
