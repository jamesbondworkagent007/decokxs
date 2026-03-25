package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC34593ney;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.new, reason: invalid class name */
/* JADX INFO: loaded from: classes18.dex */
public abstract class Cnew<T> extends DiffUtil.ItemCallback<InterfaceC34593ney<? extends T>> {
    public abstract boolean AEQbTJ(T t, T t2);

    public java.lang.Object OLrzqt(T t, T t2) {
        return null;
    }

    public abstract boolean copydefault(T t, T t2);

    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.new<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull InterfaceC34593ney<? extends T> interfaceC34593ney, @NotNull InterfaceC34593ney<? extends T> interfaceC34593ney2) {
        Intrinsics.checkNotNullParameter(interfaceC34593ney, "");
        Intrinsics.checkNotNullParameter(interfaceC34593ney2, "");
        if ((interfaceC34593ney instanceof InterfaceC34593ney.Application) && (interfaceC34593ney2 instanceof InterfaceC34593ney.Application)) {
            return copydefault(((InterfaceC34593ney.Application) interfaceC34593ney).copydefault(), ((InterfaceC34593ney.Application) interfaceC34593ney2).copydefault());
        }
        return interfaceC34593ney.getClass() == interfaceC34593ney2.getClass();
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.new<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull InterfaceC34593ney<? extends T> interfaceC34593ney, @NotNull InterfaceC34593ney<? extends T> interfaceC34593ney2) {
        Intrinsics.checkNotNullParameter(interfaceC34593ney, "");
        Intrinsics.checkNotNullParameter(interfaceC34593ney2, "");
        if ((interfaceC34593ney instanceof InterfaceC34593ney.Application) && (interfaceC34593ney2 instanceof InterfaceC34593ney.Application)) {
            return AEQbTJ(((InterfaceC34593ney.Application) interfaceC34593ney).copydefault(), ((InterfaceC34593ney.Application) interfaceC34593ney2).copydefault());
        }
        return interfaceC34593ney.getClass() == interfaceC34593ney2.getClass();
    }

    /* JADX DEBUG: Method merged with bridge method: getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.new<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object getChangePayload(@NotNull InterfaceC34593ney<? extends T> interfaceC34593ney, @NotNull InterfaceC34593ney<? extends T> interfaceC34593ney2) {
        Intrinsics.checkNotNullParameter(interfaceC34593ney, "");
        Intrinsics.checkNotNullParameter(interfaceC34593ney2, "");
        if ((interfaceC34593ney instanceof InterfaceC34593ney.Application) && (interfaceC34593ney2 instanceof InterfaceC34593ney.Application)) {
            InterfaceC34593ney.Application application = (InterfaceC34593ney.Application) interfaceC34593ney;
            InterfaceC34593ney.Application application2 = (InterfaceC34593ney.Application) interfaceC34593ney2;
            if (copydefault(application.copydefault(), application2.copydefault()) && !AEQbTJ(application.copydefault(), application2.copydefault())) {
                return OLrzqt(application.copydefault(), application2.copydefault());
            }
        } else if (interfaceC34593ney.getClass() == interfaceC34593ney2.getClass()) {
            Intrinsics.EZpvd(interfaceC34593ney, interfaceC34593ney2);
        }
        return null;
    }
}
