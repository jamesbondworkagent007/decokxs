package o;

import com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cHh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@yCR
public final class C11251cHh implements InterfaceC11252cHi {
    public final cGT AEQbTJ;

    @yCM
    public C11251cHh(@NotNull cGT cgt) {
        Intrinsics.checkNotNullParameter(cgt, "");
        this.AEQbTJ = cgt;
    }

    @Override // o.InterfaceC11252cHi
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super AddressBookEntity> continuation) {
        return this.AEQbTJ.AEQbTJ(str, continuation);
    }

    @Override // o.InterfaceC11252cHi
    public Flow<java.util.List<AddressBookEntity>> KWHzl() {
        return this.AEQbTJ.copydefault();
    }

    @Override // o.InterfaceC11252cHi
    public AbstractC58260yxt<java.util.List<AddressBookEntity>> OLrzqt(@NotNull java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        final java.lang.String str3 = "%" + str + ",%";
        AbstractC58260yxt<java.util.List<AddressBookEntity>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cHg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11251cHh.KWHzl(this.AEQbTJ, str3, str2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List KWHzl(C11251cHh c11251cHh, java.lang.String str, java.lang.String str2) {
        return c11251cHh.AEQbTJ.OLrzqt(str, str2);
    }

    @Override // o.InterfaceC11252cHi
    public AbstractC58260yxt<java.util.List<AddressBookEntity>> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        final java.lang.String str3 = "%" + str + ",%";
        AbstractC58260yxt<java.util.List<AddressBookEntity>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cHk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11251cHh.EZpvd(this.AEQbTJ, str3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List EZpvd(C11251cHh c11251cHh, java.lang.String str) {
        return c11251cHh.AEQbTJ.EZpvd(str);
    }

    @Override // o.InterfaceC11252cHi
    public java.lang.Object OLrzqt(@NotNull AddressBookEntity addressBookEntity, @NotNull Continuation<? super java.lang.Long> continuation) {
        return this.AEQbTJ.OLrzqt(addressBookEntity, continuation);
    }

    @Override // o.InterfaceC11252cHi
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Integer> continuation) {
        return this.AEQbTJ.copydefault(str, continuation);
    }
}
