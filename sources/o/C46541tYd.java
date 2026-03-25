package o;

import com.okinc.okuser.data.PersonalSetting;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tYd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46541tYd {
    public static final C46541tYd AEQbTJ = new C46541tYd();

    private C46541tYd() {
    }

    /* JADX INFO: renamed from: o.tYd$TaskDescription */
    public static final class TaskDescription extends RxBus.TaskDescription {
        public static final int KWHzl = PersonalSetting.$stable;
        public final PersonalSetting OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull PersonalSetting personalSetting) {
            super("ev_account_preference_updated");
            Intrinsics.checkNotNullParameter(personalSetting, "");
            this.OLrzqt = personalSetting;
        }
    }
}
