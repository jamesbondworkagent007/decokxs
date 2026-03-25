package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rVf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C42502rVf {
    public static final OKComplianceRestrictionService.Feature copydefault(@NotNull java.lang.String str) {
        OKComplianceRestrictionService.Feature next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<OKComplianceRestrictionService.Feature> it = OKComplianceRestrictionService.Feature.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C59449zhJ.gEmmrt(next.getType(), str, true)) {
                break;
            }
        }
        return next;
    }

    public static final OKComplianceRestrictionService.Mode OLrzqt(@NotNull java.lang.String str) {
        OKComplianceRestrictionService.Mode next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<OKComplianceRestrictionService.Mode> it = OKComplianceRestrictionService.Mode.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C59449zhJ.gEmmrt(next.getModeName(), str, true)) {
                break;
            }
        }
        return next;
    }
}
