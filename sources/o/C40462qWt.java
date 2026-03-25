package o;

import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.market.watch.data.UserGroup;
import com.okinc.market.watch.datasource.MarketUserFavoriteLocalDataSource$checkUserFavorite$2;
import com.okinc.market.watch.datasource.MarketUserFavoriteLocalDataSource$cursorUserFav$2;
import com.okinc.market.watch.datasource.MarketUserFavoriteLocalDataSource$cursorUserFav$3;
import com.okinc.market.watch.datasource.MarketUserFavoriteLocalDataSource$cursorUserFav$4;
import com.okinc.market.watch.datasource.MarketUserFavoriteLocalDataSource$cursorUserFav$5;
import com.okinc.market.watch.datasource.MarketUserFavoriteLocalDataSource$deleteUserFavorite$2;
import com.okinc.market.watch.datasource.MarketUserFavoriteLocalDataSource$getUserFavoritesByUserId$2;
import com.okinc.market.watch.datasource.MarketUserFavoriteLocalDataSource$getUserGroupData$2;
import com.okinc.market.watch.datasource.MarketUserFavoriteLocalDataSource$insertUserFavorite$2;
import com.okinc.market.watch.datasource.MarketUserFavoriteLocalDataSource$saveResponseToDataBase$2;
import com.okinc.market.watch.datasource.MarketUserFavoriteLocalDataSource$setTop$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qWt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C40462qWt implements InterfaceC40458qWp {
    public final Mutex EZpvd;
    public final InterfaceC40441qVz KWHzl;
    public final InterfaceC40448qWf OLrzqt;
    public final qVF copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.util.List<MarketUserFavorite>> continuation) {
        return EZpvd(this, str, str2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<MarketUserFavorite> list, @NotNull java.lang.String str2, boolean z, @NotNull Continuation<? super Unit> continuation) {
        return KWHzl(this, str, list, str2, z, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<UserGroup>> continuation) {
        return OLrzqt(this, str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object EZpvd(@NotNull MarketUserFavorite marketUserFavorite, @NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Unit> continuation) {
        return OLrzqt(this, marketUserFavorite, str, z, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40464qWv
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull MarketUserFavorite marketUserFavorite, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return copydefault(this, str, marketUserFavorite, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40464qWv
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Flow<? extends java.util.List<MarketUserFavorite>>> continuation) {
        return AEQbTJ(this, str, str2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Mutex KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull UserGroup userGroup, @NotNull Continuation<? super Unit> continuation) {
        return OLrzqt(this, str, userGroup, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40464qWv
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Flow<? extends java.util.List<UserGroup>>> continuation) {
        return EZpvd(this, str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object copydefault(@NotNull MarketUserFavorite marketUserFavorite, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        return copydefault(this, marketUserFavorite, str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation) {
        return copydefault(this, str, str2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40464qWv
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.util.List<C40453qWk> list, @NotNull Continuation<? super Unit> continuation) {
        return EZpvd(this, str, list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<C40453qWk>> continuation) {
        return copydefault(this, str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object copydefault(@NotNull java.util.List<MarketUserFavorite> list, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        return KWHzl(this, list, str, continuation);
    }

    public C40462qWt(@NotNull qVF qvf, @NotNull InterfaceC40448qWf interfaceC40448qWf, @NotNull InterfaceC40441qVz interfaceC40441qVz) {
        Intrinsics.checkNotNullParameter(qvf, "");
        Intrinsics.checkNotNullParameter(interfaceC40448qWf, "");
        Intrinsics.checkNotNullParameter(interfaceC40441qVz, "");
        this.copydefault = qvf;
        this.OLrzqt = interfaceC40448qWf;
        this.KWHzl = interfaceC40441qVz;
        this.EZpvd = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX INFO: renamed from: o.qWt$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qWt.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static /* synthetic */ java.lang.Object copydefault(C40462qWt c40462qWt, java.lang.String str, java.lang.String str2, Continuation<? super Unit> continuation) {
        if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "ALL")) {
            c40462qWt.OLrzqt.OLrzqt(str, str2);
            c40462qWt.KWHzl.OLrzqt(str, str2);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object OLrzqt(C40462qWt c40462qWt, java.lang.String str, UserGroup userGroup, Continuation<? super Unit> continuation) {
        c40462qWt.OLrzqt.copydefault(userGroup);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object OLrzqt(C40462qWt c40462qWt, java.lang.String str, Continuation<? super java.util.List<UserGroup>> continuation) {
        return c40462qWt.OLrzqt.AEQbTJ(str);
    }

    public static /* synthetic */ java.lang.Object EZpvd(C40462qWt c40462qWt, java.lang.String str, Continuation<? super Flow<? extends java.util.List<UserGroup>>> continuation) {
        return c40462qWt.OLrzqt.EZpvd(str);
    }

    public static /* synthetic */ java.lang.Object EZpvd(C40462qWt c40462qWt, java.lang.String str, java.util.List<C40453qWk> list, Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(C40440qVy.Companion.AEQbTJ().plus(NonCancellable.INSTANCE), new MarketUserFavoriteLocalDataSource$saveResponseToDataBase$2(c40462qWt, str, list, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object AEQbTJ(C40462qWt c40462qWt, java.lang.String str, java.lang.String str2, Continuation<? super Flow<? extends java.util.List<MarketUserFavorite>>> continuation) {
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "ALL")) {
            return FlowKt.onStart(FlowKt.onCompletion(c40462qWt.copydefault.OLrzqt(str), new MarketUserFavoriteLocalDataSource$cursorUserFav$2(null)), new MarketUserFavoriteLocalDataSource$cursorUserFav$3(str, null));
        }
        return FlowKt.onStart(FlowKt.onCompletion(c40462qWt.copydefault.AEQbTJ(str2, str), new MarketUserFavoriteLocalDataSource$cursorUserFav$4(null)), new MarketUserFavoriteLocalDataSource$cursorUserFav$5(str, null));
    }

    @Override // o.InterfaceC40464qWv
    public Flow<java.lang.Boolean> KWHzl(@NotNull java.lang.String str, @NotNull MarketUserFavorite marketUserFavorite) {
        Flow<java.lang.Boolean> flowCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(marketUserFavorite, "");
        if (Intrinsics.EZpvd((java.lang.Object) marketUserFavorite.getInstType(), (java.lang.Object) "CEDEFI")) {
            qVF qvf = this.copydefault;
            java.lang.String instType = marketUserFavorite.getInstType();
            java.lang.String chainId = marketUserFavorite.getChainId();
            if (chainId == null) {
                chainId = "";
            }
            java.lang.String tokenContractAddress = marketUserFavorite.getTokenContractAddress();
            flowCopydefault = qvf.KWHzl(str, instType, chainId, tokenContractAddress != null ? tokenContractAddress : "");
        } else {
            flowCopydefault = this.copydefault.copydefault(str, marketUserFavorite.getInstId(), marketUserFavorite.getInstType(), marketUserFavorite.getAlias());
        }
        return FlowKt.flowOn(flowCopydefault, C40440qVy.Companion.AEQbTJ());
    }

    public static /* synthetic */ java.lang.Object copydefault(C40462qWt c40462qWt, java.lang.String str, MarketUserFavorite marketUserFavorite, Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(C40440qVy.Companion.AEQbTJ(), new MarketUserFavoriteLocalDataSource$checkUserFavorite$2(marketUserFavorite, c40462qWt, str, null), continuation);
    }

    public static /* synthetic */ java.lang.Object EZpvd(C40462qWt c40462qWt, java.lang.String str, java.lang.String str2, Continuation<? super java.util.List<MarketUserFavorite>> continuation) {
        return BuildersKt.withContext(C40440qVy.Companion.AEQbTJ(), new MarketUserFavoriteLocalDataSource$getUserFavoritesByUserId$2(str2, c40462qWt, str, null), continuation);
    }

    public static /* synthetic */ java.lang.Object copydefault(C40462qWt c40462qWt, java.lang.String str, Continuation<? super java.util.List<C40453qWk>> continuation) {
        return BuildersKt.withContext(C40440qVy.Companion.AEQbTJ(), new MarketUserFavoriteLocalDataSource$getUserGroupData$2(c40462qWt, str, null), continuation);
    }

    public static /* synthetic */ java.lang.Object KWHzl(C40462qWt c40462qWt, java.util.List<MarketUserFavorite> list, java.lang.String str, Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(C40440qVy.Companion.AEQbTJ(), new MarketUserFavoriteLocalDataSource$deleteUserFavorite$2(c40462qWt, list, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object KWHzl(C40462qWt c40462qWt, java.lang.String str, java.util.List<MarketUserFavorite> list, java.lang.String str2, boolean z, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object OLrzqt(C40462qWt c40462qWt, MarketUserFavorite marketUserFavorite, java.lang.String str, boolean z, Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(C40440qVy.Companion.AEQbTJ(), new MarketUserFavoriteLocalDataSource$insertUserFavorite$2(c40462qWt, marketUserFavorite, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object copydefault(C40462qWt c40462qWt, MarketUserFavorite marketUserFavorite, java.lang.String str, Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(C40440qVy.Companion.AEQbTJ(), new MarketUserFavoriteLocalDataSource$setTop$2(c40462qWt, marketUserFavorite, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
