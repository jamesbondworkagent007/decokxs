package o;

import com.okinc.tradingbot.impl.nmp.my_bot.presenter.SortType;
import kotlin.jvm.internal.Intrinsics;
import o.C51995vxY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vzk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C52113vzk implements InterfaceC47982uAp {
    public final SortType EZpvd;

    /* JADX INFO: renamed from: o.vzk$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SortType.values().length];
            try {
                iArr[SortType.BOT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortType OLrzqt() {
        return this.EZpvd;
    }

    public C52113vzk(@NotNull SortType sortType) {
        Intrinsics.checkNotNullParameter(sortType, "");
        this.EZpvd = sortType;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.vxY.StateListAnimator.newInstance$default(o.vxY$StateListAnimator, java.lang.String, java.lang.String, android.os.Bundle, boolean, int, java.lang.Object):o.vxY */
    @Override // o.InterfaceC47982uAp
    public androidx.fragment.app.Fragment getFragment(java.lang.Object obj) {
        if (TaskDescription.AEQbTJ[this.EZpvd.ordinal()] == 1) {
            return C51995vxY.StateListAnimator.newInstance$default(C51995vxY.Companion, null, "FOLLOW", null, true, 5, null);
        }
        return new C52064vyo();
    }
}
