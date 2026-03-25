package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.NewSignCallbackBean;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class dFN {

    public static final class StateListAnimator extends TypeToken<java.util.List<? extends java.lang.String>> {
    }

    public static /* synthetic */ void startSignDappWithReport$default(java.lang.String str, android.content.Context context, DappSignArgs dappSignArgs, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        if ((i & 16) != 0) {
            function12 = null;
        }
        copydefault(str, context, dappSignArgs, (Function1<? super android.os.Bundle, Unit>) function1, (Function1<? super NewSignCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) function12);
    }

    public static final void copydefault(@NotNull final java.lang.String str, @NotNull android.content.Context context, @NotNull DappSignArgs dappSignArgs, final Function1<? super android.os.Bundle, Unit> function1, Function1<? super NewSignCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dappSignArgs, "");
        java.lang.String walletId = dappSignArgs.getWalletId();
        final long jValueOf = C33129mqd.valueOf(dappSignArgs.getChainId());
        final InterfaceC9738bbJ interfaceC9738bbJOLrzqt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().OLrzqt(walletId);
        final PlatformItem dapp = dappSignArgs.getDapp();
        InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.OLrzqt(InterfaceC9854bdT.class);
        if (interfaceC9854bdT != null) {
            interfaceC9854bdT.EZpvd(context, dappSignArgs, new Function1() { // from class: o.dFS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dFN.AEQbTJ(function1, jValueOf, str, interfaceC9738bbJOLrzqt, dapp, (android.os.Bundle) obj);
                }
            }, function12);
        }
        copydefault(interfaceC9738bbJOLrzqt, str, jValueOf, dapp);
    }

    public static final Unit AEQbTJ(Function1 function1, long j, java.lang.String str, InterfaceC9738bbJ interfaceC9738bbJ, PlatformItem platformItem, android.os.Bundle bundle) {
        if (function1 != null) {
            function1.invoke(bundle);
        }
        try {
            Result.Application application = Result.Companion;
            if (bundle != null && bundle.getInt("result") == -1 && C15114dyH.AEQbTJ(j)) {
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "signPsbt")) {
                    KWHzl(bundle, interfaceC9738bbJ != null ? interfaceC9738bbJ.EZpvd(j) : null, platformItem, j);
                } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "signPsbts")) {
                    OLrzqt(bundle, interfaceC9738bbJ != null ? interfaceC9738bbJ.EZpvd(j) : null, platformItem, j);
                }
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void startContractInteractionWithReport$default(java.lang.String str, android.content.Context context, DappInteractionArgs dappInteractionArgs, Function1 function1, Function1 function12, Function1 function13, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            function13 = null;
        }
        AEQbTJ(str, context, dappInteractionArgs, (Function1<? super android.os.Bundle, Unit>) function1, (Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) function12, (Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) function13);
    }

    public static final void AEQbTJ(@NotNull final java.lang.String str, @NotNull android.content.Context context, @NotNull final DappInteractionArgs dappInteractionArgs, @NotNull final Function1<? super android.os.Bundle, Unit> function1, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.lang.String walletId = dappInteractionArgs.getWalletId();
        final long jValueOf = C33129mqd.valueOf(dappInteractionArgs.getChainId());
        final InterfaceC9738bbJ interfaceC9738bbJOLrzqt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().OLrzqt(walletId);
        InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.OLrzqt(InterfaceC9854bdT.class);
        if (interfaceC9854bdT != null) {
            interfaceC9854bdT.KWHzl(context, dappInteractionArgs, new Function1() { // from class: o.dFQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dFN.KWHzl(function1, interfaceC9738bbJOLrzqt, jValueOf, str, dappInteractionArgs, (android.os.Bundle) obj);
                }
            }, function12, function13);
        }
        copydefault(interfaceC9738bbJOLrzqt, str, jValueOf, dappInteractionArgs.getDapp());
    }

    public static final Unit KWHzl(Function1 function1, InterfaceC9738bbJ interfaceC9738bbJ, long j, java.lang.String str, DappInteractionArgs dappInteractionArgs, android.os.Bundle bundle) {
        function1.invoke(bundle);
        try {
            Result.Application application = Result.Companion;
            if (bundle != null && bundle.getInt("result") == -1) {
                copydefault(interfaceC9738bbJ != null ? interfaceC9738bbJ.EZpvd(j) : null, str, j, dappInteractionArgs.getDapp(), bundle.getString("tx_hash"));
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void startTransferDappWithReport$default(java.lang.String str, android.content.Context context, DappInteractionArgs dappInteractionArgs, Function1 function1, Function1 function12, Function1 function13, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            function13 = null;
        }
        EZpvd(str, context, dappInteractionArgs, (Function1<? super android.os.Bundle, Unit>) function1, (Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) function12, (Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>>) function13);
    }

    public static final void EZpvd(@NotNull final java.lang.String str, @NotNull android.content.Context context, @NotNull final DappInteractionArgs dappInteractionArgs, @NotNull final Function1<? super android.os.Bundle, Unit> function1, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.lang.String walletId = dappInteractionArgs.getWalletId();
        final long jValueOf = C33129mqd.valueOf(dappInteractionArgs.getChainId());
        final InterfaceC9738bbJ interfaceC9738bbJOLrzqt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().OLrzqt(walletId);
        InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.OLrzqt(InterfaceC9854bdT.class);
        if (interfaceC9854bdT != null) {
            interfaceC9854bdT.EZpvd(context, dappInteractionArgs, new Function1() { // from class: o.dFR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dFN.gEmmrt(function1, interfaceC9738bbJOLrzqt, jValueOf, str, dappInteractionArgs, (android.os.Bundle) obj);
                }
            }, function12, function13);
        }
        copydefault(interfaceC9738bbJOLrzqt, str, jValueOf, dappInteractionArgs.getDapp());
    }

    public static final Unit gEmmrt(Function1 function1, InterfaceC9738bbJ interfaceC9738bbJ, long j, java.lang.String str, DappInteractionArgs dappInteractionArgs, android.os.Bundle bundle) {
        function1.invoke(bundle);
        try {
            Result.Application application = Result.Companion;
            if (bundle != null && bundle.getInt("result") == -1) {
                copydefault(interfaceC9738bbJ != null ? interfaceC9738bbJ.EZpvd(j) : null, str, j, dappInteractionArgs.getDapp(), bundle.getString("tx_hash"));
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(@NotNull final java.lang.String str, @NotNull android.content.Context context, @NotNull final DappInteractionArgs dappInteractionArgs, @NotNull final Function1<? super android.os.Bundle, Unit> function1, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.lang.String walletId = dappInteractionArgs.getWalletId();
        final long jValueOf = C33129mqd.valueOf(dappInteractionArgs.getChainId());
        final InterfaceC9738bbJ interfaceC9738bbJOLrzqt = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().OLrzqt(walletId);
        InterfaceC9854bdT interfaceC9854bdT = (InterfaceC9854bdT) C43251rlk.OLrzqt(InterfaceC9854bdT.class);
        if (interfaceC9854bdT != null) {
            interfaceC9854bdT.AEQbTJ(context, dappInteractionArgs, new Function1() { // from class: o.dFL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dFN.copydefault(function1, interfaceC9738bbJOLrzqt, jValueOf, str, dappInteractionArgs, (android.os.Bundle) obj);
                }
            }, function12);
        }
        copydefault(interfaceC9738bbJOLrzqt, str, jValueOf, dappInteractionArgs.getDapp());
    }

    public static final Unit copydefault(Function1 function1, InterfaceC9738bbJ interfaceC9738bbJ, long j, java.lang.String str, DappInteractionArgs dappInteractionArgs, android.os.Bundle bundle) {
        function1.invoke(bundle);
        try {
            Result.Application application = Result.Companion;
            if (bundle != null && bundle.getInt("result") == -1) {
                copydefault(interfaceC9738bbJ != null ? interfaceC9738bbJ.EZpvd(j) : null, str, j, dappInteractionArgs.getDapp(), bundle != null ? bundle.getString("tx_hash") : null);
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(@NotNull android.os.Bundle bundle, java.lang.String str, PlatformItem platformItem, long j) {
        Intrinsics.checkNotNullParameter(bundle, "");
        try {
            Result.Application application = Result.Companion;
            java.lang.String string = bundle.getString("data");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List list = (java.util.List) new Gson().fromJson(string, new StateListAnimator().getType());
            Intrinsics.copydefault(list);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C15151dys.KWHzl(C33129mqd.gEmmrt((java.lang.String) it.next()), j));
            }
            copydefault(str, "signPsbts", j, platformItem, CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final void KWHzl(@NotNull android.os.Bundle bundle, java.lang.String str, PlatformItem platformItem, long j) {
        Intrinsics.checkNotNullParameter(bundle, "");
        try {
            Result.Application application = Result.Companion;
            copydefault(str, "signPsbt", j, platformItem, C15151dys.KWHzl(bundle.getString("data"), j));
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final void copydefault(InterfaceC9738bbJ interfaceC9738bbJ, @NotNull java.lang.String str, long j, PlatformItem platformItem) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            Unit unit = null;
            if (interfaceC9738bbJ != null) {
                C14742drG.KWHzl.EZpvd(interfaceC9738bbJ.EZpvd(j), str, j, platformItem);
                C15151dys.AEQbTJ(platformItem != null ? platformItem.getUrl() : null, C33129mqd.gEmmrt(java.lang.Long.valueOf(j)), interfaceC9738bbJ.EZpvd(j), str, "", "NO");
                unit = Unit.INSTANCE;
            }
            Result.m7377constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final void copydefault(java.lang.String str, @NotNull java.lang.String str2, long j, PlatformItem platformItem, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            Result.Application application = Result.Companion;
            C14742drG.KWHzl.AEQbTJ(str, str2, j, platformItem, str3);
            C15151dys.AEQbTJ(platformItem != null ? platformItem.getUrl() : null, C33129mqd.gEmmrt(java.lang.Long.valueOf(j)), str, str2, str3, "YES");
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}
