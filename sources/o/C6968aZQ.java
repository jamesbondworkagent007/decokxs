package o;

import com.okinc.business.dexlogic.bean.track.EventPageNameType;
import com.okinc.business.dexlogic.track.enums.BusinessType;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC22401hef;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aZQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6968aZQ {
    public final C25446iwq AEQbTJ;

    @yCM
    public C6968aZQ(@NotNull C25446iwq c25446iwq) {
        Intrinsics.checkNotNullParameter(c25446iwq, "");
        this.AEQbTJ = c25446iwq;
    }

    public static /* synthetic */ void trackEventPageClick$default(C6968aZQ c6968aZQ, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = EventPageNameType.MEME.getPageName();
        }
        java.lang.String str6 = str4;
        if ((i & 16) != 0) {
            str5 = BusinessType.MEME.getValue();
        }
        c6968aZQ.AEQbTJ(str, str2, str3, str6, str5, map);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.AEQbTJ.copydefault(new AbstractC22401hef.TaskDescription(str, str4, str5, str2, str3, map, yDY.gEmmrt("button_type", EopTrackEvent.KEY_BUTTON_NAME, "popup_source")));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.aZQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackPageView$default(C6968aZQ c6968aZQ, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str5 = BusinessType.MEME.getValue();
        }
        java.lang.String str6 = str5;
        if ((i & 32) != 0) {
            map = null;
        }
        c6968aZQ.KWHzl(str, str2, str3, str4, str6, map);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AEQbTJ.copydefault(new AbstractC22401hef.StateListAnimator(str, str2, str5, str3, str4, map, C56402yEa.EZpvd("popup_source")));
    }

    public final void copydefault(AbstractC22401hef abstractC22401hef) {
        if (abstractC22401hef != null) {
            this.AEQbTJ.copydefault(abstractC22401hef);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.aZQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackReferralPageView$default(C6968aZQ c6968aZQ, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str5 = BusinessType.MEME.getValue();
        }
        java.lang.String str6 = str5;
        if ((i & 32) != 0) {
            map = null;
        }
        c6968aZQ.copydefault(str, str2, str3, str4, str6, map);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AEQbTJ.copydefault(new AbstractC22401hef.ActionBar(str, str2, str5, str3, str4, map, null, 64, null));
    }

    public static /* synthetic */ void trackReferralEventClick$default(C6968aZQ c6968aZQ, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = EventPageNameType.MEME.getPageName();
        }
        java.lang.String str6 = str4;
        if ((i & 16) != 0) {
            str5 = BusinessType.MEME.getValue();
        }
        c6968aZQ.EZpvd(str, str2, str3, str6, str5, map);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.AEQbTJ.copydefault(new AbstractC22401hef.Application(str, str4, str5, str2, str3, map, null, 64, null));
    }
}
