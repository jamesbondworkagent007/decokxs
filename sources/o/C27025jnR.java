package o;

import androidx.recyclerview.widget.AsyncListDiffer;
import com.okinc.business.invest_biz.ui.screens.validator_selection.model.ValidatorTrxType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jnR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C27025jnR extends C43316rmw {
    public final AsyncListDiffer<C27090jod> copydefault;

    public C27025jnR(long j, @NotNull ValidatorTrxType validatorTrxType, @NotNull Function1<? super C27090jod, Unit> function1) {
        Intrinsics.checkNotNullParameter(validatorTrxType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        register(C27090jod.class, new C27030jnW(j, validatorTrxType, function1));
        this.copydefault = new AsyncListDiffer<>(this, C27029jnV.EZpvd);
    }

    public final void copydefault(@NotNull java.util.List<C27090jod> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault.submitList(list, new java.lang.Runnable() { // from class: o.jnU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C27025jnR.KWHzl(this.copydefault);
            }
        });
    }

    public static final void KWHzl(C27025jnR c27025jnR) {
        super.setItems(c27025jnR.copydefault.getCurrentList());
    }
}
