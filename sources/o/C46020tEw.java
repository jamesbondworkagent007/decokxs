package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.tEw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46020tEw {
    public static final Activity KWHzl = new Activity();

    /* JADX INFO: renamed from: o.tEw$Activity */
    public static final class Activity extends DiffUtil.ItemCallback<InterfaceC46065tGn> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(InterfaceC46065tGn interfaceC46065tGn, InterfaceC46065tGn interfaceC46065tGn2) {
            Intrinsics.checkNotNullParameter(interfaceC46065tGn, "");
            Intrinsics.checkNotNullParameter(interfaceC46065tGn2, "");
            return (interfaceC46065tGn instanceof C46068tGq) && (interfaceC46065tGn2 instanceof C46068tGq) && Intrinsics.EZpvd((java.lang.Object) ((C46068tGq) interfaceC46065tGn).isConnected(), (java.lang.Object) ((C46068tGq) interfaceC46065tGn2).isConnected());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(InterfaceC46065tGn interfaceC46065tGn, InterfaceC46065tGn interfaceC46065tGn2) {
            Intrinsics.checkNotNullParameter(interfaceC46065tGn, "");
            Intrinsics.checkNotNullParameter(interfaceC46065tGn2, "");
            return (interfaceC46065tGn instanceof C46068tGq) && (interfaceC46065tGn2 instanceof C46068tGq) && Intrinsics.EZpvd(interfaceC46065tGn, interfaceC46065tGn2);
        }
    }
}
