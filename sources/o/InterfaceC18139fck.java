package o;

import com.okinc.business.defi.biz.net.bean.NftCollection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC18139fck {

    /* JADX INFO: renamed from: o.fck$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC18139fck {
        public final NftCollection copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NftCollection EZpvd() {
            return this.copydefault;
        }

        public StateListAnimator(@NotNull NftCollection nftCollection) {
            Intrinsics.checkNotNullParameter(nftCollection, "");
            this.copydefault = nftCollection;
        }
    }

    /* JADX INFO: renamed from: o.fck$ActionBar */
    public static final class ActionBar implements InterfaceC18139fck {
        public static final ActionBar AEQbTJ = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.fck$TaskDescription */
    public static final class TaskDescription implements InterfaceC18139fck {
        public static final TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
        }
    }
}
