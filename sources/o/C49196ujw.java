package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.share.bean.image.ImageCustomPreviewConfig;
import com.okinc.share.test.CustomImagePreviewFragment$initView$2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C48931uew;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ujw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49196ujw extends AbstractC48902ueT<ImageCustomPreviewConfig> {
    public C49023ugi AEQbTJ;
    public final int copydefault = C48931uew.Application.fetchVPNInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C49023ugi c49023ugiCopydefault = C49023ugi.copydefault(view);
        Intrinsics.copydefault(c49023ugiCopydefault);
        this.AEQbTJ = c49023ugiCopydefault;
        kotlin.Pair pair = (kotlin.Pair) getShareDialogSharedViewModel().KWHzl(C49197ujx.Companion.OLrzqt());
        if (pair != null) {
            EZpvd(((java.lang.Number) pair.component1()).intValue(), (java.lang.String) pair.component2());
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new CustomImagePreviewFragment$initView$2(this, null), 3, null);
    }

    public final void EZpvd(int i, java.lang.String str) {
        C49023ugi c49023ugi = this.AEQbTJ;
        if (c49023ugi == null) {
            Intrinsics.gEmmrt("");
            c49023ugi = null;
        }
        c49023ugi.EZpvd.setText("index" + i + "  item:" + str);
    }
}
