package o;

import androidx.core.content.ContextCompat;
import com.okinc.business.defi.wallet.icloud.binders.CloudBackupLineBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18394fha extends AbstractC14584doH<C18338fgX, C16740epd> {
    public C18394fha() {
        super(CloudBackupLineBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C16740epd c16740epd, @NotNull C18338fgX c18338fgX) {
        Intrinsics.checkNotNullParameter(c16740epd, "");
        Intrinsics.checkNotNullParameter(c18338fgX, "");
        android.view.View view = c16740epd.KWHzl;
        view.setBackgroundColor(ContextCompat.getColor(view.getContext(), c18338fgX.KWHzl()));
    }
}
