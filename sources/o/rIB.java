package o;

import androidx.core.os.BundleKt;
import com.google.android.gms.common.Scopes;
import com.okinc.ok_kyc_core.data.NavOptions;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import com.okinc.ok_kyc_core.service.EopImageInfo;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rIB extends AbstractC42074rFj {
    public final rBG AuCTelauCTel;
    public final C41970rBn AubY;
    public final rBJ AxsJAY;
    public final rBT gHZMYf;
    public final rBQ zLjUOn;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBQ DbNXlk() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBJ fARcdN() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBG valueOf() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42074rFj
    public rBT values() {
        return this.gHZMYf;
    }

    public rIB(@NotNull C41970rBn c41970rBn, @NotNull rBQ rbq, @NotNull rBT rbt) {
        Intrinsics.checkNotNullParameter(c41970rBn, "");
        Intrinsics.checkNotNullParameter(rbq, "");
        Intrinsics.checkNotNullParameter(rbt, "");
        this.AubY = c41970rBn;
        this.zLjUOn = rbq;
        this.gHZMYf = rbt;
        this.AxsJAY = c41970rBn.AhwBna();
        this.AuCTelauCTel = c41970rBn.AYXKKw();
    }

    @Override // o.AbstractC42074rFj
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull java.util.HashMap<java.lang.String, java.lang.Integer> map2, java.lang.Integer num, java.lang.Integer num2, java.lang.String str3, @NotNull java.util.ArrayList<EopImageInfo> arrayList, @NotNull java.lang.String str4, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map3, PageComponentProfile pageComponentProfile, java.lang.String str5, java.lang.Integer num3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(map3, "");
        AbstractC42074rFj.navigate$default(this, C43662rtX.ActionBar.AYXKKw, BundleKt.bundleOf(C56390yDp.OLrzqt("resultId", str), C56390yDp.OLrzqt("resultTarget", str2), C56390yDp.OLrzqt("ctaValue", new java.util.HashMap(map)), C56390yDp.OLrzqt("vendorType", num), C56390yDp.OLrzqt("verifyType", num2), C56390yDp.OLrzqt(OtcExtraKeys.SESSIONID, str3), C56390yDp.OLrzqt("imageFiles", map2), C56390yDp.OLrzqt("eopImageFiles", arrayList), C56390yDp.OLrzqt("playbook", str4), C56390yDp.OLrzqt("playbookParams", map3), C56390yDp.OLrzqt(Scopes.PROFILE, pageComponentProfile)), null, 4, null);
    }

    @Override // o.AbstractC42074rFj
    public void AEQbTJ(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        copydefault(C43662rtX.ActionBar.gEmmrt, BundleKt.bundleOf(C56390yDp.OLrzqt("arg", pageComponentAppModel), C56390yDp.OLrzqt("playbook", str), C56390yDp.OLrzqt("playbookParams", map), C56390yDp.OLrzqt(Scopes.PROFILE, pageComponentProfile)), navOptions);
    }

    @Override // o.AbstractC42074rFj
    public void KWHzl(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        copydefault(C43662rtX.ActionBar.djBIcL, BundleKt.bundleOf(C56390yDp.OLrzqt("arg", pageComponentAppModel), C56390yDp.OLrzqt("playbook", str), C56390yDp.OLrzqt("playbookParams", map), C56390yDp.OLrzqt(Scopes.PROFILE, pageComponentProfile)), navOptions);
    }

    @Override // o.AbstractC42074rFj
    public void EZpvd(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        copydefault(C43662rtX.ActionBar.AhwBna, BundleKt.bundleOf(C56390yDp.OLrzqt("arg", pageComponentAppModel), C56390yDp.OLrzqt("firstPage", java.lang.Boolean.TRUE), C56390yDp.OLrzqt("playbook", str), C56390yDp.OLrzqt("playbookParams", map), C56390yDp.OLrzqt(Scopes.PROFILE, pageComponentProfile)), navOptions);
    }

    @Override // o.AbstractC42074rFj
    public void OLrzqt(PageComponentAppModel pageComponentAppModel, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, PageComponentProfile pageComponentProfile, @NotNull NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        copydefault(C43662rtX.ActionBar.valueOf, BundleKt.bundleOf(C56390yDp.OLrzqt("arg", pageComponentAppModel), C56390yDp.OLrzqt("playbook", str), C56390yDp.OLrzqt("redirectUrl", str), C56390yDp.OLrzqt("playbookParams", map), C56390yDp.OLrzqt(Scopes.PROFILE, pageComponentProfile)), navOptions);
    }
}
