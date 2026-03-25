package o;

import com.bumptech.glide.Glide;
import com.okinc.planet.biz_userprofile.data.PlanetAvatarInfo;
import com.okinc.planet.utils.ImageLoadInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tRE {
    public static /* synthetic */ void loadAvatar$default(android.widget.ImageView imageView, PlanetAvatarInfo planetAvatarInfo, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = C32113mPz.ActionBar.fJNWhG;
        }
        copydefault(imageView, planetAvatarInfo, i);
    }

    public static final void copydefault(@NotNull android.widget.ImageView imageView, @NotNull PlanetAvatarInfo planetAvatarInfo, @androidx.annotation.ColorRes int i) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(planetAvatarInfo, "");
        C46443tUn.loadAvatar$default(C46443tUn.copydefault, imageView, planetAvatarInfo.copydefault(), planetAvatarInfo.AEQbTJ(), planetAvatarInfo.KWHzl(), C33070mpX.copydefault(i), 0.0f, 32, null);
    }

    public static /* synthetic */ void loadAvatar$default(android.widget.ImageView imageView, ImageLoadInfo imageLoadInfo, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = C32113mPz.ActionBar.fJNWhG;
        }
        OLrzqt(imageView, imageLoadInfo, i);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.tUn.loadAvatar$default(o.tUn, android.widget.ImageView, java.lang.String, java.lang.String, java.lang.String, int, float, int, java.lang.Object):void */
    public static final void OLrzqt(@NotNull android.widget.ImageView imageView, @NotNull ImageLoadInfo imageLoadInfo, @androidx.annotation.ColorRes int i) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(imageLoadInfo, "");
        C46443tUn.loadAvatar$default(C46443tUn.copydefault, imageView, imageLoadInfo.AEQbTJ(), imageLoadInfo.copydefault(), imageLoadInfo.KWHzl(), C33070mpX.copydefault(i), 0.0f, 32, null);
    }

    public static final void EZpvd(@NotNull final android.widget.ImageView imageView, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(imageView, (Function0<Unit>) new Function0() { // from class: o.tRB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tRE.OLrzqt(imageView, str);
            }
        });
    }

    public static final Unit OLrzqt(android.widget.ImageView imageView, java.lang.String str) {
        Glide.AEQbTJ(imageView.getContext()).EZpvd(str).OLrzqt((RX<?>) new C5448Sc().gEmmrt()).KWHzl(C47501trL.ActionBar.fARcdN).EZpvd(imageView);
        return Unit.INSTANCE;
    }

    public static final void copydefault(@NotNull android.widget.ImageView imageView, @NotNull Function0<Unit> function0) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(function0, "");
        try {
            Result.Application application = Result.Companion;
            if (C46443tUn.copydefault.AEQbTJ(imageView.getContext())) {
                function0.invoke();
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            thM7380exceptionOrNullimpl.printStackTrace();
            pUU.AEQbTJ("PlanetImageHelper", thM7380exceptionOrNullimpl);
        }
    }
}
