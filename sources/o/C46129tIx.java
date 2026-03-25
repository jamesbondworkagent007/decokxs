package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.tIx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46129tIx {
    public static final ActionBar copydefault = new ActionBar();

    /* JADX INFO: renamed from: o.tIx$ActionBar */
    public static final class ActionBar extends DiffUtil.ItemCallback<InterfaceC46104tHz> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(InterfaceC46104tHz interfaceC46104tHz, InterfaceC46104tHz interfaceC46104tHz2) {
            Intrinsics.checkNotNullParameter(interfaceC46104tHz, "");
            Intrinsics.checkNotNullParameter(interfaceC46104tHz2, "");
            return Intrinsics.EZpvd(interfaceC46104tHz, interfaceC46104tHz2);
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(InterfaceC46104tHz interfaceC46104tHz, InterfaceC46104tHz interfaceC46104tHz2) {
            Intrinsics.checkNotNullParameter(interfaceC46104tHz, "");
            Intrinsics.checkNotNullParameter(interfaceC46104tHz2, "");
            return Intrinsics.EZpvd(interfaceC46104tHz, interfaceC46104tHz2);
        }
    }
}
