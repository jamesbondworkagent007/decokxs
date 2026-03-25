package o;

import com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cGN {
    public static final cGN EZpvd = new cGN();
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.cGK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return cGN.copydefault();
        }
    });
    public static final int copydefault = 8;

    private cGN() {
    }

    public final InterfaceC11252cHi KWHzl() {
        return (InterfaceC11252cHi) AEQbTJ.getValue();
    }

    public static final InterfaceC11252cHi copydefault() {
        C58114yvF c58114yvF = C58114yvF.EZpvd;
        return ((InterfaceC13422dKt) C58114yvF.OLrzqt(C9678baC.Companion.AEQbTJ(), InterfaceC13422dKt.class)).valueOf();
    }

    public final AbstractC58260yxt<java.util.List<AddressBookEntity>> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C11607cUn.valueOf(KWHzl().OLrzqt(str, str2));
    }

    public final AbstractC58260yxt<java.util.List<AddressBookEntity>> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C11607cUn.valueOf(KWHzl().copydefault(str, str2));
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super AddressBookEntity> continuation) {
        return KWHzl().copydefault(str, continuation);
    }
}
