package com.okinc.business.defi.impl;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.impl.EnterWalletServiceImpl$openBlockchainExplorerWithPreCheck$1;
import com.okinc.business.dex.api.bean.ChainInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.AbstractC43419rot;
import o.C12827cuN;
import o.C14320djI;
import o.C16264ege;
import o.C33129mqd;
import o.C43251rlk;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56548yJl;
import o.gKO;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class EnterWalletServiceImpl$openBlockchainExplorerWithPreCheck$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ FragmentManager $fragmentManager;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterWalletServiceImpl$openBlockchainExplorerWithPreCheck$1(FragmentManager fragmentManager, Context context, Continuation<? super EnterWalletServiceImpl$openBlockchainExplorerWithPreCheck$1> continuation) {
        super(2, continuation);
        this.$fragmentManager = fragmentManager;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EnterWalletServiceImpl$openBlockchainExplorerWithPreCheck$1(this.$fragmentManager, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EnterWalletServiceImpl$openBlockchainExplorerWithPreCheck$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
                this.label = 1;
                obj = gko.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            list = (List) ((AbstractC43419rot) obj).copydefault();
        } catch (Exception e) {
            pUU.AEQbTJ("EnterWalletServiceImpl", "openBlockchainExplorerWithPreCheck: Failed to get Dex chain list", e);
            list = null;
        }
        if (list == null || list.isEmpty()) {
            pUU.valueOf("EnterWalletServiceImpl", "openBlockchainExplorerWithPreCheck: No Dex-supported chains available");
            return Unit.INSTANCE;
        }
        ArrayList<ChainInfo> arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (C33129mqd.OLrzqt((CharSequence) ((ChainInfo) obj2).getWalletExplorePrefix())) {
                arrayList.add(obj2);
            }
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList, 10)), 16));
        for (ChainInfo chainInfo : arrayList) {
            Pair pairOLrzqt = C56390yDp.OLrzqt(chainInfo.getChainId(), chainInfo.getWalletExplorePrefix());
            linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        if (linkedHashMap.isEmpty()) {
            pUU.valueOf("EnterWalletServiceImpl", "openBlockchainExplorerWithPreCheck: No explorer URLs available");
            return Unit.INSTANCE;
        }
        Set<String> setKeySet = linkedHashMap.keySet();
        final AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        if (abstractC12782ctV == null) {
            pUU.valueOf("EnterWalletServiceImpl", "openBlockchainExplorerWithPreCheck: No wallet available");
            return Unit.INSTANCE;
        }
        if (this.$fragmentManager.isStateSaved() || this.$fragmentManager.isDestroyed()) {
            pUU.valueOf("EnterWalletServiceImpl", "openBlockchainExplorerWithPreCheck: FragmentManager is not in valid state");
            return Unit.INSTANCE;
        }
        C16264ege c16264ege = new C16264ege();
        String strDbNXlk = abstractC12782ctV.DbNXlk();
        final Context context = this.$context;
        c16264ege.EZpvd(strDbNXlk, setKeySet, new Function1() { // from class: o.dNl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return EnterWalletServiceImpl$openBlockchainExplorerWithPreCheck$1.invokeSuspend$lambda$2(linkedHashMap, abstractC12782ctV, context, (java.lang.String) obj3);
            }
        }).show(this.$fragmentManager, (String) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(Map map, AbstractC12782ctV abstractC12782ctV, Context context, String str) {
        if (str == null || StringsKt__StringsKt.fARcdN((CharSequence) str)) {
            return Unit.INSTANCE;
        }
        String str2 = (String) map.get(str);
        if (C33129mqd.OLrzqt((CharSequence) str2)) {
            String strEZpvd = abstractC12782ctV.EZpvd(C33129mqd.valueOf(str));
            if (!StringsKt__StringsKt.fARcdN((CharSequence) strEZpvd)) {
                C14320djI.openHistoryWebPageWithShare$default(C14320djI.OLrzqt, context, str2 + strEZpvd, strEZpvd, null, 8, null);
            }
        }
        return Unit.INSTANCE;
    }
}
