package o;

import com.okinc.market.watch.dao.MarketUserFavoriteDao$replaceUserGroupsWithFavorites$1;
import com.okinc.market.watch.data.GroupMarketUserFavorite;
import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.market.watch.data.UserGroup;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface qVF {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<C40453qWk> list, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation);

    java.util.List<UserGroup> AEQbTJ(@NotNull java.lang.String str);

    Flow<java.util.List<MarketUserFavorite>> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    boolean AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object EZpvd(@NotNull java.util.List<MarketUserFavorite> list, @NotNull Continuation<? super Unit> continuation);

    java.util.List<MarketUserFavorite> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    void EZpvd(@NotNull MarketUserFavorite marketUserFavorite);

    boolean EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation);

    Flow<java.lang.Boolean> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4);

    java.lang.Object OLrzqt(@NotNull UserGroup userGroup, @NotNull Continuation<? super Unit> continuation);

    Flow<java.util.List<MarketUserFavorite>> OLrzqt(@NotNull java.lang.String str);

    Flow<java.lang.Boolean> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6);

    void OLrzqt(@NotNull MarketUserFavorite marketUserFavorite);

    void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4);

    java.lang.Object copydefault(@NotNull GroupMarketUserFavorite groupMarketUserFavorite, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<C40453qWk>> continuation);

    java.util.List<MarketUserFavorite> copydefault(@NotNull java.lang.String str);

    Flow<java.lang.Boolean> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4);

    void copydefault(@NotNull MarketUserFavorite marketUserFavorite);

    void copydefault(@NotNull java.util.List<MarketUserFavorite> list);

    boolean copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6);

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application {
        public static void AEQbTJ(@NotNull qVF qvf, @NotNull MarketUserFavorite marketUserFavorite) {
            Intrinsics.checkNotNullParameter(marketUserFavorite, "");
            qvf.OLrzqt(marketUserFavorite.getUserId(), marketUserFavorite.getInstId(), marketUserFavorite.getInstType(), marketUserFavorite.getAlias());
        }

        public static /* synthetic */ Flow isUserFavorite$default(qVF qvf, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
            if (obj == null) {
                return qvf.OLrzqt(str, str2, str3, str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isUserFavorite");
        }

        public static /* synthetic */ Flow isUserDexFavorite$default(qVF qvf, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isUserDexFavorite");
            }
            if ((i & 4) != 0) {
                str3 = "";
            }
            if ((i & 8) != 0) {
                str4 = "";
            }
            return qvf.KWHzl(str, str2, str3, str4);
        }

        public static /* synthetic */ boolean checkUserDexFavorite$default(qVF qvf, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkUserDexFavorite");
            }
            if ((i & 4) != 0) {
                str3 = "";
            }
            if ((i & 8) != 0) {
                str4 = "";
            }
            return qvf.EZpvd(str, str2, str3, str4);
        }

        public static /* synthetic */ boolean checkUserFavorite$default(qVF qvf, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
            if (obj == null) {
                return qvf.copydefault(str, str2, str3, str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkUserFavorite");
        }

        public static void OLrzqt(@NotNull qVF qvf, @NotNull MarketUserFavorite marketUserFavorite) {
            Intrinsics.checkNotNullParameter(marketUserFavorite, "");
            qvf.EZpvd(marketUserFavorite);
            qvf.OLrzqt(marketUserFavorite);
        }

        public static java.lang.Object copydefault(@NotNull qVF qvf, @NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<C40453qWk>> continuation) {
            java.util.List<UserGroup> listAEQbTJ = qvf.AEQbTJ(str);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            for (UserGroup userGroup : listAEQbTJ) {
                arrayList.add(new C40453qWk(userGroup, qvf.EZpvd(userGroup.getGroupName(), str)));
            }
            return arrayList;
        }

        /* JADX DEBUG: Duplicate block (B:51:0x0150) to fix multi-entry loop: BACK_EDGE: B:51:0x0150 -> B:52:0x015f */
        /* JADX DEBUG: Duplicate block (B:85:0x01f8) to fix multi-entry loop: BACK_EDGE: B:85:0x01f8 -> B:86:0x0202 */
        /* JADX WARN: Can't wrap try/catch for region: R(18:54|(1:93)|55|56|(1:58)(1:59)|60|(1:62)|63|64|99|65|66|97|67|68|95|69|(1:71)(8:72|73|74|86|(1:88)|89|52|(3:90|45|(2:91|92)(0))(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x01e7, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x01e9, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x01ea, code lost:
        
            r8 = r21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x01ed, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x01ee, code lost:
        
            r8 = r21;
            r7 = r22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x01f6, code lost:
        
            r15 = r7;
            r14 = r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x01f8, code lost:
        
            r6 = kotlin.Result.Companion;
            r0 = kotlin.Result.m7377constructorimpl(o.C56391yDq.EZpvd(r0));
         */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0105 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00e2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0208  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0225  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0229  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01cd -> B:73:0x01d5). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object copydefault(@NotNull qVF qvf, @NotNull java.lang.String str, @NotNull java.util.List<C40453qWk> list, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
            MarketUserFavoriteDao$replaceUserGroupsWithFavorites$1 marketUserFavoriteDao$replaceUserGroupsWithFavorites$1;
            java.util.List<C40453qWk> list2;
            qVF qvf2;
            java.util.List<C40453qWk> list3;
            java.util.Iterator<T> it;
            java.lang.Object next;
            C40453qWk c40453qWk;
            java.lang.String str2;
            java.util.Iterator it2;
            java.lang.Object obj;
            java.util.Iterator it3;
            qVF qvf3;
            java.util.Iterator it4;
            C40453qWk c40453qWk2;
            qVF qvf4;
            java.lang.String str3;
            java.util.Iterator it5;
            C40453qWk c40453qWk3;
            java.util.Iterator it6;
            java.lang.Object objM7377constructorimpl;
            java.util.Iterator it7;
            qVF qvf5;
            java.lang.Throwable thM7380exceptionOrNullimpl;
            qVF qvf6 = qvf;
            java.lang.String str4 = str;
            if (continuation instanceof MarketUserFavoriteDao$replaceUserGroupsWithFavorites$1) {
                marketUserFavoriteDao$replaceUserGroupsWithFavorites$1 = (MarketUserFavoriteDao$replaceUserGroupsWithFavorites$1) continuation;
                int i = marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.label = i - Integer.MIN_VALUE;
                } else {
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1 = new MarketUserFavoriteDao$replaceUserGroupsWithFavorites$1(continuation);
                }
            }
            java.lang.Object obj2 = marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            switch (marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.label) {
                case 0:
                    C56391yDq.AEQbTJ(obj2);
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$0 = qvf6;
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$1 = str4;
                    list2 = list;
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$2 = list2;
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.label = 1;
                    if (qvf6.KWHzl(str4, marketUserFavoriteDao$replaceUserGroupsWithFavorites$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$0 = qvf6;
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$1 = str4;
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$2 = list2;
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.label = 2;
                    if (qvf6.AEQbTJ(str4, marketUserFavoriteDao$replaceUserGroupsWithFavorites$1) != objCopydefault) {
                        return objCopydefault;
                    }
                    qvf2 = qvf6;
                    list3 = list2;
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$0 = qvf2;
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$1 = str4;
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$2 = list3;
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.label = 3;
                    if (qvf2.EZpvd(str4, marketUserFavoriteDao$replaceUserGroupsWithFavorites$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (Intrinsics.EZpvd((java.lang.Object) ((C40453qWk) next).KWHzl().getGroupName(), (java.lang.Object) "ALL")) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    c40453qWk = (C40453qWk) next;
                    if (c40453qWk != null) {
                        java.util.List<MarketUserFavorite> listCopydefault = c40453qWk.copydefault();
                        marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$0 = qvf2;
                        marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$1 = str4;
                        marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$2 = list3;
                        marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.label = 4;
                        if (qvf2.EZpvd(listCopydefault, marketUserFavoriteDao$replaceUserGroupsWithFavorites$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    qVF qvf7 = qvf2;
                    str2 = str4;
                    it2 = list3.iterator();
                    obj = null;
                    if (it2.hasNext()) {
                        C40453qWk c40453qWk4 = (C40453qWk) it2.next();
                        UserGroup userGroupKWHzl = c40453qWk4.KWHzl();
                        marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$0 = qvf7;
                        marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$1 = str2;
                        marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$2 = it2;
                        marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$3 = c40453qWk4;
                        marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$4 = obj;
                        marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.label = 5;
                        if (qvf7.OLrzqt(userGroupKWHzl, marketUserFavoriteDao$replaceUserGroupsWithFavorites$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        java.util.Iterator it8 = it2;
                        java.lang.Object obj3 = obj;
                        it3 = it8;
                        qvf3 = qvf7;
                        it4 = c40453qWk4.copydefault().iterator();
                        c40453qWk2 = c40453qWk4;
                        obj = obj3;
                        if (!it4.hasNext()) {
                            MarketUserFavorite marketUserFavorite = (MarketUserFavorite) it4.next();
                            try {
                            } catch (java.lang.Throwable th) {
                                th = th;
                                it7 = it4;
                                qvf5 = qvf3;
                                break;
                            }
                            Result.Application application = Result.Companion;
                            java.lang.String groupName = c40453qWk2.KWHzl().getGroupName();
                            java.lang.String instId = marketUserFavorite.getInstId();
                            java.lang.String instType = marketUserFavorite.getInstType();
                            java.lang.String alias = marketUserFavorite.getAlias();
                            java.lang.String chainId = marketUserFavorite.getChainId();
                            java.lang.String str5 = chainId == null ? "" : chainId;
                            java.lang.String tokenContractAddress = marketUserFavorite.getTokenContractAddress();
                            if (tokenContractAddress == null) {
                                tokenContractAddress = "";
                            }
                            java.util.Iterator it9 = it4;
                            qVF qvf8 = qvf3;
                            GroupMarketUserFavorite groupMarketUserFavorite = new GroupMarketUserFavorite(0L, groupName, str2, instId, instType, alias, str5, tokenContractAddress, null, 257, null);
                            qvf5 = qvf8;
                            marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$0 = qvf5;
                            marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$1 = str2;
                            marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$2 = it3;
                            marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$3 = c40453qWk2;
                            it7 = it9;
                            marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$4 = it7;
                            marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.label = 6;
                            if (qvf5.copydefault(groupMarketUserFavorite, marketUserFavoriteDao$replaceUserGroupsWithFavorites$1) == objCopydefault) {
                                return objCopydefault;
                            }
                            qvf4 = qvf5;
                            it5 = it3;
                            java.lang.String str6 = str2;
                            c40453qWk3 = c40453qWk2;
                            it6 = it7;
                            str3 = str6;
                            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                            it4 = it6;
                            c40453qWk2 = c40453qWk3;
                            it3 = it5;
                            str2 = str3;
                            qvf3 = qvf4;
                            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                            if (thM7380exceptionOrNullimpl != null) {
                                pUU.AEQbTJ("replaceUserGroupsWithFavorites", "error:" + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
                            }
                            obj = null;
                            if (!it4.hasNext()) {
                                qvf7 = qvf3;
                                it2 = it3;
                                if (it2.hasNext()) {
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    java.util.List<C40453qWk> list4 = (java.util.List) marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$2;
                    str4 = (java.lang.String) marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$1;
                    qVF qvf9 = (qVF) marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    list2 = list4;
                    qvf6 = qvf9;
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$0 = qvf6;
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$1 = str4;
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$2 = list2;
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.label = 2;
                    if (qvf6.AEQbTJ(str4, marketUserFavoriteDao$replaceUserGroupsWithFavorites$1) != objCopydefault) {
                    }
                    break;
                case 2:
                    list3 = (java.util.List) marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$2;
                    str4 = (java.lang.String) marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$1;
                    qvf2 = (qVF) marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$0 = qvf2;
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$1 = str4;
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$2 = list3;
                    marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.label = 3;
                    if (qvf2.EZpvd(str4, marketUserFavoriteDao$replaceUserGroupsWithFavorites$1) == objCopydefault) {
                    }
                    it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    c40453qWk = (C40453qWk) next;
                    if (c40453qWk != null) {
                    }
                    qVF qvf72 = qvf2;
                    str2 = str4;
                    it2 = list3.iterator();
                    obj = null;
                    if (it2.hasNext()) {
                    }
                    break;
                case 3:
                    list3 = (java.util.List) marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$2;
                    str4 = (java.lang.String) marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$1;
                    qvf2 = (qVF) marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                    }
                    c40453qWk = (C40453qWk) next;
                    if (c40453qWk != null) {
                    }
                    qVF qvf722 = qvf2;
                    str2 = str4;
                    it2 = list3.iterator();
                    obj = null;
                    if (it2.hasNext()) {
                    }
                    break;
                case 4:
                    list3 = (java.util.List) marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$2;
                    str4 = (java.lang.String) marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$1;
                    qvf2 = (qVF) marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    qVF qvf7222 = qvf2;
                    str2 = str4;
                    it2 = list3.iterator();
                    obj = null;
                    if (it2.hasNext()) {
                    }
                    break;
                case 5:
                    C40453qWk c40453qWk5 = (C40453qWk) marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$3;
                    java.util.Iterator it10 = (java.util.Iterator) marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$2;
                    str2 = (java.lang.String) marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$1;
                    qVF qvf10 = (qVF) marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    it3 = it10;
                    qvf3 = qvf10;
                    it4 = c40453qWk5.copydefault().iterator();
                    c40453qWk2 = c40453qWk5;
                    obj = null;
                    if (!it4.hasNext()) {
                    }
                    break;
                case 6:
                    it6 = (java.util.Iterator) marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$4;
                    c40453qWk3 = (C40453qWk) marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$3;
                    it5 = (java.util.Iterator) marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$2;
                    str3 = (java.lang.String) marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$1;
                    qvf4 = (qVF) marketUserFavoriteDao$replaceUserGroupsWithFavorites$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj2);
                    } catch (java.lang.Throwable th2) {
                        it4 = it6;
                        c40453qWk2 = c40453qWk3;
                        it3 = it5;
                        str2 = str3;
                        qvf3 = qvf4;
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl != null) {
                        }
                        obj = null;
                        if (!it4.hasNext()) {
                        }
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    it4 = it6;
                    c40453qWk2 = c40453qWk3;
                    it3 = it5;
                    str2 = str3;
                    qvf3 = qvf4;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    obj = null;
                    if (!it4.hasNext()) {
                    }
                    break;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public static void AEQbTJ(@NotNull qVF qvf, @NotNull java.util.List<MarketUserFavorite> list) {
            Intrinsics.checkNotNullParameter(list, "");
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                qvf.EZpvd((MarketUserFavorite) it.next());
            }
        }
    }
}
