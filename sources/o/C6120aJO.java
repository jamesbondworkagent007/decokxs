package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aJO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C6120aJO extends DiffUtil.ItemCallback<AuthenticatorDisplayModel> {
    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull AuthenticatorDisplayModel authenticatorDisplayModel, @NotNull AuthenticatorDisplayModel authenticatorDisplayModel2) {
        Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
        Intrinsics.checkNotNullParameter(authenticatorDisplayModel2, "");
        return Intrinsics.EZpvd((java.lang.Object) authenticatorDisplayModel.copydefault(), (java.lang.Object) authenticatorDisplayModel2.copydefault());
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull AuthenticatorDisplayModel authenticatorDisplayModel, @NotNull AuthenticatorDisplayModel authenticatorDisplayModel2) {
        Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
        Intrinsics.checkNotNullParameter(authenticatorDisplayModel2, "");
        return Intrinsics.EZpvd(authenticatorDisplayModel, authenticatorDisplayModel2);
    }
}
