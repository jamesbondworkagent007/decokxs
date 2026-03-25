package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.planet.format.TargetUnit;
import com.okinc.planet.serializer.PlanetNumericString;
import com.okinc.trade.manager.common.position.PosShowItem;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tGy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46076tGy {
    public static final java.util.List<PosShowItem> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(new PosShowItem(1, C33070mpX.AYXKKw(C47501trL.Fragment.GCXiNH), pTF.KWHzl.AEQbTJ(pTB.formatLocalized$default(str3, null, 1, null)), false, null, false, false, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null));
        listOLrzqt.add(new PosShowItem(2, C33070mpX.AYXKKw(C47501trL.Fragment.DRGLNw), (java.lang.String) tRS.OLrzqt(str3, str, str2, str4, (48 & 8) != 0 ? PlanetNumericString.Companion.EZpvd() : null, (48 & 16) != 0 ? false : true, (48 & 32) != 0 ? null : TargetUnit.Coin, (48 & 64) != 0 ? null : null).getFirst(), false, null, false, false, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null));
        listOLrzqt.add(new PosShowItem(3, C33070mpX.AYXKKw(C47501trL.Fragment.sYcwUD), C46367tRs.m8764formatLocalCurrencyaKjyv6w$default(str5, null, null, 3, null), false, null, false, false, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null));
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public static final java.util.List<PosShowItem> copydefault(@NotNull InterfaceC46069tGr interfaceC46069tGr) {
        Intrinsics.checkNotNullParameter(interfaceC46069tGr, "");
        return AEQbTJ(interfaceC46069tGr.EZpvd(), interfaceC46069tGr.AEQbTJ(), interfaceC46069tGr.copydefault(), interfaceC46069tGr.KWHzl(), interfaceC46069tGr.OLrzqt());
    }
}
