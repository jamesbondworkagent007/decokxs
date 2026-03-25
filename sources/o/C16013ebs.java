package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonProofItem;
import com.okinc.business.defi.biz.core.transaction.sign.ton.bean.TonProofReply;
import com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo;
import com.okinc.business.defi.wallet.common.okxconnect.model.DAppWrapper;
import com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException;
import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest;
import com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppConnectRequestHelper$getConnectAndSignData$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppConnectRequestHelper$getConnectRequestResponse$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppConnectRequestHelper$getValidActivity$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppConnectRequestHelper$isMPCAAWalletSupported$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppConnectRequestHelper$moveBackToDApp$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppConnectRequestHelper$onRequestAccounts$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppConnectRequestHelper$onTonProof$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppConnectRequestHelper$signMessage$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppConnectRequestHelper$signMessage$2$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppConnectRequestHelper$updateCosmosReferencesAndChainIds$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppConnectRequestHelper$validateCanConnect$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppConnectRequestHelper$validateChainRegistration$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppConnectRequestHelper$validateTonWallet$2;
import com.okinc.business.defi.wallet.common.tonconnect.ValidateCanConnectResult;
import com.okinc.business.defi.wallet.common.tonconnect.model.TonNetwork;
import com.reown.android.push.notifications.PushMessagingService;
import java.security.MessageDigest;
import java.util.UUID;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import o.InterfaceC13987dcu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ebs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16013ebs {
    public final C10948byA AEQbTJ;
    public final C54819xWm AYXKKw;
    public final InterfaceC54829xWw AhwBna;
    public final java.util.Set<java.lang.String> AkhnZx;
    public final C8396bBt DbNXlk;
    public final C15974ebF EZpvd;
    public final C10598brV KWHzl;
    public final C15939eaX OLrzqt;
    public final InterfaceC9844bdJ copydefault;
    public final CoroutineDispatcher djBIcL;
    public final CoroutineDispatcher gEmmrt;
    public final C16011ebq isConnected;
    public final InterfaceC56387yDm valueOf;
    public final C13934dbu values;

    public C16013ebs(@NotNull C54819xWm c54819xWm, @NotNull C16011ebq c16011ebq, @NotNull C10948byA c10948byA, @NotNull C10598brV c10598brV, @NotNull C15939eaX c15939eaX, @NotNull C15974ebF c15974ebF, @NotNull C13934dbu c13934dbu, @NotNull InterfaceC9844bdJ interfaceC9844bdJ, @NotNull InterfaceC54829xWw interfaceC54829xWw, @NotNull C8396bBt c8396bBt, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2) {
        Intrinsics.checkNotNullParameter(c54819xWm, "");
        Intrinsics.checkNotNullParameter(c16011ebq, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(c10598brV, "");
        Intrinsics.checkNotNullParameter(c15939eaX, "");
        Intrinsics.checkNotNullParameter(c15974ebF, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(interfaceC9844bdJ, "");
        Intrinsics.checkNotNullParameter(interfaceC54829xWw, "");
        Intrinsics.checkNotNullParameter(c8396bBt, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        this.AYXKKw = c54819xWm;
        this.isConnected = c16011ebq;
        this.AEQbTJ = c10948byA;
        this.KWHzl = c10598brV;
        this.OLrzqt = c15939eaX;
        this.EZpvd = c15974ebF;
        this.values = c13934dbu;
        this.copydefault = interfaceC9844bdJ;
        this.AhwBna = interfaceC54829xWw;
        this.DbNXlk = c8396bBt;
        this.djBIcL = coroutineDispatcher;
        this.gEmmrt = coroutineDispatcher2;
        InterfaceC13987dcu.Fragment.ActionBar actionBar = InterfaceC13987dcu.Fragment.Companion;
        this.AkhnZx = yEE.AhwBna(actionBar.OLrzqt(), actionBar.fetchVPNInfo(), actionBar.gEmmrt(), actionBar.djBIcL(), actionBar.valueOf(), actionBar.AhwBna(), actionBar.KWHzl(), actionBar.EZpvd(), actionBar.AEQbTJ(), actionBar.copydefault(), actionBar.values(), actionBar.AYXKKw());
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.ebt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C16013ebs.KWHzl();
            }
        });
    }

    public final android.app.Activity copydefault() {
        return this.AYXKKw.AEQbTJ();
    }

    public final Json OLrzqt() {
        return (Json) this.valueOf.getValue();
    }

    public static final Json KWHzl() {
        return JsonKt.Json$default(null, new Function1() { // from class: o.eby
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C16013ebs.EZpvd((JsonBuilder) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    public final boolean EZpvd(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        return C33129mqd.OLrzqt((java.lang.CharSequence) bundle.getString("param")) || C33129mqd.OLrzqt((java.lang.CharSequence) bundle.getString(PushMessagingService.KEY_TOPIC));
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() >= 6) {
            java.lang.String strSubstring = str.substring(0, str.length() - 6);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            java.lang.String strSubstring2 = str.substring(str.length() - 6);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            return new kotlin.Pair<>(strSubstring, strSubstring2);
        }
        return new kotlin.Pair<>(str, "");
    }

    public final boolean OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strAEQbTJ = AEQbTJ(str2);
        if (strAEQbTJ == null) {
            return true;
        }
        if (strAEQbTJ.length() >= 6 && str.length() == 6) {
            java.lang.String strSubstring = strAEQbTJ.substring(strAEQbTJ.length() - 6);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            if (Intrinsics.EZpvd((java.lang.Object) strSubstring, (java.lang.Object) str)) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            java.lang.String string = new java.math.BigInteger(1, messageDigest.digest(bytes)).toString(16);
            while (string.length() < 32) {
                string = "0" + string;
            }
            return string;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("DAppConnectRequestHelper", "calculateMD5Hash", e);
            return null;
        }
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl((DAppConnectRequest) OLrzqt().decodeFromString(DAppConnectRequest.Companion.serializer(), str));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final java.lang.Object KWHzl(@NotNull DAppConnectRequest dAppConnectRequest, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull Continuation<? super ValidateCanConnectResult> continuation) {
        return BuildersKt.withContext(this.djBIcL, new DAppConnectRequestHelper$validateCanConnect$2(dAppConnectRequest, this, abstractC12782ctV, null), continuation);
    }

    public final boolean OLrzqt(@NotNull DAppConnectRequest dAppConnectRequest, @NotNull AbstractC12782ctV abstractC12782ctV) {
        boolean z;
        Intrinsics.checkNotNullParameter(dAppConnectRequest, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (!abstractC12782ctV.zLjUOn() || abstractC12782ctV.QfsBiF()) {
            return false;
        }
        if ((abstractC12782ctV.ORxRYg() || abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) && !abstractC12782ctV.Dmq()) {
            return false;
        }
        java.util.List<java.lang.String> requiredCaipChains = dAppConnectRequest.getRequiredCaipChains();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(requiredCaipChains, 10));
        java.util.Iterator<T> it = requiredCaipChains.iterator();
        while (true) {
            InterfaceC13987dcu.PendingIntent pendingIntentEZpvd = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC13987dcu interfaceC13987dcuAEQbTJ = InterfaceC13987dcu.Companion.AEQbTJ((java.lang.String) it.next());
            if (interfaceC13987dcuAEQbTJ != null) {
                pendingIntentEZpvd = InterfaceC13987dcu.PendingIntent.EZpvd(interfaceC13987dcuAEQbTJ.OLrzqt());
            }
            arrayList.add(pendingIntentEZpvd);
        }
        if (!arrayList.isEmpty()) {
            java.util.Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((InterfaceC13987dcu.PendingIntent) it2.next()) == null) {
                    return false;
                }
            }
        }
        java.util.List<C13983dcq> listCopydefault = C13990dcx.copydefault(abstractC12782ctV);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        java.util.Iterator<T> it3 = listCopydefault.iterator();
        while (it3.hasNext()) {
            arrayList2.add(InterfaceC13987dcu.PendingIntent.EZpvd(((C13983dcq) it3.next()).copydefault().OLrzqt()));
        }
        if (arrayList.isEmpty()) {
            z = true;
        } else {
            java.util.Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                if (!CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends InterfaceC13987dcu.PendingIntent>) ((java.lang.Iterable<? extends java.lang.Object>) arrayList2), (InterfaceC13987dcu.PendingIntent) it4.next())) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        if (dAppConnectRequest.getHasLegacyTonRequest()) {
            return z && abstractC12782ctV.QKudOq();
        }
        if (!zIsEmpty && z) {
            return true;
        }
        DAppConnectRequest.Request.RequestAccounts.Namespace namespace = (DAppConnectRequest.Request.RequestAccounts.Namespace) CollectionsKt___CollectionsKt.zuBGHE(dAppConnectRequest.getOptionalNamespaces());
        if (namespace != null && zIsEmpty && !this.AkhnZx.contains(namespace.getNamespace())) {
            return false;
        }
        java.util.List<java.lang.String> optionalCaipChains = dAppConnectRequest.getOptionalCaipChains();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(optionalCaipChains, 10));
        java.util.Iterator<T> it5 = optionalCaipChains.iterator();
        while (it5.hasNext()) {
            InterfaceC13987dcu interfaceC13987dcuAEQbTJ2 = InterfaceC13987dcu.Companion.AEQbTJ((java.lang.String) it5.next());
            arrayList3.add(interfaceC13987dcuAEQbTJ2 != null ? InterfaceC13987dcu.PendingIntent.EZpvd(interfaceC13987dcuAEQbTJ2.OLrzqt()) : null);
        }
        if (!zIsEmpty || arrayList3.isEmpty()) {
            return false;
        }
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends InterfaceC13987dcu.PendingIntent>) ((java.lang.Iterable<? extends java.lang.Object>) arrayList2), (InterfaceC13987dcu.PendingIntent) it6.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:0x0023 */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest */
    /* JADX DEBUG: Multi-variable search result rejected for r13v10, resolved type: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest */
    /* JADX DEBUG: Multi-variable search result rejected for r13v16, resolved type: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest */
    /* JADX DEBUG: Multi-variable search result rejected for r13v17, resolved type: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest */
    /* JADX DEBUG: Multi-variable search result rejected for r13v18, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v19, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v2, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r13v20, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0118 A[Catch: Exception -> 0x0032, TRY_LEAVE, TryCatch #0 {Exception -> 0x0032, blocks: (B:13:0x002d, B:63:0x010e, B:65:0x0118, B:60:0x00fb), top: B:70:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull DAppConnectRequest dAppConnectRequest, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull Continuation<? super C15937eaV> continuation) throws java.lang.Exception {
        DAppConnectRequestHelper$getConnectAndSignData$1 dAppConnectRequestHelper$getConnectAndSignData$1;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object next;
        C16013ebs c16013ebs;
        java.lang.String str3;
        java.lang.Object first;
        if (continuation instanceof DAppConnectRequestHelper$getConnectAndSignData$1) {
            dAppConnectRequestHelper$getConnectAndSignData$1 = (DAppConnectRequestHelper$getConnectAndSignData$1) continuation;
            int i = dAppConnectRequestHelper$getConnectAndSignData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppConnectRequestHelper$getConnectAndSignData$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppConnectRequestHelper$getConnectAndSignData$1 = new DAppConnectRequestHelper$getConnectAndSignData$1(this, continuation);
            }
        }
        java.lang.Object objAwait = dAppConnectRequestHelper$getConnectAndSignData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppConnectRequestHelper$getConnectAndSignData$1.label;
        AbstractC8610bFv abstractC8610bFv = null;
        try {
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("DAppConnectRequestHelper", "Failed to buildTransaction", e);
            str = dAppConnectRequest;
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAwait);
            if (dAppConnectRequest.getRequiredCaipChains().size() != 1 || dAppConnectRequest.getConnectRequestMethods().size() != 1) {
                return null;
            }
            java.util.List<java.lang.String> listValues = this.EZpvd.values();
            DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod connectRequestMethod = (DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod) CollectionsKt___CollectionsKt.firstOrNull(dAppConnectRequest.getConnectRequestMethods());
            if (!CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listValues), connectRequestMethod != null ? connectRequestMethod.getMethod() : null) || (str2 = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(dAppConnectRequest.getRequestedCaipChains())) == null) {
                return null;
            }
            java.util.Iterator<T> it = C13990dcx.copydefault(abstractC12782ctV).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                long jOLrzqt = ((C13983dcq) next).copydefault().OLrzqt();
                InterfaceC13987dcu interfaceC13987dcuAEQbTJ = InterfaceC13987dcu.Companion.AEQbTJ(str2);
                if (InterfaceC13987dcu.PendingIntent.EZpvd(jOLrzqt, interfaceC13987dcuAEQbTJ != null ? InterfaceC13987dcu.PendingIntent.EZpvd(interfaceC13987dcuAEQbTJ.OLrzqt()) : null)) {
                    break;
                }
            }
            C13983dcq c13983dcq = (C13983dcq) next;
            java.lang.String strEZpvd = c13983dcq != null ? c13983dcq.EZpvd() : null;
            DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod connectRequestMethod2 = (DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod) CollectionsKt___CollectionsKt.firstOrNull(dAppConnectRequest.getConnectRequestMethods());
            if (connectRequestMethod2 == null) {
                return null;
            }
            C15974ebF c15974ebF = this.EZpvd;
            dAppConnectRequestHelper$getConnectAndSignData$1.L$0 = this;
            dAppConnectRequestHelper$getConnectAndSignData$1.L$1 = strEZpvd;
            dAppConnectRequestHelper$getConnectAndSignData$1.label = 1;
            java.lang.Object objOLrzqt = c15974ebF.OLrzqt(connectRequestMethod2, abstractC12782ctV, dAppConnectRequestHelper$getConnectAndSignData$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c16013ebs = this;
            java.lang.String str4 = strEZpvd;
            objAwait = objOLrzqt;
            str3 = str4;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.String str5 = (java.lang.String) dAppConnectRequestHelper$getConnectAndSignData$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
                dAppConnectRequest = str5;
                first = ((kotlin.Pair) objAwait).getFirst();
                str = dAppConnectRequest;
                if (first instanceof AbstractC8610bFv) {
                    abstractC8610bFv = (AbstractC8610bFv) first;
                    str = dAppConnectRequest;
                }
                return new C15937eaV(str, abstractC8610bFv);
            }
            java.lang.String str6 = (java.lang.String) dAppConnectRequestHelper$getConnectAndSignData$1.L$1;
            c16013ebs = (C16013ebs) dAppConnectRequestHelper$getConnectAndSignData$1.L$0;
            C56391yDq.AEQbTJ(objAwait);
            str3 = str6;
        }
        DappSignArgs dappSignArgs = (DappSignArgs) objAwait;
        if (dappSignArgs == null) {
            return null;
        }
        if (str3 == null) {
            return new C15937eaV(null, null);
        }
        AbstractC58260yxt<kotlin.Pair<OKWBaseTransaction<?>, java.lang.String>> abstractC58260yxtCopydefault = c16013ebs.DbNXlk.copydefault(dappSignArgs);
        dAppConnectRequestHelper$getConnectAndSignData$1.L$0 = str3;
        dAppConnectRequestHelper$getConnectAndSignData$1.L$1 = null;
        dAppConnectRequestHelper$getConnectAndSignData$1.label = 2;
        objAwait = RxAwaitKt.await(abstractC58260yxtCopydefault, dAppConnectRequestHelper$getConnectAndSignData$1);
        dAppConnectRequest = str3;
        if (objAwait == objCopydefault) {
            return objCopydefault;
        }
        first = ((kotlin.Pair) objAwait).getFirst();
        str = dAppConnectRequest;
        if (first instanceof AbstractC8610bFv) {
        }
        return new C15937eaV(str, abstractC8610bFv);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod connectRequestMethod, java.util.List<java.lang.String> list, AbstractC8610bFv<?> abstractC8610bFv, Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppConnectRequestHelper$signMessage$1 dAppConnectRequestHelper$signMessage$1;
        C16013ebs c16013ebs;
        DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod connectRequestMethod2;
        java.util.List<java.lang.String> list2;
        AbstractC8610bFv<?> abstractC8610bFv2;
        if (continuation instanceof DAppConnectRequestHelper$signMessage$1) {
            dAppConnectRequestHelper$signMessage$1 = (DAppConnectRequestHelper$signMessage$1) continuation;
            int i = dAppConnectRequestHelper$signMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppConnectRequestHelper$signMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppConnectRequestHelper$signMessage$1 = new DAppConnectRequestHelper$signMessage$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = dAppConnectRequestHelper$signMessage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppConnectRequestHelper$signMessage$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                Result.Application application = Result.Companion;
                pUU.KWHzl("DAppConnectRequestHelper", "start signMessage");
                dAppConnectRequestHelper$signMessage$1.L$0 = connectRequestMethod;
                dAppConnectRequestHelper$signMessage$1.L$1 = list;
                dAppConnectRequestHelper$signMessage$1.L$2 = abstractC8610bFv;
                dAppConnectRequestHelper$signMessage$1.L$3 = this;
                dAppConnectRequestHelper$signMessage$1.label = 1;
                objEZpvd = EZpvd(dAppConnectRequestHelper$signMessage$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c16013ebs = this;
                connectRequestMethod2 = connectRequestMethod;
                list2 = list;
                abstractC8610bFv2 = abstractC8610bFv;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objEZpvd);
                    return Result.m7377constructorimpl((java.lang.String) objEZpvd);
                }
                C16013ebs c16013ebs2 = (C16013ebs) dAppConnectRequestHelper$signMessage$1.L$3;
                AbstractC8610bFv<?> abstractC8610bFv3 = (AbstractC8610bFv) dAppConnectRequestHelper$signMessage$1.L$2;
                java.util.List<java.lang.String> list3 = (java.util.List) dAppConnectRequestHelper$signMessage$1.L$1;
                DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod connectRequestMethod3 = (DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod) dAppConnectRequestHelper$signMessage$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                c16013ebs = c16013ebs2;
                list2 = list3;
                abstractC8610bFv2 = abstractC8610bFv3;
                connectRequestMethod2 = connectRequestMethod3;
            }
            FragmentActivity fragmentActivity = objEZpvd instanceof FragmentActivity ? (FragmentActivity) objEZpvd : null;
            if (fragmentActivity == null) {
                throw new java.lang.Exception("");
            }
            CoroutineDispatcher coroutineDispatcher = c16013ebs.gEmmrt;
            DAppConnectRequestHelper$signMessage$2$1 dAppConnectRequestHelper$signMessage$2$1 = new DAppConnectRequestHelper$signMessage$2$1(c16013ebs, fragmentActivity, abstractC8610bFv2, connectRequestMethod2, list2, null);
            dAppConnectRequestHelper$signMessage$1.L$0 = null;
            dAppConnectRequestHelper$signMessage$1.L$1 = null;
            dAppConnectRequestHelper$signMessage$1.L$2 = null;
            dAppConnectRequestHelper$signMessage$1.L$3 = null;
            dAppConnectRequestHelper$signMessage$1.label = 2;
            objEZpvd = BuildersKt.withContext(coroutineDispatcher, dAppConnectRequestHelper$signMessage$2$1, dAppConnectRequestHelper$signMessage$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            return Result.m7377constructorimpl((java.lang.String) objEZpvd);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final java.lang.Object copydefault(AbstractC12782ctV abstractC12782ctV, java.lang.String str, Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.djBIcL, new DAppConnectRequestHelper$isMPCAAWalletSupported$2(abstractC12782ctV, this, str, null), continuation);
    }

    public final java.lang.Object KWHzl(AbstractC12782ctV abstractC12782ctV, Continuation<? super ValidateCanConnectResult> continuation) {
        return BuildersKt.withContext(this.djBIcL, new DAppConnectRequestHelper$validateTonWallet$2(this, abstractC12782ctV, null), continuation);
    }

    public final java.lang.Object copydefault(long j, AbstractC12782ctV abstractC12782ctV, Continuation<? super ValidateCanConnectResult> continuation) {
        return BuildersKt.withContext(this.djBIcL, new DAppConnectRequestHelper$validateChainRegistration$2(this, j, abstractC12782ctV, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) {
        return BuildersKt.withContext(this.djBIcL, new DAppConnectRequestHelper$updateCosmosReferencesAndChainIds$2(this, null), continuation);
    }

    public final java.util.List<C10854bwM> KWHzl(@NotNull DAppConnectRequest dAppConnectRequest, @NotNull AbstractC12782ctV abstractC12782ctV) {
        java.util.List<java.lang.String> listAhwBna;
        java.util.List<DAppConnectRequest.Request.RequestAccounts.Namespace> requestedNamespaces;
        Intrinsics.checkNotNullParameter(dAppConnectRequest, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        java.util.Set<DAppConnectRequest.Request> requests = dAppConnectRequest.getRequests();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : requests) {
            if (obj instanceof DAppConnectRequest.Request.RequestAccounts) {
                arrayList.add(obj);
            }
        }
        DAppConnectRequest.Request.RequestAccounts requestAccounts = (DAppConnectRequest.Request.RequestAccounts) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (requestAccounts == null || (requestedNamespaces = requestAccounts.getRequestedNamespaces()) == null) {
            listAhwBna = null;
        } else {
            listAhwBna = new java.util.ArrayList<>();
            java.util.Iterator<T> it = requestedNamespaces.iterator();
            while (it.hasNext()) {
                C56406yEe.KWHzl(listAhwBna, AEQbTJ((DAppConnectRequest.Request.RequestAccounts.Namespace) it.next(), abstractC12782ctV));
            }
        }
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        return OLrzqt(listAhwBna, (dAppConnectRequest.isTonRequested() || dAppConnectRequest.getHasLegacyTonRequest()) && abstractC12782ctV.QKudOq());
    }

    public static /* synthetic */ java.lang.Object getConnectRequestResponse$default(C16013ebs c16013ebs, AbstractC12782ctV abstractC12782ctV, DAppConnectRequest dAppConnectRequest, C15937eaV c15937eaV, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            c15937eaV = null;
        }
        return c16013ebs.KWHzl(abstractC12782ctV, dAppConnectRequest, c15937eaV, (Continuation<? super WalletEvent>) continuation);
    }

    public final java.lang.Object KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull DAppConnectRequest dAppConnectRequest, C15937eaV c15937eaV, @NotNull Continuation<? super WalletEvent> continuation) {
        return BuildersKt.withContext(this.djBIcL, new DAppConnectRequestHelper$getConnectRequestResponse$2(c15937eaV, dAppConnectRequest, this, abstractC12782ctV, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.gEmmrt, new DAppConnectRequestHelper$moveBackToDApp$2(str, this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }

    public final WalletEvent.ConnectSuccess.Payload.Response AEQbTJ(AbstractC12782ctV abstractC12782ctV, DAppConnectRequest.Request.TonAddress tonAddress) {
        java.lang.Object next;
        java.lang.String strOLrzqt;
        int i = 2;
        java.lang.String str = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        if (tonAddress == null) {
            return new WalletEvent.ConnectSuccess.Payload.Response.Error("", new OKXConnectException(OKXConnectException.ErrorType.UNKNOWN, str, i, (DefaultConstructorMarker) (b5 == true ? 1 : 0)));
        }
        if (!abstractC12782ctV.QKudOq()) {
            return new WalletEvent.ConnectSuccess.Payload.Response.Error(tonAddress.getName(), new OKXConnectException(OKXConnectException.ErrorType.WALLET_NOT_SUPPORTED, (java.lang.String) (b4 == true ? 1 : 0), i, (DefaultConstructorMarker) (b3 == true ? 1 : 0)));
        }
        try {
            java.lang.String strOLrzqt2 = abstractC12782ctV.OLrzqt(607L);
            C9757bbc c9757bbcDxcTrN = abstractC12782ctV.dxcTrN();
            java.lang.String strAEQbTJ = c9757bbcDxcTrN != null ? c9757bbcDxcTrN.AEQbTJ() : null;
            java.lang.String str2 = strAEQbTJ == null ? "" : strAEQbTJ;
            java.util.Iterator<T> it = abstractC12782ctV.dvKsVJ().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C9756bbb) next).EZpvd() == 0) {
                    break;
                }
            }
            C9756bbb c9756bbb = (C9756bbb) next;
            return new WalletEvent.ConnectSuccess.Payload.Response.TonAddress((java.lang.String) null, (c9756bbb == null || (strOLrzqt = c9756bbb.OLrzqt()) == null) ? abstractC12782ctV.EZpvd(607L) : strOLrzqt, TonNetwork.MAIN_NET, str2, strOLrzqt2, 1, (DefaultConstructorMarker) null);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("DAppConnectRequestHelper", "Failed to get ton address: " + e.getMessage(), e);
            return new WalletEvent.ConnectSuccess.Payload.Response.Error(tonAddress.getName(), new OKXConnectException(OKXConnectException.ErrorType.UNKNOWN, (java.lang.String) (b2 == true ? 1 : 0), i, (DefaultConstructorMarker) (b == true ? 1 : 0)));
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:58:0x0143 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x002b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115 A[Catch: Exception -> 0x0145, TryCatch #1 {Exception -> 0x0145, blocks: (B:46:0x010f, B:48:0x0115, B:52:0x0123, B:53:0x0130, B:39:0x00f3, B:42:0x00fa, B:35:0x00e9), top: B:70:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0130 A[Catch: Exception -> 0x0145, TRY_LEAVE, TryCatch #1 {Exception -> 0x0145, blocks: (B:46:0x010f, B:48:0x0115, B:52:0x0123, B:53:0x0130, B:39:0x00f3, B:42:0x00fa, B:35:0x00e9), top: B:70:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r13v0, types: [int] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(AbstractC12782ctV abstractC12782ctV, DAppConnectRequest.Request.TonProof tonProof, DAppInfo dAppInfo, Continuation<? super WalletEvent.ConnectSuccess.Payload.Response> continuation) throws java.lang.Throwable {
        DAppConnectRequestHelper$onTonProof$1 dAppConnectRequestHelper$onTonProof$1;
        ?? r5;
        ?? r1;
        DAppConnectRequest.Request.TonProof tonProof2;
        C16013ebs c16013ebs;
        ?? r12;
        java.lang.String str;
        C16013ebs c16013ebs2;
        DAppConnectRequest.Request.TonProof tonProof3 = tonProof;
        if (continuation instanceof DAppConnectRequestHelper$onTonProof$1) {
            dAppConnectRequestHelper$onTonProof$1 = (DAppConnectRequestHelper$onTonProof$1) continuation;
            int i = dAppConnectRequestHelper$onTonProof$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppConnectRequestHelper$onTonProof$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppConnectRequestHelper$onTonProof$1 = new DAppConnectRequestHelper$onTonProof$1(this, continuation);
            }
        }
        java.lang.Object obj = dAppConnectRequestHelper$onTonProof$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppConnectRequestHelper$onTonProof$1.label;
        java.lang.String str2 = "";
        ?? r13 = 2;
        r13 = 2;
        java.lang.Object objM7386unboximpl = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                if (tonProof3 == null) {
                    return new WalletEvent.ConnectSuccess.Payload.Response.Error("", new OKXConnectException(OKXConnectException.ErrorType.UNKNOWN, (java.lang.String) (z4 ? 1 : 0), (int) r13, (DefaultConstructorMarker) (z3 ? 1 : 0)));
                }
                if (!abstractC12782ctV.QKudOq()) {
                    return new WalletEvent.ConnectSuccess.Payload.Response.Error(tonProof.getName(), new OKXConnectException(OKXConnectException.ErrorType.WALLET_NOT_SUPPORTED, (java.lang.String) (z2 ? 1 : 0), (int) r13, (DefaultConstructorMarker) (z ? 1 : 0)));
                }
                java.lang.String strEncodeToString = OLrzqt().encodeToString(TonProofItem.Companion.serializer(), new TonProofItem(tonProof.getName(), tonProof.getPayload(), dAppInfo.getUrl()));
                C15974ebF c15974ebF = this.EZpvd;
                java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
                DAppWrapper.DAppSignWrapper dAppSignWrapper = new DAppWrapper.DAppSignWrapper("607", strEncodeToString, null, null, false, null, strEncodeToString, 60, null);
                dAppConnectRequestHelper$onTonProof$1.L$0 = this;
                dAppConnectRequestHelper$onTonProof$1.L$1 = tonProof3;
                dAppConnectRequestHelper$onTonProof$1.label = 1;
                r1 = 2;
                r13 = 0;
                try {
                    java.lang.Object objOLrzqt = c15974ebF.OLrzqt(strDbNXlk, "ton_signProof", dAppSignWrapper, dAppInfo, "okx_connect", (32 & 32) != 0 ? UUID.randomUUID().toString() : null, (Continuation<? super Result<java.lang.String>>) dAppConnectRequestHelper$onTonProof$1);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    c16013ebs = this;
                    objM7386unboximpl = objOLrzqt;
                    r12 = r1;
                } catch (java.lang.Exception e) {
                    e = e;
                    r5 = 0;
                    pUU.AEQbTJ("DAppConnectRequestHelper", "Failed to get ton proof: " + e.getMessage(), e);
                    return new WalletEvent.ConnectSuccess.Payload.Response.Error(tonProof3.getName(), new OKXConnectException(OKXConnectException.ErrorType.UNKNOWN, (java.lang.String) r5, (int) r1, (DefaultConstructorMarker) r5));
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.String str3 = (java.lang.String) dAppConnectRequestHelper$onTonProof$1.L$2;
                    tonProof2 = (DAppConnectRequest.Request.TonProof) dAppConnectRequestHelper$onTonProof$1.L$1;
                    c16013ebs2 = (C16013ebs) dAppConnectRequestHelper$onTonProof$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        str = str3;
                        tonProof3 = tonProof2;
                        r1 = 2;
                        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                            Json jsonOLrzqt = c16013ebs2.OLrzqt();
                            KSerializer<TonProofReply> kSerializerSerializer = TonProofReply.Companion.serializer();
                            if (str != null) {
                                str2 = str;
                            }
                            return WalletEvent.ConnectSuccess.Payload.Response.TonProof.Companion.KWHzl((TonProofReply) jsonOLrzqt.decodeFromString(kSerializerSerializer, str2));
                        }
                        r5 = 0;
                        try {
                            return new WalletEvent.ConnectSuccess.Payload.Response.Error(tonProof3.getName(), new OKXConnectException(OKXConnectException.ErrorType.USER_REJECTED, (java.lang.String) (false ? 1 : 0), r1 == true ? 1 : 0, (DefaultConstructorMarker) (false ? 1 : 0)));
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            pUU.AEQbTJ("DAppConnectRequestHelper", "Failed to get ton proof: " + e.getMessage(), e);
                            return new WalletEvent.ConnectSuccess.Payload.Response.Error(tonProof3.getName(), new OKXConnectException(OKXConnectException.ErrorType.UNKNOWN, (java.lang.String) r5, (int) r1, (DefaultConstructorMarker) r5));
                        }
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        r5 = 0;
                        r1 = 2;
                        tonProof3 = tonProof2;
                        pUU.AEQbTJ("DAppConnectRequestHelper", "Failed to get ton proof: " + e.getMessage(), e);
                        return new WalletEvent.ConnectSuccess.Payload.Response.Error(tonProof3.getName(), new OKXConnectException(OKXConnectException.ErrorType.UNKNOWN, (java.lang.String) r5, (int) r1, (DefaultConstructorMarker) r5));
                    }
                }
                tonProof3 = (DAppConnectRequest.Request.TonProof) dAppConnectRequestHelper$onTonProof$1.L$1;
                c16013ebs = (C16013ebs) dAppConnectRequestHelper$onTonProof$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                r12 = 2;
            }
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            str = (java.lang.String) objM7386unboximpl;
            dAppConnectRequestHelper$onTonProof$1.L$0 = c16013ebs;
            dAppConnectRequestHelper$onTonProof$1.L$1 = tonProof3;
            dAppConnectRequestHelper$onTonProof$1.L$2 = str;
            dAppConnectRequestHelper$onTonProof$1.label = r12 == true ? 1 : 0;
            if (DelayKt.delay(500L, dAppConnectRequestHelper$onTonProof$1) == objCopydefault) {
                return objCopydefault;
            }
            c16013ebs2 = c16013ebs;
            r1 = r12;
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            }
        } catch (java.lang.Exception e4) {
            e = e4;
            r5 = objM7386unboximpl;
            r1 = r13;
            tonProof2 = tonProof3;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dcu.PendingIntent.EZpvd(long):o.dcu$PendingIntent */
    public final java.util.List<java.lang.String> AEQbTJ(DAppConnectRequest.Request.RequestAccounts.Namespace namespace, AbstractC12782ctV abstractC12782ctV) {
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.String strEZpvd;
        java.util.List<java.lang.String> chains = namespace.getChains();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : chains) {
            java.lang.String strOLrzqt = null;
            if (Intrinsics.EZpvd((java.lang.Object) namespace.getNamespace(), (java.lang.Object) InterfaceC13987dcu.Fragment.Companion.fetchVPNInfo())) {
                java.util.Iterator<T> it = abstractC12782ctV.dvKsVJ().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    if (((C9756bbb) next2).EZpvd() == 0) {
                        break;
                    }
                }
                C9756bbb c9756bbb = (C9756bbb) next2;
                if (c9756bbb == null || (strEZpvd = c9756bbb.OLrzqt()) == null) {
                    strEZpvd = abstractC12782ctV.EZpvd(607L);
                }
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd)) {
                    strEZpvd = null;
                }
                if (strEZpvd != null) {
                    strOLrzqt = C13983dcq.Companion.OLrzqt(str, strEZpvd);
                }
            } else {
                java.util.Iterator<T> it2 = C13990dcx.copydefault(abstractC12782ctV).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    long jOLrzqt = ((C13983dcq) next).copydefault().OLrzqt();
                    InterfaceC13987dcu interfaceC13987dcuAEQbTJ = InterfaceC13987dcu.Companion.AEQbTJ(str);
                    if (InterfaceC13987dcu.PendingIntent.EZpvd(jOLrzqt, interfaceC13987dcuAEQbTJ != null ? InterfaceC13987dcu.PendingIntent.EZpvd(interfaceC13987dcuAEQbTJ.OLrzqt()) : null)) {
                        break;
                    }
                }
                C13983dcq c13983dcq = (C13983dcq) next;
                if (c13983dcq != null) {
                    strOLrzqt = C13983dcq.Companion.OLrzqt(str, c13983dcq.EZpvd());
                }
            }
            if (strOLrzqt != null) {
                arrayList.add(strOLrzqt);
            }
        }
        return arrayList;
    }

    public final java.lang.Object EZpvd(AbstractC12782ctV abstractC12782ctV, DAppInfo dAppInfo, DAppConnectRequest.Request.RequestAccounts requestAccounts, WalletEvent.ConnectSuccess.Payload.Response response, WalletEvent.ConnectSuccess.Payload.Response response2, C15937eaV c15937eaV, Continuation<? super WalletEvent.ConnectSuccess.Payload.Response> continuation) {
        return BuildersKt.withContext(this.djBIcL, new DAppConnectRequestHelper$onRequestAccounts$2(requestAccounts, abstractC12782ctV, this, response, response2, c15937eaV, dAppInfo, null), continuation);
    }

    public final java.lang.Object EZpvd(Continuation<? super android.app.Activity> continuation) {
        return TimeoutKt.withTimeoutOrNull(4000L, new DAppConnectRequestHelper$getValidActivity$2(this, null), continuation);
    }

    public final java.util.List<C10854bwM> OLrzqt(@NotNull java.util.List<java.lang.String> list, boolean z) {
        C10854bwM c10854bwMAEQbTJ;
        java.lang.Object next;
        java.lang.Object next2;
        java.util.List listAhwBna;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            java.lang.String strJoinToString$default = null;
            if (!it.hasNext()) {
                break;
            }
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) it.next(), new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null);
            if (listSplit$default.size() < 2) {
                listSplit$default = null;
            }
            if (listSplit$default != null && (listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) listSplit$default, 2)) != null) {
                strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listAhwBna, ":", null, null, 0, null, null, 62, null);
            }
            if (strJoinToString$default != null) {
                arrayList.add(strJoinToString$default);
            }
        }
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        if (z) {
            java.util.Iterator<T> it2 = this.AEQbTJ.djBIcL().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((C10854bwM) next2).fetchVPNInfo() == 607) {
                    break;
                }
            }
            C10854bwM c10854bwM = (C10854bwM) next2;
            if (c10854bwM != null) {
                listOLrzqt.add(c10854bwM);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            InterfaceC13987dcu interfaceC13987dcuAEQbTJ = InterfaceC13987dcu.Companion.AEQbTJ((java.lang.String) it3.next());
            if (interfaceC13987dcuAEQbTJ != null) {
                long jOLrzqt = interfaceC13987dcuAEQbTJ.OLrzqt();
                java.util.Iterator<T> it4 = this.AEQbTJ.djBIcL().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                    if (((C10854bwM) next).fetchVPNInfo() == jOLrzqt) {
                        break;
                    }
                }
                c10854bwMAEQbTJ = (C10854bwM) next;
                if (c10854bwMAEQbTJ == null) {
                    c10854bwMAEQbTJ = this.KWHzl.AEQbTJ(jOLrzqt);
                }
            } else {
                c10854bwMAEQbTJ = null;
            }
            if (c10854bwMAEQbTJ != null) {
                arrayList2.add(c10854bwMAEQbTJ);
            }
        }
        listOLrzqt.addAll(arrayList2);
        return CollectionsKt___CollectionsKt.QbewEr(C56402yEa.fARcdN(listOLrzqt));
    }
}
