package com.okinc.liveness.lca;

import com.okinc.liveness.lca.data.ColorChallengeElement;
import com.okinc.liveness.lca.data.ColorChallengeSequence;
import com.okinc.liveness.lca.data.RgbColor;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaColorChallengeSequenceConfig {
    public static final int $stable = 8;
    public final List<LcaColorChallengeElementConfig> challengeColors;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.liveness.lca.LcaColorChallengeSequenceConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LcaColorChallengeSequenceConfig copy$default(LcaColorChallengeSequenceConfig lcaColorChallengeSequenceConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = lcaColorChallengeSequenceConfig.challengeColors;
        }
        return lcaColorChallengeSequenceConfig.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LcaColorChallengeElementConfig> component1() {
        return this.challengeColors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaColorChallengeSequenceConfig copy(@NotNull List<LcaColorChallengeElementConfig> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new LcaColorChallengeSequenceConfig(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LcaColorChallengeSequenceConfig) && Intrinsics.EZpvd(this.challengeColors, ((LcaColorChallengeSequenceConfig) obj).challengeColors);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LcaColorChallengeElementConfig> getChallengeColors() {
        return this.challengeColors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.challengeColors.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaColorChallengeSequenceConfig(challengeColors=" + this.challengeColors + ")";
    }

    public LcaColorChallengeSequenceConfig(@NotNull List<LcaColorChallengeElementConfig> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.challengeColors = list;
    }

    public final ColorChallengeSequence toColorChallengeSequence$OKCompliance_ok_compliance_dynamic_lca_impl() {
        List<LcaColorChallengeElementConfig> list = this.challengeColors;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (LcaColorChallengeElementConfig lcaColorChallengeElementConfig : list) {
            arrayList.add(new ColorChallengeElement(new RgbColor(lcaColorChallengeElementConfig.getColor().getRed(), lcaColorChallengeElementConfig.getColor().getGreen(), lcaColorChallengeElementConfig.getColor().getBlue(), lcaColorChallengeElementConfig.getColor().getAlpha()), lcaColorChallengeElementConfig.getDuration()));
        }
        return new ColorChallengeSequence(arrayList);
    }
}
