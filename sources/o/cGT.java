package o;

import com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public interface cGT {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super AddressBookEntity> continuation);

    java.util.List<AddressBookEntity> EZpvd(@NotNull java.lang.String str);

    java.lang.Object OLrzqt(@NotNull AddressBookEntity addressBookEntity, @NotNull Continuation<? super java.lang.Long> continuation);

    java.util.List<AddressBookEntity> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Integer> continuation);

    Flow<java.util.List<AddressBookEntity>> copydefault();
}
