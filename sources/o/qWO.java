package o;

import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.market.watch.data.UserGroup;
import com.okinc.market.watch.database.MarketFavDataBase;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$cursorUserFav$1;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$cursorUserFav$2;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$cursorUserFav$3;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$cursorUserGroups$1;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$cursorUserGroups$2;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$cursorUserGroups$3;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$cursorUserGroups$4;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$deleteGroup$1;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$deleteGroup$2;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$deleteUserFavorite$1;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$deleteUserFavorite$2;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$getUserFavoritesByUserId$1;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$getUserGroupData$1;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$insertGroup$1;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$insertGroup$2;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$insertUserFavorite$1;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$queryAllGroups$1;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$replaceFavorites$1;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$replaceFavorites$2;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$saveResponseToDataBase$2;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$setTop$1;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$setTop$2;
import com.okinc.market.watch.repo.MarketUserFavoriteRepository$syncWithServer$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.InterfaceC40459qWq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class qWO implements InterfaceC40458qWp {
    public static final Application Companion = new Application(null);
    public final InterfaceC40464qWv AEQbTJ;
    public final InterfaceC40459qWq OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.util.List<MarketUserFavorite>> continuation) {
        return KWHzl(this, str, str2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<MarketUserFavorite> list, @NotNull java.lang.String str2, boolean z, @NotNull Continuation<? super Unit> continuation) {
        return AEQbTJ(this, str, list, str2, z, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<UserGroup>> continuation) {
        return OLrzqt(this, str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object EZpvd(@NotNull MarketUserFavorite marketUserFavorite, @NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Unit> continuation) {
        return KWHzl(this, marketUserFavorite, str, z, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40464qWv
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull MarketUserFavorite marketUserFavorite, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return EZpvd(this, str, marketUserFavorite, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40464qWv
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Flow<? extends java.util.List<MarketUserFavorite>>> continuation) {
        return copydefault(this, str, str2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull UserGroup userGroup, @NotNull Continuation<? super Unit> continuation) {
        return KWHzl(this, str, userGroup, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40464qWv
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Flow<? extends java.util.List<UserGroup>>> continuation) {
        return KWHzl(this, str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object copydefault(@NotNull MarketUserFavorite marketUserFavorite, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        return AEQbTJ(this, marketUserFavorite, str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Unit> continuation) {
        return EZpvd(this, str, str2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40464qWv
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.util.List<C40453qWk> list, @NotNull Continuation<? super Unit> continuation) {
        return copydefault(this, str, list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<C40453qWk>> continuation) {
        return copydefault(this, str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40459qWq
    public java.lang.Object copydefault(@NotNull java.util.List<MarketUserFavorite> list, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        return OLrzqt(this, list, str, continuation);
    }

    public qWO(@NotNull InterfaceC40464qWv interfaceC40464qWv, @NotNull InterfaceC40459qWq interfaceC40459qWq) {
        Intrinsics.checkNotNullParameter(interfaceC40464qWv, "");
        Intrinsics.checkNotNullParameter(interfaceC40459qWq, "");
        this.AEQbTJ = interfaceC40464qWv;
        this.OLrzqt = interfaceC40459qWq;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qWO.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final qWO copydefault(@NotNull MarketFavDataBase marketFavDataBase) {
            Intrinsics.checkNotNullParameter(marketFavDataBase, "");
            return new qWO(new C40462qWt(marketFavDataBase.OLrzqt(), marketFavDataBase.djBIcL(), marketFavDataBase.EZpvd()), new C40465qWw());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object EZpvd(qWO qwo, java.lang.String str, java.lang.String str2, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketUserFavoriteRepository$deleteGroup$1 marketUserFavoriteRepository$deleteGroup$1;
        if (continuation instanceof MarketUserFavoriteRepository$deleteGroup$1) {
            marketUserFavoriteRepository$deleteGroup$1 = (MarketUserFavoriteRepository$deleteGroup$1) continuation;
            int i = marketUserFavoriteRepository$deleteGroup$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketUserFavoriteRepository$deleteGroup$1.label = i - Integer.MIN_VALUE;
            } else {
                marketUserFavoriteRepository$deleteGroup$1 = new MarketUserFavoriteRepository$deleteGroup$1(qwo, continuation);
            }
        }
        MarketUserFavoriteRepository$deleteGroup$1 marketUserFavoriteRepository$deleteGroup$12 = marketUserFavoriteRepository$deleteGroup$1;
        java.lang.Object obj = marketUserFavoriteRepository$deleteGroup$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketUserFavoriteRepository$deleteGroup$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketUserFavoriteRepository$deleteGroup$2 marketUserFavoriteRepository$deleteGroup$2 = new MarketUserFavoriteRepository$deleteGroup$2(qwo, str, str2, null);
            marketUserFavoriteRepository$deleteGroup$12.L$0 = qwo;
            marketUserFavoriteRepository$deleteGroup$12.L$1 = str;
            marketUserFavoriteRepository$deleteGroup$12.label = 1;
            if (qwo.copydefault(marketUserFavoriteRepository$deleteGroup$2, marketUserFavoriteRepository$deleteGroup$12) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            str = (java.lang.String) marketUserFavoriteRepository$deleteGroup$12.L$1;
            qwo = (qWO) marketUserFavoriteRepository$deleteGroup$12.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        marketUserFavoriteRepository$deleteGroup$12.L$0 = null;
        marketUserFavoriteRepository$deleteGroup$12.L$1 = null;
        marketUserFavoriteRepository$deleteGroup$12.label = 2;
        if (syncWithServer$default(qwo, str, false, marketUserFavoriteRepository$deleteGroup$12, 2, null) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object KWHzl(qWO qwo, java.lang.String str, UserGroup userGroup, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketUserFavoriteRepository$insertGroup$1 marketUserFavoriteRepository$insertGroup$1;
        if (continuation instanceof MarketUserFavoriteRepository$insertGroup$1) {
            marketUserFavoriteRepository$insertGroup$1 = (MarketUserFavoriteRepository$insertGroup$1) continuation;
            int i = marketUserFavoriteRepository$insertGroup$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketUserFavoriteRepository$insertGroup$1.label = i - Integer.MIN_VALUE;
            } else {
                marketUserFavoriteRepository$insertGroup$1 = new MarketUserFavoriteRepository$insertGroup$1(qwo, continuation);
            }
        }
        MarketUserFavoriteRepository$insertGroup$1 marketUserFavoriteRepository$insertGroup$12 = marketUserFavoriteRepository$insertGroup$1;
        java.lang.Object obj = marketUserFavoriteRepository$insertGroup$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketUserFavoriteRepository$insertGroup$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketUserFavoriteRepository$insertGroup$2 marketUserFavoriteRepository$insertGroup$2 = new MarketUserFavoriteRepository$insertGroup$2(qwo, str, userGroup, null);
            marketUserFavoriteRepository$insertGroup$12.L$0 = qwo;
            marketUserFavoriteRepository$insertGroup$12.L$1 = str;
            marketUserFavoriteRepository$insertGroup$12.label = 1;
            if (qwo.copydefault(marketUserFavoriteRepository$insertGroup$2, marketUserFavoriteRepository$insertGroup$12) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            str = (java.lang.String) marketUserFavoriteRepository$insertGroup$12.L$1;
            qwo = (qWO) marketUserFavoriteRepository$insertGroup$12.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        marketUserFavoriteRepository$insertGroup$12.L$0 = null;
        marketUserFavoriteRepository$insertGroup$12.L$1 = null;
        marketUserFavoriteRepository$insertGroup$12.label = 2;
        if (syncWithServer$default(qwo, str, false, marketUserFavoriteRepository$insertGroup$12, 2, null) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object OLrzqt(qWO qwo, java.lang.String str, Continuation<? super java.util.List<UserGroup>> continuation) throws java.lang.Throwable {
        MarketUserFavoriteRepository$queryAllGroups$1 marketUserFavoriteRepository$queryAllGroups$1;
        if (continuation instanceof MarketUserFavoriteRepository$queryAllGroups$1) {
            marketUserFavoriteRepository$queryAllGroups$1 = (MarketUserFavoriteRepository$queryAllGroups$1) continuation;
            int i = marketUserFavoriteRepository$queryAllGroups$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketUserFavoriteRepository$queryAllGroups$1.label = i - Integer.MIN_VALUE;
            } else {
                marketUserFavoriteRepository$queryAllGroups$1 = new MarketUserFavoriteRepository$queryAllGroups$1(qwo, continuation);
            }
        }
        java.lang.Object objAEQbTJ = marketUserFavoriteRepository$queryAllGroups$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketUserFavoriteRepository$queryAllGroups$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            if (qVD.AEQbTJ.copydefault()) {
                marketUserFavoriteRepository$queryAllGroups$1.L$0 = qwo;
                marketUserFavoriteRepository$queryAllGroups$1.L$1 = str;
                marketUserFavoriteRepository$queryAllGroups$1.label = 1;
                if (syncWithServer$default(qwo, str, false, marketUserFavoriteRepository$queryAllGroups$1, 2, null) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objAEQbTJ);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) marketUserFavoriteRepository$queryAllGroups$1.L$1;
            qwo = (qWO) marketUserFavoriteRepository$queryAllGroups$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        InterfaceC40464qWv interfaceC40464qWv = qwo.AEQbTJ;
        marketUserFavoriteRepository$queryAllGroups$1.L$0 = null;
        marketUserFavoriteRepository$queryAllGroups$1.L$1 = null;
        marketUserFavoriteRepository$queryAllGroups$1.label = 2;
        objAEQbTJ = interfaceC40464qWv.AEQbTJ(str, marketUserFavoriteRepository$queryAllGroups$1);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object KWHzl(qWO qwo, java.lang.String str, Continuation<? super Flow<? extends java.util.List<UserGroup>>> continuation) throws java.lang.Throwable {
        MarketUserFavoriteRepository$cursorUserGroups$1 marketUserFavoriteRepository$cursorUserGroups$1;
        if (continuation instanceof MarketUserFavoriteRepository$cursorUserGroups$1) {
            marketUserFavoriteRepository$cursorUserGroups$1 = (MarketUserFavoriteRepository$cursorUserGroups$1) continuation;
            int i = marketUserFavoriteRepository$cursorUserGroups$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketUserFavoriteRepository$cursorUserGroups$1.label = i - Integer.MIN_VALUE;
            } else {
                marketUserFavoriteRepository$cursorUserGroups$1 = new MarketUserFavoriteRepository$cursorUserGroups$1(qwo, continuation);
            }
        }
        java.lang.Object objOLrzqt = marketUserFavoriteRepository$cursorUserGroups$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketUserFavoriteRepository$cursorUserGroups$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            if (qVD.AEQbTJ.copydefault()) {
                marketUserFavoriteRepository$cursorUserGroups$1.L$0 = qwo;
                marketUserFavoriteRepository$cursorUserGroups$1.L$1 = str;
                marketUserFavoriteRepository$cursorUserGroups$1.label = 1;
                if (syncWithServer$default(qwo, str, false, marketUserFavoriteRepository$cursorUserGroups$1, 2, null) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
                return FlowKt.onEach(FlowKt.onCompletion(FlowKt.onStart((Flow) objOLrzqt, new MarketUserFavoriteRepository$cursorUserGroups$2(null)), new MarketUserFavoriteRepository$cursorUserGroups$3(null)), new MarketUserFavoriteRepository$cursorUserGroups$4(null));
            }
            str = (java.lang.String) marketUserFavoriteRepository$cursorUserGroups$1.L$1;
            qwo = (qWO) marketUserFavoriteRepository$cursorUserGroups$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        InterfaceC40464qWv interfaceC40464qWv = qwo.AEQbTJ;
        marketUserFavoriteRepository$cursorUserGroups$1.L$0 = null;
        marketUserFavoriteRepository$cursorUserGroups$1.L$1 = null;
        marketUserFavoriteRepository$cursorUserGroups$1.label = 2;
        objOLrzqt = interfaceC40464qWv.OLrzqt(str, marketUserFavoriteRepository$cursorUserGroups$1);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        return FlowKt.onEach(FlowKt.onCompletion(FlowKt.onStart((Flow) objOLrzqt, new MarketUserFavoriteRepository$cursorUserGroups$2(null)), new MarketUserFavoriteRepository$cursorUserGroups$3(null)), new MarketUserFavoriteRepository$cursorUserGroups$4(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object copydefault(qWO qwo, java.lang.String str, java.lang.String str2, Continuation<? super Flow<? extends java.util.List<MarketUserFavorite>>> continuation) throws java.lang.Throwable {
        MarketUserFavoriteRepository$cursorUserFav$1 marketUserFavoriteRepository$cursorUserFav$1;
        if (continuation instanceof MarketUserFavoriteRepository$cursorUserFav$1) {
            marketUserFavoriteRepository$cursorUserFav$1 = (MarketUserFavoriteRepository$cursorUserFav$1) continuation;
            int i = marketUserFavoriteRepository$cursorUserFav$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketUserFavoriteRepository$cursorUserFav$1.label = i - Integer.MIN_VALUE;
            } else {
                marketUserFavoriteRepository$cursorUserFav$1 = new MarketUserFavoriteRepository$cursorUserFav$1(qwo, continuation);
            }
        }
        java.lang.Object objKWHzl = marketUserFavoriteRepository$cursorUserFav$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketUserFavoriteRepository$cursorUserFav$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            pUU.EZpvd("MarketUserFavoriteRepository", "cursorUserFav: 开始获取用户收藏数据，userId=" + str + ", groupId=" + str2);
            InterfaceC40464qWv interfaceC40464qWv = qwo.AEQbTJ;
            marketUserFavoriteRepository$cursorUserFav$1.L$0 = str;
            marketUserFavoriteRepository$cursorUserFav$1.L$1 = str2;
            marketUserFavoriteRepository$cursorUserFav$1.label = 1;
            objKWHzl = interfaceC40464qWv.KWHzl(str, str2, marketUserFavoriteRepository$cursorUserFav$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (java.lang.String) marketUserFavoriteRepository$cursorUserFav$1.L$1;
            str = (java.lang.String) marketUserFavoriteRepository$cursorUserFav$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return FlowKt.onCompletion(FlowKt.onStart((Flow) objKWHzl, new MarketUserFavoriteRepository$cursorUserFav$2(str, str2, null)), new MarketUserFavoriteRepository$cursorUserFav$3(str, str2, null));
    }

    @Override // o.InterfaceC40464qWv
    public Flow<java.lang.Boolean> KWHzl(@NotNull java.lang.String str, @NotNull MarketUserFavorite marketUserFavorite) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(marketUserFavorite, "");
        return this.AEQbTJ.KWHzl(str, marketUserFavorite);
    }

    public static /* synthetic */ java.lang.Object EZpvd(qWO qwo, java.lang.String str, MarketUserFavorite marketUserFavorite, Continuation<? super java.lang.Boolean> continuation) {
        return qwo.AEQbTJ.KWHzl(str, marketUserFavorite, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object KWHzl(qWO qwo, java.lang.String str, java.lang.String str2, Continuation<? super java.util.List<MarketUserFavorite>> continuation) throws java.lang.Throwable {
        MarketUserFavoriteRepository$getUserFavoritesByUserId$1 marketUserFavoriteRepository$getUserFavoritesByUserId$1;
        if (continuation instanceof MarketUserFavoriteRepository$getUserFavoritesByUserId$1) {
            marketUserFavoriteRepository$getUserFavoritesByUserId$1 = (MarketUserFavoriteRepository$getUserFavoritesByUserId$1) continuation;
            int i = marketUserFavoriteRepository$getUserFavoritesByUserId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketUserFavoriteRepository$getUserFavoritesByUserId$1.label = i - Integer.MIN_VALUE;
            } else {
                marketUserFavoriteRepository$getUserFavoritesByUserId$1 = new MarketUserFavoriteRepository$getUserFavoritesByUserId$1(qwo, continuation);
            }
        }
        java.lang.Object objAEQbTJ = marketUserFavoriteRepository$getUserFavoritesByUserId$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketUserFavoriteRepository$getUserFavoritesByUserId$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            if (qVD.AEQbTJ.copydefault()) {
                marketUserFavoriteRepository$getUserFavoritesByUserId$1.L$0 = qwo;
                marketUserFavoriteRepository$getUserFavoritesByUserId$1.L$1 = str;
                marketUserFavoriteRepository$getUserFavoritesByUserId$1.L$2 = str2;
                marketUserFavoriteRepository$getUserFavoritesByUserId$1.label = 1;
                if (syncWithServer$default(qwo, str, false, marketUserFavoriteRepository$getUserFavoritesByUserId$1, 2, null) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objAEQbTJ);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (java.lang.String) marketUserFavoriteRepository$getUserFavoritesByUserId$1.L$2;
            str = (java.lang.String) marketUserFavoriteRepository$getUserFavoritesByUserId$1.L$1;
            qwo = (qWO) marketUserFavoriteRepository$getUserFavoritesByUserId$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        InterfaceC40464qWv interfaceC40464qWv = qwo.AEQbTJ;
        marketUserFavoriteRepository$getUserFavoritesByUserId$1.L$0 = null;
        marketUserFavoriteRepository$getUserFavoritesByUserId$1.L$1 = null;
        marketUserFavoriteRepository$getUserFavoritesByUserId$1.L$2 = null;
        marketUserFavoriteRepository$getUserFavoritesByUserId$1.label = 2;
        objAEQbTJ = interfaceC40464qWv.AEQbTJ(str, str2, marketUserFavoriteRepository$getUserFavoritesByUserId$1);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object copydefault(qWO qwo, java.lang.String str, Continuation<? super java.util.List<C40453qWk>> continuation) throws java.lang.Throwable {
        MarketUserFavoriteRepository$getUserGroupData$1 marketUserFavoriteRepository$getUserGroupData$1;
        if (continuation instanceof MarketUserFavoriteRepository$getUserGroupData$1) {
            marketUserFavoriteRepository$getUserGroupData$1 = (MarketUserFavoriteRepository$getUserGroupData$1) continuation;
            int i = marketUserFavoriteRepository$getUserGroupData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketUserFavoriteRepository$getUserGroupData$1.label = i - Integer.MIN_VALUE;
            } else {
                marketUserFavoriteRepository$getUserGroupData$1 = new MarketUserFavoriteRepository$getUserGroupData$1(qwo, continuation);
            }
        }
        java.lang.Object objCopydefault = marketUserFavoriteRepository$getUserGroupData$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = marketUserFavoriteRepository$getUserGroupData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            if (qVD.AEQbTJ.copydefault()) {
                marketUserFavoriteRepository$getUserGroupData$1.L$0 = qwo;
                marketUserFavoriteRepository$getUserGroupData$1.L$1 = str;
                marketUserFavoriteRepository$getUserGroupData$1.label = 1;
                if (syncWithServer$default(qwo, str, false, marketUserFavoriteRepository$getUserGroupData$1, 2, null) == objCopydefault2) {
                    return objCopydefault2;
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objCopydefault);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) marketUserFavoriteRepository$getUserGroupData$1.L$1;
            qwo = (qWO) marketUserFavoriteRepository$getUserGroupData$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        InterfaceC40464qWv interfaceC40464qWv = qwo.AEQbTJ;
        marketUserFavoriteRepository$getUserGroupData$1.L$0 = null;
        marketUserFavoriteRepository$getUserGroupData$1.L$1 = null;
        marketUserFavoriteRepository$getUserGroupData$1.label = 2;
        objCopydefault = interfaceC40464qWv.copydefault(str, marketUserFavoriteRepository$getUserGroupData$1);
        return objCopydefault == objCopydefault2 ? objCopydefault2 : objCopydefault;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object OLrzqt(qWO qwo, java.util.List<MarketUserFavorite> list, java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketUserFavoriteRepository$deleteUserFavorite$1 marketUserFavoriteRepository$deleteUserFavorite$1;
        if (continuation instanceof MarketUserFavoriteRepository$deleteUserFavorite$1) {
            marketUserFavoriteRepository$deleteUserFavorite$1 = (MarketUserFavoriteRepository$deleteUserFavorite$1) continuation;
            int i = marketUserFavoriteRepository$deleteUserFavorite$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketUserFavoriteRepository$deleteUserFavorite$1.label = i - Integer.MIN_VALUE;
            } else {
                marketUserFavoriteRepository$deleteUserFavorite$1 = new MarketUserFavoriteRepository$deleteUserFavorite$1(qwo, continuation);
            }
        }
        MarketUserFavoriteRepository$deleteUserFavorite$1 marketUserFavoriteRepository$deleteUserFavorite$12 = marketUserFavoriteRepository$deleteUserFavorite$1;
        java.lang.Object obj = marketUserFavoriteRepository$deleteUserFavorite$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketUserFavoriteRepository$deleteUserFavorite$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketUserFavoriteRepository$deleteUserFavorite$2 marketUserFavoriteRepository$deleteUserFavorite$2 = new MarketUserFavoriteRepository$deleteUserFavorite$2(qwo, list, str, null);
            marketUserFavoriteRepository$deleteUserFavorite$12.L$0 = qwo;
            marketUserFavoriteRepository$deleteUserFavorite$12.label = 1;
            if (qwo.copydefault(marketUserFavoriteRepository$deleteUserFavorite$2, marketUserFavoriteRepository$deleteUserFavorite$12) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            qwo = (qWO) marketUserFavoriteRepository$deleteUserFavorite$12.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        qWO qwo2 = qwo;
        java.lang.String strKWHzl = C55686xod.KWHzl();
        marketUserFavoriteRepository$deleteUserFavorite$12.L$0 = null;
        marketUserFavoriteRepository$deleteUserFavorite$12.label = 2;
        if (syncWithServer$default(qwo2, strKWHzl, false, marketUserFavoriteRepository$deleteUserFavorite$12, 2, null) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object syncWithServer$default(qWO qwo, java.lang.String str, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncWithServer");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return qwo.OLrzqt(str, z, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketUserFavoriteRepository$syncWithServer$1 marketUserFavoriteRepository$syncWithServer$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        qWO qwo;
        if (continuation instanceof MarketUserFavoriteRepository$syncWithServer$1) {
            marketUserFavoriteRepository$syncWithServer$1 = (MarketUserFavoriteRepository$syncWithServer$1) continuation;
            int i = marketUserFavoriteRepository$syncWithServer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketUserFavoriteRepository$syncWithServer$1.label = i - Integer.MIN_VALUE;
            } else {
                marketUserFavoriteRepository$syncWithServer$1 = new MarketUserFavoriteRepository$syncWithServer$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = marketUserFavoriteRepository$syncWithServer$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = marketUserFavoriteRepository$syncWithServer$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            pUU.KWHzl("MarketUserFavoriteRepository", "syncWithServer() called with: userId = ");
            Result.Application application2 = Result.Companion;
            InterfaceC40459qWq interfaceC40459qWq = this.OLrzqt;
            marketUserFavoriteRepository$syncWithServer$1.L$0 = this;
            marketUserFavoriteRepository$syncWithServer$1.L$1 = str;
            marketUserFavoriteRepository$syncWithServer$1.Z$0 = z;
            marketUserFavoriteRepository$syncWithServer$1.label = 1;
            objCopydefault = interfaceC40459qWq.copydefault(str, marketUserFavoriteRepository$syncWithServer$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            qwo = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = marketUserFavoriteRepository$syncWithServer$1.Z$0;
                C56391yDq.AEQbTJ(objCopydefault);
                qVD.AEQbTJ.AEQbTJ(false);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("MarketUserFavoriteRepository", "syncWithServer() error:" + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
                    if (z) {
                        throw thM7380exceptionOrNullimpl;
                    }
                }
                return Unit.INSTANCE;
            }
            z = marketUserFavoriteRepository$syncWithServer$1.Z$0;
            str = (java.lang.String) marketUserFavoriteRepository$syncWithServer$1.L$1;
            qwo = (qWO) marketUserFavoriteRepository$syncWithServer$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        InterfaceC40464qWv interfaceC40464qWv = qwo.AEQbTJ;
        marketUserFavoriteRepository$syncWithServer$1.L$0 = null;
        marketUserFavoriteRepository$syncWithServer$1.L$1 = null;
        marketUserFavoriteRepository$syncWithServer$1.Z$0 = z;
        marketUserFavoriteRepository$syncWithServer$1.label = 2;
        if (interfaceC40464qWv.copydefault(str, (java.util.List<C40453qWk>) objCopydefault, marketUserFavoriteRepository$syncWithServer$1) == objCopydefault2) {
            return objCopydefault2;
        }
        qVD.AEQbTJ.AEQbTJ(false);
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object AEQbTJ(qWO qwo, java.lang.String str, java.util.List<MarketUserFavorite> list, java.lang.String str2, boolean z, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketUserFavoriteRepository$replaceFavorites$1 marketUserFavoriteRepository$replaceFavorites$1;
        qWO qwo2;
        java.lang.String str3;
        if (continuation instanceof MarketUserFavoriteRepository$replaceFavorites$1) {
            marketUserFavoriteRepository$replaceFavorites$1 = (MarketUserFavoriteRepository$replaceFavorites$1) continuation;
            int i = marketUserFavoriteRepository$replaceFavorites$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketUserFavoriteRepository$replaceFavorites$1.label = i - Integer.MIN_VALUE;
            } else {
                marketUserFavoriteRepository$replaceFavorites$1 = new MarketUserFavoriteRepository$replaceFavorites$1(qwo, continuation);
            }
        }
        MarketUserFavoriteRepository$replaceFavorites$1 marketUserFavoriteRepository$replaceFavorites$12 = marketUserFavoriteRepository$replaceFavorites$1;
        java.lang.Object obj = marketUserFavoriteRepository$replaceFavorites$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketUserFavoriteRepository$replaceFavorites$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("MarketUserFavoriteRepository", "replaceFavorites() called with: userId = " + str + ", newFavorites = " + list);
            MarketUserFavoriteRepository$replaceFavorites$2 marketUserFavoriteRepository$replaceFavorites$2 = new MarketUserFavoriteRepository$replaceFavorites$2(qwo, str, list, str2, z, null);
            marketUserFavoriteRepository$replaceFavorites$12.L$0 = qwo;
            marketUserFavoriteRepository$replaceFavorites$12.L$1 = str;
            marketUserFavoriteRepository$replaceFavorites$12.label = 1;
            if (qwo.copydefault(marketUserFavoriteRepository$replaceFavorites$2, marketUserFavoriteRepository$replaceFavorites$12) == objCopydefault) {
                return objCopydefault;
            }
            qwo2 = qwo;
            str3 = str;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            str3 = (java.lang.String) marketUserFavoriteRepository$replaceFavorites$12.L$1;
            qwo2 = (qWO) marketUserFavoriteRepository$replaceFavorites$12.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        marketUserFavoriteRepository$replaceFavorites$12.L$0 = null;
        marketUserFavoriteRepository$replaceFavorites$12.L$1 = null;
        marketUserFavoriteRepository$replaceFavorites$12.label = 2;
        if (syncWithServer$default(qwo2, str3, false, marketUserFavoriteRepository$replaceFavorites$12, 2, null) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object KWHzl(qWO qwo, MarketUserFavorite marketUserFavorite, java.lang.String str, boolean z, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketUserFavoriteRepository$insertUserFavorite$1 marketUserFavoriteRepository$insertUserFavorite$1;
        if (continuation instanceof MarketUserFavoriteRepository$insertUserFavorite$1) {
            marketUserFavoriteRepository$insertUserFavorite$1 = (MarketUserFavoriteRepository$insertUserFavorite$1) continuation;
            int i = marketUserFavoriteRepository$insertUserFavorite$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketUserFavoriteRepository$insertUserFavorite$1.label = i - Integer.MIN_VALUE;
            } else {
                marketUserFavoriteRepository$insertUserFavorite$1 = new MarketUserFavoriteRepository$insertUserFavorite$1(qwo, continuation);
            }
        }
        java.lang.Object obj = marketUserFavoriteRepository$insertUserFavorite$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketUserFavoriteRepository$insertUserFavorite$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC40459qWq interfaceC40459qWq = qwo.OLrzqt;
            marketUserFavoriteRepository$insertUserFavorite$1.L$0 = qwo;
            marketUserFavoriteRepository$insertUserFavorite$1.Z$0 = z;
            marketUserFavoriteRepository$insertUserFavorite$1.label = 1;
            if (InterfaceC40459qWq.ActionBar.insertUserFavorite$default(interfaceC40459qWq, marketUserFavorite, str, false, marketUserFavoriteRepository$insertUserFavorite$1, 4, null) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            z = marketUserFavoriteRepository$insertUserFavorite$1.Z$0;
            qwo = (qWO) marketUserFavoriteRepository$insertUserFavorite$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        java.lang.String strKWHzl = C55686xod.KWHzl();
        marketUserFavoriteRepository$insertUserFavorite$1.L$0 = null;
        marketUserFavoriteRepository$insertUserFavorite$1.label = 2;
        if (qwo.OLrzqt(strKWHzl, z, marketUserFavoriteRepository$insertUserFavorite$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object AEQbTJ(qWO qwo, MarketUserFavorite marketUserFavorite, java.lang.String str, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketUserFavoriteRepository$setTop$1 marketUserFavoriteRepository$setTop$1;
        if (continuation instanceof MarketUserFavoriteRepository$setTop$1) {
            marketUserFavoriteRepository$setTop$1 = (MarketUserFavoriteRepository$setTop$1) continuation;
            int i = marketUserFavoriteRepository$setTop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketUserFavoriteRepository$setTop$1.label = i - Integer.MIN_VALUE;
            } else {
                marketUserFavoriteRepository$setTop$1 = new MarketUserFavoriteRepository$setTop$1(qwo, continuation);
            }
        }
        MarketUserFavoriteRepository$setTop$1 marketUserFavoriteRepository$setTop$12 = marketUserFavoriteRepository$setTop$1;
        java.lang.Object obj = marketUserFavoriteRepository$setTop$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketUserFavoriteRepository$setTop$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketUserFavoriteRepository$setTop$2 marketUserFavoriteRepository$setTop$2 = new MarketUserFavoriteRepository$setTop$2(qwo, marketUserFavorite, str, null);
            marketUserFavoriteRepository$setTop$12.L$0 = qwo;
            marketUserFavoriteRepository$setTop$12.label = 1;
            if (qwo.copydefault(marketUserFavoriteRepository$setTop$2, marketUserFavoriteRepository$setTop$12) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            qwo = (qWO) marketUserFavoriteRepository$setTop$12.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        qWO qwo2 = qwo;
        java.lang.String strKWHzl = C55686xod.KWHzl();
        marketUserFavoriteRepository$setTop$12.L$0 = null;
        marketUserFavoriteRepository$setTop$12.label = 2;
        if (syncWithServer$default(qwo2, strKWHzl, false, marketUserFavoriteRepository$setTop$12, 2, null) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public final java.lang.Object copydefault(Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function1, Continuation<? super Unit> continuation) {
        java.lang.Object objInvoke = function1.invoke(continuation);
        return objInvoke == C56442yFn.copydefault() ? objInvoke : Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object copydefault(qWO qwo, java.lang.String str, java.util.List<C40453qWk> list, Continuation<? super Unit> continuation) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C40453qWk) it.next()).KWHzl().getGroupName());
        }
        pUU.KWHzl("MarketUserFavoriteRepository", "groupName from http : " + arrayList);
        java.lang.Object objWithContext = BuildersKt.withContext(NonCancellable.INSTANCE, new MarketUserFavoriteRepository$saveResponseToDataBase$2(qwo, str, list, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
