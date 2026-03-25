package o;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.imported.GetSupportedChainsForPrivateKeyUseCase$getExistingChainIds$2;
import com.okinc.business.defi.wallet.imported.GetSupportedChainsForPrivateKeyUseCase$getSupportedChains$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import o.C11010bzJ;
import o.C12827cuN;
import o.InterfaceC18379fhL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fhG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C18374fhG {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final C10948byA AEQbTJ;
    public final C12827cuN AYXKKw;
    public final android.content.Context KWHzl;
    public final C10598brV OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final C11010bzJ valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C18374fhG() {
        this(null, null, null, null, null, null, 63, null);
    }

    public C18374fhG(@NotNull C12827cuN c12827cuN, @NotNull C11010bzJ c11010bzJ, @NotNull C10948byA c10948byA, @NotNull C10598brV c10598brV, @NotNull android.content.Context context, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c11010bzJ, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(c10598brV, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AYXKKw = c12827cuN;
        this.valueOf = c11010bzJ;
        this.AEQbTJ = c10948byA;
        this.OLrzqt = c10598brV;
        this.KWHzl = context;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0044: CONSTRUCTOR 
  (wrap:o.cuN:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x0008: INVOKE 
  (wrap:o.cuN$Application:0x0006: SGET  A[WRAPPED] (LINE:26) o.cuN.Companion o.cuN$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cuN.Application.getInstance$default(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN A[MD:(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN (m), WRAPPED] (LINE:26)) : (r5v0 o.cuN))
  (wrap:o.bzJ:0x0016: TERNARY null = ((wrap:int:0x000c: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.bzJ:0x0012: INVOKE 
  (wrap:o.bzJ$ActionBar:0x0010: SGET  A[WRAPPED] (LINE:27) o.bzJ.Companion o.bzJ$ActionBar)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.bzJ.ActionBar.getInstance$default(o.bzJ$ActionBar, android.content.Context, int, java.lang.Object):o.bzJ A[MD:(o.bzJ$ActionBar, android.content.Context, int, java.lang.Object):o.bzJ (m), WRAPPED] (LINE:27)) : (r6v0 o.bzJ))
  (wrap:o.byA:0x0021: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.byA:0x001d: INVOKE (wrap:o.byG:0x001b: SGET  A[WRAPPED] (LINE:28) o.byG.EZpvd o.byG) VIRTUAL call: o.byG.valueOf():o.byA A[MD:():o.byA (m), WRAPPED] (LINE:28)) : (r7v0 o.byA))
  (wrap:o.brV:0x0028: TERNARY null = ((wrap:int:0x0022: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.brV:0x0026: SGET  A[WRAPPED] (LINE:29) o.brV.AEQbTJ o.brV) : (r8v0 o.brV))
  (wrap:android.content.Context:0x0033: TERNARY null = ((wrap:int:0x0029: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:android.content.Context:0x002f: INVOKE (wrap:o.baC$Activity:0x002d: SGET  A[WRAPPED] (LINE:30) o.baC.Companion o.baC$Activity) VIRTUAL call: o.baC.Activity.AEQbTJ():android.app.Application A[MD:():android.app.Application (m), WRAPPED] (LINE:30)) : (r9v0 android.content.Context))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0034: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0038: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getDefault():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:31)) : (r10v0 kotlinx.coroutines.CoroutineDispatcher))
 A[MD:(o.cuN, o.bzJ, o.byA, o.brV, android.content.Context, kotlinx.coroutines.CoroutineDispatcher):void (m)] (LINE:25) call: o.fhG.<init>(o.cuN, o.bzJ, o.byA, o.brV, android.content.Context, kotlinx.coroutines.CoroutineDispatcher):void type: THIS */
    public /* synthetic */ C18374fhG(C12827cuN c12827cuN, C11010bzJ c11010bzJ, C10948byA c10948byA, C10598brV c10598brV, android.content.Context context, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null) : c12827cuN, (i & 2) != 0 ? C11010bzJ.ActionBar.getInstance$default(C11010bzJ.Companion, null, 1, null) : c11010bzJ, (i & 4) != 0 ? C10954byG.EZpvd.valueOf() : c10948byA, (i & 8) != 0 ? C10598brV.AEQbTJ : c10598brV, (i & 16) != 0 ? C9678baC.Companion.AEQbTJ() : context, (i & 32) != 0 ? Dispatchers.getDefault() : coroutineDispatcher);
    }

    /* JADX INFO: renamed from: o.fhG$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fhG.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.Long> list, @NotNull java.util.List<java.lang.Long> list2, @NotNull java.lang.String str2, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation) {
        return BuildersKt.withContext(this.copydefault, new GetSupportedChainsForPrivateKeyUseCase$getExistingChainIds$2(this, str2, list, list2, str, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String KWHzl(AbstractC12782ctV abstractC12782ctV, long j, java.lang.String str) {
        java.lang.String str2;
        java.lang.Object next;
        if (abstractC12782ctV.QwvEab() != WalletType.HDWallet) {
            return str;
        }
        C10854bwM c10854bwMKWHzl = this.AEQbTJ.KWHzl(j);
        if (c10854bwMKWHzl == null) {
            CustomChainCoinMeta customChainCoinMetaOLrzqt = this.OLrzqt.OLrzqt(j);
            c10854bwMKWHzl = customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.AEQbTJ() : null;
        }
        if (c10854bwMKWHzl == null) {
            pUU.copydefault("CheckPrivateKeyExistsUseCase", "chainMeta is null, chainId=" + j);
            return null;
        }
        if (c10854bwMKWHzl.QCjLjM()) {
            java.util.Iterator<T> it = abstractC12782ctV.valueOf().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ChainAddress) next).getCoinId() == j) {
                    break;
                }
            }
            ChainAddress chainAddress = (ChainAddress) next;
            java.lang.String address = chainAddress != null ? chainAddress.getAddress() : null;
            str2 = address == null ? "" : address;
        }
        return xYS.copydefault.KWHzl(str, abstractC12782ctV.DCUTEI(), c10854bwMKWHzl.QKVWgx(), true, abstractC12782ctV.finit(), C8322bAY.KWHzl.KWHzl(c10854bwMKWHzl.fetchVPNInfo(), true), str2, abstractC12782ctV.QVAiDq());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.util.List<InterfaceC18379fhL.Activity>> continuation) throws java.lang.Throwable {
        GetSupportedChainsForPrivateKeyUseCase$getSupportedChains$1 getSupportedChainsForPrivateKeyUseCase$getSupportedChains$1;
        java.util.List<C13853daS> listKWHzl;
        java.lang.Throwable th;
        java.util.List<C13853daS> list;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof GetSupportedChainsForPrivateKeyUseCase$getSupportedChains$1) {
            getSupportedChainsForPrivateKeyUseCase$getSupportedChains$1 = (GetSupportedChainsForPrivateKeyUseCase$getSupportedChains$1) continuation;
            int i = getSupportedChainsForPrivateKeyUseCase$getSupportedChains$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSupportedChainsForPrivateKeyUseCase$getSupportedChains$1.label = i - Integer.MIN_VALUE;
            } else {
                getSupportedChainsForPrivateKeyUseCase$getSupportedChains$1 = new GetSupportedChainsForPrivateKeyUseCase$getSupportedChains$1(this, continuation);
            }
        }
        GetSupportedChainsForPrivateKeyUseCase$getSupportedChains$1 getSupportedChainsForPrivateKeyUseCase$getSupportedChains$12 = getSupportedChainsForPrivateKeyUseCase$getSupportedChains$1;
        java.lang.Object obj = getSupportedChainsForPrivateKeyUseCase$getSupportedChains$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSupportedChainsForPrivateKeyUseCase$getSupportedChains$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                listKWHzl = C13847daM.Companion.KWHzl(str);
                pUU.KWHzl("CheckPrivateKeyExistsUseCase", "supportedChains.size=" + listKWHzl.size());
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : listKWHzl) {
                    if (((C13853daS) obj2).copydefault().ejfBZ()) {
                        arrayList.add(obj2);
                    } else {
                        arrayList2.add(obj2);
                    }
                }
                kotlin.Pair pair = new kotlin.Pair(arrayList, arrayList2);
                java.util.List list2 = (java.util.List) pair.component1();
                java.util.List list3 = (java.util.List) pair.component2();
                java.util.List<java.lang.Long> arrayList3 = new java.util.ArrayList<>(C56403yEb.AYXKKw(list2, 10));
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(C56443yFo.KWHzl(((C13853daS) it.next()).copydefault().AEQbTJ()));
                }
                java.util.List<java.lang.Long> arrayList4 = new java.util.ArrayList<>(C56403yEb.AYXKKw(list3, 10));
                java.util.Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(C56443yFo.KWHzl(((C13853daS) it2.next()).copydefault().AEQbTJ()));
                }
                pUU.KWHzl("CheckPrivateKeyExistsUseCase", "evmChainIds.size=" + arrayList3.size() + ", nonEvmChainIds.size=" + arrayList4.size());
                try {
                    Result.Application application = Result.Companion;
                    getSupportedChainsForPrivateKeyUseCase$getSupportedChains$12.L$0 = listKWHzl;
                    getSupportedChainsForPrivateKeyUseCase$getSupportedChains$12.label = 1;
                    java.lang.Object objAEQbTJ = AEQbTJ(str, arrayList3, arrayList4, str2, getSupportedChainsForPrivateKeyUseCase$getSupportedChains$12);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    obj = objAEQbTJ;
                    list = listKWHzl;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    list = listKWHzl;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (java.util.List) getSupportedChainsForPrivateKeyUseCase$getSupportedChains$12.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    listKWHzl = list;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    list = listKWHzl;
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) obj);
            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                objM7377constructorimpl = yDY.AhwBna();
            }
            java.util.List list4 = (java.util.List) objM7377constructorimpl;
            java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (C13853daS c13853daS : list) {
                arrayList5.add(new InterfaceC18379fhL.Activity(c13853daS.copydefault(), c13853daS.OLrzqt(), list4.contains(C56443yFo.KWHzl(c13853daS.copydefault().AEQbTJ()))));
            }
            return arrayList5;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
