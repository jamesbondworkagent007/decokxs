package o;

import com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cHi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC11252cHi {
    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Integer> continuation);

    Flow<java.util.List<AddressBookEntity>> KWHzl();

    java.lang.Object OLrzqt(@NotNull AddressBookEntity addressBookEntity, @NotNull Continuation<? super java.lang.Long> continuation);

    AbstractC58260yxt<java.util.List<AddressBookEntity>> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super AddressBookEntity> continuation);

    AbstractC58260yxt<java.util.List<AddressBookEntity>> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2);
}
