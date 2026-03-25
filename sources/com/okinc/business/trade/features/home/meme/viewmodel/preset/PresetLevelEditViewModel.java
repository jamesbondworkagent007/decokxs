package com.okinc.business.trade.features.home.meme.viewmodel.preset;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33073mpa;
import o.C28293kWa;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class PresetLevelEditViewModel extends AbstractC33073mpa {
    public final C28293kWa OLrzqt;

    @yCM
    public PresetLevelEditViewModel(@NotNull C28293kWa c28293kWa) {
        Intrinsics.checkNotNullParameter(c28293kWa, "");
        this.OLrzqt = c28293kWa;
    }

    public final List<String> OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.OLrzqt.KWHzl(str);
    }

    public final List<String> AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.OLrzqt.KWHzl(str, str2);
    }

    public final DexMultiTokenInfoBean KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C28293kWa.getCurrentMemeCurrency$default(this.OLrzqt, str, null, 2, null);
    }

    public final void OLrzqt(@NotNull String str, @NotNull String str2, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.KWHzl(str, str2, list);
    }

    public final void EZpvd(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.KWHzl(str, list);
    }
}
