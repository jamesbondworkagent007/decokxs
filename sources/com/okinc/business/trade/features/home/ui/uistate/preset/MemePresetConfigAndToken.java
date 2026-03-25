package com.okinc.business.trade.features.home.ui.uistate.preset;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemePresetConfigAndToken {
    public static final int $stable = 8;
    private final DexMultiTokenInfoBean dexMultiTokenInfoBean;
    private final DexPresetResultVO presetResultVO;
    private final boolean state;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MemePresetConfigAndToken copy$default(MemePresetConfigAndToken memePresetConfigAndToken, boolean z, DexPresetResultVO dexPresetResultVO, DexMultiTokenInfoBean dexMultiTokenInfoBean, int i, Object obj) {
        if ((i & 1) != 0) {
            z = memePresetConfigAndToken.state;
        }
        if ((i & 2) != 0) {
            dexPresetResultVO = memePresetConfigAndToken.presetResultVO;
        }
        if ((i & 4) != 0) {
            dexMultiTokenInfoBean = memePresetConfigAndToken.dexMultiTokenInfoBean;
        }
        return memePresetConfigAndToken.copy(z, dexPresetResultVO, dexMultiTokenInfoBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexPresetResultVO component2() {
        return this.presetResultVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component3() {
        return this.dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemePresetConfigAndToken copy(boolean z, @NotNull DexPresetResultVO dexPresetResultVO, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexPresetResultVO, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        return new MemePresetConfigAndToken(z, dexPresetResultVO, dexMultiTokenInfoBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemePresetConfigAndToken)) {
            return false;
        }
        MemePresetConfigAndToken memePresetConfigAndToken = (MemePresetConfigAndToken) obj;
        return this.state == memePresetConfigAndToken.state && Intrinsics.EZpvd(this.presetResultVO, memePresetConfigAndToken.presetResultVO) && Intrinsics.EZpvd(this.dexMultiTokenInfoBean, memePresetConfigAndToken.dexMultiTokenInfoBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getDexMultiTokenInfoBean() {
        return this.dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexPresetResultVO getPresetResultVO() {
        return this.presetResultVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.state) * 31) + this.presetResultVO.hashCode()) * 31) + this.dexMultiTokenInfoBean.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemePresetConfigAndToken(state=" + this.state + ", presetResultVO=" + this.presetResultVO + ", dexMultiTokenInfoBean=" + this.dexMultiTokenInfoBean + ")";
    }

    public MemePresetConfigAndToken(boolean z, @NotNull DexPresetResultVO dexPresetResultVO, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexPresetResultVO, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        this.state = z;
        this.presetResultVO = dexPresetResultVO;
        this.dexMultiTokenInfoBean = dexMultiTokenInfoBean;
    }
}
