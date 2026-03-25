package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tYB extends DiffUtil.ItemCallback<C46548tYk<ValuationCurrencyBean>> {
    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull C46548tYk<ValuationCurrencyBean> c46548tYk, @NotNull C46548tYk<ValuationCurrencyBean> c46548tYk2) {
        Intrinsics.checkNotNullParameter(c46548tYk, "");
        Intrinsics.checkNotNullParameter(c46548tYk2, "");
        return Intrinsics.EZpvd((java.lang.Object) c46548tYk.EZpvd().getIsoCode(), (java.lang.Object) c46548tYk2.EZpvd().getIsoCode());
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull C46548tYk<ValuationCurrencyBean> c46548tYk, @NotNull C46548tYk<ValuationCurrencyBean> c46548tYk2) {
        Intrinsics.checkNotNullParameter(c46548tYk, "");
        Intrinsics.checkNotNullParameter(c46548tYk2, "");
        return Intrinsics.EZpvd((java.lang.Object) c46548tYk.EZpvd().getDisplayName(), (java.lang.Object) c46548tYk2.EZpvd().getDisplayName()) && c46548tYk.AEQbTJ() == c46548tYk2.AEQbTJ();
    }
}
