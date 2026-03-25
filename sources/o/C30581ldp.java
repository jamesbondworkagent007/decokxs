package o;

import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ldp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30581ldp extends AbstractC30580ldo {
    public AdvancedAutoSellStrategy fetchVPNInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC30580ldo
    public boolean AEQbTJ(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRemoteStrategy(@NotNull AdvancedAutoSellStrategy advancedAutoSellStrategy) {
        Intrinsics.checkNotNullParameter(advancedAutoSellStrategy, "");
        this.fetchVPNInfo = advancedAutoSellStrategy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30581ldp(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        setRemoteConfigVisible();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30581ldp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        setRemoteConfigVisible();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30581ldp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setRemoteConfigVisible();
    }

    @Override // o.AbstractC30580ldo
    public AdvancedAutoSellStrategy OLrzqt() {
        AdvancedAutoSellStrategy advancedAutoSellStrategy = this.fetchVPNInfo;
        if (advancedAutoSellStrategy != null) {
            return advancedAutoSellStrategy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }
}
