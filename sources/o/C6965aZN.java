package o;

import com.okinc.business.dexlogic.bean.track.EventPageNameType;
import com.okinc.business.dexlogic.bean.track.TrackOrderType;
import com.okinc.business.dexlogic.bean.track.TrackTransactionDirection;
import com.okinc.business.dexlogic.track.enums.BusinessType;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22403heh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aZN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6965aZN {
    public final java.lang.String AEQbTJ;
    public final C25447iwr EZpvd;
    public final java.lang.String copydefault;

    @yCM
    public C6965aZN(@NotNull C25447iwr c25447iwr) {
        Intrinsics.checkNotNullParameter(c25447iwr, "");
        this.EZpvd = c25447iwr;
        this.AEQbTJ = TrackTransactionDirection.NA.getValue();
        this.copydefault = TrackOrderType.LIMIT.getType();
    }

    public static /* synthetic */ void trackEventPageClick$default(C6965aZN c6965aZN, java.lang.String str, java.util.Map map, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = EventPageNameType.LIMIT.getPageName();
        }
        if ((i & 8) != 0) {
            str3 = BusinessType.LIMIT.getValue();
        }
        c6965aZN.KWHzl(str, map, str2, str3);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.EZpvd.AEQbTJ(new AbstractC22403heh.StateListAnimator(str, str2, str3, this.AEQbTJ, this.copydefault, map));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.aZN */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackPageView$default(C6965aZN c6965aZN, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = C56424yEw.KWHzl();
        }
        c6965aZN.AEQbTJ(str, str2, map);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.EZpvd.AEQbTJ(new AbstractC22403heh.FragmentManager(str, str2, BusinessType.LIMIT.getValue(), this.AEQbTJ, this.copydefault, map, null, 64, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.aZN */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackReferralPageView$default(C6965aZN c6965aZN, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = C56424yEw.KWHzl();
        }
        c6965aZN.OLrzqt(str, str2, map);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.EZpvd.AEQbTJ(new AbstractC22403heh.Activity(str, str2, BusinessType.LIMIT.getValue(), this.AEQbTJ, this.copydefault, map, null, 64, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.aZN */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackReferralEventClick$default(C6965aZN c6965aZN, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = C56424yEw.KWHzl();
        }
        c6965aZN.copydefault(str, str2, map);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.EZpvd.AEQbTJ(new AbstractC22403heh.Application(str, str2, BusinessType.LIMIT.getValue(), this.AEQbTJ, this.copydefault, map, null, 64, null));
    }
}
