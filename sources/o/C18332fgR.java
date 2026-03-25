package o;

import com.okinc.business.defi.wallet.icloud.binders.CloudBackupAddressItemBinder$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fgR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18332fgR extends AbstractC14584doH<C18333fgS, AbstractC16682eoY> {
    public C18332fgR() {
        super(CloudBackupAddressItemBinder$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC14584doH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull AbstractC16682eoY abstractC16682eoY, @NotNull C18333fgS c18333fgS) {
        Intrinsics.checkNotNullParameter(abstractC16682eoY, "");
        Intrinsics.checkNotNullParameter(c18333fgS, "");
        C10854bwM c10854bwMEZpvd = c18333fgS.EZpvd();
        android.widget.ImageView imageView = abstractC16682eoY.copydefault;
        Intrinsics.copydefault(imageView);
        C14725dqq.loadFixSizeBorderImage$default(imageView, c10854bwMEZpvd.copydefault(), C14726dqr.OLrzqt.OLrzqt(), 0.0f, 32.0f, 0, false, 52, null);
        abstractC16682eoY.AEQbTJ.setText(c10854bwMEZpvd.djBIcL());
        abstractC16682eoY.KWHzl.setText(c18333fgS.AEQbTJ());
    }
}
