package o;

import com.bumptech.glide.Glide;
import com.okinc.uilab.filter.FilterChip;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xbR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54985xbR {
    public static final void AEQbTJ(@NotNull FilterChip filterChip, C54982xbO c54982xbO) {
        Intrinsics.checkNotNullParameter(filterChip, "");
        if (c54982xbO == null) {
            return;
        }
        if (c54982xbO.EZpvd() != null) {
            filterChip.getMenuIcon().setVisibility(0);
            Intrinsics.copydefault(Glide.KWHzl(filterChip.getMenuIcon()).KWHzl(c54982xbO.EZpvd()).EZpvd(filterChip.getMenuIcon()));
        } else {
            filterChip.getMenuIcon().setVisibility(8);
        }
        filterChip.setTitle(c54982xbO.AuCTel());
        filterChip.setEnabled(c54982xbO.copydefault());
        filterChip.setChipDrawables(c54982xbO.KWHzl(), c54982xbO.ejfBZ(), c54982xbO.fJNWhG(), c54982xbO.AEQbTJ());
        if (c54982xbO.copydefault()) {
            filterChip.setSelected(c54982xbO.fARcdN());
        }
    }
}
