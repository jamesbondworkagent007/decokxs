package o;

import com.okinc.business.defi.wallet.mine.addressbook.detail.AddressChainUiData;
import com.okinc.business.defi.wallet.mine.addressbook.detail.manager.AddressBookChainsFromAddressManagerImpl$doesEosAccountExists$2;
import com.okinc.business.defi.wallet.mine.addressbook.detail.manager.AddressBookChainsFromAddressManagerImpl$doesNearAddressExists$2;
import com.okinc.business.defi.wallet.mine.addressbook.detail.manager.AddressBookChainsFromAddressManagerImpl$invoke$2;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fnv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18733fnv implements InterfaceC18734fnw {
    public final C13934dbu AEQbTJ;
    public final CoroutineDispatcher KWHzl;
    public final C10854bwM OLrzqt;
    public final C12827cuN copydefault;

    @yCM
    public C18733fnv(@NotNull C12827cuN c12827cuN, @NotNull C13934dbu c13934dbu, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = c12827cuN;
        this.AEQbTJ = c13934dbu;
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = C10954byG.EZpvd.valueOf().AuCTel();
    }

    @Override // o.InterfaceC18734fnw
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function1, long j, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<AddressChainUiData>, Unit>> continuation) {
        return CoroutineScopeKt.coroutineScope(new AddressBookChainsFromAddressManagerImpl$invoke$2(this, str, function1, j, null), continuation);
    }

    public final java.lang.Object AEQbTJ(java.lang.String str, Continuation<? super AbstractC43419rot<java.lang.Boolean, Unit>> continuation) {
        return CoroutineScopeKt.coroutineScope(new AddressBookChainsFromAddressManagerImpl$doesNearAddressExists$2(this, str, null), continuation);
    }

    public final java.lang.Object KWHzl(java.lang.String str, Continuation<? super AbstractC43419rot<java.lang.Boolean, Unit>> continuation) {
        return CoroutineScopeKt.coroutineScope(new AddressBookChainsFromAddressManagerImpl$doesEosAccountExists$2(this, str, null), continuation);
    }

    public final boolean AEQbTJ(java.lang.String str) {
        return StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) JwtUtilsKt.JWT_DELIMITER, false, 2, (java.lang.Object) null) & (str.length() > 0);
    }

    public final boolean KWHzl(java.lang.String str) {
        return str.length() <= 12;
    }
}
