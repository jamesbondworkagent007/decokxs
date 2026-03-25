package o;

import androidx.recyclerview.widget.DiffUtil;
import com.okinc.auth.impl.passkey.model.AuthenticatorSelectModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aQk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C6513aQk extends DiffUtil.ItemCallback<AuthenticatorSelectModel> {
    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull AuthenticatorSelectModel authenticatorSelectModel, @NotNull AuthenticatorSelectModel authenticatorSelectModel2) {
        Intrinsics.checkNotNullParameter(authenticatorSelectModel, "");
        Intrinsics.checkNotNullParameter(authenticatorSelectModel2, "");
        return Intrinsics.EZpvd(authenticatorSelectModel, authenticatorSelectModel2);
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull AuthenticatorSelectModel authenticatorSelectModel, @NotNull AuthenticatorSelectModel authenticatorSelectModel2) {
        Intrinsics.checkNotNullParameter(authenticatorSelectModel, "");
        Intrinsics.checkNotNullParameter(authenticatorSelectModel2, "");
        return Intrinsics.EZpvd(authenticatorSelectModel, authenticatorSelectModel2);
    }
}
