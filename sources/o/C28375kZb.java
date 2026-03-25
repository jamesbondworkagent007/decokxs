package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.business.trade.features.home.tokenlist.domain.model.TabType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kZb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28375kZb implements kYY {
    public final TabType AEQbTJ;
    public final DexMultiTokenInfoBean AhwBna;
    public final java.util.List<TagWrapper> EZpvd;
    public final java.lang.String KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.kYY
    public java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.kYY
    public DexMultiTokenInfoBean EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.kYY
    public boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<TagWrapper> copydefault() {
        return this.EZpvd;
    }

    public C28375kZb(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z, @NotNull TabType tabType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<TagWrapper> list) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(tabType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AhwBna = dexMultiTokenInfoBean;
        this.OLrzqt = z;
        this.AEQbTJ = tabType;
        this.KWHzl = str;
        this.copydefault = str2;
        this.EZpvd = list;
    }
}
