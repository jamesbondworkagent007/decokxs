package o;

import com.okinc.business.defi.wallet.tee.converter.model.SmallAssetHiddenTokenBean;
import com.okinc.business.defi.wallet.tee.converter.ui.item.SmallAssetsHiddenTokenItemViewBinding$1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class fUU extends AbstractC19608gIr<SmallAssetHiddenTokenBean, C16840erX> {
    public fUU() {
        super(SmallAssetsHiddenTokenItemViewBinding$1.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC19608gIr
    public void EZpvd(@NotNull C16840erX c16840erX, @NotNull SmallAssetHiddenTokenBean smallAssetHiddenTokenBean) {
        Intrinsics.checkNotNullParameter(c16840erX, "");
        Intrinsics.checkNotNullParameter(smallAssetHiddenTokenBean, "");
        android.widget.ImageView imageView = c16840erX.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.KWHzl(imageView, smallAssetHiddenTokenBean.getIconUrl());
        c16840erX.copydefault.setText(smallAssetHiddenTokenBean.getTokenSymbol());
        c16840erX.OLrzqt.setText(smallAssetHiddenTokenBean.getTokenAmount());
        c16840erX.gEmmrt.setText(c16840erX.getRoot().getContext().getString(C13754dXa.FragmentManager.setPlaybackToRemote));
    }
}
