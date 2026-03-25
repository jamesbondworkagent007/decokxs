package o;

import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC57036yao {
    public static final TaskDescription Companion = TaskDescription.AEQbTJ;

    void EZpvd(@NotNull Function2<? super java.lang.String, ? super java.lang.String, Unit> function2, @NotNull Function1<? super LedgerError, Unit> function1);

    void KWHzl(@NotNull byte[] bArr, @NotNull Function1<? super byte[], Unit> function1, @NotNull Function1<? super LedgerError, Unit> function12);

    BluetoothDeviceModel OLrzqt();

    /* JADX INFO: renamed from: o.yao$TaskDescription */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
        }

        public final InterfaceC57035yan OLrzqt(@NotNull InterfaceC57036yao interfaceC57036yao) {
            Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
            return ((InterfaceC57001yaF) C43251rlk.copydefault(InterfaceC57001yaF.class)).copydefault(interfaceC57036yao);
        }

        public final InterfaceC57031yaj EZpvd(@NotNull InterfaceC57036yao interfaceC57036yao) {
            Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
            return ((InterfaceC57001yaF) C43251rlk.copydefault(InterfaceC57001yaF.class)).AEQbTJ(interfaceC57036yao);
        }

        public final InterfaceC57034yam AEQbTJ(@NotNull InterfaceC57036yao interfaceC57036yao) {
            Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
            return ((InterfaceC57001yaF) C43251rlk.copydefault(InterfaceC57001yaF.class)).KWHzl(interfaceC57036yao);
        }

        public final InterfaceC57038yaq KWHzl(@NotNull InterfaceC57036yao interfaceC57036yao) {
            Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
            return ((InterfaceC57001yaF) C43251rlk.copydefault(InterfaceC57001yaF.class)).OLrzqt(interfaceC57036yao);
        }

        public final InterfaceC57037yap copydefault(@NotNull InterfaceC57036yao interfaceC57036yao) {
            Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
            return ((InterfaceC57001yaF) C43251rlk.copydefault(InterfaceC57001yaF.class)).EZpvd(interfaceC57036yao);
        }

        public final InterfaceC57042yau valueOf(@NotNull InterfaceC57036yao interfaceC57036yao) {
            Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
            return ((InterfaceC57001yaF) C43251rlk.copydefault(InterfaceC57001yaF.class)).valueOf(interfaceC57036yao);
        }
    }
}
